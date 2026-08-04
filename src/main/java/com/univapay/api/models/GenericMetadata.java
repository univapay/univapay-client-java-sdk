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
import com.univapay.api.ApiHelper;
import com.univapay.api.models.containers.GenericMetadataValue;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for GenericMetadata type.
 */
public class GenericMetadata {
    private String orderId;
    private String univapayName;
    private String univapayPhoneNumber;
    private AdditionalProperties<GenericMetadataValue> additionalProperties = 
            new AdditionalProperties<GenericMetadataValue>(this.getClass());

    /**
     * Default constructor.
     */
    public GenericMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  orderId  String value for orderId.
     * @param  univapayName  String value for univapayName.
     * @param  univapayPhoneNumber  String value for univapayPhoneNumber.
     */
    public GenericMetadata(
            String orderId,
            String univapayName,
            String univapayPhoneNumber) {
        this.orderId = orderId;
        this.univapayName = univapayName;
        this.univapayPhoneNumber = univapayPhoneNumber;
    }

    /**
     * Getter for OrderId.
     * Example of a custom metadata key.
     * @return Returns the String
     */
    @JsonGetter("order_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderId() {
        return orderId;
    }

    /**
     * Setter for OrderId.
     * Example of a custom metadata key.
     * @param orderId Value for String
     */
    @JsonSetter("order_id")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Getter for UnivapayName.
     * Consumer name passed to payment processors that require it (e.g., konbini, bank transfer).
     * @return Returns the String
     */
    @JsonGetter("univapay-name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnivapayName() {
        return univapayName;
    }

    /**
     * Setter for UnivapayName.
     * Consumer name passed to payment processors that require it (e.g., konbini, bank transfer).
     * @param univapayName Value for String
     */
    @JsonSetter("univapay-name")
    public void setUnivapayName(String univapayName) {
        this.univapayName = univapayName;
    }

    /**
     * Getter for UnivapayPhoneNumber.
     * Consumer phone number passed to payment processors that require it.
     * @return Returns the String
     */
    @JsonGetter("univapay-phone-number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnivapayPhoneNumber() {
        return univapayPhoneNumber;
    }

    /**
     * Setter for UnivapayPhoneNumber.
     * Consumer phone number passed to payment processors that require it.
     * @param univapayPhoneNumber Value for String
     */
    @JsonSetter("univapay-phone-number")
    public void setUnivapayPhoneNumber(String univapayPhoneNumber) {
        this.univapayPhoneNumber = univapayPhoneNumber;
    }

    /**
     * Hidden method for the serialization of additional properties.
     * @return The map of additionally set properties.
     */
    @JsonAnyGetter
    private Map<String, GenericMetadataValue> getAdditionalProperties() {
        return additionalProperties.getAdditionalProperties();
    }

    /**
     * Hidden method for the de-serialization of additional properties.
     * @param name The name of the additional property.
     * @param value The GenericMetadataValue value of the additional property.
     */
    @JsonAnySetter
    private void setAdditionalProperties(String name, Object value) {
        additionalProperties.setAdditionalProperty(name,
                ConversionHelper.convertToSimpleType(value,
                        x -> ApiHelper.tryDeserialize(ApiHelper.trySerialize(x),
                                GenericMetadataValue.class)),
                true);
    }

    /**
     * Getter for the value of additional properties based on provided property name.
     * @param name The name of the additional property.
     * @return Either the GenericMetadataValue property value or null if not exist.
     */
    
    public GenericMetadataValue getAdditionalProperty(String name) {
        return additionalProperties.getAdditionalProperty(name);
    }

    /**
     * Converts this GenericMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GenericMetadata [" + "orderId=" + orderId + ", univapayName=" + univapayName
                + ", univapayPhoneNumber=" + univapayPhoneNumber + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link GenericMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GenericMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .orderId(getOrderId())
                .univapayName(getUnivapayName())
                .univapayPhoneNumber(getUnivapayPhoneNumber());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link GenericMetadata}.
     */
    public static class Builder {
        private String orderId;
        private String univapayName;
        private String univapayPhoneNumber;
        private AdditionalProperties<GenericMetadataValue> additionalProperties =
                new AdditionalProperties<GenericMetadataValue>();



        /**
         * Setter for orderId.
         * @param  orderId  String value for orderId.
         * @return Builder
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Setter for univapayName.
         * @param  univapayName  String value for univapayName.
         * @return Builder
         */
        public Builder univapayName(String univapayName) {
            this.univapayName = univapayName;
            return this;
        }

        /**
         * Setter for univapayPhoneNumber.
         * @param  univapayPhoneNumber  String value for univapayPhoneNumber.
         * @return Builder
         */
        public Builder univapayPhoneNumber(String univapayPhoneNumber) {
            this.univapayPhoneNumber = univapayPhoneNumber;
            return this;
        }

        /**
         * Setter for additional property that are not in model fields.
         * @param name The name of the additional property.
         * @param value The GenericMetadataValue value of the additional property.
         * @return Builder.
         */
        public Builder additionalProperty(String name, GenericMetadataValue value) {
            this.additionalProperties.setAdditionalProperty(name, value);
            return this;
        }

        /**
         * Builds a new {@link GenericMetadata} object using the set fields.
         * @return {@link GenericMetadata}
         */
        public GenericMetadata build() {
            GenericMetadata model =
                    new GenericMetadata(orderId, univapayName, univapayPhoneNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
