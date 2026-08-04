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
 * This is a model class for CancelWebhookCallback type.
 */
public class CancelWebhookCallback {
    private CancelEvent event;
    private UUID id;
    private LocalDateTime createdOn;
    private Cancel data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CancelWebhookCallback() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  event  CancelEvent value for event.
     * @param  data  Cancel value for data.
     */
    public CancelWebhookCallback(
            UUID id,
            LocalDateTime createdOn,
            CancelEvent event,
            Cancel data) {
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
    protected CancelWebhookCallback(
            @JsonProperty("id") UUID id,
            @JsonProperty("created_on") LocalDateTime createdOn) {
        this(id, createdOn, null, null);
    }

    /**
     * Getter for Event.
     * Event type discriminator — always `cancel_finished` for this callback.
     * @return Returns the CancelEvent
     */
    @JsonGetter("event")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CancelEvent getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * Event type discriminator — always `cancel_finished` for this callback.
     * @param event Value for CancelEvent
     */
    @JsonSetter("event")
    public void setEvent(CancelEvent event) {
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
     * Represents a cancellation request for a charge.
     * @return Returns the Cancel
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Cancel getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Represents a cancellation request for a charge.
     * @param data Value for Cancel
     */
    @JsonSetter("data")
    public void setData(Cancel data) {
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
     * Converts this CancelWebhookCallback into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancelWebhookCallback [" + "id=" + id + ", createdOn=" + createdOn + ", event="
                + event + ", data=" + data + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CancelWebhookCallback.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancelWebhookCallback.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, createdOn)
                .event(getEvent())
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CancelWebhookCallback}.
     */
    public static class Builder {
        private UUID id;
        private LocalDateTime createdOn;
        private CancelEvent event;
        private Cancel data;
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
         * @param  event  CancelEvent value for event.
         * @return Builder
         */
        public Builder event(CancelEvent event) {
            this.event = event;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  Cancel value for data.
         * @return Builder
         */
        public Builder data(Cancel data) {
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
         * Builds a new {@link CancelWebhookCallback} object using the set fields.
         * @return {@link CancelWebhookCallback}
         */
        public CancelWebhookCallback build() {
            CancelWebhookCallback model =
                    new CancelWebhookCallback(id, createdOn, event, data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
