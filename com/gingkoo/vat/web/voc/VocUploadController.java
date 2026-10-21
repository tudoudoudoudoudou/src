package com.gingkoo.vat.web.voc;

import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVoc;
import com.googlecode.gwt.crypto.util.Str;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.ResultHandler;
import org.apache.xpath.operations.Bool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Controller
@RequestMapping("/voc-upload")
public class VocUploadController {
	private static Logger logger = LoggerFactory.getLogger(VocUploadController.class);
	@Autowired
	private MyBatisSessionTemplate myBatisSessionTemplate;

	/**
	 * 数电发票开具 开票结果上传 提交
	 *
	 * @param request
	 * @param response
	 */
	@RequestMapping("/uploadZip")
	public void uploadVocImage4Digital(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String status = "true";
		String desc = "";
		String uploadid = "VoucherUpload";
		// 解决上传中文字符乱码问题
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		} catch (Exception ignored) {
			logger.error("设置编码异常: {}", ignored.toString());
		}

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
				if (fi.getName() == null) {
					continue;
				}
				// 得到文件表单的值，就是用户本地的文件路径
				String fileName = fi.getName();
				fileName = FilenameUtils.getName(fileName);
				int lastIndex = fileName.lastIndexOf('.');
				if (lastIndex == -1) {
					desc = "上传失败，文件格式不正确";
					status = "false";
					System.out.println(fileName.substring(lastIndex + 1));
					break;

				}
				if ("zip".equals(fileName.substring(lastIndex + 1))) {
					uploadZip(fi, response);
				}
				if ("pdf".equals(fileName.substring(lastIndex + 1))) {
					uploadPdf(fi, response);
				}
				if ("ofd".equals(fileName.substring(lastIndex + 1))) {
					uploadOfd(fi, response);
				}
				if ("xml".equals(fileName.substring(lastIndex + 1))) {
					uploadXml(fi, response);
				}
				// 修改判断条件 modify by shuguang
				if (!"zip".equals(fileName.substring(lastIndex + 1)) && !"pdf".equals(fileName.substring(lastIndex + 1))
						&& !"ofd".equals(fileName.substring(lastIndex + 1))
						&& !"xml".equals(fileName.substring(lastIndex + 1)))
				/*
				 * if (!"zip".equals(fileName.substring(lastIndex + 1)) ||
				 * !"pdf".equals(fileName.substring(lastIndex + 1)) ||
				 * !"ofd".equals(fileName.substring(lastIndex + 1)) ||
				 * !"xml".equals(fileName.substring(lastIndex + 1)))
				 */ {
					desc = "上传失败，文件格式不正确";
					status = "false";
					break;
				}
				// 如果文件表单为空，则不处理
				if (fileName == null) {
					desc = "上传失败，文件格式不正确";
					status = "false";
					break;
				}
				if (fileName.trim().equals("")) {
					desc = "上传失败：文件格式不正确";
					status = "false";
					break;
				}
			}

		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
		out.println("if (parent.uploadComplete" + uploadid + ") parent.uploadComplete" + uploadid + "('" + "','"
				+ status + "','" + desc + "');");
		out.println("</script>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

	private void uploadZip(FileItem fi, HttpServletResponse response) throws Exception {
		String uploadFilePath = "";
		String absolutePath = "";
		String uploadid = "VoucherUpload";
		String zipFileName = "";
		String status = "true";
		String desc = "";
		try {

			// 先把文件保存到这个路径,将来最好存放在参数表或配置文件中
			uploadFilePath = SysParamService.getSysParamDir("0003|0009");
			zipFileName = fi.getName();
			zipFileName = FilenameUtils.getName(zipFileName);
			logger.info("上传路径：" + uploadFilePath);
			new File(uploadFilePath).mkdirs();
			absolutePath = uploadFilePath + zipFileName;
			logger.info("上传文件路径：" + absolutePath);
			File pathDest = new File(absolutePath);
			fi.write(pathDest);

		} catch (FileUploadException e) {
			PrintWriter out = response.getWriter();
			desc = "文件上传失败";
			status = "false";
			out.println(desc);
			out.println(status);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// 获取当前日期
			String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
			// 获取当前日期作为临时解压路径
			String dateDetail = new SimpleDateFormat("yyyyMMddhhmmmss").format(new Date());
			// 解压文件的临时路径
			String destDirectory = SysParamService.getSysParamDir("0003|0022") + File.separator + date + File.separator
					+ dateDetail;
			// 文件存放最终路径
			String lastDirectory = SysParamService.getSysParamDir("0003|0022") + File.separator + date;

			// 备份压缩包路径
			String zipBack = SysParamService.getSysParamDir("0003|0023") + File.separator + date + File.separator;
			// 解压压缩包
			unzip(absolutePath, destDirectory);
			// 备份压缩包
			File deFile = new File(absolutePath);
			File zipPath = new File(zipBack);
			File zipFile = new File(zipBack + zipFileName);
			if (!zipPath.exists()) {
				zipPath.mkdirs(); // 创建目标文件夹
			}
			if (zipFile.exists()) {
				FileUtils.forceDelete(zipFile);
			}
			File destDir = new File(destDirectory);
			String[] filess = destDir.list();
			String dir = "";
			for (String fileName : filess) {
				File file = new File(destDirectory + File.separator + fileName);
				if (file.isDirectory()) {
					// 获取解压文件名称
					dir = destDirectory + File.separator + fileName;
				} else {
					dir = destDirectory;
					break;
				}
			}
			File directory = new File(dir);
			StringBuffer noneExistVoc = new StringBuffer();
				// 获取所有文件名
				String[] files = directory.list();
				// 如果所有文件在发票表都有对应的发票号码，则根据发票号码更新数据
				for (String fileName : files) {
					int lastIndex = fileName.lastIndexOf('.');
					String vocNo = vocExists(fileName);
					if(!StringUtils.isBlank(vocExists(fileName))){
						noneExistVoc.append(vocNo).append(",");
						continue;
					}
					
					if ("xml".equals(fileName.substring(lastIndex + 1))) {
						File oldFile = new File(dir + File.separator + fileName);
						File newFile = new File(lastDirectory + File.separator + fileName);
						if (!newFile.exists()) {
							FileUtils.moveFile(oldFile, newFile);
						} else {
							FileUtils.forceDelete(newFile);
							FileUtils.moveFile(oldFile, newFile);
						}
						// 将文件从临时文件移动到最终路径
						Map<String, String> xmlMap = new HashMap<String, String>();
						xmlMap.put("VOC_NO", getVocNo(fileName));
						xmlMap.put("XML_PATH", lastDirectory + File.separator + fileName);
						myBatisSessionTemplate.update("com.gingkoo.vat.server.EvatCommonSql.updateXmlPathByVocNo", xmlMap);

					} else if ("pdf".equals(fileName.substring(lastIndex + 1))) {
						File oldFile = new File(dir + File.separator + fileName);
						File newFile = new File(lastDirectory + File.separator + fileName);
						if (!newFile.exists()) {
							FileUtils.moveFile(oldFile, newFile);
						} else {
							FileUtils.forceDelete(newFile);
							FileUtils.moveFile(oldFile, newFile);
						}
						Map<String, String> pdfMap = new HashMap<String, String>();
						pdfMap.put("VOC_NO", getVocNo(fileName));
						pdfMap.put("PDF_PATH", lastDirectory + File.separator + fileName);
						myBatisSessionTemplate.update("com.gingkoo.vat.server.EvatCommonSql.updatePdfPathByVocNo",
								pdfMap);

					} else if ("ofd".equals(fileName.substring(lastIndex + 1))) {
						File oldFile = new File(dir + File.separator + fileName);
						File newFile = new File(lastDirectory + File.separator + fileName);
						if (!newFile.exists()) {
							FileUtils.moveFile(oldFile, newFile);
						} else {
							FileUtils.forceDelete(newFile);
							FileUtils.moveFile(oldFile, newFile);
						}
						Map<String, String> ofdMap = new HashMap<String, String>();
						ofdMap.put("VOC_NO", getVocNo(fileName));
						ofdMap.put("OFD_PATH", lastDirectory + File.separator + fileName);
						myBatisSessionTemplate.update("com.gingkoo.vat.server.EvatCommonSql.updateOfdPathByVocNo", ofdMap);

					} else {
						File oldFile = new File(dir + File.separator + fileName);
						FileUtils.forceDelete(oldFile);
					}
				}
				// 如果正常更新了，就备份这个压缩包，否则就不备份
			    try{
			    	FileUtils.moveFile(deFile, zipFile);
			    }catch(Exception e){
			    	logger.error("move file failed error is {}", e);
			    }
			    // 如果正常更新了，就备份这个压缩包，否则就不备份
			    try{
			    	FileUtils.forceDelete(new File(destDirectory));
			    }catch(Exception e){
			    	logger.error("delete file failed error is {}", e);
			    }
				
				if(StringUtils.isNotBlank(noneExistVoc.toString())){
					logger.error("部分上传失败{}", noneExistVoc.toString());
					desc = "部分上传失败：对应发票号码："+noneExistVoc.substring(0, noneExistVoc.length()-1);
					status = "false";
					// TODO: need to handle conversion options and error reporting
					response.setContentType("text/html");
					response.setHeader("Pragma", "No-cache");
					response.setDateHeader("Expires", 0);
					response.setHeader("Cache-Control", "no-cache");
					PrintWriter out = response.getWriter();
					out.println("<html>");
					out.println("<body>");
					out.println("<script type=\"text/javascript\">");
					absolutePath = absolutePath.replace("/", "//");
					out.println("if (parent.uploadComplete" + uploadid + ") parent.uploadComplete" + uploadid + "('" + absolutePath
							+ "','" + status + "','" + desc + "');");
					out.println("</script>");
					out.println("</body>");
					out.println("</html>");
					out.flush();
					
				}
		}catch( Exception e)
	{
		logger.error("上传失败", e);
		desc = "上传失败：文件格式不正确";
		status = "false";
		// TODO: need to handle conversion options and error reporting
		response.setContentType("text/html");
		response.setHeader("Pragma", "No-cache");
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<script type=\"text/javascript\">");
		absolutePath = absolutePath.replace("/", "//");
		out.println("if (parent.uploadComplete" + uploadid + ") parent.uploadComplete" + uploadid + "('" + absolutePath
				+ "','" + status + "','" + desc + "');");
		out.println("</script>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

	}

	private void uploadPdf(FileItem fi, HttpServletResponse response) throws Exception {
		String uploadFilePath = "";
		String absolutePath = "";
		String fileName = "";
		String uploadid = "VoucherUpload";
		String status = "true";
		String desc = "";
		try {

			// 单个文件直接放在voc_file下
			String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
			uploadFilePath = SysParamService.getSysParamDir("0003|0022") + File.separator + date;
			String zipBack = SysParamService.getSysParamDir("0003|0023") + File.separator + date + File.separator;
			fileName = fi.getName();
			fileName = FilenameUtils.getName(fileName);
			logger.info("PDf单个文件上传路径：" + uploadFilePath);
			new File(uploadFilePath).mkdirs();
			absolutePath = uploadFilePath + File.separator + fileName;
			logger.info("PDf单个文件路径：" + absolutePath);
			File pathDest = new File(absolutePath);
			if (pathDest.exists()) {
				FileUtils.forceDelete(pathDest);
			}
			fi.write(pathDest);
			File zipPath = new File(zipBack);
			File zipFile = new File(zipBack + fileName);
			if (!zipPath.exists()) {
				zipPath.mkdirs(); // 创建目标文件夹
			}
			if (zipFile.exists()) {
				FileUtils.forceDelete(zipFile);
			}
			FileUtils.copyFile(pathDest, zipFile);
			String vocNo = vocExists(fileName);
			if (StringUtils.isBlank(vocNo)) {
				Map<String, String> pdfMap = new HashMap<String, String>();
				pdfMap.put("VOC_NO", getVocNo(fileName));
				pdfMap.put("PDF_PATH", absolutePath);
				myBatisSessionTemplate.update("com.gingkoo.vat.server.EvatCommonSql.updatePdfPathByVocNo", pdfMap);
			} else {
				logger.info(desc);
				desc = "文件上传失败";
				status = "false";
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
			absolutePath = absolutePath.replace("/", "//");
			out.println("if (parent.uploadComplete" + uploadid + ") parent.uploadComplete" + uploadid + "('"
					+ absolutePath + "','" + status + "','" + desc + "');");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
		} catch (FileUploadException e) {
			PrintWriter out = response.getWriter();
			desc = "文件上传失败";
			status = "false";
			out.println(desc);
			out.println(status);
			out.flush();
		}
	}

	private void uploadOfd(FileItem fi, HttpServletResponse response) throws Exception {
		String uploadFilePath = "";
		String absolutePath = "";
		String fileName = "";
		String uploadid = "VoucherUpload";
		String status = "true";
		String desc = "";
		try {

			// 单个文件直接放在voc_file下
			String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
			uploadFilePath = SysParamService.getSysParamDir("0003|0022") + File.separator + date;
			String zipBack = SysParamService.getSysParamDir("0003|0023") + File.separator + date + File.separator;
			fileName = fi.getName();
			fileName = FilenameUtils.getName(fileName);
			logger.info("PDf单个文件上传路径：" + uploadFilePath);
			new File(uploadFilePath).mkdirs();
			absolutePath = uploadFilePath + File.separator + fileName;
			logger.info("PDf单个文件路径：" + absolutePath);
			File pathDest = new File(absolutePath);
			if (pathDest.exists()) {
				FileUtils.forceDelete(pathDest);
			}
			fi.write(pathDest);
			File zipPath = new File(zipBack);
			File zipFile = new File(zipBack + fileName);
			if (!zipPath.exists()) {
				zipPath.mkdirs(); // 创建目标文件夹
			}
			if (zipFile.exists()) {
				FileUtils.forceDelete(zipFile);
			}
			FileUtils.copyFile(pathDest, zipFile);
			String vocNo = vocExists(fileName);
			if (StringUtils.isBlank(vocNo)) {
				Map<String, String> ofdMap = new HashMap<String, String>();
				ofdMap.put("VOC_NO", getVocNo(fileName));
				ofdMap.put("OFD_PATH", absolutePath);
				myBatisSessionTemplate.update("com.gingkoo.vat.server.EvatCommonSql.updateOfdPathByVocNo", ofdMap);
			} else {
				logger.info(desc);
				desc = "文件上传失败";
				status = "false";
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
			absolutePath = absolutePath.replace("/", "//");
			out.println("if (parent.uploadComplete" + uploadid + ") parent.uploadComplete" + uploadid + "('"
					+ absolutePath + "','" + status + "','" + desc + "');");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
		} catch (FileUploadException e) {
			PrintWriter out = response.getWriter();
			desc = "文件上传失败";
			status = "false";
			out.println(desc);
			out.println(status);
			out.flush();
		}
	}

	private void uploadXml(FileItem fi, HttpServletResponse response) throws Exception {
		String uploadFilePath = "";
		String absolutePath = "";
		String fileName = "";
		String uploadid = "VoucherUpload";
		String status = "true";
		String desc = "";
		try {
			// 单个文件直接放在voc_file下
			String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
			uploadFilePath = SysParamService.getSysParamDir("0003|0022") + File.separator + date;
			String zipBack = SysParamService.getSysParamDir("0003|0023") + File.separator + date + File.separator;
			fileName = fi.getName();
			fileName = FilenameUtils.getName(fileName);
			logger.info("PDf单个文件上传路径：" + uploadFilePath);
			new File(uploadFilePath).mkdirs();
			absolutePath = uploadFilePath + File.separator + fileName;
			logger.info("PDf单个文件路径：" + absolutePath);
			File pathDest = new File(absolutePath);
			if (pathDest.exists()) {
				FileUtils.forceDelete(pathDest);
			}
			fi.write(pathDest);
			File zipPath = new File(zipBack);
			File zipFile = new File(zipBack + fileName);
			if (!zipPath.exists()) {
				zipPath.mkdirs(); // 创建目标文件夹
			}
			if (zipFile.exists()) {
				FileUtils.forceDelete(zipFile);
			}
			FileUtils.copyFile(pathDest, zipFile);
			String vocNo = vocExists(fileName);
			if (StringUtils.isBlank(vocNo)) {
				Map<String, String> xmlMap = new HashMap<String, String>();
				xmlMap.put("VOC_NO", getVocNo(fileName));
				xmlMap.put("XML_PATH", absolutePath);
				myBatisSessionTemplate.update("com.gingkoo.vat.server.EvatCommonSql.updateXmlPathByVocNo", xmlMap);
			} else {
				logger.info(desc);
				desc = "文件上传失败";
				status = "false";
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
			absolutePath = absolutePath.replace("/", "//");
			out.println("if (parent.uploadComplete" + uploadid + ") parent.uploadComplete" + uploadid + "('"
					+ absolutePath + "','" + status + "','" + desc + "');");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
		} catch (FileUploadException e) {
			desc = "文件上传失败";
			status = "false";
			// TODO: need to handle conversion options and error reporting
			response.setContentType("text/html");
			response.setHeader("Pragma", "No-cache");
			response.setDateHeader("Expires", 0);
			response.setHeader("Cache-Control", "no-cache");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<script type=\"text/javascript\">");
			absolutePath = absolutePath.replace("/", "//");
			out.println("if (parent.uploadComplete" + uploadid + ") parent.uploadComplete" + uploadid + "('"
					+ absolutePath + "','" + status + "','" + desc + "');");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unzip(String zipFilePath, String destDirectory) {
		byte[] buffer = new byte[1024];
		try {
			ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath));
			ZipEntry entry = null;
			try {
				entry = zipInputStream.getNextEntry();
			}catch(Exception e) {
				try {
					zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath), Charset.forName("GBK"));
					entry = zipInputStream.getNextEntry();
					File destDir = new File(destDirectory);
					if (!destDir.exists()) {
						destDir.mkdirs(); // 创建目标文件夹
					}
					while (entry != null) {
						String filePath = destDirectory + File.separator + entry.getName();
						if (!entry.isDirectory()) {
							extractFile(zipInputStream, filePath, buffer);
						} else {
							File dir = new File(filePath);
							dir.mkdirs(); // 创建子文件夹
						}
						zipInputStream.closeEntry();
						entry = zipInputStream.getNextEntry();
					}
					// 增加关闭解压流代码 add by shuguang
					zipInputStream.close();
				} catch (FileNotFoundException ffe) {
					ffe.printStackTrace();
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}
			File destDir = new File(destDirectory);
			if (!destDir.exists()) {
				destDir.mkdirs(); // 创建目标文件夹
			}
			while (entry != null) {
				String filePath = destDirectory + File.separator + entry.getName();
				if (!entry.isDirectory()) {
					extractFile(zipInputStream, filePath, buffer);
				} else {
					File dir = new File(filePath);
					dir.mkdirs(); // 创建子文件夹
				}
				zipInputStream.closeEntry();
				entry = zipInputStream.getNextEntry();
			}
			// 增加关闭解压流代码 add by shuguang
			zipInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void extractFile(ZipInputStream zipInputStream, String filePath, byte[] buffer) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			int length;
			while ((length = zipInputStream.read(buffer)) > 0) {
				fos.write(buffer, 0, length);
			}
		}
	}

	/**
	 * 根据文件名判断发票数据是否存在
	 * 
	 * @param fileName
	 * @return
	 */
	private String vocExists(String fileName) {
		String vocNo = getVocNo(fileName);
		List<PmVatOVoc> pmVatOVocs = new ArrayList<>();
		Map<String, String> pas3 = new HashMap<String, String>();
		pas3.put("VOC_NO", vocNo);
		pmVatOVocs = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.EvatCommonSql.selectVocNoCount", pas3);

		if (pmVatOVocs.size() == 0) {
			return vocNo;
		}
		return "";
	}

	/**
	 * get voc no from filename
	 * 
	 * @param fileName
	 * @return
	 */
	private String getVocNo(String fileName) {
		String vocNo = "";
		int lastIndex = fileName.lastIndexOf('.');
		if ("xml".equals(fileName.substring(lastIndex + 1))) {
			vocNo = fileName.substring(Integer.parseInt(SysParamService.getSysParamDir("3001|0001")),
					Integer.parseInt(SysParamService.getSysParamDir("3001|0004")));

		}
		if ("pdf".equals(fileName.substring(lastIndex + 1))) {
			vocNo = fileName.substring(Integer.parseInt(SysParamService.getSysParamDir("3001|0002")),
					Integer.parseInt(SysParamService.getSysParamDir("3001|0005")));

		}
		if ("ofd".equals(fileName.substring(lastIndex + 1))) {
			vocNo = fileName.substring(Integer.parseInt(SysParamService.getSysParamDir("3001|0003")),
					Integer.parseInt(SysParamService.getSysParamDir("3001|0006")));

		}
		return vocNo;
	}

}
