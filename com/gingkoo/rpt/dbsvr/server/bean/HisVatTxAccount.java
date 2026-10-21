package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class HisVatTxAccount extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String boucMonth;

    private String txId;

    private String txName;

    private String seqNo;

    private String d1Act;

    private BigDecimal d1Amt;

    private String d2Act;

    private BigDecimal d2Amt;

    private String d3Act;

    private BigDecimal d3Amt;

    private String d4Act;

    private BigDecimal d4Amt;

    private String c1Act;

    private BigDecimal c1Amt;

    private String c2Act;

    private BigDecimal c2Amt;

    private String c3Act;

    private BigDecimal c3Amt;

    private String c4Act;

    private BigDecimal c4Amt;

    private String remarks;

    private String rptStatus;

    private String rptDate;

    private String checkFlag;

    private String checkDesc;

    private String nextAction;

    private String dataStatus;

    private String dataFlag;

    private String dataSource;

    private BigDecimal dataVersion;

    private String dataRejDesc;

    private String dataDelDesc;

    private String dataCrtUser;

    private String dataCrtDate;

    private String dataCrtTime;

    private String dataChgUser;

    private String dataChgDate;

    private String dataChgTime;

    private String dataApvUser;

    private String dataApvDate;

    private String dataApvTime;

    private String actSeqNo;

    private String actResult;

    private String actDate;

    private String actType;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String c1Ccy;

    private String c2Ccy;

    private String c3Ccy;

    private String c4Ccy;

    private String d1Ccy;

    private String d2Ccy;

    private String d3Ccy;

    private String d4Ccy;

    private String checkErrType;

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getInqOrgId() {
        return inqOrgId;
    }

    public void setInqOrgId(String inqOrgId) {
        this.inqOrgId = inqOrgId == null ? null : inqOrgId.trim();
    }

    public String getInqGroupId() {
        return inqGroupId;
    }

    public void setInqGroupId(String inqGroupId) {
        this.inqGroupId = inqGroupId == null ? null : inqGroupId.trim();
    }

    public String getBoucMonth() {
        return boucMonth;
    }

    public void setBoucMonth(String boucMonth) {
        this.boucMonth = boucMonth == null ? null : boucMonth.trim();
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId == null ? null : txId.trim();
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName == null ? null : txName.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getD1Act() {
        return d1Act;
    }

    public void setD1Act(String d1Act) {
        this.d1Act = d1Act == null ? null : d1Act.trim();
    }

    public BigDecimal getD1Amt() {
        return d1Amt;
    }

    public void setD1Amt(BigDecimal d1Amt) {
        this.d1Amt = d1Amt;
    }

    public String getD2Act() {
        return d2Act;
    }

    public void setD2Act(String d2Act) {
        this.d2Act = d2Act == null ? null : d2Act.trim();
    }

    public BigDecimal getD2Amt() {
        return d2Amt;
    }

    public void setD2Amt(BigDecimal d2Amt) {
        this.d2Amt = d2Amt;
    }

    public String getD3Act() {
        return d3Act;
    }

    public void setD3Act(String d3Act) {
        this.d3Act = d3Act == null ? null : d3Act.trim();
    }

    public BigDecimal getD3Amt() {
        return d3Amt;
    }

    public void setD3Amt(BigDecimal d3Amt) {
        this.d3Amt = d3Amt;
    }

    public String getD4Act() {
        return d4Act;
    }

    public void setD4Act(String d4Act) {
        this.d4Act = d4Act == null ? null : d4Act.trim();
    }

    public BigDecimal getD4Amt() {
        return d4Amt;
    }

    public void setD4Amt(BigDecimal d4Amt) {
        this.d4Amt = d4Amt;
    }

    public String getC1Act() {
        return c1Act;
    }

    public void setC1Act(String c1Act) {
        this.c1Act = c1Act == null ? null : c1Act.trim();
    }

    public BigDecimal getC1Amt() {
        return c1Amt;
    }

    public void setC1Amt(BigDecimal c1Amt) {
        this.c1Amt = c1Amt;
    }

    public String getC2Act() {
        return c2Act;
    }

    public void setC2Act(String c2Act) {
        this.c2Act = c2Act == null ? null : c2Act.trim();
    }

    public BigDecimal getC2Amt() {
        return c2Amt;
    }

    public void setC2Amt(BigDecimal c2Amt) {
        this.c2Amt = c2Amt;
    }

    public String getC3Act() {
        return c3Act;
    }

    public void setC3Act(String c3Act) {
        this.c3Act = c3Act == null ? null : c3Act.trim();
    }

    public BigDecimal getC3Amt() {
        return c3Amt;
    }

    public void setC3Amt(BigDecimal c3Amt) {
        this.c3Amt = c3Amt;
    }

    public String getC4Act() {
        return c4Act;
    }

    public void setC4Act(String c4Act) {
        this.c4Act = c4Act == null ? null : c4Act.trim();
    }

    public BigDecimal getC4Amt() {
        return c4Amt;
    }

    public void setC4Amt(BigDecimal c4Amt) {
        this.c4Amt = c4Amt;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getRptStatus() {
        return rptStatus;
    }

    public void setRptStatus(String rptStatus) {
        this.rptStatus = rptStatus == null ? null : rptStatus.trim();
    }

    public String getRptDate() {
        return rptDate;
    }

    public void setRptDate(String rptDate) {
        this.rptDate = rptDate == null ? null : rptDate.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getCheckDesc() {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc) {
        this.checkDesc = checkDesc == null ? null : checkDesc.trim();
    }

    public String getNextAction() {
        return nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction == null ? null : nextAction.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public BigDecimal getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(BigDecimal dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getDataRejDesc() {
        return dataRejDesc;
    }

    public void setDataRejDesc(String dataRejDesc) {
        this.dataRejDesc = dataRejDesc == null ? null : dataRejDesc.trim();
    }

    public String getDataDelDesc() {
        return dataDelDesc;
    }

    public void setDataDelDesc(String dataDelDesc) {
        this.dataDelDesc = dataDelDesc == null ? null : dataDelDesc.trim();
    }

    public String getDataCrtUser() {
        return dataCrtUser;
    }

    public void setDataCrtUser(String dataCrtUser) {
        this.dataCrtUser = dataCrtUser == null ? null : dataCrtUser.trim();
    }

    public String getDataCrtDate() {
        return dataCrtDate;
    }

    public void setDataCrtDate(String dataCrtDate) {
        this.dataCrtDate = dataCrtDate == null ? null : dataCrtDate.trim();
    }

    public String getDataCrtTime() {
        return dataCrtTime;
    }

    public void setDataCrtTime(String dataCrtTime) {
        this.dataCrtTime = dataCrtTime == null ? null : dataCrtTime.trim();
    }

    public String getDataChgUser() {
        return dataChgUser;
    }

    public void setDataChgUser(String dataChgUser) {
        this.dataChgUser = dataChgUser == null ? null : dataChgUser.trim();
    }

    public String getDataChgDate() {
        return dataChgDate;
    }

    public void setDataChgDate(String dataChgDate) {
        this.dataChgDate = dataChgDate == null ? null : dataChgDate.trim();
    }

    public String getDataChgTime() {
        return dataChgTime;
    }

    public void setDataChgTime(String dataChgTime) {
        this.dataChgTime = dataChgTime == null ? null : dataChgTime.trim();
    }

    public String getDataApvUser() {
        return dataApvUser;
    }

    public void setDataApvUser(String dataApvUser) {
        this.dataApvUser = dataApvUser == null ? null : dataApvUser.trim();
    }

    public String getDataApvDate() {
        return dataApvDate;
    }

    public void setDataApvDate(String dataApvDate) {
        this.dataApvDate = dataApvDate == null ? null : dataApvDate.trim();
    }

    public String getDataApvTime() {
        return dataApvTime;
    }

    public void setDataApvTime(String dataApvTime) {
        this.dataApvTime = dataApvTime == null ? null : dataApvTime.trim();
    }

    public String getActSeqNo() {
        return actSeqNo;
    }

    public void setActSeqNo(String actSeqNo) {
        this.actSeqNo = actSeqNo == null ? null : actSeqNo.trim();
    }

    public String getActResult() {
        return actResult;
    }

    public void setActResult(String actResult) {
        this.actResult = actResult == null ? null : actResult.trim();
    }

    public String getActDate() {
        return actDate;
    }

    public void setActDate(String actDate) {
        this.actDate = actDate == null ? null : actDate.trim();
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType == null ? null : actType.trim();
    }

    public String getRsv1() {
        return rsv1;
    }

    public void setRsv1(String rsv1) {
        this.rsv1 = rsv1 == null ? null : rsv1.trim();
    }

    public String getRsv2() {
        return rsv2;
    }

    public void setRsv2(String rsv2) {
        this.rsv2 = rsv2 == null ? null : rsv2.trim();
    }

    public String getRsv3() {
        return rsv3;
    }

    public void setRsv3(String rsv3) {
        this.rsv3 = rsv3 == null ? null : rsv3.trim();
    }

    public String getRsv4() {
        return rsv4;
    }

    public void setRsv4(String rsv4) {
        this.rsv4 = rsv4 == null ? null : rsv4.trim();
    }

    public String getRsv5() {
        return rsv5;
    }

    public void setRsv5(String rsv5) {
        this.rsv5 = rsv5 == null ? null : rsv5.trim();
    }

    public String getC1Ccy() {
        return c1Ccy;
    }

    public void setC1Ccy(String c1Ccy) {
        this.c1Ccy = c1Ccy == null ? null : c1Ccy.trim();
    }

    public String getC2Ccy() {
        return c2Ccy;
    }

    public void setC2Ccy(String c2Ccy) {
        this.c2Ccy = c2Ccy == null ? null : c2Ccy.trim();
    }

    public String getC3Ccy() {
        return c3Ccy;
    }

    public void setC3Ccy(String c3Ccy) {
        this.c3Ccy = c3Ccy == null ? null : c3Ccy.trim();
    }

    public String getC4Ccy() {
        return c4Ccy;
    }

    public void setC4Ccy(String c4Ccy) {
        this.c4Ccy = c4Ccy == null ? null : c4Ccy.trim();
    }

    public String getD1Ccy() {
        return d1Ccy;
    }

    public void setD1Ccy(String d1Ccy) {
        this.d1Ccy = d1Ccy == null ? null : d1Ccy.trim();
    }

    public String getD2Ccy() {
        return d2Ccy;
    }

    public void setD2Ccy(String d2Ccy) {
        this.d2Ccy = d2Ccy == null ? null : d2Ccy.trim();
    }

    public String getD3Ccy() {
        return d3Ccy;
    }

    public void setD3Ccy(String d3Ccy) {
        this.d3Ccy = d3Ccy == null ? null : d3Ccy.trim();
    }

    public String getD4Ccy() {
        return d4Ccy;
    }

    public void setD4Ccy(String d4Ccy) {
        this.d4Ccy = d4Ccy == null ? null : d4Ccy.trim();
    }

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        Object value;
        if (column == null) return null;
        switch (column) {
        case DATA_ID: {
            return getDataId();
        }
        case DATA_DATE: {
            return getDataDate();
        }
        case CORP_ID: {
            return getCorpId();
        }
        case ORG_ID: {
            return getOrgId();
        }
        case GROUP_ID: {
            return getGroupId();
        }
        case INQ_ORG_ID: {
            return getInqOrgId();
        }
        case INQ_GROUP_ID: {
            return getInqGroupId();
        }
        case BOUC_MONTH: {
            return getBoucMonth();
        }
        case TX_ID: {
            return getTxId();
        }
        case TX_NAME: {
            return getTxName();
        }
        case SEQ_NO: {
            return getSeqNo();
        }
        case D_1_ACT: {
            return getD1Act();
        }
        case D_1_AMT: {
            return (value = getD1Amt()) == null ? null : value.toString();
        }
        case D_2_ACT: {
            return getD2Act();
        }
        case D_2_AMT: {
            return (value = getD2Amt()) == null ? null : value.toString();
        }
        case D_3_ACT: {
            return getD3Act();
        }
        case D_3_AMT: {
            return (value = getD3Amt()) == null ? null : value.toString();
        }
        case D_4_ACT: {
            return getD4Act();
        }
        case D_4_AMT: {
            return (value = getD4Amt()) == null ? null : value.toString();
        }
        case C_1_ACT: {
            return getC1Act();
        }
        case C_1_AMT: {
            return (value = getC1Amt()) == null ? null : value.toString();
        }
        case C_2_ACT: {
            return getC2Act();
        }
        case C_2_AMT: {
            return (value = getC2Amt()) == null ? null : value.toString();
        }
        case C_3_ACT: {
            return getC3Act();
        }
        case C_3_AMT: {
            return (value = getC3Amt()) == null ? null : value.toString();
        }
        case C_4_ACT: {
            return getC4Act();
        }
        case C_4_AMT: {
            return (value = getC4Amt()) == null ? null : value.toString();
        }
        case REMARKS: {
            return getRemarks();
        }
        case RPT_STATUS: {
            return getRptStatus();
        }
        case RPT_DATE: {
            return getRptDate();
        }
        case CHECK_FLAG: {
            return getCheckFlag();
        }
        case CHECK_DESC: {
            return getCheckDesc();
        }
        case NEXT_ACTION: {
            return getNextAction();
        }
        case DATA_STATUS: {
            return getDataStatus();
        }
        case DATA_FLAG: {
            return getDataFlag();
        }
        case DATA_SOURCE: {
            return getDataSource();
        }
        case DATA_VERSION: {
            return (value = getDataVersion()) == null ? null : value.toString();
        }
        case DATA_REJ_DESC: {
            return getDataRejDesc();
        }
        case DATA_DEL_DESC: {
            return getDataDelDesc();
        }
        case DATA_CRT_USER: {
            return getDataCrtUser();
        }
        case DATA_CRT_DATE: {
            return getDataCrtDate();
        }
        case DATA_CRT_TIME: {
            return getDataCrtTime();
        }
        case DATA_CHG_USER: {
            return getDataChgUser();
        }
        case DATA_CHG_DATE: {
            return getDataChgDate();
        }
        case DATA_CHG_TIME: {
            return getDataChgTime();
        }
        case DATA_APV_USER: {
            return getDataApvUser();
        }
        case DATA_APV_DATE: {
            return getDataApvDate();
        }
        case DATA_APV_TIME: {
            return getDataApvTime();
        }
        case ACT_SEQ_NO: {
            return getActSeqNo();
        }
        case ACT_RESULT: {
            return getActResult();
        }
        case ACT_DATE: {
            return getActDate();
        }
        case ACT_TYPE: {
            return getActType();
        }
        case RSV1: {
            return getRsv1();
        }
        case RSV2: {
            return getRsv2();
        }
        case RSV3: {
            return getRsv3();
        }
        case RSV4: {
            return getRsv4();
        }
        case RSV5: {
            return getRsv5();
        }
        case C_1_CCY: {
            return getC1Ccy();
        }
        case C_2_CCY: {
            return getC2Ccy();
        }
        case C_3_CCY: {
            return getC3Ccy();
        }
        case C_4_CCY: {
            return getC4Ccy();
        }
        case D_1_CCY: {
            return getD1Ccy();
        }
        case D_2_CCY: {
            return getD2Ccy();
        }
        case D_3_CCY: {
            return getD3Ccy();
        }
        case D_4_CCY: {
            return getD4Ccy();
        }
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        default: {
            return null;
        }}
    }

    @Override
    public String get(String column) {
        return get(Column.parse(column));
    }

    @Override
    public Map<String, String> get(Map<String, String> map) {
        for (Column c: Column.values()) {
            map.put(c.toString(), get(c));
        }
        return map;
    }

    public HisVatTxAccount set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case DATA_ID: {
            setDataId(value);
            break;
        }
        case DATA_DATE: {
            setDataDate(value);
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case ORG_ID: {
            setOrgId(value);
            break;
        }
        case GROUP_ID: {
            setGroupId(value);
            break;
        }
        case INQ_ORG_ID: {
            setInqOrgId(value);
            break;
        }
        case INQ_GROUP_ID: {
            setInqGroupId(value);
            break;
        }
        case BOUC_MONTH: {
            setBoucMonth(value);
            break;
        }
        case TX_ID: {
            setTxId(value);
            break;
        }
        case TX_NAME: {
            setTxName(value);
            break;
        }
        case SEQ_NO: {
            setSeqNo(value);
            break;
        }
        case D_1_ACT: {
            setD1Act(value);
            break;
        }
        case D_1_AMT: {
            value = StringUtils.stripToNull(value);
            setD1Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case D_2_ACT: {
            setD2Act(value);
            break;
        }
        case D_2_AMT: {
            value = StringUtils.stripToNull(value);
            setD2Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case D_3_ACT: {
            setD3Act(value);
            break;
        }
        case D_3_AMT: {
            value = StringUtils.stripToNull(value);
            setD3Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case D_4_ACT: {
            setD4Act(value);
            break;
        }
        case D_4_AMT: {
            value = StringUtils.stripToNull(value);
            setD4Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_1_ACT: {
            setC1Act(value);
            break;
        }
        case C_1_AMT: {
            value = StringUtils.stripToNull(value);
            setC1Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_2_ACT: {
            setC2Act(value);
            break;
        }
        case C_2_AMT: {
            value = StringUtils.stripToNull(value);
            setC2Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_3_ACT: {
            setC3Act(value);
            break;
        }
        case C_3_AMT: {
            value = StringUtils.stripToNull(value);
            setC3Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case C_4_ACT: {
            setC4Act(value);
            break;
        }
        case C_4_AMT: {
            value = StringUtils.stripToNull(value);
            setC4Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case REMARKS: {
            setRemarks(value);
            break;
        }
        case RPT_STATUS: {
            setRptStatus(value);
            break;
        }
        case RPT_DATE: {
            setRptDate(value);
            break;
        }
        case CHECK_FLAG: {
            setCheckFlag(value);
            break;
        }
        case CHECK_DESC: {
            setCheckDesc(value);
            break;
        }
        case NEXT_ACTION: {
            setNextAction(value);
            break;
        }
        case DATA_STATUS: {
            setDataStatus(value);
            break;
        }
        case DATA_FLAG: {
            setDataFlag(value);
            break;
        }
        case DATA_SOURCE: {
            setDataSource(value);
            break;
        }
        case DATA_VERSION: {
            value = StringUtils.stripToNull(value);
            setDataVersion(value == null ? null : new BigDecimal(value));
            break;
        }
        case DATA_REJ_DESC: {
            setDataRejDesc(value);
            break;
        }
        case DATA_DEL_DESC: {
            setDataDelDesc(value);
            break;
        }
        case DATA_CRT_USER: {
            setDataCrtUser(value);
            break;
        }
        case DATA_CRT_DATE: {
            setDataCrtDate(value);
            break;
        }
        case DATA_CRT_TIME: {
            setDataCrtTime(value);
            break;
        }
        case DATA_CHG_USER: {
            setDataChgUser(value);
            break;
        }
        case DATA_CHG_DATE: {
            setDataChgDate(value);
            break;
        }
        case DATA_CHG_TIME: {
            setDataChgTime(value);
            break;
        }
        case DATA_APV_USER: {
            setDataApvUser(value);
            break;
        }
        case DATA_APV_DATE: {
            setDataApvDate(value);
            break;
        }
        case DATA_APV_TIME: {
            setDataApvTime(value);
            break;
        }
        case ACT_SEQ_NO: {
            setActSeqNo(value);
            break;
        }
        case ACT_RESULT: {
            setActResult(value);
            break;
        }
        case ACT_DATE: {
            setActDate(value);
            break;
        }
        case ACT_TYPE: {
            setActType(value);
            break;
        }
        case RSV1: {
            setRsv1(value);
            break;
        }
        case RSV2: {
            setRsv2(value);
            break;
        }
        case RSV3: {
            setRsv3(value);
            break;
        }
        case RSV4: {
            setRsv4(value);
            break;
        }
        case RSV5: {
            setRsv5(value);
            break;
        }
        case C_1_CCY: {
            setC1Ccy(value);
            break;
        }
        case C_2_CCY: {
            setC2Ccy(value);
            break;
        }
        case C_3_CCY: {
            setC3Ccy(value);
            break;
        }
        case C_4_CCY: {
            setC4Ccy(value);
            break;
        }
        case D_1_CCY: {
            setD1Ccy(value);
            break;
        }
        case D_2_CCY: {
            setD2Ccy(value);
            break;
        }
        case D_3_CCY: {
            setD3Ccy(value);
            break;
        }
        case D_4_CCY: {
            setD4Ccy(value);
            break;
        }
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public HisVatTxAccount set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public HisVatTxAccount set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public HisVatTxAccount set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDataId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof HisVatTxAccount)) {
            return false;
        }
        HisVatTxAccount rhs = (HisVatTxAccount) obj;
        return new EqualsBuilder()
                .append(getDataId(), rhs.getDataId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDataId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getDataId() != null) {
            builder.append("dataId", getDataId());
        }
        if (getDataDate() != null) {
            builder.append("dataDate", getDataDate());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getOrgId() != null) {
            builder.append("orgId", getOrgId());
        }
        if (getGroupId() != null) {
            builder.append("groupId", getGroupId());
        }
        if (getInqOrgId() != null) {
            builder.append("inqOrgId", getInqOrgId());
        }
        if (getInqGroupId() != null) {
            builder.append("inqGroupId", getInqGroupId());
        }
        if (getBoucMonth() != null) {
            builder.append("boucMonth", getBoucMonth());
        }
        if (getTxId() != null) {
            builder.append("txId", getTxId());
        }
        if (getTxName() != null) {
            builder.append("txName", getTxName());
        }
        if (getSeqNo() != null) {
            builder.append("seqNo", getSeqNo());
        }
        if (getD1Act() != null) {
            builder.append("d1Act", getD1Act());
        }
        if (getD1Amt() != null) {
            builder.append("d1Amt", getD1Amt());
        }
        if (getD2Act() != null) {
            builder.append("d2Act", getD2Act());
        }
        if (getD2Amt() != null) {
            builder.append("d2Amt", getD2Amt());
        }
        if (getD3Act() != null) {
            builder.append("d3Act", getD3Act());
        }
        if (getD3Amt() != null) {
            builder.append("d3Amt", getD3Amt());
        }
        if (getD4Act() != null) {
            builder.append("d4Act", getD4Act());
        }
        if (getD4Amt() != null) {
            builder.append("d4Amt", getD4Amt());
        }
        if (getC1Act() != null) {
            builder.append("c1Act", getC1Act());
        }
        if (getC1Amt() != null) {
            builder.append("c1Amt", getC1Amt());
        }
        if (getC2Act() != null) {
            builder.append("c2Act", getC2Act());
        }
        if (getC2Amt() != null) {
            builder.append("c2Amt", getC2Amt());
        }
        if (getC3Act() != null) {
            builder.append("c3Act", getC3Act());
        }
        if (getC3Amt() != null) {
            builder.append("c3Amt", getC3Amt());
        }
        if (getC4Act() != null) {
            builder.append("c4Act", getC4Act());
        }
        if (getC4Amt() != null) {
            builder.append("c4Amt", getC4Amt());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
        }
        if (getRptStatus() != null) {
            builder.append("rptStatus", getRptStatus());
        }
        if (getRptDate() != null) {
            builder.append("rptDate", getRptDate());
        }
        if (getCheckFlag() != null) {
            builder.append("checkFlag", getCheckFlag());
        }
        if (getCheckDesc() != null) {
            builder.append("checkDesc", getCheckDesc());
        }
        if (getNextAction() != null) {
            builder.append("nextAction", getNextAction());
        }
        if (getDataStatus() != null) {
            builder.append("dataStatus", getDataStatus());
        }
        if (getDataFlag() != null) {
            builder.append("dataFlag", getDataFlag());
        }
        if (getDataSource() != null) {
            builder.append("dataSource", getDataSource());
        }
        if (getDataVersion() != null) {
            builder.append("dataVersion", getDataVersion());
        }
        if (getDataRejDesc() != null) {
            builder.append("dataRejDesc", getDataRejDesc());
        }
        if (getDataDelDesc() != null) {
            builder.append("dataDelDesc", getDataDelDesc());
        }
        if (getDataCrtUser() != null) {
            builder.append("dataCrtUser", getDataCrtUser());
        }
        if (getDataCrtDate() != null) {
            builder.append("dataCrtDate", getDataCrtDate());
        }
        if (getDataCrtTime() != null) {
            builder.append("dataCrtTime", getDataCrtTime());
        }
        if (getDataChgUser() != null) {
            builder.append("dataChgUser", getDataChgUser());
        }
        if (getDataChgDate() != null) {
            builder.append("dataChgDate", getDataChgDate());
        }
        if (getDataChgTime() != null) {
            builder.append("dataChgTime", getDataChgTime());
        }
        if (getDataApvUser() != null) {
            builder.append("dataApvUser", getDataApvUser());
        }
        if (getDataApvDate() != null) {
            builder.append("dataApvDate", getDataApvDate());
        }
        if (getDataApvTime() != null) {
            builder.append("dataApvTime", getDataApvTime());
        }
        if (getActSeqNo() != null) {
            builder.append("actSeqNo", getActSeqNo());
        }
        if (getActResult() != null) {
            builder.append("actResult", getActResult());
        }
        if (getActDate() != null) {
            builder.append("actDate", getActDate());
        }
        if (getActType() != null) {
            builder.append("actType", getActType());
        }
        if (getRsv1() != null) {
            builder.append("rsv1", getRsv1());
        }
        if (getRsv2() != null) {
            builder.append("rsv2", getRsv2());
        }
        if (getRsv3() != null) {
            builder.append("rsv3", getRsv3());
        }
        if (getRsv4() != null) {
            builder.append("rsv4", getRsv4());
        }
        if (getRsv5() != null) {
            builder.append("rsv5", getRsv5());
        }
        if (getC1Ccy() != null) {
            builder.append("c1Ccy", getC1Ccy());
        }
        if (getC2Ccy() != null) {
            builder.append("c2Ccy", getC2Ccy());
        }
        if (getC3Ccy() != null) {
            builder.append("c3Ccy", getC3Ccy());
        }
        if (getC4Ccy() != null) {
            builder.append("c4Ccy", getC4Ccy());
        }
        if (getD1Ccy() != null) {
            builder.append("d1Ccy", getD1Ccy());
        }
        if (getD2Ccy() != null) {
            builder.append("d2Ccy", getD2Ccy());
        }
        if (getD3Ccy() != null) {
            builder.append("d3Ccy", getD3Ccy());
        }
        if (getD4Ccy() != null) {
            builder.append("d4Ccy", getD4Ccy());
        }
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        return builder.toString();
    }

    public HisVatTxAccount() {
        /* pass */
    }

    public HisVatTxAccount(Map<String, ?> map) {
        set(map);
    }

    public HisVatTxAccount(AbstractTable table) {
        set(table);
    }

    public enum Column {
        DATA_ID,
        DATA_DATE,
        CORP_ID,
        ORG_ID,
        GROUP_ID,
        INQ_ORG_ID,
        INQ_GROUP_ID,
        BOUC_MONTH,
        TX_ID,
        TX_NAME,
        SEQ_NO,
        D_1_ACT,
        D_1_AMT,
        D_2_ACT,
        D_2_AMT,
        D_3_ACT,
        D_3_AMT,
        D_4_ACT,
        D_4_AMT,
        C_1_ACT,
        C_1_AMT,
        C_2_ACT,
        C_2_AMT,
        C_3_ACT,
        C_3_AMT,
        C_4_ACT,
        C_4_AMT,
        REMARKS,
        RPT_STATUS,
        RPT_DATE,
        CHECK_FLAG,
        CHECK_DESC,
        NEXT_ACTION,
        DATA_STATUS,
        DATA_FLAG,
        DATA_SOURCE,
        DATA_VERSION,
        DATA_REJ_DESC,
        DATA_DEL_DESC,
        DATA_CRT_USER,
        DATA_CRT_DATE,
        DATA_CRT_TIME,
        DATA_CHG_USER,
        DATA_CHG_DATE,
        DATA_CHG_TIME,
        DATA_APV_USER,
        DATA_APV_DATE,
        DATA_APV_TIME,
        ACT_SEQ_NO,
        ACT_RESULT,
        ACT_DATE,
        ACT_TYPE,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        C_1_CCY,
        C_2_CCY,
        C_3_CCY,
        C_4_CCY,
        D_1_CCY,
        D_2_CCY,
        D_3_CCY,
        D_4_CCY,
        CHECK_ERR_TYPE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
