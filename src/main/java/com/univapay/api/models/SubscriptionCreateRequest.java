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
 * This is a model class for SubscriptionCreateRequest type.
 */
public class SubscriptionCreateRequest {
    private UUID transactionTokenId;
    private int amount;
    private String currency;
    private Integer initialAmount;
    private SubscriptionPeriod period;
    private String cyclicalPeriod;
    private SubscriptionScheduleSettings scheduleSettings;
    private SubscriptionInstallmentPlan installmentPlan;
    private SubscriptionPlanSettings subscriptionPlan;
    private Boolean firstChargeAuthorizationOnly;
    private String firstChargeCaptureAfter;
    private GenericMetadata metadata;
    private ChargeCreateRequestThreeDs threeDs;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionCreateRequest() {
        firstChargeAuthorizationOnly = false;
    }

    /**
     * Initialization constructor.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     * @param  amount  int value for amount.
     * @param  currency  String value for currency.
     * @param  initialAmount  Integer value for initialAmount.
     * @param  period  SubscriptionPeriod value for period.
     * @param  cyclicalPeriod  String value for cyclicalPeriod.
     * @param  scheduleSettings  SubscriptionScheduleSettings value for scheduleSettings.
     * @param  installmentPlan  SubscriptionInstallmentPlan value for installmentPlan.
     * @param  subscriptionPlan  SubscriptionPlanSettings value for subscriptionPlan.
     * @param  firstChargeAuthorizationOnly  Boolean value for firstChargeAuthorizationOnly.
     * @param  firstChargeCaptureAfter  String value for firstChargeCaptureAfter.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  threeDs  ChargeCreateRequestThreeDs value for threeDs.
     */
    public SubscriptionCreateRequest(
            UUID transactionTokenId,
            int amount,
            String currency,
            Integer initialAmount,
            SubscriptionPeriod period,
            String cyclicalPeriod,
            SubscriptionScheduleSettings scheduleSettings,
            SubscriptionInstallmentPlan installmentPlan,
            SubscriptionPlanSettings subscriptionPlan,
            Boolean firstChargeAuthorizationOnly,
            String firstChargeCaptureAfter,
            GenericMetadata metadata,
            ChargeCreateRequestThreeDs threeDs) {
        this.transactionTokenId = transactionTokenId;
        this.amount = amount;
        this.currency = currency;
        this.initialAmount = initialAmount;
        this.period = period;
        this.cyclicalPeriod = cyclicalPeriod;
        this.scheduleSettings = scheduleSettings;
        this.installmentPlan = installmentPlan;
        this.subscriptionPlan = subscriptionPlan;
        this.firstChargeAuthorizationOnly = firstChargeAuthorizationOnly;
        this.firstChargeCaptureAfter = firstChargeCaptureAfter;
        this.metadata = metadata;
        this.threeDs = threeDs;
    }

    /**
     * Getter for TransactionTokenId.
     * Transaction token ID authorized for recurring payments.
     * @return Returns the UUID
     */
    @JsonGetter("transaction_token_id")
    public UUID getTransactionTokenId() {
        return transactionTokenId;
    }

    /**
     * Setter for TransactionTokenId.
     * Transaction token ID authorized for recurring payments.
     * @param transactionTokenId Value for UUID
     */
    @JsonSetter("transaction_token_id")
    public void setTransactionTokenId(UUID transactionTokenId) {
        this.transactionTokenId = transactionTokenId;
    }

    /**
     * Getter for Amount.
     * Amount to be charged in each cycle.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount to be charged in each cycle.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO-4217 currency code.
     * @return Returns the String
     */
    @JsonGetter("currency")
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
     * Getter for InitialAmount.
     * Optional different amount for the first charge.
     * @return Returns the Integer
     */
    @JsonGetter("initial_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInitialAmount() {
        return initialAmount;
    }

    /**
     * Setter for InitialAmount.
     * Optional different amount for the first charge.
     * @param initialAmount Value for Integer
     */
    @JsonSetter("initial_amount")
    public void setInitialAmount(Integer initialAmount) {
        this.initialAmount = initialAmount;
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
     * ISO-8601 Duration for custom frequency (e.g., P3D, P2M). Cannot be used if 'period' is
     * specified.
     * @return Returns the String
     */
    @JsonGetter("cyclical_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCyclicalPeriod() {
        return cyclicalPeriod;
    }

    /**
     * Setter for CyclicalPeriod.
     * ISO-8601 Duration for custom frequency (e.g., P3D, P2M). Cannot be used if 'period' is
     * specified.
     * @param cyclicalPeriod Value for String
     */
    @JsonSetter("cyclical_period")
    public void setCyclicalPeriod(String cyclicalPeriod) {
        this.cyclicalPeriod = cyclicalPeriod;
    }

    /**
     * Getter for ScheduleSettings.
     * Schedule settings applied to a subscription.
     * @return Returns the SubscriptionScheduleSettings
     */
    @JsonGetter("schedule_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionScheduleSettings getScheduleSettings() {
        return scheduleSettings;
    }

    /**
     * Setter for ScheduleSettings.
     * Schedule settings applied to a subscription.
     * @param scheduleSettings Value for SubscriptionScheduleSettings
     */
    @JsonSetter("schedule_settings")
    public void setScheduleSettings(SubscriptionScheduleSettings scheduleSettings) {
        this.scheduleSettings = scheduleSettings;
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
     * Getter for FirstChargeAuthorizationOnly.
     * If true, the first charge will only be an authorization (Hold).
     * @return Returns the Boolean
     */
    @JsonGetter("first_charge_authorization_only")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFirstChargeAuthorizationOnly() {
        return firstChargeAuthorizationOnly;
    }

    /**
     * Setter for FirstChargeAuthorizationOnly.
     * If true, the first charge will only be an authorization (Hold).
     * @param firstChargeAuthorizationOnly Value for Boolean
     */
    @JsonSetter("first_charge_authorization_only")
    public void setFirstChargeAuthorizationOnly(Boolean firstChargeAuthorizationOnly) {
        this.firstChargeAuthorizationOnly = firstChargeAuthorizationOnly;
    }

    /**
     * Getter for FirstChargeCaptureAfter.
     * ISO-8601 Duration for auto-capture if authorization only is true. Allowed days: P1D to P6D.
     * @return Returns the String
     */
    @JsonGetter("first_charge_capture_after")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstChargeCaptureAfter() {
        return firstChargeCaptureAfter;
    }

    /**
     * Setter for FirstChargeCaptureAfter.
     * ISO-8601 Duration for auto-capture if authorization only is true. Allowed days: P1D to P6D.
     * @param firstChargeCaptureAfter Value for String
     */
    @JsonSetter("first_charge_capture_after")
    public void setFirstChargeCaptureAfter(String firstChargeCaptureAfter) {
        this.firstChargeCaptureAfter = firstChargeCaptureAfter;
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
     * Getter for ThreeDs.
     * Charge Create Request Three Ds schema. Either supply `mode` (and optionally
     * `redirect_endpoint`) to have Univapay run 3DS, or supply all six external-MPI fields
     * (`authentication_value` through `transaction_status`) when 3DS authentication was already
     * completed outside of Univapay — in that case `mode` is set to `provided` automatically and
     * must not be sent.
     * @return Returns the ChargeCreateRequestThreeDs
     */
    @JsonGetter("three_ds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeCreateRequestThreeDs getThreeDs() {
        return threeDs;
    }

    /**
     * Setter for ThreeDs.
     * Charge Create Request Three Ds schema. Either supply `mode` (and optionally
     * `redirect_endpoint`) to have Univapay run 3DS, or supply all six external-MPI fields
     * (`authentication_value` through `transaction_status`) when 3DS authentication was already
     * completed outside of Univapay — in that case `mode` is set to `provided` automatically and
     * must not be sent.
     * @param threeDs Value for ChargeCreateRequestThreeDs
     */
    @JsonSetter("three_ds")
    public void setThreeDs(ChargeCreateRequestThreeDs threeDs) {
        this.threeDs = threeDs;
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
     * Converts this SubscriptionCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionCreateRequest [" + "transactionTokenId=" + transactionTokenId
                + ", amount=" + amount + ", currency=" + currency + ", initialAmount="
                + initialAmount + ", period=" + period + ", cyclicalPeriod=" + cyclicalPeriod
                + ", scheduleSettings=" + scheduleSettings + ", installmentPlan=" + installmentPlan
                + ", subscriptionPlan=" + subscriptionPlan + ", firstChargeAuthorizationOnly="
                + firstChargeAuthorizationOnly + ", firstChargeCaptureAfter="
                + firstChargeCaptureAfter + ", metadata=" + metadata + ", threeDs=" + threeDs
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(transactionTokenId, amount, currency)
                .initialAmount(getInitialAmount())
                .period(getPeriod())
                .cyclicalPeriod(getCyclicalPeriod())
                .scheduleSettings(getScheduleSettings())
                .installmentPlan(getInstallmentPlan())
                .subscriptionPlan(getSubscriptionPlan())
                .firstChargeAuthorizationOnly(getFirstChargeAuthorizationOnly())
                .firstChargeCaptureAfter(getFirstChargeCaptureAfter())
                .metadata(getMetadata())
                .threeDs(getThreeDs());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionCreateRequest}.
     */
    public static class Builder {
        private UUID transactionTokenId;
        private int amount;
        private String currency;
        private Integer initialAmount;
        private SubscriptionPeriod period;
        private String cyclicalPeriod;
        private SubscriptionScheduleSettings scheduleSettings;
        private SubscriptionInstallmentPlan installmentPlan;
        private SubscriptionPlanSettings subscriptionPlan;
        private Boolean firstChargeAuthorizationOnly = false;
        private String firstChargeCaptureAfter;
        private GenericMetadata metadata;
        private ChargeCreateRequestThreeDs threeDs;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  transactionTokenId  UUID value for transactionTokenId.
         * @param  amount  int value for amount.
         * @param  currency  String value for currency.
         */
        public Builder(UUID transactionTokenId, int amount, String currency) {
            this.transactionTokenId = transactionTokenId;
            this.amount = amount;
            this.currency = currency;
        }

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
         * Setter for initialAmount.
         * @param  initialAmount  Integer value for initialAmount.
         * @return Builder
         */
        public Builder initialAmount(Integer initialAmount) {
            this.initialAmount = initialAmount;
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
         * Setter for scheduleSettings.
         * @param  scheduleSettings  SubscriptionScheduleSettings value for scheduleSettings.
         * @return Builder
         */
        public Builder scheduleSettings(SubscriptionScheduleSettings scheduleSettings) {
            this.scheduleSettings = scheduleSettings;
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
         * Setter for subscriptionPlan.
         * @param  subscriptionPlan  SubscriptionPlanSettings value for subscriptionPlan.
         * @return Builder
         */
        public Builder subscriptionPlan(SubscriptionPlanSettings subscriptionPlan) {
            this.subscriptionPlan = subscriptionPlan;
            return this;
        }

        /**
         * Setter for firstChargeAuthorizationOnly.
         * @param  firstChargeAuthorizationOnly  Boolean value for firstChargeAuthorizationOnly.
         * @return Builder
         */
        public Builder firstChargeAuthorizationOnly(Boolean firstChargeAuthorizationOnly) {
            this.firstChargeAuthorizationOnly = firstChargeAuthorizationOnly;
            return this;
        }

        /**
         * Setter for firstChargeCaptureAfter.
         * @param  firstChargeCaptureAfter  String value for firstChargeCaptureAfter.
         * @return Builder
         */
        public Builder firstChargeCaptureAfter(String firstChargeCaptureAfter) {
            this.firstChargeCaptureAfter = firstChargeCaptureAfter;
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
         * Setter for threeDs.
         * @param  threeDs  ChargeCreateRequestThreeDs value for threeDs.
         * @return Builder
         */
        public Builder threeDs(ChargeCreateRequestThreeDs threeDs) {
            this.threeDs = threeDs;
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
         * Builds a new {@link SubscriptionCreateRequest} object using the set fields.
         * @return {@link SubscriptionCreateRequest}
         */
        public SubscriptionCreateRequest build() {
            SubscriptionCreateRequest model =
                    new SubscriptionCreateRequest(transactionTokenId, amount, currency,
                            initialAmount, period, cyclicalPeriod, scheduleSettings,
                            installmentPlan, subscriptionPlan, firstChargeAuthorizationOnly,
                            firstChargeCaptureAfter, metadata, threeDs);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
