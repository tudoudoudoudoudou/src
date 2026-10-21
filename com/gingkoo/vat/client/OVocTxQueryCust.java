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
import com.google.gwt.i18n.client.DateTimeFormat;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import java.util.Date;
import java.util.HashMap;

public class OVocTxQueryCust extends OVocTxQuery {
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
    protected ClickListener BTN_DL_ClickListener;
    protected ClickListener BTN_LIST_ClickListener;
    protected ClickListener BTN_CLOSE_ClickListener;
    protected ClickListener BTN_INQ1_ClickListener;
    protected ClickListener BTN_CLOSE1_ClickListener;
    protected ClickListener BTN_VOC_ClickListener;
    protected ClickListener BTN_CLOSE2_ClickListener;
    protected ClickListener BTN_DTL1_ClickListener;
    protected ClickListener BTN_CLOSE3_ClickListener;
    private DataRecord[] stack1;

    public OVocTxQueryCust() {
    }

    protected void setting() {
        this.setPageID("");
    }

    public void cyclePopup1() {
        if (this.stack1 != null && this.stack1.length > 0) {
            this.resultDs.setCurrentRecord(this.stack1[0]);
            this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_DTL_Cmd.setQuerySqlid("OVocTxQuery_002");
            this.BTN_DTL_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0) {
                        OVocTxQueryCust.this.detailSw1.setTitle("业务查询明细-" + OVocTxQueryCust.this.stype1);
                        OVocTxQueryCust.this.detailSw1.show();
                        OVocTxQueryCust.this.initRevForm();
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
            this.BTN_INQ_Cmd.setQuerySqlid("OVocTxQuery_001");
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
        this.frmRDJG_GOOD_CODE.setReferenceCmd(this.refCmd);
        this.frmCXXX_CUST_NO.setReferenceCmd(this.refCmd1, false);
        this.frmCXXX_NATIONAL_TAX_NO.setReferenceCmd(this.refNmd, false);
        HashMap<String, Object> mapqueryDs1 = new HashMap();
        this.queryDs1.addDataRecord(new DataRecord(mapqueryDs1), (DataAction)null);
        HashMap<String, Object> mapqueryDs = new HashMap();
        this.queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                OVocTxQueryCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
        this.frmYWMX_TX_CODE.bindDropdownDataset(this.txcodeDs);
        this.frmYWMX_TX_CODE.setValueField("tx_code");
        this.frmYWMX_TX_CODE.setDisplayField("tx_name");
        this.frmJYXX_TX_CODE.bindDropdownDataset(this.txcodeDs);
        this.frmJYXX_TX_CODE.setValueField("tx_code");
        this.frmJYXX_TX_CODE.setDisplayField("tx_name");
        this.TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        this.TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        this.TXCODE_INQ_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                OVocTxQueryCust.this.frmYWMX_TX_CODE.flushData();
                OVocTxQueryCust.this.frmJYXX_TX_CODE.flushData();
                OVocTxQueryCust.this.resultTb.getUField("TX_CODE").bindDropdownDataset(OVocTxQueryCust.this.txcodeDs, "tx_code", "tx_name");
            }
        });
        this.frmCZXX_REV_AMT.hide();
        this.frmCZXX_REV_O_AMT.hide();
        this.frmCZXX_ORI_TXID.hide();
        this.frmRDJG1_RELIEF_CODE.bindDropdownDataset(this.reliefCodeDs);
        this.frmRDJG1_RELIEF_CODE.setValueField("RELIEF_CODE");
        this.frmRDJG1_RELIEF_CODE.setDisplayField("RELIEF_NAME");
        this.RELIEF_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        this.RELIEF_INQ_Cmd.setQuerySqlid("ReliefCodeInq");
        this.RELIEF_INQ_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                OVocTxQueryCust.this.frmRDJG1_RELIEF_CODE.flushData();
            }
        });
        this.frmRDJG1_INS_TYPE.bindDropdownDataset(this.insTypeDs);
        this.frmRDJG1_INS_TYPE.setValueField("TAXABLE_CODE");
        this.frmRDJG1_INS_TYPE.setDisplayField("TAXABLE_NAME");
        this.INSTYPE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        this.INSTYPE_INQ_Cmd.setQuerySqlid("TaxableCodeInq");
        this.INSTYPE_INQ_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                OVocTxQueryCust.this.frmRDJG1_INS_TYPE.flushData();
            }
        });
    }

    protected void bindEvent() {
        this.detailSw1.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                OVocTxQueryCust.this.cyclePopup1();
            }
        });
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocTxQueryCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocTxQueryCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocTxQuery_001");
                OVocTxQueryCust.this.BTN_INQ.setDisabled(true);
                OVocTxQueryCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocTxQueryCust.this.BTN_INQ.setDisabled(false);
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
                if (OVocTxQueryCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocTxQueryCust.this.mod1 = 6;
                    OVocTxQueryCust.this.stype1 = "查看明细";
                    if (OVocTxQueryCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocTxQueryCust.this.stack1 = OVocTxQueryCust.this.resultDs.getSelectedRecords();
                        OVocTxQueryCust.this.cyclePopup1();
                    }
                }
            }
        };
        this.BTN_DTL.addClickListener(this.BTN_DTL_ClickListener);
        this.BTN_LIST_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocTxQueryCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocTxQueryCust.this.mod1 = 6;
                    OVocTxQueryCust.this.stype1 = "查看明细";
                    if (OVocTxQueryCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocTxQueryCust.this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocTxQueryCust.this.BTN_DTL_Cmd.setQuerySqlid("OVocTxQuery_002");
                        OVocTxQueryCust.this.BTN_DTL_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                if (!status) {
                                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                } else if (callback.getCallbackCount() > 0) {
                                    OVocTxQueryCust.this.BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                    OVocTxQueryCust.this.BTN_INQ1_Cmd.setQuerySqlid("OVocTxRevise_004");
                                    OVocTxQueryCust.this.BTN_LIST.setDisabled(true);
                                    OVocTxQueryCust.this.BTN_INQ1_Cmd.execute(new CommandCallback() {
                                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                                            OVocTxQueryCust.this.BTN_LIST.setDisabled(false);
                                            if (!status) {
                                                UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                            } else {
                                                OVocTxQueryCust.this.entitySw.setTitle("业务查询-计税详情");
                                                OVocTxQueryCust.this.entitySw.show();
                                            }

                                        }
                                    });
                                }

                            }
                        });
                    }
                }
            }
        };
        this.BTN_LIST.addClickListener(this.BTN_LIST_ClickListener);
        this.BTN_VOC_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocTxQueryCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocTxQueryCust.this.mod1 = 6;
                    OVocTxQueryCust.this.stype1 = "查看明细";
                    if (OVocTxQueryCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else if (OVocTxQueryCust.this.resultDs.getCurrentValue("IS_VOC_EXISTED").equals("N")) {
                        UPrompt.alert("提示", "未开票无法查看发票信息");
                    } else {
                        System.out.println("@@@@@@@@@@@@@" + OVocTxQueryCust.this.resultDs.getCurrentValue("TX_ID"));
                        OVocTxQueryCust.this.BTN_INQ2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocTxQueryCust.this.BTN_INQ2_Cmd.setQuerySqlid("OVocQuery_004");
                        OVocTxQueryCust.this.BTN_INQ2_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                if (!status) {
                                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                } else {
                                    OVocTxQueryCust.this.detailSw2.setTitle("发票信息");
                                    OVocTxQueryCust.this.detailSw2.show();
                                }
                            }
                        });
                    }
                }
            }
        };
        this.BTN_VOC.addClickListener(this.BTN_VOC_ClickListener);
        this.BTN_DL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocTxQueryCust.this.BTN_DL_Cmd.setQuerySqlid("OVocTxQuery_005");
                OVocTxQueryCust.this.BTN_DL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocTxQueryCust.this.BTN_DL_Cmd.setHead("TEMPLATE", "EXPORT_TEMPLATE_OVocTxQuery.xlsx");
                OVocTxQueryCust.this.BTN_DL_Cmd.setHead("NEWFILENAME", "EXPORT_TEMPLATE_OVocTxQuery.xlsx");
                DateTimeFormat df = DateTimeFormat.getFormat("yyyyMMddhhmmss");
                OVocTxQueryCust.this.BTN_DL_Cmd.setHead("SELECT_DATE", df.format(new Date()));
                OVocTxQueryCust.this.BTN_DL_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        if (status) {
                            SC.say("导出成功");
                        }

                    }
                });
            }
        };
        this.BTN_DL.addClickListener(this.BTN_DL_ClickListener);
        this.BTN_DTL1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocTxQueryCust.this.detailDs1.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocTxQueryCust.this.BTN_DTL1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                    OVocTxQueryCust.this.BTN_DTL1_Cmd.setQuerySqlid("OVocQuery_003");
                    OVocTxQueryCust.this.BTN_DTL1_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            if (!status) {
                                UPrompt.alert("提示", "获取发票明细失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                OVocTxQueryCust.this.detailSw3.setTitle("发票明细");
                                OVocTxQueryCust.this.detailSw3.show();
                            }
                        }
                    });
                }
            }
        };
        this.BTN_DTL1.addClickListener(this.BTN_DTL1_ClickListener);
        this.BTN_CLOSE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocTxQueryCust.this.cyclePopup1();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
        this.BTN_CLOSE1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocTxQueryCust.this.cyclePopup1();
                OVocTxQueryCust.this.entitySw.close();
            }
        };
        this.BTN_CLOSE1.addClickListener(this.BTN_CLOSE1_ClickListener);
        this.BTN_CLOSE2_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocTxQueryCust.this.cyclePopup1();
                OVocTxQueryCust.this.detailSw2.close();
            }
        };
        this.BTN_CLOSE2.addClickListener(this.BTN_CLOSE2_ClickListener);
        this.BTN_CLOSE3_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocTxQueryCust.this.detailSw3.close();
                OVocTxQueryCust.this.detailSw2.setTitle("发票信息");
                OVocTxQueryCust.this.detailSw2.show();
            }
        };
        this.BTN_CLOSE3.addClickListener(this.BTN_CLOSE3_ClickListener);
    }

    public void initRevForm() {
        String bizType = this.detailDs.getCurrentValue("BIZ_TYPE");
        if ("0".equals(bizType)) {
            this.frmCZXX.hide();
        } else if ("1".equals(bizType)) {
            this.frmCZXX.show();
            this.frmCZXX_REV_AMT.hide();
            this.frmCZXX_REV_O_AMT.hide();
            this.frmCZXX_ORI_TXID.show();
        } else {
            this.frmCZXX.hide();
        }

    }
}
