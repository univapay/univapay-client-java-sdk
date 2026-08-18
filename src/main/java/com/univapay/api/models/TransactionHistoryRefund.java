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
import java.util.UUID;

/**
 * This is a model class for TransactionHistoryRefund type.
 */
public class TransactionHistoryRefund {
    private UUID refundId;
    private Integer amount;
    private String currency;
    private Double amountFormatted;
    private TransactionHistoryRefundStatus status;
    private TransactionHistoryRefundReason reason;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionHistoryRefund() {
    }

    /**
     * Initialization constructor.
     * @param  refundId  UUID value for refundId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  status  TransactionHistoryRefundStatus value for status.
     * @param  reason  TransactionHistoryRefundReason value for reason.
     */
    public TransactionHistoryRefund(
            UUID refundId,
            Integer amount,
            String currency,
            Double amountFormatted,
            TransactionHistoryRefundStatus status,
            TransactionHistoryRefundReason reason) {
        this.refundId = refundId;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.status = status;
        this.reason = reason;
    }

    /**
     * Getter for RefundId.
     * Unique identifier of the refund.
     * @return Returns the UUID
     */
    @JsonGetter("refund_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getRefundId() {
        return refundId;
    }

    /**
     * Setter for RefundId.
     * Unique identifier of the refund.
     * @param refundId Value for UUID
     */
    @JsonSetter("refund_id")
    public void setRefundId(UUID refundId) {
        this.refundId = refundId;
    }

    /**
     * Getter for Amount.
     * Refunded amount, in the currency's minor unit.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Refunded amount, in the currency's minor unit.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO-4217 currency code.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO-4217 currency code.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for AmountFormatted.
     * Refunded amount, formatted per the currency's display scale.
     * @return Returns the Double
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * Refunded amount, formatted per the currency's display scale.
     * @param amountFormatted Value for Double
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(Double amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    /**
     * Getter for Status.
     * Status of a single refund entry.
     * @return Returns the TransactionHistoryRefundStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionHistoryRefundStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of a single refund entry.
     * @param status Value for TransactionHistoryRefundStatus
     */
    @JsonSetter("status")
    public void setStatus(TransactionHistoryRefundStatus status) {
        this.status = status;
    }

    /**
     * Getter for Reason.
     * Reason code for a refund.
     * @return Returns the TransactionHistoryRefundReason
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionHistoryRefundReason getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * Reason code for a refund.
     * @param reason Value for TransactionHistoryRefundReason
     */
    @JsonSetter("reason")
    public void setReason(TransactionHistoryRefundReason reason) {
        this.reason = reason;
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
     * Converts this TransactionHistoryRefund into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionHistoryRefund [" + "refundId=" + refundId + ", amount=" + amount
                + ", currency=" + currency + ", amountFormatted=" + amountFormatted + ", status="
                + status + ", reason=" + reason + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link TransactionHistoryRefund.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionHistoryRefund.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .refundId(getRefundId())
                .amount(getAmount())
                .currency(getCurrency())
                .amountFormatted(getAmountFormatted())
                .status(getStatus())
                .reason(getReason());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionHistoryRefund}.
     */
    public static class Builder {
        private UUID refundId;
        private Integer amount;
        private String currency;
        private Double amountFormatted;
        private TransactionHistoryRefundStatus status;
        private TransactionHistoryRefundReason reason;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for refundId.
         * @param  refundId  UUID value for refundId.
         * @return Builder
         */
        public Builder refundId(UUID refundId) {
            this.refundId = refundId;
            return this;
        }

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
         * Setter for amountFormatted.
         * @param  amountFormatted  Double value for amountFormatted.
         * @return Builder
         */
        public Builder amountFormatted(Double amountFormatted) {
            this.amountFormatted = amountFormatted;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  TransactionHistoryRefundStatus value for status.
         * @return Builder
         */
        public Builder status(TransactionHistoryRefundStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  TransactionHistoryRefundReason value for reason.
         * @return Builder
         */
        public Builder reason(TransactionHistoryRefundReason reason) {
            this.reason = reason;
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
         * Builds a new {@link TransactionHistoryRefund} object using the set fields.
         * @return {@link TransactionHistoryRefund}
         */
        public TransactionHistoryRefund build() {
            TransactionHistoryRefund model =
                    new TransactionHistoryRefund(refundId, amount, currency, amountFormatted,
                            status, reason);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
