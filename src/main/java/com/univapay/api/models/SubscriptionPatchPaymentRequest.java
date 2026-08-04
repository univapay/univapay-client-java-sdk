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
 * This is a model class for SubscriptionPatchPaymentRequest type.
 */
public class SubscriptionPatchPaymentRequest {
    private LocalDate dueDate;
    private Boolean isPaid;
    private OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus;
    private OptionalNullable<String> retryInterval;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionPatchPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  isPaid  Boolean value for isPaid.
     * @param  terminateWithStatus  SubscriptionTerminateWithStatus value for terminateWithStatus.
     * @param  retryInterval  String value for retryInterval.
     */
    public SubscriptionPatchPaymentRequest(
            LocalDate dueDate,
            Boolean isPaid,
            SubscriptionTerminateWithStatus terminateWithStatus,
            String retryInterval) {
        this.dueDate = dueDate;
        this.isPaid = isPaid;
        this.terminateWithStatus = OptionalNullable.of(terminateWithStatus);
        this.retryInterval = OptionalNullable.of(retryInterval);
    }

    /**
     * Initialization constructor.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  isPaid  Boolean value for isPaid.
     * @param  terminateWithStatus  SubscriptionTerminateWithStatus value for terminateWithStatus.
     * @param  retryInterval  String value for retryInterval.
     */

    protected SubscriptionPatchPaymentRequest(LocalDate dueDate, Boolean isPaid,
            OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus,
            OptionalNullable<String> retryInterval) {
        this.dueDate = dueDate;
        this.isPaid = isPaid;
        this.terminateWithStatus = terminateWithStatus;
        this.retryInterval = retryInterval;
    }

    /**
     * Getter for DueDate.
     * New due date for this payment (YYYY-MM-DD). Only available to merchants with permission to
     * edit payment dates.
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
     * New due date for this payment (YYYY-MM-DD). Only available to merchants with permission to
     * edit payment dates.
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter for IsPaid.
     * Mark this payment as paid. Setting to `true` will trigger scheduling of the next payment in
     * the cycle.
     * @return Returns the Boolean
     */
    @JsonGetter("is_paid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPaid() {
        return isPaid;
    }

    /**
     * Setter for IsPaid.
     * Mark this payment as paid. Setting to `true` will trigger scheduling of the next payment in
     * the cycle.
     * @param isPaid Value for Boolean
     */
    @JsonSetter("is_paid")
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
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
     * Internal Getter for RetryInterval.
     * ISO-8601 Duration override for the retry interval on a scheduled payment (for example `P3D`).
     * Send `null` to clear.
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
     * ISO-8601 Duration override for the retry interval on a scheduled payment (for example `P3D`).
     * Send `null` to clear.
     * @return Returns the String
     */
    public String getRetryInterval() {
        return OptionalNullable.getFrom(retryInterval);
    }

    /**
     * Setter for RetryInterval.
     * ISO-8601 Duration override for the retry interval on a scheduled payment (for example `P3D`).
     * Send `null` to clear.
     * @param retryInterval Value for String
     */
    @JsonSetter("retry_interval")
    public void setRetryInterval(String retryInterval) {
        this.retryInterval = OptionalNullable.of(retryInterval);
    }

    /**
     * UnSetter for RetryInterval.
     * ISO-8601 Duration override for the retry interval on a scheduled payment (for example `P3D`).
     * Send `null` to clear.
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
     * Converts this SubscriptionPatchPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionPatchPaymentRequest [" + "dueDate=" + dueDate + ", isPaid=" + isPaid
                + ", terminateWithStatus=" + terminateWithStatus + ", retryInterval="
                + retryInterval + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionPatchPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionPatchPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dueDate(getDueDate())
                .isPaid(getIsPaid());
        builder.terminateWithStatus = internalGetTerminateWithStatus();
        builder.retryInterval = internalGetRetryInterval();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionPatchPaymentRequest}.
     */
    public static class Builder {
        private LocalDate dueDate;
        private Boolean isPaid;
        private OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus;
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
         * Setter for isPaid.
         * @param  isPaid  Boolean value for isPaid.
         * @return Builder
         */
        public Builder isPaid(Boolean isPaid) {
            this.isPaid = isPaid;
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
         * Builds a new {@link SubscriptionPatchPaymentRequest} object using the set fields.
         * @return {@link SubscriptionPatchPaymentRequest}
         */
        public SubscriptionPatchPaymentRequest build() {
            SubscriptionPatchPaymentRequest model =
                    new SubscriptionPatchPaymentRequest(dueDate, isPaid, terminateWithStatus,
                            retryInterval);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
