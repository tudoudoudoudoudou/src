package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Table(name = "TB_PRIV_F_MAP")
public class TbPrivFMapKey extends AbstractTable {
    @Id
    private String dataId;

    @Id
    private String fId;

    @Id
    private String fieldId;

    @Id
    private String codeSchema;

    @Id
    private String codeItem;

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

    public String getCodeSchema() {
        return codeSchema;
    }

    public void setCodeSchema(String codeSchema) {
        this.codeSchema = codeSchema == null ? null : codeSchema.trim();
    }

    public String getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(String codeItem) {
        this.codeItem = codeItem == null ? null : codeItem.trim();
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
        case CODE_SCHEMA: {
            return getCodeSchema();
        }
        case CODE_ITEM: {
            return getCodeItem();
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

    public TbPrivFMapKey set(Column column, String value) {
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
        case CODE_SCHEMA: {
            setCodeSchema(value);
            break;
        }
        case CODE_ITEM: {
            setCodeItem(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbPrivFMapKey set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbPrivFMapKey set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbPrivFMapKey set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDataId()).append("|");
        sb.append(getFId()).append("|");
        sb.append(getFieldId()).append("|");
        sb.append(getCodeSchema()).append("|");
        sb.append(getCodeItem()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbPrivFMapKey)) {
            return false;
        }
        TbPrivFMapKey rhs = (TbPrivFMapKey) obj;
        return new EqualsBuilder()
                .append(getDataId(), rhs.getDataId())
                .append(getFId(), rhs.getFId())
                .append(getFieldId(), rhs.getFieldId())
                .append(getCodeSchema(), rhs.getCodeSchema())
                .append(getCodeItem(), rhs.getCodeItem())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDataId())
                .append(getFId())
                .append(getFieldId())
                .append(getCodeSchema())
                .append(getCodeItem())
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
        if (getCodeSchema() != null) {
            builder.append("codeSchema", getCodeSchema());
        }
        if (getCodeItem() != null) {
            builder.append("codeItem", getCodeItem());
        }
        return builder.toString();
    }

    public TbPrivFMapKey() {
        /* pass */
    }

    public TbPrivFMapKey(Map<String, ?> map) {
        set(map);
    }

    public TbPrivFMapKey(AbstractTable table) {
        set(table);
    }

    public TbPrivFMapKey(String dataId, String fId, String fieldId, String codeSchema, String codeItem) {
        setDataId(dataId);
        setFId(fId);
        setFieldId(fieldId);
        setCodeSchema(codeSchema);
        setCodeItem(codeItem);
    }

    public enum Column {
        DATA_ID,
        F_ID,
        FIELD_ID,
        CODE_SCHEMA,
        CODE_ITEM;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
