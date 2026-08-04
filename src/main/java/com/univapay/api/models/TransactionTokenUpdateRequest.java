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
 * This is a model class for TransactionTokenUpdateRequest type.
 */
public class TransactionTokenUpdateRequest {
    private String email;
    private GenericMetadata metadata;
    private TransactionTokenUpdateRequestData data;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionTokenUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  data  TransactionTokenUpdateRequestData value for data.
     */
    public TransactionTokenUpdateRequest(
            String email,
            GenericMetadata metadata,
            TransactionTokenUpdateRequestData data) {
        this.email = email;
        this.metadata = metadata;
        this.data = data;
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
     * Getter for Metadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the GenericMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GenericMetadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * A free-form dictionary for custom metadata.
     * @param metadata Value for GenericMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(GenericMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Data.
     * Transaction Token Update Request Data schema.
     * @return Returns the TransactionTokenUpdateRequestData
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionTokenUpdateRequestData getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Transaction Token Update Request Data schema.
     * @param data Value for TransactionTokenUpdateRequestData
     */
    @JsonSetter("data")
    public void setData(TransactionTokenUpdateRequestData data) {
        this.data = data;
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
     * Converts this TransactionTokenUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionTokenUpdateRequest [" + "email=" + email + ", metadata=" + metadata
                + ", data=" + data + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionTokenUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionTokenUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .email(getEmail())
                .metadata(getMetadata())
                .data(getData());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionTokenUpdateRequest}.
     */
    public static class Builder {
        private String email;
        private GenericMetadata metadata;
        private TransactionTokenUpdateRequestData data;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for metadata.
         * @param  metadata  GenericMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(GenericMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  TransactionTokenUpdateRequestData value for data.
         * @return Builder
         */
        public Builder data(TransactionTokenUpdateRequestData data) {
            this.data = data;
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
         * Builds a new {@link TransactionTokenUpdateRequest} object using the set fields.
         * @return {@link TransactionTokenUpdateRequest}
         */
        public TransactionTokenUpdateRequest build() {
            TransactionTokenUpdateRequest model =
                    new TransactionTokenUpdateRequest(email, metadata, data);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
