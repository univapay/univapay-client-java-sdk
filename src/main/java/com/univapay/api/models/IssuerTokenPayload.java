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
 * This is a model class for IssuerTokenPayload type.
 */
public class IssuerTokenPayload {
    private String requestData;
    private String sSpcd;
    private String sCptok;
    private String sTerkn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public IssuerTokenPayload() {
    }

    /**
     * Initialization constructor.
     * @param  requestData  String value for requestData.
     * @param  sSpcd  String value for sSpcd.
     * @param  sCptok  String value for sCptok.
     * @param  sTerkn  String value for sTerkn.
     */
    public IssuerTokenPayload(
            String requestData,
            String sSpcd,
            String sCptok,
            String sTerkn) {
        this.requestData = requestData;
        this.sSpcd = sSpcd;
        this.sCptok = sCptok;
        this.sTerkn = sTerkn;
    }

    /**
     * Getter for RequestData.
     * Generic payload key used by most payment providers.
     * @return Returns the String
     */
    @JsonGetter("request_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestData() {
        return requestData;
    }

    /**
     * Setter for RequestData.
     * Generic payload key used by most payment providers.
     * @param requestData Value for String
     */
    @JsonSetter("request_data")
    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    /**
     * Getter for SSpcd.
     * d-barai payment service code.
     * @return Returns the String
     */
    @JsonGetter("sSpcd")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSSpcd() {
        return sSpcd;
    }

    /**
     * Setter for SSpcd.
     * d-barai payment service code.
     * @param sSpcd Value for String
     */
    @JsonSetter("sSpcd")
    public void setSSpcd(String sSpcd) {
        this.sSpcd = sSpcd;
    }

    /**
     * Getter for SCptok.
     * d-barai coupon token.
     * @return Returns the String
     */
    @JsonGetter("sCptok")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSCptok() {
        return sCptok;
    }

    /**
     * Setter for SCptok.
     * d-barai coupon token.
     * @param sCptok Value for String
     */
    @JsonSetter("sCptok")
    public void setSCptok(String sCptok) {
        this.sCptok = sCptok;
    }

    /**
     * Getter for STerkn.
     * d-barai terminal key.
     * @return Returns the String
     */
    @JsonGetter("sTerkn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSTerkn() {
        return sTerkn;
    }

    /**
     * Setter for STerkn.
     * d-barai terminal key.
     * @param sTerkn Value for String
     */
    @JsonSetter("sTerkn")
    public void setSTerkn(String sTerkn) {
        this.sTerkn = sTerkn;
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
     * Converts this IssuerTokenPayload into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssuerTokenPayload [" + "requestData=" + requestData + ", sSpcd=" + sSpcd
                + ", sCptok=" + sCptok + ", sTerkn=" + sTerkn + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link IssuerTokenPayload.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssuerTokenPayload.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestData(getRequestData())
                .sSpcd(getSSpcd())
                .sCptok(getSCptok())
                .sTerkn(getSTerkn());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link IssuerTokenPayload}.
     */
    public static class Builder {
        private String requestData;
        private String sSpcd;
        private String sCptok;
        private String sTerkn;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for requestData.
         * @param  requestData  String value for requestData.
         * @return Builder
         */
        public Builder requestData(String requestData) {
            this.requestData = requestData;
            return this;
        }

        /**
         * Setter for sSpcd.
         * @param  sSpcd  String value for sSpcd.
         * @return Builder
         */
        public Builder sSpcd(String sSpcd) {
            this.sSpcd = sSpcd;
            return this;
        }

        /**
         * Setter for sCptok.
         * @param  sCptok  String value for sCptok.
         * @return Builder
         */
        public Builder sCptok(String sCptok) {
            this.sCptok = sCptok;
            return this;
        }

        /**
         * Setter for sTerkn.
         * @param  sTerkn  String value for sTerkn.
         * @return Builder
         */
        public Builder sTerkn(String sTerkn) {
            this.sTerkn = sTerkn;
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
         * Builds a new {@link IssuerTokenPayload} object using the set fields.
         * @return {@link IssuerTokenPayload}
         */
        public IssuerTokenPayload build() {
            IssuerTokenPayload model =
                    new IssuerTokenPayload(requestData, sSpcd, sCptok, sTerkn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
