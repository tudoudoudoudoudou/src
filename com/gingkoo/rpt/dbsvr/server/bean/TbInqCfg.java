package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbInqCfg extends TbInqCfgKey {
    private String sqlString;

    private String detailSqlString;

    private String system;

    private String remarks;

    private String updTime;

    private String addTime;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private static final long serialVersionUID = 1L;

    public String getSqlString() {
        return sqlString;
    }

    public void setSqlString(String sqlString) {
        this.sqlString = sqlString == null ? null : sqlString.trim();
    }

    public String getDetailSqlString() {
        return detailSqlString;
    }

    public void setDetailSqlString(String detailSqlString) {
        this.detailSqlString = detailSqlString == null ? null : detailSqlString.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime == null ? null : updTime.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
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

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case CORP_ID: {
            return getCorpId();
        }
        case SQL_ID: {
            return getSqlId();
        }
        case SQL_STRING: {
            return getSqlString();
        }
        case DETAIL_SQL_STRING: {
            return getDetailSqlString();
        }
        case SYSTEM: {
            return getSystem();
        }
        case REMARKS: {
            return getRemarks();
        }
        case UPD_TIME: {
            return getUpdTime();
        }
        case ADD_TIME: {
            return getAddTime();
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

    public TbInqCfg set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case SQL_ID: {
            setSqlId(value);
            break;
        }
        case SQL_STRING: {
            setSqlString(value);
            break;
        }
        case DETAIL_SQL_STRING: {
            setDetailSqlString(value);
            break;
        }
        case SYSTEM: {
            setSystem(value);
            break;
        }
        case REMARKS: {
            setRemarks(value);
            break;
        }
        case UPD_TIME: {
            setUpdTime(value);
            break;
        }
        case ADD_TIME: {
            setAddTime(value);
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
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbInqCfg set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbInqCfg set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbInqCfg set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getSqlId() != null) {
            builder.append("sqlId", getSqlId());
        }
        if (getSqlString() != null) {
            builder.append("sqlString", getSqlString());
        }
        if (getDetailSqlString() != null) {
            builder.append("detailSqlString", getDetailSqlString());
        }
        if (getSystem() != null) {
            builder.append("system", getSystem());
        }
        if (getRemarks() != null) {
            builder.append("remarks", getRemarks());
        }
        if (getUpdTime() != null) {
            builder.append("updTime", getUpdTime());
        }
        if (getAddTime() != null) {
            builder.append("addTime", getAddTime());
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
        return builder.toString();
    }

    public TbInqCfg() {
        /* pass */
    }

    public TbInqCfg(Map<String, ?> map) {
        set(map);
    }

    public TbInqCfg(AbstractTable table) {
        set(table);
    }

    public enum Column {
        CORP_ID,
        SQL_ID,
        SQL_STRING,
        DETAIL_SQL_STRING,
        SYSTEM,
        REMARKS,
        UPD_TIME,
        ADD_TIME,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
