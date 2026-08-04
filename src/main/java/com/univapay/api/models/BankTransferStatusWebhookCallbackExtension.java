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
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for BankTransferStatusWebhookCallbackExtension type.
 */
public class BankTransferStatusWebhookCallbackExtension {
    private BankTransferStatusData data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public BankTransferStatusWebhookCallbackExtension() {
    }

    /**
     * Initialization constructor.
     * @param  data  BankTransferStatusData value for data.
     */
    public BankTransferStatusWebhookCallbackExtension(
            BankTransferStatusData data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Data payload for `bank_transfer_status_updated` webhook events. Contains the bank transfer
     * extension fields inlined alongside amount and metadata.
     * @return Returns the BankTransferStatusData
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankTransferStatusData getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Data payload for `bank_transfer_status_updated` webhook events. Contains the bank transfer
     * extension fields inlined alongside amount and metadata.
     * @param data Value for BankTransferStatusData
     */
    @JsonSetter("data")
    public void setData(BankTransferStatusData data) {
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
     * Converts this BankTransferStatusWebhookCallbackExtension into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankTransferStatusWebhookCallbackExtension [" + "data=" + data
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link BankTransferStatusWebhookCallbackExtension.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankTransferStatusWebhookCallbackExtension.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link BankTransferStatusWebhookCallbackExtension}.
     */
    public static class Builder {
        private BankTransferStatusData data;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for data.
         * @param  data  BankTransferStatusData value for data.
         * @return Builder
         */
        public Builder data(BankTransferStatusData data) {
            this.data = data;
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
         * Builds a new {@link BankTransferStatusWebhookCallbackExtension} object using the set
         * fields.
         * @return {@link BankTransferStatusWebhookCallbackExtension}
         */
        public BankTransferStatusWebhookCallbackExtension build() {
            BankTransferStatusWebhookCallbackExtension model =
                    new BankTransferStatusWebhookCallbackExtension(data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
