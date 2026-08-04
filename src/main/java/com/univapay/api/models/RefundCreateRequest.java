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
 * This is a model class for RefundCreateRequest type.
 */
public class RefundCreateRequest {
    private int amount;
    private String currency;
    private RefundReasonRequest reason;
    private String message;
    private GenericMetadata metadata;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public RefundCreateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  currency  String value for currency.
     * @param  reason  RefundReasonRequest value for reason.
     * @param  message  String value for message.
     * @param  metadata  GenericMetadata value for metadata.
     */
    public RefundCreateRequest(
            int amount,
            String currency,
            RefundReasonRequest reason,
            String message,
            GenericMetadata metadata) {
        this.amount = amount;
        this.currency = currency;
        this.reason = reason;
        this.message = message;
        this.metadata = metadata;
    }

    /**
     * Getter for Amount.
     * Amount to refund in the smallest currency unit. Must be greater than 0 and not exceed the
     * charged amount. Partial refunds are supported for most payment methods.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount to refund in the smallest currency unit. Must be greater than 0 and not exceed the
     * charged amount. Partial refunds are supported for most payment methods.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO-4217 currency code. Must exactly match the currency of the original charge.
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO-4217 currency code. Must exactly match the currency of the original charge.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Reason.
     * The reason for the refund (merchant-settable values). `duplicate`: A duplicate charge was
     * made. `fraud`: The charge is fraudulent. `customer_request`: The customer requested the
     * refund.
     * @return Returns the RefundReasonRequest
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundReasonRequest getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * The reason for the refund (merchant-settable values). `duplicate`: A duplicate charge was
     * made. `fraud`: The charge is fraudulent. `customer_request`: The customer requested the
     * refund.
     * @param reason Value for RefundReasonRequest
     */
    @JsonSetter("reason")
    public void setReason(RefundReasonRequest reason) {
        this.reason = reason;
    }

    /**
     * Getter for Message.
     * Optional free-text note about the reason for the refund.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * Optional free-text note about the reason for the refund.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Metadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the GenericMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GenericMetadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * A free-form dictionary for custom metadata.
     * @param metadata Value for GenericMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(GenericMetadata metadata) {
        this.metadata = metadata;
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
     * Converts this RefundCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundCreateRequest [" + "amount=" + amount + ", currency=" + currency + ", reason="
                + reason + ", message=" + message + ", metadata=" + metadata
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link RefundCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, currency)
                .reason(getReason())
                .message(getMessage())
                .metadata(getMetadata());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link RefundCreateRequest}.
     */
    public static class Builder {
        private int amount;
        private String currency;
        private RefundReasonRequest reason;
        private String message;
        private GenericMetadata metadata;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  int value for amount.
         * @param  currency  String value for currency.
         */
        public Builder(int amount, String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
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
         * Setter for reason.
         * @param  reason  RefundReasonRequest value for reason.
         * @return Builder
         */
        public Builder reason(RefundReasonRequest reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  GenericMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(GenericMetadata metadata) {
            this.metadata = metadata;
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
         * Builds a new {@link RefundCreateRequest} object using the set fields.
         * @return {@link RefundCreateRequest}
         */
        public RefundCreateRequest build() {
            RefundCreateRequest model =
                    new RefundCreateRequest(amount, currency, reason, message, metadata);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
