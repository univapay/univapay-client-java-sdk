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
import java.util.Map;

/**
 * This is a model class for RestrictIpAfterFailedChargeConfig type.
 */
public class RestrictIpAfterFailedChargeConfig {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<Integer> count;
    private OptionalNullable<String> cooldown;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public RestrictIpAfterFailedChargeConfig() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  count  Integer value for count.
     * @param  cooldown  String value for cooldown.
     */
    public RestrictIpAfterFailedChargeConfig(
            Boolean enabled,
            Integer count,
            String cooldown) {
        this.enabled = OptionalNullable.of(enabled);
        this.count = OptionalNullable.of(count);
        this.cooldown = OptionalNullable.of(cooldown);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  count  Integer value for count.
     * @param  cooldown  String value for cooldown.
     */

    protected RestrictIpAfterFailedChargeConfig(OptionalNullable<Boolean> enabled,
            OptionalNullable<Integer> count, OptionalNullable<String> cooldown) {
        this.enabled = enabled;
        this.count = count;
        this.cooldown = cooldown;
    }

    /**
     * Internal Getter for Enabled.
     * Enables temporary IP restrictions after repeated failures.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetEnabled() {
        return this.enabled;
    }

    /**
     * Getter for Enabled.
     * Enables temporary IP restrictions after repeated failures.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables temporary IP restrictions after repeated failures.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables temporary IP restrictions after repeated failures.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for Count.
     * Number of failed charges allowed before restriction starts.
     * @return Returns the Internal Integer
     */
    @JsonGetter("count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCount() {
        return this.count;
    }

    /**
     * Getter for Count.
     * Number of failed charges allowed before restriction starts.
     * @return Returns the Integer
     */
    public Integer getCount() {
        return OptionalNullable.getFrom(count);
    }

    /**
     * Setter for Count.
     * Number of failed charges allowed before restriction starts.
     * @param count Value for Integer
     */
    @JsonSetter("count")
    public void setCount(Integer count) {
        this.count = OptionalNullable.of(count);
    }

    /**
     * UnSetter for Count.
     * Number of failed charges allowed before restriction starts.
     */
    public void unsetCount() {
        count = null;
    }

    /**
     * Internal Getter for Cooldown.
     * ISO-8601 duration that the IP restriction remains active.
     * @return Returns the Internal String
     */
    @JsonGetter("cooldown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCooldown() {
        return this.cooldown;
    }

    /**
     * Getter for Cooldown.
     * ISO-8601 duration that the IP restriction remains active.
     * @return Returns the String
     */
    public String getCooldown() {
        return OptionalNullable.getFrom(cooldown);
    }

    /**
     * Setter for Cooldown.
     * ISO-8601 duration that the IP restriction remains active.
     * @param cooldown Value for String
     */
    @JsonSetter("cooldown")
    public void setCooldown(String cooldown) {
        this.cooldown = OptionalNullable.of(cooldown);
    }

    /**
     * UnSetter for Cooldown.
     * ISO-8601 duration that the IP restriction remains active.
     */
    public void unsetCooldown() {
        cooldown = null;
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
     * Converts this RestrictIpAfterFailedChargeConfig into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RestrictIpAfterFailedChargeConfig [" + "enabled=" + enabled + ", count=" + count
                + ", cooldown=" + cooldown + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link RestrictIpAfterFailedChargeConfig.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RestrictIpAfterFailedChargeConfig.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.count = internalGetCount();
        builder.cooldown = internalGetCooldown();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link RestrictIpAfterFailedChargeConfig}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<Integer> count;
        private OptionalNullable<String> cooldown;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = OptionalNullable.of(enabled);
            return this;
        }

        /**
         * UnSetter for enabled.
         * @return Builder
         */
        public Builder unsetEnabled() {
            enabled = null;
            return this;
        }

        /**
         * Setter for count.
         * @param  count  Integer value for count.
         * @return Builder
         */
        public Builder count(Integer count) {
            this.count = OptionalNullable.of(count);
            return this;
        }

        /**
         * UnSetter for count.
         * @return Builder
         */
        public Builder unsetCount() {
            count = null;
            return this;
        }

        /**
         * Setter for cooldown.
         * @param  cooldown  String value for cooldown.
         * @return Builder
         */
        public Builder cooldown(String cooldown) {
            this.cooldown = OptionalNullable.of(cooldown);
            return this;
        }

        /**
         * UnSetter for cooldown.
         * @return Builder
         */
        public Builder unsetCooldown() {
            cooldown = null;
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
         * Builds a new {@link RestrictIpAfterFailedChargeConfig} object using the set fields.
         * @return {@link RestrictIpAfterFailedChargeConfig}
         */
        public RestrictIpAfterFailedChargeConfig build() {
            RestrictIpAfterFailedChargeConfig model =
                    new RestrictIpAfterFailedChargeConfig(enabled, count, cooldown);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
