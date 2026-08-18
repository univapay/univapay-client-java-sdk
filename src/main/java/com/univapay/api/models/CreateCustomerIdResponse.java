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
import java.util.UUID;

/**
 * This is a model class for CreateCustomerIdResponse type.
 */
public class CreateCustomerIdResponse {
    private UUID customerId;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CreateCustomerIdResponse() {
    }

    /**
     * Initialization constructor.
     * @param  customerId  UUID value for customerId.
     */
    public CreateCustomerIdResponse(
            UUID customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for CustomerId.
     * Deterministic UUID derived from the store and the supplied local `customer_id`. Identical for
     * repeated calls with the same inputs.
     * @return Returns the UUID
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * Deterministic UUID derived from the store and the supplied local `customer_id`. Identical for
     * repeated calls with the same inputs.
     * @param customerId Value for UUID
     */
    @JsonSetter("customer_id")
    public void setCustomerId(UUID customerId) {
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
     * Converts this CreateCustomerIdResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCustomerIdResponse [" + "customerId=" + customerId + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CreateCustomerIdResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCustomerIdResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerId(getCustomerId());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCustomerIdResponse}.
     */
    public static class Builder {
        private UUID customerId;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for customerId.
         * @param  customerId  UUID value for customerId.
         * @return Builder
         */
        public Builder customerId(UUID customerId) {
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
         * Builds a new {@link CreateCustomerIdResponse} object using the set fields.
         * @return {@link CreateCustomerIdResponse}
         */
        public CreateCustomerIdResponse build() {
            CreateCustomerIdResponse model =
                    new CreateCustomerIdResponse(customerId);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
