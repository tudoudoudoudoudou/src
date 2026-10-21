package com.gingkoo.vat.pdf;

import com.gingkoo.gal.facility.uuid.UuidHelper;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.*;


/**
 * 数电发票PDF，基于 ==> 数字化电子发票版式及 XML 规范 V1.005
 * PDFBOX
 */
public class DigitalVocGenerator {

    static float leftX = mmTOPt(4.5f);
    static float topY = 0;
    private static final float POINTS_PER_MM = 2.8346457F;
    Map<String, PDType0Font> fonts = new HashMap<>();
    float dynamicHeight = mmTOPt(44);
    float defaultFontSize = 9;
    Color defaultColor = new Color(128, 0, 0);
    Color defaultContentColor = Color.BLACK;
    List<Map<String, Object>> dataList;
    private boolean isShowEnd = true;
    private boolean isShowQR = true;
    PDDocument document;
    String cour = this.getClass().getResource("/resources/fonts/cour.ttf").getPath();
    String simFang = this.getClass().getResource("/resources/fonts/simfang.ttf").getPath();
    String simKai = this.getClass().getResource("/resources/fonts/simkai.ttf").getPath();


    public DigitalVocGenerator(Map<String, Object> dataMap) throws IOException {
        init(dataMap);
    }

    private void calDynamicHeight(Map<String, Object> data, Boolean isLast) {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> detail = (List<Map<String, Object>>) data.get("DETAIL");
        float defDetailHeight = isLast ? 44 : 72;
        int rows = detail == null ? 0 : Math.toIntExact(detail.stream().mapToInt(v -> Integer.parseInt(Objects.toString(v.get("ROWS"), "1"))).sum());
        if (rows <= 8)
            dynamicHeight = mmTOPt(defDetailHeight);
        else if (rows <= 12)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f);
        else if (rows <= 16)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 2);
        else if (rows <= 20)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 3);
        else if (rows <= 24)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 4);
        else if (rows <= 28)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 5);
        else if (rows <= 32)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 6);
        else if (rows <= 36)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 7);
        else if (rows <= 40)
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 8);
        else
            dynamicHeight = mmTOPt(defDetailHeight + 17.5f * 8 + 8.75f);
        if (isLast && dataList.size() > 1 && Arrays.asList(12, 16, 20, 24, 28, 32, 36, 40, 42).contains(rows))
            dynamicHeight = dynamicHeight + mmTOPt(4.375f);
        this.isShowEnd = (boolean) data.get("IS_SHOW_END");
        this.isShowQR = StringUtils.isNotEmpty(Objects.toString(data.get("VOC_IMG"), null));

    }

    public void generateToByte(Map<String, String> dataMap) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        document.save(bos);
        document.close();
        String pdfFilePath = dataMap.get("pdfFilePath");
        FileOutputStream fos = new FileOutputStream(new File((pdfFilePath)));
        BufferedOutputStream bos1 = new BufferedOutputStream(fos);
        bos1.write(bos.toByteArray());
        bos1.close();
    }

    private void init(Map<String, Object> dataMap) throws IOException {

        document = new PDDocument();
        loadFonts(document);
        this.dataList = handleDataMap(dataMap);
        for (int i = 0; i < dataList.size(); i++) {
            Map<String, Object> map = dataList.get(i);
            calDynamicHeight(map, i == dataList.size() - 1);
            initPage(map);
        }
    }

    private void initPage(Map<String, Object> data) throws IOException {
        PDPage page = new PDPage(new PDRectangle(595.27563F, mmTOPt(isShowEnd ? 96 : 68) + dynamicHeight));
        document.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        initDefaultRect(page.getMediaBox().getHeight(), contentStream);
        initDefaultText(page.getMediaBox().getHeight(), contentStream);
        if (isShowEnd)
            drawCircleImage(contentStream, mmTOPt(58.5f), page.getMediaBox().getHeight() - dynamicHeight - mmTOPt(57.5f), mmTOPt(4) / 2);
        if (data != null)
            drawData(contentStream, page.getMediaBox().getHeight(), data);
        contentStream.close();
    }


    private void drawData(PDPageContentStream contentStream, float pageHeight, Map<String, Object> data) throws IOException {
        drawImage(contentStream, mmTOPt(6f), pageHeight - mmTOPt(26), mmTOPt(20), mmTOPt(20), Objects.toString(data.get("VOC_IMG"), null), UuidHelper.getCleanUuid() + ".PNG");
        drawImage(contentStream, mmTOPt(90f), pageHeight - mmTOPt(28), mmTOPt(30), mmTOPt(20), Objects.toString(data.get("VOC_CHAPTER"), null), UuidHelper.getCleanUuid() + ".PNG");
        drawText(contentStream, mmTOPt(24), pageHeight - mmTOPt(16), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("TAG"), null));
        drawText(contentStream, (mmTOPt(197) - calTextWidth(Objects.toString(data.get("VOC_TITLE"), ""), fonts.get("Kaiti"), 20)) / 2, pageHeight - mmTOPt(14), fonts.get("Kaiti"), 20, defaultColor, Objects.toString(data.get("VOC_TITLE"), null));
        drawText(contentStream, mmTOPt(170f) - leftX, pageHeight - mmTOPt(14f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("VOC_NO"), null));
        drawText(contentStream, mmTOPt(170f) - leftX, pageHeight - mmTOPt(20f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, parseDate(Objects.toString(data.get("VOC_DATE"), null)));
        if (dataList.size() > 1) {
            String text = "共" + data.get("PAGE_SIZE") + "页 第" + data.get("CUR_SIZE") + "页";
            drawText(contentStream, mmTOPt(201) - calTextWidth(text, fonts.get("FangSongSimSun"), defaultFontSize), pageHeight - mmTOPt(28f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, text);
        }

        drawText(contentStream, mmTOPt(16), pageHeight - mmTOPt(36.5f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("BUY_NAME"), null));
        drawText(contentStream, mmTOPt(55) - 15f, pageHeight - mmTOPt(47f), fonts.get("CourierNew"), 12, defaultContentColor, Objects.toString(data.get("BUY_TAX_NO"), null));

        drawText(contentStream, mmTOPt(117), pageHeight - mmTOPt(36.5f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("SALE_NAME"), null));
        drawText(contentStream, mmTOPt(156) - 15f, pageHeight - mmTOPt(47f), fonts.get("CourierNew"), 12, defaultContentColor, Objects.toString(data.get("SALE_TAX_NO"), null));

        if (dataList.size() > 1) {
            // 小计
            drawText(contentStream, mmTOPt(137), pageHeight - mmTOPt(47) - dynamicHeight + mmTOPt(1f), fonts.get("CourierNew"), 11, defaultContentColor, "¥");
            drawText(contentStream, mmTOPt(139.5f), pageHeight - mmTOPt(47) - dynamicHeight + mmTOPt(1f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("AMT_SUB_TOTAL"), null));
            drawText(contentStream, mmTOPt(201) - calTextWidth(Objects.toString(data.get("TAX_SUB_TOTAL"), ""), fonts.get("FangSongSimSun"), defaultFontSize), pageHeight - mmTOPt(47) - dynamicHeight + mmTOPt(1f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("TAX_SUB_TOTAL"), null));
            drawText(contentStream, mmTOPt(198.5f) - calTextWidth(Objects.toString(data.get("TAX_SUB_TOTAL"), ""), fonts.get("FangSongSimSun"), defaultFontSize), pageHeight - mmTOPt(47) - dynamicHeight + mmTOPt(1f), fonts.get("CourierNew"), 11, defaultContentColor, "¥");
        }
        // 合计
        drawText(contentStream, mmTOPt(137), pageHeight - mmTOPt(52f) - dynamicHeight + mmTOPt(1f), fonts.get("CourierNew"), 11, defaultContentColor, "¥");
        drawText(contentStream, mmTOPt(139.5f), pageHeight - mmTOPt(52f) - dynamicHeight + mmTOPt(1f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("TOT_INS_AMT"), null));
        drawText(contentStream, mmTOPt(201) - calTextWidth(Objects.toString(data.get("TOT_TAX_AMT"), ""), fonts.get("FangSongSimSun"), defaultFontSize), pageHeight - mmTOPt(52f) - dynamicHeight + mmTOPt(1f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("TOT_TAX_AMT"), null));
        drawText(contentStream, mmTOPt(198.5f) - calTextWidth(Objects.toString(data.get("TOT_TAX_AMT"), ""), fonts.get("FangSongSimSun"), defaultFontSize), pageHeight - mmTOPt(52f) - dynamicHeight + mmTOPt(1f), fonts.get("CourierNew"), 11, defaultContentColor, "¥");

        // 明细信息
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> detail = (List<Map<String, Object>>) data.get("DETAIL");
        if (detail != null) {
            float detailStartY = pageHeight - mmTOPt(59);
            for (int i = 0; i < detail.size(); i++) {
                Map<String, Object> dtl = detail.get(i);
                List<String> splitList = (List<String>) dtl.get("SPLIT_LIST");
                for (int j = 0; j < splitList.size(); j++) {
                    drawText(contentStream, 0, detailStartY - mmTOPt(4.375f) * j, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, splitList.get(j));
                }
                drawText(contentStream, mmTOPt(37.5f), detailStartY, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(dtl.get("GOOD_TYPE"), null));
                drawText(contentStream, mmTOPt(67f) - calTextWidth(Objects.toString(dtl.get("CNT_UNIT"), ""), fonts.get("FangSongSimSun"), defaultFontSize) / 2, detailStartY, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(dtl.get("CNT_UNIT"), null));
                drawText(contentStream, mmTOPt(98) - calTextWidth(Objects.toString(dtl.get("GOOD_NUM"), ""), fonts.get("FangSongSimSun"), defaultFontSize), detailStartY, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(dtl.get("GOOD_NUM"), null));
                drawText(contentStream, mmTOPt(123) - calTextWidth(Objects.toString(dtl.get("GOOD_AMT"), ""), fonts.get("FangSongSimSun"), defaultFontSize), detailStartY, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(dtl.get("GOOD_AMT"), ""));
                drawText(contentStream, mmTOPt(149) - calTextWidth(Objects.toString(dtl.get("INS_AMT"), ""), fonts.get("FangSongSimSun"), defaultFontSize), detailStartY, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(dtl.get("INS_AMT"), null));
                drawText(contentStream, mmTOPt(161.5f) - calTextWidth(Objects.toString(dtl.get("TAX_RATE"), ""), fonts.get("FangSongSimSun"), defaultFontSize) / 2, detailStartY, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(dtl.get("TAX_RATE"), null));
                drawText(contentStream, mmTOPt(200.5f) - calTextWidth(Objects.toString(dtl.get("TAX_AMT"), ""), fonts.get("FangSongSimSun"), defaultFontSize), detailStartY, fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(dtl.get("TAX_AMT"), null));

                detailStartY = detailStartY - mmTOPt(4.375f) * Integer.parseInt(Objects.toString(dtl.get("ROWS"), "1"));
            }
        }
        if (isShowEnd) {
            // 价税合计
            drawText(contentStream, mmTOPt(59), pageHeight - dynamicHeight - mmTOPt(57f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("SUM_AMT_CHINESE"), null));
            drawText(contentStream, mmTOPt(154), pageHeight - dynamicHeight - mmTOPt(57f), fonts.get("CourierNew"), 11, defaultContentColor, "¥");
            drawText(contentStream, mmTOPt(154) + calTextWidth("¥", fonts.get("CourierNew"), 11), pageHeight - dynamicHeight - mmTOPt(57f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("SUM_AMT"), null));

            // 备注: 回车换行
            String remarks = Objects.toString(data.get("REMARKS"), "");
            List<String> strList = new ArrayList<>();
            strNewLine(remarks, mmTOPt(194), strList, fonts.get("FangSongSimSun"), 9);

            float remarkStartX = mmTOPt(11);
            float remarksStartY = mmTOPt(33);
            for (int i = 0; i < strList.size(); i++) {
                contentStream.beginText();
                contentStream.setFont(fonts.get("FangSongSimSun"), 9);
                contentStream.setNonStrokingColor(defaultContentColor);
                contentStream.newLineAtOffset(remarkStartX, remarksStartY - mmTOPt(4 * i));
                contentStream.showText(strList.get(i));
                contentStream.endText();
            }
        }
        // 开票人
        drawText(contentStream, mmTOPt(27), mmTOPt(7.5f), fonts.get("FangSongSimSun"), defaultFontSize, defaultContentColor, Objects.toString(data.get("VOC_USER"), null));
    }


    // 计算文本宽度
    private float calTextWidth(String text, PDType0Font font, float fontSize) throws IOException {
        return font.getStringWidth(text) * fontSize / 1000.0f;
    }

    private void strNewLine(String str, float maxLength, List<String> list, PDType0Font font, float fontSize) throws IOException {
        List<String> subStrList = splitNewLine(str);
        for (int j = 0; j < subStrList.size(); j++) {
            String s = subStrList.get(j);
            if (calTextWidth(s, font, fontSize) <= maxLength)
                list.add(s);
            else {
                StringBuilder builder = new StringBuilder();
                char[] chars = s.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    String aChar = String.valueOf(chars[i]);
                    if (calTextWidth(builder + aChar, font, fontSize) > maxLength) {
                        list.add(builder.toString());
                        char[] newChar = new char[chars.length - i];
                        System.arraycopy(chars, i, newChar, 0, chars.length - i);
                        strNewLine(new String(newChar), maxLength, list, font, fontSize);
                        break;
                    } else {
                        builder.append(aChar);
                    }
                }
            }
        }
    }

    private List<String> splitNewLine(String str) {
        List<String> list = new ArrayList<>();
        String[] winsEnterSplit = str.split("\r\n");
        for (int i = 0; i < winsEnterSplit.length; i++) {
            String subStr = winsEnterSplit[i];
            String[] splits = subStr.split("\n");
            list.addAll(Arrays.asList(splits));
        }
        return list;
    }


    private static float mmTOPt(float mm) {
        return mm * POINTS_PER_MM;
    }

    private String parseDate(String dateStr) {
        if (StringUtils.isEmpty(dateStr))
            return StringUtils.EMPTY;
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate parse = LocalDate.parse(dateStr,formatter);
        return DateTimeFormatter.ofPattern("yyyy年MM月dd日").format(parse);
    }

    private void loadFonts(PDDocument document) throws IOException {
        InputStream courierNew = new FileInputStream(new File(cour));
        InputStream fangSongSimSun = new FileInputStream(new File(simFang));
        InputStream kaiti = new FileInputStream(new File(simKai));
        fonts.put("CourierNew", PDType0Font.load(document, courierNew));
        fonts.put("FangSongSimSun", PDType0Font.load(document, fangSongSimSun));
        fonts.put("Kaiti", PDType0Font.load(document, kaiti));
    }


    // 边框
    private void initDefaultRect(float pageHeight, PDPageContentStream contentStream) throws IOException {
        if (!isShowQR) {
            drawRectangle(contentStream, mmTOPt(1.5f), pageHeight - mmTOPt(26), mmTOPt(20), mmTOPt(20));// 二维码
        }
        drawRectangle(contentStream, 0, pageHeight - mmTOPt(52), mmTOPt(201), mmTOPt(22));// 购方信息
        drawRectangle(contentStream, 0, pageHeight - mmTOPt(52), mmTOPt(6), mmTOPt(22));
        drawRectangle(contentStream, mmTOPt(100.5f), pageHeight - mmTOPt(52), mmTOPt(6), mmTOPt(22));// 销方信息
        drawRectangle(contentStream, 0, pageHeight - dynamicHeight - mmTOPt(52), mmTOPt(201), dynamicHeight); // 明细

        if (isShowEnd) {
            drawRectangle(contentStream, 0, pageHeight - dynamicHeight - mmTOPt(60), mmTOPt(201), mmTOPt(8)); // 价税合计
            drawRectangle(contentStream, 0, pageHeight - dynamicHeight - mmTOPt(60), mmTOPt(52), mmTOPt(8));
            drawRectangle(contentStream, 0, pageHeight - dynamicHeight - mmTOPt(80), mmTOPt(201), mmTOPt(20));// 备注
            drawRectangle(contentStream, 0, pageHeight - dynamicHeight - mmTOPt(80), mmTOPt(6), mmTOPt(20));
        }
        drawDefaultLines(contentStream, pageHeight);
        drawRibbon(contentStream, pageHeight);
    }

    // 默认的文字
    private void initDefaultText(float pageHeight, PDPageContentStream contentStream) throws IOException {
        // 二维码
        drawText(contentStream, mmTOPt(5), pageHeight - mmTOPt(18), fonts.get("Kaiti"), 12, defaultColor, "二维码");

        // 发票号码、开票日期
        drawText(contentStream, mmTOPt(154.5f) - leftX, pageHeight - mmTOPt(14f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "发票号码：");
        drawText(contentStream, mmTOPt(154.5f) - leftX, pageHeight - mmTOPt(20f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "开票日期：");

        // 购买方信息
        drawVerticalText(contentStream, "购买方信息", mmTOPt(1.25f), pageHeight - mmTOPt(35.5f), mmTOPt(0.5f));
        drawText(contentStream, mmTOPt(7), pageHeight - mmTOPt(36.5f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "名称：");
        drawTextWithCustomSpace(contentStream, mmTOPt(7), pageHeight - mmTOPt(47f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "统一社会信用代码/纳税人识别号：", -1f);


        // 销售方信息
        drawVerticalText(contentStream, "销售方信息", mmTOPt(101.5f), pageHeight - mmTOPt(35.5f), mmTOPt(0.5f));
        drawText(contentStream, mmTOPt(107.5f), pageHeight - mmTOPt(36.5f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "名称：");
        drawTextWithCustomSpace(contentStream, mmTOPt(107.5f), pageHeight - mmTOPt(47f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "统一社会信用代码/纳税人识别号：", -1f);

        // 明细表头
        drawText(contentStream, mmTOPt(11.5f), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "项目名称");
        drawText(contentStream, mmTOPt(37.5f), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "规格型号");
        drawText(contentStream, mmTOPt(62.5f), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "单  位");
        drawText(contentStream, mmTOPt(88.5f), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "数  量");
        drawText(contentStream, mmTOPt(113.5f), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "单  价");
        drawText(contentStream, mmTOPt(139f), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "金  额");
        drawText(contentStream, mmTOPt(153), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "税率/征收率");
        drawText(contentStream, mmTOPt(190f), pageHeight - mmTOPt(56), fonts.get("Kaiti"), defaultFontSize, defaultColor, "税  额");
        // 小计、合计
        if (dataList.size() > 1) {
            drawText(contentStream, mmTOPt(16f), pageHeight - mmTOPt(47) - dynamicHeight + mmTOPt(1f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "小        计");
        }
        drawText(contentStream, mmTOPt(16f), pageHeight - mmTOPt(52f) - dynamicHeight + mmTOPt(1f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "合        计");
        if (isShowEnd) {
            // 价税合计
            drawText(contentStream, mmTOPt(12.5f), pageHeight - mmTOPt(52) - dynamicHeight - mmTOPt(5.5f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "价税合计（大写）");
            drawText(contentStream, mmTOPt(139), pageHeight - mmTOPt(52) - dynamicHeight - mmTOPt(5.5f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "（小写）");
            // 备注
            drawVerticalText(contentStream, "备注", mmTOPt(1.5f), pageHeight - mmTOPt(52) - dynamicHeight - mmTOPt(8) - mmTOPt(8), mmTOPt(3));
        }
        // 开票人
        drawText(contentStream, mmTOPt(15), mmTOPt(7.5f), fonts.get("Kaiti"), defaultFontSize, defaultColor, "开票人：");
    }

    // 票头双横线
    private void drawDefaultLines(PDPageContentStream contentStream, float pageHeight) throws IOException {
        contentStream.setStrokingColor(defaultColor);
        contentStream.moveTo(mmTOPt(61) + leftX, pageHeight - mmTOPt(18) - topY);
        contentStream.lineTo(mmTOPt(134) + leftX, pageHeight - mmTOPt(18) - topY);
        contentStream.moveTo(mmTOPt(61) + leftX, pageHeight - mmTOPt(19) - topY);
        contentStream.lineTo(mmTOPt(134) + leftX, pageHeight - mmTOPt(19) - topY);
        contentStream.stroke();
    }


    private void drawRectangle(PDPageContentStream contentStream, float startX, float startY, float width, float height) throws IOException {
        contentStream.setStrokingColor(defaultColor);
        contentStream.setLineWidth(mmTOPt(0.25f));
        contentStream.addRect(startX + leftX, startY - topY, width, height);
        contentStream.stroke();
    }

    private void drawText(PDPageContentStream contentStream, float startX, float startY, PDFont font, float fontSize, Color color, String text) throws IOException {
        if (StringUtils.isEmpty(text))
            return;
        contentStream.beginText();
        contentStream.setFont(font, fontSize);
        contentStream.setNonStrokingColor(color == null ? defaultColor : color);
        contentStream.newLineAtOffset(startX + leftX, startY - topY);
        contentStream.showText(text);
        contentStream.endText();
    }

    private void drawTextWithCustomSpace(PDPageContentStream contentStream, float startX, float startY, PDType0Font font, float fontSize, Color color, String text, float space) throws IOException {
        if (StringUtils.isEmpty(text))
            return;
        char[] chars = text.toCharArray();
        float len = 0;
        for (int i = 0; i < chars.length; i++) {
            contentStream.beginText();
            contentStream.setFont(font, fontSize);
            contentStream.setNonStrokingColor(color == null ? defaultColor : color);
            char aChar = chars[i];
            contentStream.newLineAtOffset(startX + leftX + len + space * i, startY - topY);
            contentStream.showText(String.valueOf(aChar));
            contentStream.endText();
            len += calTextWidth(String.valueOf(aChar), font, fontSize);

        }
    }


    private void drawImage(PDPageContentStream contentStream, float startX, float startY, float width, float height, String base64Code, String fileName) throws IOException {
        if (StringUtils.isEmpty(base64Code))
            return;
        String substring = base64Code.substring(base64Code.indexOf("base64,") + 7);
        byte[] decode = Base64.getDecoder().decode(substring);
        PDImageXObject imageXObject = PDImageXObject.createFromByteArray(document, decode, fileName);
        contentStream.drawImage(imageXObject, startX, startY, width, height);
    }

    private void drawCircleImage(PDPageContentStream contentStream, float startX, float startY, float radius) throws IOException {
        float x = startX + radius;
        float y = startY + radius;

        contentStream.setLineWidth(0.5f);  // 设置线宽
        contentStream.setStrokingColor(Color.BLACK);
        contentStream.moveTo(x + radius, y);
        contentStream.curveTo(x + radius, y + radius * 0.5523f, x + radius * 0.5523f, y + radius, x, y + radius);
        contentStream.curveTo(x - radius * 0.5523f, y + radius, x - radius, y + radius * 0.5523f, x - radius, y);
        contentStream.curveTo(x - radius, y - radius * 0.5523f, x - radius * 0.5523f, y - radius, x, y - radius);
        contentStream.curveTo(x + radius * 0.5523f, y - radius, x + radius, y - radius * 0.5523f, x + radius, y);
        contentStream.stroke();
        float gen2 = 1.414f;
        contentStream.moveTo(x - radius / gen2, y + radius / gen2);
        contentStream.lineTo(x + radius / gen2, y - radius / gen2);
        contentStream.stroke();
        contentStream.moveTo(x - radius / gen2, y - radius / gen2);
        contentStream.lineTo(x + radius / gen2, y + radius / gen2);
        contentStream.stroke();
    }

    // 垂直文字
    private void drawVerticalText(PDPageContentStream contentStream, String text, float startX, float startY, float gap) throws IOException {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            drawText(contentStream, startX, startY - i * (gap + mmTOPt(3)), fonts.get("Kaiti"), defaultFontSize, defaultColor, Objects.toString(aChar));
        }
    }

    // 色带
    private void drawRibbon(PDPageContentStream contentStream, float pageHeight) throws IOException {
        float startX = mmTOPt(210) - mmTOPt(4.25f);
        float endY = mmTOPt(16) + (isShowEnd ? (mmTOPt(28) + dynamicHeight + mmTOPt(22)) / 2 : (dynamicHeight + mmTOPt(22)) / 2);
        contentStream.moveTo(startX, mmTOPt(16));
        contentStream.setLineWidth(mmTOPt(0.54f));
        contentStream.setStrokingColor(new Color(246, 237, 225));
        contentStream.lineTo(startX, endY);
        contentStream.stroke();

        contentStream.moveTo(startX, mmTOPt(16));
        contentStream.setLineWidth(mmTOPt(0.54f));
        contentStream.setStrokingColor(new Color(118, 89, 84));
        contentStream.lineTo(startX, endY);
        contentStream.stroke();
    }

    private List<Map<String, Object>> handleDataMap(Map<String, Object> dataMap) throws IOException {
        List<Map<String, Object>> dataList = new ArrayList<>();
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> detail = (List<Map<String, Object>>) dataMap.get("DETAIL");
        if (detail == null || detail.size() == 0) {
            dataList.add(dataMap);
            dataMap.put("PAGE_SIZE", 1);
            dataMap.put("CUR_SIZE", 1);
            dataMap.put("IS_SHOW_END", true);
            dataMap.put("IS_SHOW_TOTAL", true);
        } else {
            List<Map<String, Object>> partDetails = new ArrayList<>();
            int lines = 0;
            for (int i = 0; i < detail.size(); i++) {
                Map<String, Object> subDetail = detail.get(i);
                String dtlName = Objects.toString(subDetail.get("DTL_NAME"), "");
                List<String> dtls = new ArrayList<>();
                strNewLine(dtlName, mmTOPt(36.5f), dtls, fonts.get("Kaiti"), defaultFontSize);
                subDetail.put("ROWS", dtls.size());
                subDetail.put("SPLIT_LIST", dtls);
                if (lines + dtls.size() > 47) {
                    // 将 dtls 拆成两部分
                    List<String> prePageDtls = new ArrayList<>();
                    List<String> nextPageDtls = new ArrayList<>();
                    for (int j = 0; j < dtls.size(); j++) {
                        if (lines + j < 47)
                            prePageDtls.add(dtls.get(j));
                        else
                            nextPageDtls.add(dtls.get(j));
                    }
                    HashMap<String, Object> pre;
                    HashMap<String, Object> next;
                    if (prePageDtls.size() > 0) {
                        pre = new HashMap<>(subDetail);
                        next = new HashMap<>();
                    } else {
                        pre = new HashMap<>();
                        next = new HashMap<>(subDetail);
                    }
                    pre.put("ROWS", prePageDtls.size());
                    pre.put("SPLIT_LIST", prePageDtls);
                    partDetails.add(pre);

                    next.put("ROWS", nextPageDtls.size());
                    next.put("SPLIT_LIST", nextPageDtls);

                    HashMap<String, Object> newMap = new HashMap<>(dataMap);
                    newMap.put("DETAIL", partDetails);
                    dataList.add(newMap);
                    lines = nextPageDtls.size();
                    partDetails = new ArrayList<>();
                    partDetails.add(next);
                    if (detail.size() == (i + 1)) {
                        newMap = new HashMap<>(dataMap);
                        newMap.put("DETAIL", partDetails);
                        dataList.add(newMap);
                    }
                } else {
                    lines += dtls.size();
                    partDetails.add(subDetail);
                    if (detail.size() == (i + 1)) {
                        HashMap<String, Object> newMap = new HashMap<>(dataMap);
                        newMap.put("DETAIL", partDetails);
                        dataList.add(newMap);
                    }
                }
            }
        }
        // 处理最后一页内容，超过42行的，取最后一行换页处理
        Map<String, Object> map = dataList.get(dataList.size() - 1);
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> lastDetailList = (List<Map<String, Object>>) map.get("DETAIL");
        int rows = detail == null ? 0 : Math.toIntExact(lastDetailList.stream().mapToInt(v -> Integer.parseInt(Objects.toString(v.get("ROWS"), "0"))).sum());
        if (rows > 42) {
            // 最后一条明细
            Map<String, Object> subDetail = lastDetailList.get(lastDetailList.size() - 1);
             int rs = Integer.parseInt(subDetail.get("ROWS").toString());
            if (rs > 1) {
                subDetail.put("ROWS", rs - 1);
                @SuppressWarnings("unchecked")
                List<String> dds = (List<String>) subDetail.get("SPLIT_LIST");
                String lastRow = dds.remove(dds.size() - 1);
                Map<String, Object> lastSub = ImmutableMap.of("ROWS", 1, "SPLIT_LIST", Collections.singletonList(lastRow));
                HashMap<String, Object> lastDataMap = new HashMap<>(map);
                lastDataMap.put("DETAIL", Collections.singletonList(lastSub));
                dataList.add(lastDataMap);
            } else {
                subDetail = lastDetailList.remove(lastDetailList.size() - 1);
                HashMap<String, Object> lastDataMap = new HashMap<>(map);
                lastDataMap.put("DETAIL", Collections.singletonList(subDetail));
                dataList.add(lastDataMap);
            }
        }
        for (int i = 0; i < dataList.size(); i++) {
            Map<String, Object> newMap = dataList.get(i);
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> part = (List<Map<String, Object>>) newMap.get("DETAIL");
            newMap.put("PAGE_SIZE", dataList.size());
            newMap.put("CUR_SIZE", i + 1);
            newMap.put("AMT_SUB_TOTAL", part.stream().map(d -> new BigDecimal(Objects.toString(d.get("INS_AMT"), "0"))).reduce(BigDecimal.ZERO, BigDecimal::add));
            newMap.put("TAX_SUB_TOTAL", part.stream().filter(d -> !Objects.equals(d.get("TAX_AMT"), "***")).map(d -> new BigDecimal(Objects.toString(d.get("TAX_AMT"), "0"))).reduce(BigDecimal.ZERO, BigDecimal::add));
            newMap.put("IS_SHOW_END", (i + 1) == dataList.size());
            newMap.put("IS_SHOW_TOTAL", true);
        }
        return dataList;
    }
}
