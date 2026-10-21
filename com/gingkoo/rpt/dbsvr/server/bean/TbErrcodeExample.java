package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class TbErrcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbErrcodeExample() {
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

        public Criteria andErrIdIsNull() {
            addCriterion("ERR_ID is null");
            return (Criteria) this;
        }

        public Criteria andErrIdIsNotNull() {
            addCriterion("ERR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andErrIdEqualTo(String value) {
            addCriterion("ERR_ID =", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdNotEqualTo(String value) {
            addCriterion("ERR_ID <>", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdGreaterThan(String value) {
            addCriterion("ERR_ID >", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_ID >=", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdLessThan(String value) {
            addCriterion("ERR_ID <", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdLessThanOrEqualTo(String value) {
            addCriterion("ERR_ID <=", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdLike(String value) {
            addCriterion("ERR_ID like", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdNotLike(String value) {
            addCriterion("ERR_ID not like", value, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdIn(List<String> values) {
            addCriterion("ERR_ID in", values, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdNotIn(List<String> values) {
            addCriterion("ERR_ID not in", values, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdBetween(String value1, String value2) {
            addCriterion("ERR_ID between", value1, value2, "errId");
            return (Criteria) this;
        }

        public Criteria andErrIdNotBetween(String value1, String value2) {
            addCriterion("ERR_ID not between", value1, value2, "errId");
            return (Criteria) this;
        }

        public Criteria andErrCodeIsNull() {
            addCriterion("ERR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrCodeIsNotNull() {
            addCriterion("ERR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrCodeEqualTo(String value) {
            addCriterion("ERR_CODE =", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotEqualTo(String value) {
            addCriterion("ERR_CODE <>", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThan(String value) {
            addCriterion("ERR_CODE >", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_CODE >=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThan(String value) {
            addCriterion("ERR_CODE <", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThanOrEqualTo(String value) {
            addCriterion("ERR_CODE <=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLike(String value) {
            addCriterion("ERR_CODE like", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotLike(String value) {
            addCriterion("ERR_CODE not like", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeIn(List<String> values) {
            addCriterion("ERR_CODE in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotIn(List<String> values) {
            addCriterion("ERR_CODE not in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeBetween(String value1, String value2) {
            addCriterion("ERR_CODE between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotBetween(String value1, String value2) {
            addCriterion("ERR_CODE not between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrDescIsNull() {
            addCriterion("ERR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andErrDescIsNotNull() {
            addCriterion("ERR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andErrDescEqualTo(String value) {
            addCriterion("ERR_DESC =", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescNotEqualTo(String value) {
            addCriterion("ERR_DESC <>", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescGreaterThan(String value) {
            addCriterion("ERR_DESC >", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_DESC >=", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescLessThan(String value) {
            addCriterion("ERR_DESC <", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescLessThanOrEqualTo(String value) {
            addCriterion("ERR_DESC <=", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescLike(String value) {
            addCriterion("ERR_DESC like", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescNotLike(String value) {
            addCriterion("ERR_DESC not like", value, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescIn(List<String> values) {
            addCriterion("ERR_DESC in", values, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescNotIn(List<String> values) {
            addCriterion("ERR_DESC not in", values, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescBetween(String value1, String value2) {
            addCriterion("ERR_DESC between", value1, value2, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrDescNotBetween(String value1, String value2) {
            addCriterion("ERR_DESC not between", value1, value2, "errDesc");
            return (Criteria) this;
        }

        public Criteria andErrExtraIsNull() {
            addCriterion("ERR_EXTRA is null");
            return (Criteria) this;
        }

        public Criteria andErrExtraIsNotNull() {
            addCriterion("ERR_EXTRA is not null");
            return (Criteria) this;
        }

        public Criteria andErrExtraEqualTo(String value) {
            addCriterion("ERR_EXTRA =", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraNotEqualTo(String value) {
            addCriterion("ERR_EXTRA <>", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraGreaterThan(String value) {
            addCriterion("ERR_EXTRA >", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_EXTRA >=", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraLessThan(String value) {
            addCriterion("ERR_EXTRA <", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraLessThanOrEqualTo(String value) {
            addCriterion("ERR_EXTRA <=", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraLike(String value) {
            addCriterion("ERR_EXTRA like", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraNotLike(String value) {
            addCriterion("ERR_EXTRA not like", value, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraIn(List<String> values) {
            addCriterion("ERR_EXTRA in", values, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraNotIn(List<String> values) {
            addCriterion("ERR_EXTRA not in", values, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraBetween(String value1, String value2) {
            addCriterion("ERR_EXTRA between", value1, value2, "errExtra");
            return (Criteria) this;
        }

        public Criteria andErrExtraNotBetween(String value1, String value2) {
            addCriterion("ERR_EXTRA not between", value1, value2, "errExtra");
            return (Criteria) this;
        }

        public Criteria andSuggActionIsNull() {
            addCriterion("SUGG_ACTION is null");
            return (Criteria) this;
        }

        public Criteria andSuggActionIsNotNull() {
            addCriterion("SUGG_ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andSuggActionEqualTo(String value) {
            addCriterion("SUGG_ACTION =", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionNotEqualTo(String value) {
            addCriterion("SUGG_ACTION <>", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionGreaterThan(String value) {
            addCriterion("SUGG_ACTION >", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionGreaterThanOrEqualTo(String value) {
            addCriterion("SUGG_ACTION >=", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionLessThan(String value) {
            addCriterion("SUGG_ACTION <", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionLessThanOrEqualTo(String value) {
            addCriterion("SUGG_ACTION <=", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionLike(String value) {
            addCriterion("SUGG_ACTION like", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionNotLike(String value) {
            addCriterion("SUGG_ACTION not like", value, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionIn(List<String> values) {
            addCriterion("SUGG_ACTION in", values, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionNotIn(List<String> values) {
            addCriterion("SUGG_ACTION not in", values, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionBetween(String value1, String value2) {
            addCriterion("SUGG_ACTION between", value1, value2, "suggAction");
            return (Criteria) this;
        }

        public Criteria andSuggActionNotBetween(String value1, String value2) {
            addCriterion("SUGG_ACTION not between", value1, value2, "suggAction");
            return (Criteria) this;
        }

        public Criteria andRsv1IsNull() {
            addCriterion("RSV1 is null");
            return (Criteria) this;
        }

        public Criteria andRsv1IsNotNull() {
            addCriterion("RSV1 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv1EqualTo(String value) {
            addCriterion("RSV1 =", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotEqualTo(String value) {
            addCriterion("RSV1 <>", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1GreaterThan(String value) {
            addCriterion("RSV1 >", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1GreaterThanOrEqualTo(String value) {
            addCriterion("RSV1 >=", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1LessThan(String value) {
            addCriterion("RSV1 <", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1LessThanOrEqualTo(String value) {
            addCriterion("RSV1 <=", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1Like(String value) {
            addCriterion("RSV1 like", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotLike(String value) {
            addCriterion("RSV1 not like", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1In(List<String> values) {
            addCriterion("RSV1 in", values, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotIn(List<String> values) {
            addCriterion("RSV1 not in", values, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1Between(String value1, String value2) {
            addCriterion("RSV1 between", value1, value2, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotBetween(String value1, String value2) {
            addCriterion("RSV1 not between", value1, value2, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv2IsNull() {
            addCriterion("RSV2 is null");
            return (Criteria) this;
        }

        public Criteria andRsv2IsNotNull() {
            addCriterion("RSV2 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv2EqualTo(String value) {
            addCriterion("RSV2 =", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotEqualTo(String value) {
            addCriterion("RSV2 <>", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2GreaterThan(String value) {
            addCriterion("RSV2 >", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2GreaterThanOrEqualTo(String value) {
            addCriterion("RSV2 >=", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2LessThan(String value) {
            addCriterion("RSV2 <", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2LessThanOrEqualTo(String value) {
            addCriterion("RSV2 <=", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2Like(String value) {
            addCriterion("RSV2 like", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotLike(String value) {
            addCriterion("RSV2 not like", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2In(List<String> values) {
            addCriterion("RSV2 in", values, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotIn(List<String> values) {
            addCriterion("RSV2 not in", values, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2Between(String value1, String value2) {
            addCriterion("RSV2 between", value1, value2, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotBetween(String value1, String value2) {
            addCriterion("RSV2 not between", value1, value2, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv3IsNull() {
            addCriterion("RSV3 is null");
            return (Criteria) this;
        }

        public Criteria andRsv3IsNotNull() {
            addCriterion("RSV3 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv3EqualTo(String value) {
            addCriterion("RSV3 =", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotEqualTo(String value) {
            addCriterion("RSV3 <>", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3GreaterThan(String value) {
            addCriterion("RSV3 >", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3GreaterThanOrEqualTo(String value) {
            addCriterion("RSV3 >=", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3LessThan(String value) {
            addCriterion("RSV3 <", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3LessThanOrEqualTo(String value) {
            addCriterion("RSV3 <=", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3Like(String value) {
            addCriterion("RSV3 like", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotLike(String value) {
            addCriterion("RSV3 not like", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3In(List<String> values) {
            addCriterion("RSV3 in", values, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotIn(List<String> values) {
            addCriterion("RSV3 not in", values, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3Between(String value1, String value2) {
            addCriterion("RSV3 between", value1, value2, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotBetween(String value1, String value2) {
            addCriterion("RSV3 not between", value1, value2, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv4IsNull() {
            addCriterion("RSV4 is null");
            return (Criteria) this;
        }

        public Criteria andRsv4IsNotNull() {
            addCriterion("RSV4 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv4EqualTo(String value) {
            addCriterion("RSV4 =", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotEqualTo(String value) {
            addCriterion("RSV4 <>", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4GreaterThan(String value) {
            addCriterion("RSV4 >", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4GreaterThanOrEqualTo(String value) {
            addCriterion("RSV4 >=", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4LessThan(String value) {
            addCriterion("RSV4 <", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4LessThanOrEqualTo(String value) {
            addCriterion("RSV4 <=", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4Like(String value) {
            addCriterion("RSV4 like", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotLike(String value) {
            addCriterion("RSV4 not like", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4In(List<String> values) {
            addCriterion("RSV4 in", values, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotIn(List<String> values) {
            addCriterion("RSV4 not in", values, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4Between(String value1, String value2) {
            addCriterion("RSV4 between", value1, value2, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotBetween(String value1, String value2) {
            addCriterion("RSV4 not between", value1, value2, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv5IsNull() {
            addCriterion("RSV5 is null");
            return (Criteria) this;
        }

        public Criteria andRsv5IsNotNull() {
            addCriterion("RSV5 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv5EqualTo(String value) {
            addCriterion("RSV5 =", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotEqualTo(String value) {
            addCriterion("RSV5 <>", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5GreaterThan(String value) {
            addCriterion("RSV5 >", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5GreaterThanOrEqualTo(String value) {
            addCriterion("RSV5 >=", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5LessThan(String value) {
            addCriterion("RSV5 <", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5LessThanOrEqualTo(String value) {
            addCriterion("RSV5 <=", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5Like(String value) {
            addCriterion("RSV5 like", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotLike(String value) {
            addCriterion("RSV5 not like", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5In(List<String> values) {
            addCriterion("RSV5 in", values, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotIn(List<String> values) {
            addCriterion("RSV5 not in", values, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5Between(String value1, String value2) {
            addCriterion("RSV5 between", value1, value2, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotBetween(String value1, String value2) {
            addCriterion("RSV5 not between", value1, value2, "rsv5");
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