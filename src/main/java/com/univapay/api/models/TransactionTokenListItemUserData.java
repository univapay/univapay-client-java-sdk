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
 * This is a model class for TransactionTokenListItemUserData type.
 */
public class TransactionTokenListItemUserData {
    private String cardholderName;
    private String email;
    private String brand;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionTokenListItemUserData() {
    }

    /**
     * Initialization constructor.
     * @param  cardholderName  String value for cardholderName.
     * @param  email  String value for email.
     * @param  brand  String value for brand.
     */
    public TransactionTokenListItemUserData(
            String cardholderName,
            String email,
            String brand) {
        this.cardholderName = cardholderName;
        this.email = email;
        this.brand = brand;
    }

    /**
     * Getter for CardholderName.
     * Cardholder name value.
     * @return Returns the String
     */
    @JsonGetter("cardholder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Setter for CardholderName.
     * Cardholder name value.
     * @param cardholderName Value for String
     */
    @JsonSetter("cardholder_name")
    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    /**
     * Getter for Email.
     * Customer email address.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Customer email address.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Brand.
     * Brand or network name.
     * @return Returns the String
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * Brand or network name.
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
     * Converts this TransactionTokenListItemUserData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionTokenListItemUserData [" + "cardholderName=" + cardholderName
                + ", email=" + email + ", brand=" + brand + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionTokenListItemUserData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionTokenListItemUserData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardholderName(getCardholderName())
                .email(getEmail())
                .brand(getBrand());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionTokenListItemUserData}.
     */
    public static class Builder {
        private String cardholderName;
        private String email;
        private String brand;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for cardholderName.
         * @param  cardholderName  String value for cardholderName.
         * @return Builder
         */
        public Builder cardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
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
         * Builds a new {@link TransactionTokenListItemUserData} object using the set fields.
         * @return {@link TransactionTokenListItemUserData}
         */
        public TransactionTokenListItemUserData build() {
            TransactionTokenListItemUserData model =
                    new TransactionTokenListItemUserData(cardholderName, email, brand);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
