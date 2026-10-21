package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.math.BigDecimal;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsXlsVatTaxRptA4 extends AbstractTable {
    private String col1;

    private String col2;

    private String col3;

    private String col4;

    private String col5;

    private String col6;

    private String col7;

    private String col8;

    private String col9;

    private String dataDate;

    private String corpId;

    private String orgId;

    private String groupId;

    private String inqOrgId;

    private String inqGroupId;

    private String checkFlag;

    private String checkDesc;

    private String nextAction;

    private String dataStatus;

    private String dataFlag;

    private String dataSource;

    private BigDecimal dataVersion;

    private String dataId;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private String checkErrType;

    private static final long serialVersionUID = 1L;

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1 == null ? null : col1.trim();
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2 == null ? null : col2.trim();
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3 == null ? null : col3.trim();
    }

    public String getCol4() {
        return col4;
    }

    public void setCol4(String col4) {
        this.col4 = col4 == null ? null : col4.trim();
    }

    public String getCol5() {
        return col5;
    }

    public void setCol5(String col5) {
        this.col5 = col5 == null ? null : col5.trim();
    }

    public String getCol6() {
        return col6;
    }

    public void setCol6(String col6) {
        this.col6 = col6 == null ? null : col6.trim();
    }

    public String getCol7() {
        return col7;
    }

    public void setCol7(String col7) {
        this.col7 = col7 == null ? null : col7.trim();
    }

    public String getCol8() {
        return col8;
    }

    public void setCol8(String col8) {
        this.col8 = col8 == null ? null : col8.trim();
    }

    public String getCol9() {
        return col9;
    }

    public void setCol9(String col9) {
        this.col9 = col9 == null ? null : col9.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getInqOrgId() {
        return inqOrgId;
    }

    public void setInqOrgId(String inqOrgId) {
        this.inqOrgId = inqOrgId == null ? null : inqOrgId.trim();
    }

    public String getInqGroupId() {
        return inqGroupId;
    }

    public void setInqGroupId(String inqGroupId) {
        this.inqGroupId = inqGroupId == null ? null : inqGroupId.trim();
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getCheckDesc() {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc) {
        this.checkDesc = checkDesc == null ? null : checkDesc.trim();
    }

    public String getNextAction() {
        return nextAction;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction == null ? null : nextAction.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public BigDecimal getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(BigDecimal dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
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

    public String getCheckErrType() {
        return checkErrType;
    }

    public void setCheckErrType(String checkErrType) {
        this.checkErrType = checkErrType == null ? null : checkErrType.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        Object value;
        if (column == null) return null;
        switch (column) {
        case COL1: {
            return getCol1();
        }
        case COL2: {
            return getCol2();
        }
        case COL3: {
            return getCol3();
        }
        case COL4: {
            return getCol4();
        }
        case COL5: {
            return getCol5();
        }
        case COL6: {
            return getCol6();
        }
        case COL7: {
            return getCol7();
        }
        case COL8: {
            return getCol8();
        }
        case COL9: {
            return getCol9();
        }
        case DATA_DATE: {
            return getDataDate();
        }
        case CORP_ID: {
            return getCorpId();
        }
        case ORG_ID: {
            return getOrgId();
        }
        case GROUP_ID: {
            return getGroupId();
        }
        case INQ_ORG_ID: {
            return getInqOrgId();
        }
        case INQ_GROUP_ID: {
            return getInqGroupId();
        }
        case CHECK_FLAG: {
            return getCheckFlag();
        }
        case CHECK_DESC: {
            return getCheckDesc();
        }
        case NEXT_ACTION: {
            return getNextAction();
        }
        case DATA_STATUS: {
            return getDataStatus();
        }
        case DATA_FLAG: {
            return getDataFlag();
        }
        case DATA_SOURCE: {
            return getDataSource();
        }
        case DATA_VERSION: {
            return (value = getDataVersion()) == null ? null : value.toString();
        }
        case DATA_ID: {
            return getDataId();
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
        case CHECK_ERR_TYPE: {
            return getCheckErrType();
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

    public OdsXlsVatTaxRptA4 set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case COL1: {
            setCol1(value);
            break;
        }
        case COL2: {
            setCol2(value);
            break;
        }
        case COL3: {
            setCol3(value);
            break;
        }
        case COL4: {
            setCol4(value);
            break;
        }
        case COL5: {
            setCol5(value);
            break;
        }
        case COL6: {
            setCol6(value);
            break;
        }
        case COL7: {
            setCol7(value);
            break;
        }
        case COL8: {
            setCol8(value);
            break;
        }
        case COL9: {
            setCol9(value);
            break;
        }
        case DATA_DATE: {
            setDataDate(value);
            break;
        }
        case CORP_ID: {
            setCorpId(value);
            break;
        }
        case ORG_ID: {
            setOrgId(value);
            break;
        }
        case GROUP_ID: {
            setGroupId(value);
            break;
        }
        case INQ_ORG_ID: {
            setInqOrgId(value);
            break;
        }
        case INQ_GROUP_ID: {
            setInqGroupId(value);
            break;
        }
        case CHECK_FLAG: {
            setCheckFlag(value);
            break;
        }
        case CHECK_DESC: {
            setCheckDesc(value);
            break;
        }
        case NEXT_ACTION: {
            setNextAction(value);
            break;
        }
        case DATA_STATUS: {
            setDataStatus(value);
            break;
        }
        case DATA_FLAG: {
            setDataFlag(value);
            break;
        }
        case DATA_SOURCE: {
            setDataSource(value);
            break;
        }
        case DATA_VERSION: {
            value = StringUtils.stripToNull(value);
            setDataVersion(value == null ? null : new BigDecimal(value));
            break;
        }
        case DATA_ID: {
            setDataId(value);
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
        case CHECK_ERR_TYPE: {
            setCheckErrType(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsXlsVatTaxRptA4 set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsXlsVatTaxRptA4 set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsXlsVatTaxRptA4 set(AbstractTable table) {
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
        } else if (!(obj instanceof OdsXlsVatTaxRptA4)) {
            return false;
        }
        OdsXlsVatTaxRptA4 rhs = (OdsXlsVatTaxRptA4) obj;
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
        if (getCol1() != null) {
            builder.append("col1", getCol1());
        }
        if (getCol2() != null) {
            builder.append("col2", getCol2());
        }
        if (getCol3() != null) {
            builder.append("col3", getCol3());
        }
        if (getCol4() != null) {
            builder.append("col4", getCol4());
        }
        if (getCol5() != null) {
            builder.append("col5", getCol5());
        }
        if (getCol6() != null) {
            builder.append("col6", getCol6());
        }
        if (getCol7() != null) {
            builder.append("col7", getCol7());
        }
        if (getCol8() != null) {
            builder.append("col8", getCol8());
        }
        if (getCol9() != null) {
            builder.append("col9", getCol9());
        }
        if (getDataDate() != null) {
            builder.append("dataDate", getDataDate());
        }
        if (getCorpId() != null) {
            builder.append("corpId", getCorpId());
        }
        if (getOrgId() != null) {
            builder.append("orgId", getOrgId());
        }
        if (getGroupId() != null) {
            builder.append("groupId", getGroupId());
        }
        if (getInqOrgId() != null) {
            builder.append("inqOrgId", getInqOrgId());
        }
        if (getInqGroupId() != null) {
            builder.append("inqGroupId", getInqGroupId());
        }
        if (getCheckFlag() != null) {
            builder.append("checkFlag", getCheckFlag());
        }
        if (getCheckDesc() != null) {
            builder.append("checkDesc", getCheckDesc());
        }
        if (getNextAction() != null) {
            builder.append("nextAction", getNextAction());
        }
        if (getDataStatus() != null) {
            builder.append("dataStatus", getDataStatus());
        }
        if (getDataFlag() != null) {
            builder.append("dataFlag", getDataFlag());
        }
        if (getDataSource() != null) {
            builder.append("dataSource", getDataSource());
        }
        if (getDataVersion() != null) {
            builder.append("dataVersion", getDataVersion());
        }
        if (getDataId() != null) {
            builder.append("dataId", getDataId());
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
        if (getCheckErrType() != null) {
            builder.append("checkErrType", getCheckErrType());
        }
        return builder.toString();
    }

    public OdsXlsVatTaxRptA4() {
        /* pass */
    }

    public OdsXlsVatTaxRptA4(Map<String, ?> map) {
        set(map);
    }

    public OdsXlsVatTaxRptA4(AbstractTable table) {
        set(table);
    }

    public enum Column {
        COL1,
        COL2,
        COL3,
        COL4,
        COL5,
        COL6,
        COL7,
        COL8,
        COL9,
        DATA_DATE,
        CORP_ID,
        ORG_ID,
        GROUP_ID,
        INQ_ORG_ID,
        INQ_GROUP_ID,
        CHECK_FLAG,
        CHECK_DESC,
        NEXT_ACTION,
        DATA_STATUS,
        DATA_FLAG,
        DATA_SOURCE,
        DATA_VERSION,
        DATA_ID,
        RSV1,
        RSV2,
        RSV3,
        RSV4,
        RSV5,
        CHECK_ERR_TYPE;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
