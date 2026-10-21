package com.gingkoo.vat.server;

import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.orm.mybatis.template.MyBatisSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component("com.gingkoo.vat.server.AutoSendEmail")
public class AutoSendEmail implements Runnable{
    private static final Logger logger = LoggerFactory.getLogger(AutoSendEmail.class);

    private MyBatisSessionTemplate myBatisSessionTemplate;

    @Autowired
    private VocSendEmailService vocSendEmailService;


    AutoSendEmail(){}

    public MyBatisSessionTemplate getMyBatisSessionTemplate() {
        return this.myBatisSessionTemplate;
    }

    @Autowired
    public void setMyBatisSessionTemplate(MyBatisSessionTemplate myBatisSessionTemplate) {
        this.myBatisSessionTemplate = myBatisSessionTemplate;
    }
    /**
     * run 自动化邮件发送功能-遍历所需发送邮件的发票信息，并调用邮件发送服务发送邮件，上次未发送成功邮件，本次仍会继续发送
     * @param null
     * @return Callback
     */
    @Override
    public void run() {
        List<Map<String,String>> sendEmailVocList = myBatisSessionTemplate.selectList("com.gingkoo.vat.server.VocSendEmailSql.select_sendEmailVoc");
        Iterator<Map<String, String>> iterator = sendEmailVocList.iterator();
        while(iterator.hasNext()){
            HashMap<String, String> dataMap = new HashMap<String,String>();
            dataMap.put("resendFlag", "N");

            Map<String, String> sendEmailVoc = iterator.next();
            if("2".equals(sendEmailVoc.get("VOC_TYPE"))) dataMap.put("EMAIL_TYPE", "RedVocIss_Email");
            else dataMap.put("EMAIL_TYPE", "VocSendEmail_Temp_cn");
            dataMap.putAll(sendEmailVoc);
            Callback callback = vocSendEmailService.vocSendEmail(dataMap);
            if ("-1".equals(callback.getErrorCode())){
                logger.error("SEND EMAIL FAILED, THE ERROR IS : "+callback.getErrorMessage());
            }
        }
    }
}
