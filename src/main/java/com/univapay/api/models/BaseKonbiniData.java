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
 * This is a model class for BaseKonbiniData type.
 */
public class BaseKonbiniData {
    private String customerName;
    private BaseKonbiniDataConvenienceStore convenienceStore;
    private String expirationPeriod;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public BaseKonbiniData() {
    }

    /**
     * Initialization constructor.
     * @param  customerName  String value for customerName.
     * @param  convenienceStore  BaseKonbiniDataConvenienceStore value for convenienceStore.
     * @param  expirationPeriod  String value for expirationPeriod.
     */
    public BaseKonbiniData(
            String customerName,
            BaseKonbiniDataConvenienceStore convenienceStore,
            String expirationPeriod) {
        this.customerName = customerName;
        this.convenienceStore = convenienceStore;
        this.expirationPeriod = expirationPeriod;
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
     * Converts this BaseKonbiniData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BaseKonbiniData [" + "customerName=" + customerName + ", convenienceStore="
                + convenienceStore + ", expirationPeriod=" + expirationPeriod
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link BaseKonbiniData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BaseKonbiniData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerName(getCustomerName())
                .convenienceStore(getConvenienceStore())
                .expirationPeriod(getExpirationPeriod());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link BaseKonbiniData}.
     */
    public static class Builder {
        private String customerName;
        private BaseKonbiniDataConvenienceStore convenienceStore;
        private String expirationPeriod;
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
         * Builds a new {@link BaseKonbiniData} object using the set fields.
         * @return {@link BaseKonbiniData}
         */
        public BaseKonbiniData build() {
            BaseKonbiniData model =
                    new BaseKonbiniData(customerName, convenienceStore, expirationPeriod);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
