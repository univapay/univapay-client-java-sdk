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
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for DirectDebitBankAccount type.
 */
public class DirectDebitBankAccount {
    private String id;
    private String legacyStoreId;
    private UUID merchantId;
    private String userNumber;
    private String bankCode;
    private String bankName;
    private String branchCode;
    private DirectDebitBankAccountType bankAccountType;
    private String bankAccountName;
    private String bankAccountNumber;
    private DirectDebitRegistrationOrigin registrationOrigin;
    private DirectDebitBankAccountStatus status;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitBankAccount() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  legacyStoreId  String value for legacyStoreId.
     * @param  merchantId  UUID value for merchantId.
     * @param  userNumber  String value for userNumber.
     * @param  bankCode  String value for bankCode.
     * @param  bankName  String value for bankName.
     * @param  branchCode  String value for branchCode.
     * @param  bankAccountType  DirectDebitBankAccountType value for bankAccountType.
     * @param  bankAccountName  String value for bankAccountName.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     * @param  registrationOrigin  DirectDebitRegistrationOrigin value for registrationOrigin.
     * @param  status  DirectDebitBankAccountStatus value for status.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */
    public DirectDebitBankAccount(
            String id,
            String legacyStoreId,
            UUID merchantId,
            String userNumber,
            String bankCode,
            String bankName,
            String branchCode,
            DirectDebitBankAccountType bankAccountType,
            String bankAccountName,
            String bankAccountNumber,
            DirectDebitRegistrationOrigin registrationOrigin,
            DirectDebitBankAccountStatus status,
            LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.legacyStoreId = legacyStoreId;
        this.merchantId = merchantId;
        this.userNumber = userNumber;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.bankAccountType = bankAccountType;
        this.bankAccountName = bankAccountName;
        this.bankAccountNumber = bankAccountNumber;
        this.registrationOrigin = registrationOrigin;
        this.status = status;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for Id.
     * Unique identifier of a direct debit bank account (銀行口座ID).
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier of a direct debit bank account (銀行口座ID).
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
     * The merchant that owns this bank account.
     * @return Returns the UUID
     */
    @JsonGetter("merchant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getMerchantId() {
        return merchantId;
    }

    /**
     * Setter for MerchantId.
     * The merchant that owns this bank account.
     * @param merchantId Value for UUID
     */
    @JsonSetter("merchant_id")
    public void setMerchantId(UUID merchantId) {
        this.merchantId = merchantId;
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
     * Getter for RegistrationOrigin.
     * Where the bank account was registered from — `merchant_console` for the merchant dashboard,
     * `anywhere` otherwise.
     * @return Returns the DirectDebitRegistrationOrigin
     */
    @JsonGetter("registration_origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DirectDebitRegistrationOrigin getRegistrationOrigin() {
        return registrationOrigin;
    }

    /**
     * Setter for RegistrationOrigin.
     * Where the bank account was registered from — `merchant_console` for the merchant dashboard,
     * `anywhere` otherwise.
     * @param registrationOrigin Value for DirectDebitRegistrationOrigin
     */
    @JsonSetter("registration_origin")
    public void setRegistrationOrigin(DirectDebitRegistrationOrigin registrationOrigin) {
        this.registrationOrigin = registrationOrigin;
    }

    /**
     * Getter for Status.
     * Bank account state (有効・無効・登録失敗). Only an `active` account can have transfers registered
     * against it. `registration_failed` means the bank rejected the account details.
     * @return Returns the DirectDebitBankAccountStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DirectDebitBankAccountStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Bank account state (有効・無効・登録失敗). Only an `active` account can have transfers registered
     * against it. `registration_failed` means the bank rejected the account details.
     * @param status Value for DirectDebitBankAccountStatus
     */
    @JsonSetter("status")
    public void setStatus(DirectDebitBankAccountStatus status) {
        this.status = status;
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
     * Converts this DirectDebitBankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitBankAccount [" + "id=" + id + ", legacyStoreId=" + legacyStoreId
                + ", merchantId=" + merchantId + ", userNumber=" + userNumber + ", bankCode="
                + bankCode + ", bankName=" + bankName + ", branchCode=" + branchCode
                + ", bankAccountType=" + bankAccountType + ", bankAccountName=" + bankAccountName
                + ", bankAccountNumber=" + bankAccountNumber + ", registrationOrigin="
                + registrationOrigin + ", status=" + status + ", createdOn=" + createdOn
                + ", updatedOn=" + updatedOn + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link DirectDebitBankAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitBankAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .legacyStoreId(getLegacyStoreId())
                .merchantId(getMerchantId())
                .userNumber(getUserNumber())
                .bankCode(getBankCode())
                .bankName(getBankName())
                .branchCode(getBranchCode())
                .bankAccountType(getBankAccountType())
                .bankAccountName(getBankAccountName())
                .bankAccountNumber(getBankAccountNumber())
                .registrationOrigin(getRegistrationOrigin())
                .status(getStatus())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitBankAccount}.
     */
    public static class Builder {
        private String id;
        private String legacyStoreId;
        private UUID merchantId;
        private String userNumber;
        private String bankCode;
        private String bankName;
        private String branchCode;
        private DirectDebitBankAccountType bankAccountType;
        private String bankAccountName;
        private String bankAccountNumber;
        private DirectDebitRegistrationOrigin registrationOrigin;
        private DirectDebitBankAccountStatus status;
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
         * Setter for registrationOrigin.
         * @param  registrationOrigin  DirectDebitRegistrationOrigin value for registrationOrigin.
         * @return Builder
         */
        public Builder registrationOrigin(DirectDebitRegistrationOrigin registrationOrigin) {
            this.registrationOrigin = registrationOrigin;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  DirectDebitBankAccountStatus value for status.
         * @return Builder
         */
        public Builder status(DirectDebitBankAccountStatus status) {
            this.status = status;
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
         * Builds a new {@link DirectDebitBankAccount} object using the set fields.
         * @return {@link DirectDebitBankAccount}
         */
        public DirectDebitBankAccount build() {
            DirectDebitBankAccount model =
                    new DirectDebitBankAccount(id, legacyStoreId, merchantId, userNumber, bankCode,
                            bankName, branchCode, bankAccountType, bankAccountName,
                            bankAccountNumber, registrationOrigin, status, createdOn, updatedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
