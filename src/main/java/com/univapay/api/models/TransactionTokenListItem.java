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
 * This is a model class for TransactionTokenListItem type.
 */
public class TransactionTokenListItem {
    private UUID id;
    private UUID storeId;
    private String merchantName;
    private String storeName;
    private String email;
    private String paymentType;
    private Boolean active;
    private String mode;
    private String type;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private TransactionTokenListItemUserData userData;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionTokenListItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  storeId  UUID value for storeId.
     * @param  merchantName  String value for merchantName.
     * @param  storeName  String value for storeName.
     * @param  email  String value for email.
     * @param  paymentType  String value for paymentType.
     * @param  active  Boolean value for active.
     * @param  mode  String value for mode.
     * @param  type  String value for type.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     * @param  userData  TransactionTokenListItemUserData value for userData.
     */
    public TransactionTokenListItem(
            UUID id,
            UUID storeId,
            String merchantName,
            String storeName,
            String email,
            String paymentType,
            Boolean active,
            String mode,
            String type,
            LocalDateTime createdOn,
            LocalDateTime updatedOn,
            TransactionTokenListItemUserData userData) {
        this.id = id;
        this.storeId = storeId;
        this.merchantName = merchantName;
        this.storeName = storeName;
        this.email = email;
        this.paymentType = paymentType;
        this.active = active;
        this.mode = mode;
        this.type = type;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.userData = userData;
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
     * Getter for MerchantName.
     * Merchant display name.
     * @return Returns the String
     */
    @JsonGetter("merchant_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Setter for MerchantName.
     * Merchant display name.
     * @param merchantName Value for String
     */
    @JsonSetter("merchant_name")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * Getter for StoreName.
     * Store display name.
     * @return Returns the String
     */
    @JsonGetter("store_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStoreName() {
        return storeName;
    }

    /**
     * Setter for StoreName.
     * Store display name.
     * @param storeName Value for String
     */
    @JsonSetter("store_name")
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Getter for Email.
     * Customer email address.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Customer email address.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for PaymentType.
     * Payment method type.
     * @return Returns the String
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Payment method type.
     * @param paymentType Value for String
     */
    @JsonSetter("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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
     * Processing mode for the resource.
     * @return Returns the String
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Processing mode for the resource.
     * @param mode Value for String
     */
    @JsonSetter("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Getter for Type.
     * Type of the resource.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the resource.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
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
     * Getter for UserData.
     * Transaction Token List Item User Data schema.
     * @return Returns the TransactionTokenListItemUserData
     */
    @JsonGetter("user_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionTokenListItemUserData getUserData() {
        return userData;
    }

    /**
     * Setter for UserData.
     * Transaction Token List Item User Data schema.
     * @param userData Value for TransactionTokenListItemUserData
     */
    @JsonSetter("user_data")
    public void setUserData(TransactionTokenListItemUserData userData) {
        this.userData = userData;
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
     * Converts this TransactionTokenListItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionTokenListItem [" + "id=" + id + ", storeId=" + storeId
                + ", merchantName=" + merchantName + ", storeName=" + storeName + ", email=" + email
                + ", paymentType=" + paymentType + ", active=" + active + ", mode=" + mode
                + ", type=" + type + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
                + ", userData=" + userData + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionTokenListItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionTokenListItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .storeId(getStoreId())
                .merchantName(getMerchantName())
                .storeName(getStoreName())
                .email(getEmail())
                .paymentType(getPaymentType())
                .active(getActive())
                .mode(getMode())
                .type(getType())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn())
                .userData(getUserData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionTokenListItem}.
     */
    public static class Builder {
        private UUID id;
        private UUID storeId;
        private String merchantName;
        private String storeName;
        private String email;
        private String paymentType;
        private Boolean active;
        private String mode;
        private String type;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
        private TransactionTokenListItemUserData userData;
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
            this.storeId = storeId;
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
         * Setter for storeName.
         * @param  storeName  String value for storeName.
         * @return Builder
         */
        public Builder storeName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
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
         * @param  mode  String value for mode.
         * @return Builder
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

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
         * Setter for userData.
         * @param  userData  TransactionTokenListItemUserData value for userData.
         * @return Builder
         */
        public Builder userData(TransactionTokenListItemUserData userData) {
            this.userData = userData;
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
         * Builds a new {@link TransactionTokenListItem} object using the set fields.
         * @return {@link TransactionTokenListItem}
         */
        public TransactionTokenListItem build() {
            TransactionTokenListItem model =
                    new TransactionTokenListItem(id, storeId, merchantName, storeName, email,
                            paymentType, active, mode, type, createdOn, updatedOn, userData);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
