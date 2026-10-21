package com.gingkoo.rpt.dbsvr.server.bean;

import com.gingkoo.gal.api.orm.mybatis.dbsvr.AbstractTable;
import java.util.Map;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OdsVatTaxReliefCode extends AbstractTable {
    @Id
    private String seqNum;

    private String reliefCode;

    private String reliefName;

    private String incType;

    private String reliefCategories;

    private String reliefSubclasses;

    private String favorsItem;

    private String favorsName;

    private String policyRelate;

    private String policyContent;

    private static final long serialVersionUID = 1L;

    public String getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum == null ? null : seqNum.trim();
    }

    public String getReliefCode() {
        return reliefCode;
    }

    public void setReliefCode(String reliefCode) {
        this.reliefCode = reliefCode == null ? null : reliefCode.trim();
    }

    public String getReliefName() {
        return reliefName;
    }

    public void setReliefName(String reliefName) {
        this.reliefName = reliefName == null ? null : reliefName.trim();
    }

    public String getIncType() {
        return incType;
    }

    public void setIncType(String incType) {
        this.incType = incType == null ? null : incType.trim();
    }

    public String getReliefCategories() {
        return reliefCategories;
    }

    public void setReliefCategories(String reliefCategories) {
        this.reliefCategories = reliefCategories == null ? null : reliefCategories.trim();
    }

    public String getReliefSubclasses() {
        return reliefSubclasses;
    }

    public void setReliefSubclasses(String reliefSubclasses) {
        this.reliefSubclasses = reliefSubclasses == null ? null : reliefSubclasses.trim();
    }

    public String getFavorsItem() {
        return favorsItem;
    }

    public void setFavorsItem(String favorsItem) {
        this.favorsItem = favorsItem == null ? null : favorsItem.trim();
    }

    public String getFavorsName() {
        return favorsName;
    }

    public void setFavorsName(String favorsName) {
        this.favorsName = favorsName == null ? null : favorsName.trim();
    }

    public String getPolicyRelate() {
        return policyRelate;
    }

    public void setPolicyRelate(String policyRelate) {
        this.policyRelate = policyRelate == null ? null : policyRelate.trim();
    }

    public String getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent == null ? null : policyContent.trim();
    }

    @Override
    public boolean contains(String column) {
        return Column.parse(column) != null;
    }

    public String get(Column column) {
        if (column == null) return null;
        switch (column) {
        case SEQ_NUM: {
            return getSeqNum();
        }
        case RELIEF_CODE: {
            return getReliefCode();
        }
        case RELIEF_NAME: {
            return getReliefName();
        }
        case INC_TYPE: {
            return getIncType();
        }
        case RELIEF_CATEGORIES: {
            return getReliefCategories();
        }
        case RELIEF_SUBCLASSES: {
            return getReliefSubclasses();
        }
        case FAVORS_ITEM: {
            return getFavorsItem();
        }
        case FAVORS_NAME: {
            return getFavorsName();
        }
        case POLICY_RELATE: {
            return getPolicyRelate();
        }
        case POLICY_CONTENT: {
            return getPolicyContent();
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

    public OdsVatTaxReliefCode set(Column column, String value) {
        if (column == null) return this;
        switch (column) {
        case SEQ_NUM: {
            setSeqNum(value);
            break;
        }
        case RELIEF_CODE: {
            setReliefCode(value);
            break;
        }
        case RELIEF_NAME: {
            setReliefName(value);
            break;
        }
        case INC_TYPE: {
            setIncType(value);
            break;
        }
        case RELIEF_CATEGORIES: {
            setReliefCategories(value);
            break;
        }
        case RELIEF_SUBCLASSES: {
            setReliefSubclasses(value);
            break;
        }
        case FAVORS_ITEM: {
            setFavorsItem(value);
            break;
        }
        case FAVORS_NAME: {
            setFavorsName(value);
            break;
        }
        case POLICY_RELATE: {
            setPolicyRelate(value);
            break;
        }
        case POLICY_CONTENT: {
            setPolicyContent(value);
            break;
        }
        default: {
            break;
        }}
        return this;
    }

    @Override
    public OdsVatTaxReliefCode set(String column, String value) {
        return set(Column.parse(column), value);
    }

    @Override
    public OdsVatTaxReliefCode set(Map<String, ?> map) {
        for (Column c: Column.values()) {
            if (map.containsKey(c.toString())) {
                Object v = map.get(c.toString());
                set(c, v == null ? null : v.toString());
            }
        }
        return this;
    }

    @Override
    public OdsVatTaxReliefCode set(AbstractTable table) {
        return set(table.get());
    }

    @Override
    public String toKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSeqNum()).append("|");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (!(obj instanceof OdsVatTaxReliefCode)) {
            return false;
        }
        OdsVatTaxReliefCode rhs = (OdsVatTaxReliefCode) obj;
        return new EqualsBuilder()
                .append(getSeqNum(), rhs.getSeqNum())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getSeqNum())
                .toHashCode();
    }

    @Override
    public String toString() {
        ToStringBuilder builder =
                new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        if (getSeqNum() != null) {
            builder.append("seqNum", getSeqNum());
        }
        if (getReliefCode() != null) {
            builder.append("reliefCode", getReliefCode());
        }
        if (getReliefName() != null) {
            builder.append("reliefName", getReliefName());
        }
        if (getIncType() != null) {
            builder.append("incType", getIncType());
        }
        if (getReliefCategories() != null) {
            builder.append("reliefCategories", getReliefCategories());
        }
        if (getReliefSubclasses() != null) {
            builder.append("reliefSubclasses", getReliefSubclasses());
        }
        if (getFavorsItem() != null) {
            builder.append("favorsItem", getFavorsItem());
        }
        if (getFavorsName() != null) {
            builder.append("favorsName", getFavorsName());
        }
        if (getPolicyRelate() != null) {
            builder.append("policyRelate", getPolicyRelate());
        }
        if (getPolicyContent() != null) {
            builder.append("policyContent", getPolicyContent());
        }
        return builder.toString();
    }

    public OdsVatTaxReliefCode() {
        /* pass */
    }

    public OdsVatTaxReliefCode(Map<String, ?> map) {
        set(map);
    }

    public OdsVatTaxReliefCode(AbstractTable table) {
        set(table);
    }

    public enum Column {
        SEQ_NUM,
        RELIEF_CODE,
        RELIEF_NAME,
        INC_TYPE,
        RELIEF_CATEGORIES,
        RELIEF_SUBCLASSES,
        FAVORS_ITEM,
        FAVORS_NAME,
        POLICY_RELATE,
        POLICY_CONTENT;

        public static Column parse(String column) {
            try {
                return Column.valueOf(column.toUpperCase());
            } catch (Exception e) {
                return null;
            }
        }
    }
}
