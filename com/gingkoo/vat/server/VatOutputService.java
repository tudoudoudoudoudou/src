//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gingkoo.vat.server;

import com.gingkoo.gal.api.core.serivce.callback.Callback;
import com.gingkoo.gal.core.serivce.callback.CallbackImpl;
import com.gingkoo.gal.data.page.Page;
import com.gingkoo.gui.service.server.exception.BizException;
import com.gingkoo.rpt.common.server.CommonApproveService;
import com.gingkoo.rpt.common.server.CommonBatchApproveService;
import com.gingkoo.rpt.common.server.CommonQueryService;
import com.gingkoo.rpt.main.server.RptCommonService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class VatOutputService extends RptCommonService {
    public Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CommonQueryService commonQueryService;
    @Autowired
    private VatCommonService vatCommonService;
    @Autowired
    private CommonBatchApproveService commonBatchApproveService;
    @Autowired
    private CommonApproveService commonApproveService;

    public VatOutputService() {
    }

    public Page<Map<String, String>> oVocManMadeListVocList(Map<String, String> header, Map<String, String> dataMap) {
        String sql_id = (String)header.get("__SQLID__");
        String sqlStr = (String)this.myBatisSessionTemplate.selectOne("com.gingkoo.vat.server.VatOutPutSql.oVocManMadeListVocListGetSqlString", sql_id);
        String ids = (String)dataMap.get("DATA_IDS");
        if (ids == null || ids.length() == 0) {
            ids = "0";
        }

        sqlStr = sqlStr + " and li.data_id not in ('" + ids + "')";
        header.put("HEAD.SQL", sqlStr);
        dataMap.put("HEAD.SQL", sqlStr);
        return this.commonQueryService.commonQueryPage(header, dataMap);
    }

    @Transactional(
            rollbackFor = {Exception.class},
            propagation = Propagation.REQUIRED
    )
    public Callback OVocRedReviseBatchApv(Map<String, String> header, List<Map<String, String>> list) throws BizException {
        Callback cb = new CallbackImpl();

        try {
            this.commonBatchApproveService.execute(header, list);
            Iterator i$ = list.iterator();

            while(i$.hasNext()) {
                Map map = (Map)i$.next();
                System.out.println("Map  :  " + map.get("DATA_STATUS"));
                if (map.get("data_status").equals("10")) {
                    this.vatCommonService.oVocReviseApvDelChange(header, map);
                }
            }

            return cb;
        } catch (Exception var6) {
            var6.printStackTrace();
            cb.setErrorCode("-1");
            cb.setErrorMessage("操作失败，错误信息：" + var6.getMessage());
            return cb;
        }
    }

    @Transactional(
            rollbackFor = {Exception.class},
            propagation = Propagation.REQUIRED
    )
    public Callback OVocRedReviseApv(Map<String, String> header, Map<String, String> map) throws BizException {
        Callback cb = new CallbackImpl();

        try {
            this.commonApproveService.execute(header, map);
            if (((String)map.get("data_status")).equals("10")) {
                this.vatCommonService.oVocReviseApvDelChange(header, map);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            cb.setErrorCode("-1");
            cb.setErrorMessage("操作失败，错误信息：" + var5.getMessage());
        }

        return cb;
    }

    @Transactional(
            rollbackFor = {Exception.class},
            propagation = Propagation.REQUIRED
    )
    public Callback ToOVocTxManaAddCustInfo(Map<String, String> header, Map<String, String> map) {
        Callback rb = new CallbackImpl();
        this.logger.info("map:  " + map);

        try {
            rb = this.vatCommonService.OVocTxAddCust(header, map);
            if (((Callback)rb).getErrorMessage() != null) {
                return (Callback)rb;
            }

            this.logger.info(((Callback)rb).getCallbackData().toString());
            map.put("CUST_ID", ((Callback)rb).getCallbackData().toString());
            this.myBatisSessionTemplate.update("com.gingkoo.vat.server.VatOutPutSql.updateTxCust", map);
        } catch (Exception var5) {
            ((Callback)rb).setErrorCode("-1");
            ((Callback)rb).setErrorMessage("操作失败，错误信息：" + var5.getMessage());
        }

        return (Callback)rb;
    }
}
