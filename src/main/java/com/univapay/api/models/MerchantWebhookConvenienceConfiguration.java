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
 * This is a model class for MerchantWebhookConvenienceConfiguration type.
 */
public class MerchantWebhookConvenienceConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<String> expiration;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookConvenienceConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  expiration  String value for expiration.
     */
    public MerchantWebhookConvenienceConfiguration(
            Boolean enabled,
            String expiration) {
        this.enabled = OptionalNullable.of(enabled);
        this.expiration = OptionalNullable.of(expiration);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  expiration  String value for expiration.
     */

    protected MerchantWebhookConvenienceConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<String> expiration) {
        this.enabled = enabled;
        this.expiration = expiration;
    }

    /**
     * Internal Getter for Enabled.
     * Enables convenience-store payments.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetEnabled() {
        return this.enabled;
    }

    /**
     * Getter for Enabled.
     * Enables convenience-store payments.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables convenience-store payments.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables convenience-store payments.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for Expiration.
     * ISO-8601 duration before convenience payment expiry.
     * @return Returns the Internal String
     */
    @JsonGetter("expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpiration() {
        return this.expiration;
    }

    /**
     * Getter for Expiration.
     * ISO-8601 duration before convenience payment expiry.
     * @return Returns the String
     */
    public String getExpiration() {
        return OptionalNullable.getFrom(expiration);
    }

    /**
     * Setter for Expiration.
     * ISO-8601 duration before convenience payment expiry.
     * @param expiration Value for String
     */
    @JsonSetter("expiration")
    public void setExpiration(String expiration) {
        this.expiration = OptionalNullable.of(expiration);
    }

    /**
     * UnSetter for Expiration.
     * ISO-8601 duration before convenience payment expiry.
     */
    public void unsetExpiration() {
        expiration = null;
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
     * Converts this MerchantWebhookConvenienceConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookConvenienceConfiguration [" + "enabled=" + enabled + ", expiration="
                + expiration + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookConvenienceConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookConvenienceConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.expiration = internalGetExpiration();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookConvenienceConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<String> expiration;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = OptionalNullable.of(enabled);
            return this;
        }

        /**
         * UnSetter for enabled.
         * @return Builder
         */
        public Builder unsetEnabled() {
            enabled = null;
            return this;
        }

        /**
         * Setter for expiration.
         * @param  expiration  String value for expiration.
         * @return Builder
         */
        public Builder expiration(String expiration) {
            this.expiration = OptionalNullable.of(expiration);
            return this;
        }

        /**
         * UnSetter for expiration.
         * @return Builder
         */
        public Builder unsetExpiration() {
            expiration = null;
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
         * Builds a new {@link MerchantWebhookConvenienceConfiguration} object using the set fields.
         * @return {@link MerchantWebhookConvenienceConfiguration}
         */
        public MerchantWebhookConvenienceConfiguration build() {
            MerchantWebhookConvenienceConfiguration model =
                    new MerchantWebhookConvenienceConfiguration(enabled, expiration);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
