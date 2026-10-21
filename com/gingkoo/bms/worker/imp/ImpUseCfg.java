package com.gingkoo.bms.worker.imp;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.gingkoo.bms.worker.IWorker;
import com.gingkoo.bms.worker.proc.ProcWorker;
import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.api.core.spring.SpringContextUtils;
import com.gingkoo.gal.facility.log.LogHelper;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gal.util.uuid.UUuidUtils;
import com.gingkoo.rpt.common.server.BasFuncService;
import com.gingkoo.rpt.common.server.DateUtilsC;
import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.rpt.imp.server.VATImportService;

@Component("com.gingkoo.bms.worker.imp.ImpUseCfg")
public class ImpUseCfg extends IWorker{

	private MyBatisSessionTemplate myBatisSessionTemplate;

	private final static Logger Log = LoggerFactory.getLogger(ProcWorker.class);
	private Map<String, String> headMap;

	public MyBatisSessionTemplate getMyBatisSessionTemplate() {
		return myBatisSessionTemplate;
	}
	@Autowired
	public void setMyBatisSessionTemplate(MyBatisSessionTemplate myBatisSessionTemplate) {
		this.myBatisSessionTemplate = myBatisSessionTemplate;
	}	
	
	@Override
	public Map<String,String> execute(Map<String,String> paras) throws Exception
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String date = dateFormat.format(new Date());
		
		String status ="2";
		String ErrMsg = "";
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
		String time = timeFormat.format(new Date());
		
		Map<String,String> results = new HashMap<String,String>();
		results.put("C_CODE", "00");
		results.put("E_CODE", "00");
		results.put("E_MSG", "OK");
		
		Log.info("开始自动导入文件");
		Map<String,String> map = new HashMap<String,String>();
		map.put("FILE_OWNER", paras.get("FILE_OWNER"));
		map.put("DATA_DATE", date);
		List<Map> list = myBatisSessionTemplate.selectList("com.gingkoo.bms.ctl.select_ImpFileList", map);
		
			
		String corp_id = String.valueOf(paras.get("CORP_ID"));

		String localdir = String.valueOf(paras.get("IMP_DIR"));
		if(paras.get("IMP_DIR") == null) {
			localdir = SysParamService.getSysParamDir(String.valueOf(paras.get("IMP_DIR_PARA")));
			paras.put("IMP_DIR", localdir);
		}
		
		String backuproot = String.valueOf(paras.get("BACKUP_DIR"));
		if(paras.get("BACKUP_DIR") == null) {
			backuproot = SysParamService.getSysParamDir(String.valueOf(paras.get("BACKUP_DIR_PARA")));
			paras.put("BACKUP_DIR", backuproot);
		}
		
		//清空本地处理目录
		Map<String, String> backdirs = new HashMap<String,String>();
		File[] backupchilds = new File(backuproot).listFiles();
		for (int i = 0; i < backupchilds.length; i++) {
			if (backupchilds[i].isDirectory())
			{
				File[] subchilds = backupchilds[i].listFiles();
				for (int j = 0; j < subchilds.length; j++) {
					if (subchilds[j].isDirectory())
						backdirs.put(subchilds[j].getName().toUpperCase(), subchilds[j].getName());
				}
			}
		}
		
		try {
			recursion(corp_id, new File(localdir), localdir, list, paras);
			
			//导入文件后，备份
	        /*String datestr = new SimpleDateFormat("yyyyMMdd").format(new Date());
	        new File(backuproot +"/"+ datestr).mkdirs();
	        File[] localchilds = new File(localdir).listFiles();
	        if(localchilds == null){
	        	return results;
	        }
	        for (int i = 0; i < localchilds.length; i++) {
	        	BasFuncService.moveFile(localchilds[i].getAbsolutePath(), backuproot +"/"+datestr + "/" + localchilds[i].getName());
	        }*/
		} catch (Exception ex) {
			status = "3";
			ErrMsg = ex.getMessage();
			
			Log.error("自动导入文件["+corp_id+"]时发生错误",ex);
			results.put("C_CODE", "E");
			results.put("E_CODE", "E");
			results.put("E_MSG", "自动导入文件["+corp_id+"]时发生错误");
		}
		
	
		return results;
	}
	
	
	private void recursion(String corp_id,File f, String basedir, List<Map> list, Map<String,String> paras) throws Exception {

		File[] childs = f.listFiles();
		if(childs == null){
			return ;
		}
		for (int i = 0; i < childs.length; i++) {
			String status ="2";
			String ErrMsg = "";
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String date = dateFormat.format(new Date());
			
			SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
			String time = timeFormat.format(new Date());
			
			if (childs[i].isDirectory()) {
				recursion(corp_id,childs[i], basedir, list, paras);
				continue;
			} 
			
			String shortname = childs[i].getAbsolutePath().substring(childs[i].getParent().length() + 3);
			System.out.println(shortname);
			Map expCfgRecord = compareFile(shortname, list);
			if (expCfgRecord == null) {
				continue;
			}
			
			Map<String,String> map = new HashMap<String,String>();
			map.put("FILE_NAME", String.valueOf(expCfgRecord.get("FILE_NAME")));
			
			Map templateMap = (Map)myBatisSessionTemplate.selectOne("com.gingkoo.bms.ctl.select_ImportFileInfo", map);
			if (templateMap == null) {
				continue;
			}
			
			//templateMap.put("full_file_name", childs[i].getAbsolutePath());

			List<Map<String,String>> resultList = new ArrayList<Map<String,String>>();
			Map<String, String> newmap = new HashMap<String,String>();
			Iterator ite = templateMap.entrySet().iterator();
			while(ite.hasNext()){
				Map.Entry<String, Object> entry = (Entry<String, Object>) ite.next();
				String key = entry.getKey();//map中的key
				String value = String.valueOf(entry.getValue());//上面key对应的value
				newmap.put(key,value);
			}
			
			newmap.put("full_file_name", childs[i].getAbsolutePath());
							
			resultList.add(newmap);
			headMap = new HashMap<String,String>();
			headMap.put("HEAD.AUTOIMP", "TRUE");
			headMap.put("HEAD.CORP_ID", corp_id);
			headMap.put("HEAD.DATA_FILE_NAME", shortname);
			VATImportService myImportService = (VATImportService)SpringContextUtils.getBean("com.gingkoo.rpt.imp.server.ImportService");

			Callback importResult = myImportService.ImportFilesFal(headMap, resultList);
			
		    if (importResult.getErrorMessage() != null ) {
		    	status = "3";
				ErrMsg = importResult.getErrorMessage();
				Log.info("FAIL:" + importResult.getErrorMessage());
			} else {
				//导入成功，备份文件
				Log.info("SUCC:" + importResult.getSuccessMessage());
				String backuproot = String.valueOf(paras.get("BACKUP_DIR"));
				String datestr = new SimpleDateFormat("yyyyMMdd").format(new Date());
		        new File(backuproot +"/"+ datestr).mkdirs();
		    	BasFuncService.moveFile(childs[i].getAbsolutePath(), backuproot +"/"+datestr + "/" + childs[i].getName());
	        	status = "2";
	        	ErrMsg = "OK";
			}
		    
		    
		    Map<String,String> statParas = new HashMap<String,String>();
			statParas = new HashMap<String,String>();
			statParas.put("CORP_ID", corp_id);
			statParas.put("DATA_DATE", date);
			statParas.put("FILE_NAME",String.valueOf(expCfgRecord.get("FILE_NAME")));
			statParas.put("STATUS", status);
			statParas.put("FILE_DIR", basedir);
			
			statParas.put("RECORD_NUM", "0");
			statParas.put("SUCC_NUM", "0");
			statParas.put("ERR_NUM", "0");
			
			
			myBatisSessionTemplate.update("com.gingkoo.bms.ctl.update_ImpFileStat", statParas);
			Map<String,String> logParas = new HashMap<String,String>();
		
			logParas.put("DATA_ID", UUuidUtils.UUID());
			logParas.put("DATA_DATE", date);
			logParas.put("CORP_ID", corp_id);
			logParas.put("FILE_NAME", statParas.get("FILE_NAME"));
			logParas.put("TABLE_NAME", "");
			if(expCfgRecord.get("TABLE_NAME") != null) {
				logParas.put("TABLE_NAME", String.valueOf(expCfgRecord.get("TABLE_NAME")));
			}
			
			logParas.put("FILE_MODE", "A");
			logParas.put("FILE_REAL_NAME", shortname);
			logParas.put("BATCH_NO", "0");
			logParas.put("BATCH_ORDER", "0");
			logParas.put("FILE_FLAG", "");
			logParas.put("FILE_OWNER", "");
			logParas.put("FILE_DIR", basedir);
			logParas.put("BACKUP_DIR", "");
			logParas.put("BEGIN_TIME", date+time);
			logParas.put("END_TIME", date+timeFormat.format(new Date()));
			logParas.put("RECORD_NUM", statParas.get("RECORD_NUM"));
			logParas.put("SUCC_NUM", statParas.get("SUCC_NUM"));
			logParas.put("ERR_NUM", statParas.get("ERR_NUM"));
			
			logParas.put("STATUS", status);
			logParas.put("REMARKS", "");
			if(status.equals("3")) {
				logParas.put("REMARKS", ErrMsg);
			}
			
			
			myBatisSessionTemplate.insert("com.gingkoo.bms.ctl.insert_imp_dtl", logParas);

			
		}
	}
	
	
	private Map compareFile(String filename, List<Map> fileTemplates)
	{
		int strLen1,strLen2, strLen;
		for (Map record : fileTemplates) {
			String tfilename = String.valueOf(record.get("FILE_NAME"));
			String filenameMatch = String.valueOf(record.get("FILENAME_MATCH"));
			
			if(filenameMatch.equals("*")) {
				String fileNameMask = String.valueOf(record.get("FILENAME_MASK"));
				String [] fileNameMasks = fileNameMask.split("\\*");
				if (fileNameMasks.length == 1) {
					if(fileNameMasks.equals(filename)) {
						return record;
					}
				}
				
				if (fileNameMasks.length != 2) {
					continue;
				}
				
				if ( filename.startsWith(fileNameMasks[0]) && filename.endsWith(fileNameMasks[1]) ){
					return record;
				}
				
				continue;
			}
			
					
		}
		
		return null;
	}
	
	public void deleteFile(File file){ 
		   if(file.exists()){                    //判断文件是否存在
		    if(file.isFile()){                    //判断是否是文件
		     file.delete();                       //delete()方法 你应该知道 是删除的意思;
		    }else if(file.isDirectory()){              //否则如果它是一个目录
		     File files[] = file.listFiles();               //声明目录下所有的文件 files[];
		     for(int i=0;i<files.length;i++){            //遍历目录下所有的文件
		      this.deleteFile(files[i]);             //把每个文件 用这个方法进行迭代
		     } 
		    } 
		    file.delete(); 
		   }else{ 
		    System.out.println("所删除的文件不存在！"+'\n'); 
		   } 
	} 
	
	public static void main(String[] args) throws Exception {
		String s1 = "20140201";
		String s2 = "20140301";
		LogHelper.initialize();

		System.out.println(Math.abs( DateUtilsC.daysOfTwo( DateUtilsC.numberToDate(s1), DateUtilsC.numberToDate(s2))));
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "war/WEB-INF/spring/application-context.xml",
//						"war/WEB-INF/spring/gal-orm-mybatis-config.xml",
						"war/WEB-INF/spring/rpt-config.xml",
						"war/WEB-INF/spring/rpt-common-config.xml",
						"war/WEB-INF/spring/gal-authorization-config.xml",
						"war/WEB-INF/spring/gal-filecenter-config.xml",
						"war/WEB-INF/spring/gal-log-core-config.xml",
						"war/WEB-INF/spring/gal-mail-config.xml",
						"war/WEB-INF/spring/gal-spring-scheduler.xml",
//						"war/WEB-INF/spring/bms-config.xml",
//						"war/WEB-INF/spring/rpt-thirdparty-config.xml",
						"war/WEB-INF/spring/gui-core-config.xml" });
		SpringContextUtils.getInstance().setApplicationContext(context);
		ImpUseCfg job = (ImpUseCfg)SpringContextUtils.getBean("com.gingkoo.bms.worker.imp.ImpUseCfg");
		
		Map<String,String> paras = new HashMap<String,String>();
		paras.put("SESSION_ID", "12344556");
		paras.put("CORP_ID", "TESTCORP");
		paras.put("FILE_OWNER", "01");
		paras.put("IMP_DIR_PARA", "0003|0002");
		paras.put("IMP_DIR", "E:/test/tmp/");
		paras.put("BACKUP_DIR_PARA", "0003|0003");
		paras.put("BACKUP_DIR", "E:/test/TEMP/");
		
		job.execute(paras);
		
	}
}
