package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class OdsVatGoodCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsVatGoodCodeExample() {
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

        public Criteria andGoodCodeIsNull() {
            addCriterion("GOOD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGoodCodeIsNotNull() {
            addCriterion("GOOD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCodeEqualTo(String value) {
            addCriterion("GOOD_CODE =", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotEqualTo(String value) {
            addCriterion("GOOD_CODE <>", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeGreaterThan(String value) {
            addCriterion("GOOD_CODE >", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_CODE >=", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeLessThan(String value) {
            addCriterion("GOOD_CODE <", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeLessThanOrEqualTo(String value) {
            addCriterion("GOOD_CODE <=", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeLike(String value) {
            addCriterion("GOOD_CODE like", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotLike(String value) {
            addCriterion("GOOD_CODE not like", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeIn(List<String> values) {
            addCriterion("GOOD_CODE in", values, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotIn(List<String> values) {
            addCriterion("GOOD_CODE not in", values, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeBetween(String value1, String value2) {
            addCriterion("GOOD_CODE between", value1, value2, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotBetween(String value1, String value2) {
            addCriterion("GOOD_CODE not between", value1, value2, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("GOOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("GOOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("GOOD_NAME =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("GOOD_NAME <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("GOOD_NAME >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_NAME >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("GOOD_NAME <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("GOOD_NAME <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("GOOD_NAME like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("GOOD_NAME not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("GOOD_NAME in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("GOOD_NAME not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("GOOD_NAME between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("GOOD_NAME not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodInstruIsNull() {
            addCriterion("GOOD_INSTRU is null");
            return (Criteria) this;
        }

        public Criteria andGoodInstruIsNotNull() {
            addCriterion("GOOD_INSTRU is not null");
            return (Criteria) this;
        }

        public Criteria andGoodInstruEqualTo(String value) {
            addCriterion("GOOD_INSTRU =", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruNotEqualTo(String value) {
            addCriterion("GOOD_INSTRU <>", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruGreaterThan(String value) {
            addCriterion("GOOD_INSTRU >", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_INSTRU >=", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruLessThan(String value) {
            addCriterion("GOOD_INSTRU <", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruLessThanOrEqualTo(String value) {
            addCriterion("GOOD_INSTRU <=", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruLike(String value) {
            addCriterion("GOOD_INSTRU like", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruNotLike(String value) {
            addCriterion("GOOD_INSTRU not like", value, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruIn(List<String> values) {
            addCriterion("GOOD_INSTRU in", values, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruNotIn(List<String> values) {
            addCriterion("GOOD_INSTRU not in", values, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruBetween(String value1, String value2) {
            addCriterion("GOOD_INSTRU between", value1, value2, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodInstruNotBetween(String value1, String value2) {
            addCriterion("GOOD_INSTRU not between", value1, value2, "goodInstru");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordIsNull() {
            addCriterion("GOOD_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordIsNotNull() {
            addCriterion("GOOD_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordEqualTo(String value) {
            addCriterion("GOOD_KEYWORD =", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordNotEqualTo(String value) {
            addCriterion("GOOD_KEYWORD <>", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordGreaterThan(String value) {
            addCriterion("GOOD_KEYWORD >", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_KEYWORD >=", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordLessThan(String value) {
            addCriterion("GOOD_KEYWORD <", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordLessThanOrEqualTo(String value) {
            addCriterion("GOOD_KEYWORD <=", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordLike(String value) {
            addCriterion("GOOD_KEYWORD like", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordNotLike(String value) {
            addCriterion("GOOD_KEYWORD not like", value, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordIn(List<String> values) {
            addCriterion("GOOD_KEYWORD in", values, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordNotIn(List<String> values) {
            addCriterion("GOOD_KEYWORD not in", values, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordBetween(String value1, String value2) {
            addCriterion("GOOD_KEYWORD between", value1, value2, "goodKeyword");
            return (Criteria) this;
        }

        public Criteria andGoodKeywordNotBetween(String value1, String value2) {
            addCriterion("GOOD_KEYWORD not between", value1, value2, "goodKeyword");
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