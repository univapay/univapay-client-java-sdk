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
 * This is a model class for SubscriptionListItem type.
 */
public class SubscriptionListItem {
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
    private SubscriptionPeriod period;
    private SubscriptionNextPayment nextPayment;
    private String merchantName;
    private String storeName;
    private String paymentType;
    private LocalDate nextPaymentDate;
    private SubscriptionUserData userData;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionListItem() {
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
     * @param  period  SubscriptionPeriod value for period.
     * @param  nextPayment  SubscriptionNextPayment value for nextPayment.
     * @param  merchantName  String value for merchantName.
     * @param  storeName  String value for storeName.
     * @param  paymentType  String value for paymentType.
     * @param  nextPaymentDate  LocalDate value for nextPaymentDate.
     * @param  userData  SubscriptionUserData value for userData.
     */
    public SubscriptionListItem(
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
            SubscriptionPeriod period,
            SubscriptionNextPayment nextPayment,
            String merchantName,
            String storeName,
            String paymentType,
            LocalDate nextPaymentDate,
            SubscriptionUserData userData) {
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
        this.period = period;
        this.nextPayment = nextPayment;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.paymentType = paymentType;
        this.nextPaymentDate = nextPaymentDate;
        this.userData = userData;
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
     * @param  period  SubscriptionPeriod value for period.
     * @param  nextPayment  SubscriptionNextPayment value for nextPayment.
     * @param  merchantName  String value for merchantName.
     * @param  storeName  String value for storeName.
     * @param  paymentType  String value for paymentType.
     * @param  nextPaymentDate  LocalDate value for nextPaymentDate.
     * @param  userData  SubscriptionUserData value for userData.
     */

    protected SubscriptionListItem(UUID id, UUID storeId, UUID transactionTokenId, Integer amount,
            String currency, Double amountFormatted, OptionalNullable<Integer> initialAmount,
            OptionalNullable<Double> initialAmountFormatted,
            OptionalNullable<LocalDateTime> subsequentCyclesStart,
            SubscriptionScheduleSettings scheduleSettings, Boolean onlyDirectCurrency,
            OptionalNullable<String> firstChargeCaptureAfter, Boolean firstChargeAuthorizationOnly,
            SubscriptionStatus status, GenericMetadata metadata, ChargeMode mode,
            LocalDateTime createdOn, SubscriptionPeriod period, SubscriptionNextPayment nextPayment,
            String merchantName, String storeName, String paymentType, LocalDate nextPaymentDate,
            SubscriptionUserData userData) {
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
        this.period = period;
        this.nextPayment = nextPayment;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.paymentType = paymentType;
        this.nextPaymentDate = nextPaymentDate;
        this.userData = userData;
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
     * Getter for MerchantName.
     * Merchant display name.
     * @return Returns the String
     */
    @JsonGetter("merchant_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Setter for MerchantName.
     * Merchant display name.
     * @param merchantName Value for String
     */
    @JsonSetter("merchant_name")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * Getter for StoreName.
     * Store display name.
     * @return Returns the String
     */
    @JsonGetter("store_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStoreName() {
        return storeName;
    }

    /**
     * Setter for StoreName.
     * Store display name.
     * @param storeName Value for String
     */
    @JsonSetter("store_name")
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Getter for PaymentType.
     * Payment method type.
     * @return Returns the String
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Payment method type.
     * @param paymentType Value for String
     */
    @JsonSetter("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for NextPaymentDate.
     * Next payment date value.
     * @return Returns the LocalDate
     */
    @JsonGetter("next_payment_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * Setter for NextPaymentDate.
     * Next payment date value.
     * @param nextPaymentDate Value for LocalDate
     */
    @JsonSetter("next_payment_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setNextPaymentDate(LocalDate nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    /**
     * Getter for UserData.
     * Customer-facing payment method summary data.
     * @return Returns the SubscriptionUserData
     */
    @JsonGetter("user_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionUserData getUserData() {
        return userData;
    }

    /**
     * Setter for UserData.
     * Customer-facing payment method summary data.
     * @param userData Value for SubscriptionUserData
     */
    @JsonSetter("user_data")
    public void setUserData(SubscriptionUserData userData) {
        this.userData = userData;
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
     * Converts this SubscriptionListItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionListItem [" + "id=" + id + ", storeId=" + storeId
                + ", transactionTokenId=" + transactionTokenId + ", amount=" + amount
                + ", currency=" + currency + ", amountFormatted=" + amountFormatted
                + ", initialAmount=" + initialAmount + ", initialAmountFormatted="
                + initialAmountFormatted + ", subsequentCyclesStart=" + subsequentCyclesStart
                + ", scheduleSettings=" + scheduleSettings + ", onlyDirectCurrency="
                + onlyDirectCurrency + ", firstChargeCaptureAfter=" + firstChargeCaptureAfter
                + ", firstChargeAuthorizationOnly=" + firstChargeAuthorizationOnly + ", status="
                + status + ", metadata=" + metadata + ", mode=" + mode + ", createdOn=" + createdOn
                + ", period=" + period + ", nextPayment=" + nextPayment + ", merchantName="
                + merchantName + ", storeName=" + storeName + ", paymentType=" + paymentType
                + ", nextPaymentDate=" + nextPaymentDate + ", userData=" + userData
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionListItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionListItem.Builder} object
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
                .period(getPeriod())
                .nextPayment(getNextPayment())
                .merchantName(getMerchantName())
                .storeName(getStoreName())
                .paymentType(getPaymentType())
                .nextPaymentDate(getNextPaymentDate())
                .userData(getUserData());
        builder.initialAmount = internalGetInitialAmount();
        builder.initialAmountFormatted = internalGetInitialAmountFormatted();
        builder.subsequentCyclesStart = internalGetSubsequentCyclesStart();
        builder.firstChargeCaptureAfter = internalGetFirstChargeCaptureAfter();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionListItem}.
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
        private SubscriptionPeriod period;
        private SubscriptionNextPayment nextPayment;
        private String merchantName;
        private String storeName;
        private String paymentType;
        private LocalDate nextPaymentDate;
        private SubscriptionUserData userData;
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
         * Setter for period.
         * @param  period  SubscriptionPeriod value for period.
         * @return Builder
         */
        public Builder period(SubscriptionPeriod period) {
            this.period = period;
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
         * Setter for merchantName.
         * @param  merchantName  String value for merchantName.
         * @return Builder
         */
        public Builder merchantName(String merchantName) {
            this.merchantName = merchantName;
            return this;
        }

        /**
         * Setter for storeName.
         * @param  storeName  String value for storeName.
         * @return Builder
         */
        public Builder storeName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for nextPaymentDate.
         * @param  nextPaymentDate  LocalDate value for nextPaymentDate.
         * @return Builder
         */
        public Builder nextPaymentDate(LocalDate nextPaymentDate) {
            this.nextPaymentDate = nextPaymentDate;
            return this;
        }

        /**
         * Setter for userData.
         * @param  userData  SubscriptionUserData value for userData.
         * @return Builder
         */
        public Builder userData(SubscriptionUserData userData) {
            this.userData = userData;
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
         * Builds a new {@link SubscriptionListItem} object using the set fields.
         * @return {@link SubscriptionListItem}
         */
        public SubscriptionListItem build() {
            SubscriptionListItem model =
                    new SubscriptionListItem(id, storeId, transactionTokenId, amount, currency,
                            amountFormatted, initialAmount, initialAmountFormatted,
                            subsequentCyclesStart, scheduleSettings, onlyDirectCurrency,
                            firstChargeCaptureAfter, firstChargeAuthorizationOnly, status, metadata,
                            mode, createdOn, period, nextPayment, merchantName, storeName,
                            paymentType, nextPaymentDate, userData);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
