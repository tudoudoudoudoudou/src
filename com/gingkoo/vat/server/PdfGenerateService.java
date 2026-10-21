package com.gingkoo.vat.server;

import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gui.service.server.exception.BizException;
import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.rpt.dbsvr.server.bean.*;
import com.gingkoo.rpt.dbsvr.server.dao.PmVatOVocDtlMapper;
import com.gingkoo.rpt.dbsvr.server.dao.PmVatOVocMapper;
import com.gingkoo.rpt.dbsvr.server.dao.PmVatTaxEntityMapper;
import com.gingkoo.vat.pdf.*;
import com.gingkoo.vat.pdf.crc.Crc16;
import com.gingkoo.vat.pdf.crc.CrcCalculator;
import com.google.zxing.WriterException;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.*;

@Component
public class PdfGenerateService {
    @Autowired
    private PmVatOVocMapper pmVatOVocMapper;
    @Autowired
    private PmVatOVocDtlMapper pmVatOVocDtlMapper;
    @Autowired
    private PmVatTaxEntityMapper pmVatTaxEntityMapper;
    @Autowired
    private MyBatisSessionTemplate myBatisSessionTemplate;
    @Autowired
    private PdfThicken pdfThicken;

    /**
     * pdf文件生成路径
     */
    String pdfPath = SysParamService.getSysParamDir("0003|0015");
    private final Logger logger = LoggerFactory.getLogger(PdfGenerateService.class);


    /**
     * generate pdf by data id
     *
     * @param dataId
     * @return
     * @throws WriterException
     * @throws TemplateException
     * @throws IOException
     */
    public String genernatePdfByDataId(String dataId) throws BizException, IOException, TemplateException, WriterException {
        logger.info("generate invoice pdf by data id {}", dataId);
        PmVatOVoc vocInfo = pmVatOVocMapper.selectByPrimaryKey(dataId);
        if (vocInfo == null) {
            throw new BizException("生成 PDF失败，未找到对应的发票数据");
        }
        return this.genernatePdfByVoc(vocInfo);
    }

    /**
     * generate pdf by voc
     *
     * @param
     * @return
     * @throws BizException
     * @throws WriterException
     * @throws TemplateException
     * @throws IOException
     */
    public String genernatePdfByVocNo(String vocNo) throws BizException, IOException, TemplateException, WriterException {
        logger.info("generate invoice pdf by voc no  {}", vocNo);

        PmVatOVocExample example = new PmVatOVocExample();
        example.or().andVocNoEqualTo(vocNo);
        List<PmVatOVoc> vocList = pmVatOVocMapper.selectByExample(example);
        if (vocList.size() != 1) {
            throw new BizException("生成 PDF失败，未找到对应的发票数据,或当前发票号码对应多条发票数据");
        }

        return this.genernatePdfByVoc(vocList.get(0));
    }

    /**
     * generate pdf by voc
     *
     * @param voc
     * @return
     * @throws WriterException
     * @throws TemplateException
     * @throws IOException
     * @throws BizException
     */
    public String genernatePdfByVoc(PmVatOVoc voc)
            throws IOException, TemplateException, WriterException, BizException {
        logger.info("generate invoice pdf by voc {}", voc.getVocNo());

        String pdfFileName = voc.getPdfPath();
        if (!StringUtils.isEmpty(pdfFileName)) {
            File file = new File(pdfFileName);
            if (file.exists()) {// already generated pdffile return file path
                return pdfFileName;
            }
        }

        PmVatOVocDtlExample dtlExample = new PmVatOVocDtlExample();
        dtlExample.or().andPdataIdEqualTo(voc.getDataId());
        List<PmVatOVocDtl> dtlList = pmVatOVocDtlMapper.selectByExample(dtlExample);

        PmVatTaxEntityExample taxEntityExample = new PmVatTaxEntityExample();
        taxEntityExample.or().andTaxNoEqualTo(voc.getSaleTaxNo());
        List<PmVatTaxEntity> entityList = pmVatTaxEntityMapper.selectByExample(taxEntityExample);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();

        if (CollectionUtils.isEmpty(entityList)) {
            throw new BizException("没有找到纳税主体，生成PDF失败");
        } else {
            Map<String, Object> mp = new HashMap<>();
            List<Map<String, Object>> detailList = new ArrayList<>();
            if (!CollectionUtils.isEmpty(dtlList)) {
                for (PmVatOVocDtl pmVatOVocDtl : dtlList) {
                    Map<String, Object> oVocDtlMap = new HashMap<String, Object>();
                    oVocDtlMap.put("DTL_NAME", pmVatOVocDtl.getDtlName());
                    oVocDtlMap.put("CNT_UNIT", pmVatOVocDtl.getCntUnit());
                    oVocDtlMap.put("GOOD_AMT", new BigDecimal(String.valueOf(pmVatOVocDtl.getGoodAmt())).setScale(2, RoundingMode.HALF_UP).toString());
                    oVocDtlMap.put("GOOD_NUM", new BigDecimal(String.valueOf(pmVatOVocDtl.getGoodNum())).setScale(2, RoundingMode.HALF_UP).toString());
                    oVocDtlMap.put("GOOD_TYPE", pmVatOVocDtl.getGoodType());
                    oVocDtlMap.put("INS_AMT", new BigDecimal(String.valueOf(pmVatOVocDtl.getInsAmt())).setScale(2, RoundingMode.HALF_UP).toString());
                    oVocDtlMap.put("TAX_AMT", new BigDecimal(String.valueOf(pmVatOVocDtl.getTaxAmt())).setScale(2, RoundingMode.HALF_UP).toString());
                    if ("免税".equals(pmVatOVocDtl.getDiscountDesc())) {
                        oVocDtlMap.put("TAX_RATE", "免税");
                    } else {
                        oVocDtlMap.put("TAX_RATE", percentInstance.format(pmVatOVocDtl.getTaxRate().doubleValue()));
                    }
                    detailList.add(oVocDtlMap);
                }
                mp.put("DETAIL", detailList);
                mp.put("VOC_NO", voc.getVocNo());
                mp.put("BUY_ACT_NO", voc.getBuyActNo());
                mp.put("BUY_NAME", voc.getBuyName());
                mp.put("BUY_TAX_NO", voc.getBuyTaxNo());
                mp.put("BUY_TEL", voc.getBuyTel());
                mp.put("PAYEE_NAME", voc.getPayeeName());
                mp.put("SALEAPV_USER_TEL", voc.getSaleTel());
                mp.put("SALE_ACT_NO", voc.getSaleActNo());
                mp.put("SALE_NAME", voc.getSaleName());
                mp.put("SALE_TAX_NO", voc.getSaleTaxNo());
                mp.put("SUM_AMT", new BigDecimal(String.valueOf(voc.getSumAmt())).setScale(2, RoundingMode.HALF_UP).toString());
                mp.put("SUM_AMT_CHINESE", ConvertUpMoney.toChinese(voc.getSumAmt().toString()));
                mp.put("TOT_INS_AMT", new BigDecimal(String.valueOf(voc.getAmount())).setScale(2, RoundingMode.HALF_UP).toString());
                mp.put("TOT_TAX_AMT", new BigDecimal(String.valueOf(voc.getTaxAmt())).setScale(2, RoundingMode.HALF_UP).toString());
                mp.put("VOC_APV_USER", voc.getApvUser());
                mp.put("VOC_STAT", voc.getVocStat());
                mp.put("VOC_DATE", voc.getVocDate());
                mp.put("VOC_USER", "瑞典北欧斯安银行有限公司上海分行");
                mp.put("REMARKS", voc.getRemarks());
                mp.put("MNG_TAX_NO", entityList.get(0).getMngTaxOrgNo());
                mp.put("PROV_TAX_ORG_NO", entityList.get(0).getProvTaxOrgNo());
                if ("0".equals(voc.getVocFlag())) {
                    mp.put("VOC_TITLE", "电子发票 (增值税专用发票)");
                } else if ("2".equals(voc.getVocFlag())) {
                    mp.put("VOC_TITLE", "电子发票 (普通发票)");
                }
                String stamp = this.getClass().getResource("/images/" + entityList.get(0).getProvTaxOrgNo() + ".png").getPath();
                String shui = this.getClass().getResource("/images/shui.png").getPath();
                BufferedImage image = ImageIO.read(new File(stamp));
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ImageIO.write(image, "PNG", bos);
                String str = "data:image/png;base64,"
                        + new String(Base64.getEncoder().encode(bos.toByteArray()), StandardCharsets.UTF_8);
                mp.put("VOC_CHAPTER", str);
                StringBuilder builder = new StringBuilder();
                if ("0".equals(voc.getVocFlag())) {
                    builder = new StringBuilder("01,31,");
                } else if ("2".equals(voc.getVocFlag())) {
                    builder = new StringBuilder("01,32,");
                }
                builder.append( " ").append(",");
                builder.append(voc.getVocNo()).append(",");
                builder.append(new BigDecimal(String.valueOf(voc.getSumAmt())).setScale(2, RoundingMode.HALF_UP).toString()).append(",");
                builder.append(voc.getVocDate()).append(",");
                builder.append(" ").append(",");

                CrcCalculator calculator = new CrcCalculator(Crc16.Crc16Buypass);
                String crc = builder.toString();
                long result = calculator.Calc(crc.getBytes(), 0, crc.getBytes().length);
                if (result != calculator.Parameters.Check) {
                    builder.append(Long.toHexString(result).toUpperCase());
                } else {
                    logger.info("Crc code build error");
                }
                mp.put("VOC_IMG", VocImage.getImgWithBase64(builder.toString(), shui));
                String Sql3 = "select * FROM Cust_CASH_Psw where GCN='" + voc.get("CUST_NO") + "'";
                Map<String, Object> pas = new HashMap<String, Object>();
                pas.put("SQL", Sql3);
                List<Map<String, String>> cust = this.myBatisSessionTemplate
                        .selectList("com.gingkoo.vat.server.VatCommonSql.selectDATA", pas);
                if (!cust.isEmpty()) {
                    String fileName = voc.getVocNo() + ".pdf";
                    pdfFileName = pdfPath + fileName;
                    Map<String, String> dataMap = new HashMap<String, String>();
                    dataMap.put("pdfFilePath", pdfFileName);
                    DigitalVocGenerator digitalVocGenerator = new DigitalVocGenerator(mp);
                    digitalVocGenerator.generateToByte(dataMap);
                    pdfThicken.thicken(pdfFileName.toString(), cust.get(0).get("Password"), cust.get(0).get("Password"));
                    voc.setPdfPath(pdfFileName);
                    pmVatOVocMapper.updateByPrimaryKey(voc);

                } else {
                    logger.info("生成PDF文件失败，没有找到对应客户无法加密");
                }
            } else {
                logger.info("生成PDF文件失败，没有找到该交易明细");
            }
            return pdfFileName;
        }
    }
}
