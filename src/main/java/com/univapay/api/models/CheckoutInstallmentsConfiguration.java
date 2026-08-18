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
 * This is a model class for CheckoutInstallmentsConfiguration type.
 */
public class CheckoutInstallmentsConfiguration {
    private Boolean enabled;
    private CheckoutInstallmentCardProcessor cardProcessor;
    private List<CheckoutPaymentType> supportedPaymentTypes;
    private OptionalNullable<CheckoutMoneyAmount> minChargeAmount;
    private OptionalNullable<String> maxPayoutPeriod;
    private Boolean onlyWithProcessor;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutInstallmentsConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  cardProcessor  CheckoutInstallmentCardProcessor value for cardProcessor.
     * @param  supportedPaymentTypes  List of CheckoutPaymentType value for supportedPaymentTypes.
     * @param  minChargeAmount  CheckoutMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     * @param  onlyWithProcessor  Boolean value for onlyWithProcessor.
     */
    public CheckoutInstallmentsConfiguration(
            Boolean enabled,
            CheckoutInstallmentCardProcessor cardProcessor,
            List<CheckoutPaymentType> supportedPaymentTypes,
            CheckoutMoneyAmount minChargeAmount,
            String maxPayoutPeriod,
            Boolean onlyWithProcessor) {
        this.enabled = enabled;
        this.cardProcessor = cardProcessor;
        this.supportedPaymentTypes = supportedPaymentTypes;
        this.minChargeAmount = OptionalNullable.of(minChargeAmount);
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
        this.onlyWithProcessor = onlyWithProcessor;
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  cardProcessor  CheckoutInstallmentCardProcessor value for cardProcessor.
     * @param  supportedPaymentTypes  List of CheckoutPaymentType value for supportedPaymentTypes.
     * @param  minChargeAmount  CheckoutMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     * @param  onlyWithProcessor  Boolean value for onlyWithProcessor.
     */

    protected CheckoutInstallmentsConfiguration(Boolean enabled,
            CheckoutInstallmentCardProcessor cardProcessor,
            List<CheckoutPaymentType> supportedPaymentTypes,
            OptionalNullable<CheckoutMoneyAmount> minChargeAmount,
            OptionalNullable<String> maxPayoutPeriod, Boolean onlyWithProcessor) {
        this.enabled = enabled;
        this.cardProcessor = cardProcessor;
        this.supportedPaymentTypes = supportedPaymentTypes;
        this.minChargeAmount = minChargeAmount;
        this.maxPayoutPeriod = maxPayoutPeriod;
        this.onlyWithProcessor = onlyWithProcessor;
    }

    /**
     * Getter for Enabled.
     * Whether installment plans are enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether installment plans are enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for CardProcessor.
     * Card-processor capabilities available for installment payments.
     * @return Returns the CheckoutInstallmentCardProcessor
     */
    @JsonGetter("card_processor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutInstallmentCardProcessor getCardProcessor() {
        return cardProcessor;
    }

    /**
     * Setter for CardProcessor.
     * Card-processor capabilities available for installment payments.
     * @param cardProcessor Value for CheckoutInstallmentCardProcessor
     */
    @JsonSetter("card_processor")
    public void setCardProcessor(CheckoutInstallmentCardProcessor cardProcessor) {
        this.cardProcessor = cardProcessor;
    }

    /**
     * Getter for SupportedPaymentTypes.
     * Payment types eligible for installment plans.
     * @return Returns the List of CheckoutPaymentType
     */
    @JsonGetter("supported_payment_types")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CheckoutPaymentType> getSupportedPaymentTypes() {
        return supportedPaymentTypes;
    }

    /**
     * Setter for SupportedPaymentTypes.
     * Payment types eligible for installment plans.
     * @param supportedPaymentTypes Value for List of CheckoutPaymentType
     */
    @JsonSetter("supported_payment_types")
    public void setSupportedPaymentTypes(List<CheckoutPaymentType> supportedPaymentTypes) {
        this.supportedPaymentTypes = supportedPaymentTypes;
    }

    /**
     * Internal Getter for MinChargeAmount.
     * Minimum charge amount eligible for installment plans. `null` when unrestricted.
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
     * Minimum charge amount eligible for installment plans. `null` when unrestricted.
     * @return Returns the CheckoutMoneyAmount
     */
    public CheckoutMoneyAmount getMinChargeAmount() {
        return OptionalNullable.getFrom(minChargeAmount);
    }

    /**
     * Setter for MinChargeAmount.
     * Minimum charge amount eligible for installment plans. `null` when unrestricted.
     * @param minChargeAmount Value for CheckoutMoneyAmount
     */
    @JsonSetter("min_charge_amount")
    public void setMinChargeAmount(CheckoutMoneyAmount minChargeAmount) {
        this.minChargeAmount = OptionalNullable.of(minChargeAmount);
    }

    /**
     * UnSetter for MinChargeAmount.
     * Minimum charge amount eligible for installment plans. `null` when unrestricted.
     */
    public void unsetMinChargeAmount() {
        minChargeAmount = null;
    }

    /**
     * Internal Getter for MaxPayoutPeriod.
     * ISO-8601 period bounding the maximum payout delay for installment settlements. `null` when
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
     * ISO-8601 period bounding the maximum payout delay for installment settlements. `null` when
     * unrestricted.
     * @return Returns the String
     */
    public String getMaxPayoutPeriod() {
        return OptionalNullable.getFrom(maxPayoutPeriod);
    }

    /**
     * Setter for MaxPayoutPeriod.
     * ISO-8601 period bounding the maximum payout delay for installment settlements. `null` when
     * unrestricted.
     * @param maxPayoutPeriod Value for String
     */
    @JsonSetter("max_payout_period")
    public void setMaxPayoutPeriod(String maxPayoutPeriod) {
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
    }

    /**
     * UnSetter for MaxPayoutPeriod.
     * ISO-8601 period bounding the maximum payout delay for installment settlements. `null` when
     * unrestricted.
     */
    public void unsetMaxPayoutPeriod() {
        maxPayoutPeriod = null;
    }

    /**
     * Getter for OnlyWithProcessor.
     * Whether installment plans are restricted to processor-backed flows. Always `true` — retained
     * for backwards compatibility.
     * @return Returns the Boolean
     */
    @JsonGetter("only_with_processor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getOnlyWithProcessor() {
        return onlyWithProcessor;
    }

    /**
     * Setter for OnlyWithProcessor.
     * Whether installment plans are restricted to processor-backed flows. Always `true` — retained
     * for backwards compatibility.
     * @param onlyWithProcessor Value for Boolean
     */
    @JsonSetter("only_with_processor")
    public void setOnlyWithProcessor(Boolean onlyWithProcessor) {
        this.onlyWithProcessor = onlyWithProcessor;
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
     * Converts this CheckoutInstallmentsConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutInstallmentsConfiguration [" + "enabled=" + enabled + ", cardProcessor="
                + cardProcessor + ", supportedPaymentTypes=" + supportedPaymentTypes
                + ", minChargeAmount=" + minChargeAmount + ", maxPayoutPeriod=" + maxPayoutPeriod
                + ", onlyWithProcessor=" + onlyWithProcessor + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutInstallmentsConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutInstallmentsConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled())
                .cardProcessor(getCardProcessor())
                .supportedPaymentTypes(getSupportedPaymentTypes())
                .onlyWithProcessor(getOnlyWithProcessor());
        builder.minChargeAmount = internalGetMinChargeAmount();
        builder.maxPayoutPeriod = internalGetMaxPayoutPeriod();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutInstallmentsConfiguration}.
     */
    public static class Builder {
        private Boolean enabled;
        private CheckoutInstallmentCardProcessor cardProcessor;
        private List<CheckoutPaymentType> supportedPaymentTypes;
        private OptionalNullable<CheckoutMoneyAmount> minChargeAmount;
        private OptionalNullable<String> maxPayoutPeriod;
        private Boolean onlyWithProcessor;
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
         * Setter for cardProcessor.
         * @param  cardProcessor  CheckoutInstallmentCardProcessor value for cardProcessor.
         * @return Builder
         */
        public Builder cardProcessor(CheckoutInstallmentCardProcessor cardProcessor) {
            this.cardProcessor = cardProcessor;
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
         * Setter for onlyWithProcessor.
         * @param  onlyWithProcessor  Boolean value for onlyWithProcessor.
         * @return Builder
         */
        public Builder onlyWithProcessor(Boolean onlyWithProcessor) {
            this.onlyWithProcessor = onlyWithProcessor;
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
         * Builds a new {@link CheckoutInstallmentsConfiguration} object using the set fields.
         * @return {@link CheckoutInstallmentsConfiguration}
         */
        public CheckoutInstallmentsConfiguration build() {
            CheckoutInstallmentsConfiguration model =
                    new CheckoutInstallmentsConfiguration(enabled, cardProcessor,
                            supportedPaymentTypes, minChargeAmount, maxPayoutPeriod,
                            onlyWithProcessor);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
