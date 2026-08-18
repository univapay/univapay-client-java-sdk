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
 * This is a model class for TokenResponseQrScanData type.
 */
public class TokenResponseQrScanData {
    private String brand;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseQrScanData() {
    }

    /**
     * Initialization constructor.
     * @param  brand  String value for brand.
     */
    public TokenResponseQrScanData(
            String brand) {
        this.brand = brand;
    }

    /**
     * Getter for Brand.
     * QR-CPM brand detected from the scanned code (e.g. `pay_pay`, `we_chat`, `qq`, `line_pay`,
     * `au_pay`, `alipay_china`). This is an open value set — new brands may appear without notice.
     * Returned as `null` when the scanned code could not be parsed into a known brand.
     * @return Returns the String
     */
    @JsonGetter("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * QR-CPM brand detected from the scanned code (e.g. `pay_pay`, `we_chat`, `qq`, `line_pay`,
     * `au_pay`, `alipay_china`). This is an open value set — new brands may appear without notice.
     * Returned as `null` when the scanned code could not be parsed into a known brand.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = brand;
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
     * Converts this TokenResponseQrScanData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseQrScanData [" + "brand=" + brand + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseQrScanData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseQrScanData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(brand);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseQrScanData}.
     */
    public static class Builder {
        private String brand;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  brand  String value for brand.
         */
        public Builder(String brand) {
            this.brand = brand;
        }

        /**
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = brand;
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
         * Builds a new {@link TokenResponseQrScanData} object using the set fields.
         * @return {@link TokenResponseQrScanData}
         */
        public TokenResponseQrScanData build() {
            TokenResponseQrScanData model =
                    new TokenResponseQrScanData(brand);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
