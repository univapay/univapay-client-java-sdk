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
 * This is a model class for ChargeThreeDs type.
 */
public class ChargeThreeDs {
    private String redirectEndpoint;
    private String mode;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ChargeThreeDs() {
    }

    /**
     * Initialization constructor.
     * @param  redirectEndpoint  String value for redirectEndpoint.
     * @param  mode  String value for mode.
     */
    public ChargeThreeDs(
            String redirectEndpoint,
            String mode) {
        this.redirectEndpoint = redirectEndpoint;
        this.mode = mode;
    }

    /**
     * Getter for RedirectEndpoint.
     * Redirect endpoint URL.
     * @return Returns the String
     */
    @JsonGetter("redirect_endpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRedirectEndpoint() {
        return redirectEndpoint;
    }

    /**
     * Setter for RedirectEndpoint.
     * Redirect endpoint URL.
     * @param redirectEndpoint Value for String
     */
    @JsonSetter("redirect_endpoint")
    public void setRedirectEndpoint(String redirectEndpoint) {
        this.redirectEndpoint = redirectEndpoint;
    }

    /**
     * Getter for Mode.
     * Processing mode for the resource.
     * @return Returns the String
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Processing mode for the resource.
     * @param mode Value for String
     */
    @JsonSetter("mode")
    public void setMode(String mode) {
        this.mode = mode;
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
     * Converts this ChargeThreeDs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargeThreeDs [" + "redirectEndpoint=" + redirectEndpoint + ", mode=" + mode
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ChargeThreeDs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargeThreeDs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .redirectEndpoint(getRedirectEndpoint())
                .mode(getMode());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ChargeThreeDs}.
     */
    public static class Builder {
        private String redirectEndpoint;
        private String mode;
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
         * Setter for mode.
         * @param  mode  String value for mode.
         * @return Builder
         */
        public Builder mode(String mode) {
            this.mode = mode;
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
         * Builds a new {@link ChargeThreeDs} object using the set fields.
         * @return {@link ChargeThreeDs}
         */
        public ChargeThreeDs build() {
            ChargeThreeDs model =
                    new ChargeThreeDs(redirectEndpoint, mode);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
