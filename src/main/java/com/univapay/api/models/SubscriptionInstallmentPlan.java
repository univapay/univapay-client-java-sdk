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
 * This is a model class for SubscriptionInstallmentPlan type.
 */
public class SubscriptionInstallmentPlan {
    private InstallmentPlanType planType;
    private InstallmentFixedCycles fixedCycles;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionInstallmentPlan() {
    }

    /**
     * Initialization constructor.
     * @param  planType  InstallmentPlanType value for planType.
     * @param  fixedCycles  InstallmentFixedCycles value for fixedCycles.
     */
    public SubscriptionInstallmentPlan(
            InstallmentPlanType planType,
            InstallmentFixedCycles fixedCycles) {
        this.planType = planType;
        this.fixedCycles = fixedCycles;
    }

    /**
     * Getter for PlanType.
     * Plan type selector.
     * @return Returns the InstallmentPlanType
     */
    @JsonGetter("plan_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InstallmentPlanType getPlanType() {
        return planType;
    }

    /**
     * Setter for PlanType.
     * Plan type selector.
     * @param planType Value for InstallmentPlanType
     */
    @JsonSetter("plan_type")
    public void setPlanType(InstallmentPlanType planType) {
        this.planType = planType;
    }

    /**
     * Getter for FixedCycles.
     * Required if plan_type is fixed_cycles.
     * @return Returns the InstallmentFixedCycles
     */
    @JsonGetter("fixed_cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InstallmentFixedCycles getFixedCycles() {
        return fixedCycles;
    }

    /**
     * Setter for FixedCycles.
     * Required if plan_type is fixed_cycles.
     * @param fixedCycles Value for InstallmentFixedCycles
     */
    @JsonSetter("fixed_cycles")
    public void setFixedCycles(InstallmentFixedCycles fixedCycles) {
        this.fixedCycles = fixedCycles;
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
     * Converts this SubscriptionInstallmentPlan into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionInstallmentPlan [" + "planType=" + planType + ", fixedCycles="
                + fixedCycles + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionInstallmentPlan.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionInstallmentPlan.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .planType(getPlanType())
                .fixedCycles(getFixedCycles());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionInstallmentPlan}.
     */
    public static class Builder {
        private InstallmentPlanType planType;
        private InstallmentFixedCycles fixedCycles;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for planType.
         * @param  planType  InstallmentPlanType value for planType.
         * @return Builder
         */
        public Builder planType(InstallmentPlanType planType) {
            this.planType = planType;
            return this;
        }

        /**
         * Setter for fixedCycles.
         * @param  fixedCycles  InstallmentFixedCycles value for fixedCycles.
         * @return Builder
         */
        public Builder fixedCycles(InstallmentFixedCycles fixedCycles) {
            this.fixedCycles = fixedCycles;
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
         * Builds a new {@link SubscriptionInstallmentPlan} object using the set fields.
         * @return {@link SubscriptionInstallmentPlan}
         */
        public SubscriptionInstallmentPlan build() {
            SubscriptionInstallmentPlan model =
                    new SubscriptionInstallmentPlan(planType, fixedCycles);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
