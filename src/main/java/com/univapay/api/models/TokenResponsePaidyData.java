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
 * This is a model class for TokenResponsePaidyData type.
 */
public class TokenResponsePaidyData {
    private String paidyToken;
    private OptionalNullable<String> phoneNumber;
    private TokenResponsePaidyDataShippingAddress shippingAddress;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponsePaidyData() {
    }

    /**
     * Initialization constructor.
     * @param  paidyToken  String value for paidyToken.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  shippingAddress  TokenResponsePaidyDataShippingAddress value for shippingAddress.
     */
    public TokenResponsePaidyData(
            String paidyToken,
            String phoneNumber,
            TokenResponsePaidyDataShippingAddress shippingAddress) {
        this.paidyToken = paidyToken;
        this.phoneNumber = OptionalNullable.of(phoneNumber);
        this.shippingAddress = shippingAddress;
    }

    /**
     * Initialization constructor.
     * @param  paidyToken  String value for paidyToken.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  shippingAddress  TokenResponsePaidyDataShippingAddress value for shippingAddress.
     */

    protected TokenResponsePaidyData(String paidyToken, OptionalNullable<String> phoneNumber,
            TokenResponsePaidyDataShippingAddress shippingAddress) {
        this.paidyToken = paidyToken;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for PaidyToken.
     * One-time token issued by the Paidy SDK/widget on the client side.
     * @return Returns the String
     */
    @JsonGetter("paidy_token")
    public String getPaidyToken() {
        return paidyToken;
    }

    /**
     * Setter for PaidyToken.
     * One-time token issued by the Paidy SDK/widget on the client side.
     * @param paidyToken Value for String
     */
    @JsonSetter("paidy_token")
    public void setPaidyToken(String paidyToken) {
        this.paidyToken = paidyToken;
    }

    /**
     * Internal Getter for PhoneNumber.
     * Consumer phone number in Japanese format.
     * @return Returns the Internal String
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Getter for PhoneNumber.
     * Consumer phone number in Japanese format.
     * @return Returns the String
     */
    public String getPhoneNumber() {
        return OptionalNullable.getFrom(phoneNumber);
    }

    /**
     * Setter for PhoneNumber.
     * Consumer phone number in Japanese format.
     * @param phoneNumber Value for String
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = OptionalNullable.of(phoneNumber);
    }

    /**
     * UnSetter for PhoneNumber.
     * Consumer phone number in Japanese format.
     */
    public void unsetPhoneNumber() {
        phoneNumber = null;
    }

    /**
     * Getter for ShippingAddress.
     * Shipping address returned for a Paidy token.
     * @return Returns the TokenResponsePaidyDataShippingAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponsePaidyDataShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * Shipping address returned for a Paidy token.
     * @param shippingAddress Value for TokenResponsePaidyDataShippingAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(TokenResponsePaidyDataShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
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
     * Converts this TokenResponsePaidyData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponsePaidyData [" + "paidyToken=" + paidyToken + ", phoneNumber="
                + phoneNumber + ", shippingAddress=" + shippingAddress + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponsePaidyData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponsePaidyData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paidyToken)
                .shippingAddress(getShippingAddress());
        builder.phoneNumber = internalGetPhoneNumber();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponsePaidyData}.
     */
    public static class Builder {
        private String paidyToken;
        private OptionalNullable<String> phoneNumber;
        private TokenResponsePaidyDataShippingAddress shippingAddress;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paidyToken  String value for paidyToken.
         */
        public Builder(String paidyToken) {
            this.paidyToken = paidyToken;
        }

        /**
         * Setter for paidyToken.
         * @param  paidyToken  String value for paidyToken.
         * @return Builder
         */
        public Builder paidyToken(String paidyToken) {
            this.paidyToken = paidyToken;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  String value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = OptionalNullable.of(phoneNumber);
            return this;
        }

        /**
         * UnSetter for phoneNumber.
         * @return Builder
         */
        public Builder unsetPhoneNumber() {
            phoneNumber = null;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  TokenResponsePaidyDataShippingAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(TokenResponsePaidyDataShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
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
         * Builds a new {@link TokenResponsePaidyData} object using the set fields.
         * @return {@link TokenResponsePaidyData}
         */
        public TokenResponsePaidyData build() {
            TokenResponsePaidyData model =
                    new TokenResponsePaidyData(paidyToken, phoneNumber, shippingAddress);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
