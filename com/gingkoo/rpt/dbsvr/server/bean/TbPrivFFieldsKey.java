package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Table(name = "TB_PRIV_F_FIELDS")
public class TbPrivFFieldsKey extends AbstractTable {
    @Id
    private String dataId;

    @Id
    private String fId;

    @Id
    private String fieldId;

    @Id
    private String fieldName;

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getFId() {
        return fId;
    }

    public void setFId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
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
        case F_ID: {
            return getFId();
        }
        case FIELD_ID: {
            return getFieldId();
        }
        case FIELD_NAME: {
            return getFieldName();
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

    public TbPrivFFieldsKey set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case DATA_ID: {
            setDataId(value);
            break;
        }
        case F_ID: {
            setFId(value);
            break;
        }
        case FIELD_ID: {
            setFieldId(value);
            break;
        }
        case FIELD_NAME: {
            setFieldName(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbPrivFFieldsKey set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbPrivFFieldsKey set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbPrivFFieldsKey set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDataId()).append("|");
        sb.append(getFId()).append("|");
        sb.append(getFieldId()).append("|");
        sb.append(getFieldName()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbPrivFFieldsKey)) {
            return false;
        }
        TbPrivFFieldsKey rhs = (TbPrivFFieldsKey) obj;
        return new EqualsBuilder()
                .append(getDataId(), rhs.getDataId())
                .append(getFId(), rhs.getFId())
                .append(getFieldId(), rhs.getFieldId())
                .append(getFieldName(), rhs.getFieldName())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDataId())
                .append(getFId())
                .append(getFieldId())
                .append(getFieldName())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getDataId() != null) {
            builder.append("dataId", getDataId());
        }
        if (getFId() != null) {
            builder.append("fId", getFId());
        }
        if (getFieldId() != null) {
            builder.append("fieldId", getFieldId());
        }
        if (getFieldName() != null) {
            builder.append("fieldName", getFieldName());
        }
        return builder.toString();
    }

    public TbPrivFFieldsKey() {
        /* pass */
    }

    public TbPrivFFieldsKey(Map<String, ?> map) {
        set(map);
    }

    public TbPrivFFieldsKey(AbstractTable table) {
        set(table);
    }

    public TbPrivFFieldsKey(String dataId, String fId, String fieldId, String fieldName) {
        setDataId(dataId);
        setFId(fId);
        setFieldId(fieldId);
        setFieldName(fieldName);
    }

    public enum Column {
        DATA_ID,
        F_ID,
        FIELD_ID,
        FIELD_NAME;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
