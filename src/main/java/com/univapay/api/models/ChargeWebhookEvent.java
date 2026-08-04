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
 * This is a model class for ChargeWebhookEvent type.
 */
public class ChargeWebhookEvent {
    private UUID id;
    private ChargeEvent event;
    private Charge data;
    private LocalDateTime createdOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ChargeWebhookEvent() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  event  ChargeEvent value for event.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  data  Charge value for data.
     */
    public ChargeWebhookEvent(
            UUID id,
            ChargeEvent event,
            LocalDateTime createdOn,
            Charge data) {
        this.id = id;
        this.event = event;
        this.data = data;
        this.createdOn = createdOn;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  event  ChargeEvent value for event.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    @JsonCreator
    protected ChargeWebhookEvent(
            @JsonProperty("id") UUID id,
            @JsonProperty("event") ChargeEvent event,
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
     * Event type discriminator — `charge_updated` or `charge_finished`.
     * @return Returns the ChargeEvent
     */
    @JsonGetter("event")
    public ChargeEvent getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * Event type discriminator — `charge_updated` or `charge_finished`.
     * @param event Value for ChargeEvent
     */
    @JsonSetter("event")
    public void setEvent(ChargeEvent event) {
        this.event = event;
    }

    /**
     * Getter for Data.
     * Charge resource returned by the payments API.
     * @return Returns the Charge
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Charge getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Charge resource returned by the payments API.
     * @param data Value for Charge
     */
    @JsonSetter("data")
    public void setData(Charge data) {
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
     * Converts this ChargeWebhookEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargeWebhookEvent [" + "id=" + id + ", event=" + event + ", createdOn=" + createdOn
                + ", data=" + data + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ChargeWebhookEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargeWebhookEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, event, createdOn)
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ChargeWebhookEvent}.
     */
    public static class Builder {
        private UUID id;
        private ChargeEvent event;
        private LocalDateTime createdOn;
        private Charge data;
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
         * @param  event  ChargeEvent value for event.
         * @param  createdOn  LocalDateTime value for createdOn.
         */
        public Builder(UUID id, ChargeEvent event, LocalDateTime createdOn) {
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
         * @param  event  ChargeEvent value for event.
         * @return Builder
         */
        public Builder event(ChargeEvent event) {
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
         * @param  data  Charge value for data.
         * @return Builder
         */
        public Builder data(Charge data) {
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
         * Builds a new {@link ChargeWebhookEvent} object using the set fields.
         * @return {@link ChargeWebhookEvent}
         */
        public ChargeWebhookEvent build() {
            ChargeWebhookEvent model =
                    new ChargeWebhookEvent(id, event, createdOn, data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
