package com.rs.ocp.domain.endity;

import java.util.ArrayList;
import java.util.List;

public class AccAccpwdExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public AccAccpwdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
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
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table acc_accpwd
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table acc_accpwd
     *
     * @mbggenerated
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

        public Criteria andAccpwdIdIsNull() {
            addCriterion("accpwd_id is null");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdIsNotNull() {
            addCriterion("accpwd_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdEqualTo(Integer value) {
            addCriterion("accpwd_id =", value, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdNotEqualTo(Integer value) {
            addCriterion("accpwd_id <>", value, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdGreaterThan(Integer value) {
            addCriterion("accpwd_id >", value, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accpwd_id >=", value, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdLessThan(Integer value) {
            addCriterion("accpwd_id <", value, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdLessThanOrEqualTo(Integer value) {
            addCriterion("accpwd_id <=", value, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdIn(List<Integer> values) {
            addCriterion("accpwd_id in", values, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdNotIn(List<Integer> values) {
            addCriterion("accpwd_id not in", values, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdBetween(Integer value1, Integer value2) {
            addCriterion("accpwd_id between", value1, value2, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accpwd_id not between", value1, value2, "accpwdId");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidIsNull() {
            addCriterion("accpwd_accid is null");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidIsNotNull() {
            addCriterion("accpwd_accid is not null");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidEqualTo(Integer value) {
            addCriterion("accpwd_accid =", value, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidNotEqualTo(Integer value) {
            addCriterion("accpwd_accid <>", value, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidGreaterThan(Integer value) {
            addCriterion("accpwd_accid >", value, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accpwd_accid >=", value, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidLessThan(Integer value) {
            addCriterion("accpwd_accid <", value, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidLessThanOrEqualTo(Integer value) {
            addCriterion("accpwd_accid <=", value, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidIn(List<Integer> values) {
            addCriterion("accpwd_accid in", values, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidNotIn(List<Integer> values) {
            addCriterion("accpwd_accid not in", values, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidBetween(Integer value1, Integer value2) {
            addCriterion("accpwd_accid between", value1, value2, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdAccidNotBetween(Integer value1, Integer value2) {
            addCriterion("accpwd_accid not between", value1, value2, "accpwdAccid");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdIsNull() {
            addCriterion("accpwd_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdIsNotNull() {
            addCriterion("accpwd_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdEqualTo(String value) {
            addCriterion("accpwd_pwd =", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdNotEqualTo(String value) {
            addCriterion("accpwd_pwd <>", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdGreaterThan(String value) {
            addCriterion("accpwd_pwd >", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdGreaterThanOrEqualTo(String value) {
            addCriterion("accpwd_pwd >=", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdLessThan(String value) {
            addCriterion("accpwd_pwd <", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdLessThanOrEqualTo(String value) {
            addCriterion("accpwd_pwd <=", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdLike(String value) {
            addCriterion("accpwd_pwd like", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdNotLike(String value) {
            addCriterion("accpwd_pwd not like", value, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdIn(List<String> values) {
            addCriterion("accpwd_pwd in", values, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdNotIn(List<String> values) {
            addCriterion("accpwd_pwd not in", values, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdBetween(String value1, String value2) {
            addCriterion("accpwd_pwd between", value1, value2, "accpwdPwd");
            return (Criteria) this;
        }

        public Criteria andAccpwdPwdNotBetween(String value1, String value2) {
            addCriterion("accpwd_pwd not between", value1, value2, "accpwdPwd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table acc_accpwd
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table acc_accpwd
     *
     * @mbggenerated
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