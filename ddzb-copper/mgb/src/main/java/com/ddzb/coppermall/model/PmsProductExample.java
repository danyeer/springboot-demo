package com.ddzb.coppermall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameIsNull() {
            addCriterion("user_enterprisename is null");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameIsNotNull() {
            addCriterion("user_enterprisename is not null");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameEqualTo(String value) {
            addCriterion("user_enterprisename =", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotEqualTo(String value) {
            addCriterion("user_enterprisename <>", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameGreaterThan(String value) {
            addCriterion("user_enterprisename >", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("user_enterprisename >=", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameLessThan(String value) {
            addCriterion("user_enterprisename <", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("user_enterprisename <=", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameLike(String value) {
            addCriterion("user_enterprisename like", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotLike(String value) {
            addCriterion("user_enterprisename not like", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameIn(List<String> values) {
            addCriterion("user_enterprisename in", values, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotIn(List<String> values) {
            addCriterion("user_enterprisename not in", values, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameBetween(String value1, String value2) {
            addCriterion("user_enterprisename between", value1, value2, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("user_enterprisename not between", value1, value2, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(Long value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(Long value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(Long value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(Long value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<Long> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<Long> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(Long value1, Long value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIsNull() {
            addCriterion("product_category_name is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIsNotNull() {
            addCriterion("product_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameEqualTo(String value) {
            addCriterion("product_category_name =", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotEqualTo(String value) {
            addCriterion("product_category_name <>", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameGreaterThan(String value) {
            addCriterion("product_category_name >", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_category_name >=", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLessThan(String value) {
            addCriterion("product_category_name <", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("product_category_name <=", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameLike(String value) {
            addCriterion("product_category_name like", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotLike(String value) {
            addCriterion("product_category_name not like", value, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameIn(List<String> values) {
            addCriterion("product_category_name in", values, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotIn(List<String> values) {
            addCriterion("product_category_name not in", values, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameBetween(String value1, String value2) {
            addCriterion("product_category_name between", value1, value2, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNameNotBetween(String value1, String value2) {
            addCriterion("product_category_name not between", value1, value2, "productCategoryName");
            return (Criteria) this;
        }

        public Criteria andTitlesIsNull() {
            addCriterion("titles is null");
            return (Criteria) this;
        }

        public Criteria andTitlesIsNotNull() {
            addCriterion("titles is not null");
            return (Criteria) this;
        }

        public Criteria andTitlesEqualTo(String value) {
            addCriterion("titles =", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesNotEqualTo(String value) {
            addCriterion("titles <>", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesGreaterThan(String value) {
            addCriterion("titles >", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesGreaterThanOrEqualTo(String value) {
            addCriterion("titles >=", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesLessThan(String value) {
            addCriterion("titles <", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesLessThanOrEqualTo(String value) {
            addCriterion("titles <=", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesLike(String value) {
            addCriterion("titles like", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesNotLike(String value) {
            addCriterion("titles not like", value, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesIn(List<String> values) {
            addCriterion("titles in", values, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesNotIn(List<String> values) {
            addCriterion("titles not in", values, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesBetween(String value1, String value2) {
            addCriterion("titles between", value1, value2, "titles");
            return (Criteria) this;
        }

        public Criteria andTitlesNotBetween(String value1, String value2) {
            addCriterion("titles not between", value1, value2, "titles");
            return (Criteria) this;
        }

        public Criteria andPicThumIsNull() {
            addCriterion("pic_thum is null");
            return (Criteria) this;
        }

        public Criteria andPicThumIsNotNull() {
            addCriterion("pic_thum is not null");
            return (Criteria) this;
        }

        public Criteria andPicThumEqualTo(String value) {
            addCriterion("pic_thum =", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumNotEqualTo(String value) {
            addCriterion("pic_thum <>", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumGreaterThan(String value) {
            addCriterion("pic_thum >", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumGreaterThanOrEqualTo(String value) {
            addCriterion("pic_thum >=", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumLessThan(String value) {
            addCriterion("pic_thum <", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumLessThanOrEqualTo(String value) {
            addCriterion("pic_thum <=", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumLike(String value) {
            addCriterion("pic_thum like", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumNotLike(String value) {
            addCriterion("pic_thum not like", value, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumIn(List<String> values) {
            addCriterion("pic_thum in", values, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumNotIn(List<String> values) {
            addCriterion("pic_thum not in", values, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumBetween(String value1, String value2) {
            addCriterion("pic_thum between", value1, value2, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicThumNotBetween(String value1, String value2) {
            addCriterion("pic_thum not between", value1, value2, "picThum");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProductSnEqualTo(String value) {
            addCriterion("product_sn =", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThan(String value) {
            addCriterion("product_sn >", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThan(String value) {
            addCriterion("product_sn <", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLike(String value) {
            addCriterion("product_sn like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotLike(String value) {
            addCriterion("product_sn not like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIn(List<String> values) {
            addCriterion("product_sn in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Integer value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(Integer value) {
            addCriterion("publish_status =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(Integer value) {
            addCriterion("publish_status <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(Integer value) {
            addCriterion("publish_status >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_status >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(Integer value) {
            addCriterion("publish_status <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("publish_status <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<Integer> values) {
            addCriterion("publish_status in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<Integer> values) {
            addCriterion("publish_status not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(Integer value1, Integer value2) {
            addCriterion("publish_status between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_status not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Integer value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Integer value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Integer value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Integer value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Integer> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Integer> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNull() {
            addCriterion("transaction_status is null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNotNull() {
            addCriterion("transaction_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusEqualTo(Integer value) {
            addCriterion("transaction_status =", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotEqualTo(Integer value) {
            addCriterion("transaction_status <>", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThan(Integer value) {
            addCriterion("transaction_status >", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_status >=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThan(Integer value) {
            addCriterion("transaction_status <", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_status <=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIn(List<Integer> values) {
            addCriterion("transaction_status in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotIn(List<Integer> values) {
            addCriterion("transaction_status not in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusBetween(Integer value1, Integer value2) {
            addCriterion("transaction_status between", value1, value2, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_status not between", value1, value2, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeIsNull() {
            addCriterion("dictionary1_code is null");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeIsNotNull() {
            addCriterion("dictionary1_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeEqualTo(String value) {
            addCriterion("dictionary1_code =", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeNotEqualTo(String value) {
            addCriterion("dictionary1_code <>", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeGreaterThan(String value) {
            addCriterion("dictionary1_code >", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary1_code >=", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeLessThan(String value) {
            addCriterion("dictionary1_code <", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeLessThanOrEqualTo(String value) {
            addCriterion("dictionary1_code <=", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeLike(String value) {
            addCriterion("dictionary1_code like", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeNotLike(String value) {
            addCriterion("dictionary1_code not like", value, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeIn(List<String> values) {
            addCriterion("dictionary1_code in", values, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeNotIn(List<String> values) {
            addCriterion("dictionary1_code not in", values, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeBetween(String value1, String value2) {
            addCriterion("dictionary1_code between", value1, value2, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1CodeNotBetween(String value1, String value2) {
            addCriterion("dictionary1_code not between", value1, value2, "dictionary1Code");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameIsNull() {
            addCriterion("dictionary1_name is null");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameIsNotNull() {
            addCriterion("dictionary1_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameEqualTo(String value) {
            addCriterion("dictionary1_name =", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameNotEqualTo(String value) {
            addCriterion("dictionary1_name <>", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameGreaterThan(String value) {
            addCriterion("dictionary1_name >", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary1_name >=", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameLessThan(String value) {
            addCriterion("dictionary1_name <", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameLessThanOrEqualTo(String value) {
            addCriterion("dictionary1_name <=", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameLike(String value) {
            addCriterion("dictionary1_name like", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameNotLike(String value) {
            addCriterion("dictionary1_name not like", value, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameIn(List<String> values) {
            addCriterion("dictionary1_name in", values, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameNotIn(List<String> values) {
            addCriterion("dictionary1_name not in", values, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameBetween(String value1, String value2) {
            addCriterion("dictionary1_name between", value1, value2, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary1NameNotBetween(String value1, String value2) {
            addCriterion("dictionary1_name not between", value1, value2, "dictionary1Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeIsNull() {
            addCriterion("dictionary2_code is null");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeIsNotNull() {
            addCriterion("dictionary2_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeEqualTo(String value) {
            addCriterion("dictionary2_code =", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeNotEqualTo(String value) {
            addCriterion("dictionary2_code <>", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeGreaterThan(String value) {
            addCriterion("dictionary2_code >", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary2_code >=", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeLessThan(String value) {
            addCriterion("dictionary2_code <", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeLessThanOrEqualTo(String value) {
            addCriterion("dictionary2_code <=", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeLike(String value) {
            addCriterion("dictionary2_code like", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeNotLike(String value) {
            addCriterion("dictionary2_code not like", value, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeIn(List<String> values) {
            addCriterion("dictionary2_code in", values, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeNotIn(List<String> values) {
            addCriterion("dictionary2_code not in", values, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeBetween(String value1, String value2) {
            addCriterion("dictionary2_code between", value1, value2, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2CodeNotBetween(String value1, String value2) {
            addCriterion("dictionary2_code not between", value1, value2, "dictionary2Code");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameIsNull() {
            addCriterion("dictionary2_name is null");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameIsNotNull() {
            addCriterion("dictionary2_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameEqualTo(String value) {
            addCriterion("dictionary2_name =", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameNotEqualTo(String value) {
            addCriterion("dictionary2_name <>", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameGreaterThan(String value) {
            addCriterion("dictionary2_name >", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary2_name >=", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameLessThan(String value) {
            addCriterion("dictionary2_name <", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameLessThanOrEqualTo(String value) {
            addCriterion("dictionary2_name <=", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameLike(String value) {
            addCriterion("dictionary2_name like", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameNotLike(String value) {
            addCriterion("dictionary2_name not like", value, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameIn(List<String> values) {
            addCriterion("dictionary2_name in", values, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameNotIn(List<String> values) {
            addCriterion("dictionary2_name not in", values, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameBetween(String value1, String value2) {
            addCriterion("dictionary2_name between", value1, value2, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary2NameNotBetween(String value1, String value2) {
            addCriterion("dictionary2_name not between", value1, value2, "dictionary2Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeIsNull() {
            addCriterion("dictionary3_code is null");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeIsNotNull() {
            addCriterion("dictionary3_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeEqualTo(String value) {
            addCriterion("dictionary3_code =", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeNotEqualTo(String value) {
            addCriterion("dictionary3_code <>", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeGreaterThan(String value) {
            addCriterion("dictionary3_code >", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary3_code >=", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeLessThan(String value) {
            addCriterion("dictionary3_code <", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeLessThanOrEqualTo(String value) {
            addCriterion("dictionary3_code <=", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeLike(String value) {
            addCriterion("dictionary3_code like", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeNotLike(String value) {
            addCriterion("dictionary3_code not like", value, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeIn(List<String> values) {
            addCriterion("dictionary3_code in", values, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeNotIn(List<String> values) {
            addCriterion("dictionary3_code not in", values, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeBetween(String value1, String value2) {
            addCriterion("dictionary3_code between", value1, value2, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3CodeNotBetween(String value1, String value2) {
            addCriterion("dictionary3_code not between", value1, value2, "dictionary3Code");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameIsNull() {
            addCriterion("dictionary3_name is null");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameIsNotNull() {
            addCriterion("dictionary3_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameEqualTo(String value) {
            addCriterion("dictionary3_name =", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameNotEqualTo(String value) {
            addCriterion("dictionary3_name <>", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameGreaterThan(String value) {
            addCriterion("dictionary3_name >", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary3_name >=", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameLessThan(String value) {
            addCriterion("dictionary3_name <", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameLessThanOrEqualTo(String value) {
            addCriterion("dictionary3_name <=", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameLike(String value) {
            addCriterion("dictionary3_name like", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameNotLike(String value) {
            addCriterion("dictionary3_name not like", value, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameIn(List<String> values) {
            addCriterion("dictionary3_name in", values, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameNotIn(List<String> values) {
            addCriterion("dictionary3_name not in", values, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameBetween(String value1, String value2) {
            addCriterion("dictionary3_name between", value1, value2, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andDictionary3NameNotBetween(String value1, String value2) {
            addCriterion("dictionary3_name not between", value1, value2, "dictionary3Name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(BigDecimal value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(BigDecimal value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(BigDecimal value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(BigDecimal value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<BigDecimal> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<BigDecimal> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andLowStockIsNull() {
            addCriterion("low_stock is null");
            return (Criteria) this;
        }

        public Criteria andLowStockIsNotNull() {
            addCriterion("low_stock is not null");
            return (Criteria) this;
        }

        public Criteria andLowStockEqualTo(BigDecimal value) {
            addCriterion("low_stock =", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotEqualTo(BigDecimal value) {
            addCriterion("low_stock <>", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockGreaterThan(BigDecimal value) {
            addCriterion("low_stock >", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("low_stock >=", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockLessThan(BigDecimal value) {
            addCriterion("low_stock <", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("low_stock <=", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockIn(List<BigDecimal> values) {
            addCriterion("low_stock in", values, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotIn(List<BigDecimal> values) {
            addCriterion("low_stock not in", values, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_stock between", value1, value2, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_stock not between", value1, value2, "lowStock");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andStartingStockIsNull() {
            addCriterion("starting_stock is null");
            return (Criteria) this;
        }

        public Criteria andStartingStockIsNotNull() {
            addCriterion("starting_stock is not null");
            return (Criteria) this;
        }

        public Criteria andStartingStockEqualTo(BigDecimal value) {
            addCriterion("starting_stock =", value, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockNotEqualTo(BigDecimal value) {
            addCriterion("starting_stock <>", value, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockGreaterThan(BigDecimal value) {
            addCriterion("starting_stock >", value, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("starting_stock >=", value, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockLessThan(BigDecimal value) {
            addCriterion("starting_stock <", value, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("starting_stock <=", value, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockIn(List<BigDecimal> values) {
            addCriterion("starting_stock in", values, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockNotIn(List<BigDecimal> values) {
            addCriterion("starting_stock not in", values, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starting_stock between", value1, value2, "startingStock");
            return (Criteria) this;
        }

        public Criteria andStartingStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("starting_stock not between", value1, value2, "startingStock");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("delivery_address =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("delivery_address <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("delivery_address >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_address >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("delivery_address <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("delivery_address <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("delivery_address like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("delivery_address not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("delivery_address in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("delivery_address not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("delivery_address between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("delivery_address not between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidIsNull() {
            addCriterion("delivery_pid is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidIsNotNull() {
            addCriterion("delivery_pid is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidEqualTo(Long value) {
            addCriterion("delivery_pid =", value, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidNotEqualTo(Long value) {
            addCriterion("delivery_pid <>", value, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidGreaterThan(Long value) {
            addCriterion("delivery_pid >", value, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidGreaterThanOrEqualTo(Long value) {
            addCriterion("delivery_pid >=", value, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidLessThan(Long value) {
            addCriterion("delivery_pid <", value, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidLessThanOrEqualTo(Long value) {
            addCriterion("delivery_pid <=", value, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidIn(List<Long> values) {
            addCriterion("delivery_pid in", values, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidNotIn(List<Long> values) {
            addCriterion("delivery_pid not in", values, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidBetween(Long value1, Long value2) {
            addCriterion("delivery_pid between", value1, value2, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPidNotBetween(Long value1, Long value2) {
            addCriterion("delivery_pid not between", value1, value2, "deliveryPid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidIsNull() {
            addCriterion("delivery_cid is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidIsNotNull() {
            addCriterion("delivery_cid is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidEqualTo(Long value) {
            addCriterion("delivery_cid =", value, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidNotEqualTo(Long value) {
            addCriterion("delivery_cid <>", value, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidGreaterThan(Long value) {
            addCriterion("delivery_cid >", value, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidGreaterThanOrEqualTo(Long value) {
            addCriterion("delivery_cid >=", value, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidLessThan(Long value) {
            addCriterion("delivery_cid <", value, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidLessThanOrEqualTo(Long value) {
            addCriterion("delivery_cid <=", value, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidIn(List<Long> values) {
            addCriterion("delivery_cid in", values, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidNotIn(List<Long> values) {
            addCriterion("delivery_cid not in", values, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidBetween(Long value1, Long value2) {
            addCriterion("delivery_cid between", value1, value2, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryCidNotBetween(Long value1, Long value2) {
            addCriterion("delivery_cid not between", value1, value2, "deliveryCid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidIsNull() {
            addCriterion("delivery_oid is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidIsNotNull() {
            addCriterion("delivery_oid is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidEqualTo(Long value) {
            addCriterion("delivery_oid =", value, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidNotEqualTo(Long value) {
            addCriterion("delivery_oid <>", value, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidGreaterThan(Long value) {
            addCriterion("delivery_oid >", value, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidGreaterThanOrEqualTo(Long value) {
            addCriterion("delivery_oid >=", value, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidLessThan(Long value) {
            addCriterion("delivery_oid <", value, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidLessThanOrEqualTo(Long value) {
            addCriterion("delivery_oid <=", value, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidIn(List<Long> values) {
            addCriterion("delivery_oid in", values, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidNotIn(List<Long> values) {
            addCriterion("delivery_oid not in", values, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidBetween(Long value1, Long value2) {
            addCriterion("delivery_oid between", value1, value2, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryOidNotBetween(Long value1, Long value2) {
            addCriterion("delivery_oid not between", value1, value2, "deliveryOid");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameIsNull() {
            addCriterion("delivery_pname is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameIsNotNull() {
            addCriterion("delivery_pname is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameEqualTo(String value) {
            addCriterion("delivery_pname =", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameNotEqualTo(String value) {
            addCriterion("delivery_pname <>", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameGreaterThan(String value) {
            addCriterion("delivery_pname >", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_pname >=", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameLessThan(String value) {
            addCriterion("delivery_pname <", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameLessThanOrEqualTo(String value) {
            addCriterion("delivery_pname <=", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameLike(String value) {
            addCriterion("delivery_pname like", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameNotLike(String value) {
            addCriterion("delivery_pname not like", value, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameIn(List<String> values) {
            addCriterion("delivery_pname in", values, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameNotIn(List<String> values) {
            addCriterion("delivery_pname not in", values, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameBetween(String value1, String value2) {
            addCriterion("delivery_pname between", value1, value2, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryPnameNotBetween(String value1, String value2) {
            addCriterion("delivery_pname not between", value1, value2, "deliveryPname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameIsNull() {
            addCriterion("delivery_cname is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameIsNotNull() {
            addCriterion("delivery_cname is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameEqualTo(String value) {
            addCriterion("delivery_cname =", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameNotEqualTo(String value) {
            addCriterion("delivery_cname <>", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameGreaterThan(String value) {
            addCriterion("delivery_cname >", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_cname >=", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameLessThan(String value) {
            addCriterion("delivery_cname <", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameLessThanOrEqualTo(String value) {
            addCriterion("delivery_cname <=", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameLike(String value) {
            addCriterion("delivery_cname like", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameNotLike(String value) {
            addCriterion("delivery_cname not like", value, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameIn(List<String> values) {
            addCriterion("delivery_cname in", values, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameNotIn(List<String> values) {
            addCriterion("delivery_cname not in", values, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameBetween(String value1, String value2) {
            addCriterion("delivery_cname between", value1, value2, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryCnameNotBetween(String value1, String value2) {
            addCriterion("delivery_cname not between", value1, value2, "deliveryCname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameIsNull() {
            addCriterion("delivery_oname is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameIsNotNull() {
            addCriterion("delivery_oname is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameEqualTo(String value) {
            addCriterion("delivery_oname =", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameNotEqualTo(String value) {
            addCriterion("delivery_oname <>", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameGreaterThan(String value) {
            addCriterion("delivery_oname >", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_oname >=", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameLessThan(String value) {
            addCriterion("delivery_oname <", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameLessThanOrEqualTo(String value) {
            addCriterion("delivery_oname <=", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameLike(String value) {
            addCriterion("delivery_oname like", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameNotLike(String value) {
            addCriterion("delivery_oname not like", value, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameIn(List<String> values) {
            addCriterion("delivery_oname in", values, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameNotIn(List<String> values) {
            addCriterion("delivery_oname not in", values, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameBetween(String value1, String value2) {
            addCriterion("delivery_oname between", value1, value2, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryOnameNotBetween(String value1, String value2) {
            addCriterion("delivery_oname not between", value1, value2, "deliveryOname");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(Integer value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Integer value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Integer value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Integer value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Integer> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Integer> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDiameterIsNull() {
            addCriterion("diameter is null");
            return (Criteria) this;
        }

        public Criteria andDiameterIsNotNull() {
            addCriterion("diameter is not null");
            return (Criteria) this;
        }

        public Criteria andDiameterEqualTo(BigDecimal value) {
            addCriterion("diameter =", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotEqualTo(BigDecimal value) {
            addCriterion("diameter <>", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThan(BigDecimal value) {
            addCriterion("diameter >", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("diameter >=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThan(BigDecimal value) {
            addCriterion("diameter <", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("diameter <=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterIn(List<BigDecimal> values) {
            addCriterion("diameter in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotIn(List<BigDecimal> values) {
            addCriterion("diameter not in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("diameter between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("diameter not between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andWallsIsNull() {
            addCriterion("walls is null");
            return (Criteria) this;
        }

        public Criteria andWallsIsNotNull() {
            addCriterion("walls is not null");
            return (Criteria) this;
        }

        public Criteria andWallsEqualTo(BigDecimal value) {
            addCriterion("walls =", value, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsNotEqualTo(BigDecimal value) {
            addCriterion("walls <>", value, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsGreaterThan(BigDecimal value) {
            addCriterion("walls >", value, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("walls >=", value, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsLessThan(BigDecimal value) {
            addCriterion("walls <", value, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("walls <=", value, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsIn(List<BigDecimal> values) {
            addCriterion("walls in", values, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsNotIn(List<BigDecimal> values) {
            addCriterion("walls not in", values, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("walls between", value1, value2, "walls");
            return (Criteria) this;
        }

        public Criteria andWallsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("walls not between", value1, value2, "walls");
            return (Criteria) this;
        }

        public Criteria andWidthsIsNull() {
            addCriterion("widths is null");
            return (Criteria) this;
        }

        public Criteria andWidthsIsNotNull() {
            addCriterion("widths is not null");
            return (Criteria) this;
        }

        public Criteria andWidthsEqualTo(BigDecimal value) {
            addCriterion("widths =", value, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsNotEqualTo(BigDecimal value) {
            addCriterion("widths <>", value, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsGreaterThan(BigDecimal value) {
            addCriterion("widths >", value, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("widths >=", value, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsLessThan(BigDecimal value) {
            addCriterion("widths <", value, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("widths <=", value, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsIn(List<BigDecimal> values) {
            addCriterion("widths in", values, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsNotIn(List<BigDecimal> values) {
            addCriterion("widths not in", values, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("widths between", value1, value2, "widths");
            return (Criteria) this;
        }

        public Criteria andWidthsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("widths not between", value1, value2, "widths");
            return (Criteria) this;
        }

        public Criteria andLengthsIsNull() {
            addCriterion("lengths is null");
            return (Criteria) this;
        }

        public Criteria andLengthsIsNotNull() {
            addCriterion("lengths is not null");
            return (Criteria) this;
        }

        public Criteria andLengthsEqualTo(BigDecimal value) {
            addCriterion("lengths =", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsNotEqualTo(BigDecimal value) {
            addCriterion("lengths <>", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsGreaterThan(BigDecimal value) {
            addCriterion("lengths >", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lengths >=", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsLessThan(BigDecimal value) {
            addCriterion("lengths <", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lengths <=", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsIn(List<BigDecimal> values) {
            addCriterion("lengths in", values, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsNotIn(List<BigDecimal> values) {
            addCriterion("lengths not in", values, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lengths between", value1, value2, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lengths not between", value1, value2, "lengths");
            return (Criteria) this;
        }

        public Criteria andSigningTypeIsNull() {
            addCriterion("signing_type is null");
            return (Criteria) this;
        }

        public Criteria andSigningTypeIsNotNull() {
            addCriterion("signing_type is not null");
            return (Criteria) this;
        }

        public Criteria andSigningTypeEqualTo(Integer value) {
            addCriterion("signing_type =", value, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeNotEqualTo(Integer value) {
            addCriterion("signing_type <>", value, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeGreaterThan(Integer value) {
            addCriterion("signing_type >", value, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("signing_type >=", value, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeLessThan(Integer value) {
            addCriterion("signing_type <", value, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeLessThanOrEqualTo(Integer value) {
            addCriterion("signing_type <=", value, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeIn(List<Integer> values) {
            addCriterion("signing_type in", values, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeNotIn(List<Integer> values) {
            addCriterion("signing_type not in", values, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeBetween(Integer value1, Integer value2) {
            addCriterion("signing_type between", value1, value2, "signingType");
            return (Criteria) this;
        }

        public Criteria andSigningTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("signing_type not between", value1, value2, "signingType");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentIsNull() {
            addCriterion("deposit_payment is null");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentIsNotNull() {
            addCriterion("deposit_payment is not null");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentEqualTo(Integer value) {
            addCriterion("deposit_payment =", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentNotEqualTo(Integer value) {
            addCriterion("deposit_payment <>", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentGreaterThan(Integer value) {
            addCriterion("deposit_payment >", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_payment >=", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentLessThan(Integer value) {
            addCriterion("deposit_payment <", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_payment <=", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentIn(List<Integer> values) {
            addCriterion("deposit_payment in", values, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentNotIn(List<Integer> values) {
            addCriterion("deposit_payment not in", values, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentBetween(Integer value1, Integer value2) {
            addCriterion("deposit_payment between", value1, value2, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_payment not between", value1, value2, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andFinalDaysIsNull() {
            addCriterion("final_days is null");
            return (Criteria) this;
        }

        public Criteria andFinalDaysIsNotNull() {
            addCriterion("final_days is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDaysEqualTo(Integer value) {
            addCriterion("final_days =", value, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysNotEqualTo(Integer value) {
            addCriterion("final_days <>", value, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysGreaterThan(Integer value) {
            addCriterion("final_days >", value, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_days >=", value, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysLessThan(Integer value) {
            addCriterion("final_days <", value, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysLessThanOrEqualTo(Integer value) {
            addCriterion("final_days <=", value, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysIn(List<Integer> values) {
            addCriterion("final_days in", values, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysNotIn(List<Integer> values) {
            addCriterion("final_days not in", values, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysBetween(Integer value1, Integer value2) {
            addCriterion("final_days between", value1, value2, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("final_days not between", value1, value2, "finalDays");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentIsNull() {
            addCriterion("final_payment is null");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentIsNotNull() {
            addCriterion("final_payment is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentEqualTo(Integer value) {
            addCriterion("final_payment =", value, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentNotEqualTo(Integer value) {
            addCriterion("final_payment <>", value, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentGreaterThan(Integer value) {
            addCriterion("final_payment >", value, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_payment >=", value, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentLessThan(Integer value) {
            addCriterion("final_payment <", value, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("final_payment <=", value, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentIn(List<Integer> values) {
            addCriterion("final_payment in", values, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentNotIn(List<Integer> values) {
            addCriterion("final_payment not in", values, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentBetween(Integer value1, Integer value2) {
            addCriterion("final_payment between", value1, value2, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andFinalPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("final_payment not between", value1, value2, "finalPayment");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysIsNull() {
            addCriterion("delivery_days is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysIsNotNull() {
            addCriterion("delivery_days is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysEqualTo(Integer value) {
            addCriterion("delivery_days =", value, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysNotEqualTo(Integer value) {
            addCriterion("delivery_days <>", value, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysGreaterThan(Integer value) {
            addCriterion("delivery_days >", value, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_days >=", value, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysLessThan(Integer value) {
            addCriterion("delivery_days <", value, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_days <=", value, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysIn(List<Integer> values) {
            addCriterion("delivery_days in", values, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysNotIn(List<Integer> values) {
            addCriterion("delivery_days not in", values, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysBetween(Integer value1, Integer value2) {
            addCriterion("delivery_days between", value1, value2, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_days not between", value1, value2, "deliveryDays");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeIsNull() {
            addCriterion("delivery_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeIsNotNull() {
            addCriterion("delivery_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeEqualTo(Date value) {
            addCriterion("delivery_start_time =", value, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeNotEqualTo(Date value) {
            addCriterion("delivery_start_time <>", value, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeGreaterThan(Date value) {
            addCriterion("delivery_start_time >", value, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_start_time >=", value, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeLessThan(Date value) {
            addCriterion("delivery_start_time <", value, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_start_time <=", value, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeIn(List<Date> values) {
            addCriterion("delivery_start_time in", values, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeNotIn(List<Date> values) {
            addCriterion("delivery_start_time not in", values, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_start_time between", value1, value2, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_start_time not between", value1, value2, "deliveryStartTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeIsNull() {
            addCriterion("delivery_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeIsNotNull() {
            addCriterion("delivery_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeEqualTo(Date value) {
            addCriterion("delivery_end_time =", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeNotEqualTo(Date value) {
            addCriterion("delivery_end_time <>", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeGreaterThan(Date value) {
            addCriterion("delivery_end_time >", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_end_time >=", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeLessThan(Date value) {
            addCriterion("delivery_end_time <", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_end_time <=", value, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeIn(List<Date> values) {
            addCriterion("delivery_end_time in", values, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeNotIn(List<Date> values) {
            addCriterion("delivery_end_time not in", values, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_end_time between", value1, value2, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_end_time not between", value1, value2, "deliveryEndTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Integer value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Integer value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Integer value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Integer value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Integer> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Integer> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIsNull() {
            addCriterion("contract_template is null");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIsNotNull() {
            addCriterion("contract_template is not null");
            return (Criteria) this;
        }

        public Criteria andContractTemplateEqualTo(String value) {
            addCriterion("contract_template =", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNotEqualTo(String value) {
            addCriterion("contract_template <>", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateGreaterThan(String value) {
            addCriterion("contract_template >", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("contract_template >=", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateLessThan(String value) {
            addCriterion("contract_template <", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateLessThanOrEqualTo(String value) {
            addCriterion("contract_template <=", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateLike(String value) {
            addCriterion("contract_template like", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNotLike(String value) {
            addCriterion("contract_template not like", value, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIn(List<String> values) {
            addCriterion("contract_template in", values, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNotIn(List<String> values) {
            addCriterion("contract_template not in", values, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateBetween(String value1, String value2) {
            addCriterion("contract_template between", value1, value2, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNotBetween(String value1, String value2) {
            addCriterion("contract_template not between", value1, value2, "contractTemplate");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNull() {
            addCriterion("detail_title is null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIsNotNull() {
            addCriterion("detail_title is not null");
            return (Criteria) this;
        }

        public Criteria andDetailTitleEqualTo(String value) {
            addCriterion("detail_title =", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotEqualTo(String value) {
            addCriterion("detail_title <>", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThan(String value) {
            addCriterion("detail_title >", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("detail_title >=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThan(String value) {
            addCriterion("detail_title <", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLessThanOrEqualTo(String value) {
            addCriterion("detail_title <=", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleLike(String value) {
            addCriterion("detail_title like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotLike(String value) {
            addCriterion("detail_title not like", value, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleIn(List<String> values) {
            addCriterion("detail_title in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotIn(List<String> values) {
            addCriterion("detail_title not in", values, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleBetween(String value1, String value2) {
            addCriterion("detail_title between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andDetailTitleNotBetween(String value1, String value2) {
            addCriterion("detail_title not between", value1, value2, "detailTitle");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeIsNull() {
            addCriterion("auction_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeIsNotNull() {
            addCriterion("auction_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeEqualTo(Date value) {
            addCriterion("auction_start_time =", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeNotEqualTo(Date value) {
            addCriterion("auction_start_time <>", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeGreaterThan(Date value) {
            addCriterion("auction_start_time >", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auction_start_time >=", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeLessThan(Date value) {
            addCriterion("auction_start_time <", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("auction_start_time <=", value, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeIn(List<Date> values) {
            addCriterion("auction_start_time in", values, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeNotIn(List<Date> values) {
            addCriterion("auction_start_time not in", values, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeBetween(Date value1, Date value2) {
            addCriterion("auction_start_time between", value1, value2, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("auction_start_time not between", value1, value2, "auctionStartTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIsNull() {
            addCriterion("auction_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIsNotNull() {
            addCriterion("auction_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeEqualTo(Date value) {
            addCriterion("auction_end_time =", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotEqualTo(Date value) {
            addCriterion("auction_end_time <>", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeGreaterThan(Date value) {
            addCriterion("auction_end_time >", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auction_end_time >=", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeLessThan(Date value) {
            addCriterion("auction_end_time <", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("auction_end_time <=", value, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeIn(List<Date> values) {
            addCriterion("auction_end_time in", values, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotIn(List<Date> values) {
            addCriterion("auction_end_time not in", values, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeBetween(Date value1, Date value2) {
            addCriterion("auction_end_time between", value1, value2, "auctionEndTime");
            return (Criteria) this;
        }

        public Criteria andAuctionEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("auction_end_time not between", value1, value2, "auctionEndTime");
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

        public Criteria andSoldStockIsNull() {
            addCriterion("sold_stock is null");
            return (Criteria) this;
        }

        public Criteria andSoldStockIsNotNull() {
            addCriterion("sold_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSoldStockEqualTo(BigDecimal value) {
            addCriterion("sold_stock =", value, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockNotEqualTo(BigDecimal value) {
            addCriterion("sold_stock <>", value, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockGreaterThan(BigDecimal value) {
            addCriterion("sold_stock >", value, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sold_stock >=", value, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockLessThan(BigDecimal value) {
            addCriterion("sold_stock <", value, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sold_stock <=", value, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockIn(List<BigDecimal> values) {
            addCriterion("sold_stock in", values, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockNotIn(List<BigDecimal> values) {
            addCriterion("sold_stock not in", values, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sold_stock between", value1, value2, "soldStock");
            return (Criteria) this;
        }

        public Criteria andSoldStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sold_stock not between", value1, value2, "soldStock");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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