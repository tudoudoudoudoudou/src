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

public class OVocDiscardReviseApvCust extends OVocDiscardReviseApv {
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

    public OVocDiscardReviseApvCust() {
    }

    protected void setting() {
        this.setPageID("");
    }

    public void cyclePopup1() {
        if (this.stack1 != null && this.stack1.length > 0) {
            this.resultDs.setCurrentRecord(this.stack1[0]);
            this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_DTL_Cmd.setQuerySqlid("OVocDiscardReviseApv_002");
            this.BTN_DTL_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0) {
                        OVocDiscardReviseApvCust.this.detailSw1.setTitle("发票作废审核-" + OVocDiscardReviseApvCust.this.stype1);
                        OVocDiscardReviseApvCust.this.BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocDiscardReviseApvCust.this.BTN_DTL2_Cmd.setQuerySqlid("OVocDiscardReviseApv_003");
                        OVocDiscardReviseApvCust.this.BTN_DTL.setDisabled(true);
                        OVocDiscardReviseApvCust.this.BTN_DTL2_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocDiscardReviseApvCust.this.BTN_DTL.setDisabled(false);
                                OVocDiscardReviseApvCust.this.detailSw1.show();
                            }
                        });
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
            this.BTN_INQ_Cmd.setQuerySqlid("OVocDiscardReviseApv_001");
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
        HashMap<String, Object> mapqueryDs = new HashMap();
        this.queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                OVocDiscardReviseApvCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
        this.TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        this.TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        this.TXCODE_INQ_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                OVocDiscardReviseApvCust.this.resultTb2.getUField("TX_CODE").bindDropdownDataset(OVocDiscardReviseApvCust.this.txcodeDs, "tx_code", "tx_name");
            }
        });
    }

    protected void bindEvent() {
        this.detailSw1.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                OVocDiscardReviseApvCust.this.cyclePopup1();
            }
        });
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocDiscardReviseApvCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocDiscardReviseApvCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocDiscardReviseApv_001");
                OVocDiscardReviseApvCust.this.BTN_INQ.setDisabled(true);
                OVocDiscardReviseApvCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocDiscardReviseApvCust.this.BTN_INQ.setDisabled(false);
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
                if (OVocDiscardReviseApvCust.this.resultDs.getCurrentRecord() != null && OVocDiscardReviseApvCust.this.resultDs.getSelectedRecords().length != 0) {
                    OVocDiscardReviseApvCust.this.btnApv();
                    OVocDiscardReviseApvCust.this.BTN_BATCH_Cmd.setCommandDataScope(DataScope.SELECT);
                    OVocDiscardReviseApvCust.this.BTN_BATCH_Cmd.setCommandService("vatCommonService", "oVocDiscardBatchApv");
                    OVocDiscardReviseApvCust.this.BTN_BATCH_Cmd.setHead("APVSTATUS", "0");
                    OVocDiscardReviseApvCust.this.BTN_BATCH_Cmd.setHead("ADDINFO", "PmVatOVoc");
                    OVocDiscardReviseApvCust.this.BTN_BATCH_Cmd.setHead("CTLNAME", "BTN_BATCH");
                    OVocDiscardReviseApvCust.this.BTN_BATCH_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            if (status && callback.getErrorMessage() == null) {
                                UPrompt.alert("提示", "操作成功！");
                                OVocDiscardReviseApvCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                OVocDiscardReviseApvCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocDiscardReviseApv_001");
                                OVocDiscardReviseApvCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
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
                if (OVocDiscardReviseApvCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocDiscardReviseApvCust.this.mod1 = 5;
                    OVocDiscardReviseApvCust.this.stype1 = "单笔审核";
                    if (OVocDiscardReviseApvCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocDiscardReviseApvCust.this.stack1 = OVocDiscardReviseApvCust.this.resultDs.getSelectedRecords();
                        OVocDiscardReviseApvCust.this.cyclePopup1();
                        OVocDiscardReviseApvCust.this.btnApv();
                    }
                }
            }
        };
        this.BTN_SINGLE.addClickListener(this.BTN_SINGLE_ClickListener);
        this.BTN_DTL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocDiscardReviseApvCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocDiscardReviseApvCust.this.mod1 = 6;
                    OVocDiscardReviseApvCust.this.stype1 = "查看明细";
                    if (OVocDiscardReviseApvCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocDiscardReviseApvCust.this.stack1 = OVocDiscardReviseApvCust.this.resultDs.getSelectedRecords();
                        OVocDiscardReviseApvCust.this.cyclePopup1();
                        OVocDiscardReviseApvCust.this.btnDetail();
                    }
                }
            }
        };
        this.BTN_DTL.addClickListener(this.BTN_DTL_ClickListener);
        this.BTN_APV_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocDiscardReviseApvCust.this.logtype1 = "new";
                OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.setCommandService("vatCommonService", "oVocDiscardApv");
                OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_APV");
                OVocDiscardReviseApvCust.this.BTN_APV.setDisabled(true);
                OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
                OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocDiscardReviseApvCust.this.BTN_APV.setDisabled(false);
                        if (status && callback.getErrorMessage() == null) {
                            UPrompt.alert("提示", "操作成功", new UPrompt.PromptCallback() {
                                public void execute(Boolean value) {
                                    OVocDiscardReviseApvCust.this.detailDs.logBiz(OVocDiscardReviseApvCust.this.logtype1);
                                    OVocDiscardReviseApvCust.this.cyclePopup1();
                                }
                            });
                        } else if (callback.getErrorMessage() != null) {
                            UPrompt.alert("提示", OVocDiscardReviseApvCust.this.stype1 + "失败:" + callback.getErrorMessage());
                        } else {
                            UPrompt.alert("提示", OVocDiscardReviseApvCust.this.stype1 + "失败！");
                        }

                    }
                });
            }
        };
        this.BTN_APV.addClickListener(this.BTN_APV_ClickListener);
        this.BTN_REJ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocDiscardReviseApvCust.this.logtype1 = "new";
                if (OVocDiscardReviseApvCust.this.detailDs.getCurrentValue("DATA_REJ_DESC") != null && !OVocDiscardReviseApvCust.this.detailDs.getCurrentValue("DATA_REJ_DESC").equals("")) {
                    OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.setCommandService("vatCommonService", "oVocDiscardRej");
                    OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_REJ");
                    OVocDiscardReviseApvCust.this.BTN_REJ.setDisabled(true);
                    OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
                    OVocDiscardReviseApvCust.this.BTN_SAVE_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocDiscardReviseApvCust.this.BTN_REJ.setDisabled(false);
                            if (status && callback.getErrorMessage() == null) {
                                UPrompt.alert("提示", "操作成功", new UPrompt.PromptCallback() {
                                    public void execute(Boolean value) {
                                        OVocDiscardReviseApvCust.this.detailDs.logBiz(OVocDiscardReviseApvCust.this.logtype1);
                                        OVocDiscardReviseApvCust.this.cyclePopup1();
                                    }
                                });
                            } else if (callback.getErrorMessage() != null) {
                                UPrompt.alert("提示", OVocDiscardReviseApvCust.this.stype1 + "失败:" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", OVocDiscardReviseApvCust.this.stype1 + "失败！");
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
                OVocDiscardReviseApvCust.this.cyclePopup1();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
    }

    public void btnApv() {
        this.BTN_APV.show();
        this.BTN_REJ.show();
        this.frmYWQT_DATA_REJ_DESC.show();
    }

    public void btnDetail() {
        this.BTN_APV.hide();
        this.BTN_REJ.hide();
        this.frmYWQT_DATA_REJ_DESC.hide();
    }
}
