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

public class OdsCsvVatOVoc extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String reqSeq;

    private String policyNo;

    private String txType;

    private String txCode;

    private String seqNo;

    private String txDate;

    private String entryNo;

    private String dcFlag;

    private BigDecimal txAmt;

    private BigDecimal amount;

    private String sysId;

    private String txName;

    private String goodName;

    private String goodType;

    private String cntUnit;

    private BigDecimal goodNum;

    private BigDecimal goodAmt;

    private BigDecimal insAmt;

    private String caclTaxType;

    private BigDecimal taxAmt;

    private BigDecimal taxRate;

    private String refId;

    private String custNo;

    private String nationalTaxNo;

    private String custName;

    private String custAddr;

    private String custTel;

    private String custBrName;

    private String custActNo;

    private String taxEntType;

    private String vocType;

    private String vocFlag;

    private String apvUser;

    private String vocDesc;

    private String sendType;

    private String impFileName;

    private String impTime;

    private String remarks;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

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

    public String getReqSeq() {
        return reqSeq;
    }

    public void setReqSeq(String reqSeq) {
        this.reqSeq = reqSeq == null ? null : reqSeq.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
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

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate == null ? null : txDate.trim();
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

    public BigDecimal getInsAmt() {
        return insAmt;
    }

    public void setInsAmt(BigDecimal insAmt) {
        this.insAmt = insAmt;
    }

    public String getCaclTaxType() {
        return caclTaxType;
    }

    public void setCaclTaxType(String caclTaxType) {
        this.caclTaxType = caclTaxType == null ? null : caclTaxType.trim();
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getNationalTaxNo() {
        return nationalTaxNo;
    }

    public void setNationalTaxNo(String nationalTaxNo) {
        this.nationalTaxNo = nationalTaxNo == null ? null : nationalTaxNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr == null ? null : custAddr.trim();
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel == null ? null : custTel.trim();
    }

    public String getCustBrName() {
        return custBrName;
    }

    public void setCustBrName(String custBrName) {
        this.custBrName = custBrName == null ? null : custBrName.trim();
    }

    public String getCustActNo() {
        return custActNo;
    }

    public void setCustActNo(String custActNo) {
        this.custActNo = custActNo == null ? null : custActNo.trim();
    }

    public String getTaxEntType() {
        return taxEntType;
    }

    public void setTaxEntType(String taxEntType) {
        this.taxEntType = taxEntType == null ? null : taxEntType.trim();
    }

    public String getVocType() {
        return vocType;
    }

    public void setVocType(String vocType) {
        this.vocType = vocType == null ? null : vocType.trim();
    }

    public String getVocFlag() {
        return vocFlag;
    }

    public void setVocFlag(String vocFlag) {
        this.vocFlag = vocFlag == null ? null : vocFlag.trim();
    }

    public String getApvUser() {
        return apvUser;
    }

    public void setApvUser(String apvUser) {
        this.apvUser = apvUser == null ? null : apvUser.trim();
    }

    public String getVocDesc() {
        return vocDesc;
    }

    public void setVocDesc(String vocDesc) {
        this.vocDesc = vocDesc == null ? null : vocDesc.trim();
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType == null ? null : sendType.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
        case REQ_SEQ: {
            return getReqSeq();
        }
        case POLICY_NO: {
            return getPolicyNo();
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
        case TX_DATE: {
            return getTxDate();
        }
        case ENTRY_NO: {
            return getEntryNo();
        }
        case DC_FLAG: {
            return getDcFlag();
        }
        case TX_AMT: {
            return (value = getTxAmt()) == null ? null : value.toString();
        }
        case AMOUNT: {
            return (value = getAmount()) == null ? null : value.toString();
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
        case INS_AMT: {
            return (value = getInsAmt()) == null ? null : value.toString();
        }
        case CACL_TAX_TYPE: {
            return getCaclTaxType();
        }
        case TAX_AMT: {
            return (value = getTaxAmt()) == null ? null : value.toString();
        }
        case TAX_RATE: {
            return (value = getTaxRate()) == null ? null : value.toString();
        }
        case REF_ID: {
            return getRefId();
        }
        case CUST_NO: {
            return getCustNo();
        }
        case NATIONAL_TAX_NO: {
            return getNationalTaxNo();
        }
        case CUST_NAME: {
            return getCustName();
        }
        case CUST_ADDR: {
            return getCustAddr();
        }
        case CUST_TEL: {
            return getCustTel();
        }
        case CUST_BR_NAME: {
            return getCustBrName();
        }
        case CUST_ACT_NO: {
            return getCustActNo();
        }
        case TAX_ENT_TYPE: {
            return getTaxEntType();
        }
        case VOC_TYPE: {
            return getVocType();
        }
        case VOC_FLAG: {
            return getVocFlag();
        }
        case APV_USER: {
            return getApvUser();
        }
        case VOC_DESC: {
            return getVocDesc();
        }
        case SEND_TYPE: {
            return getSendType();
        }
        case IMP_FILE_NAME: {
            return getImpFileName();
        }
        case IMP_TIME: {
            return getImpTime();
        }
        case REMARKS: {
            return getRemarks();
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

    public OdsCsvVatOVoc set(Column column, String value) {
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
        case REQ_SEQ: {
            setReqSeq(value);
            break;
        }
        case POLICY_NO: {
            setPolicyNo(value);
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
        case TX_DATE: {
            setTxDate(value);
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
        case INS_AMT: {
            value = StringUtils.stripToNull(value);
            setInsAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case CACL_TAX_TYPE: {
            setCaclTaxType(value);
            break;
        }
        case TAX_AMT: {
            value = StringUtils.stripToNull(value);
            setTaxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case TAX_RATE: {
            value = StringUtils.stripToNull(value);
            setTaxRate(value == null ? null : new BigDecimal(value));
            break;
        }
        case REF_ID: {
            setRefId(value);
            break;
        }
        case CUST_NO: {
            setCustNo(value);
            break;
        }
        case NATIONAL_TAX_NO: {
            setNationalTaxNo(value);
            break;
        }
        case CUST_NAME: {
            setCustName(value);
            break;
        }
        case CUST_ADDR: {
            setCustAddr(value);
            break;
        }
        case CUST_TEL: {
            setCustTel(value);
            break;
        }
        case CUST_BR_NAME: {
            setCustBrName(value);
            break;
        }
        case CUST_ACT_NO: {
            setCustActNo(value);
            break;
        }
        case TAX_ENT_TYPE: {
            setTaxEntType(value);
            break;
        }
        case VOC_TYPE: {
            setVocType(value);
            break;
        }
        case VOC_FLAG: {
            setVocFlag(value);
            break;
        }
        case APV_USER: {
            setApvUser(value);
            break;
        }
        case VOC_DESC: {
            setVocDesc(value);
            break;
        }
        case SEND_TYPE: {
            setSendType(value);
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
        case REMARKS: {
            setRemarks(value);
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
    public OdsCsvVatOVoc set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsCsvVatOVoc set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsCsvVatOVoc set(AbstractTable table) {
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
        } else if (!(obj instanceof OdsCsvVatOVoc)) {
            return false;
        }
        OdsCsvVatOVoc rhs = (OdsCsvVatOVoc) obj;
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
        if (getReqSeq() != null) {
            builder.append("reqSeq", getReqSeq());
        }
        if (getPolicyNo() != null) {
            builder.append("policyNo", getPolicyNo());
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
        if (getTxDate() != null) {
            builder.append("txDate", getTxDate());
        }
        if (getEntryNo() != null) {
            builder.append("entryNo", getEntryNo());
        }
        if (getDcFlag() != null) {
            builder.append("dcFlag", getDcFlag());
        }
        if (getTxAmt() != null) {
            builder.append("txAmt", getTxAmt());
        }
        if (getAmount() != null) {
            builder.append("amount", getAmount());
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
        if (getInsAmt() != null) {
            builder.append("insAmt", getInsAmt());
        }
        if (getCaclTaxType() != null) {
            builder.append("caclTaxType", getCaclTaxType());
        }
        if (getTaxAmt() != null) {
            builder.append("taxAmt", getTaxAmt());
        }
        if (getTaxRate() != null) {
            builder.append("taxRate", getTaxRate());
        }
        if (getRefId() != null) {
            builder.append("refId", getRefId());
        }
        if (getCustNo() != null) {
            builder.append("custNo", getCustNo());
        }
        if (getNationalTaxNo() != null) {
            builder.append("nationalTaxNo", getNationalTaxNo());
        }
        if (getCustName() != null) {
            builder.append("custName", getCustName());
        }
        if (getCustAddr() != null) {
            builder.append("custAddr", getCustAddr());
        }
        if (getCustTel() != null) {
            builder.append("custTel", getCustTel());
        }
        if (getCustBrName() != null) {
            builder.append("custBrName", getCustBrName());
        }
        if (getCustActNo() != null) {
            builder.append("custActNo", getCustActNo());
        }
        if (getTaxEntType() != null) {
            builder.append("taxEntType", getTaxEntType());
        }
        if (getVocType() != null) {
            builder.append("vocType", getVocType());
        }
        if (getVocFlag() != null) {
            builder.append("vocFlag", getVocFlag());
        }
        if (getApvUser() != null) {
            builder.append("apvUser", getApvUser());
        }
        if (getVocDesc() != null) {
            builder.append("vocDesc", getVocDesc());
        }
        if (getSendType() != null) {
            builder.append("sendType", getSendType());
        }
        if (getImpFileName() != null) {
            builder.append("impFileName", getImpFileName());
        }
        if (getImpTime() != null) {
            builder.append("impTime", getImpTime());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
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
        if (getGoodCode() != null) {
            builder.append("goodCode", getGoodCode());
        }
        return builder.toString();
    }

    public OdsCsvVatOVoc() {
        /* pass */
    }

    public OdsCsvVatOVoc(Map<String, ?> map) {
        set(map);
    }

    public OdsCsvVatOVoc(AbstractTable table) {
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
        REQ_SEQ,
        POLICY_NO,
        TX_TYPE,
        TX_CODE,
        SEQ_NO,
        TX_DATE,
        ENTRY_NO,
        DC_FLAG,
        TX_AMT,
        AMOUNT,
        SYS_ID,
        TX_NAME,
        GOOD_NAME,
        GOOD_TYPE,
        CNT_UNIT,
        GOOD_NUM,
        GOOD_AMT,
        INS_AMT,
        CACL_TAX_TYPE,
        TAX_AMT,
        TAX_RATE,
        REF_ID,
        CUST_NO,
        NATIONAL_TAX_NO,
        CUST_NAME,
        CUST_ADDR,
        CUST_TEL,
        CUST_BR_NAME,
        CUST_ACT_NO,
        TAX_ENT_TYPE,
        VOC_TYPE,
        VOC_FLAG,
        APV_USER,
        VOC_DESC,
        SEND_TYPE,
        IMP_FILE_NAME,
        IMP_TIME,
        REMARKS,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
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
