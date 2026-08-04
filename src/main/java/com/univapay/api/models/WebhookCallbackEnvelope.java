/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
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
 * This is a model class for WebhookCallbackEnvelope type.
 */
public class WebhookCallbackEnvelope {
    private UUID id;
    private WebhookTrigger event;
    private LocalDateTime createdOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public WebhookCallbackEnvelope() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  event  WebhookTrigger value for event.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    public WebhookCallbackEnvelope(
            UUID id,
            WebhookTrigger event,
            LocalDateTime createdOn) {
        this.id = id;
        this.event = event;
        this.createdOn = createdOn;
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
     * Event type that triggers a webhook notification.
     * @return Returns the WebhookTrigger
     */
    @JsonGetter("event")
    public WebhookTrigger getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * Event type that triggers a webhook notification.
     * @param event Value for WebhookTrigger
     */
    @JsonSetter("event")
    public void setEvent(WebhookTrigger event) {
        this.event = event;
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
     * Converts this WebhookCallbackEnvelope into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WebhookCallbackEnvelope [" + "id=" + id + ", event=" + event + ", createdOn="
                + createdOn + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link WebhookCallbackEnvelope.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WebhookCallbackEnvelope.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, event, createdOn);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link WebhookCallbackEnvelope}.
     */
    public static class Builder {
        private UUID id;
        private WebhookTrigger event;
        private LocalDateTime createdOn;
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
         * @param  event  WebhookTrigger value for event.
         * @param  createdOn  LocalDateTime value for createdOn.
         */
        public Builder(UUID id, WebhookTrigger event, LocalDateTime createdOn) {
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
         * @param  event  WebhookTrigger value for event.
         * @return Builder
         */
        public Builder event(WebhookTrigger event) {
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
         * Builds a new {@link WebhookCallbackEnvelope} object using the set fields.
         * @return {@link WebhookCallbackEnvelope}
         */
        public WebhookCallbackEnvelope build() {
            WebhookCallbackEnvelope model =
                    new WebhookCallbackEnvelope(id, event, createdOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
