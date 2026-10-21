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

public class BmsCtlSession extends AbstractTable {
    @Id
    private String dataId;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String sessionId;

    private String batchId;

    private String jobId;

    private String pJobId;

    private String pCCode;

    private String status;

    private String cCode;

    private String eCode;

    private String eMsg;

    private String startTime;

    private String endTime;

    private String nextJobId;

    private String output1;

    private String output2;

    private String output3;

    private String output4;

    private String output5;

    private String remarks;

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

    private BigDecimal runOrder;

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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getPJobId() {
        return pJobId;
    }

    public void setPJobId(String pJobId) {
        this.pJobId = pJobId == null ? null : pJobId.trim();
    }

    public String getPCCode() {
        return pCCode;
    }

    public void setPCCode(String pCCode) {
        this.pCCode = pCCode == null ? null : pCCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCCode() {
        return cCode;
    }

    public void setCCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getECode() {
        return eCode;
    }

    public void setECode(String eCode) {
        this.eCode = eCode == null ? null : eCode.trim();
    }

    public String getEMsg() {
        return eMsg;
    }

    public void setEMsg(String eMsg) {
        this.eMsg = eMsg == null ? null : eMsg.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getNextJobId() {
        return nextJobId;
    }

    public void setNextJobId(String nextJobId) {
        this.nextJobId = nextJobId == null ? null : nextJobId.trim();
    }

    public String getOutput1() {
        return output1;
    }

    public void setOutput1(String output1) {
        this.output1 = output1 == null ? null : output1.trim();
    }

    public String getOutput2() {
        return output2;
    }

    public void setOutput2(String output2) {
        this.output2 = output2 == null ? null : output2.trim();
    }

    public String getOutput3() {
        return output3;
    }

    public void setOutput3(String output3) {
        this.output3 = output3 == null ? null : output3.trim();
    }

    public String getOutput4() {
        return output4;
    }

    public void setOutput4(String output4) {
        this.output4 = output4 == null ? null : output4.trim();
    }

    public String getOutput5() {
        return output5;
    }

    public void setOutput5(String output5) {
        this.output5 = output5 == null ? null : output5.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public BigDecimal getRunOrder() {
        return runOrder;
    }

    public void setRunOrder(BigDecimal runOrder) {
        this.runOrder = runOrder;
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
        case SESSION_ID: {
            return getSessionId();
        }
        case BATCH_ID: {
            return getBatchId();
        }
        case JOB_ID: {
            return getJobId();
        }
        case P_JOB_ID: {
            return getPJobId();
        }
        case P_C_CODE: {
            return getPCCode();
        }
        case STATUS: {
            return getStatus();
        }
        case C_CODE: {
            return getCCode();
        }
        case E_CODE: {
            return getECode();
        }
        case E_MSG: {
            return getEMsg();
        }
        case START_TIME: {
            return getStartTime();
        }
        case END_TIME: {
            return getEndTime();
        }
        case NEXT_JOB_ID: {
            return getNextJobId();
        }
        case OUTPUT_1: {
            return getOutput1();
        }
        case OUTPUT_2: {
            return getOutput2();
        }
        case OUTPUT_3: {
            return getOutput3();
        }
        case OUTPUT_4: {
            return getOutput4();
        }
        case OUTPUT_5: {
            return getOutput5();
        }
        case REMARKS: {
            return getRemarks();
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
        case RUN_ORDER: {
            return (value = getRunOrder()) == null ? null : value.toString();
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

    public BmsCtlSession set(Column column, String value) {
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
        case SESSION_ID: {
            setSessionId(value);
            break;
        }
        case BATCH_ID: {
            setBatchId(value);
            break;
        }
        case JOB_ID: {
            setJobId(value);
            break;
        }
        case P_JOB_ID: {
            setPJobId(value);
            break;
        }
        case P_C_CODE: {
            setPCCode(value);
            break;
        }
        case STATUS: {
            setStatus(value);
            break;
        }
        case C_CODE: {
            setCCode(value);
            break;
        }
        case E_CODE: {
            setECode(value);
            break;
        }
        case E_MSG: {
            setEMsg(value);
            break;
        }
        case START_TIME: {
            setStartTime(value);
            break;
        }
        case END_TIME: {
            setEndTime(value);
            break;
        }
        case NEXT_JOB_ID: {
            setNextJobId(value);
            break;
        }
        case OUTPUT_1: {
            setOutput1(value);
            break;
        }
        case OUTPUT_2: {
            setOutput2(value);
            break;
        }
        case OUTPUT_3: {
            setOutput3(value);
            break;
        }
        case OUTPUT_4: {
            setOutput4(value);
            break;
        }
        case OUTPUT_5: {
            setOutput5(value);
            break;
        }
        case REMARKS: {
            setRemarks(value);
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
        case RUN_ORDER: {
            value = StringUtils.stripToNull(value);
            setRunOrder(value == null ? null : new BigDecimal(value));
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public BmsCtlSession set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public BmsCtlSession set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public BmsCtlSession set(AbstractTable table) {
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
        } else if (!(obj instanceof BmsCtlSession)) {
            return false;
        }
        BmsCtlSession rhs = (BmsCtlSession) obj;
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
        if (getSessionId() != null) {
            builder.append("sessionId", getSessionId());
        }
        if (getBatchId() != null) {
            builder.append("batchId", getBatchId());
        }
        if (getJobId() != null) {
            builder.append("jobId", getJobId());
        }
        if (getPJobId() != null) {
            builder.append("pJobId", getPJobId());
        }
        if (getPCCode() != null) {
            builder.append("pCCode", getPCCode());
        }
        if (getStatus() != null) {
            builder.append("status", getStatus());
        }
        if (getCCode() != null) {
            builder.append("cCode", getCCode());
        }
        if (getECode() != null) {
            builder.append("eCode", getECode());
        }
        if (getEMsg() != null) {
            builder.append("eMsg", getEMsg());
        }
        if (getStartTime() != null) {
            builder.append("startTime", getStartTime());
        }
        if (getEndTime() != null) {
            builder.append("endTime", getEndTime());
        }
        if (getNextJobId() != null) {
            builder.append("nextJobId", getNextJobId());
        }
        if (getOutput1() != null) {
            builder.append("output1", getOutput1());
        }
        if (getOutput2() != null) {
            builder.append("output2", getOutput2());
        }
        if (getOutput3() != null) {
            builder.append("output3", getOutput3());
        }
        if (getOutput4() != null) {
            builder.append("output4", getOutput4());
        }
        if (getOutput5() != null) {
            builder.append("output5", getOutput5());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
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
        if (getRunOrder() != null) {
            builder.append("runOrder", getRunOrder());
        }
        return builder.toString();
    }

    public BmsCtlSession() {
        /* pass */
    }

    public BmsCtlSession(Map<String, ?> map) {
        set(map);
    }

    public BmsCtlSession(AbstractTable table) {
        set(table);
    }

    public enum Column {
        DATA_ID,
        DATA_DATE,
        CORP_ID,
        ORG_ID,
        GROUP_ID,
        SESSION_ID,
        BATCH_ID,
        JOB_ID,
        P_JOB_ID,
        P_C_CODE,
        STATUS,
        C_CODE,
        E_CODE,
        E_MSG,
        START_TIME,
        END_TIME,
        NEXT_JOB_ID,
        OUTPUT_1,
        OUTPUT_2,
        OUTPUT_3,
        OUTPUT_4,
        OUTPUT_5,
        REMARKS,
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
        RUN_ORDER;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
