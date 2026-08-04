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
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for CustomsDeclarationWebhookData type.
 */
public class CustomsDeclarationWebhookData {
    private UUID id;
    private UUID chargeId;
    private UUID merchantId;
    private UUID storeId;
    private OptionalNullable<UUID> platformId;
    private String mode;
    private String gateway;
    private CustomsDeclarationWebhookDeclaration declaration;
    private OptionalNullable<CustomsDeclarationWebhookResult> declarationResult;
    private CustomsDeclarationWebhookStatus status;
    private OptionalNullable<CustomsDeclarationWebhookError> error;
    private LocalDateTime createdOn;
    private OptionalNullable<LocalDateTime> updatedOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CustomsDeclarationWebhookData() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  chargeId  UUID value for chargeId.
     * @param  merchantId  UUID value for merchantId.
     * @param  storeId  UUID value for storeId.
     * @param  platformId  UUID value for platformId.
     * @param  mode  String value for mode.
     * @param  gateway  String value for gateway.
     * @param  declaration  CustomsDeclarationWebhookDeclaration value for declaration.
     * @param  declarationResult  CustomsDeclarationWebhookResult value for declarationResult.
     * @param  status  CustomsDeclarationWebhookStatus value for status.
     * @param  error  CustomsDeclarationWebhookError value for error.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */
    public CustomsDeclarationWebhookData(
            UUID id,
            UUID chargeId,
            UUID merchantId,
            UUID storeId,
            UUID platformId,
            String mode,
            String gateway,
            CustomsDeclarationWebhookDeclaration declaration,
            CustomsDeclarationWebhookResult declarationResult,
            CustomsDeclarationWebhookStatus status,
            CustomsDeclarationWebhookError error,
            LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.chargeId = chargeId;
        this.merchantId = merchantId;
        this.storeId = storeId;
        this.platformId = OptionalNullable.of(platformId);
        this.mode = mode;
        this.gateway = gateway;
        this.declaration = declaration;
        this.declarationResult = OptionalNullable.of(declarationResult);
        this.status = status;
        this.error = OptionalNullable.of(error);
        this.createdOn = createdOn;
        this.updatedOn = OptionalNullable.of(updatedOn);
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  chargeId  UUID value for chargeId.
     * @param  merchantId  UUID value for merchantId.
     * @param  storeId  UUID value for storeId.
     * @param  platformId  UUID value for platformId.
     * @param  mode  String value for mode.
     * @param  gateway  String value for gateway.
     * @param  declaration  CustomsDeclarationWebhookDeclaration value for declaration.
     * @param  declarationResult  CustomsDeclarationWebhookResult value for declarationResult.
     * @param  status  CustomsDeclarationWebhookStatus value for status.
     * @param  error  CustomsDeclarationWebhookError value for error.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */

    protected CustomsDeclarationWebhookData(UUID id, UUID chargeId, UUID merchantId, UUID storeId,
            OptionalNullable<UUID> platformId, String mode, String gateway,
            CustomsDeclarationWebhookDeclaration declaration,
            OptionalNullable<CustomsDeclarationWebhookResult> declarationResult,
            CustomsDeclarationWebhookStatus status,
            OptionalNullable<CustomsDeclarationWebhookError> error, LocalDateTime createdOn,
            OptionalNullable<LocalDateTime> updatedOn) {
        this.id = id;
        this.chargeId = chargeId;
        this.merchantId = merchantId;
        this.storeId = storeId;
        this.platformId = platformId;
        this.mode = mode;
        this.gateway = gateway;
        this.declaration = declaration;
        this.declarationResult = declarationResult;
        this.status = status;
        this.error = error;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for Id.
     * Customs declaration identifier.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Customs declaration identifier.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for ChargeId.
     * Charge identifier associated with the declaration.
     * @return Returns the UUID
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getChargeId() {
        return chargeId;
    }

    /**
     * Setter for ChargeId.
     * Charge identifier associated with the declaration.
     * @param chargeId Value for UUID
     */
    @JsonSetter("charge_id")
    public void setChargeId(UUID chargeId) {
        this.chargeId = chargeId;
    }

    /**
     * Getter for MerchantId.
     * Merchant identifier.
     * @return Returns the UUID
     */
    @JsonGetter("merchant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getMerchantId() {
        return merchantId;
    }

    /**
     * Setter for MerchantId.
     * Merchant identifier.
     * @param merchantId Value for UUID
     */
    @JsonSetter("merchant_id")
    public void setMerchantId(UUID merchantId) {
        this.merchantId = merchantId;
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
     * Internal Getter for PlatformId.
     * Platform identifier, included on platform-level deliveries.
     * @return Returns the Internal UUID
     */
    @JsonGetter("platform_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetPlatformId() {
        return this.platformId;
    }

    /**
     * Getter for PlatformId.
     * Platform identifier, included on platform-level deliveries.
     * @return Returns the UUID
     */
    public UUID getPlatformId() {
        return OptionalNullable.getFrom(platformId);
    }

    /**
     * Setter for PlatformId.
     * Platform identifier, included on platform-level deliveries.
     * @param platformId Value for UUID
     */
    @JsonSetter("platform_id")
    public void setPlatformId(UUID platformId) {
        this.platformId = OptionalNullable.of(platformId);
    }

    /**
     * UnSetter for PlatformId.
     * Platform identifier, included on platform-level deliveries.
     */
    public void unsetPlatformId() {
        platformId = null;
    }

    /**
     * Getter for Mode.
     * Processing mode.
     * @return Returns the String
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Processing mode.
     * @param mode Value for String
     */
    @JsonSetter("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Getter for Gateway.
     * Gateway that processed the declaration.
     * @return Returns the String
     */
    @JsonGetter("gateway")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGateway() {
        return gateway;
    }

    /**
     * Setter for Gateway.
     * Gateway that processed the declaration.
     * @param gateway Value for String
     */
    @JsonSetter("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * Getter for Declaration.
     * WeChat customs declaration payload returned by the backend formatter.
     * @return Returns the CustomsDeclarationWebhookDeclaration
     */
    @JsonGetter("declaration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomsDeclarationWebhookDeclaration getDeclaration() {
        return declaration;
    }

    /**
     * Setter for Declaration.
     * WeChat customs declaration payload returned by the backend formatter.
     * @param declaration Value for CustomsDeclarationWebhookDeclaration
     */
    @JsonSetter("declaration")
    public void setDeclaration(CustomsDeclarationWebhookDeclaration declaration) {
        this.declaration = declaration;
    }

    /**
     * Internal Getter for DeclarationResult.
     * Result payload returned by the customs declaration formatter.
     * @return Returns the Internal CustomsDeclarationWebhookResult
     */
    @JsonGetter("declaration_result")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomsDeclarationWebhookResult> internalGetDeclarationResult() {
        return this.declarationResult;
    }

    /**
     * Getter for DeclarationResult.
     * Result payload returned by the customs declaration formatter.
     * @return Returns the CustomsDeclarationWebhookResult
     */
    public CustomsDeclarationWebhookResult getDeclarationResult() {
        return OptionalNullable.getFrom(declarationResult);
    }

    /**
     * Setter for DeclarationResult.
     * Result payload returned by the customs declaration formatter.
     * @param declarationResult Value for CustomsDeclarationWebhookResult
     */
    @JsonSetter("declaration_result")
    public void setDeclarationResult(CustomsDeclarationWebhookResult declarationResult) {
        this.declarationResult = OptionalNullable.of(declarationResult);
    }

    /**
     * UnSetter for DeclarationResult.
     * Result payload returned by the customs declaration formatter.
     */
    public void unsetDeclarationResult() {
        declarationResult = null;
    }

    /**
     * Getter for Status.
     * Customs declaration status returned by the backend.
     * @return Returns the CustomsDeclarationWebhookStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomsDeclarationWebhookStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Customs declaration status returned by the backend.
     * @param status Value for CustomsDeclarationWebhookStatus
     */
    @JsonSetter("status")
    public void setStatus(CustomsDeclarationWebhookStatus status) {
        this.status = status;
    }

    /**
     * Internal Getter for Error.
     * Error payload returned when customs declaration processing fails.
     * @return Returns the Internal CustomsDeclarationWebhookError
     */
    @JsonGetter("error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomsDeclarationWebhookError> internalGetError() {
        return this.error;
    }

    /**
     * Getter for Error.
     * Error payload returned when customs declaration processing fails.
     * @return Returns the CustomsDeclarationWebhookError
     */
    public CustomsDeclarationWebhookError getError() {
        return OptionalNullable.getFrom(error);
    }

    /**
     * Setter for Error.
     * Error payload returned when customs declaration processing fails.
     * @param error Value for CustomsDeclarationWebhookError
     */
    @JsonSetter("error")
    public void setError(CustomsDeclarationWebhookError error) {
        this.error = OptionalNullable.of(error);
    }

    /**
     * UnSetter for Error.
     * Error payload returned when customs declaration processing fails.
     */
    public void unsetError() {
        error = null;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the declaration was created.
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
     * Timestamp when the declaration was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Internal Getter for UpdatedOn.
     * Timestamp when the declaration was last updated, included on platform-level deliveries.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("updated_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Getter for UpdatedOn.
     * Timestamp when the declaration was last updated, included on platform-level deliveries.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getUpdatedOn() {
        return OptionalNullable.getFrom(updatedOn);
    }

    /**
     * Setter for UpdatedOn.
     * Timestamp when the declaration was last updated, included on platform-level deliveries.
     * @param updatedOn Value for LocalDateTime
     */
    @JsonSetter("updated_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = OptionalNullable.of(updatedOn);
    }

    /**
     * UnSetter for UpdatedOn.
     * Timestamp when the declaration was last updated, included on platform-level deliveries.
     */
    public void unsetUpdatedOn() {
        updatedOn = null;
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
     * Converts this CustomsDeclarationWebhookData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomsDeclarationWebhookData [" + "id=" + id + ", chargeId=" + chargeId
                + ", merchantId=" + merchantId + ", storeId=" + storeId + ", platformId="
                + platformId + ", mode=" + mode + ", gateway=" + gateway + ", declaration="
                + declaration + ", declarationResult=" + declarationResult + ", status=" + status
                + ", error=" + error + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CustomsDeclarationWebhookData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomsDeclarationWebhookData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .chargeId(getChargeId())
                .merchantId(getMerchantId())
                .storeId(getStoreId())
                .mode(getMode())
                .gateway(getGateway())
                .declaration(getDeclaration())
                .status(getStatus())
                .createdOn(getCreatedOn());
        builder.platformId = internalGetPlatformId();
        builder.declarationResult = internalGetDeclarationResult();
        builder.error = internalGetError();
        builder.updatedOn = internalGetUpdatedOn();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CustomsDeclarationWebhookData}.
     */
    public static class Builder {
        private UUID id;
        private UUID chargeId;
        private UUID merchantId;
        private UUID storeId;
        private OptionalNullable<UUID> platformId;
        private String mode;
        private String gateway;
        private CustomsDeclarationWebhookDeclaration declaration;
        private OptionalNullable<CustomsDeclarationWebhookResult> declarationResult;
        private CustomsDeclarationWebhookStatus status;
        private OptionalNullable<CustomsDeclarationWebhookError> error;
        private LocalDateTime createdOn;
        private OptionalNullable<LocalDateTime> updatedOn;
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
         * Setter for chargeId.
         * @param  chargeId  UUID value for chargeId.
         * @return Builder
         */
        public Builder chargeId(UUID chargeId) {
            this.chargeId = chargeId;
            return this;
        }

        /**
         * Setter for merchantId.
         * @param  merchantId  UUID value for merchantId.
         * @return Builder
         */
        public Builder merchantId(UUID merchantId) {
            this.merchantId = merchantId;
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
         * Setter for platformId.
         * @param  platformId  UUID value for platformId.
         * @return Builder
         */
        public Builder platformId(UUID platformId) {
            this.platformId = OptionalNullable.of(platformId);
            return this;
        }

        /**
         * UnSetter for platformId.
         * @return Builder
         */
        public Builder unsetPlatformId() {
            platformId = null;
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
         * Setter for gateway.
         * @param  gateway  String value for gateway.
         * @return Builder
         */
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * Setter for declaration.
         * @param  declaration  CustomsDeclarationWebhookDeclaration value for declaration.
         * @return Builder
         */
        public Builder declaration(CustomsDeclarationWebhookDeclaration declaration) {
            this.declaration = declaration;
            return this;
        }

        /**
         * Setter for declarationResult.
         * @param  declarationResult  CustomsDeclarationWebhookResult value for declarationResult.
         * @return Builder
         */
        public Builder declarationResult(CustomsDeclarationWebhookResult declarationResult) {
            this.declarationResult = OptionalNullable.of(declarationResult);
            return this;
        }

        /**
         * UnSetter for declarationResult.
         * @return Builder
         */
        public Builder unsetDeclarationResult() {
            declarationResult = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  CustomsDeclarationWebhookStatus value for status.
         * @return Builder
         */
        public Builder status(CustomsDeclarationWebhookStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  CustomsDeclarationWebhookError value for error.
         * @return Builder
         */
        public Builder error(CustomsDeclarationWebhookError error) {
            this.error = OptionalNullable.of(error);
            return this;
        }

        /**
         * UnSetter for error.
         * @return Builder
         */
        public Builder unsetError() {
            error = null;
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
            this.updatedOn = OptionalNullable.of(updatedOn);
            return this;
        }

        /**
         * UnSetter for updatedOn.
         * @return Builder
         */
        public Builder unsetUpdatedOn() {
            updatedOn = null;
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
         * Builds a new {@link CustomsDeclarationWebhookData} object using the set fields.
         * @return {@link CustomsDeclarationWebhookData}
         */
        public CustomsDeclarationWebhookData build() {
            CustomsDeclarationWebhookData model =
                    new CustomsDeclarationWebhookData(id, chargeId, merchantId, storeId, platformId,
                            mode, gateway, declaration, declarationResult, status, error, createdOn,
                            updatedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
