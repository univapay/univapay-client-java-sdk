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
 * This is a model class for TokenResponseCardData type.
 */
public class TokenResponseCardData {
    private TokenResponseCardDataCard card;
    private TokenResponseCardDataBilling billing;
    private TokenResponseCardDataCvvAuthorize cvvAuthorize;
    private TokenResponseCardDataCvvAuthorizeCheck cvvAuthorizeCheck;
    private TokenResponseCardDataThreeDs threeDs;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseCardData() {
    }

    /**
     * Initialization constructor.
     * @param  card  TokenResponseCardDataCard value for card.
     * @param  billing  TokenResponseCardDataBilling value for billing.
     * @param  cvvAuthorize  TokenResponseCardDataCvvAuthorize value for cvvAuthorize.
     * @param  cvvAuthorizeCheck  TokenResponseCardDataCvvAuthorizeCheck value for
     *         cvvAuthorizeCheck.
     * @param  threeDs  TokenResponseCardDataThreeDs value for threeDs.
     */
    public TokenResponseCardData(
            TokenResponseCardDataCard card,
            TokenResponseCardDataBilling billing,
            TokenResponseCardDataCvvAuthorize cvvAuthorize,
            TokenResponseCardDataCvvAuthorizeCheck cvvAuthorizeCheck,
            TokenResponseCardDataThreeDs threeDs) {
        this.card = card;
        this.billing = billing;
        this.cvvAuthorize = cvvAuthorize;
        this.cvvAuthorizeCheck = cvvAuthorizeCheck;
        this.threeDs = threeDs;
    }

    /**
     * Getter for Card.
     * Token Response Card Data Card schema.
     * @return Returns the TokenResponseCardDataCard
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponseCardDataCard getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Token Response Card Data Card schema.
     * @param card Value for TokenResponseCardDataCard
     */
    @JsonSetter("card")
    public void setCard(TokenResponseCardDataCard card) {
        this.card = card;
    }

    /**
     * Getter for Billing.
     * Token Response Card Data Billing schema.
     * @return Returns the TokenResponseCardDataBilling
     */
    @JsonGetter("billing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponseCardDataBilling getBilling() {
        return billing;
    }

    /**
     * Setter for Billing.
     * Token Response Card Data Billing schema.
     * @param billing Value for TokenResponseCardDataBilling
     */
    @JsonSetter("billing")
    public void setBilling(TokenResponseCardDataBilling billing) {
        this.billing = billing;
    }

    /**
     * Getter for CvvAuthorize.
     * Token Response Card Data Cvv Authorize schema.
     * @return Returns the TokenResponseCardDataCvvAuthorize
     */
    @JsonGetter("cvv_authorize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponseCardDataCvvAuthorize getCvvAuthorize() {
        return cvvAuthorize;
    }

    /**
     * Setter for CvvAuthorize.
     * Token Response Card Data Cvv Authorize schema.
     * @param cvvAuthorize Value for TokenResponseCardDataCvvAuthorize
     */
    @JsonSetter("cvv_authorize")
    public void setCvvAuthorize(TokenResponseCardDataCvvAuthorize cvvAuthorize) {
        this.cvvAuthorize = cvvAuthorize;
    }

    /**
     * Getter for CvvAuthorizeCheck.
     * Token Response Card Data Cvv Authorize Check schema.
     * @return Returns the TokenResponseCardDataCvvAuthorizeCheck
     */
    @JsonGetter("cvv_authorize_check")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponseCardDataCvvAuthorizeCheck getCvvAuthorizeCheck() {
        return cvvAuthorizeCheck;
    }

    /**
     * Setter for CvvAuthorizeCheck.
     * Token Response Card Data Cvv Authorize Check schema.
     * @param cvvAuthorizeCheck Value for TokenResponseCardDataCvvAuthorizeCheck
     */
    @JsonSetter("cvv_authorize_check")
    public void setCvvAuthorizeCheck(TokenResponseCardDataCvvAuthorizeCheck cvvAuthorizeCheck) {
        this.cvvAuthorizeCheck = cvvAuthorizeCheck;
    }

    /**
     * Getter for ThreeDs.
     * Token Response Card Data Three Ds schema.
     * @return Returns the TokenResponseCardDataThreeDs
     */
    @JsonGetter("three_ds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponseCardDataThreeDs getThreeDs() {
        return threeDs;
    }

    /**
     * Setter for ThreeDs.
     * Token Response Card Data Three Ds schema.
     * @param threeDs Value for TokenResponseCardDataThreeDs
     */
    @JsonSetter("three_ds")
    public void setThreeDs(TokenResponseCardDataThreeDs threeDs) {
        this.threeDs = threeDs;
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
     * Converts this TokenResponseCardData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseCardData [" + "card=" + card + ", billing=" + billing
                + ", cvvAuthorize=" + cvvAuthorize + ", cvvAuthorizeCheck=" + cvvAuthorizeCheck
                + ", threeDs=" + threeDs + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseCardData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseCardData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .billing(getBilling())
                .cvvAuthorize(getCvvAuthorize())
                .cvvAuthorizeCheck(getCvvAuthorizeCheck())
                .threeDs(getThreeDs());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseCardData}.
     */
    public static class Builder {
        private TokenResponseCardDataCard card;
        private TokenResponseCardDataBilling billing;
        private TokenResponseCardDataCvvAuthorize cvvAuthorize;
        private TokenResponseCardDataCvvAuthorizeCheck cvvAuthorizeCheck;
        private TokenResponseCardDataThreeDs threeDs;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for card.
         * @param  card  TokenResponseCardDataCard value for card.
         * @return Builder
         */
        public Builder card(TokenResponseCardDataCard card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for billing.
         * @param  billing  TokenResponseCardDataBilling value for billing.
         * @return Builder
         */
        public Builder billing(TokenResponseCardDataBilling billing) {
            this.billing = billing;
            return this;
        }

        /**
         * Setter for cvvAuthorize.
         * @param  cvvAuthorize  TokenResponseCardDataCvvAuthorize value for cvvAuthorize.
         * @return Builder
         */
        public Builder cvvAuthorize(TokenResponseCardDataCvvAuthorize cvvAuthorize) {
            this.cvvAuthorize = cvvAuthorize;
            return this;
        }

        /**
         * Setter for cvvAuthorizeCheck.
         * @param  cvvAuthorizeCheck  TokenResponseCardDataCvvAuthorizeCheck value for
         *         cvvAuthorizeCheck.
         * @return Builder
         */
        public Builder cvvAuthorizeCheck(
                TokenResponseCardDataCvvAuthorizeCheck cvvAuthorizeCheck) {
            this.cvvAuthorizeCheck = cvvAuthorizeCheck;
            return this;
        }

        /**
         * Setter for threeDs.
         * @param  threeDs  TokenResponseCardDataThreeDs value for threeDs.
         * @return Builder
         */
        public Builder threeDs(TokenResponseCardDataThreeDs threeDs) {
            this.threeDs = threeDs;
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
         * Builds a new {@link TokenResponseCardData} object using the set fields.
         * @return {@link TokenResponseCardData}
         */
        public TokenResponseCardData build() {
            TokenResponseCardData model =
                    new TokenResponseCardData(card, billing, cvvAuthorize, cvvAuthorizeCheck,
                            threeDs);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
