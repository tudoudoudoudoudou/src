package com.gingkoo.vat.server;

import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gui.service.server.datamodule.pool.DataModuleMeta;
import com.gingkoo.gui.service.server.datamodule.pool.DataModulePool;
import com.gingkoo.rpt.main.server.RptCommonService;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

@Component(value = "tempFileExportService")
public class TempFileExportService extends RptCommonService {
    public Logger logger = LoggerFactory.getLogger(TempFileExportService.class);
    private static int EXCEL_MAX_ROWS = 1000000;

    @Autowired
    private MyBatisSessionTemplate myBatisSessionTemplate;


    /**
     * exportDatasetBatch ：以模板文件格式导出数据
     * @param header header 头部信息
     * @param dataMap dataMap 数据集合
     * @param vocListTemp 导出数据模板地址
     * @param sql 导出数据查询参数
     * @return Workbook
     * @throws IOException
     */
    public Workbook exportDatasetBatch(Map<String, String> header, Map<String, String> dataMap, String vocListTemp,String sql) throws IOException {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(vocListTemp);
            Sheet sheet = workbook.getSheetAt(0);

            Map<String, String> getRecordMap = new HashMap<>();
            getRecordMap.put("DATA_ID",dataMap.get("RSV2"));

            int lastRowNum = sheet.getLastRowNum();
            Integer rowCollNum = 0;
            Integer startRow = 0;
            List<String> fieldNames = null;
            Map<Integer, Map<String,String>> dataDictionary = null;
            List<Map<String, String>> record = null;
            
            for (int i = 1; i <= lastRowNum; i++) {
                Row row = sheet.getRow(i);
                if(row == null) continue;//判断拿到的是不是空行
                if(row.getCell(0) == null) continue;
                
                if ("#BODY".equals(row.getCell(0).toString())) {
                    Row paramRow = sheet.getRow(i+1);
                    rowCollNum = getRowCollNum(paramRow);
                    fieldNames = getFieldName(paramRow, rowCollNum);
                    dataDictionary = getDataDictionary(sheet.getRow(i + 2), rowCollNum);
                    HashMap<String, String> map = new HashMap<>();
                    map.put("sql", sql);
                    record = getRecord(map);
                    startRow = i;
                    break;
                }
            }

            //创建字体
            Font font = workbook.createFont();
            font.setFontHeightInPoints((short) 10);
            font.setFontName("宋体");
            //创建单元格格式
            CellStyle style = workbook.createCellStyle();
            style.setFont(font);
            //检测需要夺少sheet页
            int size = record.size();
            Integer sheetNum = size / (EXCEL_MAX_ROWS - 1) + (size % (EXCEL_MAX_ROWS - 1) > 0 ? 1 : 0);

            //遍历每个sheet页
            for (int sheet_i = 1; sheet_i <= sheetNum; sheet_i++) {
                //设置sheet页模板
                if (sheet_i == 1) {
                    sheet = workbook.getSheetAt(0);
                    if(sheet.getRow(startRow)!=null)
                    	sheet.removeRow(sheet.getRow(startRow));
                    if(sheet.getRow(startRow + 1)!=null)
                    	sheet.removeRow(sheet.getRow(startRow + 1));
                    if(sheet.getRow(startRow + 2)!=null)
                    sheet.removeRow(sheet.getRow(startRow + 2));
                } else {
                    sheet = workbook.createSheet(workbook.getSheetName(0) + String.valueOf(sheet_i));
                    if (header.containsKey("HEAD.PROTECT") && (header.get("HEAD.PROTECT")).equals("1")) {
                        sheet.protectSheet("gingkoogui");
                    }
                    startRow = 0;
                }

                //页面容量
                int iCurrentCount;
                if (sheet_i == sheetNum) {
                    iCurrentCount = size % (EXCEL_MAX_ROWS - 1);
                } else {
                    iCurrentCount = (EXCEL_MAX_ROWS - 1);
                }

                //可以存放多少数据
                for (int i = 0; i < iCurrentCount; i++) {
                    //获取遍历记录
                    Map item = record.get((EXCEL_MAX_ROWS - 1) * (sheet_i - 1) + i);
                    //获取行
                    Row row = sheet.createRow(i + startRow);

                    for (int j = 0; j < rowCollNum; j++) {
                        Cell cell = row.createCell(j);
                        String valueAmt;

                        try {
                            if (item.containsKey(fieldNames.get(j))) {
                                if (item.get(fieldNames.get(j)) != null) {
                                    Object oValue = item.get(fieldNames.get(j));

                                    if (dataDictionary.get(j)!=null) {
                                        oValue = dataDictionary.get(j).get(oValue)==null?oValue:dataDictionary.get(j).get(oValue);
                                    }

                                    if (oValue instanceof Double) {
                                        cell.setCellValue((Double) oValue);
                                    } else if (oValue instanceof BigDecimal) {
                                        cell.setCellValue(((BigDecimal) oValue).doubleValue());
                                    } else {
                                        valueAmt = oValue.toString();
                                        //数字类型
                                        if (fieldNames.get(j).toUpperCase().endsWith("_AMT") && valueAmt.indexOf(",") == -1) {
                                            try {
                                                Double.valueOf(valueAmt);
                                                if (valueAmt.indexOf(".") == -1) {
                                                    valueAmt = valueAmt + ".00";
                                                } else if (valueAmt.indexOf(".") == valueAmt.length() - 2) {
                                                    valueAmt = valueAmt + "0";
                                                }
                                            } catch (Exception var36) {
                                            }
                                        }
                                        cell.setCellValue(valueAmt);
                                    }
                                } else {
                                    cell.setCellValue("");
                                }
                            } else {
                                cell.setCellValue("");
                            }
                        } catch (Exception var37) {
                            cell.setCellValue("");
                            this.logger.error(item.toString() + "第" + j + "列数据解析错误", var37);
                        }
                    }

                }
            }
            return workbook;
        } catch (Exception var38){
        	var38.printStackTrace();
            IOException ioException = new IOException();
            throw  ioException;
        }
    }


    /**
     * getDataDictionary 获取数据字典信息
     * @param row 存放数据字典码行
     * @param rowCollNum 存放数据单元格数
     * @return List<Map<String,String>>
     */
    public Map<Integer, Map<String,String>> getDataDictionary(Row row,Integer rowCollNum){
    	
        DataModulePool pool = DataModulePool.getInstance();
        Map<Integer, Map<String,String>> deiLists =new  HashMap<Integer, Map<String,String>>();
        if (row == null) return deiLists;
        
        for (int i = 0; i < rowCollNum; i++) {
        	if(row.getCell(i)==null) continue;
            String dei =  String.valueOf(row.getCell(i)).replace("[", "").replace("]", "");
            Map<String, String> map = new HashMap<>();

            if(StringUtils.isNotBlank(dei)){
                List<DataModuleMeta> dataModule = pool.findDataModule(dei, (String) null, "0000");
                if(dataModule != null) {
                    Iterator<DataModuleMeta> iterator = dataModule.iterator();
                    while (iterator.hasNext()) {
                        DataModuleMeta next = iterator.next();
                        map.put(next.getValue(),next.getName());
                    }
                }
            }
            deiLists.put(i,map);
        }
        return deiLists;
    }

    /**
     * getRowCollNum 获取一行存放数据的单元格数
     * @param row 模板数据行
     * @return Integer
     */
    public Integer getRowCollNum(Row row){
        Integer count = 0;
        String value;
        for (value =row.getCell(count).toString(); StringUtils.isNotBlank(value); value =row.getCell(count).toString()){
            ++count;
            if(row.getCell(count) == null){
                break;
            }
        }
        return count;
    }

    /**
     * getFieldName 获取模板中存放的字段名称
     * @param row 模板字段行
     * @param rowCollNum 一行中单元格数
     * @return List<String>
     */
    public List<String> getFieldName(Row row,Integer rowCollNum){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < rowCollNum; i++) {
            list.add(i,String.valueOf(row.getCell(i)));}
        return list;
    }

    /**
     * getRecord 获取导出数据记录
     * @param sqlMap 获取导出数据记录
     * @return List<Map<String,String>>
     */
    public List<Map<String,String>> getRecord(Map<String,String> sqlMap){
        return myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VocEmailFileAttachmentSql.select_getRecords_hashMap",sqlMap);
    }

}
