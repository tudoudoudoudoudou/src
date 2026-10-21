package com.gingkoo.gal.mail.javamail.sender;

import com.gingkoo.gal.api.mail.UMailCommonConfig;
import com.gingkoo.gal.api.mail.UMailMessage;
import com.gingkoo.gal.api.mail.exception.MailException;
import com.gingkoo.gal.api.mail.exception.MailMessageException;
import com.gingkoo.gal.api.mail.exception.MailServerException;
import com.gingkoo.gal.api.mail.javamail.sender.UMailSender;
import com.gingkoo.gal.exception.category.common.UIllegalArgumentException;
import com.sun.xml.bind.v2.runtime.reflect.Lister.Pack;

import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UMailSenderImpl implements UMailSender {
	private static final long serialVersionUID = -3066472373390699043L;
	private static final Logger logger = LoggerFactory.getLogger(UMailSenderImpl.class);
	private UMailCommonConfig mailConfig;

	public void send(UMailMessage UMailMessage) throws MailMessageException, MailServerException, MailException {
		String host = this.mailConfig.getSmtpHost();
		String user = this.mailConfig.getUser();
		String password = this.mailConfig.getPassword();
		String from = UMailMessage.getFrom();
		String to = UMailMessage.getTo();
		String cc = UMailMessage.getCc();
		String bcc = UMailMessage.getBcc();
		String subject = UMailMessage.getSubject();
		String body = UMailMessage.getBody();
		ArrayList attachments = UMailMessage.getAttachments();

		try {
			Properties props = new Properties();
			props.setProperty("mail.transport.protocol", "smtp");
			props.setProperty("mail.smtp.host", host);
			props.put("mail.smtp port", this.mailConfig.getSmtpPort());
			props.setProperty("mail.smtp.socketFactory.class","javax.net.ssl.5SLSocketFactory");
			props.setProperty("mail.smtp.auth","false");// 需要请求认证"
			props.put("mail.smtp.ssl.enable", this.mailConfig.isSmtpSslEnable());// 开启ss1 //关闭
			
			Session ssn = Session.getInstance(props);
			ssn.setDebug(true);// turn on debug module
			
			MimeMessage message = new MimeMessage(ssn);
			InternetAddress fromAddress = new InternetAddress(from);
			message.setFrom(fromAddress);
			if (to != null && !"".equals(to.trim())) {
				String[] toArr = to.split(";");
				InternetAddress[] toAddressList = new InternetAddress[toArr.length];

				for (int i = 0; i < toArr.length; ++i) {
					toAddressList[i] = new InternetAddress(toArr[i].trim());
				}

				message.addRecipients(RecipientType.TO, toAddressList);
				InternetAddress[] bccAddressList;
				int i;
				String[] bccArr;
				if (cc != null && !"".equals(cc.trim())) {
					bccArr = cc.split(";");
					bccAddressList = new InternetAddress[bccArr.length];

					for (i = 0; i < bccArr.length; ++i) {
						bccAddressList[i] = new InternetAddress(bccArr[i].trim());
					}

					message.addRecipients(RecipientType.CC, bccAddressList);
				}

				if (bcc != null && !"".equals(bcc.trim())) {
					bccArr = bcc.split(";");
					bccAddressList = new InternetAddress[bccArr.length];

					for (i = 0; i < bccArr.length; ++i) {
						bccAddressList[i] = new InternetAddress(bccArr[i].trim());
					}

					message.addRecipients(RecipientType.BCC, bccAddressList);
				}

				message.setSubject(subject);
				Multipart multipart = new MimeMultipart();
				MimeBodyPart messageBodyPart = new MimeBodyPart();
				messageBodyPart.setContent(body, "text/html; charset=UTF-8");
				multipart.addBodyPart(messageBodyPart);
				if (attachments != null && attachments.size() > 0) {
					for (int j = 0; j < attachments.size(); ++j) {
						String filePath = (String) attachments.get(j);
						if (filePath != null && !"".equals(filePath.trim())) {
							filePath = filePath.trim();
							int lastIndex = filePath.lastIndexOf(File.separator);
							String fileName;
							if (lastIndex < 0) {
								fileName = filePath;
							} else {
								fileName = filePath.substring(filePath.lastIndexOf(File.separator) + 1);
							}

							messageBodyPart = new MimeBodyPart();
							DataSource source = new FileDataSource(filePath);
							messageBodyPart.setDataHandler(new DataHandler(source));
							messageBodyPart.setFileName(MimeUtility.encodeWord(fileName, "GB2312", (String) null));
							multipart.addBodyPart(messageBodyPart);
						}
					}
				}

				message.setContent(multipart);
				/*Transport transport = ssn.getTransport("smtp");
				if(StringUtils.isBlank(user)){
					transport.connect();
				}else{
					if(StringUtils.isBlank(password)){
						transport.connect(host, user);
					}else{
						transport.connect(host, user, password);
					}
				}
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();*/
				Transport.send(message, message.getAllRecipients());
			} else {
				throw new UIllegalArgumentException("收件人地址不能为空");
			}
		} catch (AddressException var25) {
			logger.error(var25.getMessage(), var25);
			throw new MailServerException(var25);
		} catch (NoSuchProviderException var26) {
			logger.error(var26.getMessage(), var26);
			throw new MailServerException(var26);
		} catch (MessagingException var27) {
			logger.error(var27.getMessage(), var27);
			throw new MailMessageException(var27);
		} catch (Exception var28) {
			logger.error(var28.getMessage(), var28);
			throw new MailException(var28);
		}
	}

	public UMailCommonConfig getMailConfig() {
		return this.mailConfig;
	}

	public void setMailConfig(UMailCommonConfig mailConfig) {
		this.mailConfig = mailConfig;
	}
}