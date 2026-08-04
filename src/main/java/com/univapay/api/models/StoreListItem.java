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
 * This is a model class for StoreListItem type.
 */
public class StoreListItem {
    private UUID id;
    private String name;
    private String merchantName;
    private LocalDateTime createdOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public StoreListItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  name  String value for name.
     * @param  merchantName  String value for merchantName.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    public StoreListItem(
            UUID id,
            String name,
            String merchantName,
            LocalDateTime createdOn) {
        this.id = id;
        this.name = name;
        this.merchantName = merchantName;
        this.createdOn = createdOn;
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
     * Getter for MerchantName.
     * Merchant display name associated with the store row.
     * @return Returns the String
     */
    @JsonGetter("merchant_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Setter for MerchantName.
     * Merchant display name associated with the store row.
     * @param merchantName Value for String
     */
    @JsonSetter("merchant_name")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
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
     * Converts this StoreListItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StoreListItem [" + "id=" + id + ", name=" + name + ", merchantName=" + merchantName
                + ", createdOn=" + createdOn + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link StoreListItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StoreListItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .merchantName(getMerchantName())
                .createdOn(getCreatedOn());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link StoreListItem}.
     */
    public static class Builder {
        private UUID id;
        private String name;
        private String merchantName;
        private LocalDateTime createdOn;
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
         * Setter for merchantName.
         * @param  merchantName  String value for merchantName.
         * @return Builder
         */
        public Builder merchantName(String merchantName) {
            this.merchantName = merchantName;
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
         * Builds a new {@link StoreListItem} object using the set fields.
         * @return {@link StoreListItem}
         */
        public StoreListItem build() {
            StoreListItem model =
                    new StoreListItem(id, name, merchantName, createdOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
