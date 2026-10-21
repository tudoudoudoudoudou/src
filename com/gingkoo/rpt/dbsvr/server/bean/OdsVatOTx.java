package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsVatOTx extends AbstractTable {
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String txId;

    private String txType;

    private String sysCode;

    private String seqNo;

    private String txDate;

    private String bizType;

    private String actNo;

    private String actType;

    private BigDecimal txAmt;

    private BigDecimal amount;

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

    private String hasTax;

    private String contractType;

    private String custBrno;

    private String custName;

    private String refId;

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

    private String needVocFlag;

    private String vocFlag;

    private BigDecimal taxAmt;

    private String caclTaxType;

    private String impFileName;

    private String impTime;

    private BigDecimal insAmt;

    private BigDecimal taxRate;

    private String identifyFlag;

    private String txStatus;

    private String revTxid;

    private String revSeqno;

    private String revBrno;

    private String revDate;

    private BigDecimal revAmt;

    private BigDecimal revOAmt;

    private String isCalcTax;

    private String receiptFlag;

    private String entryNo;

    private String dcFlag;

    private String isLikesale;

    private String nationalTaxNo;

    private String custId;

    private String handIdentifyFlag;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String taxEntType;

    private String checkErrType;

    private String brno;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private String opSsn;

    private String opUser;

    private String refNo;

    private String oriTxDate;

    private String oriSeqNo;

    private String reverseFlag;

    private String remarks;

    private BigDecimal priceAmt;

    private BigDecimal num;

    private String prodCode;

    private String prodType;

    private String custNo;

    private BigDecimal incomeAmt;

    private String txCode;

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

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getHasTax() {
        return hasTax;
    }

    public void setHasTax(String hasTax) {
        this.hasTax = hasTax == null ? null : hasTax.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getCustBrno() {
        return custBrno;
    }

    public void setCustBrno(String custBrno) {
        this.custBrno = custBrno == null ? null : custBrno.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
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

    public String getNeedVocFlag() {
        return needVocFlag;
    }

    public void setNeedVocFlag(String needVocFlag) {
        this.needVocFlag = needVocFlag == null ? null : needVocFlag.trim();
    }

    public String getVocFlag() {
        return vocFlag;
    }

    public void setVocFlag(String vocFlag) {
        this.vocFlag = vocFlag == null ? null : vocFlag.trim();
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getCaclTaxType() {
        return caclTaxType;
    }

    public void setCaclTaxType(String caclTaxType) {
        this.caclTaxType = caclTaxType == null ? null : caclTaxType.trim();
    }

    public String getImpFileName() {
        return impFileName;
    }

    public void setImpFileName(String impFileName) {
        this.impFileName = impFileName == null ? null : impFileName.trim();
    }

    public String getImpTime() {
        return impTime;
    }

    public void setImpTime(String impTime) {
        this.impTime = impTime == null ? null : impTime.trim();
    }

    public BigDecimal getInsAmt() {
        return insAmt;
    }

    public void setInsAmt(BigDecimal insAmt) {
        this.insAmt = insAmt;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getIdentifyFlag() {
        return identifyFlag;
    }

    public void setIdentifyFlag(String identifyFlag) {
        this.identifyFlag = identifyFlag == null ? null : identifyFlag.trim();
    }

    public String getTxStatus() {
        return txStatus;
    }

    public void setTxStatus(String txStatus) {
        this.txStatus = txStatus == null ? null : txStatus.trim();
    }

    public String getRevTxid() {
        return revTxid;
    }

    public void setRevTxid(String revTxid) {
        this.revTxid = revTxid == null ? null : revTxid.trim();
    }

    public String getRevSeqno() {
        return revSeqno;
    }

    public void setRevSeqno(String revSeqno) {
        this.revSeqno = revSeqno == null ? null : revSeqno.trim();
    }

    public String getRevBrno() {
        return revBrno;
    }

    public void setRevBrno(String revBrno) {
        this.revBrno = revBrno == null ? null : revBrno.trim();
    }

    public String getRevDate() {
        return revDate;
    }

    public void setRevDate(String revDate) {
        this.revDate = revDate == null ? null : revDate.trim();
    }

    public BigDecimal getRevAmt() {
        return revAmt;
    }

    public void setRevAmt(BigDecimal revAmt) {
        this.revAmt = revAmt;
    }

    public BigDecimal getRevOAmt() {
        return revOAmt;
    }

    public void setRevOAmt(BigDecimal revOAmt) {
        this.revOAmt = revOAmt;
    }

    public String getIsCalcTax() {
        return isCalcTax;
    }

    public void setIsCalcTax(String isCalcTax) {
        this.isCalcTax = isCalcTax == null ? null : isCalcTax.trim();
    }

    public String getReceiptFlag() {
        return receiptFlag;
    }

    public void setReceiptFlag(String receiptFlag) {
        this.receiptFlag = receiptFlag == null ? null : receiptFlag.trim();
    }

    public String getEntryNo() {
        return entryNo;
    }

    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo == null ? null : entryNo.trim();
    }

    public String getDcFlag() {
        return dcFlag;
    }

    public void setDcFlag(String dcFlag) {
        this.dcFlag = dcFlag == null ? null : dcFlag.trim();
    }

    public String getIsLikesale() {
        return isLikesale;
    }

    public void setIsLikesale(String isLikesale) {
        this.isLikesale = isLikesale == null ? null : isLikesale.trim();
    }

    public String getNationalTaxNo() {
        return nationalTaxNo;
    }

    public void setNationalTaxNo(String nationalTaxNo) {
        this.nationalTaxNo = nationalTaxNo == null ? null : nationalTaxNo.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getHandIdentifyFlag() {
        return handIdentifyFlag;
    }

    public void setHandIdentifyFlag(String handIdentifyFlag) {
        this.handIdentifyFlag = handIdentifyFlag == null ? null : handIdentifyFlag.trim();
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

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    public String getBrno() {
        return brno;
    }

    public void setBrno(String brno) {
        this.brno = brno == null ? null : brno.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5 == null ? null : ext5.trim();
    }

    public String getOpSsn() {
        return opSsn;
    }

    public void setOpSsn(String opSsn) {
        this.opSsn = opSsn == null ? null : opSsn.trim();
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public String getOriTxDate() {
        return oriTxDate;
    }

    public void setOriTxDate(String oriTxDate) {
        this.oriTxDate = oriTxDate == null ? null : oriTxDate.trim();
    }

    public String getOriSeqNo() {
        return oriSeqNo;
    }

    public void setOriSeqNo(String oriSeqNo) {
        this.oriSeqNo = oriSeqNo == null ? null : oriSeqNo.trim();
    }

    public String getReverseFlag() {
        return reverseFlag;
    }

    public void setReverseFlag(String reverseFlag) {
        this.reverseFlag = reverseFlag == null ? null : reverseFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public BigDecimal getPriceAmt() {
        return priceAmt;
    }

    public void setPriceAmt(BigDecimal priceAmt) {
        this.priceAmt = priceAmt;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType == null ? null : prodType.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public BigDecimal getIncomeAmt() {
        return incomeAmt;
    }

    public void setIncomeAmt(BigDecimal incomeAmt) {
        this.incomeAmt = incomeAmt;
    }

    public String getTxCode() {
        return txCode;
    }

    public void setTxCode(String txCode) {
        this.txCode = txCode == null ? null : txCode.trim();
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
        case SYS_CODE: {
            return getSysCode();
        }
        case SEQ_NO: {
            return getSeqNo();
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
        case AMOUNT: {
            return (value = getAmount()) == null ? null : value.toString();
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
        case HAS_TAX: {
            return getHasTax();
        }
        case CONTRACT_TYPE: {
            return getContractType();
        }
        case CUST_BRNO: {
            return getCustBrno();
        }
        case CUST_NAME: {
            return getCustName();
        }
        case REF_ID: {
            return getRefId();
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
        case NEED_VOC_FLAG: {
            return getNeedVocFlag();
        }
        case VOC_FLAG: {
            return getVocFlag();
        }
        case TAX_AMT: {
            return (value = getTaxAmt()) == null ? null : value.toString();
        }
        case CACL_TAX_TYPE: {
            return getCaclTaxType();
        }
        case IMP_FILE_NAME: {
            return getImpFileName();
        }
        case IMP_TIME: {
            return getImpTime();
        }
        case INS_AMT: {
            return (value = getInsAmt()) == null ? null : value.toString();
        }
        case TAX_RATE: {
            return (value = getTaxRate()) == null ? null : value.toString();
        }
        case IDENTIFY_FLAG: {
            return getIdentifyFlag();
        }
        case TX_STATUS: {
            return getTxStatus();
        }
        case REV_TXID: {
            return getRevTxid();
        }
        case REV_SEQNO: {
            return getRevSeqno();
        }
        case REV_BRNO: {
            return getRevBrno();
        }
        case REV_DATE: {
            return getRevDate();
        }
        case REV_AMT: {
            return (value = getRevAmt()) == null ? null : value.toString();
        }
        case REV_O_AMT: {
            return (value = getRevOAmt()) == null ? null : value.toString();
        }
        case IS_CALC_TAX: {
            return getIsCalcTax();
        }
        case RECEIPT_FLAG: {
            return getReceiptFlag();
        }
        case ENTRY_NO: {
            return getEntryNo();
        }
        case DC_FLAG: {
            return getDcFlag();
        }
        case IS_LIKESALE: {
            return getIsLikesale();
        }
        case NATIONAL_TAX_NO: {
            return getNationalTaxNo();
        }
        case CUST_ID: {
            return getCustId();
        }
        case HAND_IDENTIFY_FLAG: {
            return getHandIdentifyFlag();
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
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
        }
        case BRNO: {
            return getBrno();
        }
        case EXT1: {
            return getExt1();
        }
        case EXT2: {
            return getExt2();
        }
        case EXT3: {
            return getExt3();
        }
        case EXT4: {
            return getExt4();
        }
        case EXT5: {
            return getExt5();
        }
        case OP_SSN: {
            return getOpSsn();
        }
        case OP_USER: {
            return getOpUser();
        }
        case REF_NO: {
            return getRefNo();
        }
        case ORI_TX_DATE: {
            return getOriTxDate();
        }
        case ORI_SEQ_NO: {
            return getOriSeqNo();
        }
        case REVERSE_FLAG: {
            return getReverseFlag();
        }
        case REMARKS: {
            return getRemarks();
        }
        case PRICE_AMT: {
            return (value = getPriceAmt()) == null ? null : value.toString();
        }
        case NUM: {
            return (value = getNum()) == null ? null : value.toString();
        }
        case PROD_CODE: {
            return getProdCode();
        }
        case PROD_TYPE: {
            return getProdType();
        }
        case CUST_NO: {
            return getCustNo();
        }
        case INCOME_AMT: {
            return (value = getIncomeAmt()) == null ? null : value.toString();
        }
        case TX_CODE: {
            return getTxCode();
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

    public OdsVatOTx set(Column column, String value) {
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
        case SYS_CODE: {
            setSysCode(value);
            break;
        }
        case SEQ_NO: {
            setSeqNo(value);
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
        case AMOUNT: {
            value = StringUtils.stripToNull(value);
            setAmount(value == null ? null : new BigDecimal(value));
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
        case HAS_TAX: {
            setHasTax(value);
            break;
        }
        case CONTRACT_TYPE: {
            setContractType(value);
            break;
        }
        case CUST_BRNO: {
            setCustBrno(value);
            break;
        }
        case CUST_NAME: {
            setCustName(value);
            break;
        }
        case REF_ID: {
            setRefId(value);
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
        case NEED_VOC_FLAG: {
            setNeedVocFlag(value);
            break;
        }
        case VOC_FLAG: {
            setVocFlag(value);
            break;
        }
        case TAX_AMT: {
            value = StringUtils.stripToNull(value);
            setTaxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case CACL_TAX_TYPE: {
            setCaclTaxType(value);
            break;
        }
        case IMP_FILE_NAME: {
            setImpFileName(value);
            break;
        }
        case IMP_TIME: {
            setImpTime(value);
            break;
        }
        case INS_AMT: {
            value = StringUtils.stripToNull(value);
            setInsAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case TAX_RATE: {
            value = StringUtils.stripToNull(value);
            setTaxRate(value == null ? null : new BigDecimal(value));
            break;
        }
        case IDENTIFY_FLAG: {
            setIdentifyFlag(value);
            break;
        }
        case TX_STATUS: {
            setTxStatus(value);
            break;
        }
        case REV_TXID: {
            setRevTxid(value);
            break;
        }
        case REV_SEQNO: {
            setRevSeqno(value);
            break;
        }
        case REV_BRNO: {
            setRevBrno(value);
            break;
        }
        case REV_DATE: {
            setRevDate(value);
            break;
        }
        case REV_AMT: {
            value = StringUtils.stripToNull(value);
            setRevAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case REV_O_AMT: {
            value = StringUtils.stripToNull(value);
            setRevOAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case IS_CALC_TAX: {
            setIsCalcTax(value);
            break;
        }
        case RECEIPT_FLAG: {
            setReceiptFlag(value);
            break;
        }
        case ENTRY_NO: {
            setEntryNo(value);
            break;
        }
        case DC_FLAG: {
            setDcFlag(value);
            break;
        }
        case IS_LIKESALE: {
            setIsLikesale(value);
            break;
        }
        case NATIONAL_TAX_NO: {
            setNationalTaxNo(value);
            break;
        }
        case CUST_ID: {
            setCustId(value);
            break;
        }
        case HAND_IDENTIFY_FLAG: {
            setHandIdentifyFlag(value);
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
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        case BRNO: {
            setBrno(value);
            break;
        }
        case EXT1: {
            setExt1(value);
            break;
        }
        case EXT2: {
            setExt2(value);
            break;
        }
        case EXT3: {
            setExt3(value);
            break;
        }
        case EXT4: {
            setExt4(value);
            break;
        }
        case EXT5: {
            setExt5(value);
            break;
        }
        case OP_SSN: {
            setOpSsn(value);
            break;
        }
        case OP_USER: {
            setOpUser(value);
            break;
        }
        case REF_NO: {
            setRefNo(value);
            break;
        }
        case ORI_TX_DATE: {
            setOriTxDate(value);
            break;
        }
        case ORI_SEQ_NO: {
            setOriSeqNo(value);
            break;
        }
        case REVERSE_FLAG: {
            setReverseFlag(value);
            break;
        }
        case REMARKS: {
            setRemarks(value);
            break;
        }
        case PRICE_AMT: {
            value = StringUtils.stripToNull(value);
            setPriceAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case NUM: {
            value = StringUtils.stripToNull(value);
            setNum(value == null ? null : new BigDecimal(value));
            break;
        }
        case PROD_CODE: {
            setProdCode(value);
            break;
        }
        case PROD_TYPE: {
            setProdType(value);
            break;
        }
        case CUST_NO: {
            setCustNo(value);
            break;
        }
        case INCOME_AMT: {
            value = StringUtils.stripToNull(value);
            setIncomeAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case TX_CODE: {
            setTxCode(value);
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
    public OdsVatOTx set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsVatOTx set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsVatOTx set(AbstractTable table) {
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
        } else if (!(obj instanceof OdsVatOTx)) {
            return false;
        }
        OdsVatOTx rhs = (OdsVatOTx) obj;
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
        if (getSysCode() != null) {
            builder.append("sysCode", getSysCode());
        }
        if (getSeqNo() != null) {
            builder.append("seqNo", getSeqNo());
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
        if (getAmount() != null) {
            builder.append("amount", getAmount());
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
        if (getHasTax() != null) {
            builder.append("hasTax", getHasTax());
        }
        if (getContractType() != null) {
            builder.append("contractType", getContractType());
        }
        if (getCustBrno() != null) {
            builder.append("custBrno", getCustBrno());
        }
        if (getCustName() != null) {
            builder.append("custName", getCustName());
        }
        if (getRefId() != null) {
            builder.append("refId", getRefId());
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
        if (getNeedVocFlag() != null) {
            builder.append("needVocFlag", getNeedVocFlag());
        }
        if (getVocFlag() != null) {
            builder.append("vocFlag", getVocFlag());
        }
        if (getTaxAmt() != null) {
            builder.append("taxAmt", getTaxAmt());
        }
        if (getCaclTaxType() != null) {
            builder.append("caclTaxType", getCaclTaxType());
        }
        if (getImpFileName() != null) {
            builder.append("impFileName", getImpFileName());
        }
        if (getImpTime() != null) {
            builder.append("impTime", getImpTime());
        }
        if (getInsAmt() != null) {
            builder.append("insAmt", getInsAmt());
        }
        if (getTaxRate() != null) {
            builder.append("taxRate", getTaxRate());
        }
        if (getIdentifyFlag() != null) {
            builder.append("identifyFlag", getIdentifyFlag());
        }
        if (getTxStatus() != null) {
            builder.append("txStatus", getTxStatus());
        }
        if (getRevTxid() != null) {
            builder.append("revTxid", getRevTxid());
        }
        if (getRevSeqno() != null) {
            builder.append("revSeqno", getRevSeqno());
        }
        if (getRevBrno() != null) {
            builder.append("revBrno", getRevBrno());
        }
        if (getRevDate() != null) {
            builder.append("revDate", getRevDate());
        }
        if (getRevAmt() != null) {
            builder.append("revAmt", getRevAmt());
        }
        if (getRevOAmt() != null) {
            builder.append("revOAmt", getRevOAmt());
        }
        if (getIsCalcTax() != null) {
            builder.append("isCalcTax", getIsCalcTax());
        }
        if (getReceiptFlag() != null) {
            builder.append("receiptFlag", getReceiptFlag());
        }
        if (getEntryNo() != null) {
            builder.append("entryNo", getEntryNo());
        }
        if (getDcFlag() != null) {
            builder.append("dcFlag", getDcFlag());
        }
        if (getIsLikesale() != null) {
            builder.append("isLikesale", getIsLikesale());
        }
        if (getNationalTaxNo() != null) {
            builder.append("nationalTaxNo", getNationalTaxNo());
        }
        if (getCustId() != null) {
            builder.append("custId", getCustId());
        }
        if (getHandIdentifyFlag() != null) {
            builder.append("handIdentifyFlag", getHandIdentifyFlag());
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
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        if (getBrno() != null) {
            builder.append("brno", getBrno());
        }
        if (getExt1() != null) {
            builder.append("ext1", getExt1());
        }
        if (getExt2() != null) {
            builder.append("ext2", getExt2());
        }
        if (getExt3() != null) {
            builder.append("ext3", getExt3());
        }
        if (getExt4() != null) {
            builder.append("ext4", getExt4());
        }
        if (getExt5() != null) {
            builder.append("ext5", getExt5());
        }
        if (getOpSsn() != null) {
            builder.append("opSsn", getOpSsn());
        }
        if (getOpUser() != null) {
            builder.append("opUser", getOpUser());
        }
        if (getRefNo() != null) {
            builder.append("refNo", getRefNo());
        }
        if (getOriTxDate() != null) {
            builder.append("oriTxDate", getOriTxDate());
        }
        if (getOriSeqNo() != null) {
            builder.append("oriSeqNo", getOriSeqNo());
        }
        if (getReverseFlag() != null) {
            builder.append("reverseFlag", getReverseFlag());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
        }
        if (getPriceAmt() != null) {
            builder.append("priceAmt", getPriceAmt());
        }
        if (getNum() != null) {
            builder.append("num", getNum());
        }
        if (getProdCode() != null) {
            builder.append("prodCode", getProdCode());
        }
        if (getProdType() != null) {
            builder.append("prodType", getProdType());
        }
        if (getCustNo() != null) {
            builder.append("custNo", getCustNo());
        }
        if (getIncomeAmt() != null) {
            builder.append("incomeAmt", getIncomeAmt());
        }
        if (getTxCode() != null) {
            builder.append("txCode", getTxCode());
        }
        if (getGoodCode() != null) {
            builder.append("goodCode", getGoodCode());
        }
        return builder.toString();
    }

    public OdsVatOTx() {
        /* pass */
    }

    public OdsVatOTx(Map<String, ?> map) {
        set(map);
    }

    public OdsVatOTx(AbstractTable table) {
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
        SYS_CODE,
        SEQ_NO,
        TX_DATE,
        BIZ_TYPE,
        ACT_NO,
        ACT_TYPE,
        TX_AMT,
        AMOUNT,
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
        HAS_TAX,
        CONTRACT_TYPE,
        CUST_BRNO,
        CUST_NAME,
        REF_ID,
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
        NEED_VOC_FLAG,
        VOC_FLAG,
        TAX_AMT,
        CACL_TAX_TYPE,
        IMP_FILE_NAME,
        IMP_TIME,
        INS_AMT,
        TAX_RATE,
        IDENTIFY_FLAG,
        TX_STATUS,
        REV_TXID,
        REV_SEQNO,
        REV_BRNO,
        REV_DATE,
        REV_AMT,
        REV_O_AMT,
        IS_CALC_TAX,
        RECEIPT_FLAG,
        ENTRY_NO,
        DC_FLAG,
        IS_LIKESALE,
        NATIONAL_TAX_NO,
        CUST_ID,
        HAND_IDENTIFY_FLAG,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        TAX_ENT_TYPE,
        CHECK_ERR_TYPE,
        BRNO,
        EXT1,
        EXT2,
        EXT3,
        EXT4,
        EXT5,
        OP_SSN,
        OP_USER,
        REF_NO,
        ORI_TX_DATE,
        ORI_SEQ_NO,
        REVERSE_FLAG,
        REMARKS,
        PRICE_AMT,
        NUM,
        PROD_CODE,
        PROD_TYPE,
        CUST_NO,
        INCOME_AMT,
        TX_CODE,
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
