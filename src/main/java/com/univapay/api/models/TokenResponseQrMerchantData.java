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
 * This is a model class for TokenResponseQrMerchantData type.
 */
public class TokenResponseQrMerchantData {
    private String qrImageUrl;
    private OptionalNullable<String> brand;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseQrMerchantData() {
    }

    /**
     * Initialization constructor.
     * @param  qrImageUrl  String value for qrImageUrl.
     * @param  brand  String value for brand.
     */
    public TokenResponseQrMerchantData(
            String qrImageUrl,
            String brand) {
        this.qrImageUrl = qrImageUrl;
        this.brand = OptionalNullable.of(brand);
    }

    /**
     * Initialization constructor.
     * @param  qrImageUrl  String value for qrImageUrl.
     * @param  brand  String value for brand.
     */

    protected TokenResponseQrMerchantData(String qrImageUrl, OptionalNullable<String> brand) {
        this.qrImageUrl = qrImageUrl;
        this.brand = brand;
    }

    /**
     * Getter for QrImageUrl.
     * QR code payload to be rendered by the consumer (content varies by brand — may be a URL or an
     * opaque code). Some brands return an image URL; others (e.g. convenience-store QR brands)
     * return an opaque numeric code with no URL structure. Populated asynchronously shortly after
     * token/charge creation — `null` until then.
     * @return Returns the String
     */
    @JsonGetter("qr_image_url")
    public String getQrImageUrl() {
        return qrImageUrl;
    }

    /**
     * Setter for QrImageUrl.
     * QR code payload to be rendered by the consumer (content varies by brand — may be a URL or an
     * opaque code). Some brands return an image URL; others (e.g. convenience-store QR brands)
     * return an opaque numeric code with no URL structure. Populated asynchronously shortly after
     * token/charge creation — `null` until then.
     * @param qrImageUrl Value for String
     */
    @JsonSetter("qr_image_url")
    public void setQrImageUrl(String qrImageUrl) {
        this.qrImageUrl = qrImageUrl;
    }

    /**
     * Internal Getter for Brand.
     * The QR-MPM brand this code was generated for.
     * @return Returns the Internal String
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBrand() {
        return this.brand;
    }

    /**
     * Getter for Brand.
     * The QR-MPM brand this code was generated for.
     * @return Returns the String
     */
    public String getBrand() {
        return OptionalNullable.getFrom(brand);
    }

    /**
     * Setter for Brand.
     * The QR-MPM brand this code was generated for.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = OptionalNullable.of(brand);
    }

    /**
     * UnSetter for Brand.
     * The QR-MPM brand this code was generated for.
     */
    public void unsetBrand() {
        brand = null;
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
     * Converts this TokenResponseQrMerchantData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseQrMerchantData [" + "qrImageUrl=" + qrImageUrl + ", brand=" + brand
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseQrMerchantData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseQrMerchantData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(qrImageUrl);
        builder.brand = internalGetBrand();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseQrMerchantData}.
     */
    public static class Builder {
        private String qrImageUrl;
        private OptionalNullable<String> brand;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  qrImageUrl  String value for qrImageUrl.
         */
        public Builder(String qrImageUrl) {
            this.qrImageUrl = qrImageUrl;
        }

        /**
         * Setter for qrImageUrl.
         * @param  qrImageUrl  String value for qrImageUrl.
         * @return Builder
         */
        public Builder qrImageUrl(String qrImageUrl) {
            this.qrImageUrl = qrImageUrl;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = OptionalNullable.of(brand);
            return this;
        }

        /**
         * UnSetter for brand.
         * @return Builder
         */
        public Builder unsetBrand() {
            brand = null;
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
         * Builds a new {@link TokenResponseQrMerchantData} object using the set fields.
         * @return {@link TokenResponseQrMerchantData}
         */
        public TokenResponseQrMerchantData build() {
            TokenResponseQrMerchantData model =
                    new TokenResponseQrMerchantData(qrImageUrl, brand);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
