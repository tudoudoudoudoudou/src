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

public class HisVatTaxRptA1 extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String boucMonth;

    private String itemName;

    private BigDecimal itemNo;

    private BigDecimal s1Amt;

    private BigDecimal t1Amt;

    private BigDecimal s2Amt;

    private BigDecimal t2Amt;

    private BigDecimal s3Amt;

    private BigDecimal t3Amt;

    private BigDecimal s4Amt;

    private BigDecimal t4Amt;

    private BigDecimal s5Amt;

    private BigDecimal t5Amt;

    private BigDecimal totalAmt;

    private BigDecimal deduAmt;

    private BigDecimal s7Amt;

    private BigDecimal t7Amt;

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

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public BigDecimal getItemNo() {
        return itemNo;
    }

    public void setItemNo(BigDecimal itemNo) {
        this.itemNo = itemNo;
    }

    public BigDecimal getS1Amt() {
        return s1Amt;
    }

    public void setS1Amt(BigDecimal s1Amt) {
        this.s1Amt = s1Amt;
    }

    public BigDecimal getT1Amt() {
        return t1Amt;
    }

    public void setT1Amt(BigDecimal t1Amt) {
        this.t1Amt = t1Amt;
    }

    public BigDecimal getS2Amt() {
        return s2Amt;
    }

    public void setS2Amt(BigDecimal s2Amt) {
        this.s2Amt = s2Amt;
    }

    public BigDecimal getT2Amt() {
        return t2Amt;
    }

    public void setT2Amt(BigDecimal t2Amt) {
        this.t2Amt = t2Amt;
    }

    public BigDecimal getS3Amt() {
        return s3Amt;
    }

    public void setS3Amt(BigDecimal s3Amt) {
        this.s3Amt = s3Amt;
    }

    public BigDecimal getT3Amt() {
        return t3Amt;
    }

    public void setT3Amt(BigDecimal t3Amt) {
        this.t3Amt = t3Amt;
    }

    public BigDecimal getS4Amt() {
        return s4Amt;
    }

    public void setS4Amt(BigDecimal s4Amt) {
        this.s4Amt = s4Amt;
    }

    public BigDecimal getT4Amt() {
        return t4Amt;
    }

    public void setT4Amt(BigDecimal t4Amt) {
        this.t4Amt = t4Amt;
    }

    public BigDecimal getS5Amt() {
        return s5Amt;
    }

    public void setS5Amt(BigDecimal s5Amt) {
        this.s5Amt = s5Amt;
    }

    public BigDecimal getT5Amt() {
        return t5Amt;
    }

    public void setT5Amt(BigDecimal t5Amt) {
        this.t5Amt = t5Amt;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public BigDecimal getDeduAmt() {
        return deduAmt;
    }

    public void setDeduAmt(BigDecimal deduAmt) {
        this.deduAmt = deduAmt;
    }

    public BigDecimal getS7Amt() {
        return s7Amt;
    }

    public void setS7Amt(BigDecimal s7Amt) {
        this.s7Amt = s7Amt;
    }

    public BigDecimal getT7Amt() {
        return t7Amt;
    }

    public void setT7Amt(BigDecimal t7Amt) {
        this.t7Amt = t7Amt;
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
        case ITEM_NAME: {
            return getItemName();
        }
        case ITEM_NO: {
            return (value = getItemNo()) == null ? null : value.toString();
        }
        case S_1_AMT: {
            return (value = getS1Amt()) == null ? null : value.toString();
        }
        case T_1_AMT: {
            return (value = getT1Amt()) == null ? null : value.toString();
        }
        case S_2_AMT: {
            return (value = getS2Amt()) == null ? null : value.toString();
        }
        case T_2_AMT: {
            return (value = getT2Amt()) == null ? null : value.toString();
        }
        case S_3_AMT: {
            return (value = getS3Amt()) == null ? null : value.toString();
        }
        case T_3_AMT: {
            return (value = getT3Amt()) == null ? null : value.toString();
        }
        case S_4_AMT: {
            return (value = getS4Amt()) == null ? null : value.toString();
        }
        case T_4_AMT: {
            return (value = getT4Amt()) == null ? null : value.toString();
        }
        case S_5_AMT: {
            return (value = getS5Amt()) == null ? null : value.toString();
        }
        case T_5_AMT: {
            return (value = getT5Amt()) == null ? null : value.toString();
        }
        case TOTAL_AMT: {
            return (value = getTotalAmt()) == null ? null : value.toString();
        }
        case DEDU_AMT: {
            return (value = getDeduAmt()) == null ? null : value.toString();
        }
        case S_7_AMT: {
            return (value = getS7Amt()) == null ? null : value.toString();
        }
        case T_7_AMT: {
            return (value = getT7Amt()) == null ? null : value.toString();
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

    public HisVatTaxRptA1 set(Column column, String value) {
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
        case ITEM_NAME: {
            setItemName(value);
            break;
        }
        case ITEM_NO: {
            value = StringUtils.stripToNull(value);
            setItemNo(value == null ? null : new BigDecimal(value));
            break;
        }
        case S_1_AMT: {
            value = StringUtils.stripToNull(value);
            setS1Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case T_1_AMT: {
            value = StringUtils.stripToNull(value);
            setT1Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case S_2_AMT: {
            value = StringUtils.stripToNull(value);
            setS2Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case T_2_AMT: {
            value = StringUtils.stripToNull(value);
            setT2Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case S_3_AMT: {
            value = StringUtils.stripToNull(value);
            setS3Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case T_3_AMT: {
            value = StringUtils.stripToNull(value);
            setT3Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case S_4_AMT: {
            value = StringUtils.stripToNull(value);
            setS4Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case T_4_AMT: {
            value = StringUtils.stripToNull(value);
            setT4Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case S_5_AMT: {
            value = StringUtils.stripToNull(value);
            setS5Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case T_5_AMT: {
            value = StringUtils.stripToNull(value);
            setT5Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case TOTAL_AMT: {
            value = StringUtils.stripToNull(value);
            setTotalAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case DEDU_AMT: {
            value = StringUtils.stripToNull(value);
            setDeduAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case S_7_AMT: {
            value = StringUtils.stripToNull(value);
            setS7Amt(value == null ? null : new BigDecimal(value));
            break;
        }
        case T_7_AMT: {
            value = StringUtils.stripToNull(value);
            setT7Amt(value == null ? null : new BigDecimal(value));
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
    public HisVatTaxRptA1 set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public HisVatTaxRptA1 set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public HisVatTaxRptA1 set(AbstractTable table) {
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
        } else if (!(obj instanceof HisVatTaxRptA1)) {
            return false;
        }
        HisVatTaxRptA1 rhs = (HisVatTaxRptA1) obj;
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
        if (getItemName() != null) {
            builder.append("itemName", getItemName());
        }
        if (getItemNo() != null) {
            builder.append("itemNo", getItemNo());
        }
        if (getS1Amt() != null) {
            builder.append("s1Amt", getS1Amt());
        }
        if (getT1Amt() != null) {
            builder.append("t1Amt", getT1Amt());
        }
        if (getS2Amt() != null) {
            builder.append("s2Amt", getS2Amt());
        }
        if (getT2Amt() != null) {
            builder.append("t2Amt", getT2Amt());
        }
        if (getS3Amt() != null) {
            builder.append("s3Amt", getS3Amt());
        }
        if (getT3Amt() != null) {
            builder.append("t3Amt", getT3Amt());
        }
        if (getS4Amt() != null) {
            builder.append("s4Amt", getS4Amt());
        }
        if (getT4Amt() != null) {
            builder.append("t4Amt", getT4Amt());
        }
        if (getS5Amt() != null) {
            builder.append("s5Amt", getS5Amt());
        }
        if (getT5Amt() != null) {
            builder.append("t5Amt", getT5Amt());
        }
        if (getTotalAmt() != null) {
            builder.append("totalAmt", getTotalAmt());
        }
        if (getDeduAmt() != null) {
            builder.append("deduAmt", getDeduAmt());
        }
        if (getS7Amt() != null) {
            builder.append("s7Amt", getS7Amt());
        }
        if (getT7Amt() != null) {
            builder.append("t7Amt", getT7Amt());
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
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        return builder.toString();
    }

    public HisVatTaxRptA1() {
        /* pass */
    }

    public HisVatTaxRptA1(Map<String, ?> map) {
        set(map);
    }

    public HisVatTaxRptA1(AbstractTable table) {
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
        ITEM_NAME,
        ITEM_NO,
        S_1_AMT,
        T_1_AMT,
        S_2_AMT,
        T_2_AMT,
        S_3_AMT,
        T_3_AMT,
        S_4_AMT,
        T_4_AMT,
        S_5_AMT,
        T_5_AMT,
        TOTAL_AMT,
        DEDU_AMT,
        S_7_AMT,
        T_7_AMT,
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
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
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
