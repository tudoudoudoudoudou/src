package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbGroup extends AbstractTable {
    private String groupId;

    private String departId;

    private String groupName;

    private String pgroupId;

    private String groupContact;

    private String inqId;

    private String corpId;

    private static final long serialVersionUID = 1L;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getPgroupId() {
        return pgroupId;
    }

    public void setPgroupId(String pgroupId) {
        this.pgroupId = pgroupId == null ? null : pgroupId.trim();
    }

    public String getGroupContact() {
        return groupContact;
    }

    public void setGroupContact(String groupContact) {
        this.groupContact = groupContact == null ? null : groupContact.trim();
    }

    public String getInqId() {
        return inqId;
    }

    public void setInqId(String inqId) {
        this.inqId = inqId == null ? null : inqId.trim();
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
        case GROUP_ID: {
            return getGroupId();
        }
        case DEPART_ID: {
            return getDepartId();
        }
        case GROUP_NAME: {
            return getGroupName();
        }
        case PGROUP_ID: {
            return getPgroupId();
        }
        case GROUP_CONTACT: {
            return getGroupContact();
        }
        case INQ_ID: {
            return getInqId();
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

    public TbGroup set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case GROUP_ID: {
            setGroupId(value);
            break;
        }
        case DEPART_ID: {
            setDepartId(value);
            break;
        }
        case GROUP_NAME: {
            setGroupName(value);
            break;
        }
        case PGROUP_ID: {
            setPgroupId(value);
            break;
        }
        case GROUP_CONTACT: {
            setGroupContact(value);
            break;
        }
        case INQ_ID: {
            setInqId(value);
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
    public TbGroup set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbGroup set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbGroup set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbGroup)) {
            return false;
        }
        TbGroup rhs = (TbGroup) obj;
        return new EqualsBuilder()
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getGroupId() != null) {
            builder.append("groupId", getGroupId());
        }
        if (getDepartId() != null) {
            builder.append("departId", getDepartId());
        }
        if (getGroupName() != null) {
            builder.append("groupName", getGroupName());
        }
        if (getPgroupId() != null) {
            builder.append("pgroupId", getPgroupId());
        }
        if (getGroupContact() != null) {
            builder.append("groupContact", getGroupContact());
        }
        if (getInqId() != null) {
            builder.append("inqId", getInqId());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        return builder.toString();
    }

    public TbGroup() {
        /* pass */
    }

    public TbGroup(Map<String, ?> map) {
        set(map);
    }

    public TbGroup(AbstractTable table) {
        set(table);
    }

    public enum Column {
        GROUP_ID,
        DEPART_ID,
        GROUP_NAME,
        PGROUP_ID,
        GROUP_CONTACT,
        INQ_ID,
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
