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
 * This is a model class for DirectDebitBankTransfer type.
 */
public class DirectDebitBankTransfer {
    private String id;
    private String legacyStoreId;
    private UUID merchantId;
    private String bankAccountId;
    private String userNumber;
    private String bankCode;
    private String bankName;
    private String branchCode;
    private DirectDebitBankAccountType bankAccountType;
    private String bankAccountName;
    private String bankAccountNumber;
    private Long amount;
    private DirectDebitDebitDate debitDate;
    private LocalDate calculatedDebitDate;
    private DirectDebitBankTransferLock lock;
    private DirectDebitBankTransferStatus status;
    private OptionalNullable<DirectDebitBankTransferError> error;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitBankTransfer() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  legacyStoreId  String value for legacyStoreId.
     * @param  merchantId  UUID value for merchantId.
     * @param  bankAccountId  String value for bankAccountId.
     * @param  userNumber  String value for userNumber.
     * @param  bankCode  String value for bankCode.
     * @param  bankName  String value for bankName.
     * @param  branchCode  String value for branchCode.
     * @param  bankAccountType  DirectDebitBankAccountType value for bankAccountType.
     * @param  bankAccountName  String value for bankAccountName.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     * @param  amount  Long value for amount.
     * @param  debitDate  DirectDebitDebitDate value for debitDate.
     * @param  calculatedDebitDate  LocalDate value for calculatedDebitDate.
     * @param  lock  DirectDebitBankTransferLock value for lock.
     * @param  status  DirectDebitBankTransferStatus value for status.
     * @param  error  DirectDebitBankTransferError value for error.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */
    public DirectDebitBankTransfer(
            String id,
            String legacyStoreId,
            UUID merchantId,
            String bankAccountId,
            String userNumber,
            String bankCode,
            String bankName,
            String branchCode,
            DirectDebitBankAccountType bankAccountType,
            String bankAccountName,
            String bankAccountNumber,
            Long amount,
            DirectDebitDebitDate debitDate,
            LocalDate calculatedDebitDate,
            DirectDebitBankTransferLock lock,
            DirectDebitBankTransferStatus status,
            DirectDebitBankTransferError error,
            LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.legacyStoreId = legacyStoreId;
        this.merchantId = merchantId;
        this.bankAccountId = bankAccountId;
        this.userNumber = userNumber;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.bankAccountType = bankAccountType;
        this.bankAccountName = bankAccountName;
        this.bankAccountNumber = bankAccountNumber;
        this.amount = amount;
        this.debitDate = debitDate;
        this.calculatedDebitDate = calculatedDebitDate;
        this.lock = lock;
        this.status = status;
        this.error = OptionalNullable.of(error);
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  legacyStoreId  String value for legacyStoreId.
     * @param  merchantId  UUID value for merchantId.
     * @param  bankAccountId  String value for bankAccountId.
     * @param  userNumber  String value for userNumber.
     * @param  bankCode  String value for bankCode.
     * @param  bankName  String value for bankName.
     * @param  branchCode  String value for branchCode.
     * @param  bankAccountType  DirectDebitBankAccountType value for bankAccountType.
     * @param  bankAccountName  String value for bankAccountName.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     * @param  amount  Long value for amount.
     * @param  debitDate  DirectDebitDebitDate value for debitDate.
     * @param  calculatedDebitDate  LocalDate value for calculatedDebitDate.
     * @param  lock  DirectDebitBankTransferLock value for lock.
     * @param  status  DirectDebitBankTransferStatus value for status.
     * @param  error  DirectDebitBankTransferError value for error.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */

    protected DirectDebitBankTransfer(String id, String legacyStoreId, UUID merchantId,
            String bankAccountId, String userNumber, String bankCode, String bankName,
            String branchCode, DirectDebitBankAccountType bankAccountType, String bankAccountName,
            String bankAccountNumber, Long amount, DirectDebitDebitDate debitDate,
            LocalDate calculatedDebitDate, DirectDebitBankTransferLock lock,
            DirectDebitBankTransferStatus status,
            OptionalNullable<DirectDebitBankTransferError> error, LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.legacyStoreId = legacyStoreId;
        this.merchantId = merchantId;
        this.bankAccountId = bankAccountId;
        this.userNumber = userNumber;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.bankAccountType = bankAccountType;
        this.bankAccountName = bankAccountName;
        this.bankAccountNumber = bankAccountNumber;
        this.amount = amount;
        this.debitDate = debitDate;
        this.calculatedDebitDate = calculatedDebitDate;
        this.lock = lock;
        this.status = status;
        this.error = error;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for Id.
     * Unique identifier of a direct debit bank transfer (振替ID).
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier of a direct debit bank transfer (振替ID).
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for LegacyStoreId.
     * Identifier of the merchant in the legacy direct debit system.
     * @return Returns the String
     */
    @JsonGetter("legacy_store_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLegacyStoreId() {
        return legacyStoreId;
    }

    /**
     * Setter for LegacyStoreId.
     * Identifier of the merchant in the legacy direct debit system.
     * @param legacyStoreId Value for String
     */
    @JsonSetter("legacy_store_id")
    public void setLegacyStoreId(String legacyStoreId) {
        this.legacyStoreId = legacyStoreId;
    }

    /**
     * Getter for MerchantId.
     * The merchant that owns this transfer.
     * @return Returns the UUID
     */
    @JsonGetter("merchant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getMerchantId() {
        return merchantId;
    }

    /**
     * Setter for MerchantId.
     * The merchant that owns this transfer.
     * @param merchantId Value for UUID
     */
    @JsonSetter("merchant_id")
    public void setMerchantId(UUID merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * Getter for BankAccountId.
     * Unique identifier of a direct debit bank account (銀行口座ID).
     * @return Returns the String
     */
    @JsonGetter("bank_account_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Setter for BankAccountId.
     * Unique identifier of a direct debit bank account (銀行口座ID).
     * @param bankAccountId Value for String
     */
    @JsonSetter("bank_account_id")
    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    /**
     * Getter for UserNumber.
     * The merchant's own membership number for the consumer (会員番号). Alphanumeric.
     * @return Returns the String
     */
    @JsonGetter("user_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * Setter for UserNumber.
     * The merchant's own membership number for the consumer (会員番号). Alphanumeric.
     * @param userNumber Value for String
     */
    @JsonSetter("user_number")
    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    /**
     * Getter for BankCode.
     * Four-digit code identifying the consumer's bank (銀行コード).
     * @return Returns the String
     */
    @JsonGetter("bank_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Setter for BankCode.
     * Four-digit code identifying the consumer's bank (銀行コード).
     * @param bankCode Value for String
     */
    @JsonSetter("bank_code")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * Getter for BankName.
     * Bank name in half-width katakana (銀行名).
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * Bank name in half-width katakana (銀行名).
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for BranchCode.
     * Three-digit code identifying the bank branch (支店コード).
     * @return Returns the String
     */
    @JsonGetter("branch_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Setter for BranchCode.
     * Three-digit code identifying the bank branch (支店コード).
     * @param branchCode Value for String
     */
    @JsonSetter("branch_code")
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * Getter for BankAccountType.
     * Deposit account type (預金種類) — `regular` (普通), `current` (当座), `savings` (貯蓄) or `others`
     * (その他).
     * @return Returns the DirectDebitBankAccountType
     */
    @JsonGetter("bank_account_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DirectDebitBankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Setter for BankAccountType.
     * Deposit account type (預金種類) — `regular` (普通), `current` (当座), `savings` (貯蓄) or `others`
     * (その他).
     * @param bankAccountType Value for DirectDebitBankAccountType
     */
    @JsonSetter("bank_account_type")
    public void setBankAccountType(DirectDebitBankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    /**
     * Getter for BankAccountName.
     * Account holder name (口座名義), in half-width katakana. Full-width characters are rejected by the
     * bank.
     * @return Returns the String
     */
    @JsonGetter("bank_account_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Setter for BankAccountName.
     * Account holder name (口座名義), in half-width katakana. Full-width characters are rejected by the
     * bank.
     * @param bankAccountName Value for String
     */
    @JsonSetter("bank_account_name")
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    /**
     * Getter for BankAccountNumber.
     * Seven-digit account number (口座番号).
     * @return Returns the String
     */
    @JsonGetter("bank_account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Setter for BankAccountNumber.
     * Seven-digit account number (口座番号).
     * @param bankAccountNumber Value for String
     */
    @JsonSetter("bank_account_number")
    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * Getter for Amount.
     * Transfer amount in JPY. Must be a positive, non-zero whole number.
     * @return Returns the Long
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Transfer amount in JPY. Must be a positive, non-zero whole number.
     * @param amount Value for Long
     */
    @JsonSetter("amount")
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * Getter for DebitDate.
     * Monthly debit cycle — funds are pulled on either the 14th or the 27th.
     * @return Returns the DirectDebitDebitDate
     */
    @JsonGetter("debit_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DirectDebitDebitDate getDebitDate() {
        return debitDate;
    }

    /**
     * Setter for DebitDate.
     * Monthly debit cycle — funds are pulled on either the 14th or the 27th.
     * @param debitDate Value for DirectDebitDebitDate
     */
    @JsonSetter("debit_date")
    public void setDebitDate(DirectDebitDebitDate debitDate) {
        this.debitDate = debitDate;
    }

    /**
     * Getter for CalculatedDebitDate.
     * The actual business day on which funds are pulled (計算された振替日), derived from the debit cycle.
     * @return Returns the LocalDate
     */
    @JsonGetter("calculated_debit_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getCalculatedDebitDate() {
        return calculatedDebitDate;
    }

    /**
     * Setter for CalculatedDebitDate.
     * The actual business day on which funds are pulled (計算された振替日), derived from the debit cycle.
     * @param calculatedDebitDate Value for LocalDate
     */
    @JsonSetter("calculated_debit_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setCalculatedDebitDate(LocalDate calculatedDebitDate) {
        this.calculatedDebitDate = calculatedDebitDate;
    }

    /**
     * Getter for Lock.
     * Whether the transfer can still be edited. Transfers are `unlocked` until the upload deadline
     * for their debit cycle passes, after which they are `locked` and can no longer be changed or
     * deleted.
     * @return Returns the DirectDebitBankTransferLock
     */
    @JsonGetter("lock")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DirectDebitBankTransferLock getLock() {
        return lock;
    }

    /**
     * Setter for Lock.
     * Whether the transfer can still be edited. Transfers are `unlocked` until the upload deadline
     * for their debit cycle passes, after which they are `locked` and can no longer be changed or
     * deleted.
     * @param lock Value for DirectDebitBankTransferLock
     */
    @JsonSetter("lock")
    public void setLock(DirectDebitBankTransferLock lock) {
        this.lock = lock;
    }

    /**
     * Getter for Status.
     * Transfer state. `awaiting` until the bank reports back, then `successful` or `failed`.
     * Results are reflected days after the debit date, not immediately.
     * @return Returns the DirectDebitBankTransferStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DirectDebitBankTransferStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Transfer state. `awaiting` until the bank reports back, then `successful` or `failed`.
     * Results are reflected days after the debit date, not immediately.
     * @param status Value for DirectDebitBankTransferStatus
     */
    @JsonSetter("status")
    public void setStatus(DirectDebitBankTransferStatus status) {
        this.status = status;
    }

    /**
     * Internal Getter for Error.
     * Failure reason, or null while the transfer is awaiting a result or has succeeded.
     * @return Returns the Internal DirectDebitBankTransferError
     */
    @JsonGetter("error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<DirectDebitBankTransferError> internalGetError() {
        return this.error;
    }

    /**
     * Getter for Error.
     * Failure reason, or null while the transfer is awaiting a result or has succeeded.
     * @return Returns the DirectDebitBankTransferError
     */
    public DirectDebitBankTransferError getError() {
        return OptionalNullable.getFrom(error);
    }

    /**
     * Setter for Error.
     * Failure reason, or null while the transfer is awaiting a result or has succeeded.
     * @param error Value for DirectDebitBankTransferError
     */
    @JsonSetter("error")
    public void setError(DirectDebitBankTransferError error) {
        this.error = OptionalNullable.of(error);
    }

    /**
     * UnSetter for Error.
     * Failure reason, or null while the transfer is awaiting a result or has succeeded.
     */
    public void unsetError() {
        error = null;
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
     * Getter for UpdatedOn.
     * Timestamp when the resource was last updated.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Setter for UpdatedOn.
     * Timestamp when the resource was last updated.
     * @param updatedOn Value for LocalDateTime
     */
    @JsonSetter("updated_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
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
     * Converts this DirectDebitBankTransfer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitBankTransfer [" + "id=" + id + ", legacyStoreId=" + legacyStoreId
                + ", merchantId=" + merchantId + ", bankAccountId=" + bankAccountId
                + ", userNumber=" + userNumber + ", bankCode=" + bankCode + ", bankName=" + bankName
                + ", branchCode=" + branchCode + ", bankAccountType=" + bankAccountType
                + ", bankAccountName=" + bankAccountName + ", bankAccountNumber="
                + bankAccountNumber + ", amount=" + amount + ", debitDate=" + debitDate
                + ", calculatedDebitDate=" + calculatedDebitDate + ", lock=" + lock + ", status="
                + status + ", error=" + error + ", createdOn=" + createdOn + ", updatedOn="
                + updatedOn + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link DirectDebitBankTransfer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitBankTransfer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .legacyStoreId(getLegacyStoreId())
                .merchantId(getMerchantId())
                .bankAccountId(getBankAccountId())
                .userNumber(getUserNumber())
                .bankCode(getBankCode())
                .bankName(getBankName())
                .branchCode(getBranchCode())
                .bankAccountType(getBankAccountType())
                .bankAccountName(getBankAccountName())
                .bankAccountNumber(getBankAccountNumber())
                .amount(getAmount())
                .debitDate(getDebitDate())
                .calculatedDebitDate(getCalculatedDebitDate())
                .lock(getLock())
                .status(getStatus())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.error = internalGetError();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitBankTransfer}.
     */
    public static class Builder {
        private String id;
        private String legacyStoreId;
        private UUID merchantId;
        private String bankAccountId;
        private String userNumber;
        private String bankCode;
        private String bankName;
        private String branchCode;
        private DirectDebitBankAccountType bankAccountType;
        private String bankAccountName;
        private String bankAccountNumber;
        private Long amount;
        private DirectDebitDebitDate debitDate;
        private LocalDate calculatedDebitDate;
        private DirectDebitBankTransferLock lock;
        private DirectDebitBankTransferStatus status;
        private OptionalNullable<DirectDebitBankTransferError> error;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for legacyStoreId.
         * @param  legacyStoreId  String value for legacyStoreId.
         * @return Builder
         */
        public Builder legacyStoreId(String legacyStoreId) {
            this.legacyStoreId = legacyStoreId;
            return this;
        }

        /**
         * Setter for merchantId.
         * @param  merchantId  UUID value for merchantId.
         * @return Builder
         */
        public Builder merchantId(UUID merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        /**
         * Setter for bankAccountId.
         * @param  bankAccountId  String value for bankAccountId.
         * @return Builder
         */
        public Builder bankAccountId(String bankAccountId) {
            this.bankAccountId = bankAccountId;
            return this;
        }

        /**
         * Setter for userNumber.
         * @param  userNumber  String value for userNumber.
         * @return Builder
         */
        public Builder userNumber(String userNumber) {
            this.userNumber = userNumber;
            return this;
        }

        /**
         * Setter for bankCode.
         * @param  bankCode  String value for bankCode.
         * @return Builder
         */
        public Builder bankCode(String bankCode) {
            this.bankCode = bankCode;
            return this;
        }

        /**
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        /**
         * Setter for branchCode.
         * @param  branchCode  String value for branchCode.
         * @return Builder
         */
        public Builder branchCode(String branchCode) {
            this.branchCode = branchCode;
            return this;
        }

        /**
         * Setter for bankAccountType.
         * @param  bankAccountType  DirectDebitBankAccountType value for bankAccountType.
         * @return Builder
         */
        public Builder bankAccountType(DirectDebitBankAccountType bankAccountType) {
            this.bankAccountType = bankAccountType;
            return this;
        }

        /**
         * Setter for bankAccountName.
         * @param  bankAccountName  String value for bankAccountName.
         * @return Builder
         */
        public Builder bankAccountName(String bankAccountName) {
            this.bankAccountName = bankAccountName;
            return this;
        }

        /**
         * Setter for bankAccountNumber.
         * @param  bankAccountNumber  String value for bankAccountNumber.
         * @return Builder
         */
        public Builder bankAccountNumber(String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Long value for amount.
         * @return Builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for debitDate.
         * @param  debitDate  DirectDebitDebitDate value for debitDate.
         * @return Builder
         */
        public Builder debitDate(DirectDebitDebitDate debitDate) {
            this.debitDate = debitDate;
            return this;
        }

        /**
         * Setter for calculatedDebitDate.
         * @param  calculatedDebitDate  LocalDate value for calculatedDebitDate.
         * @return Builder
         */
        public Builder calculatedDebitDate(LocalDate calculatedDebitDate) {
            this.calculatedDebitDate = calculatedDebitDate;
            return this;
        }

        /**
         * Setter for lock.
         * @param  lock  DirectDebitBankTransferLock value for lock.
         * @return Builder
         */
        public Builder lock(DirectDebitBankTransferLock lock) {
            this.lock = lock;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  DirectDebitBankTransferStatus value for status.
         * @return Builder
         */
        public Builder status(DirectDebitBankTransferStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  DirectDebitBankTransferError value for error.
         * @return Builder
         */
        public Builder error(DirectDebitBankTransferError error) {
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
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for updatedOn.
         * @param  updatedOn  LocalDateTime value for updatedOn.
         * @return Builder
         */
        public Builder updatedOn(LocalDateTime updatedOn) {
            this.updatedOn = updatedOn;
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
         * Builds a new {@link DirectDebitBankTransfer} object using the set fields.
         * @return {@link DirectDebitBankTransfer}
         */
        public DirectDebitBankTransfer build() {
            DirectDebitBankTransfer model =
                    new DirectDebitBankTransfer(id, legacyStoreId, merchantId, bankAccountId,
                            userNumber, bankCode, bankName, branchCode, bankAccountType,
                            bankAccountName, bankAccountNumber, amount, debitDate,
                            calculatedDebitDate, lock, status, error, createdOn, updatedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
