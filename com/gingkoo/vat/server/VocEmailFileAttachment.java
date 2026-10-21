package com.gingkoo.vat.server;

import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.rpt.main.server.RptCommonService;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class VocEmailFileAttachment extends RptCommonService {
    public Logger logger = LoggerFactory.getLogger(VocEmailFileAttachment.class);
    private static int EXCEL_MAX_ROWS = 1000000;
    private static final String property = File.separator;

    @Value("${application.home}")
    private String appHome;

    @Autowired
    private MyBatisSessionTemplate myBatisSessionTemplate;
    @Autowired
    private ZipFileCompreService zipFileCompreService;
    @Autowired
    private TempFileExportService tempFileExportService;


    /** getAnnexInfo 获取邮件附件参数信息
     *  @param emailType 邮件类型
     *  @return List<Map<String, String>> annexList
     */
    public List<Map<String, String>> getAnnexInfo(String emailType, String orgId){
    	Map<String, String> paramMap = new HashMap<String, String>();
    	paramMap.put("ORG_ID", orgId);		
        List<Map<String,String>> annex = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VocEmailFileAttachmentSql.select_getAnnexList", paramMap);
        
        List<Map<String, String>> annexList = transformParameterValue(annex);
        List<Map<String, String>> list = new ArrayList<>();
        
        Iterator<Map<String, String>> iterator = annexList.iterator();
        while(iterator.hasNext()){
            Map<String, String> next = iterator.next();
            String[] app_scopes = next.get("APP_SCOPE").split(",");
            if("Y".equals(next.get("ENABLE")) && app_scopes.length > 0){
                for (int i = 0; i < app_scopes.length; i++) {
                    if(app_scopes[i].equals(emailType))
                        list.add(next);
                }
            }
        }
        return list;
    }

    /**
     * annexArrange 邮件附件查询遍历
     * @param header 头部信息
     * @param dataMap 数据集合
     * @return void
     */
    public void annexArrange(Map<String, String> header, Map<String, String> dataMap,List<Map<String, String>> annexList) throws IOException {
        Iterator<Map<String, String>> iterator = annexList.iterator();
        while(iterator.hasNext()){
            Map<String, String> next = iterator.next();
            if("Y".equals(next.get("ENABLE"))){
                if("SQL".equals(next.get("ACCESS"))){
                    annexAccessSQL(next,header,dataMap);
                }else if("TEMP".equals(next.get("ACCESS"))){
                    annexAccessTEMP(next,header,dataMap);
                }else if("FILE".equals(next.get("ACCESS"))){
                    annexAccessFILE(next,header,dataMap);
                }
            }
        }

    }

    /**
     * annexAccessSQL 通过参数SQL来获取附件
     * @param annexMap 附件map
     * @param header 头部信息
     * @param dataMap 数据集合
     */
    public void annexAccessSQL(Map<String, String> annexMap,Map<String, String> header, Map<String, String> dataMap) throws IOException {
        String tSQL = annexMap.get("SQL");
        String sql = tSQL.replace("${DATA_ID}", "'" + dataMap.get("RSV2") + "'").replace("${VOC_NO}", "'" + dataMap.get("VOC_NO") + "'");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("sql", sql);
        String annexPath = myBatisSessionTemplate.selectOne("com.gingkoo.vat.server.VocEmailFileAttachmentSql.select_getRecords_path",map);
        dataMap.put("ANNEX_PATH", annexPath);

        if(StringUtils.isNotBlank(annexPath)){
            File realpathDest = new File(annexPath);
            if(realpathDest.exists()){
                String exportPath = getExportPath(dataMap.get("RSV2"));
                exportPath = exportPath + property + realpathDest.getName();
                File pathDest = new File(exportPath);
                Files.copy(realpathDest.toPath(), pathDest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }


    /**
     * annexAccessTEMP 通过模板文件来生成附件
     * @param annexMap 附件map
     * @param header 头部信息
     * @param dataMap 数据集合
     * @return Map<String,String>
     */
    public Map<String,String> annexAccessTEMP(Map<String, String> annexMap,Map<String, String> header, Map<String, String> dataMap) throws IOException {
    	dataMap.put("APP_HOME", appHome);
    	
        HashMap<String, String> returnMap = new HashMap<>();
        String temp_path = replacePlaceholders(annexMap.get("TEMP_PATH"), dataMap);
        String export_path = replacePlaceholders(annexMap.get("EXPORT_PATH"), dataMap);
        String tSQL = replacePlaceholders(annexMap.get("SQL"), dataMap);//annexMap.get("SQL").replace("${DATA_ID}", dataMap.get("RSV2"));
        
        temp_path = temp_path.replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);
        export_path = export_path.replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);
        
        dataMap.put("ANNEX_PATH", export_path);

        this.logger.info("temp_path------{}", temp_path);
        Workbook workbook = tempFileExportService.exportDatasetBatch(header, dataMap, temp_path, tSQL);
        FileOutputStream fileOutputStream = new FileOutputStream(export_path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        return returnMap;
    }
    
    private static final Pattern PLACEHOLDER_PATTERN = Pattern.compile("\\$\\{([^}]*)\\}");
    /**
     * replace variables
     * @param srcString
     * @param values
     * @return
     */
    private String replacePlaceholders(String srcString, Map<String,?> values) {
    	 Matcher matcher = PLACEHOLDER_PATTERN.matcher(srcString);
         StringBuffer result = new StringBuffer();
         while (matcher.find()) {
             String placeholder = matcher.group(1); // 获取占位符名称
             String replacement = Objects.toString(values.get(placeholder),"");//values.getOrDefault(placeholder, "").toString();
             matcher.appendReplacement(result, replacement);
         }
         matcher.appendTail(result);
         return result.toString();		
	}

    /**
     * annexAccessTEMP 将某个文件当作附件进行发送
     * @param annexMap 附件map
     * @param header 头部信息
     * @param dataMap 数据集合
     * @return Map<String,String>
     */
    public Map<String,String> annexAccessFILE(Map<String, String> annexMap,Map<String, String> header, Map<String, String> dataMap) throws IOException {
        HashMap<String, String> returnMap = new HashMap<>();
        String file_path = annexMap.get("FILE_PATH").replace("${APP_HOME}", appHome).replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);
        dataMap.put("ANNEX_PATH", file_path);

        if(StringUtils.isNotBlank(file_path)){
            File realpathDest = new File(file_path);
            if(realpathDest.exists()){
                String exportPath = getExportPath(dataMap.get("RSV2"));
                exportPath = exportPath + property + realpathDest.getName();
                File pathDest = new File(exportPath);
                Files.copy(realpathDest.toPath(), pathDest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        return returnMap;
    }

    /**
     * AttachmentCompressionZIP 打包附件为ZIP文件
     * @param dataMap 数据集合
     * @return String zip包存放地址
     */
    public String AttachmentCompressionZIP(Map<String,String> dataMap) throws IOException {
        //zip包存放地址
        String zipPath = getZipPath(dataMap.get("RSV2"), dataMap.get("VOC_NO"));
        //压缩文件路径
        String exportPath = SysParamService.getSysParamDir("2105|export.path").replace("${DATA_ID}", dataMap.get("RSV2")).replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);

        zipFileCompreService.zipFileCompre(zipPath,exportPath);
        return zipPath;
    }

    /**
     * getZipPath 获取ZIP文件导出地址
     * @param dataId 发票数据ID
     * @param vocNo 发票号码
     * @return String ZIP文件导出地址
     */
    public String getZipPath(String dataId,String vocNo){
        return SysParamService.getSysParamDir("2105|export.zip").replace("${DATA_ID}", dataId).replace("${VOC_NO}", vocNo)
                .replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);
    }

    /**
     * getExportPath 获取附件文件导出地址
     * @param dataId 发票数据ID
     * @return String 附件文件导出地址
     */
    public String getExportPath(String dataId){
        return SysParamService.getSysParamDir("2105|export.path").replace("${DATA_ID}", dataId).replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);
    }

    /**
     * createExportPath 创建附件导出地址
     * @param dataId 发票数据ID
     */
    public void createExportPath(String dataId) throws IOException {
        String exportPath = SysParamService.getSysParamDir("2105|export.path").replace("${DATA_ID}", dataId).replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);
        File file = new File(exportPath);
        if (!file.exists()){
            file.mkdirs();
        }
        String zipPath = file.getParent()+File.separator+"emailzip";
        File zipFile = new File(zipPath);
        if(!zipFile.exists()){
        	zipFile.mkdirs();
        }
        logger.info("create invoice export folder {} , zip folder {}",exportPath,zipFile.getAbsolutePath());
    }

    /**
     * transformParameterValue 解析系统配置中携带的参数信息
     * @param paramList 未解析的系统配置参数
     * @return List<Map<String,String>> 参数信息
     */
    public List<Map<String,String>> transformParameterValue(List<Map<String,String>> paramList){
        List<Map<String,String>> annexList = new ArrayList<>();

        Iterator<Map<String, String>> iterator = paramList.iterator();
        while(iterator.hasNext()){
            Map<String, String> next = iterator.next();
            String paramVal = next.get("PARAM_VAL");
            HashMap<String, String> map = new HashMap<>();
            map.put("PARAMGROUP_ID",next.get("PARAMGROUP_ID"));
            map.put("PARAM_ID",next.get("PARAM_ID"));
            map.put("PARAM_NAME",next.get("PARAM_NAME"));
            String[] split = paramVal.split("\\|-\\|");
            for (int i = 0; i < split.length; i++) {
                String[] strings = split[i].split(":");
                map.put(strings[0],startsWithAndEndsWithBrackets(strings[1]) ? strings[1].substring(1,strings[1].length()-1) : strings[1]);
            }
            if(map.containsKey("SQL_ID")) map.put("SQL",getSQLBySqlId(map));
            annexList.add(map);
        }
        return annexList;
    }

    /**
     * startsWithAndEndsWithBrackets 判断参数是否以[开头,]结尾
     * @param str 参数
     * @return boolean 结果
     */
    public boolean startsWithAndEndsWithBrackets(String str){
        return str != null && str.startsWith("[") && str.endsWith("]");
    }

    /**
     * getSQLBySqlId 获取系统参数中配置的SQL_ID对应的tb_sql_cfg中的SQL
     * @param map 参数
     * @return String SQL
     */
    public String getSQLBySqlId(Map<String,String> map){
        Map<String,String> sqlMap = myBatisSessionTemplate.selectOne("com.gingkoo.vat.server.VocEmailFileAttachmentSql.select_getSQLBySqlId", map);
        return sqlMap.get("SQL_STRING");
    }

}
