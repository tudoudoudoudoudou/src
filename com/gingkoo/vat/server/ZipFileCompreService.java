package com.gingkoo.vat.server;

import com.gingkoo.rpt.common.server.SysParamService;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Component(value = "zipFileCompreService")
public class ZipFileCompreService {

    private static final String property = File.separator;

    /**
     * zipFileCompre 指定附件存放地址打包为ZIP包
     * @param zipPath zip包存放路径
     * @param exportPath 打包文件根目录
     * @throws IOException
     */
    public void zipFileCompre(String zipPath, String exportPath) throws IOException {

        String zipFileName = zipPath.substring(zipPath.lastIndexOf(property)+1);
        File exportPathFiles = new File(exportPath);

        FileOutputStream fileOutputStream = null;
        ZipOutputStream zipOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(zipPath);
            zipOutputStream = new ZipOutputStream(fileOutputStream);

            zipFolder(exportPathFiles,"", zipFileName ,zipOutputStream);

        } catch (IOException ioException){
            throw ioException;
        } finally {
            if(zipOutputStream != null){
                try{
                    zipOutputStream.close();
                }catch (IOException ioException){
                    throw ioException;
                }
            }
            if(fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }catch (IOException ioException){
                    throw ioException;
                }
            }
        }
    }


    /**
     * zipFolder 附件文件压缩
     * @param folderToZip 附件存放根目录
     * @param exportPath  zip包中存放路径
     * @param zipFileName  zip包名称
     * @param zipOutputStream Zip输出流
     * @throws IOException
     */
    public void zipFolder(File folderToZip, String exportPath,String zipFileName, ZipOutputStream zipOutputStream) throws IOException {
        File[] files = folderToZip.listFiles();
        if(files != null){
            for (File file:files){
                if(!zipFileName.equals(file.getName())){
                    if(file.isDirectory()){

                        zipFolder(file,exportPath.length() == 0 ? file.getName() : exportPath + property + file.getName(),zipFileName,zipOutputStream);

                    }else{
                        ZipEntry zipEntry = new ZipEntry((exportPath.length() == 0 ? exportPath : exportPath+ property) + file.getName());
                        zipOutputStream.putNextEntry(zipEntry);

                        byte[] bytes = new byte[1024];
                        FileInputStream fileInputStream = new FileInputStream(file);
                        int length;
                        while ((length = fileInputStream.read(bytes)) >= 0) {
                            zipOutputStream.write(bytes, 0, length);
                        }

                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    }
                }
            }
        }
    }
}
