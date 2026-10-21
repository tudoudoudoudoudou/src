/**
 * 
 */
package com.gingkoo.rpt.main.client;

import java.util.HashMap;
import java.util.Map;

import com.gingkoo.gui.app.client.application.MainApplication;
import com.gingkoo.gui.app.client.application.nav.data.MenuDataItem;
import com.gingkoo.gui.app.client.application.nav.data.PageDataItem;
import com.gingkoo.gui.core.client.context.ContextHelper;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.gingkoo.gui.ui.component.client.basic.UWindow;
import com.gingkoo.gui.ui.component.client.layout.UVLayout;
import com.gingkoo.gui.ui.component.client.ocx.UOcxPrint;
import com.gingkoo.gui.ui.component.client.view.PageView;
import com.gingkoo.rpt.sys.client.ChangePasswordCallback;
import com.gingkoo.rpt.sys.client.PasswordChangeCust;
import com.gingkoo.vat.client.ocx.UOcxBaiwang;

/**
 * @author Administrator
 *
 */
public class CustMainApplication extends MainApplication implements
		ChangePasswordCallback {
	private UWindow window = new UWindow();

	@Override
	protected boolean isProductionMode() {
		return false;
	}

	@Override
	protected boolean isDevelopMode() {
		return false;
	}

	//导航栏横向竖向：false-竖向    true-横向
	@Override
	protected boolean showFavBar() {
		return true;
	}
	
	@Override
	protected void beforePreInit() {
		super.settingCorpId("TESTCORP");
		super.beforePreInit();
	}

	@Override
	protected void initMainFrame() {
		super.initMainFrame();
		UOcxPrint ocx = new UOcxPrint();
		this.mainAppLayout.addChild(ocx);
		UOcxBaiwang ocxbaiwang = new UOcxBaiwang();
		this.mainAppLayout.addChild(ocxbaiwang);
		this.getAdditionComponents().put("ocxprint", ocx);
		this.getAdditionComponents().put("ocxbaiwang", ocxbaiwang);
	}

	/**
	 * 是否允许sso登陆
	 */
	@Override
	protected boolean enableSSO(String mode) {
		if ((mode != null) && mode.equals("UCP"))
			return true;
		else
			return false;
	}

	@Override
	protected void onLogoutSuccess() {
		super.onLogoutSuccess();
		// 释放自定义的资源，例如ocx控件
		((UOcxPrint) this.getAdditionComponents().get("ocxprint")).destroy();
		((UOcxBaiwang) this.getAdditionComponents().get("ocxbaiwang")).destroy();
	}

	@Override
	protected boolean checkLogin(String username, String password) {
		return true;
	}

	@Override
	protected String getLogoTitle() {
		// TODO Auto-generated method stub
		return "<span style=\"font-family:隶书; font-size: 30px; color: #666;\">欢迎使用系统！</span>";
	}

	@Override
	public PageView getWelcomePageView() {
		return new com.gingkoo.vat.client.WelcomeCust();
	}

	@Override
	public String getWelcomePageViewTitle() {
		return "欢迎";
	}

	// @Override
	@Override
	protected boolean showTxnoBar() {
		return false;
	}

	@Override
	protected String getCopyRights() {
		return "CopyRights 金丘信息 2015";
	}

	@Override
	protected MenuDataItem[] provideMenuData(String username, String password) {
		ContextHelper.getContext().setValue("MAINSERVICEID", "MainService");
		ContextHelper.getContext().setValue("CONVERTDATEANDMONEY", "NO");
		ContextHelper.getContext().setValue("MAINSERVICENAME", "main");
		ContextHelper.getContext().setValue("Table_height", "360px");
		
		com.gingkoo.gpms.client.References.regRefs();
		com.gingkoo.vat.client.References.regRefs();
		com.gingkoo.cust.client.References.regRefs();
		
		return new MenuDataItem[] {};
	}

	@Override
	protected boolean onInitPasswordChange(String errorCode) {
		PasswordChangeCust changePasswordView = new PasswordChangeCust();
		changePasswordView.setMainApplication(this);
		changePasswordView.buildWithConfig();
		changePasswordView.bindChangePasswordCallback(this);

		window.setTitle("初始密码修改");
		window.setWidth(350);
		window.setHeight(180);
		window.setCanDrag(false);
		window.setCanDragReposition(false);
		window.setCanDragResize(false);
		window.setCanDragScroll(false);
		window.centerInPage();
		window.setAutoCenter(true);
		window.setShowMinimizeButton(false);
		window.setShowCloseButton(false);
		window.setIsModal(true);
		UVLayout contentLayout = new UVLayout();
		contentLayout.setWidth(350);
		contentLayout.setMargin(20);
		contentLayout.setHeight(350);
		contentLayout.setMembersMargin(10);
		contentLayout.setLayoutMargin(10);
		contentLayout.addChild(changePasswordView.getContent());

		window.addChild(contentLayout);
		window.show();
		return false;
	}

	@Override
	public void onChangeSuccess() {
		window.hide();
		this.gotoMainFrame();
	}

	@Override
	public void onChagneFailed() {

	}

	@Override
	public void onChangeCancel() {
		window.hide();
		this.resetLoginFrame();
	}
	
	@Override
	public Map<String, Map<String, String>> getTopMenuContent() {
			topMenuContent = new HashMap<String, Map<String, String>>();
			if (context != null) {
				String username = ContextHelper.getContext().getStringValue("USERNAME");
				String descn = ContextHelper.getContext().getStringValue("DESCN");
				String groupId = ContextHelper.getContext().getStringValue("GROUP_ID");
				String groupName = ContextHelper.getContext().getStringValue("GROUP_NAME");
				String orgId = ContextHelper.getContext().getStringValue("ORG_ID");
				String orgName = ContextHelper.getContext().getStringValue("ORG_NAME");
				Map<String, String> descnMap = new HashMap<String, String>();
				descnMap.put("key", "descn");
				descnMap.put("value", username+"|"+descn);
				descnMap.put("label", "操作员");
				topMenuContent.put("descn", descnMap);

				Map<String, String> orgIdMap = new HashMap<String, String>();
				orgIdMap.put("key", "orgId");
				orgIdMap.put("value", orgId+"|"+orgName);
				orgIdMap.put("label", "机构");
				topMenuContent.put("orgId", orgIdMap);
				
				Map<String, String> departIdMap = new HashMap<String, String>();
				departIdMap.put("key", "departId");
				departIdMap.put("value", groupId+"|"+groupName);
				departIdMap.put("label", "部门");
				topMenuContent.put("departId", departIdMap);
			}
			return topMenuContent;
		}

	@Override
	protected PageDataItem[] providePageData(String username, String password) {
		Map<String, PageView> pages = new  HashMap<String, PageView>();
		com.gingkoo.gpms.client.Pages.addPages(pages);
		com.gingkoo.vat.client.Pages.addPages(pages);
		com.gingkoo.cust.client.Pages.addPages(pages);
		
		PageDataItem[] pageItem = new PageDataItem[pages.size()];
		int i = 0;
		for(String key: pages.keySet()) {
			pageItem[i] = new PageDataItem(key, pages.get(key));
			i++;
		}
		
		return pageItem;
	}
	
	//国际化 
	@Override 
	protected Map<String,String> getI18nMap() { 
		Map<String,String> map = new HashMap<String,String>(); 
		map.put( "en" , "English" ); 
		map.put( "zh_CN" , "简体中文" ); 
		return map; 
	}
	
	int passwordExpiring = 0;
	boolean sense = true;
	
	@Override
	protected boolean onPasswordExpiring(String errCode, String errDesc) {
		
		
		if ( Integer.parseInt(errDesc.substring(4,errDesc.indexOf("天")))<=0 ) {
			sense = false;
		}
		
		UPrompt.confirm("", errDesc+",是否现在修改", new PromptCallback() {
			@Override
			public void execute(Boolean value) {
				if (value != null && value == true) {
					PasswordChangeCust changePasswordView = new PasswordChangeCust();
					changePasswordView.setMainApplication(CustMainApplication.this);
					changePasswordView.buildWithConfig();
					changePasswordView.bindChangePasswordCallback(CustMainApplication.this);
					
					window.setTitle("密码修改");
					window.setWidth(350);
					window.setHeight(180);
					window.setCanDrag(false);
					window.setCanDragReposition(false);
					window.setCanDragResize(false);
					window.setCanDragScroll(false);
					window.centerInPage();
					window.setAutoCenter(true);
					window.setShowMinimizeButton(false); 
					window.setShowCloseButton(false);
					window.setIsModal(true);
					UVLayout contentLayout = new UVLayout();
					contentLayout.setWidth(350);
					contentLayout.setMargin(20);
					contentLayout.setHeight(350);
					contentLayout.setMembersMargin(10);  
					contentLayout.setLayoutMargin(10);
					contentLayout.addChild(changePasswordView.getContent());

					window.addChild(contentLayout);
					window.show();
					sense = false;
				} else {
					if (!sense)
						resetLoginFrame();
					else 
						gotoMainFrame();
				}
			}
		
		});
		return false;

	}
}
