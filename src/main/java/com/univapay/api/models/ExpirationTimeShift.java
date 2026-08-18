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
 * This is a model class for ExpirationTimeShift type.
 */
public class ExpirationTimeShift {
    private String value;
    private Boolean enabled;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ExpirationTimeShift() {
    }

    /**
     * Initialization constructor.
     * @param  value  String value for value.
     * @param  enabled  Boolean value for enabled.
     */
    public ExpirationTimeShift(
            String value,
            Boolean enabled) {
        this.value = value;
        this.enabled = enabled;
    }

    /**
     * Getter for Value.
     * ISO-8601 offset time (HH:mm:ssXXX) that overrides the expiration cutoff. Omitted entirely
     * when no override is configured.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * ISO-8601 offset time (HH:mm:ssXXX) that overrides the expiration cutoff. Omitted entirely
     * when no override is configured.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for Enabled.
     * Whether the time-of-day override is applied.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether the time-of-day override is applied.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
     * Converts this ExpirationTimeShift into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ExpirationTimeShift [" + "value=" + value + ", enabled=" + enabled
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ExpirationTimeShift.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ExpirationTimeShift.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .value(getValue())
                .enabled(getEnabled());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ExpirationTimeShift}.
     */
    public static class Builder {
        private String value;
        private Boolean enabled;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
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
         * Builds a new {@link ExpirationTimeShift} object using the set fields.
         * @return {@link ExpirationTimeShift}
         */
        public ExpirationTimeShift build() {
            ExpirationTimeShift model =
                    new ExpirationTimeShift(value, enabled);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
