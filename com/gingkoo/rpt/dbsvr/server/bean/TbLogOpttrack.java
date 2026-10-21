package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbLogOpttrack extends AbstractTable {
    private String gid;

    private String menuName;

    private String funcName;

    private String departId;

    private String userId;

    private String opType;

    private String opTime;

    private String filler1;

    private String filler2;

    private String filler3;

    private String ip;

    private static final long serialVersionUID = 1L;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1 == null ? null : filler1.trim();
    }

    public String getFiller2() {
        return filler2;
    }

    public void setFiller2(String filler2) {
        this.filler2 = filler2 == null ? null : filler2.trim();
    }

    public String getFiller3() {
        return filler3;
    }

    public void setFiller3(String filler3) {
        this.filler3 = filler3 == null ? null : filler3.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case GID: {
            return getGid();
        }
        case MENU_NAME: {
            return getMenuName();
        }
        case FUNC_NAME: {
            return getFuncName();
        }
        case DEPART_ID: {
            return getDepartId();
        }
        case USER_ID: {
            return getUserId();
        }
        case OP_TYPE: {
            return getOpType();
        }
        case OP_TIME: {
            return getOpTime();
        }
        case FILLER1: {
            return getFiller1();
        }
        case FILLER2: {
            return getFiller2();
        }
        case FILLER3: {
            return getFiller3();
        }
        case IP: {
            return getIp();
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

    public TbLogOpttrack set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case GID: {
            setGid(value);
            break;
        }
        case MENU_NAME: {
            setMenuName(value);
            break;
        }
        case FUNC_NAME: {
            setFuncName(value);
            break;
        }
        case DEPART_ID: {
            setDepartId(value);
            break;
        }
        case USER_ID: {
            setUserId(value);
            break;
        }
        case OP_TYPE: {
            setOpType(value);
            break;
        }
        case OP_TIME: {
            setOpTime(value);
            break;
        }
        case FILLER1: {
            setFiller1(value);
            break;
        }
        case FILLER2: {
            setFiller2(value);
            break;
        }
        case FILLER3: {
            setFiller3(value);
            break;
        }
        case IP: {
            setIp(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbLogOpttrack set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbLogOpttrack set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbLogOpttrack set(AbstractTable table) {
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
        } else if (!(obj instanceof TbLogOpttrack)) {
            return false;
        }
        TbLogOpttrack rhs = (TbLogOpttrack) obj;
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
        if (getGid() != null) {
            builder.append("gid", getGid());
        }
        if (getMenuName() != null) {
            builder.append("menuName", getMenuName());
        }
        if (getFuncName() != null) {
            builder.append("funcName", getFuncName());
        }
        if (getDepartId() != null) {
            builder.append("departId", getDepartId());
        }
        if (getUserId() != null) {
            builder.append("userId", getUserId());
        }
        if (getOpType() != null) {
            builder.append("opType", getOpType());
        }
        if (getOpTime() != null) {
            builder.append("opTime", getOpTime());
        }
        if (getFiller1() != null) {
            builder.append("filler1", getFiller1());
        }
        if (getFiller2() != null) {
            builder.append("filler2", getFiller2());
        }
        if (getFiller3() != null) {
            builder.append("filler3", getFiller3());
        }
        if (getIp() != null) {
            builder.append("ip", getIp());
        }
        return builder.toString();
    }

    public TbLogOpttrack() {
        /* pass */
    }

    public TbLogOpttrack(Map<String, ?> map) {
        set(map);
    }

    public TbLogOpttrack(AbstractTable table) {
        set(table);
    }

    public enum Column {
        GID,
        MENU_NAME,
        FUNC_NAME,
        DEPART_ID,
        USER_ID,
        OP_TYPE,
        OP_TIME,
        FILLER1,
        FILLER2,
        FILLER3,
        IP;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
