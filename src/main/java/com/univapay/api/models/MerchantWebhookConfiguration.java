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
 * This is a model class for MerchantWebhookConfiguration type.
 */
public class MerchantWebhookConfiguration {
    private OptionalNullable<Double> percentFee;
    private List<MerchantWebhookMoneyAmount> flatFees;
    private OptionalNullable<String> logoUrl;
    private OptionalNullable<String> country;
    private OptionalNullable<String> language;
    private OptionalNullable<String> displayTimeZone;
    private MerchantWebhookMoneyAmount minTransferPayout;
    private List<MerchantWebhookMoneyAmount> minimumChargeAmounts;
    private List<MerchantWebhookMoneyAmount> maximumChargeAmounts;
    private MerchantWebhookTransferScheduleConfiguration transferSchedule;
    private MerchantWebhookUserTransactionsConfiguration userTransactionsConfiguration;
    private MerchantWebhookRecurringTokenConfiguration recurringTokenConfiguration;
    private MerchantWebhookSecurityConfiguration securityConfiguration;
    private MerchantWebhookCheckoutConfiguration checkoutConfiguration;
    private MerchantWebhookInstallmentPlanConfiguration installmentsConfiguration;
    private MerchantWebhookSubscriptionPlanConfiguration subscriptionPlanConfiguration;
    private MerchantWebhookCardBrandPercentFees cardBrandPercentFees;
    private MerchantWebhookSubscriptionConfiguration subscriptionConfiguration;
    private MerchantWebhookCustomerManagementConfiguration customerManagementConfiguration;
    private OptionalNullable<Boolean> descriptorProvidedConfiguration;
    private MerchantWebhookCardConfiguration cardConfiguration;
    private MerchantWebhookQrScanConfiguration qrScanConfiguration;
    private MerchantWebhookConvenienceConfiguration convenienceConfiguration;
    private MerchantWebhookPaidyConfiguration paidyConfiguration;
    private MerchantWebhookQrMerchantConfiguration qrMerchantConfiguration;
    private MerchantWebhookOnlineConfiguration onlineConfiguration;
    private MerchantWebhookBankTransferConfiguration bankTransferConfiguration;
    private OptionalNullable<Boolean> platformCredentialsEnabled;
    private OptionalNullable<Boolean> taggedPlatformCredentialsEnabled;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  percentFee  Double value for percentFee.
     * @param  flatFees  List of MerchantWebhookMoneyAmount value for flatFees.
     * @param  logoUrl  String value for logoUrl.
     * @param  country  String value for country.
     * @param  language  String value for language.
     * @param  displayTimeZone  String value for displayTimeZone.
     * @param  minTransferPayout  MerchantWebhookMoneyAmount value for minTransferPayout.
     * @param  minimumChargeAmounts  List of MerchantWebhookMoneyAmount value for
     *         minimumChargeAmounts.
     * @param  maximumChargeAmounts  List of MerchantWebhookMoneyAmount value for
     *         maximumChargeAmounts.
     * @param  transferSchedule  MerchantWebhookTransferScheduleConfiguration value for
     *         transferSchedule.
     * @param  userTransactionsConfiguration  MerchantWebhookUserTransactionsConfiguration value for
     *         userTransactionsConfiguration.
     * @param  recurringTokenConfiguration  MerchantWebhookRecurringTokenConfiguration value for
     *         recurringTokenConfiguration.
     * @param  securityConfiguration  MerchantWebhookSecurityConfiguration value for
     *         securityConfiguration.
     * @param  checkoutConfiguration  MerchantWebhookCheckoutConfiguration value for
     *         checkoutConfiguration.
     * @param  installmentsConfiguration  MerchantWebhookInstallmentPlanConfiguration value for
     *         installmentsConfiguration.
     * @param  subscriptionPlanConfiguration  MerchantWebhookSubscriptionPlanConfiguration value for
     *         subscriptionPlanConfiguration.
     * @param  cardBrandPercentFees  MerchantWebhookCardBrandPercentFees value for
     *         cardBrandPercentFees.
     * @param  subscriptionConfiguration  MerchantWebhookSubscriptionConfiguration value for
     *         subscriptionConfiguration.
     * @param  customerManagementConfiguration  MerchantWebhookCustomerManagementConfiguration value
     *         for customerManagementConfiguration.
     * @param  descriptorProvidedConfiguration  Boolean value for descriptorProvidedConfiguration.
     * @param  cardConfiguration  MerchantWebhookCardConfiguration value for cardConfiguration.
     * @param  qrScanConfiguration  MerchantWebhookQrScanConfiguration value for
     *         qrScanConfiguration.
     * @param  convenienceConfiguration  MerchantWebhookConvenienceConfiguration value for
     *         convenienceConfiguration.
     * @param  paidyConfiguration  MerchantWebhookPaidyConfiguration value for paidyConfiguration.
     * @param  qrMerchantConfiguration  MerchantWebhookQrMerchantConfiguration value for
     *         qrMerchantConfiguration.
     * @param  onlineConfiguration  MerchantWebhookOnlineConfiguration value for
     *         onlineConfiguration.
     * @param  bankTransferConfiguration  MerchantWebhookBankTransferConfiguration value for
     *         bankTransferConfiguration.
     * @param  platformCredentialsEnabled  Boolean value for platformCredentialsEnabled.
     * @param  taggedPlatformCredentialsEnabled  Boolean value for taggedPlatformCredentialsEnabled.
     */
    public MerchantWebhookConfiguration(
            Double percentFee,
            List<MerchantWebhookMoneyAmount> flatFees,
            String logoUrl,
            String country,
            String language,
            String displayTimeZone,
            MerchantWebhookMoneyAmount minTransferPayout,
            List<MerchantWebhookMoneyAmount> minimumChargeAmounts,
            List<MerchantWebhookMoneyAmount> maximumChargeAmounts,
            MerchantWebhookTransferScheduleConfiguration transferSchedule,
            MerchantWebhookUserTransactionsConfiguration userTransactionsConfiguration,
            MerchantWebhookRecurringTokenConfiguration recurringTokenConfiguration,
            MerchantWebhookSecurityConfiguration securityConfiguration,
            MerchantWebhookCheckoutConfiguration checkoutConfiguration,
            MerchantWebhookInstallmentPlanConfiguration installmentsConfiguration,
            MerchantWebhookSubscriptionPlanConfiguration subscriptionPlanConfiguration,
            MerchantWebhookCardBrandPercentFees cardBrandPercentFees,
            MerchantWebhookSubscriptionConfiguration subscriptionConfiguration,
            MerchantWebhookCustomerManagementConfiguration customerManagementConfiguration,
            Boolean descriptorProvidedConfiguration,
            MerchantWebhookCardConfiguration cardConfiguration,
            MerchantWebhookQrScanConfiguration qrScanConfiguration,
            MerchantWebhookConvenienceConfiguration convenienceConfiguration,
            MerchantWebhookPaidyConfiguration paidyConfiguration,
            MerchantWebhookQrMerchantConfiguration qrMerchantConfiguration,
            MerchantWebhookOnlineConfiguration onlineConfiguration,
            MerchantWebhookBankTransferConfiguration bankTransferConfiguration,
            Boolean platformCredentialsEnabled,
            Boolean taggedPlatformCredentialsEnabled) {
        this.percentFee = OptionalNullable.of(percentFee);
        this.flatFees = flatFees;
        this.logoUrl = OptionalNullable.of(logoUrl);
        this.country = OptionalNullable.of(country);
        this.language = OptionalNullable.of(language);
        this.displayTimeZone = OptionalNullable.of(displayTimeZone);
        this.minTransferPayout = minTransferPayout;
        this.minimumChargeAmounts = minimumChargeAmounts;
        this.maximumChargeAmounts = maximumChargeAmounts;
        this.transferSchedule = transferSchedule;
        this.userTransactionsConfiguration = userTransactionsConfiguration;
        this.recurringTokenConfiguration = recurringTokenConfiguration;
        this.securityConfiguration = securityConfiguration;
        this.checkoutConfiguration = checkoutConfiguration;
        this.installmentsConfiguration = installmentsConfiguration;
        this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
        this.cardBrandPercentFees = cardBrandPercentFees;
        this.subscriptionConfiguration = subscriptionConfiguration;
        this.customerManagementConfiguration = customerManagementConfiguration;
        this.descriptorProvidedConfiguration = OptionalNullable.of(descriptorProvidedConfiguration);
        this.cardConfiguration = cardConfiguration;
        this.qrScanConfiguration = qrScanConfiguration;
        this.convenienceConfiguration = convenienceConfiguration;
        this.paidyConfiguration = paidyConfiguration;
        this.qrMerchantConfiguration = qrMerchantConfiguration;
        this.onlineConfiguration = onlineConfiguration;
        this.bankTransferConfiguration = bankTransferConfiguration;
        this.platformCredentialsEnabled = OptionalNullable.of(platformCredentialsEnabled);
        this.taggedPlatformCredentialsEnabled =
                OptionalNullable.of(taggedPlatformCredentialsEnabled);
    }

    /**
     * Initialization constructor.
     * @param  percentFee  Double value for percentFee.
     * @param  flatFees  List of MerchantWebhookMoneyAmount value for flatFees.
     * @param  logoUrl  String value for logoUrl.
     * @param  country  String value for country.
     * @param  language  String value for language.
     * @param  displayTimeZone  String value for displayTimeZone.
     * @param  minTransferPayout  MerchantWebhookMoneyAmount value for minTransferPayout.
     * @param  minimumChargeAmounts  List of MerchantWebhookMoneyAmount value for
     *         minimumChargeAmounts.
     * @param  maximumChargeAmounts  List of MerchantWebhookMoneyAmount value for
     *         maximumChargeAmounts.
     * @param  transferSchedule  MerchantWebhookTransferScheduleConfiguration value for
     *         transferSchedule.
     * @param  userTransactionsConfiguration  MerchantWebhookUserTransactionsConfiguration value for
     *         userTransactionsConfiguration.
     * @param  recurringTokenConfiguration  MerchantWebhookRecurringTokenConfiguration value for
     *         recurringTokenConfiguration.
     * @param  securityConfiguration  MerchantWebhookSecurityConfiguration value for
     *         securityConfiguration.
     * @param  checkoutConfiguration  MerchantWebhookCheckoutConfiguration value for
     *         checkoutConfiguration.
     * @param  installmentsConfiguration  MerchantWebhookInstallmentPlanConfiguration value for
     *         installmentsConfiguration.
     * @param  subscriptionPlanConfiguration  MerchantWebhookSubscriptionPlanConfiguration value for
     *         subscriptionPlanConfiguration.
     * @param  cardBrandPercentFees  MerchantWebhookCardBrandPercentFees value for
     *         cardBrandPercentFees.
     * @param  subscriptionConfiguration  MerchantWebhookSubscriptionConfiguration value for
     *         subscriptionConfiguration.
     * @param  customerManagementConfiguration  MerchantWebhookCustomerManagementConfiguration value
     *         for customerManagementConfiguration.
     * @param  descriptorProvidedConfiguration  Boolean value for descriptorProvidedConfiguration.
     * @param  cardConfiguration  MerchantWebhookCardConfiguration value for cardConfiguration.
     * @param  qrScanConfiguration  MerchantWebhookQrScanConfiguration value for
     *         qrScanConfiguration.
     * @param  convenienceConfiguration  MerchantWebhookConvenienceConfiguration value for
     *         convenienceConfiguration.
     * @param  paidyConfiguration  MerchantWebhookPaidyConfiguration value for paidyConfiguration.
     * @param  qrMerchantConfiguration  MerchantWebhookQrMerchantConfiguration value for
     *         qrMerchantConfiguration.
     * @param  onlineConfiguration  MerchantWebhookOnlineConfiguration value for
     *         onlineConfiguration.
     * @param  bankTransferConfiguration  MerchantWebhookBankTransferConfiguration value for
     *         bankTransferConfiguration.
     * @param  platformCredentialsEnabled  Boolean value for platformCredentialsEnabled.
     * @param  taggedPlatformCredentialsEnabled  Boolean value for taggedPlatformCredentialsEnabled.
     */

    protected MerchantWebhookConfiguration(OptionalNullable<Double> percentFee,
            List<MerchantWebhookMoneyAmount> flatFees, OptionalNullable<String> logoUrl,
            OptionalNullable<String> country, OptionalNullable<String> language,
            OptionalNullable<String> displayTimeZone, MerchantWebhookMoneyAmount minTransferPayout,
            List<MerchantWebhookMoneyAmount> minimumChargeAmounts,
            List<MerchantWebhookMoneyAmount> maximumChargeAmounts,
            MerchantWebhookTransferScheduleConfiguration transferSchedule,
            MerchantWebhookUserTransactionsConfiguration userTransactionsConfiguration,
            MerchantWebhookRecurringTokenConfiguration recurringTokenConfiguration,
            MerchantWebhookSecurityConfiguration securityConfiguration,
            MerchantWebhookCheckoutConfiguration checkoutConfiguration,
            MerchantWebhookInstallmentPlanConfiguration installmentsConfiguration,
            MerchantWebhookSubscriptionPlanConfiguration subscriptionPlanConfiguration,
            MerchantWebhookCardBrandPercentFees cardBrandPercentFees,
            MerchantWebhookSubscriptionConfiguration subscriptionConfiguration,
            MerchantWebhookCustomerManagementConfiguration customerManagementConfiguration,
            OptionalNullable<Boolean> descriptorProvidedConfiguration,
            MerchantWebhookCardConfiguration cardConfiguration,
            MerchantWebhookQrScanConfiguration qrScanConfiguration,
            MerchantWebhookConvenienceConfiguration convenienceConfiguration,
            MerchantWebhookPaidyConfiguration paidyConfiguration,
            MerchantWebhookQrMerchantConfiguration qrMerchantConfiguration,
            MerchantWebhookOnlineConfiguration onlineConfiguration,
            MerchantWebhookBankTransferConfiguration bankTransferConfiguration,
            OptionalNullable<Boolean> platformCredentialsEnabled,
            OptionalNullable<Boolean> taggedPlatformCredentialsEnabled) {
        this.percentFee = percentFee;
        this.flatFees = flatFees;
        this.logoUrl = logoUrl;
        this.country = country;
        this.language = language;
        this.displayTimeZone = displayTimeZone;
        this.minTransferPayout = minTransferPayout;
        this.minimumChargeAmounts = minimumChargeAmounts;
        this.maximumChargeAmounts = maximumChargeAmounts;
        this.transferSchedule = transferSchedule;
        this.userTransactionsConfiguration = userTransactionsConfiguration;
        this.recurringTokenConfiguration = recurringTokenConfiguration;
        this.securityConfiguration = securityConfiguration;
        this.checkoutConfiguration = checkoutConfiguration;
        this.installmentsConfiguration = installmentsConfiguration;
        this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
        this.cardBrandPercentFees = cardBrandPercentFees;
        this.subscriptionConfiguration = subscriptionConfiguration;
        this.customerManagementConfiguration = customerManagementConfiguration;
        this.descriptorProvidedConfiguration = descriptorProvidedConfiguration;
        this.cardConfiguration = cardConfiguration;
        this.qrScanConfiguration = qrScanConfiguration;
        this.convenienceConfiguration = convenienceConfiguration;
        this.paidyConfiguration = paidyConfiguration;
        this.qrMerchantConfiguration = qrMerchantConfiguration;
        this.onlineConfiguration = onlineConfiguration;
        this.bankTransferConfiguration = bankTransferConfiguration;
        this.platformCredentialsEnabled = platformCredentialsEnabled;
        this.taggedPlatformCredentialsEnabled = taggedPlatformCredentialsEnabled;
    }

    /**
     * Internal Getter for PercentFee.
     * Default percent fee applied when no card-brand override exists.
     * @return Returns the Internal Double
     */
    @JsonGetter("percent_fee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetPercentFee() {
        return this.percentFee;
    }

    /**
     * Getter for PercentFee.
     * Default percent fee applied when no card-brand override exists.
     * @return Returns the Double
     */
    public Double getPercentFee() {
        return OptionalNullable.getFrom(percentFee);
    }

    /**
     * Setter for PercentFee.
     * Default percent fee applied when no card-brand override exists.
     * @param percentFee Value for Double
     */
    @JsonSetter("percent_fee")
    public void setPercentFee(Double percentFee) {
        this.percentFee = OptionalNullable.of(percentFee);
    }

    /**
     * UnSetter for PercentFee.
     * Default percent fee applied when no card-brand override exists.
     */
    public void unsetPercentFee() {
        percentFee = null;
    }

    /**
     * Getter for FlatFees.
     * Flat fee overrides by currency.
     * @return Returns the List of MerchantWebhookMoneyAmount
     */
    @JsonGetter("flat_fees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MerchantWebhookMoneyAmount> getFlatFees() {
        return flatFees;
    }

    /**
     * Setter for FlatFees.
     * Flat fee overrides by currency.
     * @param flatFees Value for List of MerchantWebhookMoneyAmount
     */
    @JsonSetter("flat_fees")
    public void setFlatFees(List<MerchantWebhookMoneyAmount> flatFees) {
        this.flatFees = flatFees;
    }

    /**
     * Internal Getter for LogoUrl.
     * Merchant logo URL.
     * @return Returns the Internal String
     */
    @JsonGetter("logo_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLogoUrl() {
        return this.logoUrl;
    }

    /**
     * Getter for LogoUrl.
     * Merchant logo URL.
     * @return Returns the String
     */
    public String getLogoUrl() {
        return OptionalNullable.getFrom(logoUrl);
    }

    /**
     * Setter for LogoUrl.
     * Merchant logo URL.
     * @param logoUrl Value for String
     */
    @JsonSetter("logo_url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = OptionalNullable.of(logoUrl);
    }

    /**
     * UnSetter for LogoUrl.
     * Merchant logo URL.
     */
    public void unsetLogoUrl() {
        logoUrl = null;
    }

    /**
     * Internal Getter for Country.
     * Merchant country code.
     * @return Returns the Internal String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCountry() {
        return this.country;
    }

    /**
     * Getter for Country.
     * Merchant country code.
     * @return Returns the String
     */
    public String getCountry() {
        return OptionalNullable.getFrom(country);
    }

    /**
     * Setter for Country.
     * Merchant country code.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = OptionalNullable.of(country);
    }

    /**
     * UnSetter for Country.
     * Merchant country code.
     */
    public void unsetCountry() {
        country = null;
    }

    /**
     * Internal Getter for Language.
     * Merchant default language.
     * @return Returns the Internal String
     */
    @JsonGetter("language")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLanguage() {
        return this.language;
    }

    /**
     * Getter for Language.
     * Merchant default language.
     * @return Returns the String
     */
    public String getLanguage() {
        return OptionalNullable.getFrom(language);
    }

    /**
     * Setter for Language.
     * Merchant default language.
     * @param language Value for String
     */
    @JsonSetter("language")
    public void setLanguage(String language) {
        this.language = OptionalNullable.of(language);
    }

    /**
     * UnSetter for Language.
     * Merchant default language.
     */
    public void unsetLanguage() {
        language = null;
    }

    /**
     * Internal Getter for DisplayTimeZone.
     * Merchant display time zone.
     * @return Returns the Internal String
     */
    @JsonGetter("display_time_zone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDisplayTimeZone() {
        return this.displayTimeZone;
    }

    /**
     * Getter for DisplayTimeZone.
     * Merchant display time zone.
     * @return Returns the String
     */
    public String getDisplayTimeZone() {
        return OptionalNullable.getFrom(displayTimeZone);
    }

    /**
     * Setter for DisplayTimeZone.
     * Merchant display time zone.
     * @param displayTimeZone Value for String
     */
    @JsonSetter("display_time_zone")
    public void setDisplayTimeZone(String displayTimeZone) {
        this.displayTimeZone = OptionalNullable.of(displayTimeZone);
    }

    /**
     * UnSetter for DisplayTimeZone.
     * Merchant display time zone.
     */
    public void unsetDisplayTimeZone() {
        displayTimeZone = null;
    }

    /**
     * Getter for MinTransferPayout.
     * Monetary amount object serialized by backend config models.
     * @return Returns the MerchantWebhookMoneyAmount
     */
    @JsonGetter("min_transfer_payout")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookMoneyAmount getMinTransferPayout() {
        return minTransferPayout;
    }

    /**
     * Setter for MinTransferPayout.
     * Monetary amount object serialized by backend config models.
     * @param minTransferPayout Value for MerchantWebhookMoneyAmount
     */
    @JsonSetter("min_transfer_payout")
    public void setMinTransferPayout(MerchantWebhookMoneyAmount minTransferPayout) {
        this.minTransferPayout = minTransferPayout;
    }

    /**
     * Getter for MinimumChargeAmounts.
     * Minimum allowed charge amounts by currency.
     * @return Returns the List of MerchantWebhookMoneyAmount
     */
    @JsonGetter("minimum_charge_amounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MerchantWebhookMoneyAmount> getMinimumChargeAmounts() {
        return minimumChargeAmounts;
    }

    /**
     * Setter for MinimumChargeAmounts.
     * Minimum allowed charge amounts by currency.
     * @param minimumChargeAmounts Value for List of MerchantWebhookMoneyAmount
     */
    @JsonSetter("minimum_charge_amounts")
    public void setMinimumChargeAmounts(List<MerchantWebhookMoneyAmount> minimumChargeAmounts) {
        this.minimumChargeAmounts = minimumChargeAmounts;
    }

    /**
     * Getter for MaximumChargeAmounts.
     * Maximum allowed charge amounts by currency.
     * @return Returns the List of MerchantWebhookMoneyAmount
     */
    @JsonGetter("maximum_charge_amounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MerchantWebhookMoneyAmount> getMaximumChargeAmounts() {
        return maximumChargeAmounts;
    }

    /**
     * Setter for MaximumChargeAmounts.
     * Maximum allowed charge amounts by currency.
     * @param maximumChargeAmounts Value for List of MerchantWebhookMoneyAmount
     */
    @JsonSetter("maximum_charge_amounts")
    public void setMaximumChargeAmounts(List<MerchantWebhookMoneyAmount> maximumChargeAmounts) {
        this.maximumChargeAmounts = maximumChargeAmounts;
    }

    /**
     * Getter for TransferSchedule.
     * Transfer schedule configuration inherited by the merchant.
     * @return Returns the MerchantWebhookTransferScheduleConfiguration
     */
    @JsonGetter("transfer_schedule")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookTransferScheduleConfiguration getTransferSchedule() {
        return transferSchedule;
    }

    /**
     * Setter for TransferSchedule.
     * Transfer schedule configuration inherited by the merchant.
     * @param transferSchedule Value for MerchantWebhookTransferScheduleConfiguration
     */
    @JsonSetter("transfer_schedule")
    public void setTransferSchedule(MerchantWebhookTransferScheduleConfiguration transferSchedule) {
        this.transferSchedule = transferSchedule;
    }

    /**
     * Getter for UserTransactionsConfiguration.
     * Merchant transaction notification settings.
     * @return Returns the MerchantWebhookUserTransactionsConfiguration
     */
    @JsonGetter("user_transactions_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookUserTransactionsConfiguration getUserTransactionsConfiguration() {
        return userTransactionsConfiguration;
    }

    /**
     * Setter for UserTransactionsConfiguration.
     * Merchant transaction notification settings.
     * @param userTransactionsConfiguration Value for MerchantWebhookUserTransactionsConfiguration
     */
    @JsonSetter("user_transactions_configuration")
    public void setUserTransactionsConfiguration(MerchantWebhookUserTransactionsConfiguration userTransactionsConfiguration) {
        this.userTransactionsConfiguration = userTransactionsConfiguration;
    }

    /**
     * Getter for RecurringTokenConfiguration.
     * Recurring token configuration inherited by the merchant.
     * @return Returns the MerchantWebhookRecurringTokenConfiguration
     */
    @JsonGetter("recurring_token_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookRecurringTokenConfiguration getRecurringTokenConfiguration() {
        return recurringTokenConfiguration;
    }

    /**
     * Setter for RecurringTokenConfiguration.
     * Recurring token configuration inherited by the merchant.
     * @param recurringTokenConfiguration Value for MerchantWebhookRecurringTokenConfiguration
     */
    @JsonSetter("recurring_token_configuration")
    public void setRecurringTokenConfiguration(MerchantWebhookRecurringTokenConfiguration recurringTokenConfiguration) {
        this.recurringTokenConfiguration = recurringTokenConfiguration;
    }

    /**
     * Getter for SecurityConfiguration.
     * Merchant-level fraud and refund safety settings.
     * @return Returns the MerchantWebhookSecurityConfiguration
     */
    @JsonGetter("security_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookSecurityConfiguration getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * Setter for SecurityConfiguration.
     * Merchant-level fraud and refund safety settings.
     * @param securityConfiguration Value for MerchantWebhookSecurityConfiguration
     */
    @JsonSetter("security_configuration")
    public void setSecurityConfiguration(MerchantWebhookSecurityConfiguration securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * Getter for CheckoutConfiguration.
     * Checkout field collection settings.
     * @return Returns the MerchantWebhookCheckoutConfiguration
     */
    @JsonGetter("checkout_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookCheckoutConfiguration getCheckoutConfiguration() {
        return checkoutConfiguration;
    }

    /**
     * Setter for CheckoutConfiguration.
     * Checkout field collection settings.
     * @param checkoutConfiguration Value for MerchantWebhookCheckoutConfiguration
     */
    @JsonSetter("checkout_configuration")
    public void setCheckoutConfiguration(MerchantWebhookCheckoutConfiguration checkoutConfiguration) {
        this.checkoutConfiguration = checkoutConfiguration;
    }

    /**
     * Getter for InstallmentsConfiguration.
     * Installment plan configuration.
     * @return Returns the MerchantWebhookInstallmentPlanConfiguration
     */
    @JsonGetter("installments_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookInstallmentPlanConfiguration getInstallmentsConfiguration() {
        return installmentsConfiguration;
    }

    /**
     * Setter for InstallmentsConfiguration.
     * Installment plan configuration.
     * @param installmentsConfiguration Value for MerchantWebhookInstallmentPlanConfiguration
     */
    @JsonSetter("installments_configuration")
    public void setInstallmentsConfiguration(MerchantWebhookInstallmentPlanConfiguration installmentsConfiguration) {
        this.installmentsConfiguration = installmentsConfiguration;
    }

    /**
     * Getter for SubscriptionPlanConfiguration.
     * Subscription plan configuration.
     * @return Returns the MerchantWebhookSubscriptionPlanConfiguration
     */
    @JsonGetter("subscription_plan_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookSubscriptionPlanConfiguration getSubscriptionPlanConfiguration() {
        return subscriptionPlanConfiguration;
    }

    /**
     * Setter for SubscriptionPlanConfiguration.
     * Subscription plan configuration.
     * @param subscriptionPlanConfiguration Value for MerchantWebhookSubscriptionPlanConfiguration
     */
    @JsonSetter("subscription_plan_configuration")
    public void setSubscriptionPlanConfiguration(MerchantWebhookSubscriptionPlanConfiguration subscriptionPlanConfiguration) {
        this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
    }

    /**
     * Getter for CardBrandPercentFees.
     * Per-card-brand percent fee overrides.
     * @return Returns the MerchantWebhookCardBrandPercentFees
     */
    @JsonGetter("card_brand_percent_fees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookCardBrandPercentFees getCardBrandPercentFees() {
        return cardBrandPercentFees;
    }

    /**
     * Setter for CardBrandPercentFees.
     * Per-card-brand percent fee overrides.
     * @param cardBrandPercentFees Value for MerchantWebhookCardBrandPercentFees
     */
    @JsonSetter("card_brand_percent_fees")
    public void setCardBrandPercentFees(MerchantWebhookCardBrandPercentFees cardBrandPercentFees) {
        this.cardBrandPercentFees = cardBrandPercentFees;
    }

    /**
     * Getter for SubscriptionConfiguration.
     * Subscription feature configuration.
     * @return Returns the MerchantWebhookSubscriptionConfiguration
     */
    @JsonGetter("subscription_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookSubscriptionConfiguration getSubscriptionConfiguration() {
        return subscriptionConfiguration;
    }

    /**
     * Setter for SubscriptionConfiguration.
     * Subscription feature configuration.
     * @param subscriptionConfiguration Value for MerchantWebhookSubscriptionConfiguration
     */
    @JsonSetter("subscription_configuration")
    public void setSubscriptionConfiguration(MerchantWebhookSubscriptionConfiguration subscriptionConfiguration) {
        this.subscriptionConfiguration = subscriptionConfiguration;
    }

    /**
     * Getter for CustomerManagementConfiguration.
     * Customer-management defaults.
     * @return Returns the MerchantWebhookCustomerManagementConfiguration
     */
    @JsonGetter("customer_management_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookCustomerManagementConfiguration getCustomerManagementConfiguration() {
        return customerManagementConfiguration;
    }

    /**
     * Setter for CustomerManagementConfiguration.
     * Customer-management defaults.
     * @param customerManagementConfiguration Value for MerchantWebhookCustomerManagementConfiguration
     */
    @JsonSetter("customer_management_configuration")
    public void setCustomerManagementConfiguration(MerchantWebhookCustomerManagementConfiguration customerManagementConfiguration) {
        this.customerManagementConfiguration = customerManagementConfiguration;
    }

    /**
     * Internal Getter for DescriptorProvidedConfiguration.
     * Whether statement descriptors can be provided by merchants.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("descriptor_provided_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDescriptorProvidedConfiguration() {
        return this.descriptorProvidedConfiguration;
    }

    /**
     * Getter for DescriptorProvidedConfiguration.
     * Whether statement descriptors can be provided by merchants.
     * @return Returns the Boolean
     */
    public Boolean getDescriptorProvidedConfiguration() {
        return OptionalNullable.getFrom(descriptorProvidedConfiguration);
    }

    /**
     * Setter for DescriptorProvidedConfiguration.
     * Whether statement descriptors can be provided by merchants.
     * @param descriptorProvidedConfiguration Value for Boolean
     */
    @JsonSetter("descriptor_provided_configuration")
    public void setDescriptorProvidedConfiguration(Boolean descriptorProvidedConfiguration) {
        this.descriptorProvidedConfiguration = OptionalNullable.of(descriptorProvidedConfiguration);
    }

    /**
     * UnSetter for DescriptorProvidedConfiguration.
     * Whether statement descriptors can be provided by merchants.
     */
    public void unsetDescriptorProvidedConfiguration() {
        descriptorProvidedConfiguration = null;
    }

    /**
     * Getter for CardConfiguration.
     * Card payment settings.
     * @return Returns the MerchantWebhookCardConfiguration
     */
    @JsonGetter("card_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookCardConfiguration getCardConfiguration() {
        return cardConfiguration;
    }

    /**
     * Setter for CardConfiguration.
     * Card payment settings.
     * @param cardConfiguration Value for MerchantWebhookCardConfiguration
     */
    @JsonSetter("card_configuration")
    public void setCardConfiguration(MerchantWebhookCardConfiguration cardConfiguration) {
        this.cardConfiguration = cardConfiguration;
    }

    /**
     * Getter for QrScanConfiguration.
     * QR scan payment settings.
     * @return Returns the MerchantWebhookQrScanConfiguration
     */
    @JsonGetter("qr_scan_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookQrScanConfiguration getQrScanConfiguration() {
        return qrScanConfiguration;
    }

    /**
     * Setter for QrScanConfiguration.
     * QR scan payment settings.
     * @param qrScanConfiguration Value for MerchantWebhookQrScanConfiguration
     */
    @JsonSetter("qr_scan_configuration")
    public void setQrScanConfiguration(MerchantWebhookQrScanConfiguration qrScanConfiguration) {
        this.qrScanConfiguration = qrScanConfiguration;
    }

    /**
     * Getter for ConvenienceConfiguration.
     * Convenience-store payment settings.
     * @return Returns the MerchantWebhookConvenienceConfiguration
     */
    @JsonGetter("convenience_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookConvenienceConfiguration getConvenienceConfiguration() {
        return convenienceConfiguration;
    }

    /**
     * Setter for ConvenienceConfiguration.
     * Convenience-store payment settings.
     * @param convenienceConfiguration Value for MerchantWebhookConvenienceConfiguration
     */
    @JsonSetter("convenience_configuration")
    public void setConvenienceConfiguration(MerchantWebhookConvenienceConfiguration convenienceConfiguration) {
        this.convenienceConfiguration = convenienceConfiguration;
    }

    /**
     * Getter for PaidyConfiguration.
     * Paidy payment settings.
     * @return Returns the MerchantWebhookPaidyConfiguration
     */
    @JsonGetter("paidy_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookPaidyConfiguration getPaidyConfiguration() {
        return paidyConfiguration;
    }

    /**
     * Setter for PaidyConfiguration.
     * Paidy payment settings.
     * @param paidyConfiguration Value for MerchantWebhookPaidyConfiguration
     */
    @JsonSetter("paidy_configuration")
    public void setPaidyConfiguration(MerchantWebhookPaidyConfiguration paidyConfiguration) {
        this.paidyConfiguration = paidyConfiguration;
    }

    /**
     * Getter for QrMerchantConfiguration.
     * QR merchant payment settings.
     * @return Returns the MerchantWebhookQrMerchantConfiguration
     */
    @JsonGetter("qr_merchant_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookQrMerchantConfiguration getQrMerchantConfiguration() {
        return qrMerchantConfiguration;
    }

    /**
     * Setter for QrMerchantConfiguration.
     * QR merchant payment settings.
     * @param qrMerchantConfiguration Value for MerchantWebhookQrMerchantConfiguration
     */
    @JsonSetter("qr_merchant_configuration")
    public void setQrMerchantConfiguration(MerchantWebhookQrMerchantConfiguration qrMerchantConfiguration) {
        this.qrMerchantConfiguration = qrMerchantConfiguration;
    }

    /**
     * Getter for OnlineConfiguration.
     * Online payment settings.
     * @return Returns the MerchantWebhookOnlineConfiguration
     */
    @JsonGetter("online_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookOnlineConfiguration getOnlineConfiguration() {
        return onlineConfiguration;
    }

    /**
     * Setter for OnlineConfiguration.
     * Online payment settings.
     * @param onlineConfiguration Value for MerchantWebhookOnlineConfiguration
     */
    @JsonSetter("online_configuration")
    public void setOnlineConfiguration(MerchantWebhookOnlineConfiguration onlineConfiguration) {
        this.onlineConfiguration = onlineConfiguration;
    }

    /**
     * Getter for BankTransferConfiguration.
     * Bank transfer payment settings.
     * @return Returns the MerchantWebhookBankTransferConfiguration
     */
    @JsonGetter("bank_transfer_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookBankTransferConfiguration getBankTransferConfiguration() {
        return bankTransferConfiguration;
    }

    /**
     * Setter for BankTransferConfiguration.
     * Bank transfer payment settings.
     * @param bankTransferConfiguration Value for MerchantWebhookBankTransferConfiguration
     */
    @JsonSetter("bank_transfer_configuration")
    public void setBankTransferConfiguration(MerchantWebhookBankTransferConfiguration bankTransferConfiguration) {
        this.bankTransferConfiguration = bankTransferConfiguration;
    }

    /**
     * Internal Getter for PlatformCredentialsEnabled.
     * Whether platform credentials are enabled.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("platform_credentials_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetPlatformCredentialsEnabled() {
        return this.platformCredentialsEnabled;
    }

    /**
     * Getter for PlatformCredentialsEnabled.
     * Whether platform credentials are enabled.
     * @return Returns the Boolean
     */
    public Boolean getPlatformCredentialsEnabled() {
        return OptionalNullable.getFrom(platformCredentialsEnabled);
    }

    /**
     * Setter for PlatformCredentialsEnabled.
     * Whether platform credentials are enabled.
     * @param platformCredentialsEnabled Value for Boolean
     */
    @JsonSetter("platform_credentials_enabled")
    public void setPlatformCredentialsEnabled(Boolean platformCredentialsEnabled) {
        this.platformCredentialsEnabled = OptionalNullable.of(platformCredentialsEnabled);
    }

    /**
     * UnSetter for PlatformCredentialsEnabled.
     * Whether platform credentials are enabled.
     */
    public void unsetPlatformCredentialsEnabled() {
        platformCredentialsEnabled = null;
    }

    /**
     * Internal Getter for TaggedPlatformCredentialsEnabled.
     * Whether tagged platform credentials are enabled.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("tagged_platform_credentials_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetTaggedPlatformCredentialsEnabled() {
        return this.taggedPlatformCredentialsEnabled;
    }

    /**
     * Getter for TaggedPlatformCredentialsEnabled.
     * Whether tagged platform credentials are enabled.
     * @return Returns the Boolean
     */
    public Boolean getTaggedPlatformCredentialsEnabled() {
        return OptionalNullable.getFrom(taggedPlatformCredentialsEnabled);
    }

    /**
     * Setter for TaggedPlatformCredentialsEnabled.
     * Whether tagged platform credentials are enabled.
     * @param taggedPlatformCredentialsEnabled Value for Boolean
     */
    @JsonSetter("tagged_platform_credentials_enabled")
    public void setTaggedPlatformCredentialsEnabled(Boolean taggedPlatformCredentialsEnabled) {
        this.taggedPlatformCredentialsEnabled = OptionalNullable.of(taggedPlatformCredentialsEnabled);
    }

    /**
     * UnSetter for TaggedPlatformCredentialsEnabled.
     * Whether tagged platform credentials are enabled.
     */
    public void unsetTaggedPlatformCredentialsEnabled() {
        taggedPlatformCredentialsEnabled = null;
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
     * Converts this MerchantWebhookConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookConfiguration [" + "percentFee=" + percentFee + ", flatFees="
                + flatFees + ", logoUrl=" + logoUrl + ", country=" + country + ", language="
                + language + ", displayTimeZone=" + displayTimeZone + ", minTransferPayout="
                + minTransferPayout + ", minimumChargeAmounts=" + minimumChargeAmounts
                + ", maximumChargeAmounts=" + maximumChargeAmounts + ", transferSchedule="
                + transferSchedule + ", userTransactionsConfiguration="
                + userTransactionsConfiguration + ", recurringTokenConfiguration="
                + recurringTokenConfiguration + ", securityConfiguration=" + securityConfiguration
                + ", checkoutConfiguration=" + checkoutConfiguration
                + ", installmentsConfiguration=" + installmentsConfiguration
                + ", subscriptionPlanConfiguration=" + subscriptionPlanConfiguration
                + ", cardBrandPercentFees=" + cardBrandPercentFees + ", subscriptionConfiguration="
                + subscriptionConfiguration + ", customerManagementConfiguration="
                + customerManagementConfiguration + ", descriptorProvidedConfiguration="
                + descriptorProvidedConfiguration + ", cardConfiguration=" + cardConfiguration
                + ", qrScanConfiguration=" + qrScanConfiguration + ", convenienceConfiguration="
                + convenienceConfiguration + ", paidyConfiguration=" + paidyConfiguration
                + ", qrMerchantConfiguration=" + qrMerchantConfiguration + ", onlineConfiguration="
                + onlineConfiguration + ", bankTransferConfiguration=" + bankTransferConfiguration
                + ", platformCredentialsEnabled=" + platformCredentialsEnabled
                + ", taggedPlatformCredentialsEnabled=" + taggedPlatformCredentialsEnabled
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .flatFees(getFlatFees())
                .minTransferPayout(getMinTransferPayout())
                .minimumChargeAmounts(getMinimumChargeAmounts())
                .maximumChargeAmounts(getMaximumChargeAmounts())
                .transferSchedule(getTransferSchedule())
                .userTransactionsConfiguration(getUserTransactionsConfiguration())
                .recurringTokenConfiguration(getRecurringTokenConfiguration())
                .securityConfiguration(getSecurityConfiguration())
                .checkoutConfiguration(getCheckoutConfiguration())
                .installmentsConfiguration(getInstallmentsConfiguration())
                .subscriptionPlanConfiguration(getSubscriptionPlanConfiguration())
                .cardBrandPercentFees(getCardBrandPercentFees())
                .subscriptionConfiguration(getSubscriptionConfiguration())
                .customerManagementConfiguration(getCustomerManagementConfiguration())
                .cardConfiguration(getCardConfiguration())
                .qrScanConfiguration(getQrScanConfiguration())
                .convenienceConfiguration(getConvenienceConfiguration())
                .paidyConfiguration(getPaidyConfiguration())
                .qrMerchantConfiguration(getQrMerchantConfiguration())
                .onlineConfiguration(getOnlineConfiguration())
                .bankTransferConfiguration(getBankTransferConfiguration());
        builder.percentFee = internalGetPercentFee();
        builder.logoUrl = internalGetLogoUrl();
        builder.country = internalGetCountry();
        builder.language = internalGetLanguage();
        builder.displayTimeZone = internalGetDisplayTimeZone();
        builder.descriptorProvidedConfiguration = internalGetDescriptorProvidedConfiguration();
        builder.platformCredentialsEnabled = internalGetPlatformCredentialsEnabled();
        builder.taggedPlatformCredentialsEnabled = internalGetTaggedPlatformCredentialsEnabled();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Double> percentFee;
        private List<MerchantWebhookMoneyAmount> flatFees;
        private OptionalNullable<String> logoUrl;
        private OptionalNullable<String> country;
        private OptionalNullable<String> language;
        private OptionalNullable<String> displayTimeZone;
        private MerchantWebhookMoneyAmount minTransferPayout;
        private List<MerchantWebhookMoneyAmount> minimumChargeAmounts;
        private List<MerchantWebhookMoneyAmount> maximumChargeAmounts;
        private MerchantWebhookTransferScheduleConfiguration transferSchedule;
        private MerchantWebhookUserTransactionsConfiguration userTransactionsConfiguration;
        private MerchantWebhookRecurringTokenConfiguration recurringTokenConfiguration;
        private MerchantWebhookSecurityConfiguration securityConfiguration;
        private MerchantWebhookCheckoutConfiguration checkoutConfiguration;
        private MerchantWebhookInstallmentPlanConfiguration installmentsConfiguration;
        private MerchantWebhookSubscriptionPlanConfiguration subscriptionPlanConfiguration;
        private MerchantWebhookCardBrandPercentFees cardBrandPercentFees;
        private MerchantWebhookSubscriptionConfiguration subscriptionConfiguration;
        private MerchantWebhookCustomerManagementConfiguration customerManagementConfiguration;
        private OptionalNullable<Boolean> descriptorProvidedConfiguration;
        private MerchantWebhookCardConfiguration cardConfiguration;
        private MerchantWebhookQrScanConfiguration qrScanConfiguration;
        private MerchantWebhookConvenienceConfiguration convenienceConfiguration;
        private MerchantWebhookPaidyConfiguration paidyConfiguration;
        private MerchantWebhookQrMerchantConfiguration qrMerchantConfiguration;
        private MerchantWebhookOnlineConfiguration onlineConfiguration;
        private MerchantWebhookBankTransferConfiguration bankTransferConfiguration;
        private OptionalNullable<Boolean> platformCredentialsEnabled;
        private OptionalNullable<Boolean> taggedPlatformCredentialsEnabled;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for percentFee.
         * @param  percentFee  Double value for percentFee.
         * @return Builder
         */
        public Builder percentFee(Double percentFee) {
            this.percentFee = OptionalNullable.of(percentFee);
            return this;
        }

        /**
         * UnSetter for percentFee.
         * @return Builder
         */
        public Builder unsetPercentFee() {
            percentFee = null;
            return this;
        }

        /**
         * Setter for flatFees.
         * @param  flatFees  List of MerchantWebhookMoneyAmount value for flatFees.
         * @return Builder
         */
        public Builder flatFees(List<MerchantWebhookMoneyAmount> flatFees) {
            this.flatFees = flatFees;
            return this;
        }

        /**
         * Setter for logoUrl.
         * @param  logoUrl  String value for logoUrl.
         * @return Builder
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = OptionalNullable.of(logoUrl);
            return this;
        }

        /**
         * UnSetter for logoUrl.
         * @return Builder
         */
        public Builder unsetLogoUrl() {
            logoUrl = null;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = OptionalNullable.of(country);
            return this;
        }

        /**
         * UnSetter for country.
         * @return Builder
         */
        public Builder unsetCountry() {
            country = null;
            return this;
        }

        /**
         * Setter for language.
         * @param  language  String value for language.
         * @return Builder
         */
        public Builder language(String language) {
            this.language = OptionalNullable.of(language);
            return this;
        }

        /**
         * UnSetter for language.
         * @return Builder
         */
        public Builder unsetLanguage() {
            language = null;
            return this;
        }

        /**
         * Setter for displayTimeZone.
         * @param  displayTimeZone  String value for displayTimeZone.
         * @return Builder
         */
        public Builder displayTimeZone(String displayTimeZone) {
            this.displayTimeZone = OptionalNullable.of(displayTimeZone);
            return this;
        }

        /**
         * UnSetter for displayTimeZone.
         * @return Builder
         */
        public Builder unsetDisplayTimeZone() {
            displayTimeZone = null;
            return this;
        }

        /**
         * Setter for minTransferPayout.
         * @param  minTransferPayout  MerchantWebhookMoneyAmount value for minTransferPayout.
         * @return Builder
         */
        public Builder minTransferPayout(MerchantWebhookMoneyAmount minTransferPayout) {
            this.minTransferPayout = minTransferPayout;
            return this;
        }

        /**
         * Setter for minimumChargeAmounts.
         * @param  minimumChargeAmounts  List of MerchantWebhookMoneyAmount value for
         *         minimumChargeAmounts.
         * @return Builder
         */
        public Builder minimumChargeAmounts(
                List<MerchantWebhookMoneyAmount> minimumChargeAmounts) {
            this.minimumChargeAmounts = minimumChargeAmounts;
            return this;
        }

        /**
         * Setter for maximumChargeAmounts.
         * @param  maximumChargeAmounts  List of MerchantWebhookMoneyAmount value for
         *         maximumChargeAmounts.
         * @return Builder
         */
        public Builder maximumChargeAmounts(
                List<MerchantWebhookMoneyAmount> maximumChargeAmounts) {
            this.maximumChargeAmounts = maximumChargeAmounts;
            return this;
        }

        /**
         * Setter for transferSchedule.
         * @param  transferSchedule  MerchantWebhookTransferScheduleConfiguration value for
         *         transferSchedule.
         * @return Builder
         */
        public Builder transferSchedule(
                MerchantWebhookTransferScheduleConfiguration transferSchedule) {
            this.transferSchedule = transferSchedule;
            return this;
        }

        /**
         * Setter for userTransactionsConfiguration.
         * @param  userTransactionsConfiguration  MerchantWebhookUserTransactionsConfiguration value
         *         for userTransactionsConfiguration.
         * @return Builder
         */
        public Builder userTransactionsConfiguration(
                MerchantWebhookUserTransactionsConfiguration userTransactionsConfiguration) {
            this.userTransactionsConfiguration = userTransactionsConfiguration;
            return this;
        }

        /**
         * Setter for recurringTokenConfiguration.
         * @param  recurringTokenConfiguration  MerchantWebhookRecurringTokenConfiguration value for
         *         recurringTokenConfiguration.
         * @return Builder
         */
        public Builder recurringTokenConfiguration(
                MerchantWebhookRecurringTokenConfiguration recurringTokenConfiguration) {
            this.recurringTokenConfiguration = recurringTokenConfiguration;
            return this;
        }

        /**
         * Setter for securityConfiguration.
         * @param  securityConfiguration  MerchantWebhookSecurityConfiguration value for
         *         securityConfiguration.
         * @return Builder
         */
        public Builder securityConfiguration(
                MerchantWebhookSecurityConfiguration securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        /**
         * Setter for checkoutConfiguration.
         * @param  checkoutConfiguration  MerchantWebhookCheckoutConfiguration value for
         *         checkoutConfiguration.
         * @return Builder
         */
        public Builder checkoutConfiguration(
                MerchantWebhookCheckoutConfiguration checkoutConfiguration) {
            this.checkoutConfiguration = checkoutConfiguration;
            return this;
        }

        /**
         * Setter for installmentsConfiguration.
         * @param  installmentsConfiguration  MerchantWebhookInstallmentPlanConfiguration value for
         *         installmentsConfiguration.
         * @return Builder
         */
        public Builder installmentsConfiguration(
                MerchantWebhookInstallmentPlanConfiguration installmentsConfiguration) {
            this.installmentsConfiguration = installmentsConfiguration;
            return this;
        }

        /**
         * Setter for subscriptionPlanConfiguration.
         * @param  subscriptionPlanConfiguration  MerchantWebhookSubscriptionPlanConfiguration value
         *         for subscriptionPlanConfiguration.
         * @return Builder
         */
        public Builder subscriptionPlanConfiguration(
                MerchantWebhookSubscriptionPlanConfiguration subscriptionPlanConfiguration) {
            this.subscriptionPlanConfiguration = subscriptionPlanConfiguration;
            return this;
        }

        /**
         * Setter for cardBrandPercentFees.
         * @param  cardBrandPercentFees  MerchantWebhookCardBrandPercentFees value for
         *         cardBrandPercentFees.
         * @return Builder
         */
        public Builder cardBrandPercentFees(
                MerchantWebhookCardBrandPercentFees cardBrandPercentFees) {
            this.cardBrandPercentFees = cardBrandPercentFees;
            return this;
        }

        /**
         * Setter for subscriptionConfiguration.
         * @param  subscriptionConfiguration  MerchantWebhookSubscriptionConfiguration value for
         *         subscriptionConfiguration.
         * @return Builder
         */
        public Builder subscriptionConfiguration(
                MerchantWebhookSubscriptionConfiguration subscriptionConfiguration) {
            this.subscriptionConfiguration = subscriptionConfiguration;
            return this;
        }

        /**
         * Setter for customerManagementConfiguration.
         * @param  customerManagementConfiguration  MerchantWebhookCustomerManagementConfiguration
         *         value for customerManagementConfiguration.
         * @return Builder
         */
        public Builder customerManagementConfiguration(
                MerchantWebhookCustomerManagementConfiguration customerManagementConfiguration) {
            this.customerManagementConfiguration = customerManagementConfiguration;
            return this;
        }

        /**
         * Setter for descriptorProvidedConfiguration.
         * @param  descriptorProvidedConfiguration  Boolean value for
         *         descriptorProvidedConfiguration.
         * @return Builder
         */
        public Builder descriptorProvidedConfiguration(Boolean descriptorProvidedConfiguration) {
            this.descriptorProvidedConfiguration =
                    OptionalNullable.of(descriptorProvidedConfiguration);
            return this;
        }

        /**
         * UnSetter for descriptorProvidedConfiguration.
         * @return Builder
         */
        public Builder unsetDescriptorProvidedConfiguration() {
            descriptorProvidedConfiguration = null;
            return this;
        }

        /**
         * Setter for cardConfiguration.
         * @param  cardConfiguration  MerchantWebhookCardConfiguration value for cardConfiguration.
         * @return Builder
         */
        public Builder cardConfiguration(MerchantWebhookCardConfiguration cardConfiguration) {
            this.cardConfiguration = cardConfiguration;
            return this;
        }

        /**
         * Setter for qrScanConfiguration.
         * @param  qrScanConfiguration  MerchantWebhookQrScanConfiguration value for
         *         qrScanConfiguration.
         * @return Builder
         */
        public Builder qrScanConfiguration(
                MerchantWebhookQrScanConfiguration qrScanConfiguration) {
            this.qrScanConfiguration = qrScanConfiguration;
            return this;
        }

        /**
         * Setter for convenienceConfiguration.
         * @param  convenienceConfiguration  MerchantWebhookConvenienceConfiguration value for
         *         convenienceConfiguration.
         * @return Builder
         */
        public Builder convenienceConfiguration(
                MerchantWebhookConvenienceConfiguration convenienceConfiguration) {
            this.convenienceConfiguration = convenienceConfiguration;
            return this;
        }

        /**
         * Setter for paidyConfiguration.
         * @param  paidyConfiguration  MerchantWebhookPaidyConfiguration value for
         *         paidyConfiguration.
         * @return Builder
         */
        public Builder paidyConfiguration(MerchantWebhookPaidyConfiguration paidyConfiguration) {
            this.paidyConfiguration = paidyConfiguration;
            return this;
        }

        /**
         * Setter for qrMerchantConfiguration.
         * @param  qrMerchantConfiguration  MerchantWebhookQrMerchantConfiguration value for
         *         qrMerchantConfiguration.
         * @return Builder
         */
        public Builder qrMerchantConfiguration(
                MerchantWebhookQrMerchantConfiguration qrMerchantConfiguration) {
            this.qrMerchantConfiguration = qrMerchantConfiguration;
            return this;
        }

        /**
         * Setter for onlineConfiguration.
         * @param  onlineConfiguration  MerchantWebhookOnlineConfiguration value for
         *         onlineConfiguration.
         * @return Builder
         */
        public Builder onlineConfiguration(
                MerchantWebhookOnlineConfiguration onlineConfiguration) {
            this.onlineConfiguration = onlineConfiguration;
            return this;
        }

        /**
         * Setter for bankTransferConfiguration.
         * @param  bankTransferConfiguration  MerchantWebhookBankTransferConfiguration value for
         *         bankTransferConfiguration.
         * @return Builder
         */
        public Builder bankTransferConfiguration(
                MerchantWebhookBankTransferConfiguration bankTransferConfiguration) {
            this.bankTransferConfiguration = bankTransferConfiguration;
            return this;
        }

        /**
         * Setter for platformCredentialsEnabled.
         * @param  platformCredentialsEnabled  Boolean value for platformCredentialsEnabled.
         * @return Builder
         */
        public Builder platformCredentialsEnabled(Boolean platformCredentialsEnabled) {
            this.platformCredentialsEnabled = OptionalNullable.of(platformCredentialsEnabled);
            return this;
        }

        /**
         * UnSetter for platformCredentialsEnabled.
         * @return Builder
         */
        public Builder unsetPlatformCredentialsEnabled() {
            platformCredentialsEnabled = null;
            return this;
        }

        /**
         * Setter for taggedPlatformCredentialsEnabled.
         * @param  taggedPlatformCredentialsEnabled  Boolean value for
         *         taggedPlatformCredentialsEnabled.
         * @return Builder
         */
        public Builder taggedPlatformCredentialsEnabled(
                Boolean taggedPlatformCredentialsEnabled) {
            this.taggedPlatformCredentialsEnabled =
                    OptionalNullable.of(taggedPlatformCredentialsEnabled);
            return this;
        }

        /**
         * UnSetter for taggedPlatformCredentialsEnabled.
         * @return Builder
         */
        public Builder unsetTaggedPlatformCredentialsEnabled() {
            taggedPlatformCredentialsEnabled = null;
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
         * Builds a new {@link MerchantWebhookConfiguration} object using the set fields.
         * @return {@link MerchantWebhookConfiguration}
         */
        public MerchantWebhookConfiguration build() {
            MerchantWebhookConfiguration model =
                    new MerchantWebhookConfiguration(percentFee, flatFees, logoUrl, country,
                            language, displayTimeZone, minTransferPayout, minimumChargeAmounts,
                            maximumChargeAmounts, transferSchedule, userTransactionsConfiguration,
                            recurringTokenConfiguration, securityConfiguration,
                            checkoutConfiguration, installmentsConfiguration,
                            subscriptionPlanConfiguration, cardBrandPercentFees,
                            subscriptionConfiguration, customerManagementConfiguration,
                            descriptorProvidedConfiguration, cardConfiguration, qrScanConfiguration,
                            convenienceConfiguration, paidyConfiguration, qrMerchantConfiguration,
                            onlineConfiguration, bankTransferConfiguration,
                            platformCredentialsEnabled, taggedPlatformCredentialsEnabled);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
