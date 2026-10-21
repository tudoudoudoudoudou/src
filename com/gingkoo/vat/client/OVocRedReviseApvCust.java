package com.gingkoo.vat.client;

import java.util.HashMap;
import java.util.Map;

import com.gingkoo.gui.core.client.context.ContextHelper;
import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.vat.shared.VatStringUtil;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class OVocRedReviseApvCust extends OVocRedReviseApv {

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
    //按钮查看业务明细的点击事件;
    protected ClickListener BTN_DTL1_ClickListener;
    //按钮查询的点击事件;
    protected ClickListener BTN_INQ1_ClickListener;
    //按钮关闭的点击事件;
    protected ClickListener BTN_CLOSE2_ClickListener;
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
            BTN_DTL_Cmd.setQuerySqlid("OVocRedReviseApv_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw1.setTitle("红字发票审核-"+stype1);
                            BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            //对于通用查询需要设置SQLID的值
                            BTN_DTL2_Cmd.setQuerySqlid("OVocRedQuery_003");
                            BTN_DTL.setDisabled(true);
                            BTN_DTL2_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback,String commandItemName) {
                                    BTN_DTL.setDisabled(false);
                                    detailSw1.show();
                                }
                            });
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
            BTN_INQ_Cmd.setQuerySqlid("OVocRedReviseApv_001");
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
    private DataRecord[] stack2;

    public void cyclePopup2()
    {
        if ((stack2 != null) && (stack2.length > 0))
        {
            //取选中的第一条记录
            queryDs.setCurrentRecord(stack2[0]);
            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            BTN_INQ_Cmd.setQuerySqlid("OVocRedReviseApv_001");
            //BTN_MOD.setDisabled(true);
            BTN_INQ_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw1.setTitle("红字发票审核-"+stype2);
                            detailSw1.show();
                        }
                    }
                }
            });
            //从堆栈中清除最后一条记录
            if (stack2.length > 1)
            {
                DataRecord[] tmpstack = new DataRecord[stack2.length-1];
                for (int i = 0; i < tmpstack.length;i++)
                    tmpstack[i] = stack2[i+1];
                stack2 = new DataRecord[stack2.length-1];
                for (int i = 0; i < tmpstack.length;i++)
                    stack2[i] = tmpstack[i];
            } else
                stack2 = new DataRecord[0];
        } else
        {
            detailSw1.hide();
            //刷新上一级界面列表
            BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            //对于通用查询需要设置SQLID的值
            BTN_INQ1_Cmd.setQuerySqlid("OVocToDiscardRevise_005");
            BTN_INQ1_Cmd.execute(new CommandCallback() {
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
        frmXFXX_ONLY_DPPT.hide();
        frmCXXX_CUST_NO.setReferenceCmd(refCmd,false);
        //
        //frmYHHP_CMB_SIGN_BRNO.setReferenceCmd(refCmd);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        //mapqueryDs.put("MADE_TYPE", "Value1");
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }
        });
        queryDs1.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX2.editRecord(gridRecord);
            }
        });
        TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        TXCODE_INQ_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback,String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                resultTb2.getUField("TX_CODE").bindDropdownDataset(txcodeDs,"tx_code","tx_name");
            }
        });
        BTN_DTL1.hide();
    }

    @Override
    protected void bindEvent() {
        detailSw1.addCloseClickHandler(new CloseClickHandler(){
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });
        detailSw1.addCloseClickHandler(new CloseClickHandler(){
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup2();
            }
        });
        BTN_INQ_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_INQ_Cmd.setQuerySqlid("OVocRedReviseApv_001");
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
                String apvUser = ContextHelper.getContext().getValue("DESCN");
                if(apvUser == null || apvUser.length() < 1 || apvUser.length() > 4 || !VatStringUtil.isChinese(apvUser)){
                    UPrompt.alert("提示", "员工姓名必须为1-4位汉字才可进行发票审核！");
                    return;
                }
                Map<String,String> extra = new HashMap<String,String>();
                extra.put("APV_USER", ContextHelper.getContext().getValue("DESCN"));
                BTN_BATCH_Cmd.setExtraInfo(extra);
                //审核成功
//				BTN_BATCH_Cmd.setDBService("commonBatchApproveService", "execute");
//				BTN_BATCH_Cmd.setCommandService("vatCommonService", "OVocRedReqReviseBatchApv");
                BTN_BATCH_Cmd.setCommandService("vatOutputService", "OVocRedReviseBatchApv");
                BTN_BATCH_Cmd.setHead("APVSTATUS", "0");
                BTN_BATCH_Cmd.setHead("ADDINFO", "PmVatOVoc");
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
                        BTN_INQ_Cmd.setQuerySqlid("OVocRedReviseApv_001");
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
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  begin */
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))) {
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  end */

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
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  begin */
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))) {
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  end */

                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
                btnDetail();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
        BTN_APV_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
//				if (!frmFPXX.validate()) {
//				    UPrompt.alert("提示", "存在未输入的必输项！");
//				    return;
//				}
                logtype1="new";
//				BTN_SAVE_Cmd.setDBService("commonApproveService", "execute");
                String apvUser = ContextHelper.getContext().getValue("DESCN");
                if(apvUser == null || apvUser.length() < 1 || apvUser.length() > 4 || !VatStringUtil.isChinese(apvUser)){
                    UPrompt.alert("提示", "员工姓名必须为1-4位汉字才可进行发票审核！");
                    return;
                }
                Map<String,String> extra = new HashMap<String,String>();
                extra.put("APV_USER", ContextHelper.getContext().getValue("DESCN"));
                BTN_SAVE_Cmd.setExtraInfo(extra);
//				BTN_SAVE_Cmd.setCommandService("vatCommonService", "OVocRedReqReviseApv");
                BTN_SAVE_Cmd.setCommandService("vatOutputService", "OVocRedReviseApv");
                BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_APV");
                BTN_APV.setDisabled(true);
                BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
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
//				if (!frmFPXX.validate()) {
//				    UPrompt.alert("提示", "存在未输入的必输项！");
//				    return;
//				}
                logtype1="new";
                if (detailDs.getCurrentValue("DATA_REJ_DESC") == null || "".equals(detailDs.getCurrentValue("DATA_REJ_DESC"))) {
                    UPrompt.alert("提示", "请输入拒绝理由！");
                    return;
                }
                BTN_SAVE_Cmd.setDBService("commonRejectService", "execute");
                BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_REJ");
                BTN_REJ.setDisabled(true);
                BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
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
        BTN_DTL1_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs2.getCurrentRecord() == null||resultDs2.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                list1();
                frmCXXX2_SEQ_NO.clearValue();
                frmCXXX2_TX_ID.clearValue();
                detailSw3.show();
            }
        };
        BTN_DTL1.addClickListener(BTN_DTL1_ClickListener);
        BTN_INQ1_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                queryDs1.setCurrentValue("DATA_ID", resultDs2.getCurrentValue("DATA_ID"));
                queryDs1.sync();
                System.out.println("@@#@#@#@#@#@#"+queryDs1.getCurrentValue("DATA_ID"));
                BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_INQ1_Cmd.setQuerySqlid("OVocToDiscardRevise_005");
                BTN_INQ1.setDisabled(true);
                BTN_INQ1_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        BTN_INQ1.setDisabled(false);
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
        BTN_INQ1.addClickListener(BTN_INQ1_ClickListener);
        BTN_CLOSE2_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                detailSw3.hide();
            }
        };
        BTN_CLOSE2.addClickListener(BTN_CLOSE2_ClickListener);
    }
    public void list1(){
        System.out.println("@#@$#$@##@$"+resultDs2.getCurrentValue("DATA_ID"));
        BTN_DTL1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
        // 对于通用查询需要设置SQLID的值
        BTN_DTL1_Cmd.setQuerySqlid("OVocToDiscardRevise_004");
        BTN_DTL1_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
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
    public void btnApv(){
        BTN_APV.show();
        BTN_REJ.show();
        frmYWQT_DATA_REJ_DESC.show();
    }

    public void btnDetail(){
        BTN_APV.hide();
        BTN_REJ.hide();
        frmYWQT_DATA_REJ_DESC.hide();
    }

}