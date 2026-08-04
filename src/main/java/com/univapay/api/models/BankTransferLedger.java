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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is a model class for BankTransferLedger type.
 */
public class BankTransferLedger {
    private BankTransferLedgerBankLedgerType bankLedgerType;
    private Integer amount;
    private Integer balance;
    private String virtualBankAccountHolderName;
    private String virtualBankAccountNumber;
    private String virtualAccountId;
    private LocalDate transactionDate;
    private LocalDateTime transactionTimestamp;
    private BankTransferLedgerMode mode;
    private LocalDateTime createdOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public BankTransferLedger() {
    }

    /**
     * Initialization constructor.
     * @param  bankLedgerType  BankTransferLedgerBankLedgerType value for bankLedgerType.
     * @param  amount  Integer value for amount.
     * @param  balance  Integer value for balance.
     * @param  virtualBankAccountHolderName  String value for virtualBankAccountHolderName.
     * @param  virtualBankAccountNumber  String value for virtualBankAccountNumber.
     * @param  virtualAccountId  String value for virtualAccountId.
     * @param  transactionDate  LocalDate value for transactionDate.
     * @param  transactionTimestamp  LocalDateTime value for transactionTimestamp.
     * @param  mode  BankTransferLedgerMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    public BankTransferLedger(
            BankTransferLedgerBankLedgerType bankLedgerType,
            Integer amount,
            Integer balance,
            String virtualBankAccountHolderName,
            String virtualBankAccountNumber,
            String virtualAccountId,
            LocalDate transactionDate,
            LocalDateTime transactionTimestamp,
            BankTransferLedgerMode mode,
            LocalDateTime createdOn) {
        this.bankLedgerType = bankLedgerType;
        this.amount = amount;
        this.balance = balance;
        this.virtualBankAccountHolderName = virtualBankAccountHolderName;
        this.virtualBankAccountNumber = virtualBankAccountNumber;
        this.virtualAccountId = virtualAccountId;
        this.transactionDate = transactionDate;
        this.transactionTimestamp = transactionTimestamp;
        this.mode = mode;
        this.createdOn = createdOn;
    }

    /**
     * Getter for BankLedgerType.
     * Bank Transfer Ledger Bank Ledger Type schema.
     * @return Returns the BankTransferLedgerBankLedgerType
     */
    @JsonGetter("bank_ledger_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankTransferLedgerBankLedgerType getBankLedgerType() {
        return bankLedgerType;
    }

    /**
     * Setter for BankLedgerType.
     * Bank Transfer Ledger Bank Ledger Type schema.
     * @param bankLedgerType Value for BankTransferLedgerBankLedgerType
     */
    @JsonSetter("bank_ledger_type")
    public void setBankLedgerType(BankTransferLedgerBankLedgerType bankLedgerType) {
        this.bankLedgerType = bankLedgerType;
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
     * Getter for Balance.
     * Current balance in the smallest currency unit.
     * @return Returns the Integer
     */
    @JsonGetter("balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBalance() {
        return balance;
    }

    /**
     * Setter for Balance.
     * Current balance in the smallest currency unit.
     * @param balance Value for Integer
     */
    @JsonSetter("balance")
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * Getter for VirtualBankAccountHolderName.
     * Virtual bank account holder name.
     * @return Returns the String
     */
    @JsonGetter("virtual_bank_account_holder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVirtualBankAccountHolderName() {
        return virtualBankAccountHolderName;
    }

    /**
     * Setter for VirtualBankAccountHolderName.
     * Virtual bank account holder name.
     * @param virtualBankAccountHolderName Value for String
     */
    @JsonSetter("virtual_bank_account_holder_name")
    public void setVirtualBankAccountHolderName(String virtualBankAccountHolderName) {
        this.virtualBankAccountHolderName = virtualBankAccountHolderName;
    }

    /**
     * Getter for VirtualBankAccountNumber.
     * Virtual bank account number.
     * @return Returns the String
     */
    @JsonGetter("virtual_bank_account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVirtualBankAccountNumber() {
        return virtualBankAccountNumber;
    }

    /**
     * Setter for VirtualBankAccountNumber.
     * Virtual bank account number.
     * @param virtualBankAccountNumber Value for String
     */
    @JsonSetter("virtual_bank_account_number")
    public void setVirtualBankAccountNumber(String virtualBankAccountNumber) {
        this.virtualBankAccountNumber = virtualBankAccountNumber;
    }

    /**
     * Getter for VirtualAccountId.
     * Virtual account id value.
     * @return Returns the String
     */
    @JsonGetter("virtual_account_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVirtualAccountId() {
        return virtualAccountId;
    }

    /**
     * Setter for VirtualAccountId.
     * Virtual account id value.
     * @param virtualAccountId Value for String
     */
    @JsonSetter("virtual_account_id")
    public void setVirtualAccountId(String virtualAccountId) {
        this.virtualAccountId = virtualAccountId;
    }

    /**
     * Getter for TransactionDate.
     * Transaction date.
     * @return Returns the LocalDate
     */
    @JsonGetter("transaction_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    /**
     * Setter for TransactionDate.
     * Transaction date.
     * @param transactionDate Value for LocalDate
     */
    @JsonSetter("transaction_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * Getter for TransactionTimestamp.
     * Transaction timestamp.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("transaction_timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * Setter for TransactionTimestamp.
     * Transaction timestamp.
     * @param transactionTimestamp Value for LocalDateTime
     */
    @JsonSetter("transaction_timestamp")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTimestamp(LocalDateTime transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    /**
     * Getter for Mode.
     * Bank Transfer Ledger Mode schema.
     * @return Returns the BankTransferLedgerMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankTransferLedgerMode getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Bank Transfer Ledger Mode schema.
     * @param mode Value for BankTransferLedgerMode
     */
    @JsonSetter("mode")
    public void setMode(BankTransferLedgerMode mode) {
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
     * Converts this BankTransferLedger into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankTransferLedger [" + "bankLedgerType=" + bankLedgerType + ", amount=" + amount
                + ", balance=" + balance + ", virtualBankAccountHolderName="
                + virtualBankAccountHolderName + ", virtualBankAccountNumber="
                + virtualBankAccountNumber + ", virtualAccountId=" + virtualAccountId
                + ", transactionDate=" + transactionDate + ", transactionTimestamp="
                + transactionTimestamp + ", mode=" + mode + ", createdOn=" + createdOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link BankTransferLedger.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankTransferLedger.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bankLedgerType(getBankLedgerType())
                .amount(getAmount())
                .balance(getBalance())
                .virtualBankAccountHolderName(getVirtualBankAccountHolderName())
                .virtualBankAccountNumber(getVirtualBankAccountNumber())
                .virtualAccountId(getVirtualAccountId())
                .transactionDate(getTransactionDate())
                .transactionTimestamp(getTransactionTimestamp())
                .mode(getMode())
                .createdOn(getCreatedOn());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link BankTransferLedger}.
     */
    public static class Builder {
        private BankTransferLedgerBankLedgerType bankLedgerType;
        private Integer amount;
        private Integer balance;
        private String virtualBankAccountHolderName;
        private String virtualBankAccountNumber;
        private String virtualAccountId;
        private LocalDate transactionDate;
        private LocalDateTime transactionTimestamp;
        private BankTransferLedgerMode mode;
        private LocalDateTime createdOn;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for bankLedgerType.
         * @param  bankLedgerType  BankTransferLedgerBankLedgerType value for bankLedgerType.
         * @return Builder
         */
        public Builder bankLedgerType(BankTransferLedgerBankLedgerType bankLedgerType) {
            this.bankLedgerType = bankLedgerType;
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
         * Setter for balance.
         * @param  balance  Integer value for balance.
         * @return Builder
         */
        public Builder balance(Integer balance) {
            this.balance = balance;
            return this;
        }

        /**
         * Setter for virtualBankAccountHolderName.
         * @param  virtualBankAccountHolderName  String value for virtualBankAccountHolderName.
         * @return Builder
         */
        public Builder virtualBankAccountHolderName(String virtualBankAccountHolderName) {
            this.virtualBankAccountHolderName = virtualBankAccountHolderName;
            return this;
        }

        /**
         * Setter for virtualBankAccountNumber.
         * @param  virtualBankAccountNumber  String value for virtualBankAccountNumber.
         * @return Builder
         */
        public Builder virtualBankAccountNumber(String virtualBankAccountNumber) {
            this.virtualBankAccountNumber = virtualBankAccountNumber;
            return this;
        }

        /**
         * Setter for virtualAccountId.
         * @param  virtualAccountId  String value for virtualAccountId.
         * @return Builder
         */
        public Builder virtualAccountId(String virtualAccountId) {
            this.virtualAccountId = virtualAccountId;
            return this;
        }

        /**
         * Setter for transactionDate.
         * @param  transactionDate  LocalDate value for transactionDate.
         * @return Builder
         */
        public Builder transactionDate(LocalDate transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        /**
         * Setter for transactionTimestamp.
         * @param  transactionTimestamp  LocalDateTime value for transactionTimestamp.
         * @return Builder
         */
        public Builder transactionTimestamp(LocalDateTime transactionTimestamp) {
            this.transactionTimestamp = transactionTimestamp;
            return this;
        }

        /**
         * Setter for mode.
         * @param  mode  BankTransferLedgerMode value for mode.
         * @return Builder
         */
        public Builder mode(BankTransferLedgerMode mode) {
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
         * Builds a new {@link BankTransferLedger} object using the set fields.
         * @return {@link BankTransferLedger}
         */
        public BankTransferLedger build() {
            BankTransferLedger model =
                    new BankTransferLedger(bankLedgerType, amount, balance,
                            virtualBankAccountHolderName, virtualBankAccountNumber,
                            virtualAccountId, transactionDate, transactionTimestamp, mode,
                            createdOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
