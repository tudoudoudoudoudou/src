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

public class PmHptReq extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String hsNo;

    private String hsOwer;

    private String hsLocation;

    private BigDecimal hsBulArea;

    private BigDecimal hsUseArea;

    private String regDate;

    private String hsUsage;

    private BigDecimal hsRentAmt;

    private BigDecimal hsOrgAmt;

    private BigDecimal hsLeftAmt;

    private String hsFloor;

    private String hsType;

    private BigDecimal taxRate;

    private String refId;

    private String impFileName;

    private String impTime;

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

    public String getHsNo() {
        return hsNo;
    }

    public void setHsNo(String hsNo) {
        this.hsNo = hsNo == null ? null : hsNo.trim();
    }

    public String getHsOwer() {
        return hsOwer;
    }

    public void setHsOwer(String hsOwer) {
        this.hsOwer = hsOwer == null ? null : hsOwer.trim();
    }

    public String getHsLocation() {
        return hsLocation;
    }

    public void setHsLocation(String hsLocation) {
        this.hsLocation = hsLocation == null ? null : hsLocation.trim();
    }

    public BigDecimal getHsBulArea() {
        return hsBulArea;
    }

    public void setHsBulArea(BigDecimal hsBulArea) {
        this.hsBulArea = hsBulArea;
    }

    public BigDecimal getHsUseArea() {
        return hsUseArea;
    }

    public void setHsUseArea(BigDecimal hsUseArea) {
        this.hsUseArea = hsUseArea;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getHsUsage() {
        return hsUsage;
    }

    public void setHsUsage(String hsUsage) {
        this.hsUsage = hsUsage == null ? null : hsUsage.trim();
    }

    public BigDecimal getHsRentAmt() {
        return hsRentAmt;
    }

    public void setHsRentAmt(BigDecimal hsRentAmt) {
        this.hsRentAmt = hsRentAmt;
    }

    public BigDecimal getHsOrgAmt() {
        return hsOrgAmt;
    }

    public void setHsOrgAmt(BigDecimal hsOrgAmt) {
        this.hsOrgAmt = hsOrgAmt;
    }

    public BigDecimal getHsLeftAmt() {
        return hsLeftAmt;
    }

    public void setHsLeftAmt(BigDecimal hsLeftAmt) {
        this.hsLeftAmt = hsLeftAmt;
    }

    public String getHsFloor() {
        return hsFloor;
    }

    public void setHsFloor(String hsFloor) {
        this.hsFloor = hsFloor == null ? null : hsFloor.trim();
    }

    public String getHsType() {
        return hsType;
    }

    public void setHsType(String hsType) {
        this.hsType = hsType == null ? null : hsType.trim();
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
        case HS_NO: {
            return getHsNo();
        }
        case HS_OWER: {
            return getHsOwer();
        }
        case HS_LOCATION: {
            return getHsLocation();
        }
        case HS_BUL_AREA: {
            return (value = getHsBulArea()) == null ? null : value.toString();
        }
        case HS_USE_AREA: {
            return (value = getHsUseArea()) == null ? null : value.toString();
        }
        case REG_DATE: {
            return getRegDate();
        }
        case HS_USAGE: {
            return getHsUsage();
        }
        case HS_RENT_AMT: {
            return (value = getHsRentAmt()) == null ? null : value.toString();
        }
        case HS_ORG_AMT: {
            return (value = getHsOrgAmt()) == null ? null : value.toString();
        }
        case HS_LEFT_AMT: {
            return (value = getHsLeftAmt()) == null ? null : value.toString();
        }
        case HS_FLOOR: {
            return getHsFloor();
        }
        case HS_TYPE: {
            return getHsType();
        }
        case TAX_RATE: {
            return (value = getTaxRate()) == null ? null : value.toString();
        }
        case REF_ID: {
            return getRefId();
        }
        case IMP_FILE_NAME: {
            return getImpFileName();
        }
        case IMP_TIME: {
            return getImpTime();
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

    public PmHptReq set(Column column, String value) {
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
        case HS_NO: {
            setHsNo(value);
            break;
        }
        case HS_OWER: {
            setHsOwer(value);
            break;
        }
        case HS_LOCATION: {
            setHsLocation(value);
            break;
        }
        case HS_BUL_AREA: {
            value = StringUtils.stripToNull(value);
            setHsBulArea(value == null ? null : new BigDecimal(value));
            break;
        }
        case HS_USE_AREA: {
            value = StringUtils.stripToNull(value);
            setHsUseArea(value == null ? null : new BigDecimal(value));
            break;
        }
        case REG_DATE: {
            setRegDate(value);
            break;
        }
        case HS_USAGE: {
            setHsUsage(value);
            break;
        }
        case HS_RENT_AMT: {
            value = StringUtils.stripToNull(value);
            setHsRentAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case HS_ORG_AMT: {
            value = StringUtils.stripToNull(value);
            setHsOrgAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case HS_LEFT_AMT: {
            value = StringUtils.stripToNull(value);
            setHsLeftAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case HS_FLOOR: {
            setHsFloor(value);
            break;
        }
        case HS_TYPE: {
            setHsType(value);
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
        case IMP_FILE_NAME: {
            setImpFileName(value);
            break;
        }
        case IMP_TIME: {
            setImpTime(value);
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
    public PmHptReq set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public PmHptReq set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public PmHptReq set(AbstractTable table) {
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
        } else if (!(obj instanceof PmHptReq)) {
            return false;
        }
        PmHptReq rhs = (PmHptReq) obj;
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
        if (getHsNo() != null) {
            builder.append("hsNo", getHsNo());
        }
        if (getHsOwer() != null) {
            builder.append("hsOwer", getHsOwer());
        }
        if (getHsLocation() != null) {
            builder.append("hsLocation", getHsLocation());
        }
        if (getHsBulArea() != null) {
            builder.append("hsBulArea", getHsBulArea());
        }
        if (getHsUseArea() != null) {
            builder.append("hsUseArea", getHsUseArea());
        }
        if (getRegDate() != null) {
            builder.append("regDate", getRegDate());
        }
        if (getHsUsage() != null) {
            builder.append("hsUsage", getHsUsage());
        }
        if (getHsRentAmt() != null) {
            builder.append("hsRentAmt", getHsRentAmt());
        }
        if (getHsOrgAmt() != null) {
            builder.append("hsOrgAmt", getHsOrgAmt());
        }
        if (getHsLeftAmt() != null) {
            builder.append("hsLeftAmt", getHsLeftAmt());
        }
        if (getHsFloor() != null) {
            builder.append("hsFloor", getHsFloor());
        }
        if (getHsType() != null) {
            builder.append("hsType", getHsType());
        }
        if (getTaxRate() != null) {
            builder.append("taxRate", getTaxRate());
        }
        if (getRefId() != null) {
            builder.append("refId", getRefId());
        }
        if (getImpFileName() != null) {
            builder.append("impFileName", getImpFileName());
        }
        if (getImpTime() != null) {
            builder.append("impTime", getImpTime());
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

    public PmHptReq() {
        /* pass */
    }

    public PmHptReq(Map<String, ?> map) {
        set(map);
    }

    public PmHptReq(AbstractTable table) {
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
        HS_NO,
        HS_OWER,
        HS_LOCATION,
        HS_BUL_AREA,
        HS_USE_AREA,
        REG_DATE,
        HS_USAGE,
        HS_RENT_AMT,
        HS_ORG_AMT,
        HS_LEFT_AMT,
        HS_FLOOR,
        HS_TYPE,
        TAX_RATE,
        REF_ID,
        IMP_FILE_NAME,
        IMP_TIME,
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
