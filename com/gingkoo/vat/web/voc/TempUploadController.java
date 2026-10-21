package com.gingkoo.vat.web.voc;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gingkoo.vat.server.TempFileImportUploadService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.gingkoo.gal.api.core.spring.SpringContextUtils;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gal.util.uuid.UUuidUtils;
import com.gingkoo.gui.data.server.GUIGWTServer;
import com.gingkoo.rpt.common.server.SysParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

/**
 * 数据导入文件上传
 *
 * @author cheny
 *
 */
@Controller
@RequestMapping("tempUpload")
public class TempUploadController {
    //private static String basedir1 = "/gvat/tmp";
    private static String[] exts = null;
    public static String property;

    private ServletContext servletContext;
    private static final long serialVersionUID = -4994450897590782431L;
    private static Log log = LogFactory.getLog(TempUploadController.class);

    @Autowired
    private MyBatisSessionTemplate myBatisSessionTemplate;
    @Autowired
    private TempFileImportUploadService tempFileImportUploadService;

    @Autowired
    public TempUploadController(WebApplicationContext webApplicationContext){
        this.servletContext = webApplicationContext.getServletContext();
    }

    //只执行一次，从application.properties中取配置信息
    static {
        property = System.getProperty("file.separator");
        InputStream inputStream = GUIGWTServer.class.getClassLoader().getResourceAsStream("configs/application.properties");
        Properties applicationConfig = new Properties();
        String pagecount = "";
        String ext = "";
        try {
            applicationConfig.load(inputStream);
            //basedir1 = applicationConfig.getProperty("basedir1");
            ext = applicationConfig.getProperty("UPLOAD.EXT");
            exts = ext.split(",");
        } catch (Exception e) {
        }
        try {
            inputStream.close();
        } catch (Exception ex)
        {

        }
    }

    @RequestMapping("/processFiles")
    private void processFiles(HttpServletRequest request, HttpServletResponse response) {
        // 解决上传中文字符乱码问题
        try {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        } catch (Exception ex) {}

        String uploadFilePath = "";
        String realFilePath = "";
        String uuid = UUuidUtils.UUID();
        Map<String, String> tempFileImportMap = null;

        HashMap<String, String> args = new HashMap<String, String>();
        String absolutePath = "";
        String realAbsolutePath = "";
        String uploadid = "";
        String status = "true";
        String desc = "";
        String filetype = "";
        DiskFileItemFactory factory = new DiskFileItemFactory();
        List list = null;
        try {
            ServletFileUpload upload = new ServletFileUpload(factory);
            list = upload.parseRequest(request);

            Iterator it = list.iterator();// 遍历list
            // 防止批量上传图片 存储的名字相同
            int i = 0;

            while (it.hasNext()) {
                FileItem fi = (FileItem) it.next();// 类型转换
                if (fi.isFormField()) {// 判断该 FileItem 对象是否是一个普通表单类型
                    String name = fi.getFieldName();// 得到普通表单类型的表单名
                    String content = fi.getString("UTF-8");// 用指定编码得到普通表单的值
                    if (name.equals("ID")) {
                        uploadid = content;
                    }
                    if (name.equals("FILETYPE"))
                        filetype = content;
                    // request.setAttribute(name, content);//把键值放入 request
                    // 对象
                } else {
                    try {
                        String fileName = fi.getName();// 得到文件表单的值，就是用户本地的文件路径
                        // 如果文件表单为空，则不处理
                        if (fileName == null) continue;
                        if (fileName.trim().equals("")) continue;

                        fileName = fileName.replace("%2F", "/");
                        fileName = fileName.replace("%2f", "/");
                        int index1 = fileName.lastIndexOf("\\");
                        int index2 = fileName.lastIndexOf("/");
                        int index = -1;
                        if (index1 > index2)
                            index = index1;
                        else
                            index = index2;
                        fileName = fileName.substring(index+1);

                        //文件名需要替换非法字符，并且保证只有一个"."，因为这个文件名可能是坏人直接改http请求传上来的
                        fileName = fileName.replace("..","_").replace(";", "_").replace("$", "_").replace("/", "_").replace("\\", "_");
                        while (fileName.indexOf(".") != fileName.lastIndexOf(".")) {
                            fileName = fileName.substring(0,fileName.indexOf("."))+"_"+fileName.substring(fileName.indexOf(".")+1);
                        }

                        //如果需要检查扩展名则检查扩展名
                        boolean checkextends = true;
                        if ( (exts != null) && (exts.length > 1) ) {
                            for (int j = 0; j < exts.length; j++) {
                                if (fileName.toUpperCase().endsWith("."+exts[j].toUpperCase())) {
                                    checkextends = false;
                                    break;
                                }
                            }
                        }
                        if (!checkextends) {
                            status = "false";
                            desc = "非法的上传文件类型";
                        } else {
                            //根据filetype指定不同的存放路径
                            if ("TempImport".equals(filetype)){
                                tempFileImportMap = tempFileImportUploadService.queryTempFileUploadLogByLatestTime(fileName);
                                absolutePath = tempFileImportMap.get("FILLER3");
                                realAbsolutePath = tempFileImportMap.get("FILLER2");
                                uploadFilePath = absolutePath.substring(0,absolutePath.lastIndexOf(property));
                            }

                            log.info("***************** 本地上传路径：" + uploadFilePath);
                            if (absolutePath.contains(".ear") || absolutePath.contains(".war") || realAbsolutePath.contains(".ear") || realAbsolutePath.contains(".war") ) {
                                status = "false";
                                desc = "非法的上传目录，请在系统管理中重新设置";
                                continue;
                            }

                            log.info("获取到的文件更新日志信息："+ tempFileImportMap.toString());

                            File pathDest = new File(absolutePath);
                            File realpathDest = new File(realAbsolutePath);

                            if(realpathDest.exists()){
                                realpathDest.delete();
                                fi.write(realpathDest);
                            }else{fi.write(realpathDest);}
                            Files.copy(realpathDest.toPath(), pathDest.toPath(), StandardCopyOption.REPLACE_EXISTING);

                            tempFileImportUploadService.updateTempFileUploadLog(tempFileImportMap.get("DATA_ID"));

                            log.info("***************** 本地文件已更新：" + absolutePath);
                            log.info("***************** war文件已更新：" + realAbsolutePath);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        status = "false";
                        log.error("Fail to upload " + fi.getName()
                                + " to server");
                        return;
                    }
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
            e.printStackTrace();
            log.error(e.getMessage());
            //System.out.println(e.getMessage());
        }
    }

    private static void GBK2UTF8(String srcFileName, String destFileName) throws IOException {
        String line_separator = System.getProperty("line.separator");
        FileInputStream fis = new FileInputStream(srcFileName);
        StringBuffer content = new StringBuffer();
        DataInputStream in = new DataInputStream(fis);
        BufferedReader d = new BufferedReader(new InputStreamReader(in, "GBK"));// ,
        // "UTF-8"
        String line = null;
        while ((line = d.readLine()) != null)
            content.append(line + line_separator);
        d.close();
        in.close();
        fis.close();

        Writer ow = new OutputStreamWriter(new FileOutputStream(destFileName),
                "utf-8");
        ow.write(content.toString());
        ow.close();
    }
}
