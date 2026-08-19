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
 * This is a model class for Subscription type.
 */
public class Subscription {
    private UUID id;
    private UUID storeId;
    private UUID transactionTokenId;
    private Integer amount;
    private String currency;
    private Double amountFormatted;
    private OptionalNullable<Integer> initialAmount;
    private OptionalNullable<Double> initialAmountFormatted;
    private OptionalNullable<LocalDateTime> subsequentCyclesStart;
    private SubscriptionScheduleSettings scheduleSettings;
    private Boolean onlyDirectCurrency;
    private OptionalNullable<String> firstChargeCaptureAfter;
    private Boolean firstChargeAuthorizationOnly;
    private SubscriptionStatus status;
    private GenericMetadata metadata;
    private ChargeMode mode;
    private LocalDateTime createdOn;
    private SubscriptionThreeDs threeDs;
    private SubscriptionPeriod period;
    private OptionalNullable<String> cyclicalPeriod;
    private SubscriptionNextPayment nextPayment;
    private OptionalNullable<Integer> cyclesLeft;
    private SubscriptionPlanSettings subscriptionPlan;
    private SubscriptionInstallmentPlanResponse installmentPlan;
    private OptionalNullable<UUID> chargeId;
    private OptionalNullable<Integer> amountLeft;
    private OptionalNullable<Double> amountLeftFormatted;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public Subscription() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  initialAmount  Integer value for initialAmount.
     * @param  initialAmountFormatted  Double value for initialAmountFormatted.
     * @param  subsequentCyclesStart  LocalDateTime value for subsequentCyclesStart.
     * @param  scheduleSettings  SubscriptionScheduleSettings value for scheduleSettings.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  firstChargeCaptureAfter  String value for firstChargeCaptureAfter.
     * @param  firstChargeAuthorizationOnly  Boolean value for firstChargeAuthorizationOnly.
     * @param  status  SubscriptionStatus value for status.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  threeDs  SubscriptionThreeDs value for threeDs.
     * @param  period  SubscriptionPeriod value for period.
     * @param  cyclicalPeriod  String value for cyclicalPeriod.
     * @param  nextPayment  SubscriptionNextPayment value for nextPayment.
     * @param  cyclesLeft  Integer value for cyclesLeft.
     * @param  subscriptionPlan  SubscriptionPlanSettings value for subscriptionPlan.
     * @param  installmentPlan  SubscriptionInstallmentPlanResponse value for installmentPlan.
     * @param  chargeId  UUID value for chargeId.
     * @param  amountLeft  Integer value for amountLeft.
     * @param  amountLeftFormatted  Double value for amountLeftFormatted.
     */
    public Subscription(
            UUID id,
            UUID storeId,
            UUID transactionTokenId,
            Integer amount,
            String currency,
            Double amountFormatted,
            Integer initialAmount,
            Double initialAmountFormatted,
            LocalDateTime subsequentCyclesStart,
            SubscriptionScheduleSettings scheduleSettings,
            Boolean onlyDirectCurrency,
            String firstChargeCaptureAfter,
            Boolean firstChargeAuthorizationOnly,
            SubscriptionStatus status,
            GenericMetadata metadata,
            ChargeMode mode,
            LocalDateTime createdOn,
            SubscriptionThreeDs threeDs,
            SubscriptionPeriod period,
            String cyclicalPeriod,
            SubscriptionNextPayment nextPayment,
            Integer cyclesLeft,
            SubscriptionPlanSettings subscriptionPlan,
            SubscriptionInstallmentPlanResponse installmentPlan,
            UUID chargeId,
            Integer amountLeft,
            Double amountLeftFormatted) {
        this.id = id;
        this.storeId = storeId;
        this.transactionTokenId = transactionTokenId;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.initialAmount = OptionalNullable.of(initialAmount);
        this.initialAmountFormatted = OptionalNullable.of(initialAmountFormatted);
        this.subsequentCyclesStart = OptionalNullable.of(subsequentCyclesStart);
        this.scheduleSettings = scheduleSettings;
        this.onlyDirectCurrency = onlyDirectCurrency;
        this.firstChargeCaptureAfter = OptionalNullable.of(firstChargeCaptureAfter);
        this.firstChargeAuthorizationOnly = firstChargeAuthorizationOnly;
        this.status = status;
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.threeDs = threeDs;
        this.period = period;
        this.cyclicalPeriod = OptionalNullable.of(cyclicalPeriod);
        this.nextPayment = nextPayment;
        this.cyclesLeft = OptionalNullable.of(cyclesLeft);
        this.subscriptionPlan = subscriptionPlan;
        this.installmentPlan = installmentPlan;
        this.chargeId = OptionalNullable.of(chargeId);
        this.amountLeft = OptionalNullable.of(amountLeft);
        this.amountLeftFormatted = OptionalNullable.of(amountLeftFormatted);
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  initialAmount  Integer value for initialAmount.
     * @param  initialAmountFormatted  Double value for initialAmountFormatted.
     * @param  subsequentCyclesStart  LocalDateTime value for subsequentCyclesStart.
     * @param  scheduleSettings  SubscriptionScheduleSettings value for scheduleSettings.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  firstChargeCaptureAfter  String value for firstChargeCaptureAfter.
     * @param  firstChargeAuthorizationOnly  Boolean value for firstChargeAuthorizationOnly.
     * @param  status  SubscriptionStatus value for status.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  threeDs  SubscriptionThreeDs value for threeDs.
     * @param  period  SubscriptionPeriod value for period.
     * @param  cyclicalPeriod  String value for cyclicalPeriod.
     * @param  nextPayment  SubscriptionNextPayment value for nextPayment.
     * @param  cyclesLeft  Integer value for cyclesLeft.
     * @param  subscriptionPlan  SubscriptionPlanSettings value for subscriptionPlan.
     * @param  installmentPlan  SubscriptionInstallmentPlanResponse value for installmentPlan.
     * @param  chargeId  UUID value for chargeId.
     * @param  amountLeft  Integer value for amountLeft.
     * @param  amountLeftFormatted  Double value for amountLeftFormatted.
     */

    protected Subscription(UUID id, UUID storeId, UUID transactionTokenId, Integer amount,
            String currency, Double amountFormatted, OptionalNullable<Integer> initialAmount,
            OptionalNullable<Double> initialAmountFormatted,
            OptionalNullable<LocalDateTime> subsequentCyclesStart,
            SubscriptionScheduleSettings scheduleSettings, Boolean onlyDirectCurrency,
            OptionalNullable<String> firstChargeCaptureAfter, Boolean firstChargeAuthorizationOnly,
            SubscriptionStatus status, GenericMetadata metadata, ChargeMode mode,
            LocalDateTime createdOn, SubscriptionThreeDs threeDs, SubscriptionPeriod period,
            OptionalNullable<String> cyclicalPeriod, SubscriptionNextPayment nextPayment,
            OptionalNullable<Integer> cyclesLeft, SubscriptionPlanSettings subscriptionPlan,
            SubscriptionInstallmentPlanResponse installmentPlan, OptionalNullable<UUID> chargeId,
            OptionalNullable<Integer> amountLeft, OptionalNullable<Double> amountLeftFormatted) {
        this.id = id;
        this.storeId = storeId;
        this.transactionTokenId = transactionTokenId;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.initialAmount = initialAmount;
        this.initialAmountFormatted = initialAmountFormatted;
        this.subsequentCyclesStart = subsequentCyclesStart;
        this.scheduleSettings = scheduleSettings;
        this.onlyDirectCurrency = onlyDirectCurrency;
        this.firstChargeCaptureAfter = firstChargeCaptureAfter;
        this.firstChargeAuthorizationOnly = firstChargeAuthorizationOnly;
        this.status = status;
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.threeDs = threeDs;
        this.period = period;
        this.cyclicalPeriod = cyclicalPeriod;
        this.nextPayment = nextPayment;
        this.cyclesLeft = cyclesLeft;
        this.subscriptionPlan = subscriptionPlan;
        this.installmentPlan = installmentPlan;
        this.chargeId = chargeId;
        this.amountLeft = amountLeft;
        this.amountLeftFormatted = amountLeftFormatted;
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
     * Getter for TransactionTokenId.
     * Transaction token identifier.
     * @return Returns the UUID
     */
    @JsonGetter("transaction_token_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getTransactionTokenId() {
        return transactionTokenId;
    }

    /**
     * Setter for TransactionTokenId.
     * Transaction token identifier.
     * @param transactionTokenId Value for UUID
     */
    @JsonSetter("transaction_token_id")
    public void setTransactionTokenId(UUID transactionTokenId) {
        this.transactionTokenId = transactionTokenId;
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
     * Internal Getter for InitialAmount.
     * Initial amount in the smallest currency unit.
     * @return Returns the Internal Integer
     */
    @JsonGetter("initial_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetInitialAmount() {
        return this.initialAmount;
    }

    /**
     * Getter for InitialAmount.
     * Initial amount in the smallest currency unit.
     * @return Returns the Integer
     */
    public Integer getInitialAmount() {
        return OptionalNullable.getFrom(initialAmount);
    }

    /**
     * Setter for InitialAmount.
     * Initial amount in the smallest currency unit.
     * @param initialAmount Value for Integer
     */
    @JsonSetter("initial_amount")
    public void setInitialAmount(Integer initialAmount) {
        this.initialAmount = OptionalNullable.of(initialAmount);
    }

    /**
     * UnSetter for InitialAmount.
     * Initial amount in the smallest currency unit.
     */
    public void unsetInitialAmount() {
        initialAmount = null;
    }

    /**
     * Internal Getter for InitialAmountFormatted.
     * Initial amount formatted for display.
     * @return Returns the Internal Double
     */
    @JsonGetter("initial_amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetInitialAmountFormatted() {
        return this.initialAmountFormatted;
    }

    /**
     * Getter for InitialAmountFormatted.
     * Initial amount formatted for display.
     * @return Returns the Double
     */
    public Double getInitialAmountFormatted() {
        return OptionalNullable.getFrom(initialAmountFormatted);
    }

    /**
     * Setter for InitialAmountFormatted.
     * Initial amount formatted for display.
     * @param initialAmountFormatted Value for Double
     */
    @JsonSetter("initial_amount_formatted")
    public void setInitialAmountFormatted(Double initialAmountFormatted) {
        this.initialAmountFormatted = OptionalNullable.of(initialAmountFormatted);
    }

    /**
     * UnSetter for InitialAmountFormatted.
     * Initial amount formatted for display.
     */
    public void unsetInitialAmountFormatted() {
        initialAmountFormatted = null;
    }

    /**
     * Internal Getter for SubsequentCyclesStart.
     * Timestamp when recurring cycles begin.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("subsequent_cycles_start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetSubsequentCyclesStart() {
        return this.subsequentCyclesStart;
    }

    /**
     * Getter for SubsequentCyclesStart.
     * Timestamp when recurring cycles begin.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getSubsequentCyclesStart() {
        return OptionalNullable.getFrom(subsequentCyclesStart);
    }

    /**
     * Setter for SubsequentCyclesStart.
     * Timestamp when recurring cycles begin.
     * @param subsequentCyclesStart Value for LocalDateTime
     */
    @JsonSetter("subsequent_cycles_start")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setSubsequentCyclesStart(LocalDateTime subsequentCyclesStart) {
        this.subsequentCyclesStart = OptionalNullable.of(subsequentCyclesStart);
    }

    /**
     * UnSetter for SubsequentCyclesStart.
     * Timestamp when recurring cycles begin.
     */
    public void unsetSubsequentCyclesStart() {
        subsequentCyclesStart = null;
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
     * Internal Getter for FirstChargeCaptureAfter.
     * ISO-8601 Duration (e.g., P3D).
     * @return Returns the Internal String
     */
    @JsonGetter("first_charge_capture_after")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFirstChargeCaptureAfter() {
        return this.firstChargeCaptureAfter;
    }

    /**
     * Getter for FirstChargeCaptureAfter.
     * ISO-8601 Duration (e.g., P3D).
     * @return Returns the String
     */
    public String getFirstChargeCaptureAfter() {
        return OptionalNullable.getFrom(firstChargeCaptureAfter);
    }

    /**
     * Setter for FirstChargeCaptureAfter.
     * ISO-8601 Duration (e.g., P3D).
     * @param firstChargeCaptureAfter Value for String
     */
    @JsonSetter("first_charge_capture_after")
    public void setFirstChargeCaptureAfter(String firstChargeCaptureAfter) {
        this.firstChargeCaptureAfter = OptionalNullable.of(firstChargeCaptureAfter);
    }

    /**
     * UnSetter for FirstChargeCaptureAfter.
     * ISO-8601 Duration (e.g., P3D).
     */
    public void unsetFirstChargeCaptureAfter() {
        firstChargeCaptureAfter = null;
    }

    /**
     * Getter for FirstChargeAuthorizationOnly.
     * Whether the first charge is authorization-only.
     * @return Returns the Boolean
     */
    @JsonGetter("first_charge_authorization_only")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFirstChargeAuthorizationOnly() {
        return firstChargeAuthorizationOnly;
    }

    /**
     * Setter for FirstChargeAuthorizationOnly.
     * Whether the first charge is authorization-only.
     * @param firstChargeAuthorizationOnly Value for Boolean
     */
    @JsonSetter("first_charge_authorization_only")
    public void setFirstChargeAuthorizationOnly(Boolean firstChargeAuthorizationOnly) {
        this.firstChargeAuthorizationOnly = firstChargeAuthorizationOnly;
    }

    /**
     * Getter for Status.
     * Subscription Status schema.
     * @return Returns the SubscriptionStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Subscription Status schema.
     * @param status Value for SubscriptionStatus
     */
    @JsonSetter("status")
    public void setStatus(SubscriptionStatus status) {
        this.status = status;
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
     * Getter for ThreeDs.
     * 3-D Secure configuration and redirect details applied to the subscription's payments.
     * @return Returns the SubscriptionThreeDs
     */
    @JsonGetter("three_ds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionThreeDs getThreeDs() {
        return threeDs;
    }

    /**
     * Setter for ThreeDs.
     * 3-D Secure configuration and redirect details applied to the subscription's payments.
     * @param threeDs Value for SubscriptionThreeDs
     */
    @JsonSetter("three_ds")
    public void setThreeDs(SubscriptionThreeDs threeDs) {
        this.threeDs = threeDs;
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
     * Internal Getter for CyclicalPeriod.
     * ISO-8601 Duration for a custom billing frequency (e.g., P3D, P1M), returned instead of
     * `period` when the subscription uses a custom cycle length rather than one of the fixed period
     * presets. Mutually exclusive with `period` — exactly one of the two is present.
     * @return Returns the Internal String
     */
    @JsonGetter("cyclical_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCyclicalPeriod() {
        return this.cyclicalPeriod;
    }

    /**
     * Getter for CyclicalPeriod.
     * ISO-8601 Duration for a custom billing frequency (e.g., P3D, P1M), returned instead of
     * `period` when the subscription uses a custom cycle length rather than one of the fixed period
     * presets. Mutually exclusive with `period` — exactly one of the two is present.
     * @return Returns the String
     */
    public String getCyclicalPeriod() {
        return OptionalNullable.getFrom(cyclicalPeriod);
    }

    /**
     * Setter for CyclicalPeriod.
     * ISO-8601 Duration for a custom billing frequency (e.g., P3D, P1M), returned instead of
     * `period` when the subscription uses a custom cycle length rather than one of the fixed period
     * presets. Mutually exclusive with `period` — exactly one of the two is present.
     * @param cyclicalPeriod Value for String
     */
    @JsonSetter("cyclical_period")
    public void setCyclicalPeriod(String cyclicalPeriod) {
        this.cyclicalPeriod = OptionalNullable.of(cyclicalPeriod);
    }

    /**
     * UnSetter for CyclicalPeriod.
     * ISO-8601 Duration for a custom billing frequency (e.g., P3D, P1M), returned instead of
     * `period` when the subscription uses a custom cycle length rather than one of the fixed period
     * presets. Mutually exclusive with `period` — exactly one of the two is present.
     */
    public void unsetCyclicalPeriod() {
        cyclicalPeriod = null;
    }

    /**
     * Getter for NextPayment.
     * Next scheduled payment details for a subscription.
     * @return Returns the SubscriptionNextPayment
     */
    @JsonGetter("next_payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionNextPayment getNextPayment() {
        return nextPayment;
    }

    /**
     * Setter for NextPayment.
     * Next scheduled payment details for a subscription.
     * @param nextPayment Value for SubscriptionNextPayment
     */
    @JsonSetter("next_payment")
    public void setNextPayment(SubscriptionNextPayment nextPayment) {
        this.nextPayment = nextPayment;
    }

    /**
     * Internal Getter for CyclesLeft.
     * Number of remaining billing cycles before the subscription completes. Only present for
     * cycle-limited plans (`subscription_plan` or `installment_plan`); `null` for indefinite
     * subscriptions.
     * @return Returns the Internal Integer
     */
    @JsonGetter("cycles_left")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCyclesLeft() {
        return this.cyclesLeft;
    }

    /**
     * Getter for CyclesLeft.
     * Number of remaining billing cycles before the subscription completes. Only present for
     * cycle-limited plans (`subscription_plan` or `installment_plan`); `null` for indefinite
     * subscriptions.
     * @return Returns the Integer
     */
    public Integer getCyclesLeft() {
        return OptionalNullable.getFrom(cyclesLeft);
    }

    /**
     * Setter for CyclesLeft.
     * Number of remaining billing cycles before the subscription completes. Only present for
     * cycle-limited plans (`subscription_plan` or `installment_plan`); `null` for indefinite
     * subscriptions.
     * @param cyclesLeft Value for Integer
     */
    @JsonSetter("cycles_left")
    public void setCyclesLeft(Integer cyclesLeft) {
        this.cyclesLeft = OptionalNullable.of(cyclesLeft);
    }

    /**
     * UnSetter for CyclesLeft.
     * Number of remaining billing cycles before the subscription completes. Only present for
     * cycle-limited plans (`subscription_plan` or `installment_plan`); `null` for indefinite
     * subscriptions.
     */
    public void unsetCyclesLeft() {
        cyclesLeft = null;
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
     * Installment plan applied to the subscription, as returned by the API. Covers both
     * card-network installment plans (`revolving`, `fixed_cycles`) and legacy fixed-amount
     * installment plans (`fixed_cycle_amount`).
     * @return Returns the SubscriptionInstallmentPlanResponse
     */
    @JsonGetter("installment_plan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionInstallmentPlanResponse getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Setter for InstallmentPlan.
     * Installment plan applied to the subscription, as returned by the API. Covers both
     * card-network installment plans (`revolving`, `fixed_cycles`) and legacy fixed-amount
     * installment plans (`fixed_cycle_amount`).
     * @param installmentPlan Value for SubscriptionInstallmentPlanResponse
     */
    @JsonSetter("installment_plan")
    public void setInstallmentPlan(SubscriptionInstallmentPlanResponse installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    /**
     * Internal Getter for ChargeId.
     * Identifier of the charge associated with the subscription's installment plan. Only present
     * when `installment_plan` is set.
     * @return Returns the Internal UUID
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetChargeId() {
        return this.chargeId;
    }

    /**
     * Getter for ChargeId.
     * Identifier of the charge associated with the subscription's installment plan. Only present
     * when `installment_plan` is set.
     * @return Returns the UUID
     */
    public UUID getChargeId() {
        return OptionalNullable.getFrom(chargeId);
    }

    /**
     * Setter for ChargeId.
     * Identifier of the charge associated with the subscription's installment plan. Only present
     * when `installment_plan` is set.
     * @param chargeId Value for UUID
     */
    @JsonSetter("charge_id")
    public void setChargeId(UUID chargeId) {
        this.chargeId = OptionalNullable.of(chargeId);
    }

    /**
     * UnSetter for ChargeId.
     * Identifier of the charge associated with the subscription's installment plan. Only present
     * when `installment_plan` is set.
     */
    public void unsetChargeId() {
        chargeId = null;
    }

    /**
     * Internal Getter for AmountLeft.
     * Remaining amount to be charged over the life of the plan, in the smallest currency unit. Only
     * present for cycle-limited plans.
     * @return Returns the Internal Integer
     */
    @JsonGetter("amount_left")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAmountLeft() {
        return this.amountLeft;
    }

    /**
     * Getter for AmountLeft.
     * Remaining amount to be charged over the life of the plan, in the smallest currency unit. Only
     * present for cycle-limited plans.
     * @return Returns the Integer
     */
    public Integer getAmountLeft() {
        return OptionalNullable.getFrom(amountLeft);
    }

    /**
     * Setter for AmountLeft.
     * Remaining amount to be charged over the life of the plan, in the smallest currency unit. Only
     * present for cycle-limited plans.
     * @param amountLeft Value for Integer
     */
    @JsonSetter("amount_left")
    public void setAmountLeft(Integer amountLeft) {
        this.amountLeft = OptionalNullable.of(amountLeft);
    }

    /**
     * UnSetter for AmountLeft.
     * Remaining amount to be charged over the life of the plan, in the smallest currency unit. Only
     * present for cycle-limited plans.
     */
    public void unsetAmountLeft() {
        amountLeft = null;
    }

    /**
     * Internal Getter for AmountLeftFormatted.
     * `amount_left` formatted for display.
     * @return Returns the Internal Double
     */
    @JsonGetter("amount_left_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetAmountLeftFormatted() {
        return this.amountLeftFormatted;
    }

    /**
     * Getter for AmountLeftFormatted.
     * `amount_left` formatted for display.
     * @return Returns the Double
     */
    public Double getAmountLeftFormatted() {
        return OptionalNullable.getFrom(amountLeftFormatted);
    }

    /**
     * Setter for AmountLeftFormatted.
     * `amount_left` formatted for display.
     * @param amountLeftFormatted Value for Double
     */
    @JsonSetter("amount_left_formatted")
    public void setAmountLeftFormatted(Double amountLeftFormatted) {
        this.amountLeftFormatted = OptionalNullable.of(amountLeftFormatted);
    }

    /**
     * UnSetter for AmountLeftFormatted.
     * `amount_left` formatted for display.
     */
    public void unsetAmountLeftFormatted() {
        amountLeftFormatted = null;
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
     * Converts this Subscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Subscription [" + "id=" + id + ", storeId=" + storeId + ", transactionTokenId="
                + transactionTokenId + ", amount=" + amount + ", currency=" + currency
                + ", amountFormatted=" + amountFormatted + ", initialAmount=" + initialAmount
                + ", initialAmountFormatted=" + initialAmountFormatted + ", subsequentCyclesStart="
                + subsequentCyclesStart + ", scheduleSettings=" + scheduleSettings
                + ", onlyDirectCurrency=" + onlyDirectCurrency + ", firstChargeCaptureAfter="
                + firstChargeCaptureAfter + ", firstChargeAuthorizationOnly="
                + firstChargeAuthorizationOnly + ", status=" + status + ", metadata=" + metadata
                + ", mode=" + mode + ", createdOn=" + createdOn + ", threeDs=" + threeDs
                + ", period=" + period + ", cyclicalPeriod=" + cyclicalPeriod + ", nextPayment="
                + nextPayment + ", cyclesLeft=" + cyclesLeft + ", subscriptionPlan="
                + subscriptionPlan + ", installmentPlan=" + installmentPlan + ", chargeId="
                + chargeId + ", amountLeft=" + amountLeft + ", amountLeftFormatted="
                + amountLeftFormatted + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link Subscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Subscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .storeId(getStoreId())
                .transactionTokenId(getTransactionTokenId())
                .amount(getAmount())
                .currency(getCurrency())
                .amountFormatted(getAmountFormatted())
                .scheduleSettings(getScheduleSettings())
                .onlyDirectCurrency(getOnlyDirectCurrency())
                .firstChargeAuthorizationOnly(getFirstChargeAuthorizationOnly())
                .status(getStatus())
                .metadata(getMetadata())
                .mode(getMode())
                .createdOn(getCreatedOn())
                .threeDs(getThreeDs())
                .period(getPeriod())
                .nextPayment(getNextPayment())
                .subscriptionPlan(getSubscriptionPlan())
                .installmentPlan(getInstallmentPlan());
        builder.initialAmount = internalGetInitialAmount();
        builder.initialAmountFormatted = internalGetInitialAmountFormatted();
        builder.subsequentCyclesStart = internalGetSubsequentCyclesStart();
        builder.firstChargeCaptureAfter = internalGetFirstChargeCaptureAfter();
        builder.cyclicalPeriod = internalGetCyclicalPeriod();
        builder.cyclesLeft = internalGetCyclesLeft();
        builder.chargeId = internalGetChargeId();
        builder.amountLeft = internalGetAmountLeft();
        builder.amountLeftFormatted = internalGetAmountLeftFormatted();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link Subscription}.
     */
    public static class Builder {
        private UUID id;
        private UUID storeId;
        private UUID transactionTokenId;
        private Integer amount;
        private String currency;
        private Double amountFormatted;
        private OptionalNullable<Integer> initialAmount;
        private OptionalNullable<Double> initialAmountFormatted;
        private OptionalNullable<LocalDateTime> subsequentCyclesStart;
        private SubscriptionScheduleSettings scheduleSettings;
        private Boolean onlyDirectCurrency;
        private OptionalNullable<String> firstChargeCaptureAfter;
        private Boolean firstChargeAuthorizationOnly;
        private SubscriptionStatus status;
        private GenericMetadata metadata;
        private ChargeMode mode;
        private LocalDateTime createdOn;
        private SubscriptionThreeDs threeDs;
        private SubscriptionPeriod period;
        private OptionalNullable<String> cyclicalPeriod;
        private SubscriptionNextPayment nextPayment;
        private OptionalNullable<Integer> cyclesLeft;
        private SubscriptionPlanSettings subscriptionPlan;
        private SubscriptionInstallmentPlanResponse installmentPlan;
        private OptionalNullable<UUID> chargeId;
        private OptionalNullable<Integer> amountLeft;
        private OptionalNullable<Double> amountLeftFormatted;
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
         * Setter for initialAmount.
         * @param  initialAmount  Integer value for initialAmount.
         * @return Builder
         */
        public Builder initialAmount(Integer initialAmount) {
            this.initialAmount = OptionalNullable.of(initialAmount);
            return this;
        }

        /**
         * UnSetter for initialAmount.
         * @return Builder
         */
        public Builder unsetInitialAmount() {
            initialAmount = null;
            return this;
        }

        /**
         * Setter for initialAmountFormatted.
         * @param  initialAmountFormatted  Double value for initialAmountFormatted.
         * @return Builder
         */
        public Builder initialAmountFormatted(Double initialAmountFormatted) {
            this.initialAmountFormatted = OptionalNullable.of(initialAmountFormatted);
            return this;
        }

        /**
         * UnSetter for initialAmountFormatted.
         * @return Builder
         */
        public Builder unsetInitialAmountFormatted() {
            initialAmountFormatted = null;
            return this;
        }

        /**
         * Setter for subsequentCyclesStart.
         * @param  subsequentCyclesStart  LocalDateTime value for subsequentCyclesStart.
         * @return Builder
         */
        public Builder subsequentCyclesStart(LocalDateTime subsequentCyclesStart) {
            this.subsequentCyclesStart = OptionalNullable.of(subsequentCyclesStart);
            return this;
        }

        /**
         * UnSetter for subsequentCyclesStart.
         * @return Builder
         */
        public Builder unsetSubsequentCyclesStart() {
            subsequentCyclesStart = null;
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
         * Setter for onlyDirectCurrency.
         * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
         * @return Builder
         */
        public Builder onlyDirectCurrency(Boolean onlyDirectCurrency) {
            this.onlyDirectCurrency = onlyDirectCurrency;
            return this;
        }

        /**
         * Setter for firstChargeCaptureAfter.
         * @param  firstChargeCaptureAfter  String value for firstChargeCaptureAfter.
         * @return Builder
         */
        public Builder firstChargeCaptureAfter(String firstChargeCaptureAfter) {
            this.firstChargeCaptureAfter = OptionalNullable.of(firstChargeCaptureAfter);
            return this;
        }

        /**
         * UnSetter for firstChargeCaptureAfter.
         * @return Builder
         */
        public Builder unsetFirstChargeCaptureAfter() {
            firstChargeCaptureAfter = null;
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
         * Setter for status.
         * @param  status  SubscriptionStatus value for status.
         * @return Builder
         */
        public Builder status(SubscriptionStatus status) {
            this.status = status;
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
         * Setter for threeDs.
         * @param  threeDs  SubscriptionThreeDs value for threeDs.
         * @return Builder
         */
        public Builder threeDs(SubscriptionThreeDs threeDs) {
            this.threeDs = threeDs;
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
            this.cyclicalPeriod = OptionalNullable.of(cyclicalPeriod);
            return this;
        }

        /**
         * UnSetter for cyclicalPeriod.
         * @return Builder
         */
        public Builder unsetCyclicalPeriod() {
            cyclicalPeriod = null;
            return this;
        }

        /**
         * Setter for nextPayment.
         * @param  nextPayment  SubscriptionNextPayment value for nextPayment.
         * @return Builder
         */
        public Builder nextPayment(SubscriptionNextPayment nextPayment) {
            this.nextPayment = nextPayment;
            return this;
        }

        /**
         * Setter for cyclesLeft.
         * @param  cyclesLeft  Integer value for cyclesLeft.
         * @return Builder
         */
        public Builder cyclesLeft(Integer cyclesLeft) {
            this.cyclesLeft = OptionalNullable.of(cyclesLeft);
            return this;
        }

        /**
         * UnSetter for cyclesLeft.
         * @return Builder
         */
        public Builder unsetCyclesLeft() {
            cyclesLeft = null;
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
         * @param  installmentPlan  SubscriptionInstallmentPlanResponse value for installmentPlan.
         * @return Builder
         */
        public Builder installmentPlan(SubscriptionInstallmentPlanResponse installmentPlan) {
            this.installmentPlan = installmentPlan;
            return this;
        }

        /**
         * Setter for chargeId.
         * @param  chargeId  UUID value for chargeId.
         * @return Builder
         */
        public Builder chargeId(UUID chargeId) {
            this.chargeId = OptionalNullable.of(chargeId);
            return this;
        }

        /**
         * UnSetter for chargeId.
         * @return Builder
         */
        public Builder unsetChargeId() {
            chargeId = null;
            return this;
        }

        /**
         * Setter for amountLeft.
         * @param  amountLeft  Integer value for amountLeft.
         * @return Builder
         */
        public Builder amountLeft(Integer amountLeft) {
            this.amountLeft = OptionalNullable.of(amountLeft);
            return this;
        }

        /**
         * UnSetter for amountLeft.
         * @return Builder
         */
        public Builder unsetAmountLeft() {
            amountLeft = null;
            return this;
        }

        /**
         * Setter for amountLeftFormatted.
         * @param  amountLeftFormatted  Double value for amountLeftFormatted.
         * @return Builder
         */
        public Builder amountLeftFormatted(Double amountLeftFormatted) {
            this.amountLeftFormatted = OptionalNullable.of(amountLeftFormatted);
            return this;
        }

        /**
         * UnSetter for amountLeftFormatted.
         * @return Builder
         */
        public Builder unsetAmountLeftFormatted() {
            amountLeftFormatted = null;
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
         * Builds a new {@link Subscription} object using the set fields.
         * @return {@link Subscription}
         */
        public Subscription build() {
            Subscription model =
                    new Subscription(id, storeId, transactionTokenId, amount, currency,
                            amountFormatted, initialAmount, initialAmountFormatted,
                            subsequentCyclesStart, scheduleSettings, onlyDirectCurrency,
                            firstChargeCaptureAfter, firstChargeAuthorizationOnly, status, metadata,
                            mode, createdOn, threeDs, period, cyclicalPeriod, nextPayment,
                            cyclesLeft, subscriptionPlan, installmentPlan, chargeId, amountLeft,
                            amountLeftFormatted);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
