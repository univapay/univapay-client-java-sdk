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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TokenResponseBankTransferData type.
 */
public class TokenResponseBankTransferData {
    private String brand;
    private String expirationPeriod;
    private String expirationTimeShift;
    private OptionalNullable<String> bankCode;
    private OptionalNullable<String> bankName;
    private OptionalNullable<String> branchCode;
    private OptionalNullable<String> branchName;
    private OptionalNullable<String> accountNumber;
    private OptionalNullable<String> accountHolderName;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseBankTransferData() {
    }

    /**
     * Initialization constructor.
     * @param  brand  String value for brand.
     * @param  expirationPeriod  String value for expirationPeriod.
     * @param  expirationTimeShift  String value for expirationTimeShift.
     * @param  bankCode  String value for bankCode.
     * @param  bankName  String value for bankName.
     * @param  branchCode  String value for branchCode.
     * @param  branchName  String value for branchName.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountHolderName  String value for accountHolderName.
     */
    public TokenResponseBankTransferData(
            String brand,
            String expirationPeriod,
            String expirationTimeShift,
            String bankCode,
            String bankName,
            String branchCode,
            String branchName,
            String accountNumber,
            String accountHolderName) {
        this.brand = brand;
        this.expirationPeriod = expirationPeriod;
        this.expirationTimeShift = expirationTimeShift;
        this.bankCode = OptionalNullable.of(bankCode);
        this.bankName = OptionalNullable.of(bankName);
        this.branchCode = OptionalNullable.of(branchCode);
        this.branchName = OptionalNullable.of(branchName);
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.accountHolderName = OptionalNullable.of(accountHolderName);
    }

    /**
     * Initialization constructor.
     * @param  brand  String value for brand.
     * @param  expirationPeriod  String value for expirationPeriod.
     * @param  expirationTimeShift  String value for expirationTimeShift.
     * @param  bankCode  String value for bankCode.
     * @param  bankName  String value for bankName.
     * @param  branchCode  String value for branchCode.
     * @param  branchName  String value for branchName.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountHolderName  String value for accountHolderName.
     */

    protected TokenResponseBankTransferData(String brand, String expirationPeriod,
            String expirationTimeShift, OptionalNullable<String> bankCode,
            OptionalNullable<String> bankName, OptionalNullable<String> branchCode,
            OptionalNullable<String> branchName, OptionalNullable<String> accountNumber,
            OptionalNullable<String> accountHolderName) {
        this.brand = brand;
        this.expirationPeriod = expirationPeriod;
        this.expirationTimeShift = expirationTimeShift;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    /**
     * Getter for Brand.
     * The bank brand identifier (e.g., 'aozora_bank').
     * @return Returns the String
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * The bank brand identifier (e.g., 'aozora_bank').
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for ExpirationPeriod.
     * ISO 8601 duration format (e.g., 'PT168H').
     * @return Returns the String
     */
    @JsonGetter("expiration_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Setter for ExpirationPeriod.
     * ISO 8601 duration format (e.g., 'PT168H').
     * @param expirationPeriod Value for String
     */
    @JsonSetter("expiration_period")
    public void setExpirationPeriod(String expirationPeriod) {
        this.expirationPeriod = expirationPeriod;
    }

    /**
     * Getter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59+09:00').
     * @return Returns the String
     */
    @JsonGetter("expiration_time_shift")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationTimeShift() {
        return expirationTimeShift;
    }

    /**
     * Setter for ExpirationTimeShift.
     * Time shift applied to the expiration, typically pushing it to the end of the day in a
     * specific timezone (e.g., '23:59:59+09:00').
     * @param expirationTimeShift Value for String
     */
    @JsonSetter("expiration_time_shift")
    public void setExpirationTimeShift(String expirationTimeShift) {
        this.expirationTimeShift = expirationTimeShift;
    }

    /**
     * Internal Getter for BankCode.
     * Bank code value.
     * @return Returns the Internal String
     */
    @JsonGetter("bank_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBankCode() {
        return this.bankCode;
    }

    /**
     * Getter for BankCode.
     * Bank code value.
     * @return Returns the String
     */
    public String getBankCode() {
        return OptionalNullable.getFrom(bankCode);
    }

    /**
     * Setter for BankCode.
     * Bank code value.
     * @param bankCode Value for String
     */
    @JsonSetter("bank_code")
    public void setBankCode(String bankCode) {
        this.bankCode = OptionalNullable.of(bankCode);
    }

    /**
     * UnSetter for BankCode.
     * Bank code value.
     */
    public void unsetBankCode() {
        bankCode = null;
    }

    /**
     * Internal Getter for BankName.
     * Bank name value.
     * @return Returns the Internal String
     */
    @JsonGetter("bank_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBankName() {
        return this.bankName;
    }

    /**
     * Getter for BankName.
     * Bank name value.
     * @return Returns the String
     */
    public String getBankName() {
        return OptionalNullable.getFrom(bankName);
    }

    /**
     * Setter for BankName.
     * Bank name value.
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = OptionalNullable.of(bankName);
    }

    /**
     * UnSetter for BankName.
     * Bank name value.
     */
    public void unsetBankName() {
        bankName = null;
    }

    /**
     * Internal Getter for BranchCode.
     * Bank branch code.
     * @return Returns the Internal String
     */
    @JsonGetter("branch_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBranchCode() {
        return this.branchCode;
    }

    /**
     * Getter for BranchCode.
     * Bank branch code.
     * @return Returns the String
     */
    public String getBranchCode() {
        return OptionalNullable.getFrom(branchCode);
    }

    /**
     * Setter for BranchCode.
     * Bank branch code.
     * @param branchCode Value for String
     */
    @JsonSetter("branch_code")
    public void setBranchCode(String branchCode) {
        this.branchCode = OptionalNullable.of(branchCode);
    }

    /**
     * UnSetter for BranchCode.
     * Bank branch code.
     */
    public void unsetBranchCode() {
        branchCode = null;
    }

    /**
     * Internal Getter for BranchName.
     * Bank branch name.
     * @return Returns the Internal String
     */
    @JsonGetter("branch_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBranchName() {
        return this.branchName;
    }

    /**
     * Getter for BranchName.
     * Bank branch name.
     * @return Returns the String
     */
    public String getBranchName() {
        return OptionalNullable.getFrom(branchName);
    }

    /**
     * Setter for BranchName.
     * Bank branch name.
     * @param branchName Value for String
     */
    @JsonSetter("branch_name")
    public void setBranchName(String branchName) {
        this.branchName = OptionalNullable.of(branchName);
    }

    /**
     * UnSetter for BranchName.
     * Bank branch name.
     */
    public void unsetBranchName() {
        branchName = null;
    }

    /**
     * Internal Getter for AccountNumber.
     * Bank account number.
     * @return Returns the Internal String
     */
    @JsonGetter("account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Getter for AccountNumber.
     * Bank account number.
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * Bank account number.
     * @param accountNumber Value for String
     */
    @JsonSetter("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * Bank account number.
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Internal Getter for AccountHolderName.
     * Bank account holder name.
     * @return Returns the Internal String
     */
    @JsonGetter("account_holder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountHolderName() {
        return this.accountHolderName;
    }

    /**
     * Getter for AccountHolderName.
     * Bank account holder name.
     * @return Returns the String
     */
    public String getAccountHolderName() {
        return OptionalNullable.getFrom(accountHolderName);
    }

    /**
     * Setter for AccountHolderName.
     * Bank account holder name.
     * @param accountHolderName Value for String
     */
    @JsonSetter("account_holder_name")
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = OptionalNullable.of(accountHolderName);
    }

    /**
     * UnSetter for AccountHolderName.
     * Bank account holder name.
     */
    public void unsetAccountHolderName() {
        accountHolderName = null;
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
     * Converts this TokenResponseBankTransferData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseBankTransferData [" + "brand=" + brand + ", expirationPeriod="
                + expirationPeriod + ", expirationTimeShift=" + expirationTimeShift + ", bankCode="
                + bankCode + ", bankName=" + bankName + ", branchCode=" + branchCode
                + ", branchName=" + branchName + ", accountNumber=" + accountNumber
                + ", accountHolderName=" + accountHolderName + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseBankTransferData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseBankTransferData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brand(getBrand())
                .expirationPeriod(getExpirationPeriod())
                .expirationTimeShift(getExpirationTimeShift());
        builder.bankCode = internalGetBankCode();
        builder.bankName = internalGetBankName();
        builder.branchCode = internalGetBranchCode();
        builder.branchName = internalGetBranchName();
        builder.accountNumber = internalGetAccountNumber();
        builder.accountHolderName = internalGetAccountHolderName();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseBankTransferData}.
     */
    public static class Builder {
        private String brand;
        private String expirationPeriod;
        private String expirationTimeShift;
        private OptionalNullable<String> bankCode;
        private OptionalNullable<String> bankName;
        private OptionalNullable<String> branchCode;
        private OptionalNullable<String> branchName;
        private OptionalNullable<String> accountNumber;
        private OptionalNullable<String> accountHolderName;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for expirationPeriod.
         * @param  expirationPeriod  String value for expirationPeriod.
         * @return Builder
         */
        public Builder expirationPeriod(String expirationPeriod) {
            this.expirationPeriod = expirationPeriod;
            return this;
        }

        /**
         * Setter for expirationTimeShift.
         * @param  expirationTimeShift  String value for expirationTimeShift.
         * @return Builder
         */
        public Builder expirationTimeShift(String expirationTimeShift) {
            this.expirationTimeShift = expirationTimeShift;
            return this;
        }

        /**
         * Setter for bankCode.
         * @param  bankCode  String value for bankCode.
         * @return Builder
         */
        public Builder bankCode(String bankCode) {
            this.bankCode = OptionalNullable.of(bankCode);
            return this;
        }

        /**
         * UnSetter for bankCode.
         * @return Builder
         */
        public Builder unsetBankCode() {
            bankCode = null;
            return this;
        }

        /**
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = OptionalNullable.of(bankName);
            return this;
        }

        /**
         * UnSetter for bankName.
         * @return Builder
         */
        public Builder unsetBankName() {
            bankName = null;
            return this;
        }

        /**
         * Setter for branchCode.
         * @param  branchCode  String value for branchCode.
         * @return Builder
         */
        public Builder branchCode(String branchCode) {
            this.branchCode = OptionalNullable.of(branchCode);
            return this;
        }

        /**
         * UnSetter for branchCode.
         * @return Builder
         */
        public Builder unsetBranchCode() {
            branchCode = null;
            return this;
        }

        /**
         * Setter for branchName.
         * @param  branchName  String value for branchName.
         * @return Builder
         */
        public Builder branchName(String branchName) {
            this.branchName = OptionalNullable.of(branchName);
            return this;
        }

        /**
         * UnSetter for branchName.
         * @return Builder
         */
        public Builder unsetBranchName() {
            branchName = null;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = OptionalNullable.of(accountNumber);
            return this;
        }

        /**
         * UnSetter for accountNumber.
         * @return Builder
         */
        public Builder unsetAccountNumber() {
            accountNumber = null;
            return this;
        }

        /**
         * Setter for accountHolderName.
         * @param  accountHolderName  String value for accountHolderName.
         * @return Builder
         */
        public Builder accountHolderName(String accountHolderName) {
            this.accountHolderName = OptionalNullable.of(accountHolderName);
            return this;
        }

        /**
         * UnSetter for accountHolderName.
         * @return Builder
         */
        public Builder unsetAccountHolderName() {
            accountHolderName = null;
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
         * Builds a new {@link TokenResponseBankTransferData} object using the set fields.
         * @return {@link TokenResponseBankTransferData}
         */
        public TokenResponseBankTransferData build() {
            TokenResponseBankTransferData model =
                    new TokenResponseBankTransferData(brand, expirationPeriod, expirationTimeShift,
                            bankCode, bankName, branchCode, branchName, accountNumber,
                            accountHolderName);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
