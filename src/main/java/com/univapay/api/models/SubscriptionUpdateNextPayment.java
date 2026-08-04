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
 * This is a model class for SubscriptionUpdateNextPayment type.
 */
public class SubscriptionUpdateNextPayment {
    private LocalDate dueDate;
    private Integer amount;
    private OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionUpdateNextPayment() {
    }

    /**
     * Initialization constructor.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  amount  Integer value for amount.
     * @param  terminateWithStatus  SubscriptionTerminateWithStatus value for terminateWithStatus.
     */
    public SubscriptionUpdateNextPayment(
            LocalDate dueDate,
            Integer amount,
            SubscriptionTerminateWithStatus terminateWithStatus) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.terminateWithStatus = OptionalNullable.of(terminateWithStatus);
    }

    /**
     * Initialization constructor.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  amount  Integer value for amount.
     * @param  terminateWithStatus  SubscriptionTerminateWithStatus value for terminateWithStatus.
     */

    protected SubscriptionUpdateNextPayment(LocalDate dueDate, Integer amount,
            OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.terminateWithStatus = terminateWithStatus;
    }

    /**
     * Getter for DueDate.
     * Next payment date (YYYY-MM-DD). Note: Only available for merchants permitted to edit next
     * payment dates.
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
     * Next payment date (YYYY-MM-DD). Note: Only available for merchants permitted to edit next
     * payment dates.
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter for Amount.
     * Next payment amount. Not available for limited-cycle subscriptions. Only available for
     * permitted merchants. This does not change subsequent cycle amounts.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Next payment amount. Not available for limited-cycle subscriptions. Only available for
     * permitted merchants. This does not change subsequent cycle amounts.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
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
     * Converts this SubscriptionUpdateNextPayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionUpdateNextPayment [" + "dueDate=" + dueDate + ", amount=" + amount
                + ", terminateWithStatus=" + terminateWithStatus + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionUpdateNextPayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionUpdateNextPayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dueDate(getDueDate())
                .amount(getAmount());
        builder.terminateWithStatus = internalGetTerminateWithStatus();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionUpdateNextPayment}.
     */
    public static class Builder {
        private LocalDate dueDate;
        private Integer amount;
        private OptionalNullable<SubscriptionTerminateWithStatus> terminateWithStatus;
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
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
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
         * Builds a new {@link SubscriptionUpdateNextPayment} object using the set fields.
         * @return {@link SubscriptionUpdateNextPayment}
         */
        public SubscriptionUpdateNextPayment build() {
            SubscriptionUpdateNextPayment model =
                    new SubscriptionUpdateNextPayment(dueDate, amount, terminateWithStatus);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
