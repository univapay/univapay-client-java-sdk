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
 * This is a model class for MerchantWebhookBankTransferConfiguration type.
 */
public class MerchantWebhookBankTransferConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<Boolean> matchAmount;
    private OptionalNullable<String> expiration;
    private OptionalNullable<Integer> virtualBankAccountsThreshold;
    private OptionalNullable<Integer> virtualBankAccountsFetchCount;
    private OptionalNullable<String> defaultExtensionPeriod;
    private OptionalNullable<String> maximumExtensionPeriod;
    private OptionalNullable<Boolean> automaticExtensionEnabled;
    private OptionalNullable<Boolean> chargeRequestNotificationEnabled;
    private OptionalNullable<Boolean> chargeRequestCanceledNotificationEnabled;
    private OptionalNullable<Boolean> chargeExpiredNotificationEnabled;
    private OptionalNullable<Boolean> depositReceivedNotificationEnabled;
    private OptionalNullable<Boolean> depositInsufficientNotificationEnabled;
    private OptionalNullable<Boolean> depositExceededNotificationEnabled;
    private OptionalNullable<Boolean> extensionNotificationEnabled;
    private OptionalNullable<String> remindNotificationPeriod;
    private OptionalNullable<Boolean> remindNotificationEnabled;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookBankTransferConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  matchAmount  Boolean value for matchAmount.
     * @param  expiration  String value for expiration.
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
    public MerchantWebhookBankTransferConfiguration(
            Boolean enabled,
            Boolean matchAmount,
            String expiration,
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
        this.enabled = OptionalNullable.of(enabled);
        this.matchAmount = OptionalNullable.of(matchAmount);
        this.expiration = OptionalNullable.of(expiration);
        this.virtualBankAccountsThreshold = OptionalNullable.of(virtualBankAccountsThreshold);
        this.virtualBankAccountsFetchCount = OptionalNullable.of(virtualBankAccountsFetchCount);
        this.defaultExtensionPeriod = OptionalNullable.of(defaultExtensionPeriod);
        this.maximumExtensionPeriod = OptionalNullable.of(maximumExtensionPeriod);
        this.automaticExtensionEnabled = OptionalNullable.of(automaticExtensionEnabled);
        this.chargeRequestNotificationEnabled =
                OptionalNullable.of(chargeRequestNotificationEnabled);
        this.chargeRequestCanceledNotificationEnabled =
                OptionalNullable.of(chargeRequestCanceledNotificationEnabled);
        this.chargeExpiredNotificationEnabled =
                OptionalNullable.of(chargeExpiredNotificationEnabled);
        this.depositReceivedNotificationEnabled =
                OptionalNullable.of(depositReceivedNotificationEnabled);
        this.depositInsufficientNotificationEnabled =
                OptionalNullable.of(depositInsufficientNotificationEnabled);
        this.depositExceededNotificationEnabled =
                OptionalNullable.of(depositExceededNotificationEnabled);
        this.extensionNotificationEnabled = OptionalNullable.of(extensionNotificationEnabled);
        this.remindNotificationPeriod = OptionalNullable.of(remindNotificationPeriod);
        this.remindNotificationEnabled = OptionalNullable.of(remindNotificationEnabled);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  matchAmount  Boolean value for matchAmount.
     * @param  expiration  String value for expiration.
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

    protected MerchantWebhookBankTransferConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<Boolean> matchAmount, OptionalNullable<String> expiration,
            OptionalNullable<Integer> virtualBankAccountsThreshold,
            OptionalNullable<Integer> virtualBankAccountsFetchCount,
            OptionalNullable<String> defaultExtensionPeriod,
            OptionalNullable<String> maximumExtensionPeriod,
            OptionalNullable<Boolean> automaticExtensionEnabled,
            OptionalNullable<Boolean> chargeRequestNotificationEnabled,
            OptionalNullable<Boolean> chargeRequestCanceledNotificationEnabled,
            OptionalNullable<Boolean> chargeExpiredNotificationEnabled,
            OptionalNullable<Boolean> depositReceivedNotificationEnabled,
            OptionalNullable<Boolean> depositInsufficientNotificationEnabled,
            OptionalNullable<Boolean> depositExceededNotificationEnabled,
            OptionalNullable<Boolean> extensionNotificationEnabled,
            OptionalNullable<String> remindNotificationPeriod,
            OptionalNullable<Boolean> remindNotificationEnabled) {
        this.enabled = enabled;
        this.matchAmount = matchAmount;
        this.expiration = expiration;
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
     * Internal Getter for Enabled.
     * Enables bank transfer payments.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetEnabled() {
        return this.enabled;
    }

    /**
     * Getter for Enabled.
     * Enables bank transfer payments.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables bank transfer payments.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables bank transfer payments.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for MatchAmount.
     * Requires the received deposit amount to exactly match the charge amount.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("match_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetMatchAmount() {
        return this.matchAmount;
    }

    /**
     * Getter for MatchAmount.
     * Requires the received deposit amount to exactly match the charge amount.
     * @return Returns the Boolean
     */
    public Boolean getMatchAmount() {
        return OptionalNullable.getFrom(matchAmount);
    }

    /**
     * Setter for MatchAmount.
     * Requires the received deposit amount to exactly match the charge amount.
     * @param matchAmount Value for Boolean
     */
    @JsonSetter("match_amount")
    public void setMatchAmount(Boolean matchAmount) {
        this.matchAmount = OptionalNullable.of(matchAmount);
    }

    /**
     * UnSetter for MatchAmount.
     * Requires the received deposit amount to exactly match the charge amount.
     */
    public void unsetMatchAmount() {
        matchAmount = null;
    }

    /**
     * Internal Getter for Expiration.
     * ISO-8601 duration before the charge expires.
     * @return Returns the Internal String
     */
    @JsonGetter("expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpiration() {
        return this.expiration;
    }

    /**
     * Getter for Expiration.
     * ISO-8601 duration before the charge expires.
     * @return Returns the String
     */
    public String getExpiration() {
        return OptionalNullable.getFrom(expiration);
    }

    /**
     * Setter for Expiration.
     * ISO-8601 duration before the charge expires.
     * @param expiration Value for String
     */
    @JsonSetter("expiration")
    public void setExpiration(String expiration) {
        this.expiration = OptionalNullable.of(expiration);
    }

    /**
     * UnSetter for Expiration.
     * ISO-8601 duration before the charge expires.
     */
    public void unsetExpiration() {
        expiration = null;
    }

    /**
     * Internal Getter for VirtualBankAccountsThreshold.
     * Threshold for provisioning additional virtual bank accounts.
     * @return Returns the Internal Integer
     */
    @JsonGetter("virtual_bank_accounts_threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetVirtualBankAccountsThreshold() {
        return this.virtualBankAccountsThreshold;
    }

    /**
     * Getter for VirtualBankAccountsThreshold.
     * Threshold for provisioning additional virtual bank accounts.
     * @return Returns the Integer
     */
    public Integer getVirtualBankAccountsThreshold() {
        return OptionalNullable.getFrom(virtualBankAccountsThreshold);
    }

    /**
     * Setter for VirtualBankAccountsThreshold.
     * Threshold for provisioning additional virtual bank accounts.
     * @param virtualBankAccountsThreshold Value for Integer
     */
    @JsonSetter("virtual_bank_accounts_threshold")
    public void setVirtualBankAccountsThreshold(Integer virtualBankAccountsThreshold) {
        this.virtualBankAccountsThreshold = OptionalNullable.of(virtualBankAccountsThreshold);
    }

    /**
     * UnSetter for VirtualBankAccountsThreshold.
     * Threshold for provisioning additional virtual bank accounts.
     */
    public void unsetVirtualBankAccountsThreshold() {
        virtualBankAccountsThreshold = null;
    }

    /**
     * Internal Getter for VirtualBankAccountsFetchCount.
     * Number of virtual bank accounts fetched per replenishment batch.
     * @return Returns the Internal Integer
     */
    @JsonGetter("virtual_bank_accounts_fetch_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetVirtualBankAccountsFetchCount() {
        return this.virtualBankAccountsFetchCount;
    }

    /**
     * Getter for VirtualBankAccountsFetchCount.
     * Number of virtual bank accounts fetched per replenishment batch.
     * @return Returns the Integer
     */
    public Integer getVirtualBankAccountsFetchCount() {
        return OptionalNullable.getFrom(virtualBankAccountsFetchCount);
    }

    /**
     * Setter for VirtualBankAccountsFetchCount.
     * Number of virtual bank accounts fetched per replenishment batch.
     * @param virtualBankAccountsFetchCount Value for Integer
     */
    @JsonSetter("virtual_bank_accounts_fetch_count")
    public void setVirtualBankAccountsFetchCount(Integer virtualBankAccountsFetchCount) {
        this.virtualBankAccountsFetchCount = OptionalNullable.of(virtualBankAccountsFetchCount);
    }

    /**
     * UnSetter for VirtualBankAccountsFetchCount.
     * Number of virtual bank accounts fetched per replenishment batch.
     */
    public void unsetVirtualBankAccountsFetchCount() {
        virtualBankAccountsFetchCount = null;
    }

    /**
     * Internal Getter for DefaultExtensionPeriod.
     * Default ISO-8601 extension period applied to eligible charges.
     * @return Returns the Internal String
     */
    @JsonGetter("default_extension_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDefaultExtensionPeriod() {
        return this.defaultExtensionPeriod;
    }

    /**
     * Getter for DefaultExtensionPeriod.
     * Default ISO-8601 extension period applied to eligible charges.
     * @return Returns the String
     */
    public String getDefaultExtensionPeriod() {
        return OptionalNullable.getFrom(defaultExtensionPeriod);
    }

    /**
     * Setter for DefaultExtensionPeriod.
     * Default ISO-8601 extension period applied to eligible charges.
     * @param defaultExtensionPeriod Value for String
     */
    @JsonSetter("default_extension_period")
    public void setDefaultExtensionPeriod(String defaultExtensionPeriod) {
        this.defaultExtensionPeriod = OptionalNullable.of(defaultExtensionPeriod);
    }

    /**
     * UnSetter for DefaultExtensionPeriod.
     * Default ISO-8601 extension period applied to eligible charges.
     */
    public void unsetDefaultExtensionPeriod() {
        defaultExtensionPeriod = null;
    }

    /**
     * Internal Getter for MaximumExtensionPeriod.
     * Maximum ISO-8601 extension period allowed for a charge.
     * @return Returns the Internal String
     */
    @JsonGetter("maximum_extension_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMaximumExtensionPeriod() {
        return this.maximumExtensionPeriod;
    }

    /**
     * Getter for MaximumExtensionPeriod.
     * Maximum ISO-8601 extension period allowed for a charge.
     * @return Returns the String
     */
    public String getMaximumExtensionPeriod() {
        return OptionalNullable.getFrom(maximumExtensionPeriod);
    }

    /**
     * Setter for MaximumExtensionPeriod.
     * Maximum ISO-8601 extension period allowed for a charge.
     * @param maximumExtensionPeriod Value for String
     */
    @JsonSetter("maximum_extension_period")
    public void setMaximumExtensionPeriod(String maximumExtensionPeriod) {
        this.maximumExtensionPeriod = OptionalNullable.of(maximumExtensionPeriod);
    }

    /**
     * UnSetter for MaximumExtensionPeriod.
     * Maximum ISO-8601 extension period allowed for a charge.
     */
    public void unsetMaximumExtensionPeriod() {
        maximumExtensionPeriod = null;
    }

    /**
     * Internal Getter for AutomaticExtensionEnabled.
     * Automatically extends eligible bank transfer charges.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("automatic_extension_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetAutomaticExtensionEnabled() {
        return this.automaticExtensionEnabled;
    }

    /**
     * Getter for AutomaticExtensionEnabled.
     * Automatically extends eligible bank transfer charges.
     * @return Returns the Boolean
     */
    public Boolean getAutomaticExtensionEnabled() {
        return OptionalNullable.getFrom(automaticExtensionEnabled);
    }

    /**
     * Setter for AutomaticExtensionEnabled.
     * Automatically extends eligible bank transfer charges.
     * @param automaticExtensionEnabled Value for Boolean
     */
    @JsonSetter("automatic_extension_enabled")
    public void setAutomaticExtensionEnabled(Boolean automaticExtensionEnabled) {
        this.automaticExtensionEnabled = OptionalNullable.of(automaticExtensionEnabled);
    }

    /**
     * UnSetter for AutomaticExtensionEnabled.
     * Automatically extends eligible bank transfer charges.
     */
    public void unsetAutomaticExtensionEnabled() {
        automaticExtensionEnabled = null;
    }

    /**
     * Internal Getter for ChargeRequestNotificationEnabled.
     * Sends notifications when a bank transfer charge is created.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("charge_request_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetChargeRequestNotificationEnabled() {
        return this.chargeRequestNotificationEnabled;
    }

    /**
     * Getter for ChargeRequestNotificationEnabled.
     * Sends notifications when a bank transfer charge is created.
     * @return Returns the Boolean
     */
    public Boolean getChargeRequestNotificationEnabled() {
        return OptionalNullable.getFrom(chargeRequestNotificationEnabled);
    }

    /**
     * Setter for ChargeRequestNotificationEnabled.
     * Sends notifications when a bank transfer charge is created.
     * @param chargeRequestNotificationEnabled Value for Boolean
     */
    @JsonSetter("charge_request_notification_enabled")
    public void setChargeRequestNotificationEnabled(Boolean chargeRequestNotificationEnabled) {
        this.chargeRequestNotificationEnabled = OptionalNullable.of(chargeRequestNotificationEnabled);
    }

    /**
     * UnSetter for ChargeRequestNotificationEnabled.
     * Sends notifications when a bank transfer charge is created.
     */
    public void unsetChargeRequestNotificationEnabled() {
        chargeRequestNotificationEnabled = null;
    }

    /**
     * Internal Getter for ChargeRequestCanceledNotificationEnabled.
     * Sends notifications when a bank transfer charge is canceled.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("charge_request_canceled_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetChargeRequestCanceledNotificationEnabled() {
        return this.chargeRequestCanceledNotificationEnabled;
    }

    /**
     * Getter for ChargeRequestCanceledNotificationEnabled.
     * Sends notifications when a bank transfer charge is canceled.
     * @return Returns the Boolean
     */
    public Boolean getChargeRequestCanceledNotificationEnabled() {
        return OptionalNullable.getFrom(chargeRequestCanceledNotificationEnabled);
    }

    /**
     * Setter for ChargeRequestCanceledNotificationEnabled.
     * Sends notifications when a bank transfer charge is canceled.
     * @param chargeRequestCanceledNotificationEnabled Value for Boolean
     */
    @JsonSetter("charge_request_canceled_notification_enabled")
    public void setChargeRequestCanceledNotificationEnabled(Boolean chargeRequestCanceledNotificationEnabled) {
        this.chargeRequestCanceledNotificationEnabled = OptionalNullable.of(chargeRequestCanceledNotificationEnabled);
    }

    /**
     * UnSetter for ChargeRequestCanceledNotificationEnabled.
     * Sends notifications when a bank transfer charge is canceled.
     */
    public void unsetChargeRequestCanceledNotificationEnabled() {
        chargeRequestCanceledNotificationEnabled = null;
    }

    /**
     * Internal Getter for ChargeExpiredNotificationEnabled.
     * Sends notifications when a bank transfer charge expires.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("charge_expired_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetChargeExpiredNotificationEnabled() {
        return this.chargeExpiredNotificationEnabled;
    }

    /**
     * Getter for ChargeExpiredNotificationEnabled.
     * Sends notifications when a bank transfer charge expires.
     * @return Returns the Boolean
     */
    public Boolean getChargeExpiredNotificationEnabled() {
        return OptionalNullable.getFrom(chargeExpiredNotificationEnabled);
    }

    /**
     * Setter for ChargeExpiredNotificationEnabled.
     * Sends notifications when a bank transfer charge expires.
     * @param chargeExpiredNotificationEnabled Value for Boolean
     */
    @JsonSetter("charge_expired_notification_enabled")
    public void setChargeExpiredNotificationEnabled(Boolean chargeExpiredNotificationEnabled) {
        this.chargeExpiredNotificationEnabled = OptionalNullable.of(chargeExpiredNotificationEnabled);
    }

    /**
     * UnSetter for ChargeExpiredNotificationEnabled.
     * Sends notifications when a bank transfer charge expires.
     */
    public void unsetChargeExpiredNotificationEnabled() {
        chargeExpiredNotificationEnabled = null;
    }

    /**
     * Internal Getter for DepositReceivedNotificationEnabled.
     * Sends notifications when a deposit is received.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("deposit_received_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDepositReceivedNotificationEnabled() {
        return this.depositReceivedNotificationEnabled;
    }

    /**
     * Getter for DepositReceivedNotificationEnabled.
     * Sends notifications when a deposit is received.
     * @return Returns the Boolean
     */
    public Boolean getDepositReceivedNotificationEnabled() {
        return OptionalNullable.getFrom(depositReceivedNotificationEnabled);
    }

    /**
     * Setter for DepositReceivedNotificationEnabled.
     * Sends notifications when a deposit is received.
     * @param depositReceivedNotificationEnabled Value for Boolean
     */
    @JsonSetter("deposit_received_notification_enabled")
    public void setDepositReceivedNotificationEnabled(Boolean depositReceivedNotificationEnabled) {
        this.depositReceivedNotificationEnabled = OptionalNullable.of(depositReceivedNotificationEnabled);
    }

    /**
     * UnSetter for DepositReceivedNotificationEnabled.
     * Sends notifications when a deposit is received.
     */
    public void unsetDepositReceivedNotificationEnabled() {
        depositReceivedNotificationEnabled = null;
    }

    /**
     * Internal Getter for DepositInsufficientNotificationEnabled.
     * Sends notifications when a deposit is below the expected amount.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("deposit_insufficient_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDepositInsufficientNotificationEnabled() {
        return this.depositInsufficientNotificationEnabled;
    }

    /**
     * Getter for DepositInsufficientNotificationEnabled.
     * Sends notifications when a deposit is below the expected amount.
     * @return Returns the Boolean
     */
    public Boolean getDepositInsufficientNotificationEnabled() {
        return OptionalNullable.getFrom(depositInsufficientNotificationEnabled);
    }

    /**
     * Setter for DepositInsufficientNotificationEnabled.
     * Sends notifications when a deposit is below the expected amount.
     * @param depositInsufficientNotificationEnabled Value for Boolean
     */
    @JsonSetter("deposit_insufficient_notification_enabled")
    public void setDepositInsufficientNotificationEnabled(Boolean depositInsufficientNotificationEnabled) {
        this.depositInsufficientNotificationEnabled = OptionalNullable.of(depositInsufficientNotificationEnabled);
    }

    /**
     * UnSetter for DepositInsufficientNotificationEnabled.
     * Sends notifications when a deposit is below the expected amount.
     */
    public void unsetDepositInsufficientNotificationEnabled() {
        depositInsufficientNotificationEnabled = null;
    }

    /**
     * Internal Getter for DepositExceededNotificationEnabled.
     * Sends notifications when a deposit exceeds the expected amount.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("deposit_exceeded_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDepositExceededNotificationEnabled() {
        return this.depositExceededNotificationEnabled;
    }

    /**
     * Getter for DepositExceededNotificationEnabled.
     * Sends notifications when a deposit exceeds the expected amount.
     * @return Returns the Boolean
     */
    public Boolean getDepositExceededNotificationEnabled() {
        return OptionalNullable.getFrom(depositExceededNotificationEnabled);
    }

    /**
     * Setter for DepositExceededNotificationEnabled.
     * Sends notifications when a deposit exceeds the expected amount.
     * @param depositExceededNotificationEnabled Value for Boolean
     */
    @JsonSetter("deposit_exceeded_notification_enabled")
    public void setDepositExceededNotificationEnabled(Boolean depositExceededNotificationEnabled) {
        this.depositExceededNotificationEnabled = OptionalNullable.of(depositExceededNotificationEnabled);
    }

    /**
     * UnSetter for DepositExceededNotificationEnabled.
     * Sends notifications when a deposit exceeds the expected amount.
     */
    public void unsetDepositExceededNotificationEnabled() {
        depositExceededNotificationEnabled = null;
    }

    /**
     * Internal Getter for ExtensionNotificationEnabled.
     * Sends notifications when a bank transfer charge is extended.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("extension_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetExtensionNotificationEnabled() {
        return this.extensionNotificationEnabled;
    }

    /**
     * Getter for ExtensionNotificationEnabled.
     * Sends notifications when a bank transfer charge is extended.
     * @return Returns the Boolean
     */
    public Boolean getExtensionNotificationEnabled() {
        return OptionalNullable.getFrom(extensionNotificationEnabled);
    }

    /**
     * Setter for ExtensionNotificationEnabled.
     * Sends notifications when a bank transfer charge is extended.
     * @param extensionNotificationEnabled Value for Boolean
     */
    @JsonSetter("extension_notification_enabled")
    public void setExtensionNotificationEnabled(Boolean extensionNotificationEnabled) {
        this.extensionNotificationEnabled = OptionalNullable.of(extensionNotificationEnabled);
    }

    /**
     * UnSetter for ExtensionNotificationEnabled.
     * Sends notifications when a bank transfer charge is extended.
     */
    public void unsetExtensionNotificationEnabled() {
        extensionNotificationEnabled = null;
    }

    /**
     * Internal Getter for RemindNotificationPeriod.
     * ISO-8601 lead time for payment reminder notifications.
     * @return Returns the Internal String
     */
    @JsonGetter("remind_notification_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRemindNotificationPeriod() {
        return this.remindNotificationPeriod;
    }

    /**
     * Getter for RemindNotificationPeriod.
     * ISO-8601 lead time for payment reminder notifications.
     * @return Returns the String
     */
    public String getRemindNotificationPeriod() {
        return OptionalNullable.getFrom(remindNotificationPeriod);
    }

    /**
     * Setter for RemindNotificationPeriod.
     * ISO-8601 lead time for payment reminder notifications.
     * @param remindNotificationPeriod Value for String
     */
    @JsonSetter("remind_notification_period")
    public void setRemindNotificationPeriod(String remindNotificationPeriod) {
        this.remindNotificationPeriod = OptionalNullable.of(remindNotificationPeriod);
    }

    /**
     * UnSetter for RemindNotificationPeriod.
     * ISO-8601 lead time for payment reminder notifications.
     */
    public void unsetRemindNotificationPeriod() {
        remindNotificationPeriod = null;
    }

    /**
     * Internal Getter for RemindNotificationEnabled.
     * Sends reminder notifications before bank transfer expiry.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("remind_notification_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetRemindNotificationEnabled() {
        return this.remindNotificationEnabled;
    }

    /**
     * Getter for RemindNotificationEnabled.
     * Sends reminder notifications before bank transfer expiry.
     * @return Returns the Boolean
     */
    public Boolean getRemindNotificationEnabled() {
        return OptionalNullable.getFrom(remindNotificationEnabled);
    }

    /**
     * Setter for RemindNotificationEnabled.
     * Sends reminder notifications before bank transfer expiry.
     * @param remindNotificationEnabled Value for Boolean
     */
    @JsonSetter("remind_notification_enabled")
    public void setRemindNotificationEnabled(Boolean remindNotificationEnabled) {
        this.remindNotificationEnabled = OptionalNullable.of(remindNotificationEnabled);
    }

    /**
     * UnSetter for RemindNotificationEnabled.
     * Sends reminder notifications before bank transfer expiry.
     */
    public void unsetRemindNotificationEnabled() {
        remindNotificationEnabled = null;
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
     * Converts this MerchantWebhookBankTransferConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookBankTransferConfiguration [" + "enabled=" + enabled
                + ", matchAmount=" + matchAmount + ", expiration=" + expiration
                + ", virtualBankAccountsThreshold=" + virtualBankAccountsThreshold
                + ", virtualBankAccountsFetchCount=" + virtualBankAccountsFetchCount
                + ", defaultExtensionPeriod=" + defaultExtensionPeriod + ", maximumExtensionPeriod="
                + maximumExtensionPeriod + ", automaticExtensionEnabled="
                + automaticExtensionEnabled + ", chargeRequestNotificationEnabled="
                + chargeRequestNotificationEnabled + ", chargeRequestCanceledNotificationEnabled="
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
     * Builds a new {@link MerchantWebhookBankTransferConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookBankTransferConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.matchAmount = internalGetMatchAmount();
        builder.expiration = internalGetExpiration();
        builder.virtualBankAccountsThreshold = internalGetVirtualBankAccountsThreshold();
        builder.virtualBankAccountsFetchCount = internalGetVirtualBankAccountsFetchCount();
        builder.defaultExtensionPeriod = internalGetDefaultExtensionPeriod();
        builder.maximumExtensionPeriod = internalGetMaximumExtensionPeriod();
        builder.automaticExtensionEnabled = internalGetAutomaticExtensionEnabled();
        builder.chargeRequestNotificationEnabled = internalGetChargeRequestNotificationEnabled();
        builder.chargeRequestCanceledNotificationEnabled =
                internalGetChargeRequestCanceledNotificationEnabled();
        builder.chargeExpiredNotificationEnabled = internalGetChargeExpiredNotificationEnabled();
        builder.depositReceivedNotificationEnabled =
                internalGetDepositReceivedNotificationEnabled();
        builder.depositInsufficientNotificationEnabled =
                internalGetDepositInsufficientNotificationEnabled();
        builder.depositExceededNotificationEnabled =
                internalGetDepositExceededNotificationEnabled();
        builder.extensionNotificationEnabled = internalGetExtensionNotificationEnabled();
        builder.remindNotificationPeriod = internalGetRemindNotificationPeriod();
        builder.remindNotificationEnabled = internalGetRemindNotificationEnabled();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookBankTransferConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<Boolean> matchAmount;
        private OptionalNullable<String> expiration;
        private OptionalNullable<Integer> virtualBankAccountsThreshold;
        private OptionalNullable<Integer> virtualBankAccountsFetchCount;
        private OptionalNullable<String> defaultExtensionPeriod;
        private OptionalNullable<String> maximumExtensionPeriod;
        private OptionalNullable<Boolean> automaticExtensionEnabled;
        private OptionalNullable<Boolean> chargeRequestNotificationEnabled;
        private OptionalNullable<Boolean> chargeRequestCanceledNotificationEnabled;
        private OptionalNullable<Boolean> chargeExpiredNotificationEnabled;
        private OptionalNullable<Boolean> depositReceivedNotificationEnabled;
        private OptionalNullable<Boolean> depositInsufficientNotificationEnabled;
        private OptionalNullable<Boolean> depositExceededNotificationEnabled;
        private OptionalNullable<Boolean> extensionNotificationEnabled;
        private OptionalNullable<String> remindNotificationPeriod;
        private OptionalNullable<Boolean> remindNotificationEnabled;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = OptionalNullable.of(enabled);
            return this;
        }

        /**
         * UnSetter for enabled.
         * @return Builder
         */
        public Builder unsetEnabled() {
            enabled = null;
            return this;
        }

        /**
         * Setter for matchAmount.
         * @param  matchAmount  Boolean value for matchAmount.
         * @return Builder
         */
        public Builder matchAmount(Boolean matchAmount) {
            this.matchAmount = OptionalNullable.of(matchAmount);
            return this;
        }

        /**
         * UnSetter for matchAmount.
         * @return Builder
         */
        public Builder unsetMatchAmount() {
            matchAmount = null;
            return this;
        }

        /**
         * Setter for expiration.
         * @param  expiration  String value for expiration.
         * @return Builder
         */
        public Builder expiration(String expiration) {
            this.expiration = OptionalNullable.of(expiration);
            return this;
        }

        /**
         * UnSetter for expiration.
         * @return Builder
         */
        public Builder unsetExpiration() {
            expiration = null;
            return this;
        }

        /**
         * Setter for virtualBankAccountsThreshold.
         * @param  virtualBankAccountsThreshold  Integer value for virtualBankAccountsThreshold.
         * @return Builder
         */
        public Builder virtualBankAccountsThreshold(Integer virtualBankAccountsThreshold) {
            this.virtualBankAccountsThreshold = OptionalNullable.of(virtualBankAccountsThreshold);
            return this;
        }

        /**
         * UnSetter for virtualBankAccountsThreshold.
         * @return Builder
         */
        public Builder unsetVirtualBankAccountsThreshold() {
            virtualBankAccountsThreshold = null;
            return this;
        }

        /**
         * Setter for virtualBankAccountsFetchCount.
         * @param  virtualBankAccountsFetchCount  Integer value for virtualBankAccountsFetchCount.
         * @return Builder
         */
        public Builder virtualBankAccountsFetchCount(Integer virtualBankAccountsFetchCount) {
            this.virtualBankAccountsFetchCount = OptionalNullable.of(virtualBankAccountsFetchCount);
            return this;
        }

        /**
         * UnSetter for virtualBankAccountsFetchCount.
         * @return Builder
         */
        public Builder unsetVirtualBankAccountsFetchCount() {
            virtualBankAccountsFetchCount = null;
            return this;
        }

        /**
         * Setter for defaultExtensionPeriod.
         * @param  defaultExtensionPeriod  String value for defaultExtensionPeriod.
         * @return Builder
         */
        public Builder defaultExtensionPeriod(String defaultExtensionPeriod) {
            this.defaultExtensionPeriod = OptionalNullable.of(defaultExtensionPeriod);
            return this;
        }

        /**
         * UnSetter for defaultExtensionPeriod.
         * @return Builder
         */
        public Builder unsetDefaultExtensionPeriod() {
            defaultExtensionPeriod = null;
            return this;
        }

        /**
         * Setter for maximumExtensionPeriod.
         * @param  maximumExtensionPeriod  String value for maximumExtensionPeriod.
         * @return Builder
         */
        public Builder maximumExtensionPeriod(String maximumExtensionPeriod) {
            this.maximumExtensionPeriod = OptionalNullable.of(maximumExtensionPeriod);
            return this;
        }

        /**
         * UnSetter for maximumExtensionPeriod.
         * @return Builder
         */
        public Builder unsetMaximumExtensionPeriod() {
            maximumExtensionPeriod = null;
            return this;
        }

        /**
         * Setter for automaticExtensionEnabled.
         * @param  automaticExtensionEnabled  Boolean value for automaticExtensionEnabled.
         * @return Builder
         */
        public Builder automaticExtensionEnabled(Boolean automaticExtensionEnabled) {
            this.automaticExtensionEnabled = OptionalNullable.of(automaticExtensionEnabled);
            return this;
        }

        /**
         * UnSetter for automaticExtensionEnabled.
         * @return Builder
         */
        public Builder unsetAutomaticExtensionEnabled() {
            automaticExtensionEnabled = null;
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
            this.chargeRequestNotificationEnabled =
                    OptionalNullable.of(chargeRequestNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for chargeRequestNotificationEnabled.
         * @return Builder
         */
        public Builder unsetChargeRequestNotificationEnabled() {
            chargeRequestNotificationEnabled = null;
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
                    OptionalNullable.of(chargeRequestCanceledNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for chargeRequestCanceledNotificationEnabled.
         * @return Builder
         */
        public Builder unsetChargeRequestCanceledNotificationEnabled() {
            chargeRequestCanceledNotificationEnabled = null;
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
            this.chargeExpiredNotificationEnabled =
                    OptionalNullable.of(chargeExpiredNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for chargeExpiredNotificationEnabled.
         * @return Builder
         */
        public Builder unsetChargeExpiredNotificationEnabled() {
            chargeExpiredNotificationEnabled = null;
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
            this.depositReceivedNotificationEnabled =
                    OptionalNullable.of(depositReceivedNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for depositReceivedNotificationEnabled.
         * @return Builder
         */
        public Builder unsetDepositReceivedNotificationEnabled() {
            depositReceivedNotificationEnabled = null;
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
            this.depositInsufficientNotificationEnabled =
                    OptionalNullable.of(depositInsufficientNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for depositInsufficientNotificationEnabled.
         * @return Builder
         */
        public Builder unsetDepositInsufficientNotificationEnabled() {
            depositInsufficientNotificationEnabled = null;
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
            this.depositExceededNotificationEnabled =
                    OptionalNullable.of(depositExceededNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for depositExceededNotificationEnabled.
         * @return Builder
         */
        public Builder unsetDepositExceededNotificationEnabled() {
            depositExceededNotificationEnabled = null;
            return this;
        }

        /**
         * Setter for extensionNotificationEnabled.
         * @param  extensionNotificationEnabled  Boolean value for extensionNotificationEnabled.
         * @return Builder
         */
        public Builder extensionNotificationEnabled(Boolean extensionNotificationEnabled) {
            this.extensionNotificationEnabled = OptionalNullable.of(extensionNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for extensionNotificationEnabled.
         * @return Builder
         */
        public Builder unsetExtensionNotificationEnabled() {
            extensionNotificationEnabled = null;
            return this;
        }

        /**
         * Setter for remindNotificationPeriod.
         * @param  remindNotificationPeriod  String value for remindNotificationPeriod.
         * @return Builder
         */
        public Builder remindNotificationPeriod(String remindNotificationPeriod) {
            this.remindNotificationPeriod = OptionalNullable.of(remindNotificationPeriod);
            return this;
        }

        /**
         * UnSetter for remindNotificationPeriod.
         * @return Builder
         */
        public Builder unsetRemindNotificationPeriod() {
            remindNotificationPeriod = null;
            return this;
        }

        /**
         * Setter for remindNotificationEnabled.
         * @param  remindNotificationEnabled  Boolean value for remindNotificationEnabled.
         * @return Builder
         */
        public Builder remindNotificationEnabled(Boolean remindNotificationEnabled) {
            this.remindNotificationEnabled = OptionalNullable.of(remindNotificationEnabled);
            return this;
        }

        /**
         * UnSetter for remindNotificationEnabled.
         * @return Builder
         */
        public Builder unsetRemindNotificationEnabled() {
            remindNotificationEnabled = null;
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
         * Builds a new {@link MerchantWebhookBankTransferConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookBankTransferConfiguration}
         */
        public MerchantWebhookBankTransferConfiguration build() {
            MerchantWebhookBankTransferConfiguration model =
                    new MerchantWebhookBankTransferConfiguration(enabled, matchAmount, expiration,
                            virtualBankAccountsThreshold, virtualBankAccountsFetchCount,
                            defaultExtensionPeriod, maximumExtensionPeriod,
                            automaticExtensionEnabled, chargeRequestNotificationEnabled,
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
