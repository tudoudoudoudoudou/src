package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TbBranch extends AbstractTable {
    private String departId;

    private String pdepartId;

    private String departCode;

    private String departName;

    private String departAddress;

    private String areaCode;

    private String zipCode;

    private String phoneNo;

    private String reportCode;

    private String reportName;

    private String calendarNo;

    private String inqId;

    private String corpId;

    private static final long serialVersionUID = 1L;

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getPdepartId() {
        return pdepartId;
    }

    public void setPdepartId(String pdepartId) {
        this.pdepartId = pdepartId == null ? null : pdepartId.trim();
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode == null ? null : departCode.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getDepartAddress() {
        return departAddress;
    }

    public void setDepartAddress(String departAddress) {
        this.departAddress = departAddress == null ? null : departAddress.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode == null ? null : reportCode.trim();
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    public String getCalendarNo() {
        return calendarNo;
    }

    public void setCalendarNo(String calendarNo) {
        this.calendarNo = calendarNo == null ? null : calendarNo.trim();
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
        case DEPART_ID: {
            return getDepartId();
        }
        case PDEPART_ID: {
            return getPdepartId();
        }
        case DEPART_CODE: {
            return getDepartCode();
        }
        case DEPART_NAME: {
            return getDepartName();
        }
        case DEPART_ADDRESS: {
            return getDepartAddress();
        }
        case AREA_CODE: {
            return getAreaCode();
        }
        case ZIP_CODE: {
            return getZipCode();
        }
        case PHONE_NO: {
            return getPhoneNo();
        }
        case REPORT_CODE: {
            return getReportCode();
        }
        case REPORT_NAME: {
            return getReportName();
        }
        case CALENDAR_NO: {
            return getCalendarNo();
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

    public TbBranch set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case DEPART_ID: {
            setDepartId(value);
            break;
        }
        case PDEPART_ID: {
            setPdepartId(value);
            break;
        }
        case DEPART_CODE: {
            setDepartCode(value);
            break;
        }
        case DEPART_NAME: {
            setDepartName(value);
            break;
        }
        case DEPART_ADDRESS: {
            setDepartAddress(value);
            break;
        }
        case AREA_CODE: {
            setAreaCode(value);
            break;
        }
        case ZIP_CODE: {
            setZipCode(value);
            break;
        }
        case PHONE_NO: {
            setPhoneNo(value);
            break;
        }
        case REPORT_CODE: {
            setReportCode(value);
            break;
        }
        case REPORT_NAME: {
            setReportName(value);
            break;
        }
        case CALENDAR_NO: {
            setCalendarNo(value);
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
    public TbBranch set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public TbBranch set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public TbBranch set(AbstractTable table) {
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
        } else if (!(obj instanceof TbBranch)) {
            return false;
        }
        TbBranch rhs = (TbBranch) obj;
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
        if (getDepartId() != null) {
            builder.append("departId", getDepartId());
        }
        if (getPdepartId() != null) {
            builder.append("pdepartId", getPdepartId());
        }
        if (getDepartCode() != null) {
            builder.append("departCode", getDepartCode());
        }
        if (getDepartName() != null) {
            builder.append("departName", getDepartName());
        }
        if (getDepartAddress() != null) {
            builder.append("departAddress", getDepartAddress());
        }
        if (getAreaCode() != null) {
            builder.append("areaCode", getAreaCode());
        }
        if (getZipCode() != null) {
            builder.append("zipCode", getZipCode());
        }
        if (getPhoneNo() != null) {
            builder.append("phoneNo", getPhoneNo());
        }
        if (getReportCode() != null) {
            builder.append("reportCode", getReportCode());
        }
        if (getReportName() != null) {
            builder.append("reportName", getReportName());
        }
        if (getCalendarNo() != null) {
            builder.append("calendarNo", getCalendarNo());
        }
        if (getInqId() != null) {
            builder.append("inqId", getInqId());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        return builder.toString();
    }

    public TbBranch() {
        /* pass */
    }

    public TbBranch(Map<String, ?> map) {
        set(map);
    }

    public TbBranch(AbstractTable table) {
        set(table);
    }

    public enum Column {
        DEPART_ID,
        PDEPART_ID,
        DEPART_CODE,
        DEPART_NAME,
        DEPART_ADDRESS,
        AREA_CODE,
        ZIP_CODE,
        PHONE_NO,
        REPORT_CODE,
        REPORT_NAME,
        CALENDAR_NO,
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
