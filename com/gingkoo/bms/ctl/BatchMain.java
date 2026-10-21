package com.gingkoo.bms.ctl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gingkoo.bms.worker.IWorker;
import com.gingkoo.gal.api.core.spring.SpringContextUtils;
import com.gingkoo.gal.facility.log.LogHelper;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gal.util.uuid.UUuidUtils;
import com.gingkoo.rpt.common.server.DateUtilsC;

@Component("com.gingkoo.bms.ctl.BatchMain")
class BatchMain implements Runnable {
	//private String sessionId;
	private MyBatisSessionTemplate myBatisSessionTemplate;
	
	private final static Logger Log = LoggerFactory.getLogger(BatchMain.class);

	public MyBatisSessionTemplate getMyBatisSessionTemplate() {
		return myBatisSessionTemplate;
	}
	@Autowired
	public void setMyBatisSessionTemplate(MyBatisSessionTemplate myBatisSessionTemplate) {
		this.myBatisSessionTemplate = myBatisSessionTemplate;
	}	
	
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public int getBatch(Map<String, String> map){
		Map<String,String> params = new HashMap<String,String>();
		params.put("DATA_ID", map.get("DATA_ID"));
		params.put("STATUS", "1");
		int result = myBatisSessionTemplate.update("com.gingkoo.bms.ctl.update_BatchSql_Start", params);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		Map<String,String> params = new HashMap<String,String>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
		
		List<Map> records = myBatisSessionTemplate.selectList("com.gingkoo.bms.ctl.select_BatchList", params);
		if(records.isEmpty()) {
			return;
		}
		
		for(Map record: records) {
			Map paramsTmp = new HashMap();
			paramsTmp.put("DATA_ID", record.get("DATA_ID"));
			record = myBatisSessionTemplate.selectOne("com.gingkoo.bms.ctl.select_BatchList", paramsTmp);
			
			String date = dateFormat.format(new Date());
			String time = timeFormat.format(new Date());
			
			String lastTime = "";
			if(record.get("LAST_TIME") != null) {
				lastTime  = String.valueOf( record.get("LAST_TIME")).trim();
			}
			
			String nextTime = "";
			if(record.get("NEXT_TIME") != null) {
				nextTime = String.valueOf( record.get("NEXT_TIME")).trim();
			}  
			
			
			Map<String,String> planResult = new HashMap<String,String>();
			planResult.put("RUN", "Y");
			planResult.put("NEXT_TIME", "");
			
			String runPlanTmp = (String) record.get("RUN_PLAN");
			if(StringUtils.isNotBlank(runPlanTmp)) {
				String execPlanId = String.valueOf(record.get("RUN_PLAN"));
				planResult = calcPlan(String.valueOf(record.get("CORP_ID")), execPlanId, lastTime, nextTime);
			}
			
			
			if(!planResult.get("RUN").equals("Y")) {
				continue;
			}
			int result = getBatch(record);
			if (result <= 0){
				continue;
			}
			Map<String,String> paras = new HashMap<String,String>();
			execute(record, paras);
			lastTime = date+time;
			
			time = timeFormat.format(new Date());
			Map<String,String> dataMap = new HashMap<String,String>();
			dataMap = new HashMap<String,String>();
			dataMap.put("DATA_ID", String.valueOf( record.get("DATA_ID")));
			dataMap.put("STATUS", "2");
			dataMap.put("LAST_TIME", lastTime);
			dataMap.put("NEXT_TIME", planResult.get("NEXT_TIME"));
			
			myBatisSessionTemplate.update("com.gingkoo.bms.ctl.update_End", dataMap);
			
		}
		
	}

	@SuppressWarnings("unchecked")
	public void execute( Map<String,String> batchInfo, Map<String,String> paras) {
	
		Map<String,String> params = new HashMap<String,String>();
		String sessionId = null;
		
		params.put("BATCH_ID", batchInfo.get("DATA_ID"));
		List<Map> jobs = myBatisSessionTemplate.selectList("com.gingkoo.bms.ctl.select_Job_List", params);
		if(jobs.isEmpty()) {
			return;
		}
	
		Log.info("BATCH开始执行");
		Map<String,Object> jobMap = new HashMap<String,Object>();
		
		sessionId = CreateSession(batchInfo, jobs, jobMap);
		Map<String,String> batchResult = new HashMap<String,String>();
		boolean flag = false;
		Map job = jobs.get(0);
		Map jobNext = null;
		String jobId = "";
		String pJobId = "";
		String nextJobId = "";
		
		while(job != null) {
			Map<String,String> results = new HashMap<String,String>();
			results.put("C_CODE", "00");
			results.put("E_CODE", "OK");
			
			jobId = String.valueOf(job.get("JOB_ID"));
			Map<String,String> workerParas = praseJobArgs(String.valueOf(job.get("ARGS")), paras);
			
			workerParas.put("SESSION_ID", sessionId);
			workerParas.put("CORP_ID", String.valueOf(job.get("CORP_ID")));
			if(job.get("ORG_ID") != null && !workerParas.containsKey("ORG_ID")) {
				workerParas.put("ORG_ID", String.valueOf(job.get("ORG_ID")));
			}
			Log.info("JOB:"+ String.valueOf(job.get("JOB_ID"))+" 开始执行");
			try {
				IWorker worker = (IWorker)SpringContextUtils.getBean(String.valueOf(job.get("CLASS")));
				
				try {
					JobBegin(sessionId, pJobId, batchInfo, job);
					results = worker.execute(workerParas);
					String C_CODE =  results.get("C_CODE");
					if("E".equals(C_CODE)){
						flag = true;
					}
				} catch (Exception e) {
					results.put("C_CODE", "E");
					results.put("E_CODE", "E");
					results.put("E_MSG", e.getMessage());
					flag = true;
					e.printStackTrace();
				}
				
			} catch (Exception e) {
				results.put("C_CODE", "E");
				results.put("E_CODE", "E");
				results.put("E_MSG", "获取执行者报错，执行者：" + (job.get("CLASS") == null ? "NULL" : job.get("CLASS")));
				flag = true;
				e.printStackTrace();
			}
			
			
			pJobId = String.valueOf(job.get("JOB_ID"));
			
			String C_CODE =  results.get("C_CODE");
			if(C_CODE== null || C_CODE.isEmpty()) {
				C_CODE = "E";
				results.put("C_CODE", "E");
				results.put("E_CODE", "E");
				results.put("E_MSG", "no result code return");
				flag = true;
			}
			
			Log.info("JOB:"+ String.valueOf(job.get("JOB_ID"))+" 执行结束");
			
			jobNext = null;
			for(int i=0; i<5; i++) { 
				String next = String.valueOf(job.get("NEXT_"+String.valueOf(i)));
				if(next==null || next.isEmpty()) {
					continue;
				}
				
				String[] nextArr = next.split(":");
				if(nextArr[0].length() > 2) {
					if(nextArr[0].contains(C_CODE+"|")||nextArr[0].contains("|"+C_CODE)) {
						jobNext = (Map)jobMap.get(nextArr[1]);
						break;
					}
				} else if (nextArr[0].equals(C_CODE)) {
					jobNext = (Map)jobMap.get(nextArr[1]);
					break;
				} 
			}
			
			nextJobId = "";
			if(jobNext != null) {
				nextJobId = String.valueOf(jobNext.get("JOB_ID"));
			}
			
			JobEnd(sessionId, nextJobId, batchInfo, job, results);
			
			job = jobNext;
			
		} 
		if(flag){
			batchResult.put("C_CODE", "E");
			batchResult.put("E_CODE", "E");
			batchResult.put("E_MSG", "job执行错误");
		}else{
			batchResult.put("C_CODE", "00");
			batchResult.put("E_CODE", "00");
			batchResult.put("E_MSG", "OK");
		}
		BatchEnd(sessionId, batchInfo, batchResult);
		Log.info("BATCH执行结束");
	}
	
	public Map<String,String> praseJobArgs(String agrs, Map<String,String> envs) {
		Map<String,String> paras = new HashMap<String,String>();
		if(agrs == null || agrs.isEmpty()) {
			return  paras;
		}
		
		for (String key : envs.keySet()) {
			if (envs.get(key) != null){
				agrs = agrs.replace("${" + key + "}", envs.get(key)); 
			}
		}
		
		while (agrs.indexOf("${") >= 0) {
			agrs = agrs.substring(0, agrs.indexOf("${")) + agrs.substring(agrs.indexOf("}") + 1);
		}
		
		String [] argv = agrs.trim().split(",(?=(?:[^\"]*\"[^\"]*\"[^\"]*)*$|[^\"]*$)");
		for(int i=0; i<argv.length; i++) {
			String[] para = argv[i].split(":(?=(?:[^\"]*\"[^\"]*\"[^\"]*)*$|[^\"]*$)");
			if(para.length < 2) {
				continue;
			}
			
			paras.put(para[0].toUpperCase().trim().replaceAll("\"", ""), para[1].trim().replaceAll("\"", ""));
		}
		
		return paras;
	}
	
	public String CreateSession(Map<String,String> batchInfo, List<Map> jobs, Map<String,Object> jobMap) {
		String sessionId= UUuidUtils.UUID();
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String time = new SimpleDateFormat("HHmmss").format(new Date());
		
		Map<String,String> dataMap = new HashMap<String,String>();

		dataMap.put("DATA_ID", sessionId);
		dataMap.put("DATA_DATE",  date);
		dataMap.put("CORP_ID", batchInfo.get("CORP_ID"));
		
		if(batchInfo.get("ORG_ID") == null) {
			dataMap.put("ORG_ID", "");
		} else {
			dataMap.put("ORG_ID", batchInfo.get("ORG_ID"));
		}
		
		dataMap.put("BATCH_ID", batchInfo.get("DATA_ID"));
		dataMap.put("START_TIME", date+time);
		dataMap.put("STATUS", "1");
		dataMap.put("C_CODE", "");
		dataMap.put("E_CODE", "");
		dataMap.put("E_MSG", "");
		
		myBatisSessionTemplate.insert("com.gingkoo.bms.ctl.insert_BatchLogSql", dataMap);
		
		int runOrder = 0;
		for (Map record : jobs) {
			dataMap = new HashMap<String,String>();
			
			jobMap.put(String.valueOf(record.get("JOB_ID")), record);
			
			dataMap.put("DATA_ID",  UUuidUtils.UUID());
			dataMap.put("DATA_DATE",  date);
			dataMap.put("CORP_ID", batchInfo.get("CORP_ID"));
			if(batchInfo.get("ORG_ID") == null) {
				dataMap.put("ORG_ID", "");
			} else {
				dataMap.put("ORG_ID", batchInfo.get("ORG_ID"));
			}
			dataMap.put("SESSION_ID", sessionId);
			dataMap.put("BATCH_ID", batchInfo.get("DATA_ID"));
			dataMap.put("JOB_ID", String.valueOf(record.get("JOB_ID")));
			dataMap.put("P_JOB_ID", "");
			dataMap.put("STATUS", "0");
			dataMap.put("START_TIME", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
			dataMap.put("RUN_ORDER", ""+runOrder);
			
			myBatisSessionTemplate.insert("com.gingkoo.bms.ctl.insert_BatchSession", dataMap);
			runOrder ++;
			
		}
		
		
		return sessionId;
	}
	
	public void JobBegin(String sessionId, String pJobId, Map<String,String> batchInfo, Map<String,String> jobMap) {
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String time = new SimpleDateFormat("HHmmss").format(new Date());
		
		Map<String,String> dataMap = new HashMap<String,String>();
		dataMap = new HashMap<String,String>();
		dataMap.put("SESSION_ID", sessionId);
		dataMap.put("JOB_ID", String.valueOf(jobMap.get("JOB_ID")));
		dataMap.put("P_JOB_ID",  pJobId);
		dataMap.put("STATUS",  "1");
		dataMap.put("START_TIME",  date+time);

		myBatisSessionTemplate.update("com.gingkoo.bms.ctl.update_BatchSessionBegin", dataMap);
	}
	
	public void JobEnd(String sessionId, String nextJobId, Map<String,String> batchInfo, Map<String,String> jobMap, Map<String,String> results) {
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String time = new SimpleDateFormat("HHmmss").format(new Date());
		
		Map<String,String> dataMap = new HashMap<String,String>();
		dataMap = new HashMap<String,String>();
		dataMap.put("SESSION_ID", sessionId);
		dataMap.put("JOB_ID", String.valueOf(jobMap.get("JOB_ID")));
		dataMap.put("NEXT_JOB_ID",  nextJobId);
		dataMap.put("STATUS",  "2");
		dataMap.put("END_TIME",  date+time);
		dataMap.put("C_CODE", results.get("C_CODE"));
		dataMap.put("E_CODE", results.get("E_CODE"));
		dataMap.put("E_MSG", results.get("E_MSG"));
		dataMap.put("OUTPUT_1", "");
		dataMap.put("OUTPUT_2", "");
		dataMap.put("OUTPUT_3", "");
		dataMap.put("OUTPUT_4", "");
		dataMap.put("OUTPUT_5", "");
		dataMap.putAll(results);
		
		myBatisSessionTemplate.update("com.gingkoo.bms.ctl.update_BatchSessionEnd", dataMap);
	}
	
	public void BatchEnd(String sessionId, Map<String,String> batchInfo, Map<String,String> results) {
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String time = new SimpleDateFormat("HHmmss").format(new Date());
		
		Map<String,String> dataMap = new HashMap<String,String>();
		dataMap = new HashMap<String,String>();
		dataMap.put("DATA_ID", batchInfo.get("DATA_ID"));
		dataMap.put("STATUS", "2");
		
		myBatisSessionTemplate.update("com.gingkoo.bms.ctl.update_BatchSql", dataMap);
		
		dataMap.put("DATA_ID", sessionId);
		dataMap.put("END_TIME", date+time);
		dataMap.put("STATUS", "1");
		dataMap.put("C_CODE", results.get("C_CODE"));
		dataMap.put("E_CODE", results.get("E_CODE"));
		dataMap.put("E_MSG", results.get("E_MSG"));
		
		myBatisSessionTemplate.update("com.gingkoo.bms.ctl.update_BatchLogSql", dataMap);
	}
	
	public Map<String,String> calcPlan(String corpId, String planId, String lastTime, String nextTime)
	{
		Map<String,String> result = new HashMap<String,String>();
		result.put("RUN", "N");
		result.put("NEXT_TIME", "");
		
		if(lastTime == null){
			lastTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		}
		
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		SimpleDateFormat monthFormat = new SimpleDateFormat("yyyyMM");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
		
		Map<String,String> params = new HashMap<String,String>();
		params.put("CORP_ID", corpId);
		params.put("PLAN_ID", planId);
		
		Map<String,String> plan = (Map)myBatisSessionTemplate.selectOne("com.gingkoo.bms.ctl.select_Plan", params);
		if(plan == null) {
			return result;
		}
		
		/*START_TIME
		END_TIME
		INTERAL*/
		String calendarNO = "";
		if(plan.get("CALENDAR_NO") !=null ) {
			calendarNO = String.valueOf(plan.get("CALENDAR_NO"));
		}
		
		
		String dayType = "D";
		String baseDayType = "F";

		Date dt = new Date();
		
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(dt); 
		
		String baseDate = String.valueOf(plan.get("BASE_DAY"));
		int offsetD = 0;
		if(plan.get("OFFSET_D") != null) {
			offsetD = Integer.parseInt(String.valueOf(plan.get("OFFSET_D")));
		}
		
		String offsetU = String.valueOf(plan.get("OFFSET_U"));
		
		/*MFW-月第一个工作日 MLW-月最后一个工作日 MFD-每月1日  MLD-月最后一日  EVD-每个自然日  EVW-每个工作日   YFW-年第一工作日  YLW-年最后一个工作r日  YFD-1月1日  YLD-12月31日*/
		if(baseDate.equals("MFW")) {
			dayType = "W";
			baseDayType = "F";
		}
		
		if(baseDate.equals("MLW")) {
			dayType = "W";
			baseDayType = "L";
		}
		
		if(baseDate.equals("MFD")) {
			dayType = "D";
			baseDayType = "F";
			
		}
		
		if(baseDate.equals("MLD")) {
			dayType = "D";
			baseDayType = "L";
		}
		
		if(baseDate.equals("EVD")) {
			dayType = "D";
			baseDayType = "E";	
		}
		
		if(baseDate.equals("EVW")) {
			dayType = "W";
			baseDayType = "E";
		}

		if(baseDate.equals("YFW")) {
			dayType = "W";
			baseDayType = "F";
			rightNow.set(Calendar.MONTH, 1);
		}
		
		if(baseDate.equals("YLW")) {
			dayType = "W";
			baseDayType = "L";
			rightNow.set(Calendar.MONTH, 12);
		}
		
		if(baseDate.equals("YFD")) {
			dayType = "D";
			baseDayType = "F";
			rightNow.set(Calendar.MONTH, 1);
		}
		
		if(baseDate.equals("YLD")) {
			dayType = "D";
			baseDayType = "L";
			rightNow.set(Calendar.MONTH, 12);
		}
		
		
		String thisMFirstDay = monthFormat.format(rightNow.getTime())+"01";
		rightNow.add(Calendar.MONTH, 1);
		String nextMFirstDay = monthFormat.format(rightNow.getTime())+"01";
		rightNow.add(Calendar.MONTH, -1);
		
		Map<String,String> paramsWorkdate = new HashMap<String,String>();
		
		paramsWorkdate.put("CALENDAR_NO", calendarNO);
		paramsWorkdate.put("FIRST_DATE", thisMFirstDay);
		paramsWorkdate.put("LAST_DATE", nextMFirstDay);
		List<Map> workDates = myBatisSessionTemplate.selectList("com.gingkoo.bms.ctl.select_WorkdateList", paramsWorkdate);
		
		
		if(baseDayType.equals("F") && offsetD < 0) {
			return result;
		}
		
		if(baseDayType.equals("L") && offsetD > 0) {
			return result;
		}
		
		String today =  dateFormat.format(new Date());
		String baseDay =  dateFormat.format(new Date());
		String nextRunDay = dateFormat.format(new Date());
		if(dayType.equals("D")) {
			if(baseDayType.equals("F")) {
				baseDay = thisMFirstDay;
			} else if(baseDayType.equals("L")) {
				rightNow.add(Calendar.MONTH, 1);
				rightNow.add(Calendar.DAY_OF_MONTH, -1);
				baseDay = dateFormat.format(rightNow.getTime());
				rightNow.add(Calendar.DAY_OF_MONTH, 1);
				rightNow.add(Calendar.MONTH, -1);
				
			} else {
				baseDay = dateFormat.format(new Date());
			}
			
		} else {
			if(workDates.isEmpty()) {
				return result;
			}
			
			if(baseDayType.equals("F")) {
				baseDay = String.valueOf(workDates.get(0).get("WORK_DATE"));
			} else if(baseDayType.equals("L")) {
				baseDay = String.valueOf(workDates.get(workDates.lastIndexOf(-1)).get("WORK_DATE"));
			} else {
				
				int i=0;
				for(; i<workDates.size(); i++) {
					String a = String.valueOf(workDates.get(i).get("WORK_DATE"));
					if(Long.parseLong(a) == Long.parseLong(today)) {
						baseDay = a;
						break;
					}
					
					if(Long.parseLong(a) > Long.parseLong(today)) {
						baseDay = a;
						break;
					}
					
				}
				
				if(i>=workDates.size()) {
					baseDay = String.valueOf(workDates.get(workDates.size()-2).get("WORK_DATE"));
				}
				
				//
			}
		}
		
		String runDay =  baseDay;
		if(!baseDayType.equals("E")) {
			if(offsetU.equals("D")) {
				Calendar calendarDay = Calendar.getInstance();
				calendarDay.setTime(dt); 
				calendarDay.set(Calendar.MONTH, Integer.parseInt(baseDay.substring(4, 2)));
				calendarDay.set(Calendar.DAY_OF_MONTH, Integer.parseInt(baseDay.substring(6, 2)));
				
				if(offsetD != 0) {
					calendarDay.add(Calendar.DAY_OF_MONTH, offsetD);
				}
				
				runDay = dateFormat.format(calendarDay.getTime());
			} else {
				
				int pos = 0;
				int i=0;
				for(; i<workDates.size(); i++) {
					String a = String.valueOf(workDates.get(i).get("WORK_DATE"));
					if(Long.parseLong(a) == Long.parseLong(baseDay)) {
						pos = i;
						break;
					}
				}
				
				if(i>=workDates.size()) {
					if(baseDayType.equals("F")) {
						pos = 0;
					} else {
						pos = workDates.size() - 1;
					}
					
				}
				
				runDay = String.valueOf(workDates.get(pos+offsetD).get("WORK_DATE"));
			}
		}
		
		if(Long.parseLong(runDay) < Long.parseLong(today)) {
			return result;
		}
		
		if(Long.parseLong(runDay) > Long.parseLong(today)) {
			//result.put("NEXT_TIME", runDay+String.valueOf(plan.get("START_TIME")));
			return result;
		}
		//1420
		int lastTime2 =  Integer.parseInt(lastTime.substring(8,14));
		//1442
		int nowTime =  Integer.parseInt(timeFormat.format(new Date()));
		int beginTime =  Integer.parseInt(String.valueOf(plan.get("START_TIME")));
		int endTime = Integer.parseInt(String.valueOf(plan.get("END_TIME")));
		int inter = Integer.parseInt(String.valueOf(plan.get("INTERAL")));
		
		Log.info("now:"+nowTime+" begin:"+beginTime+" end:"+endTime+" inter:"+inter+" lasttime:"+lastTime+" lasttime2:"+lastTime2+" runday:"+runDay);
		//if(!runDay.equals(lastTime.substring(0,8))) {
			if(nowTime >= beginTime && nowTime <= endTime) {
				result.put("RUN", "Y");
				return result;
			}
			
			//return result;
		//} 
		
		if(nowTime >= beginTime && nowTime <= endTime) {
			if(nowTime >= addSecond(lastTime2,inter) && addSecond(lastTime2,inter) >= beginTime && addSecond(lastTime2,inter) <= endTime) {
				result.put("RUN", "Y");
				return result;
			} 
		} else {
			return result;
		}

		return result;
	}
	
	public int addSecond(int oldTime, int add){
		int hh = oldTime/10000;
		int mm = oldTime%10000/100;
		int ss = oldTime%100;
		
		int seconds = hh*3600 + mm*60 + ss;
		
		int news = seconds + add;
		
		hh = news / 3600;
		mm = news % 3600 / 60;
		ss = news % 60;
		
		String sNewTime = String.format("%02d", hh) + String.format("%02d", mm) + String.format("%02d", ss);
		
		return Integer.parseInt(sNewTime);
	}
	
	public static void main(String[] args) throws Exception {
		String s1 = "20140201";
		String s2 = "20140301";
		LogHelper.initialize();

		System.out.println(Math.abs( DateUtilsC.daysOfTwo( DateUtilsC.numberToDate(s1), DateUtilsC.numberToDate(s2))));
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "war/WEB-INF/spring/application-context.xml",
						"war/WEB-INF/spring/gal-authorization-config.xml",
						"war/WEB-INF/spring/gal-filecenter-config.xml",
						"war/WEB-INF/spring/gal-log-core-config.xml",
						"war/WEB-INF/spring/gal-mail-config.xml",
						"war/WEB-INF/spring/gal-spring-scheduler.xml",
						"war/WEB-INF/spring/gno-config.xml",
						"war/WEB-INF/spring/rpt-common-config.xml",
						"war/WEB-INF/spring/rpt-config.xml" });
		
		SpringContextUtils.getInstance().setApplicationContext(context);
		BatchMain job = (BatchMain)SpringContextUtils.getBean("com.gingkoo.bms.ctl.BatchMain");
		job.run();
		
	}


}