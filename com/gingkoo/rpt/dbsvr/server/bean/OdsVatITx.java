package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsVatITx extends AbstractTable {
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String txId;

    private String txType;

    private String txCode;

    private String seqNo;

    private String payReqNo;

    private String status;

    private String payChl;

    private String payDate;

    private String txDate;

    private String bizType;

    private String actNo;

    private String actType;

    private BigDecimal txAmt;

    private BigDecimal oAmt;

    private String ccy;

    private BigDecimal exchageRate;

    private String sysId;

    private String txName;

    private String goodName;

    private String goodType;

    private String cntUnit;

    private BigDecimal goodNum;

    private BigDecimal goodAmt;

    private String contractType;

    private String vendorNo;

    private String vendorName;

    private String refId;

    private String vocCode;

    private String vocNo;

    private String vocId;

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

    private BigDecimal amount;

    private String isTax;

    private BigDecimal taxRate;

    private BigDecimal expAmt;

    private BigDecimal taxAmt;

    private String hasVoc;

    private String deductType;

    private String outType;

    private String caclTaxType;

    private String vendorId;

    private BigDecimal outAmt;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String taxEntType;

    private String usage;

    private String checkErrType;

    private String goodCode;

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

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId == null ? null : txId.trim();
    }

    public String getTxType() {
        return txType;
    }

    public void setTxType(String txType) {
        this.txType = txType == null ? null : txType.trim();
    }

    public String getTxCode() {
        return txCode;
    }

    public void setTxCode(String txCode) {
        this.txCode = txCode == null ? null : txCode.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getPayReqNo() {
        return payReqNo;
    }

    public void setPayReqNo(String payReqNo) {
        this.payReqNo = payReqNo == null ? null : payReqNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPayChl() {
        return payChl;
    }

    public void setPayChl(String payChl) {
        this.payChl = payChl == null ? null : payChl.trim();
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate == null ? null : payDate.trim();
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate == null ? null : txDate.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo == null ? null : actNo.trim();
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType == null ? null : actType.trim();
    }

    public BigDecimal getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(BigDecimal txAmt) {
        this.txAmt = txAmt;
    }

    public BigDecimal getOAmt() {
        return oAmt;
    }

    public void setOAmt(BigDecimal oAmt) {
        this.oAmt = oAmt;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    public BigDecimal getExchageRate() {
        return exchageRate;
    }

    public void setExchageRate(BigDecimal exchageRate) {
        this.exchageRate = exchageRate;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName == null ? null : txName.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType == null ? null : goodType.trim();
    }

    public String getCntUnit() {
        return cntUnit;
    }

    public void setCntUnit(String cntUnit) {
        this.cntUnit = cntUnit == null ? null : cntUnit.trim();
    }

    public BigDecimal getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(BigDecimal goodNum) {
        this.goodNum = goodNum;
    }

    public BigDecimal getGoodAmt() {
        return goodAmt;
    }

    public void setGoodAmt(BigDecimal goodAmt) {
        this.goodAmt = goodAmt;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getVendorNo() {
        return vendorNo;
    }

    public void setVendorNo(String vendorNo) {
        this.vendorNo = vendorNo == null ? null : vendorNo.trim();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    public String getVocCode() {
        return vocCode;
    }

    public void setVocCode(String vocCode) {
        this.vocCode = vocCode == null ? null : vocCode.trim();
    }

    public String getVocNo() {
        return vocNo;
    }

    public void setVocNo(String vocNo) {
        this.vocNo = vocNo == null ? null : vocNo.trim();
    }

    public String getVocId() {
        return vocId;
    }

    public void setVocId(String vocId) {
        this.vocId = vocId == null ? null : vocId.trim();
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getIsTax() {
        return isTax;
    }

    public void setIsTax(String isTax) {
        this.isTax = isTax == null ? null : isTax.trim();
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getExpAmt() {
        return expAmt;
    }

    public void setExpAmt(BigDecimal expAmt) {
        this.expAmt = expAmt;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getHasVoc() {
        return hasVoc;
    }

    public void setHasVoc(String hasVoc) {
        this.hasVoc = hasVoc == null ? null : hasVoc.trim();
    }

    public String getDeductType() {
        return deductType;
    }

    public void setDeductType(String deductType) {
        this.deductType = deductType == null ? null : deductType.trim();
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType == null ? null : outType.trim();
    }

    public String getCaclTaxType() {
        return caclTaxType;
    }

    public void setCaclTaxType(String caclTaxType) {
        this.caclTaxType = caclTaxType == null ? null : caclTaxType.trim();
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public BigDecimal getOutAmt() {
        return outAmt;
    }

    public void setOutAmt(BigDecimal outAmt) {
        this.outAmt = outAmt;
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

    public String getTaxEntType() {
        return taxEntType;
    }

    public void setTaxEntType(String taxEntType) {
        this.taxEntType = taxEntType == null ? null : taxEntType.trim();
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode == null ? null : goodCode.trim();
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
        case TX_ID: {
            return getTxId();
        }
        case TX_TYPE: {
            return getTxType();
        }
        case TX_CODE: {
            return getTxCode();
        }
        case SEQ_NO: {
            return getSeqNo();
        }
        case PAY_REQ_NO: {
            return getPayReqNo();
        }
        case STATUS: {
            return getStatus();
        }
        case PAY_CHL: {
            return getPayChl();
        }
        case PAY_DATE: {
            return getPayDate();
        }
        case TX_DATE: {
            return getTxDate();
        }
        case BIZ_TYPE: {
            return getBizType();
        }
        case ACT_NO: {
            return getActNo();
        }
        case ACT_TYPE: {
            return getActType();
        }
        case TX_AMT: {
            return (value = getTxAmt()) == null ? null : value.toString();
        }
        case O_AMT: {
            return (value = getOAmt()) == null ? null : value.toString();
        }
        case CCY: {
            return getCcy();
        }
        case EXCHAGE_RATE: {
            return (value = getExchageRate()) == null ? null : value.toString();
        }
        case SYS_ID: {
            return getSysId();
        }
        case TX_NAME: {
            return getTxName();
        }
        case GOOD_NAME: {
            return getGoodName();
        }
        case GOOD_TYPE: {
            return getGoodType();
        }
        case CNT_UNIT: {
            return getCntUnit();
        }
        case GOOD_NUM: {
            return (value = getGoodNum()) == null ? null : value.toString();
        }
        case GOOD_AMT: {
            return (value = getGoodAmt()) == null ? null : value.toString();
        }
        case CONTRACT_TYPE: {
            return getContractType();
        }
        case VENDOR_NO: {
            return getVendorNo();
        }
        case VENDOR_NAME: {
            return getVendorName();
        }
        case REF_ID: {
            return getRefId();
        }
        case VOC_CODE: {
            return getVocCode();
        }
        case VOC_NO: {
            return getVocNo();
        }
        case VOC_ID: {
            return getVocId();
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
        case AMOUNT: {
            return (value = getAmount()) == null ? null : value.toString();
        }
        case IS_TAX: {
            return getIsTax();
        }
        case TAX_RATE: {
            return (value = getTaxRate()) == null ? null : value.toString();
        }
        case EXP_AMT: {
            return (value = getExpAmt()) == null ? null : value.toString();
        }
        case TAX_AMT: {
            return (value = getTaxAmt()) == null ? null : value.toString();
        }
        case HAS_VOC: {
            return getHasVoc();
        }
        case DEDUCT_TYPE: {
            return getDeductType();
        }
        case OUT_TYPE: {
            return getOutType();
        }
        case CACL_TAX_TYPE: {
            return getCaclTaxType();
        }
        case VENDOR_ID: {
            return getVendorId();
        }
        case OUT_AMT: {
            return (value = getOutAmt()) == null ? null : value.toString();
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
        case TAX_ENT_TYPE: {
            return getTaxEntType();
        }
        case USAGE: {
            return getUsage();
        }
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        case GOOD_CODE: {
            return getGoodCode();
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

    public OdsVatITx set(Column column, String value) {
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
        case TX_ID: {
            setTxId(value);
            break;
        }
        case TX_TYPE: {
            setTxType(value);
            break;
        }
        case TX_CODE: {
            setTxCode(value);
            break;
        }
        case SEQ_NO: {
            setSeqNo(value);
            break;
        }
        case PAY_REQ_NO: {
            setPayReqNo(value);
            break;
        }
        case STATUS: {
            setStatus(value);
            break;
        }
        case PAY_CHL: {
            setPayChl(value);
            break;
        }
        case PAY_DATE: {
            setPayDate(value);
            break;
        }
        case TX_DATE: {
            setTxDate(value);
            break;
        }
        case BIZ_TYPE: {
            setBizType(value);
            break;
        }
        case ACT_NO: {
            setActNo(value);
            break;
        }
        case ACT_TYPE: {
            setActType(value);
            break;
        }
        case TX_AMT: {
            value = StringUtils.stripToNull(value);
            setTxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_AMT: {
            value = StringUtils.stripToNull(value);
            setOAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case CCY: {
            setCcy(value);
            break;
        }
        case EXCHAGE_RATE: {
            value = StringUtils.stripToNull(value);
            setExchageRate(value == null ? null : new BigDecimal(value));
            break;
        }
        case SYS_ID: {
            setSysId(value);
            break;
        }
        case TX_NAME: {
            setTxName(value);
            break;
        }
        case GOOD_NAME: {
            setGoodName(value);
            break;
        }
        case GOOD_TYPE: {
            setGoodType(value);
            break;
        }
        case CNT_UNIT: {
            setCntUnit(value);
            break;
        }
        case GOOD_NUM: {
            value = StringUtils.stripToNull(value);
            setGoodNum(value == null ? null : new BigDecimal(value));
            break;
        }
        case GOOD_AMT: {
            value = StringUtils.stripToNull(value);
            setGoodAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case CONTRACT_TYPE: {
            setContractType(value);
            break;
        }
        case VENDOR_NO: {
            setVendorNo(value);
            break;
        }
        case VENDOR_NAME: {
            setVendorName(value);
            break;
        }
        case REF_ID: {
            setRefId(value);
            break;
        }
        case VOC_CODE: {
            setVocCode(value);
            break;
        }
        case VOC_NO: {
            setVocNo(value);
            break;
        }
        case VOC_ID: {
            setVocId(value);
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
        case AMOUNT: {
            value = StringUtils.stripToNull(value);
            setAmount(value == null ? null : new BigDecimal(value));
            break;
        }
        case IS_TAX: {
            setIsTax(value);
            break;
        }
        case TAX_RATE: {
            value = StringUtils.stripToNull(value);
            setTaxRate(value == null ? null : new BigDecimal(value));
            break;
        }
        case EXP_AMT: {
            value = StringUtils.stripToNull(value);
            setExpAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case TAX_AMT: {
            value = StringUtils.stripToNull(value);
            setTaxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case HAS_VOC: {
            setHasVoc(value);
            break;
        }
        case DEDUCT_TYPE: {
            setDeductType(value);
            break;
        }
        case OUT_TYPE: {
            setOutType(value);
            break;
        }
        case CACL_TAX_TYPE: {
            setCaclTaxType(value);
            break;
        }
        case VENDOR_ID: {
            setVendorId(value);
            break;
        }
        case OUT_AMT: {
            value = StringUtils.stripToNull(value);
            setOutAmt(value == null ? null : new BigDecimal(value));
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
        case TAX_ENT_TYPE: {
            setTaxEntType(value);
            break;
        }
        case USAGE: {
            setUsage(value);
            break;
        }
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        case GOOD_CODE: {
            setGoodCode(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsVatITx set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsVatITx set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsVatITx set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof OdsVatITx)) {
            return false;
        }
        OdsVatITx rhs = (OdsVatITx) obj;
        return new EqualsBuilder()
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
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
        if (getTxId() != null) {
            builder.append("txId", getTxId());
        }
        if (getTxType() != null) {
            builder.append("txType", getTxType());
        }
        if (getTxCode() != null) {
            builder.append("txCode", getTxCode());
        }
        if (getSeqNo() != null) {
            builder.append("seqNo", getSeqNo());
        }
        if (getPayReqNo() != null) {
            builder.append("payReqNo", getPayReqNo());
        }
        if (getStatus() != null) {
            builder.append("status", getStatus());
        }
        if (getPayChl() != null) {
            builder.append("payChl", getPayChl());
        }
        if (getPayDate() != null) {
            builder.append("payDate", getPayDate());
        }
        if (getTxDate() != null) {
            builder.append("txDate", getTxDate());
        }
        if (getBizType() != null) {
            builder.append("bizType", getBizType());
        }
        if (getActNo() != null) {
            builder.append("actNo", getActNo());
        }
        if (getActType() != null) {
            builder.append("actType", getActType());
        }
        if (getTxAmt() != null) {
            builder.append("txAmt", getTxAmt());
        }
        if (getOAmt() != null) {
            builder.append("oAmt", getOAmt());
        }
        if (getCcy() != null) {
            builder.append("ccy", getCcy());
        }
        if (getExchageRate() != null) {
            builder.append("exchageRate", getExchageRate());
        }
        if (getSysId() != null) {
            builder.append("sysId", getSysId());
        }
        if (getTxName() != null) {
            builder.append("txName", getTxName());
        }
        if (getGoodName() != null) {
            builder.append("goodName", getGoodName());
        }
        if (getGoodType() != null) {
            builder.append("goodType", getGoodType());
        }
        if (getCntUnit() != null) {
            builder.append("cntUnit", getCntUnit());
        }
        if (getGoodNum() != null) {
            builder.append("goodNum", getGoodNum());
        }
        if (getGoodAmt() != null) {
            builder.append("goodAmt", getGoodAmt());
        }
        if (getContractType() != null) {
            builder.append("contractType", getContractType());
        }
        if (getVendorNo() != null) {
            builder.append("vendorNo", getVendorNo());
        }
        if (getVendorName() != null) {
            builder.append("vendorName", getVendorName());
        }
        if (getRefId() != null) {
            builder.append("refId", getRefId());
        }
        if (getVocCode() != null) {
            builder.append("vocCode", getVocCode());
        }
        if (getVocNo() != null) {
            builder.append("vocNo", getVocNo());
        }
        if (getVocId() != null) {
            builder.append("vocId", getVocId());
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
        if (getAmount() != null) {
            builder.append("amount", getAmount());
        }
        if (getIsTax() != null) {
            builder.append("isTax", getIsTax());
        }
        if (getTaxRate() != null) {
            builder.append("taxRate", getTaxRate());
        }
        if (getExpAmt() != null) {
            builder.append("expAmt", getExpAmt());
        }
        if (getTaxAmt() != null) {
            builder.append("taxAmt", getTaxAmt());
        }
        if (getHasVoc() != null) {
            builder.append("hasVoc", getHasVoc());
        }
        if (getDeductType() != null) {
            builder.append("deductType", getDeductType());
        }
        if (getOutType() != null) {
            builder.append("outType", getOutType());
        }
        if (getCaclTaxType() != null) {
            builder.append("caclTaxType", getCaclTaxType());
        }
        if (getVendorId() != null) {
            builder.append("vendorId", getVendorId());
        }
        if (getOutAmt() != null) {
            builder.append("outAmt", getOutAmt());
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
        if (getTaxEntType() != null) {
            builder.append("taxEntType", getTaxEntType());
        }
        if (getUsage() != null) {
            builder.append("usage", getUsage());
        }
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        if (getGoodCode() != null) {
            builder.append("goodCode", getGoodCode());
        }
        return builder.toString();
    }

    public OdsVatITx() {
        /* pass */
    }

    public OdsVatITx(Map<String, ?> map) {
        set(map);
    }

    public OdsVatITx(AbstractTable table) {
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
        TX_ID,
        TX_TYPE,
        TX_CODE,
        SEQ_NO,
        PAY_REQ_NO,
        STATUS,
        PAY_CHL,
        PAY_DATE,
        TX_DATE,
        BIZ_TYPE,
        ACT_NO,
        ACT_TYPE,
        TX_AMT,
        O_AMT,
        CCY,
        EXCHAGE_RATE,
        SYS_ID,
        TX_NAME,
        GOOD_NAME,
        GOOD_TYPE,
        CNT_UNIT,
        GOOD_NUM,
        GOOD_AMT,
        CONTRACT_TYPE,
        VENDOR_NO,
        VENDOR_NAME,
        REF_ID,
        VOC_CODE,
        VOC_NO,
        VOC_ID,
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
        AMOUNT,
        IS_TAX,
        TAX_RATE,
        EXP_AMT,
        TAX_AMT,
        HAS_VOC,
        DEDUCT_TYPE,
        OUT_TYPE,
        CACL_TAX_TYPE,
        VENDOR_ID,
        OUT_AMT,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        TAX_ENT_TYPE,
        USAGE,
        CHECK_ERR_TYPE,
        GOOD_CODE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
