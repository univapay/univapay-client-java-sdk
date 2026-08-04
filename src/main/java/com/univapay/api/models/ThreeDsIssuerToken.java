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
 * This is a model class for ThreeDsIssuerToken type.
 */
public class ThreeDsIssuerToken {
    private String paymentType;
    private String issuerToken;
    private String callMethod;
    private OptionalNullable<IssuerTokenPayload> payload;
    private String contentType;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ThreeDsIssuerToken() {
        paymentType = "card";
        callMethod = "http_post";
    }

    /**
     * Initialization constructor.
     * @param  paymentType  String value for paymentType.
     * @param  issuerToken  String value for issuerToken.
     * @param  callMethod  String value for callMethod.
     * @param  contentType  String value for contentType.
     * @param  payload  IssuerTokenPayload value for payload.
     */
    public ThreeDsIssuerToken(
            String paymentType,
            String issuerToken,
            String callMethod,
            String contentType,
            IssuerTokenPayload payload) {
        this.paymentType = paymentType;
        this.issuerToken = issuerToken;
        this.callMethod = callMethod;
        this.payload = OptionalNullable.of(payload);
        this.contentType = contentType;
    }

    /**
     * Initialization constructor.
     * @param  paymentType  String value for paymentType.
     * @param  issuerToken  String value for issuerToken.
     * @param  callMethod  String value for callMethod.
     * @param  contentType  String value for contentType.
     * @param  payload  IssuerTokenPayload value for payload.
     */

    protected ThreeDsIssuerToken(String paymentType, String issuerToken, String callMethod,
            String contentType, OptionalNullable<IssuerTokenPayload> payload) {
        this.paymentType = paymentType;
        this.issuerToken = issuerToken;
        this.callMethod = callMethod;
        this.payload = payload;
        this.contentType = contentType;
    }

    /**
     * Getter for PaymentType.
     * Only 'card' is supported for 3-D Secure issuer tokens.
     * @return Returns the String
     */
    @JsonGetter("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Only 'card' is supported for 3-D Secure issuer tokens.
     * @param paymentType Value for String
     */
    @JsonSetter("payment_type")
    private void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for IssuerToken.
     * The 3-D Secure authentication URL to which the client must send the request.
     * @return Returns the String
     */
    @JsonGetter("issuer_token")
    public String getIssuerToken() {
        return issuerToken;
    }

    /**
     * Setter for IssuerToken.
     * The 3-D Secure authentication URL to which the client must send the request.
     * @param issuerToken Value for String
     */
    @JsonSetter("issuer_token")
    public void setIssuerToken(String issuerToken) {
        this.issuerToken = issuerToken;
    }

    /**
     * Getter for CallMethod.
     * Execution method. Currently, only 'http_post' is supported.
     * @return Returns the String
     */
    @JsonGetter("call_method")
    public String getCallMethod() {
        return callMethod;
    }

    /**
     * Setter for CallMethod.
     * Execution method. Currently, only 'http_post' is supported.
     * @param callMethod Value for String
     */
    @JsonSetter("call_method")
    private void setCallMethod(String callMethod) {
        this.callMethod = callMethod;
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
     * Getter for ContentType.
     * The expected content type of the payload required by the card issuer's endpoint (e.g.,
     * 'application/x-www-form-urlencoded; charset=UTF-8').
     * @return Returns the String
     */
    @JsonGetter("content_type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * The expected content type of the payload required by the card issuer's endpoint (e.g.,
     * 'application/x-www-form-urlencoded; charset=UTF-8').
     * @param contentType Value for String
     */
    @JsonSetter("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
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
     * Converts this ThreeDsIssuerToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ThreeDsIssuerToken [" + "paymentType=" + paymentType + ", issuerToken="
                + issuerToken + ", callMethod=" + callMethod + ", contentType=" + contentType
                + ", payload=" + payload + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ThreeDsIssuerToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ThreeDsIssuerToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentType, issuerToken, callMethod, contentType);
        builder.payload = internalGetPayload();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ThreeDsIssuerToken}.
     */
    public static class Builder {
        private String paymentType = "card";
        private String issuerToken;
        private String callMethod = "http_post";
        private String contentType;
        private OptionalNullable<IssuerTokenPayload> payload;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentType  String value for paymentType.
         * @param  issuerToken  String value for issuerToken.
         * @param  callMethod  String value for callMethod.
         * @param  contentType  String value for contentType.
         */
        public Builder(String paymentType, String issuerToken, String callMethod,
                String contentType) {
            this.paymentType = paymentType;
            this.issuerToken = issuerToken;
            this.callMethod = callMethod;
            this.contentType = contentType;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for issuerToken.
         * @param  issuerToken  String value for issuerToken.
         * @return Builder
         */
        public Builder issuerToken(String issuerToken) {
            this.issuerToken = issuerToken;
            return this;
        }

        /**
         * Setter for callMethod.
         * @param  callMethod  String value for callMethod.
         * @return Builder
         */
        public Builder callMethod(String callMethod) {
            this.callMethod = callMethod;
            return this;
        }

        /**
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
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
         * Builds a new {@link ThreeDsIssuerToken} object using the set fields.
         * @return {@link ThreeDsIssuerToken}
         */
        public ThreeDsIssuerToken build() {
            ThreeDsIssuerToken model =
                    new ThreeDsIssuerToken(paymentType, issuerToken, callMethod, contentType,
                            payload);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
