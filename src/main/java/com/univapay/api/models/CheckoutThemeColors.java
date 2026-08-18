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
 * This is a model class for CheckoutThemeColors type.
 */
public class CheckoutThemeColors {
    private String mainBackground;
    private String secondaryBackground;
    private String mainColor;
    private String mainText;
    private String primaryText;
    private String secondaryText;
    private String baseText;
    private String bodyBackground;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutThemeColors() {
    }

    /**
     * Initialization constructor.
     * @param  mainBackground  String value for mainBackground.
     * @param  secondaryBackground  String value for secondaryBackground.
     * @param  mainColor  String value for mainColor.
     * @param  mainText  String value for mainText.
     * @param  primaryText  String value for primaryText.
     * @param  secondaryText  String value for secondaryText.
     * @param  baseText  String value for baseText.
     * @param  bodyBackground  String value for bodyBackground.
     */
    public CheckoutThemeColors(
            String mainBackground,
            String secondaryBackground,
            String mainColor,
            String mainText,
            String primaryText,
            String secondaryText,
            String baseText,
            String bodyBackground) {
        this.mainBackground = mainBackground;
        this.secondaryBackground = secondaryBackground;
        this.mainColor = mainColor;
        this.mainText = mainText;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.baseText = baseText;
        this.bodyBackground = bodyBackground;
    }

    /**
     * Getter for MainBackground.
     * Main background color.
     * @return Returns the String
     */
    @JsonGetter("main_background")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMainBackground() {
        return mainBackground;
    }

    /**
     * Setter for MainBackground.
     * Main background color.
     * @param mainBackground Value for String
     */
    @JsonSetter("main_background")
    public void setMainBackground(String mainBackground) {
        this.mainBackground = mainBackground;
    }

    /**
     * Getter for SecondaryBackground.
     * Secondary background color.
     * @return Returns the String
     */
    @JsonGetter("secondary_background")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecondaryBackground() {
        return secondaryBackground;
    }

    /**
     * Setter for SecondaryBackground.
     * Secondary background color.
     * @param secondaryBackground Value for String
     */
    @JsonSetter("secondary_background")
    public void setSecondaryBackground(String secondaryBackground) {
        this.secondaryBackground = secondaryBackground;
    }

    /**
     * Getter for MainColor.
     * Main accent color.
     * @return Returns the String
     */
    @JsonGetter("main_color")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMainColor() {
        return mainColor;
    }

    /**
     * Setter for MainColor.
     * Main accent color.
     * @param mainColor Value for String
     */
    @JsonSetter("main_color")
    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    /**
     * Getter for MainText.
     * Main text color.
     * @return Returns the String
     */
    @JsonGetter("main_text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMainText() {
        return mainText;
    }

    /**
     * Setter for MainText.
     * Main text color.
     * @param mainText Value for String
     */
    @JsonSetter("main_text")
    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    /**
     * Getter for PrimaryText.
     * Primary text color.
     * @return Returns the String
     */
    @JsonGetter("primary_text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrimaryText() {
        return primaryText;
    }

    /**
     * Setter for PrimaryText.
     * Primary text color.
     * @param primaryText Value for String
     */
    @JsonSetter("primary_text")
    public void setPrimaryText(String primaryText) {
        this.primaryText = primaryText;
    }

    /**
     * Getter for SecondaryText.
     * Secondary text color.
     * @return Returns the String
     */
    @JsonGetter("secondary_text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecondaryText() {
        return secondaryText;
    }

    /**
     * Setter for SecondaryText.
     * Secondary text color.
     * @param secondaryText Value for String
     */
    @JsonSetter("secondary_text")
    public void setSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
    }

    /**
     * Getter for BaseText.
     * Base text color.
     * @return Returns the String
     */
    @JsonGetter("base_text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBaseText() {
        return baseText;
    }

    /**
     * Setter for BaseText.
     * Base text color.
     * @param baseText Value for String
     */
    @JsonSetter("base_text")
    public void setBaseText(String baseText) {
        this.baseText = baseText;
    }

    /**
     * Getter for BodyBackground.
     * Body background color.
     * @return Returns the String
     */
    @JsonGetter("body_background")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBodyBackground() {
        return bodyBackground;
    }

    /**
     * Setter for BodyBackground.
     * Body background color.
     * @param bodyBackground Value for String
     */
    @JsonSetter("body_background")
    public void setBodyBackground(String bodyBackground) {
        this.bodyBackground = bodyBackground;
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
     * Converts this CheckoutThemeColors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutThemeColors [" + "mainBackground=" + mainBackground
                + ", secondaryBackground=" + secondaryBackground + ", mainColor=" + mainColor
                + ", mainText=" + mainText + ", primaryText=" + primaryText + ", secondaryText="
                + secondaryText + ", baseText=" + baseText + ", bodyBackground=" + bodyBackground
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutThemeColors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutThemeColors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mainBackground(getMainBackground())
                .secondaryBackground(getSecondaryBackground())
                .mainColor(getMainColor())
                .mainText(getMainText())
                .primaryText(getPrimaryText())
                .secondaryText(getSecondaryText())
                .baseText(getBaseText())
                .bodyBackground(getBodyBackground());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutThemeColors}.
     */
    public static class Builder {
        private String mainBackground;
        private String secondaryBackground;
        private String mainColor;
        private String mainText;
        private String primaryText;
        private String secondaryText;
        private String baseText;
        private String bodyBackground;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for mainBackground.
         * @param  mainBackground  String value for mainBackground.
         * @return Builder
         */
        public Builder mainBackground(String mainBackground) {
            this.mainBackground = mainBackground;
            return this;
        }

        /**
         * Setter for secondaryBackground.
         * @param  secondaryBackground  String value for secondaryBackground.
         * @return Builder
         */
        public Builder secondaryBackground(String secondaryBackground) {
            this.secondaryBackground = secondaryBackground;
            return this;
        }

        /**
         * Setter for mainColor.
         * @param  mainColor  String value for mainColor.
         * @return Builder
         */
        public Builder mainColor(String mainColor) {
            this.mainColor = mainColor;
            return this;
        }

        /**
         * Setter for mainText.
         * @param  mainText  String value for mainText.
         * @return Builder
         */
        public Builder mainText(String mainText) {
            this.mainText = mainText;
            return this;
        }

        /**
         * Setter for primaryText.
         * @param  primaryText  String value for primaryText.
         * @return Builder
         */
        public Builder primaryText(String primaryText) {
            this.primaryText = primaryText;
            return this;
        }

        /**
         * Setter for secondaryText.
         * @param  secondaryText  String value for secondaryText.
         * @return Builder
         */
        public Builder secondaryText(String secondaryText) {
            this.secondaryText = secondaryText;
            return this;
        }

        /**
         * Setter for baseText.
         * @param  baseText  String value for baseText.
         * @return Builder
         */
        public Builder baseText(String baseText) {
            this.baseText = baseText;
            return this;
        }

        /**
         * Setter for bodyBackground.
         * @param  bodyBackground  String value for bodyBackground.
         * @return Builder
         */
        public Builder bodyBackground(String bodyBackground) {
            this.bodyBackground = bodyBackground;
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
         * Builds a new {@link CheckoutThemeColors} object using the set fields.
         * @return {@link CheckoutThemeColors}
         */
        public CheckoutThemeColors build() {
            CheckoutThemeColors model =
                    new CheckoutThemeColors(mainBackground, secondaryBackground, mainColor,
                            mainText, primaryText, secondaryText, baseText, bodyBackground);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
