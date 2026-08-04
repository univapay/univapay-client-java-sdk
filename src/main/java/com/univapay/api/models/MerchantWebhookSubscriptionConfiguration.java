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
 * This is a model class for MerchantWebhookSubscriptionConfiguration type.
 */
public class MerchantWebhookSubscriptionConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<Integer> failedChargesToCancel;
    private OptionalNullable<Boolean> suspendOnCancel;
    private OptionalNullable<Boolean> allowMerchantAmountPatch;
    private OptionalNullable<Boolean> allowMerchantDueDatePatch;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookSubscriptionConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  failedChargesToCancel  Integer value for failedChargesToCancel.
     * @param  suspendOnCancel  Boolean value for suspendOnCancel.
     * @param  allowMerchantAmountPatch  Boolean value for allowMerchantAmountPatch.
     * @param  allowMerchantDueDatePatch  Boolean value for allowMerchantDueDatePatch.
     */
    public MerchantWebhookSubscriptionConfiguration(
            Boolean enabled,
            Integer failedChargesToCancel,
            Boolean suspendOnCancel,
            Boolean allowMerchantAmountPatch,
            Boolean allowMerchantDueDatePatch) {
        this.enabled = OptionalNullable.of(enabled);
        this.failedChargesToCancel = OptionalNullable.of(failedChargesToCancel);
        this.suspendOnCancel = OptionalNullable.of(suspendOnCancel);
        this.allowMerchantAmountPatch = OptionalNullable.of(allowMerchantAmountPatch);
        this.allowMerchantDueDatePatch = OptionalNullable.of(allowMerchantDueDatePatch);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  failedChargesToCancel  Integer value for failedChargesToCancel.
     * @param  suspendOnCancel  Boolean value for suspendOnCancel.
     * @param  allowMerchantAmountPatch  Boolean value for allowMerchantAmountPatch.
     * @param  allowMerchantDueDatePatch  Boolean value for allowMerchantDueDatePatch.
     */

    protected MerchantWebhookSubscriptionConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<Integer> failedChargesToCancel,
            OptionalNullable<Boolean> suspendOnCancel,
            OptionalNullable<Boolean> allowMerchantAmountPatch,
            OptionalNullable<Boolean> allowMerchantDueDatePatch) {
        this.enabled = enabled;
        this.failedChargesToCancel = failedChargesToCancel;
        this.suspendOnCancel = suspendOnCancel;
        this.allowMerchantAmountPatch = allowMerchantAmountPatch;
        this.allowMerchantDueDatePatch = allowMerchantDueDatePatch;
    }

    /**
     * Internal Getter for Enabled.
     * Enables subscription payments.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetEnabled() {
        return this.enabled;
    }

    /**
     * Getter for Enabled.
     * Enables subscription payments.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables subscription payments.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables subscription payments.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for FailedChargesToCancel.
     * Number of failed charges allowed before cancellation.
     * @return Returns the Internal Integer
     */
    @JsonGetter("failed_charges_to_cancel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetFailedChargesToCancel() {
        return this.failedChargesToCancel;
    }

    /**
     * Getter for FailedChargesToCancel.
     * Number of failed charges allowed before cancellation.
     * @return Returns the Integer
     */
    public Integer getFailedChargesToCancel() {
        return OptionalNullable.getFrom(failedChargesToCancel);
    }

    /**
     * Setter for FailedChargesToCancel.
     * Number of failed charges allowed before cancellation.
     * @param failedChargesToCancel Value for Integer
     */
    @JsonSetter("failed_charges_to_cancel")
    public void setFailedChargesToCancel(Integer failedChargesToCancel) {
        this.failedChargesToCancel = OptionalNullable.of(failedChargesToCancel);
    }

    /**
     * UnSetter for FailedChargesToCancel.
     * Number of failed charges allowed before cancellation.
     */
    public void unsetFailedChargesToCancel() {
        failedChargesToCancel = null;
    }

    /**
     * Internal Getter for SuspendOnCancel.
     * Suspends the subscription when its latest charge is canceled.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("suspend_on_cancel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetSuspendOnCancel() {
        return this.suspendOnCancel;
    }

    /**
     * Getter for SuspendOnCancel.
     * Suspends the subscription when its latest charge is canceled.
     * @return Returns the Boolean
     */
    public Boolean getSuspendOnCancel() {
        return OptionalNullable.getFrom(suspendOnCancel);
    }

    /**
     * Setter for SuspendOnCancel.
     * Suspends the subscription when its latest charge is canceled.
     * @param suspendOnCancel Value for Boolean
     */
    @JsonSetter("suspend_on_cancel")
    public void setSuspendOnCancel(Boolean suspendOnCancel) {
        this.suspendOnCancel = OptionalNullable.of(suspendOnCancel);
    }

    /**
     * UnSetter for SuspendOnCancel.
     * Suspends the subscription when its latest charge is canceled.
     */
    public void unsetSuspendOnCancel() {
        suspendOnCancel = null;
    }

    /**
     * Internal Getter for AllowMerchantAmountPatch.
     * Allows merchants to update scheduled subscription amounts.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("allow_merchant_amount_patch")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetAllowMerchantAmountPatch() {
        return this.allowMerchantAmountPatch;
    }

    /**
     * Getter for AllowMerchantAmountPatch.
     * Allows merchants to update scheduled subscription amounts.
     * @return Returns the Boolean
     */
    public Boolean getAllowMerchantAmountPatch() {
        return OptionalNullable.getFrom(allowMerchantAmountPatch);
    }

    /**
     * Setter for AllowMerchantAmountPatch.
     * Allows merchants to update scheduled subscription amounts.
     * @param allowMerchantAmountPatch Value for Boolean
     */
    @JsonSetter("allow_merchant_amount_patch")
    public void setAllowMerchantAmountPatch(Boolean allowMerchantAmountPatch) {
        this.allowMerchantAmountPatch = OptionalNullable.of(allowMerchantAmountPatch);
    }

    /**
     * UnSetter for AllowMerchantAmountPatch.
     * Allows merchants to update scheduled subscription amounts.
     */
    public void unsetAllowMerchantAmountPatch() {
        allowMerchantAmountPatch = null;
    }

    /**
     * Internal Getter for AllowMerchantDueDatePatch.
     * Allows merchants to update scheduled subscription due dates.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("allow_merchant_due_date_patch")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetAllowMerchantDueDatePatch() {
        return this.allowMerchantDueDatePatch;
    }

    /**
     * Getter for AllowMerchantDueDatePatch.
     * Allows merchants to update scheduled subscription due dates.
     * @return Returns the Boolean
     */
    public Boolean getAllowMerchantDueDatePatch() {
        return OptionalNullable.getFrom(allowMerchantDueDatePatch);
    }

    /**
     * Setter for AllowMerchantDueDatePatch.
     * Allows merchants to update scheduled subscription due dates.
     * @param allowMerchantDueDatePatch Value for Boolean
     */
    @JsonSetter("allow_merchant_due_date_patch")
    public void setAllowMerchantDueDatePatch(Boolean allowMerchantDueDatePatch) {
        this.allowMerchantDueDatePatch = OptionalNullable.of(allowMerchantDueDatePatch);
    }

    /**
     * UnSetter for AllowMerchantDueDatePatch.
     * Allows merchants to update scheduled subscription due dates.
     */
    public void unsetAllowMerchantDueDatePatch() {
        allowMerchantDueDatePatch = null;
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
     * Converts this MerchantWebhookSubscriptionConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookSubscriptionConfiguration [" + "enabled=" + enabled
                + ", failedChargesToCancel=" + failedChargesToCancel + ", suspendOnCancel="
                + suspendOnCancel + ", allowMerchantAmountPatch=" + allowMerchantAmountPatch
                + ", allowMerchantDueDatePatch=" + allowMerchantDueDatePatch
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookSubscriptionConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookSubscriptionConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.failedChargesToCancel = internalGetFailedChargesToCancel();
        builder.suspendOnCancel = internalGetSuspendOnCancel();
        builder.allowMerchantAmountPatch = internalGetAllowMerchantAmountPatch();
        builder.allowMerchantDueDatePatch = internalGetAllowMerchantDueDatePatch();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookSubscriptionConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<Integer> failedChargesToCancel;
        private OptionalNullable<Boolean> suspendOnCancel;
        private OptionalNullable<Boolean> allowMerchantAmountPatch;
        private OptionalNullable<Boolean> allowMerchantDueDatePatch;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = OptionalNullable.of(enabled);
            return this;
        }

        /**
         * UnSetter for enabled.
         * @return Builder
         */
        public Builder unsetEnabled() {
            enabled = null;
            return this;
        }

        /**
         * Setter for failedChargesToCancel.
         * @param  failedChargesToCancel  Integer value for failedChargesToCancel.
         * @return Builder
         */
        public Builder failedChargesToCancel(Integer failedChargesToCancel) {
            this.failedChargesToCancel = OptionalNullable.of(failedChargesToCancel);
            return this;
        }

        /**
         * UnSetter for failedChargesToCancel.
         * @return Builder
         */
        public Builder unsetFailedChargesToCancel() {
            failedChargesToCancel = null;
            return this;
        }

        /**
         * Setter for suspendOnCancel.
         * @param  suspendOnCancel  Boolean value for suspendOnCancel.
         * @return Builder
         */
        public Builder suspendOnCancel(Boolean suspendOnCancel) {
            this.suspendOnCancel = OptionalNullable.of(suspendOnCancel);
            return this;
        }

        /**
         * UnSetter for suspendOnCancel.
         * @return Builder
         */
        public Builder unsetSuspendOnCancel() {
            suspendOnCancel = null;
            return this;
        }

        /**
         * Setter for allowMerchantAmountPatch.
         * @param  allowMerchantAmountPatch  Boolean value for allowMerchantAmountPatch.
         * @return Builder
         */
        public Builder allowMerchantAmountPatch(Boolean allowMerchantAmountPatch) {
            this.allowMerchantAmountPatch = OptionalNullable.of(allowMerchantAmountPatch);
            return this;
        }

        /**
         * UnSetter for allowMerchantAmountPatch.
         * @return Builder
         */
        public Builder unsetAllowMerchantAmountPatch() {
            allowMerchantAmountPatch = null;
            return this;
        }

        /**
         * Setter for allowMerchantDueDatePatch.
         * @param  allowMerchantDueDatePatch  Boolean value for allowMerchantDueDatePatch.
         * @return Builder
         */
        public Builder allowMerchantDueDatePatch(Boolean allowMerchantDueDatePatch) {
            this.allowMerchantDueDatePatch = OptionalNullable.of(allowMerchantDueDatePatch);
            return this;
        }

        /**
         * UnSetter for allowMerchantDueDatePatch.
         * @return Builder
         */
        public Builder unsetAllowMerchantDueDatePatch() {
            allowMerchantDueDatePatch = null;
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
         * Builds a new {@link MerchantWebhookSubscriptionConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookSubscriptionConfiguration}
         */
        public MerchantWebhookSubscriptionConfiguration build() {
            MerchantWebhookSubscriptionConfiguration model =
                    new MerchantWebhookSubscriptionConfiguration(enabled, failedChargesToCancel,
                            suspendOnCancel, allowMerchantAmountPatch, allowMerchantDueDatePatch);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
