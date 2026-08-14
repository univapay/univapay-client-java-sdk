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
 * This is a model class for DirectDebitBankTransferCreateRequest type.
 */
public class DirectDebitBankTransferCreateRequest {
    private long amount;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitBankTransferCreateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  amount  long value for amount.
     */
    public DirectDebitBankTransferCreateRequest(
            long amount) {
        this.amount = amount;
    }

    /**
     * Getter for Amount.
     * Transfer amount in JPY. Must be a positive, non-zero whole number.
     * @return Returns the long
     */
    @JsonGetter("amount")
    public long getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Transfer amount in JPY. Must be a positive, non-zero whole number.
     * @param amount Value for long
     */
    @JsonSetter("amount")
    public void setAmount(long amount) {
        this.amount = amount;
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
     * Converts this DirectDebitBankTransferCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitBankTransferCreateRequest [" + "amount=" + amount
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link DirectDebitBankTransferCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitBankTransferCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitBankTransferCreateRequest}.
     */
    public static class Builder {
        private long amount;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  long value for amount.
         */
        public Builder(long amount) {
            this.amount = amount;
        }

        /**
         * Setter for amount.
         * @param  amount  long value for amount.
         * @return Builder
         */
        public Builder amount(long amount) {
            this.amount = amount;
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
         * Builds a new {@link DirectDebitBankTransferCreateRequest} object using the set fields.
         * @return {@link DirectDebitBankTransferCreateRequest}
         */
        public DirectDebitBankTransferCreateRequest build() {
            DirectDebitBankTransferCreateRequest model =
                    new DirectDebitBankTransferCreateRequest(amount);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
