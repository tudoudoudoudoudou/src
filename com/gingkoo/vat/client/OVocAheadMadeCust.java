package com.gingkoo.vat.client;

import com.gingkoo.gui.core.client.context.ContextHelper;
import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.gui.data.client.command.item.Param;
import com.gingkoo.gui.data.client.command.item.ParamSet;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.event.ValueChangeEvent;
import com.gingkoo.gui.data.client.dataset.event.ValueChangedListener;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class OVocAheadMadeCust extends OVocAheadMade {

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
    // 按钮新增的点击事件;
    protected ClickListener BTN_ADD_ClickListener;
    // 按钮修改的点击事件;
    protected ClickListener BTN_MOD_ClickListener;
    // 按钮删除的点击事件;
    protected ClickListener BTN_DEL_ClickListener;
    // 按钮修改明细的点击事件;
    protected ClickListener BTN_MOD_DTL_ClickListener;
    // 按钮明细信息的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    // 按钮提交的点击事件;
    protected ClickListener BTN_SAVE_ClickListener;
    // 按钮返回的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    // 按钮新增的点击事件;
    protected ClickListener BTN_ADD1_ClickListener;
    // 按钮修改的点击事件;
    protected ClickListener BTN_MOD1_ClickListener;
    // 按钮删除的点击事件;
    protected ClickListener BTN_DEL1_ClickListener;
    // 按钮返回的点击事件;
    protected ClickListener BTN_CANCLE_ClickListener;
    // 按钮提交的点击事件;
    protected ClickListener BTN_SAVE1_ClickListener;
    // 按钮返回的点击事件;
    protected ClickListener BTN_CLOSE1_ClickListener;

    // 发票类型的ValueChanged事件
    protected ValueChangedListener VOC_FLAG_ValueChangedListener;
    // 发票渠道的ValueChanged事件
    protected ValueChangedListener VOC_CHANNEL_ValueChangedListener;
    // 收入的ValueChanged事件
    protected ValueChangedListener INS_AMT_ValueChangedListener;
    // 交易编码的ValueChanged事件
    protected ValueChangedListener TX_CODE_ValueChangedListener;

    protected ValueChangedListener TAX_RATE_ValueChangedListener;

    protected ValueChangedListener HAS_TAX_ValueChangedListener;

    // 业务是否发生字段的ValueChange事件-------AddedByCiel151203
    protected ValueChangedListener IS_HAPPEN_ValueChangeListener;
    // 数量的ValueChanged事件
    protected ValueChangedListener GOOD_NUM_ValueChangedListener;
    //是否享受优惠政策的valueChanged事件
    protected ValueChangedListener DISCOUNT_FLAG_ValueChangedListener;
    //计税方式的valueChanged事件
    protected ValueChangedListener CACL_TAX_TYPE_ValueChangedListener;
    //客户的valueChange事件

    protected String data_id = "";
    protected String data_id1 = "";
    protected String data_id2 = "";

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
            BTN_DTL_Cmd.setQuerySqlid("OVocAheadMade_002");
            // BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    // BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            // 对于通用查询需要设置SQLID的值
                            BTN_INQ1_Cmd.setQuerySqlid("OVocAheadMade_003");
                            BTN_INQ1_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback, String commandItemName) {
                                    detailSw1.setTitle("发票信息-" + stype1);
                                    detailSw1.show();
                                    frmYWQT1.show();
                                    String vocFlag=detailDs.getCurrentValue("VOC_FLAG");
                                    if (vocFlag != null && !"".equals(vocFlag) && "0".equals(vocFlag) && mod1==1) {
                                        frmFPXX_BUY_ACT_NO.setRequired(true);
                                        frmFPXX_BUY_ADDR.setRequired(true);
                                        frmFPXX_BUY_BANK_NO.setRequired(true);
                                        frmFPXX_BUY_TAX_NO.setRequired(true);
                                        frmFPXX_BUY_TEL.setRequired(true);
                                    } else {
                                        frmFPXX_BUY_ACT_NO.setRequired(false);
                                        frmFPXX_BUY_ADDR.setRequired(false);
                                        frmFPXX_BUY_BANK_NO.setRequired(false);
                                        frmFPXX_BUY_TAX_NO.setRequired(false);
                                        frmFPXX_BUY_TEL.setRequired(false);
                                    }
                                }
                            });

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
            BTN_INQ_Cmd.setQuerySqlid("OVocAheadMade_001");
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

    private DataRecord[] stack2;

    public void cyclePopup2() {
        if ((stack2 != null) && (stack2.length > 0)) {
            // 取选中的第一条记录
            resultDs1.setCurrentRecord(stack2[0]);
            BTN_INQ2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            BTN_INQ2_Cmd.setQuerySqlid("OVocAheadMade_004");
            // BTN_MOD.setDisabled(true);
            BTN_INQ2_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    // BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw3.setTitle("发票信息-" + stype2);
                            detailSw3.show();
                        }
                    }
                }
            });
            // 从堆栈中清除最后一条记录
            if (stack2.length > 1) {
                DataRecord[] tmpstack = new DataRecord[stack2.length - 1];
                for (int i = 0; i < tmpstack.length; i++)
                    tmpstack[i] = stack2[i + 1];
                stack2 = new DataRecord[stack2.length - 1];
                for (int i = 0; i < tmpstack.length; i++)
                    stack2[i] = tmpstack[i];
            } else
                stack2 = new DataRecord[0];
        } else {
            detailSw3.hide();
            // 刷新上一级界面列表
            BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            // 对于通用查询需要设置SQLID的值
            BTN_INQ1_Cmd.setQuerySqlid("OVocAheadMade_003");
            BTN_INQ1_Cmd.execute(new CommandCallback() {
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
        frmCXXX_CUST_NO.setReferenceCmd(refCmd1,false);
        frmCXXX_BUY_TAX_NO.setReferenceCmd(refNmd,false);
        //提前开票客户选择时：只能查出可以预开票并且审核通过的客户
        ParamSet paramset=new ParamSet();
        paramset.add(new Param("IS_AHEAD_FLAG", null));
        paramset.add(new Param("NEXT_ACTION", "02"));
        frmFPXX_CUST_NO.setParamSet(paramset);
        frmFPXX_CUST_NO.setReferenceCmd(refCmd,false);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        // mapqueryDs.put("VOC_DATE_START", "Value1");
        // mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }
        });

        frmMXXX_TX_CODE.bindDropdownDataset(txcodeDs);
        frmMXXX_TX_CODE.setValueField("tx_code");
        frmMXXX_TX_CODE.setDisplayField("tx_name");
        HashMap<String,String> extra = new HashMap<String,String>();
        extra.put("IO_FLAG", "O");
        TXCODE_INQ_Cmd.setExtraInfo(extra);
        TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        TXCODE_INQ_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                frmMXXX_TX_CODE.flushData();
                resultTb1.getUField("TX_CODE").bindDropdownDataset(txcodeDs, "tx_code", "tx_name");
            }
        });
        /** added by wolf.duan for 1754 20160416 begin */
        frmMXXX.setReadOnly("GOOD_NUM", true);
        /** added by wolf.duan for 1754 20160416 end */

    }

    @Override
    protected void bindEvent() {
        detailSw1.addCloseClickHandler(new CloseClickHandler() {
            @Override
            public void onCloseClick(CloseClickEvent event) {
                detailSw1.hide();
            }
        });
        BTN_INQ_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                // 对于通用查询需要设置SQLID的值
                BTN_INQ_Cmd.setQuerySqlid("OVocAheadMade_001");
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
        BTN_ADD_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mod1 = 0;
                BTN_ADD1.show();
                BTN_MOD1.show();
                BTN_DEL1.show();
                BTN_SAVE.show();
                // frmFPXX.setReadOnly(false);
                frmXFXX.setReadOnly(false);
                frmQTFPXX.setReadOnly(false);
                frmXFXX.setReadOnly("SALE_NAME", true);
                frmXFXX.setReadOnly("SALE_TAX_NO", true);
                frmXFXX.setReadOnly("SALE_BANK_NO", true);
                frmXFXX.setReadOnly("SALE_ACT_NO", true);
                frmFPXX.setReadOnly("CUST_NO", false);
                frmFPXX.setReadOnly("BUY_TAX_NO", false);
                frmFPXX.setReadOnly("BUY_NAME", false);
                frmFPXX.setReadOnly("BUY_TEL", false);
                frmFPXX.setReadOnly("BUY_ADDR", false);
                frmFPXX.setReadOnly("BUY_BANK_NO", false);
                frmFPXX.setReadOnly("BUY_ACT_NO", false);
                frmQTFPXX_IS_HAPPEN.setRequired(true);
                frmQTFPXX_VOC_FLAG.setRequired(true);
                frmQTFPXX_MEDIA_TYPE.setRequired(true);
                frmQTFPXX_PAYEE_NAME.setRequired(true);
                frmFPXX_BUY_NAME.setRequired(true);
                frmXFXX_SALE_ADDR.setRequired(true);
                frmXFXX_SALE_TEL.setRequired(true);

                frmQTFPXX.setReadOnly(false);
                resultDs1.removeAllData();
                ParamSet paramset=new ParamSet();
                paramset.add(new Param("IS_AHEAD_FLAG", null));
                paramset.add(new Param("NEXT_ACTION", "02"));
                frmFPXX_CUST_NO.setParamSet(paramset);
                
                if("02".equals(detailDs.getCurrentValue("VOC_CHANNEL"))){
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                
                HashMap<String, String> map = new HashMap<String, String>();
                detailDs.addDataRecord(new DataRecord(map), new DataAction() {
                    @Override
                    public void doAction(DataRecord record) {
                        detailSw1.setTitle("发票信息-新增");
                        detailSw1.show();
                        frmYWQT1.hide();
                        vocEntityCmd.setCommandService("commonQueryService", "commonQueryPage");
                        // 对于通用查询需要设置SQLID的值
                        vocEntityCmd.setQuerySqlid("vocEntityInfoBySub");
                        vocEntityCmd.execute(new CommandCallback() {
                            @Override
                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                DATA_ID_Cmd.setCommandService("vatCommonService", "genDataId");
                                DATA_ID_Cmd.execute(new CommandCallback() {
                                    @Override
                                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                                        BTN_INQ.setDisabled(false);
                                        if (!status) {
                                            UPrompt.alert("提示", "获取DATA_ID失败，错误信息：" + callback.getErrorMessage());
                                        } else {
                                            data_id = (String) callback.getCallbackData();
                                            HashMap<String, String> map = new HashMap<String, String>();
                                            map.put("DATA_ID", data_id);
                                            detailDs.addDataRecord(new DataRecord(map), new DataAction() {
                                                @Override
                                                public void doAction(DataRecord record) {
                                                    detailDs.setCurrentValue("SALE_ACT_NO", vocEntityDs.getCurrentValue("ACT_NO"));
                                                    detailDs.setCurrentValue("SALE_NAME", vocEntityDs.getCurrentValue("ORG_NAME"));
                                                    detailDs.setCurrentValue("SALE_TAX_NO", vocEntityDs.getCurrentValue("TAX_NO"));
                                                    detailDs.setCurrentValue("SALE_ADDR", vocEntityDs.getCurrentValue("ADDR"));
                                                    detailDs.setCurrentValue("SALE_TEL", vocEntityDs.getCurrentValue("TEL"));
                                                    detailDs.setCurrentValue("SALE_BANK_NO", vocEntityDs.getCurrentValue("BANK_NAME"));
                                                    detailDs.setCurrentValue("TX_ORG_ID", ContextHelper.getContext().getValue("ORG_ID"));
                                                    detailDs.setCurrentValue("MEDIA_TYPE", "P");
                                                    detailDs.setCurrentValue("IS_HAPPEN", "Y");

                                                    /** added by wsw 20240409 for 数电 是否数电单轨为“Y”时，发票介质设置为“E”且只读,发票渠道设置为“02”且只读
                                                     * begin */
                                                    frmQTFPXX.setReadOnly("VOC_CHANNEL", false);
                                                    // 发票介质（MEDIA_TYPE）设置为“E”且只读,否则默认为“P”且非只读（E：数电发票  P：纸质发票）
                                                    detailDs.setCurrentValue("MEDIA_TYPE", "E");
                                                    // 发票渠道设置为“02”且只读，否则设置为“01”且非只读
                                                    detailDs.setCurrentValue("VOC_CHANNEL", "02");
                                                    frmQTFPXX_PAYEE_NAME.hide();
                                                    if ("Y".equals(vocEntityDs.getCurrentValue("ONLY_DPPT"))) {
                                                        // 发票介质（MEDIA_TYPE）设置为“E”且只读,否则默认为“P”且非只读（E：数电发票  P：纸质发票）
                                                        detailDs.setCurrentValue("MEDIA_TYPE", "E");
                                                        frmQTFPXX.setReadOnly("MEDIA_TYPE", true);
                                                        // 发票渠道设置为“02”且只读，否则设置为“01”且非只读
                                                        detailDs.setCurrentValue("VOC_CHANNEL", "02");
                                                        frmQTFPXX.setReadOnly("VOC_CHANNEL", true);
                                                        frmQTFPXX_PAYEE_NAME.hide();
                                                    }
                                                    /** added by wsw 20240409 for 数电  是否数电单轨为“Y”时，发票介质设置为“E”且只读,发票渠道设置为“02”且只读
                                                     * end */


                                                    detailDs.sync();
                                                    detailSw1.setTitle("发票信息-新增");
                                                    detailSw1.show();
                                                }
                                            });
                                        }
                                    }
                                });

                            }
                        });
                    }
                });
            }
        };
        BTN_ADD.addClickListener(BTN_ADD_ClickListener);
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

                /** added by wsw 20240409 for 数电 是否数电单轨为‘Y’时 发票渠道和发票介质只读 发票性质只读  begin */
                vocEntityCmd.setCommandService("commonQueryService", "commonQueryPage");
                // 对于通用查询需要设置SQLID的值
                vocEntityCmd.setQuerySqlid("vocEntityInfoBySub");
                vocEntityCmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean b, Callback callback, String s) {
                        if ("Y".equals(vocEntityDs.getCurrentValue("ONLY_DPPT"))) {
                            // 发票介质（MEDIA_TYPE）设置为只读,否则默认非只读（E：数电发票  P：纸质发票）
                            frmQTFPXX.setReadOnly("MEDIA_TYPE", true);
                            // 发票渠道设置只读，否则设置非只读
                            frmQTFPXX.setReadOnly("VOC_CHANNEL", true);
                        }
                    }
                });
                /** added by wsw 20240409 for 数电 是否数电单轨为‘Y’时 发票渠道和发票介质只读 发票性质只读  end */

                stack1 = resultDs.getSelectedRecords();
                // frmFPXX.setReadOnly(false);
                frmFPXX.setReadOnly("CUST_NO", true);
                frmFPXX.setReadOnly("BUY_TAX_NO", true);
                frmFPXX.setReadOnly("BUY_NAME", false);
                frmFPXX.setReadOnly("BUY_TEL", false);
                frmFPXX.setReadOnly("BUY_ADDR", false);
                frmFPXX.setReadOnly("BUY_BANK_NO", false);
                frmFPXX.setReadOnly("BUY_ACT_NO", false);

                frmXFXX.setReadOnly(false);
                frmXFXX.setReadOnly("SALE_NAME", true);
                frmXFXX.setReadOnly("SALE_TAX_NO", true);
                frmXFXX.setReadOnly("SALE_BANK_NO", true);
                frmXFXX.setReadOnly("SALE_ACT_NO", true);

                frmQTFPXX_IS_HAPPEN.setRequired(true);
                frmQTFPXX_VOC_FLAG.setRequired(true);
                frmQTFPXX_MEDIA_TYPE.setRequired(true);
                frmQTFPXX_PAYEE_NAME.setRequired(true);
                frmFPXX_BUY_NAME.setRequired(true);
                frmXFXX_SALE_ADDR.setRequired(true);
                frmXFXX_SALE_TEL.setRequired(true);

                frmQTFPXX.setReadOnly(false);
                
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))){
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                BTN_ADD1.show();
                BTN_SAVE.show();
                BTN_MOD1.show();
                BTN_DEL1.show();
                cyclePopup1();
            }
        };
        BTN_MOD.addClickListener(BTN_MOD_ClickListener);
        BTN_DEL_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                mod1 = 2;
                stype1 = "删除";
                if (resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                frmFPXX.setReadOnly(true);
                // frmXFXX.setReadOnly(true);
                frmFPXX.setReadOnly("CUST_NO", true);
                frmFPXX.setReadOnly("BUY_TAX_NO", true);
                frmFPXX.setReadOnly("BUY_NAME", true);
                frmFPXX.setReadOnly("BUY_TEL", true);
                frmFPXX.setReadOnly("BUY_ADDR", true);
                frmFPXX.setReadOnly("BUY_BANK_NO", true);
                frmFPXX.setReadOnly("BUY_ACT_NO", true);
                frmQTFPXX.setReadOnly(true);
                frmXFXX.setReadOnly(true);

                frmQTFPXX_IS_HAPPEN.setRequired(false);
                frmQTFPXX_VOC_FLAG.setRequired(false);
                frmQTFPXX_MEDIA_TYPE.setRequired(false);
                frmQTFPXX_PAYEE_NAME.setRequired(false);
                frmFPXX_BUY_NAME.setRequired(false);
                frmXFXX_SALE_ADDR.setRequired(false);
                frmXFXX_SALE_TEL.setRequired(false);

                BTN_ADD1.hide();
                BTN_SAVE.show();
                BTN_MOD1.hide();
                BTN_DEL1.hide();
                cyclePopup1();
            }
        };
        BTN_DEL.addClickListener(BTN_DEL_ClickListener);
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
                BTN_DTL.setDisabled(false);
                // frmFPXX.setReadOnly(true);
                frmFPXX.setReadOnly("CUST_NO", true);
                frmFPXX.setReadOnly("BUY_TAX_NO", true);
                frmFPXX.setReadOnly("BUY_NAME", true);
                frmFPXX.setReadOnly("BUY_TEL", true);
                frmFPXX.setReadOnly("BUY_ADDR", true);
                frmFPXX.setReadOnly("BUY_BANK_NO", true);
                frmFPXX.setReadOnly("BUY_ACT_NO", true);
                frmXFXX.setReadOnly(true);
                frmQTFPXX.setReadOnly(true);
                /** added by wolf.duan for 1754 20160416 begin */
                frmMXXX.setReadOnly("GOOD_NUM", true);
                /** added by wolf.duan for 1754 20160416 end */


                frmQTFPXX_IS_HAPPEN.setRequired(false);
                frmQTFPXX_VOC_FLAG.setRequired(false);
                frmQTFPXX_MEDIA_TYPE.setRequired(false);
                frmQTFPXX_PAYEE_NAME.setRequired(false);
                frmFPXX_BUY_NAME.setRequired(false);
                frmXFXX_SALE_ADDR.setRequired(false);
                frmXFXX_SALE_TEL.setRequired(false);

                BTN_ADD1.hide();
                BTN_MOD1.hide();
                BTN_DEL1.hide();
                BTN_SAVE.hide();
                cyclePopup1();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
        BTN_SAVE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                String vocFlag1 = detailDs.getCurrentValue("VOC_FLAG");
                //String custNo = detailDs.getCurrentValue("CUST_NO");
                String buyTaxNo = detailDs.getCurrentValue("BUY_TAX_NO");
                if("0".equals(vocFlag1) && buyTaxNo==null){
                    UPrompt.alert("提示", "发票类型是专用发票，纳税人识别号不能为空；或者该客户可以开普通发票！");
                    return;
                }
                if (!frmFPXX.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                if (frmXFXX_SALE_NAME.getValueAsString()==null||"".equals(frmXFXX_SALE_NAME.getValueAsString())||
                        frmXFXX_SALE_TAX_NO.getValueAsString()==null||"".equals(frmXFXX_SALE_TAX_NO.getValueAsString())||
                        frmXFXX_SALE_ADDR.getValueAsString()==null||"".equals(frmXFXX_SALE_ADDR.getValueAsString())||
                        frmXFXX_SALE_TEL.getValueAsString()==null||"".equals(frmXFXX_SALE_TEL.getValueAsString())||
                        frmXFXX_SALE_BANK_NO.getValueAsString()==null||"".equals(frmXFXX_SALE_BANK_NO.getValueAsString())||
                        frmXFXX_SALE_ACT_NO.getValueAsString()==null||"".equals(frmXFXX_SALE_ACT_NO.getValueAsString())) {
                    UPrompt.alert("提示", "销方信息不完整！");
                    return;
                }
                if (!frmQTFPXX.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                if (resultDs1.getRecordCount() <= 0) {
                    UPrompt.alert("提示", "明细数据为空，不能进行此操作!");
                    return;
                }

                if(resultDs1.getRecordCount() > 8){
                    UPrompt.alert("提示", "发票明细不得超过8条！");
                    return;
                }
                DataRecord[] dataRecords = resultDs1.getDataRecords();
                for (int i = 0; i < dataRecords.length; i++) {
                    for (int j = i + 1; j < dataRecords.length; j++) {

                        if(dataRecords[i].getValue("TX_ID") == null || "".equals(dataRecords[i].getValue("TX_ID"))){
                            continue;
                        }
                        if (dataRecords[i].getValue("TX_ID").equals(dataRecords[j].getValue("TX_ID"))) {
                            UPrompt.alert("提示", "明细数据存在重复的交易ID，不能进行此操作！");
                            return;
                        }
                    }
                }

                //String vocFlag2 = detailDs.getCurrentValue("VOC_FLAG");
                String taxRate = resultDs1.getCurrentValue("TAX_RATE");
                if("0".equals(taxRate) && "0".equals(vocFlag1) ){
                    UPrompt.alert("提示", "零税率不能开专票，请重新修改明细信息！");
                    return;
                }
                logtype1 = "new";
//				detailDs.setCurrentValue("VOC_USER", ContextHelper.getContext().getValue("USERNAME"));//
                detailDs.setCurrentValue("MADE_TYPE", "2");
                detailDs.setCurrentValue("VOC_STAT", "0");
                detailDs.setCurrentValue("VOC_TYPE", "1");
                detailDs.setCurrentValue("REVISE_STATUS", "0");

                if (mod1 == 0) {
                    BTN_SAVE_Cmd.setDBService("commonInsertService", "execute");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_ADD");
                    logtype1 = "new";
                    stype1 = "新增";
                }
                if (mod1 == 1) {
                    BTN_SAVE_Cmd.setDBService("commonUpdateService", "execute");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_MOD");
                    logtype1 = "mod";
                    stype1 = "修改";
                }
                if (mod1 == 2) {
                    BTN_SAVE_Cmd.setDBService("commonDeleteService", "execute");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_DEL");
                    logtype1 = "del";
                    stype1 = "删除";
                    BTN_SAVE.setDisabled(true);
                    BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
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
                                        // 记录系统日志(系统操作，如用户管理时)
                                        // detailDs.logSys(logtype1);
                                        cyclePopup1();
                                    }
                                });
                            }
                        }
                    });
                }
                if (mod1 == 9) {
                    BTN_SAVE_Cmd.setDBService("commonUpdateService", "execute");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_MOD_DTL");
                    logtype1 = "mod";
                    stype1 = "修改";
                }

                String vocFlag = detailDs.getCurrentValue("VOC_FLAG");
                if (vocFlag != null && !"".equals(vocFlag) && "0".equals(vocFlag)) {
                    frmFPXX_BUY_ACT_NO.setRequired(true);
                    frmFPXX_BUY_ADDR.setRequired(true);
                    frmFPXX_BUY_BANK_NO.setRequired(true);
                    frmFPXX_BUY_TAX_NO.setRequired(true);
                    frmFPXX_BUY_TEL.setRequired(true);
                    //frmFPXX_CUST_NO.setRequired(false);
                } else {
                    frmFPXX_BUY_ACT_NO.setRequired(false);
                    frmFPXX_BUY_ADDR.setRequired(false);
                    frmFPXX_BUY_BANK_NO.setRequired(false);
                    frmFPXX_BUY_TAX_NO.setRequired(false);
                    frmFPXX_BUY_TEL.setRequired(false);
                    //frmFPXX_CUST_NO.setRequired(false);
                }
//				String custNo = detailDs.getCurrentValue("CUST_NO");
//				String buyTaxNo = detailDs.getCurrentValue("BUY_TAX_NO");
//				if("0".equals(vocFlag) && "".equals(buyTaxNo) && buyTaxNo==null){
//					UPrompt.alert("提示", "发票类型是专用发票，纳税人识别号不能为空；或者该交易可以开普通发票！");
//					return;
//				}
                if (mod1 == 1 || mod1 == 0) {

                    String isAhead = detailDs.getCurrentValue("IS_AHEAD_FLAG");
                    String isHappen = detailDs.getCurrentValue("IS_HAPPEN");

                    if("N".equals(isHappen)){
                        if("0".equals(isAhead)){
                            UPrompt.alert("提示", "所选客户不允许预开票");
                            return;
                        }
                    }
                    String custNo = detailDs.getCurrentValue("CUST_NO");
                    Map<String, String> extraInfo = new HashMap<String, String>();
                    extraInfo.put("CUST_NO", custNo);
                    BTN_CHECK_Cmd.setExtraInfo(extraInfo);
                    BTN_CHECK_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                    BTN_CHECK_Cmd.setQuerySqlid("CustomerAmt_001");
                    BTN_CHECK_Cmd.execute(new CommandCallback() {
                        @Override
                        public void onCallback(boolean status, Callback callback,String commandItemName) {
                            if (!status) {
                                UPrompt.alert("提示","查询失败，错误信息：" + callback.getErrorMessage());
                            } else {
                                if (callback.getCallbackCount() > 0) {
                                    String aheadAmt = customerDs.getCurrentValue("AHEAD_AMT");
                                    if(!"".equals(aheadAmt) && aheadAmt != null){
                                        String custNo = detailDs.getCurrentValue("CUST_NO");
                                        Map<String, String> extraInfo = new HashMap<String, String>();
                                        extraInfo.put("CUST_NO", custNo);
                                        BTN_SUM_Cmd.setExtraInfo(extraInfo);
                                        BTN_SUM_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                        BTN_SUM_Cmd.setQuerySqlid("OvocAmount_001");
                                        BTN_SUM_Cmd.execute(new CommandCallback() {
                                            @Override
                                            public void onCallback(boolean status,Callback callback,String commandItemName) {
                                                if (!status) {
                                                    UPrompt.alert("提示","查询失败，错误信息："+ callback.getErrorMessage());
                                                } else {
                                                    if (callback.getCallbackCount() > 0) {
                                                        String sumAmount = ovocDs.getCurrentValue("SUM_AMOUNT");
                                                        String aheadAmt = customerDs.getCurrentValue("AHEAD_AMT");
                                                        String amount = detailDs.getCurrentValue("AMOUNT");
                                                        if (!"".equals(aheadAmt) && aheadAmt !=null) {
                                                            if ("".equals(sumAmount) || sumAmount == null  ) {
                                                                sumAmount = "0";
                                                            }
                                                            if ("".equals(amount) || amount == null  ) {
                                                                amount ="0";
                                                            }
                                                            BigDecimal sumAmount1 = new BigDecimal(sumAmount.replace(",", ""));
                                                            BigDecimal aheadAmt1 = new BigDecimal(aheadAmt.replace(",", ""));
                                                            BigDecimal amount2 = new BigDecimal(amount.replace(",",""));
                                                            BigDecimal sumAmount2 = sumAmount1.add(amount2);
                                                            if (sumAmount2.compareTo(aheadAmt1) == 1) {
                                                                UPrompt.alert("提示","此客户发票明细合计金额大于预开票额度！");
                                                                return;
                                                            }else{
                                                                aheadSum();
                                                            }
                                                        }else if((!"".equals(aheadAmt) && !"".equals(amount))&& "".equals(sumAmount)){
                                                            BigDecimal aheadAmt1 = new BigDecimal(aheadAmt.replace(",", ""));
                                                            BigDecimal amount2 = new BigDecimal(amount.replace(",",""));
                                                            if (amount2.compareTo(aheadAmt1) == 1) {
                                                                UPrompt.alert("提示","此客户发票明细合计金额大于预开票额度！");
                                                                return;
                                                            }else{
                                                                aheadSum();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                    }else{
                                        aheadSum();
                                    }
                                }

                            }
                        }
                    });
                }

            }
        };
        BTN_SAVE.addClickListener(BTN_SAVE_ClickListener);
        BTN_CLOSE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                detailSw1.hide();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);
        BTN_ADD1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mod2 = 0;
                String isHappen = detailDs.getCurrentValue("IS_HAPPEN");
                if (isHappen == null || "".equals(isHappen)) {
                    UPrompt.alert("提示", "请先指定交易是否发生");
                    return;
                }
                isHappenCtl();
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("GOOD_NUM", "1");
                detailDs2.addDataRecord(new DataRecord(map), new DataAction() {
                    @Override
                    public void doAction(DataRecord record) {
                        detailSw3.setTitle("发票信息-新增");
                        String discount_flag=detailDs2.getCurrentValue("DISCOUNT_FLAG");
                        if("1".equals(discount_flag)){
                            frmMXXX_DISCOUNT_DESC.setRequired(true);
                            detailDs2.sync();
                        } else{
                            frmMXXX_DISCOUNT_DESC.setRequired(false);
                            detailDs2.sync();
                        }
                        frmMXXX.setReadOnly("TAX_RATE",false);
                        frmMXXX.setReadOnly("DISCOUNT_FLAG",false);
                        detailSw3.show();
                    }
                });
            }
        };
        BTN_ADD1.addClickListener(BTN_ADD1_ClickListener);
        BTN_MOD1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs1.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                mod2 = 1;
                stype2 = "修改";
                if (resultDs1.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                String isHappen = detailDs.getCurrentValue("IS_HAPPEN");
                if (isHappen == null || "".equals(isHappen)) {
                    UPrompt.alert("提示", "请先指定交易是否发生");
                    return;
                }
                // detailDs2.setCurrentRecord(resultDs1.getCurrentRecord());
                isHappenCtl();
                resultDs1.setCurrentValue("HAS_TAX", "N");
                resultDs1.sync();
                detailSw3.setTitle("发票信息-修改");
                detailDs2.copyCurrentRecord(resultDs1);
                detailSw3.show();
                detailDs2.setCurrentValue("HAS_TAX", "N");
                detailDs2.sync();
                System.out.println("*****************"+detailDs2.getCurrentValue("HAS_TAX"));
                String discount_flag=detailDs2.getCurrentValue("DISCOUNT_FLAG");
                if("1".equals(discount_flag)){
                    frmMXXX_DISCOUNT_DESC.setRequired(true);
                    detailDs2.sync();
                } else{
                    frmMXXX_DISCOUNT_DESC.setRequired(false);
                    detailDs2.sync();
                }

            }
        };
        BTN_MOD1.addClickListener(BTN_MOD1_ClickListener);
        BTN_DEL1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mod2 = 2;
                stype2 = "删除";
                if (resultDs1.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                resultDs1.removeCurrentRecord();
                resultDs1.sync();
            }
        };
        BTN_DEL1.addClickListener(BTN_DEL1_ClickListener);
        BTN_SAVE1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (!frmMXXX.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                double dTexRate= Double.valueOf(detailDs2.getCurrentValue("TAX_RATE"));
                String caclTAXTYPE=detailDs2.getCurrentValue("CACL_TAX_TYPE");
                if(dTexRate == 0){
                    if(caclTAXTYPE.equals("2")){
                        detailDs2.setCurrentValue("TAX_RATE_FLAG", "0");
                    }else if(caclTAXTYPE.equals("3")){
                        detailDs2.setCurrentValue("TAX_RATE_FLAG", "1");
                    }else if(caclTAXTYPE.equals("4")){
                        detailDs2.setCurrentValue("TAX_RATE_FLAG", "2");
                    }else{
                        detailDs2.setCurrentValue("TAX_RATE_FLAG", "3");
                    }
                }else{
                    detailDs2.setCurrentValue("TAX_RATE_FLAG", "");
                }
                System.out.println(detailDs2.getCurrentValue("TAX_RATE_FLAG"));
                String isHappen = detailDs.getCurrentValue("IS_HAPPEN");
                String reviseStatus = detailDs.getCurrentValue("REVISE_STATUS");

                boolean isShow = false;
                if("N".equals(isHappen) && "1".equals(reviseStatus)){
                    isShow = true;
                }

                if("Y".equals(isHappen)){
                    isShow = true;
                }
                DataRecord[] dataRecords = resultDs1.getDataRecords();
                if(dataRecords.length >= 8){
                    UPrompt.alert("提示", "发票明细不得超过8条！");
                    return;
                }
                if (mod2 == 1) {
                    resultDs1.removeCurrentRecord();
                }
                String vocFlag = detailDs.getCurrentValue("VOC_FLAG");
                String taxRate = detailDs2.getCurrentValue("TAX_RATE");
                if("0".equals(taxRate) && "0".equals(vocFlag) ){
                    UPrompt.alert("提示", "零税率不能开专票，请重新填写明细信息！");
                    return;
                }
                String hasTax = detailDs2.getCurrentValue("HAS_TAX");
//				double insAmt = Double.valueOf(detailDs2.getCurrentValue("INS_AMT").replaceAll(",", ""));
//				double taxRate = Double.valueOf(detailDs2.getCurrentValue("TAX_RATE").replaceAll(",", ""));
//				double taxAmt = Double.valueOf(detailDs2.getCurrentValue("TAX_AMT").replaceAll(",", ""));

                BigDecimal insAmt = new BigDecimal(detailDs2.getCurrentValue("INS_AMT").replaceAll(",", ""));
                BigDecimal taxAmt = new BigDecimal(detailDs2.getCurrentValue("TAX_AMT").replaceAll(",", ""));

                if ("N".equals(hasTax)) {
                    detailDs2.setCurrentValue("AMOUNT", String.valueOf(insAmt.add(taxAmt)));
                } else if ("Y".equals(hasTax)) {
                    detailDs2.setCurrentValue("AMOUNT", String.valueOf(insAmt));
//					detailDs2.setCurrentValue("INS_AMT", String.valueOf(round2(insAmt / (1 + taxRate))));
//					double dAmount = Double.valueOf(detailDs2.getCurrentValue("AMOUNT").replaceAll(",", ""));
//					double dTaxRate = Double.valueOf(detailDs2.getCurrentValue("TAX_RATE").replaceAll(",", ""));
                    BigDecimal bAmount = new BigDecimal(detailDs2.getCurrentValue("AMOUNT").replaceAll(",", ""));
                    BigDecimal bTaxRate = new BigDecimal(detailDs2.getCurrentValue("TAX_RATE").replaceAll(",", ""));
                    BigDecimal bInsAmt = bAmount.divide((BigDecimal.valueOf(1).add(bTaxRate)),2,BigDecimal.ROUND_HALF_UP);
                    detailDs2.setCurrentValue("INS_AMT", String.valueOf(bInsAmt));
                }
                detailDs2.setCurrentValue("HAS_TAX", "N");

                resultDs1.addDataRecord(detailDs2.getCurrentRecord(), new DataAction() {

                    @Override
                    public void doAction(DataRecord record) {

                        calcVocAmt();
                    }
                });
                detailSw3.hide();
            }
        };
        BTN_SAVE1.addClickListener(BTN_SAVE1_ClickListener);
        BTN_CLOSE1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                //cyclePopup2();
                detailSw3.hide();
            }
        };
        BTN_CLOSE1.addClickListener(BTN_CLOSE1_ClickListener);

        VOC_FLAG_ValueChangedListener = new ValueChangedListener("VOC_FLAG") {

            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                // TODO Auto-generated method stub
                if ("0".equals(event.getNewValue())) {
                    frmFPXX_BUY_ACT_NO.setRequired(true);
                    frmFPXX_BUY_ADDR.setRequired(true);
                    frmFPXX_BUY_BANK_NO.setRequired(true);
                    frmFPXX_BUY_TAX_NO.setRequired(true);
                    frmFPXX_BUY_TEL.setRequired(true);
                    //frmFPXX_CUST_NO.setRequired(true);
                } else {
                    frmFPXX_BUY_ACT_NO.setRequired(false);
                    frmFPXX_BUY_ADDR.setRequired(false);
                    frmFPXX_BUY_BANK_NO.setRequired(false);
                    frmFPXX_BUY_TAX_NO.setRequired(false);
                    frmFPXX_BUY_TEL.setRequired(false);
                    //frmFPXX_CUST_NO.setRequired(false);
                }
            }
        };
        frmQTFPXX_VOC_FLAG.addValueChangedListener(VOC_FLAG_ValueChangedListener);
        
        /** added by yanshuai Lu 20230802 for 数电 监听发票渠道  begin */
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
        frmQTFPXX_VOC_CHANNEL.addValueChangedListener(VOC_CHANNEL_ValueChangedListener);
        /** added by yanshuai Lu 20230802 for 数电 监听发票渠道  end */

        TX_CODE_ValueChangedListener = new ValueChangedListener("TX_CODE") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {

                String txcode = event.getNewValue().toString();
                if(txcode==null||"null".equals(txcode)||"".equals(txcode)){
                    detailDs2.setCurrentValue("GOOD_CODE", "");
                    detailDs2.setCurrentValue("DTL_NAME", "");
                    detailDs2.setCurrentValue("CNT_UNIT", "");
                    detailDs2.setCurrentValue("GOOD_TYPE", "");
                    detailDs2.setCurrentValue("GOOD_AMT", "");
                    detailDs2.setCurrentValue("TAX_RATE", "");
                    detailDs2.sync();
                    return;
                }
                detailDs2.setCurrentValue("TX_CODE", txcode);
                TxNodeCmd.setCommandService("commonQueryService", "commonQueryPage");
                // 对于通用查询需要设置SQLID的值
                TxNodeCmd.setQuerySqlid("seqByTxNode");
                TxNodeCmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        if (!status) {
                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            detailDs2.setCurrentValue("GOOD_CODE", txcodeDs1.getCurrentValue("GOOD_CODE"));
                            detailDs2.setCurrentValue("DTL_NAME", txcodeDs1.getCurrentValue("GOOD_NAME"));
                            detailDs2.setCurrentValue("CNT_UNIT", txcodeDs1.getCurrentValue("CNT_UNIT"));
                            detailDs2.setCurrentValue("GOOD_TYPE", txcodeDs1.getCurrentValue("GOOD_TYPE"));
                            detailDs2.setCurrentValue("GOOD_AMT", txcodeDs1.getCurrentValue("GOOD_AMT"));
                            detailDs2.setCurrentValue("TAX_RATE", txcodeDs1.getCurrentValue("TAX_RATE"));
                            detailDs2.sync();
                        }
                    }
                });
            }
        };
        frmMXXX_TX_CODE.addValueChangedListener(TX_CODE_ValueChangedListener);

        INS_AMT_ValueChangedListener = new ValueChangedListener("INS_AMT") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                calcTaxAmt();
            }
        };
        frmMXXX_INS_AMT.addValueChangedListener(INS_AMT_ValueChangedListener);

        TAX_RATE_ValueChangedListener = new ValueChangedListener("TAX_RATE") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                calcTaxAmt();
            }
        };
        frmMXXX_TAX_RATE.addValueChangedListener(TAX_RATE_ValueChangedListener);

        HAS_TAX_ValueChangedListener = new ValueChangedListener("HAS_TAX") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                calcTaxAmt();
            }
        };
        frmMXXX_HAS_TAX.addValueChangedListener(TAX_RATE_ValueChangedListener);
        //数量的ValueChangedListener Even.lu
        GOOD_NUM_ValueChangedListener = new ValueChangedListener("GOOD_NUM") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                calcTaxAmt();
            }
        };
        frmMXXX_GOOD_NUM.addValueChangedListener(GOOD_NUM_ValueChangedListener);
        DISCOUNT_FLAG_ValueChangedListener= new ValueChangedListener("DISCOUNT_FLAG") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                String discount_flag=event.getNewValue().toString();
                if("0".equals(discount_flag)){
                    frmMXXX_DISCOUNT_DESC.setRequired(false);
                } else{
                    frmMXXX_DISCOUNT_DESC.setRequired(true);
                }
            }
        };
        frmMXXX_DISCOUNT_FLAG.addValueChangedListener(DISCOUNT_FLAG_ValueChangedListener);
        //计税方式的ValueChangedListener
        CACL_TAX_TYPE_ValueChangedListener = new ValueChangedListener("CACL_TAX_TYPE") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                if( "3".equals(detailDs2.getCurrentValue("CACL_TAX_TYPE")) ){
                    detailDs2.setCurrentValue("TAX_RATE", "0");
                    detailDs2.setCurrentValue("DISCOUNT_FLAG", "1");
                    frmMXXX.setReadOnly("TAX_RATE", true);
                    frmMXXX.setReadOnly("DISCOUNT_FLAG", true);
                    frmMXXX_DISCOUNT_DESC.setRequired(true);
                    detailDs2.sync();
                }else{
                    frmMXXX.setReadOnly("TAX_RATE", false);
                    frmMXXX.setReadOnly("DISCOUNT_FLAG", false);
                }
            }
        };
        frmMXXX_CACL_TAX_TYPE.addValueChangedListener(CACL_TAX_TYPE_ValueChangedListener);
        IS_HAPPEN_ValueChangeListener = new ValueChangedListener("IS_HAPPEN") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                ParamSet paramset=new ParamSet();
                String isHappen=detailDs.getCurrentValue("IS_HAPPEN");
                if("Y".equals(isHappen)){
                    paramset.add(new Param("IS_AHEAD_FLAG", null));
                }else if("N".equals(isHappen)){
                    paramset.add(new Param("IS_AHEAD_FLAG", "1"));
                }
                paramset.add(new Param("NEXT_ACTION", "02"));
                frmFPXX_CUST_NO.setParamSet(paramset);

            }
        };
        frmQTFPXX_IS_HAPPEN.addValueChangedListener(IS_HAPPEN_ValueChangeListener);

    }

    public void calcTaxAmt() {
        String sInsAmt = detailDs2.getCurrentValue("INS_AMT");//收入
        String sTaxRate = detailDs2.getCurrentValue("TAX_RATE");//税率
        String sGoodAmt = detailDs2.getCurrentValue("GOOD_AMT");//单价
        String sGoodNum = detailDs2.getCurrentValue("GOOD_NUM");//数量
        String sHasTax = detailDs2.getCurrentValue("HAS_TAX");//收入是否含税
        System.out.println("=========calcTaxAmt========");
        System.out.println(sInsAmt);//含税的算法    收入/（1+0.06） /数量=单价
        System.out.println(sTaxRate);
        System.out.println(sGoodAmt);
        System.out.println(sHasTax);
        System.out.println("++++++++++ "+sGoodNum);
        if (sGoodNum != null && !"".equals(sGoodNum) &&sInsAmt != null && !"".equals(sInsAmt) && sTaxRate != null && !"".equals(sTaxRate) && sHasTax != null && !"".equals(sHasTax) ) {
//			double dInsAmt = Double.valueOf(sInsAmt.replaceAll(",", ""));//收入
//			double dTaxRate = Double.valueOf(sTaxRate.replaceAll(",", ""));//税率
//			double dGoodAmt = Double.valueOf(sGoodAmt.replaceAll(",", ""));//单价
//			double dGoodsNum = Double.valueOf(sGoodNum.replaceAll(",", ""));//数量

            BigDecimal bInsAmt = new BigDecimal(sInsAmt.replaceAll(",", ""));//收入
            BigDecimal bTaxRate = new BigDecimal(sTaxRate.replaceAll(",", ""));//税率
            BigDecimal bGoodAmt = new BigDecimal(0);//单价
            BigDecimal bGoodsNum = new BigDecimal(sGoodNum.replaceAll(",", ""));//数量
//			Integer sGoodNum1=Integer.parseInt(sGoodNum);
            if("Y".equals(sHasTax)){//收入是否含税  Y是
                bInsAmt = bInsAmt.divide((BigDecimal.valueOf(1).add(bTaxRate)),9,BigDecimal.ROUND_HALF_UP);
                bGoodAmt = bInsAmt.divide(bGoodsNum,2,BigDecimal.ROUND_HALF_UP);
//				dInsAmt = round2(dInsAmt / (1 + dTaxRate));
//				dGoodAmt = round2(dInsAmt / sGoodNum1);//收入/（1+0.06） /数量=单价
            }else if("N".equals(sHasTax)){
                bGoodAmt = bInsAmt.divide(bGoodsNum,2,BigDecimal.ROUND_HALF_UP);
//				dGoodAmt = dInsAmt / sGoodNum1;//  收入/数量 = 单价
            }
            detailDs2.setCurrentValue("TAX_AMT", String.valueOf(String.valueOf(bInsAmt.multiply(bTaxRate).setScale(2, BigDecimal.ROUND_HALF_UP))));//税金
//			detailDs2.setCurrentValue("TAX_AMT", String.valueOf(dInsAmt * dTaxRate));//税金
            detailDs2.setCurrentValue("GOOD_AMT", String.valueOf(bGoodAmt));//单价
            detailDs2.sync();
        }
    }

    public void calcVocAmt() {

        DataRecord[] dtlRecords = resultDs1.getDataRecords();
//		double vocInsAmt = 0;
//		double vocTaxAmt = 0;
        BigDecimal vocInsAmt = new BigDecimal(0);
        BigDecimal vocTaxAmt = new BigDecimal(0);
        for (DataRecord dtl : dtlRecords) {
//			double insAmt = Double.valueOf(dtl.getValue("INS_AMT").replaceAll(",", ""));
//			double taxAmt = Double.valueOf(dtl.getValue("TAX_AMT").replaceAll(",", ""));
            BigDecimal insAmt = new BigDecimal(dtl.getValue("INS_AMT").replaceAll(",", ""));
            BigDecimal taxAmt = new BigDecimal(dtl.getValue("TAX_AMT").replaceAll(",", ""));
            vocInsAmt = vocInsAmt.add(insAmt);
            vocTaxAmt = vocTaxAmt.add(taxAmt);
        }
        detailDs.setCurrentValue("AMOUNT", String.valueOf(vocInsAmt));
        detailDs.setCurrentValue("TAX_AMT", String.valueOf(vocTaxAmt));
        detailDs.setCurrentValue("SUM_AMT", String.valueOf(vocInsAmt.add(vocTaxAmt)));
        detailDs.sync();

    }

    public void isHappenCtl() {
        String isHappen = detailDs.getCurrentValue("IS_HAPPEN");
        String reviseStatus = detailDs.getCurrentValue("REVISE_STATUS");

        boolean isShow = false;
        if("N".equals(isHappen) && "1".equals(reviseStatus)){
            isShow = true;
        }

        if("Y".equals(isHappen)){
            isShow = true;
        }

        if (isShow) {
            frmMXXX_TX_ID.show();
            frmMXXX_TX_DATE.show();
            frmMXXX_SEQ_NO.show();
            frmMXXX_TX_ID.setRequired(true);
            frmMXXX_TX_DATE.setRequired(true);
            frmMXXX_SEQ_NO.setRequired(true);
        } else {
            frmMXXX_TX_ID.hide();
            frmMXXX_TX_DATE.hide();
            frmMXXX_SEQ_NO.hide();
            frmMXXX_TX_ID.setRequired(false);
            frmMXXX_TX_DATE.setRequired(false);
            frmMXXX_SEQ_NO.setRequired(false);
        }
    }

    public Double round2(Double d){// d = 9.4
        double d1 = d*100;//940=d1
        int d2  = (int)d1;//940=d2
        double d3 = d1 - d2; //d3=0
        if(d3 >= 0.5){
            d1 = d1 + 1;
        }
        return (d1 - d3)/100 ;
    }

    public void aheadSum(){
        BTN_SAVE2_Cmd.setCommandService("vatCommonService", "OVocManMadeAddCust");
        BTN_SAVE2_Cmd.setHead("ADDINFO", "PmVatCustomer");
        BTN_SAVE2_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                if (!status || callback.getErrorMessage() != null) {
                    if (callback.getErrorMessage() != null)
                        UPrompt.alert("提示", stype3 + "失败:" + callback.getErrorMessage());
                    else
                        UPrompt.alert("提示", stype3 + "失败！");
                } else {
                    data_id1 = (String) callback.getCallbackData();
                    if (data_id1 != null) {
                        detailDs.setCurrentValue("CUST_ID", data_id1);
                    }

                    BTN_SAVE.setDisabled(true);
                    BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
                    BTN_SAVE_Cmd.execute(new CommandCallback() {
                        @SuppressWarnings("unchecked")
                        @Override
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            BTN_SAVE.setDisabled(false);
                            if (!status || callback.getErrorMessage() != null) {
                                if (callback.getErrorMessage() != null)
                                    UPrompt.alert("提示", stype1 + "失败:" + callback.getErrorMessage());
                                else
                                    UPrompt.alert("提示", stype1 + "失败！");
                            } else {
                                System.out.println("$$$$$$$$$" + mod1);
                                if (mod1 == 0) {
                                    HashMap<String, String> map = new HashMap<String, String>();
                                    map = (HashMap<String, String>) callback.getCallbackData();
                                    data_id2 = map.get("DATA_ID");
                                } else {
                                    data_id2 = detailDs.getCurrentValue("DATA_ID");
                                }
                                Map<String, String> extraInfo = new HashMap<String, String>();
                                extraInfo.put("PDATA_ID", data_id2);
                                extraInfo.put("CUST_ID", detailDs.getCurrentValue("CUST_ID"));
                                extraInfo.put("CUST_NO", detailDs.getCurrentValue("CUST_NO"));
                                extraInfo.put("MADE_TYPE", "2");
                                extraInfo.put("VOC_DATA_ID", detailDs.getCurrentValue("DATA_ID"));
                                BTN_SAVE_DTL_Cmd.setCommandDataScope(DataScope.ALL);
                                BTN_SAVE_DTL_Cmd.setExtraInfo(extraInfo);
                                BTN_SAVE_DTL_Cmd.setCommandService("vatCommonService", "oVocAheadMadeInsertVocDtl");
                                BTN_SAVE_DTL_Cmd.setHead("CTLNAME", "BTN_ADD1");
                                BTN_SAVE_DTL_Cmd.setHead("ADDINFO", "PmVatOVocDtl");
                                BTN_SAVE_DTL_Cmd.execute(new CommandCallback() {
                                    @Override
                                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                                        CalcTaxCmd.setCommandService("vatCommonService", "calcTaxByDataId");
                                        CalcTaxCmd.execute(new CommandCallback() {
                                            @Override
                                            public void onCallback(boolean status, Callback callback, String commandItemName) {
                                                UPrompt.alert("提示", "操作成功", new PromptCallback() {
                                                    @Override
                                                    public void execute(Boolean value) {
                                                        // 记录业务日志
                                                        detailDs.logBiz(logtype1);
                                                        // 记录系统日志(系统操作，如用户管理时)
                                                        // detailDs.logSys(logtype1);
                                                        cyclePopup1();
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
            }
        });

    }

}

// resultDs.setValue("DATA_ID", "value1");
// detailDs.setValue("VOC_USER", "value1");
// detailDs.setValue("MADE_TYPE", "value1");
// detailDs2.setValue("PDATA_ID", "value1");
// vocEntityDs.setValue("ACT_NO", "value1");
// vocEntityDs.setValue("ORG_NAME", "value1");
// vocEntityDs.setValue("TAX_NO", "value1");
// vocEntityDs.setValue("ADDR", "value1");
// vocEntityDs.setValue("TEL", "value1");
// vocEntityDs.setValue("BANK_NO", "value1");
