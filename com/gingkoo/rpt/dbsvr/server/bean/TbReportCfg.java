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

public class TbReportCfg extends AbstractTable {
    @Id
    private String dataId;

    private String rptName;

    private String rptTemplate;

    private String rptLogic;

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

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getRptName() {
        return rptName;
    }

    public void setRptName(String rptName) {
        this.rptName = rptName == null ? null : rptName.trim();
    }

    public String getRptTemplate() {
        return rptTemplate;
    }

    public void setRptTemplate(String rptTemplate) {
        this.rptTemplate = rptTemplate == null ? null : rptTemplate.trim();
    }

    public String getRptLogic() {
        return rptLogic;
    }

    public void setRptLogic(String rptLogic) {
        this.rptLogic = rptLogic == null ? null : rptLogic.trim();
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
        case RPT_NAME: {
            return getRptName();
        }
        case RPT_TEMPLATE: {
            return getRptTemplate();
        }
        case RPT_LOGIC: {
            return getRptLogic();
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

    public TbReportCfg set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case DATA_ID: {
            setDataId(value);
            break;
        }
        case RPT_NAME: {
            setRptName(value);
            break;
        }
        case RPT_TEMPLATE: {
            setRptTemplate(value);
            break;
        }
        case RPT_LOGIC: {
            setRptLogic(value);
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
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbReportCfg set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbReportCfg set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbReportCfg set(AbstractTable table) {
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
        } else if (!(obj instanceof TbReportCfg)) {
            return false;
        }
        TbReportCfg rhs = (TbReportCfg) obj;
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
        if (getRptName() != null) {
            builder.append("rptName", getRptName());
        }
        if (getRptTemplate() != null) {
            builder.append("rptTemplate", getRptTemplate());
        }
        if (getRptLogic() != null) {
            builder.append("rptLogic", getRptLogic());
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
        return builder.toString();
    }

    public TbReportCfg() {
        /* pass */
    }

    public TbReportCfg(Map<String, ?> map) {
        set(map);
    }

    public TbReportCfg(AbstractTable table) {
        set(table);
    }

    public enum Column {
        DATA_ID,
        RPT_NAME,
        RPT_TEMPLATE,
        RPT_LOGIC,
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
        DATA_APV_TIME;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
