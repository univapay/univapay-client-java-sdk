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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for SubscriptionNextPayment type.
 */
public class SubscriptionNextPayment {
    private UUID id;
    private LocalDate dueDate;
    private String zoneId;
    private Integer amount;
    private String currency;
    private Double amountFormatted;
    private Boolean isPaid;
    private Boolean isLastPayment;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private OptionalNullable<LocalDate> retryDate;
    private OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionNextPayment() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  zoneId  String value for zoneId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  isPaid  Boolean value for isPaid.
     * @param  isLastPayment  Boolean value for isLastPayment.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     * @param  retryDate  LocalDate value for retryDate.
     * @param  terminateWithStatus  SubscriptionTerminateWithStatus value for terminateWithStatus.
     */
    public SubscriptionNextPayment(
            UUID id,
            LocalDate dueDate,
            String zoneId,
            Integer amount,
            String currency,
            Double amountFormatted,
            Boolean isPaid,
            Boolean isLastPayment,
            LocalDateTime createdOn,
            LocalDateTime updatedOn,
            LocalDate retryDate,
            SubscriptionTerminateWithStatus terminateWithStatus) {
        this.id = id;
        this.dueDate = dueDate;
        this.zoneId = zoneId;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.isPaid = isPaid;
        this.isLastPayment = isLastPayment;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.retryDate = OptionalNullable.of(retryDate);
        this.terminateWithStatus = OptionalNullable.of(terminateWithStatus);
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  zoneId  String value for zoneId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  isPaid  Boolean value for isPaid.
     * @param  isLastPayment  Boolean value for isLastPayment.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     * @param  retryDate  LocalDate value for retryDate.
     * @param  terminateWithStatus  SubscriptionTerminateWithStatus value for terminateWithStatus.
     */

    protected SubscriptionNextPayment(UUID id, LocalDate dueDate, String zoneId, Integer amount,
            String currency, Double amountFormatted, Boolean isPaid, Boolean isLastPayment,
            LocalDateTime createdOn, LocalDateTime updatedOn, OptionalNullable<LocalDate> retryDate,
            OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus) {
        this.id = id;
        this.dueDate = dueDate;
        this.zoneId = zoneId;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.isPaid = isPaid;
        this.isLastPayment = isLastPayment;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.retryDate = retryDate;
        this.terminateWithStatus = terminateWithStatus;
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
     * Getter for DueDate.
     * Scheduled due date.
     * @return Returns the LocalDate
     */
    @JsonGetter("due_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Setter for DueDate.
     * Scheduled due date.
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter for ZoneId.
     * IANA timezone identifier.
     * @return Returns the String
     */
    @JsonGetter("zone_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Setter for ZoneId.
     * IANA timezone identifier.
     * @param zoneId Value for String
     */
    @JsonSetter("zone_id")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * Getter for Amount.
     * Amount in the smallest currency unit.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount in the smallest currency unit.
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
     * Amount formatted for display.
     * @return Returns the Double
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * Amount formatted for display.
     * @param amountFormatted Value for Double
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(Double amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    /**
     * Getter for IsPaid.
     * Whether the payment has been paid.
     * @return Returns the Boolean
     */
    @JsonGetter("is_paid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPaid() {
        return isPaid;
    }

    /**
     * Setter for IsPaid.
     * Whether the payment has been paid.
     * @param isPaid Value for Boolean
     */
    @JsonSetter("is_paid")
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * Getter for IsLastPayment.
     * Whether this is the final payment in the schedule.
     * @return Returns the Boolean
     */
    @JsonGetter("is_last_payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsLastPayment() {
        return isLastPayment;
    }

    /**
     * Setter for IsLastPayment.
     * Whether this is the final payment in the schedule.
     * @param isLastPayment Value for Boolean
     */
    @JsonSetter("is_last_payment")
    public void setIsLastPayment(Boolean isLastPayment) {
        this.isLastPayment = isLastPayment;
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
     * Internal Getter for RetryDate.
     * Scheduled retry date.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("retry_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetRetryDate() {
        return this.retryDate;
    }

    /**
     * Getter for RetryDate.
     * Scheduled retry date.
     * @return Returns the LocalDate
     */
    public LocalDate getRetryDate() {
        return OptionalNullable.getFrom(retryDate);
    }

    /**
     * Setter for RetryDate.
     * Scheduled retry date.
     * @param retryDate Value for LocalDate
     */
    @JsonSetter("retry_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setRetryDate(LocalDate retryDate) {
        this.retryDate = OptionalNullable.of(retryDate);
    }

    /**
     * UnSetter for RetryDate.
     * Scheduled retry date.
     */
    public void unsetRetryDate() {
        retryDate = null;
    }

    /**
     * Internal Getter for TerminateWithStatus.
     * Schedule a status transition on a payment's due date. Set to `suspended` or `canceled` to
     * schedule termination. Send `null` to cancel a previously scheduled transition.
     * @return Returns the Internal SubscriptionTerminateWithStatus
     */
    @JsonGetter("terminate_with_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<SubscriptionTerminateWithStatus> internalGetTerminateWithStatus() {
        return this.terminateWithStatus;
    }

    /**
     * Getter for TerminateWithStatus.
     * Schedule a status transition on a payment's due date. Set to `suspended` or `canceled` to
     * schedule termination. Send `null` to cancel a previously scheduled transition.
     * @return Returns the SubscriptionTerminateWithStatus
     */
    public SubscriptionTerminateWithStatus getTerminateWithStatus() {
        return OptionalNullable.getFrom(terminateWithStatus);
    }

    /**
     * Setter for TerminateWithStatus.
     * Schedule a status transition on a payment's due date. Set to `suspended` or `canceled` to
     * schedule termination. Send `null` to cancel a previously scheduled transition.
     * @param terminateWithStatus Value for SubscriptionTerminateWithStatus
     */
    @JsonSetter("terminate_with_status")
    public void setTerminateWithStatus(SubscriptionTerminateWithStatus terminateWithStatus) {
        this.terminateWithStatus = OptionalNullable.of(terminateWithStatus);
    }

    /**
     * UnSetter for TerminateWithStatus.
     * Schedule a status transition on a payment's due date. Set to `suspended` or `canceled` to
     * schedule termination. Send `null` to cancel a previously scheduled transition.
     */
    public void unsetTerminateWithStatus() {
        terminateWithStatus = null;
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
     * Converts this SubscriptionNextPayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionNextPayment [" + "id=" + id + ", dueDate=" + dueDate + ", zoneId="
                + zoneId + ", amount=" + amount + ", currency=" + currency + ", amountFormatted="
                + amountFormatted + ", isPaid=" + isPaid + ", isLastPayment=" + isLastPayment
                + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", retryDate="
                + retryDate + ", terminateWithStatus=" + terminateWithStatus
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionNextPayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionNextPayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .dueDate(getDueDate())
                .zoneId(getZoneId())
                .amount(getAmount())
                .currency(getCurrency())
                .amountFormatted(getAmountFormatted())
                .isPaid(getIsPaid())
                .isLastPayment(getIsLastPayment())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.retryDate = internalGetRetryDate();
        builder.terminateWithStatus = internalGetTerminateWithStatus();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionNextPayment}.
     */
    public static class Builder {
        private UUID id;
        private LocalDate dueDate;
        private String zoneId;
        private Integer amount;
        private String currency;
        private Double amountFormatted;
        private Boolean isPaid;
        private Boolean isLastPayment;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
        private OptionalNullable<LocalDate> retryDate;
        private OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus;
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
         * Setter for dueDate.
         * @param  dueDate  LocalDate value for dueDate.
         * @return Builder
         */
        public Builder dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
         * Setter for zoneId.
         * @param  zoneId  String value for zoneId.
         * @return Builder
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
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
         * Setter for isPaid.
         * @param  isPaid  Boolean value for isPaid.
         * @return Builder
         */
        public Builder isPaid(Boolean isPaid) {
            this.isPaid = isPaid;
            return this;
        }

        /**
         * Setter for isLastPayment.
         * @param  isLastPayment  Boolean value for isLastPayment.
         * @return Builder
         */
        public Builder isLastPayment(Boolean isLastPayment) {
            this.isLastPayment = isLastPayment;
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
         * Setter for retryDate.
         * @param  retryDate  LocalDate value for retryDate.
         * @return Builder
         */
        public Builder retryDate(LocalDate retryDate) {
            this.retryDate = OptionalNullable.of(retryDate);
            return this;
        }

        /**
         * UnSetter for retryDate.
         * @return Builder
         */
        public Builder unsetRetryDate() {
            retryDate = null;
            return this;
        }

        /**
         * Setter for terminateWithStatus.
         * @param  terminateWithStatus  SubscriptionTerminateWithStatus value for
         *         terminateWithStatus.
         * @return Builder
         */
        public Builder terminateWithStatus(SubscriptionTerminateWithStatus terminateWithStatus) {
            this.terminateWithStatus = OptionalNullable.of(terminateWithStatus);
            return this;
        }

        /**
         * UnSetter for terminateWithStatus.
         * @return Builder
         */
        public Builder unsetTerminateWithStatus() {
            terminateWithStatus = null;
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
         * Builds a new {@link SubscriptionNextPayment} object using the set fields.
         * @return {@link SubscriptionNextPayment}
         */
        public SubscriptionNextPayment build() {
            SubscriptionNextPayment model =
                    new SubscriptionNextPayment(id, dueDate, zoneId, amount, currency,
                            amountFormatted, isPaid, isLastPayment, createdOn, updatedOn, retryDate,
                            terminateWithStatus);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
