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

public class PmVatGtsBVoc extends AbstractTable {
    @Id
    private BigDecimal id;

    private String fpzl;

    private String fpdm;

    private String startno;

    private BigDecimal count;

    private BigDecimal remain;

    private String kpdh;

    private String buyday;

    private BigDecimal limit;

    private String dataCrtTime;

    private String rsv1;

    private String rsv2;

    private String rsv3;

    private String rsv4;

    private String rsv5;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFpzl() {
        return fpzl;
    }

    public void setFpzl(String fpzl) {
        this.fpzl = fpzl == null ? null : fpzl.trim();
    }

    public String getFpdm() {
        return fpdm;
    }

    public void setFpdm(String fpdm) {
        this.fpdm = fpdm == null ? null : fpdm.trim();
    }

    public String getStartno() {
        return startno;
    }

    public void setStartno(String startno) {
        this.startno = startno == null ? null : startno.trim();
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getRemain() {
        return remain;
    }

    public void setRemain(BigDecimal remain) {
        this.remain = remain;
    }

    public String getKpdh() {
        return kpdh;
    }

    public void setKpdh(String kpdh) {
        this.kpdh = kpdh == null ? null : kpdh.trim();
    }

    public String getBuyday() {
        return buyday;
    }

    public void setBuyday(String buyday) {
        this.buyday = buyday == null ? null : buyday.trim();
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public String getDataCrtTime() {
        return dataCrtTime;
    }

    public void setDataCrtTime(String dataCrtTime) {
        this.dataCrtTime = dataCrtTime == null ? null : dataCrtTime.trim();
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
        case ID: {
            return (value = getId()) == null ? null : value.toString();
        }
        case FPZL: {
            return getFpzl();
        }
        case FPDM: {
            return getFpdm();
        }
        case STARTNO: {
            return getStartno();
        }
        case COUNT: {
            return (value = getCount()) == null ? null : value.toString();
        }
        case REMAIN: {
            return (value = getRemain()) == null ? null : value.toString();
        }
        case KPDH: {
            return getKpdh();
        }
        case BUYDAY: {
            return getBuyday();
        }
        case LIMIT: {
            return (value = getLimit()) == null ? null : value.toString();
        }
        case DATA_CRT_TIME: {
            return getDataCrtTime();
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

    public PmVatGtsBVoc set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case ID: {
            value = StringUtils.stripToNull(value);
            setId(value == null ? null : new BigDecimal(value));
            break;
        }
        case FPZL: {
            setFpzl(value);
            break;
        }
        case FPDM: {
            setFpdm(value);
            break;
        }
        case STARTNO: {
            setStartno(value);
            break;
        }
        case COUNT: {
            value = StringUtils.stripToNull(value);
            setCount(value == null ? null : new BigDecimal(value));
            break;
        }
        case REMAIN: {
            value = StringUtils.stripToNull(value);
            setRemain(value == null ? null : new BigDecimal(value));
            break;
        }
        case KPDH: {
            setKpdh(value);
            break;
        }
        case BUYDAY: {
            setBuyday(value);
            break;
        }
        case LIMIT: {
            value = StringUtils.stripToNull(value);
            setLimit(value == null ? null : new BigDecimal(value));
            break;
        }
        case DATA_CRT_TIME: {
            setDataCrtTime(value);
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
    public PmVatGtsBVoc set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public PmVatGtsBVoc set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public PmVatGtsBVoc set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof PmVatGtsBVoc)) {
            return false;
        }
        PmVatGtsBVoc rhs = (PmVatGtsBVoc) obj;
        return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getId() != null) {
            builder.append("id", getId());
        }
        if (getFpzl() != null) {
            builder.append("fpzl", getFpzl());
        }
        if (getFpdm() != null) {
            builder.append("fpdm", getFpdm());
        }
        if (getStartno() != null) {
            builder.append("startno", getStartno());
        }
        if (getCount() != null) {
            builder.append("count", getCount());
        }
        if (getRemain() != null) {
            builder.append("remain", getRemain());
        }
        if (getKpdh() != null) {
            builder.append("kpdh", getKpdh());
        }
        if (getBuyday() != null) {
            builder.append("buyday", getBuyday());
        }
        if (getLimit() != null) {
            builder.append("limit", getLimit());
        }
        if (getDataCrtTime() != null) {
            builder.append("dataCrtTime", getDataCrtTime());
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

    public PmVatGtsBVoc() {
        /* pass */
    }

    public PmVatGtsBVoc(Map<String, ?> map) {
        set(map);
    }

    public PmVatGtsBVoc(AbstractTable table) {
        set(table);
    }

    public enum Column {
        ID,
        FPZL,
        FPDM,
        STARTNO,
        COUNT,
        REMAIN,
        KPDH,
        BUYDAY,
        LIMIT,
        DATA_CRT_TIME,
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
