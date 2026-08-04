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
 * This is a model class for CancelUpdateRequest type.
 */
public class CancelUpdateRequest {
    private GenericMetadata metadata;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CancelUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  metadata  GenericMetadata value for metadata.
     */
    public CancelUpdateRequest(
            GenericMetadata metadata) {
        this.metadata = metadata;
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
     * Converts this CancelUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancelUpdateRequest [" + "metadata=" + metadata + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CancelUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancelUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .metadata(getMetadata());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CancelUpdateRequest}.
     */
    public static class Builder {
        private GenericMetadata metadata;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Builds a new {@link CancelUpdateRequest} object using the set fields.
         * @return {@link CancelUpdateRequest}
         */
        public CancelUpdateRequest build() {
            CancelUpdateRequest model =
                    new CancelUpdateRequest(metadata);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
