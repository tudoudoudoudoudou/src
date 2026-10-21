package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbSysStat extends AbstractTable {
    @Id
    private String corpId;

    private String falObjCode;

    private String lastSysDate;

    private String sysDate;

    private String nextSysDate;

    private String lastWorkDate;

    private String workDate;

    private String nextWorkDate;

    private String lastFalBuocMonth;

    private String falBuocMonth;

    private String sysStat;

    private String lastSysStat;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String departId;

    private static final long serialVersionUID = 1L;

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getFalObjCode() {
        return falObjCode;
    }

    public void setFalObjCode(String falObjCode) {
        this.falObjCode = falObjCode == null ? null : falObjCode.trim();
    }

    public String getLastSysDate() {
        return lastSysDate;
    }

    public void setLastSysDate(String lastSysDate) {
        this.lastSysDate = lastSysDate == null ? null : lastSysDate.trim();
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate == null ? null : sysDate.trim();
    }

    public String getNextSysDate() {
        return nextSysDate;
    }

    public void setNextSysDate(String nextSysDate) {
        this.nextSysDate = nextSysDate == null ? null : nextSysDate.trim();
    }

    public String getLastWorkDate() {
        return lastWorkDate;
    }

    public void setLastWorkDate(String lastWorkDate) {
        this.lastWorkDate = lastWorkDate == null ? null : lastWorkDate.trim();
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    public String getNextWorkDate() {
        return nextWorkDate;
    }

    public void setNextWorkDate(String nextWorkDate) {
        this.nextWorkDate = nextWorkDate == null ? null : nextWorkDate.trim();
    }

    public String getLastFalBuocMonth() {
        return lastFalBuocMonth;
    }

    public void setLastFalBuocMonth(String lastFalBuocMonth) {
        this.lastFalBuocMonth = lastFalBuocMonth == null ? null : lastFalBuocMonth.trim();
    }

    public String getFalBuocMonth() {
        return falBuocMonth;
    }

    public void setFalBuocMonth(String falBuocMonth) {
        this.falBuocMonth = falBuocMonth == null ? null : falBuocMonth.trim();
    }

    public String getSysStat() {
        return sysStat;
    }

    public void setSysStat(String sysStat) {
        this.sysStat = sysStat == null ? null : sysStat.trim();
    }

    public String getLastSysStat() {
        return lastSysStat;
    }

    public void setLastSysStat(String lastSysStat) {
        this.lastSysStat = lastSysStat == null ? null : lastSysStat.trim();
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

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
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
        case FAL_OBJ_CODE: {
            return getFalObjCode();
        }
        case LAST_SYS_DATE: {
            return getLastSysDate();
        }
        case SYS_DATE: {
            return getSysDate();
        }
        case NEXT_SYS_DATE: {
            return getNextSysDate();
        }
        case LAST_WORK_DATE: {
            return getLastWorkDate();
        }
        case WORK_DATE: {
            return getWorkDate();
        }
        case NEXT_WORK_DATE: {
            return getNextWorkDate();
        }
        case LAST_FAL_BUOC_MONTH: {
            return getLastFalBuocMonth();
        }
        case FAL_BUOC_MONTH: {
            return getFalBuocMonth();
        }
        case SYS_STAT: {
            return getSysStat();
        }
        case LAST_SYS_STAT: {
            return getLastSysStat();
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
        case DEPART_ID: {
            return getDepartId();
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

    public TbSysStat set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case FAL_OBJ_CODE: {
            setFalObjCode(value);
            break;
        }
        case LAST_SYS_DATE: {
            setLastSysDate(value);
            break;
        }
        case SYS_DATE: {
            setSysDate(value);
            break;
        }
        case NEXT_SYS_DATE: {
            setNextSysDate(value);
            break;
        }
        case LAST_WORK_DATE: {
            setLastWorkDate(value);
            break;
        }
        case WORK_DATE: {
            setWorkDate(value);
            break;
        }
        case NEXT_WORK_DATE: {
            setNextWorkDate(value);
            break;
        }
        case LAST_FAL_BUOC_MONTH: {
            setLastFalBuocMonth(value);
            break;
        }
        case FAL_BUOC_MONTH: {
            setFalBuocMonth(value);
            break;
        }
        case SYS_STAT: {
            setSysStat(value);
            break;
        }
        case LAST_SYS_STAT: {
            setLastSysStat(value);
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
        case DEPART_ID: {
            setDepartId(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbSysStat set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbSysStat set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbSysStat set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCorpId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbSysStat)) {
            return false;
        }
        TbSysStat rhs = (TbSysStat) obj;
        return new EqualsBuilder()
                .append(getCorpId(), rhs.getCorpId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getCorpId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getFalObjCode() != null) {
            builder.append("falObjCode", getFalObjCode());
        }
        if (getLastSysDate() != null) {
            builder.append("lastSysDate", getLastSysDate());
        }
        if (getSysDate() != null) {
            builder.append("sysDate", getSysDate());
        }
        if (getNextSysDate() != null) {
            builder.append("nextSysDate", getNextSysDate());
        }
        if (getLastWorkDate() != null) {
            builder.append("lastWorkDate", getLastWorkDate());
        }
        if (getWorkDate() != null) {
            builder.append("workDate", getWorkDate());
        }
        if (getNextWorkDate() != null) {
            builder.append("nextWorkDate", getNextWorkDate());
        }
        if (getLastFalBuocMonth() != null) {
            builder.append("lastFalBuocMonth", getLastFalBuocMonth());
        }
        if (getFalBuocMonth() != null) {
            builder.append("falBuocMonth", getFalBuocMonth());
        }
        if (getSysStat() != null) {
            builder.append("sysStat", getSysStat());
        }
        if (getLastSysStat() != null) {
            builder.append("lastSysStat", getLastSysStat());
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
        if (getDepartId() != null) {
            builder.append("departId", getDepartId());
        }
        return builder.toString();
    }

    public TbSysStat() {
        /* pass */
    }

    public TbSysStat(Map<String, ?> map) {
        set(map);
    }

    public TbSysStat(AbstractTable table) {
        set(table);
    }

    public enum Column {
        CORP_ID,
        FAL_OBJ_CODE,
        LAST_SYS_DATE,
        SYS_DATE,
        NEXT_SYS_DATE,
        LAST_WORK_DATE,
        WORK_DATE,
        NEXT_WORK_DATE,
        LAST_FAL_BUOC_MONTH,
        FAL_BUOC_MONTH,
        SYS_STAT,
        LAST_SYS_STAT,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        DEPART_ID;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
