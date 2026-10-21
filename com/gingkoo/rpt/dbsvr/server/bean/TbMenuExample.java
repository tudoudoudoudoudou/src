package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("MENU_ID like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("MENU_ID not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdIsNull() {
            addCriterion("PMENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmenuIdIsNotNull() {
            addCriterion("PMENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmenuIdEqualTo(String value) {
            addCriterion("PMENU_ID =", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdNotEqualTo(String value) {
            addCriterion("PMENU_ID <>", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdGreaterThan(String value) {
            addCriterion("PMENU_ID >", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("PMENU_ID >=", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdLessThan(String value) {
            addCriterion("PMENU_ID <", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdLessThanOrEqualTo(String value) {
            addCriterion("PMENU_ID <=", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdLike(String value) {
            addCriterion("PMENU_ID like", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdNotLike(String value) {
            addCriterion("PMENU_ID not like", value, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdIn(List<String> values) {
            addCriterion("PMENU_ID in", values, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdNotIn(List<String> values) {
            addCriterion("PMENU_ID not in", values, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdBetween(String value1, String value2) {
            addCriterion("PMENU_ID between", value1, value2, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andPmenuIdNotBetween(String value1, String value2) {
            addCriterion("PMENU_ID not between", value1, value2, "pmenuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andCmdIsNull() {
            addCriterion("CMD is null");
            return (Criteria) this;
        }

        public Criteria andCmdIsNotNull() {
            addCriterion("CMD is not null");
            return (Criteria) this;
        }

        public Criteria andCmdEqualTo(String value) {
            addCriterion("CMD =", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotEqualTo(String value) {
            addCriterion("CMD <>", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdGreaterThan(String value) {
            addCriterion("CMD >", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdGreaterThanOrEqualTo(String value) {
            addCriterion("CMD >=", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLessThan(String value) {
            addCriterion("CMD <", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLessThanOrEqualTo(String value) {
            addCriterion("CMD <=", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLike(String value) {
            addCriterion("CMD like", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotLike(String value) {
            addCriterion("CMD not like", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdIn(List<String> values) {
            addCriterion("CMD in", values, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotIn(List<String> values) {
            addCriterion("CMD not in", values, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdBetween(String value1, String value2) {
            addCriterion("CMD between", value1, value2, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotBetween(String value1, String value2) {
            addCriterion("CMD not between", value1, value2, "cmd");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andSeparatorIsNull() {
            addCriterion("SEPARATOR is null");
            return (Criteria) this;
        }

        public Criteria andSeparatorIsNotNull() {
            addCriterion("SEPARATOR is not null");
            return (Criteria) this;
        }

        public Criteria andSeparatorEqualTo(String value) {
            addCriterion("SEPARATOR =", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorNotEqualTo(String value) {
            addCriterion("SEPARATOR <>", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorGreaterThan(String value) {
            addCriterion("SEPARATOR >", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorGreaterThanOrEqualTo(String value) {
            addCriterion("SEPARATOR >=", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorLessThan(String value) {
            addCriterion("SEPARATOR <", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorLessThanOrEqualTo(String value) {
            addCriterion("SEPARATOR <=", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorLike(String value) {
            addCriterion("SEPARATOR like", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorNotLike(String value) {
            addCriterion("SEPARATOR not like", value, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorIn(List<String> values) {
            addCriterion("SEPARATOR in", values, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorNotIn(List<String> values) {
            addCriterion("SEPARATOR not in", values, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorBetween(String value1, String value2) {
            addCriterion("SEPARATOR between", value1, value2, "separator");
            return (Criteria) this;
        }

        public Criteria andSeparatorNotBetween(String value1, String value2) {
            addCriterion("SEPARATOR not between", value1, value2, "separator");
            return (Criteria) this;
        }

        public Criteria andMorderIsNull() {
            addCriterion("MORDER is null");
            return (Criteria) this;
        }

        public Criteria andMorderIsNotNull() {
            addCriterion("MORDER is not null");
            return (Criteria) this;
        }

        public Criteria andMorderEqualTo(BigDecimal value) {
            addCriterion("MORDER =", value, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderNotEqualTo(BigDecimal value) {
            addCriterion("MORDER <>", value, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderGreaterThan(BigDecimal value) {
            addCriterion("MORDER >", value, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MORDER >=", value, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderLessThan(BigDecimal value) {
            addCriterion("MORDER <", value, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MORDER <=", value, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderIn(List<BigDecimal> values) {
            addCriterion("MORDER in", values, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderNotIn(List<BigDecimal> values) {
            addCriterion("MORDER not in", values, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MORDER between", value1, value2, "morder");
            return (Criteria) this;
        }

        public Criteria andMorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MORDER not between", value1, value2, "morder");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("MODULE_ID like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("MODULE_ID not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andNodeflagIsNull() {
            addCriterion("NODEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andNodeflagIsNotNull() {
            addCriterion("NODEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNodeflagEqualTo(String value) {
            addCriterion("NODEFLAG =", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagNotEqualTo(String value) {
            addCriterion("NODEFLAG <>", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagGreaterThan(String value) {
            addCriterion("NODEFLAG >", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagGreaterThanOrEqualTo(String value) {
            addCriterion("NODEFLAG >=", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagLessThan(String value) {
            addCriterion("NODEFLAG <", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagLessThanOrEqualTo(String value) {
            addCriterion("NODEFLAG <=", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagLike(String value) {
            addCriterion("NODEFLAG like", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagNotLike(String value) {
            addCriterion("NODEFLAG not like", value, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagIn(List<String> values) {
            addCriterion("NODEFLAG in", values, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagNotIn(List<String> values) {
            addCriterion("NODEFLAG not in", values, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagBetween(String value1, String value2) {
            addCriterion("NODEFLAG between", value1, value2, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andNodeflagNotBetween(String value1, String value2) {
            addCriterion("NODEFLAG not between", value1, value2, "nodeflag");
            return (Criteria) this;
        }

        public Criteria andTxnoIsNull() {
            addCriterion("TXNO is null");
            return (Criteria) this;
        }

        public Criteria andTxnoIsNotNull() {
            addCriterion("TXNO is not null");
            return (Criteria) this;
        }

        public Criteria andTxnoEqualTo(String value) {
            addCriterion("TXNO =", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoNotEqualTo(String value) {
            addCriterion("TXNO <>", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoGreaterThan(String value) {
            addCriterion("TXNO >", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoGreaterThanOrEqualTo(String value) {
            addCriterion("TXNO >=", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoLessThan(String value) {
            addCriterion("TXNO <", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoLessThanOrEqualTo(String value) {
            addCriterion("TXNO <=", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoLike(String value) {
            addCriterion("TXNO like", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoNotLike(String value) {
            addCriterion("TXNO not like", value, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoIn(List<String> values) {
            addCriterion("TXNO in", values, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoNotIn(List<String> values) {
            addCriterion("TXNO not in", values, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoBetween(String value1, String value2) {
            addCriterion("TXNO between", value1, value2, "txno");
            return (Criteria) this;
        }

        public Criteria andTxnoNotBetween(String value1, String value2) {
            addCriterion("TXNO not between", value1, value2, "txno");
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