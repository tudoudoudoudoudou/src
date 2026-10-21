package com.gingkoo.vat.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

/**
 * 生成PDF文件加密
 */
@Component
public class PdfThicken {

    public synchronized void thicken(String filePath, String ownerPassword, String userPassword) throws IOException {
        File file = new File(filePath);
        PDDocument document = PDDocument.load(file);
        AccessPermission accessPermission = new AccessPermission();
        StandardProtectionPolicy spp = new StandardProtectionPolicy(ownerPassword, userPassword, accessPermission);
        spp.setEncryptionKeyLength(128);
        spp.setPermissions(accessPermission);
        document.protect(spp);
        document.save(file.getPath());
        document.close();
    }
}








