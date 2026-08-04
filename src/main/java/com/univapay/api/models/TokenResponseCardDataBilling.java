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
 * This is a model class for TokenResponseCardDataBilling type.
 */
public class TokenResponseCardDataBilling {
    private OptionalNullable<String> line1;
    private OptionalNullable<String> line2;
    private OptionalNullable<String> state;
    private OptionalNullable<String> city;
    private OptionalNullable<String> country;
    private OptionalNullable<String> zip;
    private TokenResponsePhoneNumber phoneNumber;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseCardDataBilling() {
    }

    /**
     * Initialization constructor.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  state  String value for state.
     * @param  city  String value for city.
     * @param  country  String value for country.
     * @param  zip  String value for zip.
     * @param  phoneNumber  TokenResponsePhoneNumber value for phoneNumber.
     */
    public TokenResponseCardDataBilling(
            String line1,
            String line2,
            String state,
            String city,
            String country,
            String zip,
            TokenResponsePhoneNumber phoneNumber) {
        this.line1 = OptionalNullable.of(line1);
        this.line2 = OptionalNullable.of(line2);
        this.state = OptionalNullable.of(state);
        this.city = OptionalNullable.of(city);
        this.country = OptionalNullable.of(country);
        this.zip = OptionalNullable.of(zip);
        this.phoneNumber = phoneNumber;
    }

    /**
     * Initialization constructor.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  state  String value for state.
     * @param  city  String value for city.
     * @param  country  String value for country.
     * @param  zip  String value for zip.
     * @param  phoneNumber  TokenResponsePhoneNumber value for phoneNumber.
     */

    protected TokenResponseCardDataBilling(OptionalNullable<String> line1,
            OptionalNullable<String> line2, OptionalNullable<String> state,
            OptionalNullable<String> city, OptionalNullable<String> country,
            OptionalNullable<String> zip, TokenResponsePhoneNumber phoneNumber) {
        this.line1 = line1;
        this.line2 = line2;
        this.state = state;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Internal Getter for Line1.
     * Primary street address line.
     * @return Returns the Internal String
     */
    @JsonGetter("line1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLine1() {
        return this.line1;
    }

    /**
     * Getter for Line1.
     * Primary street address line.
     * @return Returns the String
     */
    public String getLine1() {
        return OptionalNullable.getFrom(line1);
    }

    /**
     * Setter for Line1.
     * Primary street address line.
     * @param line1 Value for String
     */
    @JsonSetter("line1")
    public void setLine1(String line1) {
        this.line1 = OptionalNullable.of(line1);
    }

    /**
     * UnSetter for Line1.
     * Primary street address line.
     */
    public void unsetLine1() {
        line1 = null;
    }

    /**
     * Internal Getter for Line2.
     * Secondary street address line.
     * @return Returns the Internal String
     */
    @JsonGetter("line2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLine2() {
        return this.line2;
    }

    /**
     * Getter for Line2.
     * Secondary street address line.
     * @return Returns the String
     */
    public String getLine2() {
        return OptionalNullable.getFrom(line2);
    }

    /**
     * Setter for Line2.
     * Secondary street address line.
     * @param line2 Value for String
     */
    @JsonSetter("line2")
    public void setLine2(String line2) {
        this.line2 = OptionalNullable.of(line2);
    }

    /**
     * UnSetter for Line2.
     * Secondary street address line.
     */
    public void unsetLine2() {
        line2 = null;
    }

    /**
     * Internal Getter for State.
     * State or prefecture.
     * @return Returns the Internal String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetState() {
        return this.state;
    }

    /**
     * Getter for State.
     * State or prefecture.
     * @return Returns the String
     */
    public String getState() {
        return OptionalNullable.getFrom(state);
    }

    /**
     * Setter for State.
     * State or prefecture.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = OptionalNullable.of(state);
    }

    /**
     * UnSetter for State.
     * State or prefecture.
     */
    public void unsetState() {
        state = null;
    }

    /**
     * Internal Getter for City.
     * City or locality.
     * @return Returns the Internal String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCity() {
        return this.city;
    }

    /**
     * Getter for City.
     * City or locality.
     * @return Returns the String
     */
    public String getCity() {
        return OptionalNullable.getFrom(city);
    }

    /**
     * Setter for City.
     * City or locality.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = OptionalNullable.of(city);
    }

    /**
     * UnSetter for City.
     * City or locality.
     */
    public void unsetCity() {
        city = null;
    }

    /**
     * Internal Getter for Country.
     * Country code.
     * @return Returns the Internal String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCountry() {
        return this.country;
    }

    /**
     * Getter for Country.
     * Country code.
     * @return Returns the String
     */
    public String getCountry() {
        return OptionalNullable.getFrom(country);
    }

    /**
     * Setter for Country.
     * Country code.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = OptionalNullable.of(country);
    }

    /**
     * UnSetter for Country.
     * Country code.
     */
    public void unsetCountry() {
        country = null;
    }

    /**
     * Internal Getter for Zip.
     * Postal code.
     * @return Returns the Internal String
     */
    @JsonGetter("zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetZip() {
        return this.zip;
    }

    /**
     * Getter for Zip.
     * Postal code.
     * @return Returns the String
     */
    public String getZip() {
        return OptionalNullable.getFrom(zip);
    }

    /**
     * Setter for Zip.
     * Postal code.
     * @param zip Value for String
     */
    @JsonSetter("zip")
    public void setZip(String zip) {
        this.zip = OptionalNullable.of(zip);
    }

    /**
     * UnSetter for Zip.
     * Postal code.
     */
    public void unsetZip() {
        zip = null;
    }

    /**
     * Getter for PhoneNumber.
     * Token Response Phone Number schema.
     * @return Returns the TokenResponsePhoneNumber
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponsePhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * Token Response Phone Number schema.
     * @param phoneNumber Value for TokenResponsePhoneNumber
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(TokenResponsePhoneNumber phoneNumber) {
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
     * Converts this TokenResponseCardDataBilling into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseCardDataBilling [" + "line1=" + line1 + ", line2=" + line2 + ", state="
                + state + ", city=" + city + ", country=" + country + ", zip=" + zip
                + ", phoneNumber=" + phoneNumber + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link TokenResponseCardDataBilling.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseCardDataBilling.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .phoneNumber(getPhoneNumber());
        builder.line1 = internalGetLine1();
        builder.line2 = internalGetLine2();
        builder.state = internalGetState();
        builder.city = internalGetCity();
        builder.country = internalGetCountry();
        builder.zip = internalGetZip();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseCardDataBilling}.
     */
    public static class Builder {
        private OptionalNullable<String> line1;
        private OptionalNullable<String> line2;
        private OptionalNullable<String> state;
        private OptionalNullable<String> city;
        private OptionalNullable<String> country;
        private OptionalNullable<String> zip;
        private TokenResponsePhoneNumber phoneNumber;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for line1.
         * @param  line1  String value for line1.
         * @return Builder
         */
        public Builder line1(String line1) {
            this.line1 = OptionalNullable.of(line1);
            return this;
        }

        /**
         * UnSetter for line1.
         * @return Builder
         */
        public Builder unsetLine1() {
            line1 = null;
            return this;
        }

        /**
         * Setter for line2.
         * @param  line2  String value for line2.
         * @return Builder
         */
        public Builder line2(String line2) {
            this.line2 = OptionalNullable.of(line2);
            return this;
        }

        /**
         * UnSetter for line2.
         * @return Builder
         */
        public Builder unsetLine2() {
            line2 = null;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = OptionalNullable.of(state);
            return this;
        }

        /**
         * UnSetter for state.
         * @return Builder
         */
        public Builder unsetState() {
            state = null;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = OptionalNullable.of(city);
            return this;
        }

        /**
         * UnSetter for city.
         * @return Builder
         */
        public Builder unsetCity() {
            city = null;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = OptionalNullable.of(country);
            return this;
        }

        /**
         * UnSetter for country.
         * @return Builder
         */
        public Builder unsetCountry() {
            country = null;
            return this;
        }

        /**
         * Setter for zip.
         * @param  zip  String value for zip.
         * @return Builder
         */
        public Builder zip(String zip) {
            this.zip = OptionalNullable.of(zip);
            return this;
        }

        /**
         * UnSetter for zip.
         * @return Builder
         */
        public Builder unsetZip() {
            zip = null;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  TokenResponsePhoneNumber value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(TokenResponsePhoneNumber phoneNumber) {
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
         * Builds a new {@link TokenResponseCardDataBilling} object using the set fields.
         * @return {@link TokenResponseCardDataBilling}
         */
        public TokenResponseCardDataBilling build() {
            TokenResponseCardDataBilling model =
                    new TokenResponseCardDataBilling(line1, line2, state, city, country, zip,
                            phoneNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
