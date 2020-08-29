package com.ddzb.coppermall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UmsMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTradePassIsNull() {
            addCriterion("trade_pass is null");
            return (Criteria) this;
        }

        public Criteria andTradePassIsNotNull() {
            addCriterion("trade_pass is not null");
            return (Criteria) this;
        }

        public Criteria andTradePassEqualTo(String value) {
            addCriterion("trade_pass =", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassNotEqualTo(String value) {
            addCriterion("trade_pass <>", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassGreaterThan(String value) {
            addCriterion("trade_pass >", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassGreaterThanOrEqualTo(String value) {
            addCriterion("trade_pass >=", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassLessThan(String value) {
            addCriterion("trade_pass <", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassLessThanOrEqualTo(String value) {
            addCriterion("trade_pass <=", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassLike(String value) {
            addCriterion("trade_pass like", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassNotLike(String value) {
            addCriterion("trade_pass not like", value, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassIn(List<String> values) {
            addCriterion("trade_pass in", values, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassNotIn(List<String> values) {
            addCriterion("trade_pass not in", values, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassBetween(String value1, String value2) {
            addCriterion("trade_pass between", value1, value2, "tradePass");
            return (Criteria) this;
        }

        public Criteria andTradePassNotBetween(String value1, String value2) {
            addCriterion("trade_pass not between", value1, value2, "tradePass");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameIsNull() {
            addCriterion("wxnickname is null");
            return (Criteria) this;
        }

        public Criteria andWxnicknameIsNotNull() {
            addCriterion("wxnickname is not null");
            return (Criteria) this;
        }

        public Criteria andWxnicknameEqualTo(String value) {
            addCriterion("wxnickname =", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotEqualTo(String value) {
            addCriterion("wxnickname <>", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameGreaterThan(String value) {
            addCriterion("wxnickname >", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("wxnickname >=", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameLessThan(String value) {
            addCriterion("wxnickname <", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameLessThanOrEqualTo(String value) {
            addCriterion("wxnickname <=", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameLike(String value) {
            addCriterion("wxnickname like", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotLike(String value) {
            addCriterion("wxnickname not like", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameIn(List<String> values) {
            addCriterion("wxnickname in", values, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotIn(List<String> values) {
            addCriterion("wxnickname not in", values, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameBetween(String value1, String value2) {
            addCriterion("wxnickname between", value1, value2, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotBetween(String value1, String value2) {
            addCriterion("wxnickname not between", value1, value2, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andWxunionidIsNull() {
            addCriterion("wxunionid is null");
            return (Criteria) this;
        }

        public Criteria andWxunionidIsNotNull() {
            addCriterion("wxunionid is not null");
            return (Criteria) this;
        }

        public Criteria andWxunionidEqualTo(String value) {
            addCriterion("wxunionid =", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidNotEqualTo(String value) {
            addCriterion("wxunionid <>", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidGreaterThan(String value) {
            addCriterion("wxunionid >", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidGreaterThanOrEqualTo(String value) {
            addCriterion("wxunionid >=", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidLessThan(String value) {
            addCriterion("wxunionid <", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidLessThanOrEqualTo(String value) {
            addCriterion("wxunionid <=", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidLike(String value) {
            addCriterion("wxunionid like", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidNotLike(String value) {
            addCriterion("wxunionid not like", value, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidIn(List<String> values) {
            addCriterion("wxunionid in", values, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidNotIn(List<String> values) {
            addCriterion("wxunionid not in", values, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidBetween(String value1, String value2) {
            addCriterion("wxunionid between", value1, value2, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxunionidNotBetween(String value1, String value2) {
            addCriterion("wxunionid not between", value1, value2, "wxunionid");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNull() {
            addCriterion("wxopenid is null");
            return (Criteria) this;
        }

        public Criteria andWxopenidIsNotNull() {
            addCriterion("wxopenid is not null");
            return (Criteria) this;
        }

        public Criteria andWxopenidEqualTo(String value) {
            addCriterion("wxopenid =", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotEqualTo(String value) {
            addCriterion("wxopenid <>", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThan(String value) {
            addCriterion("wxopenid >", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidGreaterThanOrEqualTo(String value) {
            addCriterion("wxopenid >=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThan(String value) {
            addCriterion("wxopenid <", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLessThanOrEqualTo(String value) {
            addCriterion("wxopenid <=", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidLike(String value) {
            addCriterion("wxopenid like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotLike(String value) {
            addCriterion("wxopenid not like", value, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidIn(List<String> values) {
            addCriterion("wxopenid in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotIn(List<String> values) {
            addCriterion("wxopenid not in", values, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidBetween(String value1, String value2) {
            addCriterion("wxopenid between", value1, value2, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenidNotBetween(String value1, String value2) {
            addCriterion("wxopenid not between", value1, value2, "wxopenid");
            return (Criteria) this;
        }

        public Criteria andWxopenid2IsNull() {
            addCriterion("wxopenid2 is null");
            return (Criteria) this;
        }

        public Criteria andWxopenid2IsNotNull() {
            addCriterion("wxopenid2 is not null");
            return (Criteria) this;
        }

        public Criteria andWxopenid2EqualTo(String value) {
            addCriterion("wxopenid2 =", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2NotEqualTo(String value) {
            addCriterion("wxopenid2 <>", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2GreaterThan(String value) {
            addCriterion("wxopenid2 >", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2GreaterThanOrEqualTo(String value) {
            addCriterion("wxopenid2 >=", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2LessThan(String value) {
            addCriterion("wxopenid2 <", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2LessThanOrEqualTo(String value) {
            addCriterion("wxopenid2 <=", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2Like(String value) {
            addCriterion("wxopenid2 like", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2NotLike(String value) {
            addCriterion("wxopenid2 not like", value, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2In(List<String> values) {
            addCriterion("wxopenid2 in", values, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2NotIn(List<String> values) {
            addCriterion("wxopenid2 not in", values, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2Between(String value1, String value2) {
            addCriterion("wxopenid2 between", value1, value2, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid2NotBetween(String value1, String value2) {
            addCriterion("wxopenid2 not between", value1, value2, "wxopenid2");
            return (Criteria) this;
        }

        public Criteria andWxopenid3IsNull() {
            addCriterion("wxopenid3 is null");
            return (Criteria) this;
        }

        public Criteria andWxopenid3IsNotNull() {
            addCriterion("wxopenid3 is not null");
            return (Criteria) this;
        }

        public Criteria andWxopenid3EqualTo(String value) {
            addCriterion("wxopenid3 =", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3NotEqualTo(String value) {
            addCriterion("wxopenid3 <>", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3GreaterThan(String value) {
            addCriterion("wxopenid3 >", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3GreaterThanOrEqualTo(String value) {
            addCriterion("wxopenid3 >=", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3LessThan(String value) {
            addCriterion("wxopenid3 <", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3LessThanOrEqualTo(String value) {
            addCriterion("wxopenid3 <=", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3Like(String value) {
            addCriterion("wxopenid3 like", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3NotLike(String value) {
            addCriterion("wxopenid3 not like", value, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3In(List<String> values) {
            addCriterion("wxopenid3 in", values, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3NotIn(List<String> values) {
            addCriterion("wxopenid3 not in", values, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3Between(String value1, String value2) {
            addCriterion("wxopenid3 between", value1, value2, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andWxopenid3NotBetween(String value1, String value2) {
            addCriterion("wxopenid3 not between", value1, value2, "wxopenid3");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andWxiconIsNull() {
            addCriterion("wxicon is null");
            return (Criteria) this;
        }

        public Criteria andWxiconIsNotNull() {
            addCriterion("wxicon is not null");
            return (Criteria) this;
        }

        public Criteria andWxiconEqualTo(String value) {
            addCriterion("wxicon =", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconNotEqualTo(String value) {
            addCriterion("wxicon <>", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconGreaterThan(String value) {
            addCriterion("wxicon >", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconGreaterThanOrEqualTo(String value) {
            addCriterion("wxicon >=", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconLessThan(String value) {
            addCriterion("wxicon <", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconLessThanOrEqualTo(String value) {
            addCriterion("wxicon <=", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconLike(String value) {
            addCriterion("wxicon like", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconNotLike(String value) {
            addCriterion("wxicon not like", value, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconIn(List<String> values) {
            addCriterion("wxicon in", values, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconNotIn(List<String> values) {
            addCriterion("wxicon not in", values, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconBetween(String value1, String value2) {
            addCriterion("wxicon between", value1, value2, "wxicon");
            return (Criteria) this;
        }

        public Criteria andWxiconNotBetween(String value1, String value2) {
            addCriterion("wxicon not between", value1, value2, "wxicon");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureIsNull() {
            addCriterion("personalized_signature is null");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureIsNotNull() {
            addCriterion("personalized_signature is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureEqualTo(String value) {
            addCriterion("personalized_signature =", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotEqualTo(String value) {
            addCriterion("personalized_signature <>", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureGreaterThan(String value) {
            addCriterion("personalized_signature >", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("personalized_signature >=", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureLessThan(String value) {
            addCriterion("personalized_signature <", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureLessThanOrEqualTo(String value) {
            addCriterion("personalized_signature <=", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureLike(String value) {
            addCriterion("personalized_signature like", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotLike(String value) {
            addCriterion("personalized_signature not like", value, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureIn(List<String> values) {
            addCriterion("personalized_signature in", values, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotIn(List<String> values) {
            addCriterion("personalized_signature not in", values, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureBetween(String value1, String value2) {
            addCriterion("personalized_signature between", value1, value2, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andPersonalizedSignatureNotBetween(String value1, String value2) {
            addCriterion("personalized_signature not between", value1, value2, "personalizedSignature");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andIsauthIsNull() {
            addCriterion("isauth is null");
            return (Criteria) this;
        }

        public Criteria andIsauthIsNotNull() {
            addCriterion("isauth is not null");
            return (Criteria) this;
        }

        public Criteria andIsauthEqualTo(Integer value) {
            addCriterion("isauth =", value, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthNotEqualTo(Integer value) {
            addCriterion("isauth <>", value, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthGreaterThan(Integer value) {
            addCriterion("isauth >", value, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthGreaterThanOrEqualTo(Integer value) {
            addCriterion("isauth >=", value, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthLessThan(Integer value) {
            addCriterion("isauth <", value, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthLessThanOrEqualTo(Integer value) {
            addCriterion("isauth <=", value, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthIn(List<Integer> values) {
            addCriterion("isauth in", values, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthNotIn(List<Integer> values) {
            addCriterion("isauth not in", values, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthBetween(Integer value1, Integer value2) {
            addCriterion("isauth between", value1, value2, "isauth");
            return (Criteria) this;
        }

        public Criteria andIsauthNotBetween(Integer value1, Integer value2) {
            addCriterion("isauth not between", value1, value2, "isauth");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardno is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardno is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardno =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardno <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardno >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardno >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardno <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardno <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardno like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardno not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardno in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardno not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardno between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardno not between", value1, value2, "cardno");
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