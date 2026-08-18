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
 * This is a model class for CheckoutTheme type.
 */
public class CheckoutTheme {
    private CheckoutThemeColors colors;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutTheme() {
    }

    /**
     * Initialization constructor.
     * @param  colors  CheckoutThemeColors value for colors.
     */
    public CheckoutTheme(
            CheckoutThemeColors colors) {
        this.colors = colors;
    }

    /**
     * Getter for Colors.
     * Hex colors applied to the checkout widget. Always resolves to the platform defaults shown
     * here when not customized — never `null`.
     * @return Returns the CheckoutThemeColors
     */
    @JsonGetter("colors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutThemeColors getColors() {
        return colors;
    }

    /**
     * Setter for Colors.
     * Hex colors applied to the checkout widget. Always resolves to the platform defaults shown
     * here when not customized — never `null`.
     * @param colors Value for CheckoutThemeColors
     */
    @JsonSetter("colors")
    public void setColors(CheckoutThemeColors colors) {
        this.colors = colors;
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
     * Converts this CheckoutTheme into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutTheme [" + "colors=" + colors + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutTheme.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutTheme.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .colors(getColors());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutTheme}.
     */
    public static class Builder {
        private CheckoutThemeColors colors;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for colors.
         * @param  colors  CheckoutThemeColors value for colors.
         * @return Builder
         */
        public Builder colors(CheckoutThemeColors colors) {
            this.colors = colors;
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
         * Builds a new {@link CheckoutTheme} object using the set fields.
         * @return {@link CheckoutTheme}
         */
        public CheckoutTheme build() {
            CheckoutTheme model =
                    new CheckoutTheme(colors);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
