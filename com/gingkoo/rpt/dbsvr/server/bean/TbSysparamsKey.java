package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Table(name = "TB_SYSPARAMS")
public class TbSysparamsKey extends AbstractTable {
    @Id
    private String paramId;

    @Id
    private String paramgroupId;

    @Id
    private String corpId;

    private static final long serialVersionUID = 1L;

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    public String getParamgroupId() {
        return paramgroupId;
    }

    public void setParamgroupId(String paramgroupId) {
        this.paramgroupId = paramgroupId == null ? null : paramgroupId.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case PARAM_ID: {
            return getParamId();
        }
        case PARAMGROUP_ID: {
            return getParamgroupId();
        }
        case CORP_ID: {
            return getCorpId();
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

    public TbSysparamsKey set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case PARAM_ID: {
            setParamId(value);
            break;
        }
        case PARAMGROUP_ID: {
            setParamgroupId(value);
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbSysparamsKey set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbSysparamsKey set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbSysparamsKey set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getParamId()).append("|");
        sb.append(getParamgroupId()).append("|");
        sb.append(getCorpId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbSysparamsKey)) {
            return false;
        }
        TbSysparamsKey rhs = (TbSysparamsKey) obj;
        return new EqualsBuilder()
                .append(getParamId(), rhs.getParamId())
                .append(getParamgroupId(), rhs.getParamgroupId())
                .append(getCorpId(), rhs.getCorpId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getParamId())
                .append(getParamgroupId())
                .append(getCorpId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getParamId() != null) {
            builder.append("paramId", getParamId());
        }
        if (getParamgroupId() != null) {
            builder.append("paramgroupId", getParamgroupId());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        return builder.toString();
    }

    public TbSysparamsKey() {
        /* pass */
    }

    public TbSysparamsKey(Map<String, ?> map) {
        set(map);
    }

    public TbSysparamsKey(AbstractTable table) {
        set(table);
    }

    public TbSysparamsKey(String paramId, String paramgroupId, String corpId) {
        setParamId(paramId);
        setParamgroupId(paramgroupId);
        setCorpId(corpId);
    }

    public enum Column {
        PARAM_ID,
        PARAMGROUP_ID,
        CORP_ID;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
