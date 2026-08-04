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
 * This is a model class for CustomsDeclarationCreateRequest type.
 */
public class CustomsDeclarationCreateRequest {
    private String customs;
    private String merchantCustomsNo;
    private String certificateId;
    private String certificateName;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CustomsDeclarationCreateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  customs  String value for customs.
     * @param  merchantCustomsNo  String value for merchantCustomsNo.
     * @param  certificateId  String value for certificateId.
     * @param  certificateName  String value for certificateName.
     */
    public CustomsDeclarationCreateRequest(
            String customs,
            String merchantCustomsNo,
            String certificateId,
            String certificateName) {
        this.customs = customs;
        this.merchantCustomsNo = merchantCustomsNo;
        this.certificateId = certificateId;
        this.certificateName = certificateName;
    }

    /**
     * Getter for Customs.
     * WeChat customs authority code used for the declaration.
     * @return Returns the String
     */
    @JsonGetter("customs")
    public String getCustoms() {
        return customs;
    }

    /**
     * Setter for Customs.
     * WeChat customs authority code used for the declaration.
     * @param customs Value for String
     */
    @JsonSetter("customs")
    public void setCustoms(String customs) {
        this.customs = customs;
    }

    /**
     * Getter for MerchantCustomsNo.
     * Merchant customs registration number.
     * @return Returns the String
     */
    @JsonGetter("merchant_customs_no")
    public String getMerchantCustomsNo() {
        return merchantCustomsNo;
    }

    /**
     * Setter for MerchantCustomsNo.
     * Merchant customs registration number.
     * @param merchantCustomsNo Value for String
     */
    @JsonSetter("merchant_customs_no")
    public void setMerchantCustomsNo(String merchantCustomsNo) {
        this.merchantCustomsNo = merchantCustomsNo;
    }

    /**
     * Getter for CertificateId.
     * Customer certificate or passport identifier used by customs.
     * @return Returns the String
     */
    @JsonGetter("certificate_id")
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * Setter for CertificateId.
     * Customer certificate or passport identifier used by customs.
     * @param certificateId Value for String
     */
    @JsonSetter("certificate_id")
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * Getter for CertificateName.
     * Customer name exactly as shown on the certificate.
     * @return Returns the String
     */
    @JsonGetter("certificate_name")
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * Setter for CertificateName.
     * Customer name exactly as shown on the certificate.
     * @param certificateName Value for String
     */
    @JsonSetter("certificate_name")
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
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
     * Converts this CustomsDeclarationCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomsDeclarationCreateRequest [" + "customs=" + customs + ", merchantCustomsNo="
                + merchantCustomsNo + ", certificateId=" + certificateId + ", certificateName="
                + certificateName + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CustomsDeclarationCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomsDeclarationCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customs, merchantCustomsNo, certificateId, certificateName);
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CustomsDeclarationCreateRequest}.
     */
    public static class Builder {
        private String customs;
        private String merchantCustomsNo;
        private String certificateId;
        private String certificateName;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customs  String value for customs.
         * @param  merchantCustomsNo  String value for merchantCustomsNo.
         * @param  certificateId  String value for certificateId.
         * @param  certificateName  String value for certificateName.
         */
        public Builder(String customs, String merchantCustomsNo, String certificateId,
                String certificateName) {
            this.customs = customs;
            this.merchantCustomsNo = merchantCustomsNo;
            this.certificateId = certificateId;
            this.certificateName = certificateName;
        }

        /**
         * Setter for customs.
         * @param  customs  String value for customs.
         * @return Builder
         */
        public Builder customs(String customs) {
            this.customs = customs;
            return this;
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
         * Setter for certificateId.
         * @param  certificateId  String value for certificateId.
         * @return Builder
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * Setter for certificateName.
         * @param  certificateName  String value for certificateName.
         * @return Builder
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
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
         * Builds a new {@link CustomsDeclarationCreateRequest} object using the set fields.
         * @return {@link CustomsDeclarationCreateRequest}
         */
        public CustomsDeclarationCreateRequest build() {
            CustomsDeclarationCreateRequest model =
                    new CustomsDeclarationCreateRequest(customs, merchantCustomsNo, certificateId,
                            certificateName);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
