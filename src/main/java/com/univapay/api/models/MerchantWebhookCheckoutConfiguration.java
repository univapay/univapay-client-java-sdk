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
 * This is a model class for MerchantWebhookCheckoutConfiguration type.
 */
public class MerchantWebhookCheckoutConfiguration {
    private MerchantWebhookCheckoutToggle ecEmail;
    private MerchantWebhookCheckoutToggle ecProducts;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookCheckoutConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  ecEmail  MerchantWebhookCheckoutToggle value for ecEmail.
     * @param  ecProducts  MerchantWebhookCheckoutToggle value for ecProducts.
     */
    public MerchantWebhookCheckoutConfiguration(
            MerchantWebhookCheckoutToggle ecEmail,
            MerchantWebhookCheckoutToggle ecProducts) {
        this.ecEmail = ecEmail;
        this.ecProducts = ecProducts;
    }

    /**
     * Getter for EcEmail.
     * Checkout feature toggle.
     * @return Returns the MerchantWebhookCheckoutToggle
     */
    @JsonGetter("ec_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookCheckoutToggle getEcEmail() {
        return ecEmail;
    }

    /**
     * Setter for EcEmail.
     * Checkout feature toggle.
     * @param ecEmail Value for MerchantWebhookCheckoutToggle
     */
    @JsonSetter("ec_email")
    public void setEcEmail(MerchantWebhookCheckoutToggle ecEmail) {
        this.ecEmail = ecEmail;
    }

    /**
     * Getter for EcProducts.
     * Checkout feature toggle.
     * @return Returns the MerchantWebhookCheckoutToggle
     */
    @JsonGetter("ec_products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookCheckoutToggle getEcProducts() {
        return ecProducts;
    }

    /**
     * Setter for EcProducts.
     * Checkout feature toggle.
     * @param ecProducts Value for MerchantWebhookCheckoutToggle
     */
    @JsonSetter("ec_products")
    public void setEcProducts(MerchantWebhookCheckoutToggle ecProducts) {
        this.ecProducts = ecProducts;
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
     * Converts this MerchantWebhookCheckoutConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookCheckoutConfiguration [" + "ecEmail=" + ecEmail + ", ecProducts="
                + ecProducts + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookCheckoutConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookCheckoutConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ecEmail(getEcEmail())
                .ecProducts(getEcProducts());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookCheckoutConfiguration}.
     */
    public static class Builder {
        private MerchantWebhookCheckoutToggle ecEmail;
        private MerchantWebhookCheckoutToggle ecProducts;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for ecEmail.
         * @param  ecEmail  MerchantWebhookCheckoutToggle value for ecEmail.
         * @return Builder
         */
        public Builder ecEmail(MerchantWebhookCheckoutToggle ecEmail) {
            this.ecEmail = ecEmail;
            return this;
        }

        /**
         * Setter for ecProducts.
         * @param  ecProducts  MerchantWebhookCheckoutToggle value for ecProducts.
         * @return Builder
         */
        public Builder ecProducts(MerchantWebhookCheckoutToggle ecProducts) {
            this.ecProducts = ecProducts;
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
         * Builds a new {@link MerchantWebhookCheckoutConfiguration} object using the set fields.
         * @return {@link MerchantWebhookCheckoutConfiguration}
         */
        public MerchantWebhookCheckoutConfiguration build() {
            MerchantWebhookCheckoutConfiguration model =
                    new MerchantWebhookCheckoutConfiguration(ecEmail, ecProducts);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
