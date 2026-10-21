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

public class HisVatBVoc extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String volumeNo;

    private String vocCode;

    private String vocNo;

    private String vocFlag;

    private BigDecimal maxAmt;

    private String inUser;

    private String inDate;

    private String outUser;

    private String outDate;

    private String getUser;

    private String getDate;

    private String backUser;

    private String backDate;

    private String vocStatus;

    private String discardType;

    private String discardDesc;

    private String remarks;

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

    private String siteOrgId;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String checkErrType;

    private String srcOrgId;

    private String discardDate;

    private String discardUser;

    private String siteNo;

    private String srcSiteNo;

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

    public String getVolumeNo() {
        return volumeNo;
    }

    public void setVolumeNo(String volumeNo) {
        this.volumeNo = volumeNo == null ? null : volumeNo.trim();
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

    public String getVocFlag() {
        return vocFlag;
    }

    public void setVocFlag(String vocFlag) {
        this.vocFlag = vocFlag == null ? null : vocFlag.trim();
    }

    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    public void setMaxAmt(BigDecimal maxAmt) {
        this.maxAmt = maxAmt;
    }

    public String getInUser() {
        return inUser;
    }

    public void setInUser(String inUser) {
        this.inUser = inUser == null ? null : inUser.trim();
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    public String getOutUser() {
        return outUser;
    }

    public void setOutUser(String outUser) {
        this.outUser = outUser == null ? null : outUser.trim();
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate == null ? null : outDate.trim();
    }

    public String getGetUser() {
        return getUser;
    }

    public void setGetUser(String getUser) {
        this.getUser = getUser == null ? null : getUser.trim();
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate == null ? null : getDate.trim();
    }

    public String getBackUser() {
        return backUser;
    }

    public void setBackUser(String backUser) {
        this.backUser = backUser == null ? null : backUser.trim();
    }

    public String getBackDate() {
        return backDate;
    }

    public void setBackDate(String backDate) {
        this.backDate = backDate == null ? null : backDate.trim();
    }

    public String getVocStatus() {
        return vocStatus;
    }

    public void setVocStatus(String vocStatus) {
        this.vocStatus = vocStatus == null ? null : vocStatus.trim();
    }

    public String getDiscardType() {
        return discardType;
    }

    public void setDiscardType(String discardType) {
        this.discardType = discardType == null ? null : discardType.trim();
    }

    public String getDiscardDesc() {
        return discardDesc;
    }

    public void setDiscardDesc(String discardDesc) {
        this.discardDesc = discardDesc == null ? null : discardDesc.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public String getSiteOrgId() {
        return siteOrgId;
    }

    public void setSiteOrgId(String siteOrgId) {
        this.siteOrgId = siteOrgId == null ? null : siteOrgId.trim();
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

    public String getSrcOrgId() {
        return srcOrgId;
    }

    public void setSrcOrgId(String srcOrgId) {
        this.srcOrgId = srcOrgId == null ? null : srcOrgId.trim();
    }

    public String getDiscardDate() {
        return discardDate;
    }

    public void setDiscardDate(String discardDate) {
        this.discardDate = discardDate == null ? null : discardDate.trim();
    }

    public String getDiscardUser() {
        return discardUser;
    }

    public void setDiscardUser(String discardUser) {
        this.discardUser = discardUser == null ? null : discardUser.trim();
    }

    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo == null ? null : siteNo.trim();
    }

    public String getSrcSiteNo() {
        return srcSiteNo;
    }

    public void setSrcSiteNo(String srcSiteNo) {
        this.srcSiteNo = srcSiteNo == null ? null : srcSiteNo.trim();
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
        case VOLUME_NO: {
            return getVolumeNo();
        }
        case VOC_CODE: {
            return getVocCode();
        }
        case VOC_NO: {
            return getVocNo();
        }
        case VOC_FLAG: {
            return getVocFlag();
        }
        case MAX_AMT: {
            return (value = getMaxAmt()) == null ? null : value.toString();
        }
        case IN_USER: {
            return getInUser();
        }
        case IN_DATE: {
            return getInDate();
        }
        case OUT_USER: {
            return getOutUser();
        }
        case OUT_DATE: {
            return getOutDate();
        }
        case GET_USER: {
            return getGetUser();
        }
        case GET_DATE: {
            return getGetDate();
        }
        case BACK_USER: {
            return getBackUser();
        }
        case BACK_DATE: {
            return getBackDate();
        }
        case VOC_STATUS: {
            return getVocStatus();
        }
        case DISCARD_TYPE: {
            return getDiscardType();
        }
        case DISCARD_DESC: {
            return getDiscardDesc();
        }
        case REMARKS: {
            return getRemarks();
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
        case SITE_ORG_ID: {
            return getSiteOrgId();
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
        case SRC_ORG_ID: {
            return getSrcOrgId();
        }
        case DISCARD_DATE: {
            return getDiscardDate();
        }
        case DISCARD_USER: {
            return getDiscardUser();
        }
        case SITE_NO: {
            return getSiteNo();
        }
        case SRC_SITE_NO: {
            return getSrcSiteNo();
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

    public HisVatBVoc set(Column column, String value) {
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
        case VOLUME_NO: {
            setVolumeNo(value);
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
        case VOC_FLAG: {
            setVocFlag(value);
            break;
        }
        case MAX_AMT: {
            value = StringUtils.stripToNull(value);
            setMaxAmt(value == null ? null : new BigDecimal(value));
            break;
        }
        case IN_USER: {
            setInUser(value);
            break;
        }
        case IN_DATE: {
            setInDate(value);
            break;
        }
        case OUT_USER: {
            setOutUser(value);
            break;
        }
        case OUT_DATE: {
            setOutDate(value);
            break;
        }
        case GET_USER: {
            setGetUser(value);
            break;
        }
        case GET_DATE: {
            setGetDate(value);
            break;
        }
        case BACK_USER: {
            setBackUser(value);
            break;
        }
        case BACK_DATE: {
            setBackDate(value);
            break;
        }
        case VOC_STATUS: {
            setVocStatus(value);
            break;
        }
        case DISCARD_TYPE: {
            setDiscardType(value);
            break;
        }
        case DISCARD_DESC: {
            setDiscardDesc(value);
            break;
        }
        case REMARKS: {
            setRemarks(value);
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
        case SITE_ORG_ID: {
            setSiteOrgId(value);
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
        case SRC_ORG_ID: {
            setSrcOrgId(value);
            break;
        }
        case DISCARD_DATE: {
            setDiscardDate(value);
            break;
        }
        case DISCARD_USER: {
            setDiscardUser(value);
            break;
        }
        case SITE_NO: {
            setSiteNo(value);
            break;
        }
        case SRC_SITE_NO: {
            setSrcSiteNo(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public HisVatBVoc set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public HisVatBVoc set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public HisVatBVoc set(AbstractTable table) {
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
        } else if (!(obj instanceof HisVatBVoc)) {
            return false;
        }
        HisVatBVoc rhs = (HisVatBVoc) obj;
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
        if (getVolumeNo() != null) {
            builder.append("volumeNo", getVolumeNo());
        }
        if (getVocCode() != null) {
            builder.append("vocCode", getVocCode());
        }
        if (getVocNo() != null) {
            builder.append("vocNo", getVocNo());
        }
        if (getVocFlag() != null) {
            builder.append("vocFlag", getVocFlag());
        }
        if (getMaxAmt() != null) {
            builder.append("maxAmt", getMaxAmt());
        }
        if (getInUser() != null) {
            builder.append("inUser", getInUser());
        }
        if (getInDate() != null) {
            builder.append("inDate", getInDate());
        }
        if (getOutUser() != null) {
            builder.append("outUser", getOutUser());
        }
        if (getOutDate() != null) {
            builder.append("outDate", getOutDate());
        }
        if (getGetUser() != null) {
            builder.append("getUser", getGetUser());
        }
        if (getGetDate() != null) {
            builder.append("getDate", getGetDate());
        }
        if (getBackUser() != null) {
            builder.append("backUser", getBackUser());
        }
        if (getBackDate() != null) {
            builder.append("backDate", getBackDate());
        }
        if (getVocStatus() != null) {
            builder.append("vocStatus", getVocStatus());
        }
        if (getDiscardType() != null) {
            builder.append("discardType", getDiscardType());
        }
        if (getDiscardDesc() != null) {
            builder.append("discardDesc", getDiscardDesc());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
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
        if (getSiteOrgId() != null) {
            builder.append("siteOrgId", getSiteOrgId());
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
        if (getSrcOrgId() != null) {
            builder.append("srcOrgId", getSrcOrgId());
        }
        if (getDiscardDate() != null) {
            builder.append("discardDate", getDiscardDate());
        }
        if (getDiscardUser() != null) {
            builder.append("discardUser", getDiscardUser());
        }
        if (getSiteNo() != null) {
            builder.append("siteNo", getSiteNo());
        }
        if (getSrcSiteNo() != null) {
            builder.append("srcSiteNo", getSrcSiteNo());
        }
        return builder.toString();
    }

    public HisVatBVoc() {
        /* pass */
    }

    public HisVatBVoc(Map<String, ?> map) {
        set(map);
    }

    public HisVatBVoc(AbstractTable table) {
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
        VOLUME_NO,
        VOC_CODE,
        VOC_NO,
        VOC_FLAG,
        MAX_AMT,
        IN_USER,
        IN_DATE,
        OUT_USER,
        OUT_DATE,
        GET_USER,
        GET_DATE,
        BACK_USER,
        BACK_DATE,
        VOC_STATUS,
        DISCARD_TYPE,
        DISCARD_DESC,
        REMARKS,
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
        SITE_ORG_ID,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        CHECK_ERR_TYPE,
        SRC_ORG_ID,
        DISCARD_DATE,
        DISCARD_USER,
        SITE_NO,
        SRC_SITE_NO;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
