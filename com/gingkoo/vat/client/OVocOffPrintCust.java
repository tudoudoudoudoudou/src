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
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import java.util.HashMap;
import java.util.Map;

public class OVocOffPrintCust extends OVocOffPrint {
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
    protected ClickListener BTN_EXPORT_TXT_ClickListener;
    protected ClickListener BTN_EXPORT_EXCEL_ClickListener;
    protected ClickListener BTN_CLOSE_ClickListener;
    private DataRecord[] stack1;

    public OVocOffPrintCust() {
    }

    protected void setting() {
        this.setPageID("");
    }

    public void cyclePopup1() {
        if (this.stack1 != null && this.stack1.length > 0) {
            this.resultDs.setCurrentRecord(this.stack1[0]);
            this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_DTL_Cmd.setQuerySqlid("OVocRevise_002");
            this.BTN_DTL_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0) {
                        OVocOffPrintCust.this.detailSw1.setTitle("发票信息-" + OVocOffPrintCust.this.stype1);
                        OVocOffPrintCust.this.BTN_DTL1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocOffPrintCust.this.BTN_DTL1_Cmd.setQuerySqlid("OVocRevise_003");
                        OVocOffPrintCust.this.BTN_DTL.setDisabled(true);
                        OVocOffPrintCust.this.BTN_DTL1_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocOffPrintCust.this.BTN_DTL.setDisabled(false);
                                OVocOffPrintCust.this.detailSw1.setTitle("线下打印-" + OVocOffPrintCust.this.stype1);
                                OVocOffPrintCust.this.detailSw1.show();
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
            this.BTN_INQ_Cmd.setQuerySqlid("OVocRevise_004");
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
                OVocOffPrintCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
    }

    protected void bindEvent() {
        this.detailSw1.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                OVocOffPrintCust.this.cyclePopup1();
            }
        });
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocOffPrintCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocOffPrintCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevise_004");
                OVocOffPrintCust.this.BTN_INQ.setDisabled(true);
                OVocOffPrintCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocOffPrintCust.this.BTN_INQ.setDisabled(false);
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
                if (OVocOffPrintCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocOffPrintCust.this.mod1 = 6;
                    OVocOffPrintCust.this.stype1 = "查看明细";
                    if (OVocOffPrintCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocOffPrintCust.this.stack1 = OVocOffPrintCust.this.resultDs.getSelectedRecords();
                        OVocOffPrintCust.this.cyclePopup1();
                    }
                }
            }
        };
        this.BTN_DTL.addClickListener(this.BTN_DTL_ClickListener);
        this.BTN_EXPORT_TXT_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocOffPrintCust.this.resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocOffPrintCust.this.mod1 = 0;
                    HashMap<String, String> extra = new HashMap();
                    extra.put("ORI_DATA_ID", OVocOffPrintCust.this.resultDs.getCurrentValue("ORI_DATA_ID"));
                    OVocOffPrintCust.this.BTN_EXPORT_TXT_Cmd.setExtraInfo(extra);
                    OVocOffPrintCust.this.BTN_EXPORT_TXT_Cmd.setCommandDataScope(DataScope.SELECT);
                    OVocOffPrintCust.this.BTN_EXPORT_TXT_Cmd.setCommandService("vocDownloadService", "downloadVocText");
                    OVocOffPrintCust.this.BTN_EXPORT_TXT.setDisabled(true);
                    OVocOffPrintCust.this.BTN_EXPORT_TXT_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocOffPrintCust.this.BTN_EXPORT_TXT.setDisabled(false);
                            if (status && callback.getErrorMessage() == null) {
                                if (callback.getCallbackCount() > 0) {
                                    System.out.println(callback.getCallbackData());
                                    Map<String, String> rsMap = (Map)callback.getCallbackData();
                                    String s = (String)rsMap.get("FILE_NAME");
                                    StringBuffer url = new StringBuffer();
                                    url.append(GWT.getModuleBaseURL());
                                    url.append("../do/download");
                                    url.append(s);
                                    Window.open(url.toString(), "_blank", "");
                                    System.out.println(url.toString());
                                    SC.say("导出成功");
                                } else {
                                    UPrompt.alert("提示", "导出失败");
                                }
                            } else if (callback.getErrorMessage() != null) {
                                UPrompt.alert("提示", "导出失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "导出失败");
                            }

                        }
                    });
                }
            }
        };
        this.BTN_EXPORT_TXT.addClickListener(this.BTN_EXPORT_TXT_ClickListener);
        this.BTN_EXPORT_EXCEL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocOffPrintCust.this.resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocOffPrintCust.this.mod1 = 1;
                    OVocOffPrintCust.this.BTN_EXPORT_EXCEL_Cmd.setCommandDataScope(DataScope.SELECT);
                    OVocOffPrintCust.this.BTN_EXPORT_EXCEL_Cmd.setCommandService("vocDownloadService", "downloadVocExcel");
                    OVocOffPrintCust.this.BTN_EXPORT_EXCEL.setDisabled(true);
                    OVocOffPrintCust.this.BTN_EXPORT_EXCEL_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocOffPrintCust.this.BTN_EXPORT_EXCEL.setDisabled(false);
                            if (status && callback.getErrorMessage() == null) {
                                if (callback.getCallbackCount() > 0) {
                                    System.out.println(callback.getCallbackData());
                                    Map<String, String> rsMap = (Map)callback.getCallbackData();
                                    String s = (String)rsMap.get("FILE_NAME");
                                    StringBuffer url = new StringBuffer();
                                    url.append(GWT.getModuleBaseURL());
                                    url.append("../do/download");
                                    url.append(s);
                                    Window.open(url.toString(), "_blank", "");
                                    System.out.println(url.toString());
                                    SC.say("导出成功");
                                } else {
                                    UPrompt.alert("提示", "导出失败");
                                }
                            } else if (callback.getErrorMessage() != null) {
                                UPrompt.alert("提示", "导出失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "导出失败");
                            }

                        }
                    });
                }
            }
        };
        this.BTN_EXPORT_EXCEL.addClickListener(this.BTN_EXPORT_EXCEL_ClickListener);
        this.BTN_CLOSE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocOffPrintCust.this.cyclePopup1();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
    }
}
