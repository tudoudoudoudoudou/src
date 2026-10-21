package com.gingkoo.vat.client;

import java.util.Map;
import java.util.HashMap;

import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.event.ValueChangeEvent;
import com.gingkoo.gui.data.client.dataset.event.ValueChangedListener;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickListener;
import com.gingkoo.gui.ui.component.client.form.fields.UPickerIcon;
import com.gingkoo.gui.ui.component.client.form.fields.events.FormItemClickListener;
import com.gingkoo.gui.ui.component.client.form.fields.events.FormItemIconClickEvent;
import com.smartgwt.client.widgets.form.fields.PickerIcon;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;

public class OVocRedReviseCust extends OVocRedRevise {

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
    //按钮查询的点击事件;
    protected ClickListener BTN_INQ_ClickListener;
    //按钮新增的点击事件;
    protected ClickListener BTN_ADD_ClickListener;
    //按钮修改的点击事件;
    protected ClickListener BTN_MOD_ClickListener;
    //按钮删除的点击事件;
    protected ClickListener BTN_DEL_ClickListener;
    //按钮提交的点击事件;
    protected ClickListener BTN_SAVE_ClickListener;
    //按钮返回的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    //按钮查看明细的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    //按钮查询的点击事件;
    protected ClickListener BTN_INQ2_ClickListener;
    //按钮返回的点击事件;
    protected ClickListener BTN__VOC_CLOSE_ClickListener;
    //创建一个ValueChanged事件
    protected ValueChangedListener  VOC_FLAG_ValueChangedListener;
  //创建一个ValueChanged事件
    protected ValueChangedListener  VOC_CHANNEL_ValueChangedListener;
    protected RecordDoubleClickListener resultTb3_addRecordDoubleClickListener;

    protected UPickerIcon searchIcon = new UPickerIcon(PickerIcon.SEARCH);
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
            BTN_DTL_Cmd.setQuerySqlid("OVocRedRevise_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw1.setTitle("红字发票录入-"+stype1);
                            detailSw1.show();
                            frmYWQT.show();
                            BTN_DTL_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            BTN_DTL_INQ_Cmd.setQuerySqlid("OVocRedRevise_004");
                            BTN_DTL_INQ_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback,String commandItemName) {

                                    System.out.println("detailDs====>"+detailDs.getCurrentRecord().getDataMap());

                                    detailDs.setCurrentValue("VOC_CODE", detailDs.getCurrentValue("ORI_VOC_CODE"));
                                    detailDs.setCurrentValue("VOC_NO", detailDs.getCurrentValue("ORI_VOC_NO"));
                                    detailDs.setCurrentValue("VOC_DATE", detailDs.getCurrentValueAsDate("ORI_VOC_DATE"));
                                    detailDs.sync();
                                    System.out.println("======================"+detailDs.getCurrentValue("VOC_CODE"));
                                    System.out.println("======================"+detailDs.getCurrentValue("VOC_NO"));
                                    //                                  System.out.println("======================"+detailDs.getCurrentValue("VOC_DATE"));
                                }
                            });
                        }
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
            //刷新上一级界面列表
            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            //对于通用查询需要设置SQLID的值
            BTN_INQ_Cmd.setQuerySqlid("OVocRedRevise_001");
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
        frmXFXX_ONLY_DPPT.hide();
        frmCXXX_CUST_NO.setReferenceCmd(refCmd,false);
        //
        //frmYHHP_CMB_SIGN_BRNO.setReferenceCmd(refCmd);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        //mapqueryDs.put("START_VOC_NO", "Value1");
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }
        });
        TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        TXCODE_INQ_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback,String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                resultTb2.getUField("TX_CODE").bindDropdownDataset(txcodeDs,"tx_code","tx_name");
            }
        });

        frmQTFPXX_VOC_CODE.setIcons(searchIcon);
        frmQTFPXX_VOC_NO.setIcons(searchIcon);
    }

    @Override
    protected void bindEvent() {

        detailSw1.addCloseClickHandler(new CloseClickHandler(){
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
                BTN_INQ_Cmd.setQuerySqlid("OVocRedRevise_001");
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
                        detailSw1.setTitle("红字发票录入-新增");
                        frmFPXX.setReadOnly(true);
                        frmXFXX.setReadOnly(true);
                        frmQTFPXX.setReadOnly(true);
                        frmYWQT.setReadOnly(true);
                        frmQTFPXX.setReadOnly("RSP_NO", false);
                        frmQTFPXX.setReadOnly("VOC_CODE", false);
                        frmQTFPXX.setReadOnly("VOC_NO", false);
                        frmQTFPXX.setReadOnly("VOC_DATE", true);
                        frmQTFPXX.setReadOnly("REMARKS", false);
                        frmQTFPXX_VOC_CODE.setRequired(true);
                        frmQTFPXX_VOC_NO.setRequired(true);
                        frmQTFPXX_VOC_FLAG.setRequired(false);
                        frmQTFPXX_MEDIA_TYPE.setRequired(false);
                        resultDs2.removeAllData();
                        detailSw1.show();
                        frmYWQT.hide();
                    }
                });
            }
        };
        BTN_ADD.addClickListener(BTN_ADD_ClickListener);
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

                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  begin */
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))) {
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  end */

                frmFPXX.setReadOnly(true);
                frmXFXX.setReadOnly(true);
                frmQTFPXX.setReadOnly(true);
                frmYWQT.setReadOnly(true);
                frmQTFPXX_VOC_CODE.setRequired(false);
                frmQTFPXX_VOC_NO.setRequired(false);
                frmQTFPXX_VOC_FLAG.setRequired(false);
                frmQTFPXX_MEDIA_TYPE.setRequired(false);
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
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
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  begin */
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))) {
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  end */

                frmFPXX.setReadOnly(true);
                frmXFXX.setReadOnly(true);
                frmQTFPXX.setReadOnly(true);
                frmYWQT.setReadOnly(true);
                frmQTFPXX.setReadOnly("RSP_NO", false);
                frmQTFPXX.setReadOnly("VOC_CODE", false);
                frmQTFPXX.setReadOnly("VOC_NO", false);
                frmQTFPXX.setReadOnly("VOC_DATE", true);
                frmQTFPXX.setReadOnly("REMARKS", false);
                frmQTFPXX_VOC_CODE.setRequired(true);
                frmQTFPXX_VOC_NO.setRequired(true);
                frmQTFPXX_VOC_FLAG.setRequired(false);
                frmQTFPXX_MEDIA_TYPE.setRequired(false);
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
                detailDs.sync();
                System.out.println("======================"+detailDs.getCurrentValue("VOC_CODE"));
                System.out.println("======================"+detailDs.getCurrentValue("VOC_NO"));
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
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  begin */
                if("02".equals(resultDs.getCurrentValue("VOC_CHANNEL"))) {
                    frmQTFPXX_PAYEE_NAME.hide();
                }else{
                    frmQTFPXX_PAYEE_NAME.show();
                }
                /** added by yanshuai Lu 20230802 for 数电 显示/隐藏收款人  end */

                    /*frmQTFPXX.setReadOnly("RSP_NO", true);
                    frmQTFPXX.setReadOnly("VOC_CODE", true);
                    frmQTFPXX.setReadOnly("VOC_NO", true);
                    frmQTFPXX.setReadOnly("VOC_DATE", true);
                    frmQTFPXX.setReadOnly("REMARKS", true);*/
                frmFPXX.setReadOnly(true);
                frmXFXX.setReadOnly(true);
                frmQTFPXX.setReadOnly(true);
                frmYWQT.setReadOnly(true);
                frmQTFPXX_VOC_CODE.setRequired(false);
                frmQTFPXX_VOC_NO.setRequired(false);
                frmQTFPXX_VOC_FLAG.setRequired(false);
                frmQTFPXX_MEDIA_TYPE.setRequired(false);
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
            }
        };
        BTN_DEL.addClickListener(BTN_DEL_ClickListener);
        BTN_SAVE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                if (!frmQTFPXX.validate()) {
                    UPrompt.alert("提示", "存在未输入的必输项！");
                    return;
                }
                Map<String,String> extraMap =  new HashMap<String,String>();
                // extraMap.put("MEDIA_TYPE", "P");
                extraMap.put("MEDIA_TYPE", detailDs.getCurrentValue("MEDIA_TYPE"));
                BTN_SAVE_Cmd.setExtraInfo(extraMap);
                /** added by yanshuai Lu 20230802 for 数电 数据库添加蓝字数电发票号码,蓝字发票代码,蓝字发票号码,存储对应数据  begin */
                detailDs.setCurrentValue("ORI_VOC_ID", detailDs.getCurrentValue("VOC_ID"));
                detailDs.setCurrentValue("ORI_VOC_CODE", detailDs.getCurrentValue("VOC_CODE"));
                detailDs.setCurrentValue("ORI_VOC_NO", detailDs.getCurrentValue("VOC_NO"));
                detailDs.setCurrentValue("VOC_ID", "");
                /** added by yanshuai Lu 20230802 for 数电 数据库添加蓝字数电发票号码,蓝字发票代码,蓝字发票号码,存储对应数据  end */

                detailDs.setCurrentValue("VOC_CODE", "");
                detailDs.setCurrentValue("VOC_NO", "");
                detailDs.setCurrentValue("VOC_DATE", "");
                detailDs.setCurrentValue("ORI_DATA_ID", resultDs3.getCurrentValue("DATA_ID"));
                System.out.println("$$$$$$$$$$$$$$$$$"+resultDs3.getCurrentValue("DATA_ID"));
                logtype1="new";
                if (mod1 == 0){
                    BTN_SAVE_Cmd.setCommandService("vatCommonService", "oVocRedAdd");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_ADD");
                    logtype1="new";
                    stype1="新增";}
                if (mod1 == 1){
                    BTN_SAVE_Cmd.setDBService("commonUpdateService", "execute");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_MOD");
                    logtype1="mod";
                    stype1="修改";}
                if (mod1 == 2){
                    BTN_SAVE_Cmd.setDBService("commonDeleteService", "execute");
                    BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_DEL");
                    logtype1="del";
                    stype1="删除";}
                //新增、修改提交之前应该按红字信息确认单号进行查询发票张数查询，若找到则不允许提交
                if(mod1==0||mod1==1){
                    VOC_NUM_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                    VOC_NUM_INQ_Cmd.setQuerySqlid("vocNumInqByRspNo");
                    VOC_NUM_INQ_Cmd.execute(new CommandCallback() {
                        @Override
                        public void onCallback(boolean status, Callback callback,String commandItemName) {
                            if (!status||callback.getErrorMessage()!=null) {
                                UPrompt.alert("提示", "按红字信息确认单号查询未作废的发票记录数失败！");
                                return;
                            } else {
                                String vocNum=vocNumDs.getCurrentValue("VOC_NUM");
                                int v_num=Integer.valueOf(vocNum);
                                String vocFlag = detailDs.getCurrentValue("VOC_FLAG");
                                System.out.println("@#@#@#@#@#@#@#@#"+v_num);
                                if(v_num>0 && !frmQTFPXX_RSP_NO.getAttributeAsBoolean("readOnly") && mod1==0 && "0".equals(vocFlag)){
                                    UPrompt.alert("提示", "该红字信息确认单号对应的未作废发票已存在，请重新选择发票或填入红字信息确认单号！");
                                    return;
                                }else if(v_num>1 && !frmQTFPXX_RSP_NO.getAttributeAsBoolean("readOnly") && mod1==1 && "0".equals(vocFlag)){
                                    UPrompt.alert("提示", "该红字信息确认单号对应的未作废发票已存在，请重新选择发票或填入红字信息确认单号！");
                                    return;
                                } else{
                                    BTN_SAVE.setDisabled(true);
                                    if(mod1==1){
                                        BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
                                    }
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
                        }
                    });
                }else{
                    BTN_SAVE.setDisabled(true);
                    BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatOVoc");
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

        BTN_INQ2_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                BTN_RED_VOC_INQ_CMD.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_RED_VOC_INQ_CMD.setQuerySqlid("OVocRedRevise_006");
                BTN_INQ2.setDisabled(true);
                BTN_RED_VOC_INQ_CMD.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        BTN_INQ2.setDisabled(false);
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
        BTN_INQ2.addClickListener(BTN_INQ2_ClickListener);

        VOC_FLAG_ValueChangedListener = new ValueChangedListener("VOC_FLAG") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                // TODO Auto-generated method stub
                if ("0".equals(event.getNewValue())) {
                    frmQTFPXX_RSP_NO.show();
                } else if ("2".equals(event.getNewValue())) {
                    frmQTFPXX_RSP_NO.hide();
                }
            }
        };
        frmQTFPXX_VOC_FLAG.addValueChangedListener(VOC_FLAG_ValueChangedListener);
        
        VOC_CHANNEL_ValueChangedListener = new ValueChangedListener("VOC_CHANNEL") {
            @Override
            public void onValueChange(String fieldName, ValueChangeEvent event) {
                // TODO Auto-generated method stub
                if ("01".equals(event.getNewValue())) {
                	if(resultDs3.getCurrentValue("VOC_FLAG").equals("2")){
	                    frmQTFPXX_RSP_NO.hide();
	                    frmQTFPXX_RSP_NO.setRequired(false);
	                }else{
	                    detailDs.setCurrentValue("RSP_NO",resultDs3.getCurrentValue("RED_RSP_NO"));
	                    if(detailDs.getCurrentValue("RSP_NO")!=null){
	                        frmQTFPXX_RSP_NO.show();
	                        frmQTFPXX.setReadOnly("RSP_NO", true);
	                        frmQTFPXX_RSP_NO.setRequired(true);
	                    }else{
	                        frmQTFPXX_RSP_NO.show();
	                        frmQTFPXX.setReadOnly("RSP_NO", false);
	                        frmQTFPXX_RSP_NO.setRequired(true);
	                    }
	                }
                } else if ("02".equals(event.getNewValue())) {
                	frmQTFPXX_RSP_NO.show();
                    frmQTFPXX.setReadOnly("RSP_NO", false);
                    frmQTFPXX_RSP_NO.setRequired(true);
                }
            }
        };
        frmQTFPXX_VOC_CHANNEL.addValueChangedListener(VOC_CHANNEL_ValueChangedListener);

        searchIcon.addFormItemClickListener(new FormItemClickListener() {

            @Override
            public void onFormItemClick(FormItemIconClickEvent event) {
                // TODO Auto-generated method stub
                queryDs2.addDataRecord(new DataRecord(new HashMap<String,String>()), null);
                detailSw3.show();
                BTN_RED_VOC_INQ_CMD.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_RED_VOC_INQ_CMD.setQuerySqlid("OVocRedRevise_006");
                BTN_INQ2.setDisabled(true);
                BTN_RED_VOC_INQ_CMD.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        BTN_INQ2.setDisabled(false);
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

        resultTb3_addRecordDoubleClickListener=new RecordDoubleClickListener() {
            @Override
            public void onRecordClick(RecordDoubleClickEvent event) {
                detailDs.setCurrentValue("VOC_CODE", resultDs3.getCurrentValue("VOC_CODE"));
                detailDs.setCurrentValue("VOC_NO", resultDs3.getCurrentValue("VOC_NO"));
                detailDs.setCurrentValue("VOC_FLAG", resultDs3.getCurrentValue("VOC_FLAG"));
                detailDs.setCurrentValue("VOC_DATE", resultDs3.getCurrentValueAsDate("VOC_DATE"));
                detailDs.setCurrentValue("BUY_TAX_NO", resultDs3.getCurrentValue("BUY_TAX_NO"));
                detailDs.setCurrentValue("BUY_ADDR", resultDs3.getCurrentValue("BUY_ADDR"));
                detailDs.setCurrentValue("BUY_TEL", resultDs3.getCurrentValue("BUY_TEL"));
                detailDs.setCurrentValue("BUY_BANK_NO", resultDs3.getCurrentValue("BUY_BANK_NO"));
                detailDs.setCurrentValue("BUY_ACT_NO", resultDs3.getCurrentValue("BUY_ACT_NO"));
                detailDs.setCurrentValue("SALE_TAX_NO", resultDs3.getCurrentValue("SALE_TAX_NO"));
                detailDs.setCurrentValue("SALE_ADDR", resultDs3.getCurrentValue("SALE_ADDR"));
                detailDs.setCurrentValue("SALE_TEL", resultDs3.getCurrentValue("SALE_TEL"));
                detailDs.setCurrentValue("SALE_BANK_NO", resultDs3.getCurrentValue("SALE_BANK_NO"));
                detailDs.setCurrentValue("SALE_ACT_NO", resultDs3.getCurrentValue("SALE_ACT_NO"));
                detailDs.setCurrentValue("REMARKS", resultDs3.getCurrentValue("REMARKS"));
                detailDs.setCurrentValue("PAYEE_NAME", resultDs3.getCurrentValue("PAYEE_NAME"));
                detailDs.setCurrentValue("AMOUNT", resultDs3.getCurrentValue("AMOUNT"));
                detailDs.setCurrentValue("TAX_AMT", resultDs3.getCurrentValue("TAX_AMT"));
                detailDs.setCurrentValue("SUM_AMT", resultDs3.getCurrentValue("SUM_AMT"));
                detailDs.setCurrentValue("VOC_USER", resultDs3.getCurrentValue("VOC_USER"));
                detailDs.setCurrentValue("APV_USER", resultDs3.getCurrentValue("APV_USER"));
                detailDs.setCurrentValue("BUY_NAME", resultDs3.getCurrentValue("BUY_NAME"));
                detailDs.setCurrentValue("VENDOR_NO", resultDs3.getCurrentValue("VENDOR_NO"));
                detailDs.setCurrentValue("APV_USER", resultDs3.getCurrentValue("APV_USER"));
                detailDs.setCurrentValue("APV_USER", resultDs3.getCurrentValue("APV_USER"));
                detailDs.setCurrentValue("REQ_REMARKS", resultDs3.getCurrentValue("REQ_REMARKS"));
                detailDs.setCurrentValue("O_REQ_TYPE", resultDs3.getCurrentValue("O_REQ_TYPE"));
                detailDs.setCurrentValue("SALE_NAME", resultDs3.getCurrentValue("SALE_NAME"));
                detailDs.setCurrentValue("RSP_NO",resultDs3.getCurrentValue("RED_RSP_NO"));
                detailDs.setCurrentValue("ORI_DATA_ID", resultDs3.getCurrentValue("DATA_ID"));
                detailDs.setCurrentValue("CUST_NO", resultDs3.getCurrentValue("CUST_NO"));
                /** added by yanshuai Lu 20230802 for 数电 添加数电发票号码备用  begin */
                detailDs.setCurrentValue("VOC_ID", resultDs3.getCurrentValue("VOC_ID"));
                /** added by yanshuai Lu 20230802 for 数电 添加数电发票号码备用  end */

                /** added by yanshuai Lu 20230802 for 数电 查询是否数电单轨  begin */
                vocEntityCmd.setCommandService("commonQueryService", "commonQueryPage");
                // 对于通用查询需要设置SQLID的值
                vocEntityCmd.setQuerySqlid("vocEntityInfoBySub");
                vocEntityCmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        if (!status) {
                            UPrompt.alert("提示", "获取DATA_ID失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            if("Y".equals(vocEntityDs.getCurrentValue("ONLY_DPPT"))){
                                // 发票介质（MEDIA_TYPE）设置为“E”且只读,否则默认为“P”且非只读（E：数电发票  P：纸质发票）
                                detailDs.setCurrentValue("MEDIA_TYPE", "E");
                                frmQTFPXX.setReadOnly("MEDIA_TYPE", true);
                                // 发票渠道设置为“02”且只读，否则设置为“01”且非只读
                                detailDs.setCurrentValue("VOC_CHANNEL", "02");
                                frmQTFPXX.setReadOnly("VOC_CHANNEL", true);
                                frmQTFPXX_PAYEE_NAME.hide();
                                frmQTFPXX_VOC_CODE.setRequired(false);
                                //frmQTFPXX_VOC_CODE.hide();
                            }else{
                                if("02".equals(resultDs3.getCurrentValue("VOC_CHANNEL"))) {
                                    frmQTFPXX_PAYEE_NAME.hide();
                                    frmQTFPXX_VOC_CODE.setRequired(false);
                                    frmQTFPXX_RSP_NO.show();
        	                        frmQTFPXX_RSP_NO.setRequired(true);
                                }else{
                                    frmQTFPXX_PAYEE_NAME.show();
                                    frmQTFPXX_VOC_CODE.setRequired(true);
                                    if ("0".equals(resultDs3.getCurrentValue("VOC_FLAG"))) {
                                        frmQTFPXX_RSP_NO.show();
                                        frmQTFPXX_RSP_NO.setRequired(true);
                                    } else if ("2".equals(resultDs3.getCurrentValue("VOC_FLAG"))) {
                                        frmQTFPXX_RSP_NO.hide();
                                    }
                                }
                                detailDs.setCurrentValue("VOC_CHANNEL", resultDs3.getCurrentValue("VOC_CHANNEL"));
                                detailDs.setCurrentValue("MEDIA_TYPE", resultDs3.getCurrentValue("MEDIA_TYPE"));
                            }
                            detailDs.sync();
                        }
                    }
                });
                /** added by yanshuai Lu 20230802 for 数电 查询是否数电单轨  end */

                if(resultDs3.getCurrentValue("VOC_CHANNEL").equals("01")) {
	                if(resultDs3.getCurrentValue("VOC_FLAG").equals("2")){
	                    frmQTFPXX_RSP_NO.hide();
	                    frmQTFPXX_RSP_NO.setRequired(false);
	                }else{
	                    detailDs.setCurrentValue("RSP_NO",resultDs3.getCurrentValue("RED_RSP_NO"));
	                    if(detailDs.getCurrentValue("RSP_NO")!=null){
	                        frmQTFPXX_RSP_NO.show();
	                        frmQTFPXX.setReadOnly("RSP_NO", true);
	                        frmQTFPXX_RSP_NO.setRequired(true);
	                    }else{
	                        frmQTFPXX_RSP_NO.show();
	                        frmQTFPXX.setReadOnly("RSP_NO", false);
	                        frmQTFPXX_RSP_NO.setRequired(true);
	                    }
	                }
                }
                detailDs.sync();
                detailSw3.hide();

                Map<String,String> extraInfo =new HashMap<String,String>();
                extraInfo.put("DATA_ID", resultDs3.getCurrentValue("DATA_ID"));
                BTN_DTL_INQ_Cmd.setExtraInfo(extraInfo);
                BTN_DTL_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_DTL_INQ_Cmd.setQuerySqlid("OVocRedRevise_005");
                detailDs.setCurrentValue("RSP_NO",resultDs3.getCurrentValue("RED_RSP_NO"));
                BTN_DTL_INQ_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,String commandItemName) {
                        if (!status) {
                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            String vocDate = resultDs3.getCurrentValue("VOC_DATE");
                            detailDs.setCurrentValue("RSP_NO",resultDs3.getCurrentValue("RED_RSP_NO"));
                            detailDs.sync();
                        }
                    }
                });
            }
        };
        resultTb3.addRecordDoubleClickListener(resultTb3_addRecordDoubleClickListener);

        BTN__VOC_CLOSE.addClickListener(new ClickListener() {

            @Override
            public void onClick(ClickEvent event) {
                // TODO Auto-generated method stub
                detailSw3.hide();
            }
        });
        BTN__VOC_CLOSE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN__VOC_CLOSE.addClickListener(BTN__VOC_CLOSE_ClickListener);
    }

}