/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for DirectDebitBankAccountCreateRequest type.
 */
public class DirectDebitBankAccountCreateRequest {
    private String userNumber;
    private String bankCode;
    private String bankName;
    private String branchCode;
    private DirectDebitBankAccountType bankAccountType;
    private String bankAccountName;
    private String bankAccountNumber;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitBankAccountCreateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  userNumber  String value for userNumber.
     * @param  bankCode  String value for bankCode.
     * @param  bankName  String value for bankName.
     * @param  branchCode  String value for branchCode.
     * @param  bankAccountType  DirectDebitBankAccountType value for bankAccountType.
     * @param  bankAccountName  String value for bankAccountName.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     */
    public DirectDebitBankAccountCreateRequest(
            String userNumber,
            String bankCode,
            String bankName,
            String branchCode,
            DirectDebitBankAccountType bankAccountType,
            String bankAccountName,
            String bankAccountNumber) {
        this.userNumber = userNumber;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.bankAccountType = bankAccountType;
        this.bankAccountName = bankAccountName;
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * Getter for UserNumber.
     * The merchant's own membership number for the consumer (会員番号). Alphanumeric.
     * @return Returns the String
     */
    @JsonGetter("user_number")
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
     * Converts this DirectDebitBankAccountCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitBankAccountCreateRequest [" + "userNumber=" + userNumber + ", bankCode="
                + bankCode + ", bankName=" + bankName + ", branchCode=" + branchCode
                + ", bankAccountType=" + bankAccountType + ", bankAccountName=" + bankAccountName
                + ", bankAccountNumber=" + bankAccountNumber + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link DirectDebitBankAccountCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitBankAccountCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(userNumber, bankCode, bankName, branchCode, bankAccountType,
                bankAccountName, bankAccountNumber);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitBankAccountCreateRequest}.
     */
    public static class Builder {
        private String userNumber;
        private String bankCode;
        private String bankName;
        private String branchCode;
        private DirectDebitBankAccountType bankAccountType;
        private String bankAccountName;
        private String bankAccountNumber;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  userNumber  String value for userNumber.
         * @param  bankCode  String value for bankCode.
         * @param  bankName  String value for bankName.
         * @param  branchCode  String value for branchCode.
         * @param  bankAccountType  DirectDebitBankAccountType value for bankAccountType.
         * @param  bankAccountName  String value for bankAccountName.
         * @param  bankAccountNumber  String value for bankAccountNumber.
         */
        public Builder(String userNumber, String bankCode, String bankName, String branchCode,
                DirectDebitBankAccountType bankAccountType, String bankAccountName,
                String bankAccountNumber) {
            this.userNumber = userNumber;
            this.bankCode = bankCode;
            this.bankName = bankName;
            this.branchCode = branchCode;
            this.bankAccountType = bankAccountType;
            this.bankAccountName = bankAccountName;
            this.bankAccountNumber = bankAccountNumber;
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
         * Builds a new {@link DirectDebitBankAccountCreateRequest} object using the set fields.
         * @return {@link DirectDebitBankAccountCreateRequest}
         */
        public DirectDebitBankAccountCreateRequest build() {
            DirectDebitBankAccountCreateRequest model =
                    new DirectDebitBankAccountCreateRequest(userNumber, bankCode, bankName,
                            branchCode, bankAccountType, bankAccountName, bankAccountNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
