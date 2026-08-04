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
import com.univapay.api.models.containers.TransactionTokenCreateRequestData;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TransactionTokenCreateRequest type.
 */
public class TransactionTokenCreateRequest {
    private TransactionTokenCreateRequestPaymentType paymentType;
    private TransactionTokenCreateRequestType type;
    private String email;
    private String usageLimit;
    private String ipAddress;
    private TransactionTokenCreateRequestMetadata metadata;
    private TransactionTokenCreateRequestData data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionTokenCreateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentType  TransactionTokenCreateRequestPaymentType value for paymentType.
     * @param  type  TransactionTokenCreateRequestType value for type.
     * @param  data  TransactionTokenCreateRequestData value for data.
     * @param  email  String value for email.
     * @param  usageLimit  String value for usageLimit.
     * @param  ipAddress  String value for ipAddress.
     * @param  metadata  TransactionTokenCreateRequestMetadata value for metadata.
     */
    public TransactionTokenCreateRequest(
            TransactionTokenCreateRequestPaymentType paymentType,
            TransactionTokenCreateRequestType type,
            TransactionTokenCreateRequestData data,
            String email,
            String usageLimit,
            String ipAddress,
            TransactionTokenCreateRequestMetadata metadata) {
        this.paymentType = paymentType;
        this.type = type;
        this.email = email;
        this.usageLimit = usageLimit;
        this.ipAddress = ipAddress;
        this.metadata = metadata;
        this.data = data;
    }

    /**
     * Getter for PaymentType.
     * Transaction Token Create Request Payment Type schema.
     * @return Returns the TransactionTokenCreateRequestPaymentType
     */
    @JsonGetter("payment_type")
    public TransactionTokenCreateRequestPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Transaction Token Create Request Payment Type schema.
     * @param paymentType Value for TransactionTokenCreateRequestPaymentType
     */
    @JsonSetter("payment_type")
    public void setPaymentType(TransactionTokenCreateRequestPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for Type.
     * Transaction Token Create Request Type schema.
     * @return Returns the TransactionTokenCreateRequestType
     */
    @JsonGetter("type")
    public TransactionTokenCreateRequestType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Transaction Token Create Request Type schema.
     * @param type Value for TransactionTokenCreateRequestType
     */
    @JsonSetter("type")
    public void setType(TransactionTokenCreateRequestType type) {
        this.type = type;
    }

    /**
     * Getter for Email.
     * Customer email address.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Customer email address.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for UsageLimit.
     * Usage limit applied to the token.
     * @return Returns the String
     */
    @JsonGetter("usage_limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsageLimit() {
        return usageLimit;
    }

    /**
     * Setter for UsageLimit.
     * Usage limit applied to the token.
     * @param usageLimit Value for String
     */
    @JsonSetter("usage_limit")
    public void setUsageLimit(String usageLimit) {
        this.usageLimit = usageLimit;
    }

    /**
     * Getter for IpAddress.
     * Consumer's IPv4 address. **Required** when `data.brand` is `we_chat_online` and
     * `data.call_method` is `web` or `http_get`.
     * @return Returns the String
     */
    @JsonGetter("ip_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter for IpAddress.
     * Consumer's IPv4 address. **Required** when `data.brand` is `we_chat_online` and
     * `data.call_method` is `web` or `http_get`.
     * @param ipAddress Value for String
     */
    @JsonSetter("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Getter for Metadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the TransactionTokenCreateRequestMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionTokenCreateRequestMetadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * A free-form dictionary for custom metadata.
     * @param metadata Value for TransactionTokenCreateRequestMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(TransactionTokenCreateRequestMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Data.
     * Transaction Token Create Request Data schema.
     * @return Returns the TransactionTokenCreateRequestData
     */
    @JsonGetter("data")
    public TransactionTokenCreateRequestData getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Transaction Token Create Request Data schema.
     * @param data Value for TransactionTokenCreateRequestData
     */
    @JsonSetter("data")
    public void setData(TransactionTokenCreateRequestData data) {
        this.data = data;
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
     * Converts this TransactionTokenCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionTokenCreateRequest [" + "paymentType=" + paymentType + ", type=" + type
                + ", data=" + data + ", email=" + email + ", usageLimit=" + usageLimit
                + ", ipAddress=" + ipAddress + ", metadata=" + metadata + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionTokenCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionTokenCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentType, type, data)
                .email(getEmail())
                .usageLimit(getUsageLimit())
                .ipAddress(getIpAddress())
                .metadata(getMetadata());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionTokenCreateRequest}.
     */
    public static class Builder {
        private TransactionTokenCreateRequestPaymentType paymentType;
        private TransactionTokenCreateRequestType type;
        private TransactionTokenCreateRequestData data;
        private String email;
        private String usageLimit;
        private String ipAddress;
        private TransactionTokenCreateRequestMetadata metadata;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentType  TransactionTokenCreateRequestPaymentType value for paymentType.
         * @param  type  TransactionTokenCreateRequestType value for type.
         * @param  data  TransactionTokenCreateRequestData value for data.
         */
        public Builder(TransactionTokenCreateRequestPaymentType paymentType,
                TransactionTokenCreateRequestType type, TransactionTokenCreateRequestData data) {
            this.paymentType = paymentType;
            this.type = type;
            this.data = data;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  TransactionTokenCreateRequestPaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(TransactionTokenCreateRequestPaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  TransactionTokenCreateRequestType value for type.
         * @return Builder
         */
        public Builder type(TransactionTokenCreateRequestType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  TransactionTokenCreateRequestData value for data.
         * @return Builder
         */
        public Builder data(TransactionTokenCreateRequestData data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for usageLimit.
         * @param  usageLimit  String value for usageLimit.
         * @return Builder
         */
        public Builder usageLimit(String usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }

        /**
         * Setter for ipAddress.
         * @param  ipAddress  String value for ipAddress.
         * @return Builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  TransactionTokenCreateRequestMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(TransactionTokenCreateRequestMetadata metadata) {
            this.metadata = metadata;
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
         * Builds a new {@link TransactionTokenCreateRequest} object using the set fields.
         * @return {@link TransactionTokenCreateRequest}
         */
        public TransactionTokenCreateRequest build() {
            TransactionTokenCreateRequest model =
                    new TransactionTokenCreateRequest(paymentType, type, data, email, usageLimit,
                            ipAddress, metadata);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
