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
 * This is a model class for CustomsDeclarationWebhookCallbackExtension type.
 */
public class CustomsDeclarationWebhookCallbackExtension {
    private CustomsDeclarationWebhookData data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CustomsDeclarationWebhookCallbackExtension() {
    }

    /**
     * Initialization constructor.
     * @param  data  CustomsDeclarationWebhookData value for data.
     */
    public CustomsDeclarationWebhookCallbackExtension(
            CustomsDeclarationWebhookData data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Customs declaration payload delivered in `customs_declaration_finished` webhooks.
     * Platform-level deliveries may include `platform_id` and `updated_on`.
     * @return Returns the CustomsDeclarationWebhookData
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomsDeclarationWebhookData getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Customs declaration payload delivered in `customs_declaration_finished` webhooks.
     * Platform-level deliveries may include `platform_id` and `updated_on`.
     * @param data Value for CustomsDeclarationWebhookData
     */
    @JsonSetter("data")
    public void setData(CustomsDeclarationWebhookData data) {
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
     * Converts this CustomsDeclarationWebhookCallbackExtension into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomsDeclarationWebhookCallbackExtension [" + "data=" + data
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CustomsDeclarationWebhookCallbackExtension.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomsDeclarationWebhookCallbackExtension.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CustomsDeclarationWebhookCallbackExtension}.
     */
    public static class Builder {
        private CustomsDeclarationWebhookData data;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for data.
         * @param  data  CustomsDeclarationWebhookData value for data.
         * @return Builder
         */
        public Builder data(CustomsDeclarationWebhookData data) {
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
         * Builds a new {@link CustomsDeclarationWebhookCallbackExtension} object using the set
         * fields.
         * @return {@link CustomsDeclarationWebhookCallbackExtension}
         */
        public CustomsDeclarationWebhookCallbackExtension build() {
            CustomsDeclarationWebhookCallbackExtension model =
                    new CustomsDeclarationWebhookCallbackExtension(data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
