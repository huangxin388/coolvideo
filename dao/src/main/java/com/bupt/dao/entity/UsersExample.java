package com.bupt.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public UsersExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
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
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andUserIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("USER =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("USER <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("USER >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("USER <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("USER like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("USER not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("USER in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("USER not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsIsNull() {
            addCriterion("CURRENT_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsIsNotNull() {
            addCriterion("CURRENT_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS =", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsNotEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS <>", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsGreaterThan(Long value) {
            addCriterion("CURRENT_CONNECTIONS >", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS >=", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsLessThan(Long value) {
            addCriterion("CURRENT_CONNECTIONS <", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS <=", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsIn(List<Long> values) {
            addCriterion("CURRENT_CONNECTIONS in", values, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsNotIn(List<Long> values) {
            addCriterion("CURRENT_CONNECTIONS not in", values, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsBetween(Long value1, Long value2) {
            addCriterion("CURRENT_CONNECTIONS between", value1, value2, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_CONNECTIONS not between", value1, value2, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIsNull() {
            addCriterion("TOTAL_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIsNotNull() {
            addCriterion("TOTAL_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS =", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS <>", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsGreaterThan(Long value) {
            addCriterion("TOTAL_CONNECTIONS >", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS >=", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsLessThan(Long value) {
            addCriterion("TOTAL_CONNECTIONS <", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS <=", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIn(List<Long> values) {
            addCriterion("TOTAL_CONNECTIONS in", values, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotIn(List<Long> values) {
            addCriterion("TOTAL_CONNECTIONS not in", values, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsBetween(Long value1, Long value2) {
            addCriterion("TOTAL_CONNECTIONS between", value1, value2, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_CONNECTIONS not between", value1, value2, "totalConnections");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbg.generated do_not_delete_during_merge Sat Jan 04 21:38:44 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbg.generated Sat Jan 04 21:38:44 CST 2020
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