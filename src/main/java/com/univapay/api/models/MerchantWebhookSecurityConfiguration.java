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
 * This is a model class for MerchantWebhookSecurityConfiguration type.
 */
public class MerchantWebhookSecurityConfiguration {
    private OptionalNullable<String> cardChargeCooldown;
    private OptionalNullable<String> subscriptionCooldown;
    private OptionalNullable<String> idempotentCardChargeCooldown;
    private OptionalNullable<String> idempotentSubscriptionCooldown;
    private RestrictIpAfterFailedChargeConfig restrictIpAfterFailedCharge;
    private OptionalNullable<String> inspectSuspiciousLoginAfter;
    private OptionalNullable<Double> refundPercentLimit;
    private MerchantWebhookLimitChargeByCardConfiguration limitChargeByCardConfiguration;
    private OptionalNullable<Boolean> confirmationRequired;
    private OptionalNullable<Integer> minRefundThreshold;
    private MerchantWebhookLimitRefundBySalesConfiguration limitRefundBySales;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookSecurityConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  cardChargeCooldown  String value for cardChargeCooldown.
     * @param  subscriptionCooldown  String value for subscriptionCooldown.
     * @param  idempotentCardChargeCooldown  String value for idempotentCardChargeCooldown.
     * @param  idempotentSubscriptionCooldown  String value for idempotentSubscriptionCooldown.
     * @param  restrictIpAfterFailedCharge  RestrictIpAfterFailedChargeConfig value for
     *         restrictIpAfterFailedCharge.
     * @param  inspectSuspiciousLoginAfter  String value for inspectSuspiciousLoginAfter.
     * @param  refundPercentLimit  Double value for refundPercentLimit.
     * @param  limitChargeByCardConfiguration  MerchantWebhookLimitChargeByCardConfiguration value
     *         for limitChargeByCardConfiguration.
     * @param  confirmationRequired  Boolean value for confirmationRequired.
     * @param  minRefundThreshold  Integer value for minRefundThreshold.
     * @param  limitRefundBySales  MerchantWebhookLimitRefundBySalesConfiguration value for
     *         limitRefundBySales.
     */
    public MerchantWebhookSecurityConfiguration(
            String cardChargeCooldown,
            String subscriptionCooldown,
            String idempotentCardChargeCooldown,
            String idempotentSubscriptionCooldown,
            RestrictIpAfterFailedChargeConfig restrictIpAfterFailedCharge,
            String inspectSuspiciousLoginAfter,
            Double refundPercentLimit,
            MerchantWebhookLimitChargeByCardConfiguration limitChargeByCardConfiguration,
            Boolean confirmationRequired,
            Integer minRefundThreshold,
            MerchantWebhookLimitRefundBySalesConfiguration limitRefundBySales) {
        this.cardChargeCooldown = OptionalNullable.of(cardChargeCooldown);
        this.subscriptionCooldown = OptionalNullable.of(subscriptionCooldown);
        this.idempotentCardChargeCooldown = OptionalNullable.of(idempotentCardChargeCooldown);
        this.idempotentSubscriptionCooldown = OptionalNullable.of(idempotentSubscriptionCooldown);
        this.restrictIpAfterFailedCharge = restrictIpAfterFailedCharge;
        this.inspectSuspiciousLoginAfter = OptionalNullable.of(inspectSuspiciousLoginAfter);
        this.refundPercentLimit = OptionalNullable.of(refundPercentLimit);
        this.limitChargeByCardConfiguration = limitChargeByCardConfiguration;
        this.confirmationRequired = OptionalNullable.of(confirmationRequired);
        this.minRefundThreshold = OptionalNullable.of(minRefundThreshold);
        this.limitRefundBySales = limitRefundBySales;
    }

    /**
     * Initialization constructor.
     * @param  cardChargeCooldown  String value for cardChargeCooldown.
     * @param  subscriptionCooldown  String value for subscriptionCooldown.
     * @param  idempotentCardChargeCooldown  String value for idempotentCardChargeCooldown.
     * @param  idempotentSubscriptionCooldown  String value for idempotentSubscriptionCooldown.
     * @param  restrictIpAfterFailedCharge  RestrictIpAfterFailedChargeConfig value for
     *         restrictIpAfterFailedCharge.
     * @param  inspectSuspiciousLoginAfter  String value for inspectSuspiciousLoginAfter.
     * @param  refundPercentLimit  Double value for refundPercentLimit.
     * @param  limitChargeByCardConfiguration  MerchantWebhookLimitChargeByCardConfiguration value
     *         for limitChargeByCardConfiguration.
     * @param  confirmationRequired  Boolean value for confirmationRequired.
     * @param  minRefundThreshold  Integer value for minRefundThreshold.
     * @param  limitRefundBySales  MerchantWebhookLimitRefundBySalesConfiguration value for
     *         limitRefundBySales.
     */

    protected MerchantWebhookSecurityConfiguration(OptionalNullable<String> cardChargeCooldown,
            OptionalNullable<String> subscriptionCooldown,
            OptionalNullable<String> idempotentCardChargeCooldown,
            OptionalNullable<String> idempotentSubscriptionCooldown,
            RestrictIpAfterFailedChargeConfig restrictIpAfterFailedCharge,
            OptionalNullable<String> inspectSuspiciousLoginAfter,
            OptionalNullable<Double> refundPercentLimit,
            MerchantWebhookLimitChargeByCardConfiguration limitChargeByCardConfiguration,
            OptionalNullable<Boolean> confirmationRequired,
            OptionalNullable<Integer> minRefundThreshold,
            MerchantWebhookLimitRefundBySalesConfiguration limitRefundBySales) {
        this.cardChargeCooldown = cardChargeCooldown;
        this.subscriptionCooldown = subscriptionCooldown;
        this.idempotentCardChargeCooldown = idempotentCardChargeCooldown;
        this.idempotentSubscriptionCooldown = idempotentSubscriptionCooldown;
        this.restrictIpAfterFailedCharge = restrictIpAfterFailedCharge;
        this.inspectSuspiciousLoginAfter = inspectSuspiciousLoginAfter;
        this.refundPercentLimit = refundPercentLimit;
        this.limitChargeByCardConfiguration = limitChargeByCardConfiguration;
        this.confirmationRequired = confirmationRequired;
        this.minRefundThreshold = minRefundThreshold;
        this.limitRefundBySales = limitRefundBySales;
    }

    /**
     * Internal Getter for CardChargeCooldown.
     * ISO-8601 duration between card charge attempts.
     * @return Returns the Internal String
     */
    @JsonGetter("card_charge_cooldown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCardChargeCooldown() {
        return this.cardChargeCooldown;
    }

    /**
     * Getter for CardChargeCooldown.
     * ISO-8601 duration between card charge attempts.
     * @return Returns the String
     */
    public String getCardChargeCooldown() {
        return OptionalNullable.getFrom(cardChargeCooldown);
    }

    /**
     * Setter for CardChargeCooldown.
     * ISO-8601 duration between card charge attempts.
     * @param cardChargeCooldown Value for String
     */
    @JsonSetter("card_charge_cooldown")
    public void setCardChargeCooldown(String cardChargeCooldown) {
        this.cardChargeCooldown = OptionalNullable.of(cardChargeCooldown);
    }

    /**
     * UnSetter for CardChargeCooldown.
     * ISO-8601 duration between card charge attempts.
     */
    public void unsetCardChargeCooldown() {
        cardChargeCooldown = null;
    }

    /**
     * Internal Getter for SubscriptionCooldown.
     * ISO-8601 duration between subscription charge attempts.
     * @return Returns the Internal String
     */
    @JsonGetter("subscription_cooldown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSubscriptionCooldown() {
        return this.subscriptionCooldown;
    }

    /**
     * Getter for SubscriptionCooldown.
     * ISO-8601 duration between subscription charge attempts.
     * @return Returns the String
     */
    public String getSubscriptionCooldown() {
        return OptionalNullable.getFrom(subscriptionCooldown);
    }

    /**
     * Setter for SubscriptionCooldown.
     * ISO-8601 duration between subscription charge attempts.
     * @param subscriptionCooldown Value for String
     */
    @JsonSetter("subscription_cooldown")
    public void setSubscriptionCooldown(String subscriptionCooldown) {
        this.subscriptionCooldown = OptionalNullable.of(subscriptionCooldown);
    }

    /**
     * UnSetter for SubscriptionCooldown.
     * ISO-8601 duration between subscription charge attempts.
     */
    public void unsetSubscriptionCooldown() {
        subscriptionCooldown = null;
    }

    /**
     * Internal Getter for IdempotentCardChargeCooldown.
     * ISO-8601 duration for reusing an idempotent card charge key.
     * @return Returns the Internal String
     */
    @JsonGetter("idempotent_card_charge_cooldown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIdempotentCardChargeCooldown() {
        return this.idempotentCardChargeCooldown;
    }

    /**
     * Getter for IdempotentCardChargeCooldown.
     * ISO-8601 duration for reusing an idempotent card charge key.
     * @return Returns the String
     */
    public String getIdempotentCardChargeCooldown() {
        return OptionalNullable.getFrom(idempotentCardChargeCooldown);
    }

    /**
     * Setter for IdempotentCardChargeCooldown.
     * ISO-8601 duration for reusing an idempotent card charge key.
     * @param idempotentCardChargeCooldown Value for String
     */
    @JsonSetter("idempotent_card_charge_cooldown")
    public void setIdempotentCardChargeCooldown(String idempotentCardChargeCooldown) {
        this.idempotentCardChargeCooldown = OptionalNullable.of(idempotentCardChargeCooldown);
    }

    /**
     * UnSetter for IdempotentCardChargeCooldown.
     * ISO-8601 duration for reusing an idempotent card charge key.
     */
    public void unsetIdempotentCardChargeCooldown() {
        idempotentCardChargeCooldown = null;
    }

    /**
     * Internal Getter for IdempotentSubscriptionCooldown.
     * ISO-8601 duration for reusing an idempotent subscription key.
     * @return Returns the Internal String
     */
    @JsonGetter("idempotent_subscription_cooldown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIdempotentSubscriptionCooldown() {
        return this.idempotentSubscriptionCooldown;
    }

    /**
     * Getter for IdempotentSubscriptionCooldown.
     * ISO-8601 duration for reusing an idempotent subscription key.
     * @return Returns the String
     */
    public String getIdempotentSubscriptionCooldown() {
        return OptionalNullable.getFrom(idempotentSubscriptionCooldown);
    }

    /**
     * Setter for IdempotentSubscriptionCooldown.
     * ISO-8601 duration for reusing an idempotent subscription key.
     * @param idempotentSubscriptionCooldown Value for String
     */
    @JsonSetter("idempotent_subscription_cooldown")
    public void setIdempotentSubscriptionCooldown(String idempotentSubscriptionCooldown) {
        this.idempotentSubscriptionCooldown = OptionalNullable.of(idempotentSubscriptionCooldown);
    }

    /**
     * UnSetter for IdempotentSubscriptionCooldown.
     * ISO-8601 duration for reusing an idempotent subscription key.
     */
    public void unsetIdempotentSubscriptionCooldown() {
        idempotentSubscriptionCooldown = null;
    }

    /**
     * Getter for RestrictIpAfterFailedCharge.
     * IP restriction policy applied after repeated failed charges.
     * @return Returns the RestrictIpAfterFailedChargeConfig
     */
    @JsonGetter("restrict_ip_after_failed_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RestrictIpAfterFailedChargeConfig getRestrictIpAfterFailedCharge() {
        return restrictIpAfterFailedCharge;
    }

    /**
     * Setter for RestrictIpAfterFailedCharge.
     * IP restriction policy applied after repeated failed charges.
     * @param restrictIpAfterFailedCharge Value for RestrictIpAfterFailedChargeConfig
     */
    @JsonSetter("restrict_ip_after_failed_charge")
    public void setRestrictIpAfterFailedCharge(RestrictIpAfterFailedChargeConfig restrictIpAfterFailedCharge) {
        this.restrictIpAfterFailedCharge = restrictIpAfterFailedCharge;
    }

    /**
     * Internal Getter for InspectSuspiciousLoginAfter.
     * Look-back period used to review suspicious login activity.
     * @return Returns the Internal String
     */
    @JsonGetter("inspect_suspicious_login_after")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInspectSuspiciousLoginAfter() {
        return this.inspectSuspiciousLoginAfter;
    }

    /**
     * Getter for InspectSuspiciousLoginAfter.
     * Look-back period used to review suspicious login activity.
     * @return Returns the String
     */
    public String getInspectSuspiciousLoginAfter() {
        return OptionalNullable.getFrom(inspectSuspiciousLoginAfter);
    }

    /**
     * Setter for InspectSuspiciousLoginAfter.
     * Look-back period used to review suspicious login activity.
     * @param inspectSuspiciousLoginAfter Value for String
     */
    @JsonSetter("inspect_suspicious_login_after")
    public void setInspectSuspiciousLoginAfter(String inspectSuspiciousLoginAfter) {
        this.inspectSuspiciousLoginAfter = OptionalNullable.of(inspectSuspiciousLoginAfter);
    }

    /**
     * UnSetter for InspectSuspiciousLoginAfter.
     * Look-back period used to review suspicious login activity.
     */
    public void unsetInspectSuspiciousLoginAfter() {
        inspectSuspiciousLoginAfter = null;
    }

    /**
     * Internal Getter for RefundPercentLimit.
     * Maximum refund-to-sales percentage allowed before restriction.
     * @return Returns the Internal Double
     */
    @JsonGetter("refund_percent_limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetRefundPercentLimit() {
        return this.refundPercentLimit;
    }

    /**
     * Getter for RefundPercentLimit.
     * Maximum refund-to-sales percentage allowed before restriction.
     * @return Returns the Double
     */
    public Double getRefundPercentLimit() {
        return OptionalNullable.getFrom(refundPercentLimit);
    }

    /**
     * Setter for RefundPercentLimit.
     * Maximum refund-to-sales percentage allowed before restriction.
     * @param refundPercentLimit Value for Double
     */
    @JsonSetter("refund_percent_limit")
    public void setRefundPercentLimit(Double refundPercentLimit) {
        this.refundPercentLimit = OptionalNullable.of(refundPercentLimit);
    }

    /**
     * UnSetter for RefundPercentLimit.
     * Maximum refund-to-sales percentage allowed before restriction.
     */
    public void unsetRefundPercentLimit() {
        refundPercentLimit = null;
    }

    /**
     * Getter for LimitChargeByCardConfiguration.
     * Per-card velocity limit configuration.
     * @return Returns the MerchantWebhookLimitChargeByCardConfiguration
     */
    @JsonGetter("limit_charge_by_card_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookLimitChargeByCardConfiguration getLimitChargeByCardConfiguration() {
        return limitChargeByCardConfiguration;
    }

    /**
     * Setter for LimitChargeByCardConfiguration.
     * Per-card velocity limit configuration.
     * @param limitChargeByCardConfiguration Value for MerchantWebhookLimitChargeByCardConfiguration
     */
    @JsonSetter("limit_charge_by_card_configuration")
    public void setLimitChargeByCardConfiguration(MerchantWebhookLimitChargeByCardConfiguration limitChargeByCardConfiguration) {
        this.limitChargeByCardConfiguration = limitChargeByCardConfiguration;
    }

    /**
     * Internal Getter for ConfirmationRequired.
     * Requires confirmation before protected refund actions proceed.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("confirmation_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetConfirmationRequired() {
        return this.confirmationRequired;
    }

    /**
     * Getter for ConfirmationRequired.
     * Requires confirmation before protected refund actions proceed.
     * @return Returns the Boolean
     */
    public Boolean getConfirmationRequired() {
        return OptionalNullable.getFrom(confirmationRequired);
    }

    /**
     * Setter for ConfirmationRequired.
     * Requires confirmation before protected refund actions proceed.
     * @param confirmationRequired Value for Boolean
     */
    @JsonSetter("confirmation_required")
    public void setConfirmationRequired(Boolean confirmationRequired) {
        this.confirmationRequired = OptionalNullable.of(confirmationRequired);
    }

    /**
     * UnSetter for ConfirmationRequired.
     * Requires confirmation before protected refund actions proceed.
     */
    public void unsetConfirmationRequired() {
        confirmationRequired = null;
    }

    /**
     * Internal Getter for MinRefundThreshold.
     * Minimum refund amount, in minor units, subject to confirmation checks.
     * @return Returns the Internal Integer
     */
    @JsonGetter("min_refund_threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetMinRefundThreshold() {
        return this.minRefundThreshold;
    }

    /**
     * Getter for MinRefundThreshold.
     * Minimum refund amount, in minor units, subject to confirmation checks.
     * @return Returns the Integer
     */
    public Integer getMinRefundThreshold() {
        return OptionalNullable.getFrom(minRefundThreshold);
    }

    /**
     * Setter for MinRefundThreshold.
     * Minimum refund amount, in minor units, subject to confirmation checks.
     * @param minRefundThreshold Value for Integer
     */
    @JsonSetter("min_refund_threshold")
    public void setMinRefundThreshold(Integer minRefundThreshold) {
        this.minRefundThreshold = OptionalNullable.of(minRefundThreshold);
    }

    /**
     * UnSetter for MinRefundThreshold.
     * Minimum refund amount, in minor units, subject to confirmation checks.
     */
    public void unsetMinRefundThreshold() {
        minRefundThreshold = null;
    }

    /**
     * Getter for LimitRefundBySales.
     * Refund-limiting configuration based on sales history.
     * @return Returns the MerchantWebhookLimitRefundBySalesConfiguration
     */
    @JsonGetter("limit_refund_by_sales")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookLimitRefundBySalesConfiguration getLimitRefundBySales() {
        return limitRefundBySales;
    }

    /**
     * Setter for LimitRefundBySales.
     * Refund-limiting configuration based on sales history.
     * @param limitRefundBySales Value for MerchantWebhookLimitRefundBySalesConfiguration
     */
    @JsonSetter("limit_refund_by_sales")
    public void setLimitRefundBySales(MerchantWebhookLimitRefundBySalesConfiguration limitRefundBySales) {
        this.limitRefundBySales = limitRefundBySales;
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
     * Converts this MerchantWebhookSecurityConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookSecurityConfiguration [" + "cardChargeCooldown=" + cardChargeCooldown
                + ", subscriptionCooldown=" + subscriptionCooldown
                + ", idempotentCardChargeCooldown=" + idempotentCardChargeCooldown
                + ", idempotentSubscriptionCooldown=" + idempotentSubscriptionCooldown
                + ", restrictIpAfterFailedCharge=" + restrictIpAfterFailedCharge
                + ", inspectSuspiciousLoginAfter=" + inspectSuspiciousLoginAfter
                + ", refundPercentLimit=" + refundPercentLimit + ", limitChargeByCardConfiguration="
                + limitChargeByCardConfiguration + ", confirmationRequired=" + confirmationRequired
                + ", minRefundThreshold=" + minRefundThreshold + ", limitRefundBySales="
                + limitRefundBySales + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookSecurityConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookSecurityConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .restrictIpAfterFailedCharge(getRestrictIpAfterFailedCharge())
                .limitChargeByCardConfiguration(getLimitChargeByCardConfiguration())
                .limitRefundBySales(getLimitRefundBySales());
        builder.cardChargeCooldown = internalGetCardChargeCooldown();
        builder.subscriptionCooldown = internalGetSubscriptionCooldown();
        builder.idempotentCardChargeCooldown = internalGetIdempotentCardChargeCooldown();
        builder.idempotentSubscriptionCooldown = internalGetIdempotentSubscriptionCooldown();
        builder.inspectSuspiciousLoginAfter = internalGetInspectSuspiciousLoginAfter();
        builder.refundPercentLimit = internalGetRefundPercentLimit();
        builder.confirmationRequired = internalGetConfirmationRequired();
        builder.minRefundThreshold = internalGetMinRefundThreshold();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookSecurityConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<String> cardChargeCooldown;
        private OptionalNullable<String> subscriptionCooldown;
        private OptionalNullable<String> idempotentCardChargeCooldown;
        private OptionalNullable<String> idempotentSubscriptionCooldown;
        private RestrictIpAfterFailedChargeConfig restrictIpAfterFailedCharge;
        private OptionalNullable<String> inspectSuspiciousLoginAfter;
        private OptionalNullable<Double> refundPercentLimit;
        private MerchantWebhookLimitChargeByCardConfiguration limitChargeByCardConfiguration;
        private OptionalNullable<Boolean> confirmationRequired;
        private OptionalNullable<Integer> minRefundThreshold;
        private MerchantWebhookLimitRefundBySalesConfiguration limitRefundBySales;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for cardChargeCooldown.
         * @param  cardChargeCooldown  String value for cardChargeCooldown.
         * @return Builder
         */
        public Builder cardChargeCooldown(String cardChargeCooldown) {
            this.cardChargeCooldown = OptionalNullable.of(cardChargeCooldown);
            return this;
        }

        /**
         * UnSetter for cardChargeCooldown.
         * @return Builder
         */
        public Builder unsetCardChargeCooldown() {
            cardChargeCooldown = null;
            return this;
        }

        /**
         * Setter for subscriptionCooldown.
         * @param  subscriptionCooldown  String value for subscriptionCooldown.
         * @return Builder
         */
        public Builder subscriptionCooldown(String subscriptionCooldown) {
            this.subscriptionCooldown = OptionalNullable.of(subscriptionCooldown);
            return this;
        }

        /**
         * UnSetter for subscriptionCooldown.
         * @return Builder
         */
        public Builder unsetSubscriptionCooldown() {
            subscriptionCooldown = null;
            return this;
        }

        /**
         * Setter for idempotentCardChargeCooldown.
         * @param  idempotentCardChargeCooldown  String value for idempotentCardChargeCooldown.
         * @return Builder
         */
        public Builder idempotentCardChargeCooldown(String idempotentCardChargeCooldown) {
            this.idempotentCardChargeCooldown = OptionalNullable.of(idempotentCardChargeCooldown);
            return this;
        }

        /**
         * UnSetter for idempotentCardChargeCooldown.
         * @return Builder
         */
        public Builder unsetIdempotentCardChargeCooldown() {
            idempotentCardChargeCooldown = null;
            return this;
        }

        /**
         * Setter for idempotentSubscriptionCooldown.
         * @param  idempotentSubscriptionCooldown  String value for idempotentSubscriptionCooldown.
         * @return Builder
         */
        public Builder idempotentSubscriptionCooldown(String idempotentSubscriptionCooldown) {
            this.idempotentSubscriptionCooldown =
                    OptionalNullable.of(idempotentSubscriptionCooldown);
            return this;
        }

        /**
         * UnSetter for idempotentSubscriptionCooldown.
         * @return Builder
         */
        public Builder unsetIdempotentSubscriptionCooldown() {
            idempotentSubscriptionCooldown = null;
            return this;
        }

        /**
         * Setter for restrictIpAfterFailedCharge.
         * @param  restrictIpAfterFailedCharge  RestrictIpAfterFailedChargeConfig value for
         *         restrictIpAfterFailedCharge.
         * @return Builder
         */
        public Builder restrictIpAfterFailedCharge(
                RestrictIpAfterFailedChargeConfig restrictIpAfterFailedCharge) {
            this.restrictIpAfterFailedCharge = restrictIpAfterFailedCharge;
            return this;
        }

        /**
         * Setter for inspectSuspiciousLoginAfter.
         * @param  inspectSuspiciousLoginAfter  String value for inspectSuspiciousLoginAfter.
         * @return Builder
         */
        public Builder inspectSuspiciousLoginAfter(String inspectSuspiciousLoginAfter) {
            this.inspectSuspiciousLoginAfter = OptionalNullable.of(inspectSuspiciousLoginAfter);
            return this;
        }

        /**
         * UnSetter for inspectSuspiciousLoginAfter.
         * @return Builder
         */
        public Builder unsetInspectSuspiciousLoginAfter() {
            inspectSuspiciousLoginAfter = null;
            return this;
        }

        /**
         * Setter for refundPercentLimit.
         * @param  refundPercentLimit  Double value for refundPercentLimit.
         * @return Builder
         */
        public Builder refundPercentLimit(Double refundPercentLimit) {
            this.refundPercentLimit = OptionalNullable.of(refundPercentLimit);
            return this;
        }

        /**
         * UnSetter for refundPercentLimit.
         * @return Builder
         */
        public Builder unsetRefundPercentLimit() {
            refundPercentLimit = null;
            return this;
        }

        /**
         * Setter for limitChargeByCardConfiguration.
         * @param  limitChargeByCardConfiguration  MerchantWebhookLimitChargeByCardConfiguration
         *         value for limitChargeByCardConfiguration.
         * @return Builder
         */
        public Builder limitChargeByCardConfiguration(
                MerchantWebhookLimitChargeByCardConfiguration limitChargeByCardConfiguration) {
            this.limitChargeByCardConfiguration = limitChargeByCardConfiguration;
            return this;
        }

        /**
         * Setter for confirmationRequired.
         * @param  confirmationRequired  Boolean value for confirmationRequired.
         * @return Builder
         */
        public Builder confirmationRequired(Boolean confirmationRequired) {
            this.confirmationRequired = OptionalNullable.of(confirmationRequired);
            return this;
        }

        /**
         * UnSetter for confirmationRequired.
         * @return Builder
         */
        public Builder unsetConfirmationRequired() {
            confirmationRequired = null;
            return this;
        }

        /**
         * Setter for minRefundThreshold.
         * @param  minRefundThreshold  Integer value for minRefundThreshold.
         * @return Builder
         */
        public Builder minRefundThreshold(Integer minRefundThreshold) {
            this.minRefundThreshold = OptionalNullable.of(minRefundThreshold);
            return this;
        }

        /**
         * UnSetter for minRefundThreshold.
         * @return Builder
         */
        public Builder unsetMinRefundThreshold() {
            minRefundThreshold = null;
            return this;
        }

        /**
         * Setter for limitRefundBySales.
         * @param  limitRefundBySales  MerchantWebhookLimitRefundBySalesConfiguration value for
         *         limitRefundBySales.
         * @return Builder
         */
        public Builder limitRefundBySales(
                MerchantWebhookLimitRefundBySalesConfiguration limitRefundBySales) {
            this.limitRefundBySales = limitRefundBySales;
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
         * Builds a new {@link MerchantWebhookSecurityConfiguration} object using the set fields.
         * @return {@link MerchantWebhookSecurityConfiguration}
         */
        public MerchantWebhookSecurityConfiguration build() {
            MerchantWebhookSecurityConfiguration model =
                    new MerchantWebhookSecurityConfiguration(cardChargeCooldown,
                            subscriptionCooldown, idempotentCardChargeCooldown,
                            idempotentSubscriptionCooldown, restrictIpAfterFailedCharge,
                            inspectSuspiciousLoginAfter, refundPercentLimit,
                            limitChargeByCardConfiguration, confirmationRequired,
                            minRefundThreshold, limitRefundBySales);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
