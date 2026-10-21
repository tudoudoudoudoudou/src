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
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class ToOVocTxManaCust extends ToOVocTxMana {

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
    // 按钮查询的点击事件;
    protected ClickListener BTN_INQ_ClickListener;
    // 按钮查看明细的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    // 按钮修改的点击事件;
    protected ClickListener BTN_MOD_ClickListener;
    // 按钮保存客户信息的点击事件;
    protected ClickListener BTN_SAVE1_ClickListener;
    // 按钮提交的点击事件;
    protected ClickListener BTN_SAVE_ClickListener;
    // 按钮返回的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    protected ClickListener BTN_SYNC_ClickListener;
    protected ClickListener BTN_GEN_ClickListener;

    @Override
    protected void setting() {
        this.setPageID("");
    }

    private DataRecord[] stack1;

    public void cyclePopup1() {
        if ((stack1 != null) && (stack1.length > 0)) {
            // 取选中的第一条记录
            resultDs.setCurrentRecord(stack1[0]);
            BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            BTN_DTL_Cmd.setQuerySqlid("ToOVocTxQuery_002");
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailDs1.setCurrentValue("CUST_NO", detailDs.getCurrentValue("CUST_NO"));
                            detailDs1.setCurrentValue("NATIONAL_TAX_NO", detailDs.getCurrentValue("NATIONAL_TAX_NO"));
                            detailDs1.setCurrentValue("BUY_ADDR", detailDs.getCurrentValue("ADDR"));
                            detailDs1.setCurrentValue("BUY_TEL", detailDs.getCurrentValue("TEL"));
                            detailDs1.setCurrentValue("BUY_BANK_NO", detailDs.getCurrentValue("BR_NAME"));
                            detailDs1.setCurrentValue("CUST_NAME", detailDs.getCurrentValue("CUST_NAME"));
                            detailDs1.setCurrentValue("CUST_ACT_NO", detailDs.getCurrentValue("BR_ACTNO"));
                            detailDs1.setCurrentValue("CUST_TYPE", detailDs.getCurrentValue("CUST_TYPE"));
                            detailDs1.setCurrentValue("NEED_VOC_FLAG", detailDs.getCurrentValue("NEED_VOC_FLAG"));
                            detailDs1.setCurrentValue("TAX_ENT_TYPE", detailDs.getCurrentValue("TAX_ENT_TYPE"));
                            detailDs1.setCurrentValue("OF_FLAG", detailDs.getCurrentValue("OF_FLAG"));
                            detailDs1.setCurrentValue("DATA_ID", detailDs.getCurrentValue("CUST_ID"));
                            detailDs1.sync();
                            detailSw1.setTitle("待开票交易管理-" + stype1);
                            detailSw1.show();
                            if(mod1==1){
                                viewCtl();
                            }
                            if("0".equals(detailDs.getCurrentValue("BIZ_TYPE"))){
                                frmCZXX.hide();
                            }else if("1".equals(detailDs.getCurrentValue("BIZ_TYPE"))){
                                frmCZXX.show();
                                frmCZXX_REV_AMT.show();
                                frmCZXX_REV_O_AMT.show();
                                frmCZXX_ORI_TXID.show();
                            }
                        }
                    }
                }
            });
            // 从堆栈中清除最后一条记录
            if (stack1.length > 1) {
                DataRecord[] tmpstack = new DataRecord[stack1.length - 1];
                for (int i = 0; i < tmpstack.length; i++)
                    tmpstack[i] = stack1[i + 1];
                stack1 = new DataRecord[stack1.length - 1];
                for (int i = 0; i < tmpstack.length; i++)
                    stack1[i] = tmpstack[i];
            } else
                stack1 = new DataRecord[0];
        } else {
            detailSw1.hide();
            // 刷新上一级界面列表
            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            // 对于通用查询需要设置SQLID的值
            BTN_INQ_Cmd.setQuerySqlid("ToOVocTxQuery_001");
            BTN_INQ_Cmd.execute(new CommandCallback() {
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
    }

    @Override
    protected boolean beforeInitControls() {
        return super.beforeInitControls();
    }

    @Override
    protected void beforeRender() {
        frmKHXX_CUST_NO.setReferenceCmd(refCmd);
        frmCXXX_CUST_NO.setReferenceCmd(refCmd1,false);
        frmCXXX_NATIONAL_TAX_NO.setReferenceCmd(refNmd,false);
        //
        // frmYHHP_CMB_SIGN_BRNO.setReferenceCmd(refCmd);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        // mapqueryDs.put("START_TX_DATE", "Value1");
        // mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }

        });
        detailDs1.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmKHXX.editRecord(gridRecord);
            }
        });
        frmYWMX_TX_CODE.bindDropdownDataset(txcodeDs);
        frmYWMX_TX_CODE.setValueField("tx_code");
        frmYWMX_TX_CODE.setDisplayField("tx_name");
        TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        TXCODE_INQ_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                frmYWMX_TX_CODE.flushData();
                resultTb.getUField("TX_CODE").bindDropdownDataset(txcodeDs,"tx_code","tx_name");
            }
        });

    }

    @Override
    protected void bindEvent() {
        detailSw1.addCloseClickHandler(new CloseClickHandler() {
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });
        BTN_INQ_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                BTN_INQ_Cmd.setQuerySqlid("ToOVocTxQuery_001");
                BTN_INQ.setDisabled(true);
                BTN_INQ_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
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
        BTN_DTL_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                mod1 = 6;
                stype1 = "查看明细";
                if (resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
                frmKHXX.setReadOnly(true);
                BTN_SAVE.hide();
                BTN_SAVE1.hide();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
        BTN_MOD_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                mod1 = 1;
                stype1 = "修改";
                if (resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
                frmKHXX.setReadOnly(false);
                BTN_SAVE.show();
                BTN_SAVE1.show();
            }
        };
        BTN_MOD.addClickListener(BTN_MOD_ClickListener);
        BTN_SAVE1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                String CheckMsg = custCheck();
                if (CheckMsg.length() > 0) {
                    UPrompt.alert("提示", "客户信息不合法：" + CheckMsg);
                    return;
                }
                logtype2 = "new";
                Map<String, String> extraa = new HashMap<String, String>();
                extraa.put("TX_ID", detailDs.getCurrentValue("TX_ID"));
                BTN_SAVE1_Cmd.setExtraInfo(extraa);
                BTN_SAVE1_Cmd.setCommandService("vatOutputService", "ToOVocTxManaAddCustInfo");
                BTN_SAVE1.setDisabled(true);
                BTN_SAVE1_Cmd.setHead("ADDINFO", "PmVatCustomer");
                BTN_SAVE1_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_SAVE1.setDisabled(false);
                        if (!status || callback.getErrorMessage() != null) {
                            if (callback.getErrorMessage() != null)
                                UPrompt.alert("提示", stype2 + "失败:" + callback.getErrorMessage());
                            else
                                UPrompt.alert("提示", stype2 + "失败！");
                        } else {
                            String data_id = (String) callback.getCallbackData();
                            detailDs.setCurrentValue("CUST_ID", data_id);
                            detailDs.sync();
                            detailDs1.setCurrentValue("DATA_ID",data_id);
                            detailDs1.sync();
                            UPrompt.alert("提示", "操作成功", new PromptCallback() {
                                @Override
                                public void execute(Boolean value) {
                                    //****
                                    Map<String, String> extra = new HashMap<String, String>();
                                    extra.put("BOUC_MONTH", ContextHelper.getContext().getValue("FAL_BUOC_MONTH"));
                                    extra.put("SQL_ID", "SP_VAT_BEFORE_VOC_CHECK");
                                    extra.put("AUTO_FLAG", "C");
                                    extra.put("TX_ID", detailDs.getCurrentValue("TX_ID"));
                                    BTN_SYNC_Cmd.setCommandService("vatCommonService", "CallProc");
                                    BTN_SYNC_Cmd.setExtraInfo(extra);
                                    BTN_SYNC_Cmd.execute(new CommandCallback() {
                                        @Override
                                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                                            BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                            BTN_DTL_Cmd.setQuerySqlid("ToOVocTxQuery_002");
                                            BTN_DTL.setDisabled(true);
                                            BTN_DTL_Cmd.execute(new CommandCallback() {
                                                @Override
                                                public void onCallback(boolean status, Callback callback, String commandItemName) {
                                                    BTN_DTL.setDisabled(false);
                                                    if (!status) {
                                                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                                    } else {
                                                        if (callback.getCallbackCount() == 0) {
                                                            UPrompt.alert("提示", "查询无记录！");
                                                        }else{
                                                            detailDs.sync();
                                                            detailSw1.setTitle("待开票交易管理-" + stype1);
                                                            detailSw1.show();
                                                            if(mod1==1){
                                                                viewCtl();
                                                            }
                                                            if("0".equals(detailDs.getCurrentValue("BIZ_TYPE"))){
                                                                frmCZXX.hide();
                                                            }else if("1".equals(detailDs.getCurrentValue("BIZ_TYPE"))){
                                                                frmCZXX.show();
                                                                frmCZXX_REV_AMT.show();
                                                                frmCZXX_REV_O_AMT.show();
                                                                frmCZXX_ORI_TXID.show();
                                                            }
                                                        }
                                                    }
                                                }
                                            });
                                        }
                                    });
                                    //*****
                                    detailDs.logBiz(logtype2);
                                }
                            });
                        }
                    }
                });
            }
        };
        BTN_SAVE1.addClickListener(BTN_SAVE1_ClickListener);
        BTN_SAVE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {

                String CheckMsg = custCheck();
                if (CheckMsg.length() > 0) {
                    UPrompt.alert("提示", "客户信息不合法：" + CheckMsg);
                    return;
                }

                logtype1 = "new";
                if (mod1 == 1) {
                    BTN_SAVE_Cmd.setDBService("commonUpdateService", "execute");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_MOD");
                    logtype1 = "mod";
                    stype1 = "修改";
                }



                Map<String,String> extraInfo = new HashMap<String,String>();

                String custId = detailDs1.getCurrentValue("DATA_ID");
                if(custId != null && !"".equals(custId)){
                    extraInfo.put("CUST_ID", detailDs1.getCurrentValue("DATA_ID"));
                    extraInfo.put("CUST_ACT_NO",detailDs1.getCurrentValue("CUST_ACT_NO"));
                }else{
                    extraInfo.put("CUST_ID", null);
                    extraInfo.put("CUST_ACT_NO", null);
                }

//				extraInfo.put("CUST_NAME", detailDs1.getCurrentValue("CUST_NAME"));
//				extraInfo.put("CUST_ACT_NO", detailDs1.getCurrentValue("CUST_ACT_NO"));
//				extraInfo.put("CUST_NO", detailDs1.getCurrentValue("CUST_NO"));
//				extraInfo.put("NATIONAL_TAX_NO", detailDs1.getCurrentValue("NATIONAL_TAX_NO"));
//				extraInfo.put("TAX_ENT_TYPE", detailDs1.getCurrentValue("TAX_ENT_TYPE"));
//				extraInfo.put("OF_FLAG", detailDs1.getCurrentValue("OF_FLAG"));
//				extraInfo.put("ADDR", detailDs1.getCurrentValue("BUY_ADDR"));
//				extraInfo.put("TEL", detailDs1.getCurrentValue("BUY_TEL"));
                BTN_SAVE_Cmd.setExtraInfo(extraInfo);
                BTN_SAVE.setDisabled(true);
                BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatTx");
                BTN_SAVE_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_SAVE.setDisabled(false);
                        if (!status || callback.getErrorMessage() != null) {
                            if (callback.getErrorMessage() != null)
                                UPrompt.alert("提示", stype1 + "失败:" + callback.getErrorMessage());
                            else
                                UPrompt.alert("提示", stype1 + "失败！");
                        } else {
                            UPrompt.alert("提示", "操作成功", new PromptCallback() {
                                @Override
                                public void execute(Boolean value) {
                                    // 记录业务日志
                                    detailDs.logBiz(logtype1);
                                    detailSw1.hide();
                                    Map<String, String> extra = new HashMap<String, String>();
                                    extra.put("BOUC_MONTH", ContextHelper.getContext().getValue("FAL_BUOC_MONTH"));
                                    extra.put("SQL_ID", "SP_VAT_BEFORE_VOC_CHECK");
                                    extra.put("AUTO_FLAG", "N");
                                    extra.put("TX_ID", detailDs.getCurrentValue("TX_ID"));
                                    BTN_SYNC_Cmd.setCommandService("vatCommonService", "CallProc");
                                    BTN_SYNC_Cmd.setExtraInfo(extra);
                                    BTN_SYNC_Cmd.execute(new CommandCallback() {
                                        @Override
                                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                                            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                            BTN_INQ_Cmd.setQuerySqlid("ToOVocTxQuery_001");
                                            BTN_INQ.setDisabled(true);
                                            BTN_INQ_Cmd.execute(new CommandCallback() {
                                                @Override
                                                public void onCallback(boolean status, Callback callback, String commandItemName) {
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
                                    });

                                }
                            });
                        }
                    }
                });
            }
        };
        BTN_SAVE.addClickListener(BTN_SAVE_ClickListener);
        BTN_CLOSE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);

        BTN_SYNC_ClickListener = new ClickListener() {

            @Override
            public void onClick(ClickEvent event) {
                Map<String, String> extra = new HashMap<String, String>();
                extra.put("BOUC_MONTH", ContextHelper.getContext().getValue("FAL_BUOC_MONTH"));
                extra.put("SQL_ID", "SP_VAT_BEFORE_VOC_CHECK");
                extra.put("AUTO_FLAG", "N");
                extra.put("TX_ID", null);
                BTN_SYNC_Cmd.setCommandService("vatCommonService", "CallProc");
                BTN_SYNC_Cmd.setExtraInfo(extra);
                BTN_SYNC.setDisabled(true);
                BTN_SYNC_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_SYNC.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "同步失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            UPrompt.alert("提示", "同步成功");
                            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            BTN_INQ_Cmd.setQuerySqlid("ToOVocTxQuery_001");
                            BTN_INQ.setDisabled(true);
                            BTN_INQ_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback, String commandItemName) {
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
                    }
                });
            }
        };

        BTN_SYNC.addClickListener(BTN_SYNC_ClickListener);

        BTN_GEN_ClickListener = new ClickListener() {

            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                mod1 = 1;
                stype1 = "修改";
                if (resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                if("05".equals(resultDs.getCurrentValue("NEXT_ACTION")))
                {
                    UPrompt.alert("提示", "数据未补录，不能立即开票");
                    System.out.println("=========================>>"+resultDs.getCurrentValue("NEXT_ACTION"));
                    return;
                }
                Map<String, String> extra = new HashMap<String, String>();
                BTN_GEN_Cmd.setCommandDataScope(DataScope.SELECT);
                extra.put("BOUC_MONTH", ContextHelper.getContext().getValue("FAL_BUOC_MONTH"));
                extra.put("SQL_ID", "SP_VAT_VOC_MADE");
                extra.put("BY_VOC_RULE", "N");
                BTN_GEN_Cmd.setCommandService("vatCommonService", "vocDataAutoGenImd");
                BTN_GEN_Cmd.setExtraInfo(extra);
                BTN_GEN.setDisabled(true);
                BTN_GEN_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_GEN.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "生成失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            UPrompt.alert("提示", "生成成功");
                            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            BTN_INQ_Cmd.setQuerySqlid("ToOVocTxQuery_001");
                            BTN_INQ.setDisabled(true);
                            BTN_INQ_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback, String commandItemName) {
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
                    }
                });
            }
        };

        BTN_GEN.addClickListener(BTN_GEN_ClickListener);

    }

    public void viewCtl() {
        String custNo = detailDs1.getCurrentValue("CUST_NO");
        String taxNo = detailDs1.getCurrentValue("NATIONAL_TAX_NO");
        if (custNo == null || "".equals(custNo)) {
            frmKHXX.setReadOnly("CUST_NO", false);
        } else {
            frmKHXX.setReadOnly("CUST_NO", true);
        }
        if(taxNo == null || "".equals(taxNo)){
            frmKHXX.setReadOnly("NATIONAL_TAX_NO", false);
        }else{
            frmKHXX.setReadOnly("NATIONAL_TAX_NO", true);
        }
    }

    public String custCheck() {
        String vocFlag = detailDs.getCurrentValue("VOC_FLAG");

        String checkMsg = "";

        if (detailDs1.getCurrentValue("CUST_NAME") == null || "".equals(detailDs1.getCurrentValue("CUST_NAME"))) {
            checkMsg += "客户名称不能为空,";
        }

        if ("0".equals(vocFlag)) {

            if (detailDs1.getCurrentValue("NATIONAL_TAX_NO") == null || "".equals(detailDs1.getCurrentValue("NATIONAL_TAX_NO"))) {
                checkMsg += "客户税号不能为空,";
            }

            if (detailDs1.getCurrentValue("BUY_ADDR") == null || "".equals(detailDs1.getCurrentValue("BUY_ADDR"))) {
                checkMsg += "客户地址不能为空,";
            }

            if (detailDs1.getCurrentValue("BUY_TEL") == null || "".equals(detailDs1.getCurrentValue("BUY_TEL"))) {
                checkMsg += "客户电话不能为空,";
            }

            if (detailDs1.getCurrentValue("BUY_BANK_NO") == null || "".equals(detailDs1.getCurrentValue("BUY_BANK_NO"))) {
                checkMsg += "客户开户行不能为空,";
            }

        }

        if (checkMsg.length() > 0) {
            checkMsg = checkMsg.substring(0, checkMsg.length() - 1);
        }

        return checkMsg;

    }

}
// resultDs.setValue("TX_ID", "value1");
// resultDs.setValue("DATA_ID", "value1");
// txcodeDs.setValue("tx_code", "value1");
// txcodeDs.setValue("tx_name", "value1");
// queryDs.setValue("queryDs", "value1");
// resultIdentDs.setValue("tx_code", "value1");
