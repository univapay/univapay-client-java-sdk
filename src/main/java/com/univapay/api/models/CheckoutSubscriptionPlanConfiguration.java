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
 * This is a model class for CheckoutSubscriptionPlanConfiguration type.
 */
public class CheckoutSubscriptionPlanConfiguration {
    private Boolean enabled;
    private Boolean fixedCycle;
    private Boolean fixedCycleAmount;
    private List<CheckoutPaymentType> supportedPaymentTypes;
    private OptionalNullable<CheckoutMoneyAmount> minChargeAmount;
    private OptionalNullable<String> maxPayoutPeriod;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutSubscriptionPlanConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  fixedCycle  Boolean value for fixedCycle.
     * @param  fixedCycleAmount  Boolean value for fixedCycleAmount.
     * @param  supportedPaymentTypes  List of CheckoutPaymentType value for supportedPaymentTypes.
     * @param  minChargeAmount  CheckoutMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     */
    public CheckoutSubscriptionPlanConfiguration(
            Boolean enabled,
            Boolean fixedCycle,
            Boolean fixedCycleAmount,
            List<CheckoutPaymentType> supportedPaymentTypes,
            CheckoutMoneyAmount minChargeAmount,
            String maxPayoutPeriod) {
        this.enabled = enabled;
        this.fixedCycle = fixedCycle;
        this.fixedCycleAmount = fixedCycleAmount;
        this.supportedPaymentTypes = supportedPaymentTypes;
        this.minChargeAmount = OptionalNullable.of(minChargeAmount);
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  fixedCycle  Boolean value for fixedCycle.
     * @param  fixedCycleAmount  Boolean value for fixedCycleAmount.
     * @param  supportedPaymentTypes  List of CheckoutPaymentType value for supportedPaymentTypes.
     * @param  minChargeAmount  CheckoutMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     */

    protected CheckoutSubscriptionPlanConfiguration(Boolean enabled, Boolean fixedCycle,
            Boolean fixedCycleAmount, List<CheckoutPaymentType> supportedPaymentTypes,
            OptionalNullable<CheckoutMoneyAmount> minChargeAmount,
            OptionalNullable<String> maxPayoutPeriod) {
        this.enabled = enabled;
        this.fixedCycle = fixedCycle;
        this.fixedCycleAmount = fixedCycleAmount;
        this.supportedPaymentTypes = supportedPaymentTypes;
        this.minChargeAmount = minChargeAmount;
        this.maxPayoutPeriod = maxPayoutPeriod;
    }

    /**
     * Getter for Enabled.
     * Whether subscription plans are enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether subscription plans are enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for FixedCycle.
     * Whether fixed-cycle subscription plans are allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("fixed_cycle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFixedCycle() {
        return fixedCycle;
    }

    /**
     * Setter for FixedCycle.
     * Whether fixed-cycle subscription plans are allowed.
     * @param fixedCycle Value for Boolean
     */
    @JsonSetter("fixed_cycle")
    public void setFixedCycle(Boolean fixedCycle) {
        this.fixedCycle = fixedCycle;
    }

    /**
     * Getter for FixedCycleAmount.
     * Whether fixed-cycle-amount subscription plans are allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("fixed_cycle_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFixedCycleAmount() {
        return fixedCycleAmount;
    }

    /**
     * Setter for FixedCycleAmount.
     * Whether fixed-cycle-amount subscription plans are allowed.
     * @param fixedCycleAmount Value for Boolean
     */
    @JsonSetter("fixed_cycle_amount")
    public void setFixedCycleAmount(Boolean fixedCycleAmount) {
        this.fixedCycleAmount = fixedCycleAmount;
    }

    /**
     * Getter for SupportedPaymentTypes.
     * Payment types eligible for subscription plans.
     * @return Returns the List of CheckoutPaymentType
     */
    @JsonGetter("supported_payment_types")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CheckoutPaymentType> getSupportedPaymentTypes() {
        return supportedPaymentTypes;
    }

    /**
     * Setter for SupportedPaymentTypes.
     * Payment types eligible for subscription plans.
     * @param supportedPaymentTypes Value for List of CheckoutPaymentType
     */
    @JsonSetter("supported_payment_types")
    public void setSupportedPaymentTypes(List<CheckoutPaymentType> supportedPaymentTypes) {
        this.supportedPaymentTypes = supportedPaymentTypes;
    }

    /**
     * Internal Getter for MinChargeAmount.
     * Minimum charge amount eligible for subscription plans. `null` when unrestricted.
     * @return Returns the Internal CheckoutMoneyAmount
     */
    @JsonGetter("min_charge_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CheckoutMoneyAmount> internalGetMinChargeAmount() {
        return this.minChargeAmount;
    }

    /**
     * Getter for MinChargeAmount.
     * Minimum charge amount eligible for subscription plans. `null` when unrestricted.
     * @return Returns the CheckoutMoneyAmount
     */
    public CheckoutMoneyAmount getMinChargeAmount() {
        return OptionalNullable.getFrom(minChargeAmount);
    }

    /**
     * Setter for MinChargeAmount.
     * Minimum charge amount eligible for subscription plans. `null` when unrestricted.
     * @param minChargeAmount Value for CheckoutMoneyAmount
     */
    @JsonSetter("min_charge_amount")
    public void setMinChargeAmount(CheckoutMoneyAmount minChargeAmount) {
        this.minChargeAmount = OptionalNullable.of(minChargeAmount);
    }

    /**
     * UnSetter for MinChargeAmount.
     * Minimum charge amount eligible for subscription plans. `null` when unrestricted.
     */
    public void unsetMinChargeAmount() {
        minChargeAmount = null;
    }

    /**
     * Internal Getter for MaxPayoutPeriod.
     * ISO-8601 period bounding the maximum payout delay for subscription settlements. `null` when
     * unrestricted.
     * @return Returns the Internal String
     */
    @JsonGetter("max_payout_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMaxPayoutPeriod() {
        return this.maxPayoutPeriod;
    }

    /**
     * Getter for MaxPayoutPeriod.
     * ISO-8601 period bounding the maximum payout delay for subscription settlements. `null` when
     * unrestricted.
     * @return Returns the String
     */
    public String getMaxPayoutPeriod() {
        return OptionalNullable.getFrom(maxPayoutPeriod);
    }

    /**
     * Setter for MaxPayoutPeriod.
     * ISO-8601 period bounding the maximum payout delay for subscription settlements. `null` when
     * unrestricted.
     * @param maxPayoutPeriod Value for String
     */
    @JsonSetter("max_payout_period")
    public void setMaxPayoutPeriod(String maxPayoutPeriod) {
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
    }

    /**
     * UnSetter for MaxPayoutPeriod.
     * ISO-8601 period bounding the maximum payout delay for subscription settlements. `null` when
     * unrestricted.
     */
    public void unsetMaxPayoutPeriod() {
        maxPayoutPeriod = null;
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
     * Converts this CheckoutSubscriptionPlanConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutSubscriptionPlanConfiguration [" + "enabled=" + enabled + ", fixedCycle="
                + fixedCycle + ", fixedCycleAmount=" + fixedCycleAmount + ", supportedPaymentTypes="
                + supportedPaymentTypes + ", minChargeAmount=" + minChargeAmount
                + ", maxPayoutPeriod=" + maxPayoutPeriod + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutSubscriptionPlanConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutSubscriptionPlanConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled())
                .fixedCycle(getFixedCycle())
                .fixedCycleAmount(getFixedCycleAmount())
                .supportedPaymentTypes(getSupportedPaymentTypes());
        builder.minChargeAmount = internalGetMinChargeAmount();
        builder.maxPayoutPeriod = internalGetMaxPayoutPeriod();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutSubscriptionPlanConfiguration}.
     */
    public static class Builder {
        private Boolean enabled;
        private Boolean fixedCycle;
        private Boolean fixedCycleAmount;
        private List<CheckoutPaymentType> supportedPaymentTypes;
        private OptionalNullable<CheckoutMoneyAmount> minChargeAmount;
        private OptionalNullable<String> maxPayoutPeriod;
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
         * Setter for fixedCycle.
         * @param  fixedCycle  Boolean value for fixedCycle.
         * @return Builder
         */
        public Builder fixedCycle(Boolean fixedCycle) {
            this.fixedCycle = fixedCycle;
            return this;
        }

        /**
         * Setter for fixedCycleAmount.
         * @param  fixedCycleAmount  Boolean value for fixedCycleAmount.
         * @return Builder
         */
        public Builder fixedCycleAmount(Boolean fixedCycleAmount) {
            this.fixedCycleAmount = fixedCycleAmount;
            return this;
        }

        /**
         * Setter for supportedPaymentTypes.
         * @param  supportedPaymentTypes  List of CheckoutPaymentType value for
         *         supportedPaymentTypes.
         * @return Builder
         */
        public Builder supportedPaymentTypes(List<CheckoutPaymentType> supportedPaymentTypes) {
            this.supportedPaymentTypes = supportedPaymentTypes;
            return this;
        }

        /**
         * Setter for minChargeAmount.
         * @param  minChargeAmount  CheckoutMoneyAmount value for minChargeAmount.
         * @return Builder
         */
        public Builder minChargeAmount(CheckoutMoneyAmount minChargeAmount) {
            this.minChargeAmount = OptionalNullable.of(minChargeAmount);
            return this;
        }

        /**
         * UnSetter for minChargeAmount.
         * @return Builder
         */
        public Builder unsetMinChargeAmount() {
            minChargeAmount = null;
            return this;
        }

        /**
         * Setter for maxPayoutPeriod.
         * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
         * @return Builder
         */
        public Builder maxPayoutPeriod(String maxPayoutPeriod) {
            this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
            return this;
        }

        /**
         * UnSetter for maxPayoutPeriod.
         * @return Builder
         */
        public Builder unsetMaxPayoutPeriod() {
            maxPayoutPeriod = null;
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
         * Builds a new {@link CheckoutSubscriptionPlanConfiguration} object using the set fields.
         * @return {@link CheckoutSubscriptionPlanConfiguration}
         */
        public CheckoutSubscriptionPlanConfiguration build() {
            CheckoutSubscriptionPlanConfiguration model =
                    new CheckoutSubscriptionPlanConfiguration(enabled, fixedCycle, fixedCycleAmount,
                            supportedPaymentTypes, minChargeAmount, maxPayoutPeriod);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
