package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbDict extends AbstractTable {
    private String bank;

    private String application;

    private String groupCode;

    private String groupName;

    private String metaVal;

    private String metaName;

    private String creator;

    private String createTime;

    private String modUser;

    private String modDate;

    private String enable;

    private String remark;

    private String modAble;

    private static final long serialVersionUID = 1L;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getMetaVal() {
        return metaVal;
    }

    public void setMetaVal(String metaVal) {
        this.metaVal = metaVal == null ? null : metaVal.trim();
    }

    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName == null ? null : metaName.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser == null ? null : modUser.trim();
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate == null ? null : modDate.trim();
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getModAble() {
        return modAble;
    }

    public void setModAble(String modAble) {
        this.modAble = modAble == null ? null : modAble.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case BANK: {
            return getBank();
        }
        case APPLICATION: {
            return getApplication();
        }
        case GROUP_CODE: {
            return getGroupCode();
        }
        case GROUP_NAME: {
            return getGroupName();
        }
        case META_VAL: {
            return getMetaVal();
        }
        case META_NAME: {
            return getMetaName();
        }
        case CREATOR: {
            return getCreator();
        }
        case CREATE_TIME: {
            return getCreateTime();
        }
        case MOD_USER: {
            return getModUser();
        }
        case MOD_DATE: {
            return getModDate();
        }
        case ENABLE: {
            return getEnable();
        }
        case REMARK: {
            return getRemark();
        }
        case MOD_ABLE: {
            return getModAble();
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

    public TbDict set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case BANK: {
            setBank(value);
            break;
        }
        case APPLICATION: {
            setApplication(value);
            break;
        }
        case GROUP_CODE: {
            setGroupCode(value);
            break;
        }
        case GROUP_NAME: {
            setGroupName(value);
            break;
        }
        case META_VAL: {
            setMetaVal(value);
            break;
        }
        case META_NAME: {
            setMetaName(value);
            break;
        }
        case CREATOR: {
            setCreator(value);
            break;
        }
        case CREATE_TIME: {
            setCreateTime(value);
            break;
        }
        case MOD_USER: {
            setModUser(value);
            break;
        }
        case MOD_DATE: {
            setModDate(value);
            break;
        }
        case ENABLE: {
            setEnable(value);
            break;
        }
        case REMARK: {
            setRemark(value);
            break;
        }
        case MOD_ABLE: {
            setModAble(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbDict set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbDict set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbDict set(AbstractTable table) {
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
        } else if (!(obj instanceof TbDict)) {
            return false;
        }
        TbDict rhs = (TbDict) obj;
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
        if (getBank() != null) {
            builder.append("bank", getBank());
        }
        if (getApplication() != null) {
            builder.append("application", getApplication());
        }
        if (getGroupCode() != null) {
            builder.append("groupCode", getGroupCode());
        }
        if (getGroupName() != null) {
            builder.append("groupName", getGroupName());
        }
        if (getMetaVal() != null) {
            builder.append("metaVal", getMetaVal());
        }
        if (getMetaName() != null) {
            builder.append("metaName", getMetaName());
        }
        if (getCreator() != null) {
            builder.append("creator", getCreator());
        }
        if (getCreateTime() != null) {
            builder.append("createTime", getCreateTime());
        }
        if (getModUser() != null) {
            builder.append("modUser", getModUser());
        }
        if (getModDate() != null) {
            builder.append("modDate", getModDate());
        }
        if (getEnable() != null) {
            builder.append("enable", getEnable());
        }
        if (getRemark() != null) {
            builder.append("remark", getRemark());
        }
        if (getModAble() != null) {
            builder.append("modAble", getModAble());
        }
        return builder.toString();
    }

    public TbDict() {
        /* pass */
    }

    public TbDict(Map<String, ?> map) {
        set(map);
    }

    public TbDict(AbstractTable table) {
        set(table);
    }

    public enum Column {
        BANK,
        APPLICATION,
        GROUP_CODE,
        GROUP_NAME,
        META_VAL,
        META_NAME,
        CREATOR,
        CREATE_TIME,
        MOD_USER,
        MOD_DATE,
        ENABLE,
        REMARK,
        MOD_ABLE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
