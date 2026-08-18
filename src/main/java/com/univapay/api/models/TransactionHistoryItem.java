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
 * This is a model class for TransactionHistoryItem type.
 */
public class TransactionHistoryItem {
    private UUID storeId;
    private UUID resourceId;
    private OptionalNullable<UUID> chargeId;
    private Integer amount;
    private String currency;
    private Double amountFormatted;
    private TransactionHistoryType type;
    private TransactionHistoryStatus status;
    private GenericMetadata metadata;
    private LocalDateTime createdOn;
    private TransactionHistoryMode mode;
    private String merchantName;
    private String storeName;
    private TransactionHistoryPaymentType paymentType;
    private TransactionHistoryUserData userData;
    private OptionalNullable<BankTransferPaymentStatus> bankTransferPaymentStatus;
    private OptionalNullable<LocalDateTime> bankTransferLatestDepositDate;
    private OptionalNullable<UUID> mcpTokenId;
    private OptionalNullable<TransactionHistoryChargeType> chargeType;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionHistoryItem() {
    }

    /**
     * Initialization constructor.
     * @param  storeId  UUID value for storeId.
     * @param  resourceId  UUID value for resourceId.
     * @param  chargeId  UUID value for chargeId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  type  TransactionHistoryType value for type.
     * @param  status  TransactionHistoryStatus value for status.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  mode  TransactionHistoryMode value for mode.
     * @param  merchantName  String value for merchantName.
     * @param  storeName  String value for storeName.
     * @param  paymentType  TransactionHistoryPaymentType value for paymentType.
     * @param  userData  TransactionHistoryUserData value for userData.
     * @param  bankTransferPaymentStatus  BankTransferPaymentStatus value for
     *         bankTransferPaymentStatus.
     * @param  bankTransferLatestDepositDate  LocalDateTime value for bankTransferLatestDepositDate.
     * @param  mcpTokenId  UUID value for mcpTokenId.
     * @param  chargeType  TransactionHistoryChargeType value for chargeType.
     */
    public TransactionHistoryItem(
            UUID storeId,
            UUID resourceId,
            UUID chargeId,
            Integer amount,
            String currency,
            Double amountFormatted,
            TransactionHistoryType type,
            TransactionHistoryStatus status,
            GenericMetadata metadata,
            LocalDateTime createdOn,
            TransactionHistoryMode mode,
            String merchantName,
            String storeName,
            TransactionHistoryPaymentType paymentType,
            TransactionHistoryUserData userData,
            BankTransferPaymentStatus bankTransferPaymentStatus,
            LocalDateTime bankTransferLatestDepositDate,
            UUID mcpTokenId,
            TransactionHistoryChargeType chargeType) {
        this.storeId = storeId;
        this.resourceId = resourceId;
        this.chargeId = OptionalNullable.of(chargeId);
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.type = type;
        this.status = status;
        this.metadata = metadata;
        this.createdOn = createdOn;
        this.mode = mode;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.paymentType = paymentType;
        this.userData = userData;
        this.bankTransferPaymentStatus = OptionalNullable.of(bankTransferPaymentStatus);
        this.bankTransferLatestDepositDate = OptionalNullable.of(bankTransferLatestDepositDate);
        this.mcpTokenId = OptionalNullable.of(mcpTokenId);
        this.chargeType = OptionalNullable.of(chargeType);
    }

    /**
     * Initialization constructor.
     * @param  storeId  UUID value for storeId.
     * @param  resourceId  UUID value for resourceId.
     * @param  chargeId  UUID value for chargeId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  type  TransactionHistoryType value for type.
     * @param  status  TransactionHistoryStatus value for status.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  mode  TransactionHistoryMode value for mode.
     * @param  merchantName  String value for merchantName.
     * @param  storeName  String value for storeName.
     * @param  paymentType  TransactionHistoryPaymentType value for paymentType.
     * @param  userData  TransactionHistoryUserData value for userData.
     * @param  bankTransferPaymentStatus  BankTransferPaymentStatus value for
     *         bankTransferPaymentStatus.
     * @param  bankTransferLatestDepositDate  LocalDateTime value for bankTransferLatestDepositDate.
     * @param  mcpTokenId  UUID value for mcpTokenId.
     * @param  chargeType  TransactionHistoryChargeType value for chargeType.
     */

    protected TransactionHistoryItem(UUID storeId, UUID resourceId, OptionalNullable<UUID> chargeId,
            Integer amount, String currency, Double amountFormatted, TransactionHistoryType type,
            TransactionHistoryStatus status, GenericMetadata metadata, LocalDateTime createdOn,
            TransactionHistoryMode mode, String merchantName, String storeName,
            TransactionHistoryPaymentType paymentType, TransactionHistoryUserData userData,
            OptionalNullable<BankTransferPaymentStatus> bankTransferPaymentStatus,
            OptionalNullable<LocalDateTime> bankTransferLatestDepositDate,
            OptionalNullable<UUID> mcpTokenId,
            OptionalNullable<TransactionHistoryChargeType> chargeType) {
        this.storeId = storeId;
        this.resourceId = resourceId;
        this.chargeId = chargeId;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.type = type;
        this.status = status;
        this.metadata = metadata;
        this.createdOn = createdOn;
        this.mode = mode;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.paymentType = paymentType;
        this.userData = userData;
        this.bankTransferPaymentStatus = bankTransferPaymentStatus;
        this.bankTransferLatestDepositDate = bankTransferLatestDepositDate;
        this.mcpTokenId = mcpTokenId;
        this.chargeType = chargeType;
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
     * Getter for ResourceId.
     * ID of the underlying resource — a charge ID for charge rows, a refund ID for refund rows.
     * @return Returns the UUID
     */
    @JsonGetter("resource_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getResourceId() {
        return resourceId;
    }

    /**
     * Setter for ResourceId.
     * ID of the underlying resource — a charge ID for charge rows, a refund ID for refund rows.
     * @param resourceId Value for UUID
     */
    @JsonSetter("resource_id")
    public void setResourceId(UUID resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Internal Getter for ChargeId.
     * ID of the originating charge. `null` for charge rows; set for refund rows.
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
     * ID of the originating charge. `null` for charge rows; set for refund rows.
     * @return Returns the UUID
     */
    public UUID getChargeId() {
        return OptionalNullable.getFrom(chargeId);
    }

    /**
     * Setter for ChargeId.
     * ID of the originating charge. `null` for charge rows; set for refund rows.
     * @param chargeId Value for UUID
     */
    @JsonSetter("charge_id")
    public void setChargeId(UUID chargeId) {
        this.chargeId = OptionalNullable.of(chargeId);
    }

    /**
     * UnSetter for ChargeId.
     * ID of the originating charge. `null` for charge rows; set for refund rows.
     */
    public void unsetChargeId() {
        chargeId = null;
    }

    /**
     * Getter for Amount.
     * Amount, in the currency's minor unit.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount, in the currency's minor unit.
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
     * Amount, formatted per the currency's display scale.
     * @return Returns the Double
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * Amount, formatted per the currency's display scale.
     * @param amountFormatted Value for Double
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(Double amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    /**
     * Getter for Type.
     * Whether this row represents a charge or a refund.
     * @return Returns the TransactionHistoryType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionHistoryType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Whether this row represents a charge or a refund.
     * @param type Value for TransactionHistoryType
     */
    @JsonSetter("type")
    public void setType(TransactionHistoryType type) {
        this.type = type;
    }

    /**
     * Getter for Status.
     * Status of the underlying resource. Charge rows use the full set of values; refund rows only
     * ever report `pending`, `successful`, `failed`, or `error`.
     * @return Returns the TransactionHistoryStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionHistoryStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of the underlying resource. Charge rows use the full set of values; refund rows only
     * ever report `pending`, `successful`, `failed`, or `error`.
     * @param status Value for TransactionHistoryStatus
     */
    @JsonSetter("status")
    public void setStatus(TransactionHistoryStatus status) {
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
     * Getter for CreatedOn.
     * Timestamp when the underlying resource was created.
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
     * Timestamp when the underlying resource was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for Mode.
     * Environment mode: `live` and `test` reflect the credential used to authenticate, while
     * `live_test` is reserved for privileged callers testing against live-mode data.
     * @return Returns the TransactionHistoryMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionHistoryMode getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Environment mode: `live` and `test` reflect the credential used to authenticate, while
     * `live_test` is reserved for privileged callers testing against live-mode data.
     * @param mode Value for TransactionHistoryMode
     */
    @JsonSetter("mode")
    public void setMode(TransactionHistoryMode mode) {
        this.mode = mode;
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
     * The payment method used for the underlying charge.
     * @return Returns the TransactionHistoryPaymentType
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionHistoryPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * The payment method used for the underlying charge.
     * @param paymentType Value for TransactionHistoryPaymentType
     */
    @JsonSetter("payment_type")
    public void setPaymentType(TransactionHistoryPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for UserData.
     * Payment-type-specific details for this row. This is a single flat object covering every
     * payment type — the fields actually populated depend on `payment_type` (documented per field
     * below). Fields not applicable to a given payment type are omitted.
     * @return Returns the TransactionHistoryUserData
     */
    @JsonGetter("user_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionHistoryUserData getUserData() {
        return userData;
    }

    /**
     * Setter for UserData.
     * Payment-type-specific details for this row. This is a single flat object covering every
     * payment type — the fields actually populated depend on `payment_type` (documented per field
     * below). Fields not applicable to a given payment type are omitted.
     * @param userData Value for TransactionHistoryUserData
     */
    @JsonSetter("user_data")
    public void setUserData(TransactionHistoryUserData userData) {
        this.userData = userData;
    }

    /**
     * Internal Getter for BankTransferPaymentStatus.
     * Bank transfer payment status, or `null` when not applicable.
     * @return Returns the Internal BankTransferPaymentStatus
     */
    @JsonGetter("bank_transfer_payment_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<BankTransferPaymentStatus> internalGetBankTransferPaymentStatus() {
        return this.bankTransferPaymentStatus;
    }

    /**
     * Getter for BankTransferPaymentStatus.
     * Bank transfer payment status, or `null` when not applicable.
     * @return Returns the BankTransferPaymentStatus
     */
    public BankTransferPaymentStatus getBankTransferPaymentStatus() {
        return OptionalNullable.getFrom(bankTransferPaymentStatus);
    }

    /**
     * Setter for BankTransferPaymentStatus.
     * Bank transfer payment status, or `null` when not applicable.
     * @param bankTransferPaymentStatus Value for BankTransferPaymentStatus
     */
    @JsonSetter("bank_transfer_payment_status")
    public void setBankTransferPaymentStatus(BankTransferPaymentStatus bankTransferPaymentStatus) {
        this.bankTransferPaymentStatus = OptionalNullable.of(bankTransferPaymentStatus);
    }

    /**
     * UnSetter for BankTransferPaymentStatus.
     * Bank transfer payment status, or `null` when not applicable.
     */
    public void unsetBankTransferPaymentStatus() {
        bankTransferPaymentStatus = null;
    }

    /**
     * Internal Getter for BankTransferLatestDepositDate.
     * Timestamp of the most recent deposit matched against a bank transfer charge. `null` when not
     * applicable.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("bank_transfer_latest_deposit_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetBankTransferLatestDepositDate() {
        return this.bankTransferLatestDepositDate;
    }

    /**
     * Getter for BankTransferLatestDepositDate.
     * Timestamp of the most recent deposit matched against a bank transfer charge. `null` when not
     * applicable.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getBankTransferLatestDepositDate() {
        return OptionalNullable.getFrom(bankTransferLatestDepositDate);
    }

    /**
     * Setter for BankTransferLatestDepositDate.
     * Timestamp of the most recent deposit matched against a bank transfer charge. `null` when not
     * applicable.
     * @param bankTransferLatestDepositDate Value for LocalDateTime
     */
    @JsonSetter("bank_transfer_latest_deposit_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBankTransferLatestDepositDate(LocalDateTime bankTransferLatestDepositDate) {
        this.bankTransferLatestDepositDate = OptionalNullable.of(bankTransferLatestDepositDate);
    }

    /**
     * UnSetter for BankTransferLatestDepositDate.
     * Timestamp of the most recent deposit matched against a bank transfer charge. `null` when not
     * applicable.
     */
    public void unsetBankTransferLatestDepositDate() {
        bankTransferLatestDepositDate = null;
    }

    /**
     * Internal Getter for McpTokenId.
     * ID of the multi-currency-pricing token used, when applicable. `null` when not applicable.
     * @return Returns the Internal UUID
     */
    @JsonGetter("mcp_token_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetMcpTokenId() {
        return this.mcpTokenId;
    }

    /**
     * Getter for McpTokenId.
     * ID of the multi-currency-pricing token used, when applicable. `null` when not applicable.
     * @return Returns the UUID
     */
    public UUID getMcpTokenId() {
        return OptionalNullable.getFrom(mcpTokenId);
    }

    /**
     * Setter for McpTokenId.
     * ID of the multi-currency-pricing token used, when applicable. `null` when not applicable.
     * @param mcpTokenId Value for UUID
     */
    @JsonSetter("mcp_token_id")
    public void setMcpTokenId(UUID mcpTokenId) {
        this.mcpTokenId = OptionalNullable.of(mcpTokenId);
    }

    /**
     * UnSetter for McpTokenId.
     * ID of the multi-currency-pricing token used, when applicable. `null` when not applicable.
     */
    public void unsetMcpTokenId() {
        mcpTokenId = null;
    }

    /**
     * Internal Getter for ChargeType.
     * Charge type, or `null` when not applicable.
     * @return Returns the Internal TransactionHistoryChargeType
     */
    @JsonGetter("charge_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<TransactionHistoryChargeType> internalGetChargeType() {
        return this.chargeType;
    }

    /**
     * Getter for ChargeType.
     * Charge type, or `null` when not applicable.
     * @return Returns the TransactionHistoryChargeType
     */
    public TransactionHistoryChargeType getChargeType() {
        return OptionalNullable.getFrom(chargeType);
    }

    /**
     * Setter for ChargeType.
     * Charge type, or `null` when not applicable.
     * @param chargeType Value for TransactionHistoryChargeType
     */
    @JsonSetter("charge_type")
    public void setChargeType(TransactionHistoryChargeType chargeType) {
        this.chargeType = OptionalNullable.of(chargeType);
    }

    /**
     * UnSetter for ChargeType.
     * Charge type, or `null` when not applicable.
     */
    public void unsetChargeType() {
        chargeType = null;
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
     * Converts this TransactionHistoryItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionHistoryItem [" + "storeId=" + storeId + ", resourceId=" + resourceId
                + ", chargeId=" + chargeId + ", amount=" + amount + ", currency=" + currency
                + ", amountFormatted=" + amountFormatted + ", type=" + type + ", status=" + status
                + ", metadata=" + metadata + ", createdOn=" + createdOn + ", mode=" + mode
                + ", merchantName=" + merchantName + ", storeName=" + storeName + ", paymentType="
                + paymentType + ", userData=" + userData + ", bankTransferPaymentStatus="
                + bankTransferPaymentStatus + ", bankTransferLatestDepositDate="
                + bankTransferLatestDepositDate + ", mcpTokenId=" + mcpTokenId + ", chargeType="
                + chargeType + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionHistoryItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionHistoryItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .storeId(getStoreId())
                .resourceId(getResourceId())
                .amount(getAmount())
                .currency(getCurrency())
                .amountFormatted(getAmountFormatted())
                .type(getType())
                .status(getStatus())
                .metadata(getMetadata())
                .createdOn(getCreatedOn())
                .mode(getMode())
                .merchantName(getMerchantName())
                .storeName(getStoreName())
                .paymentType(getPaymentType())
                .userData(getUserData());
        builder.chargeId = internalGetChargeId();
        builder.bankTransferPaymentStatus = internalGetBankTransferPaymentStatus();
        builder.bankTransferLatestDepositDate = internalGetBankTransferLatestDepositDate();
        builder.mcpTokenId = internalGetMcpTokenId();
        builder.chargeType = internalGetChargeType();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionHistoryItem}.
     */
    public static class Builder {
        private UUID storeId;
        private UUID resourceId;
        private OptionalNullable<UUID> chargeId;
        private Integer amount;
        private String currency;
        private Double amountFormatted;
        private TransactionHistoryType type;
        private TransactionHistoryStatus status;
        private GenericMetadata metadata;
        private LocalDateTime createdOn;
        private TransactionHistoryMode mode;
        private String merchantName;
        private String storeName;
        private TransactionHistoryPaymentType paymentType;
        private TransactionHistoryUserData userData;
        private OptionalNullable<BankTransferPaymentStatus> bankTransferPaymentStatus;
        private OptionalNullable<LocalDateTime> bankTransferLatestDepositDate;
        private OptionalNullable<UUID> mcpTokenId;
        private OptionalNullable<TransactionHistoryChargeType> chargeType;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for resourceId.
         * @param  resourceId  UUID value for resourceId.
         * @return Builder
         */
        public Builder resourceId(UUID resourceId) {
            this.resourceId = resourceId;
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
         * Setter for type.
         * @param  type  TransactionHistoryType value for type.
         * @return Builder
         */
        public Builder type(TransactionHistoryType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  TransactionHistoryStatus value for status.
         * @return Builder
         */
        public Builder status(TransactionHistoryStatus status) {
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
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for mode.
         * @param  mode  TransactionHistoryMode value for mode.
         * @return Builder
         */
        public Builder mode(TransactionHistoryMode mode) {
            this.mode = mode;
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
         * @param  paymentType  TransactionHistoryPaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(TransactionHistoryPaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for userData.
         * @param  userData  TransactionHistoryUserData value for userData.
         * @return Builder
         */
        public Builder userData(TransactionHistoryUserData userData) {
            this.userData = userData;
            return this;
        }

        /**
         * Setter for bankTransferPaymentStatus.
         * @param  bankTransferPaymentStatus  BankTransferPaymentStatus value for
         *         bankTransferPaymentStatus.
         * @return Builder
         */
        public Builder bankTransferPaymentStatus(
                BankTransferPaymentStatus bankTransferPaymentStatus) {
            this.bankTransferPaymentStatus = OptionalNullable.of(bankTransferPaymentStatus);
            return this;
        }

        /**
         * UnSetter for bankTransferPaymentStatus.
         * @return Builder
         */
        public Builder unsetBankTransferPaymentStatus() {
            bankTransferPaymentStatus = null;
            return this;
        }

        /**
         * Setter for bankTransferLatestDepositDate.
         * @param  bankTransferLatestDepositDate  LocalDateTime value for
         *         bankTransferLatestDepositDate.
         * @return Builder
         */
        public Builder bankTransferLatestDepositDate(
                LocalDateTime bankTransferLatestDepositDate) {
            this.bankTransferLatestDepositDate = OptionalNullable.of(bankTransferLatestDepositDate);
            return this;
        }

        /**
         * UnSetter for bankTransferLatestDepositDate.
         * @return Builder
         */
        public Builder unsetBankTransferLatestDepositDate() {
            bankTransferLatestDepositDate = null;
            return this;
        }

        /**
         * Setter for mcpTokenId.
         * @param  mcpTokenId  UUID value for mcpTokenId.
         * @return Builder
         */
        public Builder mcpTokenId(UUID mcpTokenId) {
            this.mcpTokenId = OptionalNullable.of(mcpTokenId);
            return this;
        }

        /**
         * UnSetter for mcpTokenId.
         * @return Builder
         */
        public Builder unsetMcpTokenId() {
            mcpTokenId = null;
            return this;
        }

        /**
         * Setter for chargeType.
         * @param  chargeType  TransactionHistoryChargeType value for chargeType.
         * @return Builder
         */
        public Builder chargeType(TransactionHistoryChargeType chargeType) {
            this.chargeType = OptionalNullable.of(chargeType);
            return this;
        }

        /**
         * UnSetter for chargeType.
         * @return Builder
         */
        public Builder unsetChargeType() {
            chargeType = null;
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
         * Builds a new {@link TransactionHistoryItem} object using the set fields.
         * @return {@link TransactionHistoryItem}
         */
        public TransactionHistoryItem build() {
            TransactionHistoryItem model =
                    new TransactionHistoryItem(storeId, resourceId, chargeId, amount, currency,
                            amountFormatted, type, status, metadata, createdOn, mode, merchantName,
                            storeName, paymentType, userData, bankTransferPaymentStatus,
                            bankTransferLatestDepositDate, mcpTokenId, chargeType);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
