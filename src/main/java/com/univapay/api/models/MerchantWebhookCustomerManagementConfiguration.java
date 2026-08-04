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
 * This is a model class for MerchantWebhookCustomerManagementConfiguration type.
 */
public class MerchantWebhookCustomerManagementConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<List<String>> defaultRoles;
    private OptionalNullable<String> defaultMode;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookCustomerManagementConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  defaultRoles  List of String value for defaultRoles.
     * @param  defaultMode  String value for defaultMode.
     */
    public MerchantWebhookCustomerManagementConfiguration(
            Boolean enabled,
            List<String> defaultRoles,
            String defaultMode) {
        this.enabled = OptionalNullable.of(enabled);
        this.defaultRoles = OptionalNullable.of(defaultRoles);
        this.defaultMode = OptionalNullable.of(defaultMode);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  defaultRoles  List of String value for defaultRoles.
     * @param  defaultMode  String value for defaultMode.
     */

    protected MerchantWebhookCustomerManagementConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<List<String>> defaultRoles, OptionalNullable<String> defaultMode) {
        this.enabled = enabled;
        this.defaultRoles = defaultRoles;
        this.defaultMode = defaultMode;
    }

    /**
     * Internal Getter for Enabled.
     * Enables customer-management features.
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
     * Enables customer-management features.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables customer-management features.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables customer-management features.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for DefaultRoles.
     * Roles applied to newly created customers.
     * @return Returns the Internal List of String
     */
    @JsonGetter("default_roles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetDefaultRoles() {
        return this.defaultRoles;
    }

    /**
     * Getter for DefaultRoles.
     * Roles applied to newly created customers.
     * @return Returns the List of String
     */
    public List<String> getDefaultRoles() {
        return OptionalNullable.getFrom(defaultRoles);
    }

    /**
     * Setter for DefaultRoles.
     * Roles applied to newly created customers.
     * @param defaultRoles Value for List of String
     */
    @JsonSetter("default_roles")
    public void setDefaultRoles(List<String> defaultRoles) {
        this.defaultRoles = OptionalNullable.of(defaultRoles);
    }

    /**
     * UnSetter for DefaultRoles.
     * Roles applied to newly created customers.
     */
    public void unsetDefaultRoles() {
        defaultRoles = null;
    }

    /**
     * Internal Getter for DefaultMode.
     * Default processing mode assigned to new customer records.
     * @return Returns the Internal String
     */
    @JsonGetter("default_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDefaultMode() {
        return this.defaultMode;
    }

    /**
     * Getter for DefaultMode.
     * Default processing mode assigned to new customer records.
     * @return Returns the String
     */
    public String getDefaultMode() {
        return OptionalNullable.getFrom(defaultMode);
    }

    /**
     * Setter for DefaultMode.
     * Default processing mode assigned to new customer records.
     * @param defaultMode Value for String
     */
    @JsonSetter("default_mode")
    public void setDefaultMode(String defaultMode) {
        this.defaultMode = OptionalNullable.of(defaultMode);
    }

    /**
     * UnSetter for DefaultMode.
     * Default processing mode assigned to new customer records.
     */
    public void unsetDefaultMode() {
        defaultMode = null;
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
     * Converts this MerchantWebhookCustomerManagementConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookCustomerManagementConfiguration [" + "enabled=" + enabled
                + ", defaultRoles=" + defaultRoles + ", defaultMode=" + defaultMode
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookCustomerManagementConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookCustomerManagementConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.defaultRoles = internalGetDefaultRoles();
        builder.defaultMode = internalGetDefaultMode();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookCustomerManagementConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<List<String>> defaultRoles;
        private OptionalNullable<String> defaultMode;
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
         * Setter for defaultRoles.
         * @param  defaultRoles  List of String value for defaultRoles.
         * @return Builder
         */
        public Builder defaultRoles(List<String> defaultRoles) {
            this.defaultRoles = OptionalNullable.of(defaultRoles);
            return this;
        }

        /**
         * UnSetter for defaultRoles.
         * @return Builder
         */
        public Builder unsetDefaultRoles() {
            defaultRoles = null;
            return this;
        }

        /**
         * Setter for defaultMode.
         * @param  defaultMode  String value for defaultMode.
         * @return Builder
         */
        public Builder defaultMode(String defaultMode) {
            this.defaultMode = OptionalNullable.of(defaultMode);
            return this;
        }

        /**
         * UnSetter for defaultMode.
         * @return Builder
         */
        public Builder unsetDefaultMode() {
            defaultMode = null;
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
         * Builds a new {@link MerchantWebhookCustomerManagementConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookCustomerManagementConfiguration}
         */
        public MerchantWebhookCustomerManagementConfiguration build() {
            MerchantWebhookCustomerManagementConfiguration model =
                    new MerchantWebhookCustomerManagementConfiguration(enabled, defaultRoles,
                            defaultMode);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
