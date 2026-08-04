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
 * This is a model class for Cancel type.
 */
public class Cancel {
    private UUID id;
    private UUID chargeId;
    private UUID storeId;
    private CancelStatus status;
    private OptionalNullable<PaymentError> error;
    private GenericMetadata metadata;
    private ChargeMode mode;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public Cancel() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  chargeId  UUID value for chargeId.
     * @param  storeId  UUID value for storeId.
     * @param  status  CancelStatus value for status.
     * @param  error  PaymentError value for error.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */
    public Cancel(
            UUID id,
            UUID chargeId,
            UUID storeId,
            CancelStatus status,
            PaymentError error,
            GenericMetadata metadata,
            ChargeMode mode,
            LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.chargeId = chargeId;
        this.storeId = storeId;
        this.status = status;
        this.error = OptionalNullable.of(error);
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  chargeId  UUID value for chargeId.
     * @param  storeId  UUID value for storeId.
     * @param  status  CancelStatus value for status.
     * @param  error  PaymentError value for error.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  mode  ChargeMode value for mode.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */

    protected Cancel(UUID id, UUID chargeId, UUID storeId, CancelStatus status,
            OptionalNullable<PaymentError> error, GenericMetadata metadata, ChargeMode mode,
            LocalDateTime createdOn, LocalDateTime updatedOn) {
        this.id = id;
        this.chargeId = chargeId;
        this.storeId = storeId;
        this.status = status;
        this.error = error;
        this.metadata = metadata;
        this.mode = mode;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for Id.
     * Unique identifier for the cancel.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier for the cancel.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for ChargeId.
     * ID of the charge this cancel is associated with.
     * @return Returns the UUID
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getChargeId() {
        return chargeId;
    }

    /**
     * Setter for ChargeId.
     * ID of the charge this cancel is associated with.
     * @param chargeId Value for UUID
     */
    @JsonSetter("charge_id")
    public void setChargeId(UUID chargeId) {
        this.chargeId = chargeId;
    }

    /**
     * Getter for StoreId.
     * ID of the store.
     * @return Returns the UUID
     */
    @JsonGetter("store_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getStoreId() {
        return storeId;
    }

    /**
     * Setter for StoreId.
     * ID of the store.
     * @param storeId Value for UUID
     */
    @JsonSetter("store_id")
    public void setStoreId(UUID storeId) {
        this.storeId = storeId;
    }

    /**
     * Getter for Status.
     * Current status of the cancel operation.
     * @return Returns the CancelStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CancelStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Current status of the cancel operation.
     * @param status Value for CancelStatus
     */
    @JsonSetter("status")
    public void setStatus(CancelStatus status) {
        this.status = status;
    }

    /**
     * Internal Getter for Error.
     * Payment error details, or null if successful.
     * @return Returns the Internal PaymentError
     */
    @JsonGetter("error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PaymentError> internalGetError() {
        return this.error;
    }

    /**
     * Getter for Error.
     * Payment error details, or null if successful.
     * @return Returns the PaymentError
     */
    public PaymentError getError() {
        return OptionalNullable.getFrom(error);
    }

    /**
     * Setter for Error.
     * Payment error details, or null if successful.
     * @param error Value for PaymentError
     */
    @JsonSetter("error")
    public void setError(PaymentError error) {
        this.error = OptionalNullable.of(error);
    }

    /**
     * UnSetter for Error.
     * Payment error details, or null if successful.
     */
    public void unsetError() {
        error = null;
    }

    /**
     * Getter for Metadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the GenericMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GenericMetadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * A free-form dictionary for custom metadata.
     * @param metadata Value for GenericMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(GenericMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Mode.
     * Charge Mode schema.
     * @return Returns the ChargeMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeMode getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Charge Mode schema.
     * @param mode Value for ChargeMode
     */
    @JsonSetter("mode")
    public void setMode(ChargeMode mode) {
        this.mode = mode;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the cancel was created.
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
     * Timestamp when the cancel was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for UpdatedOn.
     * Timestamp when the cancel was last updated.
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
     * Timestamp when the cancel was last updated.
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
     * Converts this Cancel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Cancel [" + "id=" + id + ", chargeId=" + chargeId + ", storeId=" + storeId
                + ", status=" + status + ", error=" + error + ", metadata=" + metadata + ", mode="
                + mode + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link Cancel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Cancel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .chargeId(getChargeId())
                .storeId(getStoreId())
                .status(getStatus())
                .metadata(getMetadata())
                .mode(getMode())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.error = internalGetError();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link Cancel}.
     */
    public static class Builder {
        private UUID id;
        private UUID chargeId;
        private UUID storeId;
        private CancelStatus status;
        private OptionalNullable<PaymentError> error;
        private GenericMetadata metadata;
        private ChargeMode mode;
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
         * Setter for chargeId.
         * @param  chargeId  UUID value for chargeId.
         * @return Builder
         */
        public Builder chargeId(UUID chargeId) {
            this.chargeId = chargeId;
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
         * Setter for status.
         * @param  status  CancelStatus value for status.
         * @return Builder
         */
        public Builder status(CancelStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  PaymentError value for error.
         * @return Builder
         */
        public Builder error(PaymentError error) {
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
         * Setter for metadata.
         * @param  metadata  GenericMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(GenericMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for mode.
         * @param  mode  ChargeMode value for mode.
         * @return Builder
         */
        public Builder mode(ChargeMode mode) {
            this.mode = mode;
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
         * Builds a new {@link Cancel} object using the set fields.
         * @return {@link Cancel}
         */
        public Cancel build() {
            Cancel model =
                    new Cancel(id, chargeId, storeId, status, error, metadata, mode, createdOn,
                            updatedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
