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
import java.util.List;
import java.util.Map;

/**
 * This is a model class for TransactionHistoryUserData type.
 */
public class TransactionHistoryUserData {
    private TransactionHistoryType type;
    private String cardholderName;
    private OptionalNullable<String> cardholderEmailAddress;
    private OptionalNullable<String> cardholderPhoneNumber;
    private String customerName;
    private String convenienceStore;
    private OptionalNullable<String> brand;
    private OptionalNullable<String> gateway;
    private OptionalNullable<TransactionHistoryServiceProvider> serviceProvider;
    private List<TransactionHistoryRefund> refunds;
    private OptionalNullable<TransactionHistoryRefundReason> reason;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionHistoryUserData() {
    }

    /**
     * Initialization constructor.
     * @param  type  TransactionHistoryType value for type.
     * @param  cardholderName  String value for cardholderName.
     * @param  cardholderEmailAddress  String value for cardholderEmailAddress.
     * @param  cardholderPhoneNumber  String value for cardholderPhoneNumber.
     * @param  customerName  String value for customerName.
     * @param  convenienceStore  String value for convenienceStore.
     * @param  brand  String value for brand.
     * @param  gateway  String value for gateway.
     * @param  serviceProvider  TransactionHistoryServiceProvider value for serviceProvider.
     * @param  refunds  List of TransactionHistoryRefund value for refunds.
     * @param  reason  TransactionHistoryRefundReason value for reason.
     */
    public TransactionHistoryUserData(
            TransactionHistoryType type,
            String cardholderName,
            String cardholderEmailAddress,
            String cardholderPhoneNumber,
            String customerName,
            String convenienceStore,
            String brand,
            String gateway,
            TransactionHistoryServiceProvider serviceProvider,
            List<TransactionHistoryRefund> refunds,
            TransactionHistoryRefundReason reason) {
        this.type = type;
        this.cardholderName = cardholderName;
        this.cardholderEmailAddress = OptionalNullable.of(cardholderEmailAddress);
        this.cardholderPhoneNumber = OptionalNullable.of(cardholderPhoneNumber);
        this.customerName = customerName;
        this.convenienceStore = convenienceStore;
        this.brand = OptionalNullable.of(brand);
        this.gateway = OptionalNullable.of(gateway);
        this.serviceProvider = OptionalNullable.of(serviceProvider);
        this.refunds = refunds;
        this.reason = OptionalNullable.of(reason);
    }

    /**
     * Initialization constructor.
     * @param  type  TransactionHistoryType value for type.
     * @param  cardholderName  String value for cardholderName.
     * @param  cardholderEmailAddress  String value for cardholderEmailAddress.
     * @param  cardholderPhoneNumber  String value for cardholderPhoneNumber.
     * @param  customerName  String value for customerName.
     * @param  convenienceStore  String value for convenienceStore.
     * @param  brand  String value for brand.
     * @param  gateway  String value for gateway.
     * @param  serviceProvider  TransactionHistoryServiceProvider value for serviceProvider.
     * @param  refunds  List of TransactionHistoryRefund value for refunds.
     * @param  reason  TransactionHistoryRefundReason value for reason.
     */

    protected TransactionHistoryUserData(TransactionHistoryType type, String cardholderName,
            OptionalNullable<String> cardholderEmailAddress,
            OptionalNullable<String> cardholderPhoneNumber, String customerName,
            String convenienceStore, OptionalNullable<String> brand,
            OptionalNullable<String> gateway,
            OptionalNullable<TransactionHistoryServiceProvider> serviceProvider,
            List<TransactionHistoryRefund> refunds,
            OptionalNullable<TransactionHistoryRefundReason> reason) {
        this.type = type;
        this.cardholderName = cardholderName;
        this.cardholderEmailAddress = cardholderEmailAddress;
        this.cardholderPhoneNumber = cardholderPhoneNumber;
        this.customerName = customerName;
        this.convenienceStore = convenienceStore;
        this.brand = brand;
        this.gateway = gateway;
        this.serviceProvider = serviceProvider;
        this.refunds = refunds;
        this.reason = reason;
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
     * Getter for CardholderName.
     * Cardholder name. Present for `card` and `apple_pay` rows only.
     * @return Returns the String
     */
    @JsonGetter("cardholder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Setter for CardholderName.
     * Cardholder name. Present for `card` and `apple_pay` rows only.
     * @param cardholderName Value for String
     */
    @JsonSetter("cardholder_name")
    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    /**
     * Internal Getter for CardholderEmailAddress.
     * Cardholder/customer email address. Present for every payment type except `konbini`'s legacy
     * alias fields; always non-null for `bank_transfer` rows, nullable for every other type.
     * @return Returns the Internal String
     */
    @JsonGetter("cardholder_email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCardholderEmailAddress() {
        return this.cardholderEmailAddress;
    }

    /**
     * Getter for CardholderEmailAddress.
     * Cardholder/customer email address. Present for every payment type except `konbini`'s legacy
     * alias fields; always non-null for `bank_transfer` rows, nullable for every other type.
     * @return Returns the String
     */
    public String getCardholderEmailAddress() {
        return OptionalNullable.getFrom(cardholderEmailAddress);
    }

    /**
     * Setter for CardholderEmailAddress.
     * Cardholder/customer email address. Present for every payment type except `konbini`'s legacy
     * alias fields; always non-null for `bank_transfer` rows, nullable for every other type.
     * @param cardholderEmailAddress Value for String
     */
    @JsonSetter("cardholder_email_address")
    public void setCardholderEmailAddress(String cardholderEmailAddress) {
        this.cardholderEmailAddress = OptionalNullable.of(cardholderEmailAddress);
    }

    /**
     * UnSetter for CardholderEmailAddress.
     * Cardholder/customer email address. Present for every payment type except `konbini`'s legacy
     * alias fields; always non-null for `bank_transfer` rows, nullable for every other type.
     */
    public void unsetCardholderEmailAddress() {
        cardholderEmailAddress = null;
    }

    /**
     * Internal Getter for CardholderPhoneNumber.
     * Cardholder phone number. Present for `paidy` rows only.
     * @return Returns the Internal String
     */
    @JsonGetter("cardholder_phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCardholderPhoneNumber() {
        return this.cardholderPhoneNumber;
    }

    /**
     * Getter for CardholderPhoneNumber.
     * Cardholder phone number. Present for `paidy` rows only.
     * @return Returns the String
     */
    public String getCardholderPhoneNumber() {
        return OptionalNullable.getFrom(cardholderPhoneNumber);
    }

    /**
     * Setter for CardholderPhoneNumber.
     * Cardholder phone number. Present for `paidy` rows only.
     * @param cardholderPhoneNumber Value for String
     */
    @JsonSetter("cardholder_phone_number")
    public void setCardholderPhoneNumber(String cardholderPhoneNumber) {
        this.cardholderPhoneNumber = OptionalNullable.of(cardholderPhoneNumber);
    }

    /**
     * UnSetter for CardholderPhoneNumber.
     * Cardholder phone number. Present for `paidy` rows only.
     */
    public void unsetCardholderPhoneNumber() {
        cardholderPhoneNumber = null;
    }

    /**
     * Getter for CustomerName.
     * Customer name as entered at checkout. Present for `konbini` rows only (empty string when not
     * provided).
     * @return Returns the String
     */
    @JsonGetter("customer_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter for CustomerName.
     * Customer name as entered at checkout. Present for `konbini` rows only (empty string when not
     * provided).
     * @param customerName Value for String
     */
    @JsonSetter("customer_name")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Getter for ConvenienceStore.
     * Legacy duplicate of `brand`. Present for `konbini` rows only.
     * @return Returns the String
     */
    @JsonGetter("convenience_store")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConvenienceStore() {
        return convenienceStore;
    }

    /**
     * Setter for ConvenienceStore.
     * Legacy duplicate of `brand`. Present for `konbini` rows only.
     * @param convenienceStore Value for String
     */
    @JsonSetter("convenience_store")
    public void setConvenienceStore(String convenienceStore) {
        this.convenienceStore = convenienceStore;
    }

    /**
     * Internal Getter for Brand.
     * Raw brand identifier for the payment method. Present for every payment type; the value set is
     * payment-type-specific (e.g. card brands for `card`/`apple_pay`, QR brands for
     * `qr_scan`/`qr_merchant`, online-wallet brands for `online`, convenience-store brands for
     * `konbini`, `paidy` for `paidy` rows). Nullable for `qr_scan`, `qr_merchant`, and `online`;
     * always non-null for the other types.
     * @return Returns the Internal String
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBrand() {
        return this.brand;
    }

    /**
     * Getter for Brand.
     * Raw brand identifier for the payment method. Present for every payment type; the value set is
     * payment-type-specific (e.g. card brands for `card`/`apple_pay`, QR brands for
     * `qr_scan`/`qr_merchant`, online-wallet brands for `online`, convenience-store brands for
     * `konbini`, `paidy` for `paidy` rows). Nullable for `qr_scan`, `qr_merchant`, and `online`;
     * always non-null for the other types.
     * @return Returns the String
     */
    public String getBrand() {
        return OptionalNullable.getFrom(brand);
    }

    /**
     * Setter for Brand.
     * Raw brand identifier for the payment method. Present for every payment type; the value set is
     * payment-type-specific (e.g. card brands for `card`/`apple_pay`, QR brands for
     * `qr_scan`/`qr_merchant`, online-wallet brands for `online`, convenience-store brands for
     * `konbini`, `paidy` for `paidy` rows). Nullable for `qr_scan`, `qr_merchant`, and `online`;
     * always non-null for the other types.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = OptionalNullable.of(brand);
    }

    /**
     * UnSetter for Brand.
     * Raw brand identifier for the payment method. Present for every payment type; the value set is
     * payment-type-specific (e.g. card brands for `card`/`apple_pay`, QR brands for
     * `qr_scan`/`qr_merchant`, online-wallet brands for `online`, convenience-store brands for
     * `konbini`, `paidy` for `paidy` rows). Nullable for `qr_scan`, `qr_merchant`, and `online`;
     * always non-null for the other types.
     */
    public void unsetBrand() {
        brand = null;
    }

    /**
     * Internal Getter for Gateway.
     * Raw gateway identifier that processed the payment. Present for every payment type.
     * @return Returns the Internal String
     */
    @JsonGetter("gateway")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGateway() {
        return this.gateway;
    }

    /**
     * Getter for Gateway.
     * Raw gateway identifier that processed the payment. Present for every payment type.
     * @return Returns the String
     */
    public String getGateway() {
        return OptionalNullable.getFrom(gateway);
    }

    /**
     * Setter for Gateway.
     * Raw gateway identifier that processed the payment. Present for every payment type.
     * @param gateway Value for String
     */
    @JsonSetter("gateway")
    public void setGateway(String gateway) {
        this.gateway = OptionalNullable.of(gateway);
    }

    /**
     * UnSetter for Gateway.
     * Raw gateway identifier that processed the payment. Present for every payment type.
     */
    public void unsetGateway() {
        gateway = null;
    }

    /**
     * Internal Getter for ServiceProvider.
     * Service provider, or `null` when not reported.
     * @return Returns the Internal TransactionHistoryServiceProvider
     */
    @JsonGetter("service_provider")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<TransactionHistoryServiceProvider> internalGetServiceProvider() {
        return this.serviceProvider;
    }

    /**
     * Getter for ServiceProvider.
     * Service provider, or `null` when not reported.
     * @return Returns the TransactionHistoryServiceProvider
     */
    public TransactionHistoryServiceProvider getServiceProvider() {
        return OptionalNullable.getFrom(serviceProvider);
    }

    /**
     * Setter for ServiceProvider.
     * Service provider, or `null` when not reported.
     * @param serviceProvider Value for TransactionHistoryServiceProvider
     */
    @JsonSetter("service_provider")
    public void setServiceProvider(TransactionHistoryServiceProvider serviceProvider) {
        this.serviceProvider = OptionalNullable.of(serviceProvider);
    }

    /**
     * UnSetter for ServiceProvider.
     * Service provider, or `null` when not reported.
     */
    public void unsetServiceProvider() {
        serviceProvider = null;
    }

    /**
     * Getter for Refunds.
     * Refunds issued against this charge. Present for charge rows only (`type: charge`); absent for
     * refund rows.
     * @return Returns the List of TransactionHistoryRefund
     */
    @JsonGetter("refunds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TransactionHistoryRefund> getRefunds() {
        return refunds;
    }

    /**
     * Setter for Refunds.
     * Refunds issued against this charge. Present for charge rows only (`type: charge`); absent for
     * refund rows.
     * @param refunds Value for List of TransactionHistoryRefund
     */
    @JsonSetter("refunds")
    public void setRefunds(List<TransactionHistoryRefund> refunds) {
        this.refunds = refunds;
    }

    /**
     * Internal Getter for Reason.
     * Refund reason, or `null` when unset.
     * @return Returns the Internal TransactionHistoryRefundReason
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<TransactionHistoryRefundReason> internalGetReason() {
        return this.reason;
    }

    /**
     * Getter for Reason.
     * Refund reason, or `null` when unset.
     * @return Returns the TransactionHistoryRefundReason
     */
    public TransactionHistoryRefundReason getReason() {
        return OptionalNullable.getFrom(reason);
    }

    /**
     * Setter for Reason.
     * Refund reason, or `null` when unset.
     * @param reason Value for TransactionHistoryRefundReason
     */
    @JsonSetter("reason")
    public void setReason(TransactionHistoryRefundReason reason) {
        this.reason = OptionalNullable.of(reason);
    }

    /**
     * UnSetter for Reason.
     * Refund reason, or `null` when unset.
     */
    public void unsetReason() {
        reason = null;
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
     * Converts this TransactionHistoryUserData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionHistoryUserData [" + "type=" + type + ", cardholderName="
                + cardholderName + ", cardholderEmailAddress=" + cardholderEmailAddress
                + ", cardholderPhoneNumber=" + cardholderPhoneNumber + ", customerName="
                + customerName + ", convenienceStore=" + convenienceStore + ", brand=" + brand
                + ", gateway=" + gateway + ", serviceProvider=" + serviceProvider + ", refunds="
                + refunds + ", reason=" + reason + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link TransactionHistoryUserData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionHistoryUserData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .cardholderName(getCardholderName())
                .customerName(getCustomerName())
                .convenienceStore(getConvenienceStore())
                .refunds(getRefunds());
        builder.cardholderEmailAddress = internalGetCardholderEmailAddress();
        builder.cardholderPhoneNumber = internalGetCardholderPhoneNumber();
        builder.brand = internalGetBrand();
        builder.gateway = internalGetGateway();
        builder.serviceProvider = internalGetServiceProvider();
        builder.reason = internalGetReason();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionHistoryUserData}.
     */
    public static class Builder {
        private TransactionHistoryType type;
        private String cardholderName;
        private OptionalNullable<String> cardholderEmailAddress;
        private OptionalNullable<String> cardholderPhoneNumber;
        private String customerName;
        private String convenienceStore;
        private OptionalNullable<String> brand;
        private OptionalNullable<String> gateway;
        private OptionalNullable<TransactionHistoryServiceProvider> serviceProvider;
        private List<TransactionHistoryRefund> refunds;
        private OptionalNullable<TransactionHistoryRefundReason> reason;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for cardholderName.
         * @param  cardholderName  String value for cardholderName.
         * @return Builder
         */
        public Builder cardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
            return this;
        }

        /**
         * Setter for cardholderEmailAddress.
         * @param  cardholderEmailAddress  String value for cardholderEmailAddress.
         * @return Builder
         */
        public Builder cardholderEmailAddress(String cardholderEmailAddress) {
            this.cardholderEmailAddress = OptionalNullable.of(cardholderEmailAddress);
            return this;
        }

        /**
         * UnSetter for cardholderEmailAddress.
         * @return Builder
         */
        public Builder unsetCardholderEmailAddress() {
            cardholderEmailAddress = null;
            return this;
        }

        /**
         * Setter for cardholderPhoneNumber.
         * @param  cardholderPhoneNumber  String value for cardholderPhoneNumber.
         * @return Builder
         */
        public Builder cardholderPhoneNumber(String cardholderPhoneNumber) {
            this.cardholderPhoneNumber = OptionalNullable.of(cardholderPhoneNumber);
            return this;
        }

        /**
         * UnSetter for cardholderPhoneNumber.
         * @return Builder
         */
        public Builder unsetCardholderPhoneNumber() {
            cardholderPhoneNumber = null;
            return this;
        }

        /**
         * Setter for customerName.
         * @param  customerName  String value for customerName.
         * @return Builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        /**
         * Setter for convenienceStore.
         * @param  convenienceStore  String value for convenienceStore.
         * @return Builder
         */
        public Builder convenienceStore(String convenienceStore) {
            this.convenienceStore = convenienceStore;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = OptionalNullable.of(brand);
            return this;
        }

        /**
         * UnSetter for brand.
         * @return Builder
         */
        public Builder unsetBrand() {
            brand = null;
            return this;
        }

        /**
         * Setter for gateway.
         * @param  gateway  String value for gateway.
         * @return Builder
         */
        public Builder gateway(String gateway) {
            this.gateway = OptionalNullable.of(gateway);
            return this;
        }

        /**
         * UnSetter for gateway.
         * @return Builder
         */
        public Builder unsetGateway() {
            gateway = null;
            return this;
        }

        /**
         * Setter for serviceProvider.
         * @param  serviceProvider  TransactionHistoryServiceProvider value for serviceProvider.
         * @return Builder
         */
        public Builder serviceProvider(TransactionHistoryServiceProvider serviceProvider) {
            this.serviceProvider = OptionalNullable.of(serviceProvider);
            return this;
        }

        /**
         * UnSetter for serviceProvider.
         * @return Builder
         */
        public Builder unsetServiceProvider() {
            serviceProvider = null;
            return this;
        }

        /**
         * Setter for refunds.
         * @param  refunds  List of TransactionHistoryRefund value for refunds.
         * @return Builder
         */
        public Builder refunds(List<TransactionHistoryRefund> refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  TransactionHistoryRefundReason value for reason.
         * @return Builder
         */
        public Builder reason(TransactionHistoryRefundReason reason) {
            this.reason = OptionalNullable.of(reason);
            return this;
        }

        /**
         * UnSetter for reason.
         * @return Builder
         */
        public Builder unsetReason() {
            reason = null;
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
         * Builds a new {@link TransactionHistoryUserData} object using the set fields.
         * @return {@link TransactionHistoryUserData}
         */
        public TransactionHistoryUserData build() {
            TransactionHistoryUserData model =
                    new TransactionHistoryUserData(type, cardholderName, cardholderEmailAddress,
                            cardholderPhoneNumber, customerName, convenienceStore, brand, gateway,
                            serviceProvider, refunds, reason);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
