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
 * This is a model class for WebhookEvent type.
 */
public class WebhookEvent {
    private UUID id;
    private UUID webhookId;
    private WebhookTrigger event;
    private Object data;
    private Boolean successful;
    private LocalDateTime firedOn;
    private OptionalNullable<String> errorMessage;
    private LocalDateTime createdOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public WebhookEvent() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  webhookId  UUID value for webhookId.
     * @param  event  WebhookTrigger value for event.
     * @param  data  Object value for data.
     * @param  successful  Boolean value for successful.
     * @param  firedOn  LocalDateTime value for firedOn.
     * @param  errorMessage  String value for errorMessage.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    public WebhookEvent(
            UUID id,
            UUID webhookId,
            WebhookTrigger event,
            Object data,
            Boolean successful,
            LocalDateTime firedOn,
            String errorMessage,
            LocalDateTime createdOn) {
        this.id = id;
        this.webhookId = webhookId;
        this.event = event;
        this.data = data;
        this.successful = successful;
        this.firedOn = firedOn;
        this.errorMessage = OptionalNullable.of(errorMessage);
        this.createdOn = createdOn;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  webhookId  UUID value for webhookId.
     * @param  event  WebhookTrigger value for event.
     * @param  data  Object value for data.
     * @param  successful  Boolean value for successful.
     * @param  firedOn  LocalDateTime value for firedOn.
     * @param  errorMessage  String value for errorMessage.
     * @param  createdOn  LocalDateTime value for createdOn.
     */

    protected WebhookEvent(UUID id, UUID webhookId, WebhookTrigger event, Object data,
            Boolean successful, LocalDateTime firedOn, OptionalNullable<String> errorMessage,
            LocalDateTime createdOn) {
        this.id = id;
        this.webhookId = webhookId;
        this.event = event;
        this.data = data;
        this.successful = successful;
        this.firedOn = firedOn;
        this.errorMessage = errorMessage;
        this.createdOn = createdOn;
    }

    /**
     * Getter for Id.
     * Unique identifier for the webhook event.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier for the webhook event.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for WebhookId.
     * ID of the parent webhook.
     * @return Returns the UUID
     */
    @JsonGetter("webhook_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getWebhookId() {
        return webhookId;
    }

    /**
     * Setter for WebhookId.
     * ID of the parent webhook.
     * @param webhookId Value for UUID
     */
    @JsonSetter("webhook_id")
    public void setWebhookId(UUID webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * Getter for Event.
     * Event type that triggers a webhook notification.
     * @return Returns the WebhookTrigger
     */
    @JsonGetter("event")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Data.
     * Domain object payload for webhook deliveries. The actual structure depends on the event type
     * — see each webhook callback schema for the specific payload shape.
     * @return Returns the Object
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Domain object payload for webhook deliveries. The actual structure depends on the event type
     * — see each webhook callback schema for the specific payload shape.
     * @param data Value for Object
     */
    @JsonSetter("data")
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Getter for Successful.
     * Whether the webhook delivery was acknowledged (HTTP 2xx).
     * @return Returns the Boolean
     */
    @JsonGetter("successful")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSuccessful() {
        return successful;
    }

    /**
     * Setter for Successful.
     * Whether the webhook delivery was acknowledged (HTTP 2xx).
     * @param successful Value for Boolean
     */
    @JsonSetter("successful")
    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    /**
     * Getter for FiredOn.
     * Timestamp when the webhook was dispatched.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("fired_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getFiredOn() {
        return firedOn;
    }

    /**
     * Setter for FiredOn.
     * Timestamp when the webhook was dispatched.
     * @param firedOn Value for LocalDateTime
     */
    @JsonSetter("fired_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFiredOn(LocalDateTime firedOn) {
        this.firedOn = firedOn;
    }

    /**
     * Internal Getter for ErrorMessage.
     * Error message if delivery failed.
     * @return Returns the Internal String
     */
    @JsonGetter("error_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Getter for ErrorMessage.
     * Error message if delivery failed.
     * @return Returns the String
     */
    public String getErrorMessage() {
        return OptionalNullable.getFrom(errorMessage);
    }

    /**
     * Setter for ErrorMessage.
     * Error message if delivery failed.
     * @param errorMessage Value for String
     */
    @JsonSetter("error_message")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = OptionalNullable.of(errorMessage);
    }

    /**
     * UnSetter for ErrorMessage.
     * Error message if delivery failed.
     */
    public void unsetErrorMessage() {
        errorMessage = null;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the event was created.
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
     * Timestamp when the event was created.
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
     * Converts this WebhookEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WebhookEvent [" + "id=" + id + ", webhookId=" + webhookId + ", event=" + event
                + ", data=" + data + ", successful=" + successful + ", firedOn=" + firedOn
                + ", errorMessage=" + errorMessage + ", createdOn=" + createdOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link WebhookEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WebhookEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .webhookId(getWebhookId())
                .event(getEvent())
                .data(getData())
                .successful(getSuccessful())
                .firedOn(getFiredOn())
                .createdOn(getCreatedOn());
        builder.errorMessage = internalGetErrorMessage();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link WebhookEvent}.
     */
    public static class Builder {
        private UUID id;
        private UUID webhookId;
        private WebhookTrigger event;
        private Object data;
        private Boolean successful;
        private LocalDateTime firedOn;
        private OptionalNullable<String> errorMessage;
        private LocalDateTime createdOn;
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
         * Setter for webhookId.
         * @param  webhookId  UUID value for webhookId.
         * @return Builder
         */
        public Builder webhookId(UUID webhookId) {
            this.webhookId = webhookId;
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
         * Setter for data.
         * @param  data  Object value for data.
         * @return Builder
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for successful.
         * @param  successful  Boolean value for successful.
         * @return Builder
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        /**
         * Setter for firedOn.
         * @param  firedOn  LocalDateTime value for firedOn.
         * @return Builder
         */
        public Builder firedOn(LocalDateTime firedOn) {
            this.firedOn = firedOn;
            return this;
        }

        /**
         * Setter for errorMessage.
         * @param  errorMessage  String value for errorMessage.
         * @return Builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = OptionalNullable.of(errorMessage);
            return this;
        }

        /**
         * UnSetter for errorMessage.
         * @return Builder
         */
        public Builder unsetErrorMessage() {
            errorMessage = null;
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
         * Builds a new {@link WebhookEvent} object using the set fields.
         * @return {@link WebhookEvent}
         */
        public WebhookEvent build() {
            WebhookEvent model =
                    new WebhookEvent(id, webhookId, event, data, successful, firedOn, errorMessage,
                            createdOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
