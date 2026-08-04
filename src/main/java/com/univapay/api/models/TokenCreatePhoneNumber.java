/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TokenCreatePhoneNumber type.
 */
public class TokenCreatePhoneNumber {
    private String countryCode;
    private String localNumber;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenCreatePhoneNumber() {
    }

    /**
     * Initialization constructor.
     * @param  countryCode  String value for countryCode.
     * @param  localNumber  String value for localNumber.
     */
    public TokenCreatePhoneNumber(
            String countryCode,
            String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    /**
     * Getter for CountryCode.
     * Country code as string (e.g., '1' or '81').
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * Country code as string (e.g., '1' or '81').
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for LocalNumber.
     * Local phone number.
     * @return Returns the String
     */
    @JsonGetter("local_number")
    public String getLocalNumber() {
        return localNumber;
    }

    /**
     * Setter for LocalNumber.
     * Local phone number.
     * @param localNumber Value for String
     */
    @JsonSetter("local_number")
    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
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
     * Converts this TokenCreatePhoneNumber into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenCreatePhoneNumber [" + "countryCode=" + countryCode + ", localNumber="
                + localNumber + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenCreatePhoneNumber.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenCreatePhoneNumber.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(countryCode, localNumber);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenCreatePhoneNumber}.
     */
    public static class Builder {
        private String countryCode;
        private String localNumber;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  countryCode  String value for countryCode.
         * @param  localNumber  String value for localNumber.
         */
        public Builder(String countryCode, String localNumber) {
            this.countryCode = countryCode;
            this.localNumber = localNumber;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for localNumber.
         * @param  localNumber  String value for localNumber.
         * @return Builder
         */
        public Builder localNumber(String localNumber) {
            this.localNumber = localNumber;
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
         * Builds a new {@link TokenCreatePhoneNumber} object using the set fields.
         * @return {@link TokenCreatePhoneNumber}
         */
        public TokenCreatePhoneNumber build() {
            TokenCreatePhoneNumber model =
                    new TokenCreatePhoneNumber(countryCode, localNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
