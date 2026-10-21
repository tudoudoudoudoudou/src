package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BmsBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BmsBatchExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("DATA_ID =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("DATA_ID <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("DATA_ID >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_ID >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("DATA_ID <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("DATA_ID <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("DATA_ID like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("DATA_ID not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("DATA_ID in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("DATA_ID not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("DATA_ID between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("DATA_ID not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNull() {
            addCriterion("DATA_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNotNull() {
            addCriterion("DATA_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataDateEqualTo(String value) {
            addCriterion("DATA_DATE =", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotEqualTo(String value) {
            addCriterion("DATA_DATE <>", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThan(String value) {
            addCriterion("DATA_DATE >", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_DATE >=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThan(String value) {
            addCriterion("DATA_DATE <", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_DATE <=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLike(String value) {
            addCriterion("DATA_DATE like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotLike(String value) {
            addCriterion("DATA_DATE not like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateIn(List<String> values) {
            addCriterion("DATA_DATE in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotIn(List<String> values) {
            addCriterion("DATA_DATE not in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateBetween(String value1, String value2) {
            addCriterion("DATA_DATE between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotBetween(String value1, String value2) {
            addCriterion("DATA_DATE not between", value1, value2, "dataDate");
            return (Criteria) this;
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNull() {
            addCriterion("BATCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNotNull() {
            addCriterion("BATCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNameEqualTo(String value) {
            addCriterion("BATCH_NAME =", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotEqualTo(String value) {
            addCriterion("BATCH_NAME <>", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThan(String value) {
            addCriterion("BATCH_NAME >", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NAME >=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThan(String value) {
            addCriterion("BATCH_NAME <", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NAME <=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLike(String value) {
            addCriterion("BATCH_NAME like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotLike(String value) {
            addCriterion("BATCH_NAME not like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIn(List<String> values) {
            addCriterion("BATCH_NAME in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotIn(List<String> values) {
            addCriterion("BATCH_NAME not in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameBetween(String value1, String value2) {
            addCriterion("BATCH_NAME between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotBetween(String value1, String value2) {
            addCriterion("BATCH_NAME not between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andRunPlanIsNull() {
            addCriterion("RUN_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andRunPlanIsNotNull() {
            addCriterion("RUN_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andRunPlanEqualTo(String value) {
            addCriterion("RUN_PLAN =", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanNotEqualTo(String value) {
            addCriterion("RUN_PLAN <>", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanGreaterThan(String value) {
            addCriterion("RUN_PLAN >", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_PLAN >=", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanLessThan(String value) {
            addCriterion("RUN_PLAN <", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanLessThanOrEqualTo(String value) {
            addCriterion("RUN_PLAN <=", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanLike(String value) {
            addCriterion("RUN_PLAN like", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanNotLike(String value) {
            addCriterion("RUN_PLAN not like", value, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanIn(List<String> values) {
            addCriterion("RUN_PLAN in", values, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanNotIn(List<String> values) {
            addCriterion("RUN_PLAN not in", values, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanBetween(String value1, String value2) {
            addCriterion("RUN_PLAN between", value1, value2, "runPlan");
            return (Criteria) this;
        }

        public Criteria andRunPlanNotBetween(String value1, String value2) {
            addCriterion("RUN_PLAN not between", value1, value2, "runPlan");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCfgStatusIsNull() {
            addCriterion("CFG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCfgStatusIsNotNull() {
            addCriterion("CFG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCfgStatusEqualTo(String value) {
            addCriterion("CFG_STATUS =", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusNotEqualTo(String value) {
            addCriterion("CFG_STATUS <>", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusGreaterThan(String value) {
            addCriterion("CFG_STATUS >", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CFG_STATUS >=", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusLessThan(String value) {
            addCriterion("CFG_STATUS <", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusLessThanOrEqualTo(String value) {
            addCriterion("CFG_STATUS <=", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusLike(String value) {
            addCriterion("CFG_STATUS like", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusNotLike(String value) {
            addCriterion("CFG_STATUS not like", value, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusIn(List<String> values) {
            addCriterion("CFG_STATUS in", values, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusNotIn(List<String> values) {
            addCriterion("CFG_STATUS not in", values, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusBetween(String value1, String value2) {
            addCriterion("CFG_STATUS between", value1, value2, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andCfgStatusNotBetween(String value1, String value2) {
            addCriterion("CFG_STATUS not between", value1, value2, "cfgStatus");
            return (Criteria) this;
        }

        public Criteria andNextTimeIsNull() {
            addCriterion("NEXT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNextTimeIsNotNull() {
            addCriterion("NEXT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextTimeEqualTo(String value) {
            addCriterion("NEXT_TIME =", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotEqualTo(String value) {
            addCriterion("NEXT_TIME <>", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeGreaterThan(String value) {
            addCriterion("NEXT_TIME >", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_TIME >=", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeLessThan(String value) {
            addCriterion("NEXT_TIME <", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeLessThanOrEqualTo(String value) {
            addCriterion("NEXT_TIME <=", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeLike(String value) {
            addCriterion("NEXT_TIME like", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotLike(String value) {
            addCriterion("NEXT_TIME not like", value, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeIn(List<String> values) {
            addCriterion("NEXT_TIME in", values, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotIn(List<String> values) {
            addCriterion("NEXT_TIME not in", values, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeBetween(String value1, String value2) {
            addCriterion("NEXT_TIME between", value1, value2, "nextTime");
            return (Criteria) this;
        }

        public Criteria andNextTimeNotBetween(String value1, String value2) {
            addCriterion("NEXT_TIME not between", value1, value2, "nextTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNull() {
            addCriterion("CHECK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNotNull() {
            addCriterion("CHECK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagEqualTo(String value) {
            addCriterion("CHECK_FLAG =", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotEqualTo(String value) {
            addCriterion("CHECK_FLAG <>", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThan(String value) {
            addCriterion("CHECK_FLAG >", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FLAG >=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThan(String value) {
            addCriterion("CHECK_FLAG <", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FLAG <=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLike(String value) {
            addCriterion("CHECK_FLAG like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotLike(String value) {
            addCriterion("CHECK_FLAG not like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIn(List<String> values) {
            addCriterion("CHECK_FLAG in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotIn(List<String> values) {
            addCriterion("CHECK_FLAG not in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagBetween(String value1, String value2) {
            addCriterion("CHECK_FLAG between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotBetween(String value1, String value2) {
            addCriterion("CHECK_FLAG not between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckDescIsNull() {
            addCriterion("CHECK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCheckDescIsNotNull() {
            addCriterion("CHECK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDescEqualTo(String value) {
            addCriterion("CHECK_DESC =", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotEqualTo(String value) {
            addCriterion("CHECK_DESC <>", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescGreaterThan(String value) {
            addCriterion("CHECK_DESC >", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DESC >=", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLessThan(String value) {
            addCriterion("CHECK_DESC <", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DESC <=", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLike(String value) {
            addCriterion("CHECK_DESC like", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotLike(String value) {
            addCriterion("CHECK_DESC not like", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescIn(List<String> values) {
            addCriterion("CHECK_DESC in", values, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotIn(List<String> values) {
            addCriterion("CHECK_DESC not in", values, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescBetween(String value1, String value2) {
            addCriterion("CHECK_DESC between", value1, value2, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotBetween(String value1, String value2) {
            addCriterion("CHECK_DESC not between", value1, value2, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeIsNull() {
            addCriterion("CHECK_ERR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeIsNotNull() {
            addCriterion("CHECK_ERR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE =", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE <>", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeGreaterThan(String value) {
            addCriterion("CHECK_ERR_TYPE >", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE >=", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeLessThan(String value) {
            addCriterion("CHECK_ERR_TYPE <", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE <=", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeLike(String value) {
            addCriterion("CHECK_ERR_TYPE like", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotLike(String value) {
            addCriterion("CHECK_ERR_TYPE not like", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeIn(List<String> values) {
            addCriterion("CHECK_ERR_TYPE in", values, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotIn(List<String> values) {
            addCriterion("CHECK_ERR_TYPE not in", values, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeBetween(String value1, String value2) {
            addCriterion("CHECK_ERR_TYPE between", value1, value2, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotBetween(String value1, String value2) {
            addCriterion("CHECK_ERR_TYPE not between", value1, value2, "checkErrType");
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

        public Criteria andDataFlagIsNull() {
            addCriterion("DATA_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNotNull() {
            addCriterion("DATA_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDataFlagEqualTo(String value) {
            addCriterion("DATA_FLAG =", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotEqualTo(String value) {
            addCriterion("DATA_FLAG <>", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThan(String value) {
            addCriterion("DATA_FLAG >", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_FLAG >=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThan(String value) {
            addCriterion("DATA_FLAG <", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThanOrEqualTo(String value) {
            addCriterion("DATA_FLAG <=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLike(String value) {
            addCriterion("DATA_FLAG like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotLike(String value) {
            addCriterion("DATA_FLAG not like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagIn(List<String> values) {
            addCriterion("DATA_FLAG in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotIn(List<String> values) {
            addCriterion("DATA_FLAG not in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagBetween(String value1, String value2) {
            addCriterion("DATA_FLAG between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotBetween(String value1, String value2) {
            addCriterion("DATA_FLAG not between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("DATA_SOURCE =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("DATA_SOURCE <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("DATA_SOURCE >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("DATA_SOURCE <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("DATA_SOURCE like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("DATA_SOURCE not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("DATA_SOURCE in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("DATA_SOURCE not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNull() {
            addCriterion("DATA_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNotNull() {
            addCriterion("DATA_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDataVersionEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION =", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION <>", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThan(BigDecimal value) {
            addCriterion("DATA_VERSION >", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION >=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThan(BigDecimal value) {
            addCriterion("DATA_VERSION <", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION <=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionIn(List<BigDecimal> values) {
            addCriterion("DATA_VERSION in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotIn(List<BigDecimal> values) {
            addCriterion("DATA_VERSION not in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATA_VERSION between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATA_VERSION not between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataRejDescIsNull() {
            addCriterion("DATA_REJ_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDataRejDescIsNotNull() {
            addCriterion("DATA_REJ_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDataRejDescEqualTo(String value) {
            addCriterion("DATA_REJ_DESC =", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotEqualTo(String value) {
            addCriterion("DATA_REJ_DESC <>", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescGreaterThan(String value) {
            addCriterion("DATA_REJ_DESC >", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_REJ_DESC >=", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescLessThan(String value) {
            addCriterion("DATA_REJ_DESC <", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescLessThanOrEqualTo(String value) {
            addCriterion("DATA_REJ_DESC <=", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescLike(String value) {
            addCriterion("DATA_REJ_DESC like", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotLike(String value) {
            addCriterion("DATA_REJ_DESC not like", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescIn(List<String> values) {
            addCriterion("DATA_REJ_DESC in", values, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotIn(List<String> values) {
            addCriterion("DATA_REJ_DESC not in", values, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescBetween(String value1, String value2) {
            addCriterion("DATA_REJ_DESC between", value1, value2, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotBetween(String value1, String value2) {
            addCriterion("DATA_REJ_DESC not between", value1, value2, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescIsNull() {
            addCriterion("DATA_DEL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDataDelDescIsNotNull() {
            addCriterion("DATA_DEL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDataDelDescEqualTo(String value) {
            addCriterion("DATA_DEL_DESC =", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotEqualTo(String value) {
            addCriterion("DATA_DEL_DESC <>", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescGreaterThan(String value) {
            addCriterion("DATA_DEL_DESC >", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_DEL_DESC >=", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescLessThan(String value) {
            addCriterion("DATA_DEL_DESC <", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescLessThanOrEqualTo(String value) {
            addCriterion("DATA_DEL_DESC <=", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescLike(String value) {
            addCriterion("DATA_DEL_DESC like", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotLike(String value) {
            addCriterion("DATA_DEL_DESC not like", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescIn(List<String> values) {
            addCriterion("DATA_DEL_DESC in", values, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotIn(List<String> values) {
            addCriterion("DATA_DEL_DESC not in", values, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescBetween(String value1, String value2) {
            addCriterion("DATA_DEL_DESC between", value1, value2, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotBetween(String value1, String value2) {
            addCriterion("DATA_DEL_DESC not between", value1, value2, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserIsNull() {
            addCriterion("DATA_CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserIsNotNull() {
            addCriterion("DATA_CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserEqualTo(String value) {
            addCriterion("DATA_CRT_USER =", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotEqualTo(String value) {
            addCriterion("DATA_CRT_USER <>", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserGreaterThan(String value) {
            addCriterion("DATA_CRT_USER >", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_USER >=", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserLessThan(String value) {
            addCriterion("DATA_CRT_USER <", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserLessThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_USER <=", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserLike(String value) {
            addCriterion("DATA_CRT_USER like", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotLike(String value) {
            addCriterion("DATA_CRT_USER not like", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserIn(List<String> values) {
            addCriterion("DATA_CRT_USER in", values, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotIn(List<String> values) {
            addCriterion("DATA_CRT_USER not in", values, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserBetween(String value1, String value2) {
            addCriterion("DATA_CRT_USER between", value1, value2, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotBetween(String value1, String value2) {
            addCriterion("DATA_CRT_USER not between", value1, value2, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateIsNull() {
            addCriterion("DATA_CRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateIsNotNull() {
            addCriterion("DATA_CRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateEqualTo(String value) {
            addCriterion("DATA_CRT_DATE =", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotEqualTo(String value) {
            addCriterion("DATA_CRT_DATE <>", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateGreaterThan(String value) {
            addCriterion("DATA_CRT_DATE >", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_DATE >=", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateLessThan(String value) {
            addCriterion("DATA_CRT_DATE <", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_DATE <=", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateLike(String value) {
            addCriterion("DATA_CRT_DATE like", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotLike(String value) {
            addCriterion("DATA_CRT_DATE not like", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateIn(List<String> values) {
            addCriterion("DATA_CRT_DATE in", values, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotIn(List<String> values) {
            addCriterion("DATA_CRT_DATE not in", values, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateBetween(String value1, String value2) {
            addCriterion("DATA_CRT_DATE between", value1, value2, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotBetween(String value1, String value2) {
            addCriterion("DATA_CRT_DATE not between", value1, value2, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeIsNull() {
            addCriterion("DATA_CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeIsNotNull() {
            addCriterion("DATA_CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeEqualTo(String value) {
            addCriterion("DATA_CRT_TIME =", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotEqualTo(String value) {
            addCriterion("DATA_CRT_TIME <>", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeGreaterThan(String value) {
            addCriterion("DATA_CRT_TIME >", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_TIME >=", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeLessThan(String value) {
            addCriterion("DATA_CRT_TIME <", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeLessThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_TIME <=", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeLike(String value) {
            addCriterion("DATA_CRT_TIME like", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotLike(String value) {
            addCriterion("DATA_CRT_TIME not like", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeIn(List<String> values) {
            addCriterion("DATA_CRT_TIME in", values, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotIn(List<String> values) {
            addCriterion("DATA_CRT_TIME not in", values, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeBetween(String value1, String value2) {
            addCriterion("DATA_CRT_TIME between", value1, value2, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotBetween(String value1, String value2) {
            addCriterion("DATA_CRT_TIME not between", value1, value2, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataChgUserIsNull() {
            addCriterion("DATA_CHG_USER is null");
            return (Criteria) this;
        }

        public Criteria andDataChgUserIsNotNull() {
            addCriterion("DATA_CHG_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDataChgUserEqualTo(String value) {
            addCriterion("DATA_CHG_USER =", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotEqualTo(String value) {
            addCriterion("DATA_CHG_USER <>", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserGreaterThan(String value) {
            addCriterion("DATA_CHG_USER >", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_USER >=", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserLessThan(String value) {
            addCriterion("DATA_CHG_USER <", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserLessThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_USER <=", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserLike(String value) {
            addCriterion("DATA_CHG_USER like", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotLike(String value) {
            addCriterion("DATA_CHG_USER not like", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserIn(List<String> values) {
            addCriterion("DATA_CHG_USER in", values, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotIn(List<String> values) {
            addCriterion("DATA_CHG_USER not in", values, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserBetween(String value1, String value2) {
            addCriterion("DATA_CHG_USER between", value1, value2, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotBetween(String value1, String value2) {
            addCriterion("DATA_CHG_USER not between", value1, value2, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgDateIsNull() {
            addCriterion("DATA_CHG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataChgDateIsNotNull() {
            addCriterion("DATA_CHG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataChgDateEqualTo(String value) {
            addCriterion("DATA_CHG_DATE =", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotEqualTo(String value) {
            addCriterion("DATA_CHG_DATE <>", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateGreaterThan(String value) {
            addCriterion("DATA_CHG_DATE >", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_DATE >=", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateLessThan(String value) {
            addCriterion("DATA_CHG_DATE <", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_DATE <=", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateLike(String value) {
            addCriterion("DATA_CHG_DATE like", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotLike(String value) {
            addCriterion("DATA_CHG_DATE not like", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateIn(List<String> values) {
            addCriterion("DATA_CHG_DATE in", values, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotIn(List<String> values) {
            addCriterion("DATA_CHG_DATE not in", values, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateBetween(String value1, String value2) {
            addCriterion("DATA_CHG_DATE between", value1, value2, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotBetween(String value1, String value2) {
            addCriterion("DATA_CHG_DATE not between", value1, value2, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeIsNull() {
            addCriterion("DATA_CHG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeIsNotNull() {
            addCriterion("DATA_CHG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeEqualTo(String value) {
            addCriterion("DATA_CHG_TIME =", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotEqualTo(String value) {
            addCriterion("DATA_CHG_TIME <>", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeGreaterThan(String value) {
            addCriterion("DATA_CHG_TIME >", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_TIME >=", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeLessThan(String value) {
            addCriterion("DATA_CHG_TIME <", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeLessThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_TIME <=", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeLike(String value) {
            addCriterion("DATA_CHG_TIME like", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotLike(String value) {
            addCriterion("DATA_CHG_TIME not like", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeIn(List<String> values) {
            addCriterion("DATA_CHG_TIME in", values, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotIn(List<String> values) {
            addCriterion("DATA_CHG_TIME not in", values, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeBetween(String value1, String value2) {
            addCriterion("DATA_CHG_TIME between", value1, value2, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotBetween(String value1, String value2) {
            addCriterion("DATA_CHG_TIME not between", value1, value2, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataApvUserIsNull() {
            addCriterion("DATA_APV_USER is null");
            return (Criteria) this;
        }

        public Criteria andDataApvUserIsNotNull() {
            addCriterion("DATA_APV_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDataApvUserEqualTo(String value) {
            addCriterion("DATA_APV_USER =", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotEqualTo(String value) {
            addCriterion("DATA_APV_USER <>", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserGreaterThan(String value) {
            addCriterion("DATA_APV_USER >", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_APV_USER >=", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserLessThan(String value) {
            addCriterion("DATA_APV_USER <", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserLessThanOrEqualTo(String value) {
            addCriterion("DATA_APV_USER <=", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserLike(String value) {
            addCriterion("DATA_APV_USER like", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotLike(String value) {
            addCriterion("DATA_APV_USER not like", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserIn(List<String> values) {
            addCriterion("DATA_APV_USER in", values, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotIn(List<String> values) {
            addCriterion("DATA_APV_USER not in", values, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserBetween(String value1, String value2) {
            addCriterion("DATA_APV_USER between", value1, value2, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotBetween(String value1, String value2) {
            addCriterion("DATA_APV_USER not between", value1, value2, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvDateIsNull() {
            addCriterion("DATA_APV_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataApvDateIsNotNull() {
            addCriterion("DATA_APV_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataApvDateEqualTo(String value) {
            addCriterion("DATA_APV_DATE =", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotEqualTo(String value) {
            addCriterion("DATA_APV_DATE <>", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateGreaterThan(String value) {
            addCriterion("DATA_APV_DATE >", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_APV_DATE >=", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateLessThan(String value) {
            addCriterion("DATA_APV_DATE <", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_APV_DATE <=", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateLike(String value) {
            addCriterion("DATA_APV_DATE like", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotLike(String value) {
            addCriterion("DATA_APV_DATE not like", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateIn(List<String> values) {
            addCriterion("DATA_APV_DATE in", values, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotIn(List<String> values) {
            addCriterion("DATA_APV_DATE not in", values, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateBetween(String value1, String value2) {
            addCriterion("DATA_APV_DATE between", value1, value2, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotBetween(String value1, String value2) {
            addCriterion("DATA_APV_DATE not between", value1, value2, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeIsNull() {
            addCriterion("DATA_APV_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeIsNotNull() {
            addCriterion("DATA_APV_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeEqualTo(String value) {
            addCriterion("DATA_APV_TIME =", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotEqualTo(String value) {
            addCriterion("DATA_APV_TIME <>", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeGreaterThan(String value) {
            addCriterion("DATA_APV_TIME >", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_APV_TIME >=", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeLessThan(String value) {
            addCriterion("DATA_APV_TIME <", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeLessThanOrEqualTo(String value) {
            addCriterion("DATA_APV_TIME <=", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeLike(String value) {
            addCriterion("DATA_APV_TIME like", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotLike(String value) {
            addCriterion("DATA_APV_TIME not like", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeIn(List<String> values) {
            addCriterion("DATA_APV_TIME in", values, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotIn(List<String> values) {
            addCriterion("DATA_APV_TIME not in", values, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeBetween(String value1, String value2) {
            addCriterion("DATA_APV_TIME between", value1, value2, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotBetween(String value1, String value2) {
            addCriterion("DATA_APV_TIME not between", value1, value2, "dataApvTime");
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

        public Criteria andLastTimeIsNull() {
            addCriterion("LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(String value) {
            addCriterion("LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(String value) {
            addCriterion("LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(String value) {
            addCriterion("LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(String value) {
            addCriterion("LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLike(String value) {
            addCriterion("LAST_TIME like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotLike(String value) {
            addCriterion("LAST_TIME not like", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<String> values) {
            addCriterion("LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<String> values) {
            addCriterion("LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(String value1, String value2) {
            addCriterion("LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_TIME not between", value1, value2, "lastTime");
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