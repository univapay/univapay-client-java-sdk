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
 * This is a model class for SubscriptionScheduleSettings type.
 */
public class SubscriptionScheduleSettings {
    private LocalDate startOn;
    private String zoneId;
    private Boolean preserveEndOfMonth;
    private String retryInterval;
    private SubscriptionTerminationMode terminationMode;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionScheduleSettings() {
        terminationMode = SubscriptionTerminationMode.IMMEDIATE;
    }

    /**
     * Initialization constructor.
     * @param  startOn  LocalDate value for startOn.
     * @param  zoneId  String value for zoneId.
     * @param  preserveEndOfMonth  Boolean value for preserveEndOfMonth.
     * @param  retryInterval  String value for retryInterval.
     * @param  terminationMode  SubscriptionTerminationMode value for terminationMode.
     */
    public SubscriptionScheduleSettings(
            LocalDate startOn,
            String zoneId,
            Boolean preserveEndOfMonth,
            String retryInterval,
            SubscriptionTerminationMode terminationMode) {
        this.startOn = startOn;
        this.zoneId = zoneId;
        this.preserveEndOfMonth = preserveEndOfMonth;
        this.retryInterval = retryInterval;
        this.terminationMode = terminationMode;
    }

    /**
     * Getter for StartOn.
     * Date when the recurring schedule starts (YYYY-MM-DD).
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
     * Date when the recurring schedule starts (YYYY-MM-DD).
     * @param startOn Value for LocalDate
     */
    @JsonSetter("start_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartOn(LocalDate startOn) {
        this.startOn = startOn;
    }

    /**
     * Getter for ZoneId.
     * IANA Timezone ID.
     * @return Returns the String
     */
    @JsonGetter("zone_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Setter for ZoneId.
     * IANA Timezone ID.
     * @param zoneId Value for String
     */
    @JsonSetter("zone_id")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
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
     * ISO-8601 Duration for retry interval if payment fails (e.g., P5D).
     * @return Returns the String
     */
    @JsonGetter("retry_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRetryInterval() {
        return retryInterval;
    }

    /**
     * Setter for RetryInterval.
     * ISO-8601 Duration for retry interval if payment fails (e.g., P5D).
     * @param retryInterval Value for String
     */
    @JsonSetter("retry_interval")
    public void setRetryInterval(String retryInterval) {
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
     * Converts this SubscriptionScheduleSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionScheduleSettings [" + "startOn=" + startOn + ", zoneId=" + zoneId
                + ", preserveEndOfMonth=" + preserveEndOfMonth + ", retryInterval=" + retryInterval
                + ", terminationMode=" + terminationMode + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionScheduleSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionScheduleSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .startOn(getStartOn())
                .zoneId(getZoneId())
                .preserveEndOfMonth(getPreserveEndOfMonth())
                .retryInterval(getRetryInterval())
                .terminationMode(getTerminationMode());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionScheduleSettings}.
     */
    public static class Builder {
        private LocalDate startOn;
        private String zoneId;
        private Boolean preserveEndOfMonth;
        private String retryInterval;
        private SubscriptionTerminationMode terminationMode = SubscriptionTerminationMode.IMMEDIATE;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for zoneId.
         * @param  zoneId  String value for zoneId.
         * @return Builder
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
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
         * Builds a new {@link SubscriptionScheduleSettings} object using the set fields.
         * @return {@link SubscriptionScheduleSettings}
         */
        public SubscriptionScheduleSettings build() {
            SubscriptionScheduleSettings model =
                    new SubscriptionScheduleSettings(startOn, zoneId, preserveEndOfMonth,
                            retryInterval, terminationMode);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
