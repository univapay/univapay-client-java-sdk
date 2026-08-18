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
 * This is a model class for SubscriptionSimulationRequest type.
 */
public class SubscriptionSimulationRequest {
    private int amount;
    private String currency;
    private TransactionTokenPaymentType paymentType;
    private Integer initialAmount;
    private SubscriptionSimulationPeriod period;
    private String cyclicalPeriod;
    private SubscriptionScheduleSettings scheduleSettings;
    private SubscriptionSimulationPlanSettings installmentPlan;
    private SubscriptionSimulationPlanSettings subscriptionPlan;
    private Boolean onlyDirectCurrency;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionSimulationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  currency  String value for currency.
     * @param  paymentType  TransactionTokenPaymentType value for paymentType.
     * @param  scheduleSettings  SubscriptionScheduleSettings value for scheduleSettings.
     * @param  initialAmount  Integer value for initialAmount.
     * @param  period  SubscriptionSimulationPeriod value for period.
     * @param  cyclicalPeriod  String value for cyclicalPeriod.
     * @param  installmentPlan  SubscriptionSimulationPlanSettings value for installmentPlan.
     * @param  subscriptionPlan  SubscriptionSimulationPlanSettings value for subscriptionPlan.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     */
    public SubscriptionSimulationRequest(
            int amount,
            String currency,
            TransactionTokenPaymentType paymentType,
            SubscriptionScheduleSettings scheduleSettings,
            Integer initialAmount,
            SubscriptionSimulationPeriod period,
            String cyclicalPeriod,
            SubscriptionSimulationPlanSettings installmentPlan,
            SubscriptionSimulationPlanSettings subscriptionPlan,
            Boolean onlyDirectCurrency) {
        this.amount = amount;
        this.currency = currency;
        this.paymentType = paymentType;
        this.initialAmount = initialAmount;
        this.period = period;
        this.cyclicalPeriod = cyclicalPeriod;
        this.scheduleSettings = scheduleSettings;
        this.installmentPlan = installmentPlan;
        this.subscriptionPlan = subscriptionPlan;
        this.onlyDirectCurrency = onlyDirectCurrency;
    }

    /**
     * Getter for Amount.
     * Amount to be charged in each cycle. Must be a positive integer.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount to be charged in each cycle. Must be a positive integer.
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
     * Getter for PaymentType.
     * Transaction Token Payment Type schema.
     * @return Returns the TransactionTokenPaymentType
     */
    @JsonGetter("payment_type")
    public TransactionTokenPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Transaction Token Payment Type schema.
     * @param paymentType Value for TransactionTokenPaymentType
     */
    @JsonSetter("payment_type")
    public void setPaymentType(TransactionTokenPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for InitialAmount.
     * Optional different amount for the first charge. Must be zero or greater.
     * @return Returns the Integer
     */
    @JsonGetter("initial_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInitialAmount() {
        return initialAmount;
    }

    /**
     * Setter for InitialAmount.
     * Optional different amount for the first charge. Must be zero or greater.
     * @param initialAmount Value for Integer
     */
    @JsonSetter("initial_amount")
    public void setInitialAmount(Integer initialAmount) {
        this.initialAmount = initialAmount;
    }

    /**
     * Getter for Period.
     * Billing frequency for the simulated schedule. Includes `bimonthly`, which is not offered on
     * `SubscriptionPeriod` for live subscription creation.
     * @return Returns the SubscriptionSimulationPeriod
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionSimulationPeriod getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * Billing frequency for the simulated schedule. Includes `bimonthly`, which is not offered on
     * `SubscriptionPeriod` for live subscription creation.
     * @param period Value for SubscriptionSimulationPeriod
     */
    @JsonSetter("period")
    public void setPeriod(SubscriptionSimulationPeriod period) {
        this.period = period;
    }

    /**
     * Getter for CyclicalPeriod.
     * ISO-8601 Duration for custom frequency (e.g., P3D, P2M). Cannot be used together with
     * 'period' — specify exactly one of the two.
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
     * 'period' — specify exactly one of the two.
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
     * Cycle-limiting plan configuration used to simulate an installment plan or a Univapay-side
     * subscription plan.
     * @return Returns the SubscriptionSimulationPlanSettings
     */
    @JsonGetter("installment_plan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionSimulationPlanSettings getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Setter for InstallmentPlan.
     * Cycle-limiting plan configuration used to simulate an installment plan or a Univapay-side
     * subscription plan.
     * @param installmentPlan Value for SubscriptionSimulationPlanSettings
     */
    @JsonSetter("installment_plan")
    public void setInstallmentPlan(SubscriptionSimulationPlanSettings installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    /**
     * Getter for SubscriptionPlan.
     * Cycle-limiting plan configuration used to simulate an installment plan or a Univapay-side
     * subscription plan.
     * @return Returns the SubscriptionSimulationPlanSettings
     */
    @JsonGetter("subscription_plan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionSimulationPlanSettings getSubscriptionPlan() {
        return subscriptionPlan;
    }

    /**
     * Setter for SubscriptionPlan.
     * Cycle-limiting plan configuration used to simulate an installment plan or a Univapay-side
     * subscription plan.
     * @param subscriptionPlan Value for SubscriptionSimulationPlanSettings
     */
    @JsonSetter("subscription_plan")
    public void setSubscriptionPlan(SubscriptionSimulationPlanSettings subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    /**
     * Getter for OnlyDirectCurrency.
     * Whether only direct currency processing is allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("only_direct_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getOnlyDirectCurrency() {
        return onlyDirectCurrency;
    }

    /**
     * Setter for OnlyDirectCurrency.
     * Whether only direct currency processing is allowed.
     * @param onlyDirectCurrency Value for Boolean
     */
    @JsonSetter("only_direct_currency")
    public void setOnlyDirectCurrency(Boolean onlyDirectCurrency) {
        this.onlyDirectCurrency = onlyDirectCurrency;
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
     * Converts this SubscriptionSimulationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionSimulationRequest [" + "amount=" + amount + ", currency=" + currency
                + ", paymentType=" + paymentType + ", scheduleSettings=" + scheduleSettings
                + ", initialAmount=" + initialAmount + ", period=" + period + ", cyclicalPeriod="
                + cyclicalPeriod + ", installmentPlan=" + installmentPlan + ", subscriptionPlan="
                + subscriptionPlan + ", onlyDirectCurrency=" + onlyDirectCurrency
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionSimulationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionSimulationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, currency, paymentType, scheduleSettings)
                .initialAmount(getInitialAmount())
                .period(getPeriod())
                .cyclicalPeriod(getCyclicalPeriod())
                .installmentPlan(getInstallmentPlan())
                .subscriptionPlan(getSubscriptionPlan())
                .onlyDirectCurrency(getOnlyDirectCurrency());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionSimulationRequest}.
     */
    public static class Builder {
        private int amount;
        private String currency;
        private TransactionTokenPaymentType paymentType;
        private SubscriptionScheduleSettings scheduleSettings;
        private Integer initialAmount;
        private SubscriptionSimulationPeriod period;
        private String cyclicalPeriod;
        private SubscriptionSimulationPlanSettings installmentPlan;
        private SubscriptionSimulationPlanSettings subscriptionPlan;
        private Boolean onlyDirectCurrency;
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
         * @param  paymentType  TransactionTokenPaymentType value for paymentType.
         * @param  scheduleSettings  SubscriptionScheduleSettings value for scheduleSettings.
         */
        public Builder(int amount, String currency, TransactionTokenPaymentType paymentType,
                SubscriptionScheduleSettings scheduleSettings) {
            this.amount = amount;
            this.currency = currency;
            this.paymentType = paymentType;
            this.scheduleSettings = scheduleSettings;
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
         * Setter for paymentType.
         * @param  paymentType  TransactionTokenPaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(TransactionTokenPaymentType paymentType) {
            this.paymentType = paymentType;
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
         * @param  period  SubscriptionSimulationPeriod value for period.
         * @return Builder
         */
        public Builder period(SubscriptionSimulationPeriod period) {
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
         * Setter for installmentPlan.
         * @param  installmentPlan  SubscriptionSimulationPlanSettings value for installmentPlan.
         * @return Builder
         */
        public Builder installmentPlan(SubscriptionSimulationPlanSettings installmentPlan) {
            this.installmentPlan = installmentPlan;
            return this;
        }

        /**
         * Setter for subscriptionPlan.
         * @param  subscriptionPlan  SubscriptionSimulationPlanSettings value for subscriptionPlan.
         * @return Builder
         */
        public Builder subscriptionPlan(SubscriptionSimulationPlanSettings subscriptionPlan) {
            this.subscriptionPlan = subscriptionPlan;
            return this;
        }

        /**
         * Setter for onlyDirectCurrency.
         * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
         * @return Builder
         */
        public Builder onlyDirectCurrency(Boolean onlyDirectCurrency) {
            this.onlyDirectCurrency = onlyDirectCurrency;
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
         * Builds a new {@link SubscriptionSimulationRequest} object using the set fields.
         * @return {@link SubscriptionSimulationRequest}
         */
        public SubscriptionSimulationRequest build() {
            SubscriptionSimulationRequest model =
                    new SubscriptionSimulationRequest(amount, currency, paymentType,
                            scheduleSettings, initialAmount, period, cyclicalPeriod,
                            installmentPlan, subscriptionPlan, onlyDirectCurrency);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
