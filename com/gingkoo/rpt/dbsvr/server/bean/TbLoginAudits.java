package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbLoginAudits extends AbstractTable {
    private String id;

    private String ip;

    private String sessionId;

    private String created;

    private String auditType;

    private String message;

    private String userId;

    private String auditPosition;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created == null ? null : created.trim();
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType == null ? null : auditType.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAuditPosition() {
        return auditPosition;
    }

    public void setAuditPosition(String auditPosition) {
        this.auditPosition = auditPosition == null ? null : auditPosition.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case ID: {
            return getId();
        }
        case IP: {
            return getIp();
        }
        case SESSION_ID: {
            return getSessionId();
        }
        case CREATED: {
            return getCreated();
        }
        case AUDIT_TYPE: {
            return getAuditType();
        }
        case MESSAGE: {
            return getMessage();
        }
        case USER_ID: {
            return getUserId();
        }
        case AUDIT_POSITION: {
            return getAuditPosition();
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

    public TbLoginAudits set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case ID: {
            setId(value);
            break;
        }
        case IP: {
            setIp(value);
            break;
        }
        case SESSION_ID: {
            setSessionId(value);
            break;
        }
        case CREATED: {
            setCreated(value);
            break;
        }
        case AUDIT_TYPE: {
            setAuditType(value);
            break;
        }
        case MESSAGE: {
            setMessage(value);
            break;
        }
        case USER_ID: {
            setUserId(value);
            break;
        }
        case AUDIT_POSITION: {
            setAuditPosition(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbLoginAudits set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbLoginAudits set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbLoginAudits set(AbstractTable table) {
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
        } else if (!(obj instanceof TbLoginAudits)) {
            return false;
        }
        TbLoginAudits rhs = (TbLoginAudits) obj;
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
        if (getId() != null) {
            builder.append("id", getId());
        }
        if (getIp() != null) {
            builder.append("ip", getIp());
        }
        if (getSessionId() != null) {
            builder.append("sessionId", getSessionId());
        }
        if (getCreated() != null) {
            builder.append("created", getCreated());
        }
        if (getAuditType() != null) {
            builder.append("auditType", getAuditType());
        }
        if (getMessage() != null) {
            builder.append("message", getMessage());
        }
        if (getUserId() != null) {
            builder.append("userId", getUserId());
        }
        if (getAuditPosition() != null) {
            builder.append("auditPosition", getAuditPosition());
        }
        return builder.toString();
    }

    public TbLoginAudits() {
        /* pass */
    }

    public TbLoginAudits(Map<String, ?> map) {
        set(map);
    }

    public TbLoginAudits(AbstractTable table) {
        set(table);
    }

    public enum Column {
        ID,
        IP,
        SESSION_ID,
        CREATED,
        AUDIT_TYPE,
        MESSAGE,
        USER_ID,
        AUDIT_POSITION;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
