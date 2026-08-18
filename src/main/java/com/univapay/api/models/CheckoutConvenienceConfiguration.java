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
 * This is a model class for CheckoutConvenienceConfiguration type.
 */
public class CheckoutConvenienceConfiguration {
    private Boolean enabled;
    private String expiration;
    private ExpirationTimeShift expirationTimeShift;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutConvenienceConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  expiration  String value for expiration.
     * @param  expirationTimeShift  ExpirationTimeShift value for expirationTimeShift.
     */
    public CheckoutConvenienceConfiguration(
            Boolean enabled,
            String expiration,
            ExpirationTimeShift expirationTimeShift) {
        this.enabled = enabled;
        this.expiration = expiration;
        this.expirationTimeShift = expirationTimeShift;
    }

    /**
     * Getter for Enabled.
     * Whether convenience-store payments are enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether convenience-store payments are enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for Expiration.
     * ISO-8601 duration before a convenience-store payment expires.
     * @return Returns the String
     */
    @JsonGetter("expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiration() {
        return expiration;
    }

    /**
     * Setter for Expiration.
     * ISO-8601 duration before a convenience-store payment expires.
     * @param expiration Value for String
     */
    @JsonSetter("expiration")
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * Getter for ExpirationTimeShift.
     * Time-of-day override applied when calculating expirations, shared by convenience-store and
     * bank-transfer configuration.
     * @return Returns the ExpirationTimeShift
     */
    @JsonGetter("expiration_time_shift")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExpirationTimeShift getExpirationTimeShift() {
        return expirationTimeShift;
    }

    /**
     * Setter for ExpirationTimeShift.
     * Time-of-day override applied when calculating expirations, shared by convenience-store and
     * bank-transfer configuration.
     * @param expirationTimeShift Value for ExpirationTimeShift
     */
    @JsonSetter("expiration_time_shift")
    public void setExpirationTimeShift(ExpirationTimeShift expirationTimeShift) {
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
     * Converts this CheckoutConvenienceConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutConvenienceConfiguration [" + "enabled=" + enabled + ", expiration="
                + expiration + ", expirationTimeShift=" + expirationTimeShift
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutConvenienceConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutConvenienceConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled())
                .expiration(getExpiration())
                .expirationTimeShift(getExpirationTimeShift());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutConvenienceConfiguration}.
     */
    public static class Builder {
        private Boolean enabled;
        private String expiration;
        private ExpirationTimeShift expirationTimeShift;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for expiration.
         * @param  expiration  String value for expiration.
         * @return Builder
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * Setter for expirationTimeShift.
         * @param  expirationTimeShift  ExpirationTimeShift value for expirationTimeShift.
         * @return Builder
         */
        public Builder expirationTimeShift(ExpirationTimeShift expirationTimeShift) {
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
         * Builds a new {@link CheckoutConvenienceConfiguration} object using the set fields.
         * @return {@link CheckoutConvenienceConfiguration}
         */
        public CheckoutConvenienceConfiguration build() {
            CheckoutConvenienceConfiguration model =
                    new CheckoutConvenienceConfiguration(enabled, expiration, expirationTimeShift);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
