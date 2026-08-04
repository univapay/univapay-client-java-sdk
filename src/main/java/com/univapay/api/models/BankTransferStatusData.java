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
 * This is a model class for BankTransferStatusData type.
 */
public class BankTransferStatusData {
    private OptionalNullable<UUID> id;
    private UUID chargeId;
    private BankTransferPaymentStatus paymentStatus;
    private OptionalNullable<LocalDateTime> latestDepositDate;
    private OptionalNullable<LocalDateTime> createdOn;
    private OptionalNullable<Integer> latestDepositAmount;
    private OptionalNullable<Integer> balance;
    private String currency;
    private Integer amount;
    private OptionalNullable<Integer> amountDifference;
    private GenericMetadata tokenMetadata;
    private GenericMetadata chargeMetadata;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public BankTransferStatusData() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  chargeId  UUID value for chargeId.
     * @param  paymentStatus  BankTransferPaymentStatus value for paymentStatus.
     * @param  latestDepositDate  LocalDateTime value for latestDepositDate.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  latestDepositAmount  Integer value for latestDepositAmount.
     * @param  balance  Integer value for balance.
     * @param  currency  String value for currency.
     * @param  amount  Integer value for amount.
     * @param  amountDifference  Integer value for amountDifference.
     * @param  tokenMetadata  GenericMetadata value for tokenMetadata.
     * @param  chargeMetadata  GenericMetadata value for chargeMetadata.
     */
    public BankTransferStatusData(
            UUID id,
            UUID chargeId,
            BankTransferPaymentStatus paymentStatus,
            LocalDateTime latestDepositDate,
            LocalDateTime createdOn,
            Integer latestDepositAmount,
            Integer balance,
            String currency,
            Integer amount,
            Integer amountDifference,
            GenericMetadata tokenMetadata,
            GenericMetadata chargeMetadata) {
        this.id = OptionalNullable.of(id);
        this.chargeId = chargeId;
        this.paymentStatus = paymentStatus;
        this.latestDepositDate = OptionalNullable.of(latestDepositDate);
        this.createdOn = OptionalNullable.of(createdOn);
        this.latestDepositAmount = OptionalNullable.of(latestDepositAmount);
        this.balance = OptionalNullable.of(balance);
        this.currency = currency;
        this.amount = amount;
        this.amountDifference = OptionalNullable.of(amountDifference);
        this.tokenMetadata = tokenMetadata;
        this.chargeMetadata = chargeMetadata;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  chargeId  UUID value for chargeId.
     * @param  paymentStatus  BankTransferPaymentStatus value for paymentStatus.
     * @param  latestDepositDate  LocalDateTime value for latestDepositDate.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  latestDepositAmount  Integer value for latestDepositAmount.
     * @param  balance  Integer value for balance.
     * @param  currency  String value for currency.
     * @param  amount  Integer value for amount.
     * @param  amountDifference  Integer value for amountDifference.
     * @param  tokenMetadata  GenericMetadata value for tokenMetadata.
     * @param  chargeMetadata  GenericMetadata value for chargeMetadata.
     */

    protected BankTransferStatusData(OptionalNullable<UUID> id, UUID chargeId,
            BankTransferPaymentStatus paymentStatus,
            OptionalNullable<LocalDateTime> latestDepositDate,
            OptionalNullable<LocalDateTime> createdOn,
            OptionalNullable<Integer> latestDepositAmount, OptionalNullable<Integer> balance,
            String currency, Integer amount, OptionalNullable<Integer> amountDifference,
            GenericMetadata tokenMetadata, GenericMetadata chargeMetadata) {
        this.id = id;
        this.chargeId = chargeId;
        this.paymentStatus = paymentStatus;
        this.latestDepositDate = latestDepositDate;
        this.createdOn = createdOn;
        this.latestDepositAmount = latestDepositAmount;
        this.balance = balance;
        this.currency = currency;
        this.amount = amount;
        this.amountDifference = amountDifference;
        this.tokenMetadata = tokenMetadata;
        this.chargeMetadata = chargeMetadata;
    }

    /**
     * Internal Getter for Id.
     * Bank transfer charge extension ID.
     * @return Returns the Internal UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * Bank transfer charge extension ID.
     * @return Returns the UUID
     */
    public UUID getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * Bank transfer charge extension ID.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     * Bank transfer charge extension ID.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Getter for ChargeId.
     * ID of the associated charge.
     * @return Returns the UUID
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getChargeId() {
        return chargeId;
    }

    /**
     * Setter for ChargeId.
     * ID of the associated charge.
     * @param chargeId Value for UUID
     */
    @JsonSetter("charge_id")
    public void setChargeId(UUID chargeId) {
        this.chargeId = chargeId;
    }

    /**
     * Getter for PaymentStatus.
     * Payment status of a bank transfer charge.
     * @return Returns the BankTransferPaymentStatus
     */
    @JsonGetter("payment_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankTransferPaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Setter for PaymentStatus.
     * Payment status of a bank transfer charge.
     * @param paymentStatus Value for BankTransferPaymentStatus
     */
    @JsonSetter("payment_status")
    public void setPaymentStatus(BankTransferPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * Internal Getter for LatestDepositDate.
     * Date of the most recent deposit.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("latest_deposit_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetLatestDepositDate() {
        return this.latestDepositDate;
    }

    /**
     * Getter for LatestDepositDate.
     * Date of the most recent deposit.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getLatestDepositDate() {
        return OptionalNullable.getFrom(latestDepositDate);
    }

    /**
     * Setter for LatestDepositDate.
     * Date of the most recent deposit.
     * @param latestDepositDate Value for LocalDateTime
     */
    @JsonSetter("latest_deposit_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLatestDepositDate(LocalDateTime latestDepositDate) {
        this.latestDepositDate = OptionalNullable.of(latestDepositDate);
    }

    /**
     * UnSetter for LatestDepositDate.
     * Date of the most recent deposit.
     */
    public void unsetLatestDepositDate() {
        latestDepositDate = null;
    }

    /**
     * Internal Getter for CreatedOn.
     * When the bank transfer extension record was created.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("created_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetCreatedOn() {
        return this.createdOn;
    }

    /**
     * Getter for CreatedOn.
     * When the bank transfer extension record was created.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getCreatedOn() {
        return OptionalNullable.getFrom(createdOn);
    }

    /**
     * Setter for CreatedOn.
     * When the bank transfer extension record was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = OptionalNullable.of(createdOn);
    }

    /**
     * UnSetter for CreatedOn.
     * When the bank transfer extension record was created.
     */
    public void unsetCreatedOn() {
        createdOn = null;
    }

    /**
     * Internal Getter for LatestDepositAmount.
     * Amount of the most recent deposit in minor currency units.
     * @return Returns the Internal Integer
     */
    @JsonGetter("latest_deposit_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetLatestDepositAmount() {
        return this.latestDepositAmount;
    }

    /**
     * Getter for LatestDepositAmount.
     * Amount of the most recent deposit in minor currency units.
     * @return Returns the Integer
     */
    public Integer getLatestDepositAmount() {
        return OptionalNullable.getFrom(latestDepositAmount);
    }

    /**
     * Setter for LatestDepositAmount.
     * Amount of the most recent deposit in minor currency units.
     * @param latestDepositAmount Value for Integer
     */
    @JsonSetter("latest_deposit_amount")
    public void setLatestDepositAmount(Integer latestDepositAmount) {
        this.latestDepositAmount = OptionalNullable.of(latestDepositAmount);
    }

    /**
     * UnSetter for LatestDepositAmount.
     * Amount of the most recent deposit in minor currency units.
     */
    public void unsetLatestDepositAmount() {
        latestDepositAmount = null;
    }

    /**
     * Internal Getter for Balance.
     * Current outstanding balance in minor currency units.
     * @return Returns the Internal Integer
     */
    @JsonGetter("balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetBalance() {
        return this.balance;
    }

    /**
     * Getter for Balance.
     * Current outstanding balance in minor currency units.
     * @return Returns the Integer
     */
    public Integer getBalance() {
        return OptionalNullable.getFrom(balance);
    }

    /**
     * Setter for Balance.
     * Current outstanding balance in minor currency units.
     * @param balance Value for Integer
     */
    @JsonSetter("balance")
    public void setBalance(Integer balance) {
        this.balance = OptionalNullable.of(balance);
    }

    /**
     * UnSetter for Balance.
     * Current outstanding balance in minor currency units.
     */
    public void unsetBalance() {
        balance = null;
    }

    /**
     * Getter for Currency.
     * ISO 4217 currency code.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO 4217 currency code.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Amount.
     * Total charge amount in minor currency units.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Total charge amount in minor currency units.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Internal Getter for AmountDifference.
     * Difference between paid and expected amount (positive = over, negative = under).
     * @return Returns the Internal Integer
     */
    @JsonGetter("amount_difference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAmountDifference() {
        return this.amountDifference;
    }

    /**
     * Getter for AmountDifference.
     * Difference between paid and expected amount (positive = over, negative = under).
     * @return Returns the Integer
     */
    public Integer getAmountDifference() {
        return OptionalNullable.getFrom(amountDifference);
    }

    /**
     * Setter for AmountDifference.
     * Difference between paid and expected amount (positive = over, negative = under).
     * @param amountDifference Value for Integer
     */
    @JsonSetter("amount_difference")
    public void setAmountDifference(Integer amountDifference) {
        this.amountDifference = OptionalNullable.of(amountDifference);
    }

    /**
     * UnSetter for AmountDifference.
     * Difference between paid and expected amount (positive = over, negative = under).
     */
    public void unsetAmountDifference() {
        amountDifference = null;
    }

    /**
     * Getter for TokenMetadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the GenericMetadata
     */
    @JsonGetter("token_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GenericMetadata getTokenMetadata() {
        return tokenMetadata;
    }

    /**
     * Setter for TokenMetadata.
     * A free-form dictionary for custom metadata.
     * @param tokenMetadata Value for GenericMetadata
     */
    @JsonSetter("token_metadata")
    public void setTokenMetadata(GenericMetadata tokenMetadata) {
        this.tokenMetadata = tokenMetadata;
    }

    /**
     * Getter for ChargeMetadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the GenericMetadata
     */
    @JsonGetter("charge_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GenericMetadata getChargeMetadata() {
        return chargeMetadata;
    }

    /**
     * Setter for ChargeMetadata.
     * A free-form dictionary for custom metadata.
     * @param chargeMetadata Value for GenericMetadata
     */
    @JsonSetter("charge_metadata")
    public void setChargeMetadata(GenericMetadata chargeMetadata) {
        this.chargeMetadata = chargeMetadata;
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
     * Converts this BankTransferStatusData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankTransferStatusData [" + "id=" + id + ", chargeId=" + chargeId
                + ", paymentStatus=" + paymentStatus + ", latestDepositDate=" + latestDepositDate
                + ", createdOn=" + createdOn + ", latestDepositAmount=" + latestDepositAmount
                + ", balance=" + balance + ", currency=" + currency + ", amount=" + amount
                + ", amountDifference=" + amountDifference + ", tokenMetadata=" + tokenMetadata
                + ", chargeMetadata=" + chargeMetadata + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link BankTransferStatusData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankTransferStatusData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargeId(getChargeId())
                .paymentStatus(getPaymentStatus())
                .currency(getCurrency())
                .amount(getAmount())
                .tokenMetadata(getTokenMetadata())
                .chargeMetadata(getChargeMetadata());
        builder.id = internalGetId();
        builder.latestDepositDate = internalGetLatestDepositDate();
        builder.createdOn = internalGetCreatedOn();
        builder.latestDepositAmount = internalGetLatestDepositAmount();
        builder.balance = internalGetBalance();
        builder.amountDifference = internalGetAmountDifference();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link BankTransferStatusData}.
     */
    public static class Builder {
        private OptionalNullable<UUID> id;
        private UUID chargeId;
        private BankTransferPaymentStatus paymentStatus;
        private OptionalNullable<LocalDateTime> latestDepositDate;
        private OptionalNullable<LocalDateTime> createdOn;
        private OptionalNullable<Integer> latestDepositAmount;
        private OptionalNullable<Integer> balance;
        private String currency;
        private Integer amount;
        private OptionalNullable<Integer> amountDifference;
        private GenericMetadata tokenMetadata;
        private GenericMetadata chargeMetadata;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for id.
         * @param  id  UUID value for id.
         * @return Builder
         */
        public Builder id(UUID id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for chargeId.
         * @param  chargeId  UUID value for chargeId.
         * @return Builder
         */
        public Builder chargeId(UUID chargeId) {
            this.chargeId = chargeId;
            return this;
        }

        /**
         * Setter for paymentStatus.
         * @param  paymentStatus  BankTransferPaymentStatus value for paymentStatus.
         * @return Builder
         */
        public Builder paymentStatus(BankTransferPaymentStatus paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        /**
         * Setter for latestDepositDate.
         * @param  latestDepositDate  LocalDateTime value for latestDepositDate.
         * @return Builder
         */
        public Builder latestDepositDate(LocalDateTime latestDepositDate) {
            this.latestDepositDate = OptionalNullable.of(latestDepositDate);
            return this;
        }

        /**
         * UnSetter for latestDepositDate.
         * @return Builder
         */
        public Builder unsetLatestDepositDate() {
            latestDepositDate = null;
            return this;
        }

        /**
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = OptionalNullable.of(createdOn);
            return this;
        }

        /**
         * UnSetter for createdOn.
         * @return Builder
         */
        public Builder unsetCreatedOn() {
            createdOn = null;
            return this;
        }

        /**
         * Setter for latestDepositAmount.
         * @param  latestDepositAmount  Integer value for latestDepositAmount.
         * @return Builder
         */
        public Builder latestDepositAmount(Integer latestDepositAmount) {
            this.latestDepositAmount = OptionalNullable.of(latestDepositAmount);
            return this;
        }

        /**
         * UnSetter for latestDepositAmount.
         * @return Builder
         */
        public Builder unsetLatestDepositAmount() {
            latestDepositAmount = null;
            return this;
        }

        /**
         * Setter for balance.
         * @param  balance  Integer value for balance.
         * @return Builder
         */
        public Builder balance(Integer balance) {
            this.balance = OptionalNullable.of(balance);
            return this;
        }

        /**
         * UnSetter for balance.
         * @return Builder
         */
        public Builder unsetBalance() {
            balance = null;
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
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for amountDifference.
         * @param  amountDifference  Integer value for amountDifference.
         * @return Builder
         */
        public Builder amountDifference(Integer amountDifference) {
            this.amountDifference = OptionalNullable.of(amountDifference);
            return this;
        }

        /**
         * UnSetter for amountDifference.
         * @return Builder
         */
        public Builder unsetAmountDifference() {
            amountDifference = null;
            return this;
        }

        /**
         * Setter for tokenMetadata.
         * @param  tokenMetadata  GenericMetadata value for tokenMetadata.
         * @return Builder
         */
        public Builder tokenMetadata(GenericMetadata tokenMetadata) {
            this.tokenMetadata = tokenMetadata;
            return this;
        }

        /**
         * Setter for chargeMetadata.
         * @param  chargeMetadata  GenericMetadata value for chargeMetadata.
         * @return Builder
         */
        public Builder chargeMetadata(GenericMetadata chargeMetadata) {
            this.chargeMetadata = chargeMetadata;
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
         * Builds a new {@link BankTransferStatusData} object using the set fields.
         * @return {@link BankTransferStatusData}
         */
        public BankTransferStatusData build() {
            BankTransferStatusData model =
                    new BankTransferStatusData(id, chargeId, paymentStatus, latestDepositDate,
                            createdOn, latestDepositAmount, balance, currency, amount,
                            amountDifference, tokenMetadata, chargeMetadata);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
