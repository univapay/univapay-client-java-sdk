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
 * This is a model class for CheckoutInfo type.
 */
public class CheckoutInfo {
    private CheckoutMode mode;
    private CheckoutRecurringTokenPrivilege recurringTokenPrivilege;
    private String name;
    private CheckoutCardConfiguration cardConfiguration;
    private CheckoutSubscriptionConfiguration subscriptionConfiguration;
    private CheckoutInstallmentsConfiguration installmentsConfiguration;
    private CheckoutSubscriptionPlanConfiguration subscriptionPlanConfiguration;
    private CheckoutEcConfiguration checkoutConfiguration;
    private CheckoutQrScanConfiguration qrScanConfiguration;
    private CheckoutConvenienceConfiguration convenienceConfiguration;
    private CheckoutPaidyConfiguration paidyConfiguration;
    private OptionalNullable<String> paidyPublicKey;
    private OptionalNullable<String> logoImage;
    private CheckoutTheme theme;
    private RecurringCvvConfirmation recurringCardChargeCvvConfirmation;
    private CheckoutOnlineConfiguration onlineConfiguration;
    private CheckoutBankTransferConfiguration bankTransferConfiguration;
    private List<CheckoutSupportedBrand> supportedBrands;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutInfo() {
    }

    /**
     * Initialization constructor.
     * @param  mode  CheckoutMode value for mode.
     * @param  recurringTokenPrivilege  CheckoutRecurringTokenPrivilege value for
     *         recurringTokenPrivilege.
     * @param  name  String value for name.
     * @param  cardConfiguration  CheckoutCardConfiguration value for cardConfiguration.
     * @param  subscriptionConfiguration  CheckoutSubscriptionConfiguration value for
     *         subscriptionConfiguration.
     * @param  installmentsConfiguration  CheckoutInstallmentsConfiguration value for
     *         installmentsConfiguration.
     * @param  subscriptionPlanConfiguration  CheckoutSubscriptionPlanConfiguration value for
     *         subscriptionPlanConfiguration.
     * @param  checkoutConfiguration  CheckoutEcConfiguration value for checkoutConfiguration.
     * @param  qrScanConfiguration  CheckoutQrScanConfiguration value for qrScanConfiguration.
     * @param  convenienceConfiguration  CheckoutConvenienceConfiguration value for
     *         convenienceConfiguration.
     * @param  paidyConfiguration  CheckoutPaidyConfiguration value for paidyConfiguration.
     * @param  paidyPublicKey  String value for paidyPublicKey.
     * @param  logoImage  String value for logoImage.
     * @param  theme  CheckoutTheme value for theme.
     * @param  recurringCardChargeCvvConfirmation  RecurringCvvConfirmation value for
     *         recurringCardChargeCvvConfirmation.
     * @param  onlineConfiguration  CheckoutOnlineConfiguration value for onlineConfiguration.
     * @param  bankTransferConfiguration  CheckoutBankTransferConfiguration value for
     *         bankTransferConfiguration.
     * @param  supportedBrands  List of CheckoutSupportedBrand value for supportedBrands.
     */
    public CheckoutInfo(
            CheckoutMode mode,
            CheckoutRecurringTokenPrivilege recurringTokenPrivilege,
            String name,
            CheckoutCardConfiguration cardConfiguration,
            CheckoutSubscriptionConfiguration subscriptionConfiguration,
            CheckoutInstallmentsConfiguration installmentsConfiguration,
            CheckoutSubscriptionPlanConfiguration subscriptionPlanConfiguration,
            CheckoutEcConfiguration checkoutConfiguration,
            CheckoutQrScanConfiguration qrScanConfiguration,
            CheckoutConvenienceConfiguration convenienceConfiguration,
            CheckoutPaidyConfiguration paidyConfiguration,
            String paidyPublicKey,
            String logoImage,
            CheckoutTheme theme,
            RecurringCvvConfirmation recurringCardChargeCvvConfirmation,
            CheckoutOnlineConfiguration onlineConfiguration,
            CheckoutBankTransferConfiguration bankTransferConfiguration,
            List<CheckoutSupportedBrand> supportedBrands) {
        this.mode = mode;
        this.recurringTokenPrivilege = recurringTokenPrivilege;
        this.name = name;
        this.cardConfiguration = cardConfiguration;
        this.subscriptionConfiguration = subscriptionConfiguration;
        this.installmentsConfiguration = installmentsConfiguration;
        this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
        this.checkoutConfiguration = checkoutConfiguration;
        this.qrScanConfiguration = qrScanConfiguration;
        this.convenienceConfiguration = convenienceConfiguration;
        this.paidyConfiguration = paidyConfiguration;
        this.paidyPublicKey = OptionalNullable.of(paidyPublicKey);
        this.logoImage = OptionalNullable.of(logoImage);
        this.theme = theme;
        this.recurringCardChargeCvvConfirmation = recurringCardChargeCvvConfirmation;
        this.onlineConfiguration = onlineConfiguration;
        this.bankTransferConfiguration = bankTransferConfiguration;
        this.supportedBrands = supportedBrands;
    }

    /**
     * Initialization constructor.
     * @param  mode  CheckoutMode value for mode.
     * @param  recurringTokenPrivilege  CheckoutRecurringTokenPrivilege value for
     *         recurringTokenPrivilege.
     * @param  name  String value for name.
     * @param  cardConfiguration  CheckoutCardConfiguration value for cardConfiguration.
     * @param  subscriptionConfiguration  CheckoutSubscriptionConfiguration value for
     *         subscriptionConfiguration.
     * @param  installmentsConfiguration  CheckoutInstallmentsConfiguration value for
     *         installmentsConfiguration.
     * @param  subscriptionPlanConfiguration  CheckoutSubscriptionPlanConfiguration value for
     *         subscriptionPlanConfiguration.
     * @param  checkoutConfiguration  CheckoutEcConfiguration value for checkoutConfiguration.
     * @param  qrScanConfiguration  CheckoutQrScanConfiguration value for qrScanConfiguration.
     * @param  convenienceConfiguration  CheckoutConvenienceConfiguration value for
     *         convenienceConfiguration.
     * @param  paidyConfiguration  CheckoutPaidyConfiguration value for paidyConfiguration.
     * @param  paidyPublicKey  String value for paidyPublicKey.
     * @param  logoImage  String value for logoImage.
     * @param  theme  CheckoutTheme value for theme.
     * @param  recurringCardChargeCvvConfirmation  RecurringCvvConfirmation value for
     *         recurringCardChargeCvvConfirmation.
     * @param  onlineConfiguration  CheckoutOnlineConfiguration value for onlineConfiguration.
     * @param  bankTransferConfiguration  CheckoutBankTransferConfiguration value for
     *         bankTransferConfiguration.
     * @param  supportedBrands  List of CheckoutSupportedBrand value for supportedBrands.
     */

    protected CheckoutInfo(CheckoutMode mode,
            CheckoutRecurringTokenPrivilege recurringTokenPrivilege, String name,
            CheckoutCardConfiguration cardConfiguration,
            CheckoutSubscriptionConfiguration subscriptionConfiguration,
            CheckoutInstallmentsConfiguration installmentsConfiguration,
            CheckoutSubscriptionPlanConfiguration subscriptionPlanConfiguration,
            CheckoutEcConfiguration checkoutConfiguration,
            CheckoutQrScanConfiguration qrScanConfiguration,
            CheckoutConvenienceConfiguration convenienceConfiguration,
            CheckoutPaidyConfiguration paidyConfiguration, OptionalNullable<String> paidyPublicKey,
            OptionalNullable<String> logoImage, CheckoutTheme theme,
            RecurringCvvConfirmation recurringCardChargeCvvConfirmation,
            CheckoutOnlineConfiguration onlineConfiguration,
            CheckoutBankTransferConfiguration bankTransferConfiguration,
            List<CheckoutSupportedBrand> supportedBrands) {
        this.mode = mode;
        this.recurringTokenPrivilege = recurringTokenPrivilege;
        this.name = name;
        this.cardConfiguration = cardConfiguration;
        this.subscriptionConfiguration = subscriptionConfiguration;
        this.installmentsConfiguration = installmentsConfiguration;
        this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
        this.checkoutConfiguration = checkoutConfiguration;
        this.qrScanConfiguration = qrScanConfiguration;
        this.convenienceConfiguration = convenienceConfiguration;
        this.paidyConfiguration = paidyConfiguration;
        this.paidyPublicKey = paidyPublicKey;
        this.logoImage = logoImage;
        this.theme = theme;
        this.recurringCardChargeCvvConfirmation = recurringCardChargeCvvConfirmation;
        this.onlineConfiguration = onlineConfiguration;
        this.bankTransferConfiguration = bankTransferConfiguration;
        this.supportedBrands = supportedBrands;
    }

    /**
     * Getter for Mode.
     * Store processing mode reflected in the checkout configuration: `live` and `test` reflect the
     * credential used to authenticate, while `live_test` is reserved for privileged callers testing
     * against live-mode data.
     * @return Returns the CheckoutMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutMode getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * Store processing mode reflected in the checkout configuration: `live` and `test` reflect the
     * credential used to authenticate, while `live_test` is reserved for privileged callers testing
     * against live-mode data.
     * @param mode Value for CheckoutMode
     */
    @JsonSetter("mode")
    public void setMode(CheckoutMode mode) {
        this.mode = mode;
    }

    /**
     * Getter for RecurringTokenPrivilege.
     * Level of recurring-charge privilege granted to transaction tokens created under this store:
     * `none` disallows recurring use, `bounded` allows a limited number of recurring charges, and
     * `infinite` allows unlimited recurring charges.
     * @return Returns the CheckoutRecurringTokenPrivilege
     */
    @JsonGetter("recurring_token_privilege")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutRecurringTokenPrivilege getRecurringTokenPrivilege() {
        return recurringTokenPrivilege;
    }

    /**
     * Setter for RecurringTokenPrivilege.
     * Level of recurring-charge privilege granted to transaction tokens created under this store:
     * `none` disallows recurring use, `bounded` allows a limited number of recurring charges, and
     * `infinite` allows unlimited recurring charges.
     * @param recurringTokenPrivilege Value for CheckoutRecurringTokenPrivilege
     */
    @JsonSetter("recurring_token_privilege")
    public void setRecurringTokenPrivilege(CheckoutRecurringTokenPrivilege recurringTokenPrivilege) {
        this.recurringTokenPrivilege = recurringTokenPrivilege;
    }

    /**
     * Getter for Name.
     * Store display name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Store display name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CardConfiguration.
     * Card payment settings applied to checkout.
     * @return Returns the CheckoutCardConfiguration
     */
    @JsonGetter("card_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutCardConfiguration getCardConfiguration() {
        return cardConfiguration;
    }

    /**
     * Setter for CardConfiguration.
     * Card payment settings applied to checkout.
     * @param cardConfiguration Value for CheckoutCardConfiguration
     */
    @JsonSetter("card_configuration")
    public void setCardConfiguration(CheckoutCardConfiguration cardConfiguration) {
        this.cardConfiguration = cardConfiguration;
    }

    /**
     * Getter for SubscriptionConfiguration.
     * Univapay-hosted subscription feature toggle.
     * @return Returns the CheckoutSubscriptionConfiguration
     */
    @JsonGetter("subscription_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutSubscriptionConfiguration getSubscriptionConfiguration() {
        return subscriptionConfiguration;
    }

    /**
     * Setter for SubscriptionConfiguration.
     * Univapay-hosted subscription feature toggle.
     * @param subscriptionConfiguration Value for CheckoutSubscriptionConfiguration
     */
    @JsonSetter("subscription_configuration")
    public void setSubscriptionConfiguration(CheckoutSubscriptionConfiguration subscriptionConfiguration) {
        this.subscriptionConfiguration = subscriptionConfiguration;
    }

    /**
     * Getter for InstallmentsConfiguration.
     * Installment plan configuration applied to checkout.
     * @return Returns the CheckoutInstallmentsConfiguration
     */
    @JsonGetter("installments_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutInstallmentsConfiguration getInstallmentsConfiguration() {
        return installmentsConfiguration;
    }

    /**
     * Setter for InstallmentsConfiguration.
     * Installment plan configuration applied to checkout.
     * @param installmentsConfiguration Value for CheckoutInstallmentsConfiguration
     */
    @JsonSetter("installments_configuration")
    public void setInstallmentsConfiguration(CheckoutInstallmentsConfiguration installmentsConfiguration) {
        this.installmentsConfiguration = installmentsConfiguration;
    }

    /**
     * Getter for SubscriptionPlanConfiguration.
     * Univapay-side subscription plan configuration applied to checkout.
     * @return Returns the CheckoutSubscriptionPlanConfiguration
     */
    @JsonGetter("subscription_plan_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutSubscriptionPlanConfiguration getSubscriptionPlanConfiguration() {
        return subscriptionPlanConfiguration;
    }

    /**
     * Setter for SubscriptionPlanConfiguration.
     * Univapay-side subscription plan configuration applied to checkout.
     * @param subscriptionPlanConfiguration Value for CheckoutSubscriptionPlanConfiguration
     */
    @JsonSetter("subscription_plan_configuration")
    public void setSubscriptionPlanConfiguration(CheckoutSubscriptionPlanConfiguration subscriptionPlanConfiguration) {
        this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
    }

    /**
     * Getter for CheckoutConfiguration.
     * EC checkout feature toggles for hosted email receipts and product line items.
     * @return Returns the CheckoutEcConfiguration
     */
    @JsonGetter("checkout_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutEcConfiguration getCheckoutConfiguration() {
        return checkoutConfiguration;
    }

    /**
     * Setter for CheckoutConfiguration.
     * EC checkout feature toggles for hosted email receipts and product line items.
     * @param checkoutConfiguration Value for CheckoutEcConfiguration
     */
    @JsonSetter("checkout_configuration")
    public void setCheckoutConfiguration(CheckoutEcConfiguration checkoutConfiguration) {
        this.checkoutConfiguration = checkoutConfiguration;
    }

    /**
     * Getter for QrScanConfiguration.
     * QR-scan (CPM) payment settings applied to checkout.
     * @return Returns the CheckoutQrScanConfiguration
     */
    @JsonGetter("qr_scan_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutQrScanConfiguration getQrScanConfiguration() {
        return qrScanConfiguration;
    }

    /**
     * Setter for QrScanConfiguration.
     * QR-scan (CPM) payment settings applied to checkout.
     * @param qrScanConfiguration Value for CheckoutQrScanConfiguration
     */
    @JsonSetter("qr_scan_configuration")
    public void setQrScanConfiguration(CheckoutQrScanConfiguration qrScanConfiguration) {
        this.qrScanConfiguration = qrScanConfiguration;
    }

    /**
     * Getter for ConvenienceConfiguration.
     * Convenience-store (konbini) payment settings applied to checkout.
     * @return Returns the CheckoutConvenienceConfiguration
     */
    @JsonGetter("convenience_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutConvenienceConfiguration getConvenienceConfiguration() {
        return convenienceConfiguration;
    }

    /**
     * Setter for ConvenienceConfiguration.
     * Convenience-store (konbini) payment settings applied to checkout.
     * @param convenienceConfiguration Value for CheckoutConvenienceConfiguration
     */
    @JsonSetter("convenience_configuration")
    public void setConvenienceConfiguration(CheckoutConvenienceConfiguration convenienceConfiguration) {
        this.convenienceConfiguration = convenienceConfiguration;
    }

    /**
     * Getter for PaidyConfiguration.
     * Paidy payment feature toggle.
     * @return Returns the CheckoutPaidyConfiguration
     */
    @JsonGetter("paidy_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutPaidyConfiguration getPaidyConfiguration() {
        return paidyConfiguration;
    }

    /**
     * Setter for PaidyConfiguration.
     * Paidy payment feature toggle.
     * @param paidyConfiguration Value for CheckoutPaidyConfiguration
     */
    @JsonSetter("paidy_configuration")
    public void setPaidyConfiguration(CheckoutPaidyConfiguration paidyConfiguration) {
        this.paidyConfiguration = paidyConfiguration;
    }

    /**
     * Internal Getter for PaidyPublicKey.
     * Public key used to initialize the Paidy widget. `null` when Paidy is not configured for this
     * store.
     * @return Returns the Internal String
     */
    @JsonGetter("paidy_public_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaidyPublicKey() {
        return this.paidyPublicKey;
    }

    /**
     * Getter for PaidyPublicKey.
     * Public key used to initialize the Paidy widget. `null` when Paidy is not configured for this
     * store.
     * @return Returns the String
     */
    public String getPaidyPublicKey() {
        return OptionalNullable.getFrom(paidyPublicKey);
    }

    /**
     * Setter for PaidyPublicKey.
     * Public key used to initialize the Paidy widget. `null` when Paidy is not configured for this
     * store.
     * @param paidyPublicKey Value for String
     */
    @JsonSetter("paidy_public_key")
    public void setPaidyPublicKey(String paidyPublicKey) {
        this.paidyPublicKey = OptionalNullable.of(paidyPublicKey);
    }

    /**
     * UnSetter for PaidyPublicKey.
     * Public key used to initialize the Paidy widget. `null` when Paidy is not configured for this
     * store.
     */
    public void unsetPaidyPublicKey() {
        paidyPublicKey = null;
    }

    /**
     * Internal Getter for LogoImage.
     * URL of the store's checkout logo image. `null` when no logo is configured. Note: this
     * response field is `logo_image`, but the corresponding store-configuration update field is
     * `logo_url` — the two names do not round-trip automatically.
     * @return Returns the Internal String
     */
    @JsonGetter("logo_image")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLogoImage() {
        return this.logoImage;
    }

    /**
     * Getter for LogoImage.
     * URL of the store's checkout logo image. `null` when no logo is configured. Note: this
     * response field is `logo_image`, but the corresponding store-configuration update field is
     * `logo_url` — the two names do not round-trip automatically.
     * @return Returns the String
     */
    public String getLogoImage() {
        return OptionalNullable.getFrom(logoImage);
    }

    /**
     * Setter for LogoImage.
     * URL of the store's checkout logo image. `null` when no logo is configured. Note: this
     * response field is `logo_image`, but the corresponding store-configuration update field is
     * `logo_url` — the two names do not round-trip automatically.
     * @param logoImage Value for String
     */
    @JsonSetter("logo_image")
    public void setLogoImage(String logoImage) {
        this.logoImage = OptionalNullable.of(logoImage);
    }

    /**
     * UnSetter for LogoImage.
     * URL of the store's checkout logo image. `null` when no logo is configured. Note: this
     * response field is `logo_image`, but the corresponding store-configuration update field is
     * `logo_url` — the two names do not round-trip automatically.
     */
    public void unsetLogoImage() {
        logoImage = null;
    }

    /**
     * Getter for Theme.
     * Widget theme applied to checkout.
     * @return Returns the CheckoutTheme
     */
    @JsonGetter("theme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutTheme getTheme() {
        return theme;
    }

    /**
     * Setter for Theme.
     * Widget theme applied to checkout.
     * @param theme Value for CheckoutTheme
     */
    @JsonSetter("theme")
    public void setTheme(CheckoutTheme theme) {
        this.theme = theme;
    }

    /**
     * Getter for RecurringCardChargeCvvConfirmation.
     * CVV re-confirmation policy applied to recurring card charges (subscriptions and tokens with
     * recurring privilege).
     * @return Returns the RecurringCvvConfirmation
     */
    @JsonGetter("recurring_card_charge_cvv_confirmation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RecurringCvvConfirmation getRecurringCardChargeCvvConfirmation() {
        return recurringCardChargeCvvConfirmation;
    }

    /**
     * Setter for RecurringCardChargeCvvConfirmation.
     * CVV re-confirmation policy applied to recurring card charges (subscriptions and tokens with
     * recurring privilege).
     * @param recurringCardChargeCvvConfirmation Value for RecurringCvvConfirmation
     */
    @JsonSetter("recurring_card_charge_cvv_confirmation")
    public void setRecurringCardChargeCvvConfirmation(RecurringCvvConfirmation recurringCardChargeCvvConfirmation) {
        this.recurringCardChargeCvvConfirmation = recurringCardChargeCvvConfirmation;
    }

    /**
     * Getter for OnlineConfiguration.
     * Online redirect/wallet payment feature toggle.
     * @return Returns the CheckoutOnlineConfiguration
     */
    @JsonGetter("online_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutOnlineConfiguration getOnlineConfiguration() {
        return onlineConfiguration;
    }

    /**
     * Setter for OnlineConfiguration.
     * Online redirect/wallet payment feature toggle.
     * @param onlineConfiguration Value for CheckoutOnlineConfiguration
     */
    @JsonSetter("online_configuration")
    public void setOnlineConfiguration(CheckoutOnlineConfiguration onlineConfiguration) {
        this.onlineConfiguration = onlineConfiguration;
    }

    /**
     * Getter for BankTransferConfiguration.
     * Bank transfer (振込) payment settings applied to checkout.
     * @return Returns the CheckoutBankTransferConfiguration
     */
    @JsonGetter("bank_transfer_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutBankTransferConfiguration getBankTransferConfiguration() {
        return bankTransferConfiguration;
    }

    /**
     * Setter for BankTransferConfiguration.
     * Bank transfer (振込) payment settings applied to checkout.
     * @param bankTransferConfiguration Value for CheckoutBankTransferConfiguration
     */
    @JsonSetter("bank_transfer_configuration")
    public void setBankTransferConfiguration(CheckoutBankTransferConfiguration bankTransferConfiguration) {
        this.bankTransferConfiguration = bankTransferConfiguration;
    }

    /**
     * Getter for SupportedBrands.
     * Feature support and capability flags for every payment-type / brand combination the store can
     * accept.
     * @return Returns the List of CheckoutSupportedBrand
     */
    @JsonGetter("supported_brands")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CheckoutSupportedBrand> getSupportedBrands() {
        return supportedBrands;
    }

    /**
     * Setter for SupportedBrands.
     * Feature support and capability flags for every payment-type / brand combination the store can
     * accept.
     * @param supportedBrands Value for List of CheckoutSupportedBrand
     */
    @JsonSetter("supported_brands")
    public void setSupportedBrands(List<CheckoutSupportedBrand> supportedBrands) {
        this.supportedBrands = supportedBrands;
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
     * Converts this CheckoutInfo into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutInfo [" + "mode=" + mode + ", recurringTokenPrivilege="
                + recurringTokenPrivilege + ", name=" + name + ", cardConfiguration="
                + cardConfiguration + ", subscriptionConfiguration=" + subscriptionConfiguration
                + ", installmentsConfiguration=" + installmentsConfiguration
                + ", subscriptionPlanConfiguration=" + subscriptionPlanConfiguration
                + ", checkoutConfiguration=" + checkoutConfiguration + ", qrScanConfiguration="
                + qrScanConfiguration + ", convenienceConfiguration=" + convenienceConfiguration
                + ", paidyConfiguration=" + paidyConfiguration + ", paidyPublicKey="
                + paidyPublicKey + ", logoImage=" + logoImage + ", theme=" + theme
                + ", recurringCardChargeCvvConfirmation=" + recurringCardChargeCvvConfirmation
                + ", onlineConfiguration=" + onlineConfiguration + ", bankTransferConfiguration="
                + bankTransferConfiguration + ", supportedBrands=" + supportedBrands
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CheckoutInfo.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutInfo.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mode(getMode())
                .recurringTokenPrivilege(getRecurringTokenPrivilege())
                .name(getName())
                .cardConfiguration(getCardConfiguration())
                .subscriptionConfiguration(getSubscriptionConfiguration())
                .installmentsConfiguration(getInstallmentsConfiguration())
                .subscriptionPlanConfiguration(getSubscriptionPlanConfiguration())
                .checkoutConfiguration(getCheckoutConfiguration())
                .qrScanConfiguration(getQrScanConfiguration())
                .convenienceConfiguration(getConvenienceConfiguration())
                .paidyConfiguration(getPaidyConfiguration())
                .theme(getTheme())
                .recurringCardChargeCvvConfirmation(getRecurringCardChargeCvvConfirmation())
                .onlineConfiguration(getOnlineConfiguration())
                .bankTransferConfiguration(getBankTransferConfiguration())
                .supportedBrands(getSupportedBrands());
        builder.paidyPublicKey = internalGetPaidyPublicKey();
        builder.logoImage = internalGetLogoImage();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutInfo}.
     */
    public static class Builder {
        private CheckoutMode mode;
        private CheckoutRecurringTokenPrivilege recurringTokenPrivilege;
        private String name;
        private CheckoutCardConfiguration cardConfiguration;
        private CheckoutSubscriptionConfiguration subscriptionConfiguration;
        private CheckoutInstallmentsConfiguration installmentsConfiguration;
        private CheckoutSubscriptionPlanConfiguration subscriptionPlanConfiguration;
        private CheckoutEcConfiguration checkoutConfiguration;
        private CheckoutQrScanConfiguration qrScanConfiguration;
        private CheckoutConvenienceConfiguration convenienceConfiguration;
        private CheckoutPaidyConfiguration paidyConfiguration;
        private OptionalNullable<String> paidyPublicKey;
        private OptionalNullable<String> logoImage;
        private CheckoutTheme theme;
        private RecurringCvvConfirmation recurringCardChargeCvvConfirmation;
        private CheckoutOnlineConfiguration onlineConfiguration;
        private CheckoutBankTransferConfiguration bankTransferConfiguration;
        private List<CheckoutSupportedBrand> supportedBrands;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for mode.
         * @param  mode  CheckoutMode value for mode.
         * @return Builder
         */
        public Builder mode(CheckoutMode mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Setter for recurringTokenPrivilege.
         * @param  recurringTokenPrivilege  CheckoutRecurringTokenPrivilege value for
         *         recurringTokenPrivilege.
         * @return Builder
         */
        public Builder recurringTokenPrivilege(
                CheckoutRecurringTokenPrivilege recurringTokenPrivilege) {
            this.recurringTokenPrivilege = recurringTokenPrivilege;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for cardConfiguration.
         * @param  cardConfiguration  CheckoutCardConfiguration value for cardConfiguration.
         * @return Builder
         */
        public Builder cardConfiguration(CheckoutCardConfiguration cardConfiguration) {
            this.cardConfiguration = cardConfiguration;
            return this;
        }

        /**
         * Setter for subscriptionConfiguration.
         * @param  subscriptionConfiguration  CheckoutSubscriptionConfiguration value for
         *         subscriptionConfiguration.
         * @return Builder
         */
        public Builder subscriptionConfiguration(
                CheckoutSubscriptionConfiguration subscriptionConfiguration) {
            this.subscriptionConfiguration = subscriptionConfiguration;
            return this;
        }

        /**
         * Setter for installmentsConfiguration.
         * @param  installmentsConfiguration  CheckoutInstallmentsConfiguration value for
         *         installmentsConfiguration.
         * @return Builder
         */
        public Builder installmentsConfiguration(
                CheckoutInstallmentsConfiguration installmentsConfiguration) {
            this.installmentsConfiguration = installmentsConfiguration;
            return this;
        }

        /**
         * Setter for subscriptionPlanConfiguration.
         * @param  subscriptionPlanConfiguration  CheckoutSubscriptionPlanConfiguration value for
         *         subscriptionPlanConfiguration.
         * @return Builder
         */
        public Builder subscriptionPlanConfiguration(
                CheckoutSubscriptionPlanConfiguration subscriptionPlanConfiguration) {
            this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
            return this;
        }

        /**
         * Setter for checkoutConfiguration.
         * @param  checkoutConfiguration  CheckoutEcConfiguration value for checkoutConfiguration.
         * @return Builder
         */
        public Builder checkoutConfiguration(CheckoutEcConfiguration checkoutConfiguration) {
            this.checkoutConfiguration = checkoutConfiguration;
            return this;
        }

        /**
         * Setter for qrScanConfiguration.
         * @param  qrScanConfiguration  CheckoutQrScanConfiguration value for qrScanConfiguration.
         * @return Builder
         */
        public Builder qrScanConfiguration(CheckoutQrScanConfiguration qrScanConfiguration) {
            this.qrScanConfiguration = qrScanConfiguration;
            return this;
        }

        /**
         * Setter for convenienceConfiguration.
         * @param  convenienceConfiguration  CheckoutConvenienceConfiguration value for
         *         convenienceConfiguration.
         * @return Builder
         */
        public Builder convenienceConfiguration(
                CheckoutConvenienceConfiguration convenienceConfiguration) {
            this.convenienceConfiguration = convenienceConfiguration;
            return this;
        }

        /**
         * Setter for paidyConfiguration.
         * @param  paidyConfiguration  CheckoutPaidyConfiguration value for paidyConfiguration.
         * @return Builder
         */
        public Builder paidyConfiguration(CheckoutPaidyConfiguration paidyConfiguration) {
            this.paidyConfiguration = paidyConfiguration;
            return this;
        }

        /**
         * Setter for paidyPublicKey.
         * @param  paidyPublicKey  String value for paidyPublicKey.
         * @return Builder
         */
        public Builder paidyPublicKey(String paidyPublicKey) {
            this.paidyPublicKey = OptionalNullable.of(paidyPublicKey);
            return this;
        }

        /**
         * UnSetter for paidyPublicKey.
         * @return Builder
         */
        public Builder unsetPaidyPublicKey() {
            paidyPublicKey = null;
            return this;
        }

        /**
         * Setter for logoImage.
         * @param  logoImage  String value for logoImage.
         * @return Builder
         */
        public Builder logoImage(String logoImage) {
            this.logoImage = OptionalNullable.of(logoImage);
            return this;
        }

        /**
         * UnSetter for logoImage.
         * @return Builder
         */
        public Builder unsetLogoImage() {
            logoImage = null;
            return this;
        }

        /**
         * Setter for theme.
         * @param  theme  CheckoutTheme value for theme.
         * @return Builder
         */
        public Builder theme(CheckoutTheme theme) {
            this.theme = theme;
            return this;
        }

        /**
         * Setter for recurringCardChargeCvvConfirmation.
         * @param  recurringCardChargeCvvConfirmation  RecurringCvvConfirmation value for
         *         recurringCardChargeCvvConfirmation.
         * @return Builder
         */
        public Builder recurringCardChargeCvvConfirmation(
                RecurringCvvConfirmation recurringCardChargeCvvConfirmation) {
            this.recurringCardChargeCvvConfirmation = recurringCardChargeCvvConfirmation;
            return this;
        }

        /**
         * Setter for onlineConfiguration.
         * @param  onlineConfiguration  CheckoutOnlineConfiguration value for onlineConfiguration.
         * @return Builder
         */
        public Builder onlineConfiguration(CheckoutOnlineConfiguration onlineConfiguration) {
            this.onlineConfiguration = onlineConfiguration;
            return this;
        }

        /**
         * Setter for bankTransferConfiguration.
         * @param  bankTransferConfiguration  CheckoutBankTransferConfiguration value for
         *         bankTransferConfiguration.
         * @return Builder
         */
        public Builder bankTransferConfiguration(
                CheckoutBankTransferConfiguration bankTransferConfiguration) {
            this.bankTransferConfiguration = bankTransferConfiguration;
            return this;
        }

        /**
         * Setter for supportedBrands.
         * @param  supportedBrands  List of CheckoutSupportedBrand value for supportedBrands.
         * @return Builder
         */
        public Builder supportedBrands(List<CheckoutSupportedBrand> supportedBrands) {
            this.supportedBrands = supportedBrands;
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
         * Builds a new {@link CheckoutInfo} object using the set fields.
         * @return {@link CheckoutInfo}
         */
        public CheckoutInfo build() {
            CheckoutInfo model =
                    new CheckoutInfo(mode, recurringTokenPrivilege, name, cardConfiguration,
                            subscriptionConfiguration, installmentsConfiguration,
                            subscriptionPlanConfiguration, checkoutConfiguration,
                            qrScanConfiguration, convenienceConfiguration, paidyConfiguration,
                            paidyPublicKey, logoImage, theme, recurringCardChargeCvvConfirmation,
                            onlineConfiguration, bankTransferConfiguration, supportedBrands);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
