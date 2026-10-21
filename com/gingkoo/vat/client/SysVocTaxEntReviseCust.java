package com.gingkoo.vat.client;

import java.math.BigDecimal;
import java.util.HashMap;

import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.event.ValueChangeEvent;
import com.gingkoo.gui.data.client.dataset.event.ValueChangedListener;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickListener;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.form.events.ValuesChangedEvent;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class SysVocTaxEntReviseCust extends SysVocTaxEntRevise {

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

    protected String errMsg ="";
    //按钮查询的点击事件;
    protected ClickListener BTN_INQ_ClickListener;
    //按钮新增的点击事件;
    protected ClickListener BTN_ADD_ClickListener;
    //按钮修改的点击事件;
    protected ClickListener BTN_MOD_ClickListener;
    //按钮删除的点击事件;
    protected ClickListener BTN_DEL_ClickListener;
    //按钮详细信息的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    //按钮放弃修改的点击事件;
    protected ClickListener BTN_FMOD_ClickListener;
    //按钮提交的点击事件;
    protected ClickListener BTN_SAVE_ClickListener;
    //按钮返回的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    protected ClickListener BTN_CLOSE1_ClickListener;
    //valuechanged事件
    //每月开专票数量最大值的值改变事件
    protected ValueChangedListener frmKPXX_VOC_MAX_S_NUM_ValueChangedListener;
    //每月开普票数量最大值的值改变事件
    protected ValueChangedListener frmKPXX_VOC_MAX_C_NUM_ValueChangedListener;
    //专用发票开票限额的值改变事件
    protected ValueChangedListener frmKPXX_VOC_S_AMT_ValueChangedListener;
    //普通发票开票限额的值改变事件
    protected ValueChangedListener frmKPXX_VOC_C_AMT_ValueChangedListener;
    //是否开通数电能力的值改变事件
    protected ValueChangedListener frmKPXX_HAS_DPPT_ValueChangedListener;

    @Override
    protected void setting() {
        this.setPageID("");
    }

    private DataRecord[] stack1;

    public void cyclePopup1()
    {
        if ((stack1 != null) && (stack1.length > 0))
        {
            //取选中的第一条记录
            resultDs.setCurrentRecord(stack1[0]);
            BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            BTN_DTL_Cmd.setQuerySqlid("SysVocTaxEntRevise_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if(mod1==6){
                            if (callback.getCallbackCount() > 0) {
                                detailSw2.setTitle("纳税主体录入-"+stype1);
                                detailSw2.show();
                            }
                        }else{
                            if (callback.getCallbackCount() > 0) {
                                detailSw1.setTitle("纳税主体录入-"+stype1);
                                detailSw1.show();
                            }
                        }
                        frmYWQT.show();
                    }
                }
            });
            //从堆栈中清除最后一条记录
            if (stack1.length > 1)
            {
                DataRecord[] tmpstack = new DataRecord[stack1.length-1];
                for (int i = 0; i < tmpstack.length;i++)
                    tmpstack[i] = stack1[i+1];
                stack1 = new DataRecord[stack1.length-1];
                for (int i = 0; i < tmpstack.length;i++)
                    stack1[i] = tmpstack[i];
            } else
                stack1 = new DataRecord[0];
        } else
        {

            detailSw1.hide();
            detailSw2.hide();
            //刷新上一级界面列表
            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            //对于通用查询需要设置SQLID的值
            BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntRevise_001");
            BTN_INQ_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
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
        //
        frmkpdlr1_ORG_ID.setReferenceCmd(refCmd);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmkpdlr.editRecord(gridRecord);
            }
        });
        detailDs.setCurrentValue("frmKPXX_VOC_AMT", "0.00");
        detailDs.setCurrentValue("frmKPXX_VOC_MAX_S_NUM", "0.00");
        detailDs.setCurrentValue("frmKPXX_VOC_MAX_C_NUM", "0.00");

    }

    @Override
    protected void bindEvent() {
        detailSw1.addCloseClickHandler(new CloseClickHandler(){
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });
        detailSw2.addCloseClickHandler(new CloseClickHandler(){
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });
        BTN_INQ_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntRevise_001");
                BTN_INQ.setDisabled(true);
                BTN_INQ_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
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
        BTN_ADD_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                mod1=0;
                HashMap<String, String> map = new HashMap<String, String>();
                detailDs.addDataRecord(new DataRecord(map), new DataAction() {
                    @Override
                    public void doAction(DataRecord record) {
                        detailSw1.setTitle("纳税主体录入-新增");
                        detailSw1.show();
                        BTN_SAVE.show();
//				    	frmkpdlr1.setReadOnly(false);
//				    	frmkpdlr1.setReadOnly("VOC_MAX_AMT",true);//只读
                        dtlReadOnly1();
                        btnAdd();
                        frmYWQT.hide();
                    }
                });
            }
        };
        BTN_ADD.addClickListener(BTN_ADD_ClickListener);
        BTN_MOD_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                mod1=1;
                stype1="修改";
                if (resultDs.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                BTN_SAVE.show();
//            	frmkpdlr1.setReadOnly(false);
//            	frmkpdlr1.setReadOnly("VOC_MAX_AMT",true);//只读
                dtlReadOnly1();
                cyclePopup1();
                btnAdd();
            }
        };
        BTN_MOD.addClickListener(BTN_MOD_ClickListener);
        BTN_DEL_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                mod1=2;
                stype1="删除";
                if (resultDs.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                BTN_SAVE.show();
                dtlReadOnly();
                cyclePopup1();
                btnDel();
            }
        };
        BTN_DEL.addClickListener(BTN_DEL_ClickListener);
        BTN_FMOD_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null || resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                BTN_FMOD_Cmd.setCommandService("rptWsCommonService", "rollback");
                BTN_FMOD_Cmd.setHead("APVSTATUS", "0");
                BTN_FMOD_Cmd.setHead("ADDINFO", "PmVatTaxEntity");
                BTN_FMOD_Cmd.setHead("CTLNAME", "BTN_FMOD");
                BTN_FMOD_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        if (!status || callback.getErrorMessage() != null) {
                            if (callback.getErrorMessage() != null)
                            {UPrompt.alert("提示", "操作失败:"+callback.getErrorMessage());return;}
                            else
                            {UPrompt.alert("提示", "操作失败！");return;}
                        } else {
                            UPrompt.alert("提示", "操作成功！");
                        }
                        BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                        //对于通用查询需要设置SQLID的值
                        BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntRevise_001");
                        BTN_INQ_Cmd.execute(new CommandCallback() {
                            @Override
                            public void onCallback(boolean status, Callback callback,String commandItemName) {
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
                });
            }
        };
        BTN_FMOD.addClickListener(BTN_FMOD_ClickListener);
        BTN_DTL_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                mod1=6;
                stype1="查看明细";
                if (resultDs.getSelectedRecords().length == 0)
                {
                    UPrompt.alert("提示","请选择需要操作的记录");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
        BTN_SAVE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (!frmkpdlr1.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                if(!frmKPXX.validate()){
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                if(hasDpptReadOnly()){
                    UPrompt.alert("提示", "当“是否开通数电能力”为是时，“省级税务机关名称”、“数电平台编号”、“是否数电单轨”必输");
                    return;
                }



                if(!frmZCXX.validate()){
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                if(!frmNSXX.validate()){
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                if (frmKPXX_VOC_MAX_S_NUM.getValueAsString()==null||"".equals(frmKPXX_VOC_MAX_S_NUM.getValueAsString())||
                        frmKPXX_VOC_MAX_C_NUM.getValueAsString()==null||"".equals(frmKPXX_VOC_MAX_C_NUM.getValueAsString())||
                        frmKPXX_VOC_S_AMT.getValueAsString()==null||"".equals(frmKPXX_VOC_S_AMT.getValueAsString())||
                        frmKPXX_VOC_C_AMT.getValueAsString()==null||"".equals(frmKPXX_VOC_C_AMT.getValueAsString())||
                        frmKPXX_PAYEE_NAME.getValueAsString()==null||"".equals(frmKPXX_PAYEE_NAME.getValueAsString())
                ) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                logtype1="new";
                if (mod1 == 0){
                    BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "insert");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_ADD");
                    logtype1="new";
                    stype1="新增";}
                if (mod1 == 1){
                    BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "update");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_MOD");
                    logtype1="mod";
                    stype1="修改";}
                if (mod1 == 2){
                    BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                    //对于通用查询需要设置SQLID的值
                    BTN_INQ1_Cmd.setQuerySqlid("SiteUniqeQuery");
                    BTN_INQ1_Cmd.execute(new CommandCallback() {
                        @Override
                        public void onCallback(boolean status, Callback callback,String commandItemName) {
                            String countNum = countDs.getCurrentValue("org_id");
                            if(countNum != null && !"".equals(countNum)){
                                UPrompt.alert("提示", "该纳税主体下有票点，不能进行删除！");
                                return;

                            }
                            BTN_SAVE_Cmd.setCommandService("rptWsCommonService", "delete");
                            BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_DEL");
                            logtype1="del";
                            stype1="删除";
                            BTN_SAVE.setDisabled(true);
                            BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatTaxEntity");
                            BTN_SAVE_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback,String commandItemName) {
                                    BTN_SAVE.setDisabled(false);
                                    if (!status || callback.getErrorMessage() != null) {
                                        if (callback.getErrorMessage() != null)
                                            UPrompt.alert("提示", stype1+"失败:"+callback.getErrorMessage());
                                        else
                                            UPrompt.alert("提示", stype1+"失败！");
                                    } else {
                                        UPrompt.alert("提示", "操作成功", new PromptCallback() {
                                            @Override
                                            public void execute(Boolean value) {
                                                //记录业务日志
                                                detailDs.logBiz(logtype1);
                                                //记录系统日志(系统操作，如用户管理时)
                                                //detailDs.logSys(logtype1);
                                                cyclePopup1();
                                            }
                                        });
                                    }
                                }
                            });
//		            	  int count =Integer.valueOf(countDs.getCurrentValue("COUNT_NUM"));



//		                }


                        }
                    });

                }
                if(mod1 == 0 || mod1 == 1){
                    BTN_SAVE.setDisabled(true);
                    BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatTaxEntity");
                    BTN_SAVE_Cmd.execute(new CommandCallback() {
                        @Override
                        public void onCallback(boolean status, Callback callback,String commandItemName) {
                            BTN_SAVE.setDisabled(false);
                            if (!status || callback.getErrorMessage() != null) {
                                if (callback.getErrorMessage() != null)
                                    UPrompt.alert("提示", stype1+"失败:"+callback.getErrorMessage());
                                else
                                    UPrompt.alert("提示", stype1+"失败！");
                            } else {
                                UPrompt.alert("提示", "操作成功", new PromptCallback() {
                                    @Override
                                    public void execute(Boolean value) {
                                        //记录业务日志
                                        detailDs.logBiz(logtype1);
                                        //记录系统日志(系统操作，如用户管理时)
                                        //detailDs.logSys(logtype1);
                                        cyclePopup1();
                                    }
                                });
                            }
                        }
                    });
                }
            }
        };
        BTN_SAVE.addClickListener(BTN_SAVE_ClickListener);
        BTN_CLOSE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);
        BTN_CLOSE1_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE1.addClickListener(BTN_CLOSE1_ClickListener);

        //开专票数量最大值的valuechanged事件
        frmKPXX_VOC_MAX_S_NUM_ValueChangedListener = new ValueChangedListener("VOC_MAX_S_NUM") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                btnVocMaxAmt();
            }
        };
        frmKPXX_VOC_MAX_S_NUM.addValueChangedListener(frmKPXX_VOC_MAX_S_NUM_ValueChangedListener);

        //开普票数量最大值的valuechanged事件
        frmKPXX_VOC_MAX_C_NUM_ValueChangedListener = new ValueChangedListener("VOC_MAX_C_NUM") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                btnVocMaxAmt();
            }
        };
        frmKPXX_VOC_MAX_C_NUM.addValueChangedListener(frmKPXX_VOC_MAX_C_NUM_ValueChangedListener);

        //专用发票开票限额的值改变事件
        frmKPXX_VOC_S_AMT_ValueChangedListener = new ValueChangedListener("VOC_S_AMT") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                btnVocMaxAmt();
            }
        };
        frmKPXX_VOC_S_AMT.addValueChangedListener(frmKPXX_VOC_S_AMT_ValueChangedListener);

        //专用发票开票限额的值改变事件
        frmKPXX_VOC_C_AMT_ValueChangedListener = new ValueChangedListener("VOC_C_AMT") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                btnVocMaxAmt();
            }
        };
        frmKPXX_VOC_C_AMT.addValueChangedListener(frmKPXX_VOC_C_AMT_ValueChangedListener);

        //当“是否开通数电能力”为是时，“省级税务机关名称”、“数电平台编号”、“是否数电单轨”必输
/*        frmKPXX_HAS_DPPT_ValueChangedListener = new ValueChangedListener("HAS_DPPT") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                hasDpptReadOnly();
            }
        };
        frmKPXX_HAS_DPPT.addValueChangedListener(frmKPXX_HAS_DPPT_ValueChangedListener);
*/

        frmJBHXX.addRecordClickListener(new RecordClickListener(){
            @Override
            public void onRecordClick(RecordClickEvent event) {
                if("O".equals(resultDs.getCurrentValue("DATA_FLAG"))){
                    BTN_FMOD.setDisabled(true);
                }else{
                    BTN_FMOD.setDisabled(false);
                }
                if("27".equals(resultDs.getCurrentValue("DATA_STATUS"))||"25".equals(resultDs.getCurrentValue("DATA_STATUS"))){
                    BTN_MOD.setDisabled(false);
                    BTN_DEL.setDisabled(true);
                }else if("21".equals(resultDs.getCurrentValue("DATA_STATUS"))){
                    BTN_MOD.setDisabled(true);
                    BTN_DEL.setDisabled(true);
                }else{
                    BTN_MOD.setDisabled(false);
                    BTN_DEL.setDisabled(false);
                }
            }
        });
    }

    public void btnVocMaxAmt(){
        String Voc_Max_S_Num=detailDs.getCurrentValue("VOC_MAX_S_NUM");
        String Voc_Max_C_Num=detailDs.getCurrentValue("VOC_MAX_C_NUM");
        String Voc_S_Amt=detailDs.getCurrentValue("VOC_S_AMT");
        String Voc_C_Amt=detailDs.getCurrentValue("VOC_C_AMT");
        if(Voc_Max_S_Num!=null  && Voc_S_Amt !=null && !"".equals(Voc_S_Amt)&& !"".equals(Voc_Max_S_Num)){
            BigDecimal VocMaxSNum = new BigDecimal(Voc_Max_S_Num);
            BigDecimal VocSAmt = new BigDecimal(Voc_S_Amt.replace(",", ""));
            BigDecimal VocMaxSAmt=VocMaxSNum.multiply(VocSAmt);
            frmKPXX_VOC_MAX_S_AMT.setValue(VocMaxSAmt.toPlainString());
            detailDs.setCurrentValue("VOC_MAX_S_AMT", VocMaxSAmt.toPlainString());
            detailDs.sync();
        }
        if(Voc_Max_C_Num !=null && Voc_C_Amt!=null && !"".equals(Voc_Max_C_Num) && !"".equals(Voc_C_Amt)){
            BigDecimal VocMaxCNum = new BigDecimal(Voc_Max_C_Num);
            BigDecimal VocCAmt = new BigDecimal(Voc_C_Amt.replace(",", ""));
            BigDecimal VocMaxCAmt=VocMaxCNum.multiply(VocCAmt);
            frmKPXX_VOC_MAX_C_AMT.setValue(VocMaxCAmt.toPlainString());
            detailDs.setCurrentValue("VOC_MAX_C_AMT", VocMaxCAmt.toPlainString());
            detailDs.sync();
        }
    }

    public void btnAdd(){
        frmkpdlr1.setReadOnly(false);
        frmZCXX.setReadOnly(false);
        frmKPXX.setReadOnly(false);
        frmKPXX.setReadOnly("VOC_MAX_S_AMT", true);
        frmKPXX.setReadOnly("VOC_MAX_C_AMT", true);
        frmNSXX.setReadOnly(false);
    }
    public void btnDel(){
        frmkpdlr1.setReadOnly(true);
        frmKPXX.setReadOnly(true);
        frmZCXX.setReadOnly(true);
        frmNSXX.setReadOnly(true);
    }

    //当“是否开通数电能力”为是时，“省级税务机关名称”、“数电平台编号”、“是否数电单轨”必输
    public Boolean hasDpptReadOnly(){
        String has_dppt = detailDs.getCurrentValue("HAS_DPPT");
        String PROV_TAX_ORG_NAME = detailDs.getCurrentValue("PROV_TAX_ORG_NAME");
        String ONLY_DPPT = detailDs.getCurrentValue("ONLY_DPPT");
        String DPPT_PTBH =detailDs.getCurrentValue("DPPT_PTBH");

        if ("Y".equals(has_dppt)){
            if(PROV_TAX_ORG_NAME == null || PROV_TAX_ORG_NAME.isEmpty()){return true;}
            if(ONLY_DPPT == null || ONLY_DPPT.isEmpty()){return true;}
            if(DPPT_PTBH == null || DPPT_PTBH.isEmpty()){return true;}
        }

        return false;
    }

    public void dtlReadOnly(){
        frmkpdlr1.setReadOnly(true);
        frmkpdlr1_ORG_ID.setRequired(false);
        frmkpdlr1_ORG_NAME.setRequired(false);
        frmZCXX_TAX_NO.setRequired(false);
        frmKPXX_VOC_MAX_S_NUM.setRequired(false);
        frmKPXX_VOC_MAX_C_NUM.setRequired(false);
        frmKPXX_VOC_S_AMT.setRequired(false);
        frmKPXX_VOC_C_AMT.setRequired(false);
        frmkpdlr1_BANK_NAME.setRequired(false);
        frmkpdlr1_ACT_NO.setRequired(false);
        frmkpdlr1_TEL.setRequired(false);
        frmkpdlr1_TAX_ENT_TYPE.setRequired(false);
        frmkpdlr1_IDENTITY_RULE_GROUP.setRequired(false);
        frmNSXX_REPORT_CYCLE.setRequired(false);
        frmKPXX_PAYEE_NAME.setRequired(false);
        frmZCXX_REG_TYPE.setRequired(false);
        frmZCXX_INDUSTRY_TYPE.setRequired(false);
        frmZCXX_CORP_NAME.setRequired(false);
    }
    public void dtlReadOnly1(){
        frmkpdlr1.setReadOnly(false);
        frmkpdlr1_ORG_ID.setRequired(true);
        frmkpdlr1_ORG_NAME.setRequired(true);
        frmZCXX_TAX_NO.setRequired(true);
        frmKPXX_VOC_MAX_S_NUM.setRequired(true);
        frmKPXX_VOC_MAX_C_NUM.setRequired(true);
        frmKPXX_VOC_S_AMT.setRequired(true);
        frmKPXX_VOC_C_AMT.setRequired(true);
        frmkpdlr1_BANK_NAME.setRequired(true);
        frmkpdlr1_ACT_NO.setRequired(true);
        frmkpdlr1_TEL.setRequired(true);
        frmkpdlr1_TAX_ENT_TYPE.setRequired(true);
        frmkpdlr1_IDENTITY_RULE_GROUP.setRequired(true);
        frmNSXX_REPORT_CYCLE.setRequired(true);
        frmKPXX_PAYEE_NAME.setRequired(true);
        frmZCXX_REG_TYPE.setRequired(true);
        frmZCXX_INDUSTRY_TYPE.setRequired(true);
        frmZCXX_CORP_NAME.setRequired(true);
    }
}
//resultDs.setValue("DATA_ID", "value1");
//queryDs.setValue("__CONDITION__", "value1");
//detailDs.setValue("PDATA_ID", "value1");
