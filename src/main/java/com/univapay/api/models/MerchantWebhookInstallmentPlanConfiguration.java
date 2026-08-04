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
 * This is a model class for MerchantWebhookInstallmentPlanConfiguration type.
 */
public class MerchantWebhookInstallmentPlanConfiguration {
    private OptionalNullable<Boolean> enabled;
    private CardProcessorInstallmentConfig cardProcessor;
    private OptionalNullable<List<String>> supportedPaymentTypes;
    private MerchantWebhookMoneyAmount minChargeAmount;
    private OptionalNullable<String> maxPayoutPeriod;
    private OptionalNullable<Boolean> onlyWithProcessor;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookInstallmentPlanConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  cardProcessor  CardProcessorInstallmentConfig value for cardProcessor.
     * @param  supportedPaymentTypes  List of String value for supportedPaymentTypes.
     * @param  minChargeAmount  MerchantWebhookMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     * @param  onlyWithProcessor  Boolean value for onlyWithProcessor.
     */
    public MerchantWebhookInstallmentPlanConfiguration(
            Boolean enabled,
            CardProcessorInstallmentConfig cardProcessor,
            List<String> supportedPaymentTypes,
            MerchantWebhookMoneyAmount minChargeAmount,
            String maxPayoutPeriod,
            Boolean onlyWithProcessor) {
        this.enabled = OptionalNullable.of(enabled);
        this.cardProcessor = cardProcessor;
        this.supportedPaymentTypes = OptionalNullable.of(supportedPaymentTypes);
        this.minChargeAmount = minChargeAmount;
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
        this.onlyWithProcessor = OptionalNullable.of(onlyWithProcessor);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  cardProcessor  CardProcessorInstallmentConfig value for cardProcessor.
     * @param  supportedPaymentTypes  List of String value for supportedPaymentTypes.
     * @param  minChargeAmount  MerchantWebhookMoneyAmount value for minChargeAmount.
     * @param  maxPayoutPeriod  String value for maxPayoutPeriod.
     * @param  onlyWithProcessor  Boolean value for onlyWithProcessor.
     */

    protected MerchantWebhookInstallmentPlanConfiguration(OptionalNullable<Boolean> enabled,
            CardProcessorInstallmentConfig cardProcessor,
            OptionalNullable<List<String>> supportedPaymentTypes,
            MerchantWebhookMoneyAmount minChargeAmount, OptionalNullable<String> maxPayoutPeriod,
            OptionalNullable<Boolean> onlyWithProcessor) {
        this.enabled = enabled;
        this.cardProcessor = cardProcessor;
        this.supportedPaymentTypes = supportedPaymentTypes;
        this.minChargeAmount = minChargeAmount;
        this.maxPayoutPeriod = maxPayoutPeriod;
        this.onlyWithProcessor = onlyWithProcessor;
    }

    /**
     * Internal Getter for Enabled.
     * Enables installment plan features for eligible payments.
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
     * Enables installment plan features for eligible payments.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables installment plan features for eligible payments.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables installment plan features for eligible payments.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Getter for CardProcessor.
     * Card-processor capabilities available for installment payments.
     * @return Returns the CardProcessorInstallmentConfig
     */
    @JsonGetter("card_processor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardProcessorInstallmentConfig getCardProcessor() {
        return cardProcessor;
    }

    /**
     * Setter for CardProcessor.
     * Card-processor capabilities available for installment payments.
     * @param cardProcessor Value for CardProcessorInstallmentConfig
     */
    @JsonSetter("card_processor")
    public void setCardProcessor(CardProcessorInstallmentConfig cardProcessor) {
        this.cardProcessor = cardProcessor;
    }

    /**
     * Internal Getter for SupportedPaymentTypes.
     * Payment types that can use installment plans.
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
     * Payment types that can use installment plans.
     * @return Returns the List of String
     */
    public List<String> getSupportedPaymentTypes() {
        return OptionalNullable.getFrom(supportedPaymentTypes);
    }

    /**
     * Setter for SupportedPaymentTypes.
     * Payment types that can use installment plans.
     * @param supportedPaymentTypes Value for List of String
     */
    @JsonSetter("supported_payment_types")
    public void setSupportedPaymentTypes(List<String> supportedPaymentTypes) {
        this.supportedPaymentTypes = OptionalNullable.of(supportedPaymentTypes);
    }

    /**
     * UnSetter for SupportedPaymentTypes.
     * Payment types that can use installment plans.
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
     * Maximum payout delay allowed for installment settlements.
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
     * Maximum payout delay allowed for installment settlements.
     * @return Returns the String
     */
    public String getMaxPayoutPeriod() {
        return OptionalNullable.getFrom(maxPayoutPeriod);
    }

    /**
     * Setter for MaxPayoutPeriod.
     * Maximum payout delay allowed for installment settlements.
     * @param maxPayoutPeriod Value for String
     */
    @JsonSetter("max_payout_period")
    public void setMaxPayoutPeriod(String maxPayoutPeriod) {
        this.maxPayoutPeriod = OptionalNullable.of(maxPayoutPeriod);
    }

    /**
     * UnSetter for MaxPayoutPeriod.
     * Maximum payout delay allowed for installment settlements.
     */
    public void unsetMaxPayoutPeriod() {
        maxPayoutPeriod = null;
    }

    /**
     * Internal Getter for OnlyWithProcessor.
     * Restricts installment use to processor-backed flows.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("only_with_processor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetOnlyWithProcessor() {
        return this.onlyWithProcessor;
    }

    /**
     * Getter for OnlyWithProcessor.
     * Restricts installment use to processor-backed flows.
     * @return Returns the Boolean
     */
    public Boolean getOnlyWithProcessor() {
        return OptionalNullable.getFrom(onlyWithProcessor);
    }

    /**
     * Setter for OnlyWithProcessor.
     * Restricts installment use to processor-backed flows.
     * @param onlyWithProcessor Value for Boolean
     */
    @JsonSetter("only_with_processor")
    public void setOnlyWithProcessor(Boolean onlyWithProcessor) {
        this.onlyWithProcessor = OptionalNullable.of(onlyWithProcessor);
    }

    /**
     * UnSetter for OnlyWithProcessor.
     * Restricts installment use to processor-backed flows.
     */
    public void unsetOnlyWithProcessor() {
        onlyWithProcessor = null;
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
     * Converts this MerchantWebhookInstallmentPlanConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookInstallmentPlanConfiguration [" + "enabled=" + enabled
                + ", cardProcessor=" + cardProcessor + ", supportedPaymentTypes="
                + supportedPaymentTypes + ", minChargeAmount=" + minChargeAmount
                + ", maxPayoutPeriod=" + maxPayoutPeriod + ", onlyWithProcessor="
                + onlyWithProcessor + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookInstallmentPlanConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookInstallmentPlanConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardProcessor(getCardProcessor())
                .minChargeAmount(getMinChargeAmount());
        builder.enabled = internalGetEnabled();
        builder.supportedPaymentTypes = internalGetSupportedPaymentTypes();
        builder.maxPayoutPeriod = internalGetMaxPayoutPeriod();
        builder.onlyWithProcessor = internalGetOnlyWithProcessor();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookInstallmentPlanConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private CardProcessorInstallmentConfig cardProcessor;
        private OptionalNullable<List<String>> supportedPaymentTypes;
        private MerchantWebhookMoneyAmount minChargeAmount;
        private OptionalNullable<String> maxPayoutPeriod;
        private OptionalNullable<Boolean> onlyWithProcessor;
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
         * Setter for cardProcessor.
         * @param  cardProcessor  CardProcessorInstallmentConfig value for cardProcessor.
         * @return Builder
         */
        public Builder cardProcessor(CardProcessorInstallmentConfig cardProcessor) {
            this.cardProcessor = cardProcessor;
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
         * Setter for onlyWithProcessor.
         * @param  onlyWithProcessor  Boolean value for onlyWithProcessor.
         * @return Builder
         */
        public Builder onlyWithProcessor(Boolean onlyWithProcessor) {
            this.onlyWithProcessor = OptionalNullable.of(onlyWithProcessor);
            return this;
        }

        /**
         * UnSetter for onlyWithProcessor.
         * @return Builder
         */
        public Builder unsetOnlyWithProcessor() {
            onlyWithProcessor = null;
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
         * Builds a new {@link MerchantWebhookInstallmentPlanConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookInstallmentPlanConfiguration}
         */
        public MerchantWebhookInstallmentPlanConfiguration build() {
            MerchantWebhookInstallmentPlanConfiguration model =
                    new MerchantWebhookInstallmentPlanConfiguration(enabled, cardProcessor,
                            supportedPaymentTypes, minChargeAmount, maxPayoutPeriod,
                            onlyWithProcessor);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
