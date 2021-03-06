package com.rs.ocp.domain.endity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameLoginsessionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    public GameLoginsessionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
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
     * This method corresponds to the database table game_loginsession
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
     * This method corresponds to the database table game_loginsession
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_loginsession
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
     * This class corresponds to the database table game_loginsession
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

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(Integer value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(Integer value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(Integer value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(Integer value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(Integer value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<Integer> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<Integer> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(Integer value1, Integer value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIsNull() {
            addCriterion("session_key is null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIsNotNull() {
            addCriterion("session_key is not null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyEqualTo(String value) {
            addCriterion("session_key =", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotEqualTo(String value) {
            addCriterion("session_key <>", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThan(String value) {
            addCriterion("session_key >", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("session_key >=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThan(String value) {
            addCriterion("session_key <", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThanOrEqualTo(String value) {
            addCriterion("session_key <=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLike(String value) {
            addCriterion("session_key like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotLike(String value) {
            addCriterion("session_key not like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIn(List<String> values) {
            addCriterion("session_key in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotIn(List<String> values) {
            addCriterion("session_key not in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyBetween(String value1, String value2) {
            addCriterion("session_key between", value1, value2, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotBetween(String value1, String value2) {
            addCriterion("session_key not between", value1, value2, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionPidIsNull() {
            addCriterion("session_pid is null");
            return (Criteria) this;
        }

        public Criteria andSessionPidIsNotNull() {
            addCriterion("session_pid is not null");
            return (Criteria) this;
        }

        public Criteria andSessionPidEqualTo(Integer value) {
            addCriterion("session_pid =", value, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidNotEqualTo(Integer value) {
            addCriterion("session_pid <>", value, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidGreaterThan(Integer value) {
            addCriterion("session_pid >", value, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_pid >=", value, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidLessThan(Integer value) {
            addCriterion("session_pid <", value, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidLessThanOrEqualTo(Integer value) {
            addCriterion("session_pid <=", value, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidIn(List<Integer> values) {
            addCriterion("session_pid in", values, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidNotIn(List<Integer> values) {
            addCriterion("session_pid not in", values, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidBetween(Integer value1, Integer value2) {
            addCriterion("session_pid between", value1, value2, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionPidNotBetween(Integer value1, Integer value2) {
            addCriterion("session_pid not between", value1, value2, "sessionPid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridIsNull() {
            addCriterion("session_serverid is null");
            return (Criteria) this;
        }

        public Criteria andSessionServeridIsNotNull() {
            addCriterion("session_serverid is not null");
            return (Criteria) this;
        }

        public Criteria andSessionServeridEqualTo(Integer value) {
            addCriterion("session_serverid =", value, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridNotEqualTo(Integer value) {
            addCriterion("session_serverid <>", value, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridGreaterThan(Integer value) {
            addCriterion("session_serverid >", value, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_serverid >=", value, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridLessThan(Integer value) {
            addCriterion("session_serverid <", value, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridLessThanOrEqualTo(Integer value) {
            addCriterion("session_serverid <=", value, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridIn(List<Integer> values) {
            addCriterion("session_serverid in", values, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridNotIn(List<Integer> values) {
            addCriterion("session_serverid not in", values, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridBetween(Integer value1, Integer value2) {
            addCriterion("session_serverid between", value1, value2, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionServeridNotBetween(Integer value1, Integer value2) {
            addCriterion("session_serverid not between", value1, value2, "sessionServerid");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeIsNull() {
            addCriterion("session_awake is null");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeIsNotNull() {
            addCriterion("session_awake is not null");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeEqualTo(Integer value) {
            addCriterion("session_awake =", value, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeNotEqualTo(Integer value) {
            addCriterion("session_awake <>", value, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeGreaterThan(Integer value) {
            addCriterion("session_awake >", value, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_awake >=", value, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeLessThan(Integer value) {
            addCriterion("session_awake <", value, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeLessThanOrEqualTo(Integer value) {
            addCriterion("session_awake <=", value, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeIn(List<Integer> values) {
            addCriterion("session_awake in", values, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeNotIn(List<Integer> values) {
            addCriterion("session_awake not in", values, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeBetween(Integer value1, Integer value2) {
            addCriterion("session_awake between", value1, value2, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionAwakeNotBetween(Integer value1, Integer value2) {
            addCriterion("session_awake not between", value1, value2, "sessionAwake");
            return (Criteria) this;
        }

        public Criteria andSessionTimeIsNull() {
            addCriterion("session_time is null");
            return (Criteria) this;
        }

        public Criteria andSessionTimeIsNotNull() {
            addCriterion("session_time is not null");
            return (Criteria) this;
        }

        public Criteria andSessionTimeEqualTo(Date value) {
            addCriterion("session_time =", value, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeNotEqualTo(Date value) {
            addCriterion("session_time <>", value, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeGreaterThan(Date value) {
            addCriterion("session_time >", value, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("session_time >=", value, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeLessThan(Date value) {
            addCriterion("session_time <", value, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeLessThanOrEqualTo(Date value) {
            addCriterion("session_time <=", value, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeIn(List<Date> values) {
            addCriterion("session_time in", values, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeNotIn(List<Date> values) {
            addCriterion("session_time not in", values, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeBetween(Date value1, Date value2) {
            addCriterion("session_time between", value1, value2, "sessionTime");
            return (Criteria) this;
        }

        public Criteria andSessionTimeNotBetween(Date value1, Date value2) {
            addCriterion("session_time not between", value1, value2, "sessionTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table game_loginsession
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
     * This class corresponds to the database table game_loginsession
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