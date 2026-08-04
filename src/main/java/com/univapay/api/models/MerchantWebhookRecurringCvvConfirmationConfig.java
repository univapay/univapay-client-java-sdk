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
import java.util.List;
import java.util.Map;

/**
 * This is a model class for MerchantWebhookRecurringCvvConfirmationConfig type.
 */
public class MerchantWebhookRecurringCvvConfirmationConfig {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<List<MerchantWebhookMoneyAmount>> threshold;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookRecurringCvvConfirmationConfig() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  threshold  List of MerchantWebhookMoneyAmount value for threshold.
     */
    public MerchantWebhookRecurringCvvConfirmationConfig(
            Boolean enabled,
            List<MerchantWebhookMoneyAmount> threshold) {
        this.enabled = OptionalNullable.of(enabled);
        this.threshold = OptionalNullable.of(threshold);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  threshold  List of MerchantWebhookMoneyAmount value for threshold.
     */

    protected MerchantWebhookRecurringCvvConfirmationConfig(OptionalNullable<Boolean> enabled,
            OptionalNullable<List<MerchantWebhookMoneyAmount>> threshold) {
        this.enabled = enabled;
        this.threshold = threshold;
    }

    /**
     * Internal Getter for Enabled.
     * Enables recurring-charge CVV confirmation checks.
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
     * Enables recurring-charge CVV confirmation checks.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables recurring-charge CVV confirmation checks.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables recurring-charge CVV confirmation checks.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for Threshold.
     * Amount thresholds that trigger CVV confirmation.
     * @return Returns the Internal List of MerchantWebhookMoneyAmount
     */
    @JsonGetter("threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<MerchantWebhookMoneyAmount>> internalGetThreshold() {
        return this.threshold;
    }

    /**
     * Getter for Threshold.
     * Amount thresholds that trigger CVV confirmation.
     * @return Returns the List of MerchantWebhookMoneyAmount
     */
    public List<MerchantWebhookMoneyAmount> getThreshold() {
        return OptionalNullable.getFrom(threshold);
    }

    /**
     * Setter for Threshold.
     * Amount thresholds that trigger CVV confirmation.
     * @param threshold Value for List of MerchantWebhookMoneyAmount
     */
    @JsonSetter("threshold")
    public void setThreshold(List<MerchantWebhookMoneyAmount> threshold) {
        this.threshold = OptionalNullable.of(threshold);
    }

    /**
     * UnSetter for Threshold.
     * Amount thresholds that trigger CVV confirmation.
     */
    public void unsetThreshold() {
        threshold = null;
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
     * Converts this MerchantWebhookRecurringCvvConfirmationConfig into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookRecurringCvvConfirmationConfig [" + "enabled=" + enabled
                + ", threshold=" + threshold + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookRecurringCvvConfirmationConfig.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookRecurringCvvConfirmationConfig.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.threshold = internalGetThreshold();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookRecurringCvvConfirmationConfig}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<List<MerchantWebhookMoneyAmount>> threshold;
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
         * Setter for threshold.
         * @param  threshold  List of MerchantWebhookMoneyAmount value for threshold.
         * @return Builder
         */
        public Builder threshold(List<MerchantWebhookMoneyAmount> threshold) {
            this.threshold = OptionalNullable.of(threshold);
            return this;
        }

        /**
         * UnSetter for threshold.
         * @return Builder
         */
        public Builder unsetThreshold() {
            threshold = null;
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
         * Builds a new {@link MerchantWebhookRecurringCvvConfirmationConfig} object using the set
         * fields.
         * @return {@link MerchantWebhookRecurringCvvConfirmationConfig}
         */
        public MerchantWebhookRecurringCvvConfirmationConfig build() {
            MerchantWebhookRecurringCvvConfirmationConfig model =
                    new MerchantWebhookRecurringCvvConfirmationConfig(enabled, threshold);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
