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
 * This is a model class for TokenCreatePaidyDataShippingAddress type.
 */
public class TokenCreatePaidyDataShippingAddress {
    private String zip;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenCreatePaidyDataShippingAddress() {
    }

    /**
     * Initialization constructor.
     * @param  zip  String value for zip.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  city  String value for city.
     * @param  state  String value for state.
     */
    public TokenCreatePaidyDataShippingAddress(
            String zip,
            String line1,
            String line2,
            String city,
            String state) {
        this.zip = zip;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
    }

    /**
     * Getter for Zip.
     * Japanese postal code (e.g., '105-0011').
     * @return Returns the String
     */
    @JsonGetter("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Setter for Zip.
     * Japanese postal code (e.g., '105-0011').
     * @param zip Value for String
     */
    @JsonSetter("zip")
    public void setZip(String zip) {
        this.zip = zip;
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
     * Converts this TokenCreatePaidyDataShippingAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenCreatePaidyDataShippingAddress [" + "zip=" + zip + ", line1=" + line1
                + ", line2=" + line2 + ", city=" + city + ", state=" + state
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenCreatePaidyDataShippingAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenCreatePaidyDataShippingAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(zip)
                .line1(getLine1())
                .line2(getLine2())
                .city(getCity())
                .state(getState());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenCreatePaidyDataShippingAddress}.
     */
    public static class Builder {
        private String zip;
        private String line1;
        private String line2;
        private String city;
        private String state;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  zip  String value for zip.
         */
        public Builder(String zip) {
            this.zip = zip;
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
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
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
         * Builds a new {@link TokenCreatePaidyDataShippingAddress} object using the set fields.
         * @return {@link TokenCreatePaidyDataShippingAddress}
         */
        public TokenCreatePaidyDataShippingAddress build() {
            TokenCreatePaidyDataShippingAddress model =
                    new TokenCreatePaidyDataShippingAddress(zip, line1, line2, city, state);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
