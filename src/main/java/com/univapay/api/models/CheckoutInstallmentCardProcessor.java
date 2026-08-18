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
 * This is a model class for CheckoutInstallmentCardProcessor type.
 */
public class CheckoutInstallmentCardProcessor {
    private Boolean revolving;
    private Boolean fixedCycle;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutInstallmentCardProcessor() {
    }

    /**
     * Initialization constructor.
     * @param  revolving  Boolean value for revolving.
     * @param  fixedCycle  Boolean value for fixedCycle.
     */
    public CheckoutInstallmentCardProcessor(
            Boolean revolving,
            Boolean fixedCycle) {
        this.revolving = revolving;
        this.fixedCycle = fixedCycle;
    }

    /**
     * Getter for Revolving.
     * Whether revolving installment payments are allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("revolving")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRevolving() {
        return revolving;
    }

    /**
     * Setter for Revolving.
     * Whether revolving installment payments are allowed.
     * @param revolving Value for Boolean
     */
    @JsonSetter("revolving")
    public void setRevolving(Boolean revolving) {
        this.revolving = revolving;
    }

    /**
     * Getter for FixedCycle.
     * Whether fixed-cycle installment payments are allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("fixed_cycle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFixedCycle() {
        return fixedCycle;
    }

    /**
     * Setter for FixedCycle.
     * Whether fixed-cycle installment payments are allowed.
     * @param fixedCycle Value for Boolean
     */
    @JsonSetter("fixed_cycle")
    public void setFixedCycle(Boolean fixedCycle) {
        this.fixedCycle = fixedCycle;
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
     * Converts this CheckoutInstallmentCardProcessor into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutInstallmentCardProcessor [" + "revolving=" + revolving + ", fixedCycle="
                + fixedCycle + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutInstallmentCardProcessor.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutInstallmentCardProcessor.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .revolving(getRevolving())
                .fixedCycle(getFixedCycle());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutInstallmentCardProcessor}.
     */
    public static class Builder {
        private Boolean revolving;
        private Boolean fixedCycle;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for revolving.
         * @param  revolving  Boolean value for revolving.
         * @return Builder
         */
        public Builder revolving(Boolean revolving) {
            this.revolving = revolving;
            return this;
        }

        /**
         * Setter for fixedCycle.
         * @param  fixedCycle  Boolean value for fixedCycle.
         * @return Builder
         */
        public Builder fixedCycle(Boolean fixedCycle) {
            this.fixedCycle = fixedCycle;
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
         * Builds a new {@link CheckoutInstallmentCardProcessor} object using the set fields.
         * @return {@link CheckoutInstallmentCardProcessor}
         */
        public CheckoutInstallmentCardProcessor build() {
            CheckoutInstallmentCardProcessor model =
                    new CheckoutInstallmentCardProcessor(revolving, fixedCycle);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
