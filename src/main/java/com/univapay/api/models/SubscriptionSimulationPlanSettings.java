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
 * This is a model class for SubscriptionSimulationPlanSettings type.
 */
public class SubscriptionSimulationPlanSettings {
    private SimulationPlanSettingsType planType;
    private Integer fixedCycles;
    private Integer fixedCycleAmount;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionSimulationPlanSettings() {
    }

    /**
     * Initialization constructor.
     * @param  planType  SimulationPlanSettingsType value for planType.
     * @param  fixedCycles  Integer value for fixedCycles.
     * @param  fixedCycleAmount  Integer value for fixedCycleAmount.
     */
    public SubscriptionSimulationPlanSettings(
            SimulationPlanSettingsType planType,
            Integer fixedCycles,
            Integer fixedCycleAmount) {
        this.planType = planType;
        this.fixedCycles = fixedCycles;
        this.fixedCycleAmount = fixedCycleAmount;
    }

    /**
     * Getter for PlanType.
     * Plan type selector.
     * @return Returns the SimulationPlanSettingsType
     */
    @JsonGetter("plan_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SimulationPlanSettingsType getPlanType() {
        return planType;
    }

    /**
     * Setter for PlanType.
     * Plan type selector.
     * @param planType Value for SimulationPlanSettingsType
     */
    @JsonSetter("plan_type")
    public void setPlanType(SimulationPlanSettingsType planType) {
        this.planType = planType;
    }

    /**
     * Getter for FixedCycles.
     * Number of cycles for the fixed_cycles plan. Must be greater than 1.
     * @return Returns the Integer
     */
    @JsonGetter("fixed_cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFixedCycles() {
        return fixedCycles;
    }

    /**
     * Setter for FixedCycles.
     * Number of cycles for the fixed_cycles plan. Must be greater than 1.
     * @param fixedCycles Value for Integer
     */
    @JsonSetter("fixed_cycles")
    public void setFixedCycles(Integer fixedCycles) {
        this.fixedCycles = fixedCycles;
    }

    /**
     * Getter for FixedCycleAmount.
     * Total target amount for the fixed_cycle_amount plan. Must not exceed the requested amount.
     * @return Returns the Integer
     */
    @JsonGetter("fixed_cycle_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFixedCycleAmount() {
        return fixedCycleAmount;
    }

    /**
     * Setter for FixedCycleAmount.
     * Total target amount for the fixed_cycle_amount plan. Must not exceed the requested amount.
     * @param fixedCycleAmount Value for Integer
     */
    @JsonSetter("fixed_cycle_amount")
    public void setFixedCycleAmount(Integer fixedCycleAmount) {
        this.fixedCycleAmount = fixedCycleAmount;
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
     * Converts this SubscriptionSimulationPlanSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionSimulationPlanSettings [" + "planType=" + planType + ", fixedCycles="
                + fixedCycles + ", fixedCycleAmount=" + fixedCycleAmount + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionSimulationPlanSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionSimulationPlanSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .planType(getPlanType())
                .fixedCycles(getFixedCycles())
                .fixedCycleAmount(getFixedCycleAmount());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionSimulationPlanSettings}.
     */
    public static class Builder {
        private SimulationPlanSettingsType planType;
        private Integer fixedCycles;
        private Integer fixedCycleAmount;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for planType.
         * @param  planType  SimulationPlanSettingsType value for planType.
         * @return Builder
         */
        public Builder planType(SimulationPlanSettingsType planType) {
            this.planType = planType;
            return this;
        }

        /**
         * Setter for fixedCycles.
         * @param  fixedCycles  Integer value for fixedCycles.
         * @return Builder
         */
        public Builder fixedCycles(Integer fixedCycles) {
            this.fixedCycles = fixedCycles;
            return this;
        }

        /**
         * Setter for fixedCycleAmount.
         * @param  fixedCycleAmount  Integer value for fixedCycleAmount.
         * @return Builder
         */
        public Builder fixedCycleAmount(Integer fixedCycleAmount) {
            this.fixedCycleAmount = fixedCycleAmount;
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
         * Builds a new {@link SubscriptionSimulationPlanSettings} object using the set fields.
         * @return {@link SubscriptionSimulationPlanSettings}
         */
        public SubscriptionSimulationPlanSettings build() {
            SubscriptionSimulationPlanSettings model =
                    new SubscriptionSimulationPlanSettings(planType, fixedCycles, fixedCycleAmount);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
