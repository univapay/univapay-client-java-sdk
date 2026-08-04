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
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for BankTransferStatusWebhookCallback type.
 */
public class BankTransferStatusWebhookCallback {
    private BankTransferEvent event;
    private UUID id;
    private LocalDateTime createdOn;
    private BankTransferStatusData data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public BankTransferStatusWebhookCallback() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  event  BankTransferEvent value for event.
     * @param  data  BankTransferStatusData value for data.
     */
    public BankTransferStatusWebhookCallback(
            UUID id,
            LocalDateTime createdOn,
            BankTransferEvent event,
            BankTransferStatusData data) {
        this.event = event;
        this.id = id;
        this.createdOn = createdOn;
        this.data = data;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    @JsonCreator
    protected BankTransferStatusWebhookCallback(
            @JsonProperty("id") UUID id,
            @JsonProperty("created_on") LocalDateTime createdOn) {
        this(id, createdOn, null, null);
    }

    /**
     * Getter for Event.
     * Event type discriminator — always `bank_transfer_status_updated` for this callback.
     * @return Returns the BankTransferEvent
     */
    @JsonGetter("event")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankTransferEvent getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * Event type discriminator — always `bank_transfer_status_updated` for this callback.
     * @param event Value for BankTransferEvent
     */
    @JsonSetter("event")
    public void setEvent(BankTransferEvent event) {
        this.event = event;
    }

    /**
     * Getter for Id.
     * Unique ID of this webhook delivery.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique ID of this webhook delivery.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the event was fired.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_on")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn.
     * Timestamp when the event was fired.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for Data.
     * Data payload for `bank_transfer_status_updated` webhook events. Contains the bank transfer
     * extension fields inlined alongside amount and metadata.
     * @return Returns the BankTransferStatusData
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankTransferStatusData getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Data payload for `bank_transfer_status_updated` webhook events. Contains the bank transfer
     * extension fields inlined alongside amount and metadata.
     * @param data Value for BankTransferStatusData
     */
    @JsonSetter("data")
    public void setData(BankTransferStatusData data) {
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
     * Converts this BankTransferStatusWebhookCallback into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankTransferStatusWebhookCallback [" + "id=" + id + ", createdOn=" + createdOn
                + ", event=" + event + ", data=" + data + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link BankTransferStatusWebhookCallback.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankTransferStatusWebhookCallback.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, createdOn)
                .event(getEvent())
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link BankTransferStatusWebhookCallback}.
     */
    public static class Builder {
        private UUID id;
        private LocalDateTime createdOn;
        private BankTransferEvent event;
        private BankTransferStatusData data;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  UUID value for id.
         * @param  createdOn  LocalDateTime value for createdOn.
         */
        public Builder(UUID id, LocalDateTime createdOn) {
            this.id = id;
            this.createdOn = createdOn;
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
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * Setter for event.
         * @param  event  BankTransferEvent value for event.
         * @return Builder
         */
        public Builder event(BankTransferEvent event) {
            this.event = event;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  BankTransferStatusData value for data.
         * @return Builder
         */
        public Builder data(BankTransferStatusData data) {
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
         * Builds a new {@link BankTransferStatusWebhookCallback} object using the set fields.
         * @return {@link BankTransferStatusWebhookCallback}
         */
        public BankTransferStatusWebhookCallback build() {
            BankTransferStatusWebhookCallback model =
                    new BankTransferStatusWebhookCallback(id, createdOn, event, data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
