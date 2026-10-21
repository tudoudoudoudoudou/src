package com.gingkoo.vat.client;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.event.ValueChangeEvent;
import com.gingkoo.gui.data.client.dataset.event.ValueChangedListener;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.events.ReferencePageGetDataEvent;
import com.gingkoo.gui.ui.component.client.form.UDynamicForm;
import com.gingkoo.gui.data.client.parser.xml.XMLParser;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickListener;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickListener;
import com.gingkoo.gui.ui.component.client.form.fields.events.DoubleClickEvent;
import com.gingkoo.gui.ui.component.client.form.fields.events.DoubleClickListener;
import com.gingkoo.gui.ui.component.client.form.validator.CustValidator;
import com.gingkoo.gui.ui.component.client.upload.UploadListener;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.rpt.common.client.BizFunClient;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.smartgwt.client.util.SC;

public class SysVocTaxEntReviseApvCust extends SysVocTaxEntReviseApv {

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
    //按钮批量审核的点击事件;
    protected ClickListener BTN_BATCH_ClickListener;
    //按钮单笔审核的点击事件;
    protected ClickListener BTN_SINGLE_ClickListener;
    //按钮查看明细的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    //按钮通过的点击事件;
    protected ClickListener BTN_APV_ClickListener;
    //按钮拒绝的点击事件;
    protected ClickListener BTN_REJ_ClickListener;
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
            BTN_DTL_Cmd.setQuerySqlid("SysVocTaxEntReviseApv_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw1.setTitle("纳税主体审核-"+stype1);
                            detailSw1.show();
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
            BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntReviseApv_001");
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
        //mapqueryDs.put("BANK_NO", "Value1");
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmnsztcx.editRecord(gridRecord);
            }
        });

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
                BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntReviseApv_001");
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
        BTN_BATCH_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null || resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                btnApv();
                BTN_BATCH_Cmd.setCommandDataScope(DataScope.SELECT);
                //审核成功
                BTN_BATCH_Cmd.setCommandService("rptWsCommonService", "approveBatch");
                BTN_BATCH_Cmd.setHead("APVSTATUS", "0");
                BTN_BATCH_Cmd.setHead("ADDINFO", "PmVatTaxEntity");
                BTN_BATCH_Cmd.setHead("CTLNAME", "BTN_BATCH");
                BTN_BATCH_Cmd.execute(new CommandCallback() {
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
                        BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntReviseApv_001");
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
        BTN_BATCH.addClickListener(BTN_BATCH_ClickListener);
        BTN_SINGLE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                mod1=5;
                stype1="单笔审核";
                if (resultDs.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
                btnApv();
            }
        };
        BTN_SINGLE.addClickListener(BTN_SINGLE_ClickListener);
        BTN_DTL_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                mod1=6;
                stype1="查看明细";
                if (resultDs.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
                btnDetail();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
        BTN_APV_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
//				if (!frmnsztmx1.validate()) {
//				    UPrompt.alert("提示", "存在未输入的必输项！");
//				    return;
//				}
                logtype1="new";
                BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "approve");
                BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_APV");
                BTN_APV.setDisabled(true);
                BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatTaxEntity");
                BTN_SAVE_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        BTN_APV.setDisabled(false);
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
        BTN_APV.addClickListener(BTN_APV_ClickListener);
        BTN_REJ_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
//				if (!frmnsztmx1.validate()) {
//				    UPrompt.alert("提示", "存在未输入的必输项！");
//				    return;
//				}
                logtype1="new";
                if (detailDs.getCurrentValue("DATA_REJ_DESC") == null || detailDs.getCurrentValue("DATA_REJ_DESC").equals("")) {
                    UPrompt.alert("提示", "请输入拒绝理由！");
                    return;
                }
                BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "approve");
                BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_REJ");
                BTN_REJ.setDisabled(true);
                BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatTaxEntity");
                BTN_SAVE_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        BTN_REJ.setDisabled(false);
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
        BTN_REJ.addClickListener(BTN_REJ_ClickListener);
        BTN_CLOSE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);
    }

    public void btnApv(){
        BTN_APV.show();
        BTN_REJ.show();
        frmQTXX_DATA_REJ_DESC.show();
        frmQTXX_DATA_REJ_DESC.setDisabled(false);
        frmQTXX.setReadOnly("DATA_REJ_DESC",false);
        frmKPXX.setReadOnly("TAX_KEY_SN",true);
    }

    public void btnDetail(){
        BTN_APV.hide();
        BTN_REJ.hide();
        frmQTXX.setReadOnly("DATA_REJ_DESC",true);
        frmKPXX.setReadOnly("TAX_KEY_SN",true);
    }
}
//resultDs.setValue("DATA_ID", "value1");
//queryDs.setValue("__CONDITION__", "value1");
//detailDs.setValue("PDATA_ID", "value1");
