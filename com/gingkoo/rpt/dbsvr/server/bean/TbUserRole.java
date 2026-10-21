package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbUserRole extends AbstractTable {
    private String userId;

    private String roleId;

    private String authType;

    private String status;

    private String creater;

    private String createdDate;

    private String modUser;

    private String modDate;

    private String checkUser;

    private String checkDate;

    private String optType;

    private BigDecimal varsionNo;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate == null ? null : createdDate.trim();
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

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser == null ? null : checkUser.trim();
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType == null ? null : optType.trim();
    }

    public BigDecimal getVarsionNo() {
        return varsionNo;
    }

    public void setVarsionNo(BigDecimal varsionNo) {
        this.varsionNo = varsionNo;
    }

    public String getRsv1() {
        return rsv1;
    }

    public void setRsv1(String rsv1) {
        this.rsv1 = rsv1 == null ? null : rsv1.trim();
    }

    public String getRsv2() {
        return rsv2;
    }

    public void setRsv2(String rsv2) {
        this.rsv2 = rsv2 == null ? null : rsv2.trim();
    }

    public String getRsv3() {
        return rsv3;
    }

    public void setRsv3(String rsv3) {
        this.rsv3 = rsv3 == null ? null : rsv3.trim();
    }

    public String getRsv4() {
        return rsv4;
    }

    public void setRsv4(String rsv4) {
        this.rsv4 = rsv4 == null ? null : rsv4.trim();
    }

    public String getRsv5() {
        return rsv5;
    }

    public void setRsv5(String rsv5) {
        this.rsv5 = rsv5 == null ? null : rsv5.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        Object value;
        if (column == null) return null;
        switch (column) {
        case USER_ID: {
            return getUserId();
        }
        case ROLE_ID: {
            return getRoleId();
        }
        case AUTH_TYPE: {
            return getAuthType();
        }
        case STATUS: {
            return getStatus();
        }
        case CREATER: {
            return getCreater();
        }
        case CREATED_DATE: {
            return getCreatedDate();
        }
        case MOD_USER: {
            return getModUser();
        }
        case MOD_DATE: {
            return getModDate();
        }
        case CHECK_USER: {
            return getCheckUser();
        }
        case CHECK_DATE: {
            return getCheckDate();
        }
        case OPT_TYPE: {
            return getOptType();
        }
        case VARSION_NO: {
            return (value = getVarsionNo()) == null ? null : value.toString();
        }
        case RSV1: {
            return getRsv1();
        }
        case RSV2: {
            return getRsv2();
        }
        case RSV3: {
            return getRsv3();
        }
        case RSV4: {
            return getRsv4();
        }
        case RSV5: {
            return getRsv5();
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

    public TbUserRole set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case USER_ID: {
            setUserId(value);
            break;
        }
        case ROLE_ID: {
            setRoleId(value);
            break;
        }
        case AUTH_TYPE: {
            setAuthType(value);
            break;
        }
        case STATUS: {
            setStatus(value);
            break;
        }
        case CREATER: {
            setCreater(value);
            break;
        }
        case CREATED_DATE: {
            setCreatedDate(value);
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
        case CHECK_USER: {
            setCheckUser(value);
            break;
        }
        case CHECK_DATE: {
            setCheckDate(value);
            break;
        }
        case OPT_TYPE: {
            setOptType(value);
            break;
        }
        case VARSION_NO: {
            value = StringUtils.stripToNull(value);
            setVarsionNo(value == null ? null : new BigDecimal(value));
            break;
        }
        case RSV1: {
            setRsv1(value);
            break;
        }
        case RSV2: {
            setRsv2(value);
            break;
        }
        case RSV3: {
            setRsv3(value);
            break;
        }
        case RSV4: {
            setRsv4(value);
            break;
        }
        case RSV5: {
            setRsv5(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public TbUserRole set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbUserRole set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbUserRole set(AbstractTable table) {
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
        } else if (!(obj instanceof TbUserRole)) {
            return false;
        }
        TbUserRole rhs = (TbUserRole) obj;
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
        if (getUserId() != null) {
            builder.append("userId", getUserId());
        }
        if (getRoleId() != null) {
            builder.append("roleId", getRoleId());
        }
        if (getAuthType() != null) {
            builder.append("authType", getAuthType());
        }
        if (getStatus() != null) {
            builder.append("status", getStatus());
        }
        if (getCreater() != null) {
            builder.append("creater", getCreater());
        }
        if (getCreatedDate() != null) {
            builder.append("createdDate", getCreatedDate());
        }
        if (getModUser() != null) {
            builder.append("modUser", getModUser());
        }
        if (getModDate() != null) {
            builder.append("modDate", getModDate());
        }
        if (getCheckUser() != null) {
            builder.append("checkUser", getCheckUser());
        }
        if (getCheckDate() != null) {
            builder.append("checkDate", getCheckDate());
        }
        if (getOptType() != null) {
            builder.append("optType", getOptType());
        }
        if (getVarsionNo() != null) {
            builder.append("varsionNo", getVarsionNo());
        }
        if (getRsv1() != null) {
            builder.append("rsv1", getRsv1());
        }
        if (getRsv2() != null) {
            builder.append("rsv2", getRsv2());
        }
        if (getRsv3() != null) {
            builder.append("rsv3", getRsv3());
        }
        if (getRsv4() != null) {
            builder.append("rsv4", getRsv4());
        }
        if (getRsv5() != null) {
            builder.append("rsv5", getRsv5());
        }
        return builder.toString();
    }

    public TbUserRole() {
        /* pass */
    }

    public TbUserRole(Map<String, ?> map) {
        set(map);
    }

    public TbUserRole(AbstractTable table) {
        set(table);
    }

    public enum Column {
        USER_ID,
        ROLE_ID,
        AUTH_TYPE,
        STATUS,
        CREATER,
        CREATED_DATE,
        MOD_USER,
        MOD_DATE,
        CHECK_USER,
        CHECK_DATE,
        OPT_TYPE,
        VARSION_NO,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
