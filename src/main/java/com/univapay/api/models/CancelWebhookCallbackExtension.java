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
 * This is a model class for CancelWebhookCallbackExtension type.
 */
public class CancelWebhookCallbackExtension {
    private Cancel data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CancelWebhookCallbackExtension() {
    }

    /**
     * Initialization constructor.
     * @param  data  Cancel value for data.
     */
    public CancelWebhookCallbackExtension(
            Cancel data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Represents a cancellation request for a charge.
     * @return Returns the Cancel
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Cancel getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Represents a cancellation request for a charge.
     * @param data Value for Cancel
     */
    @JsonSetter("data")
    public void setData(Cancel data) {
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
     * Converts this CancelWebhookCallbackExtension into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancelWebhookCallbackExtension [" + "data=" + data + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CancelWebhookCallbackExtension.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancelWebhookCallbackExtension.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CancelWebhookCallbackExtension}.
     */
    public static class Builder {
        private Cancel data;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for data.
         * @param  data  Cancel value for data.
         * @return Builder
         */
        public Builder data(Cancel data) {
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
         * Builds a new {@link CancelWebhookCallbackExtension} object using the set fields.
         * @return {@link CancelWebhookCallbackExtension}
         */
        public CancelWebhookCallbackExtension build() {
            CancelWebhookCallbackExtension model =
                    new CancelWebhookCallbackExtension(data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
