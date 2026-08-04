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
import java.util.UUID;

/**
 * This is a model class for SubscriptionPatchTokenRequest type.
 */
public class SubscriptionPatchTokenRequest {
    private UUID transactionTokenId;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionPatchTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     */
    public SubscriptionPatchTokenRequest(
            UUID transactionTokenId) {
        this.transactionTokenId = transactionTokenId;
    }

    /**
     * Getter for TransactionTokenId.
     * The ID of the new transaction token to use for future subscription payments. Must be a
     * recurring or subscription-type token for the same store.
     * @return Returns the UUID
     */
    @JsonGetter("transaction_token_id")
    public UUID getTransactionTokenId() {
        return transactionTokenId;
    }

    /**
     * Setter for TransactionTokenId.
     * The ID of the new transaction token to use for future subscription payments. Must be a
     * recurring or subscription-type token for the same store.
     * @param transactionTokenId Value for UUID
     */
    @JsonSetter("transaction_token_id")
    public void setTransactionTokenId(UUID transactionTokenId) {
        this.transactionTokenId = transactionTokenId;
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
     * Converts this SubscriptionPatchTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionPatchTokenRequest [" + "transactionTokenId=" + transactionTokenId
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionPatchTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionPatchTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(transactionTokenId);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionPatchTokenRequest}.
     */
    public static class Builder {
        private UUID transactionTokenId;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  transactionTokenId  UUID value for transactionTokenId.
         */
        public Builder(UUID transactionTokenId) {
            this.transactionTokenId = transactionTokenId;
        }

        /**
         * Setter for transactionTokenId.
         * @param  transactionTokenId  UUID value for transactionTokenId.
         * @return Builder
         */
        public Builder transactionTokenId(UUID transactionTokenId) {
            this.transactionTokenId = transactionTokenId;
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
         * Builds a new {@link SubscriptionPatchTokenRequest} object using the set fields.
         * @return {@link SubscriptionPatchTokenRequest}
         */
        public SubscriptionPatchTokenRequest build() {
            SubscriptionPatchTokenRequest model =
                    new SubscriptionPatchTokenRequest(transactionTokenId);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
