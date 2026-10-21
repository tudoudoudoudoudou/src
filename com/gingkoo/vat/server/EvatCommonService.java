package com.gingkoo.vat.server;

import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.api.service.CommonQueryService;
import com.gingkoo.gal.core.serivce.callback.CallbackImpl;
import com.gingkoo.gal.facility.datetime.DateHelper;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gal.util.uuid.UUuidUtils;
import com.gingkoo.gui.core.client.utils.StringUtils;
import com.gingkoo.gui.service.server.exception.BizException;
import com.gingkoo.rpt.common.server.*;
import com.gingkoo.rpt.dbsvr.server.bean.*;
import com.gingkoo.rpt.dbsvr.server.dao.PmVatOVocDtlMapper;
import com.gingkoo.rpt.dbsvr.server.dao.PmVatOVocMapper;
import com.gingkoo.rpt.dbsvr.server.dao.TbNextActionMapper;
import com.gingkoo.rpt.servlet.DownloadRequestHandler;
import com.gingkoo.vat.pdf.ComPress;
import freemarker.template.TemplateException;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description 数电改造
 */
@Component
public class EvatCommonService {

	private static Logger logger = LoggerFactory.getLogger(EvatCommonService.class);

	@Autowired
	public static CommonQueryService commonQueryService;

	@Autowired
	private static CommonInsertService commonInsertService;

	@Autowired
	private static CommonUpdateService commonUpdateService;

	@Autowired
	private DownloadRequestHandler downloadRequestHandler;

	@Autowired
	private MyBatisSessionTemplate myBatisSessionTemplate;

	@Autowired
	PmVatOVocMapper pmVatOVocMapper;

	@Transactional(rollbackFor = { Exception.class }, propagation = Propagation.REQUIRED)
	public String onVoucherDigital4Upload(String absolutePath, Map<String, String> params) {
		StringBuffer returnString = new StringBuffer();
		if (!new File(absolutePath).exists()) {
			logger.info("Excel文件不存在，文件路径{}", absolutePath);
			return "Excel文件不存在，文件路径{}";
		}
		try {
			List<List<Map<String, String>>> vocMapList = getData(absolutePath);
			String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
			if (vocMapList.get(0).size() == 0) {
				logger.info("没有从excel中读取到数据");
				return "没有从excel中读取到数据";
			}

			for (Map<String, String> mapSheet1 : vocMapList.get(0)) {
				mapSheet1.put("UPLOAD_ID", UUuidUtils.UUID());
				mapSheet1.put("DATA_DATE", date);
				mapSheet1.put("FILE_NAME", absolutePath);
				mapSheet1.put("OP_USER", params.get("username"));
				PmVatOVocMapper pmVatOVocMapper = myBatisSessionTemplate.getMapper(PmVatOVocMapper.class);
				PmVatOVocExample vocExample = new PmVatOVocExample();
				if (vocMapList.size() == 1) { // 只有一个Sheet页面
					/**
					 * add by wyq 20240423 数电发票开具页面单sheet页导入逻辑调整，导入时开票失败的直接跳过
					 */
					if ("失败".equals(mapSheet1.get("KJJG"))) {
						continue;
					} else {
						mapSheet1.put("KPRQ", date);// 一个Sheet模板没有开票日期取上传文件的日期
						vocExample.or().andDataIdEqualTo(mapSheet1.get("FPLSH"))// 用发票流水号关联Voc表的DataId精准匹配
								.andVocStatIn(Arrays.asList("0", "1")).andNextActionEqualTo("02")
								.andVocChannelEqualTo("02");
					}
				} else {
					mapSheet1.put("KPRQ", mapSheet1.get("KPRQ").replace("/", "").replace("-", "").substring(0, 8));
					vocExample.or().andSaleTaxNoEqualTo(mapSheet1.get("XFSBH"))
							.andBuyTaxNoEqualTo(mapSheet1.get("GFSBH"))
							.andSumAmtEqualTo(new BigDecimal(mapSheet1.get("JE")))
							.andTaxAmtEqualTo(new BigDecimal(mapSheet1.get("SE"))).andVocStatIn(Arrays.asList("0", "1"))
							.andNextActionEqualTo("02").andVocChannelEqualTo("02");
				}

				List<PmVatOVoc> vocList = pmVatOVocMapper.selectByExample(vocExample);
				// dtlList数据库中的明细与sheet2中的明细匹配，如果不匹配continue
				String matchFlag = "N";
				if (vocList.size() == 1) {
					PmVatOVoc pmVatOVoc = vocList.get(0);
					if ("2".equals(pmVatOVoc.getVocType())) {
						if (!updatePmVatOVocByVocType(pmVatOVoc))
							logger.warn("更新红字发票对应的蓝字发票处理时也错，对应data_id为{}, 对应蓝字发票data_id为 : {}",pmVatOVoc.getDataId(), pmVatOVoc.getOriDataId());
					}

					pmVatOVoc.setVocStat("2");
					pmVatOVoc.setVocCode(mapSheet1.get("VOC_CODE"));// 发票代码
																	// VOC_CODE
					pmVatOVoc.setVocNo("".equals(mapSheet1.get("VOC_NO")) || mapSheet1.get("VOC_NO") == null
							? mapSheet1.get("SDPHM") : mapSheet1.get("VOC_NO"));// 发票号码
																				// VOC_NO
					pmVatOVoc.setVocId(mapSheet1.get("SDPHM"));// 数电票号码 VOC_ID
					pmVatOVoc.setNextAction("04");
					if (vocMapList.size() == 1) {// 如果只有一个Sheet页面那么就要修改个别字段的赋值逻辑
						pmVatOVoc.setVocUser(params.get("username"));// VOC_USER
																		// 开票人
						pmVatOVoc.setVocDate(date);// 开票日期默认放今天
						pmVatOVoc.setRsv1(params.get("username"));// RSV1放上传excelde的人
					} else {
						pmVatOVoc.setVocUser(mapSheet1.get("KPR"));// VOC_USER
																	// 开票人
						pmVatOVoc.setVocDate(mapSheet1.get("KPRQ").substring(0, 8).replace("-", "").replace("/", "")
								.substring(0, 8));// 开票日期 VOC_DATE
						pmVatOVoc.setRsv1(params.get("username"));// RSV1放上传excelde的人
						pmVatOVoc.setRemarks(mapSheet1.get("BZ"));// 备注
					}
					matchFlag = "Y";
					mapSheet1.put("MATCH_FLAG", matchFlag);
					mapSheet1.put("DATA_ID", UUuidUtils.UUID());
					pmVatOVocMapper.updateByPrimaryKeySelective(pmVatOVoc);
					// 更新List表发票代码、发票号码
					HashMap<String, String> tmpVocMap = new HashMap<>();
					tmpVocMap.put("DATA_ID", pmVatOVoc.getDataId());
					tmpVocMap.put("VOC_CODE", pmVatOVoc.getVocCode());
					tmpVocMap.put("VOC_NO", pmVatOVoc.getVocNo());
					myBatisSessionTemplate.insert("com.gingkoo.vat.server.EvatCommonSql.updateListVocNo", tmpVocMap);
					myBatisSessionTemplate.insert("com.gingkoo.vat.server.EvatCommonSql.insertVocUploadLogs",
							mapSheet1);
				} else {// 处理1对多情况 DTL/VOC.结合明细表GOODCODE去查询匹配发票号码
						// 条件：税收分类编码、金额、税率
					List<Map<String, String>> excelDtlList = vocMapList.get(1).stream()
							.filter(dtl -> dtl.get("SDPHM").equals(mapSheet1.get("SDPHM")))
							.collect(Collectors.toList());

					for (PmVatOVoc voc : vocList) {
						PmVatOVocDtlExample dtlExample = new PmVatOVocDtlExample();
						dtlExample.or().andPdataIdEqualTo(voc.getDataId());
						// 数据库中每张发票对应的明细
						PmVatOVocDtlMapper pmVatOVocDtlMapper = myBatisSessionTemplate
								.getMapper(PmVatOVocDtlMapper.class);
						List<PmVatOVocDtl> dtlList = pmVatOVocDtlMapper.selectByExample(dtlExample);
						if (excelDtlList.size() != dtlList.size()) {// 条数不匹配，直接匹配下一个发票
							continue;
						}
						// ;dtlList ->> EXCELDTL compare
						boolean tmpMatch = false;
						for (Map<String, String> tmpDtlMap : excelDtlList) {
							tmpMatch = false;
							for (PmVatOVocDtl pmVatOVocDtl : dtlList) {
								// 比较数值大小
								Boolean a = pmVatOVocDtl.getAmount()
										.compareTo(new BigDecimal(tmpDtlMap.get("JE"))) == 0;
								Boolean b = pmVatOVocDtl.getTaxAmt()
										.compareTo(new BigDecimal(tmpDtlMap.get("SE"))) == 0;
								logger.info(tmpDtlMap.get("SSFLBM"));
								logger.info(pmVatOVocDtl.getGoodCode());
								logger.info(String.valueOf(tmpDtlMap.containsValue(pmVatOVocDtl.getGoodCode())));
								logger.info(pmVatOVocDtl.getAmount() + "");
								logger.info(tmpDtlMap.get("JE"));
								logger.info(a + "");
								logger.info(pmVatOVocDtl.getTaxAmt() + "");
								logger.info(tmpDtlMap.get("SE"));
								logger.info(b + "");

								if (tmpDtlMap.containsValue(pmVatOVocDtl.getGoodCode()) && a && b) {
									tmpMatch = true;
									dtlList.remove(pmVatOVocDtl);
									break;
								}
							}
							if (tmpMatch == false) {
								break;
							}
						}

						if (tmpMatch == true) {// matched update related filed
							if ("2".equals(voc.getVocType())) {
								if (!updatePmVatOVocByVocType(voc))
									logger.warn("更新红字发票对应的蓝字发票处理时也错，对应data_id为{}, 对应蓝字发票data_id为 : {}",voc.getDataId(), voc.getOriDataId());
							}
							voc.setVocStat("2");
							voc.setVocCode(mapSheet1.get("VOC_CODE"));// 发票代码
																		// VOC_CODE
							voc.setVocNo("".equals(mapSheet1.get("VOC_NO")) || mapSheet1.get("VOC_NO") == null
									? mapSheet1.get("SDPHM") : mapSheet1.get("VOC_NO"));// 发票号码
																						// VOC_NO
							voc.setVocId(mapSheet1.get("SDPHM"));// 数电票号码 VOC_ID
							voc.setVocDate(mapSheet1.get("KPRQ").substring(0, 8).replace("-", "").replace("/", "")
									.substring(0, 8));// 开票日期 VOC_DATE
							voc.setVocUser(mapSheet1.get("KPR"));// VOC_USER 开票人
							voc.setRemarks(mapSheet1.get("BZ"));// 备注
							voc.setNextAction("04"); // 04-已打印
							matchFlag = "Y";
							mapSheet1.put("MATCH_FLAG", matchFlag);
							mapSheet1.put("DATA_ID", UUuidUtils.UUID());
							pmVatOVocMapper.updateByPrimaryKeySelective(voc);
							// 更新List表发票代码、发票号码
							HashMap<String, String> tmpVocMap = new HashMap<>();
							tmpVocMap.put("DATA_ID", voc.getDataId());
							tmpVocMap.put("VOC_CODE", voc.getVocCode());
							tmpVocMap.put("VOC_NO", voc.getVocNo());
							myBatisSessionTemplate.insert("com.gingkoo.vat.server.EvatCommonSql.updateListVocNo",
									tmpVocMap);
							// 插入发票日志表
							myBatisSessionTemplate.insert("com.gingkoo.vat.server.EvatCommonSql.insertVocUploadLogs",
									mapSheet1);
							break;
						} else {
							returnString.append(mapSheet1.get("SDPHM") + "、");
							recordOnFailed(mapSheet1);
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			logger.error("import voc upload file error :" + e);
			return "文件处理异常，请检查文件格式";
		}
		return returnString.toString();
	}

	/**
	 * record error not
	 */
	private void recordOnFailed(Map<String, String> vocDataRecord) {
		vocDataRecord.put("MATCH_FLAG", "N");
		vocDataRecord.put("DATA_ID", UUuidUtils.UUID());
		// 插入发票日志表
		myBatisSessionTemplate.insert("com.gingkoo.vat.server.EvatCommonSql.insertVocUploadLogs", vocDataRecord);
	}

	public List<List<Map<String, String>>> getData(String absolutePath) {
		try {
			List<List<Map<String, String>>> vocMapList = new ArrayList();
			File file = new File(absolutePath);
			InputStream fileInputStream = new FileInputStream(file);
			Workbook workbook;
			// Excel2003
			if (absolutePath.toLowerCase().endsWith(".xls")) {
				workbook = new HSSFWorkbook(new POIFSFileSystem(fileInputStream));
				// Excel2007
			} else {
				workbook = new XSSFWorkbook(absolutePath);
			}
			// 如果只有一个sheet页面那么就是另外一种导回模板
			if (workbook.getNumberOfSheets() != 1) {
				// 第一个sheet
				Sheet sheet1 = workbook.getSheet(SysParamService.getSysParam("3000|0001"));
				vocMapList.add(0, getExcelValue(sheet1, "1"));
				Sheet sheet2 = workbook.getSheet(SysParamService.getSysParam("3000|0002"));
				vocMapList.add(1, getExcelValue(sheet2, "2"));
			} else {
				// 兼容上传模板只有一种的情况
				Sheet sheet = workbook.getSheetAt(Integer.parseInt(SysParamService.getSysParam("3000|0040")));
				vocMapList.add(0, getExcelValue(sheet));
			}
			return vocMapList;
		} catch (FileNotFoundException e) {
			logger.error("file not found error :" + e);
			throw new RuntimeException(e);
		} catch (IOException e) {
			logger.error(" error :" + e);
			throw new RuntimeException(e);
		}
	}

	public List<Map<String, String>> getExcelValue(Sheet sheet) {
		List<Map<String, String>> ListMap = new ArrayList<Map<String, String>>();
		logger.info("get data from excel sheet {}", sheet.getSheetName());
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Map<String, String> map = new HashMap<>();
			Row row = sheet.getRow(i);
			if (row == null) {
				break;
			}
			map.put("FPLSH", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0003")))));// 发票流水号
			map.put("FPLX", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0004")))));// 发票类型
			map.put("SDPHM", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0005")))));// 数电票号码
			map.put("JE", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0006")))));// 合计金额
			map.put("GMFYX", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0007")))));// 购买方邮箱
			map.put("FPSCLX", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0008")))));// 发票文件生成类型
			map.put("KJJG", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0009")))));// 开具结果
			if (StringUtils.isBlank(map.get("SDPHM"))) {
				continue;
			}
			ListMap.add(map);
		}
		return ListMap;
	}

	public String getAmountValue(Cell cell) {
		String stringAmt = "";

		try {
			if (cell.getCellType() == 1) {
				stringAmt = cell.getStringCellValue();
			} else {
				cell.setCellType(0);
				stringAmt = String.valueOf(cell.getNumericCellValue());
			}
		} catch (Exception var4) {
			logger.error(" error :" + var4);
		}

		return stringAmt;
	}

	public List<Map<String, String>> getExcelValue(Sheet sheet, String flag) {
		List<Map<String, String>> ListMap = new ArrayList<Map<String, String>>();
		if ("1".equals(flag)) {
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Map<String, String> map = new HashMap<>();
				Row row = sheet.getRow(i);
				if (row == null) {
					break;
				}

				map.put("VOC_CODE",
						getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0011")))));
				map.put("VOC_NO",
						getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0012")))));
				map.put("SDPHM", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0013")))));// 数电号码
				if (StringUtils.isBlank(map.get("SDPHM"))) {
					continue;
				}
				map.put("XFSBH", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0014")))));// 销方识别号
				map.put("XFMC", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0015")))));// 销方名称
				map.put("GFSBH", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0016")))));// 购方识别号
				map.put("GMFMC", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0017")))));// 购买方名称
				map.put("KPRQ", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0018")))));// 开票日期
				map.put("JE", getAmountValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0019")))));// 金额
				map.put("SE", getAmountValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0020")))));// 税额
				map.put("FPLY", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0021")))));// 发票来源
				map.put("FPPZ", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0022")))));// 发票票种
				map.put("FPZT", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0023")))));// 发票状态
				map.put("FPFXDJ",
						getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0024")))));// 发票风险等级
				map.put("KPR", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0025")))));// 开票人
				map.put("BZ", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0026")))));// 备注

				ListMap.add(map);
			}
		}
		if ("2".equals(flag)) {
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Map<String, String> map = new HashMap<>();
				Row row = sheet.getRow(i);
				if (row == null) {
					break;
				}
				map.put("VOC_CODE",
						getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0028")))));
				map.put("VOC_NO",
						getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0029")))));
				map.put("SDPHM", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0030")))));// 数电票号码
				if (StringUtils.isBlank(map.get("SDPHM"))) {
					continue;
				}
				map.put("SSFLBM",
						getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0031")))));// 税收分类编码
				map.put("HWHYSLWMC",
						getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0032")))));// 货物或应税劳务名称
				map.put("GGXH", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0033")))));// 规格型号
				map.put("DW", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0034")))));// 单位
				map.put("COUNT", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0035")))));// 数量
				map.put("DJ", getAmountValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0036")))));// 单价
				map.put("JE", getAmountValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0037")))));// 金额
				map.put("SL", getCellValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0038")))));// 税率
				map.put("SE", getAmountValue(row.getCell(Integer.parseInt(SysParamService.getSysParam("3000|0039")))));// 税额

				ListMap.add(map);
			}
		}

		return ListMap;
	}

	public String getCellValue(Cell cell) {// 处理各种cell类型
		String cellValue = "";
		if (cell == null) {
			return cellValue;
		}
		// 判断数据的类型
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_NUMERIC: // 数字
			// short s = cell.getCellStyle().getDataFormat();
			if (HSSFDateUtil.isCellDateFormatted(cell)) {// 处理日期格式、时间格式
				try {
					SimpleDateFormat sdf = null;
					// 验证short值
					if (cell.getCellStyle().getDataFormat() == 14) {
						sdf = new SimpleDateFormat("yyyy/MM/dd");
					} else if (cell.getCellStyle().getDataFormat() == 21) {
						sdf = new SimpleDateFormat("HH:mm:ss");
					} else if (cell.getCellStyle().getDataFormat() == 22) {
						sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					} else if (cell.getCellStyle().getDataFormat() == 22) {
						sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 2023-07-10
																			// 09:44:17
					}
					Date date = cell.getDateCellValue();
					cellValue = sdf.format(date);
				} catch (RuntimeException e) {
					logger.error(" error :" + e);
				}
			} else {
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cellValue = String.valueOf(cell.getRichStringCellValue().getString());
			}
			break;
		case Cell.CELL_TYPE_STRING: // 字符串
			cellValue = String.valueOf(cell.getStringCellValue());
			break;
		case Cell.CELL_TYPE_BOOLEAN: // Boolean
			cellValue = String.valueOf(cell.getBooleanCellValue());
			break;
		case Cell.CELL_TYPE_FORMULA: // 公式
			cellValue = String.valueOf(cell.getCellFormula());
			break;
		case Cell.CELL_TYPE_BLANK: // 空值
			cellValue = null;
			break;
		case Cell.CELL_TYPE_ERROR: // 故障
			cellValue = "非法字符";
			break;
		default:
			cellValue = "未知类型";
			break;
		}
		return cellValue;
	}

	/**
	 * @param header
	 * @param
	 * @throws BizException
	 * @Description 数电发票下载
	 */
	@SuppressWarnings("unchecked")
	public Callback downloadDigitalVocExcel(final Map<String, String> header,
			final List<Map<String, String>> pmVatOVocList) throws BizException, TemplateException {
		Callback cb = new CallbackImpl();
		try {
			if (pmVatOVocList.size() > 0 || "ALL".equals(header.get("HEAD.selectType"))) {
				// 模板路径
				String tplFileName = SysParamService.getSysParamDir("0003|0011") + "EXPORT_TEMPLATE_OvocDigital.xlsx";
				// 生成文件名 //这个和导入的目录一样，可以考虑换个参数
				String expDir = SysParamService.getSysParamDir("0003|0002");
				if (expDir.endsWith(File.separator)) {
					expDir = expDir + "digitalDownload" + File.separator;
				} else {
					expDir = expDir + File.separator + "digitalDownload" + File.separator;
				}
				String userId = header.get("HEAD.userId");
				String expFile = "离线数电发票开具_" + header.get("HEAD.username") + "_"
						+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".xlsx";

				String expFileName = expDir.endsWith(File.separator) ? expDir + expFile
						: expDir + File.separator + expFile;

				String urlParameter = downloadRequestHandler.getUrlParameter(userId, expFile, expFileName);
				cb.setSuccessMessage(urlParameter);
				cb.setExtraData(expFile);

				List<PmVatOVocDtl> pmVatOVocDtlList = new ArrayList<>();
				List<Map<String, String>> exportVocList = null;
				if ("ALL".equals(header.get("HEAD.selectType"))) {
					header.put("ORG_ID",header.get("HEAD.ORG_ID"));
					exportVocList = this.myBatisSessionTemplate
							.selectList("com.gingkoo.vat.server.EvatCommonSql.selectExportData", header);
					if (exportVocList.size() == 0) {
						cb.setErrorMessage("当前条件下不存在数据，请重新选择条件");
						return cb;
					}
				} else {
					exportVocList = pmVatOVocList;
				}

				for (int i = 0; i < exportVocList.size(); i++) {
					if (!("0".equals(exportVocList.get(i).get("VOC_STAT"))
							|| "1".equals(exportVocList.get(i).get("VOC_STAT")))) {
						cb.setErrorMessage("当前条件下存在“已打印”状态的数据，请重新选择条件");
						return cb;
					}
					if (("2".equals(exportVocList.get(i).get("VOC_TYPE")))) {
						cb.setErrorMessage("当前条件下存在红字发票的数据，请重新选择条件");
						return cb;
					}
					/** add by wyq 20240430导出模板参数化 */
					if (exportVocList.get(i).get("VOC_FLAG") != null
							&& exportVocList.get(i).get("VOC_FLAG").equals("0")) {
						exportVocList.get(i).put("VOC_FLAG", "增值税专用发票");
					} else if (exportVocList.get(i).get("VOC_FLAG") != null
							&& exportVocList.get(i).get("VOC_FLAG").equals("2")) {
						exportVocList.get(i).put("VOC_FLAG", "普通发票");
					}
					exportVocList.get(i).put("IS_TAX", "是");
					PmVatOVocDtlMapper pmVatOVocDtlMapper = myBatisSessionTemplate.getMapper(PmVatOVocDtlMapper.class);
					PmVatOVocDtlExample vocDtlExample = new PmVatOVocDtlExample();
					vocDtlExample.or().andPdataIdEqualTo(exportVocList.get(i).get("DATA_ID"));
					pmVatOVocDtlList.addAll(pmVatOVocDtlMapper.selectByExample(vocDtlExample));
				}
				/** add by wyq 20240430导出模板参数化 */
				for (int i = 0; i < pmVatOVocDtlList.size(); i++) {
					BigDecimal tax = new BigDecimal(0.00);
					int flag = tax.compareTo(pmVatOVocDtlList.get(i).getTaxRate());
					if (flag == 0) {
						pmVatOVocDtlList.get(i).set("TAX_RATE", "0");
					} else {
						pmVatOVocDtlList.get(i).set("TAX_RATE", pmVatOVocDtlList.get(i).getTaxRate().toString());
					}
					String DISCOUNT_FLAG = dealNull(pmVatOVocDtlList.get(i).getDiscountFlag());
					if (DISCOUNT_FLAG != null && DISCOUNT_FLAG.equals("0")) {
						pmVatOVocDtlList.get(i).set("DISCOUNT_FLAG", "否");
					} else if (DISCOUNT_FLAG != null && DISCOUNT_FLAG.equals("1")) {
						pmVatOVocDtlList.get(i).set("DISCOUNT_FLAG", "是");
					}
				}

				// 生成文件
				// 模板文件名
				// exportDigital(pmVatOVocList, pmVatOVocDtlList, expFile,
				// expDir, tplDir);
				exportDigital(exportVocList, pmVatOVocDtlList, expFile, expDir, tplFileName);

				if ("Y".equals(SysParamService.getSysParamDir("0003|00016"))) {
					ArrayList<String> arr = new ArrayList<>();
					// for (Map<String, String> map : pmVatOVocList) {
					for (Map<String, String> map : exportVocList) {
						arr.add(map.get("data_id"));
					}
					PmVatOVocMapper pmVatOVocMapper = myBatisSessionTemplate.getMapper(PmVatOVocMapper.class);
					PmVatOVocExample vocExample = new PmVatOVocExample();
					vocExample.or().andDataIdIn(arr);
					List<PmVatOVoc> pmVatOVocs = pmVatOVocMapper.selectByExample(vocExample);
					for (PmVatOVoc pmVatOVoc : pmVatOVocs) {
						pmVatOVoc.setVocStat("1");
						pmVatOVoc.setVocUser(header.get("HEAD.username"));// 开票人放导出execl的人
						pmVatOVocMapper.updateByPrimaryKey(pmVatOVoc);
					}
				}
			}
		} catch (Exception e) {
			cb.setErrorCode("-1");
			cb.setErrorMessage("操作失败，错误信息：" + e.getMessage());
			logger.error(" error :" + e);
			return cb;
		}

		return cb;
	}

	/**
	 * copy template file to export folder
	 * 
	 * @param tplFileName
	 * @param exportPath
	 * @param expFileName
	 * @return
	 */
	public String copyExcel(String tplFileName, String exportPath, String expFileName) {
		File tplFile = new File(tplFileName);
		// 指定文件夹
		File copiedFolder = new File(exportPath);
		try {
			// 判断文件夹是否存在,不存在需要创建，否则无法正常创建该文件夹下的文件
			if (!copiedFolder.exists()) {
				logger.info("copiedFolder not exists" + exportPath);
				copiedFolder.mkdirs();
			}
			Path srcPath = Paths.get(tplFileName);
			Path targetPath = Paths.get(copiedFolder.getParent(), expFileName);
			// 复制内容到指定文件中
			Files.copy(srcPath, targetPath, StandardCopyOption.REPLACE_EXISTING);

			// copyFileContent(tplFileName, copiedFile);
			return targetPath.toString();
		} catch (IOException e) {
			logger.error("error" + e);
		}
		return null;
	}

	/**
	 * 将文件fromFile 的内容复制到 toFile文件中 复制的可以是Excel等多种格式
	 *
	 * @param fromFile
	 * @param toFile
	 * @throws IOException
	 */
	public void copyFileContent(File fromFile, File toFile) throws IOException {

		try (FileInputStream ins = new FileInputStream(fromFile);
				FileOutputStream out = new FileOutputStream(toFile);) {
			byte[] b = new byte[1024];
			int n = 0;
			while ((n = ins.read(b)) != -1) {
				out.write(b, 0, n);
			}
		} catch (Exception e) {
			logger.error(" error :" + e);

		}
	}

	public int exportDigital(List<Map<String, String>> pmVatOVocList, List<PmVatOVocDtl> pmVatOVocDtlList,
			String expFileName, String fileDir, String tplFileName) {
		// copy tmeplate to export folder
		String copiedFile = copyExcel(tplFileName, fileDir, expFileName);

		// modified by wolf.duan change to try-resource to close resources try
		File file = new File(fileDir + expFileName);
		file.setReadOnly();
		try (Workbook wb = inserSheetData(pmVatOVocList, pmVatOVocDtlList, copiedFile);
				// 修改文件导出位置讲文件导出到临时目录
				FileOutputStream out = new FileOutputStream(file);) {
			
			String flag = SysParamService.getSysParamDir("0003|9998");
			String pw = SysParamService.getSysParamDir("0003|9999");
			if("Y".equals(flag)) {
				int numberOfSheets = wb.getNumberOfSheets();
	            for (int i = 0; i < numberOfSheets; i++) {
	                Sheet sheet = wb.getSheetAt(i);
	                sheet.protectSheet(pw);
	            }
			}

			logger.info("generate file : " + fileDir + expFileName);
			wb.write(out);
		} catch (FileNotFoundException e) {
			logger.info(e.getMessage());
		} catch (IOException e) { // TODO Auto-generated catch block
			logger.info(e.getMessage());
		}

		// 设置只读权限
//        EnumSet<PosixFilePermission> perms = EnumSet.of(
//                PosixFilePermission.OWNER_READ,
//                PosixFilePermission.GROUP_READ,
//                PosixFilePermission.OTHERS_READ
//        );
// 
//        FileAttribute<Set<PosixFilePermission>> attribute = PosixFilePermissions.asFileAttribute(perms);
// 
//        try {
//            Path path = file.toPath();
//            // 使用文件属性设置只读权限
//            Files.setPosixFilePermissions(path, perms);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		// delete temp copied file
		try {
			Files.deleteIfExists(Paths.get(copiedFile));
		} catch (IOException e) {
			logger.error("delete tmp file {} failed ..", copiedFile);
			e.printStackTrace();
		}

		return 0;
	}

	@Transactional(rollbackFor = { Exception.class }, propagation = Propagation.REQUIRED)
	public Callback downFile(Map<String, String> header, List<Map<String, Object>> list)
			throws IOException, TemplateException,
			com.gingkoo.gal.api.print.template.engine.exception.TemplateException, NoSuchFieldException, BizException {
		CallbackImpl cb = new CallbackImpl();
		logger.info("========================================下载归档文件=================================================");
		String userId = header.get("HEAD.userId");
		List<String> filePaths = new ArrayList<>();
		for (Map<String, Object> dMap : list) {
			PmVatOVocMapper pmVatOVocMapper = myBatisSessionTemplate.getMapper(PmVatOVocMapper.class);
			PmVatOVoc pmVatOVoc = pmVatOVocMapper.selectByPrimaryKey(dMap.get("DATA_ID").toString());

			if (StringUtils.isNotBlank(pmVatOVoc.getPdfPath()))
				filePaths.add(pmVatOVoc.getPdfPath());
			if (StringUtils.isNotBlank(pmVatOVoc.getOfdPath()))
				filePaths.add(pmVatOVoc.getOfdPath());
			if (StringUtils.isNotBlank(pmVatOVoc.getXmlPath()))
				filePaths.add(pmVatOVoc.getXmlPath());

		}
		if (filePaths.size() == 0) {
			cb.setErrorCode("1");
			cb.setErrorMessage("所选择的发票没有上传过归档文件！");
			return cb;
		}
		/** pdf文件压缩包生成路径 */
		String zipPath = SysParamService.getSysParamDir("0003|0009");
		String zipName = "file_" + header.get("HEAD.username") + "_" + DateHelper.toDateTime() + ".zip";
		String zipFilePath = zipPath + "/file_" + DateHelper.toDateTime() + ".zip";
		int i = ComPress.mkZip(filePaths, zipFilePath, false);
		logger.info("成功压缩" + i + "个文件");
		String urlParameter = downloadRequestHandler.getUrlParameter(userId, zipName, zipFilePath);
		cb.setSuccessMessage(urlParameter);
		cb.setExtraData(zipName);
		return cb;
	}

	/**
	 * add by wyq 20240428 导出模板参数化配置
	 */
	public Workbook inserSheetData(List<Map<String, String>> pmVatOVocList, List<PmVatOVocDtl> pmVatOVocDtlList,
			String expFilePath) {
		try{
			Workbook workbook = new XSSFWorkbook(expFilePath);
			// 第一个sheet
			Sheet sheet1 = workbook.getSheet(SysParamService.getSysParam("3003|0001"));
			// 第二个sheet
			Sheet sheet2 = workbook.getSheet(SysParamService.getSysParam("3003|0002"));
			List<Map<String, String>> params1 = SysParamService.sysParamList.stream()
					.filter(map -> "3002".equals(map.get("PARAMGROUP_ID"))).collect(Collectors.toList());
			logger.info(params1.toString());
			List<Map<String, String>> params2 = SysParamService.sysParamList.stream()
					.filter(map -> "3004".equals(map.get("PARAMGROUP_ID"))).collect(Collectors.toList());

			// 处理发票和明细一对多问题
			/** add by wyq 20240430导出模板参数化 */
			for (int i = 0; i < pmVatOVocList.size(); i++) {
				Row row1 = sheet1.createRow(sheet1.getLastRowNum() + 1);// 新增一行
				for (int j = 0; j < params1.size(); j++) {
					row1.createCell(Integer.parseInt(params1.get(j).get("PARAM_ID")))
							.setCellValue(dealNull(pmVatOVocList.get(i).get(params1.get(j).get("PARAM_VAL"))));// 发票流水号
				}
			}
			for (PmVatOVocDtl pmVatOVocDtl : pmVatOVocDtlList) {
				Row row2 = sheet2.createRow(sheet2.getLastRowNum() + 1);// 新增一行
				for (int i = 0; i < params2.size(); i++) {
					row2.createCell(Integer.parseInt((params2.get(i).get("PARAM_ID"))))
							.setCellValue(dealNull(pmVatOVocDtl.get(params2.get(i).get("PARAM_VAL"))));// 发票流水号
				}
			}
			return workbook;

		} catch (FileNotFoundException e) {
			logger.error(" error :" + e);
			throw new RuntimeException(e);
		} catch (IOException e) {
			logger.error(" error :" + e);
			throw new RuntimeException(e);
		}
	}

	public String dealNull(Object object) {
		return object == null ? null : object.toString();
	}

	/**
	 * @param
	 * @param
	 * @throws BizException
	 * @Description 数电发票开具页面导回红字发票处理
	 */

	public Boolean updatePmVatOVocByVocType(PmVatOVoc pmVatOVoc) {

		Map<String, String> paras = new HashMap<String, String>();

		Map<String, String> disParas = new HashMap<String, String>();

		try {
			// 将红冲之前的发票list插入discard表
			disParas.put("DATA_ID", pmVatOVoc.get("ORI_DATA_ID"));
			myBatisSessionTemplate.insert("com.gingkoo.vat.server.VatCommonSql.oVocDiscardApvInsertDiscardVocList",
					disParas);
			// 更新list状态释放交易
			Map<String, String> updListParas = new HashMap<String, String>();
			updListParas.put("data_id", pmVatOVoc.get("ORI_DATA_ID"));
			updListParas.put("voc_code", "");
			updListParas.put("voc_no", "");
			updListParas.put("voc_date", "");
			updListParas.put("next_action", "02");
			myBatisSessionTemplate.update("com.gingkoo.vat.server.VatCommonSql.updateVocListAfterCreateVoc",
					updListParas);

			Map<String, String> updTxParas = new HashMap<String, String>();
			updTxParas.put("data_id", pmVatOVoc.get("ORI_DATA_ID"));
			updTxParas.put("data_status", "00");
			updTxParas.put("next_action", "00");
			myBatisSessionTemplate.update("com.gingkoo.vat.server.VatCommonSql.updateVatTxAfterCreateVoc", updTxParas);

			// 更新原蓝字发票状态为已红冲
			paras.put("data_id", pmVatOVoc.get("ORI_DATA_ID"));
			paras.put("voc_stat", "9");
			myBatisSessionTemplate.update("com.gingkoo.vat.server.VatCommonSql.updateVoc", paras);
		} catch (Exception e) {
			logger.error("红字发票更新蓝票相关信息失败，错误为： {}", e);
			return false;
		}

		return true;
	}
	/**
	 * @param header
	 * @param map
	 * @Description 根据发票类型更新 voc表和 list表 added by shuyue.he 20241105 begin
	 */
	public Callback updatePmVatOVocByVocType(final Map<String, String> header, final Map<String, String> map) {
		Callback cb = new CallbackImpl();
		Map<String, String> paras = new HashMap<String, String>();
		try {

			if ("2".equals(map.get("VOC_TYPE"))) {
				PmVatOVoc voc = pmVatOVocMapper.selectByPrimaryKey(map.get("DATA_ID"));
				updatePmVatOVocByVocType(voc);
			}

		} catch (Exception e) {
			logger.error("更新红票对应的交易失败，错误为：{}", e);
		}

		logger.debug("callback ---> ");
		logger.debug(cb.toString());

		paras.clear();
		paras.put("data_id", map.get("DATA_ID"));
		paras.put("voc_stat", "2"); // 【0-未打印；1-正打印；2-已打印 3-已作废 5-生成失败 6-打印失败】
		paras.put("next_action", "04"); // next_action 发票数据已生成
		paras.put("voc_code", map.get("VOC_CODE"));
		paras.put("voc_no", map.get("VOC_NO"));
		paras.put("VOC_ID", map.get("VOC_NO"));// 数电发票号码
		paras.put("voc_date", map.get("VOC_DATE").substring(0, 8));
		logger.debug("updateVoc paras===============");
		logger.debug(paras.toString());
		myBatisSessionTemplate.update("com.gingkoo.vat.server.VatCommonSql.updateVoc", paras);
		myBatisSessionTemplate.update("com.gingkoo.vat.server.VatCommonSql.updateVocListAfterCreateVoc", paras);

		return cb;
	}
	/** added by shuyue.he 20241105 end */

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public Callback oVocOriDtlAdd(final Map<String, String> header, final List<Map<String, String>> pmVatOVocDtl)
			throws BizException {
		Callback cb = new CallbackImpl();
		try {

			for (int i = 0; i < pmVatOVocDtl.size(); i++) {
				String dataId = pmVatOVocDtl.get(i).get("ORI_DTL_DATA_ID");
				String amount = pmVatOVocDtl.get(i).get("AMOUNT");
				String insAmt = pmVatOVocDtl.get(i).get("INS_AMT");
				String taxAmt = pmVatOVocDtl.get(i).get("TAX_AMT");
				PmVatOVocDtlMapper pmVatOVocDtlMapper = myBatisSessionTemplate.getMapper(PmVatOVocDtlMapper.class);
				PmVatOVocDtl pmVatOVocDtl1 = pmVatOVocDtlMapper.selectByPrimaryKey(dataId);

				BigDecimal oldAmount = pmVatOVocDtl1.get("RED_AMOUNT") == null ? new BigDecimal(0)
						: new BigDecimal(pmVatOVocDtl1.get("RED_AMOUNT"));
				BigDecimal oldInsAmt = pmVatOVocDtl1.get("RED_INSAMT") == null ? new BigDecimal(0)
						: new BigDecimal(pmVatOVocDtl1.get("RED_INSAMT"));
				BigDecimal oldTaxAmt = pmVatOVocDtl1.get("RED_TAXAMT") == null ? new BigDecimal(0)
						: new BigDecimal(pmVatOVocDtl1.get("RED_TAXAMT"));

				BigDecimal newAmt = new BigDecimal(amount);
				BigDecimal sumAmt = oldAmount.add(newAmt);
				BigDecimal newInsAmt = new BigDecimal(insAmt);
				BigDecimal sumInsAmt = oldInsAmt.add(newInsAmt);
				BigDecimal newTaxAmt = new BigDecimal(taxAmt);
				BigDecimal sumTaxAmt = oldTaxAmt.add(newTaxAmt);

				pmVatOVocDtl1.set("DATA_ID", String.valueOf(dataId));
				pmVatOVocDtl1.set("RED_AMOUNT", String.valueOf(sumAmt));
				pmVatOVocDtl1.set("RED_INSAMT", String.valueOf(sumInsAmt));
				pmVatOVocDtl1.set("RED_TAXAMT", String.valueOf(sumTaxAmt));

				pmVatOVocDtlMapper.updateByPrimaryKey(pmVatOVocDtl1);

			}
		} catch (Exception e) {
			logger.error(" error :" + e);
			cb.setErrorMessage(String.valueOf(e));
		}
		return cb;
	}

	/**
	 * added by wyq 20231010 end
	 */

	@Transactional(rollbackFor = { Exception.class }, propagation = Propagation.REQUIRED)
	public Callback record(Map<String, String> header, List<Map<String, Object>> list) {
		CallbackImpl cb = new CallbackImpl();
		logger.info("========================================发票补录=================================================");
		String Sql1 = "update pm_vat_o_voc set VOC_STAT='2',NEXT_ACTION='04',VOC_NO='" + header.get("HEAD.VOC_NO")
				+ "',VOC_CODE='" + header.get("HEAD.VOC_CODE") + "',VOC_DATE='" + header.get("HEAD.VOC_DATE")
				+ "',VOC_USER='" + header.get("HEAD.VOC_USER") + "' where DATA_ID='" + header.get("HEAD.DATA_ID") + "'";
		Map<String, Object> pas = new HashMap<String, Object>();
		pas.put("SQL", Sql1);
		this.myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatCommonSql.selectDATA", pas);

		String Sql2 = "update pm_vat_o_voc_list set VOC_NO='" + header.get("HEAD.VOC_NO") + "',VOC_CODE='"
				+ header.get("HEAD.VOC_CODE") + "' where PDATA_ID='" + header.get("HEAD.DATA_ID") + "'";
		Map<String, Object> pas1 = new HashMap<String, Object>();
		pas1.put("SQL", Sql2);
		this.myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VatCommonSql.selectDATA", pas1);

		return cb;
	}

	// 导出后更新红字发票状态未正打印
	public Callback updateRedVoc(final Map<String, String> header, final Map<String, String> map) {
		CallbackImpl cb = new CallbackImpl();

		Map<String, Object> pas = new HashMap<String, Object>();

		String updateSqlString = "UPDATE PM_VAT_O_VOC  SET VOC_STAT ='1' "
				+ "WHERE rev_flag = '0' and  VOC_STAT in ('1','0') and VOC_TYPE = '2' and data_flag != 'D' and NEXT_ACTION='02' and  VOC_CHANNEL ='02'";

		pas.clear();
		pas.put("SQL", updateSqlString);

		this.myBatisSessionTemplate.update("com.gingkoo.vat.server.VatCommonSql.selectDATA", pas);

		return cb;
	}

	// 部分红冲更新发票表信息
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public Callback oVocRedAdd(Map<String, String> header, Map<String, String> map) throws BizException {
		Callback cb = new CallbackImpl();
		String data_id = map.get("ORI_DATA_ID");

		try {
			PmVatOVoc redVoc = new PmVatOVoc();
			map.put("MADE_TYPE", "1");
			map.put("VOC_USER", header.get("HEAD.USERNAME"));
			map.put("VOC_TYPE", "2");
			map.put("VOC_STAT", "0");
			map.put("ORI_DATA_ID", data_id);
			map.remove("VOC_NO");
			map.remove("VOC_CODE");
			map.remove("VOC_DATE");
			redVoc.fromMap(this.assignPubField(header, map));
			PmVatOVocMapper vocMapper = this.myBatisSessionTemplate.getMapper(PmVatOVocMapper.class);
			vocMapper.insertSelective(redVoc);
			cb.setSuccessMessage(redVoc.getDataId());
			return cb;
		} catch (Exception var14) {
			var14.printStackTrace();
			throw new BizException("E999995");
		}
	}

	// 部分红冲更新明细表信息
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public Callback oVocDtlRedAdd(final Map<String, String> header, final List<Map<String, String>> pmVatOVocList)
			throws BizException {
		Callback cb = new CallbackImpl();
		try {
			Map<String, String> map = new HashMap<>();
			map.put("MADE_TYPE", "1");
			map.put("VOC_USER", header.get("HEAD.USERNAME"));
			map.put("VOC_TYPE", "2");
			map.put("VOC_STAT", "0");
			map.remove("VOC_NO");
			map.remove("VOC_CODE");
			map.remove("VOC_DATE");

			for (Map<String, String> voc_dtl : pmVatOVocList) {
				if (voc_dtl != null) {
					PmVatOVocDtl vocDtl = new PmVatOVocDtl();
					voc_dtl.put("PDATA_ID", header.get("HEAD.PDATA_ID"));
					vocDtl.fromMap(assignPubField(header, voc_dtl));
					PmVatOVocDtlMapper vocDtlMapper = myBatisSessionTemplate.getMapper(PmVatOVocDtlMapper.class);
					vocDtlMapper.insertSelective(vocDtl);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new BizException("E999995");
		}
		return cb;
	}

	public Map<String, String> assignPubField(final Map<String, String> header, final Map<String, String> map)
			throws BizException {

		map.put("RPT_STATUS", "00");
		map.put("ACTION_TYPE", "1");
		map.put("RECORD_KEY", "0000");
		map.put("TRACK_NO", "00000000000000000000");

		TbNextAction act = null;
		String menu_id = header.get("HEAD.MENU_ID");
		String ctlname = header.get("HEAD.CTLNAME");
		String controlName = menu_id + "_" + ctlname;
		System.out.println("assignPubField-header" + header);
		TbNextActionMapper nmapper = myBatisSessionTemplate.getMapper(TbNextActionMapper.class);
		TbNextActionKey act_key = new TbNextActionKey();
		act_key.setCorpId(header.get("HEAD.CORP_ID"));
		act_key.setCurrDataStatus("99");
		act_key.setActionId(controlName);
		act_key.setConditionId("001");
		act = nmapper.selectByPrimaryKey(act_key);
		System.out.println("act是否有值" + act);
		if (act == null) {
			throw new BizException("E000000");
		}

		map.put("DATA_STATUS", act.getDataStatus());
		map.put("NEXT_ACTION", act.getNextAction());
		Date date = new Date();
		map.put("DATA_DATE", new SimpleDateFormat("yyyyMMdd").format(date));

		map.put("CORP_ID", header.get("HEAD.CORP_ID"));
		map.put("BUOC_MONTH", header.get("HEAD.FAL_BUOC_MONTH"));
		map.put("ORG_ID", header.get("HEAD.ORG_ID"));
		map.put("INQ_ORG_ID", header.get("HEAD.INQ_ORG_ID"));
		map.put("GROUP_ID", header.get("HEAD.GROUP_ID"));
		map.put("INQ_GROUP_ID", header.get("HEAD.INQ_GROUP_ID"));

		map.put("RPT_STATUS", "00");

		map.put("DATA_CHG_USER", header.get("HEAD.USERNAME"));
		map.put("DATA_CHG_DATE", new SimpleDateFormat("yyyyMMdd").format(date));
		map.put("DATA_CHG_TIME", new SimpleDateFormat("yyyyMMddhhmmss").format(date));
		map.put("DATA_CHG_ORG_ID", header.get("HEAD.ORG_ID"));

		map.put("DATA_CRT_USER", header.get("HEAD.USERNAME"));
		map.put("DATA_CRT_DATE", new SimpleDateFormat("yyyyMMdd").format(date));
		map.put("DATA_CRT_TIME", new SimpleDateFormat("yyyyMMddhhmmss").format(date));

		if (header.containsKey("HEAD.TEMPSAVE") && header.get("HEAD.TEMPSAVE").equals("1")) {
			map.put("CHECK_FLAG", "N");
		} else {
			map.put("CHECK_FLAG", "Y");
		}
		map.put("DATA_FLAG", "O");
		map.put("DATA_SOURCE", "3");
		map.put("DATA_VERSION", "1");

		GrpSeqHelper seqHelper = new GrpSeqHelper();
		seqHelper.setMyBatisSessionTemplate(myBatisSessionTemplate);
		map.put("DATA_ID", seqHelper.getDataId("DATA_ID_SEQ"));
		return map;
	}
}