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
 * This is a model class for MerchantWebhookSubscriptionPlanConfiguration type.
 */
public class MerchantWebhookSubscriptionPlanConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<Boolean> fixedCycle;
    private OptionalNullable<Boolean> fixedCycleAmount;
    private OptionalNullable<List<String>> supportedPaymentTypes;
    private MerchantWebhookMoneyAmount minChargeAmount;
    private OptionalNullable<String> maxPayoutPeriod;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookSubscriptionPlanConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  fixedCycle  Boolean value for fixedCycle.
     * @param  fixedCycleAmount  Boolean value for fixedCycleAmount.
     * @param  supportedPaymentTypes  List of String value for supportedPaymentTypes.
     * @param  minChargeAmount  MerchantWebhookMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     */
    public MerchantWebhookSubscriptionPlanConfiguration(
            Boolean enabled,
            Boolean fixedCycle,
            Boolean fixedCycleAmount,
            List<String> supportedPaymentTypes,
            MerchantWebhookMoneyAmount minChargeAmount,
            String maxPayoutPeriod) {
        this.enabled = OptionalNullable.of(enabled);
        this.fixedCycle = OptionalNullable.of(fixedCycle);
        this.fixedCycleAmount = OptionalNullable.of(fixedCycleAmount);
        this.supportedPaymentTypes = OptionalNullable.of(supportedPaymentTypes);
        this.minChargeAmount = minChargeAmount;
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  fixedCycle  Boolean value for fixedCycle.
     * @param  fixedCycleAmount  Boolean value for fixedCycleAmount.
     * @param  supportedPaymentTypes  List of String value for supportedPaymentTypes.
     * @param  minChargeAmount  MerchantWebhookMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     */

    protected MerchantWebhookSubscriptionPlanConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<Boolean> fixedCycle, OptionalNullable<Boolean> fixedCycleAmount,
            OptionalNullable<List<String>> supportedPaymentTypes,
            MerchantWebhookMoneyAmount minChargeAmount,
            OptionalNullable<String> maxPayoutPeriod) {
        this.enabled = enabled;
        this.fixedCycle = fixedCycle;
        this.fixedCycleAmount = fixedCycleAmount;
        this.supportedPaymentTypes = supportedPaymentTypes;
        this.minChargeAmount = minChargeAmount;
        this.maxPayoutPeriod = maxPayoutPeriod;
    }

    /**
     * Internal Getter for Enabled.
     * Enables limited-cycle subscription plans.
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
     * Enables limited-cycle subscription plans.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables limited-cycle subscription plans.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables limited-cycle subscription plans.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for FixedCycle.
     * Allows plans limited by a fixed number of cycles.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("fixed_cycle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetFixedCycle() {
        return this.fixedCycle;
    }

    /**
     * Getter for FixedCycle.
     * Allows plans limited by a fixed number of cycles.
     * @return Returns the Boolean
     */
    public Boolean getFixedCycle() {
        return OptionalNullable.getFrom(fixedCycle);
    }

    /**
     * Setter for FixedCycle.
     * Allows plans limited by a fixed number of cycles.
     * @param fixedCycle Value for Boolean
     */
    @JsonSetter("fixed_cycle")
    public void setFixedCycle(Boolean fixedCycle) {
        this.fixedCycle = OptionalNullable.of(fixedCycle);
    }

    /**
     * UnSetter for FixedCycle.
     * Allows plans limited by a fixed number of cycles.
     */
    public void unsetFixedCycle() {
        fixedCycle = null;
    }

    /**
     * Internal Getter for FixedCycleAmount.
     * Allows plans limited by a total target amount.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("fixed_cycle_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetFixedCycleAmount() {
        return this.fixedCycleAmount;
    }

    /**
     * Getter for FixedCycleAmount.
     * Allows plans limited by a total target amount.
     * @return Returns the Boolean
     */
    public Boolean getFixedCycleAmount() {
        return OptionalNullable.getFrom(fixedCycleAmount);
    }

    /**
     * Setter for FixedCycleAmount.
     * Allows plans limited by a total target amount.
     * @param fixedCycleAmount Value for Boolean
     */
    @JsonSetter("fixed_cycle_amount")
    public void setFixedCycleAmount(Boolean fixedCycleAmount) {
        this.fixedCycleAmount = OptionalNullable.of(fixedCycleAmount);
    }

    /**
     * UnSetter for FixedCycleAmount.
     * Allows plans limited by a total target amount.
     */
    public void unsetFixedCycleAmount() {
        fixedCycleAmount = null;
    }

    /**
     * Internal Getter for SupportedPaymentTypes.
     * Payment types that can use subscription plans.
     * @return Returns the Internal List of String
     */
    @JsonGetter("supported_payment_types")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetSupportedPaymentTypes() {
        return this.supportedPaymentTypes;
    }

    /**
     * Getter for SupportedPaymentTypes.
     * Payment types that can use subscription plans.
     * @return Returns the List of String
     */
    public List<String> getSupportedPaymentTypes() {
        return OptionalNullable.getFrom(supportedPaymentTypes);
    }

    /**
     * Setter for SupportedPaymentTypes.
     * Payment types that can use subscription plans.
     * @param supportedPaymentTypes Value for List of String
     */
    @JsonSetter("supported_payment_types")
    public void setSupportedPaymentTypes(List<String> supportedPaymentTypes) {
        this.supportedPaymentTypes = OptionalNullable.of(supportedPaymentTypes);
    }

    /**
     * UnSetter for SupportedPaymentTypes.
     * Payment types that can use subscription plans.
     */
    public void unsetSupportedPaymentTypes() {
        supportedPaymentTypes = null;
    }

    /**
     * Getter for MinChargeAmount.
     * Monetary amount object serialized by backend config models.
     * @return Returns the MerchantWebhookMoneyAmount
     */
    @JsonGetter("min_charge_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookMoneyAmount getMinChargeAmount() {
        return minChargeAmount;
    }

    /**
     * Setter for MinChargeAmount.
     * Monetary amount object serialized by backend config models.
     * @param minChargeAmount Value for MerchantWebhookMoneyAmount
     */
    @JsonSetter("min_charge_amount")
    public void setMinChargeAmount(MerchantWebhookMoneyAmount minChargeAmount) {
        this.minChargeAmount = minChargeAmount;
    }

    /**
     * Internal Getter for MaxPayoutPeriod.
     * Maximum payout delay allowed for subscription plan settlements.
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
     * Maximum payout delay allowed for subscription plan settlements.
     * @return Returns the String
     */
    public String getMaxPayoutPeriod() {
        return OptionalNullable.getFrom(maxPayoutPeriod);
    }

    /**
     * Setter for MaxPayoutPeriod.
     * Maximum payout delay allowed for subscription plan settlements.
     * @param maxPayoutPeriod Value for String
     */
    @JsonSetter("max_payout_period")
    public void setMaxPayoutPeriod(String maxPayoutPeriod) {
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
    }

    /**
     * UnSetter for MaxPayoutPeriod.
     * Maximum payout delay allowed for subscription plan settlements.
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
     * Converts this MerchantWebhookSubscriptionPlanConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookSubscriptionPlanConfiguration [" + "enabled=" + enabled
                + ", fixedCycle=" + fixedCycle + ", fixedCycleAmount=" + fixedCycleAmount
                + ", supportedPaymentTypes=" + supportedPaymentTypes + ", minChargeAmount="
                + minChargeAmount + ", maxPayoutPeriod=" + maxPayoutPeriod
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookSubscriptionPlanConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookSubscriptionPlanConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .minChargeAmount(getMinChargeAmount());
        builder.enabled = internalGetEnabled();
        builder.fixedCycle = internalGetFixedCycle();
        builder.fixedCycleAmount = internalGetFixedCycleAmount();
        builder.supportedPaymentTypes = internalGetSupportedPaymentTypes();
        builder.maxPayoutPeriod = internalGetMaxPayoutPeriod();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookSubscriptionPlanConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<Boolean> fixedCycle;
        private OptionalNullable<Boolean> fixedCycleAmount;
        private OptionalNullable<List<String>> supportedPaymentTypes;
        private MerchantWebhookMoneyAmount minChargeAmount;
        private OptionalNullable<String> maxPayoutPeriod;
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
         * Setter for fixedCycle.
         * @param  fixedCycle  Boolean value for fixedCycle.
         * @return Builder
         */
        public Builder fixedCycle(Boolean fixedCycle) {
            this.fixedCycle = OptionalNullable.of(fixedCycle);
            return this;
        }

        /**
         * UnSetter for fixedCycle.
         * @return Builder
         */
        public Builder unsetFixedCycle() {
            fixedCycle = null;
            return this;
        }

        /**
         * Setter for fixedCycleAmount.
         * @param  fixedCycleAmount  Boolean value for fixedCycleAmount.
         * @return Builder
         */
        public Builder fixedCycleAmount(Boolean fixedCycleAmount) {
            this.fixedCycleAmount = OptionalNullable.of(fixedCycleAmount);
            return this;
        }

        /**
         * UnSetter for fixedCycleAmount.
         * @return Builder
         */
        public Builder unsetFixedCycleAmount() {
            fixedCycleAmount = null;
            return this;
        }

        /**
         * Setter for supportedPaymentTypes.
         * @param  supportedPaymentTypes  List of String value for supportedPaymentTypes.
         * @return Builder
         */
        public Builder supportedPaymentTypes(List<String> supportedPaymentTypes) {
            this.supportedPaymentTypes = OptionalNullable.of(supportedPaymentTypes);
            return this;
        }

        /**
         * UnSetter for supportedPaymentTypes.
         * @return Builder
         */
        public Builder unsetSupportedPaymentTypes() {
            supportedPaymentTypes = null;
            return this;
        }

        /**
         * Setter for minChargeAmount.
         * @param  minChargeAmount  MerchantWebhookMoneyAmount value for minChargeAmount.
         * @return Builder
         */
        public Builder minChargeAmount(MerchantWebhookMoneyAmount minChargeAmount) {
            this.minChargeAmount = minChargeAmount;
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
         * Builds a new {@link MerchantWebhookSubscriptionPlanConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookSubscriptionPlanConfiguration}
         */
        public MerchantWebhookSubscriptionPlanConfiguration build() {
            MerchantWebhookSubscriptionPlanConfiguration model =
                    new MerchantWebhookSubscriptionPlanConfiguration(enabled, fixedCycle,
                            fixedCycleAmount, supportedPaymentTypes, minChargeAmount,
                            maxPayoutPeriod);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
