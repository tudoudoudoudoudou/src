package com.gingkoo.vat.client;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.gingkoo.gui.core.client.context.ContextHelper;
import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.event.ValueChangeEvent;
import com.gingkoo.gui.data.client.dataset.event.ValueChangedListener;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.form.fields.UPickerIcon;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickListener;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.form.fields.PickerIcon;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class OVocManMadeCust extends OVocManMade {

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

    protected ClickListener BTN_CLOSE2_ClickListener;

    protected ClickListener BTN_CLOSE3_ClickListener;

    protected ClickListener BTN_CLOSE4_ClickListener;
    
    protected ClickListener BTN_CLOSE5_ClickListener;
    // 按钮查询的点击事件;
    protected ClickListener BTN_INQ1_ClickListener;
    // 按钮选择交易的点击事件;
    protected ClickListener BTN_TX_ClickListener;
    // 按钮确定的点击事件;
    protected ClickListener BTN_OK1_ClickListener;

    protected ClickListener BTN_OK2_ClickListener;

    protected ClickListener BTN_OK3_ClickListener;
    
    protected ClickListener BTN_OK4_ClickListener;

    // 发票类型的ValueChanged事件
    protected ValueChangedListener VOC_FLAG_ValueChangedListener;
    // 发票渠道的ValueChanged事件
    protected ValueChangedListener VOC_CHANNEL_ValueChangedListener;
    // 收入的ValueChanged事件
    protected ValueChangedListener INS_AMT_ValueChangedListener;

    protected ValueChangedListener TAX_RATE_ValueChangedListener;

    // 交易编码的ValueChanged事件
    protected ValueChangedListener TX_CODE_ValueChangedListener;
    //拆分方式的valueChanged事件
    protected ValueChangedListener SPLIT_TYPE_ValueChangedListener;
    protected ValueChangedListener frmHBHJYDMXX_TX_CODE_ValueChangedListener;

    protected RecordDoubleClickListener resultTb2_addRecordDoubleClickListener;

    protected UPickerIcon searchIcon = new UPickerIcon(PickerIcon.SEARCH);

    protected ClickListener BTN_SPLIT1_ClickListener;

    protected ClickListener BTN_MERGE1_ClickListener;

    protected String data_id = "";

    protected String data_id1 = "";

    protected String data_id2 = "";

    protected String data_id3 = "";

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
            BTN_DTL_Cmd.setQuerySqlid("OVocManMade_002");
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
                            BTN_INQ1_Cmd.setQuerySqlid("OVocManMade_003");
                            BTN_INQ1_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback, String commandItemName) {
                                    detailSw1.setTitle("发票信息-" + stype1);
                                    detailSw1.show();
                                    frmYWQT1.hide();
                                    if(mod1==1){
                                        btnAdd();
                                        if(detailDs.getCurrentValue("VOC_FLAG")!=null){
                                            if("2".equals(detailDs.getCurrentValue("VOC_FLAG"))){
                                                frmFPXX_BUY_ACT_NO.setRequired(false);
                                                frmFPXX_BUY_ADDR.setRequired(false);
                                                frmFPXX_BUY_NAME.setRequired(true);
                                                frmFPXX_BUY_BANK_NO.setRequired(false);
                                                frmFPXX_BUY_TAX_NO.setRequired(false);
                                                frmFPXX_BUY_TEL.setRequired(false);
                                                frmFPXX_CUST_NO.setRequired(false);
                                            }else if("0".equals(detailDs.getCurrentValue("VOC_FLAG"))){
                                                frmFPXX_BUY_ACT_NO.setRequired(true);
                                                frmFPXX_BUY_ADDR.setRequired(true);
                                                frmFPXX_BUY_NAME.setRequired(true);
                                                frmFPXX_BUY_BANK_NO.setRequired(true);
                                                frmFPXX_BUY_TAX_NO.setRequired(true);
                                                frmFPXX_BUY_TEL.setRequired(true);
                                                frmFPXX_CUST_NO.setRequired(true);
                                            }
                                        }
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
            BTN_INQ_Cmd.setQuerySqlid("OVocManMade_001");
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
            BTN_INQ2_Cmd.setQuerySqlid("OVocManMade_004");
            // BTN_MOD.setDisabled(true);
            BTN_INQ2_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    // BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        listVocList();
                        detailSw4.show();
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
            detailSw4.hide();
            // 刷新上一级界面列表
            BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            // 对于通用查询需要设置SQLID的值
            BTN_INQ1_Cmd.setQuerySqlid("OVocManMade_003");
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
        frmXFXX_ONLY_DPPT.hide();
        frmCXXX_CUST_NO.setReferenceCmd(refCmd1,false);
        frmCXXX_BUY_TAX_NO.setReferenceCmd(refNmd,false);
        frmFPXX_CUST_NO.setQuerySystemName("NEED_VOC_FLAG:Y");
        frmFPXX_CUST_NO.setReferenceCmd(refCmd);
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
        queryDs1.addDataRecord(new DataRecord(new HashMap<String, Object>()),null);
        frmHBHJYDMXX_TX_CODE.bindDropdownDataset(txcodeDs);
        frmHBHJYDMXX_TX_CODE.setValueField("tx_code");
        frmHBHJYDMXX_TX_CODE.setDisplayField("tx_name");
        HashMap<String,String> extra = new HashMap<String,String>();
        extra.put("IO_FLAG", "O");
        TXCODE_INQ_Cmd.setExtraInfo(extra);
        TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        TXCODE_INQ_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                frmHBHJYDMXX_TX_CODE.flushData();
                resultTb1.getUField("TX_CODE").bindDropdownDataset(txcodeDs, "tx_code", "tx_name");
            }
        });
        mergeDs.addDataRecord(new DataRecord(new HashMap<String,String>()), null);
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
                BTN_INQ_Cmd.setQuerySqlid("OVocManMade_001");
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
                frmQTFPXX_PAYEE_NAME.show();
                mod1 = 0;
                readOnly();
                BTN_SAVE.show();
                resultDs1.removeAllData();

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
                                                    System.out.println("============================>data MAP");
                                                    detailDs.setCurrentValue("SALE_ACT_NO", vocEntityDs.getCurrentValue("ACT_NO"));
                                                    detailDs.setCurrentValue("SALE_NAME", vocEntityDs.getCurrentValue("ORG_NAME"));
                                                    detailDs.setCurrentValue("SALE_TAX_NO", vocEntityDs.getCurrentValue("TAX_NO"));
                                                    detailDs.setCurrentValue("SALE_ADDR", vocEntityDs.getCurrentValue("ADDR"));
                                                    detailDs.setCurrentValue("SALE_TEL", vocEntityDs.getCurrentValue("TEL"));
                                                    detailDs.setCurrentValue("SALE_BANK_NO", vocEntityDs.getCurrentValue("BANK_NAME"));
                                                    detailDs.setCurrentValue("TX_ORG_ID", ContextHelper.getContext().getValue("ORG_ID"));
                                                    detailDs.setCurrentValue("MEDIA_TYPE", "P");
                                                    /** added by yanshuai Lu 20230802 for 数电 固定发票性质为篮字发票 begin */
                                                    detailDs.setCurrentValue("VOC_TYPE", "1");
                                                    /** added by yanshuai Lu 20230802 for 数电 固定发票性质为篮字发票 end */

                                                    /** added by yanshuai Lu 20230802 for 数电  begin */
                                                    frmQTFPXX.setReadOnly("VOC_CHANNEL", false);
                                                    frmQTFPXX_PAYEE_NAME.show();
                                                    // 发票介质（MEDIA_TYPE）设置为“E”且只读,否则默认为“P”且非只读（E：数电发票  P：纸质发票）
                                                    detailDs.setCurrentValue("MEDIA_TYPE", "E");
                                                    // 发票渠道设置为“02”且只读，否则设置为“01”且非只读
                                                    detailDs.setCurrentValue("VOC_CHANNEL", "02");
                                                    frmQTFPXX_PAYEE_NAME.hide();
                                                    if("Y".equals(vocEntityDs.getCurrentValue("ONLY_DPPT"))){
                                                        frmQTFPXX.setReadOnly("VOC_CHANNEL", true);
                                                    }
                                                    /** added by yanshuai Lu 20230802 for 数电  end */
                                                    detailDs.sync();
                                                    detailSw1.setTitle("发票信息-新增");
                                                    detailSw1.show();
                                                    btnAdd();
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
                stack1 = resultDs.getSelectedRecords();
                readOnly();
                /** added by yanshuai Lu 20230802 for 数电 隐藏/显示收款人  begin */
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))){
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                /** added by yanshuai Lu 20230802 for 数电 隐藏/显示收款人  end */

                BTN_SAVE.show();
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
                /** added by yanshuai Lu 20230802 for 数电 隐藏/显示收款人  begin */
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))){
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                /** added by yanshuai Lu 20230802 for 数电 隐藏/显示收款人  end */
                stack1 = resultDs.getSelectedRecords();
                readOnly();
                BTN_SAVE.show();
                cyclePopup1();
                btnDel();
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
                readOnly();
                BTN_SAVE.hide();
                cyclePopup1();
                btnDel();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
        BTN_SAVE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
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

                String custId = detailDs.getCurrentValue("CUST_ID");
                String vocFlag = detailDs.getCurrentValue("VOC_FLAG");

                /** added by wolf.duan 20160416 for VAT-1758  begin */
                /** 如果是新增或者修改时，提交 的时候检查发票的金额，如果加总后是负的，不能提交  */
                if(mod1==0 || mod1==1){
                    DataRecord[] dtlRecords = resultDs1.getDataRecords();
                    BigDecimal vocInsAmt = new BigDecimal(0);
                    BigDecimal vocTaxAmt = new BigDecimal(0);
                    if(dtlRecords.length == 0){
                        UPrompt.alert("提示", "发票明细不能为空！");
                        return;
                    }
                    for (DataRecord dtl : dtlRecords) {
                        BigDecimal insAmt = new BigDecimal(dtl.getValue("INS_AMT"));
                        if(insAmt ==null){
                            UPrompt.alert("提示", "发票明细项金额不能为空，不能提交！");
                            return;
                        }else {
                            double insAmt1 = insAmt.doubleValue();
                            if(insAmt1<=0){
                                UPrompt.alert("提示", "发票明细项金额需小于等于0，不能提交！");
                                return;
                            }
                        }
                        if(!custId.equals(dtl.getValue("CUST_ID"))){
                            UPrompt.alert("提示", "发票客户信息与交易不符！");
                            return;
                        }
                        if(!vocFlag.equals(dtl.getValue("VOC_FLAG_VOC")) && !"0".equals(dtl.getValue("VOC_FLAG_VOC"))){
                            UPrompt.alert("提示", "发票类型信息与交易不符！");
                            return;
                        }
                    }
                }
                /** added by wolf.duan 20160416 for VAT-1758  end */
                logtype1 = "new";
                detailDs.setCurrentValue("VOC_USER", ContextHelper.getContext().getValue("USERNAME"));
                detailDs.setCurrentValue("MADE_TYPE", "1");
                detailDs.setCurrentValue("VOC_STAT", "0");
                detailDs.setCurrentValue("VOC_TYPE", "1");
                detailDs.setCurrentValue("REVISE_STATUS", "1");
                detailDs.setCurrentValue("IS_HAPPEN", "Y");
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

                if (mod1 == 1 || mod1 == 0) {
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
                                            System.out.println("&&&&&&&&&&" + data_id2);

                                            Map<String, String> extraInfo = new HashMap<String, String>();
                                            extraInfo.put("PDATA_ID", data_id2);
                                            extraInfo.put("CUST_ID", detailDs.getCurrentValue("CUST_ID"));
                                            extraInfo.put("CUST_NO", detailDs.getCurrentValue("CUST_NO"));
                                            extraInfo.put("MADE_TYPE", "1");
                                            extraInfo.put("VOC_DATA_ID", detailDs.getCurrentValue("DATA_ID"));
                                            extraInfo.put("TX_ID", resultDs3.getCurrentValue("TX_ID"));

                                            BTN_SAVE_DTL_Cmd.setCommandDataScope(DataScope.ALL);
                                            BTN_SAVE_DTL_Cmd.setExtraInfo(extraInfo);
                                            BTN_SAVE_DTL_Cmd.setCommandService("vatCommonService", "oVocManMadeInsertVocDtl");
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
                }else{
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
				/*else if(mod1==2){/* deleted by wolf.duan 状态更新 ，在审批的时候做才合理
					String dataStatus = resultDs.getCurrentValue("DATA_STATUS");
					if("27".equals(dataStatus) || "21".equals(dataStatus) || "25".equals(dataStatus) || "35".equals(dataStatus) || "39".equals(dataStatus)){
						Map<String, String> extraInfo1 = new HashMap<String, String>();
						//data_id3 = resultDs3.getCurrentValue("DATA_ID");
						data_id3 = resultDs1.getCurrentValue("DATA_ID");
						extraInfo1.put("PDATA_ID", data_id3);
						BTN_SAVE_DTL_Cmd.setCommandDataScope(DataScope.ALL);
						BTN_SAVE_DTL_Cmd.setExtraInfo(extraInfo1);
						BTN_SAVE_DTL_Cmd.setHead("CTLNAME", "BTN_DEL");
						BTN_SAVE_DTL_Cmd.setCommandService("vatCommonService", "changNextactionStatus");
						BTN_SAVE_DTL_Cmd.setHead("ADDINFO", "PmVatOVocList");
						BTN_SAVE_DTL_Cmd.execute(new CommandCallback() {
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
				}*/
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
        BTN_INQ1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                listVocList();
            }
        };
        BTN_INQ1.addClickListener(BTN_INQ1_ClickListener);
        BTN_ADD1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mod2 = 0;
                String custNo = detailDs.getCurrentValue("CUST_NO");
                String vocFlag = detailDs.getCurrentValue("VOC_FLAG");
                if (custNo == null || "".equals(custNo) || vocFlag == null || "".equals(vocFlag)) {
                    UPrompt.alert("提示", "请填写客户号和发票类型 ！");
                    return;
                }
                HashMap<String, String> map = new HashMap<String, String>();
                detailDs2.addDataRecord(new DataRecord(map), new DataAction() {
                    @Override
                    public void doAction(DataRecord record) {
                        listVocList();
                        detailSw4.show();
                    }
                });
            }
        };
        BTN_ADD1.addClickListener(BTN_ADD1_ClickListener);
//        BTN_DEL1_ClickListener = new ClickListener() {
//            @Override
//            public void onClick(ClickEvent event) {
//                mod3 = 2;
//                stype3 = "删除";
//                resultDs1.removeCurrentRecord();
//                calcVocAmt();
//            }
//        };
//        BTN_DEL1.addClickListener(BTN_DEL1_ClickListener);
        // 确定按钮
        BTN_OK1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {

                optOk1(null);
            }
        };
        BTN_OK1.addClickListener(BTN_OK1_ClickListener);
        BTN_CLOSE2_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {

                detailSw4.hide();
            }
        };
        BTN_CLOSE2.addClickListener(BTN_CLOSE2_ClickListener);
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
                    frmFPXX_CUST_NO.setRequired(true);
                } else if ("2".equals(event.getNewValue())) {
                    frmFPXX_BUY_ACT_NO.setRequired(false);
                    frmFPXX_BUY_ADDR.setRequired(false);
                    frmFPXX_BUY_BANK_NO.setRequired(false);
                    frmFPXX_BUY_TAX_NO.setRequired(false);
                    frmFPXX_BUY_TEL.setRequired(false);
                    frmFPXX_CUST_NO.setRequired(false);
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

        SPLIT_TYPE_ValueChangedListener=new ValueChangedListener("SPLIT_TYPE"){
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                frmYWXQ1Ctl();
            }
        };
        frmYWXQ1_SPLIT_TYPE.addValueChangedListener(SPLIT_TYPE_ValueChangedListener);

        BTN_SPLIT1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs3.getCurrentRecord() == null || resultDs3.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
                mapqueryDs.put("CURR_AMT", resultDs3.getCurrentValue("AMOUNT"));
                mapqueryDs.put("SPLIT_TYPE", "1");
                splitDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
                    @Override
                    public void doAction(DataRecord record) {
                        System.out.println("insert empty record: " + record.getDataMap());
                        ListGridRecord gridRecord = record.getViewRecord();
                        frmYWXQ1.editRecord(gridRecord);
                        splitSw.show();
                        frmYWXQ1Ctl();
                    }
                });
            }
        };
        BTN_SPLIT1.addClickListener(BTN_SPLIT1_ClickListener);

        BTN_MERGE1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs3.getCurrentRecord() == null || resultDs3.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                if(resultDs3.getSelectedRecords().length < 2){
                    UPrompt.alert("提示", "所合并明细至少2笔");
                    return;
                }
                //只能是TX_ID一样的交易才可以合并
                for(int i=0;i<resultDs3.getSelectedRecords().length; i++){
                    for(int j=i+1;j<resultDs3.getSelectedRecords().length;j++){
                        if(!resultDs3.getSelectedRecords()[i].getValue("TX_ID").equals(resultDs3.getSelectedRecords()[j].getValue("TX_ID"))){
                            UPrompt.alert("提示", "交易ID不同无法进行合并操作");
                            return;
                        }
                    }
                }
                BTN_MERGE1.setDisabled(true);
                BTN_MERGE1_Cmd.setCommandDataScope(DataScope.SELECT);
                BTN_MERGE1_Cmd.setCommandService("vatCommonService", "vocTxDtlMerge");
                BTN_MERGE1_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_MERGE1.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "合并失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            UPrompt.alert("提示", "合并成功");
                            listVocList();
                        }
                    }
                });
            }
        };
        BTN_MERGE1.addClickListener(BTN_MERGE1_ClickListener);

        BTN_OK2_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs3.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                String splitType = splitDs.getCurrentValue("SPLIT_TYPE");
                if(splitType == null || "".equals(splitType)){
                    UPrompt.alert("提示", "请选择拆分方式");
                    return;
                }
                if("0".equals(splitType)){
                    String splitNum = splitDs.getCurrentValue("SPLIT_NUM");
                    if(splitNum == null || "".equals(splitNum)){
                        UPrompt.alert("提示", "请填写拆分笔数");
                        return;
                    }
                    if(Integer.valueOf(splitNum) < 2){
                        UPrompt.alert("提示", "拆出笔数至少2笔");
                        return;
                    }
                }else if("1".equals(splitType)){
                    String currAmt = splitDs.getCurrentValue("CURR_AMT");
                    String splitAmt = splitDs.getCurrentValue("SPLIT_AMT");
                    if(splitAmt == null || "".equals(splitAmt)){
                        UPrompt.alert("提示", "请填写拆分金额");
                        return;
                    }
                    if(new BigDecimal(currAmt.replaceAll(",", "")).compareTo(new BigDecimal(splitAmt.replaceAll(",", ""))) <= 0){
                        UPrompt.alert("提示", "拆出金额必须小于当前金额");
                        return;
                    }
                }else{
                    UPrompt.alert("提示", "拆分方式非法");
                    return;
                }

                Map<String,String> extra = new HashMap<String,String>();
                extra.put("DATA_ID", resultDs3.getCurrentValue("DATA_ID"));
                BTN_SPLIT1_Cmd.setExtraInfo(extra);
                BTN_OK2.setDisabled(true);
                BTN_SPLIT1_Cmd.setCommandService("vatCommonService", "vocTxDtlSplit");
                BTN_SPLIT1_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_OK2.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "拆分失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            UPrompt.alert("提示", "拆分成功");
                            splitSw.hide();
                            listVocList();
                        }
                    }
                });
            }
        };
        BTN_OK2.addClickListener(BTN_OK2_ClickListener);

        BTN_CLOSE3_ClickListener = new ClickListener() {

            @Override
            public void onClick(ClickEvent event) {
                splitSw.hide();
            }
        };
        BTN_CLOSE3.addClickListener(BTN_CLOSE3_ClickListener);
        frmHBHJYDMXX_TX_CODE_ValueChangedListener = new ValueChangedListener("TX_CODE") {

            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                TXCODE_INQ2_Cmd.setCommandService("commonQueryService", "commonQuery");
                TXCODE_INQ2_Cmd.setQuerySqlid("OVocManMade_011");
                TXCODE_INQ2_Cmd.execute(new CommandCallback() {
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
        frmHBHJYDMXX_TX_CODE.addValueChangedListener(frmHBHJYDMXX_TX_CODE_ValueChangedListener);

        BTN_OK3_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mergeSw.hide();
                detailSw4.hide();
                Map<String,String> params = new HashMap<String,String>();
                params.put("TX_CODE", mergeDs.getCurrentValue("TX_CODE"));
                params.put("GOOD_CODE", mergeDs.getCurrentValue("GOOD_CODE"));
                params.put("DTL_NAME", mergeDs.getCurrentValue("GOOD_NAME"));
                params.put("GOOD_TYPE", mergeDs.getCurrentValue("GOOD_TYPE"));
                params.put("CNT_UNIT", mergeDs.getCurrentValue("CNT_UNIT"));
                params.put("GOOD_AMT", mergeDs.getCurrentValue("GOOD_AMT"));
                optOk1(params);
            }
        };
        BTN_OK3.addClickListener(BTN_OK3_ClickListener);

        BTN_CLOSE4_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mergeSw.hide();
            }
        };
        BTN_CLOSE4.addClickListener(BTN_CLOSE4_ClickListener);
        
        BTN_MOD1_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				if (resultDs1.getCurrentRecord() == null) {
					UPrompt.alert("提示", "请选择需要操作的记录");
					return;
				}
				if (resultDs1.getSelectedRecords().length == 0) {
					UPrompt.alert("提示", "请选择需要操作的记录");
					return;
				}
				unitSw.show();
				BTN_OK4.show();
				BTN_CLOSE5.show();
				frmFPPXXX.setReadOnly("CNT_UNIT", false);
				unitDs.copyCurrentRecord(resultDs1);
			}
		};
		BTN_MOD1.addClickListener(BTN_MOD1_ClickListener);
		BTN_OK4_ClickListener = new ClickListener() {
			public void onClick(ClickEvent event) {
				String GOOD_CODE = resultDs1.getCurrentRecord().getValue("GOOD_CODE");
				String DTL_NAME = resultDs1.getCurrentRecord().getValue("DTL_NAME");
				String TX_CODE = resultDs1.getCurrentRecord().getValue("TX_CODE");
				String GOOD_TYPE = resultDs1.getCurrentRecord().getValue("GOOD_TYPE");
				String CNT_UNIT = resultDs1.getCurrentRecord().getValue("CNT_UNIT");
				String GOOD_NUM = resultDs1.getCurrentRecord().getValue("GOOD_NUM");
				String GOOD_AMT = resultDs1.getCurrentRecord().getValue("GOOD_AMT");
				String AMOUNT = resultDs1.getCurrentRecord().getValue("AMOUNT");
				String INS_AMT = resultDs1.getCurrentRecord().getValue("INS_AMT");
				String TAX_RATE = resultDs1.getCurrentRecord().getValue("TAX_RATE");
				String TAX_AMT = resultDs1.getCurrentRecord().getValue("TAX_AMT");
				String DISCOUNT_FLAG = resultDs1.getCurrentRecord().getValue("DISCOUNT_FLAG");
				String DISCOUNT_DESC = resultDs1.getCurrentRecord().getValue("DISCOUNT_DESC");
				String TAX_RATE_FLAG = resultDs1.getCurrentRecord().getValue("TAX_RATE_FLAG");
				String DATA_ID = resultDs1.getCurrentRecord().getValue("DATA_ID");
				String PDATA_ID = resultDs1.getCurrentRecord().getValue("PDATA_ID");
				String CUST_NO = resultDs1.getCurrentRecord().getValue("CUST_NO");
				String CUST_ID = resultDs1.getCurrentRecord().getValue("CUST_ID");
				String TX_ID = resultDs1.getCurrentRecord().getValue("TX_ID");
				String LIST_DATA_IDS = resultDs1.getCurrentRecord().getValue("LIST_DATA_IDS");
				String VOC_FLAG = resultDs1.getCurrentRecord().getValue("VOC_FLAG");
				String VOC_FLAG_VOC = resultDs1.getCurrentRecord().getValue("VOC_FLAG_VOC");
				
				resultDs1.removeCurrentRecord();
				DataRecord dr = unitDs.getCurrentRecord();
				CNT_UNIT = unitDs.getCurrentRecord().getValue("CNT_UNIT");
				dr.setValue("GOOD_CODE", GOOD_CODE);
				dr.setValue("DTL_NAME", DTL_NAME);
				dr.setValue("TX_CODE", TX_CODE);
				dr.setValue("GOOD_TYPE", GOOD_TYPE);
				dr.setValue("CNT_UNIT", CNT_UNIT);
				dr.setValue("GOOD_NUM", GOOD_NUM);
				dr.setValue("GOOD_AMT", GOOD_AMT);
				dr.setValue("AMOUNT", AMOUNT);
				dr.setValue("INS_AMT", INS_AMT);
				dr.setValue("TAX_RATE", TAX_RATE);
				dr.setValue("TAX_AMT", TAX_AMT);
				dr.setValue("DISCOUNT_FLAG", DISCOUNT_FLAG);
				dr.setValue("DISCOUNT_DESC", DISCOUNT_DESC);
				dr.setValue("TAX_RATE_FLAG", TAX_RATE_FLAG);
				dr.setValue("DATA_ID", DATA_ID);
				dr.setValue("PDATA_ID", PDATA_ID);
				dr.setValue("CUST_NO", CUST_NO);
				dr.setValue("CUST_ID", CUST_ID);
				dr.setValue("TX_ID", TX_ID);
				dr.setValue("LIST_DATA_IDS", LIST_DATA_IDS);
				dr.setValue("VOC_FLAG", VOC_FLAG);
				dr.setValue("VOC_FLAG_VOC", VOC_FLAG_VOC);
				resultDs1.addDataRecord(dr, null);
				resultDs1.sync();
				unitSw.hide();
			}
		};
		BTN_OK4.addClickListener(BTN_OK4_ClickListener);
		BTN_CLOSE5_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				unitSw.hide();
			}
		};
		BTN_CLOSE5.addClickListener(BTN_CLOSE5_ClickListener);
    }

    public void optOk1(Map<String,String> params){
        String vocFlag = detailDs.getCurrentValue("VOC_FLAG");
        DataRecord[] dataRecords = resultDs1.getDataRecords();

        DataRecord[] selectRecords = resultDs3.getSelectedRecords();
        if(selectRecords == null || selectRecords.length == 0){
            UPrompt.alert("提示", "操作非法");
            return;
        }

        for(int i = 0 ; i < selectRecords.length ; i++){
            for(int j = 0 ; j < selectRecords.length ; j++){
                String iTaxRate = selectRecords[i].getValue("TAX_RATE");
                String jTaxRate = selectRecords[j].getValue("TAX_RATE");
                String iCaclTaxType = (selectRecords[i].getValue("CACL_TAX_TYPE") == null ? "" : selectRecords[i].getValue("CACL_TAX_TYPE"));
                String jCaclTaxType = (selectRecords[j].getValue("CACL_TAX_TYPE") == null ? "" : selectRecords[j].getValue("CACL_TAX_TYPE"));
                String iDiscountFlag = (selectRecords[i].getValue("DISCOUNT_FLAG") == null ? "" : selectRecords[i].getValue("DISCOUNT_FLAG"));
                String jDiscountFlag = (selectRecords[j].getValue("DISCOUNT_FLAG") == null ? "" : selectRecords[j].getValue("DISCOUNT_FLAG"));
                if(!iTaxRate.equals(jTaxRate)){
                    UPrompt.alert("提示", "不同税率不能放在同一条明细中!");
                    return;
                }
                if(!iTaxRate.equals(jTaxRate)){
                    UPrompt.alert("提示", "不同税率不能放在同一条明细中!");
                    return;
                }

                if(!iDiscountFlag.equals(jDiscountFlag)){
                    UPrompt.alert("提示", "不同优惠政策不能放在同一条明细中!");
                    return;
                }

                if("0".equals(iTaxRate)){
                    if("0".equals(jTaxRate)){
                        if(!(caclTaxType(iTaxRate, iCaclTaxType).equals(caclTaxType(jTaxRate, jCaclTaxType)))){
                            UPrompt.alert("提示", "不同零税率标志不能放在同一条明细中!");
                            return;
                        }
                    }
                }
            }
        }

        String sTxCode = "";
        String sGoodCode = "";
        String sGoodName = "";
        String sGoodType = "";
        String sCntUnit = "";
        String sGoodAmt = "";
        if(params == null){
//            sTxCode = resultDs3.getCurrentValue("TX_CODE");
//            sGoodCode = resultDs3.getCurrentValue("GOOD_CODE");
//            sGoodName = resultDs3.getCurrentValue("DTL_NAME");
//            sGoodType = resultDs3.getCurrentValue("GOOD_TYPE");
//            sCntUnit = resultDs3.getCurrentValue("CNT_UNIT");
            sGoodAmt = "1";
            for(int i = 0 ; i < selectRecords.length ; i++){
            	if(i==0) {
	            	sTxCode = selectRecords[i].getValue("TX_CODE");
	                sGoodCode = selectRecords[i].getValue("GOOD_CODE");
	                sGoodName = selectRecords[i].getValue("DTL_NAME");
	                sGoodType = selectRecords[i].getValue("GOOD_TYPE");
	                sCntUnit = selectRecords[i].getValue("CNT_UNIT");
            	}
                for(int j = 0 ; j < selectRecords.length ; j++){
                    if(!(selectRecords[i].getValue("TX_CODE").equals(selectRecords[j].getValue("TX_CODE")))){
                        mergeDs.addDataRecord(new DataRecord(new HashMap<String,String>()), null);
                        mergeSw.show();
                        return;
                    }
                }
            }

        }else{
            sTxCode = params.get("TX_CODE");
            sGoodCode = params.get("GOOD_CODE");
            sGoodName = params.get("DTL_NAME");
            sGoodType = params.get("GOOD_TYPE");
            sCntUnit = params.get("CNT_UNIT");
            sGoodAmt = params.get("GOOD_AMT");
        }

        for(DataRecord data : selectRecords){
            String[] taxRate = data.getValue("TAX_RATE").split(",");
            for(String sa1 : taxRate){
                if("0".equals(sa1) && "0".equals(vocFlag)){
                    UPrompt.alert("提示", "零税率不能开专票，请重新选择明细！");
                    return;
                }
            }
        }

        for(DataRecord data : dataRecords){
            if(data.getValue("TX_ID") == null){
                continue;
            }

            String[] a1 = data.getValue("LIST_DATA_IDS").split(",");
            DataRecord[] a2 = resultDs3.getSelectedRecords();
            for(String sa1 : a1){
                for(DataRecord sa2 : a2){
                    if(sa1.equals(sa2.getValue("DATA_ID"))){
                        UPrompt.alert("提示", "交易ID已添加，不能重复添加！");
                        return;
                    }
                }
            }

        }

        BigDecimal amount = new BigDecimal(0);
        BigDecimal goodNum = new BigDecimal(sGoodAmt);
        BigDecimal goodAmt = new BigDecimal(0);
        BigDecimal insAmt = new BigDecimal(0);
        BigDecimal taxAmt = new BigDecimal(0);

        String listDataIds = "";

        for(DataRecord data : selectRecords){
            amount = amount.add(data.getValue("AMOUNT") == null? new BigDecimal(0) : new BigDecimal(data.getValue("AMOUNT").replaceAll(",", "")));
            listDataIds += data.getValue("DATA_ID") + ",";
        }

        if(listDataIds.length() > 0){
            listDataIds = listDataIds.substring(0, listDataIds.length() - 1);
        }

        BigDecimal bTaxRate = resultDs3.getCurrentValue("TAX_RATE") == null ? new BigDecimal(0) : new BigDecimal(resultDs3.getCurrentValue("TAX_RATE").replace(",", ""));

        taxAmt = amount.divide(BigDecimal.valueOf(1).add(bTaxRate), 9, BigDecimal.ROUND_HALF_UP).multiply(bTaxRate).setScale(2, BigDecimal.ROUND_HALF_UP);
        insAmt = amount.subtract(taxAmt);
        goodAmt = insAmt.divide(goodNum,2,BigDecimal.ROUND_HALF_UP);

        //mod by gyk 20160512 对货物编码、货物名称、是否享受优惠政策等赋值
        Map<String, String> dataMap = new HashMap<String, String>();
//		dataMap.put("TX_NAME", resultDs3.getCurrentValue("TX_NAME"));// 名称
        dataMap.put("GOOD_CODE", sGoodCode);// 货物编码
        dataMap.put("DTL_NAME", sGoodName);// 货物名称
        dataMap.put("TX_CODE", sTxCode);// 交易编码
        dataMap.put("TX_ORG_ID", resultDs3.getCurrentValue("TX_ORG_ID"));// 机构号
        dataMap.put("TX_DATE", resultDs3.getCurrentValue("tx_date"));// 交易日期
        dataMap.put("SEQ_NO", resultDs3.getCurrentValue("SEQ_NO"));// 业务流水
        dataMap.put("GOOD_TYPE", sGoodType);// 规格型号
        dataMap.put("CNT_UNIT", sCntUnit);// 单位
        dataMap.put("DISCOUNT_FLAG", resultDs3.getCurrentValue("DISCOUNT_FLAG"));// 是否享受优惠政策
        dataMap.put("DISCOUNT_DESC", resultDs3.getCurrentValue("DISCOUNT_DESC"));// 优惠政策内容
        dataMap.put("GOOD_NUM", String.valueOf(goodNum));// 数量
        dataMap.put("GOOD_AMT", String.valueOf(goodAmt));// 单价
        dataMap.put("AMOUNT", String.valueOf(amount));// 交易金额
        dataMap.put("INS_AMT", String.valueOf(insAmt));// 收入
        dataMap.put("TAX_RATE", resultDs3.getCurrentValue("TAX_RATE"));// 税率
        dataMap.put("TAX_AMT", String.valueOf(taxAmt));// 税金
        dataMap.put("TX_ID", resultDs3.getCurrentValue("TX_ID"));// 交易ID
        dataMap.put("LIST_DATA_IDS", listDataIds);
        dataMap.put("VOC_FLAG_VOC", detailDs.getCurrentValue("VOC_FLAG"));
        dataMap.put("CUST_ID", detailDs.getCurrentValue("CUST_ID"));
        resultDs1.addDataRecord(new DataRecord(dataMap), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                calcVocAmt();
                detailSw4.hide();
            }
        });
    }

    public void readOnly() {
        if (mod1 == 2 || mod1 == 6) {
            frmFPXX.setReadOnly(true);
            frmXFXX.setReadOnly(true);
            frmQTFPXX.setReadOnly(true);
            frmFPXX_BUY_NAME.setRequired(false);
            frmXFXX_SALE_ADDR.setRequired(false);
            frmXFXX_SALE_TEL.setRequired(false);
            frmQTFPXX_VOC_FLAG.setRequired(false);
            frmQTFPXX_PAYEE_NAME.setRequired(false);
            BTN_ADD1.hide();
            //BTN_DEL1.hide();
        } else {
            BTN_ADD1.show();
            //BTN_DEL1.show();
            frmFPXX.setReadOnly(false);
            frmXFXX.setReadOnly(false);
            frmXFXX.setReadOnly("SALE_NAME", true);
            frmXFXX.setReadOnly("SALE_TAX_NO", true);
            frmXFXX.setReadOnly("SALE_BANK_NO", true);
            frmXFXX.setReadOnly("SALE_ACT_NO", true);
            frmXFXX.setReadOnly("ONLY_DPPT", true);
            frmQTFPXX.setReadOnly(false);
            frmQTFPXX.setReadOnly("MEDIA_TYPE", true);
            frmFPXX_BUY_NAME.setRequired(true);
            frmXFXX_SALE_ADDR.setRequired(true);
            frmXFXX_SALE_TEL.setRequired(true);
            frmQTFPXX_VOC_FLAG.setRequired(true);
            frmQTFPXX_PAYEE_NAME.setRequired(true);
        }
        frmQTFPXX.setReadOnly("AMOUNT", true);
        frmQTFPXX.setReadOnly("TAX_AMT", true);
        frmQTFPXX.setReadOnly("SUM_AMT", true);
    }

    public void btnAdd(){
        frmFPXX_BUY_ACT_NO.setRequired(true);
        frmFPXX_BUY_ADDR.setRequired(true);
        frmFPXX_BUY_NAME.setRequired(true);
        frmFPXX_BUY_BANK_NO.setRequired(true);
        frmFPXX_BUY_TAX_NO.setRequired(true);
        frmFPXX_BUY_TEL.setRequired(true);
        frmFPXX_CUST_NO.setRequired(true);

        frmXFXX_SALE_ADDR.setRequired(true);
        frmXFXX_SALE_TEL.setRequired(true);

        frmQTFPXX_VOC_FLAG.setRequired(true);
        frmQTFPXX.setReadOnly("VOC_TYPE", true);
    }
    public void btnDel(){
        frmFPXX_BUY_ACT_NO.setRequired(false);
        frmFPXX_BUY_ADDR.setRequired(false);
        frmFPXX_BUY_NAME.setRequired(false);
        frmFPXX_BUY_BANK_NO.setRequired(false);
        frmFPXX_BUY_TAX_NO.setRequired(false);
        frmFPXX_BUY_TEL.setRequired(false);
        frmFPXX_CUST_NO.setRequired(false);

        frmXFXX_SALE_ADDR.setRequired(false);
        frmXFXX_SALE_TEL.setRequired(false);
        frmXFXX_ONLY_DPPT.setRequired(false);

        frmQTFPXX_VOC_FLAG.setRequired(false);
        frmQTFPXX_VOC_CHANNEL.setRequired(false);
    }
    public void listVocList() {
        DataRecord[] dataRecords = resultDs1.getDataRecords();
        String inStr = "";
        for(DataRecord record : dataRecords){
            if(record.getValue("LIST_DATA_IDS") != null){
                if("".equals(inStr)){
                    inStr += record.getValue("LIST_DATA_IDS").replaceAll(",", "','");
                }else{
                    inStr += "','" + record.getValue("LIST_DATA_IDS").replaceAll(",", "','");
                }
            }
        }

        queryDs1.setCurrentValue("CUST_NO", detailDs.getCurrentValue("CUST_NO"));
        Map<String,String> extra = new HashMap<String,String>();
        extra.put("CUST_NO", detailDs.getCurrentValue("CUST_NO"));
        extra.put("VOC_FLAG", detailDs.getCurrentValue("VOC_FLAG"));
        extra.put("DATA_IDS", inStr);
        seqNoCmd.setExtraInfo(extra);
        seqNoCmd.setCommandService("vatOutputService", "oVocManMadeListVocList");
        seqNoCmd.setQuerySqlid("seqByCustAndVoc");
        BTN_INQ1.setDisabled(true);
        seqNoCmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                BTN_INQ1.setDisabled(false);
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

    public void calcVocAmt() {
        DataRecord[] dtlRecords = resultDs1.getDataRecords();
        BigDecimal vocInsAmt = new BigDecimal(0);
        BigDecimal vocTaxAmt = new BigDecimal(0);
        for (DataRecord dtl : dtlRecords) {
            BigDecimal insAmt = new BigDecimal(dtl.getValue("INS_AMT"));
            BigDecimal taxAmt = new BigDecimal(dtl.getValue("TAX_AMT"));
            vocInsAmt = vocInsAmt.add(insAmt);
            vocTaxAmt = vocTaxAmt.add(taxAmt);
        }
        detailDs.setCurrentValue("AMOUNT", String.valueOf(vocInsAmt));
        detailDs.setCurrentValue("TAX_AMT", String.valueOf(vocTaxAmt));
        detailDs.setCurrentValue("SUM_AMT", String.valueOf(vocInsAmt.add(vocTaxAmt)));
        detailDs.sync();
    }

    public void frmYWXQ1Ctl(){
        String splitType = splitDs.getCurrentValue("SPLIT_TYPE");
        if(splitType == null || "".equals(splitType)){
            return;
        }
        if("0".equals(splitType)){
            frmYWXQ1.getField("SPLIT_AMT").hide();
            frmYWXQ1.getField("SPLIT_NUM").show();
//			frmYWXQ1_SPLIT_AMT.hide();
//			frmYWXQ1_SPLIT_NUM.show();
        }else if("1".equals(splitType)){
            frmYWXQ1.getField("SPLIT_AMT").show();
            frmYWXQ1.getField("SPLIT_NUM").hide();
//			frmYWXQ1_SPLIT_AMT.show();
//			frmYWXQ1_SPLIT_NUM.hide();

        }
    }

    public String round2(Double d){
        double d1 = d*100;
        int d2  = (int)d1;
        double d3 = d1 - d2;
        if(d3 >= 0.5){
            d1 = d1 + 1;
        }
        return String.valueOf((d1 - d3)/100) ;
    }

    public String caclTaxType (String taxRate ,String caclTaxType){
        String caclTaxType1 = "";
        if( "0".equals(taxRate) ){
            if("2".equals(caclTaxType)){
                caclTaxType1 = "0";
            }
            if("3".equals(caclTaxType)){
                caclTaxType1 = "1";
            }
            if("5".equals(caclTaxType)){
                caclTaxType1 = "2";
            }else{
                caclTaxType1 = "3";
            }
        }
        return caclTaxType1;
    }
}
