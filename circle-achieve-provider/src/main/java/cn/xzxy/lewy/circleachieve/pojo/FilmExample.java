package cn.xzxy.lewy.circleachieve.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmExample() {
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

        public Criteria andFilmIdIsNull() {
            addCriterion("film_id is null");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNotNull() {
            addCriterion("film_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilmIdEqualTo(Integer value) {
            addCriterion("film_id =", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotEqualTo(Integer value) {
            addCriterion("film_id <>", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThan(Integer value) {
            addCriterion("film_id >", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_id >=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThan(Integer value) {
            addCriterion("film_id <", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThanOrEqualTo(Integer value) {
            addCriterion("film_id <=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIn(List<Integer> values) {
            addCriterion("film_id in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotIn(List<Integer> values) {
            addCriterion("film_id not in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdBetween(Integer value1, Integer value2) {
            addCriterion("film_id between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("film_id not between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andReleaseYearIsNull() {
            addCriterion("release_year is null");
            return (Criteria) this;
        }

        public Criteria andReleaseYearIsNotNull() {
            addCriterion("release_year is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseYearEqualTo(Date value) {
            addCriterion("release_year =", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearNotEqualTo(Date value) {
            addCriterion("release_year <>", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearGreaterThan(Date value) {
            addCriterion("release_year >", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearGreaterThanOrEqualTo(Date value) {
            addCriterion("release_year >=", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearLessThan(Date value) {
            addCriterion("release_year <", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearLessThanOrEqualTo(Date value) {
            addCriterion("release_year <=", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearIn(List<Date> values) {
            addCriterion("release_year in", values, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearNotIn(List<Date> values) {
            addCriterion("release_year not in", values, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearBetween(Date value1, Date value2) {
            addCriterion("release_year between", value1, value2, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearNotBetween(Date value1, Date value2) {
            addCriterion("release_year not between", value1, value2, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andLanguageIdIsNull() {
            addCriterion("language_id is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIdIsNotNull() {
            addCriterion("language_id is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageIdEqualTo(Integer value) {
            addCriterion("language_id =", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdNotEqualTo(Integer value) {
            addCriterion("language_id <>", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdGreaterThan(Integer value) {
            addCriterion("language_id >", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("language_id >=", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdLessThan(Integer value) {
            addCriterion("language_id <", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdLessThanOrEqualTo(Integer value) {
            addCriterion("language_id <=", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdIn(List<Integer> values) {
            addCriterion("language_id in", values, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdNotIn(List<Integer> values) {
            addCriterion("language_id not in", values, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdBetween(Integer value1, Integer value2) {
            addCriterion("language_id between", value1, value2, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("language_id not between", value1, value2, "languageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdIsNull() {
            addCriterion("original_language_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdIsNotNull() {
            addCriterion("original_language_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdEqualTo(Integer value) {
            addCriterion("original_language_id =", value, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdNotEqualTo(Integer value) {
            addCriterion("original_language_id <>", value, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdGreaterThan(Integer value) {
            addCriterion("original_language_id >", value, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_language_id >=", value, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdLessThan(Integer value) {
            addCriterion("original_language_id <", value, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdLessThanOrEqualTo(Integer value) {
            addCriterion("original_language_id <=", value, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdIn(List<Integer> values) {
            addCriterion("original_language_id in", values, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdNotIn(List<Integer> values) {
            addCriterion("original_language_id not in", values, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdBetween(Integer value1, Integer value2) {
            addCriterion("original_language_id between", value1, value2, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andOriginalLanguageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("original_language_id not between", value1, value2, "originalLanguageId");
            return (Criteria) this;
        }

        public Criteria andRentalDurationIsNull() {
            addCriterion("rental_duration is null");
            return (Criteria) this;
        }

        public Criteria andRentalDurationIsNotNull() {
            addCriterion("rental_duration is not null");
            return (Criteria) this;
        }

        public Criteria andRentalDurationEqualTo(Integer value) {
            addCriterion("rental_duration =", value, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationNotEqualTo(Integer value) {
            addCriterion("rental_duration <>", value, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationGreaterThan(Integer value) {
            addCriterion("rental_duration >", value, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("rental_duration >=", value, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationLessThan(Integer value) {
            addCriterion("rental_duration <", value, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationLessThanOrEqualTo(Integer value) {
            addCriterion("rental_duration <=", value, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationIn(List<Integer> values) {
            addCriterion("rental_duration in", values, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationNotIn(List<Integer> values) {
            addCriterion("rental_duration not in", values, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationBetween(Integer value1, Integer value2) {
            addCriterion("rental_duration between", value1, value2, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("rental_duration not between", value1, value2, "rentalDuration");
            return (Criteria) this;
        }

        public Criteria andRentalRateIsNull() {
            addCriterion("rental_rate is null");
            return (Criteria) this;
        }

        public Criteria andRentalRateIsNotNull() {
            addCriterion("rental_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRentalRateEqualTo(BigDecimal value) {
            addCriterion("rental_rate =", value, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateNotEqualTo(BigDecimal value) {
            addCriterion("rental_rate <>", value, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateGreaterThan(BigDecimal value) {
            addCriterion("rental_rate >", value, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rental_rate >=", value, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateLessThan(BigDecimal value) {
            addCriterion("rental_rate <", value, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rental_rate <=", value, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateIn(List<BigDecimal> values) {
            addCriterion("rental_rate in", values, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateNotIn(List<BigDecimal> values) {
            addCriterion("rental_rate not in", values, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rental_rate between", value1, value2, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andRentalRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rental_rate not between", value1, value2, "rentalRate");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andReplacementCostIsNull() {
            addCriterion("replacement_cost is null");
            return (Criteria) this;
        }

        public Criteria andReplacementCostIsNotNull() {
            addCriterion("replacement_cost is not null");
            return (Criteria) this;
        }

        public Criteria andReplacementCostEqualTo(BigDecimal value) {
            addCriterion("replacement_cost =", value, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostNotEqualTo(BigDecimal value) {
            addCriterion("replacement_cost <>", value, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostGreaterThan(BigDecimal value) {
            addCriterion("replacement_cost >", value, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("replacement_cost >=", value, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostLessThan(BigDecimal value) {
            addCriterion("replacement_cost <", value, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("replacement_cost <=", value, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostIn(List<BigDecimal> values) {
            addCriterion("replacement_cost in", values, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostNotIn(List<BigDecimal> values) {
            addCriterion("replacement_cost not in", values, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("replacement_cost between", value1, value2, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andReplacementCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("replacement_cost not between", value1, value2, "replacementCost");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(String value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(String value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(String value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(String value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(String value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(String value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLike(String value) {
            addCriterion("rating like", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotLike(String value) {
            addCriterion("rating not like", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<String> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<String> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(String value1, String value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(String value1, String value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesIsNull() {
            addCriterion("special_features is null");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesIsNotNull() {
            addCriterion("special_features is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesEqualTo(String value) {
            addCriterion("special_features =", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesNotEqualTo(String value) {
            addCriterion("special_features <>", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesGreaterThan(String value) {
            addCriterion("special_features >", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("special_features >=", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesLessThan(String value) {
            addCriterion("special_features <", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesLessThanOrEqualTo(String value) {
            addCriterion("special_features <=", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesLike(String value) {
            addCriterion("special_features like", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesNotLike(String value) {
            addCriterion("special_features not like", value, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesIn(List<String> values) {
            addCriterion("special_features in", values, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesNotIn(List<String> values) {
            addCriterion("special_features not in", values, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesBetween(String value1, String value2) {
            addCriterion("special_features between", value1, value2, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andSpecialFeaturesNotBetween(String value1, String value2) {
            addCriterion("special_features not between", value1, value2, "specialFeatures");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
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