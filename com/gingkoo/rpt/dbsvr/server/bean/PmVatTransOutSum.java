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

public class PmVatTransOutSum extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String buocMonth;

    private BigDecimal oAmt;

    private BigDecimal oSimAmt;

    private BigDecimal oGenAmt;

    private BigDecimal oDspAmt;

    private BigDecimal oDisAmt;

    private BigDecimal oDspPercent;

    private BigDecimal iAmt;

    private BigDecimal iTaxAmt;

    private BigDecimal iOutTaxAmt;

    private BigDecimal iOutPercent;

    private String outType;

    private String status;

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

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private BigDecimal iMonOutPercent;

    private BigDecimal oZtrAmt;

    private BigDecimal oZriAmt;

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

    public String getBuocMonth() {
        return buocMonth;
    }

    public void setBuocMonth(String buocMonth) {
        this.buocMonth = buocMonth == null ? null : buocMonth.trim();
    }

    public BigDecimal getOAmt() {
        return oAmt;
    }

    public void setOAmt(BigDecimal oAmt) {
        this.oAmt = oAmt;
    }

    public BigDecimal getOSimAmt() {
        return oSimAmt;
    }

    public void setOSimAmt(BigDecimal oSimAmt) {
        this.oSimAmt = oSimAmt;
    }

    public BigDecimal getOGenAmt() {
        return oGenAmt;
    }

    public void setOGenAmt(BigDecimal oGenAmt) {
        this.oGenAmt = oGenAmt;
    }

    public BigDecimal getODspAmt() {
        return oDspAmt;
    }

    public void setODspAmt(BigDecimal oDspAmt) {
        this.oDspAmt = oDspAmt;
    }

    public BigDecimal getODisAmt() {
        return oDisAmt;
    }

    public void setODisAmt(BigDecimal oDisAmt) {
        this.oDisAmt = oDisAmt;
    }

    public BigDecimal getODspPercent() {
        return oDspPercent;
    }

    public void setODspPercent(BigDecimal oDspPercent) {
        this.oDspPercent = oDspPercent;
    }

    public BigDecimal getIAmt() {
        return iAmt;
    }

    public void setIAmt(BigDecimal iAmt) {
        this.iAmt = iAmt;
    }

    public BigDecimal getITaxAmt() {
        return iTaxAmt;
    }

    public void setITaxAmt(BigDecimal iTaxAmt) {
        this.iTaxAmt = iTaxAmt;
    }

    public BigDecimal getIOutTaxAmt() {
        return iOutTaxAmt;
    }

    public void setIOutTaxAmt(BigDecimal iOutTaxAmt) {
        this.iOutTaxAmt = iOutTaxAmt;
    }

    public BigDecimal getIOutPercent() {
        return iOutPercent;
    }

    public void setIOutPercent(BigDecimal iOutPercent) {
        this.iOutPercent = iOutPercent;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType == null ? null : outType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public BigDecimal getIMonOutPercent() {
        return iMonOutPercent;
    }

    public void setIMonOutPercent(BigDecimal iMonOutPercent) {
        this.iMonOutPercent = iMonOutPercent;
    }

    public BigDecimal getOZtrAmt() {
        return oZtrAmt;
    }

    public void setOZtrAmt(BigDecimal oZtrAmt) {
        this.oZtrAmt = oZtrAmt;
    }

    public BigDecimal getOZriAmt() {
        return oZriAmt;
    }

    public void setOZriAmt(BigDecimal oZriAmt) {
        this.oZriAmt = oZriAmt;
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
        case BUOC_MONTH: {
            return getBuocMonth();
        }
        case O_AMT: {
            return (value = getOAmt()) == null ? null : value.toString();
        }
        case O_SIM_AMT: {
            return (value = getOSimAmt()) == null ? null : value.toString();
        }
        case O_GEN_AMT: {
            return (value = getOGenAmt()) == null ? null : value.toString();
        }
        case O_DSP_AMT: {
            return (value = getODspAmt()) == null ? null : value.toString();
        }
        case O_DIS_AMT: {
            return (value = getODisAmt()) == null ? null : value.toString();
        }
        case O_DSP_PERCENT: {
            return (value = getODspPercent()) == null ? null : value.toString();
        }
        case I_AMT: {
            return (value = getIAmt()) == null ? null : value.toString();
        }
        case I_TAX_AMT: {
            return (value = getITaxAmt()) == null ? null : value.toString();
        }
        case I_OUT_TAX_AMT: {
            return (value = getIOutTaxAmt()) == null ? null : value.toString();
        }
        case I_OUT_PERCENT: {
            return (value = getIOutPercent()) == null ? null : value.toString();
        }
        case OUT_TYPE: {
            return getOutType();
        }
        case STATUS: {
            return getStatus();
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
        case I_MON_OUT_PERCENT: {
            return (value = getIMonOutPercent()) == null ? null : value.toString();
        }
        case O_ZTR_AMT: {
            return (value = getOZtrAmt()) == null ? null : value.toString();
        }
        case O_ZRI_AMT: {
            return (value = getOZriAmt()) == null ? null : value.toString();
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

    public PmVatTransOutSum set(Column column, String value) {
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
        case BUOC_MONTH: {
            setBuocMonth(value);
            break;
        }
        case O_AMT: {
            value = StringUtils.stripToNull(value);
            setOAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_SIM_AMT: {
            value = StringUtils.stripToNull(value);
            setOSimAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_GEN_AMT: {
            value = StringUtils.stripToNull(value);
            setOGenAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_DSP_AMT: {
            value = StringUtils.stripToNull(value);
            setODspAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_DIS_AMT: {
            value = StringUtils.stripToNull(value);
            setODisAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_DSP_PERCENT: {
            value = StringUtils.stripToNull(value);
            setODspPercent(value == null ? null : new BigDecimal(value));
            break;
        }
        case I_AMT: {
            value = StringUtils.stripToNull(value);
            setIAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case I_TAX_AMT: {
            value = StringUtils.stripToNull(value);
            setITaxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case I_OUT_TAX_AMT: {
            value = StringUtils.stripToNull(value);
            setIOutTaxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case I_OUT_PERCENT: {
            value = StringUtils.stripToNull(value);
            setIOutPercent(value == null ? null : new BigDecimal(value));
            break;
        }
        case OUT_TYPE: {
            setOutType(value);
            break;
        }
        case STATUS: {
            setStatus(value);
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
        case I_MON_OUT_PERCENT: {
            value = StringUtils.stripToNull(value);
            setIMonOutPercent(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_ZTR_AMT: {
            value = StringUtils.stripToNull(value);
            setOZtrAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case O_ZRI_AMT: {
            value = StringUtils.stripToNull(value);
            setOZriAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public PmVatTransOutSum set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public PmVatTransOutSum set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public PmVatTransOutSum set(AbstractTable table) {
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
        } else if (!(obj instanceof PmVatTransOutSum)) {
            return false;
        }
        PmVatTransOutSum rhs = (PmVatTransOutSum) obj;
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
        if (getBuocMonth() != null) {
            builder.append("buocMonth", getBuocMonth());
        }
        if (getOAmt() != null) {
            builder.append("oAmt", getOAmt());
        }
        if (getOSimAmt() != null) {
            builder.append("oSimAmt", getOSimAmt());
        }
        if (getOGenAmt() != null) {
            builder.append("oGenAmt", getOGenAmt());
        }
        if (getODspAmt() != null) {
            builder.append("oDspAmt", getODspAmt());
        }
        if (getODisAmt() != null) {
            builder.append("oDisAmt", getODisAmt());
        }
        if (getODspPercent() != null) {
            builder.append("oDspPercent", getODspPercent());
        }
        if (getIAmt() != null) {
            builder.append("iAmt", getIAmt());
        }
        if (getITaxAmt() != null) {
            builder.append("iTaxAmt", getITaxAmt());
        }
        if (getIOutTaxAmt() != null) {
            builder.append("iOutTaxAmt", getIOutTaxAmt());
        }
        if (getIOutPercent() != null) {
            builder.append("iOutPercent", getIOutPercent());
        }
        if (getOutType() != null) {
            builder.append("outType", getOutType());
        }
        if (getStatus() != null) {
            builder.append("status", getStatus());
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
        if (getIMonOutPercent() != null) {
            builder.append("iMonOutPercent", getIMonOutPercent());
        }
        if (getOZtrAmt() != null) {
            builder.append("oZtrAmt", getOZtrAmt());
        }
        if (getOZriAmt() != null) {
            builder.append("oZriAmt", getOZriAmt());
        }
        return builder.toString();
    }

    public PmVatTransOutSum() {
        /* pass */
    }

    public PmVatTransOutSum(Map<String, ?> map) {
        set(map);
    }

    public PmVatTransOutSum(AbstractTable table) {
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
        BUOC_MONTH,
        O_AMT,
        O_SIM_AMT,
        O_GEN_AMT,
        O_DSP_AMT,
        O_DIS_AMT,
        O_DSP_PERCENT,
        I_AMT,
        I_TAX_AMT,
        I_OUT_TAX_AMT,
        I_OUT_PERCENT,
        OUT_TYPE,
        STATUS,
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
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        I_MON_OUT_PERCENT,
        O_ZTR_AMT,
        O_ZRI_AMT;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
