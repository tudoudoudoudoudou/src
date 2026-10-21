//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gingkoo.vat.client;

import com.gingkoo.gui.core.client.context.ContextHelper;
import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.event.ValueChangeEvent;
import com.gingkoo.gui.data.client.dataset.event.ValueChangedListener;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickListener;
import com.smartgwt.client.types.SelectionAppearance;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import java.util.HashMap;
import java.util.Map;

public class OVocReviceCust extends OVocRevice {
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
    protected ClickListener BTN_MOD_ClickListener;
    protected ClickListener BTN_SAVE_ClickListener;
    protected ClickListener BTN_DTL_ClickListener;
    protected ClickListener BTN_MERGE_ClickListener;
    protected ClickListener BTN_SPLIT_ClickListener;
    protected ClickListener BTN_CLOSE_ClickListener;
    protected ClickListener BTN_FINISH_ClickListener;
    protected ClickListener BTN_GEN_ClickListener;
    protected ClickListener BTN_TAX_DTL_ClickListener;
    protected ClickListener BTN_OK_ClickListener;
    protected ClickListener BTN_BACK_ClickListener;
    protected ClickListener BTN_INQ1_ClickListener;
    protected ClickListener BTN_ADD1_ClickListener;
    protected ClickListener BTN_INQ2_ClickListener;
    protected ClickListener BTN_OK1_ClickListener;
    protected ClickListener BTN_DEL1_ClickListener;
    protected ClickListener BTN_OK2_ClickListener;
    protected ClickListener BTN_MERGE_VOC_ClickListener;
    protected ClickListener BTN_SPLIT1_ClickListener;
    protected ClickListener BTN_MERGE1_ClickListener;
    protected ClickListener BTN_MERGE2_ClickListener;
    protected ValueChangedListener SPLIT_TYPE_ValueChangedListener;
    protected RecordDoubleClickListener resultTb4_addRecordDoubleClickListener;
    private DataRecord[] stack1;

    // 发票渠道的ValueChanged事件
    protected ValueChangedListener VOC_CHANNEL_ValueChangedListener;

    public OVocReviceCust() {
    }

    protected void setting() {
        this.setPageID("");
    }

    public void cyclePopup1() {
        if (this.stack1 != null && this.stack1.length > 0) {
            this.resultDs.setCurrentRecord(this.stack1[0]);
            this.BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            this.BTN_DTL_Cmd.setQuerySqlid("OVocQuery_002");
            this.BTN_DTL_Cmd.execute(new CommandCallback() {
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else if (callback.getCallbackCount() > 0 && callback.getCallbackCount() > 0) {
                        OVocReviceCust.this.BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        OVocReviceCust.this.BTN_DTL2_Cmd.setQuerySqlid("OVocQuery_003");
                        OVocReviceCust.this.BTN_DTL2_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocReviceCust.this.detailSw1.setTitle("发票信息-" + OVocReviceCust.this.stype1);
                                OVocReviceCust.this.detailSw1.show();
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
            this.BTN_INQ_Cmd.setQuerySqlid("OVocRevice_001");
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
        this.frmCXXX_BUY_TAX_NO.setReferenceCmd(this.refNmd, false);
        HashMap<String, Object> mapqueryDs = new HashMap();
        this.queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                OVocReviceCust.this.frmCXXX.editRecord(gridRecord);
            }
        });
        HashMap<String, String> extra = new HashMap();
        extra.put("IO_FLAG", "O");
        this.TXCODE_INQ_Cmd.setExtraInfo(extra);
        this.TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        this.TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        this.TXCODE_INQ_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                OVocReviceCust.this.resultTb2.getUField("TX_CODE").bindDropdownDataset(OVocReviceCust.this.txcodeDs, "tx_code", "tx_name");
            }
        });
        HashMap<String, Object> mapqueryDs1 = new HashMap();
        this.queryDs1.addDataRecord(new DataRecord(mapqueryDs1), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                OVocReviceCust.this.frmCXXX1.editRecord(gridRecord);
            }
        });
        HashMap<String, Object> mapqueryDs2 = new HashMap();
        this.queryDs2.addDataRecord(new DataRecord(mapqueryDs2), new DataAction() {
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                OVocReviceCust.this.frmCXXX2.editRecord(gridRecord);
            }
        });
    }

    protected void bindEvent() {
        this.detailSw1.addCloseClickHandler(new CloseClickHandler() {
            public void onCloseClick(CloseClickEvent event) {
                OVocReviceCust.this.cyclePopup1();
            }
        });
        this.BTN_INQ_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                OVocReviceCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevice_001");
                OVocReviceCust.this.BTN_INQ.setDisabled(true);
                OVocReviceCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocReviceCust.this.BTN_INQ.setDisabled(false);
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
        this.BTN_MOD_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocReviceCust.this.mod1 = 1;
                    OVocReviceCust.this.stype1 = "修改";
                    if (OVocReviceCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocReviceCust.this.stack1 = OVocReviceCust.this.resultDs.getSelectedRecords();
                        OVocReviceCust.this.cyclePopup1();
                        OVocReviceCust.this.resultTb2.setSelectionAppearance(SelectionAppearance.CHECKBOX);
                        OVocReviceCust.this.BTN_SAVE.show();
                        OVocReviceCust.this.BTN_SPLIT.hide();
                        OVocReviceCust.this.BTN_TAX_DTL.hide();
                        OVocReviceCust.this.BTN_OK.hide();
                        OVocReviceCust.this.BTN_CLOSE.show();
                        OVocReviceCust.this.BTN_SAVE.show();
                        OVocReviceCust.this.BTN_MERGE2.show();
                        OVocReviceCust.this.frmKHXX.setReadOnly(true);
                        OVocReviceCust.this.frmFPXX.setReadOnly(false);
                        OVocReviceCust.this.frmXFXX.setReadOnly(true);
                        OVocReviceCust.this.frmQTFPXX.setReadOnly("VOC_FLAG", false);
                        OVocReviceCust.this.frmQTFPXX.setReadOnly("MEDIA_TYPE", false);
                        OVocReviceCust.this.frmQTFPXX_VOC_FLAG.setRequired(true);
                        OVocReviceCust.this.frmQTFPXX_MEDIA_TYPE.setRequired(true);
                        if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))){
                            frmQTFPXX_PAYEE_NAME.hide();
                        }else{
                            frmQTFPXX_PAYEE_NAME.show();
                        }
                    }
                }
            }
        };
        this.BTN_MOD.addClickListener(this.BTN_MOD_ClickListener);
        this.BTN_DTL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocReviceCust.this.mod1 = 6;
                    OVocReviceCust.this.stype1 = "查看明细";
                    if (OVocReviceCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocReviceCust.this.stack1 = OVocReviceCust.this.resultDs.getSelectedRecords();
                        OVocReviceCust.this.cyclePopup1();
                        OVocReviceCust.this.resultTb2.setSelectionAppearance(SelectionAppearance.CHECKBOX);
                        OVocReviceCust.this.BTN_SAVE.hide();
                        OVocReviceCust.this.frmKHXX.setReadOnly(true);
                        OVocReviceCust.this.frmFPXX.setReadOnly(true);
                        OVocReviceCust.this.frmXFXX.setReadOnly(true);
                        OVocReviceCust.this.frmQTFPXX.setReadOnly(true);
                        OVocReviceCust.this.frmQTFPXX.setReadOnly("VOC_FLAG", true);
                        OVocReviceCust.this.frmQTFPXX.setReadOnly("MEDIA_TYPE", true);
                        OVocReviceCust.this.frmQTFPXX_VOC_FLAG.setRequired(false);
                        OVocReviceCust.this.frmQTFPXX_MEDIA_TYPE.setRequired(false);
                        OVocReviceCust.this.BTN_SPLIT.show();
                        OVocReviceCust.this.BTN_MERGE2.show();
                        OVocReviceCust.this.BTN_TAX_DTL.show();
                        OVocReviceCust.this.BTN_OK.hide();
                        if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))){
                            frmQTFPXX_PAYEE_NAME.hide();
                        }else{
                            frmQTFPXX_PAYEE_NAME.show();
                        }
                    }
                }
            }
        };
        this.BTN_DTL.addClickListener(this.BTN_DTL_ClickListener);
        this.BTN_MERGE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.mod1 = 0;
                if (OVocReviceCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    DataRecord[] selectedRecords = OVocReviceCust.this.resultDs.getSelectedRecords();
                    if (selectedRecords.length <= 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else if (selectedRecords.length < 2) {
                        UPrompt.alert("提示", "请选择至少2条需要操作的记录");
                    } else {
                        String fstVocType = selectedRecords[0].getValue("VOC_TYPE");
                        String fstVocFlag = selectedRecords[0].getValue("VOC_FLAG");
                        String fstCustNo = selectedRecords[0].getValue("CUST_NO");
                        DataRecord[] var6 = selectedRecords;
                        int var7 = selectedRecords.length;

                        for(int var8 = 0; var8 < var7; ++var8) {
                            DataRecord dr = var6[var8];
                            if (!fstVocType.equals(dr.getValue("VOC_TYPE"))) {
                                UPrompt.alert("提示", "合并发票的发票性质必须一致");
                                return;
                            }

                            if (!fstVocFlag.equals(dr.getValue("VOC_FLAG"))) {
                                UPrompt.alert("提示", "合并发票的发票类型必须一致");
                                return;
                            }

                            if (!fstCustNo.equals(dr.getValue("CUST_NO"))) {
                                UPrompt.alert("提示", "合并发票必须为同一个客户");
                                return;
                            }
                        }

                        OVocReviceCust.this.BTN_MERGE_Cmd.setCommandDataScope(DataScope.SELECT);
                        OVocReviceCust.this.BTN_MERGE_Cmd.setCommandService("vatCommonService", "oVocReviceMerge");
                        OVocReviceCust.this.BTN_MERGE.setDisabled(true);
                        OVocReviceCust.this.BTN_MERGE_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocReviceCust.this.BTN_MERGE.setDisabled(false);
                                if (!status) {
                                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                } else {
                                    UPrompt.alert("提示", "合并成功");
                                    OVocReviceCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                    OVocReviceCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevice_001");
                                    OVocReviceCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
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
                        });
                    }
                }
            }
        };
        VOC_CHANNEL_ValueChangedListener = new ValueChangedListener("VOC_CHANNEL") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                // TODO Auto-generated method stub
                if ("02".equals(event.getNewValue())) {
                    detailDs.setCurrentValue("MEDIA_TYPE","E");
                    detailDs.setCurrentValue("PAYEE_NAME","");
                    detailDs.sync();
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    detailDs.setCurrentValue("MEDIA_TYPE","P");
                    detailDs.sync();
                    frmQTFPXX_PAYEE_NAME.show();
                }
            }
        };
        this.BTN_MERGE.addClickListener(this.BTN_MERGE_ClickListener);
        this.BTN_MERGE2_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.mod1 = 0;
                if (OVocReviceCust.this.resultDs2.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    DataRecord[] selectedRecordss = OVocReviceCust.this.resultDs2.getSelectedRecords();
                    if (selectedRecordss.length <= 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else if (selectedRecordss.length < 2) {
                        UPrompt.alert("提示", "请选择至少2条需要操作的记录");
                    } else {
                        String fstDtlName = selectedRecordss[0].getValue("DTL_NAME");
                        String fstTxCode = selectedRecordss[0].getValue("TX_CODE");
                        String fstGoodType = selectedRecordss[0].getValue("GOOD_TYPE");
                        String fstTaxRate = selectedRecordss[0].getValue("TAX_RATE");
                        DataRecord[] var7 = selectedRecordss;
                        int var8 = selectedRecordss.length;

                        for(int var9 = 0; var9 < var8; ++var9) {
                            DataRecord dr = var7[var9];
                            String goodType = dr.getValue("GOOD_TYPE");
                            if (!fstDtlName.equals(dr.getValue("DTL_NAME"))) {
                                UPrompt.alert("提示", "合并发票明细的名称必须一致");
                                return;
                            }

                            if (!fstTxCode.equals(dr.getValue("TX_CODE"))) {
                                UPrompt.alert("提示", "合并发票明细的交易编码必须一致");
                                return;
                            }

                            if (goodType != null && !"".equals(goodType) && !fstGoodType.equals(dr.getValue("GOOD_TYPE"))) {
                                UPrompt.alert("提示", "合并发票明细的规格型号必须一致");
                                return;
                            }

                            if (!fstTaxRate.equals(dr.getValue("TAX_RATE"))) {
                                UPrompt.alert("提示", "合并发票明细的税率必须一致");
                                return;
                            }
                        }

                        OVocReviceCust.this.BTN_MERGE2_Cmd.setCommandDataScope(DataScope.SELECT);
                        OVocReviceCust.this.BTN_MERGE2_Cmd.setCommandService("vatCommonService", "oVocReviceDTLMerge");
                        OVocReviceCust.this.BTN_MERGE2.setDisabled(true);
                        OVocReviceCust.this.BTN_MERGE2_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocReviceCust.this.BTN_MERGE2.setDisabled(false);
                                if (!status) {
                                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                                } else {
                                    UPrompt.alert("提示", "合并成功");
                                    OVocReviceCust.this.BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                    OVocReviceCust.this.BTN_DTL2_Cmd.setQuerySqlid("OVocQuery_003");
                                    OVocReviceCust.this.BTN_DTL2_Cmd.execute(new CommandCallback() {
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
                        });
                    }
                }
            }
        };
        this.BTN_MERGE2.addClickListener(this.BTN_MERGE2_ClickListener);
        this.BTN_FINISH_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs.getSelectedRecords().length <= 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocReviceCust.this.BTN_FINISH_Cmd.setCommandDataScope(DataScope.SELECT);
                    OVocReviceCust.this.BTN_FINISH_Cmd.setCommandService("vatCommonService", "oVocAmtCheck");
                    OVocReviceCust.this.BTN_FINISH.setDisabled(true);
                    OVocReviceCust.this.BTN_FINISH_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            if (!status) {
                                UPrompt.alert("提示", "提交失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                String checkResult = (String)callback.getCallbackData();
                                if ("true".equalsIgnoreCase(checkResult)) {
                                    UPrompt.alert("提示", "所选择的发票中，发票明细项目有小于或才等于0的记录，不能提交！");
                                    OVocReviceCust.this.BTN_FINISH.setDisabled(false);
                                    return;
                                }

                                UPrompt.confirm("自动开票管理", "请确认是否将所选记录提交审核？", new UPrompt.PromptCallback() {
                                    public void execute(Boolean value) {
                                        if (value != null && value) {
                                            OVocReviceCust.this.BTN_FINISH_Cmd.setCommandDataScope(DataScope.SELECT);
                                            OVocReviceCust.this.BTN_FINISH_Cmd.setDBService("vatCommonFinishService", "execute");
                                            OVocReviceCust.this.BTN_FINISH_Cmd.setQuerySqlid("OVocRevice_001");
                                            OVocReviceCust.this.BTN_FINISH_Cmd.setHead("ADDINFO", "PmVatOVoc");
                                            OVocReviceCust.this.BTN_FINISH_Cmd.setHead("APVSTATUS", "0");
                                            OVocReviceCust.this.BTN_FINISH_Cmd.setHead("CTLNAME", "BTN_FINISH");
                                            OVocReviceCust.this.BTN_FINISH_Cmd.execute(new CommandCallback() {
                                                public void onCallback(boolean status, Callback callback, String commandItemName) {
                                                    if (status && callback.getErrorMessage() == null) {
                                                        UPrompt.alert("提示", "操作成功！");
                                                        OVocReviceCust.this.BTN_FINISH.setDisabled(false);
                                                        OVocReviceCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                                        OVocReviceCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevice_001");
                                                        OVocReviceCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
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
                                        }

                                    }
                                });
                            }

                        }
                    });
                }
            }
        };
        this.BTN_FINISH.addClickListener(this.BTN_FINISH_ClickListener);
        this.BTN_SPLIT_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs2.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs2.getSelectedRecords().length <= 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs2.getRecordCount() < 2) {
                    UPrompt.alert("提示", "待拆分发票至少包含2条明细");
                } else if (OVocReviceCust.this.resultDs2.getSelectedRecords().length == OVocReviceCust.this.resultDs2.getRecordCount()) {
                    UPrompt.alert("提示", "禁止将所有明细拆出");
                } else {
                    OVocReviceCust.this.mod1 = 0;
                    OVocReviceCust.this.BTN_SPLIT_Cmd.setHead("CTLNAME", "BTN_ADD");
                    OVocReviceCust.this.BTN_SPLIT_Cmd.setCommandDataScope(DataScope.SELECT);
                    OVocReviceCust.this.BTN_SPLIT_Cmd.setCommandService("vatCommonService", "oVocReviceSplit");
                    OVocReviceCust.this.BTN_SPLIT.setDisabled(true);
                    OVocReviceCust.this.BTN_SPLIT_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocReviceCust.this.BTN_SPLIT.setDisabled(false);
                            if (!status) {
                                UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "拆分成功");
                                OVocReviceCust.this.detailSw1.hide();
                                OVocReviceCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                OVocReviceCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevice_001");
                                OVocReviceCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
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
                    });
                }
            }
        };
        this.BTN_SPLIT.addClickListener(this.BTN_SPLIT_ClickListener);
        this.BTN_SAVE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (!OVocReviceCust.this.frmQTFPXX.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                } else {
                    String bizType = OVocReviceCust.this.detailDs.getCurrentValue("BIZ_TYPE");
                    if ("1".equals(bizType)) {
                        String refId = OVocReviceCust.this.detailDs.getCurrentValue("REF_ID");
                        if (refId == null || "".equals(refId)) {
                            UPrompt.alert("提示", "冲正交易的原交易ID不能为空");
                            return;
                        }
                    }

                    OVocReviceCust.this.logtype1 = "new";
                    OVocReviceCust.this.detailDs.setCurrentValue("IDENTIFY_FLAG", "N");
                    if (OVocReviceCust.this.mod1 == 1) {
                        OVocReviceCust.this.BTN_SAVE_Cmd.setDBService("vatCommonUpdSaveService", "execute");
                        OVocReviceCust.this.BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_MOD");
                        OVocReviceCust.this.logtype1 = "mod";
                        OVocReviceCust.this.stype1 = "修改";
                    }

                    OVocReviceCust.this.BTN_SAVE.setDisabled(true);
                    OVocReviceCust.this.BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
                    OVocReviceCust.this.BTN_SAVE_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocReviceCust.this.BTN_SAVE.setDisabled(false);
                            if (status && callback.getErrorMessage() == null) {
                                UPrompt.alert("提示", "操作成功", new UPrompt.PromptCallback() {
                                    public void execute(Boolean value) {
                                        OVocReviceCust.this.detailDs.logBiz(OVocReviceCust.this.logtype1);
                                        OVocReviceCust.this.cyclePopup1();
                                    }
                                });
                            } else if (callback.getErrorMessage() != null) {
                                UPrompt.alert("提示", OVocReviceCust.this.stype1 + "失败:" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", OVocReviceCust.this.stype1 + "失败！");
                            }

                        }
                    });
                }
            }
        };
        this.BTN_SAVE.addClickListener(this.BTN_SAVE_ClickListener);
        this.BTN_CLOSE_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.cyclePopup1();
            }
        };
        this.BTN_CLOSE.addClickListener(this.BTN_CLOSE_ClickListener);
        this.BTN_BACK_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocReviceCust.this.mod1 = 6;
                    OVocReviceCust.this.stype1 = "明细退回";
                    if (OVocReviceCust.this.resultDs.getSelectedRecords().length == 0) {
                        UPrompt.alert("提示", "请选择需要操作的记录");
                    } else {
                        OVocReviceCust.this.stack1 = OVocReviceCust.this.resultDs.getSelectedRecords();
                        OVocReviceCust.this.cyclePopup1();
                        OVocReviceCust.this.resultTb2.setSelectionAppearance(SelectionAppearance.ROW_STYLE);
                        OVocReviceCust.this.frmKHXX.setReadOnly(true);
                        OVocReviceCust.this.frmFPXX.setReadOnly(true);
                        OVocReviceCust.this.frmXFXX.setReadOnly(true);
                        OVocReviceCust.this.frmQTFPXX.setReadOnly(true);
                        OVocReviceCust.this.frmQTFPXX_VOC_FLAG.setRequired(false);
                        OVocReviceCust.this.frmQTFPXX_MEDIA_TYPE.setRequired(false);
                        OVocReviceCust.this.BTN_SPLIT.hide();
                        OVocReviceCust.this.BTN_TAX_DTL.hide();
                        OVocReviceCust.this.BTN_OK.show();
                        OVocReviceCust.this.BTN_SAVE.hide();
                        OVocReviceCust.this.BTN_MERGE2.hide();
                    }
                }
            }
        };
        this.BTN_BACK.addClickListener(this.BTN_BACK_ClickListener);
        this.BTN_GEN_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.mod1 = 0;
                Map<String, String> extra = new HashMap();
                extra.put("BOUC_MONTH", ContextHelper.getContext().getValue("FAL_BUOC_MONTH"));
                extra.put("BY_VOC_RULE", "Y");
                extra.put("SQL_ID", "SP_VAT_VOC_MADE");
                OVocReviceCust.this.BTN_GEN_Cmd.setCommandService("vatCommonService", "CallProc");
                OVocReviceCust.this.BTN_GEN_Cmd.setExtraInfo(extra);
                OVocReviceCust.this.BTN_GEN.setDisabled(true);
                OVocReviceCust.this.BTN_GEN_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocReviceCust.this.BTN_GEN.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "生成发票数据失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            UPrompt.alert("提示", "生成发票数据成功");
                        }

                    }
                });
            }
        };
        this.BTN_GEN.addClickListener(this.BTN_GEN_ClickListener);
        this.BTN_OK_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.BTN_OK_Cmd.setCommandService("vatCommonService", "oVocReviceBack");
                OVocReviceCust.this.BTN_OK.setDisabled(true);
                OVocReviceCust.this.BTN_OK_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocReviceCust.this.BTN_OK.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "提交失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            OVocReviceCust.this.detailSw1.hide();
                            UPrompt.alert("提示", "退回成功");
                            OVocReviceCust.this.BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            OVocReviceCust.this.BTN_INQ_Cmd.setQuerySqlid("OVocRevice_001");
                            OVocReviceCust.this.BTN_INQ_Cmd.execute(new CommandCallback() {
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
                });
            }
        };
        this.BTN_OK.addClickListener(this.BTN_OK_ClickListener);
        this.BTN_TAX_DTL_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs2.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs2.getSelectedRecords().length <= 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    OVocReviceCust.this.list1();
                    OVocReviceCust.this.detailSw2.show();
                }
            }
        };
        this.BTN_TAX_DTL.addClickListener(this.BTN_TAX_DTL_ClickListener);
        this.BTN_INQ1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.list1();
            }
        };
        this.BTN_INQ1.addClickListener(this.BTN_INQ1_ClickListener);
        this.BTN_ADD1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.queryDs2.setCurrentValue("CUST_NO", OVocReviceCust.this.resultDs3.getCurrentValue("CUST_NO"));
                OVocReviceCust.this.queryDs2.setCurrentValue("TAX_RATE", OVocReviceCust.this.resultDs3.getCurrentValue("TAX_RATE"));
                OVocReviceCust.this.queryDs2.setCurrentValue("IS_TAX", OVocReviceCust.this.resultDs3.getCurrentValue("IS_TAX"));
                OVocReviceCust.this.queryDs2.setCurrentValue("CACL_TAX_TYPE", OVocReviceCust.this.resultDs3.getCurrentValue("CACL_TAX_TYPE"));
                OVocReviceCust.this.list2();
                OVocReviceCust.this.detailSw3.show();
            }
        };
        this.BTN_ADD1.addClickListener(this.BTN_ADD1_ClickListener);
        this.BTN_INQ2_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.list2();
            }
        };
        this.BTN_INQ2.addClickListener(this.BTN_INQ2_ClickListener);
        this.BTN_OK1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.BTN_DTL_SAVE_Cmd.setCommandService("vatCommonService", "OVocReviseListAdd");
                Map<String, String> extra = new HashMap();
                extra.put("VOC_DATA_ID", OVocReviceCust.this.resultDs.getCurrentValue("DATA_ID"));
                extra.put("DTL_DATA_ID", OVocReviceCust.this.resultDs2.getCurrentValue("DATA_ID"));
                extra.put("LIST_DATA_ID", OVocReviceCust.this.resultDs4.getCurrentValue("DATA_ID"));
                extra.put("TX_ID", OVocReviceCust.this.resultDs4.getCurrentValue("TX_ID"));
                OVocReviceCust.this.BTN_DTL_SAVE_Cmd.setExtraInfo(extra);
                OVocReviceCust.this.BTN_DTL_SAVE_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocReviceCust.this.detailSw3.hide();
                        if (!status) {
                            UPrompt.alert("提示", "提交失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            OVocReviceCust.this.list1();
                        }

                    }
                });
            }
        };
        this.BTN_OK1.addClickListener(this.BTN_OK1_ClickListener);
        this.resultTb4_addRecordDoubleClickListener = new RecordDoubleClickListener() {
            public void onRecordClick(RecordDoubleClickEvent event) {
                OVocReviceCust.this.BTN_DTL_SAVE_Cmd.setCommandService("vatCommonService", "OVocReviseListAdd");
                Map<String, String> extra = new HashMap();
                extra.put("VOC_DATA_ID", OVocReviceCust.this.resultDs.getCurrentValue("DATA_ID"));
                extra.put("DTL_DATA_ID", OVocReviceCust.this.resultDs2.getCurrentValue("DATA_ID"));
                extra.put("LIST_DATA_ID", OVocReviceCust.this.resultDs4.getCurrentValue("DATA_ID"));
                extra.put("TX_ID", OVocReviceCust.this.resultDs4.getCurrentValue("TX_ID"));
                OVocReviceCust.this.BTN_DTL_SAVE_Cmd.setExtraInfo(extra);
                OVocReviceCust.this.BTN_DTL_SAVE_Cmd.execute(new CommandCallback() {
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        OVocReviceCust.this.detailSw3.hide();
                        if (!status) {
                            UPrompt.alert("提示", "提交失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            OVocReviceCust.this.list1();
                        }

                    }
                });
            }
        };
        this.resultTb4.addRecordDoubleClickListener(this.resultTb4_addRecordDoubleClickListener);
        this.BTN_DEL1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs3.getSelectedRecords().length <= 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs3.getSelectedRecords().length == OVocReviceCust.this.resultDs3.getRecordCount()) {
                    UPrompt.alert("提示", "至少保留一条记录");
                } else if (OVocReviceCust.this.resultDs3.getSelectedRecords().length > 1) {
                    UPrompt.alert("提示", "只能选择一条记录");
                } else {
                    Map<String, String> extra = new HashMap();
                    extra.put("VOC_DATA_ID", OVocReviceCust.this.resultDs.getCurrentValue("DATA_ID"));
                    extra.put("DTL_DATA_ID", OVocReviceCust.this.resultDs2.getCurrentValue("DATA_ID"));
                    extra.put("LIST_DATA_ID", OVocReviceCust.this.resultDs3.getCurrentValue("DATA_ID"));
                    extra.put("TX_ID", OVocReviceCust.this.resultDs3.getCurrentValue("TX_ID"));
                    OVocReviceCust.this.BTN_DTL_DEL_Cmd.setExtraInfo(extra);
                    OVocReviceCust.this.BTN_DTL_DEL_Cmd.setCommandService("vatCommonService", "OVocReviseListDel");
                    OVocReviceCust.this.BTN_DTL_DEL_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocReviceCust.this.detailSw3.hide();
                            if (!status) {
                                UPrompt.alert("提示", "提交失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                OVocReviceCust.this.list1();
                            }

                        }
                    });
                }
            }
        };
        this.BTN_DEL1.addClickListener(this.BTN_DEL1_ClickListener);
        this.BTN_CLOSE1.addClickListener(new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.detailSw2.hide();
            }
        });
        this.BTN_CLOSE2.addClickListener(new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.detailSw3.hide();
            }
        });
        this.BTN_CLOSE3.addClickListener(new ClickListener() {
            public void onClick(ClickEvent event) {
                OVocReviceCust.this.splitSw.hide();
            }
        });
        this.BTN_SPLIT1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs3.getSelectedRecords().length <= 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs3.getSelectedRecords().length > 1) {
                    UPrompt.alert("提示", "请选择一条操作记录");
                } else {
                    HashMap<String, Object> mapqueryDs = new HashMap();
                    mapqueryDs.put("CURR_AMT", OVocReviceCust.this.resultDs3.getCurrentValue("AMOUNT"));
                    mapqueryDs.put("SPLIT_TYPE", "1");
                    OVocReviceCust.this.splitDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
                        public void doAction(DataRecord record) {
                            System.out.println("insert empty record: " + record.getDataMap());
                            ListGridRecord gridRecord = record.getViewRecord();
                            OVocReviceCust.this.frmYWXQ1.editRecord(gridRecord);
                            OVocReviceCust.this.splitSw.show();
                            OVocReviceCust.this.frmYWXQ1Ctl();
                        }
                    });
                }
            }
        };
        this.BTN_SPLIT1.addClickListener(this.BTN_SPLIT1_ClickListener);
        this.BTN_MERGE_VOC_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs3.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs3.getSelectedRecords().length <= 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs3.getSelectedRecords().length == OVocReviceCust.this.resultDs3.getRecordCount()) {
                    UPrompt.alert("提示", "禁止将所有明细拆出");
                } else {
                    OVocReviceCust.this.BTN_MERGE_VOC.setDisabled(true);
                    OVocReviceCust.this.BTN_MERGE_VOC_Cmd.setCommandDataScope(DataScope.SELECT);
                    OVocReviceCust.this.BTN_MERGE_VOC_Cmd.setCommandService("vatCommonService", "vocMergeTxDtl");
                    OVocReviceCust.this.BTN_MERGE_VOC_Cmd.setHead("CTLNAME", "BTN_MERGE_VOC");
                    OVocReviceCust.this.BTN_MERGE_VOC_Cmd.setHead("APVSTATUS", "0");
                    OVocReviceCust.this.BTN_MERGE_VOC_Cmd.setHead("ADDINFO", "PmVatOVoc");
                    OVocReviceCust.this.BTN_MERGE_VOC_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocReviceCust.this.BTN_MERGE_VOC.setDisabled(false);
                            if (!status) {
                                UPrompt.alert("提示", "合并失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "合并成功");
                                OVocReviceCust.this.list1();
                            }

                        }
                    });
                }
            }
        };
        this.BTN_MERGE_VOC.addClickListener(this.BTN_MERGE_VOC_ClickListener);
        this.BTN_OK2_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs3.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else {
                    String splitType = OVocReviceCust.this.splitDs.getCurrentValue("SPLIT_TYPE");
                    if (splitType != null && !"".equals(splitType)) {
                        String currAmt;
                        if ("0".equals(splitType)) {
                            currAmt = OVocReviceCust.this.splitDs.getCurrentValue("SPLIT_NUM");
                            if (currAmt == null || "".equals(currAmt)) {
                                UPrompt.alert("提示", "请填写拆分笔数");
                                return;
                            }

                            if (Integer.valueOf(currAmt) < 2) {
                                UPrompt.alert("提示", "拆出笔数至少2笔");
                                return;
                            }
                        } else {
                            if (!"1".equals(splitType)) {
                                UPrompt.alert("提示", "拆分方式非法");
                                return;
                            }

                            currAmt = OVocReviceCust.this.splitDs.getCurrentValue("CURR_AMT");
                            String splitAmt = OVocReviceCust.this.splitDs.getCurrentValue("SPLIT_AMT");
                            if (splitAmt == null || "".equals(splitAmt)) {
                                UPrompt.alert("提示", "请填写拆分金额");
                                return;
                            }

                            if (Double.valueOf(currAmt.replaceAll(",", "")) < Double.valueOf(splitAmt.replaceAll(",", ""))) {
                                UPrompt.alert("提示", "拆出金额必须小于当前金额");
                                return;
                            }
                        }

                        Map<String, String> extra = new HashMap();
                        extra.put("DATA_ID", OVocReviceCust.this.resultDs3.getCurrentValue("DATA_ID"));
                        OVocReviceCust.this.BTN_SPLIT1_Cmd.setExtraInfo(extra);
                        OVocReviceCust.this.BTN_OK2.setDisabled(true);
                        OVocReviceCust.this.BTN_SPLIT1_Cmd.setCommandService("vatCommonService", "vocTxDtlSplit");
                        OVocReviceCust.this.BTN_SPLIT1_Cmd.execute(new CommandCallback() {
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                OVocReviceCust.this.BTN_OK2.setDisabled(false);
                                if (!status) {
                                    UPrompt.alert("提示", "拆分失败，错误信息：" + callback.getErrorMessage());
                                } else {
                                    UPrompt.alert("提示", "拆分成功");
                                    OVocReviceCust.this.splitSw.hide();
                                    OVocReviceCust.this.list1();
                                }

                            }
                        });
                    } else {
                        UPrompt.alert("提示", "请选择拆分方式");
                    }
                }
            }
        };
        this.BTN_OK2.addClickListener(this.BTN_OK2_ClickListener);
        this.BTN_MERGE1_ClickListener = new ClickListener() {
            public void onClick(ClickEvent event) {
                if (OVocReviceCust.this.resultDs3.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                } else if (OVocReviceCust.this.resultDs3.getSelectedRecords().length < 2) {
                    UPrompt.alert("提示", "所合并明细至少2笔");
                } else {
                    for(int i = 0; i < OVocReviceCust.this.resultDs3.getSelectedRecords().length; ++i) {
                        for(int j = i + 1; j < OVocReviceCust.this.resultDs3.getSelectedRecords().length; ++j) {
                            if (!OVocReviceCust.this.resultDs3.getSelectedRecords()[i].getValue("TX_ID").equals(OVocReviceCust.this.resultDs3.getSelectedRecords()[j].getValue("TX_ID"))) {
                                UPrompt.alert("提示", "交易ID不同无法进行合并操作");
                                return;
                            }
                        }
                    }

                    OVocReviceCust.this.BTN_MERGE1.setDisabled(true);
                    OVocReviceCust.this.BTN_MERGE1_Cmd.setCommandDataScope(DataScope.SELECT);
                    OVocReviceCust.this.BTN_MERGE1_Cmd.setCommandService("vatCommonService", "vocTxDtlMerge");
                    OVocReviceCust.this.BTN_MERGE1_Cmd.execute(new CommandCallback() {
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            OVocReviceCust.this.BTN_MERGE1.setDisabled(false);
                            if (!status) {
                                UPrompt.alert("提示", "合并失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                UPrompt.alert("提示", "合并成功");
                                OVocReviceCust.this.list1();
                            }

                        }
                    });
                }
            }
        };
        this.BTN_MERGE1.addClickListener(this.BTN_MERGE1_ClickListener);
        this.SPLIT_TYPE_ValueChangedListener = new ValueChangedListener("SPLIT_TYPE") {
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                OVocReviceCust.this.frmYWXQ1Ctl();
            }
        };
        this.frmYWXQ1_SPLIT_TYPE.addValueChangedListener(this.SPLIT_TYPE_ValueChangedListener);
    }

    public void list1() {
        this.queryDs1.setCurrentValue("PDATA_ID", this.resultDs2.getCurrentValue("DATA_ID"));
        this.BTN_DTL3_Cmd.setCommandService("commonQueryService", "commonQueryPage");
        this.BTN_DTL3_Cmd.setQuerySqlid("OVocRevice_004");
        this.BTN_DTL3_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                if (!status) {
                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                } else if (callback.getCallbackCount() == 0) {
                    UPrompt.alert("提示", "查询无记录！");
                }

            }
        });
    }

    public void list2() {
        this.BTN_DTL4_Cmd.setCommandService("commonQueryService", "commonQueryPage");
        this.BTN_DTL4_Cmd.setQuerySqlid("OVocRevice_005");
        this.BTN_DTL4_Cmd.execute(new CommandCallback() {
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                if (!status) {
                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                } else if (callback.getCallbackCount() == 0) {
                    UPrompt.alert("提示", "查询无记录！");
                }

            }
        });
    }

    public void frmYWXQ1Ctl() {
        String splitType = this.splitDs.getCurrentValue("SPLIT_TYPE");
        if (splitType != null && !"".equals(splitType)) {
            if ("0".equals(splitType)) {
                this.frmYWXQ1.getField("SPLIT_AMT").hide();
                this.frmYWXQ1.getField("SPLIT_NUM").show();
            } else if ("1".equals(splitType)) {
                this.frmYWXQ1.getField("SPLIT_AMT").show();
                this.frmYWXQ1.getField("SPLIT_NUM").hide();
            }

        }
    }
}
