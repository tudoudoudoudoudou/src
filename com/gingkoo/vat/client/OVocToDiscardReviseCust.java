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
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import java.util.HashMap;

public class OVocToDiscardReviseCust extends OVocToDiscardRevise {
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
    protected ClickListener BTN_DTL_ClickListener;
    protected ClickListener BTN_DTL1_ClickListener;
    protected ClickListener BTN_CLOSE_ClickListener;
    protected ClickListener BTN_INQ1_ClickListener;
    protected ClickListener BTN_CLOSE2_ClickListener;
    private DataRecord[] stack1;
    private DataRecord[] stack2;

    public OVocToDiscardReviseCust() {
    }

    protected void setting() {
        this.setPageID("");
    }

    public void cyclePopup1() {
        if (this.stack1 != null && this.stack1.length > 0) {
            this.resultDs.setCurrentRecord(this.stack1[0]);
            this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_DTL_Cmd.setQuerySqlid("OVocToDiscardRevise_002");
            this.BTN_DTL_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0) {
                        OVocToDiscardReviseCust.this.BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocToDiscardReviseCust.this.BTN_DTL2_Cmd.setQuerySqlid("OVocToDiscardRevise_003");
                        OVocToDiscardReviseCust.this.BTN_DTL2_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocToDiscardReviseCust.this.detailSw1.setTitle("待作废发票-" + OVocToDiscardReviseCust.this.stype1);
                                OVocToDiscardReviseCust.this.detailSw1.show();
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
            this.BTN_INQ_Cmd.setQuerySqlid("OVocToDiscardRevise_001");
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

    public void cyclePopup2() {
        if (this.stack2 != null && this.stack2.length > 0) {
            this.queryDs.setCurrentRecord(this.stack2[0]);
            this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_INQ_Cmd.setQuerySqlid("OVocToDiscardRevise_001");
            this.BTN_INQ_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0) {
                        OVocToDiscardReviseCust.this.detailSw3.setTitle("待作废发票-" + OVocToDiscardReviseCust.this.stype2);
                        OVocToDiscardReviseCust.this.detailSw3.show();
                    }

                }
            });
            if (this.stack2.length > 1) {
                DataRecord[] tmpstack = new DataRecord[this.stack2.length - 1];

                int i;
                for(i = 0; i < tmpstack.length; ++i) {
                    tmpstack[i] = this.stack2[i + 1];
                }

                this.stack2 = new DataRecord[this.stack2.length - 1];

                for(i = 0; i < tmpstack.length; ++i) {
                    this.stack2[i] = tmpstack[i];
                }
            } else {
                this.stack2 = new DataRecord[0];
            }
        } else {
            this.detailSw3.hide();
            this.BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_INQ1_Cmd.setQuerySqlid("OVocToDiscardRevise_005");
            this.BTN_INQ1_Cmd.execute(new CommandCallback() {
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
                OVocToDiscardReviseCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
        HashMap<String, Object> mapqueryDs1 = new HashMap();
        this.queryDs1.addDataRecord(new DataRecord(mapqueryDs1), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                OVocToDiscardReviseCust.this.frmCXXX2.editRecord(gridRecord);
            }
        });
    }

    protected void bindEvent() {
        this.detailSw1.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                OVocToDiscardReviseCust.this.cyclePopup1();
            }
        });
        this.detailSw3.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                OVocToDiscardReviseCust.this.cyclePopup2();
            }
        });
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocToDiscardReviseCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocToDiscardReviseCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocToDiscardRevise_001");
                OVocToDiscardReviseCust.this.BTN_INQ.setDisabled(true);
                OVocToDiscardReviseCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocToDiscardReviseCust.this.BTN_INQ.setDisabled(false);
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
        this.BTN_DTL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocToDiscardReviseCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocToDiscardReviseCust.this.mod1 = 6;
                    OVocToDiscardReviseCust.this.stype1 = "查看明细";
                    if (OVocToDiscardReviseCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocToDiscardReviseCust.this.stack1 = OVocToDiscardReviseCust.this.resultDs.getSelectedRecords();
                        OVocToDiscardReviseCust.this.cyclePopup1();
                    }
                }
            }
        };
        this.BTN_DTL.addClickListener(this.BTN_DTL_ClickListener);
        this.BTN_DTL1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocToDiscardReviseCust.this.resultDs2.setCurrentValue("PDATA_ID", OVocToDiscardReviseCust.this.resultDs2.getCurrentValue("DATA_ID"));
                OVocToDiscardReviseCust.this.list1();
                OVocToDiscardReviseCust.this.detailSw3.show();
            }
        };
        this.BTN_DTL1.addClickListener(this.BTN_DTL1_ClickListener);
        this.BTN_CLOSE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocToDiscardReviseCust.this.cyclePopup1();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
        this.BTN_INQ1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocToDiscardReviseCust.this.BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocToDiscardReviseCust.this.BTN_INQ1_Cmd.setQuerySqlid("OVocToDiscardRevise_005");
                OVocToDiscardReviseCust.this.BTN_INQ1.setDisabled(true);
                OVocToDiscardReviseCust.this.BTN_INQ1_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocToDiscardReviseCust.this.BTN_INQ1.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                        } else if (callback.getCallbackCount() == 0) {
                            UPrompt.alert("提示", "查询无记录！");
                        }

                    }
                });
            }
        };
        this.BTN_INQ1.addClickListener(this.BTN_INQ1_ClickListener);
        this.BTN_CLOSE2_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocToDiscardReviseCust.this.cyclePopup2();
            }
        };
        this.BTN_CLOSE2.addClickListener(this.BTN_CLOSE2_ClickListener);
    }

    public void list1() {
        this.BTN_DTL1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
        this.BTN_DTL1_Cmd.setQuerySqlid("OVocToDiscardRevise_004");
        this.BTN_DTL1_Cmd.execute(new CommandCallback() {
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
