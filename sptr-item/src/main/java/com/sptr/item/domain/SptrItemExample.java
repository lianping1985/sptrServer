package com.sptr.item.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SptrItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SptrItemExample() {
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

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("item_desc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("item_desc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("item_desc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("item_desc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("item_desc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item_desc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("item_desc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("item_desc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("item_desc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("item_desc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("item_desc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("item_desc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("item_desc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("item_desc not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemPicIsNull() {
            addCriterion("item_pic is null");
            return (Criteria) this;
        }

        public Criteria andItemPicIsNotNull() {
            addCriterion("item_pic is not null");
            return (Criteria) this;
        }

        public Criteria andItemPicEqualTo(String value) {
            addCriterion("item_pic =", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotEqualTo(String value) {
            addCriterion("item_pic <>", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicGreaterThan(String value) {
            addCriterion("item_pic >", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicGreaterThanOrEqualTo(String value) {
            addCriterion("item_pic >=", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLessThan(String value) {
            addCriterion("item_pic <", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLessThanOrEqualTo(String value) {
            addCriterion("item_pic <=", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLike(String value) {
            addCriterion("item_pic like", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotLike(String value) {
            addCriterion("item_pic not like", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicIn(List<String> values) {
            addCriterion("item_pic in", values, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotIn(List<String> values) {
            addCriterion("item_pic not in", values, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicBetween(String value1, String value2) {
            addCriterion("item_pic between", value1, value2, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotBetween(String value1, String value2) {
            addCriterion("item_pic not between", value1, value2, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicHotIsNull() {
            addCriterion("item_pic_hot is null");
            return (Criteria) this;
        }

        public Criteria andItemPicHotIsNotNull() {
            addCriterion("item_pic_hot is not null");
            return (Criteria) this;
        }

        public Criteria andItemPicHotEqualTo(String value) {
            addCriterion("item_pic_hot =", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotNotEqualTo(String value) {
            addCriterion("item_pic_hot <>", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotGreaterThan(String value) {
            addCriterion("item_pic_hot >", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotGreaterThanOrEqualTo(String value) {
            addCriterion("item_pic_hot >=", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotLessThan(String value) {
            addCriterion("item_pic_hot <", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotLessThanOrEqualTo(String value) {
            addCriterion("item_pic_hot <=", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotLike(String value) {
            addCriterion("item_pic_hot like", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotNotLike(String value) {
            addCriterion("item_pic_hot not like", value, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotIn(List<String> values) {
            addCriterion("item_pic_hot in", values, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotNotIn(List<String> values) {
            addCriterion("item_pic_hot not in", values, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotBetween(String value1, String value2) {
            addCriterion("item_pic_hot between", value1, value2, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicHotNotBetween(String value1, String value2) {
            addCriterion("item_pic_hot not between", value1, value2, "itemPicHot");
            return (Criteria) this;
        }

        public Criteria andItemPicNewIsNull() {
            addCriterion("item_pic_new is null");
            return (Criteria) this;
        }

        public Criteria andItemPicNewIsNotNull() {
            addCriterion("item_pic_new is not null");
            return (Criteria) this;
        }

        public Criteria andItemPicNewEqualTo(String value) {
            addCriterion("item_pic_new =", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewNotEqualTo(String value) {
            addCriterion("item_pic_new <>", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewGreaterThan(String value) {
            addCriterion("item_pic_new >", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewGreaterThanOrEqualTo(String value) {
            addCriterion("item_pic_new >=", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewLessThan(String value) {
            addCriterion("item_pic_new <", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewLessThanOrEqualTo(String value) {
            addCriterion("item_pic_new <=", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewLike(String value) {
            addCriterion("item_pic_new like", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewNotLike(String value) {
            addCriterion("item_pic_new not like", value, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewIn(List<String> values) {
            addCriterion("item_pic_new in", values, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewNotIn(List<String> values) {
            addCriterion("item_pic_new not in", values, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewBetween(String value1, String value2) {
            addCriterion("item_pic_new between", value1, value2, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicNewNotBetween(String value1, String value2) {
            addCriterion("item_pic_new not between", value1, value2, "itemPicNew");
            return (Criteria) this;
        }

        public Criteria andItemPicTopIsNull() {
            addCriterion("item_pic_top is null");
            return (Criteria) this;
        }

        public Criteria andItemPicTopIsNotNull() {
            addCriterion("item_pic_top is not null");
            return (Criteria) this;
        }

        public Criteria andItemPicTopEqualTo(String value) {
            addCriterion("item_pic_top =", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopNotEqualTo(String value) {
            addCriterion("item_pic_top <>", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopGreaterThan(String value) {
            addCriterion("item_pic_top >", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopGreaterThanOrEqualTo(String value) {
            addCriterion("item_pic_top >=", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopLessThan(String value) {
            addCriterion("item_pic_top <", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopLessThanOrEqualTo(String value) {
            addCriterion("item_pic_top <=", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopLike(String value) {
            addCriterion("item_pic_top like", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopNotLike(String value) {
            addCriterion("item_pic_top not like", value, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopIn(List<String> values) {
            addCriterion("item_pic_top in", values, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopNotIn(List<String> values) {
            addCriterion("item_pic_top not in", values, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopBetween(String value1, String value2) {
            addCriterion("item_pic_top between", value1, value2, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemPicTopNotBetween(String value1, String value2) {
            addCriterion("item_pic_top not between", value1, value2, "itemPicTop");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNull() {
            addCriterion("item_unit is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNotNull() {
            addCriterion("item_unit is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitEqualTo(String value) {
            addCriterion("item_unit =", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotEqualTo(String value) {
            addCriterion("item_unit <>", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThan(String value) {
            addCriterion("item_unit >", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThanOrEqualTo(String value) {
            addCriterion("item_unit >=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThan(String value) {
            addCriterion("item_unit <", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThanOrEqualTo(String value) {
            addCriterion("item_unit <=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLike(String value) {
            addCriterion("item_unit like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotLike(String value) {
            addCriterion("item_unit not like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitIn(List<String> values) {
            addCriterion("item_unit in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotIn(List<String> values) {
            addCriterion("item_unit not in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitBetween(String value1, String value2) {
            addCriterion("item_unit between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotBetween(String value1, String value2) {
            addCriterion("item_unit not between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpIsNull() {
            addCriterion("buy_start_up is null");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpIsNotNull() {
            addCriterion("buy_start_up is not null");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpEqualTo(Integer value) {
            addCriterion("buy_start_up =", value, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpNotEqualTo(Integer value) {
            addCriterion("buy_start_up <>", value, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpGreaterThan(Integer value) {
            addCriterion("buy_start_up >", value, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_start_up >=", value, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpLessThan(Integer value) {
            addCriterion("buy_start_up <", value, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpLessThanOrEqualTo(Integer value) {
            addCriterion("buy_start_up <=", value, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpIn(List<Integer> values) {
            addCriterion("buy_start_up in", values, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpNotIn(List<Integer> values) {
            addCriterion("buy_start_up not in", values, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpBetween(Integer value1, Integer value2) {
            addCriterion("buy_start_up between", value1, value2, "buyStartUp");
            return (Criteria) this;
        }

        public Criteria andBuyStartUpNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_start_up not between", value1, value2, "buyStartUp");
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

        public Criteria andPriceDiscountIsNull() {
            addCriterion("price_discount is null");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountIsNotNull() {
            addCriterion("price_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountEqualTo(BigDecimal value) {
            addCriterion("price_discount =", value, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountNotEqualTo(BigDecimal value) {
            addCriterion("price_discount <>", value, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountGreaterThan(BigDecimal value) {
            addCriterion("price_discount >", value, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_discount >=", value, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountLessThan(BigDecimal value) {
            addCriterion("price_discount <", value, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_discount <=", value, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountIn(List<BigDecimal> values) {
            addCriterion("price_discount in", values, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountNotIn(List<BigDecimal> values) {
            addCriterion("price_discount not in", values, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_discount between", value1, value2, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andPriceDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_discount not between", value1, value2, "priceDiscount");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeIsNull() {
            addCriterion("item_show_type is null");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeIsNotNull() {
            addCriterion("item_show_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeEqualTo(Integer value) {
            addCriterion("item_show_type =", value, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeNotEqualTo(Integer value) {
            addCriterion("item_show_type <>", value, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeGreaterThan(Integer value) {
            addCriterion("item_show_type >", value, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_show_type >=", value, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeLessThan(Integer value) {
            addCriterion("item_show_type <", value, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_show_type <=", value, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeIn(List<Integer> values) {
            addCriterion("item_show_type in", values, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeNotIn(List<Integer> values) {
            addCriterion("item_show_type not in", values, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_show_type between", value1, value2, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemShowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_show_type not between", value1, value2, "itemShowType");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIsNull() {
            addCriterion("item_category is null");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIsNotNull() {
            addCriterion("item_category is not null");
            return (Criteria) this;
        }

        public Criteria andItemCategoryEqualTo(String value) {
            addCriterion("item_category =", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryNotEqualTo(String value) {
            addCriterion("item_category <>", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryGreaterThan(String value) {
            addCriterion("item_category >", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("item_category >=", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryLessThan(String value) {
            addCriterion("item_category <", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryLessThanOrEqualTo(String value) {
            addCriterion("item_category <=", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryLike(String value) {
            addCriterion("item_category like", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryNotLike(String value) {
            addCriterion("item_category not like", value, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIn(List<String> values) {
            addCriterion("item_category in", values, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryNotIn(List<String> values) {
            addCriterion("item_category not in", values, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryBetween(String value1, String value2) {
            addCriterion("item_category between", value1, value2, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andItemCategoryNotBetween(String value1, String value2) {
            addCriterion("item_category not between", value1, value2, "itemCategory");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
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