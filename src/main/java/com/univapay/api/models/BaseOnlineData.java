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
 * This is a model class for BaseOnlineData type.
 */
public class BaseOnlineData {
    private BaseOnlineDataBrand brand;
    private BaseOnlineDataCallMethod callMethod;
    private OptionalNullable<BaseOnlineDataOsType> osType;
    private OptionalNullable<String> userIdentifier;
    private OptionalNullable<BaseOnlineDataUserIdentifierSource> userIdentifierSource;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public BaseOnlineData() {
    }

    /**
     * Initialization constructor.
     * @param  brand  BaseOnlineDataBrand value for brand.
     * @param  callMethod  BaseOnlineDataCallMethod value for callMethod.
     * @param  osType  BaseOnlineDataOsType value for osType.
     * @param  userIdentifier  String value for userIdentifier.
     * @param  userIdentifierSource  BaseOnlineDataUserIdentifierSource value for
     *         userIdentifierSource.
     */
    public BaseOnlineData(
            BaseOnlineDataBrand brand,
            BaseOnlineDataCallMethod callMethod,
            BaseOnlineDataOsType osType,
            String userIdentifier,
            BaseOnlineDataUserIdentifierSource userIdentifierSource) {
        this.brand = brand;
        this.callMethod = callMethod;
        this.osType = OptionalNullable.of(osType);
        this.userIdentifier = OptionalNullable.of(userIdentifier);
        this.userIdentifierSource = OptionalNullable.of(userIdentifierSource);
    }

    /**
     * Initialization constructor.
     * @param  brand  BaseOnlineDataBrand value for brand.
     * @param  callMethod  BaseOnlineDataCallMethod value for callMethod.
     * @param  osType  BaseOnlineDataOsType value for osType.
     * @param  userIdentifier  String value for userIdentifier.
     * @param  userIdentifierSource  BaseOnlineDataUserIdentifierSource value for
     *         userIdentifierSource.
     */

    protected BaseOnlineData(BaseOnlineDataBrand brand, BaseOnlineDataCallMethod callMethod,
            OptionalNullable<BaseOnlineDataOsType> osType, OptionalNullable<String> userIdentifier,
            OptionalNullable<BaseOnlineDataUserIdentifierSource> userIdentifierSource) {
        this.brand = brand;
        this.callMethod = callMethod;
        this.osType = osType;
        this.userIdentifier = userIdentifier;
        this.userIdentifierSource = userIdentifierSource;
    }

    /**
     * Getter for Brand.
     * Base Online Data Brand schema. `alipay_china`, `alipay_hk`, `gcash`, `dana`, `truemoney`,
     * `kakaopay`, `tng`, `rabbit_line_pay`, `bpi`, `boost`, `tinaba`, `naver_pay`, `toss_pay`,
     * `maya`, `grab_sg`, `kredivo_id`, `k_plus`, and `kaspi_kz` are Alipay+ regional wallets routed
     * through the `alipay_plus_online` gateway family.
     * @return Returns the BaseOnlineDataBrand
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BaseOnlineDataBrand getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * Base Online Data Brand schema. `alipay_china`, `alipay_hk`, `gcash`, `dana`, `truemoney`,
     * `kakaopay`, `tng`, `rabbit_line_pay`, `bpi`, `boost`, `tinaba`, `naver_pay`, `toss_pay`,
     * `maya`, `grab_sg`, `kredivo_id`, `k_plus`, and `kaspi_kz` are Alipay+ regional wallets routed
     * through the `alipay_plus_online` gateway family.
     * @param brand Value for BaseOnlineDataBrand
     */
    @JsonSetter("brand")
    public void setBrand(BaseOnlineDataBrand brand) {
        this.brand = brand;
    }

    /**
     * Getter for CallMethod.
     * Base Online Data Call Method schema.
     * @return Returns the BaseOnlineDataCallMethod
     */
    @JsonGetter("call_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BaseOnlineDataCallMethod getCallMethod() {
        return callMethod;
    }

    /**
     * Setter for CallMethod.
     * Base Online Data Call Method schema.
     * @param callMethod Value for BaseOnlineDataCallMethod
     */
    @JsonSetter("call_method")
    public void setCallMethod(BaseOnlineDataCallMethod callMethod) {
        this.callMethod = callMethod;
    }

    /**
     * Internal Getter for OsType.
     * Base Online Data Os Type schema.
     * @return Returns the Internal BaseOnlineDataOsType
     */
    @JsonGetter("os_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<BaseOnlineDataOsType> internalGetOsType() {
        return this.osType;
    }

    /**
     * Getter for OsType.
     * Base Online Data Os Type schema.
     * @return Returns the BaseOnlineDataOsType
     */
    public BaseOnlineDataOsType getOsType() {
        return OptionalNullable.getFrom(osType);
    }

    /**
     * Setter for OsType.
     * Base Online Data Os Type schema.
     * @param osType Value for BaseOnlineDataOsType
     */
    @JsonSetter("os_type")
    public void setOsType(BaseOnlineDataOsType osType) {
        this.osType = OptionalNullable.of(osType);
    }

    /**
     * UnSetter for OsType.
     * Base Online Data Os Type schema.
     */
    public void unsetOsType() {
        osType = null;
    }

    /**
     * Internal Getter for UserIdentifier.
     * Consumer specific identifier required by some gateways for fraud prevention.
     * @return Returns the Internal String
     */
    @JsonGetter("user_identifier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * Getter for UserIdentifier.
     * Consumer specific identifier required by some gateways for fraud prevention.
     * @return Returns the String
     */
    public String getUserIdentifier() {
        return OptionalNullable.getFrom(userIdentifier);
    }

    /**
     * Setter for UserIdentifier.
     * Consumer specific identifier required by some gateways for fraud prevention.
     * @param userIdentifier Value for String
     */
    @JsonSetter("user_identifier")
    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = OptionalNullable.of(userIdentifier);
    }

    /**
     * UnSetter for UserIdentifier.
     * Consumer specific identifier required by some gateways for fraud prevention.
     */
    public void unsetUserIdentifier() {
        userIdentifier = null;
    }

    /**
     * Internal Getter for UserIdentifierSource.
     * The source of the user identifier
     * @return Returns the Internal BaseOnlineDataUserIdentifierSource
     */
    @JsonGetter("user_identifier_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<BaseOnlineDataUserIdentifierSource> internalGetUserIdentifierSource() {
        return this.userIdentifierSource;
    }

    /**
     * Getter for UserIdentifierSource.
     * The source of the user identifier
     * @return Returns the BaseOnlineDataUserIdentifierSource
     */
    public BaseOnlineDataUserIdentifierSource getUserIdentifierSource() {
        return OptionalNullable.getFrom(userIdentifierSource);
    }

    /**
     * Setter for UserIdentifierSource.
     * The source of the user identifier
     * @param userIdentifierSource Value for BaseOnlineDataUserIdentifierSource
     */
    @JsonSetter("user_identifier_source")
    public void setUserIdentifierSource(BaseOnlineDataUserIdentifierSource userIdentifierSource) {
        this.userIdentifierSource = OptionalNullable.of(userIdentifierSource);
    }

    /**
     * UnSetter for UserIdentifierSource.
     * The source of the user identifier
     */
    public void unsetUserIdentifierSource() {
        userIdentifierSource = null;
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
     * Converts this BaseOnlineData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BaseOnlineData [" + "brand=" + brand + ", callMethod=" + callMethod + ", osType="
                + osType + ", userIdentifier=" + userIdentifier + ", userIdentifierSource="
                + userIdentifierSource + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link BaseOnlineData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BaseOnlineData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brand(getBrand())
                .callMethod(getCallMethod());
        builder.osType = internalGetOsType();
        builder.userIdentifier = internalGetUserIdentifier();
        builder.userIdentifierSource = internalGetUserIdentifierSource();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link BaseOnlineData}.
     */
    public static class Builder {
        private BaseOnlineDataBrand brand;
        private BaseOnlineDataCallMethod callMethod;
        private OptionalNullable<BaseOnlineDataOsType> osType;
        private OptionalNullable<String> userIdentifier;
        private OptionalNullable<BaseOnlineDataUserIdentifierSource> userIdentifierSource;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for brand.
         * @param  brand  BaseOnlineDataBrand value for brand.
         * @return Builder
         */
        public Builder brand(BaseOnlineDataBrand brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for callMethod.
         * @param  callMethod  BaseOnlineDataCallMethod value for callMethod.
         * @return Builder
         */
        public Builder callMethod(BaseOnlineDataCallMethod callMethod) {
            this.callMethod = callMethod;
            return this;
        }

        /**
         * Setter for osType.
         * @param  osType  BaseOnlineDataOsType value for osType.
         * @return Builder
         */
        public Builder osType(BaseOnlineDataOsType osType) {
            this.osType = OptionalNullable.of(osType);
            return this;
        }

        /**
         * UnSetter for osType.
         * @return Builder
         */
        public Builder unsetOsType() {
            osType = null;
            return this;
        }

        /**
         * Setter for userIdentifier.
         * @param  userIdentifier  String value for userIdentifier.
         * @return Builder
         */
        public Builder userIdentifier(String userIdentifier) {
            this.userIdentifier = OptionalNullable.of(userIdentifier);
            return this;
        }

        /**
         * UnSetter for userIdentifier.
         * @return Builder
         */
        public Builder unsetUserIdentifier() {
            userIdentifier = null;
            return this;
        }

        /**
         * Setter for userIdentifierSource.
         * @param  userIdentifierSource  BaseOnlineDataUserIdentifierSource value for
         *         userIdentifierSource.
         * @return Builder
         */
        public Builder userIdentifierSource(
                BaseOnlineDataUserIdentifierSource userIdentifierSource) {
            this.userIdentifierSource = OptionalNullable.of(userIdentifierSource);
            return this;
        }

        /**
         * UnSetter for userIdentifierSource.
         * @return Builder
         */
        public Builder unsetUserIdentifierSource() {
            userIdentifierSource = null;
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
         * Builds a new {@link BaseOnlineData} object using the set fields.
         * @return {@link BaseOnlineData}
         */
        public BaseOnlineData build() {
            BaseOnlineData model =
                    new BaseOnlineData(brand, callMethod, osType, userIdentifier,
                            userIdentifierSource);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
