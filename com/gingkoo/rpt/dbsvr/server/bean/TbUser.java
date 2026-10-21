package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbUser extends AbstractTable {
    @Id
    private String userId;

    private String userName;

    private String password;

    private String descn;

    private String status;

    private BigDecimal failureLoginCount;

    private String lastLoginDay;

    private String lastPasswordChangeDay;

    private String staffId;

    private String staffName;

    private String gender;

    private String departId;

    private String onlineStatus;

    private String creater;

    private String createdDate;

    private String modUser;

    private String modDate;

    private String checkUser;

    private String checkDate;

    private String mail;

    private String telno;

    private BigDecimal varsionNo;

    private String userType;

    private String clientSyncEnable;

    private String bank;

    private String application;

    private String isInitialPassword;

    private String corpId;

    private String groupId;

    private String position;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn == null ? null : descn.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getFailureLoginCount() {
        return failureLoginCount;
    }

    public void setFailureLoginCount(BigDecimal failureLoginCount) {
        this.failureLoginCount = failureLoginCount;
    }

    public String getLastLoginDay() {
        return lastLoginDay;
    }

    public void setLastLoginDay(String lastLoginDay) {
        this.lastLoginDay = lastLoginDay == null ? null : lastLoginDay.trim();
    }

    public String getLastPasswordChangeDay() {
        return lastPasswordChangeDay;
    }

    public void setLastPasswordChangeDay(String lastPasswordChangeDay) {
        this.lastPasswordChangeDay = lastPasswordChangeDay == null ? null : lastPasswordChangeDay.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus == null ? null : onlineStatus.trim();
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno == null ? null : telno.trim();
    }

    public BigDecimal getVarsionNo() {
        return varsionNo;
    }

    public void setVarsionNo(BigDecimal varsionNo) {
        this.varsionNo = varsionNo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getClientSyncEnable() {
        return clientSyncEnable;
    }

    public void setClientSyncEnable(String clientSyncEnable) {
        this.clientSyncEnable = clientSyncEnable == null ? null : clientSyncEnable.trim();
    }

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

    public String getIsInitialPassword() {
        return isInitialPassword;
    }

    public void setIsInitialPassword(String isInitialPassword) {
        this.isInitialPassword = isInitialPassword == null ? null : isInitialPassword.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
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
        case USER_NAME: {
            return getUserName();
        }
        case PASSWORD: {
            return getPassword();
        }
        case DESCN: {
            return getDescn();
        }
        case STATUS: {
            return getStatus();
        }
        case FAILURE_LOGIN_COUNT: {
            return (value = getFailureLoginCount()) == null ? null : value.toString();
        }
        case LAST_LOGIN_DAY: {
            return getLastLoginDay();
        }
        case LAST_PASSWORD_CHANGE_DAY: {
            return getLastPasswordChangeDay();
        }
        case STAFF_ID: {
            return getStaffId();
        }
        case STAFF_NAME: {
            return getStaffName();
        }
        case GENDER: {
            return getGender();
        }
        case DEPART_ID: {
            return getDepartId();
        }
        case ONLINE_STATUS: {
            return getOnlineStatus();
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
        case MAIL: {
            return getMail();
        }
        case TELNO: {
            return getTelno();
        }
        case VARSION_NO: {
            return (value = getVarsionNo()) == null ? null : value.toString();
        }
        case USER_TYPE: {
            return getUserType();
        }
        case CLIENT_SYNC_ENABLE: {
            return getClientSyncEnable();
        }
        case BANK: {
            return getBank();
        }
        case APPLICATION: {
            return getApplication();
        }
        case IS_INITIAL_PASSWORD: {
            return getIsInitialPassword();
        }
        case CORP_ID: {
            return getCorpId();
        }
        case GROUP_ID: {
            return getGroupId();
        }
        case POSITION: {
            return getPosition();
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

    public TbUser set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case USER_ID: {
            setUserId(value);
            break;
        }
        case USER_NAME: {
            setUserName(value);
            break;
        }
        case PASSWORD: {
            setPassword(value);
            break;
        }
        case DESCN: {
            setDescn(value);
            break;
        }
        case STATUS: {
            setStatus(value);
            break;
        }
        case FAILURE_LOGIN_COUNT: {
            value = StringUtils.stripToNull(value);
            setFailureLoginCount(value == null ? null : new BigDecimal(value));
            break;
        }
        case LAST_LOGIN_DAY: {
            setLastLoginDay(value);
            break;
        }
        case LAST_PASSWORD_CHANGE_DAY: {
            setLastPasswordChangeDay(value);
            break;
        }
        case STAFF_ID: {
            setStaffId(value);
            break;
        }
        case STAFF_NAME: {
            setStaffName(value);
            break;
        }
        case GENDER: {
            setGender(value);
            break;
        }
        case DEPART_ID: {
            setDepartId(value);
            break;
        }
        case ONLINE_STATUS: {
            setOnlineStatus(value);
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
        case MAIL: {
            setMail(value);
            break;
        }
        case TELNO: {
            setTelno(value);
            break;
        }
        case VARSION_NO: {
            value = StringUtils.stripToNull(value);
            setVarsionNo(value == null ? null : new BigDecimal(value));
            break;
        }
        case USER_TYPE: {
            setUserType(value);
            break;
        }
        case CLIENT_SYNC_ENABLE: {
            setClientSyncEnable(value);
            break;
        }
        case BANK: {
            setBank(value);
            break;
        }
        case APPLICATION: {
            setApplication(value);
            break;
        }
        case IS_INITIAL_PASSWORD: {
            setIsInitialPassword(value);
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case GROUP_ID: {
            setGroupId(value);
            break;
        }
        case POSITION: {
            setPosition(value);
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
    public TbUser set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbUser set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbUser set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getUserId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof TbUser)) {
            return false;
        }
        TbUser rhs = (TbUser) obj;
        return new EqualsBuilder()
                .append(getUserId(), rhs.getUserId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getUserId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getUserId() != null) {
            builder.append("userId", getUserId());
        }
        if (getUserName() != null) {
            builder.append("userName", getUserName());
        }
        if (getPassword() != null) {
            builder.append("password", getPassword());
        }
        if (getDescn() != null) {
            builder.append("descn", getDescn());
        }
        if (getStatus() != null) {
            builder.append("status", getStatus());
        }
        if (getFailureLoginCount() != null) {
            builder.append("failureLoginCount", getFailureLoginCount());
        }
        if (getLastLoginDay() != null) {
            builder.append("lastLoginDay", getLastLoginDay());
        }
        if (getLastPasswordChangeDay() != null) {
            builder.append("lastPasswordChangeDay", getLastPasswordChangeDay());
        }
        if (getStaffId() != null) {
            builder.append("staffId", getStaffId());
        }
        if (getStaffName() != null) {
            builder.append("staffName", getStaffName());
        }
        if (getGender() != null) {
            builder.append("gender", getGender());
        }
        if (getDepartId() != null) {
            builder.append("departId", getDepartId());
        }
        if (getOnlineStatus() != null) {
            builder.append("onlineStatus", getOnlineStatus());
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
        if (getMail() != null) {
            builder.append("mail", getMail());
        }
        if (getTelno() != null) {
            builder.append("telno", getTelno());
        }
        if (getVarsionNo() != null) {
            builder.append("varsionNo", getVarsionNo());
        }
        if (getUserType() != null) {
            builder.append("userType", getUserType());
        }
        if (getClientSyncEnable() != null) {
            builder.append("clientSyncEnable", getClientSyncEnable());
        }
        if (getBank() != null) {
            builder.append("bank", getBank());
        }
        if (getApplication() != null) {
            builder.append("application", getApplication());
        }
        if (getIsInitialPassword() != null) {
            builder.append("isInitialPassword", getIsInitialPassword());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getGroupId() != null) {
            builder.append("groupId", getGroupId());
        }
        if (getPosition() != null) {
            builder.append("position", getPosition());
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

    public TbUser() {
        /* pass */
    }

    public TbUser(Map<String, ?> map) {
        set(map);
    }

    public TbUser(AbstractTable table) {
        set(table);
    }

    public enum Column {
        USER_ID,
        USER_NAME,
        PASSWORD,
        DESCN,
        STATUS,
        FAILURE_LOGIN_COUNT,
        LAST_LOGIN_DAY,
        LAST_PASSWORD_CHANGE_DAY,
        STAFF_ID,
        STAFF_NAME,
        GENDER,
        DEPART_ID,
        ONLINE_STATUS,
        CREATER,
        CREATED_DATE,
        MOD_USER,
        MOD_DATE,
        CHECK_USER,
        CHECK_DATE,
        MAIL,
        TELNO,
        VARSION_NO,
        USER_TYPE,
        CLIENT_SYNC_ENABLE,
        BANK,
        APPLICATION,
        IS_INITIAL_PASSWORD,
        CORP_ID,
        GROUP_ID,
        POSITION,
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
