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
 * This is a model class for CustomsDeclarationWebhookResult type.
 */
public class CustomsDeclarationWebhookResult {
    private OptionalNullable<String> approvingAuthority;
    private OptionalNullable<String> tradeId;
    private OptionalNullable<String> transactionId;
    private OptionalNullable<String> chargeTransactionId;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CustomsDeclarationWebhookResult() {
    }

    /**
     * Initialization constructor.
     * @param  approvingAuthority  String value for approvingAuthority.
     * @param  tradeId  String value for tradeId.
     * @param  transactionId  String value for transactionId.
     * @param  chargeTransactionId  String value for chargeTransactionId.
     */
    public CustomsDeclarationWebhookResult(
            String approvingAuthority,
            String tradeId,
            String transactionId,
            String chargeTransactionId) {
        this.approvingAuthority = OptionalNullable.of(approvingAuthority);
        this.tradeId = OptionalNullable.of(tradeId);
        this.transactionId = OptionalNullable.of(transactionId);
        this.chargeTransactionId = OptionalNullable.of(chargeTransactionId);
    }

    /**
     * Initialization constructor.
     * @param  approvingAuthority  String value for approvingAuthority.
     * @param  tradeId  String value for tradeId.
     * @param  transactionId  String value for transactionId.
     * @param  chargeTransactionId  String value for chargeTransactionId.
     */

    protected CustomsDeclarationWebhookResult(OptionalNullable<String> approvingAuthority,
            OptionalNullable<String> tradeId, OptionalNullable<String> transactionId,
            OptionalNullable<String> chargeTransactionId) {
        this.approvingAuthority = approvingAuthority;
        this.tradeId = tradeId;
        this.transactionId = transactionId;
        this.chargeTransactionId = chargeTransactionId;
    }

    /**
     * Internal Getter for ApprovingAuthority.
     * Customs authority that approved the declaration.
     * @return Returns the Internal String
     */
    @JsonGetter("approving_authority")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetApprovingAuthority() {
        return this.approvingAuthority;
    }

    /**
     * Getter for ApprovingAuthority.
     * Customs authority that approved the declaration.
     * @return Returns the String
     */
    public String getApprovingAuthority() {
        return OptionalNullable.getFrom(approvingAuthority);
    }

    /**
     * Setter for ApprovingAuthority.
     * Customs authority that approved the declaration.
     * @param approvingAuthority Value for String
     */
    @JsonSetter("approving_authority")
    public void setApprovingAuthority(String approvingAuthority) {
        this.approvingAuthority = OptionalNullable.of(approvingAuthority);
    }

    /**
     * UnSetter for ApprovingAuthority.
     * Customs authority that approved the declaration.
     */
    public void unsetApprovingAuthority() {
        approvingAuthority = null;
    }

    /**
     * Internal Getter for TradeId.
     * Gateway trade identifier.
     * @return Returns the Internal String
     */
    @JsonGetter("trade_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTradeId() {
        return this.tradeId;
    }

    /**
     * Getter for TradeId.
     * Gateway trade identifier.
     * @return Returns the String
     */
    public String getTradeId() {
        return OptionalNullable.getFrom(tradeId);
    }

    /**
     * Setter for TradeId.
     * Gateway trade identifier.
     * @param tradeId Value for String
     */
    @JsonSetter("trade_id")
    public void setTradeId(String tradeId) {
        this.tradeId = OptionalNullable.of(tradeId);
    }

    /**
     * UnSetter for TradeId.
     * Gateway trade identifier.
     */
    public void unsetTradeId() {
        tradeId = null;
    }

    /**
     * Internal Getter for TransactionId.
     * Gateway transaction identifier for customs.
     * @return Returns the Internal String
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTransactionId() {
        return this.transactionId;
    }

    /**
     * Getter for TransactionId.
     * Gateway transaction identifier for customs.
     * @return Returns the String
     */
    public String getTransactionId() {
        return OptionalNullable.getFrom(transactionId);
    }

    /**
     * Setter for TransactionId.
     * Gateway transaction identifier for customs.
     * @param transactionId Value for String
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = OptionalNullable.of(transactionId);
    }

    /**
     * UnSetter for TransactionId.
     * Gateway transaction identifier for customs.
     */
    public void unsetTransactionId() {
        transactionId = null;
    }

    /**
     * Internal Getter for ChargeTransactionId.
     * Gateway charge transaction identifier linked to the declaration.
     * @return Returns the Internal String
     */
    @JsonGetter("charge_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetChargeTransactionId() {
        return this.chargeTransactionId;
    }

    /**
     * Getter for ChargeTransactionId.
     * Gateway charge transaction identifier linked to the declaration.
     * @return Returns the String
     */
    public String getChargeTransactionId() {
        return OptionalNullable.getFrom(chargeTransactionId);
    }

    /**
     * Setter for ChargeTransactionId.
     * Gateway charge transaction identifier linked to the declaration.
     * @param chargeTransactionId Value for String
     */
    @JsonSetter("charge_transaction_id")
    public void setChargeTransactionId(String chargeTransactionId) {
        this.chargeTransactionId = OptionalNullable.of(chargeTransactionId);
    }

    /**
     * UnSetter for ChargeTransactionId.
     * Gateway charge transaction identifier linked to the declaration.
     */
    public void unsetChargeTransactionId() {
        chargeTransactionId = null;
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
     * Converts this CustomsDeclarationWebhookResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomsDeclarationWebhookResult [" + "approvingAuthority=" + approvingAuthority
                + ", tradeId=" + tradeId + ", transactionId=" + transactionId
                + ", chargeTransactionId=" + chargeTransactionId + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CustomsDeclarationWebhookResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomsDeclarationWebhookResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.approvingAuthority = internalGetApprovingAuthority();
        builder.tradeId = internalGetTradeId();
        builder.transactionId = internalGetTransactionId();
        builder.chargeTransactionId = internalGetChargeTransactionId();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CustomsDeclarationWebhookResult}.
     */
    public static class Builder {
        private OptionalNullable<String> approvingAuthority;
        private OptionalNullable<String> tradeId;
        private OptionalNullable<String> transactionId;
        private OptionalNullable<String> chargeTransactionId;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for approvingAuthority.
         * @param  approvingAuthority  String value for approvingAuthority.
         * @return Builder
         */
        public Builder approvingAuthority(String approvingAuthority) {
            this.approvingAuthority = OptionalNullable.of(approvingAuthority);
            return this;
        }

        /**
         * UnSetter for approvingAuthority.
         * @return Builder
         */
        public Builder unsetApprovingAuthority() {
            approvingAuthority = null;
            return this;
        }

        /**
         * Setter for tradeId.
         * @param  tradeId  String value for tradeId.
         * @return Builder
         */
        public Builder tradeId(String tradeId) {
            this.tradeId = OptionalNullable.of(tradeId);
            return this;
        }

        /**
         * UnSetter for tradeId.
         * @return Builder
         */
        public Builder unsetTradeId() {
            tradeId = null;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = OptionalNullable.of(transactionId);
            return this;
        }

        /**
         * UnSetter for transactionId.
         * @return Builder
         */
        public Builder unsetTransactionId() {
            transactionId = null;
            return this;
        }

        /**
         * Setter for chargeTransactionId.
         * @param  chargeTransactionId  String value for chargeTransactionId.
         * @return Builder
         */
        public Builder chargeTransactionId(String chargeTransactionId) {
            this.chargeTransactionId = OptionalNullable.of(chargeTransactionId);
            return this;
        }

        /**
         * UnSetter for chargeTransactionId.
         * @return Builder
         */
        public Builder unsetChargeTransactionId() {
            chargeTransactionId = null;
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
         * Builds a new {@link CustomsDeclarationWebhookResult} object using the set fields.
         * @return {@link CustomsDeclarationWebhookResult}
         */
        public CustomsDeclarationWebhookResult build() {
            CustomsDeclarationWebhookResult model =
                    new CustomsDeclarationWebhookResult(approvingAuthority, tradeId, transactionId,
                            chargeTransactionId);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
