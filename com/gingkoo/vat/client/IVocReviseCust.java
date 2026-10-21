package com.gingkoo.vat.client;



import java.math.BigDecimal;
import java.util.Date;
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
import com.gingkoo.gui.ui.component.client.upload.UploadListener;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.smartgwt.client.util.DateUtil;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class IVocReviseCust extends IVocRevise {

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
	// 按钮查看明细的点击事件;
	protected ClickListener BTN_DTL_ClickListener;
	// 按钮导出的点击事件;
	protected ClickListener BTN_DL_ClickListener;
	// 按钮关联交易的点击事件;
	protected ClickListener BTN_RELAT_ClickListener;
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
	// 按钮提交的点击事件;
	protected ClickListener BTN_SAVE2_ClickListener;
	// 按钮提交的点击事件;
	protected ClickListener BTN_SAVE1_ClickListener;
	// 按钮返回的点击事件;
	protected ClickListener BTN_CLOSE1_ClickListener;
	// 按钮查询的点击事件;
	protected ClickListener BTN_INQ1_ClickListener;
	// 按钮返回的点击事件;
	protected ClickListener BTN_CLOSE2_ClickListener;
	//按钮提交审核的点击事件
	protected ClickListener BTN_FINISH_ClickListener;
	
	  //按钮上传的点击事件
    protected ClickListener BTN_UPLOAD_ClickListener;
    
    //valuechangedListener事件
    protected ValueChangedListener DOC_TYPE_ValueChangedListener;
	//合计金额
    protected ValueChangedListener AMOUNT_ValueChangedListener;
    //合计税额
    protected ValueChangedListener TAX_AMT_ValueChangedListener;
    //税率的valueChange事件
    protected ValueChangedListener TAX_RATE_ValueChangedListener;
    //收入的ValueChanged事件
 	protected ValueChangedListener INS_AMT_ValueChangedListener;
    //认证日期的valueChanged事件,确认抵扣默认为认证日期
    protected ValueChangedListener IDENTY_DATE_ValueChangedListener;
    //费用用途的ValueChanged事件
    protected ValueChangedListener USAGE_ValueChangedListener;
    //交易编码的ValueChanged事件
 	protected ValueChangedListener TX_CODE_ValueChangedListener;
    
	protected String data_id = "";
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
			BTN_DTL_Cmd.setCommandService("commonQueryService",
					"commonQueryPage");
			BTN_DTL_Cmd.setQuerySqlid("IVocRevise_002");
			// BTN_MOD.setDisabled(true);
			BTN_DTL_Cmd.execute(new CommandCallback() {
				@Override
				public void onCallback(boolean status, Callback callback,
						String commandItemName) {
					// BTN_MOD.setDisabled(false);
					if (!status) {
						UPrompt.alert("提示",
								"查询失败，错误信息：" + callback.getErrorMessage());
					} else {
						if (callback.getCallbackCount() > 0) {
							Map<String,String> extraInfo = new HashMap<String,String>();
							extraInfo.put("DATA_ID", resultDs.getCurrentValue("DATA_ID"));
							BTN_INQ1_Cmd.setExtraInfo(extraInfo);
							BTN_INQ1_Cmd.setCommandService("commonQueryService", "commonQueryPage");
							// 对于通用查询需要设置SQLID的值
							BTN_INQ1_Cmd.setQuerySqlid("IVocRevise_006");
							BTN_INQ1_Cmd.execute(new CommandCallback() {
								@Override
								public void onCallback(boolean status, Callback callback, String commandItemName) {
									//如果税率只有两位有效数字要手动添零，否则数据字典绑定不上------RevisedByCiel
									DataRecord[] dtlRecords = resultDs1.getDataRecords();
									for (DataRecord dr : dtlRecords) {
										if(dtlRecords.length > 0){	
										resultDs1.setCurrentRecord(dr);
										String taxRate = dr.getValue("TAX_RATE");
										if(!"".equals(taxRate) && taxRate != null){
											if (taxRate.split("\\.")[1].length()==2){
												String s = taxRate+"0";
												resultDs1.setCurrentValue("TAX_RATE",s);
												resultDs1.sync();
											}else{
												resultDs1.setCurrentValue("TAX_RATE",taxRate);
												resultDs1.sync();
											}
										 }
										} 
									}
									String DocTV=detailDs.getCurrentValue("DOC_TYPE");
									if("4".equals(DocTV)){
										frmXFXX_SALE_NAME.setRequired(true);
										frmFPXX_BUY_TAX_NO.setRequired(true);//购方
										frmXFXX_SALE_TAX_NO.setRequired(true);//销方
										frmQTFPXX_VOC_NO.setRequired(true);
										frmQTFPXX_VOC_CODE.setRequired(true);
										frmQTFPXX_VOC_NO.show();
										frmQTFPXX_VOC_CODE.show();
										frmQTFPXX_AMOUNT.setRequired(true);
										frmQTFPXX_TAX_AMT.setRequired(true);
										frmQTFPXX_FORM_CODING.hide();
										frmQTFPXX.setReadOnly("VOC_FLAG",true);
										frmQTFPXX_VOC_FLAG.setRequired(false);
										frmQTFPXX.setReadOnly("IDENTY_STATUS",true);
									}else if("0".equals(DocTV) || "2".equals(DocTV)){
										frmXFXX_SALE_NAME.setRequired(false);
										frmFPXX_BUY_TAX_NO.setRequired(true);//购方
										frmXFXX_SALE_TAX_NO.setRequired(true);//销方
										frmQTFPXX_FORM_CODING.setRequired(true);
										frmQTFPXX_FORM_CODING.show();
										frmQTFPXX_VOC_NO.hide();
										frmQTFPXX_VOC_CODE.hide();
										frmQTFPXX_AMOUNT.setRequired(true);
										frmQTFPXX_TAX_AMT.setRequired(true);
										frmQTFPXX_VOC_FLAG.setRequired(false);
										frmQTFPXX.setReadOnly("VOC_FLAG",false);
										frmQTFPXX.setReadOnly("IDENTY_STATUS",true);
									}else if("1".equals(DocTV) || "3".equals(DocTV)){
										frmXFXX_SALE_NAME.setRequired(false);
										frmFPXX_BUY_TAX_NO.setRequired(true);//购方
										frmXFXX_SALE_TAX_NO.setRequired(true);//销方
										frmQTFPXX_VOC_NO.setRequired(false);
										frmQTFPXX_VOC_CODE.setRequired(false);
										frmQTFPXX_VOC_NO.show();
										frmQTFPXX_VOC_CODE.show();
										frmQTFPXX_AMOUNT.setRequired(true);
										frmQTFPXX_TAX_AMT.setRequired(true);
										frmQTFPXX_FORM_CODING.hide();
										frmQTFPXX_FORM_CODING.setRequired(false);
										frmQTFPXX_VOC_FLAG.setRequired(false);
										frmQTFPXX.setReadOnly("VOC_FLAG",false);
										frmQTFPXX.setReadOnly("IDENTY_STATUS",true);
									}
									detailSw1.setTitle("进项发票维护-" + stype1);
									detailSw1.show();
									frmYWQT1.show();
									if(mod1==1){
										btnAddMod();
									}else if(mod1==2||mod1==6){
										btnDtl();
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
			BTN_INQ_Cmd.setCommandService("commonQueryService",
					"commonQueryPage");
			// 对于通用查询需要设置SQLID的值
			BTN_INQ_Cmd.setQuerySqlid("IVocRevise_001");
			BTN_INQ_Cmd.execute(new CommandCallback() {
				@Override
				public void onCallback(boolean status, Callback callback,
						String commandItemName) {
					if (!status) {
						UPrompt.alert("提示",
								"查询失败，错误信息：" + callback.getErrorMessage());
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
			queryDs.setCurrentRecord(stack2[0]);
			BTN_INQ_Cmd.setCommandService("commonQueryService",
					"commonQueryPage");
			BTN_INQ_Cmd.setQuerySqlid("IVocRevise_001");
			// BTN_MOD.setDisabled(true);
			BTN_INQ_Cmd.execute(new CommandCallback() {
				@Override
				public void onCallback(boolean status, Callback callback,
						String commandItemName) {
					// BTN_MOD.setDisabled(false);
					if (!status) {
						UPrompt.alert("提示",
								"查询失败，错误信息：" + callback.getErrorMessage());
					} else {
						if (callback.getCallbackCount() > 0) {
							detailSw1.setTitle("进项发票维护-" + stype2);
							detailSw1.show();
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
			detailSw1.hide();
			// 刷新上一级界面列表
		}
	}

	@Override
	protected boolean beforeInitControls() {
		return super.beforeInitControls();
	}

	@Override
	protected void beforeRender() {
		//
		frmXFXX_VENDOR_NO.setReferenceCmd(refCmd);
		HashMap<String, Object> mapqueryDs = new HashMap<String, Object>();
		// mapqueryDs.put("STAART_DATA_DATE", "Value1");
		// mapqueryDs.put("Field2", "Value2");
		queryDs.addDataRecord(new DataRecord(mapqueryDs), new DataAction() {
			@Override
			public void doAction(DataRecord record) {
				System.out.println("insert empty record: "
						+ record.getDataMap());
				ListGridRecord gridRecord = record.getViewRecord();
				frmCXXX.editRecord(gridRecord);
			}
		});
		//查询机构名称--------AddedByCiel160214
		ORG_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
		ORG_INQ_Cmd.setQuerySqlid("Orginq");
		ORG_INQ_Cmd.execute(new CommandCallback() {
				@Override
			public void onCallback(boolean status, Callback callback,String commandItemName) {
				resultTb.getUField("ORG_ID").bindDropdownDataset(orgDs, "ORG_ID", "ORG_NAME");
			}
		});
		
		//查询不动产编号--------add by gyk 20160708
		frmMXXX_ESTATE_NO.bindDropdownDataset(IEasteDs);
		frmMXXX_ESTATE_NO.setValueField("ESTATE_NO");
		frmMXXX_ESTATE_NO.setDisplayField("ESTATE_NAME");
		ESTATE_NO_Cmd.setCommandService("commonQueryService", "commonQuery");
		ESTATE_NO_Cmd.setQuerySqlid("EstateNoInq");
		ESTATE_NO_Cmd.execute(new CommandCallback() {
				@Override
			public void onCallback(boolean status, Callback callback,String commandItemName) {
					frmMXXX_ESTATE_NO.flushData();
					resultTb1.getUField("ESTATE_NO").bindDropdownDataset(IEasteDs, "ESTATE_NO", "ESTATE_NAME");
				}
		});
		
		//add by yyh 20160712  发票明细交易编码初始化
		frmMXXX_TX_CODE.bindDropdownDataset(txcodeDs);
		frmMXXX_TX_CODE.setValueField("tx_code");
		frmMXXX_TX_CODE.setDisplayField("tx_name");
		HashMap<String,String> extra = new HashMap<String,String>();
		extra.put("IO_FLAG", "I");
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
		//end by yyh 20160712
	}

	@Override
	protected void bindEvent() {
		
		//设置调用的Servlet的URL路径---------------151119Ciel
    	VoucherUpload.setServletPath(GWT.getModuleBaseURL() + "../actions/voc-image/upload4page");
    	//定义发票影像上传按钮监听事件---------------151119Ciel
    	BTN_UPLOAD_ClickListener =new ClickListener(){
    		 @Override
             public void onClick(ClickEvent event) {
    			detailSw1.hide();
 		        //刷新上一级界面列表
 		        BTN_DTL3_Cmd.setCommandService("commonQueryService", "commonQueryPage");
	            //对于通用查询需要设置SQLID的值
	            BTN_DTL3_Cmd.setQuerySqlid("IVocRevise_002");
	            BTN_DTL3_Cmd.execute(new CommandCallback() {
	                @Override
	                public void onCallback(boolean status, Callback callback,String commandItemName) {
	                  if (!status) {
	                    UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
	                  } else {
	                	  String vocCode=detailDs1.getCurrentValue("VOC_CODE");
	                	  String vocNo=detailDs1.getCurrentValue("VOC_NO");
	                	  if(vocCode!=null && !"".equals(vocCode) && vocNo!=null && !"".equals(vocNo)){
	                		  detailSw2.show();
	                	  }else{
	                		  UPrompt.alert("提示", "缺失发票代码或号码，无法进行发票影像文件上传！");
	                	  }
	                    }
	                  }
	            });
    		 }
    	};
    	BTN_UPLOAD.addClickListener(BTN_UPLOAD_ClickListener);
    	BTN_SAVE1_ClickListener =new ClickListener(){
   		 @Override
            public void onClick(ClickEvent event) {
   			 String s = "KPRQ`"+DateUtil.format(resultDs.getCurrentValueAsDate("VOC_DATE"),"yyyyMMdd")+"|"+
   					 "FPDM`"+resultDs.getCurrentValue("VOC_CODE")+"|"+
   					 "FPHM`"+resultDs.getCurrentValue("VOC_NO")+"|"+
   			 		 "FPIO`I";
   			 VoucherUpload.setHiddenItem("ADDINFO", s);
   		     VoucherUpload.submit();
   		 }
            		
   	};
   	BTN_SAVE1.addClickListener(BTN_SAVE1_ClickListener);
    	//一个文件上传到java服务端完毕后触发此事件---------------151119Ciel
	    VoucherUpload.setUploadListener(new UploadListener() {
	           @Override
	            public void uploadComplete(Boolean success, String filename,String desc) {
	        	   detailSw2.hide();
	               if (!success) {
	                   UPrompt.alert("提示", "文件上传出错，请重新上传");
	                   return;
	               }
	        
	               if (filename == null || "".equals(filename.trim())) {
	                   UPrompt.alert("提示", "文件上传出错，请重新上传");
	                    return;
	               }
	               System.out.println(">>>>>>>>>>>>>>>filename:" + filename);
	               UPrompt.alert("提示", "文件上传成功"); 
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
				if (queryDs.getCurrentValue("VOC_STATUS") != null && !queryDs.getCurrentValue("VOC_STATUS").equals("") && queryDs.getCurrentValue("VOC_STATUS").equals("1")) {
					UPrompt.alert("提示", "退回中的发票请至发票退回审核处理！");
				    return;
				}
			
				BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
				// 对于通用查询需要设置SQLID的值
				BTN_INQ_Cmd.setQuerySqlid("IVocRevise_001");
				BTN_INQ.setDisabled(true);
				BTN_INQ_Cmd.execute(new CommandCallback() {
					@Override
					public void onCallback(boolean status, Callback callback,
							String commandItemName) {
						BTN_INQ.setDisabled(false);
						if (!status) {
							UPrompt.alert("提示",
									"查询失败，错误信息：" + callback.getErrorMessage());
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
				resultDs1.removeAllData();
				HashMap<String, String> map = new HashMap<String, String>();
				detailDs.addDataRecord(new DataRecord(map), new DataAction() {
				    @Override
				    public void doAction(DataRecord record) {
				        
				        vocEntityCmd.setCommandService("commonQueryService", "commonQueryPage");
						//对于通用查询需要设置SQLID的值
				        vocEntityCmd.setQuerySqlid("vocEntityInfoBySub");
		                vocEntityCmd.execute(new CommandCallback() {
		                    @Override
		                    public void onCallback(boolean status, Callback callback,String commandItemName) {
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
		        									detailDs.setCurrentValue("BUY_ACT_NO", vocEntityDs.getCurrentValue("ACT_NO"));
		        			                    	detailDs.setCurrentValue("BUY_NAME", vocEntityDs.getCurrentValue("ORG_NAME"));
		        			                    	detailDs.setCurrentValue("BUY_TAX_NO", vocEntityDs.getCurrentValue("TAX_NO"));
		        			                    	detailDs.setCurrentValue("BUY_ADDR", vocEntityDs.getCurrentValue("ADDR"));
		        			                    	detailDs.setCurrentValue("BUY_TEL", vocEntityDs.getCurrentValue("TEL"));
		        			                    	detailDs.setCurrentValue("BUY_BANK_NO", vocEntityDs.getCurrentValue("BANK_NAME"));
		        			                    	detailDs.setCurrentValue("TX_ORG_ID", ContextHelper.getContext().getValue("ORG_ID"));
		        			                    	detailDs.setCurrentValue("DOC_SOURCE", "0");
		        			                    	detailDs.sync();
		        									detailSw1.setTitle("发票信息-新增");
		        							        detailSw1.show();
		        							        frmQTFPXX_ESTATE_NO.hide();
		        									frmQTFPXX_ESTATE_NO.setRequired(false);
		        									frmQTFPXX_USAGE.hide();
		        									frmQTFPXX_USAGE.setRequired(false);
		        									frmQTFPXX_TAX_RATE.hide();
		        									frmQTFPXX_TAX_RATE.setRequired(false);
		        							        btnAddMod();
		        							        frmQTFPXX.setReadOnly("IDENTY_STATUS", true);
		        							        BTN_SAVE.show();
		        							        frmYWQT1.hide();
		        							    	BTN_ADD1.show();
		        									BTN_MOD1.show();
		        									BTN_DEL1.show();
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
//				String dataStatus=resultDs.getCurrentValue("DATA_STATUS");
//				if(dataStatus.equals("10")||dataStatus.equals("12")||dataStatus.equals("13")||dataStatus.equals("14")||
//						dataStatus.equals("15")||dataStatus.equals("40")){
//					UPrompt.alert("提示","待审核的数据不允许被修改");
//					return;
//				}
				stack1 = resultDs.getSelectedRecords();
				frmQTFPXX_ESTATE_NO.hide();
				frmQTFPXX_ESTATE_NO.setRequired(false);
				frmQTFPXX_USAGE.hide();
				frmQTFPXX_USAGE.setRequired(false);
				frmQTFPXX_TAX_RATE.hide();
				frmQTFPXX_TAX_RATE.setRequired(false);
				BTN_ADD1.show();
				BTN_MOD1.show();
				BTN_DEL1.show();
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
//				String dataStatus=resultDs.getCurrentValue("DATA_STATUS");
//				if(dataStatus.equals("10")||dataStatus.equals("12")||dataStatus.equals("13")||dataStatus.equals("14")||
//						dataStatus.equals("15")||dataStatus.equals("40")){
//					UPrompt.alert("提示","待审核的数据不允许被删除");
//					return;
//				}
				stack1 = resultDs.getSelectedRecords();
				frmQTFPXX_ESTATE_NO.hide();
				frmQTFPXX_ESTATE_NO.setRequired(false);
				frmQTFPXX_USAGE.hide();
				frmQTFPXX_USAGE.setRequired(false);
				frmQTFPXX_TAX_RATE.hide();
				frmQTFPXX_TAX_RATE.setRequired(false);
				BTN_SAVE.show();
				BTN_ADD1.hide();
				BTN_MOD1.hide();
				BTN_DEL1.hide();
				cyclePopup1();
			}
		};
		BTN_DEL.addClickListener(BTN_DEL_ClickListener);
		BTN_DTL_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				mod1 = 6;
				stype1 = "查看明细";
				if (resultDs.getSelectedRecords().length == 0) {
					UPrompt.alert("提示", "请选择需要操作的记录");
					return;
				}
				stack1 = resultDs.getSelectedRecords();
				frmQTFPXX_ESTATE_NO.hide();
				frmQTFPXX_ESTATE_NO.setRequired(false);
				frmQTFPXX_USAGE.hide();
				frmQTFPXX_USAGE.setRequired(false);
				frmQTFPXX_TAX_RATE.hide();
				frmQTFPXX_TAX_RATE.setRequired(false);
				BTN_SAVE.hide();
				BTN_ADD1.hide();
				BTN_MOD1.hide();
				BTN_DEL1.hide();
				cyclePopup1();
			}
		};
		BTN_DTL.addClickListener(BTN_DTL_ClickListener);
		BTN_DL_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				BTN_DL_Cmd.setQuerySqlid("IVocRevise_003");
				BTN_DL_Cmd.setCommandService("commonQueryService", "commonQueryPage");
				BTN_DL_Cmd.setHead("TEMPLATE", "EXPORT_TEMPLATE_IVocRevise.xlsx");
				BTN_DL_Cmd.setHead("NEWFILENAME", "EXPORT_TEMPLATE_IVocRevise.xlsx");
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
		BTN_SAVE_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				if (!frmFPXX.validate()) {
					UPrompt.alert("提示", "存在未输入的必输项！");
					return;
				}
				if (!frmXFXX.validate()) {
					UPrompt.alert("提示", "存在未输入的必输项！");
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
				DataRecord[] dataRecords = resultDs1.getDataRecords();
				Double amount = Double.valueOf(detailDs.getCurrentValue("AMOUNT").replace(",", ""));
				Double taxAmt = Double.valueOf(detailDs.getCurrentValue("TAX_AMT").replace(",", ""));
				if(dataRecords.length>0){
					Double vocInsAmt = (double) 0;
					Double vocTaxAmt = (double) 0;
					for(int a =0; a<dataRecords.length; a++){
						Double rowInsAmt = Double.valueOf(dataRecords[a].getValue("INS_AMT").replace(",", ""));
						vocInsAmt = vocInsAmt + rowInsAmt;
						Double rowTaxAmt = Double.valueOf(dataRecords[a].getValue("TAX_AMT").replace(",", ""));
						vocTaxAmt = vocTaxAmt + rowTaxAmt;
					}
					BigDecimal   b   =   new   BigDecimal(vocInsAmt);  
					vocInsAmt   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
					b   =   new   BigDecimal(vocTaxAmt);  
					vocTaxAmt   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
					if(amount.compareTo(vocInsAmt) ==-1 || amount.compareTo(vocInsAmt) ==1){
						UPrompt.alert("提示", "明细总金额与发票合计金额不符！");
						return;
					}
					if(taxAmt.compareTo(vocTaxAmt) == -1 || taxAmt.compareTo(vocTaxAmt) == 1){
						UPrompt.alert("提示", "明细总税额与发票合计税额不符！");
						return;
				    }
				}
				
				String cfmDeducDate = detailDs.getCurrentValueAsString("CFM_DEDUC_DATE");
				int iFound = cfmDeducDate.indexOf("-");
				if(iFound>=0){
				String dd = cfmDeducDate.replace("-", "");
				detailDs.setCurrentValue("CFM_DEDUC_DATE",dd);
				}else{
				detailDs.setCurrentValue("CFM_DEDUC_DATE",detailDs.getCurrentValue("CFM_DEDUC_DATE"));
				}
				logtype1 = "new";
				if (mod1 == 0) {
					Map<String,String> extraInfo = new HashMap<String,String>();
					extraInfo.put("CONFIRM_STATUS", "0");
					BTN_SAVE_Cmd.setExtraInfo(extraInfo);
					detailDs.setCurrentValue("VOC_STATUS", "3");//3-已录入
					BTN_SAVE_Cmd.setDBService("commonInsertService", "execute");
					BTN_SAVE_Cmd.setHead("CTLNAME", "BTN_ADD");
					logtype1 = "new";
					stype1 = "新增";
					if(detailDs.getCurrentValue("DOC_TYPE").equals("4")){
						detailDs.setCurrentValue("IDENTY_STATUS","1");
					}else{
						detailDs.setCurrentValue("IDENTY_STATUS","3");
					}
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
				}
				BTN_SAVE.setDisabled(true);
				BTN_SAVE_Cmd.setHead("ADDINFO", "PmVatIVoc");
				BTN_SAVE_Cmd.execute(new CommandCallback() {
					@Override
					public void onCallback(boolean status, Callback callback,String commandItemName) {
						BTN_SAVE.setDisabled(false);
						if (!status || callback.getErrorMessage() != null) {
							if (callback.getErrorMessage() != null)
								UPrompt.alert("提示",stype1 + "失败:"+ callback.getErrorMessage());
							else
								UPrompt.alert("提示", stype1 + "失败！");
						} else {
							if (mod1 == 0) {
								HashMap<String, String> map = new HashMap<String, String>();
								map = (HashMap<String, String>) callback.getCallbackData();
								data_id2 = map.get("DATA_ID");
							} else {
								data_id2 = detailDs.getCurrentValue("DATA_ID");
							}
							Map<String, String> extraInfo = new HashMap<String, String>();
							String vocNo = detailDs.getCurrentValue("VOC_NO");
							String vocCode = detailDs.getCurrentValue("VOC_CODE");
							extraInfo.put("VOC_NO", vocNo);
							extraInfo.put("VOC_CODE", vocCode);
							extraInfo.put("PDATA_ID", data_id2);
							extraInfo.put("VOC_DATA_ID",detailDs.getCurrentValue("DATA_ID"));
							BTN_SAVE2_DTL_Cmd.setCommandDataScope(DataScope.ALL);
							BTN_SAVE2_DTL_Cmd.setExtraInfo(extraInfo);
							BTN_SAVE2_DTL_Cmd.setCommandService("vatCommonService","iVocReviseInsertVocDtl");
							BTN_SAVE2_DTL_Cmd.setHead("CTLNAME", "BTN_ADD1");
							BTN_SAVE2_DTL_Cmd
									.setHead("ADDINFO", "PmVatIVocDtl");
							BTN_SAVE2_DTL_Cmd.execute(new CommandCallback() {
								@Override
								public void onCallback(boolean status,Callback callback,String commandItemName) {
									UPrompt.alert("提示", "操作成功",new PromptCallback() {
												@Override
												public void execute(Boolean value) {
													detailDs.logBiz(logtype1);
													cyclePopup1();
												}
											});
								}

							});

						}
					}
				});
			}
		};
		BTN_SAVE.addClickListener(BTN_SAVE_ClickListener);
		
		BTN_FINISH_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				// FINISH
				if(resultDs.getSelectedRecords().length <=0){
					UPrompt.alert("提示", "请选择需要操作的记录");
					return;
				}
				boolean hasCheckFail = false;
				DataRecord[] selectedRecords = resultDs.getSelectedRecords();
				for(DataRecord dr : selectedRecords){
					if("F".equals(dr.getValue("CHECK_FLAG"))){
						hasCheckFail = true;
					
					}
					if(("F".equals(dr.getValue("CHECK_FLAG")) && "10".equals(dr.getValue("DATA_STATUS"))) ||
							("Y".equals(dr.getValue("CHECK_FLAG")) && "10".equals(dr.getValue("DATA_STATUS")))){
						hasCheckFail = false;
					}
					}
				   if(hasCheckFail){
					 UPrompt.alert("提示", "所选记录中包含校验失败的交易数据，不能提交审核！");
					 return;
				   }
				
				
				//102631
				UPrompt.confirm("业务处理", "请确认是否将所选记录提交审核？", new PromptCallback() {
					@Override
					public void execute(Boolean value) {
						if (value != null && value) {
							BTN_FINISH_Cmd.setCommandDataScope(DataScope.SELECT);
							BTN_FINISH_Cmd.setDBService("vatCommonFinishService", "execute");
							BTN_FINISH_Cmd.setQuerySqlid("IVocRevise_001");
							BTN_FINISH_Cmd.setHead("ADDINFO", "PmVatIVoc");
							BTN_FINISH_Cmd.setHead("APVSTATUS", "0");
							BTN_FINISH_Cmd.setHead("CTLNAME", "BTN_FINISH");
							BTN_FINISH_Cmd.execute(new CommandCallback() {
								@Override
								public void onCallback(boolean status, Callback callback, String commandItemName) {
									if (!status || callback.getErrorMessage() != null) {
										if (callback.getErrorMessage() != null) {
											UPrompt.alert("提示", "操作失败:" + callback.getErrorMessage());
											return;
										} else {
											UPrompt.alert("提示", "操作失败！");
											return;
										}
									} else {
										UPrompt.alert("提示", "操作成功！");
									}
									BTN_INQ_Cmd.setCommandService("commonQueryService", "commonQueryPage");
									// 对于通用查询需要设置SQLID的值
									BTN_INQ_Cmd.setQuerySqlid("IVocRevise_001");
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
							});
						}
					}
				});
			}
		};
		BTN_FINISH.addClickListener(BTN_FINISH_ClickListener);
		
		BTN_CLOSE_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				cyclePopup1();
				detailSw1.hide();
			}
		};
		BTN_CLOSE.addClickListener(BTN_CLOSE_ClickListener);
		//add by yyh add vocDtl 20160712
		BTN_ADD1_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				mod2 = 0;	
				HashMap<String, String> map = new HashMap<String, String>();
				map.put("GOOD_NUM", "1");
				detailDs2.addDataRecord(new DataRecord(map), new DataAction() {
					@Override
					public void doAction(DataRecord record) {
						detailSw3.setTitle("发票信息-新增");
						frmMXXX_ESTATE_NO.hide();
						frmMXXX_ESTATE_NO.setRequired(false);
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
				String usage1 = resultDs1.getCurrentValue("USAGE");
				if("31".equals(usage1)){
					frmMXXX_ESTATE_NO.show();
					frmMXXX_ESTATE_NO.setRequired(true);
				}else{
					frmMXXX_ESTATE_NO.hide();
					frmMXXX_ESTATE_NO.setRequired(false);
				}
				detailSw3.setTitle("发票信息-修改");
				detailDs2.copyCurrentRecord(resultDs1);
				detailSw3.show();
				detailDs2.sync();
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
		BTN_SAVE2_ClickListener = new ClickListener() {
			@Override
			public void onClick(ClickEvent event) {
				if (!frmMXXX.validate()) {
					UPrompt.alert("提示", "存在未输入的必输项！");
					return;
				}
				DataRecord[] dataRecords = resultDs1.getDataRecords();
				if(dataRecords.length >= 8){
					UPrompt.alert("提示", "发票明细不得超过8条！");
					return;
				}
				if (mod2 == 1) {
					resultDs1.removeCurrentRecord();
				}			
				BigDecimal insAmt = new BigDecimal(detailDs2.getCurrentValue("INS_AMT").replaceAll(",", ""));
				BigDecimal taxAmt = new BigDecimal(detailDs2.getCurrentValue("TAX_AMT").replaceAll(",", ""));
				detailDs2.setCurrentValue("AMOUNT", String.valueOf(insAmt.add(taxAmt)));
				//BigDecimal bAmount = new BigDecimal(detailDs2.getCurrentValue("AMOUNT").replaceAll(",", ""));
				//BigDecimal bTaxRate = new BigDecimal(detailDs2.getCurrentValue("TAX_RATE").replaceAll(",", ""));
				//BigDecimal bInsAmt = bAmount.divide((BigDecimal.valueOf(1).add(bTaxRate)),2,BigDecimal.ROUND_HALF_UP);
				//detailDs2.setCurrentValue("INS_AMT", String.valueOf(bInsAmt));
				resultDs1.addDataRecord(detailDs2.getCurrentRecord(), new DataAction() {
					@Override
					public void doAction(DataRecord record) {

						//calcVocAmt();
					}
				});
				detailSw3.hide();
			}
		};
		BTN_SAVE2.addClickListener(BTN_SAVE2_ClickListener);
		BTN_CLOSE2_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
            	detailSw3.hide();
//				cyclePopup1();
            }
        };
        BTN_CLOSE2.addClickListener(BTN_CLOSE2_ClickListener);
		BTN_CLOSE1_ClickListener = new ClickListener(){
            @Override
            public void onClick(ClickEvent event) {
            	detailSw2.hide();
//				cyclePopup1();
            }
        };
        BTN_CLOSE1.addClickListener(BTN_CLOSE1_ClickListener);
        AMOUNT_ValueChangedListener=new ValueChangedListener("AMOUNT") {
			@Override
			public void onValueChange(String fieldName,
					ValueChangeEvent event) {
				    getChangedCcy();
			}
		};
	
		frmQTFPXX_AMOUNT.addValueChangedListener(AMOUNT_ValueChangedListener);
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
		TAX_AMT_ValueChangedListener=new ValueChangedListener("TAX_AMT") {
				@Override
				public void onValueChange(String fieldName,
						ValueChangeEvent event) {
					    getChangedCcy();
				}
			};
		
	   frmQTFPXX_TAX_AMT.addValueChangedListener(TAX_AMT_ValueChangedListener);
        
	   IDENTY_DATE_ValueChangedListener=new ValueChangedListener("IDENTY_DATE") {
			@Override
			public void onValueChange(String fieldName,
					ValueChangeEvent event) {
				String identyDate =(String) event.getNewValue();
				detailDs.setCurrentValue("CFM_DEDUC_DATE",identyDate);
				detailDs.sync();
			}
		};
		frmQTFPXX_IDENTY_DATE.addValueChangedListener(IDENTY_DATE_ValueChangedListener);
		TX_CODE_ValueChangedListener = new ValueChangedListener("TX_CODE") {
			@Override
			public void onValueChange(String fieldName, ValueChangeEvent event) {

				String txcode = event.getNewValue().toString();
				if(txcode==null||"null".equals(txcode)||"".equals(txcode)){
					detailDs2.setCurrentValue("TX_CODE", "");
              	  	detailDs2.setCurrentValue("DTL_NAME", "");
              	  	detailDs2.setCurrentValue("CNT_UNIT", "");
              	  	detailDs2.setCurrentValue("GOOD_TYPE", "");
              	  	detailDs2.setCurrentValue("GOOD_AMT", "");
              	  	detailDs2.setCurrentValue("TAX_RATE", "");
              	  	detailDs2.sync();
              	  	return;
				}
				frmMXXX_TX_CODE.setValue(txcode);
				detailDs2.setCurrentValue("TX_CODE", txcode);
				detailDs2.sync();
				TxNodeCmd.setCommandService("commonQueryService", "commonQueryPage");
				// 对于通用查询需要设置SQLID的值
				TxNodeCmd.setQuerySqlid("SeqTxCode");
				TxNodeCmd.execute(new CommandCallback() {
					@Override
					public void onCallback(boolean status, Callback callback, String commandItemName) {
						if (!status) {
							UPrompt.alert("提示", "查询失败，错误信息：" + callback.getErrorMessage());
						} else {
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
		USAGE_ValueChangedListener = new ValueChangedListener("USAGE") {
			@Override
			public void onValueChange(String fieldName, ValueChangeEvent event) {
				String usage=(String)event.getNewValue();
				if("31".equals(usage)){
					frmMXXX_ESTATE_NO.show();
					frmMXXX_ESTATE_NO.setRequired(true);
				}else{
					frmMXXX_ESTATE_NO.hide();
					frmMXXX_ESTATE_NO.setRequired(false);
				}
			}
		};	
		frmMXXX_USAGE.addValueChangedListener(USAGE_ValueChangedListener);
        DOC_TYPE_ValueChangedListener=new ValueChangedListener("DOC_TYPE"){
        	@Override
			public void onValueChange(String fieldName, ValueChangeEvent event) {
        	String DocTV=detailDs.getCurrentValue("DOC_TYPE");
			if(("4").equals(DocTV)){
				//销货方名称
				frmXFXX_SALE_NAME.setRequired(true);
				//纳税人识别号
				frmFPXX_BUY_TAX_NO.setRequired(true);//购方
				frmXFXX_SALE_TAX_NO.setRequired(true);//销方
				//发票号码
				frmQTFPXX_VOC_NO.setRequired(true);
				//发票代码
				frmQTFPXX_VOC_CODE.setRequired(true);
				//发票号码
				frmQTFPXX_VOC_NO.show();
				//发票代码
				frmQTFPXX_VOC_CODE.show();
				//金额
				frmQTFPXX_AMOUNT.setRequired(true);
				//税额
				frmQTFPXX_TAX_AMT.setRequired(true);
				//表单编码
				frmQTFPXX_FORM_CODING.hide();
				//发票类型
				detailDs.setCurrentValue("VOC_FLAG","0");
				detailDs.setCurrentValue("IDENTY_STATUS","1");
				detailDs.sync();
				frmQTFPXX.setReadOnly("VOC_FLAG",true);
				frmQTFPXX_VOC_FLAG.setRequired(false);
				frmQTFPXX.setReadOnly("IDENTY_STATUS",true);
				detailDs.sync();
			} else if(("0").equals(DocTV) || "2".equals(DocTV)){
				//销货方名称
				frmXFXX_SALE_NAME.setRequired(false);
				//纳税人识别号
				frmFPXX_BUY_TAX_NO.setRequired(true);//购方
				frmXFXX_SALE_TAX_NO.setRequired(true);//销方
				frmQTFPXX_FORM_CODING.setRequired(true);
				frmQTFPXX_FORM_CODING.show();
				//发票号码
				frmQTFPXX_VOC_NO.hide();
				//发票代码
				frmQTFPXX_VOC_CODE.hide();
				//金额
				frmQTFPXX_AMOUNT.setRequired(true);
				//税额
				frmQTFPXX_TAX_AMT.setRequired(true);
				//税价合计
				//frmQTFPXX_SUM_AMT.setRequired(true);
				//发票类型
				detailDs.setCurrentValue("VOC_FLAG","");
				detailDs.setCurrentValue("IDENTY_STATUS","3");
				frmQTFPXX_VOC_FLAG.setRequired(false);
				detailDs.sync();
				frmQTFPXX.setReadOnly("VOC_FLAG",false);
				frmQTFPXX.setReadOnly("IDENTY_STATUS",true);
				detailDs.sync();
			}
			else if(("1").equals(DocTV) || "3".equals(DocTV)){
				//销货方名称
				frmXFXX_SALE_NAME.setRequired(false);
				//纳税人识别号
				frmFPXX_BUY_TAX_NO.setRequired(true);//购方
				frmXFXX_SALE_TAX_NO.setRequired(true);//销方
				//发票号码
				frmQTFPXX_VOC_NO.setRequired(false);
				//发票代码
				frmQTFPXX_VOC_CODE.setRequired(false);
				//发票号码
				frmQTFPXX_VOC_NO.show();
				//发票代码
				frmQTFPXX_VOC_CODE.show();
				//金额
				frmQTFPXX_AMOUNT.setRequired(true);
				//税额
				frmQTFPXX_TAX_AMT.setRequired(true);
				//表单编码
				frmQTFPXX_FORM_CODING.hide();
				frmQTFPXX_FORM_CODING.setRequired(false);
				//发票类型
				detailDs.setCurrentValue("VOC_FLAG","");
				detailDs.setCurrentValue("IDENTY_STATUS","3");
				frmQTFPXX_VOC_FLAG.setRequired(false);
				detailDs.sync();
				frmQTFPXX.setReadOnly("VOC_FLAG",false);
				frmQTFPXX.setReadOnly("IDENTY_STATUS",true);
				detailDs.sync();
			}
        	}
        };
        frmQTFPXX_DOC_TYPE.addValueChangedListener(DOC_TYPE_ValueChangedListener);
	}
	
	public void btnAddMod(){
		frmFPXX.setReadOnly(false);
		frmXFXX.setReadOnly(false);
		frmQTFPXX.setReadOnly(false);
		frmFPXX_BUY_TAX_NO.setRequired(true);
		frmXFXX_SALE_TAX_NO.setRequired(true);
		frmQTFPXX_AMOUNT.setRequired(true);
		frmQTFPXX_DOC_TYPE.setRequired(true);
		frmQTFPXX_TAX_AMT.setRequired(true);
		frmQTFPXX_VOC_FLAG.setRequired(false);
		frmQTFPXX_CFM_DEDUC_DATE.setRequired(true);
		frmQTFPXX.setReadOnly("SUM_AMT", true);
	}

	public void btnDtl(){
		frmFPXX.setReadOnly(true);
		frmXFXX.setReadOnly(true);
		frmQTFPXX.setReadOnly(true);
		frmFPXX_BUY_TAX_NO.setRequired(false);
		frmXFXX_SALE_NAME.setRequired(false);
		frmXFXX_SALE_TAX_NO.setRequired(false);
		frmQTFPXX_AMOUNT.setRequired(false);
		frmQTFPXX_DOC_TYPE.setRequired(false);
		frmQTFPXX_VOC_CODE.setRequired(false);
		frmQTFPXX_VOC_NO.setRequired(false);
		frmQTFPXX_TAX_AMT.setRequired(false);
		frmQTFPXX_VOC_FLAG.setRequired(false);
		frmQTFPXX_CFM_DEDUC_DATE.setRequired(false);
		frmQTFPXX_FORM_CODING.setRequired(false);
		 
		
	}
	
	public void getChangedCcy() {
		String amount = detailDs.getCurrentValue("AMOUNT");//合计金额
		String tax_amt = detailDs.getCurrentValue("TAX_AMT");//合计税额
		if (amount != null && !"".equals(amount) && tax_amt != null
				&& !"".equals(tax_amt)) {
			String amt1=amount;
			String amt2=amt1.replace(",", "");
			double oAmt=(Double.parseDouble(amt2));
			String taxAmt1=tax_amt;
			String taxAmt2=taxAmt1.replace(",", "");
			double taxAmt=(Double.parseDouble(taxAmt2));
			if(oAmt<taxAmt){
				UPrompt.alert("提示", "合计税额应该小于合计金额！");
				return;
			}
			double amountCount=oAmt+taxAmt;
			detailDs.setCurrentValue("SUM_AMT", amountCount);
			frmQTFPXX_SUM_AMT.setValue(amountCount);
			detailDs.sync();
			}
	
		}
	
	public void calcTaxAmt() {
		String sInsAmt = detailDs2.getCurrentValue("INS_AMT");//收入
		String sTaxRate = detailDs2.getCurrentValue("TAX_RATE");//税率
		String sGoodNum = detailDs2.getCurrentValue("GOOD_NUM");//数量
		if (sGoodNum != null && !"".equals(sGoodNum) &&sInsAmt != null && !"".equals(sInsAmt) && sTaxRate != null && !"".equals(sTaxRate) ) {
			BigDecimal bInsAmt = new BigDecimal(sInsAmt.replaceAll(",", ""));//收入
			BigDecimal bTaxRate = new BigDecimal(sTaxRate.replaceAll(",", ""));//税率
			BigDecimal bGoodAmt = new BigDecimal(0);//单价
			BigDecimal bGoodsNum = new BigDecimal(sGoodNum.replaceAll(",", ""));//数量
			bGoodAmt = bInsAmt.divide(bGoodsNum,2,BigDecimal.ROUND_HALF_UP);
			//detailDs2.setCurrentValue("TAX_AMT", String.valueOf(String.valueOf(bInsAmt.multiply(bTaxRate).setScale(2, BigDecimal.ROUND_HALF_UP))));//税金
			detailDs2.setCurrentValue("GOOD_AMT", String.valueOf(bGoodAmt));//单价
			detailDs2.sync();
		}
	}

}
