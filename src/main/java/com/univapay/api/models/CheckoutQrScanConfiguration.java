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
 * This is a model class for CheckoutQrScanConfiguration type.
 */
public class CheckoutQrScanConfiguration {
    private Boolean enabled;
    private OptionalNullable<List<String>> forbiddenQrScanGateways;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutQrScanConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  forbiddenQrScanGateways  List of String value for forbiddenQrScanGateways.
     */
    public CheckoutQrScanConfiguration(
            Boolean enabled,
            List<String> forbiddenQrScanGateways) {
        this.enabled = enabled;
        this.forbiddenQrScanGateways = OptionalNullable.of(forbiddenQrScanGateways);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  forbiddenQrScanGateways  List of String value for forbiddenQrScanGateways.
     */

    protected CheckoutQrScanConfiguration(Boolean enabled,
            OptionalNullable<List<String>> forbiddenQrScanGateways) {
        this.enabled = enabled;
        this.forbiddenQrScanGateways = forbiddenQrScanGateways;
    }

    /**
     * Getter for Enabled.
     * Whether QR-scan payments are enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether QR-scan payments are enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Internal Getter for ForbiddenQrScanGateways.
     * QR-scan gateways disabled for the merchant. Common values include `alipay`, `alipay_plus`,
     * `pay_pay`, `we_chat`, `univapay`, and `test`. `null` when no gateway is forbidden.
     * @return Returns the Internal List of String
     */
    @JsonGetter("forbidden_qr_scan_gateways")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetForbiddenQrScanGateways() {
        return this.forbiddenQrScanGateways;
    }

    /**
     * Getter for ForbiddenQrScanGateways.
     * QR-scan gateways disabled for the merchant. Common values include `alipay`, `alipay_plus`,
     * `pay_pay`, `we_chat`, `univapay`, and `test`. `null` when no gateway is forbidden.
     * @return Returns the List of String
     */
    public List<String> getForbiddenQrScanGateways() {
        return OptionalNullable.getFrom(forbiddenQrScanGateways);
    }

    /**
     * Setter for ForbiddenQrScanGateways.
     * QR-scan gateways disabled for the merchant. Common values include `alipay`, `alipay_plus`,
     * `pay_pay`, `we_chat`, `univapay`, and `test`. `null` when no gateway is forbidden.
     * @param forbiddenQrScanGateways Value for List of String
     */
    @JsonSetter("forbidden_qr_scan_gateways")
    public void setForbiddenQrScanGateways(List<String> forbiddenQrScanGateways) {
        this.forbiddenQrScanGateways = OptionalNullable.of(forbiddenQrScanGateways);
    }

    /**
     * UnSetter for ForbiddenQrScanGateways.
     * QR-scan gateways disabled for the merchant. Common values include `alipay`, `alipay_plus`,
     * `pay_pay`, `we_chat`, `univapay`, and `test`. `null` when no gateway is forbidden.
     */
    public void unsetForbiddenQrScanGateways() {
        forbiddenQrScanGateways = null;
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
     * Converts this CheckoutQrScanConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutQrScanConfiguration [" + "enabled=" + enabled + ", forbiddenQrScanGateways="
                + forbiddenQrScanGateways + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutQrScanConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutQrScanConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled());
        builder.forbiddenQrScanGateways = internalGetForbiddenQrScanGateways();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutQrScanConfiguration}.
     */
    public static class Builder {
        private Boolean enabled;
        private OptionalNullable<List<String>> forbiddenQrScanGateways;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for forbiddenQrScanGateways.
         * @param  forbiddenQrScanGateways  List of String value for forbiddenQrScanGateways.
         * @return Builder
         */
        public Builder forbiddenQrScanGateways(List<String> forbiddenQrScanGateways) {
            this.forbiddenQrScanGateways = OptionalNullable.of(forbiddenQrScanGateways);
            return this;
        }

        /**
         * UnSetter for forbiddenQrScanGateways.
         * @return Builder
         */
        public Builder unsetForbiddenQrScanGateways() {
            forbiddenQrScanGateways = null;
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
         * Builds a new {@link CheckoutQrScanConfiguration} object using the set fields.
         * @return {@link CheckoutQrScanConfiguration}
         */
        public CheckoutQrScanConfiguration build() {
            CheckoutQrScanConfiguration model =
                    new CheckoutQrScanConfiguration(enabled, forbiddenQrScanGateways);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
