package com.gingkoo.vat.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.compressors.CompressorException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.core.serivce.callback.CallbackImpl;
import com.gingkoo.gal.facility.io.Archiver;
import com.gingkoo.gal.util.uuid.UUuidUtils;
import com.gingkoo.rpt.common.server.DtDictService;
import com.gingkoo.rpt.common.server.GrpSeqHelper;
import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.rpt.main.server.RptCommonService;
import com.gingkoo.rpt.servlet.DownloadRequestHandler;
import com.gingkoo.rule.DataRuleService;
import com.gingkoo.vat.report.*;

/**
 * 
 * @author gaoxl
 * @Description 营改增系统 通用服务
 * 
 */
@Service
public class VatTaxRptService extends RptCommonService{
	//校验SERVICE

	@Autowired
	private DownloadRequestHandler downloadRequestHandler;
	
	@Autowired
	private DataRuleService dataRuleService;
	@Autowired
	private GrpSeqHelper seqHelper;

	/**
	 * 交易认定方式配置唯一
	 * 
	 * @param header
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public Callback genTaxRpt(final Map<String, String> header, final List<Map<String, String>> list) {

		Callback rb = new CallbackImpl();
		try {
		    ArrayList<Map<String, String>> sortList = new ArrayList<Map<String, String>>();
	        Map<String, Object> sortRetMap = new HashMap<String, Object>();
	        sortRetMap = sortGenList(list);
	        if ("0".equals(sortRetMap.get("ErrCode"))) {
	            sortList = (ArrayList<Map<String, String>>) sortRetMap.get("sort");
	        }else {
	            rb.setErrorCode("-1");
                rb.setErrorMessage(", 错误信息：" + sortRetMap.get("ErrMsg"));
            }
		    
	        for (Map<String, String> dataMap : sortList) {
	            if ("RECOUNT".equals(header.get("HEAD.REC"))) {
                    if (!"07".equals(dataMap.get("RPT_STATUS"))) {
                        rb.setErrorCode("-1");
                        rb.setErrorMessage("只能对待重新生成生成的报表进行重新计算！");
                        return rb;
                    }
                }
	          //生成报表，先删除同期已存在数据。
	            if ("A".equals(dataMap.get("RPT_ID"))) {
	                dataMap.put("tableName", "PM_VAT_TAX_RPT_DTL");
	            }else {
	                dataMap.put("tableName", "PM_VAT_TAX_RPT_"+dataMap.get("RPT_ID"));
	            }
	            List<Object> oldData = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectRpt"+dataMap.get("RPT_ID")+"Data", dataMap);
	            if (oldData != null && oldData.size() > 0) {
	                myBatisSessionTemplate.delete("com.gingkoo.vat.server.VatTaxRptSql.deleteOldTaxRpt", dataMap);
	            }
	          //查询纳税主体的申报周期
	            List<Object> taxCycle = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxEnttyCycle", dataMap);
	            if (taxCycle == null || taxCycle.size() == 0) {
	                rb.setErrorCode("-1");
	                rb.setErrorMessage("生成报表失败，错误信息：获取申报周期失败！");
	                return rb;
	            }
	            if(taxCycle.size() > 1){
	                rb.setErrorCode("-1");
	                rb.setErrorMessage("生成报表失败，错误信息：获取申报周期失败！");
	                return rb;
	            }
	            Object cycleObj = taxCycle.get(0);
	            Map<String, String> cycleMap = (Map<String, String>) cycleObj;
	            if ("".equals(cycleMap.get("REPORT_CYCLE")) || cycleMap.get("REPORT_CYCLE") == null) {
	                rb.setErrorCode("-1");
	                rb.setErrorMessage("生成报表失败，错误信息：申报周期为空！");
	                return rb;
	            }
	            Map<String, String> rltMap = ReportUtils.getInpuDateMap(dataMap.get("ORG_ID"),dataMap.get("BOUC_MONTH"),cycleMap.get("REPORT_CYCLE"),dataMap.get("HEAD.CORP_ID"));
	            Map<String, String> resultMap = new HashMap<>();
	            if ("ASSET".equals(dataMap.get("RPT_ID").toUpperCase())) {
	                resultMap = dataRuleService.runRule("vat.gen.tax.report.a8",  rltMap);
	            }else if ("A".equals(dataMap.get("RPT_ID").toUpperCase())) {
	                resultMap = dataRuleService.runRule("vat.gen.tax.report.DTL",  rltMap);
	            }else {
	                resultMap = dataRuleService.runRule("vat.gen.tax.report."+dataMap.get("RPT_ID").toLowerCase(),  rltMap);
	            }
	            if ("-1".equals(resultMap.get("ErrCode"))) {
	                rb.setErrorCode("-1");
                    rb.setErrorMessage(resultMap.get("ErrMsg"));
                    return rb;
                }
	            if ("1".equals(header.get("HEAD.ORI"))) {
	                Map<String, String> oriMap = new HashMap<String,String>();
	                oriMap.putAll(dataMap);
	                //该操作为生成底稿 将生成数据插入底稿ORI表中
	                oriMap.put("tableName", dataMap.get("tableName")+"_ORI");
	                List<Object> oriList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectRpt"+oriMap.get("RPT_ID")+"Data", oriMap);
	                if (oriList != null && oriList.size() > 0) {
	                    myBatisSessionTemplate.delete("com.gingkoo.vat.server.VatTaxRptSql.deleteOldTaxRpt", oriMap);
	                }
	                dataMap.put("oriTbl", oriMap.get("tableName"));
	                myBatisSessionTemplate.insert("com.gingkoo.vat.server.VatTaxRptSql.insertTaxOri", dataMap);
	            }
	          //更新状态底稿生成
	            if ("07".equals(dataMap.get("RPT_STATUS"))) {
	                dataMap.put("RPT_STATUS", "02");
	            }else {
	                dataMap.put("RPT_STATUS", "01");
	            }
	            myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTaxRptSt", dataMap);
	        }
	        } catch (Exception e) {
	            e.printStackTrace();
	            rb.setErrorCode("-1");
	            rb.setErrorMessage(", 错误信息：" + e.getMessage());
	            return rb;
	        }
			
            
		return rb;
	}

	/**
     * 根据依赖关系对生成报表进行排序
     * @param list
     * @return
     */
	public Map<String, Object> sortGenList(List<Map<String, String>> list) {
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    ArrayList<Map<String, String>> sortList = new ArrayList<Map<String, String>>();
	    List<Map<String, String>> dataList = list;
	    for (Map<String, String> dataMap : dataList) {
	        if (sortList.contains(dataMap)) {
                continue;
            }
	       resultMap =  sortData(dataMap, dataList, sortList);
	       if (!"0".equals(resultMap.get("ErrCode"))) {
	           return resultMap;
	       }
        }
        return resultMap;
    }
	
	public Map<String, Object> sortData(Map<String, String> map, List<Map<String, String>> dataList, ArrayList<Map<String, String>> list) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, String> dataMap = map;
        ArrayList<Map<String, String>> sortList = list;
	    List<Object> rptCtlList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxRptCtl", dataMap);
        if (rptCtlList == null || rptCtlList.size() == 0) {
            resultMap.put("ErrCode", "-1");
            resultMap.put("ErrMsg", "生成报表失败，错误信息：获取报表数据失败！");
            return resultMap;
        }
        if(rptCtlList.size() > 1){
            resultMap.put("ErrCode", "-1");
            resultMap.put("ErrMsg", "生成报表失败，错误信息：申报控制表中同期存在多张该报表！");
            return resultMap;
        }
        Object object = rptCtlList.get(0);
        if(object == null){
            resultMap.put("ErrCode", "-1");
            resultMap.put("ErrMsg", "生成报表失败，错误信息：获取报表数据失败！");
            return resultMap;
        }
        Map<String, String> rptData = (Map<String, String>) object;
        String dependId = rptData.get("DEPENDS_ID");
        if ("".equals(dependId) || dependId == null) {
            if (!sortList.contains(dataMap)) {
                sortList.add(dataMap);
            }
        }else {
            resultMap = sortDepend(dataMap, dataList, sortList);
            if ("0".equals(resultMap.get("ErrCode"))) {
                sortList = (ArrayList<Map<String, String>>) resultMap.get("sort");
                if (!sortList.contains(dataMap)) {
                    sortList.add(dataMap);
                }
            }else {
                return resultMap;
            }
        }
        resultMap.put("ErrCode", "0");
        resultMap.put("sort", sortList);
	    return resultMap;
    }
	
	public Map<String, Object> sortDepend(Map<String, String> map, List<Map<String, String>> dataList, ArrayList<Map<String, String>> list) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        ArrayList<Map<String, String>> sortList = list;
        String dependsId = map.get("DEPENDS_ID");
        if (!"".equals(dependsId) && dependsId != null) {
            String[] deps = dependsId.split(",");
            
            for (int i = 0; i < deps.length; i++) {
                boolean matFlag = false;
                Map<String, String> tmp = new HashMap<String,String>();
                for (Map<String, String> dataMap : dataList) {
                    if (deps[i].equals(dataMap.get("RPT_ID"))) {
                        resultMap = sortDepend(dataMap, dataList, sortList);
                        if ("-1".equals(resultMap.get("ErrCode"))) {
                            return resultMap;
                        }
                        matFlag = true;
                        tmp = dataMap;
                    }
                }
                if (matFlag) {
                    if (!sortList.contains(tmp)) {
                        sortList.add(tmp);
                    }
                }else {
                    Map<String, String> selTaxRptClt = new HashMap<String,String>();
                    selTaxRptClt.put("RPT_ID", deps[i]);
                    selTaxRptClt.put("BOUC_MONTH", map.get("BOUC_MONTH"));
                    selTaxRptClt.put("ORG_ID", map.get("ORG_ID"));
                    List<Object> rptCtlList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxRptCtl", selTaxRptClt);
                    if (rptCtlList == null || rptCtlList.size() == 0) {
                        resultMap.put("ErrCode", "-1");
                        resultMap.put("ErrMsg", "生成报表失败，错误信息：获取报表数据失败！");
                        return resultMap;
                    }
                    if(rptCtlList.size() > 1){
                        resultMap.put("ErrCode", "-1");
                        resultMap.put("ErrMsg", "生成报表失败，错误信息：申报控制表中同期存在多张该报表！");
                        return resultMap;
                    }
                    Object object = rptCtlList.get(0);
                    if(object == null){
                        resultMap.put("ErrCode", "-1");
                        resultMap.put("ErrMsg", "生成报表失败，错误信息：获取报表数据失败！");
                        return resultMap;
                    }
                    Map<String, String> rptCtlMap = (Map<String, String>) object;
                    if ("00".equals(rptCtlMap.get("RPT_STATUS"))) {
                        resultMap.put("ErrCode", "-1");
                        resultMap.put("ErrMsg", "请先生成"+map.get("DEPENDS_ID")+"报表");
                        return resultMap;
                    }
                }
            }
        }
	    resultMap.put("ErrCode", "0");
	    resultMap.put("sort", sortList);
	    return resultMap;
    }
	
	
	
	/**
     * 检查依赖关系
     * @param map
     * @return
     */
	public Map<String, String> checkDepends(Map<String, String> map) {
	    Map<String, String> parasMap = new HashMap<String,String>();
	    String dependsId = map.get("DEPENDS_ID");
	    String[] depidList = dependsId.split(",");
	    for (String depid : depidList) {
	        parasMap.put("RPT_ID", depid);
	        parasMap.put("BOUC_MONTH", map.get("BOUC_MONTH"));
	        parasMap.put("ORG_ID", map.get("ORG_ID"));
	        List<Object> rptCtlList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxRptCtl", parasMap);
	        if (rptCtlList == null || rptCtlList.size() == 0) {
	            parasMap.put("ErrCode", "-1");
	            return parasMap;
	        }
	        if(rptCtlList.size() > 1){
	            parasMap.put("ErrCode", "-1");
	            return parasMap;
	        }
	        Object object = rptCtlList.get(0);
	        if(object == null){
	            parasMap.put("ErrCode", "-1");
	            return parasMap;
	        }
	        Map<String, String> rptCtlMap = (Map<String, String>) object;
	        if ("REVIEW".equals(map.get("REVIEW"))) {
                if (!"04".equals(rptCtlMap.get("RPT_STATUS"))&&
                        !"05".equals(rptCtlMap.get("RPT_STATUS"))&&
                        !"06".equals(rptCtlMap.get("RPT_STATUS"))) {
                    parasMap.put("ErrCode", "1");
                    return parasMap;
                }
            }else {
                if (!"00".equals(rptCtlMap.get("RPT_STATUS"))) {
                    String dependsid = rptCtlMap.get("DEPENDS_ID");
                    if (!"".equals(dependsid) && dependsid != null) {
                        Map<String, String> resultMap = new HashMap<String,String>();
                        resultMap = checkDepends(rptCtlMap);
                        if (!"0".equals(resultMap.get("ErrCode"))) {
                            return resultMap;
                        }
                    }
                }else {
                    parasMap.put("ErrCode", "1");
                    return parasMap;
                }
            }
	        
	    }
	    parasMap.put("ErrCode", "0");
        return parasMap;
}
	
	@SuppressWarnings("unchecked")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public Callback afterImport(final Map<String, String> header, final List<Map<String, String>> list ) {
	    Callback rb = new CallbackImpl();
	    try {
	        for (Map<String, String> map : list) {
	            Map<String, String> paras = new HashMap<String, String>();
	            paras.put("BOUC_MONTH", map.get("BOUC_MONTH"));
	            paras.put("ORG_ID", map.get("ORG_ID"));
	            List<Object> rptCtlList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxRptCtl", paras);
	            if (rptCtlList == null || rptCtlList.size() ==0) {
	                rb.setErrorCode("-1");
	                rb.setErrorMessage("查询纳税申报控制表失败");
	            }
	            for (Object object : rptCtlList) {
	                Map<String, String> rptCtlMap = (Map<String, String>) object;
	                String dependId = rptCtlMap.get("DEPENDS_ID");
	                if (!"".equals(dependId) && dependId != null) {
	                    String[] depidList = dependId.split(",");
	                    for (String depid : depidList) {
	                        if (depid.equals(map.get("RPT_ID"))) {
	                            Map<String, String> updateStatus = new HashMap<String,String>();
	                            updateStatus.put("RPT_STATUS", "07");
	                            updateStatus.put("BOUC_MONTH", map.get("BOUC_MONTH"));
	                            updateStatus.put("RPT_ID", rptCtlMap.get("RPT_ID"));
	                            updateStatus.put("ORG_ID", map.get("ORG_ID"));
	                            myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTaxRptSt", updateStatus);
	                            List<Map<String, String>> updList = new ArrayList<Map<String, String>>();
	                            updList.add(updateStatus);
	                            rb = afterImport(header, updList);
	                        }
	                    }
	                }
	            }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage(", 错误信息：" + e.getMessage());
        }
        return rb;
    }	
	/**
     * 检查所有报表状态，是否能导出
     * @param header
     * @param map
     * @return
     */
	public Callback dlCheckStatus(final Map<String, String> header, final Map<String, String> map){
	    
	    Callback rb = new CallbackImpl();
	    try {
	        Map<String, String> paras = new HashMap<String, String>();
            paras.put("BOUC_MONTH", map.get("BOUC_MONTH"));
            paras.put("ORG_ID", map.get("ORG_ID"));
            List<Object> rptCtlList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxRptCtl", paras);
            System.out.println(rptCtlList);
            if (rptCtlList == null || rptCtlList.size() == 0) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("生成报表失败，错误信息：获取报表数据失败！");
                return rb;
            }
            for (Object object : rptCtlList) {
                Map<String, String> rptMap = (Map<String, String>) object;
                if (!"01".equals(rptMap.get("RPT_STATUS"))
                        &&!"02".equals(rptMap.get("RPT_STATUS"))
                        &&!"03".equals(rptMap.get("RPT_STATUS"))
                        &&!"07".equals(rptMap.get("RPT_STATUS"))) {
                    rb.setErrorCode("-1");
                    rb.setErrorMessage("存在不允许导出和在线编辑状态的报表！");
                    return rb;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
	    
	}
	/**
     * 报表管理申报完成
     * @param header
     * @param map
     * @return
     */
    @SuppressWarnings("unchecked")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback updateVatReportFinish(final Map<String,String>header,final List<Map<String, String>> list){
        Callback rb = new CallbackImpl();
        try {
            for (Map<String, String> map : list) {
                if (!"05".equals(map.get("RPT_STATUS"))&&
                        !"06".equals(map.get("RPT_STATUS"))) {
                    rb.setErrorCode("-1");
                    rb.setErrorMessage("处理失败，错误信息：存在未申报报表");
                    return rb;
                }
            }
            
            for (Map<String, String> map : list) {
                Map<String,String> paras = new HashMap<String, String>();
                paras.put("BOUC_MONTH", map.get("BOUC_MONTH"));
                paras.put("RPT_ID", map.get("RPT_ID"));
                paras.put("ORG_ID", map.get("ORG_ID"));
                paras.put("RPT_STATUS", "06");
                myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTaxRptSt",paras);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage("处理失败，错误信息：" + e.getMessage());
            return rb;
        }
        return rb;
    }
	
    /**
     * 申报表打包导出
     * @param header
     * @param map
     * @return
     * @throws IOException 
     */
    public Callback export2zip(final Map<String, String> header, final List<Map<String, String>> list) throws IOException {
        Callback rb = new CallbackImpl();
        
        Map< String, Object> listGrpMap =  listGroupByOrg(list);
        String userId = header.get("HEAD.userId").toString();
        if (listGrpMap.size()>1) {
            String expDir = SysParamService.getSysParamDir("0003|0012");
            String zipFileName = UUuidUtils.UUID();
            String zipPara = expDir+File.separator+zipFileName;
            
            String expFile = "纳税申报报表.zip";
            Archiver archiver = new Archiver("zip");
            try(Archiver.ArchiveStream stream = archiver.open(zipPara)) {
                for (String orgId : listGrpMap.keySet()) {
                    List<Map<String, String>> datasList = (List<Map<String, String>>) listGrpMap.get(orgId);
                    Map<String, String > genFilesMap = genFile(header, datasList);
                    String boucMonth = genFilesMap.get("BOUC_MONTH");
                    String filePath = genFilesMap.get("path");
                    String finFile = "纳税申报汇总表_"+orgId+"_"+boucMonth+".xls";
                    stream.archive(filePath, finFile);
                }
            } catch (CompressorException | ArchiveException | IOException e) {
                e.printStackTrace();
            }
            String urlParameter = downloadRequestHandler.getUrlParameter(userId, expFile, zipPara);
            rb.setSuccessMessage(urlParameter);
        }else {
            for (String orgId : listGrpMap.keySet()) {
                List<Map<String, String>> dataList = (List<Map<String, String>>) listGrpMap.get(orgId);
                if (dataList.size()>1) {
                    Map<String, String> genFileMap = genFile(header, dataList);
                    String boucMonth = genFileMap.get("BOUC_MONTH");
                    String filePath = genFileMap.get("path");
                    String finFile = "纳税申报汇总表_"+orgId+"_"+boucMonth+".xls";
                    String urlParameter = downloadRequestHandler.getUrlParameter(userId, finFile, filePath);
                    rb.setSuccessMessage(urlParameter);
                }else {
                    Map<String, String> exportFile = dataList.get(0);
                    rb = export2ExcelList(header, exportFile);
                    if ("ONLINE".equals(exportFile.get("HEAD.ONLINE"))) {
                        return rb;
                    }
                    String[] fileNa = exportFile.get("TEMPLATE_NAME").split("\\.");
                    String fileName = fileNa[0]+"_"+orgId+"_"+exportFile.get("BOUC_MONTH")+".xls";
                    String filePath = rb.getSuccessMessage();
                    String urlParameter = downloadRequestHandler.getUrlParameter(userId, fileName, filePath);
                    rb.setSuccessMessage(urlParameter);
                }
            }
        }
        return rb;
    }
    
    /**
     * 导出记录根据机构号分组
     * @param header
     * @param map
     * @return
     */
    public Map<String, Object> listGroupByOrg(final List<Map<String, String>> list) {
        List<Map<String, String>> rptList = list;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        for (Map<String, String> map : rptList) {
            String orgId = map.get("ORG_ID");
            if (resultMap.containsKey(orgId)) {
                List<Map<String, String>> dataList = (List<Map<String, String>>) resultMap.get(orgId);
                dataList.add(map);
                resultMap.put(orgId, dataList);
            }else {
                List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
                dataList.add(map);
                resultMap.put(orgId, dataList);
            }
        }
        return resultMap;
    }
    
    public Map<String, String> genFile(final Map<String, String> header, final List<Map<String, String>> list) throws IOException {
        Callback rb = new CallbackImpl();
        
        Map<String, String> resultMap = new HashMap<String, String>();
        String expDir = SysParamService.getSysParamDir("0003|0012");
        String finFileName = UUuidUtils.UUID();
        String finPara = expDir+File.separator+finFileName;
        String boucMonth = "";
        String filepath ="";
        HSSFWorkbook wb = new HSSFWorkbook();
        FileInputStream fis = null;
        for (Map<String, String> map : list) {
            boucMonth = map.get("BOUC_MONTH");
            rb = export2ExcelList(header, map);
            filepath = rb.getSuccessMessage();
            try {
                fis = new FileInputStream(filepath);
                HSSFWorkbook sourceWb = new HSSFWorkbook(fis);
                HSSFSheet sourceSh = sourceWb.getSheetAt(0);
                HSSFSheet sheet = wb.createSheet(sourceSh.getSheetName());
                CorpSheet.copySheet(sheet, sourceSh, wb, sourceWb);
                FileOutputStream out = new FileOutputStream(finPara);
                wb.write(out);
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                if(fis != null){
                    fis.close();
                }
                if (wb != null) {
                    wb.close();
                }
            }
        }
        resultMap.put("BOUC_MONTH", boucMonth);
        resultMap.put("path", finPara);
        return resultMap;
    }
    
    
    public Callback export2ExcelList(final Map<String, String> header, final Map<String, String> map) {
        Callback rb = new CallbackImpl();
        try {
            Map<String, Object> result = new HashMap<String,Object>();
            Map<String,Object> paras = new HashMap<String, Object>();
            paras.putAll(map);
            
            if ("A".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 9);
                paras.put("coldev", 18);
                result = export(paras);
            }else if ("A1".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 7);
                paras.put("coldev", 4);
                result = export(paras);
            }else if ("A2".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 7);
                paras.put("coldev", 4);
                result = export(paras);
            }else if ("A3".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 7);
                paras.put("coldev", 2);
                result = export(paras);
            }else if ("A4".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 6);
                paras.put("coldev", 2);
                result = export(paras);
            }else if ("ASSET".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 4);
                paras.put("coldev", 1);
                result = export(paras);
            }else if ("A6".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 15);
                paras.put("coldev", 0);
                result = export(paras);
            }else if ("A5".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 6);
                paras.put("coldev", 0);
                result = export(paras);
            }else if ("A7".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 5);
                paras.put("coldev", 2);
                result = export(paras);
            }else if ("A10".equals(paras.get("RPT_ID"))) {
                paras.put("rowdev", 9);
                paras.put("coldev", 0);
                result = export(paras);
            }
            if ("-1".equals(result.get("ErrCode"))) {
                rb.setErrorCode("-1");
                rb.setErrorMessage((String) result.get("ErrMessage"));
            }else {
                if ("ONLINE".equals(paras.get("HEAD.ONLINE"))) {
                    rb.setSuccessMessage((String) result.get("AbsolutePath"));
                }else {
                    rb.setSuccessMessage((String) result.get("filePath"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage("导出失败:"+e.getMessage());
        }
        return rb;
    }
    public Map<String, Object> export(final Map<String, Object> map) throws IOException {
        
        Workbook wb = null;
        FileInputStream fis = null;
        System.out.println(map);
        Map<String, Object> paras = new HashMap<String,Object>();
        paras.putAll(map);
        if ("ORI".equals(map.get("HEAD.ORI"))) {
            if ("A".equals(paras.get("RPT_ID"))) {
                paras.put("tableName", "PM_VAT_TAX_RPT_DTL_ORI");
            }else {
                paras.put("tableName", "PM_VAT_TAX_RPT_"+paras.get("RPT_ID")+"_ORI");
            }
        }else {
            if ("A".equals(paras.get("RPT_ID"))) {
                paras.put("tableName", "PM_VAT_TAX_RPT_DTL");
            }else {
                paras.put("tableName", "PM_VAT_TAX_RPT_"+paras.get("RPT_ID"));
            }
        }

        //查询纳税主体信息
        Map<String, Object> txaEntity = myBatisSessionTemplate.selectOne("com.gingkoo.vat.server.VatTaxRptSql.selectTaxEntty", paras);
        if (txaEntity == null || txaEntity.size() == 0) {
            paras.put("ErrCode","-1");
            paras.put("ErrMessage", "导出报表失败，错误信息：获取纳税主体数据失败！");
            return paras;
        }
        Map<String, String> regType = DtDictService.dtDictMap.get("0000|RPT|5515|"+txaEntity.get("REG_TYPE"));
        Map<String, String> indusType = DtDictService.dtDictMap.get("0000|RPT|5524|"+txaEntity.get("INDUSTRY_TYPE"));
        if(regType == null || regType.get("METANAME") == null){
        	txaEntity.put("REG_TYPE", "");
        }else{
        	txaEntity.put("REG_TYPE", regType.get("METANAME"));
        }
        if(indusType == null || indusType.get("METANAME") == null){
        	txaEntity.put("INDUSTRY_TYPE", "");
        }else{
        	txaEntity.put("INDUSTRY_TYPE", indusType.get("METANAME"));
        }
        paras.putAll(txaEntity);
        try {
            String templatefile = (String) map.get("TEMPLATE_NAME");
            String filePath = SysParamService.getSysParamDir("2999|VAT.TAX.REPORT.TEMPLATE.DIR")+templatefile;
            if(((String) map.get("TEMPLATE_NAME")).toUpperCase().endsWith(".XLS")){
                fis = new FileInputStream(filePath);
                System.out.println("HSSFWorkbook                   "+filePath);
                wb = new HSSFWorkbook(new POIFSFileSystem(fis));// 指定xls文件;
            }else{
                wb = new XSSFWorkbook(filePath);// 指定xls文件;
                System.out.println("XSSFWorkbook                   "+filePath);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        if ("A".equals(map.get("RPT_ID"))) {
            wb = writeDataA(wb, paras);
        }else {
            wb = writeData(wb, paras);
        }
        
        try {
        	String expDir = SysParamService.getSysParamDir("0003|0012");
        	
        	String expFile = map.get("TEMPLATE_NAME").toString();
			if(map.containsKey("HEAD.NEWFILENAME")) {
				expFile = map.get("HEAD.NEWFILENAME").toString();
			}
			
//            String realFileName = UUuidUtils.UUID();
//			String userId = map.get("HEAD.userId").toString();
//           System.out.println(realFileName);
//			String urlParameter = downloadRequestHandler.getUrlParameter(userId, expFile, expDir+File.separator+realFileName);
//			System.out.println(urlParameter);
//			String zippara = downloadRequestHandler.getUrlParameter(userId, expFile, expDir+File.separator);
//          File fileTemp = new File(expDir+File.separator+realFileName);
//          paras.put("expdir", expDir+File.separator);
//          paras.put("fileUUID", realFileName);
//          paras.put("SuccMsg",urlParameter);
			
			String realFileName = UUuidUtils.UUID();
            String fullPath = expDir+File.separator+realFileName;
//            String userId = map.get("HEAD.userId").toString();
//            String urlParameter = downloadRequestHandler.getUrlParameter(userId, expFile, expDir+File.separator+realFileName);
            File fileTemp = new File(fullPath);
//            paras.put("SuccMsg",urlParameter);
            paras.put("filePath", fullPath);
            paras.put("AbsolutePath", fileTemp.getAbsolutePath());
            FileOutputStream out = new FileOutputStream(fileTemp);
            
            wb.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis != null){
                fis.close();
            }
            if (wb != null) {
                wb.close();
            }
        }
        paras.put("ErrCode", "0");
        return paras;
    }

    public Workbook writeData(Workbook wb, final Map<String, Object> map){
        int sheetindex = 0; //默认只有一个Sheet
        Sheet sheet;
        int coldev =  (int) map.get("coldev");
        int rowdev = (int) map.get("rowdev");
        CellStyle style = wb.createCellStyle();
        style.setBorderBottom(CellStyle.BORDER_THIN);
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
        sheet = wb.getSheetAt(sheetindex);
        List<Object> rptDataList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectRpt"+map.get("RPT_ID")+"Data", map);
        
        for (Object object : rptDataList) {
            Map<String, Object> rptdata=  (Map<String, Object>) object;
            int colid = coldev;
            int keyid = 0;
            if ("A2".equals(map.get("RPT_ID"))) {
                //跳过标题栏
                if (rowdev == 20 || rowdev == 33 || rowdev == 46) {
                    rowdev = rowdev + 2;
                }
            }
            if ("A7".equals(map.get("RPT_ID"))) {
                if (rowdev == 6 || rowdev == 34) {
                    rowdev = rowdev + 1;
                }
                if (rowdev == 33) {
                    rowdev++;
                    continue;
                }
            }
            Row row = sheet.getRow(rowdev);
            if (row == null) {
                row = sheet.createRow(rowdev);
            }
            int count = rptdata.size()/2;
            Set<String> dataSet = rptdata.keySet();
            for (String key : dataSet) {
                keyid++;
                if (keyid > count) {
                    break;
                }
                if ("A6".equals(map.get("RPT_ID")) && colid == 1) {
                    Cell cell = row.createCell(colid);
                    cell.setCellStyle(style);
                    if (sheet.getNumMergedRegions() <= rowdev) {
                        sheet.addMergedRegion(new CellRangeAddress(rowdev, rowdev, 0, 1));
                    }
                    colid++;
                }
                if ("A2".equals(map.get("RPT_ID")) ) {
                    if (rowdev >20 && rowdev<32) {
                        keyid = 3;
                    }else if (rowdev == 44) {
                        break;
                    }
                }
                Cell cell = row.getCell(colid);
                if (cell == null) {
                    cell = row.createCell(colid);
                }
                if (!"".equals(rptdata.get("COLUMN_"+keyid)) && rptdata.get("COLUMN_"+keyid) != null) {
                    if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                        if (!"--".equals(cell.getStringCellValue()) &&
                                !"——".equals(cell.getStringCellValue())) {
                            Object obj = rptdata.get("COLUMN_"+keyid);
                            cell.setCellValue(obj.toString());
                            cell.setCellStyle(style);
                        }
                    }else {
                        Object obj = rptdata.get("COLUMN_"+keyid);
                        if (obj instanceof BigDecimal) {
                            cell.setCellValue(((BigDecimal)obj).doubleValue());
                        }else {
                            cell.setCellValue(obj.toString());
                        }
                        cell.setCellStyle(style);
                    }
                    
                }else {
                    cell.setCellValue(0);
                    cell.setCellStyle(style);
                }
                colid++;
            }
            rowdev++;
        }
        return wb;
    }

    public Workbook writeDataA(Workbook wb, final Map<String, Object> map) {
        //填写主表数据
        int sheetindex = 0; //默认只有一个Sheet
        Sheet sheet;
        int coldev =  (int) map.get("coldev");
        int rowdev = (int) map.get("rowdev");
        
        sheet = wb.getSheetAt(sheetindex);
        Row row4 = sheet.getRow(4);
        Row row5 = sheet.getRow(5);
        Row row6 = sheet.getRow(6);
        //输出纳税人识别号
        String taxNo = (String) map.get("TAX_NO");
        char[] array = taxNo.toCharArray();
        for (int i = 0; i < array.length; i++) {
            Cell cell = row4.getCell(i+4);
            if (cell == null) {
                cell = row4.createCell(i+4);
            }
            cell.setCellValue(String.valueOf(array[i]));
        }
        //所属行业
        Cell induCell = row4.getCell(34);
        if (induCell == null) {
            induCell = row4.createCell(34);
        }
        induCell.setCellValue((String)map.get("INDUSTRY_TYPE"));
        //纳税人名称
        Cell taxName = row5.getCell(4);
        if (taxName == null) {
            taxName = row5.createCell(18);
        }
        taxName.setCellValue((String) map.get("ORG_NAME"));
        //法定代表人名称
        Cell legName = row5.getCell(18);
        if (legName == null) {
            legName = row5.createCell(18);
        }
        legName.setCellValue((String)map.get("CORP_NAME"));
        //注册地址
        Cell regAddr = row5.getCell(24);
        if (regAddr == null) {
            regAddr = row5.createCell(24);
        }
        regAddr.setCellValue((String) map.get("ADDR"));
      //生产经营地址
        Cell busiAddr = row5.getCell(38);
        if (busiAddr == null) {
            busiAddr = row5.createCell(38);
        }
        busiAddr.setCellValue((String) map.get("BUSI_ADDR"));
        //开户银行及账号
        Cell bank = row6.getCell(4);
        if (bank == null) {
            bank = row6.createCell(4);
        }
        bank.setCellValue((String)map.get("BANK_NAME")+(String)map.get("ACT_NO"));
        //登记注册类型
        Cell regType = row6.getCell(21);
        if (regType == null) {
            regType = row6.createCell(21);
        }
        regType.setCellValue((String)map.get("REG_TYPE"));
        //电话号码
        Cell tell = row6.getCell(40);
        if (tell == null) {
            tell = row6.createCell(40);
        }
        tell.setCellValue((String)map.get("TEL"));
        
        List<Object> rptDataList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectRpt"+map.get("RPT_ID")+"Data", map);
        for (Object object : rptDataList) {
            Map<String, String> rptdata=  (Map<String, String>) object;
            int colid = coldev;
            int keyid = 0;
            int count = rptdata.size()/2;
            Row row = sheet.getRow(rowdev);
            if (row == null) {
                row = sheet.createRow(rowdev);
            }
            Set<String> dataSet = rptdata.keySet();
            rowdev++;
            for (String key : dataSet) {
                keyid++;
                if (keyid > count) {
                    break;
                }
                if (keyid == 2) {
                    colid = colid + 7;
                }else if (keyid == 3) {
                    colid = colid + 10;
                }else if (keyid == 4) {
                    colid = colid + 4;
                }
                Cell cell = row.getCell(colid);
                if (cell == null) {
                    cell = row.createCell(colid);
                }
                if (!"".equals(rptdata.get("COLUMN_"+keyid)) && rptdata.get("COLUMN_"+keyid) != null) {
                    if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                        if (!"--".equals(cell.getStringCellValue()) &&
                                !"——".equals(cell.getStringCellValue())) {
                            Object obj = rptdata.get("COLUMN_"+keyid);
                            cell.setCellValue(obj.toString());
                        }
                    }else {
                        Object obj = rptdata.get("COLUMN_"+keyid);
                        if (obj instanceof BigDecimal) {
                            cell.setCellValue(((BigDecimal)obj).doubleValue());
                        }else {
                            cell.setCellValue(obj.toString());
                        }
                    }
                    
                }else {
                    cell.setCellValue("0");
                }
            }
        }
        return wb;
    }
    
    /**
     * 申报审核通过改变状态
     * @param header
     * @param map
     * @return
     */
    @SuppressWarnings("unchecked")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback updateVatReportReviseApvForSuccees(final Map<String,String>header,final Map<String,String> map){
        Callback rb = new CallbackImpl();
        try {
            
            Map<String,Object> paras = new HashMap<String, Object>();
            paras.put("ORG_ID", map.get("ORG_ID"));
            paras.put("RPT_ID", map.get("RPT_ID"));
            paras.put("BOUC_MONTH", map.get("BOUC_MONTH"));
            paras.put("RPT_STATUS", "04");
            myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTaxRptSt",paras);
        } catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage("处理失败，错误信息：" + e.getMessage());
            return rb;
        }
        return rb;
    }
    
    /**
     * 申报审核拒绝改变状态
     * @param header
     * @param map
     * @return
     */
    @SuppressWarnings("unchecked")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback updateVatReportReviseApvForFail(final Map<String,String>header,final Map<String,String> map){
        Callback rb = new CallbackImpl();
        try {
            Map<String,Object> paras = new HashMap<String, Object>();
            paras.put("RPT_ID", map.get("RPT_ID"));
            paras.put("BOUC_MONTH", map.get("BOUC_MONTH"));
            paras.put("RPT_STATUS", "03");
            paras.put("DATA_REJ_DESC", map.get("DATA_REJ_DESC"));
            paras.put("ORG_ID", map.get("ORG_ID"));
            myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTaxRptSt",paras);
        } catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage("处理失败，错误信息：" + e.getMessage());
            return rb;
        }
        return rb;
    }
    /**
     * 申报数据维护提交审核改变状态
     * @param header
     * @param map
     * @return
     */
    @SuppressWarnings("unchecked")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback updateReportRevise(final Map<String,String>header,final Map<String,String> map){
        Callback rb = new CallbackImpl();
        try {
            Map<String, String> selCtlMap = new HashMap<String, String>();
            selCtlMap.put("RPT_ID", map.get("RPT_ID"));
            selCtlMap.put("BOUC_MONTH", map.get("BOUC_MONTH"));
            selCtlMap.put("ORG_ID", map.get("HEAD.ORG_ID"));
            selCtlMap.put("RPT_STATUS", map.get("RPT_STATUS"));
            List<Object> rptCtlList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxRptCtl", selCtlMap);
            if (rptCtlList == null || rptCtlList.size() == 0) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("获取报表数据失败！");
                return rb;
            }
            if(rptCtlList.size() > 1){
                rb.setErrorCode("-1");
                rb.setErrorMessage("申报控制表中同期存在多张该报表！");
                return rb;
            }
            Object object = rptCtlList.get(0);
            if(object == null){
                rb.setErrorCode("-1");
                rb.setErrorMessage("获取报表数据失败！");
                return rb;
            }
            Map<String, String> rptCtlMap = (Map<String, String>) object;
            String dependsid = rptCtlMap.get("DEPENDS_ID");
            if (!"".equals(dependsid) && dependsid!=null) {
                Map<String, String> rtlMap  = new HashMap<String,String>();
                rptCtlMap.put("REVIEW", map.get("HEAD.REVIEW"));
                rtlMap = checkDepends(rptCtlMap);
                if ("-1".equals(rtlMap.get("ErrCode"))) {
                    rb.setErrorCode("-1");
                    rb.setErrorMessage("获取报表数据失败！");
                    return rb;
                }else if ("1".equals(rtlMap.get("ErrCode"))) {
                    rb.setErrorCode("-1");
                    rb.setErrorMessage("请先对"+dependsid+"报表进行审核！");
                    return rb;
                }
            }
            Map<String,Object> paras = new HashMap<String, Object>();
            paras.put("RPT_ID", map.get("RPT_ID"));
            paras.put("BOUC_MONTH", map.get("BOUC_MONTH"));
            paras.put("ORG_ID", map.get("ORG_ID"));
            paras.put("RPT_STATUS", "08");
            myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTaxRptSt",paras);
        } catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage("处理失败，错误信息：" + e.getMessage());
            return rb;
        }
        return rb;
    }
    /**
     * 报表管理导出改变状态
     * @param header
     * @param map
     * @return
     */
    @SuppressWarnings("unchecked")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback updateReportManage(final Map<String,String>header,final List<Map<String, String>> list){
        Callback rb = new CallbackImpl();
        try {
            for (Map<String, String> map : list) {
                if (!"06".equals(map.get("RPT_STATUS"))) {
                    Map<String,Object> paras = new HashMap<String, Object>();
                    paras.put("RPT_ID", map.get("RPT_ID"));
                    paras.put("BOUC_MONTH", map.get("BOUC_MONTH"));
                    paras.put("ORG_ID", map.get("ORG_ID"));
                    paras.put("RPT_STATUS", "05");
                    myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTaxRptSt",paras);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage("处理失败，错误信息：" + e.getMessage());
            return rb;
        }
        return rb;
    }
    /**
     * 销项汇总
     */
    @SuppressWarnings("unchecked")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback ovocOutPercentSum (final Map<String , String > header , final  Map <String , String> map ){
        Callback rb = new CallbackImpl();
        try {
            /* 获取纳税主体信息 */
            Map<String,String> getTaxInfoByOrgIdParams = new HashMap<String,String>();
            getTaxInfoByOrgIdParams.put("ORG_ID", map.get("HEAD.ORG_ID"));
            List<Object> selectList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxEnttyCycle",getTaxInfoByOrgIdParams);
            if (selectList == null || selectList.size() == 0) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("导出失败，错误信息：查询导出模板失败");
            }
            if (selectList.size()>1) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("导出失败，错误信息：查询导出模板失败");
            }
            Object cycObj = selectList.get(0);
            Map<String, String> cycMap = (Map<String, String>) cycObj;
            if ("".equals(cycMap.get("REPORT_CYCLE")) || cycMap.get("REPORT_CYCLE") == null) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("导出失败，错误信息：申报周期为空！");
                return rb;
            }
            /* 获取报告期 */
            Map<String, String> rltMap = ReportUtils.getInpuDateMap(map.get("HEAD.ORG_ID"),map.get("BOUC_MONTH"),cycMap.get("REPORT_CYCLE"),map.get("HEAD.CORP_ID"));
            rb.setCallbackData(rltMap);
            /* 视同销售统计 */
            Map<String, String> condiMap = new HashMap<String,String>();
            condiMap.put("ORG_ID", map.get("HEAD.ORG_ID"));
            condiMap.put("BOUC_MONTH", rltMap.get("endDate").substring(0,6));
            condiMap.put("BEG_DATE", rltMap.get("beginDate"));
            condiMap.put("END_DATE", rltMap.get("endDate"));
            List<Object> likeSaleList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectLikeSale",condiMap);
            if (likeSaleList.size()>1) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("导出失败，错误信息：查询视同销售信息失败");
            }
            Object likeSaleObj = likeSaleList.get(0);
            Map<String, Object> likeSale = new HashMap<String,Object>();
            if(likeSaleObj!=null){
            	likeSale=(Map<String, Object>) likeSaleObj;
            }
            if (likeSaleObj == null) {
                likeSale.put("AMOUNT", BigDecimal.ZERO);
                likeSale.put("INS_AMT", BigDecimal.ZERO);
                likeSale.put("TAX_AMT", BigDecimal.ZERO);
            }
            if ("".equals(likeSale.get("AMOUNT")) || likeSale.get("AMOUNT") == null) {
                likeSale.put("AMOUNT", BigDecimal.ZERO);
            }
            if ("".equals(likeSale.get("INS_AMT")) || likeSale.get("INS_AMT") == null) {
                likeSale.put("INS_AMT", BigDecimal.ZERO);
            }
            if ("".equals(likeSale.get("TAX_AMT")) || likeSale.get("TAX_AMT") == null) {
                likeSale.put("TAX_AMT", BigDecimal.ZERO);
            }
            /* 销项税统计 0-一般计税 1-简易计税 2-退税 3-免税 4-零税率 5-不征税 */
            Map<String, Object> oTxAm = new HashMap<String,Object>(); 
            Map<String, String> paras = new HashMap<String,String>();
            for (int i = 0; i < 6; i++) {
                paras.put("CACL_TAX_TYPE", String.valueOf(i));
                paras.put("ORG_ID", map.get("HEAD.ORG_ID"));
                paras.put("BOUC_MONTH", rltMap.get("endDate").substring(0,6));
                paras.put("BEG_DATE", rltMap.get("beginDate"));
                paras.put("END_DATE", rltMap.get("endDate"));
                List<Object> oSimAmtList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxIAmount",paras);
                if (oSimAmtList == null || oSimAmtList.size() ==0) {
                    oTxAm.put("AMOUNT"+i, BigDecimal.ZERO);
                    continue;
                }
                Object object = oSimAmtList.get(0);
                if (object ==null) {
                    oTxAm.put("AMOUNT"+i, BigDecimal.ZERO);
                    continue;
                }
                Map<String, Object> tmpMap = (Map<String, Object>) object;
                if ("".equals(tmpMap.get("AMOUNT")) || tmpMap.get("AMOUNT") == null) {
                    tmpMap.put("AMOUNT", BigDecimal.ZERO);
                }
                oTxAm.put("AMOUNT"+i, tmpMap.get("AMOUNT"));
            }
            BigDecimal totalOAmt = BigDecimal.ZERO;  //销项总额
            for (String key : oTxAm.keySet()) {
                    totalOAmt = totalOAmt.add((BigDecimal) oTxAm.get(key));
            }
            /* 计算销项免税比例 */
            BigDecimal outPercent = BigDecimal.ZERO;
            if (totalOAmt.compareTo(BigDecimal.ZERO)  == 1) {
                    outPercent = ((BigDecimal)oTxAm.get("AMOUNT3")).add(((BigDecimal)oTxAm.get("AMOUNT1"))).divide(totalOAmt, new MathContext(22, RoundingMode.HALF_UP)).setScale(4,BigDecimal.ROUND_HALF_UP);
            }
            /* 进项统计  进项总税额 进项转出额 */
            
            Map<String, String> iTaxMap = new HashMap<String, String>();
            Map<String, Object> iTaxAtm = new HashMap<String,Object>();
            iTaxMap.put("BOUC_MONTH", rltMap.get("endDate").substring(0,6));
            iTaxMap.put("ORG_ID", map.get("HEAD.ORG_ID"));
            iTaxMap.put("BEG_DATE", rltMap.get("beginDate"));
            iTaxMap.put("END_DATE", rltMap.get("endDate"));
            List<Object> iTaxAmtList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectITaxAmt",iTaxMap);
            if (iTaxAmtList == null || iTaxAmtList.size() == 0) {
                iTaxAtm.put("AMOUNT", BigDecimal.ZERO);
                iTaxAtm.put("TAX_AMT", BigDecimal.ZERO);
            }else {
                Object iTaxObj = iTaxAmtList.get(0);
                if (iTaxObj == null) {
                    iTaxAtm.put("AMOUNT", BigDecimal.ZERO);
                    iTaxAtm.put("TAX_AMT", BigDecimal.ZERO);
                }else {
                    iTaxAtm = (Map<String, Object>) iTaxObj;
                    if ("".equals(iTaxAtm.get("AMOUNT")) || 
                            iTaxAtm.get("AMOUNT") == null) {
                        iTaxAtm.put("AMOUNT", BigDecimal.ZERO);
                    }
                    if ("".equals(iTaxAtm.get("TAX_AMT")) || 
                            iTaxAtm.get("TAX_AMT") == null) {
                        iTaxAtm.put("TAX_AMT", BigDecimal.ZERO);
                    }
                }
            }
            
            //进项转出额
            List<Object> iTaxOutList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectIOutAmt",iTaxMap);
            Map<String, Object> iTaxOut = new HashMap<String,Object>();
            if (iTaxOutList == null || iTaxOutList.size() == 0) {
                iTaxOut.put("OUT_AMT", BigDecimal.ZERO);
            }else {
                Object iTaxOutObj = iTaxOutList.get(0);
                if (iTaxOutObj == null) {
                    iTaxOut.put("OUT_AMT", BigDecimal.ZERO);
                }else {
                    iTaxOut = (Map<String, Object>) iTaxOutObj;
                    if ("".equals(iTaxOut.get("OUT_AMT")) || iTaxOut.get("OUT_AMT") == null) {
                        iTaxOut.put("OUT_AMT", BigDecimal.ZERO);
                    }
                }
            }
            BigDecimal inPercent = BigDecimal.ZERO;
            /* 计算进项转出比例 */
                if (((BigDecimal)iTaxAtm.get("TAX_AMT")).compareTo(BigDecimal.ZERO) == 1) {
                    BigDecimal divisor = ((BigDecimal)iTaxAtm.get("TAX_AMT"));
                    inPercent = ((BigDecimal)iTaxOut.get("OUT_AMT")).divide(divisor, new MathContext(22, RoundingMode.HALF_UP)).setScale(4,BigDecimal.ROUND_HALF_UP);
            }
             
            /* 更新汇总表 */
            Map<String, Object> transOutSum = new HashMap<String, Object>();
            BigDecimal likesaleAmt = BigDecimal.ZERO;
            BigDecimal oTxAmt = BigDecimal.ZERO;
            likesaleAmt = ((BigDecimal) likeSale.get("AMOUNT"));
            oTxAmt = ((BigDecimal) oTxAm.get("AMOUNT0"));
            
            transOutSum.put("O_AMT", likesaleAmt.add(totalOAmt));
            transOutSum.put("O_SIM_AMT", oTxAm.get("AMOUNT1"));
            transOutSum.put("O_GEN_AMT", oTxAmt.add(likesaleAmt));
            transOutSum.put("O_ZTR_AMT", oTxAm.get("AMOUNT4"));
            transOutSum.put("O_ZRI_AMT", oTxAm.get("AMOUNT5"));
            transOutSum.put("O_DSP_AMT", oTxAm.get("AMOUNT3"));
            transOutSum.put("O_DIS_AMT", oTxAm.get("AMOUNT2"));
            transOutSum.put("O_DSP_PERCENT", outPercent);
            transOutSum.put("I_AMT", iTaxAtm.get("AMOUNT"));
            transOutSum.put("I_TAX_AMT", iTaxAtm.get("TAX_AMT"));
            transOutSum.put("I_OUT_TAX_AMT", iTaxOut.get("OUT_AMT"));
            transOutSum.put("I_OUT_PERCENT", inPercent);
            seqHelper.setMyBatisSessionTemplate(myBatisSessionTemplate);
            transOutSum.put("DATA_ID", seqHelper.getDataId("DATA_ID_SEQ"));
            SimpleDateFormat dataDate = new SimpleDateFormat("yyyyMMdd");
            String date = dataDate.format(new Date());
            transOutSum.put("DATA_DATE", date);//日期
            transOutSum.put("CORP_ID", map.get("HEAD.CORP_ID"));
            transOutSum.put("ORG_ID", map.get("HEAD.ORG_ID"));
            transOutSum.put("GROUP_ID", "");
            transOutSum.put("INQ_ORG_ID", map.get("INQ_ORG_ID"));
            transOutSum.put("INQ_GROUP_ID", map.get("HEAD.INQ_GROUP_ID"));
            transOutSum.put("BOUC_MONTH", rltMap.get("endDate").substring(0,6));
            transOutSum.put("I_MON_OUT_PERCENT", outPercent);
            System.out.println(outPercent);
            transOutSum.put("OUT_TYPE", "");
            transOutSum.put("STATUS", "0");
            transOutSum.put("CHECK_FLAG", "Y");
            transOutSum.put("CHECK_DESC", "");
            transOutSum.put("CHECK_ERR_TYPE", "");
            transOutSum.put("NEXT_ACTION", "00");
            transOutSum.put("DATA_STATUS", "13");
            transOutSum.put("DATA_FLAG", "0");
            transOutSum.put("DATA_SOURCE", "2");
            transOutSum.put("DATA_VERSION", "0");
            transOutSum.put("DATA_CRT_USER", "SYS");
            SimpleDateFormat crtDate = new SimpleDateFormat("yyyyMMdd");
            String dataCrtDate = crtDate.format(new Date());
            transOutSum.put("DATA_CRT_DATE", dataCrtDate);
            SimpleDateFormat dataCrt = new SimpleDateFormat("yyyyMMddHHmmss");
            String crtTime = dataCrt.format(new Date());
            transOutSum.put("DATA_CRT_TIME", crtTime);
            
            List<Object> transOutList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTransOutSum",transOutSum);
            if (transOutList==null || transOutList.size()==0) {
                myBatisSessionTemplate.insert("com.gingkoo.vat.server.VatTaxRptSql.insertIntoTransOutSum", transOutSum);
            }else {
                myBatisSessionTemplate.update("com.gingkoo.vat.server.VatTaxRptSql.updateTransOutSum", transOutSum);
            }
        }catch (Exception e) {
            e.printStackTrace();
            rb.setErrorCode("-1");
            rb.setErrorMessage("操作失败，错误信息：" + e.getMessage());
        } 
        return rb;
    }
    
    public Callback getBoucmthInit(final Map<String, String> header, final Map<String, String> map) {
        Callback rb = new CallbackImpl();
        try {
          //查询纳税主体的申报周期
            Map<String, String> paras = new HashMap<String, String>();
            paras.put("ORG_ID", map.get("HEAD.ORG_ID"));
            List<Object> taxCycle = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatTaxRptSql.selectTaxEnttyCycle", paras);
            if (taxCycle == null || taxCycle.size() == 0) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("获取申报周期失败！");
                return rb;
            }
            if(taxCycle.size() > 1){
                rb.setErrorCode("-1");
                rb.setErrorMessage("获取申报周期失败！");
                return rb;
            }
            Object cycleObj = taxCycle.get(0);
            Map<String, String> cycleMap = (Map<String, String>) cycleObj;
            if ("".equals(cycleMap.get("REPORT_CYCLE")) || cycleMap.get("REPORT_CYCLE") == null) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("申报周期为空！");
                return rb;
            }
            
            SimpleDateFormat dataDate = new SimpleDateFormat("yyyyMM");
            String nowDate = dataDate.format(new Date());
            Map<String, String> bouch = new HashMap<String,String>();
            bouch = ReportUtils.getInpuDateMap(map.get("HEAD.ORG_ID"),nowDate,cycleMap.get("REPORT_CYCLE"),map.get("HEAD.CORP_ID"));
            if (map.get("BOUC_MONTH").compareTo(bouch.get("endDate").substring(0,6)) > 0) {
                rb.setErrorCode("-1");
                rb.setErrorMessage("月份不能超过当期！");
                return rb;
            }
            Map<String, String> inBouc = new HashMap<String,String>();
            inBouc = ReportUtils.getInpuDateMap(map.get("HEAD.ORG_ID"),map.get("BOUC_MONTH"),cycleMap.get("REPORT_CYCLE"),map.get("HEAD.CORP_ID"));
            rb.setCallbackData(inBouc);
        } catch (Exception e) {
            rb.setErrorCode("-1");
            rb.setErrorMessage(", 错误信息：" + e.getMessage());
            return rb;
        }
        return rb;
        
    }

}