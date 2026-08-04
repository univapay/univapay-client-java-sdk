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
 * This is a model class for SubscriptionUserData type.
 */
public class SubscriptionUserData {
    private String type;
    private OptionalNullable<String> cardholderName;
    private OptionalNullable<String> email;
    private OptionalNullable<String> brand;
    private OptionalNullable<String> gateway;
    private OptionalNullable<String> serviceProvider;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionUserData() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  cardholderName  String value for cardholderName.
     * @param  email  String value for email.
     * @param  brand  String value for brand.
     * @param  gateway  String value for gateway.
     * @param  serviceProvider  String value for serviceProvider.
     */
    public SubscriptionUserData(
            String type,
            String cardholderName,
            String email,
            String brand,
            String gateway,
            String serviceProvider) {
        this.type = type;
        this.cardholderName = OptionalNullable.of(cardholderName);
        this.email = OptionalNullable.of(email);
        this.brand = OptionalNullable.of(brand);
        this.gateway = OptionalNullable.of(gateway);
        this.serviceProvider = OptionalNullable.of(serviceProvider);
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  cardholderName  String value for cardholderName.
     * @param  email  String value for email.
     * @param  brand  String value for brand.
     * @param  gateway  String value for gateway.
     * @param  serviceProvider  String value for serviceProvider.
     */

    protected SubscriptionUserData(String type, OptionalNullable<String> cardholderName,
            OptionalNullable<String> email, OptionalNullable<String> brand,
            OptionalNullable<String> gateway, OptionalNullable<String> serviceProvider) {
        this.type = type;
        this.cardholderName = cardholderName;
        this.email = email;
        this.brand = brand;
        this.gateway = gateway;
        this.serviceProvider = serviceProvider;
    }

    /**
     * Getter for Type.
     * Type of the resource.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the resource.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Internal Getter for CardholderName.
     * Cardholder name value.
     * @return Returns the Internal String
     */
    @JsonGetter("cardholder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCardholderName() {
        return this.cardholderName;
    }

    /**
     * Getter for CardholderName.
     * Cardholder name value.
     * @return Returns the String
     */
    public String getCardholderName() {
        return OptionalNullable.getFrom(cardholderName);
    }

    /**
     * Setter for CardholderName.
     * Cardholder name value.
     * @param cardholderName Value for String
     */
    @JsonSetter("cardholder_name")
    public void setCardholderName(String cardholderName) {
        this.cardholderName = OptionalNullable.of(cardholderName);
    }

    /**
     * UnSetter for CardholderName.
     * Cardholder name value.
     */
    public void unsetCardholderName() {
        cardholderName = null;
    }

    /**
     * Internal Getter for Email.
     * Customer email address.
     * @return Returns the Internal String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEmail() {
        return this.email;
    }

    /**
     * Getter for Email.
     * Customer email address.
     * @return Returns the String
     */
    public String getEmail() {
        return OptionalNullable.getFrom(email);
    }

    /**
     * Setter for Email.
     * Customer email address.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = OptionalNullable.of(email);
    }

    /**
     * UnSetter for Email.
     * Customer email address.
     */
    public void unsetEmail() {
        email = null;
    }

    /**
     * Internal Getter for Brand.
     * Brand or network name.
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
     * Brand or network name.
     * @return Returns the String
     */
    public String getBrand() {
        return OptionalNullable.getFrom(brand);
    }

    /**
     * Setter for Brand.
     * Brand or network name.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = OptionalNullable.of(brand);
    }

    /**
     * UnSetter for Brand.
     * Brand or network name.
     */
    public void unsetBrand() {
        brand = null;
    }

    /**
     * Internal Getter for Gateway.
     * Gateway identifier.
     * @return Returns the Internal String
     */
    @JsonGetter("gateway")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGateway() {
        return this.gateway;
    }

    /**
     * Getter for Gateway.
     * Gateway identifier.
     * @return Returns the String
     */
    public String getGateway() {
        return OptionalNullable.getFrom(gateway);
    }

    /**
     * Setter for Gateway.
     * Gateway identifier.
     * @param gateway Value for String
     */
    @JsonSetter("gateway")
    public void setGateway(String gateway) {
        this.gateway = OptionalNullable.of(gateway);
    }

    /**
     * UnSetter for Gateway.
     * Gateway identifier.
     */
    public void unsetGateway() {
        gateway = null;
    }

    /**
     * Internal Getter for ServiceProvider.
     * Service provider identifier.
     * @return Returns the Internal String
     */
    @JsonGetter("service_provider")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetServiceProvider() {
        return this.serviceProvider;
    }

    /**
     * Getter for ServiceProvider.
     * Service provider identifier.
     * @return Returns the String
     */
    public String getServiceProvider() {
        return OptionalNullable.getFrom(serviceProvider);
    }

    /**
     * Setter for ServiceProvider.
     * Service provider identifier.
     * @param serviceProvider Value for String
     */
    @JsonSetter("service_provider")
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = OptionalNullable.of(serviceProvider);
    }

    /**
     * UnSetter for ServiceProvider.
     * Service provider identifier.
     */
    public void unsetServiceProvider() {
        serviceProvider = null;
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
     * Converts this SubscriptionUserData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionUserData [" + "type=" + type + ", cardholderName=" + cardholderName
                + ", email=" + email + ", brand=" + brand + ", gateway=" + gateway
                + ", serviceProvider=" + serviceProvider + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionUserData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionUserData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType());
        builder.cardholderName = internalGetCardholderName();
        builder.email = internalGetEmail();
        builder.brand = internalGetBrand();
        builder.gateway = internalGetGateway();
        builder.serviceProvider = internalGetServiceProvider();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionUserData}.
     */
    public static class Builder {
        private String type;
        private OptionalNullable<String> cardholderName;
        private OptionalNullable<String> email;
        private OptionalNullable<String> brand;
        private OptionalNullable<String> gateway;
        private OptionalNullable<String> serviceProvider;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for cardholderName.
         * @param  cardholderName  String value for cardholderName.
         * @return Builder
         */
        public Builder cardholderName(String cardholderName) {
            this.cardholderName = OptionalNullable.of(cardholderName);
            return this;
        }

        /**
         * UnSetter for cardholderName.
         * @return Builder
         */
        public Builder unsetCardholderName() {
            cardholderName = null;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = OptionalNullable.of(email);
            return this;
        }

        /**
         * UnSetter for email.
         * @return Builder
         */
        public Builder unsetEmail() {
            email = null;
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
         * Setter for gateway.
         * @param  gateway  String value for gateway.
         * @return Builder
         */
        public Builder gateway(String gateway) {
            this.gateway = OptionalNullable.of(gateway);
            return this;
        }

        /**
         * UnSetter for gateway.
         * @return Builder
         */
        public Builder unsetGateway() {
            gateway = null;
            return this;
        }

        /**
         * Setter for serviceProvider.
         * @param  serviceProvider  String value for serviceProvider.
         * @return Builder
         */
        public Builder serviceProvider(String serviceProvider) {
            this.serviceProvider = OptionalNullable.of(serviceProvider);
            return this;
        }

        /**
         * UnSetter for serviceProvider.
         * @return Builder
         */
        public Builder unsetServiceProvider() {
            serviceProvider = null;
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
         * Builds a new {@link SubscriptionUserData} object using the set fields.
         * @return {@link SubscriptionUserData}
         */
        public SubscriptionUserData build() {
            SubscriptionUserData model =
                    new SubscriptionUserData(type, cardholderName, email, brand, gateway,
                            serviceProvider);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
