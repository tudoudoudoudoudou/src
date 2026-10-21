package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Table(name = "TB_NEXT_ACTION")
public class TbNextActionKey extends AbstractTable {
    @Id
    private String corpId;

    @Id
    private String actionId;

    @Id
    private String conditionId;

    @Id
    private String currDataStatus;

    private static final long serialVersionUID = 1L;

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId == null ? null : actionId.trim();
    }

    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId == null ? null : conditionId.trim();
    }

    public String getCurrDataStatus() {
        return currDataStatus;
    }

    public void setCurrDataStatus(String currDataStatus) {
        this.currDataStatus = currDataStatus == null ? null : currDataStatus.trim();
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
        case ACTION_ID: {
            return getActionId();
        }
        case CONDITION_ID: {
            return getConditionId();
        }
        case CURR_DATA_STATUS: {
            return getCurrDataStatus();
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

    public TbNextActionKey set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case ACTION_ID: {
            setActionId(value);
            break;
        }
        case CONDITION_ID: {
            setConditionId(value);
            break;
        }
        case CURR_DATA_STATUS: {
            setCurrDataStatus(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbNextActionKey set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbNextActionKey set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbNextActionKey set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCorpId()).append("|");
        sb.append(getActionId()).append("|");
        sb.append(getConditionId()).append("|");
        sb.append(getCurrDataStatus()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbNextActionKey)) {
            return false;
        }
        TbNextActionKey rhs = (TbNextActionKey) obj;
        return new EqualsBuilder()
                .append(getCorpId(), rhs.getCorpId())
                .append(getActionId(), rhs.getActionId())
                .append(getConditionId(), rhs.getConditionId())
                .append(getCurrDataStatus(), rhs.getCurrDataStatus())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getCorpId())
                .append(getActionId())
                .append(getConditionId())
                .append(getCurrDataStatus())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getActionId() != null) {
            builder.append("actionId", getActionId());
        }
        if (getConditionId() != null) {
            builder.append("conditionId", getConditionId());
        }
        if (getCurrDataStatus() != null) {
            builder.append("currDataStatus", getCurrDataStatus());
        }
        return builder.toString();
    }

    public TbNextActionKey() {
        /* pass */
    }

    public TbNextActionKey(Map<String, ?> map) {
        set(map);
    }

    public TbNextActionKey(AbstractTable table) {
        set(table);
    }

    public TbNextActionKey(String corpId, String actionId, String conditionId, String currDataStatus) {
        setCorpId(corpId);
        setActionId(actionId);
        setConditionId(conditionId);
        setCurrDataStatus(currDataStatus);
    }

    public enum Column {
        CORP_ID,
        ACTION_ID,
        CONDITION_ID,
        CURR_DATA_STATUS;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
