package com.gingkoo.vat.pdf;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 将PDF文件打成压缩包
 */


public class ComPress {
    private static Logger logger = LoggerFactory.getLogger(ComPress.class);

    public static int mkZip(List<String> filePaths, String zipFilePath, Boolean keepDirStructure) throws IOException {
        byte[] buf = new byte[1024];
        File zipFile = new File(zipFilePath);
        //zip文件不存在，则创建文件，用于压缩
        if (!zipFile.exists())
            zipFile.createNewFile();
        int fileCount = 0;//记录压缩了几个文件？
        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
            for (int i = 0; i < filePaths.size(); i++) {
                String relativePath = filePaths.get(i);
                if (StringUtils.isEmpty(relativePath)) {
                    logger.info(relativePath + "该路径为空");
                    //filePaths.remove(relativePath);
                    continue;
                }
                File sourceFile = new File(relativePath);//绝对路径找到file
                if (sourceFile == null || !sourceFile.exists()) {
                    logger.info(sourceFile + "该路径下没有此文件"+"----该客户号没有明细记录生成,未生成该发票");
                    continue;
                }
                FileInputStream fis = new FileInputStream(sourceFile);
                if (keepDirStructure != null && keepDirStructure) {
                    //保持目录结构
                    zos.putNextEntry(new ZipEntry(relativePath));
                } else {
                    //直接放到压缩包的根目录
                    zos.putNextEntry(new ZipEntry(sourceFile.getName()));
                }
                int len;
                while ((len = fis.read(buf)) > 0) {
                    zos.write(buf, 0, len);
                }
                fis.close();
                zos.closeEntry();
                fileCount++;
            }
            zos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileCount;
    }
}