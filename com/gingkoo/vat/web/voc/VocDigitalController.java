package com.gingkoo.vat.web.voc;

import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.vat.server.EvatCommonService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/voc-digital")
public class VocDigitalController {

    private static Logger logger = LoggerFactory.getLogger(VocDigitalController.class);
    public static final String VOC_CODE = "voc_code";
    public static final String VOC_NO = "voc_no";
    public static final String VOC_DATE = "voc_date";

    public static String[] exts = null;

    @Autowired
    protected EvatCommonService evatCommonService;

    //只执行一次，从application.properties中取配置信息
    static {
        InputStream inputStream = VocDigitalController.class.getClassLoader().getResourceAsStream("configs/application.properties");
        Properties applicationConfig = new Properties();
        String ext = "";
        try {
            applicationConfig.load(inputStream);
            ext = applicationConfig.getProperty("UPLOAD.EXT");
            exts = ext.split(",");
        } catch (Exception ignored) {
            logger.error("加载配置文件异常: {}", ignored.toString());
        }

        try{
            inputStream.close();
        } catch (Exception ignored){
            logger.error("inputStream close exception: {}", ignored.toString());
        }
    }

    public String convert(String utfString){
        try {
            int cnt = utfString.length() / 4;
            String s = "";
            for (int i = 0; i < cnt; i++) {
                s += "\\u" + utfString.substring(i*4, (i+1)*4);
            }
            utfString = s;
            StringBuilder sb = new StringBuilder();
            int i = -1;
            int pos = 0;

            while((i=utfString.indexOf("\\u", pos)) != -1){
                sb.append(utfString.substring(pos, i));
                if(i+5 < utfString.length()){
                    pos = i+6;
                    sb.append((char)Integer.parseInt(utfString.substring(i+2, i+6), 16));
                }
            }
            return sb.toString();
        } catch (Exception ex) {
            logger.error("Cannot convert from unicode string ["+utfString+"]",ex);
            return "";
        }
    }

    public String convertDate(String date) {
        if ((date == null) || (date.trim().equals("")) )
            return "";
        String s = date;
        s = s.replace("-", "/");
        String result = s.substring(0,4);
        s = s.substring(5);
        String m = s.substring(0, s.indexOf("/"));
        if (m.length() == 1) {
            m = "0"+m;
        }
        result += m;
        s = s.substring(s.indexOf("/")+1);
        String d = s.substring(0, s.indexOf(" "));
        if (d.length() == 1) {
            d = "0"+d;
        }
        result += d;
        return result;
    }

    private void GBK2UTF8(String srcFileName, String destFileName) throws IOException {
        String line_separator = System.getProperty("line.separator");
        FileInputStream fis = new FileInputStream(srcFileName);
        StringBuffer content = new StringBuffer();
        DataInputStream in = new DataInputStream(fis);
        BufferedReader d = new BufferedReader(new InputStreamReader(in, "GBK"));
        // "UTF-8"
        String line = null;
        while ((line = d.readLine()) != null)
            content.append(line + line_separator);
        d.close();
        in.close();
        fis.close();

        Writer ow = new OutputStreamWriter(new FileOutputStream(destFileName), "utf-8");
        ow.write(content.toString());
        ow.close();
    }

    /**
     * 数电发票开具 开票结果上传 提交
     * @param request
     * @param response
     */
	@RequestMapping("/upload4digital")
	public void uploadVocImage4Digital(HttpServletRequest request, HttpServletResponse response) {
		// 解决上传中文字符乱码问题
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		} catch (Exception ignored) {
            logger.error("设置编码异常: {}", ignored.toString());
		}

		String uploadFilePath = "";
		String username = request.getParameter("username");
		HashMap<String, String> paramMap = new HashMap<String, String>();
		String absolutePath = "";
		String uploadid = "VoucherUpload";
		String status = "true";
		String desc = "";
		DiskFileItemFactory factory = new DiskFileItemFactory();
		try {
			ServletFileUpload upload = new ServletFileUpload(factory);
			List list = upload.parseRequest(request);
            // 遍历list
			Iterator iter = list.iterator();
			// pick up parameters first and note actual FileItem
			while (iter.hasNext()) {
                // 类型转换
				FileItem fi = (FileItem) iter.next();
				if (fi.getName() == null){
					continue;
				}

                // 得到文件表单的值，就是用户本地的文件路径
				String fileName = fi.getName();
				// 如果需要检查扩展名则检查扩展名
				boolean checkextends = true;

				if ((exts != null) && (exts.length > 1)) {
					for (int j = 0; j < exts.length; j++) {
						if (fileName.toUpperCase().endsWith("." + exts[j].toUpperCase())) {
							checkextends = false;
							break;
						}
					}
				}

				if (!checkextends) {
					continue;
				}

				// 如果文件表单为空，则不处理
				if (fileName == null)  {
					continue;
				}

				if (fileName.trim().equals("")) {
					continue;
				}

				logger.info("processFiles paramMap ==> "+ paramMap);
				// 先把文件保存到这个路径,将来最好存放在参数表或配置文件中
				uploadFilePath = SysParamService.getSysParamDir("0003|0009")+"digitalUpload/";
				fileName = FilenameUtils.getName(fileName);
				logger.info("上传路径：" + uploadFilePath);
				new File(uploadFilePath).mkdirs();
				logger.info("文件名：" + fileName);
				absolutePath = uploadFilePath + fileName.replace(".xlsx","_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + username + ".xlsx");
				logger.info("完整路径：" + absolutePath);
				File pathDest = new File(absolutePath);
				fi.write(pathDest);
                paramMap.put("username", username);
				String result = evatCommonService.onVoucherDigital4Upload(absolutePath, paramMap);

				if (StringUtils.isNotBlank(result)) {
				    status = "false";
				    if(result.endsWith("、")){
				    	 desc = "["+result.substring(0, result.length()-1)+"] 匹配失败，请检查上传文件是否正确！";
				    }else
				    	desc = result;
				}
			}
			// TODO: need to handle conversion options and error reporting
			response.setContentType("text/html");
			response.setHeader("Pragma", "No-cache");
			response.setDateHeader("Expires", 0);
			response.setHeader("Cache-Control", "no-cache");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<script type=\"text/javascript\">");
			absolutePath = absolutePath.replace("\\", "\\\\");
			out.println("if (parent.uploadComplete" + uploadid
						+ ") parent.uploadComplete" + uploadid + "('"
						+ absolutePath + "','" + status + "','" + desc + "');");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
		} catch (Exception e) {
			logger.error("上传失败", e);
			try {
				PrintWriter out = response.getWriter();
				out.println("FAIL");
				out.flush();
			} catch (Exception ignored) {
                logger.error("response.getWriter exception: {}", ignored.toString());
			}
		}
	}

}
