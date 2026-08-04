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
 * This is a model class for IssuerToken type.
 */
public class IssuerToken {
    private IssuerTokenPaymentType paymentType;
    private OptionalNullable<String> issuerToken;
    private OptionalNullable<IssuerTokenCallMethod> callMethod;
    private OptionalNullable<IssuerTokenPayload> payload;
    private OptionalNullable<String> accountId;
    private OptionalNullable<String> branchCode;
    private OptionalNullable<String> branchName;
    private OptionalNullable<String> accountHolderName;
    private OptionalNullable<String> accountNumber;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public IssuerToken() {
    }

    /**
     * Initialization constructor.
     * @param  paymentType  IssuerTokenPaymentType value for paymentType.
     * @param  issuerToken  String value for issuerToken.
     * @param  callMethod  IssuerTokenCallMethod value for callMethod.
     * @param  payload  IssuerTokenPayload value for payload.
     * @param  accountId  String value for accountId.
     * @param  branchCode  String value for branchCode.
     * @param  branchName  String value for branchName.
     * @param  accountHolderName  String value for accountHolderName.
     * @param  accountNumber  String value for accountNumber.
     */
    public IssuerToken(
            IssuerTokenPaymentType paymentType,
            String issuerToken,
            IssuerTokenCallMethod callMethod,
            IssuerTokenPayload payload,
            String accountId,
            String branchCode,
            String branchName,
            String accountHolderName,
            String accountNumber) {
        this.paymentType = paymentType;
        this.issuerToken = OptionalNullable.of(issuerToken);
        this.callMethod = OptionalNullable.of(callMethod);
        this.payload = OptionalNullable.of(payload);
        this.accountId = OptionalNullable.of(accountId);
        this.branchCode = OptionalNullable.of(branchCode);
        this.branchName = OptionalNullable.of(branchName);
        this.accountHolderName = OptionalNullable.of(accountHolderName);
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * Initialization constructor.
     * @param  paymentType  IssuerTokenPaymentType value for paymentType.
     * @param  issuerToken  String value for issuerToken.
     * @param  callMethod  IssuerTokenCallMethod value for callMethod.
     * @param  payload  IssuerTokenPayload value for payload.
     * @param  accountId  String value for accountId.
     * @param  branchCode  String value for branchCode.
     * @param  branchName  String value for branchName.
     * @param  accountHolderName  String value for accountHolderName.
     * @param  accountNumber  String value for accountNumber.
     */

    protected IssuerToken(IssuerTokenPaymentType paymentType, OptionalNullable<String> issuerToken,
            OptionalNullable<IssuerTokenCallMethod> callMethod,
            OptionalNullable<IssuerTokenPayload> payload, OptionalNullable<String> accountId,
            OptionalNullable<String> branchCode, OptionalNullable<String> branchName,
            OptionalNullable<String> accountHolderName, OptionalNullable<String> accountNumber) {
        this.paymentType = paymentType;
        this.issuerToken = issuerToken;
        this.callMethod = callMethod;
        this.payload = payload;
        this.accountId = accountId;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for PaymentType.
     * The type of payment method for the charge.
     * @return Returns the IssuerTokenPaymentType
     */
    @JsonGetter("payment_type")
    public IssuerTokenPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * The type of payment method for the charge.
     * @param paymentType Value for IssuerTokenPaymentType
     */
    @JsonSetter("payment_type")
    public void setPaymentType(IssuerTokenPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Internal Getter for IssuerToken.
     * (Online) The token or payment URL provided by the payment provider for the consumer to
     * execute.
     * @return Returns the Internal String
     */
    @JsonGetter("issuer_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIssuerToken() {
        return this.issuerToken;
    }

    /**
     * Getter for IssuerToken.
     * (Online) The token or payment URL provided by the payment provider for the consumer to
     * execute.
     * @return Returns the String
     */
    public String getIssuerToken() {
        return OptionalNullable.getFrom(issuerToken);
    }

    /**
     * Setter for IssuerToken.
     * (Online) The token or payment URL provided by the payment provider for the consumer to
     * execute.
     * @param issuerToken Value for String
     */
    @JsonSetter("issuer_token")
    public void setIssuerToken(String issuerToken) {
        this.issuerToken = OptionalNullable.of(issuerToken);
    }

    /**
     * UnSetter for IssuerToken.
     * (Online) The token or payment URL provided by the payment provider for the consumer to
     * execute.
     */
    public void unsetIssuerToken() {
        issuerToken = null;
    }

    /**
     * Internal Getter for CallMethod.
     * (Online) How the client should execute the token. - `sdk` / `app`: Direct use in native app
     * environments/SDKs. - `web`: Direct use in special extended browser environments. - `http_get`
     * / `http_post`: Execute directly in a new browser window or iframe.
     * @return Returns the Internal IssuerTokenCallMethod
     */
    @JsonGetter("call_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<IssuerTokenCallMethod> internalGetCallMethod() {
        return this.callMethod;
    }

    /**
     * Getter for CallMethod.
     * (Online) How the client should execute the token. - `sdk` / `app`: Direct use in native app
     * environments/SDKs. - `web`: Direct use in special extended browser environments. - `http_get`
     * / `http_post`: Execute directly in a new browser window or iframe.
     * @return Returns the IssuerTokenCallMethod
     */
    public IssuerTokenCallMethod getCallMethod() {
        return OptionalNullable.getFrom(callMethod);
    }

    /**
     * Setter for CallMethod.
     * (Online) How the client should execute the token. - `sdk` / `app`: Direct use in native app
     * environments/SDKs. - `web`: Direct use in special extended browser environments. - `http_get`
     * / `http_post`: Execute directly in a new browser window or iframe.
     * @param callMethod Value for IssuerTokenCallMethod
     */
    @JsonSetter("call_method")
    public void setCallMethod(IssuerTokenCallMethod callMethod) {
        this.callMethod = OptionalNullable.of(callMethod);
    }

    /**
     * UnSetter for CallMethod.
     * (Online) How the client should execute the token. - `sdk` / `app`: Direct use in native app
     * environments/SDKs. - `web`: Direct use in special extended browser environments. - `http_get`
     * / `http_post`: Execute directly in a new browser window or iframe.
     */
    public void unsetCallMethod() {
        callMethod = null;
    }

    /**
     * Internal Getter for Payload.
     * Key-value pairs required to complete the payment action, or null if not applicable. Used when
     * `call_method` is `http_post`. When present, this JSON must be converted by the client to
     * match the expected `content_type` (e.g., transformed into an
     * `application/x-www-form-urlencoded` string) before sending the POST request.
     * @return Returns the Internal IssuerTokenPayload
     */
    @JsonGetter("payload")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<IssuerTokenPayload> internalGetPayload() {
        return this.payload;
    }

    /**
     * Getter for Payload.
     * Key-value pairs required to complete the payment action, or null if not applicable. Used when
     * `call_method` is `http_post`. When present, this JSON must be converted by the client to
     * match the expected `content_type` (e.g., transformed into an
     * `application/x-www-form-urlencoded` string) before sending the POST request.
     * @return Returns the IssuerTokenPayload
     */
    public IssuerTokenPayload getPayload() {
        return OptionalNullable.getFrom(payload);
    }

    /**
     * Setter for Payload.
     * Key-value pairs required to complete the payment action, or null if not applicable. Used when
     * `call_method` is `http_post`. When present, this JSON must be converted by the client to
     * match the expected `content_type` (e.g., transformed into an
     * `application/x-www-form-urlencoded` string) before sending the POST request.
     * @param payload Value for IssuerTokenPayload
     */
    @JsonSetter("payload")
    public void setPayload(IssuerTokenPayload payload) {
        this.payload = OptionalNullable.of(payload);
    }

    /**
     * UnSetter for Payload.
     * Key-value pairs required to complete the payment action, or null if not applicable. Used when
     * `call_method` is `http_post`. When present, this JSON must be converted by the client to
     * match the expected `content_type` (e.g., transformed into an
     * `application/x-www-form-urlencoded` string) before sending the POST request.
     */
    public void unsetPayload() {
        payload = null;
    }

    /**
     * Internal Getter for AccountId.
     * (Bank Transfer) Unique ID of the bank account issued by the connected system.
     * @return Returns the Internal String
     */
    @JsonGetter("account_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountId() {
        return this.accountId;
    }

    /**
     * Getter for AccountId.
     * (Bank Transfer) Unique ID of the bank account issued by the connected system.
     * @return Returns the String
     */
    public String getAccountId() {
        return OptionalNullable.getFrom(accountId);
    }

    /**
     * Setter for AccountId.
     * (Bank Transfer) Unique ID of the bank account issued by the connected system.
     * @param accountId Value for String
     */
    @JsonSetter("account_id")
    public void setAccountId(String accountId) {
        this.accountId = OptionalNullable.of(accountId);
    }

    /**
     * UnSetter for AccountId.
     * (Bank Transfer) Unique ID of the bank account issued by the connected system.
     */
    public void unsetAccountId() {
        accountId = null;
    }

    /**
     * Internal Getter for BranchCode.
     * (Bank Transfer) Branch code.
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
     * (Bank Transfer) Branch code.
     * @return Returns the String
     */
    public String getBranchCode() {
        return OptionalNullable.getFrom(branchCode);
    }

    /**
     * Setter for BranchCode.
     * (Bank Transfer) Branch code.
     * @param branchCode Value for String
     */
    @JsonSetter("branch_code")
    public void setBranchCode(String branchCode) {
        this.branchCode = OptionalNullable.of(branchCode);
    }

    /**
     * UnSetter for BranchCode.
     * (Bank Transfer) Branch code.
     */
    public void unsetBranchCode() {
        branchCode = null;
    }

    /**
     * Internal Getter for BranchName.
     * (Bank Transfer) Branch name.
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
     * (Bank Transfer) Branch name.
     * @return Returns the String
     */
    public String getBranchName() {
        return OptionalNullable.getFrom(branchName);
    }

    /**
     * Setter for BranchName.
     * (Bank Transfer) Branch name.
     * @param branchName Value for String
     */
    @JsonSetter("branch_name")
    public void setBranchName(String branchName) {
        this.branchName = OptionalNullable.of(branchName);
    }

    /**
     * UnSetter for BranchName.
     * (Bank Transfer) Branch name.
     */
    public void unsetBranchName() {
        branchName = null;
    }

    /**
     * Internal Getter for AccountHolderName.
     * (Bank Transfer) Account holder name.
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
     * (Bank Transfer) Account holder name.
     * @return Returns the String
     */
    public String getAccountHolderName() {
        return OptionalNullable.getFrom(accountHolderName);
    }

    /**
     * Setter for AccountHolderName.
     * (Bank Transfer) Account holder name.
     * @param accountHolderName Value for String
     */
    @JsonSetter("account_holder_name")
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = OptionalNullable.of(accountHolderName);
    }

    /**
     * UnSetter for AccountHolderName.
     * (Bank Transfer) Account holder name.
     */
    public void unsetAccountHolderName() {
        accountHolderName = null;
    }

    /**
     * Internal Getter for AccountNumber.
     * (Bank Transfer) Account number.
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
     * (Bank Transfer) Account number.
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * (Bank Transfer) Account number.
     * @param accountNumber Value for String
     */
    @JsonSetter("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * (Bank Transfer) Account number.
     */
    public void unsetAccountNumber() {
        accountNumber = null;
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
     * Converts this IssuerToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssuerToken [" + "paymentType=" + paymentType + ", issuerToken=" + issuerToken
                + ", callMethod=" + callMethod + ", payload=" + payload + ", accountId=" + accountId
                + ", branchCode=" + branchCode + ", branchName=" + branchName
                + ", accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link IssuerToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssuerToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentType);
        builder.issuerToken = internalGetIssuerToken();
        builder.callMethod = internalGetCallMethod();
        builder.payload = internalGetPayload();
        builder.accountId = internalGetAccountId();
        builder.branchCode = internalGetBranchCode();
        builder.branchName = internalGetBranchName();
        builder.accountHolderName = internalGetAccountHolderName();
        builder.accountNumber = internalGetAccountNumber();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link IssuerToken}.
     */
    public static class Builder {
        private IssuerTokenPaymentType paymentType;
        private OptionalNullable<String> issuerToken;
        private OptionalNullable<IssuerTokenCallMethod> callMethod;
        private OptionalNullable<IssuerTokenPayload> payload;
        private OptionalNullable<String> accountId;
        private OptionalNullable<String> branchCode;
        private OptionalNullable<String> branchName;
        private OptionalNullable<String> accountHolderName;
        private OptionalNullable<String> accountNumber;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentType  IssuerTokenPaymentType value for paymentType.
         */
        public Builder(IssuerTokenPaymentType paymentType) {
            this.paymentType = paymentType;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  IssuerTokenPaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(IssuerTokenPaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for issuerToken.
         * @param  issuerToken  String value for issuerToken.
         * @return Builder
         */
        public Builder issuerToken(String issuerToken) {
            this.issuerToken = OptionalNullable.of(issuerToken);
            return this;
        }

        /**
         * UnSetter for issuerToken.
         * @return Builder
         */
        public Builder unsetIssuerToken() {
            issuerToken = null;
            return this;
        }

        /**
         * Setter for callMethod.
         * @param  callMethod  IssuerTokenCallMethod value for callMethod.
         * @return Builder
         */
        public Builder callMethod(IssuerTokenCallMethod callMethod) {
            this.callMethod = OptionalNullable.of(callMethod);
            return this;
        }

        /**
         * UnSetter for callMethod.
         * @return Builder
         */
        public Builder unsetCallMethod() {
            callMethod = null;
            return this;
        }

        /**
         * Setter for payload.
         * @param  payload  IssuerTokenPayload value for payload.
         * @return Builder
         */
        public Builder payload(IssuerTokenPayload payload) {
            this.payload = OptionalNullable.of(payload);
            return this;
        }

        /**
         * UnSetter for payload.
         * @return Builder
         */
        public Builder unsetPayload() {
            payload = null;
            return this;
        }

        /**
         * Setter for accountId.
         * @param  accountId  String value for accountId.
         * @return Builder
         */
        public Builder accountId(String accountId) {
            this.accountId = OptionalNullable.of(accountId);
            return this;
        }

        /**
         * UnSetter for accountId.
         * @return Builder
         */
        public Builder unsetAccountId() {
            accountId = null;
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
         * Builds a new {@link IssuerToken} object using the set fields.
         * @return {@link IssuerToken}
         */
        public IssuerToken build() {
            IssuerToken model =
                    new IssuerToken(paymentType, issuerToken, callMethod, payload, accountId,
                            branchCode, branchName, accountHolderName, accountNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
