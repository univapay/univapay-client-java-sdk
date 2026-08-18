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
 * This is a model class for CreateCustomerIdRequest type.
 */
public class CreateCustomerIdRequest {
    private String customerId;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CreateCustomerIdRequest() {
    }

    /**
     * Initialization constructor.
     * @param  customerId  String value for customerId.
     */
    public CreateCustomerIdRequest(
            String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for CustomerId.
     * The merchant's own local identifier for the customer, used as the seed for a deterministic
     * per-store UUID.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * The merchant's own local identifier for the customer, used as the seed for a deterministic
     * per-store UUID.
     * @param customerId Value for String
     */
    @JsonSetter("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
     * Converts this CreateCustomerIdRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCustomerIdRequest [" + "customerId=" + customerId + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CreateCustomerIdRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCustomerIdRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customerId);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCustomerIdRequest}.
     */
    public static class Builder {
        private String customerId;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customerId  String value for customerId.
         */
        public Builder(String customerId) {
            this.customerId = customerId;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
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
         * Builds a new {@link CreateCustomerIdRequest} object using the set fields.
         * @return {@link CreateCustomerIdRequest}
         */
        public CreateCustomerIdRequest build() {
            CreateCustomerIdRequest model =
                    new CreateCustomerIdRequest(customerId);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
