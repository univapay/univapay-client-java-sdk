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
 * This is a model class for MerchantWebhookUserTransactionsConfiguration type.
 */
public class MerchantWebhookUserTransactionsConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<Boolean> notifyCustomer;
    private OptionalNullable<Boolean> notifyOnTest;
    private OptionalNullable<Boolean> notifyOnRecurringTokenCreation;
    private OptionalNullable<Boolean> notifyOnRecurringTokenCvvFailed;
    private OptionalNullable<Boolean> notifyOnWebhookFailure;
    private OptionalNullable<Boolean> notifyOnWebhookDisabled;
    private OptionalNullable<Boolean> notifyUserOnFailedTransactions;
    private OptionalNullable<Boolean> notifyCustomerOnFailedTransactions;
    private OptionalNullable<Boolean> notifyUserOnConvenienceInstructions;
    private OptionalNullable<Boolean> notifyOnSubscriptions;
    private OptionalNullable<Boolean> notifyOnAuthorizations;
    private OptionalNullable<Boolean> notifyOnCvvAuthorizations;
    private OptionalNullable<Boolean> notifyOnCancels;
    private OptionalNullable<Boolean> customerReferLinkEnabled;
    private OptionalNullable<Boolean> notifyOnConvenienceExpiry;
    private OptionalNullable<Boolean> notifyOnRecurringTokenCreationWithThreeDs;
    private OptionalNullable<Boolean> notifyOnChargebacks;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookUserTransactionsConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  notifyCustomer  Boolean value for notifyCustomer.
     * @param  notifyOnTest  Boolean value for notifyOnTest.
     * @param  notifyOnRecurringTokenCreation  Boolean value for notifyOnRecurringTokenCreation.
     * @param  notifyOnRecurringTokenCvvFailed  Boolean value for notifyOnRecurringTokenCvvFailed.
     * @param  notifyOnWebhookFailure  Boolean value for notifyOnWebhookFailure.
     * @param  notifyOnWebhookDisabled  Boolean value for notifyOnWebhookDisabled.
     * @param  notifyUserOnFailedTransactions  Boolean value for notifyUserOnFailedTransactions.
     * @param  notifyCustomerOnFailedTransactions  Boolean value for
     *         notifyCustomerOnFailedTransactions.
     * @param  notifyUserOnConvenienceInstructions  Boolean value for
     *         notifyUserOnConvenienceInstructions.
     * @param  notifyOnSubscriptions  Boolean value for notifyOnSubscriptions.
     * @param  notifyOnAuthorizations  Boolean value for notifyOnAuthorizations.
     * @param  notifyOnCvvAuthorizations  Boolean value for notifyOnCvvAuthorizations.
     * @param  notifyOnCancels  Boolean value for notifyOnCancels.
     * @param  customerReferLinkEnabled  Boolean value for customerReferLinkEnabled.
     * @param  notifyOnConvenienceExpiry  Boolean value for notifyOnConvenienceExpiry.
     * @param  notifyOnRecurringTokenCreationWithThreeDs  Boolean value for
     *         notifyOnRecurringTokenCreationWithThreeDs.
     * @param  notifyOnChargebacks  Boolean value for notifyOnChargebacks.
     */
    public MerchantWebhookUserTransactionsConfiguration(
            Boolean enabled,
            Boolean notifyCustomer,
            Boolean notifyOnTest,
            Boolean notifyOnRecurringTokenCreation,
            Boolean notifyOnRecurringTokenCvvFailed,
            Boolean notifyOnWebhookFailure,
            Boolean notifyOnWebhookDisabled,
            Boolean notifyUserOnFailedTransactions,
            Boolean notifyCustomerOnFailedTransactions,
            Boolean notifyUserOnConvenienceInstructions,
            Boolean notifyOnSubscriptions,
            Boolean notifyOnAuthorizations,
            Boolean notifyOnCvvAuthorizations,
            Boolean notifyOnCancels,
            Boolean customerReferLinkEnabled,
            Boolean notifyOnConvenienceExpiry,
            Boolean notifyOnRecurringTokenCreationWithThreeDs,
            Boolean notifyOnChargebacks) {
        this.enabled = OptionalNullable.of(enabled);
        this.notifyCustomer = OptionalNullable.of(notifyCustomer);
        this.notifyOnTest = OptionalNullable.of(notifyOnTest);
        this.notifyOnRecurringTokenCreation = OptionalNullable.of(notifyOnRecurringTokenCreation);
        this.notifyOnRecurringTokenCvvFailed = OptionalNullable.of(notifyOnRecurringTokenCvvFailed);
        this.notifyOnWebhookFailure = OptionalNullable.of(notifyOnWebhookFailure);
        this.notifyOnWebhookDisabled = OptionalNullable.of(notifyOnWebhookDisabled);
        this.notifyUserOnFailedTransactions = OptionalNullable.of(notifyUserOnFailedTransactions);
        this.notifyCustomerOnFailedTransactions =
                OptionalNullable.of(notifyCustomerOnFailedTransactions);
        this.notifyUserOnConvenienceInstructions =
                OptionalNullable.of(notifyUserOnConvenienceInstructions);
        this.notifyOnSubscriptions = OptionalNullable.of(notifyOnSubscriptions);
        this.notifyOnAuthorizations = OptionalNullable.of(notifyOnAuthorizations);
        this.notifyOnCvvAuthorizations = OptionalNullable.of(notifyOnCvvAuthorizations);
        this.notifyOnCancels = OptionalNullable.of(notifyOnCancels);
        this.customerReferLinkEnabled = OptionalNullable.of(customerReferLinkEnabled);
        this.notifyOnConvenienceExpiry = OptionalNullable.of(notifyOnConvenienceExpiry);
        this.notifyOnRecurringTokenCreationWithThreeDs =
                OptionalNullable.of(notifyOnRecurringTokenCreationWithThreeDs);
        this.notifyOnChargebacks = OptionalNullable.of(notifyOnChargebacks);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  notifyCustomer  Boolean value for notifyCustomer.
     * @param  notifyOnTest  Boolean value for notifyOnTest.
     * @param  notifyOnRecurringTokenCreation  Boolean value for notifyOnRecurringTokenCreation.
     * @param  notifyOnRecurringTokenCvvFailed  Boolean value for notifyOnRecurringTokenCvvFailed.
     * @param  notifyOnWebhookFailure  Boolean value for notifyOnWebhookFailure.
     * @param  notifyOnWebhookDisabled  Boolean value for notifyOnWebhookDisabled.
     * @param  notifyUserOnFailedTransactions  Boolean value for notifyUserOnFailedTransactions.
     * @param  notifyCustomerOnFailedTransactions  Boolean value for
     *         notifyCustomerOnFailedTransactions.
     * @param  notifyUserOnConvenienceInstructions  Boolean value for
     *         notifyUserOnConvenienceInstructions.
     * @param  notifyOnSubscriptions  Boolean value for notifyOnSubscriptions.
     * @param  notifyOnAuthorizations  Boolean value for notifyOnAuthorizations.
     * @param  notifyOnCvvAuthorizations  Boolean value for notifyOnCvvAuthorizations.
     * @param  notifyOnCancels  Boolean value for notifyOnCancels.
     * @param  customerReferLinkEnabled  Boolean value for customerReferLinkEnabled.
     * @param  notifyOnConvenienceExpiry  Boolean value for notifyOnConvenienceExpiry.
     * @param  notifyOnRecurringTokenCreationWithThreeDs  Boolean value for
     *         notifyOnRecurringTokenCreationWithThreeDs.
     * @param  notifyOnChargebacks  Boolean value for notifyOnChargebacks.
     */

    protected MerchantWebhookUserTransactionsConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<Boolean> notifyCustomer, OptionalNullable<Boolean> notifyOnTest,
            OptionalNullable<Boolean> notifyOnRecurringTokenCreation,
            OptionalNullable<Boolean> notifyOnRecurringTokenCvvFailed,
            OptionalNullable<Boolean> notifyOnWebhookFailure,
            OptionalNullable<Boolean> notifyOnWebhookDisabled,
            OptionalNullable<Boolean> notifyUserOnFailedTransactions,
            OptionalNullable<Boolean> notifyCustomerOnFailedTransactions,
            OptionalNullable<Boolean> notifyUserOnConvenienceInstructions,
            OptionalNullable<Boolean> notifyOnSubscriptions,
            OptionalNullable<Boolean> notifyOnAuthorizations,
            OptionalNullable<Boolean> notifyOnCvvAuthorizations,
            OptionalNullable<Boolean> notifyOnCancels,
            OptionalNullable<Boolean> customerReferLinkEnabled,
            OptionalNullable<Boolean> notifyOnConvenienceExpiry,
            OptionalNullable<Boolean> notifyOnRecurringTokenCreationWithThreeDs,
            OptionalNullable<Boolean> notifyOnChargebacks) {
        this.enabled = enabled;
        this.notifyCustomer = notifyCustomer;
        this.notifyOnTest = notifyOnTest;
        this.notifyOnRecurringTokenCreation = notifyOnRecurringTokenCreation;
        this.notifyOnRecurringTokenCvvFailed = notifyOnRecurringTokenCvvFailed;
        this.notifyOnWebhookFailure = notifyOnWebhookFailure;
        this.notifyOnWebhookDisabled = notifyOnWebhookDisabled;
        this.notifyUserOnFailedTransactions = notifyUserOnFailedTransactions;
        this.notifyCustomerOnFailedTransactions = notifyCustomerOnFailedTransactions;
        this.notifyUserOnConvenienceInstructions = notifyUserOnConvenienceInstructions;
        this.notifyOnSubscriptions = notifyOnSubscriptions;
        this.notifyOnAuthorizations = notifyOnAuthorizations;
        this.notifyOnCvvAuthorizations = notifyOnCvvAuthorizations;
        this.notifyOnCancels = notifyOnCancels;
        this.customerReferLinkEnabled = customerReferLinkEnabled;
        this.notifyOnConvenienceExpiry = notifyOnConvenienceExpiry;
        this.notifyOnRecurringTokenCreationWithThreeDs = notifyOnRecurringTokenCreationWithThreeDs;
        this.notifyOnChargebacks = notifyOnChargebacks;
    }

    /**
     * Internal Getter for Enabled.
     * Enables merchant transaction notifications.
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
     * Enables merchant transaction notifications.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables merchant transaction notifications.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables merchant transaction notifications.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for NotifyCustomer.
     * Sends transaction notifications to the customer.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyCustomer() {
        return this.notifyCustomer;
    }

    /**
     * Getter for NotifyCustomer.
     * Sends transaction notifications to the customer.
     * @return Returns the Boolean
     */
    public Boolean getNotifyCustomer() {
        return OptionalNullable.getFrom(notifyCustomer);
    }

    /**
     * Setter for NotifyCustomer.
     * Sends transaction notifications to the customer.
     * @param notifyCustomer Value for Boolean
     */
    @JsonSetter("notify_customer")
    public void setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = OptionalNullable.of(notifyCustomer);
    }

    /**
     * UnSetter for NotifyCustomer.
     * Sends transaction notifications to the customer.
     */
    public void unsetNotifyCustomer() {
        notifyCustomer = null;
    }

    /**
     * Internal Getter for NotifyOnTest.
     * Sends notifications for test-mode events.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_test")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnTest() {
        return this.notifyOnTest;
    }

    /**
     * Getter for NotifyOnTest.
     * Sends notifications for test-mode events.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnTest() {
        return OptionalNullable.getFrom(notifyOnTest);
    }

    /**
     * Setter for NotifyOnTest.
     * Sends notifications for test-mode events.
     * @param notifyOnTest Value for Boolean
     */
    @JsonSetter("notify_on_test")
    public void setNotifyOnTest(Boolean notifyOnTest) {
        this.notifyOnTest = OptionalNullable.of(notifyOnTest);
    }

    /**
     * UnSetter for NotifyOnTest.
     * Sends notifications for test-mode events.
     */
    public void unsetNotifyOnTest() {
        notifyOnTest = null;
    }

    /**
     * Internal Getter for NotifyOnRecurringTokenCreation.
     * Sends notifications when a recurring token is created.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_recurring_token_creation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnRecurringTokenCreation() {
        return this.notifyOnRecurringTokenCreation;
    }

    /**
     * Getter for NotifyOnRecurringTokenCreation.
     * Sends notifications when a recurring token is created.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnRecurringTokenCreation() {
        return OptionalNullable.getFrom(notifyOnRecurringTokenCreation);
    }

    /**
     * Setter for NotifyOnRecurringTokenCreation.
     * Sends notifications when a recurring token is created.
     * @param notifyOnRecurringTokenCreation Value for Boolean
     */
    @JsonSetter("notify_on_recurring_token_creation")
    public void setNotifyOnRecurringTokenCreation(Boolean notifyOnRecurringTokenCreation) {
        this.notifyOnRecurringTokenCreation = OptionalNullable.of(notifyOnRecurringTokenCreation);
    }

    /**
     * UnSetter for NotifyOnRecurringTokenCreation.
     * Sends notifications when a recurring token is created.
     */
    public void unsetNotifyOnRecurringTokenCreation() {
        notifyOnRecurringTokenCreation = null;
    }

    /**
     * Internal Getter for NotifyOnRecurringTokenCvvFailed.
     * Sends notifications when recurring-token CVV confirmation fails.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_recurring_token_cvv_failed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnRecurringTokenCvvFailed() {
        return this.notifyOnRecurringTokenCvvFailed;
    }

    /**
     * Getter for NotifyOnRecurringTokenCvvFailed.
     * Sends notifications when recurring-token CVV confirmation fails.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnRecurringTokenCvvFailed() {
        return OptionalNullable.getFrom(notifyOnRecurringTokenCvvFailed);
    }

    /**
     * Setter for NotifyOnRecurringTokenCvvFailed.
     * Sends notifications when recurring-token CVV confirmation fails.
     * @param notifyOnRecurringTokenCvvFailed Value for Boolean
     */
    @JsonSetter("notify_on_recurring_token_cvv_failed")
    public void setNotifyOnRecurringTokenCvvFailed(Boolean notifyOnRecurringTokenCvvFailed) {
        this.notifyOnRecurringTokenCvvFailed = OptionalNullable.of(notifyOnRecurringTokenCvvFailed);
    }

    /**
     * UnSetter for NotifyOnRecurringTokenCvvFailed.
     * Sends notifications when recurring-token CVV confirmation fails.
     */
    public void unsetNotifyOnRecurringTokenCvvFailed() {
        notifyOnRecurringTokenCvvFailed = null;
    }

    /**
     * Internal Getter for NotifyOnWebhookFailure.
     * Sends notifications after repeated webhook delivery failures.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_webhook_failure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnWebhookFailure() {
        return this.notifyOnWebhookFailure;
    }

    /**
     * Getter for NotifyOnWebhookFailure.
     * Sends notifications after repeated webhook delivery failures.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnWebhookFailure() {
        return OptionalNullable.getFrom(notifyOnWebhookFailure);
    }

    /**
     * Setter for NotifyOnWebhookFailure.
     * Sends notifications after repeated webhook delivery failures.
     * @param notifyOnWebhookFailure Value for Boolean
     */
    @JsonSetter("notify_on_webhook_failure")
    public void setNotifyOnWebhookFailure(Boolean notifyOnWebhookFailure) {
        this.notifyOnWebhookFailure = OptionalNullable.of(notifyOnWebhookFailure);
    }

    /**
     * UnSetter for NotifyOnWebhookFailure.
     * Sends notifications after repeated webhook delivery failures.
     */
    public void unsetNotifyOnWebhookFailure() {
        notifyOnWebhookFailure = null;
    }

    /**
     * Internal Getter for NotifyOnWebhookDisabled.
     * Sends notifications when webhook delivery is disabled.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_webhook_disabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnWebhookDisabled() {
        return this.notifyOnWebhookDisabled;
    }

    /**
     * Getter for NotifyOnWebhookDisabled.
     * Sends notifications when webhook delivery is disabled.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnWebhookDisabled() {
        return OptionalNullable.getFrom(notifyOnWebhookDisabled);
    }

    /**
     * Setter for NotifyOnWebhookDisabled.
     * Sends notifications when webhook delivery is disabled.
     * @param notifyOnWebhookDisabled Value for Boolean
     */
    @JsonSetter("notify_on_webhook_disabled")
    public void setNotifyOnWebhookDisabled(Boolean notifyOnWebhookDisabled) {
        this.notifyOnWebhookDisabled = OptionalNullable.of(notifyOnWebhookDisabled);
    }

    /**
     * UnSetter for NotifyOnWebhookDisabled.
     * Sends notifications when webhook delivery is disabled.
     */
    public void unsetNotifyOnWebhookDisabled() {
        notifyOnWebhookDisabled = null;
    }

    /**
     * Internal Getter for NotifyUserOnFailedTransactions.
     * Sends merchant notifications for failed transactions.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_user_on_failed_transactions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyUserOnFailedTransactions() {
        return this.notifyUserOnFailedTransactions;
    }

    /**
     * Getter for NotifyUserOnFailedTransactions.
     * Sends merchant notifications for failed transactions.
     * @return Returns the Boolean
     */
    public Boolean getNotifyUserOnFailedTransactions() {
        return OptionalNullable.getFrom(notifyUserOnFailedTransactions);
    }

    /**
     * Setter for NotifyUserOnFailedTransactions.
     * Sends merchant notifications for failed transactions.
     * @param notifyUserOnFailedTransactions Value for Boolean
     */
    @JsonSetter("notify_user_on_failed_transactions")
    public void setNotifyUserOnFailedTransactions(Boolean notifyUserOnFailedTransactions) {
        this.notifyUserOnFailedTransactions = OptionalNullable.of(notifyUserOnFailedTransactions);
    }

    /**
     * UnSetter for NotifyUserOnFailedTransactions.
     * Sends merchant notifications for failed transactions.
     */
    public void unsetNotifyUserOnFailedTransactions() {
        notifyUserOnFailedTransactions = null;
    }

    /**
     * Internal Getter for NotifyCustomerOnFailedTransactions.
     * Sends customer notifications for failed transactions.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_customer_on_failed_transactions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyCustomerOnFailedTransactions() {
        return this.notifyCustomerOnFailedTransactions;
    }

    /**
     * Getter for NotifyCustomerOnFailedTransactions.
     * Sends customer notifications for failed transactions.
     * @return Returns the Boolean
     */
    public Boolean getNotifyCustomerOnFailedTransactions() {
        return OptionalNullable.getFrom(notifyCustomerOnFailedTransactions);
    }

    /**
     * Setter for NotifyCustomerOnFailedTransactions.
     * Sends customer notifications for failed transactions.
     * @param notifyCustomerOnFailedTransactions Value for Boolean
     */
    @JsonSetter("notify_customer_on_failed_transactions")
    public void setNotifyCustomerOnFailedTransactions(Boolean notifyCustomerOnFailedTransactions) {
        this.notifyCustomerOnFailedTransactions = OptionalNullable.of(notifyCustomerOnFailedTransactions);
    }

    /**
     * UnSetter for NotifyCustomerOnFailedTransactions.
     * Sends customer notifications for failed transactions.
     */
    public void unsetNotifyCustomerOnFailedTransactions() {
        notifyCustomerOnFailedTransactions = null;
    }

    /**
     * Internal Getter for NotifyUserOnConvenienceInstructions.
     * Sends merchant notifications with convenience-store payment instructions.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_user_on_convenience_instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyUserOnConvenienceInstructions() {
        return this.notifyUserOnConvenienceInstructions;
    }

    /**
     * Getter for NotifyUserOnConvenienceInstructions.
     * Sends merchant notifications with convenience-store payment instructions.
     * @return Returns the Boolean
     */
    public Boolean getNotifyUserOnConvenienceInstructions() {
        return OptionalNullable.getFrom(notifyUserOnConvenienceInstructions);
    }

    /**
     * Setter for NotifyUserOnConvenienceInstructions.
     * Sends merchant notifications with convenience-store payment instructions.
     * @param notifyUserOnConvenienceInstructions Value for Boolean
     */
    @JsonSetter("notify_user_on_convenience_instructions")
    public void setNotifyUserOnConvenienceInstructions(Boolean notifyUserOnConvenienceInstructions) {
        this.notifyUserOnConvenienceInstructions = OptionalNullable.of(notifyUserOnConvenienceInstructions);
    }

    /**
     * UnSetter for NotifyUserOnConvenienceInstructions.
     * Sends merchant notifications with convenience-store payment instructions.
     */
    public void unsetNotifyUserOnConvenienceInstructions() {
        notifyUserOnConvenienceInstructions = null;
    }

    /**
     * Internal Getter for NotifyOnSubscriptions.
     * Sends notifications for subscription lifecycle events.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnSubscriptions() {
        return this.notifyOnSubscriptions;
    }

    /**
     * Getter for NotifyOnSubscriptions.
     * Sends notifications for subscription lifecycle events.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnSubscriptions() {
        return OptionalNullable.getFrom(notifyOnSubscriptions);
    }

    /**
     * Setter for NotifyOnSubscriptions.
     * Sends notifications for subscription lifecycle events.
     * @param notifyOnSubscriptions Value for Boolean
     */
    @JsonSetter("notify_on_subscriptions")
    public void setNotifyOnSubscriptions(Boolean notifyOnSubscriptions) {
        this.notifyOnSubscriptions = OptionalNullable.of(notifyOnSubscriptions);
    }

    /**
     * UnSetter for NotifyOnSubscriptions.
     * Sends notifications for subscription lifecycle events.
     */
    public void unsetNotifyOnSubscriptions() {
        notifyOnSubscriptions = null;
    }

    /**
     * Internal Getter for NotifyOnAuthorizations.
     * Sends notifications for authorization-only charges.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_authorizations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnAuthorizations() {
        return this.notifyOnAuthorizations;
    }

    /**
     * Getter for NotifyOnAuthorizations.
     * Sends notifications for authorization-only charges.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnAuthorizations() {
        return OptionalNullable.getFrom(notifyOnAuthorizations);
    }

    /**
     * Setter for NotifyOnAuthorizations.
     * Sends notifications for authorization-only charges.
     * @param notifyOnAuthorizations Value for Boolean
     */
    @JsonSetter("notify_on_authorizations")
    public void setNotifyOnAuthorizations(Boolean notifyOnAuthorizations) {
        this.notifyOnAuthorizations = OptionalNullable.of(notifyOnAuthorizations);
    }

    /**
     * UnSetter for NotifyOnAuthorizations.
     * Sends notifications for authorization-only charges.
     */
    public void unsetNotifyOnAuthorizations() {
        notifyOnAuthorizations = null;
    }

    /**
     * Internal Getter for NotifyOnCvvAuthorizations.
     * Sends notifications for CVV authorization events.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_cvv_authorizations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnCvvAuthorizations() {
        return this.notifyOnCvvAuthorizations;
    }

    /**
     * Getter for NotifyOnCvvAuthorizations.
     * Sends notifications for CVV authorization events.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnCvvAuthorizations() {
        return OptionalNullable.getFrom(notifyOnCvvAuthorizations);
    }

    /**
     * Setter for NotifyOnCvvAuthorizations.
     * Sends notifications for CVV authorization events.
     * @param notifyOnCvvAuthorizations Value for Boolean
     */
    @JsonSetter("notify_on_cvv_authorizations")
    public void setNotifyOnCvvAuthorizations(Boolean notifyOnCvvAuthorizations) {
        this.notifyOnCvvAuthorizations = OptionalNullable.of(notifyOnCvvAuthorizations);
    }

    /**
     * UnSetter for NotifyOnCvvAuthorizations.
     * Sends notifications for CVV authorization events.
     */
    public void unsetNotifyOnCvvAuthorizations() {
        notifyOnCvvAuthorizations = null;
    }

    /**
     * Internal Getter for NotifyOnCancels.
     * Sends notifications when charges are canceled.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_cancels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnCancels() {
        return this.notifyOnCancels;
    }

    /**
     * Getter for NotifyOnCancels.
     * Sends notifications when charges are canceled.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnCancels() {
        return OptionalNullable.getFrom(notifyOnCancels);
    }

    /**
     * Setter for NotifyOnCancels.
     * Sends notifications when charges are canceled.
     * @param notifyOnCancels Value for Boolean
     */
    @JsonSetter("notify_on_cancels")
    public void setNotifyOnCancels(Boolean notifyOnCancels) {
        this.notifyOnCancels = OptionalNullable.of(notifyOnCancels);
    }

    /**
     * UnSetter for NotifyOnCancels.
     * Sends notifications when charges are canceled.
     */
    public void unsetNotifyOnCancels() {
        notifyOnCancels = null;
    }

    /**
     * Internal Getter for CustomerReferLinkEnabled.
     * Includes customer self-service links in supported notifications.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("customer_refer_link_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetCustomerReferLinkEnabled() {
        return this.customerReferLinkEnabled;
    }

    /**
     * Getter for CustomerReferLinkEnabled.
     * Includes customer self-service links in supported notifications.
     * @return Returns the Boolean
     */
    public Boolean getCustomerReferLinkEnabled() {
        return OptionalNullable.getFrom(customerReferLinkEnabled);
    }

    /**
     * Setter for CustomerReferLinkEnabled.
     * Includes customer self-service links in supported notifications.
     * @param customerReferLinkEnabled Value for Boolean
     */
    @JsonSetter("customer_refer_link_enabled")
    public void setCustomerReferLinkEnabled(Boolean customerReferLinkEnabled) {
        this.customerReferLinkEnabled = OptionalNullable.of(customerReferLinkEnabled);
    }

    /**
     * UnSetter for CustomerReferLinkEnabled.
     * Includes customer self-service links in supported notifications.
     */
    public void unsetCustomerReferLinkEnabled() {
        customerReferLinkEnabled = null;
    }

    /**
     * Internal Getter for NotifyOnConvenienceExpiry.
     * Sends notifications when convenience payments expire.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_convenience_expiry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnConvenienceExpiry() {
        return this.notifyOnConvenienceExpiry;
    }

    /**
     * Getter for NotifyOnConvenienceExpiry.
     * Sends notifications when convenience payments expire.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnConvenienceExpiry() {
        return OptionalNullable.getFrom(notifyOnConvenienceExpiry);
    }

    /**
     * Setter for NotifyOnConvenienceExpiry.
     * Sends notifications when convenience payments expire.
     * @param notifyOnConvenienceExpiry Value for Boolean
     */
    @JsonSetter("notify_on_convenience_expiry")
    public void setNotifyOnConvenienceExpiry(Boolean notifyOnConvenienceExpiry) {
        this.notifyOnConvenienceExpiry = OptionalNullable.of(notifyOnConvenienceExpiry);
    }

    /**
     * UnSetter for NotifyOnConvenienceExpiry.
     * Sends notifications when convenience payments expire.
     */
    public void unsetNotifyOnConvenienceExpiry() {
        notifyOnConvenienceExpiry = null;
    }

    /**
     * Internal Getter for NotifyOnRecurringTokenCreationWithThreeDs.
     * Sends notifications when recurring tokens are created through 3-D Secure.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_recurring_token_creation_with_three_ds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnRecurringTokenCreationWithThreeDs() {
        return this.notifyOnRecurringTokenCreationWithThreeDs;
    }

    /**
     * Getter for NotifyOnRecurringTokenCreationWithThreeDs.
     * Sends notifications when recurring tokens are created through 3-D Secure.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnRecurringTokenCreationWithThreeDs() {
        return OptionalNullable.getFrom(notifyOnRecurringTokenCreationWithThreeDs);
    }

    /**
     * Setter for NotifyOnRecurringTokenCreationWithThreeDs.
     * Sends notifications when recurring tokens are created through 3-D Secure.
     * @param notifyOnRecurringTokenCreationWithThreeDs Value for Boolean
     */
    @JsonSetter("notify_on_recurring_token_creation_with_three_ds")
    public void setNotifyOnRecurringTokenCreationWithThreeDs(Boolean notifyOnRecurringTokenCreationWithThreeDs) {
        this.notifyOnRecurringTokenCreationWithThreeDs = OptionalNullable.of(notifyOnRecurringTokenCreationWithThreeDs);
    }

    /**
     * UnSetter for NotifyOnRecurringTokenCreationWithThreeDs.
     * Sends notifications when recurring tokens are created through 3-D Secure.
     */
    public void unsetNotifyOnRecurringTokenCreationWithThreeDs() {
        notifyOnRecurringTokenCreationWithThreeDs = null;
    }

    /**
     * Internal Getter for NotifyOnChargebacks.
     * Sends notifications for chargeback events.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("notify_on_chargebacks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetNotifyOnChargebacks() {
        return this.notifyOnChargebacks;
    }

    /**
     * Getter for NotifyOnChargebacks.
     * Sends notifications for chargeback events.
     * @return Returns the Boolean
     */
    public Boolean getNotifyOnChargebacks() {
        return OptionalNullable.getFrom(notifyOnChargebacks);
    }

    /**
     * Setter for NotifyOnChargebacks.
     * Sends notifications for chargeback events.
     * @param notifyOnChargebacks Value for Boolean
     */
    @JsonSetter("notify_on_chargebacks")
    public void setNotifyOnChargebacks(Boolean notifyOnChargebacks) {
        this.notifyOnChargebacks = OptionalNullable.of(notifyOnChargebacks);
    }

    /**
     * UnSetter for NotifyOnChargebacks.
     * Sends notifications for chargeback events.
     */
    public void unsetNotifyOnChargebacks() {
        notifyOnChargebacks = null;
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
     * Converts this MerchantWebhookUserTransactionsConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookUserTransactionsConfiguration [" + "enabled=" + enabled
                + ", notifyCustomer=" + notifyCustomer + ", notifyOnTest=" + notifyOnTest
                + ", notifyOnRecurringTokenCreation=" + notifyOnRecurringTokenCreation
                + ", notifyOnRecurringTokenCvvFailed=" + notifyOnRecurringTokenCvvFailed
                + ", notifyOnWebhookFailure=" + notifyOnWebhookFailure
                + ", notifyOnWebhookDisabled=" + notifyOnWebhookDisabled
                + ", notifyUserOnFailedTransactions=" + notifyUserOnFailedTransactions
                + ", notifyCustomerOnFailedTransactions=" + notifyCustomerOnFailedTransactions
                + ", notifyUserOnConvenienceInstructions=" + notifyUserOnConvenienceInstructions
                + ", notifyOnSubscriptions=" + notifyOnSubscriptions + ", notifyOnAuthorizations="
                + notifyOnAuthorizations + ", notifyOnCvvAuthorizations="
                + notifyOnCvvAuthorizations + ", notifyOnCancels=" + notifyOnCancels
                + ", customerReferLinkEnabled=" + customerReferLinkEnabled
                + ", notifyOnConvenienceExpiry=" + notifyOnConvenienceExpiry
                + ", notifyOnRecurringTokenCreationWithThreeDs="
                + notifyOnRecurringTokenCreationWithThreeDs + ", notifyOnChargebacks="
                + notifyOnChargebacks + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookUserTransactionsConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookUserTransactionsConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.notifyCustomer = internalGetNotifyCustomer();
        builder.notifyOnTest = internalGetNotifyOnTest();
        builder.notifyOnRecurringTokenCreation = internalGetNotifyOnRecurringTokenCreation();
        builder.notifyOnRecurringTokenCvvFailed = internalGetNotifyOnRecurringTokenCvvFailed();
        builder.notifyOnWebhookFailure = internalGetNotifyOnWebhookFailure();
        builder.notifyOnWebhookDisabled = internalGetNotifyOnWebhookDisabled();
        builder.notifyUserOnFailedTransactions = internalGetNotifyUserOnFailedTransactions();
        builder.notifyCustomerOnFailedTransactions =
                internalGetNotifyCustomerOnFailedTransactions();
        builder.notifyUserOnConvenienceInstructions =
                internalGetNotifyUserOnConvenienceInstructions();
        builder.notifyOnSubscriptions = internalGetNotifyOnSubscriptions();
        builder.notifyOnAuthorizations = internalGetNotifyOnAuthorizations();
        builder.notifyOnCvvAuthorizations = internalGetNotifyOnCvvAuthorizations();
        builder.notifyOnCancels = internalGetNotifyOnCancels();
        builder.customerReferLinkEnabled = internalGetCustomerReferLinkEnabled();
        builder.notifyOnConvenienceExpiry = internalGetNotifyOnConvenienceExpiry();
        builder.notifyOnRecurringTokenCreationWithThreeDs =
                internalGetNotifyOnRecurringTokenCreationWithThreeDs();
        builder.notifyOnChargebacks = internalGetNotifyOnChargebacks();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookUserTransactionsConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<Boolean> notifyCustomer;
        private OptionalNullable<Boolean> notifyOnTest;
        private OptionalNullable<Boolean> notifyOnRecurringTokenCreation;
        private OptionalNullable<Boolean> notifyOnRecurringTokenCvvFailed;
        private OptionalNullable<Boolean> notifyOnWebhookFailure;
        private OptionalNullable<Boolean> notifyOnWebhookDisabled;
        private OptionalNullable<Boolean> notifyUserOnFailedTransactions;
        private OptionalNullable<Boolean> notifyCustomerOnFailedTransactions;
        private OptionalNullable<Boolean> notifyUserOnConvenienceInstructions;
        private OptionalNullable<Boolean> notifyOnSubscriptions;
        private OptionalNullable<Boolean> notifyOnAuthorizations;
        private OptionalNullable<Boolean> notifyOnCvvAuthorizations;
        private OptionalNullable<Boolean> notifyOnCancels;
        private OptionalNullable<Boolean> customerReferLinkEnabled;
        private OptionalNullable<Boolean> notifyOnConvenienceExpiry;
        private OptionalNullable<Boolean> notifyOnRecurringTokenCreationWithThreeDs;
        private OptionalNullable<Boolean> notifyOnChargebacks;
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
         * Setter for notifyCustomer.
         * @param  notifyCustomer  Boolean value for notifyCustomer.
         * @return Builder
         */
        public Builder notifyCustomer(Boolean notifyCustomer) {
            this.notifyCustomer = OptionalNullable.of(notifyCustomer);
            return this;
        }

        /**
         * UnSetter for notifyCustomer.
         * @return Builder
         */
        public Builder unsetNotifyCustomer() {
            notifyCustomer = null;
            return this;
        }

        /**
         * Setter for notifyOnTest.
         * @param  notifyOnTest  Boolean value for notifyOnTest.
         * @return Builder
         */
        public Builder notifyOnTest(Boolean notifyOnTest) {
            this.notifyOnTest = OptionalNullable.of(notifyOnTest);
            return this;
        }

        /**
         * UnSetter for notifyOnTest.
         * @return Builder
         */
        public Builder unsetNotifyOnTest() {
            notifyOnTest = null;
            return this;
        }

        /**
         * Setter for notifyOnRecurringTokenCreation.
         * @param  notifyOnRecurringTokenCreation  Boolean value for notifyOnRecurringTokenCreation.
         * @return Builder
         */
        public Builder notifyOnRecurringTokenCreation(Boolean notifyOnRecurringTokenCreation) {
            this.notifyOnRecurringTokenCreation =
                    OptionalNullable.of(notifyOnRecurringTokenCreation);
            return this;
        }

        /**
         * UnSetter for notifyOnRecurringTokenCreation.
         * @return Builder
         */
        public Builder unsetNotifyOnRecurringTokenCreation() {
            notifyOnRecurringTokenCreation = null;
            return this;
        }

        /**
         * Setter for notifyOnRecurringTokenCvvFailed.
         * @param  notifyOnRecurringTokenCvvFailed  Boolean value for
         *         notifyOnRecurringTokenCvvFailed.
         * @return Builder
         */
        public Builder notifyOnRecurringTokenCvvFailed(Boolean notifyOnRecurringTokenCvvFailed) {
            this.notifyOnRecurringTokenCvvFailed =
                    OptionalNullable.of(notifyOnRecurringTokenCvvFailed);
            return this;
        }

        /**
         * UnSetter for notifyOnRecurringTokenCvvFailed.
         * @return Builder
         */
        public Builder unsetNotifyOnRecurringTokenCvvFailed() {
            notifyOnRecurringTokenCvvFailed = null;
            return this;
        }

        /**
         * Setter for notifyOnWebhookFailure.
         * @param  notifyOnWebhookFailure  Boolean value for notifyOnWebhookFailure.
         * @return Builder
         */
        public Builder notifyOnWebhookFailure(Boolean notifyOnWebhookFailure) {
            this.notifyOnWebhookFailure = OptionalNullable.of(notifyOnWebhookFailure);
            return this;
        }

        /**
         * UnSetter for notifyOnWebhookFailure.
         * @return Builder
         */
        public Builder unsetNotifyOnWebhookFailure() {
            notifyOnWebhookFailure = null;
            return this;
        }

        /**
         * Setter for notifyOnWebhookDisabled.
         * @param  notifyOnWebhookDisabled  Boolean value for notifyOnWebhookDisabled.
         * @return Builder
         */
        public Builder notifyOnWebhookDisabled(Boolean notifyOnWebhookDisabled) {
            this.notifyOnWebhookDisabled = OptionalNullable.of(notifyOnWebhookDisabled);
            return this;
        }

        /**
         * UnSetter for notifyOnWebhookDisabled.
         * @return Builder
         */
        public Builder unsetNotifyOnWebhookDisabled() {
            notifyOnWebhookDisabled = null;
            return this;
        }

        /**
         * Setter for notifyUserOnFailedTransactions.
         * @param  notifyUserOnFailedTransactions  Boolean value for notifyUserOnFailedTransactions.
         * @return Builder
         */
        public Builder notifyUserOnFailedTransactions(Boolean notifyUserOnFailedTransactions) {
            this.notifyUserOnFailedTransactions =
                    OptionalNullable.of(notifyUserOnFailedTransactions);
            return this;
        }

        /**
         * UnSetter for notifyUserOnFailedTransactions.
         * @return Builder
         */
        public Builder unsetNotifyUserOnFailedTransactions() {
            notifyUserOnFailedTransactions = null;
            return this;
        }

        /**
         * Setter for notifyCustomerOnFailedTransactions.
         * @param  notifyCustomerOnFailedTransactions  Boolean value for
         *         notifyCustomerOnFailedTransactions.
         * @return Builder
         */
        public Builder notifyCustomerOnFailedTransactions(
                Boolean notifyCustomerOnFailedTransactions) {
            this.notifyCustomerOnFailedTransactions =
                    OptionalNullable.of(notifyCustomerOnFailedTransactions);
            return this;
        }

        /**
         * UnSetter for notifyCustomerOnFailedTransactions.
         * @return Builder
         */
        public Builder unsetNotifyCustomerOnFailedTransactions() {
            notifyCustomerOnFailedTransactions = null;
            return this;
        }

        /**
         * Setter for notifyUserOnConvenienceInstructions.
         * @param  notifyUserOnConvenienceInstructions  Boolean value for
         *         notifyUserOnConvenienceInstructions.
         * @return Builder
         */
        public Builder notifyUserOnConvenienceInstructions(
                Boolean notifyUserOnConvenienceInstructions) {
            this.notifyUserOnConvenienceInstructions =
                    OptionalNullable.of(notifyUserOnConvenienceInstructions);
            return this;
        }

        /**
         * UnSetter for notifyUserOnConvenienceInstructions.
         * @return Builder
         */
        public Builder unsetNotifyUserOnConvenienceInstructions() {
            notifyUserOnConvenienceInstructions = null;
            return this;
        }

        /**
         * Setter for notifyOnSubscriptions.
         * @param  notifyOnSubscriptions  Boolean value for notifyOnSubscriptions.
         * @return Builder
         */
        public Builder notifyOnSubscriptions(Boolean notifyOnSubscriptions) {
            this.notifyOnSubscriptions = OptionalNullable.of(notifyOnSubscriptions);
            return this;
        }

        /**
         * UnSetter for notifyOnSubscriptions.
         * @return Builder
         */
        public Builder unsetNotifyOnSubscriptions() {
            notifyOnSubscriptions = null;
            return this;
        }

        /**
         * Setter for notifyOnAuthorizations.
         * @param  notifyOnAuthorizations  Boolean value for notifyOnAuthorizations.
         * @return Builder
         */
        public Builder notifyOnAuthorizations(Boolean notifyOnAuthorizations) {
            this.notifyOnAuthorizations = OptionalNullable.of(notifyOnAuthorizations);
            return this;
        }

        /**
         * UnSetter for notifyOnAuthorizations.
         * @return Builder
         */
        public Builder unsetNotifyOnAuthorizations() {
            notifyOnAuthorizations = null;
            return this;
        }

        /**
         * Setter for notifyOnCvvAuthorizations.
         * @param  notifyOnCvvAuthorizations  Boolean value for notifyOnCvvAuthorizations.
         * @return Builder
         */
        public Builder notifyOnCvvAuthorizations(Boolean notifyOnCvvAuthorizations) {
            this.notifyOnCvvAuthorizations = OptionalNullable.of(notifyOnCvvAuthorizations);
            return this;
        }

        /**
         * UnSetter for notifyOnCvvAuthorizations.
         * @return Builder
         */
        public Builder unsetNotifyOnCvvAuthorizations() {
            notifyOnCvvAuthorizations = null;
            return this;
        }

        /**
         * Setter for notifyOnCancels.
         * @param  notifyOnCancels  Boolean value for notifyOnCancels.
         * @return Builder
         */
        public Builder notifyOnCancels(Boolean notifyOnCancels) {
            this.notifyOnCancels = OptionalNullable.of(notifyOnCancels);
            return this;
        }

        /**
         * UnSetter for notifyOnCancels.
         * @return Builder
         */
        public Builder unsetNotifyOnCancels() {
            notifyOnCancels = null;
            return this;
        }

        /**
         * Setter for customerReferLinkEnabled.
         * @param  customerReferLinkEnabled  Boolean value for customerReferLinkEnabled.
         * @return Builder
         */
        public Builder customerReferLinkEnabled(Boolean customerReferLinkEnabled) {
            this.customerReferLinkEnabled = OptionalNullable.of(customerReferLinkEnabled);
            return this;
        }

        /**
         * UnSetter for customerReferLinkEnabled.
         * @return Builder
         */
        public Builder unsetCustomerReferLinkEnabled() {
            customerReferLinkEnabled = null;
            return this;
        }

        /**
         * Setter for notifyOnConvenienceExpiry.
         * @param  notifyOnConvenienceExpiry  Boolean value for notifyOnConvenienceExpiry.
         * @return Builder
         */
        public Builder notifyOnConvenienceExpiry(Boolean notifyOnConvenienceExpiry) {
            this.notifyOnConvenienceExpiry = OptionalNullable.of(notifyOnConvenienceExpiry);
            return this;
        }

        /**
         * UnSetter for notifyOnConvenienceExpiry.
         * @return Builder
         */
        public Builder unsetNotifyOnConvenienceExpiry() {
            notifyOnConvenienceExpiry = null;
            return this;
        }

        /**
         * Setter for notifyOnRecurringTokenCreationWithThreeDs.
         * @param  notifyOnRecurringTokenCreationWithThreeDs  Boolean value for
         *         notifyOnRecurringTokenCreationWithThreeDs.
         * @return Builder
         */
        public Builder notifyOnRecurringTokenCreationWithThreeDs(
                Boolean notifyOnRecurringTokenCreationWithThreeDs) {
            this.notifyOnRecurringTokenCreationWithThreeDs =
                    OptionalNullable.of(notifyOnRecurringTokenCreationWithThreeDs);
            return this;
        }

        /**
         * UnSetter for notifyOnRecurringTokenCreationWithThreeDs.
         * @return Builder
         */
        public Builder unsetNotifyOnRecurringTokenCreationWithThreeDs() {
            notifyOnRecurringTokenCreationWithThreeDs = null;
            return this;
        }

        /**
         * Setter for notifyOnChargebacks.
         * @param  notifyOnChargebacks  Boolean value for notifyOnChargebacks.
         * @return Builder
         */
        public Builder notifyOnChargebacks(Boolean notifyOnChargebacks) {
            this.notifyOnChargebacks = OptionalNullable.of(notifyOnChargebacks);
            return this;
        }

        /**
         * UnSetter for notifyOnChargebacks.
         * @return Builder
         */
        public Builder unsetNotifyOnChargebacks() {
            notifyOnChargebacks = null;
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
         * Builds a new {@link MerchantWebhookUserTransactionsConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookUserTransactionsConfiguration}
         */
        public MerchantWebhookUserTransactionsConfiguration build() {
            MerchantWebhookUserTransactionsConfiguration model =
                    new MerchantWebhookUserTransactionsConfiguration(enabled, notifyCustomer,
                            notifyOnTest, notifyOnRecurringTokenCreation,
                            notifyOnRecurringTokenCvvFailed, notifyOnWebhookFailure,
                            notifyOnWebhookDisabled, notifyUserOnFailedTransactions,
                            notifyCustomerOnFailedTransactions, notifyUserOnConvenienceInstructions,
                            notifyOnSubscriptions, notifyOnAuthorizations,
                            notifyOnCvvAuthorizations, notifyOnCancels, customerReferLinkEnabled,
                            notifyOnConvenienceExpiry, notifyOnRecurringTokenCreationWithThreeDs,
                            notifyOnChargebacks);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
