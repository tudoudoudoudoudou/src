package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class TbNextActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbNextActionExample() {
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

        public Criteria andCorpIdIsNull() {
            addCriterion("CORP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("CORP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(String value) {
            addCriterion("CORP_ID =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(String value) {
            addCriterion("CORP_ID <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(String value) {
            addCriterion("CORP_ID >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_ID >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(String value) {
            addCriterion("CORP_ID <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(String value) {
            addCriterion("CORP_ID <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLike(String value) {
            addCriterion("CORP_ID like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotLike(String value) {
            addCriterion("CORP_ID not like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<String> values) {
            addCriterion("CORP_ID in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<String> values) {
            addCriterion("CORP_ID not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(String value1, String value2) {
            addCriterion("CORP_ID between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(String value1, String value2) {
            addCriterion("CORP_ID not between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNull() {
            addCriterion("ACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("ACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActionIdEqualTo(String value) {
            addCriterion("ACTION_ID =", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotEqualTo(String value) {
            addCriterion("ACTION_ID <>", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThan(String value) {
            addCriterion("ACTION_ID >", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_ID >=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThan(String value) {
            addCriterion("ACTION_ID <", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThanOrEqualTo(String value) {
            addCriterion("ACTION_ID <=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLike(String value) {
            addCriterion("ACTION_ID like", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotLike(String value) {
            addCriterion("ACTION_ID not like", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIn(List<String> values) {
            addCriterion("ACTION_ID in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotIn(List<String> values) {
            addCriterion("ACTION_ID not in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdBetween(String value1, String value2) {
            addCriterion("ACTION_ID between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotBetween(String value1, String value2) {
            addCriterion("ACTION_ID not between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdIsNull() {
            addCriterion("CONDITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andConditionIdIsNotNull() {
            addCriterion("CONDITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConditionIdEqualTo(String value) {
            addCriterion("CONDITION_ID =", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdNotEqualTo(String value) {
            addCriterion("CONDITION_ID <>", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdGreaterThan(String value) {
            addCriterion("CONDITION_ID >", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONDITION_ID >=", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdLessThan(String value) {
            addCriterion("CONDITION_ID <", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdLessThanOrEqualTo(String value) {
            addCriterion("CONDITION_ID <=", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdLike(String value) {
            addCriterion("CONDITION_ID like", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdNotLike(String value) {
            addCriterion("CONDITION_ID not like", value, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdIn(List<String> values) {
            addCriterion("CONDITION_ID in", values, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdNotIn(List<String> values) {
            addCriterion("CONDITION_ID not in", values, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdBetween(String value1, String value2) {
            addCriterion("CONDITION_ID between", value1, value2, "conditionId");
            return (Criteria) this;
        }

        public Criteria andConditionIdNotBetween(String value1, String value2) {
            addCriterion("CONDITION_ID not between", value1, value2, "conditionId");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusIsNull() {
            addCriterion("CURR_DATA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusIsNotNull() {
            addCriterion("CURR_DATA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusEqualTo(String value) {
            addCriterion("CURR_DATA_STATUS =", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusNotEqualTo(String value) {
            addCriterion("CURR_DATA_STATUS <>", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusGreaterThan(String value) {
            addCriterion("CURR_DATA_STATUS >", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CURR_DATA_STATUS >=", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusLessThan(String value) {
            addCriterion("CURR_DATA_STATUS <", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusLessThanOrEqualTo(String value) {
            addCriterion("CURR_DATA_STATUS <=", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusLike(String value) {
            addCriterion("CURR_DATA_STATUS like", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusNotLike(String value) {
            addCriterion("CURR_DATA_STATUS not like", value, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusIn(List<String> values) {
            addCriterion("CURR_DATA_STATUS in", values, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusNotIn(List<String> values) {
            addCriterion("CURR_DATA_STATUS not in", values, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusBetween(String value1, String value2) {
            addCriterion("CURR_DATA_STATUS between", value1, value2, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andCurrDataStatusNotBetween(String value1, String value2) {
            addCriterion("CURR_DATA_STATUS not between", value1, value2, "currDataStatus");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("FLOW_ID =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("FLOW_ID <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("FLOW_ID >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_ID >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("FLOW_ID <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("FLOW_ID <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("FLOW_ID like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("FLOW_ID not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("FLOW_ID in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("FLOW_ID not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("FLOW_ID between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("FLOW_ID not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("DATA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("DATA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(String value) {
            addCriterion("DATA_STATUS =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(String value) {
            addCriterion("DATA_STATUS <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(String value) {
            addCriterion("DATA_STATUS >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_STATUS >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(String value) {
            addCriterion("DATA_STATUS <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(String value) {
            addCriterion("DATA_STATUS <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLike(String value) {
            addCriterion("DATA_STATUS like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotLike(String value) {
            addCriterion("DATA_STATUS not like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<String> values) {
            addCriterion("DATA_STATUS in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<String> values) {
            addCriterion("DATA_STATUS not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(String value1, String value2) {
            addCriterion("DATA_STATUS between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(String value1, String value2) {
            addCriterion("DATA_STATUS not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andNextActionIsNull() {
            addCriterion("NEXT_ACTION is null");
            return (Criteria) this;
        }

        public Criteria andNextActionIsNotNull() {
            addCriterion("NEXT_ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andNextActionEqualTo(String value) {
            addCriterion("NEXT_ACTION =", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotEqualTo(String value) {
            addCriterion("NEXT_ACTION <>", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionGreaterThan(String value) {
            addCriterion("NEXT_ACTION >", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_ACTION >=", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionLessThan(String value) {
            addCriterion("NEXT_ACTION <", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionLessThanOrEqualTo(String value) {
            addCriterion("NEXT_ACTION <=", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionLike(String value) {
            addCriterion("NEXT_ACTION like", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotLike(String value) {
            addCriterion("NEXT_ACTION not like", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionIn(List<String> values) {
            addCriterion("NEXT_ACTION in", values, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotIn(List<String> values) {
            addCriterion("NEXT_ACTION not in", values, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionBetween(String value1, String value2) {
            addCriterion("NEXT_ACTION between", value1, value2, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotBetween(String value1, String value2) {
            addCriterion("NEXT_ACTION not between", value1, value2, "nextAction");
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

        public Criteria andNextOrgIdIsNull() {
            addCriterion("NEXT_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdIsNotNull() {
            addCriterion("NEXT_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdEqualTo(String value) {
            addCriterion("NEXT_ORG_ID =", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdNotEqualTo(String value) {
            addCriterion("NEXT_ORG_ID <>", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdGreaterThan(String value) {
            addCriterion("NEXT_ORG_ID >", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_ORG_ID >=", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdLessThan(String value) {
            addCriterion("NEXT_ORG_ID <", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdLessThanOrEqualTo(String value) {
            addCriterion("NEXT_ORG_ID <=", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdLike(String value) {
            addCriterion("NEXT_ORG_ID like", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdNotLike(String value) {
            addCriterion("NEXT_ORG_ID not like", value, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdIn(List<String> values) {
            addCriterion("NEXT_ORG_ID in", values, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdNotIn(List<String> values) {
            addCriterion("NEXT_ORG_ID not in", values, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdBetween(String value1, String value2) {
            addCriterion("NEXT_ORG_ID between", value1, value2, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOrgIdNotBetween(String value1, String value2) {
            addCriterion("NEXT_ORG_ID not between", value1, value2, "nextOrgId");
            return (Criteria) this;
        }

        public Criteria andNextOperIsNull() {
            addCriterion("NEXT_OPER is null");
            return (Criteria) this;
        }

        public Criteria andNextOperIsNotNull() {
            addCriterion("NEXT_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andNextOperEqualTo(String value) {
            addCriterion("NEXT_OPER =", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperNotEqualTo(String value) {
            addCriterion("NEXT_OPER <>", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperGreaterThan(String value) {
            addCriterion("NEXT_OPER >", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_OPER >=", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperLessThan(String value) {
            addCriterion("NEXT_OPER <", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperLessThanOrEqualTo(String value) {
            addCriterion("NEXT_OPER <=", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperLike(String value) {
            addCriterion("NEXT_OPER like", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperNotLike(String value) {
            addCriterion("NEXT_OPER not like", value, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperIn(List<String> values) {
            addCriterion("NEXT_OPER in", values, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperNotIn(List<String> values) {
            addCriterion("NEXT_OPER not in", values, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperBetween(String value1, String value2) {
            addCriterion("NEXT_OPER between", value1, value2, "nextOper");
            return (Criteria) this;
        }

        public Criteria andNextOperNotBetween(String value1, String value2) {
            addCriterion("NEXT_OPER not between", value1, value2, "nextOper");
            return (Criteria) this;
        }

        public Criteria andIsEndIsNull() {
            addCriterion("IS_END is null");
            return (Criteria) this;
        }

        public Criteria andIsEndIsNotNull() {
            addCriterion("IS_END is not null");
            return (Criteria) this;
        }

        public Criteria andIsEndEqualTo(String value) {
            addCriterion("IS_END =", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndNotEqualTo(String value) {
            addCriterion("IS_END <>", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndGreaterThan(String value) {
            addCriterion("IS_END >", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndGreaterThanOrEqualTo(String value) {
            addCriterion("IS_END >=", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndLessThan(String value) {
            addCriterion("IS_END <", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndLessThanOrEqualTo(String value) {
            addCriterion("IS_END <=", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndLike(String value) {
            addCriterion("IS_END like", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndNotLike(String value) {
            addCriterion("IS_END not like", value, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndIn(List<String> values) {
            addCriterion("IS_END in", values, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndNotIn(List<String> values) {
            addCriterion("IS_END not in", values, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndBetween(String value1, String value2) {
            addCriterion("IS_END between", value1, value2, "isEnd");
            return (Criteria) this;
        }

        public Criteria andIsEndNotBetween(String value1, String value2) {
            addCriterion("IS_END not between", value1, value2, "isEnd");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagIsNull() {
            addCriterion("DATA_BAK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagIsNotNull() {
            addCriterion("DATA_BAK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagEqualTo(String value) {
            addCriterion("DATA_BAK_FLAG =", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagNotEqualTo(String value) {
            addCriterion("DATA_BAK_FLAG <>", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagGreaterThan(String value) {
            addCriterion("DATA_BAK_FLAG >", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_BAK_FLAG >=", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagLessThan(String value) {
            addCriterion("DATA_BAK_FLAG <", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagLessThanOrEqualTo(String value) {
            addCriterion("DATA_BAK_FLAG <=", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagLike(String value) {
            addCriterion("DATA_BAK_FLAG like", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagNotLike(String value) {
            addCriterion("DATA_BAK_FLAG not like", value, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagIn(List<String> values) {
            addCriterion("DATA_BAK_FLAG in", values, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagNotIn(List<String> values) {
            addCriterion("DATA_BAK_FLAG not in", values, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagBetween(String value1, String value2) {
            addCriterion("DATA_BAK_FLAG between", value1, value2, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andDataBakFlagNotBetween(String value1, String value2) {
            addCriterion("DATA_BAK_FLAG not between", value1, value2, "dataBakFlag");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNull() {
            addCriterion("SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("SYS_ID =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("SYS_ID <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("SYS_ID >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ID >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("SYS_ID <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("SYS_ID <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("SYS_ID like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("SYS_ID not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("SYS_ID in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("SYS_ID not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("SYS_ID between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("SYS_ID not between", value1, value2, "sysId");
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