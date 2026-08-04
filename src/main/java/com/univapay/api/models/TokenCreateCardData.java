/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TokenCreateCardData type.
 */
public class TokenCreateCardData {
    private String cardholder;
    private String cardNumber;
    private String expMonth;
    private String expYear;
    private OptionalNullable<String> cvv;
    private String line1;
    private String line2;
    private String state;
    private String city;
    private String country;
    private String zip;
    private TokenCreatePhoneNumber phoneNumber;
    private TokenCreateCardDataCvvAuthorize cvvAuthorize;
    private TokenCreateCardDataThreeDs threeDs;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenCreateCardData() {
    }

    /**
     * Initialization constructor.
     * @param  cardNumber  String value for cardNumber.
     * @param  expMonth  String value for expMonth.
     * @param  expYear  String value for expYear.
     * @param  cardholder  String value for cardholder.
     * @param  cvv  String value for cvv.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  state  String value for state.
     * @param  city  String value for city.
     * @param  country  String value for country.
     * @param  zip  String value for zip.
     * @param  phoneNumber  TokenCreatePhoneNumber value for phoneNumber.
     * @param  cvvAuthorize  TokenCreateCardDataCvvAuthorize value for cvvAuthorize.
     * @param  threeDs  TokenCreateCardDataThreeDs value for threeDs.
     */
    public TokenCreateCardData(
            String cardNumber,
            String expMonth,
            String expYear,
            String cardholder,
            String cvv,
            String line1,
            String line2,
            String state,
            String city,
            String country,
            String zip,
            TokenCreatePhoneNumber phoneNumber,
            TokenCreateCardDataCvvAuthorize cvvAuthorize,
            TokenCreateCardDataThreeDs threeDs) {
        this.cardholder = cardholder;
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvv = OptionalNullable.of(cvv);
        this.line1 = line1;
        this.line2 = line2;
        this.state = state;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.cvvAuthorize = cvvAuthorize;
        this.threeDs = threeDs;
    }

    /**
     * Initialization constructor.
     * @param  cardNumber  String value for cardNumber.
     * @param  expMonth  String value for expMonth.
     * @param  expYear  String value for expYear.
     * @param  cardholder  String value for cardholder.
     * @param  cvv  String value for cvv.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  state  String value for state.
     * @param  city  String value for city.
     * @param  country  String value for country.
     * @param  zip  String value for zip.
     * @param  phoneNumber  TokenCreatePhoneNumber value for phoneNumber.
     * @param  cvvAuthorize  TokenCreateCardDataCvvAuthorize value for cvvAuthorize.
     * @param  threeDs  TokenCreateCardDataThreeDs value for threeDs.
     */

    protected TokenCreateCardData(String cardNumber, String expMonth, String expYear,
            String cardholder, OptionalNullable<String> cvv, String line1, String line2,
            String state, String city, String country, String zip,
            TokenCreatePhoneNumber phoneNumber, TokenCreateCardDataCvvAuthorize cvvAuthorize,
            TokenCreateCardDataThreeDs threeDs) {
        this.cardholder = cardholder;
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvv = cvv;
        this.line1 = line1;
        this.line2 = line2;
        this.state = state;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.cvvAuthorize = cvvAuthorize;
        this.threeDs = threeDs;
    }

    /**
     * Initialization constructor.
     * @param  cardNumber  String value for cardNumber.
     * @param  expMonth  String value for expMonth.
     * @param  expYear  String value for expYear.
     */
    @JsonCreator
    protected TokenCreateCardData(
            @JsonProperty("card_number") String cardNumber,
            @JsonProperty("exp_month") String expMonth,
            @JsonProperty("exp_year") String expYear) {
        this(cardNumber, expMonth, expYear, null, OptionalNullable.of(null), null, null, null, null,
                null, null, null, null, null);
        unsetCvv();
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
     * Getter for CardNumber.
     * Card number.
     * @return Returns the String
     */
    @JsonGetter("card_number")
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Setter for CardNumber.
     * Card number.
     * @param cardNumber Value for String
     */
    @JsonSetter("card_number")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Getter for ExpMonth.
     * Card expiration month.
     * @return Returns the String
     */
    @JsonGetter("exp_month")
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Setter for ExpMonth.
     * Card expiration month.
     * @param expMonth Value for String
     */
    @JsonSetter("exp_month")
    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    /**
     * Getter for ExpYear.
     * Card expiration year.
     * @return Returns the String
     */
    @JsonGetter("exp_year")
    public String getExpYear() {
        return expYear;
    }

    /**
     * Setter for ExpYear.
     * Card expiration year.
     * @param expYear Value for String
     */
    @JsonSetter("exp_year")
    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    /**
     * Internal Getter for Cvv.
     * Card security code.
     * @return Returns the Internal String
     */
    @JsonGetter("cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCvv() {
        return this.cvv;
    }

    /**
     * Getter for Cvv.
     * Card security code.
     * @return Returns the String
     */
    public String getCvv() {
        return OptionalNullable.getFrom(cvv);
    }

    /**
     * Setter for Cvv.
     * Card security code.
     * @param cvv Value for String
     */
    @JsonSetter("cvv")
    public void setCvv(String cvv) {
        this.cvv = OptionalNullable.of(cvv);
    }

    /**
     * UnSetter for Cvv.
     * Card security code.
     */
    public void unsetCvv() {
        cvv = null;
    }

    /**
     * Getter for Line1.
     * Primary street address line.
     * @return Returns the String
     */
    @JsonGetter("line1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLine1() {
        return line1;
    }

    /**
     * Setter for Line1.
     * Primary street address line.
     * @param line1 Value for String
     */
    @JsonSetter("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * Getter for Line2.
     * Secondary street address line.
     * @return Returns the String
     */
    @JsonGetter("line2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLine2() {
        return line2;
    }

    /**
     * Setter for Line2.
     * Secondary street address line.
     * @param line2 Value for String
     */
    @JsonSetter("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * Getter for State.
     * State or prefecture.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * State or prefecture.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for City.
     * City or locality.
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * City or locality.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
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
     * Getter for Zip.
     * Postal code.
     * @return Returns the String
     */
    @JsonGetter("zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZip() {
        return zip;
    }

    /**
     * Setter for Zip.
     * Postal code.
     * @param zip Value for String
     */
    @JsonSetter("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Getter for PhoneNumber.
     * Token Create Phone Number schema.
     * @return Returns the TokenCreatePhoneNumber
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenCreatePhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * Token Create Phone Number schema.
     * @param phoneNumber Value for TokenCreatePhoneNumber
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(TokenCreatePhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for CvvAuthorize.
     * Token Create Card Data Cvv Authorize schema.
     * @return Returns the TokenCreateCardDataCvvAuthorize
     */
    @JsonGetter("cvv_authorize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenCreateCardDataCvvAuthorize getCvvAuthorize() {
        return cvvAuthorize;
    }

    /**
     * Setter for CvvAuthorize.
     * Token Create Card Data Cvv Authorize schema.
     * @param cvvAuthorize Value for TokenCreateCardDataCvvAuthorize
     */
    @JsonSetter("cvv_authorize")
    public void setCvvAuthorize(TokenCreateCardDataCvvAuthorize cvvAuthorize) {
        this.cvvAuthorize = cvvAuthorize;
    }

    /**
     * Getter for ThreeDs.
     * Token Create Card Data Three Ds schema.
     * @return Returns the TokenCreateCardDataThreeDs
     */
    @JsonGetter("three_ds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenCreateCardDataThreeDs getThreeDs() {
        return threeDs;
    }

    /**
     * Setter for ThreeDs.
     * Token Create Card Data Three Ds schema.
     * @param threeDs Value for TokenCreateCardDataThreeDs
     */
    @JsonSetter("three_ds")
    public void setThreeDs(TokenCreateCardDataThreeDs threeDs) {
        this.threeDs = threeDs;
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
     * Converts this TokenCreateCardData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenCreateCardData [" + "cardNumber=" + cardNumber + ", expMonth=" + expMonth
                + ", expYear=" + expYear + ", cardholder=" + cardholder + ", cvv=" + cvv
                + ", line1=" + line1 + ", line2=" + line2 + ", state=" + state + ", city=" + city
                + ", country=" + country + ", zip=" + zip + ", phoneNumber=" + phoneNumber
                + ", cvvAuthorize=" + cvvAuthorize + ", threeDs=" + threeDs
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenCreateCardData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenCreateCardData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cardNumber, expMonth, expYear)
                .cardholder(getCardholder())
                .line1(getLine1())
                .line2(getLine2())
                .state(getState())
                .city(getCity())
                .country(getCountry())
                .zip(getZip())
                .phoneNumber(getPhoneNumber())
                .cvvAuthorize(getCvvAuthorize())
                .threeDs(getThreeDs());
        builder.cvv = internalGetCvv();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenCreateCardData}.
     */
    public static class Builder {
        private String cardNumber;
        private String expMonth;
        private String expYear;
        private String cardholder;
        private OptionalNullable<String> cvv;
        private String line1;
        private String line2;
        private String state;
        private String city;
        private String country;
        private String zip;
        private TokenCreatePhoneNumber phoneNumber;
        private TokenCreateCardDataCvvAuthorize cvvAuthorize;
        private TokenCreateCardDataThreeDs threeDs;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cardNumber  String value for cardNumber.
         * @param  expMonth  String value for expMonth.
         * @param  expYear  String value for expYear.
         */
        public Builder(String cardNumber, String expMonth, String expYear) {
            this.cardNumber = cardNumber;
            this.expMonth = expMonth;
            this.expYear = expYear;
        }

        /**
         * Setter for cardNumber.
         * @param  cardNumber  String value for cardNumber.
         * @return Builder
         */
        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        /**
         * Setter for expMonth.
         * @param  expMonth  String value for expMonth.
         * @return Builder
         */
        public Builder expMonth(String expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        /**
         * Setter for expYear.
         * @param  expYear  String value for expYear.
         * @return Builder
         */
        public Builder expYear(String expYear) {
            this.expYear = expYear;
            return this;
        }

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
         * Setter for cvv.
         * @param  cvv  String value for cvv.
         * @return Builder
         */
        public Builder cvv(String cvv) {
            this.cvv = OptionalNullable.of(cvv);
            return this;
        }

        /**
         * UnSetter for cvv.
         * @return Builder
         */
        public Builder unsetCvv() {
            cvv = null;
            return this;
        }

        /**
         * Setter for line1.
         * @param  line1  String value for line1.
         * @return Builder
         */
        public Builder line1(String line1) {
            this.line1 = line1;
            return this;
        }

        /**
         * Setter for line2.
         * @param  line2  String value for line2.
         * @return Builder
         */
        public Builder line2(String line2) {
            this.line2 = line2;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
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
         * Setter for zip.
         * @param  zip  String value for zip.
         * @return Builder
         */
        public Builder zip(String zip) {
            this.zip = zip;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  TokenCreatePhoneNumber value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(TokenCreatePhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Setter for cvvAuthorize.
         * @param  cvvAuthorize  TokenCreateCardDataCvvAuthorize value for cvvAuthorize.
         * @return Builder
         */
        public Builder cvvAuthorize(TokenCreateCardDataCvvAuthorize cvvAuthorize) {
            this.cvvAuthorize = cvvAuthorize;
            return this;
        }

        /**
         * Setter for threeDs.
         * @param  threeDs  TokenCreateCardDataThreeDs value for threeDs.
         * @return Builder
         */
        public Builder threeDs(TokenCreateCardDataThreeDs threeDs) {
            this.threeDs = threeDs;
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
         * Builds a new {@link TokenCreateCardData} object using the set fields.
         * @return {@link TokenCreateCardData}
         */
        public TokenCreateCardData build() {
            TokenCreateCardData model =
                    new TokenCreateCardData(cardNumber, expMonth, expYear, cardholder, cvv, line1,
                            line2, state, city, country, zip, phoneNumber, cvvAuthorize, threeDs);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
