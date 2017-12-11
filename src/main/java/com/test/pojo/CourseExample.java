package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
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

        public Criteria andCoursetypeIsNull() {
            addCriterion("coursetype is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("coursetype is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("coursetype =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("coursetype <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("coursetype >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("coursetype >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("coursetype <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("coursetype <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("coursetype like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("coursetype not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("coursetype in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("coursetype not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("coursetype between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("coursetype not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursefeeIsNull() {
            addCriterion("coursefee is null");
            return (Criteria) this;
        }

        public Criteria andCoursefeeIsNotNull() {
            addCriterion("coursefee is not null");
            return (Criteria) this;
        }

        public Criteria andCoursefeeEqualTo(Double value) {
            addCriterion("coursefee =", value, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeNotEqualTo(Double value) {
            addCriterion("coursefee <>", value, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeGreaterThan(Double value) {
            addCriterion("coursefee >", value, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeGreaterThanOrEqualTo(Double value) {
            addCriterion("coursefee >=", value, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeLessThan(Double value) {
            addCriterion("coursefee <", value, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeLessThanOrEqualTo(Double value) {
            addCriterion("coursefee <=", value, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeIn(List<Double> values) {
            addCriterion("coursefee in", values, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeNotIn(List<Double> values) {
            addCriterion("coursefee not in", values, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeBetween(Double value1, Double value2) {
            addCriterion("coursefee between", value1, value2, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCoursefeeNotBetween(Double value1, Double value2) {
            addCriterion("coursefee not between", value1, value2, "coursefee");
            return (Criteria) this;
        }

        public Criteria andCurrentnumIsNull() {
            addCriterion("currentnum is null");
            return (Criteria) this;
        }

        public Criteria andCurrentnumIsNotNull() {
            addCriterion("currentnum is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentnumEqualTo(Integer value) {
            addCriterion("currentnum =", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumNotEqualTo(Integer value) {
            addCriterion("currentnum <>", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumGreaterThan(Integer value) {
            addCriterion("currentnum >", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentnum >=", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumLessThan(Integer value) {
            addCriterion("currentnum <", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumLessThanOrEqualTo(Integer value) {
            addCriterion("currentnum <=", value, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumIn(List<Integer> values) {
            addCriterion("currentnum in", values, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumNotIn(List<Integer> values) {
            addCriterion("currentnum not in", values, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumBetween(Integer value1, Integer value2) {
            addCriterion("currentnum between", value1, value2, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCurrentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("currentnum not between", value1, value2, "currentnum");
            return (Criteria) this;
        }

        public Criteria andCoursecountIsNull() {
            addCriterion("coursecount is null");
            return (Criteria) this;
        }

        public Criteria andCoursecountIsNotNull() {
            addCriterion("coursecount is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecountEqualTo(Integer value) {
            addCriterion("coursecount =", value, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountNotEqualTo(Integer value) {
            addCriterion("coursecount <>", value, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountGreaterThan(Integer value) {
            addCriterion("coursecount >", value, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursecount >=", value, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountLessThan(Integer value) {
            addCriterion("coursecount <", value, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountLessThanOrEqualTo(Integer value) {
            addCriterion("coursecount <=", value, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountIn(List<Integer> values) {
            addCriterion("coursecount in", values, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountNotIn(List<Integer> values) {
            addCriterion("coursecount not in", values, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountBetween(Integer value1, Integer value2) {
            addCriterion("coursecount between", value1, value2, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursecountNotBetween(Integer value1, Integer value2) {
            addCriterion("coursecount not between", value1, value2, "coursecount");
            return (Criteria) this;
        }

        public Criteria andCoursedescIsNull() {
            addCriterion("coursedesc is null");
            return (Criteria) this;
        }

        public Criteria andCoursedescIsNotNull() {
            addCriterion("coursedesc is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedescEqualTo(String value) {
            addCriterion("coursedesc =", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotEqualTo(String value) {
            addCriterion("coursedesc <>", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescGreaterThan(String value) {
            addCriterion("coursedesc >", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescGreaterThanOrEqualTo(String value) {
            addCriterion("coursedesc >=", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLessThan(String value) {
            addCriterion("coursedesc <", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLessThanOrEqualTo(String value) {
            addCriterion("coursedesc <=", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLike(String value) {
            addCriterion("coursedesc like", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotLike(String value) {
            addCriterion("coursedesc not like", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescIn(List<String> values) {
            addCriterion("coursedesc in", values, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotIn(List<String> values) {
            addCriterion("coursedesc not in", values, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescBetween(String value1, String value2) {
            addCriterion("coursedesc between", value1, value2, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotBetween(String value1, String value2) {
            addCriterion("coursedesc not between", value1, value2, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartIsNull() {
            addCriterion("curriculumstart is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartIsNotNull() {
            addCriterion("curriculumstart is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartEqualTo(String value) {
            addCriterion("curriculumstart =", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartNotEqualTo(String value) {
            addCriterion("curriculumstart <>", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartGreaterThan(String value) {
            addCriterion("curriculumstart >", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartGreaterThanOrEqualTo(String value) {
            addCriterion("curriculumstart >=", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartLessThan(String value) {
            addCriterion("curriculumstart <", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartLessThanOrEqualTo(String value) {
            addCriterion("curriculumstart <=", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartLike(String value) {
            addCriterion("curriculumstart like", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartNotLike(String value) {
            addCriterion("curriculumstart not like", value, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartIn(List<String> values) {
            addCriterion("curriculumstart in", values, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartNotIn(List<String> values) {
            addCriterion("curriculumstart not in", values, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartBetween(String value1, String value2) {
            addCriterion("curriculumstart between", value1, value2, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumstartNotBetween(String value1, String value2) {
            addCriterion("curriculumstart not between", value1, value2, "curriculumstart");
            return (Criteria) this;
        }

        public Criteria andCurriculumendIsNull() {
            addCriterion("curriculumend is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumendIsNotNull() {
            addCriterion("curriculumend is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumendEqualTo(String value) {
            addCriterion("curriculumend =", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendNotEqualTo(String value) {
            addCriterion("curriculumend <>", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendGreaterThan(String value) {
            addCriterion("curriculumend >", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendGreaterThanOrEqualTo(String value) {
            addCriterion("curriculumend >=", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendLessThan(String value) {
            addCriterion("curriculumend <", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendLessThanOrEqualTo(String value) {
            addCriterion("curriculumend <=", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendLike(String value) {
            addCriterion("curriculumend like", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendNotLike(String value) {
            addCriterion("curriculumend not like", value, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendIn(List<String> values) {
            addCriterion("curriculumend in", values, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendNotIn(List<String> values) {
            addCriterion("curriculumend not in", values, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendBetween(String value1, String value2) {
            addCriterion("curriculumend between", value1, value2, "curriculumend");
            return (Criteria) this;
        }

        public Criteria andCurriculumendNotBetween(String value1, String value2) {
            addCriterion("curriculumend not between", value1, value2, "curriculumend");
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