package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsXlsVatITx extends AbstractTable {
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String txId;

    private String brno;

    private String seqNo;

    private String txDate;

    private String sysCode;

    private String txCode;

    private String entryNo;

    private String actNo;

    private String custBrno;

    private String custNo;

    private String custActNo;

    private String prodType;

    private String prodCode;

    private BigDecimal txAmt;

    private String ccy;

    private String remarks;

    private String reverseFlag;

    private String oriTxId;

    private String oriSeqNo;

    private String oriTxDate;

    private String refNo;

    private String opUser;

    private String opSsn;

    private String checkFlag;

    private String checkDesc;

    private String checkErrType;

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

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

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

    public String getBrno() {
        return brno;
    }

    public void setBrno(String brno) {
        this.brno = brno == null ? null : brno.trim();
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

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getTxCode() {
        return txCode;
    }

    public void setTxCode(String txCode) {
        this.txCode = txCode == null ? null : txCode.trim();
    }

    public String getEntryNo() {
        return entryNo;
    }

    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo == null ? null : entryNo.trim();
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo == null ? null : actNo.trim();
    }

    public String getCustBrno() {
        return custBrno;
    }

    public void setCustBrno(String custBrno) {
        this.custBrno = custBrno == null ? null : custBrno.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getCustActNo() {
        return custActNo;
    }

    public void setCustActNo(String custActNo) {
        this.custActNo = custActNo == null ? null : custActNo.trim();
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType == null ? null : prodType.trim();
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public BigDecimal getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(BigDecimal txAmt) {
        this.txAmt = txAmt;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getReverseFlag() {
        return reverseFlag;
    }

    public void setReverseFlag(String reverseFlag) {
        this.reverseFlag = reverseFlag == null ? null : reverseFlag.trim();
    }

    public String getOriTxId() {
        return oriTxId;
    }

    public void setOriTxId(String oriTxId) {
        this.oriTxId = oriTxId == null ? null : oriTxId.trim();
    }

    public String getOriSeqNo() {
        return oriSeqNo;
    }

    public void setOriSeqNo(String oriSeqNo) {
        this.oriSeqNo = oriSeqNo == null ? null : oriSeqNo.trim();
    }

    public String getOriTxDate() {
        return oriTxDate;
    }

    public void setOriTxDate(String oriTxDate) {
        this.oriTxDate = oriTxDate == null ? null : oriTxDate.trim();
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }

    public String getOpSsn() {
        return opSsn;
    }

    public void setOpSsn(String opSsn) {
        this.opSsn = opSsn == null ? null : opSsn.trim();
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

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
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
        case BRNO: {
            return getBrno();
        }
        case SEQ_NO: {
            return getSeqNo();
        }
        case TX_DATE: {
            return getTxDate();
        }
        case SYS_CODE: {
            return getSysCode();
        }
        case TX_CODE: {
            return getTxCode();
        }
        case ENTRY_NO: {
            return getEntryNo();
        }
        case ACT_NO: {
            return getActNo();
        }
        case CUST_BRNO: {
            return getCustBrno();
        }
        case CUST_NO: {
            return getCustNo();
        }
        case CUST_ACT_NO: {
            return getCustActNo();
        }
        case PROD_TYPE: {
            return getProdType();
        }
        case PROD_CODE: {
            return getProdCode();
        }
        case TX_AMT: {
            return (value = getTxAmt()) == null ? null : value.toString();
        }
        case CCY: {
            return getCcy();
        }
        case REMARKS: {
            return getRemarks();
        }
        case REVERSE_FLAG: {
            return getReverseFlag();
        }
        case ORI_TX_ID: {
            return getOriTxId();
        }
        case ORI_SEQ_NO: {
            return getOriSeqNo();
        }
        case ORI_TX_DATE: {
            return getOriTxDate();
        }
        case REF_NO: {
            return getRefNo();
        }
        case OP_USER: {
            return getOpUser();
        }
        case OP_SSN: {
            return getOpSsn();
        }
        case CHECK_FLAG: {
            return getCheckFlag();
        }
        case CHECK_DESC: {
            return getCheckDesc();
        }
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
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

    public OdsXlsVatITx set(Column column, String value) {
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
        case BRNO: {
            setBrno(value);
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
        case SYS_CODE: {
            setSysCode(value);
            break;
        }
        case TX_CODE: {
            setTxCode(value);
            break;
        }
        case ENTRY_NO: {
            setEntryNo(value);
            break;
        }
        case ACT_NO: {
            setActNo(value);
            break;
        }
        case CUST_BRNO: {
            setCustBrno(value);
            break;
        }
        case CUST_NO: {
            setCustNo(value);
            break;
        }
        case CUST_ACT_NO: {
            setCustActNo(value);
            break;
        }
        case PROD_TYPE: {
            setProdType(value);
            break;
        }
        case PROD_CODE: {
            setProdCode(value);
            break;
        }
        case TX_AMT: {
            value = StringUtils.stripToNull(value);
            setTxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case CCY: {
            setCcy(value);
            break;
        }
        case REMARKS: {
            setRemarks(value);
            break;
        }
        case REVERSE_FLAG: {
            setReverseFlag(value);
            break;
        }
        case ORI_TX_ID: {
            setOriTxId(value);
            break;
        }
        case ORI_SEQ_NO: {
            setOriSeqNo(value);
            break;
        }
        case ORI_TX_DATE: {
            setOriTxDate(value);
            break;
        }
        case REF_NO: {
            setRefNo(value);
            break;
        }
        case OP_USER: {
            setOpUser(value);
            break;
        }
        case OP_SSN: {
            setOpSsn(value);
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
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
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
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsXlsVatITx set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsXlsVatITx set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsXlsVatITx set(AbstractTable table) {
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
        } else if (!(obj instanceof OdsXlsVatITx)) {
            return false;
        }
        OdsXlsVatITx rhs = (OdsXlsVatITx) obj;
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
        if (getBrno() != null) {
            builder.append("brno", getBrno());
        }
        if (getSeqNo() != null) {
            builder.append("seqNo", getSeqNo());
        }
        if (getTxDate() != null) {
            builder.append("txDate", getTxDate());
        }
        if (getSysCode() != null) {
            builder.append("sysCode", getSysCode());
        }
        if (getTxCode() != null) {
            builder.append("txCode", getTxCode());
        }
        if (getEntryNo() != null) {
            builder.append("entryNo", getEntryNo());
        }
        if (getActNo() != null) {
            builder.append("actNo", getActNo());
        }
        if (getCustBrno() != null) {
            builder.append("custBrno", getCustBrno());
        }
        if (getCustNo() != null) {
            builder.append("custNo", getCustNo());
        }
        if (getCustActNo() != null) {
            builder.append("custActNo", getCustActNo());
        }
        if (getProdType() != null) {
            builder.append("prodType", getProdType());
        }
        if (getProdCode() != null) {
            builder.append("prodCode", getProdCode());
        }
        if (getTxAmt() != null) {
            builder.append("txAmt", getTxAmt());
        }
        if (getCcy() != null) {
            builder.append("ccy", getCcy());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
        }
        if (getReverseFlag() != null) {
            builder.append("reverseFlag", getReverseFlag());
        }
        if (getOriTxId() != null) {
            builder.append("oriTxId", getOriTxId());
        }
        if (getOriSeqNo() != null) {
            builder.append("oriSeqNo", getOriSeqNo());
        }
        if (getOriTxDate() != null) {
            builder.append("oriTxDate", getOriTxDate());
        }
        if (getRefNo() != null) {
            builder.append("refNo", getRefNo());
        }
        if (getOpUser() != null) {
            builder.append("opUser", getOpUser());
        }
        if (getOpSsn() != null) {
            builder.append("opSsn", getOpSsn());
        }
        if (getCheckFlag() != null) {
            builder.append("checkFlag", getCheckFlag());
        }
        if (getCheckDesc() != null) {
            builder.append("checkDesc", getCheckDesc());
        }
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
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
        return builder.toString();
    }

    public OdsXlsVatITx() {
        /* pass */
    }

    public OdsXlsVatITx(Map<String, ?> map) {
        set(map);
    }

    public OdsXlsVatITx(AbstractTable table) {
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
        BRNO,
        SEQ_NO,
        TX_DATE,
        SYS_CODE,
        TX_CODE,
        ENTRY_NO,
        ACT_NO,
        CUST_BRNO,
        CUST_NO,
        CUST_ACT_NO,
        PROD_TYPE,
        PROD_CODE,
        TX_AMT,
        CCY,
        REMARKS,
        REVERSE_FLAG,
        ORI_TX_ID,
        ORI_SEQ_NO,
        ORI_TX_DATE,
        REF_NO,
        OP_USER,
        OP_SSN,
        CHECK_FLAG,
        CHECK_DESC,
        CHECK_ERR_TYPE,
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
        EXT1,
        EXT2,
        EXT3,
        EXT4,
        EXT5;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
