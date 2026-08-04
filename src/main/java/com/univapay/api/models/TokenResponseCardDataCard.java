/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TokenResponseCardDataCard type.
 */
public class TokenResponseCardDataCard {
    private String cardholder;
    private Integer expMonth;
    private Integer expYear;
    private String cardBin;
    private String lastFour;
    private String brand;
    private String cardType;
    private String country;
    private OptionalNullable<String> category;
    private OptionalNullable<String> issuer;
    private String subBrand;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseCardDataCard() {
    }

    /**
     * Initialization constructor.
     * @param  cardholder  String value for cardholder.
     * @param  expMonth  Integer value for expMonth.
     * @param  expYear  Integer value for expYear.
     * @param  cardBin  String value for cardBin.
     * @param  lastFour  String value for lastFour.
     * @param  brand  String value for brand.
     * @param  cardType  String value for cardType.
     * @param  country  String value for country.
     * @param  category  String value for category.
     * @param  issuer  String value for issuer.
     * @param  subBrand  String value for subBrand.
     */
    public TokenResponseCardDataCard(
            String cardholder,
            Integer expMonth,
            Integer expYear,
            String cardBin,
            String lastFour,
            String brand,
            String cardType,
            String country,
            String category,
            String issuer,
            String subBrand) {
        this.cardholder = cardholder;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cardBin = cardBin;
        this.lastFour = lastFour;
        this.brand = brand;
        this.cardType = cardType;
        this.country = country;
        this.category = OptionalNullable.of(category);
        this.issuer = OptionalNullable.of(issuer);
        this.subBrand = subBrand;
    }

    /**
     * Initialization constructor.
     * @param  cardholder  String value for cardholder.
     * @param  expMonth  Integer value for expMonth.
     * @param  expYear  Integer value for expYear.
     * @param  cardBin  String value for cardBin.
     * @param  lastFour  String value for lastFour.
     * @param  brand  String value for brand.
     * @param  cardType  String value for cardType.
     * @param  country  String value for country.
     * @param  category  String value for category.
     * @param  issuer  String value for issuer.
     * @param  subBrand  String value for subBrand.
     */

    protected TokenResponseCardDataCard(String cardholder, Integer expMonth, Integer expYear,
            String cardBin, String lastFour, String brand, String cardType, String country,
            OptionalNullable<String> category, OptionalNullable<String> issuer, String subBrand) {
        this.cardholder = cardholder;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cardBin = cardBin;
        this.lastFour = lastFour;
        this.brand = brand;
        this.cardType = cardType;
        this.country = country;
        this.category = category;
        this.issuer = issuer;
        this.subBrand = subBrand;
    }

    /**
     * Getter for Cardholder.
     * Cardholder name.
     * @return Returns the String
     */
    @JsonGetter("cardholder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardholder() {
        return cardholder;
    }

    /**
     * Setter for Cardholder.
     * Cardholder name.
     * @param cardholder Value for String
     */
    @JsonSetter("cardholder")
    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    /**
     * Getter for ExpMonth.
     * Card expiration month.
     * @return Returns the Integer
     */
    @JsonGetter("exp_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpMonth() {
        return expMonth;
    }

    /**
     * Setter for ExpMonth.
     * Card expiration month.
     * @param expMonth Value for Integer
     */
    @JsonSetter("exp_month")
    public void setExpMonth(Integer expMonth) {
        this.expMonth = expMonth;
    }

    /**
     * Getter for ExpYear.
     * Card expiration year.
     * @return Returns the Integer
     */
    @JsonGetter("exp_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpYear() {
        return expYear;
    }

    /**
     * Setter for ExpYear.
     * Card expiration year.
     * @param expYear Value for Integer
     */
    @JsonSetter("exp_year")
    public void setExpYear(Integer expYear) {
        this.expYear = expYear;
    }

    /**
     * Getter for CardBin.
     * Card bin value.
     * @return Returns the String
     */
    @JsonGetter("card_bin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardBin() {
        return cardBin;
    }

    /**
     * Setter for CardBin.
     * Card bin value.
     * @param cardBin Value for String
     */
    @JsonSetter("card_bin")
    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    /**
     * Getter for LastFour.
     * Last four value.
     * @return Returns the String
     */
    @JsonGetter("last_four")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastFour() {
        return lastFour;
    }

    /**
     * Setter for LastFour.
     * Last four value.
     * @param lastFour Value for String
     */
    @JsonSetter("last_four")
    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    /**
     * Getter for Brand.
     * Brand or network name.
     * @return Returns the String
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * Brand or network name.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for CardType.
     * Card type value.
     * @return Returns the String
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * Card type value.
     * @param cardType Value for String
     */
    @JsonSetter("card_type")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for Country.
     * Country code.
     * @return Returns the String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Country code.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Internal Getter for Category.
     * Category value.
     * @return Returns the Internal String
     */
    @JsonGetter("category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCategory() {
        return this.category;
    }

    /**
     * Getter for Category.
     * Category value.
     * @return Returns the String
     */
    public String getCategory() {
        return OptionalNullable.getFrom(category);
    }

    /**
     * Setter for Category.
     * Category value.
     * @param category Value for String
     */
    @JsonSetter("category")
    public void setCategory(String category) {
        this.category = OptionalNullable.of(category);
    }

    /**
     * UnSetter for Category.
     * Category value.
     */
    public void unsetCategory() {
        category = null;
    }

    /**
     * Internal Getter for Issuer.
     * Issuer value.
     * @return Returns the Internal String
     */
    @JsonGetter("issuer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIssuer() {
        return this.issuer;
    }

    /**
     * Getter for Issuer.
     * Issuer value.
     * @return Returns the String
     */
    public String getIssuer() {
        return OptionalNullable.getFrom(issuer);
    }

    /**
     * Setter for Issuer.
     * Issuer value.
     * @param issuer Value for String
     */
    @JsonSetter("issuer")
    public void setIssuer(String issuer) {
        this.issuer = OptionalNullable.of(issuer);
    }

    /**
     * UnSetter for Issuer.
     * Issuer value.
     */
    public void unsetIssuer() {
        issuer = null;
    }

    /**
     * Getter for SubBrand.
     * Sub brand value.
     * @return Returns the String
     */
    @JsonGetter("sub_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubBrand() {
        return subBrand;
    }

    /**
     * Setter for SubBrand.
     * Sub brand value.
     * @param subBrand Value for String
     */
    @JsonSetter("sub_brand")
    public void setSubBrand(String subBrand) {
        this.subBrand = subBrand;
    }

    /**
     * Hidden method for the serialization of additional properties.
     * @return The map of additionally set properties.
     */
    @JsonAnyGetter
    private Map<String, Object> getAdditionalProperties() {
        return additionalProperties.getAdditionalProperties();
    }

    /**
     * Hidden method for the de-serialization of additional properties.
     * @param name The name of the additional property.
     * @param value The Object value of the additional property.
     */
    @JsonAnySetter
    private void setAdditionalProperties(String name, Object value) {
        additionalProperties.setAdditionalProperty(name,
                ConversionHelper.convertToSimpleType(value,
                        x -> x),
                true);
    }

    /**
     * Getter for the value of additional properties based on provided property name.
     * @param name The name of the additional property.
     * @return Either the Object property value or null if not exist.
     */
    
    public Object getAdditionalProperty(String name) {
        return additionalProperties.getAdditionalProperty(name);
    }

    /**
     * Converts this TokenResponseCardDataCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseCardDataCard [" + "cardholder=" + cardholder + ", expMonth=" + expMonth
                + ", expYear=" + expYear + ", cardBin=" + cardBin + ", lastFour=" + lastFour
                + ", brand=" + brand + ", cardType=" + cardType + ", country=" + country
                + ", category=" + category + ", issuer=" + issuer + ", subBrand=" + subBrand
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseCardDataCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseCardDataCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardholder(getCardholder())
                .expMonth(getExpMonth())
                .expYear(getExpYear())
                .cardBin(getCardBin())
                .lastFour(getLastFour())
                .brand(getBrand())
                .cardType(getCardType())
                .country(getCountry())
                .subBrand(getSubBrand());
        builder.category = internalGetCategory();
        builder.issuer = internalGetIssuer();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseCardDataCard}.
     */
    public static class Builder {
        private String cardholder;
        private Integer expMonth;
        private Integer expYear;
        private String cardBin;
        private String lastFour;
        private String brand;
        private String cardType;
        private String country;
        private OptionalNullable<String> category;
        private OptionalNullable<String> issuer;
        private String subBrand;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for cardholder.
         * @param  cardholder  String value for cardholder.
         * @return Builder
         */
        public Builder cardholder(String cardholder) {
            this.cardholder = cardholder;
            return this;
        }

        /**
         * Setter for expMonth.
         * @param  expMonth  Integer value for expMonth.
         * @return Builder
         */
        public Builder expMonth(Integer expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        /**
         * Setter for expYear.
         * @param  expYear  Integer value for expYear.
         * @return Builder
         */
        public Builder expYear(Integer expYear) {
            this.expYear = expYear;
            return this;
        }

        /**
         * Setter for cardBin.
         * @param  cardBin  String value for cardBin.
         * @return Builder
         */
        public Builder cardBin(String cardBin) {
            this.cardBin = cardBin;
            return this;
        }

        /**
         * Setter for lastFour.
         * @param  lastFour  String value for lastFour.
         * @return Builder
         */
        public Builder lastFour(String lastFour) {
            this.lastFour = lastFour;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for cardType.
         * @param  cardType  String value for cardType.
         * @return Builder
         */
        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for category.
         * @param  category  String value for category.
         * @return Builder
         */
        public Builder category(String category) {
            this.category = OptionalNullable.of(category);
            return this;
        }

        /**
         * UnSetter for category.
         * @return Builder
         */
        public Builder unsetCategory() {
            category = null;
            return this;
        }

        /**
         * Setter for issuer.
         * @param  issuer  String value for issuer.
         * @return Builder
         */
        public Builder issuer(String issuer) {
            this.issuer = OptionalNullable.of(issuer);
            return this;
        }

        /**
         * UnSetter for issuer.
         * @return Builder
         */
        public Builder unsetIssuer() {
            issuer = null;
            return this;
        }

        /**
         * Setter for subBrand.
         * @param  subBrand  String value for subBrand.
         * @return Builder
         */
        public Builder subBrand(String subBrand) {
            this.subBrand = subBrand;
            return this;
        }

        /**
         * Setter for additional property that are not in model fields.
         * @param name The name of the additional property.
         * @param value The Object value of the additional property.
         * @return Builder.
         */
        public Builder additionalProperty(String name, Object value) {
            this.additionalProperties.setAdditionalProperty(name, value);
            return this;
        }

        /**
         * Builds a new {@link TokenResponseCardDataCard} object using the set fields.
         * @return {@link TokenResponseCardDataCard}
         */
        public TokenResponseCardDataCard build() {
            TokenResponseCardDataCard model =
                    new TokenResponseCardDataCard(cardholder, expMonth, expYear, cardBin, lastFour,
                            brand, cardType, country, category, issuer, subBrand);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
