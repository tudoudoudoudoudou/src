package com.gingkoo.vat.client;

import java.util.Map;
import java.util.HashMap;

import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.form.fields.events.BlurEvent;
import com.gingkoo.gui.ui.component.client.form.fields.events.BlurListener;
import com.gingkoo.gui.ui.component.client.form.fields.events.ChangeEvent;
import com.gingkoo.gui.ui.component.client.form.fields.events.ChangeListener;
import com.gingkoo.gui.ui.component.client.form.fields.events.FocusEvent;
import com.gingkoo.gui.ui.component.client.form.fields.events.FocusListener;
import com.gingkoo.gui.ui.component.client.upload.UploadListener;
import com.google.gwt.core.client.GWT;
import com.smartgwt.client.widgets.form.fields.UploadItem;

public class TempFileImportUploadCust extends TempFileImportUpload {

	@Override
	protected void setting() {
	this.setPageID("");
	}
	
	@Override
	protected void beforeRender() {
		super.beforeRender();
		FORM_WORK_DATE.hide();
		SelectUploadLog();
	}
	
	private void SelectUploadLog() {
		Map<String,String> param=new HashMap<String,String>();
		//清空浏览框中的值 
		upload1.getUploadItem(0).clearValue();
		queryCommand.setCommandService("tempFileImportUploadService", "tempFileUploadLogParam");
		queryCommand.execute(new CommandCallback() {
 			@Override
 			public void onCallback(boolean status, Callback callback, String commandItemName) {
 				if (!status) {
 					UPrompt.alert("模板文件上传log查询失败", "模板文件上传log查询失败，错误信息：" + callback.getErrorMessage());
 				} 
 			}
		});
	}

	@Override
	protected void bindEvent() {
		//配置 导入文件上传的Servlet
		upload1.setFileType("TempImport");
		upload1.setServletPath(GWT.getModuleBaseURL() + "../actions/tempUpload/processFiles");
        //一个文件上传到java服务端完毕后触发此事件
        upload1.setUploadListener(new UploadListener() {
            @Override
            public void uploadComplete(Boolean success, String filename,String desc) {
               if (!success) {
                   UPrompt.alert("提示", filename+"文件上传出错，请重新上传！");
                   return;
               }
               if (filename == null || "".equals(filename.trim())) {
                   UPrompt.alert("提示", filename+"文件上传出错，请重新上传");
                    return;
               }
               UPrompt.alert("提示", "文件上传成功");
			   SelectUploadLog();

             }
        });

		this.FORM_WORK_DATE.addBlurListener(new BlurListener(){
			@Override
			public void onBlur(BlurEvent event) {
				// TODO Auto-generated method stub
				//SC.say("onBlur");
				System.out.println("ONBLUR EVENT");
				if ("0001".equals(FORM_WORK_DATE.getValue()))
				{
				FORM_WORK_DATE.setVisible(false);
				FORM_WORK_DATE.getForm().redraw();
				}
			}
		});
		this.FORM_WORK_DATE.addFocusListener(new FocusListener(){
			@Override
			public void onFocus(FocusEvent event) {
				// TODO Auto-generated method stub
				//SC.say("onFocus");
				System.out.println("ONFOCUS EVENT");
			}
		});
		this.FORM_WORK_DATE.addChangeListener(new ChangeListener(){
			@Override
			public void onChange(ChangeEvent event) {
				// TODO Auto-generated method stub
				//SC.say("onChange");
				System.out.println("ONCHANGE EVENT");
			}
		});

		this.uploadBtn.addClickListener(new ClickListener(){
			@Override
			public void onClick(ClickEvent event) {
				Map<String, String> dataMap = new HashMap<String, String>();
				String fileName = upload1.getFile();
				fileName = fileName.substring(fileName.lastIndexOf('\\')+1,fileName.length()-1);
				dataMap.put("FILE_NAME", fileName);
				fileNameDetection.setExtraInfo(dataMap);
				fileNameDetection.setCommandService("tempFileImportUploadService", "tempFileNameDetection");
				fileNameDetection.execute(new CommandCallback() {
					@Override
					public void onCallback(boolean status, Callback callback, String commandItemName) {
						if (!status) {
							UPrompt.alert("文件名称有误:", callback.getErrorMessage());
						}else {
							upload1.setHiddenItem("DATA_ID", (String) callback.getCallbackData());
							upload1.submit();
						}
					}
				});
				   
			}
		});
		
      
	}
}