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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for WebhookUpdateRequest type.
 */
public class WebhookUpdateRequest {
    private List<WebhookTrigger> triggers;
    private String url;
    private OptionalNullable<String> authToken;
    private Boolean active;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public WebhookUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  triggers  List of WebhookTrigger value for triggers.
     * @param  url  String value for url.
     * @param  authToken  String value for authToken.
     * @param  active  Boolean value for active.
     */
    public WebhookUpdateRequest(
            List<WebhookTrigger> triggers,
            String url,
            String authToken,
            Boolean active) {
        this.triggers = triggers;
        this.url = url;
        this.authToken = OptionalNullable.of(authToken);
        this.active = active;
    }

    /**
     * Initialization constructor.
     * @param  triggers  List of WebhookTrigger value for triggers.
     * @param  url  String value for url.
     * @param  authToken  String value for authToken.
     * @param  active  Boolean value for active.
     */

    protected WebhookUpdateRequest(List<WebhookTrigger> triggers, String url,
            OptionalNullable<String> authToken, Boolean active) {
        this.triggers = triggers;
        this.url = url;
        this.authToken = authToken;
        this.active = active;
    }

    /**
     * Getter for Triggers.
     * Replace the trigger list. Must be non-empty if provided.
     * @return Returns the List of WebhookTrigger
     */
    @JsonGetter("triggers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<WebhookTrigger> getTriggers() {
        return triggers;
    }

    /**
     * Setter for Triggers.
     * Replace the trigger list. Must be non-empty if provided.
     * @param triggers Value for List of WebhookTrigger
     */
    @JsonSetter("triggers")
    public void setTriggers(List<WebhookTrigger> triggers) {
        this.triggers = triggers;
    }

    /**
     * Getter for Url.
     * Update the webhook endpoint URL.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * Update the webhook endpoint URL.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Internal Getter for AuthToken.
     * Update or clear the auth token. Send `null` to remove.
     * @return Returns the Internal String
     */
    @JsonGetter("auth_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAuthToken() {
        return this.authToken;
    }

    /**
     * Getter for AuthToken.
     * Update or clear the auth token. Send `null` to remove.
     * @return Returns the String
     */
    public String getAuthToken() {
        return OptionalNullable.getFrom(authToken);
    }

    /**
     * Setter for AuthToken.
     * Update or clear the auth token. Send `null` to remove.
     * @param authToken Value for String
     */
    @JsonSetter("auth_token")
    public void setAuthToken(String authToken) {
        this.authToken = OptionalNullable.of(authToken);
    }

    /**
     * UnSetter for AuthToken.
     * Update or clear the auth token. Send `null` to remove.
     */
    public void unsetAuthToken() {
        authToken = null;
    }

    /**
     * Getter for Active.
     * Enable or disable the webhook.
     * @return Returns the Boolean
     */
    @JsonGetter("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * Enable or disable the webhook.
     * @param active Value for Boolean
     */
    @JsonSetter("active")
    public void setActive(Boolean active) {
        this.active = active;
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
     * Converts this WebhookUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WebhookUpdateRequest [" + "triggers=" + triggers + ", url=" + url + ", authToken="
                + authToken + ", active=" + active + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link WebhookUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WebhookUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .triggers(getTriggers())
                .url(getUrl())
                .active(getActive());
        builder.authToken = internalGetAuthToken();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link WebhookUpdateRequest}.
     */
    public static class Builder {
        private List<WebhookTrigger> triggers;
        private String url;
        private OptionalNullable<String> authToken;
        private Boolean active;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for triggers.
         * @param  triggers  List of WebhookTrigger value for triggers.
         * @return Builder
         */
        public Builder triggers(List<WebhookTrigger> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for authToken.
         * @param  authToken  String value for authToken.
         * @return Builder
         */
        public Builder authToken(String authToken) {
            this.authToken = OptionalNullable.of(authToken);
            return this;
        }

        /**
         * UnSetter for authToken.
         * @return Builder
         */
        public Builder unsetAuthToken() {
            authToken = null;
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
         * Builds a new {@link WebhookUpdateRequest} object using the set fields.
         * @return {@link WebhookUpdateRequest}
         */
        public WebhookUpdateRequest build() {
            WebhookUpdateRequest model =
                    new WebhookUpdateRequest(triggers, url, authToken, active);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
