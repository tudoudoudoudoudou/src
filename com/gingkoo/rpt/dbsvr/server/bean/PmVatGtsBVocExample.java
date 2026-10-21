package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmVatGtsBVocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmVatGtsBVocExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFpzlIsNull() {
            addCriterion("FPZL is null");
            return (Criteria) this;
        }

        public Criteria andFpzlIsNotNull() {
            addCriterion("FPZL is not null");
            return (Criteria) this;
        }

        public Criteria andFpzlEqualTo(String value) {
            addCriterion("FPZL =", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlNotEqualTo(String value) {
            addCriterion("FPZL <>", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlGreaterThan(String value) {
            addCriterion("FPZL >", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlGreaterThanOrEqualTo(String value) {
            addCriterion("FPZL >=", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlLessThan(String value) {
            addCriterion("FPZL <", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlLessThanOrEqualTo(String value) {
            addCriterion("FPZL <=", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlLike(String value) {
            addCriterion("FPZL like", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlNotLike(String value) {
            addCriterion("FPZL not like", value, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlIn(List<String> values) {
            addCriterion("FPZL in", values, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlNotIn(List<String> values) {
            addCriterion("FPZL not in", values, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlBetween(String value1, String value2) {
            addCriterion("FPZL between", value1, value2, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpzlNotBetween(String value1, String value2) {
            addCriterion("FPZL not between", value1, value2, "fpzl");
            return (Criteria) this;
        }

        public Criteria andFpdmIsNull() {
            addCriterion("FPDM is null");
            return (Criteria) this;
        }

        public Criteria andFpdmIsNotNull() {
            addCriterion("FPDM is not null");
            return (Criteria) this;
        }

        public Criteria andFpdmEqualTo(String value) {
            addCriterion("FPDM =", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotEqualTo(String value) {
            addCriterion("FPDM <>", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmGreaterThan(String value) {
            addCriterion("FPDM >", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmGreaterThanOrEqualTo(String value) {
            addCriterion("FPDM >=", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLessThan(String value) {
            addCriterion("FPDM <", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLessThanOrEqualTo(String value) {
            addCriterion("FPDM <=", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLike(String value) {
            addCriterion("FPDM like", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotLike(String value) {
            addCriterion("FPDM not like", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmIn(List<String> values) {
            addCriterion("FPDM in", values, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotIn(List<String> values) {
            addCriterion("FPDM not in", values, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmBetween(String value1, String value2) {
            addCriterion("FPDM between", value1, value2, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotBetween(String value1, String value2) {
            addCriterion("FPDM not between", value1, value2, "fpdm");
            return (Criteria) this;
        }

        public Criteria andStartnoIsNull() {
            addCriterion("STARTNO is null");
            return (Criteria) this;
        }

        public Criteria andStartnoIsNotNull() {
            addCriterion("STARTNO is not null");
            return (Criteria) this;
        }

        public Criteria andStartnoEqualTo(String value) {
            addCriterion("STARTNO =", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoNotEqualTo(String value) {
            addCriterion("STARTNO <>", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoGreaterThan(String value) {
            addCriterion("STARTNO >", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoGreaterThanOrEqualTo(String value) {
            addCriterion("STARTNO >=", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoLessThan(String value) {
            addCriterion("STARTNO <", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoLessThanOrEqualTo(String value) {
            addCriterion("STARTNO <=", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoLike(String value) {
            addCriterion("STARTNO like", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoNotLike(String value) {
            addCriterion("STARTNO not like", value, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoIn(List<String> values) {
            addCriterion("STARTNO in", values, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoNotIn(List<String> values) {
            addCriterion("STARTNO not in", values, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoBetween(String value1, String value2) {
            addCriterion("STARTNO between", value1, value2, "startno");
            return (Criteria) this;
        }

        public Criteria andStartnoNotBetween(String value1, String value2) {
            addCriterion("STARTNO not between", value1, value2, "startno");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(BigDecimal value) {
            addCriterion("COUNT =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(BigDecimal value) {
            addCriterion("COUNT <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(BigDecimal value) {
            addCriterion("COUNT >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUNT >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(BigDecimal value) {
            addCriterion("COUNT <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUNT <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<BigDecimal> values) {
            addCriterion("COUNT in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<BigDecimal> values) {
            addCriterion("COUNT not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUNT between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUNT not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andRemainIsNull() {
            addCriterion("REMAIN is null");
            return (Criteria) this;
        }

        public Criteria andRemainIsNotNull() {
            addCriterion("REMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andRemainEqualTo(BigDecimal value) {
            addCriterion("REMAIN =", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotEqualTo(BigDecimal value) {
            addCriterion("REMAIN <>", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThan(BigDecimal value) {
            addCriterion("REMAIN >", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAIN >=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThan(BigDecimal value) {
            addCriterion("REMAIN <", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMAIN <=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainIn(List<BigDecimal> values) {
            addCriterion("REMAIN in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotIn(List<BigDecimal> values) {
            addCriterion("REMAIN not in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAIN between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMAIN not between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andKpdhIsNull() {
            addCriterion("KPDH is null");
            return (Criteria) this;
        }

        public Criteria andKpdhIsNotNull() {
            addCriterion("KPDH is not null");
            return (Criteria) this;
        }

        public Criteria andKpdhEqualTo(String value) {
            addCriterion("KPDH =", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotEqualTo(String value) {
            addCriterion("KPDH <>", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhGreaterThan(String value) {
            addCriterion("KPDH >", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhGreaterThanOrEqualTo(String value) {
            addCriterion("KPDH >=", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhLessThan(String value) {
            addCriterion("KPDH <", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhLessThanOrEqualTo(String value) {
            addCriterion("KPDH <=", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhLike(String value) {
            addCriterion("KPDH like", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotLike(String value) {
            addCriterion("KPDH not like", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhIn(List<String> values) {
            addCriterion("KPDH in", values, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotIn(List<String> values) {
            addCriterion("KPDH not in", values, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhBetween(String value1, String value2) {
            addCriterion("KPDH between", value1, value2, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotBetween(String value1, String value2) {
            addCriterion("KPDH not between", value1, value2, "kpdh");
            return (Criteria) this;
        }

        public Criteria andBuydayIsNull() {
            addCriterion("BUYDAY is null");
            return (Criteria) this;
        }

        public Criteria andBuydayIsNotNull() {
            addCriterion("BUYDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBuydayEqualTo(String value) {
            addCriterion("BUYDAY =", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotEqualTo(String value) {
            addCriterion("BUYDAY <>", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayGreaterThan(String value) {
            addCriterion("BUYDAY >", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayGreaterThanOrEqualTo(String value) {
            addCriterion("BUYDAY >=", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLessThan(String value) {
            addCriterion("BUYDAY <", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLessThanOrEqualTo(String value) {
            addCriterion("BUYDAY <=", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayLike(String value) {
            addCriterion("BUYDAY like", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotLike(String value) {
            addCriterion("BUYDAY not like", value, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayIn(List<String> values) {
            addCriterion("BUYDAY in", values, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotIn(List<String> values) {
            addCriterion("BUYDAY not in", values, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayBetween(String value1, String value2) {
            addCriterion("BUYDAY between", value1, value2, "buyday");
            return (Criteria) this;
        }

        public Criteria andBuydayNotBetween(String value1, String value2) {
            addCriterion("BUYDAY not between", value1, value2, "buyday");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(BigDecimal value) {
            addCriterion("LIMIT =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(BigDecimal value) {
            addCriterion("LIMIT <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(BigDecimal value) {
            addCriterion("LIMIT >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMIT >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(BigDecimal value) {
            addCriterion("LIMIT <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMIT <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<BigDecimal> values) {
            addCriterion("LIMIT in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<BigDecimal> values) {
            addCriterion("LIMIT not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMIT between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMIT not between", value1, value2, "limit");
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