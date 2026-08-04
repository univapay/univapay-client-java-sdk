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
import java.util.List;
import java.util.Map;

/**
 * This is a model class for CustomsDeclarationWebhookError type.
 */
public class CustomsDeclarationWebhookError {
    private Integer code;
    private String message;
    private OptionalNullable<String> details;
    private OptionalNullable<List<CustomsDeclarationWebhookOtherError>> others;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CustomsDeclarationWebhookError() {
    }

    /**
     * Initialization constructor.
     * @param  code  Integer value for code.
     * @param  message  String value for message.
     * @param  details  String value for details.
     * @param  others  List of CustomsDeclarationWebhookOtherError value for others.
     */
    public CustomsDeclarationWebhookError(
            Integer code,
            String message,
            String details,
            List<CustomsDeclarationWebhookOtherError> others) {
        this.code = code;
        this.message = message;
        this.details = OptionalNullable.of(details);
        this.others = OptionalNullable.of(others);
    }

    /**
     * Initialization constructor.
     * @param  code  Integer value for code.
     * @param  message  String value for message.
     * @param  details  String value for details.
     * @param  others  List of CustomsDeclarationWebhookOtherError value for others.
     */

    protected CustomsDeclarationWebhookError(Integer code, String message,
            OptionalNullable<String> details,
            OptionalNullable<List<CustomsDeclarationWebhookOtherError>> others) {
        this.code = code;
        this.message = message;
        this.details = details;
        this.others = others;
    }

    /**
     * Getter for Code.
     * Backend customs declaration error code.
     * @return Returns the Integer
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Backend customs declaration error code.
     * @param code Value for Integer
     */
    @JsonSetter("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * Human-readable backend error name.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * Human-readable backend error name.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Internal Getter for Details.
     * Optional backend-provided detail string.
     * @return Returns the Internal String
     */
    @JsonGetter("details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDetails() {
        return this.details;
    }

    /**
     * Getter for Details.
     * Optional backend-provided detail string.
     * @return Returns the String
     */
    public String getDetails() {
        return OptionalNullable.getFrom(details);
    }

    /**
     * Setter for Details.
     * Optional backend-provided detail string.
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = OptionalNullable.of(details);
    }

    /**
     * UnSetter for Details.
     * Optional backend-provided detail string.
     */
    public void unsetDetails() {
        details = null;
    }

    /**
     * Internal Getter for Others.
     * Additional nested error records returned by the backend.
     * @return Returns the Internal List of CustomsDeclarationWebhookOtherError
     */
    @JsonGetter("others")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<CustomsDeclarationWebhookOtherError>> internalGetOthers() {
        return this.others;
    }

    /**
     * Getter for Others.
     * Additional nested error records returned by the backend.
     * @return Returns the List of CustomsDeclarationWebhookOtherError
     */
    public List<CustomsDeclarationWebhookOtherError> getOthers() {
        return OptionalNullable.getFrom(others);
    }

    /**
     * Setter for Others.
     * Additional nested error records returned by the backend.
     * @param others Value for List of CustomsDeclarationWebhookOtherError
     */
    @JsonSetter("others")
    public void setOthers(List<CustomsDeclarationWebhookOtherError> others) {
        this.others = OptionalNullable.of(others);
    }

    /**
     * UnSetter for Others.
     * Additional nested error records returned by the backend.
     */
    public void unsetOthers() {
        others = null;
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
     * Converts this CustomsDeclarationWebhookError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomsDeclarationWebhookError [" + "code=" + code + ", message=" + message
                + ", details=" + details + ", others=" + others + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CustomsDeclarationWebhookError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomsDeclarationWebhookError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .message(getMessage());
        builder.details = internalGetDetails();
        builder.others = internalGetOthers();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CustomsDeclarationWebhookError}.
     */
    public static class Builder {
        private Integer code;
        private String message;
        private OptionalNullable<String> details;
        private OptionalNullable<List<CustomsDeclarationWebhookOtherError>> others;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for code.
         * @param  code  Integer value for code.
         * @return Builder
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = OptionalNullable.of(details);
            return this;
        }

        /**
         * UnSetter for details.
         * @return Builder
         */
        public Builder unsetDetails() {
            details = null;
            return this;
        }

        /**
         * Setter for others.
         * @param  others  List of CustomsDeclarationWebhookOtherError value for others.
         * @return Builder
         */
        public Builder others(List<CustomsDeclarationWebhookOtherError> others) {
            this.others = OptionalNullable.of(others);
            return this;
        }

        /**
         * UnSetter for others.
         * @return Builder
         */
        public Builder unsetOthers() {
            others = null;
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
         * Builds a new {@link CustomsDeclarationWebhookError} object using the set fields.
         * @return {@link CustomsDeclarationWebhookError}
         */
        public CustomsDeclarationWebhookError build() {
            CustomsDeclarationWebhookError model =
                    new CustomsDeclarationWebhookError(code, message, details, others);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
