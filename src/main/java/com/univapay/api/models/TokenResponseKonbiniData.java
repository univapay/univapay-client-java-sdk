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
 * This is a model class for TokenResponseKonbiniData type.
 */
public class TokenResponseKonbiniData {
    private String customerName;
    private BaseKonbiniDataConvenienceStore convenienceStore;
    private String expirationPeriod;
    private OptionalNullable<String> expirationTimeShift;
    private TokenResponsePhoneNumber phoneNumber;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseKonbiniData() {
    }

    /**
     * Initialization constructor.
     * @param  customerName  String value for customerName.
     * @param  convenienceStore  BaseKonbiniDataConvenienceStore value for convenienceStore.
     * @param  expirationPeriod  String value for expirationPeriod.
     * @param  expirationTimeShift  String value for expirationTimeShift.
     * @param  phoneNumber  TokenResponsePhoneNumber value for phoneNumber.
     */
    public TokenResponseKonbiniData(
            String customerName,
            BaseKonbiniDataConvenienceStore convenienceStore,
            String expirationPeriod,
            String expirationTimeShift,
            TokenResponsePhoneNumber phoneNumber) {
        this.customerName = customerName;
        this.convenienceStore = convenienceStore;
        this.expirationPeriod = expirationPeriod;
        this.expirationTimeShift = OptionalNullable.of(expirationTimeShift);
        this.phoneNumber = phoneNumber;
    }

    /**
     * Initialization constructor.
     * @param  customerName  String value for customerName.
     * @param  convenienceStore  BaseKonbiniDataConvenienceStore value for convenienceStore.
     * @param  expirationPeriod  String value for expirationPeriod.
     * @param  expirationTimeShift  String value for expirationTimeShift.
     * @param  phoneNumber  TokenResponsePhoneNumber value for phoneNumber.
     */

    protected TokenResponseKonbiniData(String customerName,
            BaseKonbiniDataConvenienceStore convenienceStore, String expirationPeriod,
            OptionalNullable<String> expirationTimeShift, TokenResponsePhoneNumber phoneNumber) {
        this.customerName = customerName;
        this.convenienceStore = convenienceStore;
        this.expirationPeriod = expirationPeriod;
        this.expirationTimeShift = expirationTimeShift;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for CustomerName.
     * Customer name.
     * @return Returns the String
     */
    @JsonGetter("customer_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Internal Getter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59.999999+09:00').
     * @return Returns the Internal String
     */
    @JsonGetter("expiration_time_shift")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpirationTimeShift() {
        return this.expirationTimeShift;
    }

    /**
     * Getter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59.999999+09:00').
     * @return Returns the String
     */
    public String getExpirationTimeShift() {
        return OptionalNullable.getFrom(expirationTimeShift);
    }

    /**
     * Setter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59.999999+09:00').
     * @param expirationTimeShift Value for String
     */
    @JsonSetter("expiration_time_shift")
    public void setExpirationTimeShift(String expirationTimeShift) {
        this.expirationTimeShift = OptionalNullable.of(expirationTimeShift);
    }

    /**
     * UnSetter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59.999999+09:00').
     */
    public void unsetExpirationTimeShift() {
        expirationTimeShift = null;
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
     * Converts this TokenResponseKonbiniData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseKonbiniData [" + "customerName=" + customerName + ", convenienceStore="
                + convenienceStore + ", expirationPeriod=" + expirationPeriod
                + ", expirationTimeShift=" + expirationTimeShift + ", phoneNumber=" + phoneNumber
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseKonbiniData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseKonbiniData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerName(getCustomerName())
                .convenienceStore(getConvenienceStore())
                .expirationPeriod(getExpirationPeriod())
                .phoneNumber(getPhoneNumber());
        builder.expirationTimeShift = internalGetExpirationTimeShift();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseKonbiniData}.
     */
    public static class Builder {
        private String customerName;
        private BaseKonbiniDataConvenienceStore convenienceStore;
        private String expirationPeriod;
        private OptionalNullable<String> expirationTimeShift;
        private TokenResponsePhoneNumber phoneNumber;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
            this.expirationTimeShift = OptionalNullable.of(expirationTimeShift);
            return this;
        }

        /**
         * UnSetter for expirationTimeShift.
         * @return Builder
         */
        public Builder unsetExpirationTimeShift() {
            expirationTimeShift = null;
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
         * Builds a new {@link TokenResponseKonbiniData} object using the set fields.
         * @return {@link TokenResponseKonbiniData}
         */
        public TokenResponseKonbiniData build() {
            TokenResponseKonbiniData model =
                    new TokenResponseKonbiniData(customerName, convenienceStore, expirationPeriod,
                            expirationTimeShift, phoneNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
