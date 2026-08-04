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
 * This is a model class for MerchantWebhookLimitChargeByCardConfiguration type.
 */
public class MerchantWebhookLimitChargeByCardConfiguration {
    private Integer quantityOfCharges;
    private String durationWindow;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookLimitChargeByCardConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  quantityOfCharges  Integer value for quantityOfCharges.
     * @param  durationWindow  String value for durationWindow.
     */
    public MerchantWebhookLimitChargeByCardConfiguration(
            Integer quantityOfCharges,
            String durationWindow) {
        this.quantityOfCharges = quantityOfCharges;
        this.durationWindow = durationWindow;
    }

    /**
     * Getter for QuantityOfCharges.
     * Maximum number of charges allowed in the time window.
     * @return Returns the Integer
     */
    @JsonGetter("quantity_of_charges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantityOfCharges() {
        return quantityOfCharges;
    }

    /**
     * Setter for QuantityOfCharges.
     * Maximum number of charges allowed in the time window.
     * @param quantityOfCharges Value for Integer
     */
    @JsonSetter("quantity_of_charges")
    public void setQuantityOfCharges(Integer quantityOfCharges) {
        this.quantityOfCharges = quantityOfCharges;
    }

    /**
     * Getter for DurationWindow.
     * ISO-8601 duration for the rolling window.
     * @return Returns the String
     */
    @JsonGetter("duration_window")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDurationWindow() {
        return durationWindow;
    }

    /**
     * Setter for DurationWindow.
     * ISO-8601 duration for the rolling window.
     * @param durationWindow Value for String
     */
    @JsonSetter("duration_window")
    public void setDurationWindow(String durationWindow) {
        this.durationWindow = durationWindow;
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
     * Converts this MerchantWebhookLimitChargeByCardConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookLimitChargeByCardConfiguration [" + "quantityOfCharges="
                + quantityOfCharges + ", durationWindow=" + durationWindow
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookLimitChargeByCardConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookLimitChargeByCardConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .quantityOfCharges(getQuantityOfCharges())
                .durationWindow(getDurationWindow());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookLimitChargeByCardConfiguration}.
     */
    public static class Builder {
        private Integer quantityOfCharges;
        private String durationWindow;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for quantityOfCharges.
         * @param  quantityOfCharges  Integer value for quantityOfCharges.
         * @return Builder
         */
        public Builder quantityOfCharges(Integer quantityOfCharges) {
            this.quantityOfCharges = quantityOfCharges;
            return this;
        }

        /**
         * Setter for durationWindow.
         * @param  durationWindow  String value for durationWindow.
         * @return Builder
         */
        public Builder durationWindow(String durationWindow) {
            this.durationWindow = durationWindow;
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
         * Builds a new {@link MerchantWebhookLimitChargeByCardConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookLimitChargeByCardConfiguration}
         */
        public MerchantWebhookLimitChargeByCardConfiguration build() {
            MerchantWebhookLimitChargeByCardConfiguration model =
                    new MerchantWebhookLimitChargeByCardConfiguration(quantityOfCharges,
                            durationWindow);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
