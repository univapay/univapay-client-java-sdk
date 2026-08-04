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
 * This is a model class for RefundUpdateRequest type.
 */
public class RefundUpdateRequest {
    private GenericMetadata metadata;
    private OptionalNullable<String> message;
    private OptionalNullable<RefundReasonRequest> reason;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public RefundUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  message  String value for message.
     * @param  reason  RefundReasonRequest value for reason.
     */
    public RefundUpdateRequest(
            GenericMetadata metadata,
            String message,
            RefundReasonRequest reason) {
        this.metadata = metadata;
        this.message = OptionalNullable.of(message);
        this.reason = OptionalNullable.of(reason);
    }

    /**
     * Initialization constructor.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  message  String value for message.
     * @param  reason  RefundReasonRequest value for reason.
     */

    protected RefundUpdateRequest(GenericMetadata metadata, OptionalNullable<String> message,
            OptionalNullable<RefundReasonRequest> reason) {
        this.metadata = metadata;
        this.message = message;
        this.reason = reason;
    }

    /**
     * Getter for Metadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the GenericMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GenericMetadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * A free-form dictionary for custom metadata.
     * @param metadata Value for GenericMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(GenericMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Internal Getter for Message.
     * Update or clear the refund note. Send `null` to remove.
     * @return Returns the Internal String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMessage() {
        return this.message;
    }

    /**
     * Getter for Message.
     * Update or clear the refund note. Send `null` to remove.
     * @return Returns the String
     */
    public String getMessage() {
        return OptionalNullable.getFrom(message);
    }

    /**
     * Setter for Message.
     * Update or clear the refund note. Send `null` to remove.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = OptionalNullable.of(message);
    }

    /**
     * UnSetter for Message.
     * Update or clear the refund note. Send `null` to remove.
     */
    public void unsetMessage() {
        message = null;
    }

    /**
     * Internal Getter for Reason.
     * Merchant-settable refund reason, or `null` to remove it during update.
     * @return Returns the Internal RefundReasonRequest
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<RefundReasonRequest> internalGetReason() {
        return this.reason;
    }

    /**
     * Getter for Reason.
     * Merchant-settable refund reason, or `null` to remove it during update.
     * @return Returns the RefundReasonRequest
     */
    public RefundReasonRequest getReason() {
        return OptionalNullable.getFrom(reason);
    }

    /**
     * Setter for Reason.
     * Merchant-settable refund reason, or `null` to remove it during update.
     * @param reason Value for RefundReasonRequest
     */
    @JsonSetter("reason")
    public void setReason(RefundReasonRequest reason) {
        this.reason = OptionalNullable.of(reason);
    }

    /**
     * UnSetter for Reason.
     * Merchant-settable refund reason, or `null` to remove it during update.
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
     * Converts this RefundUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundUpdateRequest [" + "metadata=" + metadata + ", message=" + message
                + ", reason=" + reason + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link RefundUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .metadata(getMetadata());
        builder.message = internalGetMessage();
        builder.reason = internalGetReason();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link RefundUpdateRequest}.
     */
    public static class Builder {
        private GenericMetadata metadata;
        private OptionalNullable<String> message;
        private OptionalNullable<RefundReasonRequest> reason;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for metadata.
         * @param  metadata  GenericMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(GenericMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = OptionalNullable.of(message);
            return this;
        }

        /**
         * UnSetter for message.
         * @return Builder
         */
        public Builder unsetMessage() {
            message = null;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  RefundReasonRequest value for reason.
         * @return Builder
         */
        public Builder reason(RefundReasonRequest reason) {
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
         * Builds a new {@link RefundUpdateRequest} object using the set fields.
         * @return {@link RefundUpdateRequest}
         */
        public RefundUpdateRequest build() {
            RefundUpdateRequest model =
                    new RefundUpdateRequest(metadata, message, reason);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
