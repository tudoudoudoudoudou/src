package com.gingkoo.vat.pdf;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Hashtable;

/**
 * 发票二维码生成
 */

public class VocImage {

    private static final int BLACK = 0xFF000000;
    private static final int WHITE = 0xFFFFFFFF;

    private static final Integer width = 500;


    private static BufferedImage createImage(String content,String shui) throws WriterException, IOException {
        Hashtable<EncodeHintType, Object> hintMap = new Hashtable();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hintMap.put(EncodeHintType.CHARACTER_SET, StandardCharsets.UTF_8.name());
        hintMap.put(EncodeHintType.MARGIN, 0);

        BitMatrix bitMatrix = new QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, width, width, hintMap);
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) ? BLACK : WHITE);
            }
        }
        Graphics2D g = image.createGraphics();
        int taxPiclength = 100;
//        BufferedImage imageOfTax = creatFontImageOfTax("税", taxPiclength, 80, 12, 75);
        BufferedImage imageOfTax = getFontImage(shui);
        int x = (width - taxPiclength) / 2;
        int y = (width - taxPiclength) / 2;
        g.drawImage(imageOfTax, x, y, null);
        Shape shape = new RoundRectangle2D.Float(x, y, taxPiclength, taxPiclength, 0, 0);
        g.setStroke(new BasicStroke(10f));
        g.draw(shape);
        g.dispose();
        image.flush();
        return image;
    }

    public static String getImgWithBase64(String content,String shui) throws IOException, WriterException {
        BufferedImage image = createImage(content,shui);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(image, "PNG", bos);
        return "data:image/png;base64," + new String(Base64.getEncoder().encode(bos.toByteArray()), StandardCharsets.UTF_8);
    }

    //
//    public static void writeImageToFile(String content, File file) throws IOException, WriterException {
//        if (!file.exists())
//            file.createNewFile();
//        BufferedImage image = createImage(content);
//        ImageIO.write(image, "PNG", file);
//    }

    /**
     * 创建文字图片
     *
     * @param text 内容
     * @return image
     */
    private static BufferedImage creatFontImageOfTax(String text, int picLength, int fontSize, int floatX, int floatY) {
        BufferedImage image = new BufferedImage(picLength, picLength, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setClip(0, 0, picLength, picLength);
        g.setColor(Color.white);

        g.fillRect(0, 0, picLength, picLength);
        g.setColor(new Color(250, 239, 173));
        g.setFont(new Font("LucidaBrightDemiBold", Font.PLAIN, fontSize));
        g.drawString(text, floatX, floatY);
        g.dispose();
        return image;
    }

    private static BufferedImage getFontImage(String shui) throws IOException {
        BufferedImage image = ImageIO.read(new File(shui));
        return image;
    }

}
