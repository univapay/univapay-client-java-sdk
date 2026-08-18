/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TokenCreateQrScanData type.
 */
public class TokenCreateQrScanData {
    private String scannedQr;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenCreateQrScanData() {
    }

    /**
     * Initialization constructor.
     * @param  scannedQr  String value for scannedQr.
     */
    @JsonCreator
    public TokenCreateQrScanData(
            @JsonProperty("scanned_qr") String scannedQr) {
        this.scannedQr = scannedQr;
    }

    /**
     * Getter for ScannedQr.
     * The QR/barcode payload scanned from the customer's payment app (Customer-Presented Mode).
     * Only valid when `type` is `one_time` — the server rejects `subscription`/`recurring` token
     * types for this payment type.
     * @return Returns the String
     */
    @JsonGetter("scanned_qr")
    public String getScannedQr() {
        return scannedQr;
    }

    /**
     * Setter for ScannedQr.
     * The QR/barcode payload scanned from the customer's payment app (Customer-Presented Mode).
     * Only valid when `type` is `one_time` — the server rejects `subscription`/`recurring` token
     * types for this payment type.
     * @param scannedQr Value for String
     */
    @JsonSetter("scanned_qr")
    public void setScannedQr(String scannedQr) {
        this.scannedQr = scannedQr;
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
     * Converts this TokenCreateQrScanData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenCreateQrScanData [" + "scannedQr=" + scannedQr + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenCreateQrScanData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenCreateQrScanData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(scannedQr);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenCreateQrScanData}.
     */
    public static class Builder {
        private String scannedQr;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  scannedQr  String value for scannedQr.
         */
        public Builder(String scannedQr) {
            this.scannedQr = scannedQr;
        }

        /**
         * Setter for scannedQr.
         * @param  scannedQr  String value for scannedQr.
         * @return Builder
         */
        public Builder scannedQr(String scannedQr) {
            this.scannedQr = scannedQr;
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
         * Builds a new {@link TokenCreateQrScanData} object using the set fields.
         * @return {@link TokenCreateQrScanData}
         */
        public TokenCreateQrScanData build() {
            TokenCreateQrScanData model =
                    new TokenCreateQrScanData(scannedQr);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
