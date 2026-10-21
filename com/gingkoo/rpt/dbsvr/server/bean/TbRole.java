package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbRole extends AbstractTable {
    private String roleId;

    private String roleName;

    private String descn;

    private String creater;

    private String createdDate;

    private String modUser;

    private String modDate;

    private String checkUser;

    private String checkDate;

    private String delFlag;

    private BigDecimal varsionNo;

    private String corpId;

    private String roleType;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private static final long serialVersionUID = 1L;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn == null ? null : descn.trim();
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public BigDecimal getVarsionNo() {
        return varsionNo;
    }

    public void setVarsionNo(BigDecimal varsionNo) {
        this.varsionNo = varsionNo;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
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
        case ROLE_ID: {
            return getRoleId();
        }
        case ROLE_NAME: {
            return getRoleName();
        }
        case DESCN: {
            return getDescn();
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
        case DEL_FLAG: {
            return getDelFlag();
        }
        case VARSION_NO: {
            return (value = getVarsionNo()) == null ? null : value.toString();
        }
        case CORP_ID: {
            return getCorpId();
        }
        case ROLE_TYPE: {
            return getRoleType();
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

    public TbRole set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case ROLE_ID: {
            setRoleId(value);
            break;
        }
        case ROLE_NAME: {
            setRoleName(value);
            break;
        }
        case DESCN: {
            setDescn(value);
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
        case DEL_FLAG: {
            setDelFlag(value);
            break;
        }
        case VARSION_NO: {
            value = StringUtils.stripToNull(value);
            setVarsionNo(value == null ? null : new BigDecimal(value));
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case ROLE_TYPE: {
            setRoleType(value);
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
    public TbRole set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbRole set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbRole set(AbstractTable table) {
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
        } else if (!(obj instanceof TbRole)) {
            return false;
        }
        TbRole rhs = (TbRole) obj;
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
        if (getRoleId() != null) {
            builder.append("roleId", getRoleId());
        }
        if (getRoleName() != null) {
            builder.append("roleName", getRoleName());
        }
        if (getDescn() != null) {
            builder.append("descn", getDescn());
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
        if (getDelFlag() != null) {
            builder.append("delFlag", getDelFlag());
        }
        if (getVarsionNo() != null) {
            builder.append("varsionNo", getVarsionNo());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getRoleType() != null) {
            builder.append("roleType", getRoleType());
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

    public TbRole() {
        /* pass */
    }

    public TbRole(Map<String, ?> map) {
        set(map);
    }

    public TbRole(AbstractTable table) {
        set(table);
    }

    public enum Column {
        ROLE_ID,
        ROLE_NAME,
        DESCN,
        CREATER,
        CREATED_DATE,
        MOD_USER,
        MOD_DATE,
        CHECK_USER,
        CHECK_DATE,
        DEL_FLAG,
        VARSION_NO,
        CORP_ID,
        ROLE_TYPE,
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
