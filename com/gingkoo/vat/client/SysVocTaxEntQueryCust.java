package com.gingkoo.vat.client;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.event.ValueChangeEvent;
import com.gingkoo.gui.data.client.dataset.event.ValueChangedListener;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.events.ReferencePageGetDataEvent;
import com.gingkoo.gui.ui.component.client.form.UDynamicForm;
import com.gingkoo.gui.data.client.parser.xml.XMLParser;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickListener;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickListener;
import com.gingkoo.gui.ui.component.client.form.fields.events.DoubleClickEvent;
import com.gingkoo.gui.ui.component.client.form.fields.events.DoubleClickListener;
import com.gingkoo.gui.ui.component.client.form.validator.CustValidator;
import com.gingkoo.gui.ui.component.client.upload.UploadListener;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.rpt.common.client.BizFunClient;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.smartgwt.client.util.SC;

public class SysVocTaxEntQueryCust extends SysVocTaxEntQuery {

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
    //按钮详细信息的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    //按钮返回的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
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
            BTN_DTL_Cmd.setQuerySqlid("SysVocTaxEntQuery_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw1.setTitle("纳税主体查询-"+stype1);
                            detailSw1.show();
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
            BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntQuery_001");
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
        //frmYHHP_CMB_SIGN_BRNO.setReferenceCmd(refCmd);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmnsztcx.editRecord(gridRecord);
            }
        });

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
                BTN_INQ_Cmd.setQuerySqlid("SysVocTaxEntQuery_001");
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
                frmnsztmx1.setReadOnly("TAX_KEY_SN",true);
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);
        BTN_CLOSE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);
    }

}
//resultDs.setValue("DATA_ID", "value1");
//queryDs.setValue("__CONDITION__", "value1");
//detailDs.setValue("PDATA_ID", "value1");
