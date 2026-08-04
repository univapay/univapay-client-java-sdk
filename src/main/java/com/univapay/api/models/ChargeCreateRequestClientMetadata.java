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
 * This is a model class for ChargeCreateRequestClientMetadata type.
 */
public class ChargeCreateRequestClientMetadata {
    private String ipAddress;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ChargeCreateRequestClientMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  ipAddress  String value for ipAddress.
     */
    public ChargeCreateRequestClientMetadata(
            String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Getter for IpAddress.
     * Consumer's IPv4 address.
     * @return Returns the String
     */
    @JsonGetter("ip_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter for IpAddress.
     * Consumer's IPv4 address.
     * @param ipAddress Value for String
     */
    @JsonSetter("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
     * Converts this ChargeCreateRequestClientMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargeCreateRequestClientMetadata [" + "ipAddress=" + ipAddress
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ChargeCreateRequestClientMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargeCreateRequestClientMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ipAddress(getIpAddress());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ChargeCreateRequestClientMetadata}.
     */
    public static class Builder {
        private String ipAddress;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for ipAddress.
         * @param  ipAddress  String value for ipAddress.
         * @return Builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
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
         * Builds a new {@link ChargeCreateRequestClientMetadata} object using the set fields.
         * @return {@link ChargeCreateRequestClientMetadata}
         */
        public ChargeCreateRequestClientMetadata build() {
            ChargeCreateRequestClientMetadata model =
                    new ChargeCreateRequestClientMetadata(ipAddress);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
