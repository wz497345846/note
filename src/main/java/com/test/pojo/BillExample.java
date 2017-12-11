package com.test.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillExample() {
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

        public Criteria andBillidIsNull() {
            addCriterion("billid is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("billid is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(Integer value) {
            addCriterion("billid =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(Integer value) {
            addCriterion("billid <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(Integer value) {
            addCriterion("billid >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("billid >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(Integer value) {
            addCriterion("billid <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(Integer value) {
            addCriterion("billid <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<Integer> values) {
            addCriterion("billid in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<Integer> values) {
            addCriterion("billid not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(Integer value1, Integer value2) {
            addCriterion("billid between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(Integer value1, Integer value2) {
            addCriterion("billid not between", value1, value2, "billid");
            return (Criteria) this;
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

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("paytype like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("paytype not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andBilldescIsNull() {
            addCriterion("billdesc is null");
            return (Criteria) this;
        }

        public Criteria andBilldescIsNotNull() {
            addCriterion("billdesc is not null");
            return (Criteria) this;
        }

        public Criteria andBilldescEqualTo(String value) {
            addCriterion("billdesc =", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotEqualTo(String value) {
            addCriterion("billdesc <>", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescGreaterThan(String value) {
            addCriterion("billdesc >", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescGreaterThanOrEqualTo(String value) {
            addCriterion("billdesc >=", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescLessThan(String value) {
            addCriterion("billdesc <", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescLessThanOrEqualTo(String value) {
            addCriterion("billdesc <=", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescLike(String value) {
            addCriterion("billdesc like", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotLike(String value) {
            addCriterion("billdesc not like", value, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescIn(List<String> values) {
            addCriterion("billdesc in", values, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotIn(List<String> values) {
            addCriterion("billdesc not in", values, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescBetween(String value1, String value2) {
            addCriterion("billdesc between", value1, value2, "billdesc");
            return (Criteria) this;
        }

        public Criteria andBilldescNotBetween(String value1, String value2) {
            addCriterion("billdesc not between", value1, value2, "billdesc");
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