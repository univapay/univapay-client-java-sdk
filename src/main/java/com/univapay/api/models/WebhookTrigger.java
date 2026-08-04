/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * WebhookTrigger to be used.
 */
public enum WebhookTrigger {
    TOKEN_CREATED,

    TOKEN_UPDATED,

    TOKEN_THREE_D_S_UPDATED,

    TOKEN_CVV_AUTH_UPDATED,

    TOKEN_CVV_AUTH_CHECK_UPDATED,

    TOKEN_REPLACED,

    CHARGE_UPDATED,

    CHARGE_FINISHED,

    REFUND_FINISHED,

    CANCEL_FINISHED,

    CUSTOMS_DECLARATION_FINISHED,

    RECURRING_TOKEN_DELETED,

    BANK_TRANSFER_STATUS_UPDATED,

    SUBSCRIPTION_CREATED,

    SUBSCRIPTION_PAYMENT,

    SUBSCRIPTION_COMPLETED,

    SUBSCRIPTION_FAILURE,

    SUBSCRIPTION_CANCELED,

    SUBSCRIPTION_SUSPENDED;

    private static TreeMap<String, WebhookTrigger> valueMap = new TreeMap<>();
    private String value;

    static {
        TOKEN_CREATED.value = "token_created";
        TOKEN_UPDATED.value = "token_updated";
        TOKEN_THREE_D_S_UPDATED.value = "token_three_d_s_updated";
        TOKEN_CVV_AUTH_UPDATED.value = "token_cvv_auth_updated";
        TOKEN_CVV_AUTH_CHECK_UPDATED.value = "token_cvv_auth_check_updated";
        TOKEN_REPLACED.value = "token_replaced";
        CHARGE_UPDATED.value = "charge_updated";
        CHARGE_FINISHED.value = "charge_finished";
        REFUND_FINISHED.value = "refund_finished";
        CANCEL_FINISHED.value = "cancel_finished";
        CUSTOMS_DECLARATION_FINISHED.value = "customs_declaration_finished";
        RECURRING_TOKEN_DELETED.value = "recurring_token_deleted";
        BANK_TRANSFER_STATUS_UPDATED.value = "bank_transfer_status_updated";
        SUBSCRIPTION_CREATED.value = "subscription_created";
        SUBSCRIPTION_PAYMENT.value = "subscription_payment";
        SUBSCRIPTION_COMPLETED.value = "subscription_completed";
        SUBSCRIPTION_FAILURE.value = "subscription_failure";
        SUBSCRIPTION_CANCELED.value = "subscription_canceled";
        SUBSCRIPTION_SUSPENDED.value = "subscription_suspended";

        valueMap.put("token_created", TOKEN_CREATED);
        valueMap.put("token_updated", TOKEN_UPDATED);
        valueMap.put("token_three_d_s_updated", TOKEN_THREE_D_S_UPDATED);
        valueMap.put("token_cvv_auth_updated", TOKEN_CVV_AUTH_UPDATED);
        valueMap.put("token_cvv_auth_check_updated", TOKEN_CVV_AUTH_CHECK_UPDATED);
        valueMap.put("token_replaced", TOKEN_REPLACED);
        valueMap.put("charge_updated", CHARGE_UPDATED);
        valueMap.put("charge_finished", CHARGE_FINISHED);
        valueMap.put("refund_finished", REFUND_FINISHED);
        valueMap.put("cancel_finished", CANCEL_FINISHED);
        valueMap.put("customs_declaration_finished", CUSTOMS_DECLARATION_FINISHED);
        valueMap.put("recurring_token_deleted", RECURRING_TOKEN_DELETED);
        valueMap.put("bank_transfer_status_updated", BANK_TRANSFER_STATUS_UPDATED);
        valueMap.put("subscription_created", SUBSCRIPTION_CREATED);
        valueMap.put("subscription_payment", SUBSCRIPTION_PAYMENT);
        valueMap.put("subscription_completed", SUBSCRIPTION_COMPLETED);
        valueMap.put("subscription_failure", SUBSCRIPTION_FAILURE);
        valueMap.put("subscription_canceled", SUBSCRIPTION_CANCELED);
        valueMap.put("subscription_suspended", SUBSCRIPTION_SUSPENDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static WebhookTrigger constructFromString(String toConvert) throws IOException {
        WebhookTrigger enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static WebhookTrigger fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of WebhookTrigger values to list of string values.
     * @param toConvert The list of WebhookTrigger values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<WebhookTrigger> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (WebhookTrigger enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 