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
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TokenCreateBankTransferData type.
 */
public class TokenCreateBankTransferData {
    private String brand;
    private String expirationPeriod;
    private String expirationTimeShift;
    private String name;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenCreateBankTransferData() {
    }

    /**
     * Initialization constructor.
     * @param  brand  String value for brand.
     * @param  expirationPeriod  String value for expirationPeriod.
     * @param  expirationTimeShift  String value for expirationTimeShift.
     * @param  name  String value for name.
     */
    public TokenCreateBankTransferData(
            String brand,
            String expirationPeriod,
            String expirationTimeShift,
            String name) {
        this.brand = brand;
        this.expirationPeriod = expirationPeriod;
        this.expirationTimeShift = expirationTimeShift;
        this.name = name;
    }

    /**
     * Initialization constructor.
     * @param  brand  String value for brand.
     */
    @JsonCreator
    protected TokenCreateBankTransferData(
            @JsonProperty("brand") String brand) {
        this(brand, null, null, null);
    }

    /**
     * Getter for Brand.
     * The bank brand identifier (e.g., 'aozora_bank').
     * @return Returns the String
     */
    @JsonGetter("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * The bank brand identifier (e.g., 'aozora_bank').
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for ExpirationPeriod.
     * ISO 8601 duration format (e.g., 'PT168H').
     * @return Returns the String
     */
    @JsonGetter("expiration_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Setter for ExpirationPeriod.
     * ISO 8601 duration format (e.g., 'PT168H').
     * @param expirationPeriod Value for String
     */
    @JsonSetter("expiration_period")
    public void setExpirationPeriod(String expirationPeriod) {
        this.expirationPeriod = expirationPeriod;
    }

    /**
     * Getter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59+09:00').
     * @return Returns the String
     */
    @JsonGetter("expiration_time_shift")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationTimeShift() {
        return expirationTimeShift;
    }

    /**
     * Setter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59+09:00').
     * @param expirationTimeShift Value for String
     */
    @JsonSetter("expiration_time_shift")
    public void setExpirationTimeShift(String expirationTimeShift) {
        this.expirationTimeShift = expirationTimeShift;
    }

    /**
     * Getter for Name.
     * The name of the customer initiating the transfer.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the customer initiating the transfer.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Converts this TokenCreateBankTransferData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenCreateBankTransferData [" + "brand=" + brand + ", expirationPeriod="
                + expirationPeriod + ", expirationTimeShift=" + expirationTimeShift + ", name="
                + name + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenCreateBankTransferData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenCreateBankTransferData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(brand)
                .expirationPeriod(getExpirationPeriod())
                .expirationTimeShift(getExpirationTimeShift())
                .name(getName());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenCreateBankTransferData}.
     */
    public static class Builder {
        private String brand;
        private String expirationPeriod;
        private String expirationTimeShift;
        private String name;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  brand  String value for brand.
         */
        public Builder(String brand) {
            this.brand = brand;
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
         * Setter for expirationPeriod.
         * @param  expirationPeriod  String value for expirationPeriod.
         * @return Builder
         */
        public Builder expirationPeriod(String expirationPeriod) {
            this.expirationPeriod = expirationPeriod;
            return this;
        }

        /**
         * Setter for expirationTimeShift.
         * @param  expirationTimeShift  String value for expirationTimeShift.
         * @return Builder
         */
        public Builder expirationTimeShift(String expirationTimeShift) {
            this.expirationTimeShift = expirationTimeShift;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Builds a new {@link TokenCreateBankTransferData} object using the set fields.
         * @return {@link TokenCreateBankTransferData}
         */
        public TokenCreateBankTransferData build() {
            TokenCreateBankTransferData model =
                    new TokenCreateBankTransferData(brand, expirationPeriod, expirationTimeShift,
                            name);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
