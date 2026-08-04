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
 * This is a model class for TokenCreateKonbiniData type.
 */
public class TokenCreateKonbiniData {
    private String customerName;
    private BaseKonbiniDataConvenienceStore convenienceStore;
    private String expirationPeriod;
    private TokenCreatePhoneNumber phoneNumber;
    private String expirationTimeShift;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenCreateKonbiniData() {
    }

    /**
     * Initialization constructor.
     * @param  customerName  String value for customerName.
     * @param  convenienceStore  BaseKonbiniDataConvenienceStore value for convenienceStore.
     * @param  phoneNumber  TokenCreatePhoneNumber value for phoneNumber.
     * @param  expirationPeriod  String value for expirationPeriod.
     * @param  expirationTimeShift  String value for expirationTimeShift.
     */
    public TokenCreateKonbiniData(
            String customerName,
            BaseKonbiniDataConvenienceStore convenienceStore,
            TokenCreatePhoneNumber phoneNumber,
            String expirationPeriod,
            String expirationTimeShift) {
        this.customerName = customerName;
        this.convenienceStore = convenienceStore;
        this.expirationPeriod = expirationPeriod;
        this.phoneNumber = phoneNumber;
        this.expirationTimeShift = expirationTimeShift;
    }

    /**
     * Initialization constructor.
     * @param  customerName  String value for customerName.
     * @param  convenienceStore  BaseKonbiniDataConvenienceStore value for convenienceStore.
     * @param  phoneNumber  TokenCreatePhoneNumber value for phoneNumber.
     */
    @JsonCreator
    protected TokenCreateKonbiniData(
            @JsonProperty("customer_name") String customerName,
            @JsonProperty("convenience_store") BaseKonbiniDataConvenienceStore convenienceStore,
            @JsonProperty("phone_number") TokenCreatePhoneNumber phoneNumber) {
        this(customerName, convenienceStore, phoneNumber, null, null);
    }

    /**
     * Getter for CustomerName.
     * Customer name.
     * @return Returns the String
     */
    @JsonGetter("customer_name")
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter for CustomerName.
     * Customer name.
     * @param customerName Value for String
     */
    @JsonSetter("customer_name")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Getter for ConvenienceStore.
     * Base Konbini Data Convenience Store schema.
     * @return Returns the BaseKonbiniDataConvenienceStore
     */
    @JsonGetter("convenience_store")
    public BaseKonbiniDataConvenienceStore getConvenienceStore() {
        return convenienceStore;
    }

    /**
     * Setter for ConvenienceStore.
     * Base Konbini Data Convenience Store schema.
     * @param convenienceStore Value for BaseKonbiniDataConvenienceStore
     */
    @JsonSetter("convenience_store")
    public void setConvenienceStore(BaseKonbiniDataConvenienceStore convenienceStore) {
        this.convenienceStore = convenienceStore;
    }

    /**
     * Getter for ExpirationPeriod.
     * ISO-8601 Duration (e.g., 'P7D'). Default is 30 days.
     * @return Returns the String
     */
    @JsonGetter("expiration_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Setter for ExpirationPeriod.
     * ISO-8601 Duration (e.g., 'P7D'). Default is 30 days.
     * @param expirationPeriod Value for String
     */
    @JsonSetter("expiration_period")
    public void setExpirationPeriod(String expirationPeriod) {
        this.expirationPeriod = expirationPeriod;
    }

    /**
     * Getter for PhoneNumber.
     * Token Create Phone Number schema.
     * @return Returns the TokenCreatePhoneNumber
     */
    @JsonGetter("phone_number")
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
     * Getter for ExpirationTimeShift.
     * Expiration time shift value.
     * @return Returns the String
     */
    @JsonGetter("expiration_time_shift")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationTimeShift() {
        return expirationTimeShift;
    }

    /**
     * Setter for ExpirationTimeShift.
     * Expiration time shift value.
     * @param expirationTimeShift Value for String
     */
    @JsonSetter("expiration_time_shift")
    public void setExpirationTimeShift(String expirationTimeShift) {
        this.expirationTimeShift = expirationTimeShift;
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
     * Converts this TokenCreateKonbiniData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenCreateKonbiniData [" + "customerName=" + customerName + ", convenienceStore="
                + convenienceStore + ", phoneNumber=" + phoneNumber + ", expirationPeriod="
                + expirationPeriod + ", expirationTimeShift=" + expirationTimeShift
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenCreateKonbiniData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenCreateKonbiniData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customerName, convenienceStore, phoneNumber)
                .expirationPeriod(getExpirationPeriod())
                .expirationTimeShift(getExpirationTimeShift());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenCreateKonbiniData}.
     */
    public static class Builder {
        private String customerName;
        private BaseKonbiniDataConvenienceStore convenienceStore;
        private TokenCreatePhoneNumber phoneNumber;
        private String expirationPeriod;
        private String expirationTimeShift;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customerName  String value for customerName.
         * @param  convenienceStore  BaseKonbiniDataConvenienceStore value for convenienceStore.
         * @param  phoneNumber  TokenCreatePhoneNumber value for phoneNumber.
         */
        public Builder(String customerName, BaseKonbiniDataConvenienceStore convenienceStore,
                TokenCreatePhoneNumber phoneNumber) {
            this.customerName = customerName;
            this.convenienceStore = convenienceStore;
            this.phoneNumber = phoneNumber;
        }

        /**
         * Setter for customerName.
         * @param  customerName  String value for customerName.
         * @return Builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        /**
         * Setter for convenienceStore.
         * @param  convenienceStore  BaseKonbiniDataConvenienceStore value for convenienceStore.
         * @return Builder
         */
        public Builder convenienceStore(BaseKonbiniDataConvenienceStore convenienceStore) {
            this.convenienceStore = convenienceStore;
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
         * Builds a new {@link TokenCreateKonbiniData} object using the set fields.
         * @return {@link TokenCreateKonbiniData}
         */
        public TokenCreateKonbiniData build() {
            TokenCreateKonbiniData model =
                    new TokenCreateKonbiniData(customerName, convenienceStore, phoneNumber,
                            expirationPeriod, expirationTimeShift);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
