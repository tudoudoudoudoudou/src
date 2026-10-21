package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class TbGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGroupExample() {
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

        public Criteria andDepartIdIsNull() {
            addCriterion("DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("DEPART_ID =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("DEPART_ID <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("DEPART_ID >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_ID >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("DEPART_ID <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("DEPART_ID <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("DEPART_ID like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("DEPART_ID not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("DEPART_ID in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("DEPART_ID not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("DEPART_ID between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("DEPART_ID not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andPgroupIdIsNull() {
            addCriterion("PGROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPgroupIdIsNotNull() {
            addCriterion("PGROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPgroupIdEqualTo(String value) {
            addCriterion("PGROUP_ID =", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdNotEqualTo(String value) {
            addCriterion("PGROUP_ID <>", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdGreaterThan(String value) {
            addCriterion("PGROUP_ID >", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("PGROUP_ID >=", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdLessThan(String value) {
            addCriterion("PGROUP_ID <", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdLessThanOrEqualTo(String value) {
            addCriterion("PGROUP_ID <=", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdLike(String value) {
            addCriterion("PGROUP_ID like", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdNotLike(String value) {
            addCriterion("PGROUP_ID not like", value, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdIn(List<String> values) {
            addCriterion("PGROUP_ID in", values, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdNotIn(List<String> values) {
            addCriterion("PGROUP_ID not in", values, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdBetween(String value1, String value2) {
            addCriterion("PGROUP_ID between", value1, value2, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andPgroupIdNotBetween(String value1, String value2) {
            addCriterion("PGROUP_ID not between", value1, value2, "pgroupId");
            return (Criteria) this;
        }

        public Criteria andGroupContactIsNull() {
            addCriterion("GROUP_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andGroupContactIsNotNull() {
            addCriterion("GROUP_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andGroupContactEqualTo(String value) {
            addCriterion("GROUP_CONTACT =", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactNotEqualTo(String value) {
            addCriterion("GROUP_CONTACT <>", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactGreaterThan(String value) {
            addCriterion("GROUP_CONTACT >", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_CONTACT >=", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactLessThan(String value) {
            addCriterion("GROUP_CONTACT <", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactLessThanOrEqualTo(String value) {
            addCriterion("GROUP_CONTACT <=", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactLike(String value) {
            addCriterion("GROUP_CONTACT like", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactNotLike(String value) {
            addCriterion("GROUP_CONTACT not like", value, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactIn(List<String> values) {
            addCriterion("GROUP_CONTACT in", values, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactNotIn(List<String> values) {
            addCriterion("GROUP_CONTACT not in", values, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactBetween(String value1, String value2) {
            addCriterion("GROUP_CONTACT between", value1, value2, "groupContact");
            return (Criteria) this;
        }

        public Criteria andGroupContactNotBetween(String value1, String value2) {
            addCriterion("GROUP_CONTACT not between", value1, value2, "groupContact");
            return (Criteria) this;
        }

        public Criteria andInqIdIsNull() {
            addCriterion("INQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andInqIdIsNotNull() {
            addCriterion("INQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInqIdEqualTo(String value) {
            addCriterion("INQ_ID =", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotEqualTo(String value) {
            addCriterion("INQ_ID <>", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThan(String value) {
            addCriterion("INQ_ID >", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThanOrEqualTo(String value) {
            addCriterion("INQ_ID >=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThan(String value) {
            addCriterion("INQ_ID <", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThanOrEqualTo(String value) {
            addCriterion("INQ_ID <=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLike(String value) {
            addCriterion("INQ_ID like", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotLike(String value) {
            addCriterion("INQ_ID not like", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdIn(List<String> values) {
            addCriterion("INQ_ID in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotIn(List<String> values) {
            addCriterion("INQ_ID not in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdBetween(String value1, String value2) {
            addCriterion("INQ_ID between", value1, value2, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotBetween(String value1, String value2) {
            addCriterion("INQ_ID not between", value1, value2, "inqId");
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