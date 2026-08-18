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
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDate;
import java.util.Map;

/**
 * This is a model class for SubscriptionUpdateScheduleSettings type.
 */
public class SubscriptionUpdateScheduleSettings {
    private SubscriptionTerminationMode terminationMode;
    private LocalDate startOn;
    private Boolean preserveEndOfMonth;
    private String retryInterval;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionUpdateScheduleSettings() {
        terminationMode = SubscriptionTerminationMode.IMMEDIATE;
    }

    /**
     * Initialization constructor.
     * @param  terminationMode  SubscriptionTerminationMode value for terminationMode.
     * @param  startOn  LocalDate value for startOn.
     * @param  preserveEndOfMonth  Boolean value for preserveEndOfMonth.
     * @param  retryInterval  String value for retryInterval.
     */
    public SubscriptionUpdateScheduleSettings(
            SubscriptionTerminationMode terminationMode,
            LocalDate startOn,
            Boolean preserveEndOfMonth,
            String retryInterval) {
        this.terminationMode = terminationMode;
        this.startOn = startOn;
        this.preserveEndOfMonth = preserveEndOfMonth;
        this.retryInterval = retryInterval;
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
     * Getter for StartOn.
     * Subscription start date (YYYY-MM-DD). Used to change the first actual charge date for
     * subscriptions that initially only registered a payment method. Must be in the future; only
     * available before the subscription has more than one paid payment.
     * @return Returns the LocalDate
     */
    @JsonGetter("start_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getStartOn() {
        return startOn;
    }

    /**
     * Setter for StartOn.
     * Subscription start date (YYYY-MM-DD). Used to change the first actual charge date for
     * subscriptions that initially only registered a payment method. Must be in the future; only
     * available before the subscription has more than one paid payment.
     * @param startOn Value for LocalDate
     */
    @JsonSetter("start_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartOn(LocalDate startOn) {
        this.startOn = startOn;
    }

    /**
     * Getter for PreserveEndOfMonth.
     * If true, subsequent charges will always occur on the last day of the month.
     * @return Returns the Boolean
     */
    @JsonGetter("preserve_end_of_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPreserveEndOfMonth() {
        return preserveEndOfMonth;
    }

    /**
     * Setter for PreserveEndOfMonth.
     * If true, subsequent charges will always occur on the last day of the month.
     * @param preserveEndOfMonth Value for Boolean
     */
    @JsonSetter("preserve_end_of_month")
    public void setPreserveEndOfMonth(Boolean preserveEndOfMonth) {
        this.preserveEndOfMonth = preserveEndOfMonth;
    }

    /**
     * Getter for RetryInterval.
     * ISO-8601 Duration for retry interval if payment fails (e.g., P3D for 3 days, PT48H for 48
     * hours).
     * @return Returns the String
     */
    @JsonGetter("retry_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRetryInterval() {
        return retryInterval;
    }

    /**
     * Setter for RetryInterval.
     * ISO-8601 Duration for retry interval if payment fails (e.g., P3D for 3 days, PT48H for 48
     * hours).
     * @param retryInterval Value for String
     */
    @JsonSetter("retry_interval")
    public void setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
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
     * Converts this SubscriptionUpdateScheduleSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionUpdateScheduleSettings [" + "terminationMode=" + terminationMode
                + ", startOn=" + startOn + ", preserveEndOfMonth=" + preserveEndOfMonth
                + ", retryInterval=" + retryInterval + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionUpdateScheduleSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionUpdateScheduleSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .terminationMode(getTerminationMode())
                .startOn(getStartOn())
                .preserveEndOfMonth(getPreserveEndOfMonth())
                .retryInterval(getRetryInterval());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionUpdateScheduleSettings}.
     */
    public static class Builder {
        private SubscriptionTerminationMode terminationMode = SubscriptionTerminationMode.IMMEDIATE;
        private LocalDate startOn;
        private Boolean preserveEndOfMonth;
        private String retryInterval;
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
         * Setter for startOn.
         * @param  startOn  LocalDate value for startOn.
         * @return Builder
         */
        public Builder startOn(LocalDate startOn) {
            this.startOn = startOn;
            return this;
        }

        /**
         * Setter for preserveEndOfMonth.
         * @param  preserveEndOfMonth  Boolean value for preserveEndOfMonth.
         * @return Builder
         */
        public Builder preserveEndOfMonth(Boolean preserveEndOfMonth) {
            this.preserveEndOfMonth = preserveEndOfMonth;
            return this;
        }

        /**
         * Setter for retryInterval.
         * @param  retryInterval  String value for retryInterval.
         * @return Builder
         */
        public Builder retryInterval(String retryInterval) {
            this.retryInterval = retryInterval;
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
         * Builds a new {@link SubscriptionUpdateScheduleSettings} object using the set fields.
         * @return {@link SubscriptionUpdateScheduleSettings}
         */
        public SubscriptionUpdateScheduleSettings build() {
            SubscriptionUpdateScheduleSettings model =
                    new SubscriptionUpdateScheduleSettings(terminationMode, startOn,
                            preserveEndOfMonth, retryInterval);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
