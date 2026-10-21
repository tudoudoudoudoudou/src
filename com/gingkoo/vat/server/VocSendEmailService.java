package com.gingkoo.vat.server;

import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.api.mail.UMailMessage;
import com.gingkoo.gal.api.mail.UMailServer;
import com.gingkoo.gal.api.mail.exception.MailException;
import com.gingkoo.gal.api.mail.exception.MailMessageException;
import com.gingkoo.gal.api.mail.exception.MailServerException;
import com.gingkoo.gal.core.serivce.callback.CallbackImpl;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import com.gingkoo.gui.service.server.exception.BizException;
import com.gingkoo.rpt.common.server.GrpSeqHelper;
import com.gingkoo.rpt.common.server.SysParamService;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCustomer;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatCustomerExample;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVoc;
import com.gingkoo.rpt.dbsvr.server.bean.PmVatOVocExample;
import com.gingkoo.rpt.dbsvr.server.dao.PmVatCustomerMapper;
import com.gingkoo.rpt.dbsvr.server.dao.PmVatOVocMapper;
import com.gingkoo.rpt.main.server.RptCommonService;
import java.lang.reflect.Field;
import java.math.BigDecimal;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.mail.internet.MimeUtility;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

@Component(value = "vocSendEmailService")
public class VocSendEmailService extends RptCommonService {
    private static Logger Log = LoggerFactory.getLogger(VocSendEmailService.class);

    @Autowired
    private UMailServer uMailServer;
    @Autowired
    private FreeMarkerTemplateEngine freeMarkerTemplateEngine;
    @Autowired
    private MyBatisSessionTemplate myBatisSessionTemplate;
    @Autowired
    private PmVatOVocMapper pmVatOVocMapper;
    @Autowired
    private PmVatCustomerMapper pmVatCustomerMapper;
    @Autowired
    private VocEmailFileAttachment vocEmailFileAttachment;

    @Value("${gal.mail.config.mailbox.subject}")
    private String mailSubject;

    private String recipient;


    public VocSendEmailService(){}


    /**
     * batchVocSendEmail 批量邮件发送
     * @param header 头部信息
     * @param dataMapList 批量数据信息
     * @return Callback
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback batchVocSendEmail(Map<String,String> header,List<Map<String,String>> dataMapList){
        Callback cb = new CallbackImpl();
        Iterator<Map<String, String>> iterator = dataMapList.iterator();
        while(iterator.hasNext()){
            Map<String, String> dataMap = iterator.next();
            Callback callback = vocSendEmail(header, dataMap);
            if ("-1".equals(callback.getErrorCode())){
                cb.setErrorCode("-1");
                cb.setErrorMessage(callback.getErrorMessage());
                return cb;
            }
        }
        cb.setCallbackData("发送完成");
        return cb;
    }

    public Callback vocSendEmail(Map<String,String> dataMap){
        Map<String, String> header = new HashMap<String, String>();
        return vocSendEmail(header, dataMap);
    }

    /**
     * vocSendEmail 邮件发送
     * @param header 头部信息
     * @param dataMap 数据信息
     * @return Callback
     */
    public Callback vocSendEmail(Map<String, String> header, Map<String, String> dataMap){
        Callback callback = new CallbackImpl();
        PmVatCustomer customer = null;
        PmVatOVoc pmVatOVoc = null;
        dataMap.put("OCC_STATUS","Y");
        dataMap.put("ATTACHMENTS","");
        UMailMessage uMailMessage = null;

        String redVocIssSendFlag = SysParamService.getSysParamDir("2105|RedVocIss.SendFlag");
        String vocRedReviseSendFlag = SysParamService.getSysParamDir("2105|VocRedRevise.SendFlag");
        String userEmailGroup = SysParamService.getSysParamDir("2105|RedVocNoteEmail");
        String rpaUserName = SysParamService.getSysParamDir("2999|rpaUserName");

        if("RedVocIss_Email".equals(dataMap.get("EMAIL_TYPE"))){
            if("N".equals(redVocIssSendFlag)) return callback;
        }else if("OVocRedRevise_Email".equals(dataMap.get("EMAIL_TYPE"))){
            if("N".equals(vocRedReviseSendFlag)) return  callback;
        }

        //获取客户信息与发票信息
        try {
            //获取发票信息
            if(StringUtils.isNotBlank(dataMap.get("VOC_NO"))){
                pmVatOVoc = getListVatVocByVocNo(dataMap.get("VOC_NO"));
            } else if(StringUtils.isNotBlank(dataMap.get("RSV2")) && "Y".equals(dataMap.get("resendFlag"))){
                pmVatOVoc = getListVatVocByDataId(dataMap.get("RSV2"));
            } else if (StringUtils.isNotBlank(dataMap.get("DATA_ID")) && "N".equals(dataMap.get("resendFlag"))){
        	    pmVatOVoc = getListVatVocByDataId(dataMap.get("DATA_ID"));
            } else if (StringUtils.isNotBlank(dataMap.get("RSP_NO")) && "N".equals(dataMap.get("resendFlag"))){
        	    pmVatOVoc = getListVatVocByRspNo(dataMap.get("RSP_NO"));
            } else {
                pmVatOVoc = getVocByDataMap(dataMap);
            }

            //获取客户信息
            if("OVocRedRevise_Email".equals(dataMap.get("EMAIL_TYPE")) && "OVocRedRevise".equals(dataMap.get("MENU_NAME"))){
                if(rpaUserName.equals(pmVatOVoc.getDataCrtUser())){
                    //rpa录入的时候需要发送通知邮件
                    customer = new PmVatCustomer();
                    customer.setContEmail(userEmailGroup);//直接放配置好的邮件组
                }else{
                    callback.setErrorCode("-1");
                    callback.setErrorMessage("该红字发票录入不为rpa录入,不发送邮件");
                    return callback;
                }
            } else if("OVocRedRevise_Email".equals(dataMap.get("EMAIL_TYPE")) && "OVocRedOffLine".equals(dataMap.get("MENU_NAME"))){
                //发票结果回传回来的时候，若红字发票结果不为已打印那么也需要发送通知邮件
        	//需要判断录入结果的人是否为RPA
                if(!"02".equals(pmVatOVoc.getVocStat()) && rpaUserName.equals(dataMap.get("subMitUserName"))){
                    //失败的红字发票没有发票号码不能用发票号码查询
                    customer = new PmVatCustomer();
                    customer.setContEmail(userEmailGroup);//直接放配置好的邮件组
                }else{
                    callback.setErrorCode("-1");
                    callback.setErrorMessage("手工录入红字发票开具结构,不发送邮件");
                    return callback;
                }
            } else {
                customer = getListCustomerByCustNo(dataMap.get("CUST_NO"));
            }

        } catch (BizException | NoSuchFieldException | IllegalAccessException e) {
            callback.setErrorCode("-1");
            callback.setErrorMessage(e.getMessage());
            dataMap.put("OCC_STATUS","N");
            dataMap.put("CONTENT","");
            dataMap.put("ErrorMessage",e.getMessage());
            generateRecord(dataMap,callback);
            e.printStackTrace();
            return callback;
        }

        //获取邮件内容
        try {
            uMailMessage = getUMailMessage(dataMap,customer,pmVatOVoc);
            //added by wolf.duan 20240923 add cc setup
            String mailCc = SysParamService.getSysParamDir("2105|mail.cc");
            if(StringUtils.isNotBlank(mailCc)){
            	uMailMessage.setBcc(mailCc);
            }
        } catch (TemplateException | IOException | IllegalAccessException e) {
            callback.setErrorCode("-1");
            callback.setErrorMessage("邮件内容生成出错");
            dataMap.put("OCC_STATUS","N");
            dataMap.put("CONTENT","");
            dataMap.put("ErrorMessage","邮件内容生成出错 "+e.getMessage());
            generateRecord(dataMap,customer,pmVatOVoc, callback);
            e.printStackTrace();
            return callback;
        }

        //是否携带附件判断
        try {
            //判断携带附件功能是否启用
            String flag = SysParamService.getSysParamDir("2105|email.attachmentFlag");
            //获取附件配置
            List<Map<String, String>> annexInfo = vocEmailFileAttachment.getAnnexInfo(dataMap.get("EMAIL_TYPE"), pmVatOVoc.getOrgId());
            if("Y".equals(flag) && annexInfo.size() > 0){
                if("N".equals(dataMap.get("resendFlag"))){
                	dataMap.put("RSV2",dataMap.get("DATA_ID"));
                }else{//重发的时候，客户名称不叫buy_name
                	dataMap.put("BUY_NAME", dataMap.get("CUST_NAME"));
                }
                vocEmailFileAttachment.createExportPath(dataMap.get("RSV2"));
                //将附件指定放置于特定文件夹下
                vocEmailFileAttachment.annexArrange(header,dataMap,annexInfo);

                //多个附件时压缩为ZIP包，单个附件时直接发送附件
                String attachmentPath = "";
                if(annexInfo.size() > 1){
                    attachmentPath = vocEmailFileAttachment.AttachmentCompressionZIP(dataMap);
                }else{
                    attachmentPath = dataMap.get("ANNEX_PATH");
                }

                //添加附件信息
                dataMap.put("ATTACHMENTS",attachmentPath);
                ArrayList<String> attachmentsList = new ArrayList<>();
                attachmentsList.add(attachmentPath);
                uMailMessage.setAttachments(attachmentsList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            callback.setErrorCode("-1");
            callback.setErrorMessage("邮件附件生成出错");
            dataMap.put("OCC_STATUS","N");
            dataMap.put("CONTENT","");
            dataMap.put("ErrorMessage","邮件附件生成出错 "+e.getMessage());
            generateRecord(dataMap,customer,pmVatOVoc, callback);
            e.printStackTrace();
            return callback;
        }

        //发送邮件
        try {
            uMailServer.sendMail(uMailMessage);
            generateRecord(dataMap,customer,pmVatOVoc, callback);
        } catch (MailMessageException | MailServerException | MailException e) {
            callback.setErrorCode("-1");
            callback.setErrorMessage("邮件发送出错");
            dataMap.put("OCC_STATUS","N");
            dataMap.put("ErrorMessage","邮件发送出错 "+e.getMessage());
            generateRecord(dataMap,customer,pmVatOVoc, callback);
            e.printStackTrace();
            return callback;
        }

        callback.setCallbackData("邮件发送成功");
        return callback;
    }

    /**
     * generateRecord 生成邮件发送记录
     * @param dataMap 数据信息
     * @param customer 客户信息
     * @param pmVatOVoc 发票信息
     * @param callback 回调对象
     * @return Callback
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback generateRecord(Map<String,String> dataMap,PmVatCustomer customer,PmVatOVoc pmVatOVoc,Callback callback){
        SimpleDateFormat dateFormatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormatTimeSimplify = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat dateFormatDate = new SimpleDateFormat("yyyyMMdd");
        GrpSeqHelper seqHelper = new GrpSeqHelper();
        seqHelper.setMyBatisSessionTemplate(myBatisSessionTemplate);

        HashMap<String, String> vocSendEmailLog = new HashMap<>();
        Map<String, String> vocMap = new HashMap<String, String>();
        vocSendEmailLog.put("DATA_ID", seqHelper.getDataId("DATA_ID_SEQ"));
        vocSendEmailLog.put("DATA_DATE", dateFormatDate.format(new Date()));
        vocSendEmailLog.put("RECIPIENT", recipient);
        vocSendEmailLog.put("CONTENT", dataMap.get("CONTENT"));
        vocSendEmailLog.put("ATTACHMENTS", dataMap.get("ATTACHMENTS"));
        vocSendEmailLog.put("TITLE", dataMap.get("TITLE"));
        vocSendEmailLog.put("CC", "");
        vocSendEmailLog.put("CUST_NO", customer.getCustNo());
        vocSendEmailLog.put("VOC_CODE", pmVatOVoc.getVocCode());
        vocSendEmailLog.put("VOC_NO", pmVatOVoc.getVocNo());
        vocSendEmailLog.put("OCC_TIME", dateFormatTime.format(new Date()));
        vocSendEmailLog.put("OCC_STATUS", dataMap.get("OCC_STATUS"));
        vocSendEmailLog.put("ANNEX_EXISTS", "");
        vocSendEmailLog.put("ANNEX_PATH", "");
        vocSendEmailLog.put("RSV1", StringUtils.isNotBlank(dataMap.get("ErrorMessage"))?dataMap.get("ErrorMessage").getBytes(StandardCharsets.UTF_8).length> 180?dataMap.get("ErrorMessage").substring(0,100):dataMap.get("ErrorMessage"):dataMap.get("ErrorMessage"));
        vocSendEmailLog.put("RSV2", dataMap.get("DATA_ID"));
        vocSendEmailLog.put("RSV3", dataMap.get("EMAIL_TYPE"));
        vocSendEmailLog.put("RSV4", dataMap.get("REPEAT_TYPE"));

        vocMap.put("EMAIL_SEND_STATUS",dataMap.get("OCC_STATUS"));
        vocMap.put("EMAIL_SEND_TIME",dateFormatTimeSimplify.format(new Date()));
        vocMap.put("EMAIL_ANNEX_EXISTS",dataMap.get("ATTACHMENTS") == null ? "N":"Y");
        vocMap.put("EMAIL_ANNEX_PATH",dataMap.get("ATTACHMENTS") == null ? "":dataMap.get("ATTACHMENTS"));
        vocMap.put("VOC_NO",pmVatOVoc.getVocNo());

        if("Y".equals(dataMap.get("resendFlag"))){
            vocSendEmailLog.put("DATA_ID",dataMap.get("DATA_ID"));
            int update = myBatisSessionTemplate.update("com.gingkoo.vat.server.VocSendEmailSql.update_vocSendEmailLogByData_id",vocSendEmailLog);
        }else{
            int insert = myBatisSessionTemplate.insert("com.gingkoo.vat.server.VocSendEmailSql.insert_vocSendEmailLog",vocSendEmailLog);
        }

        if("VocSendEmail_Temp_cn".equals(dataMap.get("EMAIL_TYPE")) || "RedVocIss_Email".equals(dataMap.get("EMAIL_TYPE"))){
            int update_voc = myBatisSessionTemplate.update("com.gingkoo.vat.server.VocSendEmailSql.update_vat_o_vocByVocNo", vocMap);
        }
        return callback;
    }

    /**
     * generateRecord 生成邮件发送记录
     * @param dataMap 数据信息
     * @param callback 回调对象
     * @return Callback
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Callback generateRecord(Map<String,String> dataMap,Callback callback){
        SimpleDateFormat dateFormatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormatTimeSimplify = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat dateFormatDate = new SimpleDateFormat("yyyyMMdd");
        GrpSeqHelper seqHelper = new GrpSeqHelper();
        seqHelper.setMyBatisSessionTemplate(myBatisSessionTemplate);

        HashMap<String, String> vocSendEmailLog = new HashMap<>();
        Map<String, String> vocMap = new HashMap<String, String>();

        vocSendEmailLog.put("DATA_ID", seqHelper.getDataId("DATA_ID_SEQ"));
        vocSendEmailLog.put("DATA_DATE", dateFormatDate.format(new Date()));
        vocSendEmailLog.put("RECIPIENT", recipient);
        vocSendEmailLog.put("CONTENT", dataMap.get("CONTENT"));
        vocSendEmailLog.put("ATTACHMENTS", dataMap.get("ATTACHMENTS"));
        vocSendEmailLog.put("TITLE", dataMap.get("TITLE"));
        vocSendEmailLog.put("CC", "");
        vocSendEmailLog.put("CUST_NO", dataMap.get("CUST_NO"));
        vocSendEmailLog.put("VOC_CODE", "");
        vocSendEmailLog.put("VOC_NO", dataMap.get("VOC_NO"));
        vocSendEmailLog.put("OCC_TIME", dateFormatTime.format(new Date()));
        vocSendEmailLog.put("OCC_STATUS", dataMap.get("OCC_STATUS"));
        vocSendEmailLog.put("ANNEX_EXISTS", "");
        vocSendEmailLog.put("ANNEX_PATH", "");
        vocSendEmailLog.put("RSV1", StringUtils.isNotBlank(dataMap.get("ErrorMessage"))?dataMap.get("ErrorMessage").getBytes(StandardCharsets.UTF_8).length> 180?dataMap.get("ErrorMessage").substring(0,100):dataMap.get("ErrorMessage"):dataMap.get("ErrorMessage"));
        vocSendEmailLog.put("RSV2", dataMap.get("DATA_ID"));
        vocSendEmailLog.put("RSV3", dataMap.get("EMAIL_TYPE"));
        vocSendEmailLog.put("RSV4", dataMap.get("REPEAT_TYPE"));

        vocMap.put("EMAIL_SEND_STATUS",dataMap.get("OCC_STATUS"));
        vocMap.put("EMAIL_SEND_TIME",dateFormatTimeSimplify.format(new Date()));
        vocMap.put("EMAIL_ANNEX_EXISTS",dataMap.get("ATTACHMENTS") == null ? "N":"Y");
        vocMap.put("EMAIL_ANNEX_PATH",dataMap.get("ATTACHMENTS") == null ? "":dataMap.get("ATTACHMENTS"));
        vocMap.put("VOC_NO",dataMap.get("VOC_NO"));

        if("Y".equals(dataMap.get("resendFlag"))){
            vocSendEmailLog.put("DATA_ID",dataMap.get("DATA_ID"));
            int update = myBatisSessionTemplate.update("com.gingkoo.vat.server.VocSendEmailSql.update_vocSendEmailLogByData_id",vocSendEmailLog);
        }else{
            int insert = myBatisSessionTemplate.insert("com.gingkoo.vat.server.VocSendEmailSql.insert_vocSendEmailLog",vocSendEmailLog);
        }

        if("VocSendEmail_Temp_cn".equals(dataMap.get("EMAIL_TYPE")) || "RedVocIss_Email".equals(dataMap.get("EMAIL_TYPE"))){
            int update_voc = myBatisSessionTemplate.update("com.gingkoo.vat.server.VocSendEmailSql.update_vat_o_vocByVocNo", vocMap);
        }
        return callback;
    }

    /**
     * getUMailMessage 生成邮件内容
     * @param dataMap 数据信息
     * @param customer 客户信息
     * @param pmVatOVoc 发票信息
     * @return UMailMessage 邮件内容
     * @throws IOException
     * @throws IllegalAccessException
     * @throws TemplateException
     */
    public UMailMessage getUMailMessage(Map<String, String> dataMap,PmVatCustomer customer,PmVatOVoc pmVatOVoc) throws TemplateException, IOException, IllegalAccessException {
        UMailMessage uMailMessage = uMailServer.obtainMessage();

        //发送目的邮箱
        if(StringUtils.isNotBlank(customer.getContEmail())){
            uMailMessage.setTo(customer.getContEmail());
            recipient = customer.getContEmail();
        }else{
            uMailMessage.setTo(dataMap.get("EMAIL_CUSTOM"));
            recipient = dataMap.get("EMAIL_CUSTOM");
        }

        Map<String, String> map = new HashMap<String,String>();
       if("Y".equals(dataMap.get("resendFlag"))) {
    	   dataMap.put("EMAIL_TYPE", dataMap.get("RSV3"));
        }
    
        map.put("EMAIL_TYPE",dataMap.get("EMAIL_TYPE") + (dataMap.get("logtype1") == null ? "":dataMap.get("logtype1"))+"_"+pmVatOVoc.getOrgId());
        Map<String,String> contentTemp = myBatisSessionTemplate.selectOne("com.gingkoo.vat.server.VocSendEmailSql.select_emailContentTemp",map);
        if(contentTemp == null){
        	map.clear();
            map.put("EMAIL_TYPE",dataMap.get("EMAIL_TYPE") + (dataMap.get("logtype1") == null ? "":dataMap.get("logtype1")));
        	contentTemp = myBatisSessionTemplate.selectOne("com.gingkoo.vat.server.VocSendEmailSql.select_emailContentTemp",map);
        }
        
        //dataMap.put("EMAIL_TYPE", map.get("EMAIL_TYPE"));
        String msg_title = StringUtils.isNotBlank(contentTemp.get("MSG_TITLE")) ? contentTemp.get("MSG_TITLE"):mailSubject;
        String tpl_date = contentTemp.get("TPL_DATA");

        Map<String, String> emailBody = getEmailBody(customer, pmVatOVoc, tpl_date, msg_title);

        //发送内容
        uMailMessage.setBody(emailBody.get("EMAIL_BODY"));

        //主题
        uMailMessage.setSubject(MimeUtility.encodeText(emailBody.get("TITLE"),"UTF-8","B"));


        dataMap.put("CONTENT",emailBody.get("EMAIL_BODY"));
        dataMap.put("TITLE",emailBody.get("TITLE"));
        return uMailMessage;
    }

    /**
     * getEmailBody 生成邮件内容
     * @param customer 客户信息
     * @param pmVatOVoc 发票信息
     * @param tpl_date 邮件美容模板
     * @return String 邮件内容
     * @throws IOException
     * @throws IllegalAccessException
     * @throws TemplateException
     */
    public Map<String,String> getEmailBody(PmVatCustomer customer,PmVatOVoc pmVatOVoc,String tpl_date,String msg_title) throws IOException, IllegalAccessException, TemplateException {
        Template mailContent;
        if(StringUtils.isNotBlank(tpl_date)){
             mailContent = new Template("mailContent", new StringReader(tpl_date),new Configuration());
        }else{
             mailContent = freeMarkerTemplateEngine.getPath("mailContent.ftl");
        }
        StringWriter content = new StringWriter();
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> returnMap = new HashMap<>();
        String oldChar = "";
        String newChar = "";

        List<Map<String,String>> contentParam = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VocSendEmailSql.select_emailContentParam");
        Iterator<Map<String,String>> iterator = contentParam.iterator();
        while(iterator.hasNext()){
            Map contentParamMap = iterator.next();
            Map<String, String> customerMap = customer.get();
            Map<String, String> pmVatOVocMap = pmVatOVoc.get();

            if("PM_VAT_CUSTOMER".equals(contentParamMap.get("TAB_SOURCE"))){
                if(customerMap.containsKey((String) contentParamMap.get("BEAN_FIELD"))){
                    map.put((String) contentParamMap.get("TMP_PARAM_FIELD"),(String) customerMap.get((String) contentParamMap.get("BEAN_FIELD")));
                    oldChar = "${"+contentParamMap.get("TMP_PARAM_FIELD")+"}";
                    newChar = StringUtils.isNotBlank(customerMap.get((String) contentParamMap.get("BEAN_FIELD"))) ? customerMap.get((String) contentParamMap.get("BEAN_FIELD")):" ";
                    msg_title = msg_title.replace(oldChar,newChar);
                }
                if(customerMap.containsKey((String) contentParamMap.get("SQL_FIELD"))){
                    map.put((String) contentParamMap.get("TMP_PARAM_FIELD"),(String) customerMap.get((String) contentParamMap.get("SQL_FIELD")));
                    oldChar = "${"+contentParamMap.get("TMP_PARAM_FIELD")+"}";
                    newChar = StringUtils.isNotBlank(customerMap.get((String) contentParamMap.get("SQL_FIELD"))) ? customerMap.get((String) contentParamMap.get("SQL_FIELD")):" ";
                    msg_title = msg_title.replace(oldChar,newChar);
                }
            }
            if ("PM_VAT_O_VOC".equals(contentParamMap.get("TAB_SOURCE"))){
                if(pmVatOVocMap.containsKey((String) contentParamMap.get("BEAN_FIELD"))){
                    map.put((String) contentParamMap.get("TMP_PARAM_FIELD"),(String) pmVatOVocMap.get((String) contentParamMap.get("BEAN_FIELD")));
                    oldChar = "${"+contentParamMap.get("TMP_PARAM_FIELD")+"}";
                    newChar = StringUtils.isNotBlank(customerMap.get((String) contentParamMap.get("BEAN_FIELD"))) ? customerMap.get((String) contentParamMap.get("BEAN_FIELD")):" ";
                    msg_title = msg_title.replace(oldChar,newChar);
                }
                if(pmVatOVocMap.containsKey((String) contentParamMap.get("SQL_FIELD"))){
                    map.put((String) contentParamMap.get("TMP_PARAM_FIELD"),(String) pmVatOVocMap.get((String) contentParamMap.get("SQL_FIELD")));
                    oldChar = "${"+contentParamMap.get("TMP_PARAM_FIELD")+"}";
                    newChar = StringUtils.isNotBlank(customerMap.get((String) contentParamMap.get("SQL_FIELD"))) ? customerMap.get((String) contentParamMap.get("SQL_FIELD")):" ";
                    msg_title = msg_title.replace(oldChar,newChar);
                }
            }
        }

        mailContent.process(map, content);

        returnMap.put("EMAIL_BODY", content.toString());
        returnMap.put("TITLE", msg_title);
        return returnMap;
    }


    /**
     * getVocByDataMap 通过前端dataMap数据获取pmVatOVoc信息
     * @param dataMap  前端数据信息
     * @return PmVatOVoc 发票信息
     * @throws BizException
     */
    public PmVatOVoc getVocByDataMap(Map<String,String> dataMap) throws NoSuchFieldException, IllegalAccessException {
        PmVatOVoc pmVatOVoc = new PmVatOVoc();
        List<Map<String,String>> contentParam = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VocSendEmailSql.select_emailContentParam");
        Map<String,String> vocMap = new HashMap<String,String>();

        Iterator<Map<String, String>> iterator = contentParam.iterator();
        while(iterator.hasNext()){
            Map<String, String> next = iterator.next();
            if("PM_VAT_O_VOC".equals(next.get("TAB_SOURCE")) && dataMap.containsKey(next.get("SQL_FIELD"))){
                vocMap.put(next.get("BEAN_FIELD"),next.get("SQL_FIELD"));
            }
        }

        Set<String> keySet = vocMap.keySet();
        for(String fieldKey:keySet){
            Field field = PmVatOVoc.class.getDeclaredField(fieldKey);

            field.setAccessible(true);
            if("java.math.BigDecimal".equals(field.getType().getName())){
                Object amt = dataMap.get(vocMap.get(fieldKey));
                BigDecimal bigDecimal = new BigDecimal(amt.toString());
                field.set(pmVatOVoc,bigDecimal);
            }else{
                field.set(pmVatOVoc,vocMap.get(fieldKey));
            }
        }

        return pmVatOVoc;
    }

    /**
     * getListVatVocByVocNo 通过发票号码获取发票信息
     * @param vocNo 发票号码
     * @return PmVatOVoc 发票信息
     * @throws BizException
     */
    private PmVatOVoc getListVatVocByVocNo(String vocNo) throws BizException {
        PmVatOVocExample pmVatOVocExample = new PmVatOVocExample();
        pmVatOVocExample.or().andVocNoEqualTo(vocNo);
        List<PmVatOVoc> pmVatOVocs = pmVatOVocMapper.selectByExample(pmVatOVocExample);
        if(pmVatOVocs.size() <= 0){
            throw new BizException("未找到发票号码为 "+vocNo+" 的相关发票");
        }
        return pmVatOVocs.get(0);
        
    }
    
    /**
     * getListVatVocByVocNo 通过发票DataID获取发票信息
     * @param dataID 发票号码
     * @return PmVatOVoc 发票信息
     * @throws BizException
     */
    private PmVatOVoc getListVatVocByDataId(String dataID) throws BizException {
        PmVatOVocExample pmVatOVocExample = new PmVatOVocExample();
        pmVatOVocExample.or().andDataIdEqualTo(dataID);
        List<PmVatOVoc> pmVatOVocs = pmVatOVocMapper.selectByExample(pmVatOVocExample);
        if(pmVatOVocs.size() <= 0){
            throw new BizException("未找到发票DATA_ID为 "+dataID+" 的相关发票");
        }        
        return pmVatOVocs.get(0);
    }
    
    
    /**
     * getListVatVocByVocNo 通过发票rspNo获取发票信息
     * @param rspNo 发票号码
     * @return PmVatOVoc 发票信息
     * @throws BizException
     */
    private PmVatOVoc getListVatVocByRspNo(String rspNo) throws BizException {
        PmVatOVocExample pmVatOVocExample = new PmVatOVocExample();
        pmVatOVocExample.or().andRspNoEqualTo(rspNo);
        List<PmVatOVoc> pmVatOVocs = pmVatOVocMapper.selectByExample(pmVatOVocExample);
        if(pmVatOVocs.size() <= 0){
            throw new BizException("未找到红字通知单为 "+rspNo+" 的相关发票");
        }  
        return pmVatOVocs.get(0);
    }
    
    /**
     * 返回红字通知单对应的具体状态
     * @param rspStatus  数据字典
     * @return  数据字典对应的具体状态
     */
    private String getRspStatusDict(String rspStatus){
        if(rspStatus == null) rspStatus = "";
        List<Map<String,String>>rspDict =  myBatisSessionTemplate.selectList("select_rspStatusDict",null);
        for(Map<String,String> tmp :rspDict){
            if(rspStatus.equals(tmp.get("META_VAL"))){
                return tmp.get("META_NAME");
            }
        }
        return rspStatus;
    }
    

    /**
     * getListCustomerByCustNo 通过发票号码获取发票信息
     * @param custNo 客户编号
     * @return PmVatCustomer 客户信息
     * @throws BizException
     */
    public PmVatCustomer getListCustomerByCustNo(String custNo) throws BizException {
        PmVatCustomerExample pmVatCustomerExample = new PmVatCustomerExample();
        pmVatCustomerExample.or().andCustNoEqualTo(custNo);
        List<PmVatCustomer> customers = pmVatCustomerMapper.selectByExample(pmVatCustomerExample);
        if(customers.size() <= 0){
            throw new BizException("在客户信息表中未找到该客户 "+custNo+" 的信息");
        }
        return customers.get(0);
    }

}
