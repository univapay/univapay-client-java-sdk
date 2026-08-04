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
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TransactionTokenUpdateRequestData type.
 */
public class TransactionTokenUpdateRequestData {
    private String cvv;
    private String cardholder;
    private String cardNumber;
    private Integer expMonth;
    private Integer expYear;
    private String line1;
    private String line2;
    private String state;
    private String city;
    private String country;
    private String zip;
    private TransactionTokenUpdateRequestDataPhoneNumber phoneNumber;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionTokenUpdateRequestData() {
    }

    /**
     * Initialization constructor.
     * @param  cvv  String value for cvv.
     * @param  cardholder  String value for cardholder.
     * @param  cardNumber  String value for cardNumber.
     * @param  expMonth  Integer value for expMonth.
     * @param  expYear  Integer value for expYear.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  state  String value for state.
     * @param  city  String value for city.
     * @param  country  String value for country.
     * @param  zip  String value for zip.
     * @param  phoneNumber  TransactionTokenUpdateRequestDataPhoneNumber value for phoneNumber.
     */
    public TransactionTokenUpdateRequestData(
            String cvv,
            String cardholder,
            String cardNumber,
            Integer expMonth,
            Integer expYear,
            String line1,
            String line2,
            String state,
            String city,
            String country,
            String zip,
            TransactionTokenUpdateRequestDataPhoneNumber phoneNumber) {
        this.cvv = cvv;
        this.cardholder = cardholder;
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.line1 = line1;
        this.line2 = line2;
        this.state = state;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for Cvv.
     * Update if RECURRING_USAGE_REQUIRES_CVV error occurs.
     * @return Returns the String
     */
    @JsonGetter("cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCvv() {
        return cvv;
    }

    /**
     * Setter for Cvv.
     * Update if RECURRING_USAGE_REQUIRES_CVV error occurs.
     * @param cvv Value for String
     */
    @JsonSetter("cvv")
    public void setCvv(String cvv) {
        this.cvv = cvv;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Transaction Token Update Request Data Phone Number schema.
     * @return Returns the TransactionTokenUpdateRequestDataPhoneNumber
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionTokenUpdateRequestDataPhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * Transaction Token Update Request Data Phone Number schema.
     * @param phoneNumber Value for TransactionTokenUpdateRequestDataPhoneNumber
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(TransactionTokenUpdateRequestDataPhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * Converts this TransactionTokenUpdateRequestData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionTokenUpdateRequestData [" + "cvv=" + cvv + ", cardholder=" + cardholder
                + ", cardNumber=" + cardNumber + ", expMonth=" + expMonth + ", expYear=" + expYear
                + ", line1=" + line1 + ", line2=" + line2 + ", state=" + state + ", city=" + city
                + ", country=" + country + ", zip=" + zip + ", phoneNumber=" + phoneNumber
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionTokenUpdateRequestData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionTokenUpdateRequestData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cvv(getCvv())
                .cardholder(getCardholder())
                .cardNumber(getCardNumber())
                .expMonth(getExpMonth())
                .expYear(getExpYear())
                .line1(getLine1())
                .line2(getLine2())
                .state(getState())
                .city(getCity())
                .country(getCountry())
                .zip(getZip())
                .phoneNumber(getPhoneNumber());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionTokenUpdateRequestData}.
     */
    public static class Builder {
        private String cvv;
        private String cardholder;
        private String cardNumber;
        private Integer expMonth;
        private Integer expYear;
        private String line1;
        private String line2;
        private String state;
        private String city;
        private String country;
        private String zip;
        private TransactionTokenUpdateRequestDataPhoneNumber phoneNumber;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for cvv.
         * @param  cvv  String value for cvv.
         * @return Builder
         */
        public Builder cvv(String cvv) {
            this.cvv = cvv;
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
         * @param  phoneNumber  TransactionTokenUpdateRequestDataPhoneNumber value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(TransactionTokenUpdateRequestDataPhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
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
         * Builds a new {@link TransactionTokenUpdateRequestData} object using the set fields.
         * @return {@link TransactionTokenUpdateRequestData}
         */
        public TransactionTokenUpdateRequestData build() {
            TransactionTokenUpdateRequestData model =
                    new TransactionTokenUpdateRequestData(cvv, cardholder, cardNumber, expMonth,
                            expYear, line1, line2, state, city, country, zip, phoneNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
