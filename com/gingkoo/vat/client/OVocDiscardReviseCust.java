//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gingkoo.vat.client;

import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickListener;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import java.util.HashMap;

public class OVocDiscardReviseCust extends OVocDiscardRevise {
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
    protected ClickListener BTN_BACK_ClickListener;
    protected ClickListener BTN_DROP_ClickListener;
    protected ClickListener BTN_DTL_ClickListener;
    protected ClickListener BTN_CLOSE_ClickListener;
    protected ClickListener BTN_SAVE_ClickListener;
    protected ClickListener BTN_CLOSE1_ClickListener;
    private DataRecord[] stack1;
    private DataRecord[] discardDatas;

    public OVocDiscardReviseCust() {
    }

    protected void setting() {
        this.setPageID("");
    }

    public void cyclePopup1() {
        if (this.stack1 != null && this.stack1.length > 0) {
            this.resultDs.setCurrentRecord(this.stack1[0]);
            this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_DTL_Cmd.setQuerySqlid("OVocDiscardRevise_002");
            this.BTN_DTL_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0) {
                        OVocDiscardReviseCust.this.BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocDiscardReviseCust.this.BTN_DTL2_Cmd.setQuerySqlid("OVocDiscardRevise_003");
                        OVocDiscardReviseCust.this.BTN_DTL2_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                            }
                        });
                        OVocDiscardReviseCust.this.detailSw1.setTitle("发票信息-" + OVocDiscardReviseCust.this.stype1);
                        OVocDiscardReviseCust.this.detailSw1.show();
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
            this.BTN_INQ_Cmd.setQuerySqlid("OVocDiscardRevise_001");
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
        this.BTN_BACK.hide();
        HashMap<String, Object> mapqueryDs = new HashMap();
        this.queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                OVocDiscardReviseCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
        this.TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        this.TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        this.TXCODE_INQ_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                OVocDiscardReviseCust.this.resultTb2.getUField("TX_CODE").bindDropdownDataset(OVocDiscardReviseCust.this.txcodeDs, "tx_code", "tx_name");
            }
        });
        this.BTN_BACK.setDisabled(true);
        this.BTN_DROP.setDisabled(true);
    }

    protected void bindEvent() {
        this.detailSw1.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                OVocDiscardReviseCust.this.cyclePopup1();
            }
        });
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocDiscardReviseCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocDiscardReviseCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocDiscardRevise_001");
                OVocDiscardReviseCust.this.BTN_INQ.setDisabled(true);
                OVocDiscardReviseCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocDiscardReviseCust.this.BTN_INQ.setDisabled(false);
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
        this.BTN_BACK.addClickListener(new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocDiscardReviseCust.this.resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocDiscardReviseCust.this.resultDs.getSelectedRecords().length >= 2) {
                    UPrompt.alert("提示", "一次只能操作一条数据");
                } else if (!"3".equals(OVocDiscardReviseCust.this.resultDs.getCurrentValue("VOC_STAT"))) {
                    UPrompt.alert("提示", "只能退回已作废发票");
                } else {
                    OVocDiscardReviseCust.this.BTN_BACK_Cmd.setCommandService("vatCommonService", "vocDiscardBack");
                    OVocDiscardReviseCust.this.BTN_BACK.setDisabled(true);
                    OVocDiscardReviseCust.this.BTN_BACK_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocDiscardReviseCust.this.BTN_BACK.setDisabled(false);
                            if (!status) {
                                UPrompt.alert("提示", "退回失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "退回成功");
                            }

                            OVocDiscardReviseCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            OVocDiscardReviseCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocDiscardRevise_001");
                            OVocDiscardReviseCust.this.BTN_INQ.setDisabled(true);
                            OVocDiscardReviseCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                                public void onCallback(boolean status, Callback callback, String commandItemName) {
                                    OVocDiscardReviseCust.this.BTN_INQ.setDisabled(false);
                                    if (!status) {
                                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                    } else if (callback.getCallbackCount() == 0) {
                                        UPrompt.alert("提示", "查询无记录！");
                                    }

                                }
                            });
                        }
                    });
                }
            }
        });
        this.resultTb.addRecordClickListener(new RecordClickListener() {
            public void onRecordClick(RecordClickEvent event) {
                if ("3".equals(OVocDiscardReviseCust.this.resultDs.getCurrentValue("VOC_STAT"))) {
                    OVocDiscardReviseCust.this.BTN_BACK.setDisabled(false);
                    OVocDiscardReviseCust.this.BTN_DROP.setDisabled(true);
                } else if ("2".equals(OVocDiscardReviseCust.this.resultDs.getCurrentValue("VOC_STAT"))) {
                    OVocDiscardReviseCust.this.BTN_BACK.setDisabled(true);
                    OVocDiscardReviseCust.this.BTN_DROP.setDisabled(false);
                }

            }
        });
        this.BTN_DROP_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocDiscardReviseCust.this.resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocDiscardReviseCust.this.discardDatas = OVocDiscardReviseCust.this.resultDs.getSelectedRecords();
                    OVocDiscardReviseCust.this.optionDs.addDataRecord(new DataRecord(new HashMap()), (DataAction)null);
                    OVocDiscardReviseCust.this.detailSw2.show();
                }
            }
        };
        this.BTN_DROP.addClickListener(this.BTN_DROP_ClickListener);
        this.BTN_DTL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocDiscardReviseCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocDiscardReviseCust.this.mod1 = 6;
                    OVocDiscardReviseCust.this.stype1 = "查看明细";
                    if (OVocDiscardReviseCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocDiscardReviseCust.this.stack1 = OVocDiscardReviseCust.this.resultDs.getSelectedRecords();
                        OVocDiscardReviseCust.this.cyclePopup1();
                    }
                }
            }
        };
        this.BTN_DTL.addClickListener(this.BTN_DTL_ClickListener);
        this.BTN_CLOSE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocDiscardReviseCust.this.cyclePopup1();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
        this.BTN_SAVE.addClickListener(new ClickListener() {
            public void onClick(ClickEvent event) {
                if (!OVocDiscardReviseCust.this.frmZFLX.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                } else {
                    OVocDiscardReviseCust.this.resultDs.setCurrentValue("REV_FLAG", "1");
                    OVocDiscardReviseCust.this.resultDs.setCurrentValue("DISCARD_TYPE", OVocDiscardReviseCust.this.optionDs.getCurrentValue("DISCARD_TYPE"));
                    OVocDiscardReviseCust.this.resultDs.setCurrentValue("DISCARD_DESC", OVocDiscardReviseCust.this.optionDs.getCurrentValue("DISCARD_DESC"));
                    OVocDiscardReviseCust.this.BTN_DROP_Cmd.setCommandService("commonUpdateService", "execute");
                    OVocDiscardReviseCust.this.BTN_DROP_Cmd.setHead("CTLNAME", "BTN_MOD");
                    OVocDiscardReviseCust.this.BTN_DROP_Cmd.setHead("ADDINFO", "PmVatOVoc");
                    OVocDiscardReviseCust.this.BTN_DROP.setDisabled(true);
                    OVocDiscardReviseCust.this.BTN_DROP_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocDiscardReviseCust.this.BTN_DROP.setDisabled(false);
                            if (!status) {
                                UPrompt.alert("提示", "作废失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "作废成功");
                                OVocDiscardReviseCust.this.detailSw2.hide();
                                OVocDiscardReviseCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                OVocDiscardReviseCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocDiscardRevise_001");
                                OVocDiscardReviseCust.this.BTN_INQ.setDisabled(true);
                                OVocDiscardReviseCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                                        OVocDiscardReviseCust.this.BTN_INQ.setDisabled(false);
                                        if (!status) {
                                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                        } else if (callback.getCallbackCount() == 0) {
                                            UPrompt.alert("提示", "查询无记录！");
                                        }

                                    }
                                });
                            }

                        }
                    });
                }
            }
        });
        this.BTN_CLOSE1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocDiscardReviseCust.this.detailSw2.hide();
            }
        };
        this.BTN_CLOSE1.addClickListener(this.BTN_CLOSE1_ClickListener);
    }
}
