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
 * This is a model class for CheckoutSupportedBrand type.
 */
public class CheckoutSupportedBrand {
    private CheckoutPaymentType paymentType;
    private String brand;
    private String cardBrand;
    private String qrBrand;
    private String onlineBrand;
    private Boolean dynamicInfo;
    private Boolean supportAuthCapture;
    private Boolean requiresFullName;
    private Boolean requiresCvv;
    private OptionalNullable<List<String>> countriesAllowed;
    private OptionalNullable<List<String>> supportedCurrencies;
    private Boolean cvvAuth;
    private Boolean installmentCapable;
    private Boolean mcpCapable;
    private Boolean mcpOnly;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutSupportedBrand() {
    }

    /**
     * Initialization constructor.
     * @param  paymentType  CheckoutPaymentType value for paymentType.
     * @param  brand  String value for brand.
     * @param  cardBrand  String value for cardBrand.
     * @param  qrBrand  String value for qrBrand.
     * @param  onlineBrand  String value for onlineBrand.
     * @param  dynamicInfo  Boolean value for dynamicInfo.
     * @param  supportAuthCapture  Boolean value for supportAuthCapture.
     * @param  requiresFullName  Boolean value for requiresFullName.
     * @param  requiresCvv  Boolean value for requiresCvv.
     * @param  countriesAllowed  List of String value for countriesAllowed.
     * @param  supportedCurrencies  List of String value for supportedCurrencies.
     * @param  cvvAuth  Boolean value for cvvAuth.
     * @param  installmentCapable  Boolean value for installmentCapable.
     * @param  mcpCapable  Boolean value for mcpCapable.
     * @param  mcpOnly  Boolean value for mcpOnly.
     */
    public CheckoutSupportedBrand(
            CheckoutPaymentType paymentType,
            String brand,
            String cardBrand,
            String qrBrand,
            String onlineBrand,
            Boolean dynamicInfo,
            Boolean supportAuthCapture,
            Boolean requiresFullName,
            Boolean requiresCvv,
            List<String> countriesAllowed,
            List<String> supportedCurrencies,
            Boolean cvvAuth,
            Boolean installmentCapable,
            Boolean mcpCapable,
            Boolean mcpOnly) {
        this.paymentType = paymentType;
        this.brand = brand;
        this.cardBrand = cardBrand;
        this.qrBrand = qrBrand;
        this.onlineBrand = onlineBrand;
        this.dynamicInfo = dynamicInfo;
        this.supportAuthCapture = supportAuthCapture;
        this.requiresFullName = requiresFullName;
        this.requiresCvv = requiresCvv;
        this.countriesAllowed = OptionalNullable.of(countriesAllowed);
        this.supportedCurrencies = OptionalNullable.of(supportedCurrencies);
        this.cvvAuth = cvvAuth;
        this.installmentCapable = installmentCapable;
        this.mcpCapable = mcpCapable;
        this.mcpOnly = mcpOnly;
    }

    /**
     * Initialization constructor.
     * @param  paymentType  CheckoutPaymentType value for paymentType.
     * @param  brand  String value for brand.
     * @param  cardBrand  String value for cardBrand.
     * @param  qrBrand  String value for qrBrand.
     * @param  onlineBrand  String value for onlineBrand.
     * @param  dynamicInfo  Boolean value for dynamicInfo.
     * @param  supportAuthCapture  Boolean value for supportAuthCapture.
     * @param  requiresFullName  Boolean value for requiresFullName.
     * @param  requiresCvv  Boolean value for requiresCvv.
     * @param  countriesAllowed  List of String value for countriesAllowed.
     * @param  supportedCurrencies  List of String value for supportedCurrencies.
     * @param  cvvAuth  Boolean value for cvvAuth.
     * @param  installmentCapable  Boolean value for installmentCapable.
     * @param  mcpCapable  Boolean value for mcpCapable.
     * @param  mcpOnly  Boolean value for mcpOnly.
     */

    protected CheckoutSupportedBrand(CheckoutPaymentType paymentType, String brand,
            String cardBrand, String qrBrand, String onlineBrand, Boolean dynamicInfo,
            Boolean supportAuthCapture, Boolean requiresFullName, Boolean requiresCvv,
            OptionalNullable<List<String>> countriesAllowed,
            OptionalNullable<List<String>> supportedCurrencies, Boolean cvvAuth,
            Boolean installmentCapable, Boolean mcpCapable, Boolean mcpOnly) {
        this.paymentType = paymentType;
        this.brand = brand;
        this.cardBrand = cardBrand;
        this.qrBrand = qrBrand;
        this.onlineBrand = onlineBrand;
        this.dynamicInfo = dynamicInfo;
        this.supportAuthCapture = supportAuthCapture;
        this.requiresFullName = requiresFullName;
        this.requiresCvv = requiresCvv;
        this.countriesAllowed = countriesAllowed;
        this.supportedCurrencies = supportedCurrencies;
        this.cvvAuth = cvvAuth;
        this.installmentCapable = installmentCapable;
        this.mcpCapable = mcpCapable;
        this.mcpOnly = mcpOnly;
    }

    /**
     * Getter for PaymentType.
     * Payment type identifier used throughout the checkout configuration.
     * @return Returns the CheckoutPaymentType
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Payment type identifier used throughout the checkout configuration.
     * @param paymentType Value for CheckoutPaymentType
     */
    @JsonSetter("payment_type")
    public void setPaymentType(CheckoutPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for Brand.
     * Brand identifier for `payment_type`. For `card` and `apple_pay`, one of the common
     * `CardBrand` values (`visa`, `mastercard`, `american_express`, `maestro`, `discover`, `jcb`,
     * `diners_club`, `private_label`, `unionpay`) or an `unmapped_&lt;raw value&gt;` fallback. For
     * `qr_scan`, a QR-CPM brand (e.g. `pay_pay`, `we_chat`, `qq`, `line_pay`, `au_pay`,
     * `alipay_china`). For `qr_merchant`, a QR-MPM brand (e.g. `rakuten_pay_merchant`,
     * `alipay_merchant_qr`, `pay_pay_merchant`, `d_barai_mpm`, `we_chat_mpm`). For `online`, an
     * online-redirect brand (e.g. `alipay_online`, `pay_pay_online`, `we_chat_online`,
     * `d_barai_online`, `kakaopay`). For `konbini`, a convenience-store brand (e.g. `seven_eleven`,
     * `family_mart`, `lawson`). For `paidy` and `bank_transfer`, the payment type's own identifier.
     * The full brand catalogue is large and gateway-dependent — treat this as an open string, not a
     * fixed set.
     * @return Returns the String
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * Brand identifier for `payment_type`. For `card` and `apple_pay`, one of the common
     * `CardBrand` values (`visa`, `mastercard`, `american_express`, `maestro`, `discover`, `jcb`,
     * `diners_club`, `private_label`, `unionpay`) or an `unmapped_&lt;raw value&gt;` fallback. For
     * `qr_scan`, a QR-CPM brand (e.g. `pay_pay`, `we_chat`, `qq`, `line_pay`, `au_pay`,
     * `alipay_china`). For `qr_merchant`, a QR-MPM brand (e.g. `rakuten_pay_merchant`,
     * `alipay_merchant_qr`, `pay_pay_merchant`, `d_barai_mpm`, `we_chat_mpm`). For `online`, an
     * online-redirect brand (e.g. `alipay_online`, `pay_pay_online`, `we_chat_online`,
     * `d_barai_online`, `kakaopay`). For `konbini`, a convenience-store brand (e.g. `seven_eleven`,
     * `family_mart`, `lawson`). For `paidy` and `bank_transfer`, the payment type's own identifier.
     * The full brand catalogue is large and gateway-dependent — treat this as an open string, not a
     * fixed set.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for CardBrand.
     * Legacy alias of `brand`. Present only when `payment_type` is `card` or `apple_pay`.
     * @return Returns the String
     */
    @JsonGetter("card_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Setter for CardBrand.
     * Legacy alias of `brand`. Present only when `payment_type` is `card` or `apple_pay`.
     * @param cardBrand Value for String
     */
    @JsonSetter("card_brand")
    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    /**
     * Getter for QrBrand.
     * Legacy alias of `brand`. Present only when `payment_type` is `qr_merchant`.
     * @return Returns the String
     */
    @JsonGetter("qr_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQrBrand() {
        return qrBrand;
    }

    /**
     * Setter for QrBrand.
     * Legacy alias of `brand`. Present only when `payment_type` is `qr_merchant`.
     * @param qrBrand Value for String
     */
    @JsonSetter("qr_brand")
    public void setQrBrand(String qrBrand) {
        this.qrBrand = qrBrand;
    }

    /**
     * Getter for OnlineBrand.
     * Legacy alias of `brand`. Present only when `payment_type` is `online`.
     * @return Returns the String
     */
    @JsonGetter("online_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOnlineBrand() {
        return onlineBrand;
    }

    /**
     * Setter for OnlineBrand.
     * Legacy alias of `brand`. Present only when `payment_type` is `online`.
     * @param onlineBrand Value for String
     */
    @JsonSetter("online_brand")
    public void setOnlineBrand(String onlineBrand) {
        this.onlineBrand = onlineBrand;
    }

    /**
     * Getter for DynamicInfo.
     * Whether the brand's supported feature set is resolved dynamically.
     * @return Returns the Boolean
     */
    @JsonGetter("dynamic_info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDynamicInfo() {
        return dynamicInfo;
    }

    /**
     * Setter for DynamicInfo.
     * Whether the brand's supported feature set is resolved dynamically.
     * @param dynamicInfo Value for Boolean
     */
    @JsonSetter("dynamic_info")
    public void setDynamicInfo(Boolean dynamicInfo) {
        this.dynamicInfo = dynamicInfo;
    }

    /**
     * Getter for SupportAuthCapture.
     * Whether the brand supports separate authorization and capture.
     * @return Returns the Boolean
     */
    @JsonGetter("support_auth_capture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSupportAuthCapture() {
        return supportAuthCapture;
    }

    /**
     * Setter for SupportAuthCapture.
     * Whether the brand supports separate authorization and capture.
     * @param supportAuthCapture Value for Boolean
     */
    @JsonSetter("support_auth_capture")
    public void setSupportAuthCapture(Boolean supportAuthCapture) {
        this.supportAuthCapture = supportAuthCapture;
    }

    /**
     * Getter for RequiresFullName.
     * Whether the brand requires the cardholder's full name.
     * @return Returns the Boolean
     */
    @JsonGetter("requires_full_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequiresFullName() {
        return requiresFullName;
    }

    /**
     * Setter for RequiresFullName.
     * Whether the brand requires the cardholder's full name.
     * @param requiresFullName Value for Boolean
     */
    @JsonSetter("requires_full_name")
    public void setRequiresFullName(Boolean requiresFullName) {
        this.requiresFullName = requiresFullName;
    }

    /**
     * Getter for RequiresCvv.
     * Whether the brand requires a CVV.
     * @return Returns the Boolean
     */
    @JsonGetter("requires_cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequiresCvv() {
        return requiresCvv;
    }

    /**
     * Setter for RequiresCvv.
     * Whether the brand requires a CVV.
     * @param requiresCvv Value for Boolean
     */
    @JsonSetter("requires_cvv")
    public void setRequiresCvv(Boolean requiresCvv) {
        this.requiresCvv = requiresCvv;
    }

    /**
     * Internal Getter for CountriesAllowed.
     * ISO 3166-1 alpha-2 country codes allowed for this brand. `null` when unrestricted.
     * @return Returns the Internal List of String
     */
    @JsonGetter("countries_allowed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetCountriesAllowed() {
        return this.countriesAllowed;
    }

    /**
     * Getter for CountriesAllowed.
     * ISO 3166-1 alpha-2 country codes allowed for this brand. `null` when unrestricted.
     * @return Returns the List of String
     */
    public List<String> getCountriesAllowed() {
        return OptionalNullable.getFrom(countriesAllowed);
    }

    /**
     * Setter for CountriesAllowed.
     * ISO 3166-1 alpha-2 country codes allowed for this brand. `null` when unrestricted.
     * @param countriesAllowed Value for List of String
     */
    @JsonSetter("countries_allowed")
    public void setCountriesAllowed(List<String> countriesAllowed) {
        this.countriesAllowed = OptionalNullable.of(countriesAllowed);
    }

    /**
     * UnSetter for CountriesAllowed.
     * ISO 3166-1 alpha-2 country codes allowed for this brand. `null` when unrestricted.
     */
    public void unsetCountriesAllowed() {
        countriesAllowed = null;
    }

    /**
     * Internal Getter for SupportedCurrencies.
     * ISO-4217 currency codes supported by this brand. `null` when unrestricted.
     * @return Returns the Internal List of String
     */
    @JsonGetter("supported_currencies")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetSupportedCurrencies() {
        return this.supportedCurrencies;
    }

    /**
     * Getter for SupportedCurrencies.
     * ISO-4217 currency codes supported by this brand. `null` when unrestricted.
     * @return Returns the List of String
     */
    public List<String> getSupportedCurrencies() {
        return OptionalNullable.getFrom(supportedCurrencies);
    }

    /**
     * Setter for SupportedCurrencies.
     * ISO-4217 currency codes supported by this brand. `null` when unrestricted.
     * @param supportedCurrencies Value for List of String
     */
    @JsonSetter("supported_currencies")
    public void setSupportedCurrencies(List<String> supportedCurrencies) {
        this.supportedCurrencies = OptionalNullable.of(supportedCurrencies);
    }

    /**
     * UnSetter for SupportedCurrencies.
     * ISO-4217 currency codes supported by this brand. `null` when unrestricted.
     */
    public void unsetSupportedCurrencies() {
        supportedCurrencies = null;
    }

    /**
     * Getter for CvvAuth.
     * Whether this brand supports CVV-only authorization.
     * @return Returns the Boolean
     */
    @JsonGetter("cvv_auth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCvvAuth() {
        return cvvAuth;
    }

    /**
     * Setter for CvvAuth.
     * Whether this brand supports CVV-only authorization.
     * @param cvvAuth Value for Boolean
     */
    @JsonSetter("cvv_auth")
    public void setCvvAuth(Boolean cvvAuth) {
        this.cvvAuth = cvvAuth;
    }

    /**
     * Getter for InstallmentCapable.
     * Whether this brand supports installment plans.
     * @return Returns the Boolean
     */
    @JsonGetter("installment_capable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInstallmentCapable() {
        return installmentCapable;
    }

    /**
     * Setter for InstallmentCapable.
     * Whether this brand supports installment plans.
     * @param installmentCapable Value for Boolean
     */
    @JsonSetter("installment_capable")
    public void setInstallmentCapable(Boolean installmentCapable) {
        this.installmentCapable = installmentCapable;
    }

    /**
     * Getter for McpCapable.
     * Whether this brand supports multi-currency pricing.
     * @return Returns the Boolean
     */
    @JsonGetter("mcp_capable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMcpCapable() {
        return mcpCapable;
    }

    /**
     * Setter for McpCapable.
     * Whether this brand supports multi-currency pricing.
     * @param mcpCapable Value for Boolean
     */
    @JsonSetter("mcp_capable")
    public void setMcpCapable(Boolean mcpCapable) {
        this.mcpCapable = mcpCapable;
    }

    /**
     * Getter for McpOnly.
     * Whether this brand is only available through multi-currency pricing.
     * @return Returns the Boolean
     */
    @JsonGetter("mcp_only")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMcpOnly() {
        return mcpOnly;
    }

    /**
     * Setter for McpOnly.
     * Whether this brand is only available through multi-currency pricing.
     * @param mcpOnly Value for Boolean
     */
    @JsonSetter("mcp_only")
    public void setMcpOnly(Boolean mcpOnly) {
        this.mcpOnly = mcpOnly;
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
     * Converts this CheckoutSupportedBrand into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutSupportedBrand [" + "paymentType=" + paymentType + ", brand=" + brand
                + ", cardBrand=" + cardBrand + ", qrBrand=" + qrBrand + ", onlineBrand="
                + onlineBrand + ", dynamicInfo=" + dynamicInfo + ", supportAuthCapture="
                + supportAuthCapture + ", requiresFullName=" + requiresFullName + ", requiresCvv="
                + requiresCvv + ", countriesAllowed=" + countriesAllowed + ", supportedCurrencies="
                + supportedCurrencies + ", cvvAuth=" + cvvAuth + ", installmentCapable="
                + installmentCapable + ", mcpCapable=" + mcpCapable + ", mcpOnly=" + mcpOnly
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutSupportedBrand.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutSupportedBrand.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .paymentType(getPaymentType())
                .brand(getBrand())
                .cardBrand(getCardBrand())
                .qrBrand(getQrBrand())
                .onlineBrand(getOnlineBrand())
                .dynamicInfo(getDynamicInfo())
                .supportAuthCapture(getSupportAuthCapture())
                .requiresFullName(getRequiresFullName())
                .requiresCvv(getRequiresCvv())
                .cvvAuth(getCvvAuth())
                .installmentCapable(getInstallmentCapable())
                .mcpCapable(getMcpCapable())
                .mcpOnly(getMcpOnly());
        builder.countriesAllowed = internalGetCountriesAllowed();
        builder.supportedCurrencies = internalGetSupportedCurrencies();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutSupportedBrand}.
     */
    public static class Builder {
        private CheckoutPaymentType paymentType;
        private String brand;
        private String cardBrand;
        private String qrBrand;
        private String onlineBrand;
        private Boolean dynamicInfo;
        private Boolean supportAuthCapture;
        private Boolean requiresFullName;
        private Boolean requiresCvv;
        private OptionalNullable<List<String>> countriesAllowed;
        private OptionalNullable<List<String>> supportedCurrencies;
        private Boolean cvvAuth;
        private Boolean installmentCapable;
        private Boolean mcpCapable;
        private Boolean mcpOnly;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for paymentType.
         * @param  paymentType  CheckoutPaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(CheckoutPaymentType paymentType) {
            this.paymentType = paymentType;
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
         * Setter for cardBrand.
         * @param  cardBrand  String value for cardBrand.
         * @return Builder
         */
        public Builder cardBrand(String cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        /**
         * Setter for qrBrand.
         * @param  qrBrand  String value for qrBrand.
         * @return Builder
         */
        public Builder qrBrand(String qrBrand) {
            this.qrBrand = qrBrand;
            return this;
        }

        /**
         * Setter for onlineBrand.
         * @param  onlineBrand  String value for onlineBrand.
         * @return Builder
         */
        public Builder onlineBrand(String onlineBrand) {
            this.onlineBrand = onlineBrand;
            return this;
        }

        /**
         * Setter for dynamicInfo.
         * @param  dynamicInfo  Boolean value for dynamicInfo.
         * @return Builder
         */
        public Builder dynamicInfo(Boolean dynamicInfo) {
            this.dynamicInfo = dynamicInfo;
            return this;
        }

        /**
         * Setter for supportAuthCapture.
         * @param  supportAuthCapture  Boolean value for supportAuthCapture.
         * @return Builder
         */
        public Builder supportAuthCapture(Boolean supportAuthCapture) {
            this.supportAuthCapture = supportAuthCapture;
            return this;
        }

        /**
         * Setter for requiresFullName.
         * @param  requiresFullName  Boolean value for requiresFullName.
         * @return Builder
         */
        public Builder requiresFullName(Boolean requiresFullName) {
            this.requiresFullName = requiresFullName;
            return this;
        }

        /**
         * Setter for requiresCvv.
         * @param  requiresCvv  Boolean value for requiresCvv.
         * @return Builder
         */
        public Builder requiresCvv(Boolean requiresCvv) {
            this.requiresCvv = requiresCvv;
            return this;
        }

        /**
         * Setter for countriesAllowed.
         * @param  countriesAllowed  List of String value for countriesAllowed.
         * @return Builder
         */
        public Builder countriesAllowed(List<String> countriesAllowed) {
            this.countriesAllowed = OptionalNullable.of(countriesAllowed);
            return this;
        }

        /**
         * UnSetter for countriesAllowed.
         * @return Builder
         */
        public Builder unsetCountriesAllowed() {
            countriesAllowed = null;
            return this;
        }

        /**
         * Setter for supportedCurrencies.
         * @param  supportedCurrencies  List of String value for supportedCurrencies.
         * @return Builder
         */
        public Builder supportedCurrencies(List<String> supportedCurrencies) {
            this.supportedCurrencies = OptionalNullable.of(supportedCurrencies);
            return this;
        }

        /**
         * UnSetter for supportedCurrencies.
         * @return Builder
         */
        public Builder unsetSupportedCurrencies() {
            supportedCurrencies = null;
            return this;
        }

        /**
         * Setter for cvvAuth.
         * @param  cvvAuth  Boolean value for cvvAuth.
         * @return Builder
         */
        public Builder cvvAuth(Boolean cvvAuth) {
            this.cvvAuth = cvvAuth;
            return this;
        }

        /**
         * Setter for installmentCapable.
         * @param  installmentCapable  Boolean value for installmentCapable.
         * @return Builder
         */
        public Builder installmentCapable(Boolean installmentCapable) {
            this.installmentCapable = installmentCapable;
            return this;
        }

        /**
         * Setter for mcpCapable.
         * @param  mcpCapable  Boolean value for mcpCapable.
         * @return Builder
         */
        public Builder mcpCapable(Boolean mcpCapable) {
            this.mcpCapable = mcpCapable;
            return this;
        }

        /**
         * Setter for mcpOnly.
         * @param  mcpOnly  Boolean value for mcpOnly.
         * @return Builder
         */
        public Builder mcpOnly(Boolean mcpOnly) {
            this.mcpOnly = mcpOnly;
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
         * Builds a new {@link CheckoutSupportedBrand} object using the set fields.
         * @return {@link CheckoutSupportedBrand}
         */
        public CheckoutSupportedBrand build() {
            CheckoutSupportedBrand model =
                    new CheckoutSupportedBrand(paymentType, brand, cardBrand, qrBrand, onlineBrand,
                            dynamicInfo, supportAuthCapture, requiresFullName, requiresCvv,
                            countriesAllowed, supportedCurrencies, cvvAuth, installmentCapable,
                            mcpCapable, mcpOnly);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
