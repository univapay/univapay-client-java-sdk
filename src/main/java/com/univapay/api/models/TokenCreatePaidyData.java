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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for TokenCreatePaidyData type.
 */
public class TokenCreatePaidyData {
    private String paidyToken;
    private TokenCreatePaidyDataShippingAddress shippingAddress;
    private String phoneNumber;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenCreatePaidyData() {
    }

    /**
     * Initialization constructor.
     * @param  paidyToken  String value for paidyToken.
     * @param  shippingAddress  TokenCreatePaidyDataShippingAddress value for shippingAddress.
     * @param  phoneNumber  String value for phoneNumber.
     */
    public TokenCreatePaidyData(
            String paidyToken,
            TokenCreatePaidyDataShippingAddress shippingAddress,
            String phoneNumber) {
        this.paidyToken = paidyToken;
        this.shippingAddress = shippingAddress;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Initialization constructor.
     * @param  paidyToken  String value for paidyToken.
     * @param  shippingAddress  TokenCreatePaidyDataShippingAddress value for shippingAddress.
     */
    @JsonCreator
    protected TokenCreatePaidyData(
            @JsonProperty("paidy_token") String paidyToken,
            @JsonProperty("shipping_address") TokenCreatePaidyDataShippingAddress shippingAddress) {
        this(paidyToken, shippingAddress, null);
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
     * Getter for ShippingAddress.
     * Shipping address for a Paidy token. `zip` is required; the server additionally requires at
     * least one of `line1`, `line2`, `city`, or `state` to be present (not enforceable at the
     * schema level).
     * @return Returns the TokenCreatePaidyDataShippingAddress
     */
    @JsonGetter("shipping_address")
    public TokenCreatePaidyDataShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * Shipping address for a Paidy token. `zip` is required; the server additionally requires at
     * least one of `line1`, `line2`, `city`, or `state` to be present (not enforceable at the
     * schema level).
     * @param shippingAddress Value for TokenCreatePaidyDataShippingAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(TokenCreatePaidyDataShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for PhoneNumber.
     * Consumer phone number in Japanese format (e.g., '08012341234').
     * @return Returns the String
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * Consumer phone number in Japanese format (e.g., '08012341234').
     * @param phoneNumber Value for String
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * Converts this TokenCreatePaidyData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenCreatePaidyData [" + "paidyToken=" + paidyToken + ", shippingAddress="
                + shippingAddress + ", phoneNumber=" + phoneNumber + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenCreatePaidyData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenCreatePaidyData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paidyToken, shippingAddress)
                .phoneNumber(getPhoneNumber());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenCreatePaidyData}.
     */
    public static class Builder {
        private String paidyToken;
        private TokenCreatePaidyDataShippingAddress shippingAddress;
        private String phoneNumber;
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
         * @param  shippingAddress  TokenCreatePaidyDataShippingAddress value for shippingAddress.
         */
        public Builder(String paidyToken, TokenCreatePaidyDataShippingAddress shippingAddress) {
            this.paidyToken = paidyToken;
            this.shippingAddress = shippingAddress;
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
         * Setter for shippingAddress.
         * @param  shippingAddress  TokenCreatePaidyDataShippingAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(TokenCreatePaidyDataShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  String value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
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
         * Builds a new {@link TokenCreatePaidyData} object using the set fields.
         * @return {@link TokenCreatePaidyData}
         */
        public TokenCreatePaidyData build() {
            TokenCreatePaidyData model =
                    new TokenCreatePaidyData(paidyToken, shippingAddress, phoneNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
