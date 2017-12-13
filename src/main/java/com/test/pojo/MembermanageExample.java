package com.test.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MembermanageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MembermanageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNull() {
            addCriterion("membername is null");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNotNull() {
            addCriterion("membername is not null");
            return (Criteria) this;
        }

        public Criteria andMembernameEqualTo(String value) {
            addCriterion("membername =", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotEqualTo(String value) {
            addCriterion("membername <>", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThan(String value) {
            addCriterion("membername >", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("membername >=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThan(String value) {
            addCriterion("membername <", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThanOrEqualTo(String value) {
            addCriterion("membername <=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLike(String value) {
            addCriterion("membername like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotLike(String value) {
            addCriterion("membername not like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameIn(List<String> values) {
            addCriterion("membername in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotIn(List<String> values) {
            addCriterion("membername not in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameBetween(String value1, String value2) {
            addCriterion("membername between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotBetween(String value1, String value2) {
            addCriterion("membername not between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andMemberphoneIsNull() {
            addCriterion("memberphone is null");
            return (Criteria) this;
        }

        public Criteria andMemberphoneIsNotNull() {
            addCriterion("memberphone is not null");
            return (Criteria) this;
        }

        public Criteria andMemberphoneEqualTo(String value) {
            addCriterion("memberphone =", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneNotEqualTo(String value) {
            addCriterion("memberphone <>", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneGreaterThan(String value) {
            addCriterion("memberphone >", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneGreaterThanOrEqualTo(String value) {
            addCriterion("memberphone >=", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneLessThan(String value) {
            addCriterion("memberphone <", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneLessThanOrEqualTo(String value) {
            addCriterion("memberphone <=", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneLike(String value) {
            addCriterion("memberphone like", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneNotLike(String value) {
            addCriterion("memberphone not like", value, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneIn(List<String> values) {
            addCriterion("memberphone in", values, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneNotIn(List<String> values) {
            addCriterion("memberphone not in", values, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneBetween(String value1, String value2) {
            addCriterion("memberphone between", value1, value2, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMemberphoneNotBetween(String value1, String value2) {
            addCriterion("memberphone not between", value1, value2, "memberphone");
            return (Criteria) this;
        }

        public Criteria andMembersexIsNull() {
            addCriterion("membersex is null");
            return (Criteria) this;
        }

        public Criteria andMembersexIsNotNull() {
            addCriterion("membersex is not null");
            return (Criteria) this;
        }

        public Criteria andMembersexEqualTo(String value) {
            addCriterion("membersex =", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexNotEqualTo(String value) {
            addCriterion("membersex <>", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexGreaterThan(String value) {
            addCriterion("membersex >", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexGreaterThanOrEqualTo(String value) {
            addCriterion("membersex >=", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexLessThan(String value) {
            addCriterion("membersex <", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexLessThanOrEqualTo(String value) {
            addCriterion("membersex <=", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexLike(String value) {
            addCriterion("membersex like", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexNotLike(String value) {
            addCriterion("membersex not like", value, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexIn(List<String> values) {
            addCriterion("membersex in", values, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexNotIn(List<String> values) {
            addCriterion("membersex not in", values, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexBetween(String value1, String value2) {
            addCriterion("membersex between", value1, value2, "membersex");
            return (Criteria) this;
        }

        public Criteria andMembersexNotBetween(String value1, String value2) {
            addCriterion("membersex not between", value1, value2, "membersex");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andMemberbirthIsNull() {
            addCriterion("memberbirth is null");
            return (Criteria) this;
        }

        public Criteria andMemberbirthIsNotNull() {
            addCriterion("memberbirth is not null");
            return (Criteria) this;
        }

        public Criteria andMemberbirthEqualTo(Date value) {
            addCriterionForJDBCDate("memberbirth =", value, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("memberbirth <>", value, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("memberbirth >", value, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("memberbirth >=", value, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthLessThan(Date value) {
            addCriterionForJDBCDate("memberbirth <", value, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("memberbirth <=", value, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthIn(List<Date> values) {
            addCriterionForJDBCDate("memberbirth in", values, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("memberbirth not in", values, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("memberbirth between", value1, value2, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andMemberbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("memberbirth not between", value1, value2, "memberbirth");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNull() {
            addCriterion("referee is null");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNotNull() {
            addCriterion("referee is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeEqualTo(String value) {
            addCriterion("referee =", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotEqualTo(String value) {
            addCriterion("referee <>", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThan(String value) {
            addCriterion("referee >", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThanOrEqualTo(String value) {
            addCriterion("referee >=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThan(String value) {
            addCriterion("referee <", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThanOrEqualTo(String value) {
            addCriterion("referee <=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLike(String value) {
            addCriterion("referee like", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotLike(String value) {
            addCriterion("referee not like", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeIn(List<String> values) {
            addCriterion("referee in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotIn(List<String> values) {
            addCriterion("referee not in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeBetween(String value1, String value2) {
            addCriterion("referee between", value1, value2, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotBetween(String value1, String value2) {
            addCriterion("referee not between", value1, value2, "referee");
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

        public Criteria andMemberremarkIsNull() {
            addCriterion("memberremark is null");
            return (Criteria) this;
        }

        public Criteria andMemberremarkIsNotNull() {
            addCriterion("memberremark is not null");
            return (Criteria) this;
        }

        public Criteria andMemberremarkEqualTo(String value) {
            addCriterion("memberremark =", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkNotEqualTo(String value) {
            addCriterion("memberremark <>", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkGreaterThan(String value) {
            addCriterion("memberremark >", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkGreaterThanOrEqualTo(String value) {
            addCriterion("memberremark >=", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkLessThan(String value) {
            addCriterion("memberremark <", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkLessThanOrEqualTo(String value) {
            addCriterion("memberremark <=", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkLike(String value) {
            addCriterion("memberremark like", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkNotLike(String value) {
            addCriterion("memberremark not like", value, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkIn(List<String> values) {
            addCriterion("memberremark in", values, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkNotIn(List<String> values) {
            addCriterion("memberremark not in", values, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkBetween(String value1, String value2) {
            addCriterion("memberremark between", value1, value2, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberremarkNotBetween(String value1, String value2) {
            addCriterion("memberremark not between", value1, value2, "memberremark");
            return (Criteria) this;
        }

        public Criteria andMemberdescIsNull() {
            addCriterion("memberdesc is null");
            return (Criteria) this;
        }

        public Criteria andMemberdescIsNotNull() {
            addCriterion("memberdesc is not null");
            return (Criteria) this;
        }

        public Criteria andMemberdescEqualTo(String value) {
            addCriterion("memberdesc =", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescNotEqualTo(String value) {
            addCriterion("memberdesc <>", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescGreaterThan(String value) {
            addCriterion("memberdesc >", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescGreaterThanOrEqualTo(String value) {
            addCriterion("memberdesc >=", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescLessThan(String value) {
            addCriterion("memberdesc <", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescLessThanOrEqualTo(String value) {
            addCriterion("memberdesc <=", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescLike(String value) {
            addCriterion("memberdesc like", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescNotLike(String value) {
            addCriterion("memberdesc not like", value, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescIn(List<String> values) {
            addCriterion("memberdesc in", values, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescNotIn(List<String> values) {
            addCriterion("memberdesc not in", values, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescBetween(String value1, String value2) {
            addCriterion("memberdesc between", value1, value2, "memberdesc");
            return (Criteria) this;
        }

        public Criteria andMemberdescNotBetween(String value1, String value2) {
            addCriterion("memberdesc not between", value1, value2, "memberdesc");
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