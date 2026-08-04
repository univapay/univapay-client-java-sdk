/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for CustomsDeclarationPatchRequest type.
 */
public class CustomsDeclarationPatchRequest {
    private String merchantCustomsNo;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CustomsDeclarationPatchRequest() {
    }

    /**
     * Initialization constructor.
     * @param  merchantCustomsNo  String value for merchantCustomsNo.
     */
    public CustomsDeclarationPatchRequest(
            String merchantCustomsNo) {
        this.merchantCustomsNo = merchantCustomsNo;
    }

    /**
     * Getter for MerchantCustomsNo.
     * Updated merchant customs registration number.
     * @return Returns the String
     */
    @JsonGetter("merchant_customs_no")
    public String getMerchantCustomsNo() {
        return merchantCustomsNo;
    }

    /**
     * Setter for MerchantCustomsNo.
     * Updated merchant customs registration number.
     * @param merchantCustomsNo Value for String
     */
    @JsonSetter("merchant_customs_no")
    public void setMerchantCustomsNo(String merchantCustomsNo) {
        this.merchantCustomsNo = merchantCustomsNo;
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
     * Converts this CustomsDeclarationPatchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomsDeclarationPatchRequest [" + "merchantCustomsNo=" + merchantCustomsNo
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CustomsDeclarationPatchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomsDeclarationPatchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(merchantCustomsNo);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CustomsDeclarationPatchRequest}.
     */
    public static class Builder {
        private String merchantCustomsNo;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  merchantCustomsNo  String value for merchantCustomsNo.
         */
        public Builder(String merchantCustomsNo) {
            this.merchantCustomsNo = merchantCustomsNo;
        }

        /**
         * Setter for merchantCustomsNo.
         * @param  merchantCustomsNo  String value for merchantCustomsNo.
         * @return Builder
         */
        public Builder merchantCustomsNo(String merchantCustomsNo) {
            this.merchantCustomsNo = merchantCustomsNo;
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
         * Builds a new {@link CustomsDeclarationPatchRequest} object using the set fields.
         * @return {@link CustomsDeclarationPatchRequest}
         */
        public CustomsDeclarationPatchRequest build() {
            CustomsDeclarationPatchRequest model =
                    new CustomsDeclarationPatchRequest(merchantCustomsNo);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
