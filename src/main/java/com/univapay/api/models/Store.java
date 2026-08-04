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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.univapay.api.DateTimeHelper;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for Store type.
 */
public class Store {
    private UUID id;
    private String name;
    private LocalDateTime createdOn;
    private MerchantWebhookConfiguration configuration;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public Store() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  name  String value for name.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  configuration  MerchantWebhookConfiguration value for configuration.
     */
    public Store(
            UUID id,
            String name,
            LocalDateTime createdOn,
            MerchantWebhookConfiguration configuration) {
        this.id = id;
        this.name = name;
        this.createdOn = createdOn;
        this.configuration = configuration;
    }

    /**
     * Getter for Id.
     * Store identifier.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Store identifier.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * Store display name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Store display name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the store was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn.
     * Timestamp when the store was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for Configuration.
     * Store-scoped configuration snapshot serialized by gyron-payments-api. It uses the same
     * flattened serializer as merchant configuration, but omits `transfer_schedule`.
     * @return Returns the MerchantWebhookConfiguration
     */
    @JsonGetter("configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Setter for Configuration.
     * Store-scoped configuration snapshot serialized by gyron-payments-api. It uses the same
     * flattened serializer as merchant configuration, but omits `transfer_schedule`.
     * @param configuration Value for MerchantWebhookConfiguration
     */
    @JsonSetter("configuration")
    public void setConfiguration(MerchantWebhookConfiguration configuration) {
        this.configuration = configuration;
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
     * Converts this Store into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Store [" + "id=" + id + ", name=" + name + ", createdOn=" + createdOn
                + ", configuration=" + configuration + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link Store.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Store.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .createdOn(getCreatedOn())
                .configuration(getConfiguration());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link Store}.
     */
    public static class Builder {
        private UUID id;
        private String name;
        private LocalDateTime createdOn;
        private MerchantWebhookConfiguration configuration;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for id.
         * @param  id  UUID value for id.
         * @return Builder
         */
        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for configuration.
         * @param  configuration  MerchantWebhookConfiguration value for configuration.
         * @return Builder
         */
        public Builder configuration(MerchantWebhookConfiguration configuration) {
            this.configuration = configuration;
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
         * Builds a new {@link Store} object using the set fields.
         * @return {@link Store}
         */
        public Store build() {
            Store model =
                    new Store(id, name, createdOn, configuration);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
