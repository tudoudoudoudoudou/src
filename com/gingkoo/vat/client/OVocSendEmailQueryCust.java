package com.gingkoo.vat.client;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;

public class OVocSendEmailQueryCust extends OVocSendEmailQuery {

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
    //按钮查看明细的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    //按钮关闭的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    //按钮重新发送的点击事件;
    protected ClickListener BTN_RES_ClickListener;
    //按钮批量重发的点击事件;
    protected ClickListener BTN_DTL_SEND_ClickListener;
    @Override
    protected void setting() {
        this.setPageID("");
    }

    private DataRecord[] stack1;

    public void cyclePopup1()
    {
        //是否存在选中数据
        if ((stack1 != null) && (stack1.length > 0)) {

            //取选中的第一条记录
            resultDs.setCurrentRecord(stack1[0]);
            BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            BTN_DTL_Cmd.setQuerySqlid("OVocSendEmail_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback,String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw1.setTitle("邮件信息-"+stype1);
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
        } else {   //若未选中则进行通用查询
            //关闭邮件明细页面
            detailSw1.hide();
            //刷新上一级界面列表
            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            //对于通用查询需要设置SQLID的值
            BTN_INQ_Cmd.setQuerySqlid("OVocSendEmail_001");
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
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        DateTimeFormat df = DateTimeFormat.getFormat("yyyy-MM-dd");
        mapqueryDs.put("DATA_DATE", new Date());
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }
        });
    }

    @Override
    protected void bindEvent() {
        //邮件信息信息页面关闭时单击事件
        detailSw1.addCloseClickHandler(new CloseClickHandler(){
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });

        //查询按钮绑定事件
        BTN_INQ_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_INQ_Cmd.setQuerySqlid("OVocSendEmail_001");
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

        //查看明细按钮单击事件
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

        //关闭按钮单击事件
        BTN_CLOSE_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);

        //重新发送按钮开发
        BTN_RES_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                UPrompt.confirm("邮件重发", "你确定要重新发送该邮件吗?", new UPrompt.PromptCallback() {
                    @Override
                    public void execute(Boolean aBoolean) {
                        if (aBoolean != null && aBoolean) {
                            BTN_RES.setDisabled(true);
                            Map<String, String> map = new HashMap<String,String>();
                            map.put("resendFlag", "Y");
                            map.put("EMAIL_TYPE", "VocSendEmail_Temp_cn");
                            BTN_RES_Cmd.setExtraInfo(map);
                            BTN_RES_Cmd.setCommandService("vocSendEmailService","vocSendEmail");
                            BTN_RES_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback, String commandItemName) {
                                    BTN_RES.setDisabled(false);
                                    System.out.println(commandItemName);
                                    if ("-1".equals(callback.getErrorCode())){
                                        UPrompt.alert("提示", callback.getErrorMessage());
                                    }else{
                                        UPrompt.alert("提示", (String) callback.getCallbackData());
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
        BTN_RES.addClickListener(BTN_RES_ClickListener);

        BTN_DTL_SEND_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                if(resultDs.getCurrentRecord() != null && resultDs.getSelectedRecords().length > 0){
                    BTN_DTL_SEND.setDisabled(true);
                    Map<String, String> map = new HashMap<String,String>();
                    map.put("resendFlag","Y");
                    map.put("EMAIL_TYPE", "VocSendEmail_Temp_cn");
                    BTN_DTL_SEND_Cmd.setCommandDataScope(DataScope.SELECT);
                    BTN_DTL_SEND_Cmd.setExtraInfo(map);
                    BTN_DTL_SEND_Cmd.setCommandService("vocSendEmailService", "batchVocSendEmail");
                    BTN_DTL_SEND_Cmd.execute(new CommandCallback() {
                        @Override
                        public void onCallback(boolean b, Callback callback, String s) {
                            BTN_DTL_SEND.setDisabled(false);
                            if("-1".equals(callback.getErrorCode())){
                                UPrompt.alert("提示", callback.getErrorMessage());
                            }else{
                                UPrompt.alert("提示", "发送成功");
                            }
                        }
                    });
                }else{
                    UPrompt.alert("提示", "请选择需要重发的记录");
                }
            }
        };
        BTN_DTL_SEND.addClickListener(BTN_DTL_SEND_ClickListener);
    }
}
