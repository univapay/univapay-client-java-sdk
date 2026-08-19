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
 * This is a model class for SubscriptionInstallmentPlanResponse type.
 */
public class SubscriptionInstallmentPlanResponse {
    private CombinedPlanType planType;
    private OptionalNullable<CombinedInstallmentFixedCycles> fixedCycles;
    private OptionalNullable<Integer> fixedCyclesAmount;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionInstallmentPlanResponse() {
    }

    /**
     * Initialization constructor.
     * @param  planType  CombinedPlanType value for planType.
     * @param  fixedCycles  CombinedInstallmentFixedCycles value for fixedCycles.
     * @param  fixedCyclesAmount  Integer value for fixedCyclesAmount.
     */
    public SubscriptionInstallmentPlanResponse(
            CombinedPlanType planType,
            CombinedInstallmentFixedCycles fixedCycles,
            Integer fixedCyclesAmount) {
        this.planType = planType;
        this.fixedCycles = OptionalNullable.of(fixedCycles);
        this.fixedCyclesAmount = OptionalNullable.of(fixedCyclesAmount);
    }

    /**
     * Initialization constructor.
     * @param  planType  CombinedPlanType value for planType.
     * @param  fixedCycles  CombinedInstallmentFixedCycles value for fixedCycles.
     * @param  fixedCyclesAmount  Integer value for fixedCyclesAmount.
     */

    protected SubscriptionInstallmentPlanResponse(CombinedPlanType planType,
            OptionalNullable<CombinedInstallmentFixedCycles> fixedCycles,
            OptionalNullable<Integer> fixedCyclesAmount) {
        this.planType = planType;
        this.fixedCycles = fixedCycles;
        this.fixedCyclesAmount = fixedCyclesAmount;
    }

    /**
     * Getter for PlanType.
     * Plan type selector.
     * @return Returns the CombinedPlanType
     */
    @JsonGetter("plan_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CombinedPlanType getPlanType() {
        return planType;
    }

    /**
     * Setter for PlanType.
     * Plan type selector.
     * @param planType Value for CombinedPlanType
     */
    @JsonSetter("plan_type")
    public void setPlanType(CombinedPlanType planType) {
        this.planType = planType;
    }

    /**
     * Internal Getter for FixedCycles.
     * Number of installment cycles. Present when plan_type is fixed_cycles.
     * @return Returns the Internal CombinedInstallmentFixedCycles
     */
    @JsonGetter("fixed_cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CombinedInstallmentFixedCycles> internalGetFixedCycles() {
        return this.fixedCycles;
    }

    /**
     * Getter for FixedCycles.
     * Number of installment cycles. Present when plan_type is fixed_cycles.
     * @return Returns the CombinedInstallmentFixedCycles
     */
    public CombinedInstallmentFixedCycles getFixedCycles() {
        return OptionalNullable.getFrom(fixedCycles);
    }

    /**
     * Setter for FixedCycles.
     * Number of installment cycles. Present when plan_type is fixed_cycles.
     * @param fixedCycles Value for CombinedInstallmentFixedCycles
     */
    @JsonSetter("fixed_cycles")
    public void setFixedCycles(CombinedInstallmentFixedCycles fixedCycles) {
        this.fixedCycles = OptionalNullable.of(fixedCycles);
    }

    /**
     * UnSetter for FixedCycles.
     * Number of installment cycles. Present when plan_type is fixed_cycles.
     */
    public void unsetFixedCycles() {
        fixedCycles = null;
    }

    /**
     * Internal Getter for FixedCyclesAmount.
     * Total target amount for the fixed_cycle_amount plan type, in the smallest currency unit.
     * Present when plan_type is fixed_cycle_amount. Note the plural `fixed_cycles_amount` key
     * differs from `subscription_plan`'s singular `fixed_cycle_amount`.
     * @return Returns the Internal Integer
     */
    @JsonGetter("fixed_cycles_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetFixedCyclesAmount() {
        return this.fixedCyclesAmount;
    }

    /**
     * Getter for FixedCyclesAmount.
     * Total target amount for the fixed_cycle_amount plan type, in the smallest currency unit.
     * Present when plan_type is fixed_cycle_amount. Note the plural `fixed_cycles_amount` key
     * differs from `subscription_plan`'s singular `fixed_cycle_amount`.
     * @return Returns the Integer
     */
    public Integer getFixedCyclesAmount() {
        return OptionalNullable.getFrom(fixedCyclesAmount);
    }

    /**
     * Setter for FixedCyclesAmount.
     * Total target amount for the fixed_cycle_amount plan type, in the smallest currency unit.
     * Present when plan_type is fixed_cycle_amount. Note the plural `fixed_cycles_amount` key
     * differs from `subscription_plan`'s singular `fixed_cycle_amount`.
     * @param fixedCyclesAmount Value for Integer
     */
    @JsonSetter("fixed_cycles_amount")
    public void setFixedCyclesAmount(Integer fixedCyclesAmount) {
        this.fixedCyclesAmount = OptionalNullable.of(fixedCyclesAmount);
    }

    /**
     * UnSetter for FixedCyclesAmount.
     * Total target amount for the fixed_cycle_amount plan type, in the smallest currency unit.
     * Present when plan_type is fixed_cycle_amount. Note the plural `fixed_cycles_amount` key
     * differs from `subscription_plan`'s singular `fixed_cycle_amount`.
     */
    public void unsetFixedCyclesAmount() {
        fixedCyclesAmount = null;
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
     * Converts this SubscriptionInstallmentPlanResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionInstallmentPlanResponse [" + "planType=" + planType + ", fixedCycles="
                + fixedCycles + ", fixedCyclesAmount=" + fixedCyclesAmount
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionInstallmentPlanResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionInstallmentPlanResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .planType(getPlanType());
        builder.fixedCycles = internalGetFixedCycles();
        builder.fixedCyclesAmount = internalGetFixedCyclesAmount();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionInstallmentPlanResponse}.
     */
    public static class Builder {
        private CombinedPlanType planType;
        private OptionalNullable<CombinedInstallmentFixedCycles> fixedCycles;
        private OptionalNullable<Integer> fixedCyclesAmount;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for planType.
         * @param  planType  CombinedPlanType value for planType.
         * @return Builder
         */
        public Builder planType(CombinedPlanType planType) {
            this.planType = planType;
            return this;
        }

        /**
         * Setter for fixedCycles.
         * @param  fixedCycles  CombinedInstallmentFixedCycles value for fixedCycles.
         * @return Builder
         */
        public Builder fixedCycles(CombinedInstallmentFixedCycles fixedCycles) {
            this.fixedCycles = OptionalNullable.of(fixedCycles);
            return this;
        }

        /**
         * UnSetter for fixedCycles.
         * @return Builder
         */
        public Builder unsetFixedCycles() {
            fixedCycles = null;
            return this;
        }

        /**
         * Setter for fixedCyclesAmount.
         * @param  fixedCyclesAmount  Integer value for fixedCyclesAmount.
         * @return Builder
         */
        public Builder fixedCyclesAmount(Integer fixedCyclesAmount) {
            this.fixedCyclesAmount = OptionalNullable.of(fixedCyclesAmount);
            return this;
        }

        /**
         * UnSetter for fixedCyclesAmount.
         * @return Builder
         */
        public Builder unsetFixedCyclesAmount() {
            fixedCyclesAmount = null;
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
         * Builds a new {@link SubscriptionInstallmentPlanResponse} object using the set fields.
         * @return {@link SubscriptionInstallmentPlanResponse}
         */
        public SubscriptionInstallmentPlanResponse build() {
            SubscriptionInstallmentPlanResponse model =
                    new SubscriptionInstallmentPlanResponse(planType, fixedCycles,
                            fixedCyclesAmount);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
