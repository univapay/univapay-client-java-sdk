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
 * This is a model class for CheckoutBankTransferConfiguration type.
 */
public class CheckoutBankTransferConfiguration {
    private Boolean enabled;
    private CheckoutBankTransferMatchAmount matchAmount;
    private String expiration;
    private ExpirationTimeShift expirationTimeShift;
    private Integer virtualBankAccountsThreshold;
    private Integer virtualBankAccountsFetchCount;
    private String defaultExtensionPeriod;
    private String maximumExtensionPeriod;
    private Boolean automaticExtensionEnabled;
    private Boolean chargeRequestNotificationEnabled;
    private Boolean chargeRequestCanceledNotificationEnabled;
    private Boolean chargeExpiredNotificationEnabled;
    private Boolean depositReceivedNotificationEnabled;
    private Boolean depositInsufficientNotificationEnabled;
    private Boolean depositExceededNotificationEnabled;
    private Boolean extensionNotificationEnabled;
    private String remindNotificationPeriod;
    private Boolean remindNotificationEnabled;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutBankTransferConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  matchAmount  CheckoutBankTransferMatchAmount value for matchAmount.
     * @param  expiration  String value for expiration.
     * @param  expirationTimeShift  ExpirationTimeShift value for expirationTimeShift.
     * @param  virtualBankAccountsThreshold  Integer value for virtualBankAccountsThreshold.
     * @param  virtualBankAccountsFetchCount  Integer value for virtualBankAccountsFetchCount.
     * @param  defaultExtensionPeriod  String value for defaultExtensionPeriod.
     * @param  maximumExtensionPeriod  String value for maximumExtensionPeriod.
     * @param  automaticExtensionEnabled  Boolean value for automaticExtensionEnabled.
     * @param  chargeRequestNotificationEnabled  Boolean value for chargeRequestNotificationEnabled.
     * @param  chargeRequestCanceledNotificationEnabled  Boolean value for
     *         chargeRequestCanceledNotificationEnabled.
     * @param  chargeExpiredNotificationEnabled  Boolean value for chargeExpiredNotificationEnabled.
     * @param  depositReceivedNotificationEnabled  Boolean value for
     *         depositReceivedNotificationEnabled.
     * @param  depositInsufficientNotificationEnabled  Boolean value for
     *         depositInsufficientNotificationEnabled.
     * @param  depositExceededNotificationEnabled  Boolean value for
     *         depositExceededNotificationEnabled.
     * @param  extensionNotificationEnabled  Boolean value for extensionNotificationEnabled.
     * @param  remindNotificationPeriod  String value for remindNotificationPeriod.
     * @param  remindNotificationEnabled  Boolean value for remindNotificationEnabled.
     */
    public CheckoutBankTransferConfiguration(
            Boolean enabled,
            CheckoutBankTransferMatchAmount matchAmount,
            String expiration,
            ExpirationTimeShift expirationTimeShift,
            Integer virtualBankAccountsThreshold,
            Integer virtualBankAccountsFetchCount,
            String defaultExtensionPeriod,
            String maximumExtensionPeriod,
            Boolean automaticExtensionEnabled,
            Boolean chargeRequestNotificationEnabled,
            Boolean chargeRequestCanceledNotificationEnabled,
            Boolean chargeExpiredNotificationEnabled,
            Boolean depositReceivedNotificationEnabled,
            Boolean depositInsufficientNotificationEnabled,
            Boolean depositExceededNotificationEnabled,
            Boolean extensionNotificationEnabled,
            String remindNotificationPeriod,
            Boolean remindNotificationEnabled) {
        this.enabled = enabled;
        this.matchAmount = matchAmount;
        this.expiration = expiration;
        this.expirationTimeShift = expirationTimeShift;
        this.virtualBankAccountsThreshold = virtualBankAccountsThreshold;
        this.virtualBankAccountsFetchCount = virtualBankAccountsFetchCount;
        this.defaultExtensionPeriod = defaultExtensionPeriod;
        this.maximumExtensionPeriod = maximumExtensionPeriod;
        this.automaticExtensionEnabled = automaticExtensionEnabled;
        this.chargeRequestNotificationEnabled = chargeRequestNotificationEnabled;
        this.chargeRequestCanceledNotificationEnabled = chargeRequestCanceledNotificationEnabled;
        this.chargeExpiredNotificationEnabled = chargeExpiredNotificationEnabled;
        this.depositReceivedNotificationEnabled = depositReceivedNotificationEnabled;
        this.depositInsufficientNotificationEnabled = depositInsufficientNotificationEnabled;
        this.depositExceededNotificationEnabled = depositExceededNotificationEnabled;
        this.extensionNotificationEnabled = extensionNotificationEnabled;
        this.remindNotificationPeriod = remindNotificationPeriod;
        this.remindNotificationEnabled = remindNotificationEnabled;
    }

    /**
     * Getter for Enabled.
     * Whether bank transfer payments are enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether bank transfer payments are enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for MatchAmount.
     * Deposit-matching policy applied to bank transfer payments.
     * @return Returns the CheckoutBankTransferMatchAmount
     */
    @JsonGetter("match_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutBankTransferMatchAmount getMatchAmount() {
        return matchAmount;
    }

    /**
     * Setter for MatchAmount.
     * Deposit-matching policy applied to bank transfer payments.
     * @param matchAmount Value for CheckoutBankTransferMatchAmount
     */
    @JsonSetter("match_amount")
    public void setMatchAmount(CheckoutBankTransferMatchAmount matchAmount) {
        this.matchAmount = matchAmount;
    }

    /**
     * Getter for Expiration.
     * ISO-8601 duration before a bank transfer payment expires.
     * @return Returns the String
     */
    @JsonGetter("expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiration() {
        return expiration;
    }

    /**
     * Setter for Expiration.
     * ISO-8601 duration before a bank transfer payment expires.
     * @param expiration Value for String
     */
    @JsonSetter("expiration")
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * Getter for ExpirationTimeShift.
     * Time-of-day override applied when calculating expirations, shared by convenience-store and
     * bank-transfer configuration.
     * @return Returns the ExpirationTimeShift
     */
    @JsonGetter("expiration_time_shift")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExpirationTimeShift getExpirationTimeShift() {
        return expirationTimeShift;
    }

    /**
     * Setter for ExpirationTimeShift.
     * Time-of-day override applied when calculating expirations, shared by convenience-store and
     * bank-transfer configuration.
     * @param expirationTimeShift Value for ExpirationTimeShift
     */
    @JsonSetter("expiration_time_shift")
    public void setExpirationTimeShift(ExpirationTimeShift expirationTimeShift) {
        this.expirationTimeShift = expirationTimeShift;
    }

    /**
     * Getter for VirtualBankAccountsThreshold.
     * Number of unused virtual bank accounts that triggers provisioning of additional accounts.
     * @return Returns the Integer
     */
    @JsonGetter("virtual_bank_accounts_threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getVirtualBankAccountsThreshold() {
        return virtualBankAccountsThreshold;
    }

    /**
     * Setter for VirtualBankAccountsThreshold.
     * Number of unused virtual bank accounts that triggers provisioning of additional accounts.
     * @param virtualBankAccountsThreshold Value for Integer
     */
    @JsonSetter("virtual_bank_accounts_threshold")
    public void setVirtualBankAccountsThreshold(Integer virtualBankAccountsThreshold) {
        this.virtualBankAccountsThreshold = virtualBankAccountsThreshold;
    }

    /**
     * Getter for VirtualBankAccountsFetchCount.
     * Number of virtual bank accounts provisioned per replenishment.
     * @return Returns the Integer
     */
    @JsonGetter("virtual_bank_accounts_fetch_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getVirtualBankAccountsFetchCount() {
        return virtualBankAccountsFetchCount;
    }

    /**
     * Setter for VirtualBankAccountsFetchCount.
     * Number of virtual bank accounts provisioned per replenishment.
     * @param virtualBankAccountsFetchCount Value for Integer
     */
    @JsonSetter("virtual_bank_accounts_fetch_count")
    public void setVirtualBankAccountsFetchCount(Integer virtualBankAccountsFetchCount) {
        this.virtualBankAccountsFetchCount = virtualBankAccountsFetchCount;
    }

    /**
     * Getter for DefaultExtensionPeriod.
     * ISO-8601 duration by which a payment deadline is extended by default.
     * @return Returns the String
     */
    @JsonGetter("default_extension_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultExtensionPeriod() {
        return defaultExtensionPeriod;
    }

    /**
     * Setter for DefaultExtensionPeriod.
     * ISO-8601 duration by which a payment deadline is extended by default.
     * @param defaultExtensionPeriod Value for String
     */
    @JsonSetter("default_extension_period")
    public void setDefaultExtensionPeriod(String defaultExtensionPeriod) {
        this.defaultExtensionPeriod = defaultExtensionPeriod;
    }

    /**
     * Getter for MaximumExtensionPeriod.
     * ISO-8601 duration for the maximum allowed extension.
     * @return Returns the String
     */
    @JsonGetter("maximum_extension_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaximumExtensionPeriod() {
        return maximumExtensionPeriod;
    }

    /**
     * Setter for MaximumExtensionPeriod.
     * ISO-8601 duration for the maximum allowed extension.
     * @param maximumExtensionPeriod Value for String
     */
    @JsonSetter("maximum_extension_period")
    public void setMaximumExtensionPeriod(String maximumExtensionPeriod) {
        this.maximumExtensionPeriod = maximumExtensionPeriod;
    }

    /**
     * Getter for AutomaticExtensionEnabled.
     * Whether payment deadlines are extended automatically.
     * @return Returns the Boolean
     */
    @JsonGetter("automatic_extension_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutomaticExtensionEnabled() {
        return automaticExtensionEnabled;
    }

    /**
     * Setter for AutomaticExtensionEnabled.
     * Whether payment deadlines are extended automatically.
     * @param automaticExtensionEnabled Value for Boolean
     */
    @JsonSetter("automatic_extension_enabled")
    public void setAutomaticExtensionEnabled(Boolean automaticExtensionEnabled) {
        this.automaticExtensionEnabled = automaticExtensionEnabled;
    }

    /**
     * Getter for ChargeRequestNotificationEnabled.
     * Whether a notification is sent when a bank transfer charge is requested.
     * @return Returns the Boolean
     */
    @JsonGetter("charge_request_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getChargeRequestNotificationEnabled() {
        return chargeRequestNotificationEnabled;
    }

    /**
     * Setter for ChargeRequestNotificationEnabled.
     * Whether a notification is sent when a bank transfer charge is requested.
     * @param chargeRequestNotificationEnabled Value for Boolean
     */
    @JsonSetter("charge_request_notification_enabled")
    public void setChargeRequestNotificationEnabled(Boolean chargeRequestNotificationEnabled) {
        this.chargeRequestNotificationEnabled = chargeRequestNotificationEnabled;
    }

    /**
     * Getter for ChargeRequestCanceledNotificationEnabled.
     * Whether a notification is sent when a requested bank transfer charge is canceled.
     * @return Returns the Boolean
     */
    @JsonGetter("charge_request_canceled_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getChargeRequestCanceledNotificationEnabled() {
        return chargeRequestCanceledNotificationEnabled;
    }

    /**
     * Setter for ChargeRequestCanceledNotificationEnabled.
     * Whether a notification is sent when a requested bank transfer charge is canceled.
     * @param chargeRequestCanceledNotificationEnabled Value for Boolean
     */
    @JsonSetter("charge_request_canceled_notification_enabled")
    public void setChargeRequestCanceledNotificationEnabled(Boolean chargeRequestCanceledNotificationEnabled) {
        this.chargeRequestCanceledNotificationEnabled = chargeRequestCanceledNotificationEnabled;
    }

    /**
     * Getter for ChargeExpiredNotificationEnabled.
     * Whether a notification is sent when a bank transfer charge expires.
     * @return Returns the Boolean
     */
    @JsonGetter("charge_expired_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getChargeExpiredNotificationEnabled() {
        return chargeExpiredNotificationEnabled;
    }

    /**
     * Setter for ChargeExpiredNotificationEnabled.
     * Whether a notification is sent when a bank transfer charge expires.
     * @param chargeExpiredNotificationEnabled Value for Boolean
     */
    @JsonSetter("charge_expired_notification_enabled")
    public void setChargeExpiredNotificationEnabled(Boolean chargeExpiredNotificationEnabled) {
        this.chargeExpiredNotificationEnabled = chargeExpiredNotificationEnabled;
    }

    /**
     * Getter for DepositReceivedNotificationEnabled.
     * Whether a notification is sent when a deposit is received.
     * @return Returns the Boolean
     */
    @JsonGetter("deposit_received_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDepositReceivedNotificationEnabled() {
        return depositReceivedNotificationEnabled;
    }

    /**
     * Setter for DepositReceivedNotificationEnabled.
     * Whether a notification is sent when a deposit is received.
     * @param depositReceivedNotificationEnabled Value for Boolean
     */
    @JsonSetter("deposit_received_notification_enabled")
    public void setDepositReceivedNotificationEnabled(Boolean depositReceivedNotificationEnabled) {
        this.depositReceivedNotificationEnabled = depositReceivedNotificationEnabled;
    }

    /**
     * Getter for DepositInsufficientNotificationEnabled.
     * Whether a notification is sent when a deposit is insufficient.
     * @return Returns the Boolean
     */
    @JsonGetter("deposit_insufficient_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDepositInsufficientNotificationEnabled() {
        return depositInsufficientNotificationEnabled;
    }

    /**
     * Setter for DepositInsufficientNotificationEnabled.
     * Whether a notification is sent when a deposit is insufficient.
     * @param depositInsufficientNotificationEnabled Value for Boolean
     */
    @JsonSetter("deposit_insufficient_notification_enabled")
    public void setDepositInsufficientNotificationEnabled(Boolean depositInsufficientNotificationEnabled) {
        this.depositInsufficientNotificationEnabled = depositInsufficientNotificationEnabled;
    }

    /**
     * Getter for DepositExceededNotificationEnabled.
     * Whether a notification is sent when a deposit exceeds the requested amount.
     * @return Returns the Boolean
     */
    @JsonGetter("deposit_exceeded_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDepositExceededNotificationEnabled() {
        return depositExceededNotificationEnabled;
    }

    /**
     * Setter for DepositExceededNotificationEnabled.
     * Whether a notification is sent when a deposit exceeds the requested amount.
     * @param depositExceededNotificationEnabled Value for Boolean
     */
    @JsonSetter("deposit_exceeded_notification_enabled")
    public void setDepositExceededNotificationEnabled(Boolean depositExceededNotificationEnabled) {
        this.depositExceededNotificationEnabled = depositExceededNotificationEnabled;
    }

    /**
     * Getter for ExtensionNotificationEnabled.
     * Whether a notification is sent when a payment deadline is extended.
     * @return Returns the Boolean
     */
    @JsonGetter("extension_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExtensionNotificationEnabled() {
        return extensionNotificationEnabled;
    }

    /**
     * Setter for ExtensionNotificationEnabled.
     * Whether a notification is sent when a payment deadline is extended.
     * @param extensionNotificationEnabled Value for Boolean
     */
    @JsonSetter("extension_notification_enabled")
    public void setExtensionNotificationEnabled(Boolean extensionNotificationEnabled) {
        this.extensionNotificationEnabled = extensionNotificationEnabled;
    }

    /**
     * Getter for RemindNotificationPeriod.
     * ISO-8601 duration before expiration at which a reminder notification is sent.
     * @return Returns the String
     */
    @JsonGetter("remind_notification_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRemindNotificationPeriod() {
        return remindNotificationPeriod;
    }

    /**
     * Setter for RemindNotificationPeriod.
     * ISO-8601 duration before expiration at which a reminder notification is sent.
     * @param remindNotificationPeriod Value for String
     */
    @JsonSetter("remind_notification_period")
    public void setRemindNotificationPeriod(String remindNotificationPeriod) {
        this.remindNotificationPeriod = remindNotificationPeriod;
    }

    /**
     * Getter for RemindNotificationEnabled.
     * Whether reminder notifications are sent before a payment deadline.
     * @return Returns the Boolean
     */
    @JsonGetter("remind_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRemindNotificationEnabled() {
        return remindNotificationEnabled;
    }

    /**
     * Setter for RemindNotificationEnabled.
     * Whether reminder notifications are sent before a payment deadline.
     * @param remindNotificationEnabled Value for Boolean
     */
    @JsonSetter("remind_notification_enabled")
    public void setRemindNotificationEnabled(Boolean remindNotificationEnabled) {
        this.remindNotificationEnabled = remindNotificationEnabled;
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
     * Converts this CheckoutBankTransferConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutBankTransferConfiguration [" + "enabled=" + enabled + ", matchAmount="
                + matchAmount + ", expiration=" + expiration + ", expirationTimeShift="
                + expirationTimeShift + ", virtualBankAccountsThreshold="
                + virtualBankAccountsThreshold + ", virtualBankAccountsFetchCount="
                + virtualBankAccountsFetchCount + ", defaultExtensionPeriod="
                + defaultExtensionPeriod + ", maximumExtensionPeriod=" + maximumExtensionPeriod
                + ", automaticExtensionEnabled=" + automaticExtensionEnabled
                + ", chargeRequestNotificationEnabled=" + chargeRequestNotificationEnabled
                + ", chargeRequestCanceledNotificationEnabled="
                + chargeRequestCanceledNotificationEnabled + ", chargeExpiredNotificationEnabled="
                + chargeExpiredNotificationEnabled + ", depositReceivedNotificationEnabled="
                + depositReceivedNotificationEnabled + ", depositInsufficientNotificationEnabled="
                + depositInsufficientNotificationEnabled + ", depositExceededNotificationEnabled="
                + depositExceededNotificationEnabled + ", extensionNotificationEnabled="
                + extensionNotificationEnabled + ", remindNotificationPeriod="
                + remindNotificationPeriod + ", remindNotificationEnabled="
                + remindNotificationEnabled + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link CheckoutBankTransferConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutBankTransferConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled())
                .matchAmount(getMatchAmount())
                .expiration(getExpiration())
                .expirationTimeShift(getExpirationTimeShift())
                .virtualBankAccountsThreshold(getVirtualBankAccountsThreshold())
                .virtualBankAccountsFetchCount(getVirtualBankAccountsFetchCount())
                .defaultExtensionPeriod(getDefaultExtensionPeriod())
                .maximumExtensionPeriod(getMaximumExtensionPeriod())
                .automaticExtensionEnabled(getAutomaticExtensionEnabled())
                .chargeRequestNotificationEnabled(getChargeRequestNotificationEnabled())
                .chargeRequestCanceledNotificationEnabled(getChargeRequestCanceledNotificationEnabled())
                .chargeExpiredNotificationEnabled(getChargeExpiredNotificationEnabled())
                .depositReceivedNotificationEnabled(getDepositReceivedNotificationEnabled())
                .depositInsufficientNotificationEnabled(getDepositInsufficientNotificationEnabled())
                .depositExceededNotificationEnabled(getDepositExceededNotificationEnabled())
                .extensionNotificationEnabled(getExtensionNotificationEnabled())
                .remindNotificationPeriod(getRemindNotificationPeriod())
                .remindNotificationEnabled(getRemindNotificationEnabled());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutBankTransferConfiguration}.
     */
    public static class Builder {
        private Boolean enabled;
        private CheckoutBankTransferMatchAmount matchAmount;
        private String expiration;
        private ExpirationTimeShift expirationTimeShift;
        private Integer virtualBankAccountsThreshold;
        private Integer virtualBankAccountsFetchCount;
        private String defaultExtensionPeriod;
        private String maximumExtensionPeriod;
        private Boolean automaticExtensionEnabled;
        private Boolean chargeRequestNotificationEnabled;
        private Boolean chargeRequestCanceledNotificationEnabled;
        private Boolean chargeExpiredNotificationEnabled;
        private Boolean depositReceivedNotificationEnabled;
        private Boolean depositInsufficientNotificationEnabled;
        private Boolean depositExceededNotificationEnabled;
        private Boolean extensionNotificationEnabled;
        private String remindNotificationPeriod;
        private Boolean remindNotificationEnabled;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for matchAmount.
         * @param  matchAmount  CheckoutBankTransferMatchAmount value for matchAmount.
         * @return Builder
         */
        public Builder matchAmount(CheckoutBankTransferMatchAmount matchAmount) {
            this.matchAmount = matchAmount;
            return this;
        }

        /**
         * Setter for expiration.
         * @param  expiration  String value for expiration.
         * @return Builder
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * Setter for expirationTimeShift.
         * @param  expirationTimeShift  ExpirationTimeShift value for expirationTimeShift.
         * @return Builder
         */
        public Builder expirationTimeShift(ExpirationTimeShift expirationTimeShift) {
            this.expirationTimeShift = expirationTimeShift;
            return this;
        }

        /**
         * Setter for virtualBankAccountsThreshold.
         * @param  virtualBankAccountsThreshold  Integer value for virtualBankAccountsThreshold.
         * @return Builder
         */
        public Builder virtualBankAccountsThreshold(Integer virtualBankAccountsThreshold) {
            this.virtualBankAccountsThreshold = virtualBankAccountsThreshold;
            return this;
        }

        /**
         * Setter for virtualBankAccountsFetchCount.
         * @param  virtualBankAccountsFetchCount  Integer value for virtualBankAccountsFetchCount.
         * @return Builder
         */
        public Builder virtualBankAccountsFetchCount(Integer virtualBankAccountsFetchCount) {
            this.virtualBankAccountsFetchCount = virtualBankAccountsFetchCount;
            return this;
        }

        /**
         * Setter for defaultExtensionPeriod.
         * @param  defaultExtensionPeriod  String value for defaultExtensionPeriod.
         * @return Builder
         */
        public Builder defaultExtensionPeriod(String defaultExtensionPeriod) {
            this.defaultExtensionPeriod = defaultExtensionPeriod;
            return this;
        }

        /**
         * Setter for maximumExtensionPeriod.
         * @param  maximumExtensionPeriod  String value for maximumExtensionPeriod.
         * @return Builder
         */
        public Builder maximumExtensionPeriod(String maximumExtensionPeriod) {
            this.maximumExtensionPeriod = maximumExtensionPeriod;
            return this;
        }

        /**
         * Setter for automaticExtensionEnabled.
         * @param  automaticExtensionEnabled  Boolean value for automaticExtensionEnabled.
         * @return Builder
         */
        public Builder automaticExtensionEnabled(Boolean automaticExtensionEnabled) {
            this.automaticExtensionEnabled = automaticExtensionEnabled;
            return this;
        }

        /**
         * Setter for chargeRequestNotificationEnabled.
         * @param  chargeRequestNotificationEnabled  Boolean value for
         *         chargeRequestNotificationEnabled.
         * @return Builder
         */
        public Builder chargeRequestNotificationEnabled(
                Boolean chargeRequestNotificationEnabled) {
            this.chargeRequestNotificationEnabled = chargeRequestNotificationEnabled;
            return this;
        }

        /**
         * Setter for chargeRequestCanceledNotificationEnabled.
         * @param  chargeRequestCanceledNotificationEnabled  Boolean value for
         *         chargeRequestCanceledNotificationEnabled.
         * @return Builder
         */
        public Builder chargeRequestCanceledNotificationEnabled(
                Boolean chargeRequestCanceledNotificationEnabled) {
            this.chargeRequestCanceledNotificationEnabled =
                    chargeRequestCanceledNotificationEnabled;
            return this;
        }

        /**
         * Setter for chargeExpiredNotificationEnabled.
         * @param  chargeExpiredNotificationEnabled  Boolean value for
         *         chargeExpiredNotificationEnabled.
         * @return Builder
         */
        public Builder chargeExpiredNotificationEnabled(
                Boolean chargeExpiredNotificationEnabled) {
            this.chargeExpiredNotificationEnabled = chargeExpiredNotificationEnabled;
            return this;
        }

        /**
         * Setter for depositReceivedNotificationEnabled.
         * @param  depositReceivedNotificationEnabled  Boolean value for
         *         depositReceivedNotificationEnabled.
         * @return Builder
         */
        public Builder depositReceivedNotificationEnabled(
                Boolean depositReceivedNotificationEnabled) {
            this.depositReceivedNotificationEnabled = depositReceivedNotificationEnabled;
            return this;
        }

        /**
         * Setter for depositInsufficientNotificationEnabled.
         * @param  depositInsufficientNotificationEnabled  Boolean value for
         *         depositInsufficientNotificationEnabled.
         * @return Builder
         */
        public Builder depositInsufficientNotificationEnabled(
                Boolean depositInsufficientNotificationEnabled) {
            this.depositInsufficientNotificationEnabled = depositInsufficientNotificationEnabled;
            return this;
        }

        /**
         * Setter for depositExceededNotificationEnabled.
         * @param  depositExceededNotificationEnabled  Boolean value for
         *         depositExceededNotificationEnabled.
         * @return Builder
         */
        public Builder depositExceededNotificationEnabled(
                Boolean depositExceededNotificationEnabled) {
            this.depositExceededNotificationEnabled = depositExceededNotificationEnabled;
            return this;
        }

        /**
         * Setter for extensionNotificationEnabled.
         * @param  extensionNotificationEnabled  Boolean value for extensionNotificationEnabled.
         * @return Builder
         */
        public Builder extensionNotificationEnabled(Boolean extensionNotificationEnabled) {
            this.extensionNotificationEnabled = extensionNotificationEnabled;
            return this;
        }

        /**
         * Setter for remindNotificationPeriod.
         * @param  remindNotificationPeriod  String value for remindNotificationPeriod.
         * @return Builder
         */
        public Builder remindNotificationPeriod(String remindNotificationPeriod) {
            this.remindNotificationPeriod = remindNotificationPeriod;
            return this;
        }

        /**
         * Setter for remindNotificationEnabled.
         * @param  remindNotificationEnabled  Boolean value for remindNotificationEnabled.
         * @return Builder
         */
        public Builder remindNotificationEnabled(Boolean remindNotificationEnabled) {
            this.remindNotificationEnabled = remindNotificationEnabled;
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
         * Builds a new {@link CheckoutBankTransferConfiguration} object using the set fields.
         * @return {@link CheckoutBankTransferConfiguration}
         */
        public CheckoutBankTransferConfiguration build() {
            CheckoutBankTransferConfiguration model =
                    new CheckoutBankTransferConfiguration(enabled, matchAmount, expiration,
                            expirationTimeShift, virtualBankAccountsThreshold,
                            virtualBankAccountsFetchCount, defaultExtensionPeriod,
                            maximumExtensionPeriod, automaticExtensionEnabled,
                            chargeRequestNotificationEnabled,
                            chargeRequestCanceledNotificationEnabled,
                            chargeExpiredNotificationEnabled, depositReceivedNotificationEnabled,
                            depositInsufficientNotificationEnabled,
                            depositExceededNotificationEnabled, extensionNotificationEnabled,
                            remindNotificationPeriod, remindNotificationEnabled);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
