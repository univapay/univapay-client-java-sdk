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
 * This is a model class for CardProcessorInstallmentConfig type.
 */
public class CardProcessorInstallmentConfig {
    private OptionalNullable<Boolean> revolving;
    private OptionalNullable<Boolean> fixedCycle;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CardProcessorInstallmentConfig() {
    }

    /**
     * Initialization constructor.
     * @param  revolving  Boolean value for revolving.
     * @param  fixedCycle  Boolean value for fixedCycle.
     */
    public CardProcessorInstallmentConfig(
            Boolean revolving,
            Boolean fixedCycle) {
        this.revolving = OptionalNullable.of(revolving);
        this.fixedCycle = OptionalNullable.of(fixedCycle);
    }

    /**
     * Initialization constructor.
     * @param  revolving  Boolean value for revolving.
     * @param  fixedCycle  Boolean value for fixedCycle.
     */

    protected CardProcessorInstallmentConfig(OptionalNullable<Boolean> revolving,
            OptionalNullable<Boolean> fixedCycle) {
        this.revolving = revolving;
        this.fixedCycle = fixedCycle;
    }

    /**
     * Internal Getter for Revolving.
     * Allows revolving payments through supported processors.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("revolving")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetRevolving() {
        return this.revolving;
    }

    /**
     * Getter for Revolving.
     * Allows revolving payments through supported processors.
     * @return Returns the Boolean
     */
    public Boolean getRevolving() {
        return OptionalNullable.getFrom(revolving);
    }

    /**
     * Setter for Revolving.
     * Allows revolving payments through supported processors.
     * @param revolving Value for Boolean
     */
    @JsonSetter("revolving")
    public void setRevolving(Boolean revolving) {
        this.revolving = OptionalNullable.of(revolving);
    }

    /**
     * UnSetter for Revolving.
     * Allows revolving payments through supported processors.
     */
    public void unsetRevolving() {
        revolving = null;
    }

    /**
     * Internal Getter for FixedCycle.
     * Allows fixed-cycle installment payments through supported processors.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("fixed_cycle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetFixedCycle() {
        return this.fixedCycle;
    }

    /**
     * Getter for FixedCycle.
     * Allows fixed-cycle installment payments through supported processors.
     * @return Returns the Boolean
     */
    public Boolean getFixedCycle() {
        return OptionalNullable.getFrom(fixedCycle);
    }

    /**
     * Setter for FixedCycle.
     * Allows fixed-cycle installment payments through supported processors.
     * @param fixedCycle Value for Boolean
     */
    @JsonSetter("fixed_cycle")
    public void setFixedCycle(Boolean fixedCycle) {
        this.fixedCycle = OptionalNullable.of(fixedCycle);
    }

    /**
     * UnSetter for FixedCycle.
     * Allows fixed-cycle installment payments through supported processors.
     */
    public void unsetFixedCycle() {
        fixedCycle = null;
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
     * Converts this CardProcessorInstallmentConfig into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardProcessorInstallmentConfig [" + "revolving=" + revolving + ", fixedCycle="
                + fixedCycle + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CardProcessorInstallmentConfig.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardProcessorInstallmentConfig.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.revolving = internalGetRevolving();
        builder.fixedCycle = internalGetFixedCycle();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CardProcessorInstallmentConfig}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> revolving;
        private OptionalNullable<Boolean> fixedCycle;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for revolving.
         * @param  revolving  Boolean value for revolving.
         * @return Builder
         */
        public Builder revolving(Boolean revolving) {
            this.revolving = OptionalNullable.of(revolving);
            return this;
        }

        /**
         * UnSetter for revolving.
         * @return Builder
         */
        public Builder unsetRevolving() {
            revolving = null;
            return this;
        }

        /**
         * Setter for fixedCycle.
         * @param  fixedCycle  Boolean value for fixedCycle.
         * @return Builder
         */
        public Builder fixedCycle(Boolean fixedCycle) {
            this.fixedCycle = OptionalNullable.of(fixedCycle);
            return this;
        }

        /**
         * UnSetter for fixedCycle.
         * @return Builder
         */
        public Builder unsetFixedCycle() {
            fixedCycle = null;
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
         * Builds a new {@link CardProcessorInstallmentConfig} object using the set fields.
         * @return {@link CardProcessorInstallmentConfig}
         */
        public CardProcessorInstallmentConfig build() {
            CardProcessorInstallmentConfig model =
                    new CardProcessorInstallmentConfig(revolving, fixedCycle);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
