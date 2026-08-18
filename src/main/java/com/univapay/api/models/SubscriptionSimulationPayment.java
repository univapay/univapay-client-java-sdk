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
import java.util.Map;

/**
 * This is a model class for SubscriptionSimulationPayment type.
 */
public class SubscriptionSimulationPayment {
    private LocalDate dueDate;
    private String zoneId;
    private Integer amount;
    private String currency;
    private Boolean isPaid;
    private Boolean isLastPayment;
    private OptionalNullable<LocalDate> successfulPaymentDate;
    private OptionalNullable<TerminateWithStatus> terminateWithStatus;
    private OptionalNullable<String> retryInterval;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionSimulationPayment() {
    }

    /**
     * Initialization constructor.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  zoneId  String value for zoneId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  isPaid  Boolean value for isPaid.
     * @param  isLastPayment  Boolean value for isLastPayment.
     * @param  successfulPaymentDate  LocalDate value for successfulPaymentDate.
     * @param  terminateWithStatus  TerminateWithStatus value for terminateWithStatus.
     * @param  retryInterval  String value for retryInterval.
     */
    public SubscriptionSimulationPayment(
            LocalDate dueDate,
            String zoneId,
            Integer amount,
            String currency,
            Boolean isPaid,
            Boolean isLastPayment,
            LocalDate successfulPaymentDate,
            TerminateWithStatus terminateWithStatus,
            String retryInterval) {
        this.dueDate = dueDate;
        this.zoneId = zoneId;
        this.amount = amount;
        this.currency = currency;
        this.isPaid = isPaid;
        this.isLastPayment = isLastPayment;
        this.successfulPaymentDate = OptionalNullable.of(successfulPaymentDate);
        this.terminateWithStatus = OptionalNullable.of(terminateWithStatus);
        this.retryInterval = OptionalNullable.of(retryInterval);
    }

    /**
     * Initialization constructor.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  zoneId  String value for zoneId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  isPaid  Boolean value for isPaid.
     * @param  isLastPayment  Boolean value for isLastPayment.
     * @param  successfulPaymentDate  LocalDate value for successfulPaymentDate.
     * @param  terminateWithStatus  TerminateWithStatus value for terminateWithStatus.
     * @param  retryInterval  String value for retryInterval.
     */

    protected SubscriptionSimulationPayment(LocalDate dueDate, String zoneId, Integer amount,
            String currency, Boolean isPaid, Boolean isLastPayment,
            OptionalNullable<LocalDate> successfulPaymentDate,
            OptionalNullable<TerminateWithStatus> terminateWithStatus,
            OptionalNullable<String> retryInterval) {
        this.dueDate = dueDate;
        this.zoneId = zoneId;
        this.amount = amount;
        this.currency = currency;
        this.isPaid = isPaid;
        this.isLastPayment = isLastPayment;
        this.successfulPaymentDate = successfulPaymentDate;
        this.terminateWithStatus = terminateWithStatus;
        this.retryInterval = retryInterval;
    }

    /**
     * Getter for DueDate.
     * Scheduled due date for this simulated payment (YYYY-MM-DD).
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
     * Scheduled due date for this simulated payment (YYYY-MM-DD).
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter for ZoneId.
     * IANA timezone identifier used to resolve the due date.
     * @return Returns the String
     */
    @JsonGetter("zone_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Setter for ZoneId.
     * IANA timezone identifier used to resolve the due date.
     * @param zoneId Value for String
     */
    @JsonSetter("zone_id")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * Getter for Amount.
     * Amount to be charged on this cycle, in the smallest currency unit.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount to be charged on this cycle, in the smallest currency unit.
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
     * Getter for IsPaid.
     * Always `false` for simulated payments — no real payment has been made.
     * @return Returns the Boolean
     */
    @JsonGetter("is_paid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPaid() {
        return isPaid;
    }

    /**
     * Setter for IsPaid.
     * Always `false` for simulated payments — no real payment has been made.
     * @param isPaid Value for Boolean
     */
    @JsonSetter("is_paid")
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * Getter for IsLastPayment.
     * Whether this is the final payment in the simulated schedule.
     * @return Returns the Boolean
     */
    @JsonGetter("is_last_payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsLastPayment() {
        return isLastPayment;
    }

    /**
     * Setter for IsLastPayment.
     * Whether this is the final payment in the simulated schedule.
     * @param isLastPayment Value for Boolean
     */
    @JsonSetter("is_last_payment")
    public void setIsLastPayment(Boolean isLastPayment) {
        this.isLastPayment = isLastPayment;
    }

    /**
     * Internal Getter for SuccessfulPaymentDate.
     * Always `null` for simulated payments — populated only once a real payment settles.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("successful_payment_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetSuccessfulPaymentDate() {
        return this.successfulPaymentDate;
    }

    /**
     * Getter for SuccessfulPaymentDate.
     * Always `null` for simulated payments — populated only once a real payment settles.
     * @return Returns the LocalDate
     */
    public LocalDate getSuccessfulPaymentDate() {
        return OptionalNullable.getFrom(successfulPaymentDate);
    }

    /**
     * Setter for SuccessfulPaymentDate.
     * Always `null` for simulated payments — populated only once a real payment settles.
     * @param successfulPaymentDate Value for LocalDate
     */
    @JsonSetter("successful_payment_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setSuccessfulPaymentDate(LocalDate successfulPaymentDate) {
        this.successfulPaymentDate = OptionalNullable.of(successfulPaymentDate);
    }

    /**
     * UnSetter for SuccessfulPaymentDate.
     * Always `null` for simulated payments — populated only once a real payment settles.
     */
    public void unsetSuccessfulPaymentDate() {
        successfulPaymentDate = null;
    }

    /**
     * Internal Getter for TerminateWithStatus.
     * The status the subscription would transition to on this payment's due date, if a termination
     * is scheduled. `null` when no termination applies.
     * @return Returns the Internal TerminateWithStatus
     */
    @JsonGetter("terminate_with_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<TerminateWithStatus> internalGetTerminateWithStatus() {
        return this.terminateWithStatus;
    }

    /**
     * Getter for TerminateWithStatus.
     * The status the subscription would transition to on this payment's due date, if a termination
     * is scheduled. `null` when no termination applies.
     * @return Returns the TerminateWithStatus
     */
    public TerminateWithStatus getTerminateWithStatus() {
        return OptionalNullable.getFrom(terminateWithStatus);
    }

    /**
     * Setter for TerminateWithStatus.
     * The status the subscription would transition to on this payment's due date, if a termination
     * is scheduled. `null` when no termination applies.
     * @param terminateWithStatus Value for TerminateWithStatus
     */
    @JsonSetter("terminate_with_status")
    public void setTerminateWithStatus(TerminateWithStatus terminateWithStatus) {
        this.terminateWithStatus = OptionalNullable.of(terminateWithStatus);
    }

    /**
     * UnSetter for TerminateWithStatus.
     * The status the subscription would transition to on this payment's due date, if a termination
     * is scheduled. `null` when no termination applies.
     */
    public void unsetTerminateWithStatus() {
        terminateWithStatus = null;
    }

    /**
     * Internal Getter for RetryInterval.
     * ISO-8601 Duration for the retry interval applied if this payment fails (e.g., P5D). `null` if
     * no retry interval is configured.
     * @return Returns the Internal String
     */
    @JsonGetter("retry_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRetryInterval() {
        return this.retryInterval;
    }

    /**
     * Getter for RetryInterval.
     * ISO-8601 Duration for the retry interval applied if this payment fails (e.g., P5D). `null` if
     * no retry interval is configured.
     * @return Returns the String
     */
    public String getRetryInterval() {
        return OptionalNullable.getFrom(retryInterval);
    }

    /**
     * Setter for RetryInterval.
     * ISO-8601 Duration for the retry interval applied if this payment fails (e.g., P5D). `null` if
     * no retry interval is configured.
     * @param retryInterval Value for String
     */
    @JsonSetter("retry_interval")
    public void setRetryInterval(String retryInterval) {
        this.retryInterval = OptionalNullable.of(retryInterval);
    }

    /**
     * UnSetter for RetryInterval.
     * ISO-8601 Duration for the retry interval applied if this payment fails (e.g., P5D). `null` if
     * no retry interval is configured.
     */
    public void unsetRetryInterval() {
        retryInterval = null;
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
     * Converts this SubscriptionSimulationPayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionSimulationPayment [" + "dueDate=" + dueDate + ", zoneId=" + zoneId
                + ", amount=" + amount + ", currency=" + currency + ", isPaid=" + isPaid
                + ", isLastPayment=" + isLastPayment + ", successfulPaymentDate="
                + successfulPaymentDate + ", terminateWithStatus=" + terminateWithStatus
                + ", retryInterval=" + retryInterval + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionSimulationPayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionSimulationPayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dueDate(getDueDate())
                .zoneId(getZoneId())
                .amount(getAmount())
                .currency(getCurrency())
                .isPaid(getIsPaid())
                .isLastPayment(getIsLastPayment());
        builder.successfulPaymentDate = internalGetSuccessfulPaymentDate();
        builder.terminateWithStatus = internalGetTerminateWithStatus();
        builder.retryInterval = internalGetRetryInterval();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionSimulationPayment}.
     */
    public static class Builder {
        private LocalDate dueDate;
        private String zoneId;
        private Integer amount;
        private String currency;
        private Boolean isPaid;
        private Boolean isLastPayment;
        private OptionalNullable<LocalDate> successfulPaymentDate;
        private OptionalNullable<TerminateWithStatus> terminateWithStatus;
        private OptionalNullable<String> retryInterval;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for successfulPaymentDate.
         * @param  successfulPaymentDate  LocalDate value for successfulPaymentDate.
         * @return Builder
         */
        public Builder successfulPaymentDate(LocalDate successfulPaymentDate) {
            this.successfulPaymentDate = OptionalNullable.of(successfulPaymentDate);
            return this;
        }

        /**
         * UnSetter for successfulPaymentDate.
         * @return Builder
         */
        public Builder unsetSuccessfulPaymentDate() {
            successfulPaymentDate = null;
            return this;
        }

        /**
         * Setter for terminateWithStatus.
         * @param  terminateWithStatus  TerminateWithStatus value for terminateWithStatus.
         * @return Builder
         */
        public Builder terminateWithStatus(TerminateWithStatus terminateWithStatus) {
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
         * Setter for retryInterval.
         * @param  retryInterval  String value for retryInterval.
         * @return Builder
         */
        public Builder retryInterval(String retryInterval) {
            this.retryInterval = OptionalNullable.of(retryInterval);
            return this;
        }

        /**
         * UnSetter for retryInterval.
         * @return Builder
         */
        public Builder unsetRetryInterval() {
            retryInterval = null;
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
         * Builds a new {@link SubscriptionSimulationPayment} object using the set fields.
         * @return {@link SubscriptionSimulationPayment}
         */
        public SubscriptionSimulationPayment build() {
            SubscriptionSimulationPayment model =
                    new SubscriptionSimulationPayment(dueDate, zoneId, amount, currency, isPaid,
                            isLastPayment, successfulPaymentDate, terminateWithStatus,
                            retryInterval);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
