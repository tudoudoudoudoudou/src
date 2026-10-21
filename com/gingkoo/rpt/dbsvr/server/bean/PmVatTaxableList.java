package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PmVatTaxableList extends AbstractTable {
    @Id
    private String taxableCode;

    private String taxableName;

    private String seqNum;

    private String taxableIndustry;

    private String taxableSubclasses;

    private String illustration;

    private static final long serialVersionUID = 1L;

    public String getTaxableCode() {
        return taxableCode;
    }

    public void setTaxableCode(String taxableCode) {
        this.taxableCode = taxableCode == null ? null : taxableCode.trim();
    }

    public String getTaxableName() {
        return taxableName;
    }

    public void setTaxableName(String taxableName) {
        this.taxableName = taxableName == null ? null : taxableName.trim();
    }

    public String getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum == null ? null : seqNum.trim();
    }

    public String getTaxableIndustry() {
        return taxableIndustry;
    }

    public void setTaxableIndustry(String taxableIndustry) {
        this.taxableIndustry = taxableIndustry == null ? null : taxableIndustry.trim();
    }

    public String getTaxableSubclasses() {
        return taxableSubclasses;
    }

    public void setTaxableSubclasses(String taxableSubclasses) {
        this.taxableSubclasses = taxableSubclasses == null ? null : taxableSubclasses.trim();
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration == null ? null : illustration.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case TAXABLE_CODE: {
            return getTaxableCode();
        }
        case TAXABLE_NAME: {
            return getTaxableName();
        }
        case SEQ_NUM: {
            return getSeqNum();
        }
        case TAXABLE_INDUSTRY: {
            return getTaxableIndustry();
        }
        case TAXABLE_SUBCLASSES: {
            return getTaxableSubclasses();
        }
        case ILLUSTRATION: {
            return getIllustration();
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

    public PmVatTaxableList set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case TAXABLE_CODE: {
            setTaxableCode(value);
            break;
        }
        case TAXABLE_NAME: {
            setTaxableName(value);
            break;
        }
        case SEQ_NUM: {
            setSeqNum(value);
            break;
        }
        case TAXABLE_INDUSTRY: {
            setTaxableIndustry(value);
            break;
        }
        case TAXABLE_SUBCLASSES: {
            setTaxableSubclasses(value);
            break;
        }
        case ILLUSTRATION: {
            setIllustration(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public PmVatTaxableList set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public PmVatTaxableList set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public PmVatTaxableList set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTaxableCode()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof PmVatTaxableList)) {
            return false;
        }
        PmVatTaxableList rhs = (PmVatTaxableList) obj;
        return new EqualsBuilder()
                .append(getTaxableCode(), rhs.getTaxableCode())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getTaxableCode())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getTaxableCode() != null) {
            builder.append("taxableCode", getTaxableCode());
        }
        if (getTaxableName() != null) {
            builder.append("taxableName", getTaxableName());
        }
        if (getSeqNum() != null) {
            builder.append("seqNum", getSeqNum());
        }
        if (getTaxableIndustry() != null) {
            builder.append("taxableIndustry", getTaxableIndustry());
        }
        if (getTaxableSubclasses() != null) {
            builder.append("taxableSubclasses", getTaxableSubclasses());
        }
        if (getIllustration() != null) {
            builder.append("illustration", getIllustration());
        }
        return builder.toString();
    }

    public PmVatTaxableList() {
        /* pass */
    }

    public PmVatTaxableList(Map<String, ?> map) {
        set(map);
    }

    public PmVatTaxableList(AbstractTable table) {
        set(table);
    }

    public enum Column {
        TAXABLE_CODE,
        TAXABLE_NAME,
        SEQ_NUM,
        TAXABLE_INDUSTRY,
        TAXABLE_SUBCLASSES,
        ILLUSTRATION;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
