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
 * This is a model class for SuspendScheduleSettings type.
 */
public class SuspendScheduleSettings {
    private SubscriptionTerminationMode terminationMode;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SuspendScheduleSettings() {
        terminationMode = SubscriptionTerminationMode.IMMEDIATE;
    }

    /**
     * Initialization constructor.
     * @param  terminationMode  SubscriptionTerminationMode value for terminationMode.
     */
    public SuspendScheduleSettings(
            SubscriptionTerminationMode terminationMode) {
        this.terminationMode = terminationMode;
    }

    /**
     * Getter for TerminationMode.
     * Subscription Termination Mode schema.
     * @return Returns the SubscriptionTerminationMode
     */
    @JsonGetter("termination_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionTerminationMode getTerminationMode() {
        return terminationMode;
    }

    /**
     * Setter for TerminationMode.
     * Subscription Termination Mode schema.
     * @param terminationMode Value for SubscriptionTerminationMode
     */
    @JsonSetter("termination_mode")
    public void setTerminationMode(SubscriptionTerminationMode terminationMode) {
        this.terminationMode = terminationMode;
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
     * Converts this SuspendScheduleSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SuspendScheduleSettings [" + "terminationMode=" + terminationMode
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SuspendScheduleSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SuspendScheduleSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .terminationMode(getTerminationMode());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SuspendScheduleSettings}.
     */
    public static class Builder {
        private SubscriptionTerminationMode terminationMode = SubscriptionTerminationMode.IMMEDIATE;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for terminationMode.
         * @param  terminationMode  SubscriptionTerminationMode value for terminationMode.
         * @return Builder
         */
        public Builder terminationMode(SubscriptionTerminationMode terminationMode) {
            this.terminationMode = terminationMode;
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
         * Builds a new {@link SuspendScheduleSettings} object using the set fields.
         * @return {@link SuspendScheduleSettings}
         */
        public SuspendScheduleSettings build() {
            SuspendScheduleSettings model =
                    new SuspendScheduleSettings(terminationMode);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
