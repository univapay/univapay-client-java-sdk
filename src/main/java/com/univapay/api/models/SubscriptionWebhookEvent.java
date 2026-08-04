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
 * This is a model class for SubscriptionWebhookEvent type.
 */
public class SubscriptionWebhookEvent {
    private UUID id;
    private SubscriptionEvent event;
    private Subscription data;
    private LocalDateTime createdOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionWebhookEvent() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  event  SubscriptionEvent value for event.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  data  Subscription value for data.
     */
    public SubscriptionWebhookEvent(
            UUID id,
            SubscriptionEvent event,
            LocalDateTime createdOn,
            Subscription data) {
        this.id = id;
        this.event = event;
        this.data = data;
        this.createdOn = createdOn;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  event  SubscriptionEvent value for event.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    @JsonCreator
    protected SubscriptionWebhookEvent(
            @JsonProperty("id") UUID id,
            @JsonProperty("event") SubscriptionEvent event,
            @JsonProperty("created_on") LocalDateTime createdOn) {
        this(id, event, createdOn, null);
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
     * Getter for Event.
     * Event type discriminator — `subscription_created`, `subscription_payment`,
     * `subscription_completed`, `subscription_failure`, `subscription_canceled`, or
     * `subscription_suspended`.
     * @return Returns the SubscriptionEvent
     */
    @JsonGetter("event")
    public SubscriptionEvent getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * Event type discriminator — `subscription_created`, `subscription_payment`,
     * `subscription_completed`, `subscription_failure`, `subscription_canceled`, or
     * `subscription_suspended`.
     * @param event Value for SubscriptionEvent
     */
    @JsonSetter("event")
    public void setEvent(SubscriptionEvent event) {
        this.event = event;
    }

    /**
     * Getter for Data.
     * The Subscription object represents a recurring payment schedule.
     * @return Returns the Subscription
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Subscription getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The Subscription object represents a recurring payment schedule.
     * @param data Value for Subscription
     */
    @JsonSetter("data")
    public void setData(Subscription data) {
        this.data = data;
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
     * Converts this SubscriptionWebhookEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionWebhookEvent [" + "id=" + id + ", event=" + event + ", createdOn="
                + createdOn + ", data=" + data + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionWebhookEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionWebhookEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, event, createdOn)
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionWebhookEvent}.
     */
    public static class Builder {
        private UUID id;
        private SubscriptionEvent event;
        private LocalDateTime createdOn;
        private Subscription data;
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
         * @param  event  SubscriptionEvent value for event.
         * @param  createdOn  LocalDateTime value for createdOn.
         */
        public Builder(UUID id, SubscriptionEvent event, LocalDateTime createdOn) {
            this.id = id;
            this.event = event;
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
         * Setter for event.
         * @param  event  SubscriptionEvent value for event.
         * @return Builder
         */
        public Builder event(SubscriptionEvent event) {
            this.event = event;
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
         * Setter for data.
         * @param  data  Subscription value for data.
         * @return Builder
         */
        public Builder data(Subscription data) {
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
         * Builds a new {@link SubscriptionWebhookEvent} object using the set fields.
         * @return {@link SubscriptionWebhookEvent}
         */
        public SubscriptionWebhookEvent build() {
            SubscriptionWebhookEvent model =
                    new SubscriptionWebhookEvent(id, event, createdOn, data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
