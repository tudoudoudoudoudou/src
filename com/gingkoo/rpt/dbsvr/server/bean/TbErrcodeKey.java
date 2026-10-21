package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Table(name = "TB_ERRCODE")
public class TbErrcodeKey extends AbstractTable {
    @Id
    private String errId;

    @Id
    private String errCode;

    private static final long serialVersionUID = 1L;

    public String getErrId() {
        return errId;
    }

    public void setErrId(String errId) {
        this.errId = errId == null ? null : errId.trim();
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case ERR_ID: {
            return getErrId();
        }
        case ERR_CODE: {
            return getErrCode();
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

    public TbErrcodeKey set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case ERR_ID: {
            setErrId(value);
            break;
        }
        case ERR_CODE: {
            setErrCode(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbErrcodeKey set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbErrcodeKey set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbErrcodeKey set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getErrId()).append("|");
        sb.append(getErrCode()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbErrcodeKey)) {
            return false;
        }
        TbErrcodeKey rhs = (TbErrcodeKey) obj;
        return new EqualsBuilder()
                .append(getErrId(), rhs.getErrId())
                .append(getErrCode(), rhs.getErrCode())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getErrId())
                .append(getErrCode())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getErrId() != null) {
            builder.append("errId", getErrId());
        }
        if (getErrCode() != null) {
            builder.append("errCode", getErrCode());
        }
        return builder.toString();
    }

    public TbErrcodeKey() {
        /* pass */
    }

    public TbErrcodeKey(Map<String, ?> map) {
        set(map);
    }

    public TbErrcodeKey(AbstractTable table) {
        set(table);
    }

    public TbErrcodeKey(String errId, String errCode) {
        setErrId(errId);
        setErrCode(errCode);
    }

    public enum Column {
        ERR_ID,
        ERR_CODE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
