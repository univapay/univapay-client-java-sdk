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
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for MerchantWebhookMoneyAmount type.
 */
public class MerchantWebhookMoneyAmount {
    private Integer amount;
    private String currency;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookMoneyAmount() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     */
    public MerchantWebhookMoneyAmount(
            Integer amount,
            String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Getter for Amount.
     * Amount in minor currency units.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount in minor currency units.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO 4217 currency code.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO 4217 currency code.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
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
     * Converts this MerchantWebhookMoneyAmount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookMoneyAmount [" + "amount=" + amount + ", currency=" + currency
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookMoneyAmount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookMoneyAmount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookMoneyAmount}.
     */
    public static class Builder {
        private Integer amount;
        private String currency;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
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
         * Builds a new {@link MerchantWebhookMoneyAmount} object using the set fields.
         * @return {@link MerchantWebhookMoneyAmount}
         */
        public MerchantWebhookMoneyAmount build() {
            MerchantWebhookMoneyAmount model =
                    new MerchantWebhookMoneyAmount(amount, currency);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
