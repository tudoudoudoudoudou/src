package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class OdsVatTaxableListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsVatTaxableListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTaxableCodeIsNull() {
            addCriterion("TAXABLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeIsNotNull() {
            addCriterion("TAXABLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeEqualTo(String value) {
            addCriterion("TAXABLE_CODE =", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeNotEqualTo(String value) {
            addCriterion("TAXABLE_CODE <>", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeGreaterThan(String value) {
            addCriterion("TAXABLE_CODE >", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXABLE_CODE >=", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeLessThan(String value) {
            addCriterion("TAXABLE_CODE <", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeLessThanOrEqualTo(String value) {
            addCriterion("TAXABLE_CODE <=", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeLike(String value) {
            addCriterion("TAXABLE_CODE like", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeNotLike(String value) {
            addCriterion("TAXABLE_CODE not like", value, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeIn(List<String> values) {
            addCriterion("TAXABLE_CODE in", values, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeNotIn(List<String> values) {
            addCriterion("TAXABLE_CODE not in", values, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeBetween(String value1, String value2) {
            addCriterion("TAXABLE_CODE between", value1, value2, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableCodeNotBetween(String value1, String value2) {
            addCriterion("TAXABLE_CODE not between", value1, value2, "taxableCode");
            return (Criteria) this;
        }

        public Criteria andTaxableNameIsNull() {
            addCriterion("TAXABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaxableNameIsNotNull() {
            addCriterion("TAXABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaxableNameEqualTo(String value) {
            addCriterion("TAXABLE_NAME =", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameNotEqualTo(String value) {
            addCriterion("TAXABLE_NAME <>", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameGreaterThan(String value) {
            addCriterion("TAXABLE_NAME >", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TAXABLE_NAME >=", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameLessThan(String value) {
            addCriterion("TAXABLE_NAME <", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameLessThanOrEqualTo(String value) {
            addCriterion("TAXABLE_NAME <=", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameLike(String value) {
            addCriterion("TAXABLE_NAME like", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameNotLike(String value) {
            addCriterion("TAXABLE_NAME not like", value, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameIn(List<String> values) {
            addCriterion("TAXABLE_NAME in", values, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameNotIn(List<String> values) {
            addCriterion("TAXABLE_NAME not in", values, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameBetween(String value1, String value2) {
            addCriterion("TAXABLE_NAME between", value1, value2, "taxableName");
            return (Criteria) this;
        }

        public Criteria andTaxableNameNotBetween(String value1, String value2) {
            addCriterion("TAXABLE_NAME not between", value1, value2, "taxableName");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNull() {
            addCriterion("SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(String value) {
            addCriterion("SEQ_NUM =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(String value) {
            addCriterion("SEQ_NUM <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(String value) {
            addCriterion("SEQ_NUM >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NUM >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(String value) {
            addCriterion("SEQ_NUM <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NUM <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLike(String value) {
            addCriterion("SEQ_NUM like", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotLike(String value) {
            addCriterion("SEQ_NUM not like", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<String> values) {
            addCriterion("SEQ_NUM in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<String> values) {
            addCriterion("SEQ_NUM not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(String value1, String value2) {
            addCriterion("SEQ_NUM between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(String value1, String value2) {
            addCriterion("SEQ_NUM not between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryIsNull() {
            addCriterion("TAXABLE_INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryIsNotNull() {
            addCriterion("TAXABLE_INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryEqualTo(String value) {
            addCriterion("TAXABLE_INDUSTRY =", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryNotEqualTo(String value) {
            addCriterion("TAXABLE_INDUSTRY <>", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryGreaterThan(String value) {
            addCriterion("TAXABLE_INDUSTRY >", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("TAXABLE_INDUSTRY >=", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryLessThan(String value) {
            addCriterion("TAXABLE_INDUSTRY <", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryLessThanOrEqualTo(String value) {
            addCriterion("TAXABLE_INDUSTRY <=", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryLike(String value) {
            addCriterion("TAXABLE_INDUSTRY like", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryNotLike(String value) {
            addCriterion("TAXABLE_INDUSTRY not like", value, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryIn(List<String> values) {
            addCriterion("TAXABLE_INDUSTRY in", values, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryNotIn(List<String> values) {
            addCriterion("TAXABLE_INDUSTRY not in", values, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryBetween(String value1, String value2) {
            addCriterion("TAXABLE_INDUSTRY between", value1, value2, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableIndustryNotBetween(String value1, String value2) {
            addCriterion("TAXABLE_INDUSTRY not between", value1, value2, "taxableIndustry");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesIsNull() {
            addCriterion("TAXABLE_SUBCLASSES is null");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesIsNotNull() {
            addCriterion("TAXABLE_SUBCLASSES is not null");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesEqualTo(String value) {
            addCriterion("TAXABLE_SUBCLASSES =", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesNotEqualTo(String value) {
            addCriterion("TAXABLE_SUBCLASSES <>", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesGreaterThan(String value) {
            addCriterion("TAXABLE_SUBCLASSES >", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesGreaterThanOrEqualTo(String value) {
            addCriterion("TAXABLE_SUBCLASSES >=", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesLessThan(String value) {
            addCriterion("TAXABLE_SUBCLASSES <", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesLessThanOrEqualTo(String value) {
            addCriterion("TAXABLE_SUBCLASSES <=", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesLike(String value) {
            addCriterion("TAXABLE_SUBCLASSES like", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesNotLike(String value) {
            addCriterion("TAXABLE_SUBCLASSES not like", value, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesIn(List<String> values) {
            addCriterion("TAXABLE_SUBCLASSES in", values, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesNotIn(List<String> values) {
            addCriterion("TAXABLE_SUBCLASSES not in", values, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesBetween(String value1, String value2) {
            addCriterion("TAXABLE_SUBCLASSES between", value1, value2, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andTaxableSubclassesNotBetween(String value1, String value2) {
            addCriterion("TAXABLE_SUBCLASSES not between", value1, value2, "taxableSubclasses");
            return (Criteria) this;
        }

        public Criteria andIllustrationIsNull() {
            addCriterion("ILLUSTRATION is null");
            return (Criteria) this;
        }

        public Criteria andIllustrationIsNotNull() {
            addCriterion("ILLUSTRATION is not null");
            return (Criteria) this;
        }

        public Criteria andIllustrationEqualTo(String value) {
            addCriterion("ILLUSTRATION =", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationNotEqualTo(String value) {
            addCriterion("ILLUSTRATION <>", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationGreaterThan(String value) {
            addCriterion("ILLUSTRATION >", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationGreaterThanOrEqualTo(String value) {
            addCriterion("ILLUSTRATION >=", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationLessThan(String value) {
            addCriterion("ILLUSTRATION <", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationLessThanOrEqualTo(String value) {
            addCriterion("ILLUSTRATION <=", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationLike(String value) {
            addCriterion("ILLUSTRATION like", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationNotLike(String value) {
            addCriterion("ILLUSTRATION not like", value, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationIn(List<String> values) {
            addCriterion("ILLUSTRATION in", values, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationNotIn(List<String> values) {
            addCriterion("ILLUSTRATION not in", values, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationBetween(String value1, String value2) {
            addCriterion("ILLUSTRATION between", value1, value2, "illustration");
            return (Criteria) this;
        }

        public Criteria andIllustrationNotBetween(String value1, String value2) {
            addCriterion("ILLUSTRATION not between", value1, value2, "illustration");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}