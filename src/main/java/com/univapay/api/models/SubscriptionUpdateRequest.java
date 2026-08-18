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
 * This is a model class for SubscriptionUpdateRequest type.
 */
public class SubscriptionUpdateRequest {
    private UUID transactionTokenId;
    private Integer amount;
    private SubscriptionPeriod period;
    private String cyclicalPeriod;
    private Integer initialAmount;
    private SubscriptionPlanSettings subscriptionPlan;
    private SubscriptionInstallmentPlan installmentPlan;
    private GenericMetadata metadata;
    private SubscriptionUpdateStatus status;
    private SubscriptionUpdateScheduleSettings scheduleSettings;
    private SubscriptionUpdateNextPayment nextPayment;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     * @param  amount  Integer value for amount.
     * @param  period  SubscriptionPeriod value for period.
     * @param  cyclicalPeriod  String value for cyclicalPeriod.
     * @param  initialAmount  Integer value for initialAmount.
     * @param  subscriptionPlan  SubscriptionPlanSettings value for subscriptionPlan.
     * @param  installmentPlan  SubscriptionInstallmentPlan value for installmentPlan.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  status  SubscriptionUpdateStatus value for status.
     * @param  scheduleSettings  SubscriptionUpdateScheduleSettings value for scheduleSettings.
     * @param  nextPayment  SubscriptionUpdateNextPayment value for nextPayment.
     */
    public SubscriptionUpdateRequest(
            UUID transactionTokenId,
            Integer amount,
            SubscriptionPeriod period,
            String cyclicalPeriod,
            Integer initialAmount,
            SubscriptionPlanSettings subscriptionPlan,
            SubscriptionInstallmentPlan installmentPlan,
            GenericMetadata metadata,
            SubscriptionUpdateStatus status,
            SubscriptionUpdateScheduleSettings scheduleSettings,
            SubscriptionUpdateNextPayment nextPayment) {
        this.transactionTokenId = transactionTokenId;
        this.amount = amount;
        this.period = period;
        this.cyclicalPeriod = cyclicalPeriod;
        this.initialAmount = initialAmount;
        this.subscriptionPlan = subscriptionPlan;
        this.installmentPlan = installmentPlan;
        this.metadata = metadata;
        this.status = status;
        this.scheduleSettings = scheduleSettings;
        this.nextPayment = nextPayment;
    }

    /**
     * Getter for TransactionTokenId.
     * Transaction token ID used for the subscription. Can be changed to update the payment method
     * (e.g., when a card expires). Allowed only when the status is `unconfirmed`, `unpaid`,
     * `current`, or `suspended`.
     * @return Returns the UUID
     */
    @JsonGetter("transaction_token_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getTransactionTokenId() {
        return transactionTokenId;
    }

    /**
     * Setter for TransactionTokenId.
     * Transaction token ID used for the subscription. Can be changed to update the payment method
     * (e.g., when a card expires). Allowed only when the status is `unconfirmed`, `unpaid`,
     * `current`, or `suspended`.
     * @param transactionTokenId Value for UUID
     */
    @JsonSetter("transaction_token_id")
    public void setTransactionTokenId(UUID transactionTokenId) {
        this.transactionTokenId = transactionTokenId;
    }

    /**
     * Getter for Amount.
     * The recurring charge amount (applied to the cycle after the next one). Not available for
     * limited-cycle subscriptions. To change the immediate next payment amount, update
     * `next_payment.amount` instead.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The recurring charge amount (applied to the cycle after the next one). Not available for
     * limited-cycle subscriptions. To change the immediate next payment amount, update
     * `next_payment.amount` instead.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Period.
     * Subscription Period schema.
     * @return Returns the SubscriptionPeriod
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionPeriod getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * Subscription Period schema.
     * @param period Value for SubscriptionPeriod
     */
    @JsonSetter("period")
    public void setPeriod(SubscriptionPeriod period) {
        this.period = period;
    }

    /**
     * Getter for CyclicalPeriod.
     * ISO-8601 Duration for custom frequency (e.g., P3D, P2M). Cannot be used together with
     * `period`. Only allowed before the subscription's first payment has been paid.
     * @return Returns the String
     */
    @JsonGetter("cyclical_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCyclicalPeriod() {
        return cyclicalPeriod;
    }

    /**
     * Setter for CyclicalPeriod.
     * ISO-8601 Duration for custom frequency (e.g., P3D, P2M). Cannot be used together with
     * `period`. Only allowed before the subscription's first payment has been paid.
     * @param cyclicalPeriod Value for String
     */
    @JsonSetter("cyclical_period")
    public void setCyclicalPeriod(String cyclicalPeriod) {
        this.cyclicalPeriod = cyclicalPeriod;
    }

    /**
     * Getter for InitialAmount.
     * Different amount for the first charge. Only allowed while the subscription status is still
     * editable (before it has started) and requires the App Token Secret.
     * @return Returns the Integer
     */
    @JsonGetter("initial_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInitialAmount() {
        return initialAmount;
    }

    /**
     * Setter for InitialAmount.
     * Different amount for the first charge. Only allowed while the subscription status is still
     * editable (before it has started) and requires the App Token Secret.
     * @param initialAmount Value for Integer
     */
    @JsonSetter("initial_amount")
    public void setInitialAmount(Integer initialAmount) {
        this.initialAmount = initialAmount;
    }

    /**
     * Getter for SubscriptionPlan.
     * Configuration for limited-cycle subscriptions (Univapay side).
     * @return Returns the SubscriptionPlanSettings
     */
    @JsonGetter("subscription_plan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionPlanSettings getSubscriptionPlan() {
        return subscriptionPlan;
    }

    /**
     * Setter for SubscriptionPlan.
     * Configuration for limited-cycle subscriptions (Univapay side).
     * @param subscriptionPlan Value for SubscriptionPlanSettings
     */
    @JsonSetter("subscription_plan")
    public void setSubscriptionPlan(SubscriptionPlanSettings subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    /**
     * Getter for InstallmentPlan.
     * Configuration for credit card company side installments.
     * @return Returns the SubscriptionInstallmentPlan
     */
    @JsonGetter("installment_plan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionInstallmentPlan getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Setter for InstallmentPlan.
     * Configuration for credit card company side installments.
     * @param installmentPlan Value for SubscriptionInstallmentPlan
     */
    @JsonSetter("installment_plan")
    public void setInstallmentPlan(SubscriptionInstallmentPlan installmentPlan) {
        this.installmentPlan = installmentPlan;
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
     * Getter for Status.
     * Update the subscription status. `suspended`: Pause the subscription. `unpaid`: Resume a
     * suspended subscription.
     * @return Returns the SubscriptionUpdateStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionUpdateStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Update the subscription status. `suspended`: Pause the subscription. `unpaid`: Resume a
     * suspended subscription.
     * @param status Value for SubscriptionUpdateStatus
     */
    @JsonSetter("status")
    public void setStatus(SubscriptionUpdateStatus status) {
        this.status = status;
    }

    /**
     * Getter for ScheduleSettings.
     * Schedule settings that can be updated on a subscription.
     * @return Returns the SubscriptionUpdateScheduleSettings
     */
    @JsonGetter("schedule_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionUpdateScheduleSettings getScheduleSettings() {
        return scheduleSettings;
    }

    /**
     * Setter for ScheduleSettings.
     * Schedule settings that can be updated on a subscription.
     * @param scheduleSettings Value for SubscriptionUpdateScheduleSettings
     */
    @JsonSetter("schedule_settings")
    public void setScheduleSettings(SubscriptionUpdateScheduleSettings scheduleSettings) {
        this.scheduleSettings = scheduleSettings;
    }

    /**
     * Getter for NextPayment.
     * Fields that can be updated on the next scheduled payment.
     * @return Returns the SubscriptionUpdateNextPayment
     */
    @JsonGetter("next_payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionUpdateNextPayment getNextPayment() {
        return nextPayment;
    }

    /**
     * Setter for NextPayment.
     * Fields that can be updated on the next scheduled payment.
     * @param nextPayment Value for SubscriptionUpdateNextPayment
     */
    @JsonSetter("next_payment")
    public void setNextPayment(SubscriptionUpdateNextPayment nextPayment) {
        this.nextPayment = nextPayment;
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
     * Converts this SubscriptionUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionUpdateRequest [" + "transactionTokenId=" + transactionTokenId
                + ", amount=" + amount + ", period=" + period + ", cyclicalPeriod=" + cyclicalPeriod
                + ", initialAmount=" + initialAmount + ", subscriptionPlan=" + subscriptionPlan
                + ", installmentPlan=" + installmentPlan + ", metadata=" + metadata + ", status="
                + status + ", scheduleSettings=" + scheduleSettings + ", nextPayment=" + nextPayment
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transactionTokenId(getTransactionTokenId())
                .amount(getAmount())
                .period(getPeriod())
                .cyclicalPeriod(getCyclicalPeriod())
                .initialAmount(getInitialAmount())
                .subscriptionPlan(getSubscriptionPlan())
                .installmentPlan(getInstallmentPlan())
                .metadata(getMetadata())
                .status(getStatus())
                .scheduleSettings(getScheduleSettings())
                .nextPayment(getNextPayment());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionUpdateRequest}.
     */
    public static class Builder {
        private UUID transactionTokenId;
        private Integer amount;
        private SubscriptionPeriod period;
        private String cyclicalPeriod;
        private Integer initialAmount;
        private SubscriptionPlanSettings subscriptionPlan;
        private SubscriptionInstallmentPlan installmentPlan;
        private GenericMetadata metadata;
        private SubscriptionUpdateStatus status;
        private SubscriptionUpdateScheduleSettings scheduleSettings;
        private SubscriptionUpdateNextPayment nextPayment;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for transactionTokenId.
         * @param  transactionTokenId  UUID value for transactionTokenId.
         * @return Builder
         */
        public Builder transactionTokenId(UUID transactionTokenId) {
            this.transactionTokenId = transactionTokenId;
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
         * Setter for period.
         * @param  period  SubscriptionPeriod value for period.
         * @return Builder
         */
        public Builder period(SubscriptionPeriod period) {
            this.period = period;
            return this;
        }

        /**
         * Setter for cyclicalPeriod.
         * @param  cyclicalPeriod  String value for cyclicalPeriod.
         * @return Builder
         */
        public Builder cyclicalPeriod(String cyclicalPeriod) {
            this.cyclicalPeriod = cyclicalPeriod;
            return this;
        }

        /**
         * Setter for initialAmount.
         * @param  initialAmount  Integer value for initialAmount.
         * @return Builder
         */
        public Builder initialAmount(Integer initialAmount) {
            this.initialAmount = initialAmount;
            return this;
        }

        /**
         * Setter for subscriptionPlan.
         * @param  subscriptionPlan  SubscriptionPlanSettings value for subscriptionPlan.
         * @return Builder
         */
        public Builder subscriptionPlan(SubscriptionPlanSettings subscriptionPlan) {
            this.subscriptionPlan = subscriptionPlan;
            return this;
        }

        /**
         * Setter for installmentPlan.
         * @param  installmentPlan  SubscriptionInstallmentPlan value for installmentPlan.
         * @return Builder
         */
        public Builder installmentPlan(SubscriptionInstallmentPlan installmentPlan) {
            this.installmentPlan = installmentPlan;
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
         * Setter for status.
         * @param  status  SubscriptionUpdateStatus value for status.
         * @return Builder
         */
        public Builder status(SubscriptionUpdateStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for scheduleSettings.
         * @param  scheduleSettings  SubscriptionUpdateScheduleSettings value for scheduleSettings.
         * @return Builder
         */
        public Builder scheduleSettings(SubscriptionUpdateScheduleSettings scheduleSettings) {
            this.scheduleSettings = scheduleSettings;
            return this;
        }

        /**
         * Setter for nextPayment.
         * @param  nextPayment  SubscriptionUpdateNextPayment value for nextPayment.
         * @return Builder
         */
        public Builder nextPayment(SubscriptionUpdateNextPayment nextPayment) {
            this.nextPayment = nextPayment;
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
         * Builds a new {@link SubscriptionUpdateRequest} object using the set fields.
         * @return {@link SubscriptionUpdateRequest}
         */
        public SubscriptionUpdateRequest build() {
            SubscriptionUpdateRequest model =
                    new SubscriptionUpdateRequest(transactionTokenId, amount, period,
                            cyclicalPeriod, initialAmount, subscriptionPlan, installmentPlan,
                            metadata, status, scheduleSettings, nextPayment);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
