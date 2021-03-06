package com.ruipeng.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthorityTaExample {
    //用于分页的page当前页和rows所需行数
    private Integer startNum;
    private Integer addNum;

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getAddNum() {
        return addNum;
    }

    public void setAddNum(Integer addNum) {
        this.addNum = addNum;
    }
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public AuthorityTaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
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

        public Criteria andUserauthorityIsNull() {
            addCriterion("userAuthority is null");
            return (Criteria) this;
        }

        public Criteria andUserauthorityIsNotNull() {
            addCriterion("userAuthority is not null");
            return (Criteria) this;
        }

        public Criteria andUserauthorityEqualTo(String value) {
            addCriterion("userAuthority =", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityNotEqualTo(String value) {
            addCriterion("userAuthority <>", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityGreaterThan(String value) {
            addCriterion("userAuthority >", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("userAuthority >=", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityLessThan(String value) {
            addCriterion("userAuthority <", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityLessThanOrEqualTo(String value) {
            addCriterion("userAuthority <=", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityLike(String value) {
            addCriterion("userAuthority like", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityNotLike(String value) {
            addCriterion("userAuthority not like", value, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityIn(List<String> values) {
            addCriterion("userAuthority in", values, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityNotIn(List<String> values) {
            addCriterion("userAuthority not in", values, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityBetween(String value1, String value2) {
            addCriterion("userAuthority between", value1, value2, "userauthority");
            return (Criteria) this;
        }

        public Criteria andUserauthorityNotBetween(String value1, String value2) {
            addCriterion("userAuthority not between", value1, value2, "userauthority");
            return (Criteria) this;
        }

        public Criteria andListlevelIsNull() {
            addCriterion("listLevel is null");
            return (Criteria) this;
        }

        public Criteria andListlevelIsNotNull() {
            addCriterion("listLevel is not null");
            return (Criteria) this;
        }

        public Criteria andListlevelEqualTo(String value) {
            addCriterion("listLevel =", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelNotEqualTo(String value) {
            addCriterion("listLevel <>", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelGreaterThan(String value) {
            addCriterion("listLevel >", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelGreaterThanOrEqualTo(String value) {
            addCriterion("listLevel >=", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelLessThan(String value) {
            addCriterion("listLevel <", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelLessThanOrEqualTo(String value) {
            addCriterion("listLevel <=", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelLike(String value) {
            addCriterion("listLevel like", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelNotLike(String value) {
            addCriterion("listLevel not like", value, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelIn(List<String> values) {
            addCriterion("listLevel in", values, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelNotIn(List<String> values) {
            addCriterion("listLevel not in", values, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelBetween(String value1, String value2) {
            addCriterion("listLevel between", value1, value2, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListlevelNotBetween(String value1, String value2) {
            addCriterion("listLevel not between", value1, value2, "listlevel");
            return (Criteria) this;
        }

        public Criteria andListpostfixIsNull() {
            addCriterion("listPostfix is null");
            return (Criteria) this;
        }

        public Criteria andListpostfixIsNotNull() {
            addCriterion("listPostfix is not null");
            return (Criteria) this;
        }

//        public Criteria andListpostfixEqualTo(String value) {
//            addCriterion("listPostfix =", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixNotEqualTo(String value) {
//            addCriterion("listPostfix <>", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixGreaterThan(String value) {
//            addCriterion("listPostfix >", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixGreaterThanOrEqualTo(String value) {
//            addCriterion("listPostfix >=", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixLessThan(String value) {
//            addCriterion("listPostfix <", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixLessThanOrEqualTo(String value) {
//            addCriterion("listPostfix <=", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixLike(String value) {
//            addCriterion("listPostfix like", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixNotLike(String value) {
//            addCriterion("listPostfix not like", value, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixIn(List<String> values) {
//            addCriterion("listPostfix in", values, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixNotIn(List<String> values) {
//            addCriterion("listPostfix not in", values, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixBetween(String value1, String value2) {
//            addCriterion("listPostfix between", value1, value2, "listpostfix");
//            return (Criteria) this;
//        }
//
//        public Criteria andListpostfixNotBetween(String value1, String value2) {
//            addCriterion("listPostfix not between", value1, value2, "listpostfix");
//            return (Criteria) this;
//        }

        public Criteria andAcademyIsNull() {
            addCriterion("academy is null");
            return (Criteria) this;
        }

        public Criteria andAcademyIsNotNull() {
            addCriterion("academy is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyEqualTo(String value) {
            addCriterion("academy =", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotEqualTo(String value) {
            addCriterion("academy <>", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThan(String value) {
            addCriterion("academy >", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThanOrEqualTo(String value) {
            addCriterion("academy >=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThan(String value) {
            addCriterion("academy <", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThanOrEqualTo(String value) {
            addCriterion("academy <=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLike(String value) {
            addCriterion("academy like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotLike(String value) {
            addCriterion("academy not like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyIn(List<String> values) {
            addCriterion("academy in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotIn(List<String> values) {
            addCriterion("academy not in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyBetween(String value1, String value2) {
            addCriterion("academy between", value1, value2, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotBetween(String value1, String value2) {
            addCriterion("academy not between", value1, value2, "academy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated do_not_delete_during_merge Fri May 11 22:18:35 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AUTHORITY_TA
     *
     * @mbggenerated Fri May 11 22:18:35 CST 2018
     */
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