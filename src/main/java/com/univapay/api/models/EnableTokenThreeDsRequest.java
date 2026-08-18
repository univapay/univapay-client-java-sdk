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
 * This is a model class for EnableTokenThreeDsRequest type.
 */
public class EnableTokenThreeDsRequest {
    private String redirectEndpoint;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public EnableTokenThreeDsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  redirectEndpoint  String value for redirectEndpoint.
     */
    public EnableTokenThreeDsRequest(
            String redirectEndpoint) {
        this.redirectEndpoint = redirectEndpoint;
    }

    /**
     * Getter for RedirectEndpoint.
     * URL to redirect the customer to after 3DS authentication.
     * @return Returns the String
     */
    @JsonGetter("redirect_endpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRedirectEndpoint() {
        return redirectEndpoint;
    }

    /**
     * Setter for RedirectEndpoint.
     * URL to redirect the customer to after 3DS authentication.
     * @param redirectEndpoint Value for String
     */
    @JsonSetter("redirect_endpoint")
    public void setRedirectEndpoint(String redirectEndpoint) {
        this.redirectEndpoint = redirectEndpoint;
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
     * Converts this EnableTokenThreeDsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EnableTokenThreeDsRequest [" + "redirectEndpoint=" + redirectEndpoint
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link EnableTokenThreeDsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EnableTokenThreeDsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .redirectEndpoint(getRedirectEndpoint());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link EnableTokenThreeDsRequest}.
     */
    public static class Builder {
        private String redirectEndpoint;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for redirectEndpoint.
         * @param  redirectEndpoint  String value for redirectEndpoint.
         * @return Builder
         */
        public Builder redirectEndpoint(String redirectEndpoint) {
            this.redirectEndpoint = redirectEndpoint;
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
         * Builds a new {@link EnableTokenThreeDsRequest} object using the set fields.
         * @return {@link EnableTokenThreeDsRequest}
         */
        public EnableTokenThreeDsRequest build() {
            EnableTokenThreeDsRequest model =
                    new EnableTokenThreeDsRequest(redirectEndpoint);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
