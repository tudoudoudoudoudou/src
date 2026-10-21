package com.gingkoo.vat.client;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.gingkoo.gui.core.client.context.ContextHelper;
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
import com.gingkoo.gui.ui.component.client.basic.UButton;
import com.gingkoo.gui.ui.component.client.basic.UPrompt;
import com.gingkoo.gui.ui.component.client.basic.UWindow;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickEvent;
import com.gingkoo.gui.ui.component.client.grid.events.RecordClickListener;
import com.gingkoo.gui.ui.component.client.grid.events.RecordDoubleClickListener;
import com.gingkoo.gui.ui.component.client.form.fields.events.DoubleClickEvent;
import com.gingkoo.gui.ui.component.client.form.fields.events.DoubleClickListener;
import com.gingkoo.gui.ui.component.client.form.validator.CustValidator;
import com.gingkoo.gui.ui.component.client.upload.UploadListener;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.gingkoo.gui.data.client.command.item.DataScope;
import com.gingkoo.rpt.common.client.BizFunClient;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.gingkoo.gui.ui.component.client.basic.UPrompt.PromptCallback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.smartgwt.client.types.ContentsType;
import com.smartgwt.client.util.DateUtil;
import com.smartgwt.client.util.SC;

public class OVocQueryCust extends OVocQuery {

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
    //按钮重置的点击事件;
    protected ClickListener BTN_RESET_ClickListener;
    //按钮查看明细的点击事件;
    protected ClickListener BTN_DTL_ClickListener;
    //按钮导出的点击事件;
    protected ClickListener BTN_DL_ClickListener;
    //按钮关闭的点击事件;
    protected ClickListener BTN_CLOSE_ClickListener;
    //按钮业务明细点击事件---------AddedByCiel151216
    protected ClickListener BTN_DTL1_ClickListener;
    //业务明细画面查询点击事件---------AddedByCiel151216
    protected ClickListener BTN_INQ1_ClickListener;
    //业务明细画面返回点击事件---------AddedByCiel151216
    protected ClickListener BTN_CLOSE1_ClickListener;
    //查看发票影像的点击事件
    protected ClickListener BTN_IMAGE_ClickListener;
    //按钮上传的点击事件;
    protected ClickListener BTN_UPLOAD_ClickListener;
    //按钮提交的点击事件;
    protected ClickListener BTN_SAVE1_ClickListener;
    //按钮返回的点击事件;
    protected ClickListener BTN_CLOSE4_ClickListener;
    //按钮下载文件点击事件
    protected ClickListener BTN_DOWNLOAD_ClickListener;


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
            BTN_DTL_Cmd.setQuerySqlid("OVocQuery_002");
            //BTN_MOD.setDisabled(true);
            BTN_DTL_Cmd.execute(new CommandCallback() {
                @Override
                public void onCallback(boolean status, Callback callback, String commandItemName) {
                    //BTN_MOD.setDisabled(false);
                    if (!status) {
                        UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                    } else {
                        if (callback.getCallbackCount() > 0) {
                            if ("3".equals(resultDs.getCurrentValue("VOC_STAT"))) {
                                BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                BTN_DTL2_Cmd.setQuerySqlid("OVocQuery_003_2");
                            } else {
                                BTN_DTL2_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                                BTN_DTL2_Cmd.setQuerySqlid("OVocQuery_003");
                            }
                            BTN_DTL2_Cmd.execute(new CommandCallback() {

                                @Override
                                public void onCallback(boolean status,
                                                       Callback callback, String commandItemName) {
                                    // TODO Auto-generated method stub

                                }
                            });
                            detailSw1.setTitle("发票信息-" + stype1);
                            detailSw1.show();
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
            BTN_INQ_Cmd.setQuerySqlid("OVocQuery_001");
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

    public void list() {
        BTN_DTL3_Cmd.setCommandService("commonQueryService", "commonQueryPage");
        String vocStatus = resultDs.getCurrentValue("VOC_STAT");
        if ("3".equals(vocStatus) || "9".equals(vocStatus)) {
            queryDs1.setCurrentValue("PDATA_ID", resultDs1.getCurrentValue("PDATA_ID"));
            BTN_DTL3_Cmd.setQuerySqlid("OVocRevice_004_2");
        } else {
            queryDs1.setCurrentValue("PDATA_ID", resultDs1.getCurrentValue("DATA_ID"));
            BTN_DTL3_Cmd.setQuerySqlid("OVocRevice_004");
        }
        BTN_DTL3_Cmd.execute(new CommandCallback() {
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

    public void cyclePopup2() {
        BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
        //对于通用查询需要设置SQLID的值
        BTN_INQ_Cmd.setQuerySqlid("OVocQuery_001");
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

    @Override
    protected boolean beforeInitControls() {
        return super.beforeInitControls();
    }

    @Override
    protected void beforeRender() {
        BTN_IMAGE.hide();
        frmCXXX_CUST_NO.setReferenceCmd(refCmd, false);
        //
        //frmYHHP_CMB_SIGN_BRNO.setReferenceCmd(refCmd);
        HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
        //mapqueryDs.put("MADE_TYPE", "Value1");
        //mapqueryDs.put("Field2", "Value2");
        queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX.editRecord(gridRecord);
            }
        });
        //条件数据集初始化-------------AddedByCiel151216
        HashMap<String, Object> mapqueryDs1 = new HashMap<String, Object>();
        queryDs1.addDataRecord(new DataRecord(mapqueryDs1), new DataAction() {
            @Override
            public void doAction(DataRecord record) {
                System.out.println("insert empty record: " + record.getDataMap());
                ListGridRecord gridRecord = record.getViewRecord();
                frmCXXX2.editRecord(gridRecord);
            }
        });
        TXCODE_INQ_Cmd.setCommandService("commonQueryService", "commonQuery");
        TXCODE_INQ_Cmd.setQuerySqlid("txCodeInq");
        TXCODE_INQ_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                System.out.println("=============刷新下拉框数据===============");
                resultTb1.getUField("TX_CODE").bindDropdownDataset(txcodeDs, "tx_code", "tx_name");
            }
        });
    }

    @Override
    protected void bindEvent() {
        VoucherUpload.setServletPath(GWT.getModuleBaseURL() + "../actions/voc-upload/uploadZip");
        detailSw1.addCloseClickHandler(new CloseClickHandler() {
            @Override
            public void onCloseClick(CloseClickEvent event) {
                cyclePopup1();
            }
        });
        BTN_INQ_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                //主查询特殊处理---------RevisedByCiel151216
                cyclePopup2();
            }
        };
        BTN_INQ.addClickListener(BTN_INQ_ClickListener);
        BTN_RESET_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                beforeRender();
            }
        };
        BTN_DL_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                BTN_DL_Cmd.setQuerySqlid("OVocQuery_005");
                BTN_DL_Cmd.setCommandService("commonQueryService",
                        "commonQueryPage");
                BTN_DL_Cmd
                        .setHead("TEMPLATE", "EXPORT_TEMPLATE_OVocQuery.xlsx");
                BTN_DL_Cmd.setHead("NEWFILENAME",
                        "EXPORT_TEMPLATE_OVocQuery.xlsx");
                // DateUtils.parseDate(ContextHelper.getContext().getValue("WORK_DATE"));
                DateTimeFormat df = DateTimeFormat.getFormat("yyyyMMddhhmmss");
                BTN_DL_Cmd.setHead("SELECT_DATE", df.format(new Date()));
                BTN_DL_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback,
                                           String commandItemName) {
                        if (status) {
                            SC.say("导出成功");
                        }
                    }
                });
            }
        };
        BTN_DL.addClickListener(BTN_DL_ClickListener);
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
                if (resultDs.getSelectedRecords().length > 1) {
                    UPrompt.alert("提示", "请选择一条记录查看明细");
                    return;
                }
                stack1 = resultDs.getSelectedRecords();
                cyclePopup1();
                frmQTXX_DATA_REJ_DESC.hide();
            }
        };
        BTN_DTL.addClickListener(BTN_DTL_ClickListener);

        BTN_IMAGE_ClickListener = new ClickListener() {

            @Override
            public void onClick(ClickEvent event) {
                if (resultDs.getCurrentRecord() == null && resultDs.getSelectedRecords().length == 0) {
                    UPrompt.alert("提示", "请选择需要操作的记录");
                    return;
                }
                BTN_DTL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                BTN_DTL_Cmd.setQuerySqlid("OVocQuery_002");
                BTN_IMAGE.setDisabled(true);
                BTN_DTL_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_IMAGE.setDisabled(false);
                        if (!status) {
                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            if ("0".equals(detailDs.getCurrentValue("UPLOAD_STATUS"))) {
                                String imgpath = "OUTPUT/" + DateUtil.format(detailDs.getCurrentValueAsDate("VOC_DATE"), "yyyyMMdd") + "/" + detailDs.getCurrentValue("VOC_CODE") + "_" + detailDs.getCurrentValue("VOC_NO") + ".jpg";
                                if ((imgpath != null) && (!imgpath.equals(""))) {
                                    final UWindow promptWindow = new UWindow();
                                    promptWindow.setTitle(BTN_IMAGE.getTitle());
                                    promptWindow.setIsModal(true);
                                    promptWindow.setAutoSize(false);
                                    promptWindow.setWidth(ContextHelper.getContext().getIntValue("VOUCHERVIEW.SIZE.WIDTH"));
                                    promptWindow.setHeight(ContextHelper.getContext().getIntValue("VOUCHERVIEW.SIZE.HEIGHT"));
                                    promptWindow.centerInPage();
                                    //waitingWindow.setScrollbarSize(0);
                                    promptWindow.setCanDrag(false);
                                    promptWindow.setCanDragResize(false);
                                    promptWindow.setCanDragReposition(false);
                                    promptWindow.setShowMaximizeButton(false);
                                    promptWindow.setShowMinimizeButton(false);
                                    final HTMLPane pane = new HTMLPane();
                                    pane.setShowEdges(false);
                                    //pane.setContentsURL(GWT.getModuleBaseURL()+"../webOfficeEdit.jsp?fileType=A");
                                    pane.setContents("<iframe id='" + "voucherPreview" + "' width="
                                            + ContextHelper.getContext().getIntValue("VOUCHERVIEW.SIZE.WIDTH") + " height="
                                            + ContextHelper.getContext().getIntValue("VOUCHERVIEW.SIZE.HEIGHT")
                                            + " src='" + GWT.getModuleBaseURL() + "../actions/voc-image/view?voc_path=" + imgpath + "' />");
                                    pane.setContentsType(ContentsType.PAGE);
                                    VLayout vlayout = new VLayout(2);
                                    HLayout hlayout = new HLayout(2);
                                    UButton btn1 = new UButton("放大");
                                    hlayout.addMember(btn1);
                                    UButton btn2 = new UButton("缩小");
                                    hlayout.addMember(btn2);
                                    UButton btn3 = new UButton("退出");
                                    hlayout.addMember(btn3);
                                    btn1.addClickListener(new ClickListener() {

                                        @Override
                                        public void onClick(ClickEvent event) {
                                            // TODO Auto-generated method stub
                                            zoomIn();
                                        }

                                    });
                                    btn2.addClickListener(new ClickListener() {

                                        @Override
                                        public void onClick(ClickEvent event) {
                                            // TODO Auto-generated method stub
                                            zoomOut();
                                        }
                                    });
                                    btn3.addClickListener(new ClickListener() {

                                        @Override
                                        public void onClick(ClickEvent event) {
                                            // TODO Auto-generated method stub
                                            promptWindow.close();
                                            pane.destroy();
                                        }
                                    });
                                    promptWindow.addCloseClickHandler(new com.smartgwt.client.widgets.events.CloseClickHandler() {

                                        @Override
                                        public void onCloseClick(CloseClickEvent event) {
                                            // TODO Auto-generated method stub
                                            pane.destroy();
                                            promptWindow.close();
                                        }

                                    });
                                    hlayout.setHeight(25);
                                    vlayout.addMember(hlayout);
                                    vlayout.addMember(pane);
                                    promptWindow.addItem(vlayout);
                                    ;
                                    //promptWindow.addItem(pane);
                                    promptWindow.show();
                                } else {
                                    UPrompt.alert("提示", "系统中不存在此发票对应的票据影像");
                                }
                            } else {
                                UPrompt.alert("提示", "该发票无影像可查看！");
                            }
                        }
                    }
                });
            }
        };
        BTN_IMAGE.addClickListener(BTN_IMAGE_ClickListener);

        //AddedByCiel151216
        BTN_DTL1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                if (resultDs1.getCurrentRecord() == null) {
                    UPrompt.alert("提示", "请选中一条记录进行查看！");
                    return;
                }
                if (resultDs1.getSelectedRecords().length > 1) {
                    UPrompt.alert("提示", "一次只能查看一条记录！");
                    return;
                }

                String isHappen = detailDs.getCurrentValue("IS_HAPPEN");
                String reviseStatus = detailDs.getCurrentValue("REVISE_STATUS");

                if ("N".equals(isHappen) && "0".equals(reviseStatus)) {
                    UPrompt.alert("提示", "交易未发生且未补充，没有业务明细");
                    return;
                }

                list();
                detailSw2.setTitle("业务明细");
                detailSw2.show();
            }
        };
        BTN_DTL1.addClickListener(BTN_DTL1_ClickListener);

        BTN_UPLOAD_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                mod1 = 0;
                BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
                BTN_INQ_Cmd.setQuerySqlid("OVocQuery_001");
                BTN_UPLOAD.setDisabled(true);
                BTN_INQ_Cmd.execute(new CommandCallback() {
                    @Override
                    public void onCallback(boolean status, Callback callback, String commandItemName) {
                        BTN_UPLOAD.setDisabled(false);
                        status = true;
                        if (!status) {
                            UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
                        } else {
                            //if (callback.getCallbackCount() == 0) {
                            OVocQueryCust.this.detailSw5.show();
                            return;
                        }
                    }
                });
            }
        };
        BTN_UPLOAD.addClickListener(BTN_UPLOAD_ClickListener);

        BTN_INQ1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                list();
            }
        };
        BTN_INQ1.addClickListener(BTN_INQ1_ClickListener);

        BTN_CLOSE_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                cyclePopup1();
            }
        };
        BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);

        BTN_CLOSE1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                detailSw2.hide();
            }
        };
        BTN_CLOSE1.addClickListener(BTN_CLOSE1_ClickListener);
        BTN_SAVE1_ClickListener = new ClickListener() {
            @Override
            public void onClick(ClickEvent event) {
                UPrompt.alert("提示", "上传中...");
                VoucherUpload.setHiddenItem("ADDINFO", "1");
                VoucherUpload.submit();
                //一个文件上传到java服务端完毕后触发此事件
                VoucherUpload.setUploadListener(new UploadListener() {
                    @Override
                    public void uploadComplete(Boolean status, String filename, String desc) {
                        System.out.println(">>>>>>>>>>>>>>>filename:" + filename);
                        if (status) {
                            UPrompt.clearPrompt();
                            UPrompt.alert("提示", "文件处理成功");
                            detailSw5.hide();
                        } else {
                            UPrompt.clearPrompt();
                            UPrompt.alert("提示", desc);
                        }
                    }
                });
            }
        };
        BTN_SAVE1.addClickListener(BTN_SAVE1_ClickListener);
        BTN_CLOSE4_ClickListener = new

                ClickListener() {
                    @Override
                    public void onClick(ClickEvent event) {
                        detailSw5.hide();
                    }
                }

        ;
        BTN_CLOSE4.addClickListener(BTN_CLOSE4_ClickListener);

        BTN_DOWNLOAD_ClickListener = new

                ClickListener() {
                    @Override
                    public void onClick(ClickEvent event) {
                        BTN_DOWNLOAD_Cmd.setCommandDataScope(DataScope.SELECT);
                        if (resultDs.getSelectedRecords().length == 0) {
                            UPrompt.alert("提示", "请选择需要下载的发票信息");
                        } else {
                            if (!"2".equals(resultDs.getCurrentValue("VOC_STAT"))) {
                                UPrompt.alert("提示", "只能下载已打印发票的归档文件！");
                                return;
                            } else {
                                if ("N".equals(resultDs.getCurrentValue("FILE_FLAG"))) {
                                    UPrompt.alert("提示", "[" + resultDs.getCurrentValue("VOC_NO") + "]" + "该发票未上传归档文件！");
                                    return;
                                } else {
                                    downloadService();
                                }
                            }
                        }

                    }
                }

        ;
        BTN_DOWNLOAD.addClickListener(BTN_DOWNLOAD_ClickListener);
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

    //下载归档文件
    public void downloadService() {
        BTN_DOWNLOAD_Cmd.setCommandDataScope(DataScope.SELECT);
        BTN_DOWNLOAD_Cmd.setCommandService("evatCommonService", "downFile");
        BTN_DOWNLOAD.setDisabled(true);
        BTN_DOWNLOAD_Cmd.execute(new CommandCallback() {
            @Override
            public void onCallback(boolean status, Callback callback, String commandItemName) {
                BTN_DOWNLOAD.setDisabled(false);
                if (!status || callback.getErrorMessage() != null) {
                    if (callback.getErrorMessage() != null)
                        UPrompt.alert("提示", "下载失败，错误信息：" + callback.getErrorMessage());
                    else
                        UPrompt.alert("提示", "下载失败");
                } else {
                    if (status) {
                        String filename = callback.getSuccessMessage();
                        String rename = callback.getExtraData().toString();
                        StringBuffer url = new StringBuffer();
                        url.append(GWT.getModuleBaseURL());
                        url.append("../do/download");
                        url.append(filename);
                        downloadFile(url.toString(), rename);
                        System.out.println(url.toString());
                        SC.say("下载成功");
                    } else {
                        UPrompt.alert("提示", "下载失败");
                    }

                }
            }
        });
    }

    public native void zoomIn() /*-{
        $wnd.document.getElementById("voucherPreview").contentWindow.zoomIn();
    }-*/;

    public native void zoomOut() /*-{
        $wnd.document.getElementById("voucherPreview").contentWindow.zoomOut();
    }-*/;


}
//resultDs.setValue("DATA_ID", "value1");
