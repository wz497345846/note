package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpidIsNull() {
            addCriterion("empid is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empid is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("empid =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("empid <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("empid >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("empid >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("empid <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("empid <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("empid in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("empid not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("empid between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("empid not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpavatarIsNull() {
            addCriterion("empavatar is null");
            return (Criteria) this;
        }

        public Criteria andEmpavatarIsNotNull() {
            addCriterion("empavatar is not null");
            return (Criteria) this;
        }

        public Criteria andEmpavatarEqualTo(String value) {
            addCriterion("empavatar =", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarNotEqualTo(String value) {
            addCriterion("empavatar <>", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarGreaterThan(String value) {
            addCriterion("empavatar >", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarGreaterThanOrEqualTo(String value) {
            addCriterion("empavatar >=", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarLessThan(String value) {
            addCriterion("empavatar <", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarLessThanOrEqualTo(String value) {
            addCriterion("empavatar <=", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarLike(String value) {
            addCriterion("empavatar like", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarNotLike(String value) {
            addCriterion("empavatar not like", value, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarIn(List<String> values) {
            addCriterion("empavatar in", values, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarNotIn(List<String> values) {
            addCriterion("empavatar not in", values, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarBetween(String value1, String value2) {
            addCriterion("empavatar between", value1, value2, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpavatarNotBetween(String value1, String value2) {
            addCriterion("empavatar not between", value1, value2, "empavatar");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("empname is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("empname is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("empname =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("empname <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("empname >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("empname >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("empname <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("empname <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("empname like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("empname not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("empname in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("empname not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("empname between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("empname not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmppwdIsNull() {
            addCriterion("emppwd is null");
            return (Criteria) this;
        }

        public Criteria andEmppwdIsNotNull() {
            addCriterion("emppwd is not null");
            return (Criteria) this;
        }

        public Criteria andEmppwdEqualTo(String value) {
            addCriterion("emppwd =", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdNotEqualTo(String value) {
            addCriterion("emppwd <>", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdGreaterThan(String value) {
            addCriterion("emppwd >", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdGreaterThanOrEqualTo(String value) {
            addCriterion("emppwd >=", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdLessThan(String value) {
            addCriterion("emppwd <", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdLessThanOrEqualTo(String value) {
            addCriterion("emppwd <=", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdLike(String value) {
            addCriterion("emppwd like", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdNotLike(String value) {
            addCriterion("emppwd not like", value, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdIn(List<String> values) {
            addCriterion("emppwd in", values, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdNotIn(List<String> values) {
            addCriterion("emppwd not in", values, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdBetween(String value1, String value2) {
            addCriterion("emppwd between", value1, value2, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmppwdNotBetween(String value1, String value2) {
            addCriterion("emppwd not between", value1, value2, "emppwd");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNull() {
            addCriterion("empsex is null");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNotNull() {
            addCriterion("empsex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpsexEqualTo(String value) {
            addCriterion("empsex =", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotEqualTo(String value) {
            addCriterion("empsex <>", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThan(String value) {
            addCriterion("empsex >", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThanOrEqualTo(String value) {
            addCriterion("empsex >=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThan(String value) {
            addCriterion("empsex <", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThanOrEqualTo(String value) {
            addCriterion("empsex <=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLike(String value) {
            addCriterion("empsex like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotLike(String value) {
            addCriterion("empsex not like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexIn(List<String> values) {
            addCriterion("empsex in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotIn(List<String> values) {
            addCriterion("empsex not in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexBetween(String value1, String value2) {
            addCriterion("empsex between", value1, value2, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotBetween(String value1, String value2) {
            addCriterion("empsex not between", value1, value2, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIsNull() {
            addCriterion("empphone is null");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIsNotNull() {
            addCriterion("empphone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpphoneEqualTo(String value) {
            addCriterion("empphone =", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotEqualTo(String value) {
            addCriterion("empphone <>", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneGreaterThan(String value) {
            addCriterion("empphone >", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneGreaterThanOrEqualTo(String value) {
            addCriterion("empphone >=", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLessThan(String value) {
            addCriterion("empphone <", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLessThanOrEqualTo(String value) {
            addCriterion("empphone <=", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLike(String value) {
            addCriterion("empphone like", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotLike(String value) {
            addCriterion("empphone not like", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIn(List<String> values) {
            addCriterion("empphone in", values, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotIn(List<String> values) {
            addCriterion("empphone not in", values, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneBetween(String value1, String value2) {
            addCriterion("empphone between", value1, value2, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotBetween(String value1, String value2) {
            addCriterion("empphone not between", value1, value2, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryIsNull() {
            addCriterion("empsalary is null");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryIsNotNull() {
            addCriterion("empsalary is not null");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryEqualTo(Double value) {
            addCriterion("empsalary =", value, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryNotEqualTo(Double value) {
            addCriterion("empsalary <>", value, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryGreaterThan(Double value) {
            addCriterion("empsalary >", value, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("empsalary >=", value, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryLessThan(Double value) {
            addCriterion("empsalary <", value, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryLessThanOrEqualTo(Double value) {
            addCriterion("empsalary <=", value, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryIn(List<Double> values) {
            addCriterion("empsalary in", values, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryNotIn(List<Double> values) {
            addCriterion("empsalary not in", values, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryBetween(Double value1, Double value2) {
            addCriterion("empsalary between", value1, value2, "empsalary");
            return (Criteria) this;
        }

        public Criteria andEmpsalaryNotBetween(Double value1, Double value2) {
            addCriterion("empsalary not between", value1, value2, "empsalary");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andEmpdescIsNull() {
            addCriterion("empdesc is null");
            return (Criteria) this;
        }

        public Criteria andEmpdescIsNotNull() {
            addCriterion("empdesc is not null");
            return (Criteria) this;
        }

        public Criteria andEmpdescEqualTo(String value) {
            addCriterion("empdesc =", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescNotEqualTo(String value) {
            addCriterion("empdesc <>", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescGreaterThan(String value) {
            addCriterion("empdesc >", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescGreaterThanOrEqualTo(String value) {
            addCriterion("empdesc >=", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescLessThan(String value) {
            addCriterion("empdesc <", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescLessThanOrEqualTo(String value) {
            addCriterion("empdesc <=", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescLike(String value) {
            addCriterion("empdesc like", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescNotLike(String value) {
            addCriterion("empdesc not like", value, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescIn(List<String> values) {
            addCriterion("empdesc in", values, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescNotIn(List<String> values) {
            addCriterion("empdesc not in", values, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescBetween(String value1, String value2) {
            addCriterion("empdesc between", value1, value2, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpdescNotBetween(String value1, String value2) {
            addCriterion("empdesc not between", value1, value2, "empdesc");
            return (Criteria) this;
        }

        public Criteria andEmpstateIsNull() {
            addCriterion("empstate is null");
            return (Criteria) this;
        }

        public Criteria andEmpstateIsNotNull() {
            addCriterion("empstate is not null");
            return (Criteria) this;
        }

        public Criteria andEmpstateEqualTo(Integer value) {
            addCriterion("empstate =", value, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateNotEqualTo(Integer value) {
            addCriterion("empstate <>", value, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateGreaterThan(Integer value) {
            addCriterion("empstate >", value, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("empstate >=", value, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateLessThan(Integer value) {
            addCriterion("empstate <", value, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateLessThanOrEqualTo(Integer value) {
            addCriterion("empstate <=", value, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateIn(List<Integer> values) {
            addCriterion("empstate in", values, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateNotIn(List<Integer> values) {
            addCriterion("empstate not in", values, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateBetween(Integer value1, Integer value2) {
            addCriterion("empstate between", value1, value2, "empstate");
            return (Criteria) this;
        }

        public Criteria andEmpstateNotBetween(Integer value1, Integer value2) {
            addCriterion("empstate not between", value1, value2, "empstate");
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