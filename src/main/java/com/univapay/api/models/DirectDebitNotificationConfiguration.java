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
 * This is a model class for DirectDebitNotificationConfiguration type.
 */
public class DirectDebitNotificationConfiguration {
    private Boolean notifyDeadlineMailing;
    private Boolean notifyDeadlineDebit;
    private Boolean notifyDebitUpdate;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitNotificationConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  notifyDeadlineMailing  Boolean value for notifyDeadlineMailing.
     * @param  notifyDeadlineDebit  Boolean value for notifyDeadlineDebit.
     * @param  notifyDebitUpdate  Boolean value for notifyDebitUpdate.
     */
    public DirectDebitNotificationConfiguration(
            Boolean notifyDeadlineMailing,
            Boolean notifyDeadlineDebit,
            Boolean notifyDebitUpdate) {
        this.notifyDeadlineMailing = notifyDeadlineMailing;
        this.notifyDeadlineDebit = notifyDeadlineDebit;
        this.notifyDebitUpdate = notifyDebitUpdate;
    }

    /**
     * Getter for NotifyDeadlineMailing.
     * Notify when the deadline for the bank to receive the signed mandate approaches (郵送期限の通知).
     * @return Returns the Boolean
     */
    @JsonGetter("notify_deadline_mailing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyDeadlineMailing() {
        return notifyDeadlineMailing;
    }

    /**
     * Setter for NotifyDeadlineMailing.
     * Notify when the deadline for the bank to receive the signed mandate approaches (郵送期限の通知).
     * @param notifyDeadlineMailing Value for Boolean
     */
    @JsonSetter("notify_deadline_mailing")
    public void setNotifyDeadlineMailing(Boolean notifyDeadlineMailing) {
        this.notifyDeadlineMailing = notifyDeadlineMailing;
    }

    /**
     * Getter for NotifyDeadlineDebit.
     * Notify when the transfer registration cutoff approaches (締切日の通知).
     * @return Returns the Boolean
     */
    @JsonGetter("notify_deadline_debit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyDeadlineDebit() {
        return notifyDeadlineDebit;
    }

    /**
     * Setter for NotifyDeadlineDebit.
     * Notify when the transfer registration cutoff approaches (締切日の通知).
     * @param notifyDeadlineDebit Value for Boolean
     */
    @JsonSetter("notify_deadline_debit")
    public void setNotifyDeadlineDebit(Boolean notifyDeadlineDebit) {
        this.notifyDeadlineDebit = notifyDeadlineDebit;
    }

    /**
     * Getter for NotifyDebitUpdate.
     * Notify when transfer results are reflected (振替結果の通知).
     * @return Returns the Boolean
     */
    @JsonGetter("notify_debit_update")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyDebitUpdate() {
        return notifyDebitUpdate;
    }

    /**
     * Setter for NotifyDebitUpdate.
     * Notify when transfer results are reflected (振替結果の通知).
     * @param notifyDebitUpdate Value for Boolean
     */
    @JsonSetter("notify_debit_update")
    public void setNotifyDebitUpdate(Boolean notifyDebitUpdate) {
        this.notifyDebitUpdate = notifyDebitUpdate;
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
     * Converts this DirectDebitNotificationConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitNotificationConfiguration [" + "notifyDeadlineMailing="
                + notifyDeadlineMailing + ", notifyDeadlineDebit=" + notifyDeadlineDebit
                + ", notifyDebitUpdate=" + notifyDebitUpdate + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link DirectDebitNotificationConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitNotificationConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .notifyDeadlineMailing(getNotifyDeadlineMailing())
                .notifyDeadlineDebit(getNotifyDeadlineDebit())
                .notifyDebitUpdate(getNotifyDebitUpdate());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitNotificationConfiguration}.
     */
    public static class Builder {
        private Boolean notifyDeadlineMailing;
        private Boolean notifyDeadlineDebit;
        private Boolean notifyDebitUpdate;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for notifyDeadlineMailing.
         * @param  notifyDeadlineMailing  Boolean value for notifyDeadlineMailing.
         * @return Builder
         */
        public Builder notifyDeadlineMailing(Boolean notifyDeadlineMailing) {
            this.notifyDeadlineMailing = notifyDeadlineMailing;
            return this;
        }

        /**
         * Setter for notifyDeadlineDebit.
         * @param  notifyDeadlineDebit  Boolean value for notifyDeadlineDebit.
         * @return Builder
         */
        public Builder notifyDeadlineDebit(Boolean notifyDeadlineDebit) {
            this.notifyDeadlineDebit = notifyDeadlineDebit;
            return this;
        }

        /**
         * Setter for notifyDebitUpdate.
         * @param  notifyDebitUpdate  Boolean value for notifyDebitUpdate.
         * @return Builder
         */
        public Builder notifyDebitUpdate(Boolean notifyDebitUpdate) {
            this.notifyDebitUpdate = notifyDebitUpdate;
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
         * Builds a new {@link DirectDebitNotificationConfiguration} object using the set fields.
         * @return {@link DirectDebitNotificationConfiguration}
         */
        public DirectDebitNotificationConfiguration build() {
            DirectDebitNotificationConfiguration model =
                    new DirectDebitNotificationConfiguration(notifyDeadlineMailing,
                            notifyDeadlineDebit, notifyDebitUpdate);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
