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
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for SubscriptionSuspendRequest type.
 */
public class SubscriptionSuspendRequest {
    private SuspendScheduleSettings scheduleSettings;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionSuspendRequest() {
    }

    /**
     * Initialization constructor.
     * @param  scheduleSettings  SuspendScheduleSettings value for scheduleSettings.
     */
    public SubscriptionSuspendRequest(
            SuspendScheduleSettings scheduleSettings) {
        this.scheduleSettings = scheduleSettings;
    }

    /**
     * Getter for ScheduleSettings.
     * Schedule-related settings.
     * @return Returns the SuspendScheduleSettings
     */
    @JsonGetter("schedule_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SuspendScheduleSettings getScheduleSettings() {
        return scheduleSettings;
    }

    /**
     * Setter for ScheduleSettings.
     * Schedule-related settings.
     * @param scheduleSettings Value for SuspendScheduleSettings
     */
    @JsonSetter("schedule_settings")
    public void setScheduleSettings(SuspendScheduleSettings scheduleSettings) {
        this.scheduleSettings = scheduleSettings;
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
     * Converts this SubscriptionSuspendRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionSuspendRequest [" + "scheduleSettings=" + scheduleSettings
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionSuspendRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionSuspendRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .scheduleSettings(getScheduleSettings());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionSuspendRequest}.
     */
    public static class Builder {
        private SuspendScheduleSettings scheduleSettings;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for scheduleSettings.
         * @param  scheduleSettings  SuspendScheduleSettings value for scheduleSettings.
         * @return Builder
         */
        public Builder scheduleSettings(SuspendScheduleSettings scheduleSettings) {
            this.scheduleSettings = scheduleSettings;
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
         * Builds a new {@link SubscriptionSuspendRequest} object using the set fields.
         * @return {@link SubscriptionSuspendRequest}
         */
        public SubscriptionSuspendRequest build() {
            SubscriptionSuspendRequest model =
                    new SubscriptionSuspendRequest(scheduleSettings);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
