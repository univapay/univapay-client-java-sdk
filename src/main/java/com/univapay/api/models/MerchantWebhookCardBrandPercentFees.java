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
 * This is a model class for MerchantWebhookCardBrandPercentFees type.
 */
public class MerchantWebhookCardBrandPercentFees {
    private OptionalNullable<Double> visa;
    private OptionalNullable<Double> americanExpress;
    private OptionalNullable<Double> mastercard;
    private OptionalNullable<Double> maestro;
    private OptionalNullable<Double> discover;
    private OptionalNullable<Double> jcb;
    private OptionalNullable<Double> dinersClub;
    private OptionalNullable<Double> unionPay;
    private OptionalNullable<Double> privateLabel;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookCardBrandPercentFees() {
    }

    /**
     * Initialization constructor.
     * @param  visa  Double value for visa.
     * @param  americanExpress  Double value for americanExpress.
     * @param  mastercard  Double value for mastercard.
     * @param  maestro  Double value for maestro.
     * @param  discover  Double value for discover.
     * @param  jcb  Double value for jcb.
     * @param  dinersClub  Double value for dinersClub.
     * @param  unionPay  Double value for unionPay.
     * @param  privateLabel  Double value for privateLabel.
     */
    public MerchantWebhookCardBrandPercentFees(
            Double visa,
            Double americanExpress,
            Double mastercard,
            Double maestro,
            Double discover,
            Double jcb,
            Double dinersClub,
            Double unionPay,
            Double privateLabel) {
        this.visa = OptionalNullable.of(visa);
        this.americanExpress = OptionalNullable.of(americanExpress);
        this.mastercard = OptionalNullable.of(mastercard);
        this.maestro = OptionalNullable.of(maestro);
        this.discover = OptionalNullable.of(discover);
        this.jcb = OptionalNullable.of(jcb);
        this.dinersClub = OptionalNullable.of(dinersClub);
        this.unionPay = OptionalNullable.of(unionPay);
        this.privateLabel = OptionalNullable.of(privateLabel);
    }

    /**
     * Initialization constructor.
     * @param  visa  Double value for visa.
     * @param  americanExpress  Double value for americanExpress.
     * @param  mastercard  Double value for mastercard.
     * @param  maestro  Double value for maestro.
     * @param  discover  Double value for discover.
     * @param  jcb  Double value for jcb.
     * @param  dinersClub  Double value for dinersClub.
     * @param  unionPay  Double value for unionPay.
     * @param  privateLabel  Double value for privateLabel.
     */

    protected MerchantWebhookCardBrandPercentFees(OptionalNullable<Double> visa,
            OptionalNullable<Double> americanExpress, OptionalNullable<Double> mastercard,
            OptionalNullable<Double> maestro, OptionalNullable<Double> discover,
            OptionalNullable<Double> jcb, OptionalNullable<Double> dinersClub,
            OptionalNullable<Double> unionPay, OptionalNullable<Double> privateLabel) {
        this.visa = visa;
        this.americanExpress = americanExpress;
        this.mastercard = mastercard;
        this.maestro = maestro;
        this.discover = discover;
        this.jcb = jcb;
        this.dinersClub = dinersClub;
        this.unionPay = unionPay;
        this.privateLabel = privateLabel;
    }

    /**
     * Internal Getter for Visa.
     * Percent fee override applied to Visa transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("visa")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetVisa() {
        return this.visa;
    }

    /**
     * Getter for Visa.
     * Percent fee override applied to Visa transactions.
     * @return Returns the Double
     */
    public Double getVisa() {
        return OptionalNullable.getFrom(visa);
    }

    /**
     * Setter for Visa.
     * Percent fee override applied to Visa transactions.
     * @param visa Value for Double
     */
    @JsonSetter("visa")
    public void setVisa(Double visa) {
        this.visa = OptionalNullable.of(visa);
    }

    /**
     * UnSetter for Visa.
     * Percent fee override applied to Visa transactions.
     */
    public void unsetVisa() {
        visa = null;
    }

    /**
     * Internal Getter for AmericanExpress.
     * Percent fee override applied to American Express transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("american_express")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetAmericanExpress() {
        return this.americanExpress;
    }

    /**
     * Getter for AmericanExpress.
     * Percent fee override applied to American Express transactions.
     * @return Returns the Double
     */
    public Double getAmericanExpress() {
        return OptionalNullable.getFrom(americanExpress);
    }

    /**
     * Setter for AmericanExpress.
     * Percent fee override applied to American Express transactions.
     * @param americanExpress Value for Double
     */
    @JsonSetter("american_express")
    public void setAmericanExpress(Double americanExpress) {
        this.americanExpress = OptionalNullable.of(americanExpress);
    }

    /**
     * UnSetter for AmericanExpress.
     * Percent fee override applied to American Express transactions.
     */
    public void unsetAmericanExpress() {
        americanExpress = null;
    }

    /**
     * Internal Getter for Mastercard.
     * Percent fee override applied to Mastercard transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("mastercard")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetMastercard() {
        return this.mastercard;
    }

    /**
     * Getter for Mastercard.
     * Percent fee override applied to Mastercard transactions.
     * @return Returns the Double
     */
    public Double getMastercard() {
        return OptionalNullable.getFrom(mastercard);
    }

    /**
     * Setter for Mastercard.
     * Percent fee override applied to Mastercard transactions.
     * @param mastercard Value for Double
     */
    @JsonSetter("mastercard")
    public void setMastercard(Double mastercard) {
        this.mastercard = OptionalNullable.of(mastercard);
    }

    /**
     * UnSetter for Mastercard.
     * Percent fee override applied to Mastercard transactions.
     */
    public void unsetMastercard() {
        mastercard = null;
    }

    /**
     * Internal Getter for Maestro.
     * Percent fee override applied to Maestro transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("maestro")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetMaestro() {
        return this.maestro;
    }

    /**
     * Getter for Maestro.
     * Percent fee override applied to Maestro transactions.
     * @return Returns the Double
     */
    public Double getMaestro() {
        return OptionalNullable.getFrom(maestro);
    }

    /**
     * Setter for Maestro.
     * Percent fee override applied to Maestro transactions.
     * @param maestro Value for Double
     */
    @JsonSetter("maestro")
    public void setMaestro(Double maestro) {
        this.maestro = OptionalNullable.of(maestro);
    }

    /**
     * UnSetter for Maestro.
     * Percent fee override applied to Maestro transactions.
     */
    public void unsetMaestro() {
        maestro = null;
    }

    /**
     * Internal Getter for Discover.
     * Percent fee override applied to Discover transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("discover")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetDiscover() {
        return this.discover;
    }

    /**
     * Getter for Discover.
     * Percent fee override applied to Discover transactions.
     * @return Returns the Double
     */
    public Double getDiscover() {
        return OptionalNullable.getFrom(discover);
    }

    /**
     * Setter for Discover.
     * Percent fee override applied to Discover transactions.
     * @param discover Value for Double
     */
    @JsonSetter("discover")
    public void setDiscover(Double discover) {
        this.discover = OptionalNullable.of(discover);
    }

    /**
     * UnSetter for Discover.
     * Percent fee override applied to Discover transactions.
     */
    public void unsetDiscover() {
        discover = null;
    }

    /**
     * Internal Getter for Jcb.
     * Percent fee override applied to JCB transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("jcb")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetJcb() {
        return this.jcb;
    }

    /**
     * Getter for Jcb.
     * Percent fee override applied to JCB transactions.
     * @return Returns the Double
     */
    public Double getJcb() {
        return OptionalNullable.getFrom(jcb);
    }

    /**
     * Setter for Jcb.
     * Percent fee override applied to JCB transactions.
     * @param jcb Value for Double
     */
    @JsonSetter("jcb")
    public void setJcb(Double jcb) {
        this.jcb = OptionalNullable.of(jcb);
    }

    /**
     * UnSetter for Jcb.
     * Percent fee override applied to JCB transactions.
     */
    public void unsetJcb() {
        jcb = null;
    }

    /**
     * Internal Getter for DinersClub.
     * Percent fee override applied to Diners Club transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("diners_club")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetDinersClub() {
        return this.dinersClub;
    }

    /**
     * Getter for DinersClub.
     * Percent fee override applied to Diners Club transactions.
     * @return Returns the Double
     */
    public Double getDinersClub() {
        return OptionalNullable.getFrom(dinersClub);
    }

    /**
     * Setter for DinersClub.
     * Percent fee override applied to Diners Club transactions.
     * @param dinersClub Value for Double
     */
    @JsonSetter("diners_club")
    public void setDinersClub(Double dinersClub) {
        this.dinersClub = OptionalNullable.of(dinersClub);
    }

    /**
     * UnSetter for DinersClub.
     * Percent fee override applied to Diners Club transactions.
     */
    public void unsetDinersClub() {
        dinersClub = null;
    }

    /**
     * Internal Getter for UnionPay.
     * Percent fee override applied to UnionPay transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("union_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetUnionPay() {
        return this.unionPay;
    }

    /**
     * Getter for UnionPay.
     * Percent fee override applied to UnionPay transactions.
     * @return Returns the Double
     */
    public Double getUnionPay() {
        return OptionalNullable.getFrom(unionPay);
    }

    /**
     * Setter for UnionPay.
     * Percent fee override applied to UnionPay transactions.
     * @param unionPay Value for Double
     */
    @JsonSetter("union_pay")
    public void setUnionPay(Double unionPay) {
        this.unionPay = OptionalNullable.of(unionPay);
    }

    /**
     * UnSetter for UnionPay.
     * Percent fee override applied to UnionPay transactions.
     */
    public void unsetUnionPay() {
        unionPay = null;
    }

    /**
     * Internal Getter for PrivateLabel.
     * Percent fee override applied to private-label card transactions.
     * @return Returns the Internal Double
     */
    @JsonGetter("private_label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetPrivateLabel() {
        return this.privateLabel;
    }

    /**
     * Getter for PrivateLabel.
     * Percent fee override applied to private-label card transactions.
     * @return Returns the Double
     */
    public Double getPrivateLabel() {
        return OptionalNullable.getFrom(privateLabel);
    }

    /**
     * Setter for PrivateLabel.
     * Percent fee override applied to private-label card transactions.
     * @param privateLabel Value for Double
     */
    @JsonSetter("private_label")
    public void setPrivateLabel(Double privateLabel) {
        this.privateLabel = OptionalNullable.of(privateLabel);
    }

    /**
     * UnSetter for PrivateLabel.
     * Percent fee override applied to private-label card transactions.
     */
    public void unsetPrivateLabel() {
        privateLabel = null;
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
     * Converts this MerchantWebhookCardBrandPercentFees into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookCardBrandPercentFees [" + "visa=" + visa + ", americanExpress="
                + americanExpress + ", mastercard=" + mastercard + ", maestro=" + maestro
                + ", discover=" + discover + ", jcb=" + jcb + ", dinersClub=" + dinersClub
                + ", unionPay=" + unionPay + ", privateLabel=" + privateLabel
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookCardBrandPercentFees.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookCardBrandPercentFees.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.visa = internalGetVisa();
        builder.americanExpress = internalGetAmericanExpress();
        builder.mastercard = internalGetMastercard();
        builder.maestro = internalGetMaestro();
        builder.discover = internalGetDiscover();
        builder.jcb = internalGetJcb();
        builder.dinersClub = internalGetDinersClub();
        builder.unionPay = internalGetUnionPay();
        builder.privateLabel = internalGetPrivateLabel();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookCardBrandPercentFees}.
     */
    public static class Builder {
        private OptionalNullable<Double> visa;
        private OptionalNullable<Double> americanExpress;
        private OptionalNullable<Double> mastercard;
        private OptionalNullable<Double> maestro;
        private OptionalNullable<Double> discover;
        private OptionalNullable<Double> jcb;
        private OptionalNullable<Double> dinersClub;
        private OptionalNullable<Double> unionPay;
        private OptionalNullable<Double> privateLabel;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for visa.
         * @param  visa  Double value for visa.
         * @return Builder
         */
        public Builder visa(Double visa) {
            this.visa = OptionalNullable.of(visa);
            return this;
        }

        /**
         * UnSetter for visa.
         * @return Builder
         */
        public Builder unsetVisa() {
            visa = null;
            return this;
        }

        /**
         * Setter for americanExpress.
         * @param  americanExpress  Double value for americanExpress.
         * @return Builder
         */
        public Builder americanExpress(Double americanExpress) {
            this.americanExpress = OptionalNullable.of(americanExpress);
            return this;
        }

        /**
         * UnSetter for americanExpress.
         * @return Builder
         */
        public Builder unsetAmericanExpress() {
            americanExpress = null;
            return this;
        }

        /**
         * Setter for mastercard.
         * @param  mastercard  Double value for mastercard.
         * @return Builder
         */
        public Builder mastercard(Double mastercard) {
            this.mastercard = OptionalNullable.of(mastercard);
            return this;
        }

        /**
         * UnSetter for mastercard.
         * @return Builder
         */
        public Builder unsetMastercard() {
            mastercard = null;
            return this;
        }

        /**
         * Setter for maestro.
         * @param  maestro  Double value for maestro.
         * @return Builder
         */
        public Builder maestro(Double maestro) {
            this.maestro = OptionalNullable.of(maestro);
            return this;
        }

        /**
         * UnSetter for maestro.
         * @return Builder
         */
        public Builder unsetMaestro() {
            maestro = null;
            return this;
        }

        /**
         * Setter for discover.
         * @param  discover  Double value for discover.
         * @return Builder
         */
        public Builder discover(Double discover) {
            this.discover = OptionalNullable.of(discover);
            return this;
        }

        /**
         * UnSetter for discover.
         * @return Builder
         */
        public Builder unsetDiscover() {
            discover = null;
            return this;
        }

        /**
         * Setter for jcb.
         * @param  jcb  Double value for jcb.
         * @return Builder
         */
        public Builder jcb(Double jcb) {
            this.jcb = OptionalNullable.of(jcb);
            return this;
        }

        /**
         * UnSetter for jcb.
         * @return Builder
         */
        public Builder unsetJcb() {
            jcb = null;
            return this;
        }

        /**
         * Setter for dinersClub.
         * @param  dinersClub  Double value for dinersClub.
         * @return Builder
         */
        public Builder dinersClub(Double dinersClub) {
            this.dinersClub = OptionalNullable.of(dinersClub);
            return this;
        }

        /**
         * UnSetter for dinersClub.
         * @return Builder
         */
        public Builder unsetDinersClub() {
            dinersClub = null;
            return this;
        }

        /**
         * Setter for unionPay.
         * @param  unionPay  Double value for unionPay.
         * @return Builder
         */
        public Builder unionPay(Double unionPay) {
            this.unionPay = OptionalNullable.of(unionPay);
            return this;
        }

        /**
         * UnSetter for unionPay.
         * @return Builder
         */
        public Builder unsetUnionPay() {
            unionPay = null;
            return this;
        }

        /**
         * Setter for privateLabel.
         * @param  privateLabel  Double value for privateLabel.
         * @return Builder
         */
        public Builder privateLabel(Double privateLabel) {
            this.privateLabel = OptionalNullable.of(privateLabel);
            return this;
        }

        /**
         * UnSetter for privateLabel.
         * @return Builder
         */
        public Builder unsetPrivateLabel() {
            privateLabel = null;
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
         * Builds a new {@link MerchantWebhookCardBrandPercentFees} object using the set fields.
         * @return {@link MerchantWebhookCardBrandPercentFees}
         */
        public MerchantWebhookCardBrandPercentFees build() {
            MerchantWebhookCardBrandPercentFees model =
                    new MerchantWebhookCardBrandPercentFees(visa, americanExpress, mastercard,
                            maestro, discover, jcb, dinersClub, unionPay, privateLabel);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
