package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbWorkdate extends AbstractTable {
    @Id
    private String guid;

    private String calendarNo;

    private String workDate;

    private String workFlag;

    private String filler1;

    private String filler2;

    private String filler3;

    private String calendarName;

    private static final long serialVersionUID = 1L;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getCalendarNo() {
        return calendarNo;
    }

    public void setCalendarNo(String calendarNo) {
        this.calendarNo = calendarNo == null ? null : calendarNo.trim();
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    public String getWorkFlag() {
        return workFlag;
    }

    public void setWorkFlag(String workFlag) {
        this.workFlag = workFlag == null ? null : workFlag.trim();
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1 == null ? null : filler1.trim();
    }

    public String getFiller2() {
        return filler2;
    }

    public void setFiller2(String filler2) {
        this.filler2 = filler2 == null ? null : filler2.trim();
    }

    public String getFiller3() {
        return filler3;
    }

    public void setFiller3(String filler3) {
        this.filler3 = filler3 == null ? null : filler3.trim();
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName == null ? null : calendarName.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case GUID: {
            return getGuid();
        }
        case CALENDAR_NO: {
            return getCalendarNo();
        }
        case WORK_DATE: {
            return getWorkDate();
        }
        case WORK_FLAG: {
            return getWorkFlag();
        }
        case FILLER1: {
            return getFiller1();
        }
        case FILLER2: {
            return getFiller2();
        }
        case FILLER3: {
            return getFiller3();
        }
        case CALENDAR_NAME: {
            return getCalendarName();
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

    public TbWorkdate set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case GUID: {
            setGuid(value);
            break;
        }
        case CALENDAR_NO: {
            setCalendarNo(value);
            break;
        }
        case WORK_DATE: {
            setWorkDate(value);
            break;
        }
        case WORK_FLAG: {
            setWorkFlag(value);
            break;
        }
        case FILLER1: {
            setFiller1(value);
            break;
        }
        case FILLER2: {
            setFiller2(value);
            break;
        }
        case FILLER3: {
            setFiller3(value);
            break;
        }
        case CALENDAR_NAME: {
            setCalendarName(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbWorkdate set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbWorkdate set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbWorkdate set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getGuid()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbWorkdate)) {
            return false;
        }
        TbWorkdate rhs = (TbWorkdate) obj;
        return new EqualsBuilder()
                .append(getGuid(), rhs.getGuid())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getGuid())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getGuid() != null) {
            builder.append("guid", getGuid());
        }
        if (getCalendarNo() != null) {
            builder.append("calendarNo", getCalendarNo());
        }
        if (getWorkDate() != null) {
            builder.append("workDate", getWorkDate());
        }
        if (getWorkFlag() != null) {
            builder.append("workFlag", getWorkFlag());
        }
        if (getFiller1() != null) {
            builder.append("filler1", getFiller1());
        }
        if (getFiller2() != null) {
            builder.append("filler2", getFiller2());
        }
        if (getFiller3() != null) {
            builder.append("filler3", getFiller3());
        }
        if (getCalendarName() != null) {
            builder.append("calendarName", getCalendarName());
        }
        return builder.toString();
    }

    public TbWorkdate() {
        /* pass */
    }

    public TbWorkdate(Map<String, ?> map) {
        set(map);
    }

    public TbWorkdate(AbstractTable table) {
        set(table);
    }

    public enum Column {
        GUID,
        CALENDAR_NO,
        WORK_DATE,
        WORK_FLAG,
        FILLER1,
        FILLER2,
        FILLER3,
        CALENDAR_NAME;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
