package com.gingkoo.vat.server;

import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.api.orm.mybatis.exception.UMybatisDataAccessException;
import com.gingkoo.gal.core.serivce.callback.CallbackImpl;
import com.gingkoo.gal.data.page.Page;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gal.util.uuid.UUuidUtils;
import com.gingkoo.rpt.common.server.BasFuncService;
import com.gingkoo.rpt.common.server.ContextService;
import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.rpt.main.server.RptCommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.net.InetAddress;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;


@Component
public class TempFileImportUploadService extends RptCommonService {
    private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
    private static Logger Log = LoggerFactory.getLogger(TempFileImportUploadService.class);
    private static String property;

    static{
        property = System.getProperty("file.separator");
    }

    public TempFileImportUploadService(){
    }

    public TempFileImportUploadService(MyBatisSessionTemplate myBatisSessionTemplate){
        this.myBatisSessionTemplate = myBatisSessionTemplate;
    }

    /**
     * getDefaultWorkDate 获取默认工作日期
     * @param header 头部信息
     * @param dataMap 数据信息
     * @return Callback
     */
    public static Callback getDefaultWorkDate(Map<String, String> header, Map<String, String> dataMap) {
        String workDate = SysParamService.getWorkDate(ContextService.getDepartId(header));
        Map resultMap = new HashMap();
        resultMap.put("work_date", workDate);
        List resultList = new ArrayList();
        resultList.add(resultMap);
        Callback cb = new CallbackImpl();
        cb.setCallbackData(resultList);
        return cb;
    }

    /**
     * tempFileNameDetection 查看是否存在相关模板，若存在更新模板替换日志
     * @param header 头部信息
     * @param dataMap 数据信息
     * @return Callback
     */
    public Callback tempFileNameDetection(Map<String, String> header, Map<String, String> dataMap){
        Callback callback = new CallbackImpl();
        String fileName = dataMap.get("FILE_NAME");
        if(fileName.contains(",")){callback.setErrorCode("-1");callback.setErrorMessage("一次仅能上传一个文件");return callback;}
        Boolean flag = false;

        List<Map<String, String>> fileNames = new ArrayList<>();
        File warPath = new File(getWarFilePath());
        listFilesInDirectory(fileNames, warPath);
        Iterator<Map<String, String>> iterator = fileNames.iterator();

        logger.info("warPath :"+warPath.getPath());

        while(iterator.hasNext()){
            Map<String, String> next = iterator.next();
            if(next.get("FileName").equals(fileName)){
                dataMap.put("FileName",next.get("FileName"));
                dataMap.put("Path",next.get("Path"));
                dataMap.put("LocalPath", getLocalFilePath(fileName));
                logger.info("*************fileName :"+next.get("FileName"));
                logger.info("*************Path :"+next.get("Path"));
                flag = true;
                break;
            }
        }

        if(flag){
            Map<String, String> map = insertTempFileUploadLog(header, dataMap);

            if("0".equals(map.get("ErrorCode"))){
                callback.setCallbackData(map.get("ErrorMessage"));
                return callback;
            }else{
                callback.setErrorCode(map.get("ErrorCode"));
                callback.setErrorMessage(map.get("ErrorMessage"));
                return callback;
            }
        }else{
            callback.setErrorCode("-1");
            callback.setErrorMessage("上传错误：未找到上传文件模板");
            return callback;
        }
    }

    /**
     * tempFileUploadLogParam 模板文件日志数据查询
     * @param header 头部信息
     * @param dataMap 数据信息
     * @return Page<Object>
     */
    public Page<Object> tempFileUploadLogParam(Map<String, String> header, Map<String, String> dataMap) {
        dataMap.put("ORDERBY", "UPLOAD_TIME DESC");
        return this.myBatisSessionTemplate.selectPage("com.gingkoo.rpt.imp.server.TempFileImportUploadSql.select_tempFileUploadLog", dataMap,BasFuncService.str2Int((String)header.get("__PAGEINDEX__"), 1), BasFuncService.str2Int((String)header.get("__COUNT__"), SysParamService.pageSize));
    }

    /**
     * queryTempFileUploadLogByDataId 获取模板文件日志明细
     * @param data_id 数据ID
     * @return Map<String,String>
     */
    public Map<String,String> queryTempFileUploadLogByDataId(String data_id){
        return this.myBatisSessionTemplate.selectOne("com.gingkoo.rpt.imp.server.TempFileImportUploadSql.select_tempFileUploadLogByDataId",data_id);
    }

    /**
     * queryTempFileUploadLogByLatestTime 获取最新一笔文件上传失败记录
     * @param fileName 文件名称
     * @return Map<String,String>
     */
    public Map<String,String> queryTempFileUploadLogByLatestTime(String fileName){
        Map<String, String> map = new HashMap<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        map.put("FILLER1", "上传失败");
        map.put("FILE_NAME", fileName);
        map.put("UPLOAD_TIME",dateFormat.format(new Date())+"%");
        return this.myBatisSessionTemplate.selectOne("com.gingkoo.rpt.imp.server.TempFileImportUploadSql.select_tempFileUploadLogByLatestTime",map);
    }

    /**
     * updateTempFileUploadLog 更新上传状态为上传成功
     * @param data_id 数据ID
     * @return Integer
     */
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public Integer updateTempFileUploadLog(String data_id){
        Map<String, String> map = new HashMap<>();
        map.put("DATA_ID", data_id);
        map.put("FILLER1","上传成功");
        return this.myBatisSessionTemplate.update("com.gingkoo.rpt.imp.server.TempFileImportUploadSql.update_tempFileUploadLogByDataId",map);
    }

    /**
     * insertTempFileUploadLog 插入模板替换日志
     * @param header 数据头部
     * @param dataMap 数据集合
     * @return Map<String,String>
     */
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public Map<String,String> insertTempFileUploadLog(Map<String, String> header, Map<String, String> dataMap) {
        Map<String,String> map = new HashMap<String,String>();
        String userId = ContextService.getUserName(header);
        String senIp = "";
        InetAddress addr = null;

        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException var12) {
            var12.printStackTrace();
        }

        String ip = addr.getHostAddress();
        dataMap.put("user_id", userId);
        //查询用户最近一期登录信息
        List dataList = this.myBatisSessionTemplate.selectList("com.gingkoo.rpt.main.server.mainSql.select_LoginInfo_msq", dataMap);
        if (dataList.size() != 0) {
            Map<String, String> dataRow0 = (Map)dataList.get(0);
            senIp = (String)dataRow0.get("ip");
        }

        dataMap.put("DATA_ID", UUuidUtils.UUID());
        dataMap.put("WORK_DATE", DATE_FORMAT.format(new Date()));
        dataMap.put("FILE_NAME", dataMap.get("FileName"));
        dataMap.put("TARGET_PATH", dataMap.get("Path"));
        dataMap.put("SND_IP", senIp);//用户IP
        dataMap.put("REC_IP", ip);//服务端IP
        dataMap.put("UPLOAD_TIME", DATE_TIME_FORMAT.format(new Date()));
        dataMap.put("UPLOADER", ContextService.getUserName(header));//获取用户名称
        dataMap.put("FILLER1", "上传失败");//标识
        dataMap.put("FILLER2", dataMap.get("Path"));//web项目模板文件路径
        dataMap.put("FILLER3", dataMap.get("LocalPath"));//本地模板文件路径

        try {
            this.myBatisSessionTemplate.insert("com.gingkoo.rpt.imp.server.TempFileImportUploadSql.insert_tempFileUploadLog", dataMap);
            map.put("ErrorCode","0");
            map.put("ErrorMessage", dataMap.get("DATA_ID"));
            return map;
        } catch (UMybatisDataAccessException var11) {
            Log.error(var11.getMessage(), var11);
            map.put("ErrorCode","-1");
            map.put("ErrorMessage","上传日志表数据插入错误：" + var11.getMessage());
            return map;
        }
    }

    /**
     * getWarFilePath 获取项目模板文件存放路径
     * @return String
     * @throws URISyntaxException 
     */
    public String getWarFilePath() {
    	Path path = null;
		try {
			path = Paths.get(getClass().getResource("/").toURI()).
					getParent().getParent().resolve("home").resolve("template");
		} catch (URISyntaxException e) {
			logger.error("get war file path failed error is : {}", e);
		}
    	
    	return path.toAbsolutePath().toString();
    	
      //  return Objects.requireNonNull(getClass().getResource("/"),"获取class文件根目录失败").getPath().replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property)
        //        .replace("WEB-INF" + property + "classes" + property, "home" + property + "template" + property);
    }

    /**	
     * getLocalFilePath 获取本地模板文件存放路径
     * @param warFilePath 系统模板文件存放路径
     * @return String
     */
    public String getLocalFilePath(String fileName){
        return Paths.get(SysParamService.getSysParamDir("0003|0011"), fileName).toAbsolutePath().toString();
        		
        	//	warFilePath.replace(getWarFilePath().substring(1), SysParamService.getSysParamDir("0003|0011"))
            //    .replace("\\", property).replace("/", property).replace("\\\\", property).replace("//", property);
    }

    /**
     * listFilesInDirectory 遍历指定文件夹下的所有文件信息
     * @param files 文件信息存放LIST
     * @param file 遍历文件
     * @return List<Map<String, String>>
     */
    public List<Map<String, String>> listFilesInDirectory(List<Map<String, String>> files,File file){
        if(file.isDirectory()){
            File[] dirFile = file.listFiles();
            for (int i = 0; i < dirFile.length; i++) {
                files = listFilesInDirectory(files,dirFile[i]);
            }
            return files;
        }else{
            Map<String, String> fileMap = new HashMap<>();
            fileMap.put("FileName",file.getName());
            fileMap.put("Path",file.getPath());
            files.add(fileMap);
            return files;
        }
    }
    
    public static void main(String[] args) {
		new TempFileImportUploadService().getWarFilePath();
	}

}

