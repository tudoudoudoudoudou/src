package com.gingkoo.vat.client;

import java.util.Date;
import java.util.HashMap;

import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickListener;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class CustReviseCust extends CustRevise {

    private static final long serialVersionUID = 1L;

    protected int mod1 = 0;
    protected String stype1 = "";
    protected String logtype1 = "mod";
    protected int mod2 = 0;
    protected String stype2 = "";
    protected String logtype2 = "mod";
    protected int mod3 = 0;
    protected String stype3 = "";
    protected String logtype3 = "mod";
    //按钮查询的点击事件;
    protected ClickListener BTN_INQ_ClickListener;
    //按钮新增的点击事件;
    protected ClickListener BTN_ADD_ClickListener;
    //按钮修改的点击事件;
    protected ClickListener BTN_MOD_ClickListener;
    //按钮删除的点击事件;
    protected ClickListener BTN_DEL_ClickListener;
    //按钮放弃修改的点击事件;
    protected ClickListener BTN_FMOD_ClickListener;
    //按钮导出的点击事件;
    protected ClickListener BTN_DL_ClickListener;
    //按钮提交的点击事件;
    protected ClickListener BTN_SAVE_ClickListener;
    //按钮返回的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    @Override
    protected void setting() {
        this.setPageID("");
    }

    private DataRecord[] stack1;
    
    public void cyclePopup1()
    {
      if ((stack1 != null) && (stack1.length > 0))
      {
        //取选中的第一条记录
        resultDs.setCurrentRecord(stack1[0]);
            BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            BTN_DTL_Cmd.setQuerySqlid("CustRevise_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                          detailSw1.setTitle("客户信息维护-"+stype1);
                          detailSw1.show();
                          frmYWQT.show();
                        }
                    }
                }
            });
        //从堆栈中清除最后一条记录
        if (stack1.length > 1)
        {
          DataRecord[] tmpstack = new DataRecord[stack1.length-1];
          for (int i = 0; i < tmpstack.length;i++)
            tmpstack[i] = stack1[i+1];
          stack1 = new DataRecord[stack1.length-1];
          for (int i = 0; i < tmpstack.length;i++)
            stack1[i] = tmpstack[i];
        } else
          stack1 = new DataRecord[0];
      } else
      {
        detailSw1.hide();
        //刷新上一级界面列表
        BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            //对于通用查询需要设置SQLID的值
            BTN_INQ_Cmd.setQuerySqlid("CustRevise_001");
            BTN_INQ_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                  if (!status) {
                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                  } else {
                    if (callback.getCallbackCount() == 0) {
                      UPrompt.alert("提示", "查询无记录！");
                    }
                  }
                }
            });
      }
    }
    @Override
    protected boolean beforeInitControls() {
        return super.beforeInitControls();
    }

    @Override
    protected void beforeRender() {
    //
    //frmYHHP_CMB_SIGN_BRNO.setReferenceCmd(refCmd);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        //mapqueryDs.put("CLIENT_NO", "Value1");
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }
        });
       
        frmKHXX_GROUPS.bindDropdownDataset(groupDs);
        frmKHXX_GROUPS.setValueField("GROUP_NO");
        frmKHXX_GROUPS.setDisplayField("GROUP_NAME");
        BTN_GROUP_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        BTN_GROUP_INQ_Cmd.setQuerySqlid("GroupInqAll");
        BTN_GROUP_INQ_Cmd.execute(new CommandCallback() {
		  @Override
		  public void onCallback(boolean status, Callback callback,String commandItemName) {
			  System.out.println("=============刷新下拉框数据===============");
			  frmKHXX_GROUPS.flushData();
			  detailDs.sync();
			  resultTb.getUField("GROUPS").bindDropdownDataset(groupDs, "GROUP_NO", "GROUP_NAME");
		  }
		});
        
        detailDs.sync();
    }

    @Override
    protected void bindEvent() {
        detailSw1.addCloseClickHandler(new CloseClickHandler(){
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });
        BTN_INQ_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
            		BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
					      //对于通用查询需要设置SQLID的值
                BTN_INQ_Cmd.setQuerySqlid("CustRevise_001");
                BTN_INQ.setDisabled(true);
                BTN_INQ_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                      BTN_INQ.setDisabled(false);
                      if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                      } else {
                        if (callback.getCallbackCount() == 0) {
                          UPrompt.alert("提示", "查询无记录！");
                        }
                      }
                    }
                });
            }
        };
        BTN_INQ.addClickListener(BTN_INQ_ClickListener);
        BTN_ADD_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
				mod1=0;
				HashMap<String, String> map = new HashMap<String, String>();
				detailDs.addDataRecord(new DataRecord(map), new DataAction() {
				    @Override
				    public void doAction(DataRecord record) {
				    	detailDs.sync();
				    	beforeRender();
				        detailSw1.setTitle("客户信息维护-新增");
				        detailSw1.show();
				        frmYWQT.hide();
				        //画面只读、必选项显示控制---------RevisedByCiel151207
				        frmKHXX.setReadOnly(false);
				        frmKHXX.setReadOnly("GROUPS",true);
				        frmKHXX.setReadOnly("CUST_NO",true);
				        frmKHXX.setReadOnly("CUST_NAME",true);
				        frmKHXX.setReadOnly("CUST_TYPE",true);
				        frmKHXX.setReadOnly("OBTAIN_TYPE",true);
				        frmKHXX.setReadOnly("NATIONAL_TAX_NO",true);
				        frmKHXX.setReadOnly("TAX_ENT_TYPE",true);
				        frmKHXX.setReadOnly("EMAIL",true);
				        frmKHXX.setReadOnly("OF_FLAG",true);
				        frmKHXX.setReadOnly("DATA_SOURCE",true);
				        frmKHXX_NEED_VOC_FLAG.setRequired(true);
				        frmKHXX_TAX_ENT_TYPE.setRequired(true);
				        frmKHXX_DATA_SOURCE.setRequired(true);
				        frmLXRXX.setReadOnly(false);
				        //取票方式赋默认值02
				        detailDs.setCurrentValue("OBTAIN_TYPE", "02");
				        detailDs.setCurrentValue("DATA_SOURCE", "3");
				        detailDs.sync();
				    }
				});
            }
        };
        BTN_ADD.addClickListener(BTN_ADD_ClickListener);
        BTN_MOD_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
               mod1=1;
            	stype1="修改";
            	if (resultDs.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                     return;
            	}
            	stack1 = resultDs.getSelectedRecords();
            	cyclePopup1();
		        //画面只读、必选项显示控制---------RevisedByCiel151207
		        frmKHXX.setReadOnly(false);
		        frmKHXX.setReadOnly("GROUPS",true);
		        frmKHXX.setReadOnly("CUST_NO",true);
		        frmKHXX.setReadOnly("CUST_NAME",true);
		        frmKHXX.setReadOnly("CUST_TYPE",true);
		        frmKHXX.setReadOnly("OBTAIN_TYPE",true);
		        frmKHXX.setReadOnly("NATIONAL_TAX_NO",true);
		        frmKHXX.setReadOnly("TAX_ENT_TYPE",true);
		        frmKHXX.setReadOnly("EMAIL",true);
		        frmKHXX.setReadOnly("OF_FLAG",true);
		        frmKHXX.setReadOnly("DATA_SOURCE",true);
		        frmKHXX_NEED_VOC_FLAG.setRequired(true);
		        frmKHXX_TAX_ENT_TYPE.setRequired(true);
		        frmKHXX_DATA_SOURCE.setRequired(true);
		        frmLXRXX.setReadOnly(false);
            }
        };
        BTN_MOD.addClickListener(BTN_MOD_ClickListener);
        BTN_DEL_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
               mod1=2;
            	stype1="删除";
            	if (resultDs.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                     return;
            	}
            	stack1 = resultDs.getSelectedRecords();
            	cyclePopup1();
		        //画面只读、必选项显示控制---------RevisedByCiel151207
		        frmKHXX.setReadOnly(true);
		        frmKHXX_NEED_VOC_FLAG.setRequired(false);
		        frmKHXX_TAX_ENT_TYPE.setRequired(false);
		        frmKHXX_DATA_SOURCE.setRequired(false);
		        frmLXRXX.setReadOnly(true);
            }
        };
        BTN_DEL.addClickListener(BTN_DEL_ClickListener);
        BTN_FMOD_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
            	if (resultDs.getCurrentRecord() == null || resultDs.getSelectedRecords().length == 0) {
					UPrompt.alert("提示", "请选择需要操作的记录");
					return;
				}
            	BTN_FMOD_Cmd.setCommandService("rptWsCommonService", "rollback");
            	BTN_FMOD_Cmd.setHead("APVSTATUS", "0");
            	BTN_FMOD_Cmd.setHead("ADDINFO", "PmVatCustomer");
            	BTN_FMOD_Cmd.setHead("CTLNAME", "BTN_FMOD");
            	BTN_FMOD_Cmd.execute(new CommandCallback() {
				    @Override
				    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        if (!status || callback.getErrorMessage() != null) {
                            if (callback.getErrorMessage() != null)
                                {UPrompt.alert("提示", "操作失败:"+callback.getErrorMessage());return;}
                            else
                                {UPrompt.alert("提示", "操作失败！");return;}
                        } else {
                            UPrompt.alert("提示", "操作成功！");
                        }
                        BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        //对于通用查询需要设置SQLID的值
                        BTN_INQ_Cmd.setQuerySqlid("CustRevise_001");
                        BTN_INQ_Cmd.execute(new CommandCallback() {
                            @Override
                            public void onCallback(boolean status, Callback callback,String commandItemName) {
                              if (!status) {
                                UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                              } else {
                                if (callback.getCallbackCount() == 0) {
                                  UPrompt.alert("提示", "查询无记录！");
                                }
                              }
                            }
                        });
				    }
				});
            }
        };
        BTN_FMOD.addClickListener(BTN_FMOD_ClickListener);
        
        BTN_DL_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {			
				BTN_DL_Cmd.setQuerySqlid("CustRevise_004");
				BTN_DL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                BTN_DL_Cmd.setHead("TEMPLATE", "EXPORT_TEMPLATE_CustRevise.xlsx");
                BTN_DL_Cmd.setHead("NEWFILENAME","EXPORT_TEMPLATE_CustRevise.xlsx");
//              DateUtils.parseDate(ContextHelper.getContext().getValue("WORK_DATE"));
                DateTimeFormat df = DateTimeFormat.getFormat("yyyyMMddhhmmss");
                BTN_DL_Cmd.setHead("SELECT_DATE", df.format(new Date()));
                BTN_DL_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        if(status){
                            SC.say("导出成功");
                        }
                    }
                });
            }
        };
        BTN_DL.addClickListener(BTN_DL_ClickListener);
        BTN_SAVE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
				if (!frmKHXX.validate()) {
				    UPrompt.alert("提示", "存在未输入的必输项！");
				    return;
				}
//				String custNo = detailDs.getCurrentValue("CUST_NO");
//				String taxNo = detailDs.getCurrentValue("NATIONAL_TAX_NO");
//				if((custNo == null || "".equals(custNo))&&(taxNo == null || "".equals(taxNo))){
//					UPrompt.alert("提示", "客户号和纳税识别号不能同时为空！");
//				    return;
//				}
				logtype1="new";
				if (mod1 == 0){
					detailDs.setCurrentValue("IS_AHEAD_FLAG", "0");
				    BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "insert");
				    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_ADD");
				    logtype1="new";
				    stype1="新增";}
				if (mod1 == 1){
				    BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "update");
				    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_MOD");
				    logtype1="mod";
				    stype1="修改";}
				if (mod1 == 2){
				    BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "delete");
				    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_DEL");
				    logtype1="del";
				    stype1="删除";}
                BTN_SAVE.setDisabled(true);
                BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatCustomer");
                BTN_SAVE_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                      BTN_SAVE.setDisabled(false);
                        if (!status || callback.getErrorMessage() != null) {
                            if (callback.getErrorMessage() != null)
                                UPrompt.alert("提示", stype1+"失败:"+callback.getErrorMessage());
                            else
                                UPrompt.alert("提示", stype1+"失败！");
                        } else {
                        UPrompt.alert("提示", "操作成功", new PromptCallback() {
                            @Override
                            public void execute(Boolean value) {
                                //记录业务日志
                                detailDs.logBiz(logtype1);
                                //记录系统日志(系统操作，如用户管理时)
                                //detailDs.logSys(logtype1);
                                cyclePopup1();
                            }
                        });
                      }
                    }
                });
            }
        };
        BTN_SAVE.addClickListener(BTN_SAVE_ClickListener);
        BTN_CLOSE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
				cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);
        
        resultTb.addRecordClickListener(new RecordClickListener(){
			@Override
			public void onRecordClick(RecordClickEvent event) {
				if("O".equals(resultDs.getCurrentValue("DATA_FLAG"))){
					BTN_FMOD.setDisabled(true);
				}else{
					BTN_FMOD.setDisabled(false);
				}
				if("39".equals(resultDs.getCurrentValue("DATA_STATUS"))||
						"35".equals(resultDs.getCurrentValue("DATA_STATUS"))||
						"25".equals(resultDs.getCurrentValue("DATA_STATUS"))||
						"27".equals(resultDs.getCurrentValue("DATA_STATUS"))){
					BTN_MOD.setDisabled(false);
					BTN_DEL.setDisabled(true);
				}else if("3B".equals(resultDs.getCurrentValue("DATA_STATUS"))||
						"21".equals(resultDs.getCurrentValue("DATA_STATUS"))){
					BTN_MOD.setDisabled(true);
					BTN_DEL.setDisabled(true);
				}else{
					BTN_MOD.setDisabled(false);
					BTN_DEL.setDisabled(false);
				}
			}
        });
    }

}
//resultDs.setValue("DATA_ID", "value1");
