package com.gingkoo.vat.client;

import com.gingkoo.gui.core.client.context.ContextHelper;
import com.gingkoo.gui.data.client.async.Callback;
import com.gingkoo.gui.data.client.command.callback.CommandCallback;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.gui.data.client.dataset.action.DataAction;
import com.gingkoo.gui.data.client.dataset.record.DataRecord;
import com.gingkoo.gui.ui.component.client.basic.UButton;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UWindow;
import com.gingkoo.gui.ui.component.client.events.ClickEvent;
import com.gingkoo.gui.ui.component.client.events.ClickListener;
import com.gingkoo.gui.ui.component.client.upload.UploadListener;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.types.ContentsType;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.Progressbar;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class OVocDigitalCust extends OVocDigital {

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
    protected Boolean excelSelectType = false;
    protected HashMap<String, String> selectDataId = new HashMap<String, String>();
    //按钮查询的点击事件;
    protected ClickListener BTN_INQ_ClickListener;
    //按钮查看明细的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    //按钮补录的点击事件;
    protected ClickListener BTN_UPDATE_ClickListener;
    //按钮发票导出EXCEL的点击事件;
    protected ClickListener BTN_EXPORT_EXCEL_ClickListener;
    //按钮上传文件的点击事件;
    protected ClickListener BTN_UPLOAD_ClickListener;
    //按钮关闭的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    //按钮提交的点击事件;
    protected ClickListener BTN_SAVE1_ClickListener;
    //按钮导出发票的交易明细;
    protected ClickListener BTN_DL1_ClickListener;
    //按钮提交的点击事件;
    protected ClickListener BTN_SAVE2_ClickListener;
    //按钮返回的点击事件;
    protected ClickListener BTN_CLOSE4_ClickListener;

    @Override
    protected void setting() {
        this.setPageID("");
    }

    private DataRecord[] stack1;

    public void cyclePopup1() {
        if ((stack1 != null) && (stack1.length > 0)) {
            //取选中的第一条记录
            resultDs.setCurrentRecord(stack1[0]);
            BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            BTN_DTL_Cmd.setQuerySqlid("OVocDigital_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            detailSw1.setTitle("发票信息-" + stype1);
                            BTN_DTL1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                            //对于通用查询需要设置SQLID的值
                            BTN_DTL1_Cmd.setQuerySqlid("OVocDigital_003");
                            BTN_DTL.setDisabled(true);
                            BTN_DTL1_Cmd.execute(new CommandCallback() {
                                @Override
                                public void onCallback(boolean status, Callback callback, String commandItemName) {
                                    BTN_DTL.setDisabled(false);
                                    detailSw1.setTitle("数电开具-" + stype1);
                                    detailSw1.show();
                                }
                            });
                        }
                    }
                }
            });
            //从堆栈中清除最后一条记录
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
            //刷新上一级界面列表
            BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
            //对于通用查询需要设置SQLID的值
            BTN_INQ_Cmd.setQuerySqlid("OVocDigital_004");
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

    @Override
    protected boolean beforeInitControls() {
        return super.beforeInitControls();
    }

    @Override
    protected void beforeRender() {
        //add by wyq 20240418 隐藏发票补录按钮
        BTN_UPDATE.hide();
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        mapqueryDs.put("VOC_STAT", "0");
        mapqueryDs.put("voc_flag", "1");
        frmCXXX_MEDIA_TYPE.hide();
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                queryDs.setCurrentValue("VOC_STAT", "0");
//                System.out.println("insert empty record: " + record.getDataMap());
                queryDs.sync();
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }
        });
    }

    @Override
    protected void bindEvent() {
        String username = ContextHelper.getContext().getStringValue("USERNAME");
        VoucherUpload.setServletPath(GWT.getModuleBaseURL() + "../actions/voc-digital/upload4digital?username=" + username);
        //一个文件上传到java服务端完毕后触发此事件
        VoucherUpload.setUploadListener(new UploadListener() {
            @Override
            public void uploadComplete(Boolean success, String filename, String desc) {
                System.out.println(">>>>>>>>>>>>>>>filename:" + filename);
                if (success) {
                    UPrompt.alert("提示", "文件处理成功");
                    detailSw5.hide();
                    return;
                } else {
                    UPrompt.alert("提示", desc);
                }
                VoucherUpload.getUploadItem(0).clearValue();
            }
        });
        detailSw1.addCloseClickHandler(new CloseClickHandler() {
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });
        BTN_INQ_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                //对于通用查询需要设置SQLID的值
                BTN_INQ_Cmd.setQuerySqlid("OVocDigital_004");
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
                frmQTFPXX_ORI_VOC_NO.show();
                frmQTFPXX_ORI_VOC_CODE.show();
                frmQTFPXX.setReadOnly(true);
                BTN_SAVE2.hide();
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);

        BTN_UPDATE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                mod1 = 7;
                stype1 = "补录";
                if (resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                if (resultDs.getSelectedRecords().length > 1) {
                    UPrompt.alert("提示", "请选择一条记录进行操作");
                    cyclePopup1();
                    return;
                }
                if ("2".equals(resultDs.getCurrentValue("VOC_TYPE"))) {
                    UPrompt.alert("提示", "红字发票需在线下开票补录");
                    cyclePopup1();
                    return;
                }
                if ("0".equals(resultDs.getCurrentValue("VOC_STAT")) || "1".equals(resultDs.getCurrentValue("VOC_STAT"))) {
                    String username = ContextHelper.getContext().getStringValue("USERNAME");
                    frmQTFPXX_ORI_VOC_NO.hide();
                    frmQTFPXX_ORI_VOC_CODE.hide();
                    frmQTFPXX.setReadOnly("VOC_NO", false);
                    frmQTFPXX.setReadOnly("VOC_CODE", false);
                    frmQTFPXX.setReadOnly("VOC_DATE", false);
                    frmQTFPXX.setReadOnly("VOC_USER", false);
                    frmQTFPXX_VOC_NO.setRequired(true);
                    frmQTFPXX_VOC_DATE.setRequired(true);
                    frmQTFPXX_VOC_USER.setRequired(true);
                    frmQTFPXX_VOC_USER.setDefaultValue(username);
                    BTN_SAVE2.show();
                    detailDs.sync();
                    stack1 = resultDs.getSelectedRecords();
                    cyclePopup1();
                } else {
                    UPrompt.alert("提示", "只能补录“未打印”或者“正打印”状态的发票！");
                    cyclePopup1();
                    return;
                }

            }
        };
        BTN_UPDATE.addClickListener(BTN_UPDATE_ClickListener);

        BTN_SAVE2_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                BTN_SAVE2_Cmd.setCommandDataScope(DataScope.SELECT);
                //stype1 = "发票补录";
                BTN_SAVE2_Cmd.setCommandService("evatCommonService", "record");
                BTN_SAVE2.setDisabled(true);
                BTN_SAVE2_Cmd.setHead("VOC_NO", detailDs.getCurrentValue("VOC_NO"));
                BTN_SAVE2_Cmd.setHead("VOC_CODE", detailDs.getCurrentValue("VOC_CODE"));
                BTN_SAVE2_Cmd.setHead("VOC_DATE", detailDs.getCurrentValue("VOC_DATE"));
                BTN_SAVE2_Cmd.setHead("VOC_USER", detailDs.getCurrentValue("VOC_USER"));
                BTN_SAVE2_Cmd.setHead("DATA_ID", detailDs.getCurrentValue("DATA_ID"));
                BTN_SAVE2_Cmd.setHead("VOC_STAT", detailDs.getCurrentValue("VOC_STAT"));
                BTN_SAVE2_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_SAVE2.setDisabled(false);
                        if (!status || callback.getErrorMessage() != null) {
                            if (callback.getErrorMessage() != null)
                                UPrompt.alert("提示", stype2 + "失败:" + callback.getErrorMessage());
                            else
                                UPrompt.alert("提示", stype2 + "失败！");
                        } else {
                            UPrompt.alert("提示", "操作成功", new UPrompt.PromptCallback() {
                                @Override
                                public void execute(Boolean value) {
                                    detailDs.logBiz(logtype2);
                                    detailSw1.hide();
                                    cyclePopup1();
                                }
                            });
                        }
                    }
                });
            }
        };
        BTN_SAVE2.addClickListener(BTN_SAVE2_ClickListener);


        BTN_EXPORT_EXCEL_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getSelectedRecords().length == 0) {
                    UPrompt.confirm("PDF导出", "您确定要导出当前条件下全部的发票吗?",
                            new UPrompt.PromptCallback() {
                                public void execute(Boolean value) {
                                    if (value == null || value != true) {//如果选择是取消，则直接返回，不继续执行
                                        return;
                                    }
                                    BTN_EXPORT_EXCEL_Cmd.setHead("selectType", "ALL");
                                    BTN_EXPORT_EXCEL_Cmd.setExtraInfo(getQueryDsData());
                                    excelSelectType = true;
                                    exportExcel();
                                    return;
                                }
                            });
                }

                if (resultDs.getSelectedRecords().length != 0) {
                    if ("2".equals(resultDs.getCurrentValue("VOC_TYPE"))) {
                        UPrompt.alert("提示", "不能导出红字发票");
                    } else {
                        if ("0".equals(resultDs.getCurrentValue("VOC_STAT")) || "1".equals(resultDs.getCurrentValue("VOC_STAT"))) {
                            BTN_EXPORT_EXCEL_Cmd.clearExtraInfo();
                            BTN_EXPORT_EXCEL_Cmd.setHead("selectType", "Single");
                            exportExcel();
                            excelSelectType = false;
                        } else {
                            UPrompt.alert("提示", "只能导出“未打印”或者“正打印”状态的发票！");
                            return;
                        }
                    }
                }

            }
        };
        BTN_EXPORT_EXCEL.addClickListener(BTN_EXPORT_EXCEL_ClickListener);
        BTN_UPLOAD_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mod1 = 0;
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                BTN_INQ_Cmd.setQuerySqlid("OVocDigital_004");
                BTN_UPLOAD.setDisabled(true);
                BTN_INQ_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_UPLOAD.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            //if (callback.getCallbackCount() == 0) {
                            OVocDigitalCust.this.detailSw5.show();
                            return;
                        }
                    }
                });
            }
        };
        BTN_UPLOAD.addClickListener(BTN_UPLOAD_ClickListener);
        //交易明细导出
        //交易明细导出
        BTN_DL1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
//                if (resultDs.getSelectedRecords().length == 0) {
//                    UPrompt.confirm("明细导出", "您确定要导出当前条件下全部的发票明细吗?",
//                            new UPrompt.PromptCallback() {
//                                public void execute(Boolean value) {
//                                    if (value == null || value != true) {//如果选择是取消，则直接返回，不继续执行
//                                        return;
//                                    } else {
//                                        HashMap<String, String> queryDsData = new HashMap<String, String>();
//                                        queryDsData.put("VOC_FLAG", queryDs.getCurrentValue("VOC_FLAG"));
//                                        queryDsData.put("VOC_TYPE", queryDs.getCurrentValue("VOC_TYPE"));
//                                        queryDsData.put("MADE_TYPE", queryDs.getCurrentValue("MADE_TYPE"));
//                                        queryDsData.put("VOC_STAT", queryDs.getCurrentValue("VOC_STAT"));
//                                        queryDsData.put("START_VOC_DATE", queryDs.getCurrentValue("START_VOC_DATE"));
//                                        queryDsData.put("END_VOC_DATE", queryDs.getCurrentValue("END_VOC_DATE"));
//                                        queryDsData.put("START_VOC_NO", queryDs.getCurrentValue("START_VOC_NO"));
//                                        queryDsData.put("CUST_NO", queryDs.getCurrentValue("CUST_NO"));
//                                        queryDsData.put("MEDIA_TYPE", queryDs.getCurrentValue("MEDIA_TYPE"));
//                                        BTN_DL1_Cmd.setExtraInfo(queryDsData);
//                                        BTN_DL1_Cmd.setQuerySqlid("OVocDigital_009");
//                                        BTN_DL1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
//                                        BTN_DL1_Cmd.setHead("TEMPLATE", "EXPORT_TEMPLATE_OvocDigitalDtl.xlsx");
//                                        BTN_DL1_Cmd.setHead("NEWFILENAME", "EXPORT_TEMPLATE_OvocDigitalDtl.xlsx");
//                                        BTN_DL1_Cmd.execute(new CommandCallback() {
//                                            @Override
//                                            public void onCallback(boolean status, Callback callback, String commandItemName) {
//                                                if (status) {
//                                                    SC.say("导出成功");
//                                                }
//                                            }
//                                        });
//                                    }
//                                    return;
//                                }
//                            });
//                }
                if (resultDs.getSelectedRecords().length == 0){
                    UPrompt.alert("提示","请选择需要导出的发票信息");
                }else if(resultDs.getSelectedRecords().length >1){
                    UPrompt.alert("提示","只能选择一条发票信息");
                }else {
                    Map<String, String> exrt = new HashMap<String, String>();
                    exrt.put("DATA_ID", columnSplice(resultDs.getSelectedRecords(), "DATA_ID", "','"));
                    BTN_DL1_Cmd.setExtraInfo(exrt);
                    BTN_DL1_Cmd.setQuerySqlid("OVocDigital_008");
                    BTN_DL1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                    BTN_DL1_Cmd.setHead("TEMPLATE", "EXPORT_TEMPLATE_OvocDigitalDtl.xlsx");
                    BTN_DL1_Cmd.setHead("NEWFILENAME", "EXPORT_TEMPLATE_OvocDigitalDtl.xlsx");
                    BTN_DL1_Cmd.execute(new CommandCallback() {
                        @Override
                        public void onCallback(boolean status, Callback callback, String commandItemName) {
                            if (status) {
                                SC.say("导出成功");
                            }
                        }
                    });
                }
            }
        };

        BTN_DL1.addClickListener(BTN_DL1_ClickListener);
        BTN_CLOSE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);

        BTN_SAVE1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                UPrompt.alert("提示", "上传中...");
                VoucherUpload.setHiddenItem("ADDINFO", "1");
                VoucherUpload.submit();
                VoucherUpload.setUploadListener(new UploadListener() {
                    @Override
                    public void uploadComplete(Boolean success, String filename, String desc) {
                        if (!success) {
                            UPrompt.clearPrompt();
                            UPrompt.alert("提示", desc);
                            return;
                        }
                        if (filename == null || "".equals(filename.trim())) {
                            UPrompt.clearPrompt();
                            UPrompt.alert("提示", "文件上传出错，请重新上传");
                            return;
                        }
                        if (success) {
                            UPrompt.clearPrompt();
                            UPrompt.alert("提示", "文件上传成功");
                            return;
                        }
                    }
                });
            }
        };
        BTN_SAVE1.addClickListener(BTN_SAVE1_ClickListener);
        BTN_CLOSE4_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                detailSw5.hide();
            }
        };
        BTN_CLOSE4.addClickListener(BTN_CLOSE4_ClickListener);
    }

    //解决下载文件名无法重命名问题
    public native void downloadFile(String url, String fileName)/*-{
        var a = document.createElement("a");
        // 设置文件名称
        a.download = fileName;
        a.href = url;
        document.body.appendChild(a);
        // 响应事件
        a.click();
        document.body.removeChild(a);
    }-*/
    ;

    //导出Excel
    public void exportExcel() {
  /*      HashMap<String,String> extra=new HashMap<String,String>();
        extra.put("ORI_DATA_ID", resultDs.getCurrentValue("ORI_DATA_ID"));
        BTN_EXPORT_EXCEL_Cmd.setExtraInfo(extra);*/
        BTN_EXPORT_EXCEL_Cmd.setCommandDataScope(DataScope.SELECT);
        BTN_EXPORT_EXCEL_Cmd.setCommandService("evatCommonService", "downloadDigitalVocExcel");
        BTN_EXPORT_EXCEL.setDisabled(true);
        BTN_EXPORT_EXCEL_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                BTN_EXPORT_EXCEL.setDisabled(false);
                if (!status || callback.getErrorMessage() != null) {
                    if (callback.getErrorMessage() != null)
                        UPrompt.alert("提示", "导出失败，错误信息：" + callback.getErrorMessage());
                    else
                        UPrompt.alert("提示", "导出失败");
                } else {
                    if (status) {
                        String filename = callback.getSuccessMessage();
                        String rename = callback.getExtraData().toString();
                        StringBuffer url = new StringBuffer();
                        url.append(GWT.getModuleBaseURL());
                        url.append("../do/download");
                        url.append(filename);
                        downloadFile(url.toString(), rename);
                        System.out.println("文件下载URL：" + url);
                        SC.say("导出成功");
                    } else {
                        UPrompt.alert("提示", "导出失败");
                    }

                }
            }
        });
    }


    public HashMap<String, String> getQueryDsData() {
        HashMap<String, String> queryDsData = new HashMap<String, String>();
        queryDsData.put("VOC_FLAG", queryDs.getCurrentValue("VOC_FLAG"));
        queryDsData.put("VOC_TYPE", queryDs.getCurrentValue("VOC_TYPE"));
        queryDsData.put("MADE_TYPE", queryDs.getCurrentValue("MADE_TYPE"));
        queryDsData.put("VOC_STAT", queryDs.getCurrentValue("VOC_STAT"));
        queryDsData.put("START_VOC_DATE", queryDs.getCurrentValue("START_VOC_DATE"));
        queryDsData.put("END_VOC_DATE", queryDs.getCurrentValue("END_VOC_DATE"));
        queryDsData.put("START_VOC_NO", queryDs.getCurrentValue("START_VOC_NO"));
        queryDsData.put("END_VOC_NO", queryDs.getCurrentValue("END_VOC_NO"));
        queryDsData.put("CUST_NO", queryDs.getCurrentValue("CUST_NO"));
        queryDsData.put("MEDIA_TYPE", queryDs.getCurrentValue("MEDIA_TYPE"));
        return queryDsData;
    }

    public static String columnSplice(DataRecord[] selectRecords, String columnName, String separator) {
        String result = "";
        for (DataRecord data : selectRecords) {
            result += data.getValue(columnName) + separator;
        }

        if (result.length() > 0) {
            result = result.substring(0, result.length() - separator.length());
        }
        return result;
    }
}
