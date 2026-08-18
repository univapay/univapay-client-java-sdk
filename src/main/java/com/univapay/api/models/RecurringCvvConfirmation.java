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
 * This is a model class for RecurringCvvConfirmation type.
 */
public class RecurringCvvConfirmation {
    private Boolean enabled;
    private OptionalNullable<List<CheckoutMoneyAmount>> threshold;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public RecurringCvvConfirmation() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  threshold  List of CheckoutMoneyAmount value for threshold.
     */
    public RecurringCvvConfirmation(
            Boolean enabled,
            List<CheckoutMoneyAmount> threshold) {
        this.enabled = enabled;
        this.threshold = OptionalNullable.of(threshold);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  threshold  List of CheckoutMoneyAmount value for threshold.
     */

    protected RecurringCvvConfirmation(Boolean enabled,
            OptionalNullable<List<CheckoutMoneyAmount>> threshold) {
        this.enabled = enabled;
        this.threshold = threshold;
    }

    /**
     * Getter for Enabled.
     * Whether CVV re-confirmation is required for recurring card charges. Resolves to `false` when
     * not configured.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether CVV re-confirmation is required for recurring card charges. Resolves to `false` when
     * not configured.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Internal Getter for Threshold.
     * Amount thresholds above which CVV re-confirmation is required. `null` when no threshold is
     * configured.
     * @return Returns the Internal List of CheckoutMoneyAmount
     */
    @JsonGetter("threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<CheckoutMoneyAmount>> internalGetThreshold() {
        return this.threshold;
    }

    /**
     * Getter for Threshold.
     * Amount thresholds above which CVV re-confirmation is required. `null` when no threshold is
     * configured.
     * @return Returns the List of CheckoutMoneyAmount
     */
    public List<CheckoutMoneyAmount> getThreshold() {
        return OptionalNullable.getFrom(threshold);
    }

    /**
     * Setter for Threshold.
     * Amount thresholds above which CVV re-confirmation is required. `null` when no threshold is
     * configured.
     * @param threshold Value for List of CheckoutMoneyAmount
     */
    @JsonSetter("threshold")
    public void setThreshold(List<CheckoutMoneyAmount> threshold) {
        this.threshold = OptionalNullable.of(threshold);
    }

    /**
     * UnSetter for Threshold.
     * Amount thresholds above which CVV re-confirmation is required. `null` when no threshold is
     * configured.
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
     * Converts this RecurringCvvConfirmation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RecurringCvvConfirmation [" + "enabled=" + enabled + ", threshold=" + threshold
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link RecurringCvvConfirmation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RecurringCvvConfirmation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled());
        builder.threshold = internalGetThreshold();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link RecurringCvvConfirmation}.
     */
    public static class Builder {
        private Boolean enabled;
        private OptionalNullable<List<CheckoutMoneyAmount>> threshold;
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
         * Setter for threshold.
         * @param  threshold  List of CheckoutMoneyAmount value for threshold.
         * @return Builder
         */
        public Builder threshold(List<CheckoutMoneyAmount> threshold) {
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
         * Builds a new {@link RecurringCvvConfirmation} object using the set fields.
         * @return {@link RecurringCvvConfirmation}
         */
        public RecurringCvvConfirmation build() {
            RecurringCvvConfirmation model =
                    new RecurringCvvConfirmation(enabled, threshold);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
