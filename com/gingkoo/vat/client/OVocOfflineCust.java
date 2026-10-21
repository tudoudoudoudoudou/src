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
import com.smartgwt.client.widgets.grid.ListGridRecord;
import java.util.HashMap;
import java.util.Map;

public class OVocOfflineCust extends OVocOffline {
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
    protected ClickListener BTN_OFF_PRINT_ClickListener;
    protected ClickListener BTN_SAVE_ClickListener;
    protected ClickListener BTN_CLOSE_ClickListener;

    public OVocOfflineCust() {
    }

    protected void setting() {
        this.setPageID("");
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
                OVocOfflineCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
    }

    protected void bindEvent() {
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
            	OVocOfflineCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocOfflineCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevise_001");
                OVocOfflineCust.this.BTN_INQ.setDisabled(true);
                OVocOfflineCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocOfflineCust.this.BTN_INQ.setDisabled(false);
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
        this.BTN_OFF_PRINT_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocOfflineCust.this.resultDs.getCurrentRecord() != null && OVocOfflineCust.this.resultDs.getSelectedRecords().length != 0) {
                        OVocOfflineCust.this.mod1 = 0;
                        OVocOfflineCust.this.BTN_OFF_PRINT_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocOfflineCust.this.BTN_OFF_PRINT_Cmd.setQuerySqlid("OVocRevise_002");
                        OVocOfflineCust.this.BTN_OFF_PRINT.setDisabled(true);
                        OVocOfflineCust.this.BTN_OFF_PRINT_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocOfflineCust.this.BTN_OFF_PRINT.setDisabled(false);
                                if (!status) {
                                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                } else if (callback.getCallbackCount() > 0) {
                                    OVocOfflineCust.this.BTN_OFF_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                    OVocOfflineCust.this.BTN_OFF_DTL_Cmd.setQuerySqlid("OVocRevise_003");
                                    OVocOfflineCust.this.BTN_OFF_DTL_Cmd.execute(new CommandCallback() {
                                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                                            OVocOfflineCust.this.BTN_SAVE.setVisible(true);
                                            OVocOfflineCust.this.detailSw1.setTitle("线下打印-明细查看");
                                            OVocOfflineCust.this.detailSw1.show();
                                            if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))) {
                                            	frmFPXX_VOC_NO.setRequired(true);
                                            	frmFPXX_VOC_DATE.setRequired(true);
                                            	frmFPXX_VOC_CODE.setRequired(false);
                                            }else{
                                            	frmFPXX_VOC_NO.setRequired(true);
                                            	frmFPXX_VOC_DATE.setRequired(true);
                                            	frmFPXX_VOC_CODE.setRequired(true);
                                            }
                                            
                                        }
                                    });
                                }
                            }
                        });
                } else {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                }
            }
        };
        this.BTN_OFF_PRINT.addClickListener(this.BTN_OFF_PRINT_ClickListener);
        this.BTN_SAVE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (!OVocOfflineCust.this.frmFPXX.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                } else {
                    Map<String, String> paramMap = new HashMap();
                    paramMap.put("VOC_STAT", "2");
                    /** modified by shuyue.he 20241105 修改service为EvatCommonService */
                    OVocOfflineCust.this.BTN_SAVE_Cmd.setCommandDataScope(DataScope.CURRENT);
                    OVocOfflineCust.this.BTN_SAVE_Cmd.setCommandService("evatCommonService", "updatePmVatOVocByVocType");
                    OVocOfflineCust.this.logtype1 = "mod";
                    OVocOfflineCust.this.BTN_SAVE.setDisabled(true);
                    OVocOfflineCust.this.BTN_SAVE_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocOfflineCust.this.BTN_SAVE.setDisabled(false);
                            if (status && callback.getErrorMessage() == null) {
                                UPrompt.alert("提示", "操作成功");
                                OVocOfflineCust.this.detailDs.logBiz("mod");
                                OVocOfflineCust.this.detailSw1.hide();
                                OVocOfflineCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                OVocOfflineCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevise_001");
                                OVocOfflineCust.this.BTN_INQ.setDisabled(true);
                                OVocOfflineCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                                        OVocOfflineCust.this.BTN_INQ.setDisabled(false);
                                        if (!status) {
                                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                        } else if (callback.getCallbackCount() == 0) {
                                            UPrompt.alert("提示", "查询无记录！");
                                        }

                                    }
                                });
                            } else if (callback.getErrorMessage() != null) {
                                UPrompt.alert("提示", OVocOfflineCust.this.stype1 + "失败:" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", OVocOfflineCust.this.stype1 + "失败！");
                            }

                        }
                    });
                }
            }
        };
        this.BTN_SAVE.addClickListener(this.BTN_SAVE_ClickListener);
        this.BTN_CLOSE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocOfflineCust.this.detailSw1.hide();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
    }
}
