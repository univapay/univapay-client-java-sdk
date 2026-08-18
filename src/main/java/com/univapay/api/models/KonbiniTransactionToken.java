/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.containers.TransactionTokenMetadataAdditionalProperties;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for KonbiniTransactionToken type.
 */
public class KonbiniTransactionToken {
    private UUID id;
    private UUID storeId;
    private OptionalNullable<String> email;
    private Boolean active;
    private TransactionTokenMode mode;
    private TransactionTokenType type;
    private OptionalNullable<String> usageLimit;
    private OptionalNullable<Boolean> confirmed;
    private Map<String, TransactionTokenMetadataAdditionalProperties> metadata;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private OptionalNullable<LocalDateTime> lastUsedOn;
    private String paymentType;
    private TokenResponseKonbiniData data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public KonbiniTransactionToken() {
        paymentType = "konbini";
    }

    /**
     * Initialization constructor.
     * @param  paymentType  String value for paymentType.
     * @param  data  TokenResponseKonbiniData value for data.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  email  String value for email.
     * @param  active  Boolean value for active.
     * @param  mode  TransactionTokenMode value for mode.
     * @param  type  TransactionTokenType value for type.
     * @param  usageLimit  String value for usageLimit.
     * @param  confirmed  Boolean value for confirmed.
     * @param  metadata  Map of String, value for metadata.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     * @param  lastUsedOn  LocalDateTime value for lastUsedOn.
     */
    public KonbiniTransactionToken(
            String paymentType,
            TokenResponseKonbiniData data,
            UUID id,
            UUID storeId,
            String email,
            Boolean active,
            TransactionTokenMode mode,
            TransactionTokenType type,
            String usageLimit,
            Boolean confirmed,
            Map<String, TransactionTokenMetadataAdditionalProperties> metadata,
            LocalDateTime createdOn,
            LocalDateTime updatedOn,
            LocalDateTime lastUsedOn) {
        this.id = id;
        this.storeId = storeId;
        this.email = OptionalNullable.of(email);
        this.active = active;
        this.mode = mode;
        this.type = type;
        this.usageLimit = OptionalNullable.of(usageLimit);
        this.confirmed = OptionalNullable.of(confirmed);
        this.metadata = metadata;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.lastUsedOn = OptionalNullable.of(lastUsedOn);
        this.paymentType = paymentType;
        this.data = data;
    }

    /**
     * Initialization constructor.
     * @param  paymentType  String value for paymentType.
     * @param  data  TokenResponseKonbiniData value for data.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  email  String value for email.
     * @param  active  Boolean value for active.
     * @param  mode  TransactionTokenMode value for mode.
     * @param  type  TransactionTokenType value for type.
     * @param  usageLimit  String value for usageLimit.
     * @param  confirmed  Boolean value for confirmed.
     * @param  metadata  Map of String, value for metadata.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     * @param  lastUsedOn  LocalDateTime value for lastUsedOn.
     */

    protected KonbiniTransactionToken(String paymentType, TokenResponseKonbiniData data, UUID id,
            UUID storeId, OptionalNullable<String> email, Boolean active, TransactionTokenMode mode,
            TransactionTokenType type, OptionalNullable<String> usageLimit,
            OptionalNullable<Boolean> confirmed,
            Map<String, TransactionTokenMetadataAdditionalProperties> metadata,
            LocalDateTime createdOn, LocalDateTime updatedOn,
            OptionalNullable<LocalDateTime> lastUsedOn) {
        this.id = id;
        this.storeId = storeId;
        this.email = email;
        this.active = active;
        this.mode = mode;
        this.type = type;
        this.usageLimit = usageLimit;
        this.confirmed = confirmed;
        this.metadata = metadata;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.lastUsedOn = lastUsedOn;
        this.paymentType = paymentType;
        this.data = data;
    }

    /**
     * Initialization constructor.
     * @param  paymentType  String value for paymentType.
     * @param  data  TokenResponseKonbiniData value for data.
     */
    @JsonCreator
    protected KonbiniTransactionToken(
            @JsonProperty("payment_type") String paymentType,
            @JsonProperty("data") TokenResponseKonbiniData data) {
        this(paymentType, data, null, null, OptionalNullable.of(null), null, null, null,
                OptionalNullable.of(null), OptionalNullable.of(null), null, null, null,
                OptionalNullable.of(null));
        unsetEmail();
        unsetUsageLimit();
        unsetConfirmed();
        unsetLastUsedOn();
    }

    /**
     * Getter for Id.
     * Unique identifier.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for StoreId.
     * Store identifier.
     * @return Returns the UUID
     */
    @JsonGetter("store_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getStoreId() {
        return storeId;
    }

    /**
     * Setter for StoreId.
     * Store identifier.
     * @param storeId Value for UUID
     */
    @JsonSetter("store_id")
    public void setStoreId(UUID storeId) {
        this.storeId = storeId;
    }

    /**
     * Internal Getter for Email.
     * Customer email address.
     * @return Returns the Internal String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEmail() {
        return this.email;
    }

    /**
     * Getter for Email.
     * Customer email address.
     * @return Returns the String
     */
    public String getEmail() {
        return OptionalNullable.getFrom(email);
    }

    /**
     * Setter for Email.
     * Customer email address.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = OptionalNullable.of(email);
    }

    /**
     * UnSetter for Email.
     * Customer email address.
     */
    public void unsetEmail() {
        email = null;
    }

    /**
     * Getter for Active.
     * Whether the resource is active.
     * @return Returns the Boolean
     */
    @JsonGetter("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * Whether the resource is active.
     * @param active Value for Boolean
     */
    @JsonSetter("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Getter for Mode.
     * Transaction Token Mode schema.
     * @return Returns the TransactionTokenMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionTokenMode getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Transaction Token Mode schema.
     * @param mode Value for TransactionTokenMode
     */
    @JsonSetter("mode")
    public void setMode(TransactionTokenMode mode) {
        this.mode = mode;
    }

    /**
     * Getter for Type.
     * Transaction Token Type schema.
     * @return Returns the TransactionTokenType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionTokenType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Transaction Token Type schema.
     * @param type Value for TransactionTokenType
     */
    @JsonSetter("type")
    public void setType(TransactionTokenType type) {
        this.type = type;
    }

    /**
     * Internal Getter for UsageLimit.
     * Usage limit applied to the token.
     * @return Returns the Internal String
     */
    @JsonGetter("usage_limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUsageLimit() {
        return this.usageLimit;
    }

    /**
     * Getter for UsageLimit.
     * Usage limit applied to the token.
     * @return Returns the String
     */
    public String getUsageLimit() {
        return OptionalNullable.getFrom(usageLimit);
    }

    /**
     * Setter for UsageLimit.
     * Usage limit applied to the token.
     * @param usageLimit Value for String
     */
    @JsonSetter("usage_limit")
    public void setUsageLimit(String usageLimit) {
        this.usageLimit = OptionalNullable.of(usageLimit);
    }

    /**
     * UnSetter for UsageLimit.
     * Usage limit applied to the token.
     */
    public void unsetUsageLimit() {
        usageLimit = null;
    }

    /**
     * Internal Getter for Confirmed.
     * Whether the token has been confirmed.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("confirmed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetConfirmed() {
        return this.confirmed;
    }

    /**
     * Getter for Confirmed.
     * Whether the token has been confirmed.
     * @return Returns the Boolean
     */
    public Boolean getConfirmed() {
        return OptionalNullable.getFrom(confirmed);
    }

    /**
     * Setter for Confirmed.
     * Whether the token has been confirmed.
     * @param confirmed Value for Boolean
     */
    @JsonSetter("confirmed")
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = OptionalNullable.of(confirmed);
    }

    /**
     * UnSetter for Confirmed.
     * Whether the token has been confirmed.
     */
    public void unsetConfirmed() {
        confirmed = null;
    }

    /**
     * Getter for Metadata.
     * Arbitrary key-value metadata.
     * @return Returns the Map of String, TransactionTokenMetadataAdditionalProperties
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, TransactionTokenMetadataAdditionalProperties> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Arbitrary key-value metadata.
     * @param metadata Value for Map of String, TransactionTokenMetadataAdditionalProperties
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, TransactionTokenMetadataAdditionalProperties> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the resource was created.
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
     * Timestamp when the resource was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for UpdatedOn.
     * Timestamp when the resource was last updated.
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
     * Timestamp when the resource was last updated.
     * @param updatedOn Value for LocalDateTime
     */
    @JsonSetter("updated_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * Internal Getter for LastUsedOn.
     * Timestamp when the token was last used.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("last_used_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetLastUsedOn() {
        return this.lastUsedOn;
    }

    /**
     * Getter for LastUsedOn.
     * Timestamp when the token was last used.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getLastUsedOn() {
        return OptionalNullable.getFrom(lastUsedOn);
    }

    /**
     * Setter for LastUsedOn.
     * Timestamp when the token was last used.
     * @param lastUsedOn Value for LocalDateTime
     */
    @JsonSetter("last_used_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastUsedOn(LocalDateTime lastUsedOn) {
        this.lastUsedOn = OptionalNullable.of(lastUsedOn);
    }

    /**
     * UnSetter for LastUsedOn.
     * Timestamp when the token was last used.
     */
    public void unsetLastUsedOn() {
        lastUsedOn = null;
    }

    /**
     * Getter for PaymentType.
     * Payment method type. Always `konbini` for this variant.
     * @return Returns the String
     */
    @JsonGetter("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Payment method type. Always `konbini` for this variant.
     * @param paymentType Value for String
     */
    @JsonSetter("payment_type")
    private void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for Data.
     * Token Response Konbini Data schema.
     * @return Returns the TokenResponseKonbiniData
     */
    @JsonGetter("data")
    public TokenResponseKonbiniData getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Token Response Konbini Data schema.
     * @param data Value for TokenResponseKonbiniData
     */
    @JsonSetter("data")
    public void setData(TokenResponseKonbiniData data) {
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
     * Converts this KonbiniTransactionToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "KonbiniTransactionToken [" + "paymentType=" + paymentType + ", data=" + data
                + ", id=" + id + ", storeId=" + storeId + ", email=" + email + ", active=" + active
                + ", mode=" + mode + ", type=" + type + ", usageLimit=" + usageLimit
                + ", confirmed=" + confirmed + ", metadata=" + metadata + ", createdOn=" + createdOn
                + ", updatedOn=" + updatedOn + ", lastUsedOn=" + lastUsedOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link KonbiniTransactionToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link KonbiniTransactionToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentType, data)
                .id(getId())
                .storeId(getStoreId())
                .active(getActive())
                .mode(getMode())
                .type(getType())
                .metadata(getMetadata())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.email = internalGetEmail();
        builder.usageLimit = internalGetUsageLimit();
        builder.confirmed = internalGetConfirmed();
        builder.lastUsedOn = internalGetLastUsedOn();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link KonbiniTransactionToken}.
     */
    public static class Builder {
        private String paymentType = "konbini";
        private TokenResponseKonbiniData data;
        private UUID id;
        private UUID storeId;
        private OptionalNullable<String> email;
        private Boolean active;
        private TransactionTokenMode mode;
        private TransactionTokenType type;
        private OptionalNullable<String> usageLimit;
        private OptionalNullable<Boolean> confirmed;
        private Map<String, TransactionTokenMetadataAdditionalProperties> metadata;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
        private OptionalNullable<LocalDateTime> lastUsedOn;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentType  String value for paymentType.
         * @param  data  TokenResponseKonbiniData value for data.
         */
        public Builder(String paymentType, TokenResponseKonbiniData data) {
            this.paymentType = paymentType;
            this.data = data;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  TokenResponseKonbiniData value for data.
         * @return Builder
         */
        public Builder data(TokenResponseKonbiniData data) {
            this.data = data;
            return this;
        }

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
            this.storeId = storeId;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = OptionalNullable.of(email);
            return this;
        }

        /**
         * UnSetter for email.
         * @return Builder
         */
        public Builder unsetEmail() {
            email = null;
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
         * Setter for mode.
         * @param  mode  TransactionTokenMode value for mode.
         * @return Builder
         */
        public Builder mode(TransactionTokenMode mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  TransactionTokenType value for type.
         * @return Builder
         */
        public Builder type(TransactionTokenType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for usageLimit.
         * @param  usageLimit  String value for usageLimit.
         * @return Builder
         */
        public Builder usageLimit(String usageLimit) {
            this.usageLimit = OptionalNullable.of(usageLimit);
            return this;
        }

        /**
         * UnSetter for usageLimit.
         * @return Builder
         */
        public Builder unsetUsageLimit() {
            usageLimit = null;
            return this;
        }

        /**
         * Setter for confirmed.
         * @param  confirmed  Boolean value for confirmed.
         * @return Builder
         */
        public Builder confirmed(Boolean confirmed) {
            this.confirmed = OptionalNullable.of(confirmed);
            return this;
        }

        /**
         * UnSetter for confirmed.
         * @return Builder
         */
        public Builder unsetConfirmed() {
            confirmed = null;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(
                Map<String, TransactionTokenMetadataAdditionalProperties> metadata) {
            this.metadata = metadata;
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
         * Setter for lastUsedOn.
         * @param  lastUsedOn  LocalDateTime value for lastUsedOn.
         * @return Builder
         */
        public Builder lastUsedOn(LocalDateTime lastUsedOn) {
            this.lastUsedOn = OptionalNullable.of(lastUsedOn);
            return this;
        }

        /**
         * UnSetter for lastUsedOn.
         * @return Builder
         */
        public Builder unsetLastUsedOn() {
            lastUsedOn = null;
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
         * Builds a new {@link KonbiniTransactionToken} object using the set fields.
         * @return {@link KonbiniTransactionToken}
         */
        public KonbiniTransactionToken build() {
            KonbiniTransactionToken model =
                    new KonbiniTransactionToken(paymentType, data, id, storeId, email, active, mode,
                            type, usageLimit, confirmed, metadata, createdOn, updatedOn,
                            lastUsedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
