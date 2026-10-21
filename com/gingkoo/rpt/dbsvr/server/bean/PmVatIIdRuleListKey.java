package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Table(name = "PM_VAT_I_ID_RULE_LIST")
public class PmVatIIdRuleListKey extends AbstractTable {
    @Id
    private String dataId;

    @Id
    private String pdataId;

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getPdataId() {
        return pdataId;
    }

    public void setPdataId(String pdataId) {
        this.pdataId = pdataId == null ? null : pdataId.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case DATA_ID: {
            return getDataId();
        }
        case PDATA_ID: {
            return getPdataId();
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

    public PmVatIIdRuleListKey set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case DATA_ID: {
            setDataId(value);
            break;
        }
        case PDATA_ID: {
            setPdataId(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public PmVatIIdRuleListKey set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public PmVatIIdRuleListKey set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public PmVatIIdRuleListKey set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDataId()).append("|");
        sb.append(getPdataId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof PmVatIIdRuleListKey)) {
            return false;
        }
        PmVatIIdRuleListKey rhs = (PmVatIIdRuleListKey) obj;
        return new EqualsBuilder()
                .append(getDataId(), rhs.getDataId())
                .append(getPdataId(), rhs.getPdataId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDataId())
                .append(getPdataId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getDataId() != null) {
            builder.append("dataId", getDataId());
        }
        if (getPdataId() != null) {
            builder.append("pdataId", getPdataId());
        }
        return builder.toString();
    }

    public PmVatIIdRuleListKey() {
        /* pass */
    }

    public PmVatIIdRuleListKey(Map<String, ?> map) {
        set(map);
    }

    public PmVatIIdRuleListKey(AbstractTable table) {
        set(table);
    }

    public PmVatIIdRuleListKey(String dataId, String pdataId) {
        setDataId(dataId);
        setPdataId(pdataId);
    }

    public enum Column {
        DATA_ID,
        PDATA_ID;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
