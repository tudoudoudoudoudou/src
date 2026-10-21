//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gingkoo.vat.client;

import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import java.util.HashMap;

public class ToOVocTxApvCust extends ToOVocTxApv {
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
    protected ClickListener BTN_INQ_ClickListener;
    protected ClickListener BTN_BATCH_ClickListener;
    protected ClickListener BTN_SINGLE_ClickListener;
    protected ClickListener BTN_DTL_ClickListener;
    protected ClickListener BTN_APV_ClickListener;
    protected ClickListener BTN_REJ_ClickListener;
    protected ClickListener BTN_CLOSE_ClickListener;
    private DataRecord[] stack1;

    public ToOVocTxApvCust() {
    }

    protected void setting() {
        this.setPageID("");
    }

    public void cyclePopup1() {
        if (this.stack1 != null && this.stack1.length > 0) {
            this.resultDs.setCurrentRecord(this.stack1[0]);
            this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_DTL_Cmd.setQuerySqlid("ToOVocTxApv_002");
            this.BTN_DTL_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0) {
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("CUST_NO", ToOVocTxApvCust.this.detailDs.getCurrentValue("CUST_NO"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("NATIONAL_TAX_NO", ToOVocTxApvCust.this.detailDs.getCurrentValue("NATIONAL_TAX_NO"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("BUY_ADDR", ToOVocTxApvCust.this.detailDs.getCurrentValue("ADDR"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("BUY_TEL", ToOVocTxApvCust.this.detailDs.getCurrentValue("TEL"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("BUY_BANK_NO", ToOVocTxApvCust.this.detailDs.getCurrentValue("BR_NAME"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("CUST_NAME", ToOVocTxApvCust.this.detailDs.getCurrentValue("CUST_NAME"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("CUST_ACT_NO", ToOVocTxApvCust.this.detailDs.getCurrentValue("BR_ACTNO"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("CUST_TYPE", ToOVocTxApvCust.this.detailDs.getCurrentValue("CUST_TYPE"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("NEED_VOC_FLAG", ToOVocTxApvCust.this.detailDs.getCurrentValue("NEED_VOC_FLAG"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("TAX_ENT_TYPE", ToOVocTxApvCust.this.detailDs.getCurrentValue("TAX_ENT_TYPE"));
                        ToOVocTxApvCust.this.detailDs1.setCurrentValue("OF_FLAG", ToOVocTxApvCust.this.detailDs.getCurrentValue("OF_FLAG"));
                        ToOVocTxApvCust.this.detailDs1.sync();
                        ToOVocTxApvCust.this.detailSw1.setTitle("待开票交易审核 -" + ToOVocTxApvCust.this.stype1);
                        ToOVocTxApvCust.this.detailSw1.show();
                        if ("0".equals(ToOVocTxApvCust.this.detailDs.getCurrentValue("BIZ_TYPE"))) {
                            ToOVocTxApvCust.this.frmCZXX.hide();
                        } else if ("1".equals(ToOVocTxApvCust.this.detailDs.getCurrentValue("BIZ_TYPE"))) {
                            ToOVocTxApvCust.this.frmCZXX.show();
                            ToOVocTxApvCust.this.frmCZXX_REV_AMT.show();
                            ToOVocTxApvCust.this.frmCZXX_REV_O_AMT.show();
                            ToOVocTxApvCust.this.frmCZXX_ORI_TXID.show();
                        }

                        System.out.println("========================================================================");
                    }

                }
            });
            if (this.stack1.length > 1) {
                DataRecord[] tmpstack = new DataRecord[this.stack1.length - 1];

                int i;
                for(i = 0; i < tmpstack.length; ++i) {
                    tmpstack[i] = this.stack1[i + 1];
                }

                this.stack1 = new DataRecord[this.stack1.length - 1];

                for(i = 0; i < tmpstack.length; ++i) {
                    this.stack1[i] = tmpstack[i];
                }
            } else {
                this.stack1 = new DataRecord[0];
            }
        } else {
            this.detailSw1.hide();
            this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_INQ_Cmd.setQuerySqlid("ToOVocTxApv_001");
            this.BTN_INQ_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() == 0) {
                        UPrompt.alert("提示", "查询无记录！");
                    }

                }
            });
        }

    }

    protected boolean beforeInitControls() {
        return super.beforeInitControls();
    }

    protected void beforeRender() {
        this.frmCXXX_CUST_NO.setReferenceCmd(this.refCmd, false);
        this.frmCXXX_NATIONAL_TAX_NO.setReferenceCmd(this.refNmd, false);
        HashMap<String, Object> mapqueryDs = new HashMap();
        this.queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                ToOVocTxApvCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
        this.detailDs1.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                ToOVocTxApvCust.this.frmKHXX.editRecord(gridRecord);
            }
        });
        this.frmYWMX_TX_CODE.bindDropdownDataset(this.txcodeDs);
        this.frmYWMX_TX_CODE.setValueField("tx_code");
        this.frmYWMX_TX_CODE.setDisplayField("tx_name");
        this.TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        this.TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        this.TXCODE_INQ_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                ToOVocTxApvCust.this.frmYWMX_TX_CODE.flushData();
                ToOVocTxApvCust.this.resultTb.getUField("TX_CODE").bindDropdownDataset(ToOVocTxApvCust.this.txcodeDs, "tx_code", "tx_name");
            }
        });
        this.frmCZXX_REV_AMT.hide();
        this.frmCZXX_REV_O_AMT.hide();
        this.frmCZXX_ORI_TXID.hide();
    }

    protected void bindEvent() {
        this.detailSw1.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                ToOVocTxApvCust.this.cyclePopup1();
            }
        });
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                ToOVocTxApvCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                ToOVocTxApvCust.this.BTN_INQ_Cmd.setQuerySqlid("ToOVocTxApv_001");
                ToOVocTxApvCust.this.BTN_INQ.setDisabled(true);
                ToOVocTxApvCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        ToOVocTxApvCust.this.BTN_INQ.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                        } else if (callback.getCallbackCount() == 0) {
                            UPrompt.alert("提示", "查询无记录！");
                        }

                    }
                });
            }
        };
        this.BTN_INQ.addClickListener(this.BTN_INQ_ClickListener);
        this.BTN_BATCH_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (ToOVocTxApvCust.this.resultDs.getCurrentRecord() != null && ToOVocTxApvCust.this.resultDs.getSelectedRecords().length != 0) {
                    ToOVocTxApvCust.this.btnApv();
                    ToOVocTxApvCust.this.BTN_BATCH_Cmd.setCommandDataScope(DataScope.SELECT);
                    ToOVocTxApvCust.this.BTN_BATCH_Cmd.setDBService("commonBatchApproveService", "execute");
                    ToOVocTxApvCust.this.BTN_BATCH_Cmd.setHead("APVSTATUS", "0");
                    ToOVocTxApvCust.this.BTN_BATCH_Cmd.setHead("ADDINFO", "PmVatTx");
                    ToOVocTxApvCust.this.BTN_BATCH_Cmd.setHead("CTLNAME", "BTN_BATCH");
                    ToOVocTxApvCust.this.BTN_BATCH_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            if (status && callback.getErrorMessage() == null) {
                                UPrompt.alert("提示", "批量审核成功！");
                                ToOVocTxApvCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                ToOVocTxApvCust.this.BTN_INQ_Cmd.setQuerySqlid("ToOVocTxApv_001");
                                ToOVocTxApvCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                                        if (!status) {
                                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                        } else if (callback.getCallbackCount() == 0) {
                                            UPrompt.alert("提示", "查询无记录！");
                                        }

                                    }
                                });
                            } else if (callback.getErrorMessage() != null) {
                                UPrompt.alert("提示", "操作失败:" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "操作失败！");
                            }
                        }
                    });
                } else {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                }
            }
        };
        this.BTN_BATCH.addClickListener(this.BTN_BATCH_ClickListener);
        this.BTN_SINGLE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (ToOVocTxApvCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    ToOVocTxApvCust.this.mod1 = 5;
                    ToOVocTxApvCust.this.stype1 = "单笔审核";
                    if (ToOVocTxApvCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        ToOVocTxApvCust.this.stack1 = ToOVocTxApvCust.this.resultDs.getSelectedRecords();
                        ToOVocTxApvCust.this.cyclePopup1();
                        ToOVocTxApvCust.this.btnApv();
                    }
                }
            }
        };
        this.BTN_SINGLE.addClickListener(this.BTN_SINGLE_ClickListener);
        this.BTN_DTL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (ToOVocTxApvCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    ToOVocTxApvCust.this.mod1 = 6;
                    ToOVocTxApvCust.this.stype1 = "查看明细";
                    if (ToOVocTxApvCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        ToOVocTxApvCust.this.stack1 = ToOVocTxApvCust.this.resultDs.getSelectedRecords();
                        ToOVocTxApvCust.this.cyclePopup1();
                        ToOVocTxApvCust.this.btnDetail();
                    }
                }
            }
        };
        this.BTN_DTL.addClickListener(this.BTN_DTL_ClickListener);
        this.BTN_APV_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                ToOVocTxApvCust.this.logtype1 = "new";
                ToOVocTxApvCust.this.BTN_SAVE_Cmd.setDBService("vatCommonApproveService", "execute");
                ToOVocTxApvCust.this.BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_APV");
                ToOVocTxApvCust.this.BTN_APV.setDisabled(true);
                ToOVocTxApvCust.this.BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatTx");
                ToOVocTxApvCust.this.BTN_SAVE_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        ToOVocTxApvCust.this.BTN_APV.setDisabled(false);
                        if (status && callback.getErrorMessage() == null) {
                            UPrompt.alert("提示", "操作成功", new UPrompt.PromptCallback() {
                                public void execute(Boolean value) {
                                    ToOVocTxApvCust.this.detailDs.logBiz(ToOVocTxApvCust.this.logtype1);
                                    ToOVocTxApvCust.this.cyclePopup1();
                                }
                            });
                        } else if (callback.getErrorMessage() != null) {
                            UPrompt.alert("提示", ToOVocTxApvCust.this.stype1 + "失败:" + callback.getErrorMessage());
                        } else {
                            UPrompt.alert("提示", ToOVocTxApvCust.this.stype1 + "失败！");
                        }

                    }
                });
            }
        };
        this.BTN_APV.addClickListener(this.BTN_APV_ClickListener);
        this.BTN_REJ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                ToOVocTxApvCust.this.logtype1 = "new";
                if (ToOVocTxApvCust.this.detailDs.getCurrentValue("DATA_REJ_DESC") != null && !ToOVocTxApvCust.this.detailDs.getCurrentValue("DATA_REJ_DESC").equals("")) {
                    ToOVocTxApvCust.this.BTN_SAVE_Cmd.setDBService("commonRejectService", "execute");
                    ToOVocTxApvCust.this.BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_REJ");
                    ToOVocTxApvCust.this.BTN_REJ.setDisabled(true);
                    ToOVocTxApvCust.this.BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatTx");
                    ToOVocTxApvCust.this.BTN_SAVE_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            ToOVocTxApvCust.this.BTN_REJ.setDisabled(false);
                            if (status && callback.getErrorMessage() == null) {
                                UPrompt.alert("提示", "操作成功", new UPrompt.PromptCallback() {
                                    public void execute(Boolean value) {
                                        ToOVocTxApvCust.this.detailDs.logBiz(ToOVocTxApvCust.this.logtype1);
                                        ToOVocTxApvCust.this.cyclePopup1();
                                    }
                                });
                            } else if (callback.getErrorMessage() != null) {
                                UPrompt.alert("提示", ToOVocTxApvCust.this.stype1 + "失败:" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", ToOVocTxApvCust.this.stype1 + "失败！");
                            }

                        }
                    });
                } else {
                    UPrompt.alert("提示", "请输入拒绝理由！");
                }
            }
        };
        this.BTN_REJ.addClickListener(this.BTN_REJ_ClickListener);
        this.BTN_CLOSE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                ToOVocTxApvCust.this.cyclePopup1();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
    }

    public void btnApv() {
        this.BTN_APV.show();
        this.BTN_REJ.show();
        this.frmYWQT_DATA_REJ_DESC.show();
        this.frmYWQT_DATA_REJ_DESC.setDisabled(false);
    }

    public void btnDetail() {
        this.BTN_APV.hide();
        this.BTN_REJ.hide();
        this.frmYWQT_DATA_REJ_DESC.hide();
    }
}
