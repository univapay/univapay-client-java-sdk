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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.univapay.api.DateTimeHelper;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for Refund type.
 */
public class Refund {
    private UUID id;
    private UUID storeId;
    private UUID chargeId;
    private RefundStatus status;
    private Integer amount;
    private String currency;
    private Double amountFormatted;
    private OptionalNullable<RefundReasonResponse> reason;
    private OptionalNullable<String> message;
    private OptionalNullable<PaymentError> error;
    private GenericMetadata metadata;
    private ChargeMode mode;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public Refund() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  chargeId  UUID value for chargeId.
     * @param  status  RefundStatus value for status.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  reason  RefundReasonResponse value for reason.
     * @param  message  String value for message.
     * @param  error  PaymentError value for error.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */
    public Refund(
            UUID id,
            UUID storeId,
            UUID chargeId,
            RefundStatus status,
            Integer amount,
            String currency,
            Double amountFormatted,
            RefundReasonResponse reason,
            String message,
            PaymentError error,
            GenericMetadata metadata,
            ChargeMode mode,
            LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.storeId = storeId;
        this.chargeId = chargeId;
        this.status = status;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.reason = OptionalNullable.of(reason);
        this.message = OptionalNullable.of(message);
        this.error = OptionalNullable.of(error);
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  chargeId  UUID value for chargeId.
     * @param  status  RefundStatus value for status.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  reason  RefundReasonResponse value for reason.
     * @param  message  String value for message.
     * @param  error  PaymentError value for error.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */

    protected Refund(UUID id, UUID storeId, UUID chargeId, RefundStatus status, Integer amount,
            String currency, Double amountFormatted, OptionalNullable<RefundReasonResponse> reason,
            OptionalNullable<String> message, OptionalNullable<PaymentError> error,
            GenericMetadata metadata, ChargeMode mode, LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.storeId = storeId;
        this.chargeId = chargeId;
        this.status = status;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.reason = reason;
        this.message = message;
        this.error = error;
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for Id.
     * Unique identifier.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for StoreId.
     * Store identifier.
     * @return Returns the UUID
     */
    @JsonGetter("store_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getStoreId() {
        return storeId;
    }

    /**
     * Setter for StoreId.
     * Store identifier.
     * @param storeId Value for UUID
     */
    @JsonSetter("store_id")
    public void setStoreId(UUID storeId) {
        this.storeId = storeId;
    }

    /**
     * Getter for ChargeId.
     * Charge identifier.
     * @return Returns the UUID
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getChargeId() {
        return chargeId;
    }

    /**
     * Setter for ChargeId.
     * Charge identifier.
     * @param chargeId Value for UUID
     */
    @JsonSetter("charge_id")
    public void setChargeId(UUID chargeId) {
        this.chargeId = chargeId;
    }

    /**
     * Getter for Status.
     * Current status of the refund. `pending`: The refund has been created and is being processed.
     * `successful`: The refund was processed successfully. `failed`: The refund was rejected by the
     * gateway. `error`: An unexpected error occurred during processing.
     * @return Returns the RefundStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current status of the refund. `pending`: The refund has been created and is being processed.
     * `successful`: The refund was processed successfully. `failed`: The refund was rejected by the
     * gateway. `error`: An unexpected error occurred during processing.
     * @param status Value for RefundStatus
     */
    @JsonSetter("status")
    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    /**
     * Getter for Amount.
     * Refund amount in the smallest currency unit (e.g., cents for USD, yen for JPY).
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Refund amount in the smallest currency unit (e.g., cents for USD, yen for JPY).
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO-4217 currency code. Must match the charged currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO-4217 currency code. Must match the charged currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for AmountFormatted.
     * Refund amount formatted for display.
     * @return Returns the Double
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * Refund amount formatted for display.
     * @param amountFormatted Value for Double
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(Double amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    /**
     * Internal Getter for Reason.
     * Refund reason returned by the API, or `null` when unset.
     * @return Returns the Internal RefundReasonResponse
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<RefundReasonResponse> internalGetReason() {
        return this.reason;
    }

    /**
     * Getter for Reason.
     * Refund reason returned by the API, or `null` when unset.
     * @return Returns the RefundReasonResponse
     */
    public RefundReasonResponse getReason() {
        return OptionalNullable.getFrom(reason);
    }

    /**
     * Setter for Reason.
     * Refund reason returned by the API, or `null` when unset.
     * @param reason Value for RefundReasonResponse
     */
    @JsonSetter("reason")
    public void setReason(RefundReasonResponse reason) {
        this.reason = OptionalNullable.of(reason);
    }

    /**
     * UnSetter for Reason.
     * Refund reason returned by the API, or `null` when unset.
     */
    public void unsetReason() {
        reason = null;
    }

    /**
     * Internal Getter for Message.
     * Optional free-text note about the refund.
     * @return Returns the Internal String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMessage() {
        return this.message;
    }

    /**
     * Getter for Message.
     * Optional free-text note about the refund.
     * @return Returns the String
     */
    public String getMessage() {
        return OptionalNullable.getFrom(message);
    }

    /**
     * Setter for Message.
     * Optional free-text note about the refund.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = OptionalNullable.of(message);
    }

    /**
     * UnSetter for Message.
     * Optional free-text note about the refund.
     */
    public void unsetMessage() {
        message = null;
    }

    /**
     * Internal Getter for Error.
     * Payment error details, or null if successful.
     * @return Returns the Internal PaymentError
     */
    @JsonGetter("error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PaymentError> internalGetError() {
        return this.error;
    }

    /**
     * Getter for Error.
     * Payment error details, or null if successful.
     * @return Returns the PaymentError
     */
    public PaymentError getError() {
        return OptionalNullable.getFrom(error);
    }

    /**
     * Setter for Error.
     * Payment error details, or null if successful.
     * @param error Value for PaymentError
     */
    @JsonSetter("error")
    public void setError(PaymentError error) {
        this.error = OptionalNullable.of(error);
    }

    /**
     * UnSetter for Error.
     * Payment error details, or null if successful.
     */
    public void unsetError() {
        error = null;
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
     * Getter for Mode.
     * Charge Mode schema.
     * @return Returns the ChargeMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeMode getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Charge Mode schema.
     * @param mode Value for ChargeMode
     */
    @JsonSetter("mode")
    public void setMode(ChargeMode mode) {
        this.mode = mode;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the resource was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn.
     * Timestamp when the resource was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for UpdatedOn.
     * Timestamp when the resource was last updated.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Setter for UpdatedOn.
     * Timestamp when the resource was last updated.
     * @param updatedOn Value for LocalDateTime
     */
    @JsonSetter("updated_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
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
     * Converts this Refund into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Refund [" + "id=" + id + ", storeId=" + storeId + ", chargeId=" + chargeId
                + ", status=" + status + ", amount=" + amount + ", currency=" + currency
                + ", amountFormatted=" + amountFormatted + ", reason=" + reason + ", message="
                + message + ", error=" + error + ", metadata=" + metadata + ", mode=" + mode
                + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link Refund.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Refund.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .storeId(getStoreId())
                .chargeId(getChargeId())
                .status(getStatus())
                .amount(getAmount())
                .currency(getCurrency())
                .amountFormatted(getAmountFormatted())
                .metadata(getMetadata())
                .mode(getMode())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.reason = internalGetReason();
        builder.message = internalGetMessage();
        builder.error = internalGetError();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link Refund}.
     */
    public static class Builder {
        private UUID id;
        private UUID storeId;
        private UUID chargeId;
        private RefundStatus status;
        private Integer amount;
        private String currency;
        private Double amountFormatted;
        private OptionalNullable<RefundReasonResponse> reason;
        private OptionalNullable<String> message;
        private OptionalNullable<PaymentError> error;
        private GenericMetadata metadata;
        private ChargeMode mode;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for id.
         * @param  id  UUID value for id.
         * @return Builder
         */
        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for storeId.
         * @param  storeId  UUID value for storeId.
         * @return Builder
         */
        public Builder storeId(UUID storeId) {
            this.storeId = storeId;
            return this;
        }

        /**
         * Setter for chargeId.
         * @param  chargeId  UUID value for chargeId.
         * @return Builder
         */
        public Builder chargeId(UUID chargeId) {
            this.chargeId = chargeId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  RefundStatus value for status.
         * @return Builder
         */
        public Builder status(RefundStatus status) {
            this.status = status;
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
         * Setter for reason.
         * @param  reason  RefundReasonResponse value for reason.
         * @return Builder
         */
        public Builder reason(RefundReasonResponse reason) {
            this.reason = OptionalNullable.of(reason);
            return this;
        }

        /**
         * UnSetter for reason.
         * @return Builder
         */
        public Builder unsetReason() {
            reason = null;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = OptionalNullable.of(message);
            return this;
        }

        /**
         * UnSetter for message.
         * @return Builder
         */
        public Builder unsetMessage() {
            message = null;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  PaymentError value for error.
         * @return Builder
         */
        public Builder error(PaymentError error) {
            this.error = OptionalNullable.of(error);
            return this;
        }

        /**
         * UnSetter for error.
         * @return Builder
         */
        public Builder unsetError() {
            error = null;
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
         * Setter for mode.
         * @param  mode  ChargeMode value for mode.
         * @return Builder
         */
        public Builder mode(ChargeMode mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for updatedOn.
         * @param  updatedOn  LocalDateTime value for updatedOn.
         * @return Builder
         */
        public Builder updatedOn(LocalDateTime updatedOn) {
            this.updatedOn = updatedOn;
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
         * Builds a new {@link Refund} object using the set fields.
         * @return {@link Refund}
         */
        public Refund build() {
            Refund model =
                    new Refund(id, storeId, chargeId, status, amount, currency, amountFormatted,
                            reason, message, error, metadata, mode, createdOn, updatedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
