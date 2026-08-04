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
import java.util.UUID;

/**
 * This is a model class for CustomsDeclarationWebhookOtherError type.
 */
public class CustomsDeclarationWebhookOtherError {
    private String type;
    private OptionalNullable<UUID> credentialsId;
    private OptionalNullable<List<String>> message;
    private OptionalNullable<String> itemName;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CustomsDeclarationWebhookOtherError() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  credentialsId  UUID value for credentialsId.
     * @param  message  List of String value for message.
     * @param  itemName  String value for itemName.
     */
    public CustomsDeclarationWebhookOtherError(
            String type,
            UUID credentialsId,
            List<String> message,
            String itemName) {
        this.type = type;
        this.credentialsId = OptionalNullable.of(credentialsId);
        this.message = OptionalNullable.of(message);
        this.itemName = OptionalNullable.of(itemName);
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  credentialsId  UUID value for credentialsId.
     * @param  message  List of String value for message.
     * @param  itemName  String value for itemName.
     */

    protected CustomsDeclarationWebhookOtherError(String type, OptionalNullable<UUID> credentialsId,
            OptionalNullable<List<String>> message, OptionalNullable<String> itemName) {
        this.type = type;
        this.credentialsId = credentialsId;
        this.message = message;
        this.itemName = itemName;
    }

    /**
     * Getter for Type.
     * Backend other-error type.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Backend other-error type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Internal Getter for CredentialsId.
     * Gateway credentials involved in the error when applicable.
     * @return Returns the Internal UUID
     */
    @JsonGetter("credentials_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetCredentialsId() {
        return this.credentialsId;
    }

    /**
     * Getter for CredentialsId.
     * Gateway credentials involved in the error when applicable.
     * @return Returns the UUID
     */
    public UUID getCredentialsId() {
        return OptionalNullable.getFrom(credentialsId);
    }

    /**
     * Setter for CredentialsId.
     * Gateway credentials involved in the error when applicable.
     * @param credentialsId Value for UUID
     */
    @JsonSetter("credentials_id")
    public void setCredentialsId(UUID credentialsId) {
        this.credentialsId = OptionalNullable.of(credentialsId);
    }

    /**
     * UnSetter for CredentialsId.
     * Gateway credentials involved in the error when applicable.
     */
    public void unsetCredentialsId() {
        credentialsId = null;
    }

    /**
     * Internal Getter for Message.
     * Additional reason values for `not_selected_reasons`.
     * @return Returns the Internal List of String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetMessage() {
        return this.message;
    }

    /**
     * Getter for Message.
     * Additional reason values for `not_selected_reasons`.
     * @return Returns the List of String
     */
    public List<String> getMessage() {
        return OptionalNullable.getFrom(message);
    }

    /**
     * Setter for Message.
     * Additional reason values for `not_selected_reasons`.
     * @param message Value for List of String
     */
    @JsonSetter("message")
    public void setMessage(List<String> message) {
        this.message = OptionalNullable.of(message);
    }

    /**
     * UnSetter for Message.
     * Additional reason values for `not_selected_reasons`.
     */
    public void unsetMessage() {
        message = null;
    }

    /**
     * Internal Getter for ItemName.
     * Related item name for `related_item`.
     * @return Returns the Internal String
     */
    @JsonGetter("item_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetItemName() {
        return this.itemName;
    }

    /**
     * Getter for ItemName.
     * Related item name for `related_item`.
     * @return Returns the String
     */
    public String getItemName() {
        return OptionalNullable.getFrom(itemName);
    }

    /**
     * Setter for ItemName.
     * Related item name for `related_item`.
     * @param itemName Value for String
     */
    @JsonSetter("item_name")
    public void setItemName(String itemName) {
        this.itemName = OptionalNullable.of(itemName);
    }

    /**
     * UnSetter for ItemName.
     * Related item name for `related_item`.
     */
    public void unsetItemName() {
        itemName = null;
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
     * Converts this CustomsDeclarationWebhookOtherError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomsDeclarationWebhookOtherError [" + "type=" + type + ", credentialsId="
                + credentialsId + ", message=" + message + ", itemName=" + itemName
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CustomsDeclarationWebhookOtherError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomsDeclarationWebhookOtherError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType());
        builder.credentialsId = internalGetCredentialsId();
        builder.message = internalGetMessage();
        builder.itemName = internalGetItemName();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CustomsDeclarationWebhookOtherError}.
     */
    public static class Builder {
        private String type;
        private OptionalNullable<UUID> credentialsId;
        private OptionalNullable<List<String>> message;
        private OptionalNullable<String> itemName;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for credentialsId.
         * @param  credentialsId  UUID value for credentialsId.
         * @return Builder
         */
        public Builder credentialsId(UUID credentialsId) {
            this.credentialsId = OptionalNullable.of(credentialsId);
            return this;
        }

        /**
         * UnSetter for credentialsId.
         * @return Builder
         */
        public Builder unsetCredentialsId() {
            credentialsId = null;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  List of String value for message.
         * @return Builder
         */
        public Builder message(List<String> message) {
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
         * Setter for itemName.
         * @param  itemName  String value for itemName.
         * @return Builder
         */
        public Builder itemName(String itemName) {
            this.itemName = OptionalNullable.of(itemName);
            return this;
        }

        /**
         * UnSetter for itemName.
         * @return Builder
         */
        public Builder unsetItemName() {
            itemName = null;
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
         * Builds a new {@link CustomsDeclarationWebhookOtherError} object using the set fields.
         * @return {@link CustomsDeclarationWebhookOtherError}
         */
        public CustomsDeclarationWebhookOtherError build() {
            CustomsDeclarationWebhookOtherError model =
                    new CustomsDeclarationWebhookOtherError(type, credentialsId, message, itemName);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
