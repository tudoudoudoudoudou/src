package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Table(name = "TB_INQ_CFG")
public class TbInqCfgKey extends AbstractTable {
    @Id
    private String corpId;

    @Id
    private String sqlId;

    private static final long serialVersionUID = 1L;

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId == null ? null : sqlId.trim();
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

    public TbInqCfgKey set(Column column, String value) {
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
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbInqCfgKey set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbInqCfgKey set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbInqCfgKey set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCorpId()).append("|");
        sb.append(getSqlId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbInqCfgKey)) {
            return false;
        }
        TbInqCfgKey rhs = (TbInqCfgKey) obj;
        return new EqualsBuilder()
                .append(getCorpId(), rhs.getCorpId())
                .append(getSqlId(), rhs.getSqlId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getCorpId())
                .append(getSqlId())
                .toHashCode();
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
        return builder.toString();
    }

    public TbInqCfgKey() {
        /* pass */
    }

    public TbInqCfgKey(Map<String, ?> map) {
        set(map);
    }

    public TbInqCfgKey(AbstractTable table) {
        set(table);
    }

    public TbInqCfgKey(String corpId, String sqlId) {
        setCorpId(corpId);
        setSqlId(sqlId);
    }

    public enum Column {
        CORP_ID,
        SQL_ID;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
