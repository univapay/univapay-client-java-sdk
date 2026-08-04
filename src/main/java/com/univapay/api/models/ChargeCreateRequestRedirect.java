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
 * This is a model class for ChargeCreateRequestRedirect type.
 */
public class ChargeCreateRequestRedirect {
    private String endpoint;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ChargeCreateRequestRedirect() {
    }

    /**
     * Initialization constructor.
     * @param  endpoint  String value for endpoint.
     */
    public ChargeCreateRequestRedirect(
            String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Getter for Endpoint.
     * URL to redirect the customer to after payment completion.
     * @return Returns the String
     */
    @JsonGetter("endpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Setter for Endpoint.
     * URL to redirect the customer to after payment completion.
     * @param endpoint Value for String
     */
    @JsonSetter("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
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
     * Converts this ChargeCreateRequestRedirect into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargeCreateRequestRedirect [" + "endpoint=" + endpoint + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ChargeCreateRequestRedirect.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargeCreateRequestRedirect.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .endpoint(getEndpoint());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ChargeCreateRequestRedirect}.
     */
    public static class Builder {
        private String endpoint;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for endpoint.
         * @param  endpoint  String value for endpoint.
         * @return Builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
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
         * Builds a new {@link ChargeCreateRequestRedirect} object using the set fields.
         * @return {@link ChargeCreateRequestRedirect}
         */
        public ChargeCreateRequestRedirect build() {
            ChargeCreateRequestRedirect model =
                    new ChargeCreateRequestRedirect(endpoint);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
