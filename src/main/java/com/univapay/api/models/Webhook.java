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
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for Webhook type.
 */
public class Webhook {
    private UUID id;
    private OptionalNullable<UUID> storeId;
    private OptionalNullable<UUID> merchantId;
    private List<WebhookTrigger> triggers;
    private String url;
    private OptionalNullable<String> authToken;
    private Boolean active;
    private Boolean isIntegration;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public Webhook() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  merchantId  UUID value for merchantId.
     * @param  triggers  List of WebhookTrigger value for triggers.
     * @param  url  String value for url.
     * @param  authToken  String value for authToken.
     * @param  active  Boolean value for active.
     * @param  isIntegration  Boolean value for isIntegration.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */
    public Webhook(
            UUID id,
            UUID storeId,
            UUID merchantId,
            List<WebhookTrigger> triggers,
            String url,
            String authToken,
            Boolean active,
            Boolean isIntegration,
            LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.storeId = OptionalNullable.of(storeId);
        this.merchantId = OptionalNullable.of(merchantId);
        this.triggers = triggers;
        this.url = url;
        this.authToken = OptionalNullable.of(authToken);
        this.active = active;
        this.isIntegration = isIntegration;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  merchantId  UUID value for merchantId.
     * @param  triggers  List of WebhookTrigger value for triggers.
     * @param  url  String value for url.
     * @param  authToken  String value for authToken.
     * @param  active  Boolean value for active.
     * @param  isIntegration  Boolean value for isIntegration.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */

    protected Webhook(UUID id, OptionalNullable<UUID> storeId, OptionalNullable<UUID> merchantId,
            List<WebhookTrigger> triggers, String url, OptionalNullable<String> authToken,
            Boolean active, Boolean isIntegration, LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.storeId = storeId;
        this.merchantId = merchantId;
        this.triggers = triggers;
        this.url = url;
        this.authToken = authToken;
        this.active = active;
        this.isIntegration = isIntegration;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for Id.
     * Unique identifier for the webhook.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier for the webhook.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Internal Getter for StoreId.
     * ID of the store this webhook belongs to (null for merchant-level webhooks).
     * @return Returns the Internal UUID
     */
    @JsonGetter("store_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetStoreId() {
        return this.storeId;
    }

    /**
     * Getter for StoreId.
     * ID of the store this webhook belongs to (null for merchant-level webhooks).
     * @return Returns the UUID
     */
    public UUID getStoreId() {
        return OptionalNullable.getFrom(storeId);
    }

    /**
     * Setter for StoreId.
     * ID of the store this webhook belongs to (null for merchant-level webhooks).
     * @param storeId Value for UUID
     */
    @JsonSetter("store_id")
    public void setStoreId(UUID storeId) {
        this.storeId = OptionalNullable.of(storeId);
    }

    /**
     * UnSetter for StoreId.
     * ID of the store this webhook belongs to (null for merchant-level webhooks).
     */
    public void unsetStoreId() {
        storeId = null;
    }

    /**
     * Internal Getter for MerchantId.
     * ID of the merchant this webhook belongs to.
     * @return Returns the Internal UUID
     */
    @JsonGetter("merchant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetMerchantId() {
        return this.merchantId;
    }

    /**
     * Getter for MerchantId.
     * ID of the merchant this webhook belongs to.
     * @return Returns the UUID
     */
    public UUID getMerchantId() {
        return OptionalNullable.getFrom(merchantId);
    }

    /**
     * Setter for MerchantId.
     * ID of the merchant this webhook belongs to.
     * @param merchantId Value for UUID
     */
    @JsonSetter("merchant_id")
    public void setMerchantId(UUID merchantId) {
        this.merchantId = OptionalNullable.of(merchantId);
    }

    /**
     * UnSetter for MerchantId.
     * ID of the merchant this webhook belongs to.
     */
    public void unsetMerchantId() {
        merchantId = null;
    }

    /**
     * Getter for Triggers.
     * List of event types that trigger this webhook.
     * @return Returns the List of WebhookTrigger
     */
    @JsonGetter("triggers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<WebhookTrigger> getTriggers() {
        return triggers;
    }

    /**
     * Setter for Triggers.
     * List of event types that trigger this webhook.
     * @param triggers Value for List of WebhookTrigger
     */
    @JsonSetter("triggers")
    public void setTriggers(List<WebhookTrigger> triggers) {
        this.triggers = triggers;
    }

    /**
     * Getter for Url.
     * The endpoint URL that receives webhook POST requests.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The endpoint URL that receives webhook POST requests.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Internal Getter for AuthToken.
     * Optional bearer token included in the `Authorization` header of webhook requests. Used to
     * authenticate the webhook receiver.
     * @return Returns the Internal String
     */
    @JsonGetter("auth_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAuthToken() {
        return this.authToken;
    }

    /**
     * Getter for AuthToken.
     * Optional bearer token included in the `Authorization` header of webhook requests. Used to
     * authenticate the webhook receiver.
     * @return Returns the String
     */
    public String getAuthToken() {
        return OptionalNullable.getFrom(authToken);
    }

    /**
     * Setter for AuthToken.
     * Optional bearer token included in the `Authorization` header of webhook requests. Used to
     * authenticate the webhook receiver.
     * @param authToken Value for String
     */
    @JsonSetter("auth_token")
    public void setAuthToken(String authToken) {
        this.authToken = OptionalNullable.of(authToken);
    }

    /**
     * UnSetter for AuthToken.
     * Optional bearer token included in the `Authorization` header of webhook requests. Used to
     * authenticate the webhook receiver.
     */
    public void unsetAuthToken() {
        authToken = null;
    }

    /**
     * Getter for Active.
     * Whether this webhook is currently active and receiving events.
     * @return Returns the Boolean
     */
    @JsonGetter("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * Whether this webhook is currently active and receiving events.
     * @param active Value for Boolean
     */
    @JsonSetter("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Getter for IsIntegration.
     * Admin-only flag. Indicates this webhook is used for platform integration purposes. Not
     * settable by merchants.
     * @return Returns the Boolean
     */
    @JsonGetter("is_integration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsIntegration() {
        return isIntegration;
    }

    /**
     * Setter for IsIntegration.
     * Admin-only flag. Indicates this webhook is used for platform integration purposes. Not
     * settable by merchants.
     * @param isIntegration Value for Boolean
     */
    @JsonSetter("is_integration")
    public void setIsIntegration(Boolean isIntegration) {
        this.isIntegration = isIntegration;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the webhook was created.
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
     * Timestamp when the webhook was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for UpdatedOn.
     * Timestamp when the webhook was last updated.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Setter for UpdatedOn.
     * Timestamp when the webhook was last updated.
     * @param updatedOn Value for LocalDateTime
     */
    @JsonSetter("updated_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
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
     * Converts this Webhook into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Webhook [" + "id=" + id + ", storeId=" + storeId + ", merchantId=" + merchantId
                + ", triggers=" + triggers + ", url=" + url + ", authToken=" + authToken
                + ", active=" + active + ", isIntegration=" + isIntegration + ", createdOn="
                + createdOn + ", updatedOn=" + updatedOn + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link Webhook.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Webhook.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .triggers(getTriggers())
                .url(getUrl())
                .active(getActive())
                .isIntegration(getIsIntegration())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.storeId = internalGetStoreId();
        builder.merchantId = internalGetMerchantId();
        builder.authToken = internalGetAuthToken();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link Webhook}.
     */
    public static class Builder {
        private UUID id;
        private OptionalNullable<UUID> storeId;
        private OptionalNullable<UUID> merchantId;
        private List<WebhookTrigger> triggers;
        private String url;
        private OptionalNullable<String> authToken;
        private Boolean active;
        private Boolean isIntegration;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
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
         * Setter for storeId.
         * @param  storeId  UUID value for storeId.
         * @return Builder
         */
        public Builder storeId(UUID storeId) {
            this.storeId = OptionalNullable.of(storeId);
            return this;
        }

        /**
         * UnSetter for storeId.
         * @return Builder
         */
        public Builder unsetStoreId() {
            storeId = null;
            return this;
        }

        /**
         * Setter for merchantId.
         * @param  merchantId  UUID value for merchantId.
         * @return Builder
         */
        public Builder merchantId(UUID merchantId) {
            this.merchantId = OptionalNullable.of(merchantId);
            return this;
        }

        /**
         * UnSetter for merchantId.
         * @return Builder
         */
        public Builder unsetMerchantId() {
            merchantId = null;
            return this;
        }

        /**
         * Setter for triggers.
         * @param  triggers  List of WebhookTrigger value for triggers.
         * @return Builder
         */
        public Builder triggers(List<WebhookTrigger> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for authToken.
         * @param  authToken  String value for authToken.
         * @return Builder
         */
        public Builder authToken(String authToken) {
            this.authToken = OptionalNullable.of(authToken);
            return this;
        }

        /**
         * UnSetter for authToken.
         * @return Builder
         */
        public Builder unsetAuthToken() {
            authToken = null;
            return this;
        }

        /**
         * Setter for active.
         * @param  active  Boolean value for active.
         * @return Builder
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Setter for isIntegration.
         * @param  isIntegration  Boolean value for isIntegration.
         * @return Builder
         */
        public Builder isIntegration(Boolean isIntegration) {
            this.isIntegration = isIntegration;
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
         * Setter for updatedOn.
         * @param  updatedOn  LocalDateTime value for updatedOn.
         * @return Builder
         */
        public Builder updatedOn(LocalDateTime updatedOn) {
            this.updatedOn = updatedOn;
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
         * Builds a new {@link Webhook} object using the set fields.
         * @return {@link Webhook}
         */
        public Webhook build() {
            Webhook model =
                    new Webhook(id, storeId, merchantId, triggers, url, authToken, active,
                            isIntegration, createdOn, updatedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
