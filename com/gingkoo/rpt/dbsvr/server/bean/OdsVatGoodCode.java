package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsVatGoodCode extends AbstractTable {
    @Id
    private String goodCode;

    private String goodName;

    private String goodInstru;

    private String goodKeyword;

    private static final long serialVersionUID = 1L;

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode == null ? null : goodCode.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodInstru() {
        return goodInstru;
    }

    public void setGoodInstru(String goodInstru) {
        this.goodInstru = goodInstru == null ? null : goodInstru.trim();
    }

    public String getGoodKeyword() {
        return goodKeyword;
    }

    public void setGoodKeyword(String goodKeyword) {
        this.goodKeyword = goodKeyword == null ? null : goodKeyword.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case GOOD_CODE: {
            return getGoodCode();
        }
        case GOOD_NAME: {
            return getGoodName();
        }
        case GOOD_INSTRU: {
            return getGoodInstru();
        }
        case GOOD_KEYWORD: {
            return getGoodKeyword();
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

    public OdsVatGoodCode set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case GOOD_CODE: {
            setGoodCode(value);
            break;
        }
        case GOOD_NAME: {
            setGoodName(value);
            break;
        }
        case GOOD_INSTRU: {
            setGoodInstru(value);
            break;
        }
        case GOOD_KEYWORD: {
            setGoodKeyword(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsVatGoodCode set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsVatGoodCode set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsVatGoodCode set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getGoodCode()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof OdsVatGoodCode)) {
            return false;
        }
        OdsVatGoodCode rhs = (OdsVatGoodCode) obj;
        return new EqualsBuilder()
                .append(getGoodCode(), rhs.getGoodCode())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getGoodCode())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getGoodCode() != null) {
            builder.append("goodCode", getGoodCode());
        }
        if (getGoodName() != null) {
            builder.append("goodName", getGoodName());
        }
        if (getGoodInstru() != null) {
            builder.append("goodInstru", getGoodInstru());
        }
        if (getGoodKeyword() != null) {
            builder.append("goodKeyword", getGoodKeyword());
        }
        return builder.toString();
    }

    public OdsVatGoodCode() {
        /* pass */
    }

    public OdsVatGoodCode(Map<String, ?> map) {
        set(map);
    }

    public OdsVatGoodCode(AbstractTable table) {
        set(table);
    }

    public enum Column {
        GOOD_CODE,
        GOOD_NAME,
        GOOD_INSTRU,
        GOOD_KEYWORD;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
