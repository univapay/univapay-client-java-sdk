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
 * This is a model class for MerchantWebhookRecurringTokenConfiguration type.
 */
public class MerchantWebhookRecurringTokenConfiguration {
    private OptionalNullable<String> recurringType;
    private OptionalNullable<String> chargeWaitPeriod;
    private MerchantWebhookRecurringCvvConfirmationConfig cardChargeCvvConfirmation;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookRecurringTokenConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  recurringType  String value for recurringType.
     * @param  chargeWaitPeriod  String value for chargeWaitPeriod.
     * @param  cardChargeCvvConfirmation  MerchantWebhookRecurringCvvConfirmationConfig value for
     *         cardChargeCvvConfirmation.
     */
    public MerchantWebhookRecurringTokenConfiguration(
            String recurringType,
            String chargeWaitPeriod,
            MerchantWebhookRecurringCvvConfirmationConfig cardChargeCvvConfirmation) {
        this.recurringType = OptionalNullable.of(recurringType);
        this.chargeWaitPeriod = OptionalNullable.of(chargeWaitPeriod);
        this.cardChargeCvvConfirmation = cardChargeCvvConfirmation;
    }

    /**
     * Initialization constructor.
     * @param  recurringType  String value for recurringType.
     * @param  chargeWaitPeriod  String value for chargeWaitPeriod.
     * @param  cardChargeCvvConfirmation  MerchantWebhookRecurringCvvConfirmationConfig value for
     *         cardChargeCvvConfirmation.
     */

    protected MerchantWebhookRecurringTokenConfiguration(OptionalNullable<String> recurringType,
            OptionalNullable<String> chargeWaitPeriod,
            MerchantWebhookRecurringCvvConfirmationConfig cardChargeCvvConfirmation) {
        this.recurringType = recurringType;
        this.chargeWaitPeriod = chargeWaitPeriod;
        this.cardChargeCvvConfirmation = cardChargeCvvConfirmation;
    }

    /**
     * Internal Getter for RecurringType.
     * Merchant recurring-token privilege.
     * @return Returns the Internal String
     */
    @JsonGetter("recurring_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRecurringType() {
        return this.recurringType;
    }

    /**
     * Getter for RecurringType.
     * Merchant recurring-token privilege.
     * @return Returns the String
     */
    public String getRecurringType() {
        return OptionalNullable.getFrom(recurringType);
    }

    /**
     * Setter for RecurringType.
     * Merchant recurring-token privilege.
     * @param recurringType Value for String
     */
    @JsonSetter("recurring_type")
    public void setRecurringType(String recurringType) {
        this.recurringType = OptionalNullable.of(recurringType);
    }

    /**
     * UnSetter for RecurringType.
     * Merchant recurring-token privilege.
     */
    public void unsetRecurringType() {
        recurringType = null;
    }

    /**
     * Internal Getter for ChargeWaitPeriod.
     * ISO-8601 duration to wait before first recurring charge.
     * @return Returns the Internal String
     */
    @JsonGetter("charge_wait_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetChargeWaitPeriod() {
        return this.chargeWaitPeriod;
    }

    /**
     * Getter for ChargeWaitPeriod.
     * ISO-8601 duration to wait before first recurring charge.
     * @return Returns the String
     */
    public String getChargeWaitPeriod() {
        return OptionalNullable.getFrom(chargeWaitPeriod);
    }

    /**
     * Setter for ChargeWaitPeriod.
     * ISO-8601 duration to wait before first recurring charge.
     * @param chargeWaitPeriod Value for String
     */
    @JsonSetter("charge_wait_period")
    public void setChargeWaitPeriod(String chargeWaitPeriod) {
        this.chargeWaitPeriod = OptionalNullable.of(chargeWaitPeriod);
    }

    /**
     * UnSetter for ChargeWaitPeriod.
     * ISO-8601 duration to wait before first recurring charge.
     */
    public void unsetChargeWaitPeriod() {
        chargeWaitPeriod = null;
    }

    /**
     * Getter for CardChargeCvvConfirmation.
     * CVV confirmation rules for recurring token charges.
     * @return Returns the MerchantWebhookRecurringCvvConfirmationConfig
     */
    @JsonGetter("card_charge_cvv_confirmation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookRecurringCvvConfirmationConfig getCardChargeCvvConfirmation() {
        return cardChargeCvvConfirmation;
    }

    /**
     * Setter for CardChargeCvvConfirmation.
     * CVV confirmation rules for recurring token charges.
     * @param cardChargeCvvConfirmation Value for MerchantWebhookRecurringCvvConfirmationConfig
     */
    @JsonSetter("card_charge_cvv_confirmation")
    public void setCardChargeCvvConfirmation(MerchantWebhookRecurringCvvConfirmationConfig cardChargeCvvConfirmation) {
        this.cardChargeCvvConfirmation = cardChargeCvvConfirmation;
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
     * Converts this MerchantWebhookRecurringTokenConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookRecurringTokenConfiguration [" + "recurringType=" + recurringType
                + ", chargeWaitPeriod=" + chargeWaitPeriod + ", cardChargeCvvConfirmation="
                + cardChargeCvvConfirmation + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookRecurringTokenConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookRecurringTokenConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardChargeCvvConfirmation(getCardChargeCvvConfirmation());
        builder.recurringType = internalGetRecurringType();
        builder.chargeWaitPeriod = internalGetChargeWaitPeriod();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookRecurringTokenConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<String> recurringType;
        private OptionalNullable<String> chargeWaitPeriod;
        private MerchantWebhookRecurringCvvConfirmationConfig cardChargeCvvConfirmation;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for recurringType.
         * @param  recurringType  String value for recurringType.
         * @return Builder
         */
        public Builder recurringType(String recurringType) {
            this.recurringType = OptionalNullable.of(recurringType);
            return this;
        }

        /**
         * UnSetter for recurringType.
         * @return Builder
         */
        public Builder unsetRecurringType() {
            recurringType = null;
            return this;
        }

        /**
         * Setter for chargeWaitPeriod.
         * @param  chargeWaitPeriod  String value for chargeWaitPeriod.
         * @return Builder
         */
        public Builder chargeWaitPeriod(String chargeWaitPeriod) {
            this.chargeWaitPeriod = OptionalNullable.of(chargeWaitPeriod);
            return this;
        }

        /**
         * UnSetter for chargeWaitPeriod.
         * @return Builder
         */
        public Builder unsetChargeWaitPeriod() {
            chargeWaitPeriod = null;
            return this;
        }

        /**
         * Setter for cardChargeCvvConfirmation.
         * @param  cardChargeCvvConfirmation  MerchantWebhookRecurringCvvConfirmationConfig value
         *         for cardChargeCvvConfirmation.
         * @return Builder
         */
        public Builder cardChargeCvvConfirmation(
                MerchantWebhookRecurringCvvConfirmationConfig cardChargeCvvConfirmation) {
            this.cardChargeCvvConfirmation = cardChargeCvvConfirmation;
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
         * Builds a new {@link MerchantWebhookRecurringTokenConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookRecurringTokenConfiguration}
         */
        public MerchantWebhookRecurringTokenConfiguration build() {
            MerchantWebhookRecurringTokenConfiguration model =
                    new MerchantWebhookRecurringTokenConfiguration(recurringType, chargeWaitPeriod,
                            cardChargeCvvConfirmation);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
