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
 * This is a model class for Charge type.
 */
public class Charge {
    private UUID id;
    private UUID storeId;
    private UUID transactionTokenId;
    private ChargeTransactionTokenType transactionTokenType;
    private OptionalNullable<UUID> subscriptionId;
    private OptionalNullable<String> merchantTransactionId;
    private Integer requestedAmount;
    private String requestedCurrency;
    private Double requestedAmountFormatted;
    private OptionalNullable<Integer> chargedAmount;
    private OptionalNullable<String> chargedCurrency;
    private OptionalNullable<Double> chargedAmountFormatted;
    private OptionalNullable<Integer> feeAmount;
    private OptionalNullable<String> feeCurrency;
    private OptionalNullable<Double> feeAmountFormatted;
    private Boolean onlyDirectCurrency;
    private OptionalNullable<LocalDateTime> captureAt;
    private OptionalNullable<String> descriptor;
    private OptionalNullable<String> descriptorPhoneNumber;
    private ChargeStatus status;
    private OptionalNullable<PaymentError> error;
    private GenericMetadata metadata;
    private ChargeMode mode;
    private LocalDateTime createdOn;
    private String merchantName;
    private String storeName;
    private ChargeRedirect redirect;
    private ChargeThreeDs threeDs;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public Charge() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     * @param  transactionTokenType  ChargeTransactionTokenType value for transactionTokenType.
     * @param  subscriptionId  UUID value for subscriptionId.
     * @param  merchantTransactionId  String value for merchantTransactionId.
     * @param  requestedAmount  Integer value for requestedAmount.
     * @param  requestedCurrency  String value for requestedCurrency.
     * @param  requestedAmountFormatted  Double value for requestedAmountFormatted.
     * @param  chargedAmount  Integer value for chargedAmount.
     * @param  chargedCurrency  String value for chargedCurrency.
     * @param  chargedAmountFormatted  Double value for chargedAmountFormatted.
     * @param  feeAmount  Integer value for feeAmount.
     * @param  feeCurrency  String value for feeCurrency.
     * @param  feeAmountFormatted  Double value for feeAmountFormatted.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  captureAt  LocalDateTime value for captureAt.
     * @param  descriptor  String value for descriptor.
     * @param  descriptorPhoneNumber  String value for descriptorPhoneNumber.
     * @param  status  ChargeStatus value for status.
     * @param  error  PaymentError value for error.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  merchantName  String value for merchantName.
     * @param  storeName  String value for storeName.
     * @param  redirect  ChargeRedirect value for redirect.
     * @param  threeDs  ChargeThreeDs value for threeDs.
     */
    public Charge(
            UUID id,
            UUID storeId,
            UUID transactionTokenId,
            ChargeTransactionTokenType transactionTokenType,
            UUID subscriptionId,
            String merchantTransactionId,
            Integer requestedAmount,
            String requestedCurrency,
            Double requestedAmountFormatted,
            Integer chargedAmount,
            String chargedCurrency,
            Double chargedAmountFormatted,
            Integer feeAmount,
            String feeCurrency,
            Double feeAmountFormatted,
            Boolean onlyDirectCurrency,
            LocalDateTime captureAt,
            String descriptor,
            String descriptorPhoneNumber,
            ChargeStatus status,
            PaymentError error,
            GenericMetadata metadata,
            ChargeMode mode,
            LocalDateTime createdOn,
            String merchantName,
            String storeName,
            ChargeRedirect redirect,
            ChargeThreeDs threeDs) {
        this.id = id;
        this.storeId = storeId;
        this.transactionTokenId = transactionTokenId;
        this.transactionTokenType = transactionTokenType;
        this.subscriptionId = OptionalNullable.of(subscriptionId);
        this.merchantTransactionId = OptionalNullable.of(merchantTransactionId);
        this.requestedAmount = requestedAmount;
        this.requestedCurrency = requestedCurrency;
        this.requestedAmountFormatted = requestedAmountFormatted;
        this.chargedAmount = OptionalNullable.of(chargedAmount);
        this.chargedCurrency = OptionalNullable.of(chargedCurrency);
        this.chargedAmountFormatted = OptionalNullable.of(chargedAmountFormatted);
        this.feeAmount = OptionalNullable.of(feeAmount);
        this.feeCurrency = OptionalNullable.of(feeCurrency);
        this.feeAmountFormatted = OptionalNullable.of(feeAmountFormatted);
        this.onlyDirectCurrency = onlyDirectCurrency;
        this.captureAt = OptionalNullable.of(captureAt);
        this.descriptor = OptionalNullable.of(descriptor);
        this.descriptorPhoneNumber = OptionalNullable.of(descriptorPhoneNumber);
        this.status = status;
        this.error = OptionalNullable.of(error);
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.redirect = redirect;
        this.threeDs = threeDs;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     * @param  transactionTokenType  ChargeTransactionTokenType value for transactionTokenType.
     * @param  subscriptionId  UUID value for subscriptionId.
     * @param  merchantTransactionId  String value for merchantTransactionId.
     * @param  requestedAmount  Integer value for requestedAmount.
     * @param  requestedCurrency  String value for requestedCurrency.
     * @param  requestedAmountFormatted  Double value for requestedAmountFormatted.
     * @param  chargedAmount  Integer value for chargedAmount.
     * @param  chargedCurrency  String value for chargedCurrency.
     * @param  chargedAmountFormatted  Double value for chargedAmountFormatted.
     * @param  feeAmount  Integer value for feeAmount.
     * @param  feeCurrency  String value for feeCurrency.
     * @param  feeAmountFormatted  Double value for feeAmountFormatted.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  captureAt  LocalDateTime value for captureAt.
     * @param  descriptor  String value for descriptor.
     * @param  descriptorPhoneNumber  String value for descriptorPhoneNumber.
     * @param  status  ChargeStatus value for status.
     * @param  error  PaymentError value for error.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  merchantName  String value for merchantName.
     * @param  storeName  String value for storeName.
     * @param  redirect  ChargeRedirect value for redirect.
     * @param  threeDs  ChargeThreeDs value for threeDs.
     */

    protected Charge(UUID id, UUID storeId, UUID transactionTokenId,
            ChargeTransactionTokenType transactionTokenType, OptionalNullable<UUID> subscriptionId,
            OptionalNullable<String> merchantTransactionId, Integer requestedAmount,
            String requestedCurrency, Double requestedAmountFormatted,
            OptionalNullable<Integer> chargedAmount, OptionalNullable<String> chargedCurrency,
            OptionalNullable<Double> chargedAmountFormatted, OptionalNullable<Integer> feeAmount,
            OptionalNullable<String> feeCurrency, OptionalNullable<Double> feeAmountFormatted,
            Boolean onlyDirectCurrency, OptionalNullable<LocalDateTime> captureAt,
            OptionalNullable<String> descriptor, OptionalNullable<String> descriptorPhoneNumber,
            ChargeStatus status, OptionalNullable<PaymentError> error, GenericMetadata metadata,
            ChargeMode mode, LocalDateTime createdOn, String merchantName, String storeName,
            ChargeRedirect redirect, ChargeThreeDs threeDs) {
        this.id = id;
        this.storeId = storeId;
        this.transactionTokenId = transactionTokenId;
        this.transactionTokenType = transactionTokenType;
        this.subscriptionId = subscriptionId;
        this.merchantTransactionId = merchantTransactionId;
        this.requestedAmount = requestedAmount;
        this.requestedCurrency = requestedCurrency;
        this.requestedAmountFormatted = requestedAmountFormatted;
        this.chargedAmount = chargedAmount;
        this.chargedCurrency = chargedCurrency;
        this.chargedAmountFormatted = chargedAmountFormatted;
        this.feeAmount = feeAmount;
        this.feeCurrency = feeCurrency;
        this.feeAmountFormatted = feeAmountFormatted;
        this.onlyDirectCurrency = onlyDirectCurrency;
        this.captureAt = captureAt;
        this.descriptor = descriptor;
        this.descriptorPhoneNumber = descriptorPhoneNumber;
        this.status = status;
        this.error = error;
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.redirect = redirect;
        this.threeDs = threeDs;
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
     * Getter for TransactionTokenType.
     * Charge Transaction Token Type schema.
     * @return Returns the ChargeTransactionTokenType
     */
    @JsonGetter("transaction_token_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeTransactionTokenType getTransactionTokenType() {
        return transactionTokenType;
    }

    /**
     * Setter for TransactionTokenType.
     * Charge Transaction Token Type schema.
     * @param transactionTokenType Value for ChargeTransactionTokenType
     */
    @JsonSetter("transaction_token_type")
    public void setTransactionTokenType(ChargeTransactionTokenType transactionTokenType) {
        this.transactionTokenType = transactionTokenType;
    }

    /**
     * Internal Getter for SubscriptionId.
     * Subscription identifier.
     * @return Returns the Internal UUID
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Getter for SubscriptionId.
     * Subscription identifier.
     * @return Returns the UUID
     */
    public UUID getSubscriptionId() {
        return OptionalNullable.getFrom(subscriptionId);
    }

    /**
     * Setter for SubscriptionId.
     * Subscription identifier.
     * @param subscriptionId Value for UUID
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = OptionalNullable.of(subscriptionId);
    }

    /**
     * UnSetter for SubscriptionId.
     * Subscription identifier.
     */
    public void unsetSubscriptionId() {
        subscriptionId = null;
    }

    /**
     * Internal Getter for MerchantTransactionId.
     * Merchant-defined transaction identifier.
     * @return Returns the Internal String
     */
    @JsonGetter("merchant_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMerchantTransactionId() {
        return this.merchantTransactionId;
    }

    /**
     * Getter for MerchantTransactionId.
     * Merchant-defined transaction identifier.
     * @return Returns the String
     */
    public String getMerchantTransactionId() {
        return OptionalNullable.getFrom(merchantTransactionId);
    }

    /**
     * Setter for MerchantTransactionId.
     * Merchant-defined transaction identifier.
     * @param merchantTransactionId Value for String
     */
    @JsonSetter("merchant_transaction_id")
    public void setMerchantTransactionId(String merchantTransactionId) {
        this.merchantTransactionId = OptionalNullable.of(merchantTransactionId);
    }

    /**
     * UnSetter for MerchantTransactionId.
     * Merchant-defined transaction identifier.
     */
    public void unsetMerchantTransactionId() {
        merchantTransactionId = null;
    }

    /**
     * Getter for RequestedAmount.
     * Requested amount in the smallest currency unit.
     * @return Returns the Integer
     */
    @JsonGetter("requested_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Setter for RequestedAmount.
     * Requested amount in the smallest currency unit.
     * @param requestedAmount Value for Integer
     */
    @JsonSetter("requested_amount")
    public void setRequestedAmount(Integer requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    /**
     * Getter for RequestedCurrency.
     * Requested ISO-4217 currency code.
     * @return Returns the String
     */
    @JsonGetter("requested_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestedCurrency() {
        return requestedCurrency;
    }

    /**
     * Setter for RequestedCurrency.
     * Requested ISO-4217 currency code.
     * @param requestedCurrency Value for String
     */
    @JsonSetter("requested_currency")
    public void setRequestedCurrency(String requestedCurrency) {
        this.requestedCurrency = requestedCurrency;
    }

    /**
     * Getter for RequestedAmountFormatted.
     * Requested amount formatted for display.
     * @return Returns the Double
     */
    @JsonGetter("requested_amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getRequestedAmountFormatted() {
        return requestedAmountFormatted;
    }

    /**
     * Setter for RequestedAmountFormatted.
     * Requested amount formatted for display.
     * @param requestedAmountFormatted Value for Double
     */
    @JsonSetter("requested_amount_formatted")
    public void setRequestedAmountFormatted(Double requestedAmountFormatted) {
        this.requestedAmountFormatted = requestedAmountFormatted;
    }

    /**
     * Internal Getter for ChargedAmount.
     * Charged amount in the smallest currency unit.
     * @return Returns the Internal Integer
     */
    @JsonGetter("charged_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetChargedAmount() {
        return this.chargedAmount;
    }

    /**
     * Getter for ChargedAmount.
     * Charged amount in the smallest currency unit.
     * @return Returns the Integer
     */
    public Integer getChargedAmount() {
        return OptionalNullable.getFrom(chargedAmount);
    }

    /**
     * Setter for ChargedAmount.
     * Charged amount in the smallest currency unit.
     * @param chargedAmount Value for Integer
     */
    @JsonSetter("charged_amount")
    public void setChargedAmount(Integer chargedAmount) {
        this.chargedAmount = OptionalNullable.of(chargedAmount);
    }

    /**
     * UnSetter for ChargedAmount.
     * Charged amount in the smallest currency unit.
     */
    public void unsetChargedAmount() {
        chargedAmount = null;
    }

    /**
     * Internal Getter for ChargedCurrency.
     * Charged ISO-4217 currency code.
     * @return Returns the Internal String
     */
    @JsonGetter("charged_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetChargedCurrency() {
        return this.chargedCurrency;
    }

    /**
     * Getter for ChargedCurrency.
     * Charged ISO-4217 currency code.
     * @return Returns the String
     */
    public String getChargedCurrency() {
        return OptionalNullable.getFrom(chargedCurrency);
    }

    /**
     * Setter for ChargedCurrency.
     * Charged ISO-4217 currency code.
     * @param chargedCurrency Value for String
     */
    @JsonSetter("charged_currency")
    public void setChargedCurrency(String chargedCurrency) {
        this.chargedCurrency = OptionalNullable.of(chargedCurrency);
    }

    /**
     * UnSetter for ChargedCurrency.
     * Charged ISO-4217 currency code.
     */
    public void unsetChargedCurrency() {
        chargedCurrency = null;
    }

    /**
     * Internal Getter for ChargedAmountFormatted.
     * Charged amount formatted for display.
     * @return Returns the Internal Double
     */
    @JsonGetter("charged_amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetChargedAmountFormatted() {
        return this.chargedAmountFormatted;
    }

    /**
     * Getter for ChargedAmountFormatted.
     * Charged amount formatted for display.
     * @return Returns the Double
     */
    public Double getChargedAmountFormatted() {
        return OptionalNullable.getFrom(chargedAmountFormatted);
    }

    /**
     * Setter for ChargedAmountFormatted.
     * Charged amount formatted for display.
     * @param chargedAmountFormatted Value for Double
     */
    @JsonSetter("charged_amount_formatted")
    public void setChargedAmountFormatted(Double chargedAmountFormatted) {
        this.chargedAmountFormatted = OptionalNullable.of(chargedAmountFormatted);
    }

    /**
     * UnSetter for ChargedAmountFormatted.
     * Charged amount formatted for display.
     */
    public void unsetChargedAmountFormatted() {
        chargedAmountFormatted = null;
    }

    /**
     * Internal Getter for FeeAmount.
     * Fee amount in the smallest currency unit.
     * @return Returns the Internal Integer
     */
    @JsonGetter("fee_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetFeeAmount() {
        return this.feeAmount;
    }

    /**
     * Getter for FeeAmount.
     * Fee amount in the smallest currency unit.
     * @return Returns the Integer
     */
    public Integer getFeeAmount() {
        return OptionalNullable.getFrom(feeAmount);
    }

    /**
     * Setter for FeeAmount.
     * Fee amount in the smallest currency unit.
     * @param feeAmount Value for Integer
     */
    @JsonSetter("fee_amount")
    public void setFeeAmount(Integer feeAmount) {
        this.feeAmount = OptionalNullable.of(feeAmount);
    }

    /**
     * UnSetter for FeeAmount.
     * Fee amount in the smallest currency unit.
     */
    public void unsetFeeAmount() {
        feeAmount = null;
    }

    /**
     * Internal Getter for FeeCurrency.
     * Fee ISO-4217 currency code.
     * @return Returns the Internal String
     */
    @JsonGetter("fee_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFeeCurrency() {
        return this.feeCurrency;
    }

    /**
     * Getter for FeeCurrency.
     * Fee ISO-4217 currency code.
     * @return Returns the String
     */
    public String getFeeCurrency() {
        return OptionalNullable.getFrom(feeCurrency);
    }

    /**
     * Setter for FeeCurrency.
     * Fee ISO-4217 currency code.
     * @param feeCurrency Value for String
     */
    @JsonSetter("fee_currency")
    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = OptionalNullable.of(feeCurrency);
    }

    /**
     * UnSetter for FeeCurrency.
     * Fee ISO-4217 currency code.
     */
    public void unsetFeeCurrency() {
        feeCurrency = null;
    }

    /**
     * Internal Getter for FeeAmountFormatted.
     * Fee amount formatted for display.
     * @return Returns the Internal Double
     */
    @JsonGetter("fee_amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetFeeAmountFormatted() {
        return this.feeAmountFormatted;
    }

    /**
     * Getter for FeeAmountFormatted.
     * Fee amount formatted for display.
     * @return Returns the Double
     */
    public Double getFeeAmountFormatted() {
        return OptionalNullable.getFrom(feeAmountFormatted);
    }

    /**
     * Setter for FeeAmountFormatted.
     * Fee amount formatted for display.
     * @param feeAmountFormatted Value for Double
     */
    @JsonSetter("fee_amount_formatted")
    public void setFeeAmountFormatted(Double feeAmountFormatted) {
        this.feeAmountFormatted = OptionalNullable.of(feeAmountFormatted);
    }

    /**
     * UnSetter for FeeAmountFormatted.
     * Fee amount formatted for display.
     */
    public void unsetFeeAmountFormatted() {
        feeAmountFormatted = null;
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
     * Internal Getter for CaptureAt.
     * Timestamp when capture should occur.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("capture_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetCaptureAt() {
        return this.captureAt;
    }

    /**
     * Getter for CaptureAt.
     * Timestamp when capture should occur.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getCaptureAt() {
        return OptionalNullable.getFrom(captureAt);
    }

    /**
     * Setter for CaptureAt.
     * Timestamp when capture should occur.
     * @param captureAt Value for LocalDateTime
     */
    @JsonSetter("capture_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCaptureAt(LocalDateTime captureAt) {
        this.captureAt = OptionalNullable.of(captureAt);
    }

    /**
     * UnSetter for CaptureAt.
     * Timestamp when capture should occur.
     */
    public void unsetCaptureAt() {
        captureAt = null;
    }

    /**
     * Internal Getter for Descriptor.
     * Billing descriptor.
     * @return Returns the Internal String
     */
    @JsonGetter("descriptor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescriptor() {
        return this.descriptor;
    }

    /**
     * Getter for Descriptor.
     * Billing descriptor.
     * @return Returns the String
     */
    public String getDescriptor() {
        return OptionalNullable.getFrom(descriptor);
    }

    /**
     * Setter for Descriptor.
     * Billing descriptor.
     * @param descriptor Value for String
     */
    @JsonSetter("descriptor")
    public void setDescriptor(String descriptor) {
        this.descriptor = OptionalNullable.of(descriptor);
    }

    /**
     * UnSetter for Descriptor.
     * Billing descriptor.
     */
    public void unsetDescriptor() {
        descriptor = null;
    }

    /**
     * Internal Getter for DescriptorPhoneNumber.
     * Billing descriptor phone number.
     * @return Returns the Internal String
     */
    @JsonGetter("descriptor_phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescriptorPhoneNumber() {
        return this.descriptorPhoneNumber;
    }

    /**
     * Getter for DescriptorPhoneNumber.
     * Billing descriptor phone number.
     * @return Returns the String
     */
    public String getDescriptorPhoneNumber() {
        return OptionalNullable.getFrom(descriptorPhoneNumber);
    }

    /**
     * Setter for DescriptorPhoneNumber.
     * Billing descriptor phone number.
     * @param descriptorPhoneNumber Value for String
     */
    @JsonSetter("descriptor_phone_number")
    public void setDescriptorPhoneNumber(String descriptorPhoneNumber) {
        this.descriptorPhoneNumber = OptionalNullable.of(descriptorPhoneNumber);
    }

    /**
     * UnSetter for DescriptorPhoneNumber.
     * Billing descriptor phone number.
     */
    public void unsetDescriptorPhoneNumber() {
        descriptorPhoneNumber = null;
    }

    /**
     * Getter for Status.
     * Charge Status schema.
     * @return Returns the ChargeStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Charge Status schema.
     * @param status Value for ChargeStatus
     */
    @JsonSetter("status")
    public void setStatus(ChargeStatus status) {
        this.status = status;
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
     * Getter for Redirect.
     * Charge Redirect schema.
     * @return Returns the ChargeRedirect
     */
    @JsonGetter("redirect")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeRedirect getRedirect() {
        return redirect;
    }

    /**
     * Setter for Redirect.
     * Charge Redirect schema.
     * @param redirect Value for ChargeRedirect
     */
    @JsonSetter("redirect")
    public void setRedirect(ChargeRedirect redirect) {
        this.redirect = redirect;
    }

    /**
     * Getter for ThreeDs.
     * Charge Three Ds schema.
     * @return Returns the ChargeThreeDs
     */
    @JsonGetter("three_ds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeThreeDs getThreeDs() {
        return threeDs;
    }

    /**
     * Setter for ThreeDs.
     * Charge Three Ds schema.
     * @param threeDs Value for ChargeThreeDs
     */
    @JsonSetter("three_ds")
    public void setThreeDs(ChargeThreeDs threeDs) {
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
     * Converts this Charge into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Charge [" + "id=" + id + ", storeId=" + storeId + ", transactionTokenId="
                + transactionTokenId + ", transactionTokenType=" + transactionTokenType
                + ", subscriptionId=" + subscriptionId + ", merchantTransactionId="
                + merchantTransactionId + ", requestedAmount=" + requestedAmount
                + ", requestedCurrency=" + requestedCurrency + ", requestedAmountFormatted="
                + requestedAmountFormatted + ", chargedAmount=" + chargedAmount
                + ", chargedCurrency=" + chargedCurrency + ", chargedAmountFormatted="
                + chargedAmountFormatted + ", feeAmount=" + feeAmount + ", feeCurrency="
                + feeCurrency + ", feeAmountFormatted=" + feeAmountFormatted
                + ", onlyDirectCurrency=" + onlyDirectCurrency + ", captureAt=" + captureAt
                + ", descriptor=" + descriptor + ", descriptorPhoneNumber=" + descriptorPhoneNumber
                + ", status=" + status + ", error=" + error + ", metadata=" + metadata + ", mode="
                + mode + ", createdOn=" + createdOn + ", merchantName=" + merchantName
                + ", storeName=" + storeName + ", redirect=" + redirect + ", threeDs=" + threeDs
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link Charge.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Charge.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .storeId(getStoreId())
                .transactionTokenId(getTransactionTokenId())
                .transactionTokenType(getTransactionTokenType())
                .requestedAmount(getRequestedAmount())
                .requestedCurrency(getRequestedCurrency())
                .requestedAmountFormatted(getRequestedAmountFormatted())
                .onlyDirectCurrency(getOnlyDirectCurrency())
                .status(getStatus())
                .metadata(getMetadata())
                .mode(getMode())
                .createdOn(getCreatedOn())
                .merchantName(getMerchantName())
                .storeName(getStoreName())
                .redirect(getRedirect())
                .threeDs(getThreeDs());
        builder.subscriptionId = internalGetSubscriptionId();
        builder.merchantTransactionId = internalGetMerchantTransactionId();
        builder.chargedAmount = internalGetChargedAmount();
        builder.chargedCurrency = internalGetChargedCurrency();
        builder.chargedAmountFormatted = internalGetChargedAmountFormatted();
        builder.feeAmount = internalGetFeeAmount();
        builder.feeCurrency = internalGetFeeCurrency();
        builder.feeAmountFormatted = internalGetFeeAmountFormatted();
        builder.captureAt = internalGetCaptureAt();
        builder.descriptor = internalGetDescriptor();
        builder.descriptorPhoneNumber = internalGetDescriptorPhoneNumber();
        builder.error = internalGetError();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link Charge}.
     */
    public static class Builder {
        private UUID id;
        private UUID storeId;
        private UUID transactionTokenId;
        private ChargeTransactionTokenType transactionTokenType;
        private OptionalNullable<UUID> subscriptionId;
        private OptionalNullable<String> merchantTransactionId;
        private Integer requestedAmount;
        private String requestedCurrency;
        private Double requestedAmountFormatted;
        private OptionalNullable<Integer> chargedAmount;
        private OptionalNullable<String> chargedCurrency;
        private OptionalNullable<Double> chargedAmountFormatted;
        private OptionalNullable<Integer> feeAmount;
        private OptionalNullable<String> feeCurrency;
        private OptionalNullable<Double> feeAmountFormatted;
        private Boolean onlyDirectCurrency;
        private OptionalNullable<LocalDateTime> captureAt;
        private OptionalNullable<String> descriptor;
        private OptionalNullable<String> descriptorPhoneNumber;
        private ChargeStatus status;
        private OptionalNullable<PaymentError> error;
        private GenericMetadata metadata;
        private ChargeMode mode;
        private LocalDateTime createdOn;
        private String merchantName;
        private String storeName;
        private ChargeRedirect redirect;
        private ChargeThreeDs threeDs;
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
         * Setter for transactionTokenType.
         * @param  transactionTokenType  ChargeTransactionTokenType value for transactionTokenType.
         * @return Builder
         */
        public Builder transactionTokenType(ChargeTransactionTokenType transactionTokenType) {
            this.transactionTokenType = transactionTokenType;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  UUID value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(UUID subscriptionId) {
            this.subscriptionId = OptionalNullable.of(subscriptionId);
            return this;
        }

        /**
         * UnSetter for subscriptionId.
         * @return Builder
         */
        public Builder unsetSubscriptionId() {
            subscriptionId = null;
            return this;
        }

        /**
         * Setter for merchantTransactionId.
         * @param  merchantTransactionId  String value for merchantTransactionId.
         * @return Builder
         */
        public Builder merchantTransactionId(String merchantTransactionId) {
            this.merchantTransactionId = OptionalNullable.of(merchantTransactionId);
            return this;
        }

        /**
         * UnSetter for merchantTransactionId.
         * @return Builder
         */
        public Builder unsetMerchantTransactionId() {
            merchantTransactionId = null;
            return this;
        }

        /**
         * Setter for requestedAmount.
         * @param  requestedAmount  Integer value for requestedAmount.
         * @return Builder
         */
        public Builder requestedAmount(Integer requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        /**
         * Setter for requestedCurrency.
         * @param  requestedCurrency  String value for requestedCurrency.
         * @return Builder
         */
        public Builder requestedCurrency(String requestedCurrency) {
            this.requestedCurrency = requestedCurrency;
            return this;
        }

        /**
         * Setter for requestedAmountFormatted.
         * @param  requestedAmountFormatted  Double value for requestedAmountFormatted.
         * @return Builder
         */
        public Builder requestedAmountFormatted(Double requestedAmountFormatted) {
            this.requestedAmountFormatted = requestedAmountFormatted;
            return this;
        }

        /**
         * Setter for chargedAmount.
         * @param  chargedAmount  Integer value for chargedAmount.
         * @return Builder
         */
        public Builder chargedAmount(Integer chargedAmount) {
            this.chargedAmount = OptionalNullable.of(chargedAmount);
            return this;
        }

        /**
         * UnSetter for chargedAmount.
         * @return Builder
         */
        public Builder unsetChargedAmount() {
            chargedAmount = null;
            return this;
        }

        /**
         * Setter for chargedCurrency.
         * @param  chargedCurrency  String value for chargedCurrency.
         * @return Builder
         */
        public Builder chargedCurrency(String chargedCurrency) {
            this.chargedCurrency = OptionalNullable.of(chargedCurrency);
            return this;
        }

        /**
         * UnSetter for chargedCurrency.
         * @return Builder
         */
        public Builder unsetChargedCurrency() {
            chargedCurrency = null;
            return this;
        }

        /**
         * Setter for chargedAmountFormatted.
         * @param  chargedAmountFormatted  Double value for chargedAmountFormatted.
         * @return Builder
         */
        public Builder chargedAmountFormatted(Double chargedAmountFormatted) {
            this.chargedAmountFormatted = OptionalNullable.of(chargedAmountFormatted);
            return this;
        }

        /**
         * UnSetter for chargedAmountFormatted.
         * @return Builder
         */
        public Builder unsetChargedAmountFormatted() {
            chargedAmountFormatted = null;
            return this;
        }

        /**
         * Setter for feeAmount.
         * @param  feeAmount  Integer value for feeAmount.
         * @return Builder
         */
        public Builder feeAmount(Integer feeAmount) {
            this.feeAmount = OptionalNullable.of(feeAmount);
            return this;
        }

        /**
         * UnSetter for feeAmount.
         * @return Builder
         */
        public Builder unsetFeeAmount() {
            feeAmount = null;
            return this;
        }

        /**
         * Setter for feeCurrency.
         * @param  feeCurrency  String value for feeCurrency.
         * @return Builder
         */
        public Builder feeCurrency(String feeCurrency) {
            this.feeCurrency = OptionalNullable.of(feeCurrency);
            return this;
        }

        /**
         * UnSetter for feeCurrency.
         * @return Builder
         */
        public Builder unsetFeeCurrency() {
            feeCurrency = null;
            return this;
        }

        /**
         * Setter for feeAmountFormatted.
         * @param  feeAmountFormatted  Double value for feeAmountFormatted.
         * @return Builder
         */
        public Builder feeAmountFormatted(Double feeAmountFormatted) {
            this.feeAmountFormatted = OptionalNullable.of(feeAmountFormatted);
            return this;
        }

        /**
         * UnSetter for feeAmountFormatted.
         * @return Builder
         */
        public Builder unsetFeeAmountFormatted() {
            feeAmountFormatted = null;
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
         * Setter for captureAt.
         * @param  captureAt  LocalDateTime value for captureAt.
         * @return Builder
         */
        public Builder captureAt(LocalDateTime captureAt) {
            this.captureAt = OptionalNullable.of(captureAt);
            return this;
        }

        /**
         * UnSetter for captureAt.
         * @return Builder
         */
        public Builder unsetCaptureAt() {
            captureAt = null;
            return this;
        }

        /**
         * Setter for descriptor.
         * @param  descriptor  String value for descriptor.
         * @return Builder
         */
        public Builder descriptor(String descriptor) {
            this.descriptor = OptionalNullable.of(descriptor);
            return this;
        }

        /**
         * UnSetter for descriptor.
         * @return Builder
         */
        public Builder unsetDescriptor() {
            descriptor = null;
            return this;
        }

        /**
         * Setter for descriptorPhoneNumber.
         * @param  descriptorPhoneNumber  String value for descriptorPhoneNumber.
         * @return Builder
         */
        public Builder descriptorPhoneNumber(String descriptorPhoneNumber) {
            this.descriptorPhoneNumber = OptionalNullable.of(descriptorPhoneNumber);
            return this;
        }

        /**
         * UnSetter for descriptorPhoneNumber.
         * @return Builder
         */
        public Builder unsetDescriptorPhoneNumber() {
            descriptorPhoneNumber = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  ChargeStatus value for status.
         * @return Builder
         */
        public Builder status(ChargeStatus status) {
            this.status = status;
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
         * Setter for redirect.
         * @param  redirect  ChargeRedirect value for redirect.
         * @return Builder
         */
        public Builder redirect(ChargeRedirect redirect) {
            this.redirect = redirect;
            return this;
        }

        /**
         * Setter for threeDs.
         * @param  threeDs  ChargeThreeDs value for threeDs.
         * @return Builder
         */
        public Builder threeDs(ChargeThreeDs threeDs) {
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
         * Builds a new {@link Charge} object using the set fields.
         * @return {@link Charge}
         */
        public Charge build() {
            Charge model =
                    new Charge(id, storeId, transactionTokenId, transactionTokenType,
                            subscriptionId, merchantTransactionId, requestedAmount,
                            requestedCurrency, requestedAmountFormatted, chargedAmount,
                            chargedCurrency, chargedAmountFormatted, feeAmount, feeCurrency,
                            feeAmountFormatted, onlyDirectCurrency, captureAt, descriptor,
                            descriptorPhoneNumber, status, error, metadata, mode, createdOn,
                            merchantName, storeName, redirect, threeDs);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
