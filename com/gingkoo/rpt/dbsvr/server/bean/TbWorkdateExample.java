package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class TbWorkdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbWorkdateExample() {
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

        public Criteria andGuidIsNull() {
            addCriterion("GUID is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("GUID is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("GUID =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("GUID <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("GUID >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("GUID >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("GUID <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("GUID <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("GUID like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("GUID not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("GUID in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("GUID not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("GUID between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("GUID not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andCalendarNoIsNull() {
            addCriterion("CALENDAR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCalendarNoIsNotNull() {
            addCriterion("CALENDAR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarNoEqualTo(String value) {
            addCriterion("CALENDAR_NO =", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotEqualTo(String value) {
            addCriterion("CALENDAR_NO <>", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoGreaterThan(String value) {
            addCriterion("CALENDAR_NO >", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NO >=", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoLessThan(String value) {
            addCriterion("CALENDAR_NO <", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NO <=", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoLike(String value) {
            addCriterion("CALENDAR_NO like", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotLike(String value) {
            addCriterion("CALENDAR_NO not like", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoIn(List<String> values) {
            addCriterion("CALENDAR_NO in", values, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotIn(List<String> values) {
            addCriterion("CALENDAR_NO not in", values, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoBetween(String value1, String value2) {
            addCriterion("CALENDAR_NO between", value1, value2, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_NO not between", value1, value2, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNull() {
            addCriterion("WORK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNotNull() {
            addCriterion("WORK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDateEqualTo(String value) {
            addCriterion("WORK_DATE =", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotEqualTo(String value) {
            addCriterion("WORK_DATE <>", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThan(String value) {
            addCriterion("WORK_DATE >", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_DATE >=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThan(String value) {
            addCriterion("WORK_DATE <", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThanOrEqualTo(String value) {
            addCriterion("WORK_DATE <=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLike(String value) {
            addCriterion("WORK_DATE like", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotLike(String value) {
            addCriterion("WORK_DATE not like", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIn(List<String> values) {
            addCriterion("WORK_DATE in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotIn(List<String> values) {
            addCriterion("WORK_DATE not in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateBetween(String value1, String value2) {
            addCriterion("WORK_DATE between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotBetween(String value1, String value2) {
            addCriterion("WORK_DATE not between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkFlagIsNull() {
            addCriterion("WORK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlagIsNotNull() {
            addCriterion("WORK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlagEqualTo(String value) {
            addCriterion("WORK_FLAG =", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotEqualTo(String value) {
            addCriterion("WORK_FLAG <>", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagGreaterThan(String value) {
            addCriterion("WORK_FLAG >", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_FLAG >=", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagLessThan(String value) {
            addCriterion("WORK_FLAG <", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagLessThanOrEqualTo(String value) {
            addCriterion("WORK_FLAG <=", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagLike(String value) {
            addCriterion("WORK_FLAG like", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotLike(String value) {
            addCriterion("WORK_FLAG not like", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagIn(List<String> values) {
            addCriterion("WORK_FLAG in", values, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotIn(List<String> values) {
            addCriterion("WORK_FLAG not in", values, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagBetween(String value1, String value2) {
            addCriterion("WORK_FLAG between", value1, value2, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotBetween(String value1, String value2) {
            addCriterion("WORK_FLAG not between", value1, value2, "workFlag");
            return (Criteria) this;
        }

        public Criteria andFiller1IsNull() {
            addCriterion("FILLER1 is null");
            return (Criteria) this;
        }

        public Criteria andFiller1IsNotNull() {
            addCriterion("FILLER1 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller1EqualTo(String value) {
            addCriterion("FILLER1 =", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotEqualTo(String value) {
            addCriterion("FILLER1 <>", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1GreaterThan(String value) {
            addCriterion("FILLER1 >", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER1 >=", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1LessThan(String value) {
            addCriterion("FILLER1 <", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1LessThanOrEqualTo(String value) {
            addCriterion("FILLER1 <=", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1Like(String value) {
            addCriterion("FILLER1 like", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotLike(String value) {
            addCriterion("FILLER1 not like", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1In(List<String> values) {
            addCriterion("FILLER1 in", values, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotIn(List<String> values) {
            addCriterion("FILLER1 not in", values, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1Between(String value1, String value2) {
            addCriterion("FILLER1 between", value1, value2, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotBetween(String value1, String value2) {
            addCriterion("FILLER1 not between", value1, value2, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller2IsNull() {
            addCriterion("FILLER2 is null");
            return (Criteria) this;
        }

        public Criteria andFiller2IsNotNull() {
            addCriterion("FILLER2 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller2EqualTo(String value) {
            addCriterion("FILLER2 =", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotEqualTo(String value) {
            addCriterion("FILLER2 <>", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2GreaterThan(String value) {
            addCriterion("FILLER2 >", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER2 >=", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2LessThan(String value) {
            addCriterion("FILLER2 <", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2LessThanOrEqualTo(String value) {
            addCriterion("FILLER2 <=", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2Like(String value) {
            addCriterion("FILLER2 like", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotLike(String value) {
            addCriterion("FILLER2 not like", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2In(List<String> values) {
            addCriterion("FILLER2 in", values, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotIn(List<String> values) {
            addCriterion("FILLER2 not in", values, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2Between(String value1, String value2) {
            addCriterion("FILLER2 between", value1, value2, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotBetween(String value1, String value2) {
            addCriterion("FILLER2 not between", value1, value2, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller3IsNull() {
            addCriterion("FILLER3 is null");
            return (Criteria) this;
        }

        public Criteria andFiller3IsNotNull() {
            addCriterion("FILLER3 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller3EqualTo(String value) {
            addCriterion("FILLER3 =", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotEqualTo(String value) {
            addCriterion("FILLER3 <>", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3GreaterThan(String value) {
            addCriterion("FILLER3 >", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER3 >=", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3LessThan(String value) {
            addCriterion("FILLER3 <", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3LessThanOrEqualTo(String value) {
            addCriterion("FILLER3 <=", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3Like(String value) {
            addCriterion("FILLER3 like", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotLike(String value) {
            addCriterion("FILLER3 not like", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3In(List<String> values) {
            addCriterion("FILLER3 in", values, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotIn(List<String> values) {
            addCriterion("FILLER3 not in", values, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3Between(String value1, String value2) {
            addCriterion("FILLER3 between", value1, value2, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotBetween(String value1, String value2) {
            addCriterion("FILLER3 not between", value1, value2, "filler3");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIsNull() {
            addCriterion("CALENDAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIsNotNull() {
            addCriterion("CALENDAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarNameEqualTo(String value) {
            addCriterion("CALENDAR_NAME =", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotEqualTo(String value) {
            addCriterion("CALENDAR_NAME <>", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameGreaterThan(String value) {
            addCriterion("CALENDAR_NAME >", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NAME >=", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLessThan(String value) {
            addCriterion("CALENDAR_NAME <", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NAME <=", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameLike(String value) {
            addCriterion("CALENDAR_NAME like", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotLike(String value) {
            addCriterion("CALENDAR_NAME not like", value, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameIn(List<String> values) {
            addCriterion("CALENDAR_NAME in", values, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotIn(List<String> values) {
            addCriterion("CALENDAR_NAME not in", values, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameBetween(String value1, String value2) {
            addCriterion("CALENDAR_NAME between", value1, value2, "calendarName");
            return (Criteria) this;
        }

        public Criteria andCalendarNameNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_NAME not between", value1, value2, "calendarName");
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