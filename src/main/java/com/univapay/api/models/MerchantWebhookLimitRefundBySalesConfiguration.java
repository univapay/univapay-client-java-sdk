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
 * This is a model class for MerchantWebhookLimitRefundBySalesConfiguration type.
 */
public class MerchantWebhookLimitRefundBySalesConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<String> period;
    private OptionalNullable<Boolean> rollingWindow;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookLimitRefundBySalesConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  period  String value for period.
     * @param  rollingWindow  Boolean value for rollingWindow.
     */
    public MerchantWebhookLimitRefundBySalesConfiguration(
            Boolean enabled,
            String period,
            Boolean rollingWindow) {
        this.enabled = OptionalNullable.of(enabled);
        this.period = OptionalNullable.of(period);
        this.rollingWindow = OptionalNullable.of(rollingWindow);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  period  String value for period.
     * @param  rollingWindow  Boolean value for rollingWindow.
     */

    protected MerchantWebhookLimitRefundBySalesConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<String> period, OptionalNullable<Boolean> rollingWindow) {
        this.enabled = enabled;
        this.period = period;
        this.rollingWindow = rollingWindow;
    }

    /**
     * Internal Getter for Enabled.
     * Enables sales-based refund limit checks.
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
     * Enables sales-based refund limit checks.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables sales-based refund limit checks.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables sales-based refund limit checks.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for Period.
     * Sales aggregation period used to evaluate refund limits.
     * @return Returns the Internal String
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPeriod() {
        return this.period;
    }

    /**
     * Getter for Period.
     * Sales aggregation period used to evaluate refund limits.
     * @return Returns the String
     */
    public String getPeriod() {
        return OptionalNullable.getFrom(period);
    }

    /**
     * Setter for Period.
     * Sales aggregation period used to evaluate refund limits.
     * @param period Value for String
     */
    @JsonSetter("period")
    public void setPeriod(String period) {
        this.period = OptionalNullable.of(period);
    }

    /**
     * UnSetter for Period.
     * Sales aggregation period used to evaluate refund limits.
     */
    public void unsetPeriod() {
        period = null;
    }

    /**
     * Internal Getter for RollingWindow.
     * Uses a rolling window instead of fixed calendar periods.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("rolling_window")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetRollingWindow() {
        return this.rollingWindow;
    }

    /**
     * Getter for RollingWindow.
     * Uses a rolling window instead of fixed calendar periods.
     * @return Returns the Boolean
     */
    public Boolean getRollingWindow() {
        return OptionalNullable.getFrom(rollingWindow);
    }

    /**
     * Setter for RollingWindow.
     * Uses a rolling window instead of fixed calendar periods.
     * @param rollingWindow Value for Boolean
     */
    @JsonSetter("rolling_window")
    public void setRollingWindow(Boolean rollingWindow) {
        this.rollingWindow = OptionalNullable.of(rollingWindow);
    }

    /**
     * UnSetter for RollingWindow.
     * Uses a rolling window instead of fixed calendar periods.
     */
    public void unsetRollingWindow() {
        rollingWindow = null;
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
     * Converts this MerchantWebhookLimitRefundBySalesConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookLimitRefundBySalesConfiguration [" + "enabled=" + enabled
                + ", period=" + period + ", rollingWindow=" + rollingWindow
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookLimitRefundBySalesConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookLimitRefundBySalesConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.period = internalGetPeriod();
        builder.rollingWindow = internalGetRollingWindow();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookLimitRefundBySalesConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<String> period;
        private OptionalNullable<Boolean> rollingWindow;
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
         * Setter for period.
         * @param  period  String value for period.
         * @return Builder
         */
        public Builder period(String period) {
            this.period = OptionalNullable.of(period);
            return this;
        }

        /**
         * UnSetter for period.
         * @return Builder
         */
        public Builder unsetPeriod() {
            period = null;
            return this;
        }

        /**
         * Setter for rollingWindow.
         * @param  rollingWindow  Boolean value for rollingWindow.
         * @return Builder
         */
        public Builder rollingWindow(Boolean rollingWindow) {
            this.rollingWindow = OptionalNullable.of(rollingWindow);
            return this;
        }

        /**
         * UnSetter for rollingWindow.
         * @return Builder
         */
        public Builder unsetRollingWindow() {
            rollingWindow = null;
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
         * Builds a new {@link MerchantWebhookLimitRefundBySalesConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookLimitRefundBySalesConfiguration}
         */
        public MerchantWebhookLimitRefundBySalesConfiguration build() {
            MerchantWebhookLimitRefundBySalesConfiguration model =
                    new MerchantWebhookLimitRefundBySalesConfiguration(enabled, period,
                            rollingWindow);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
