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
 * SubscriptionEvent to be used.
 */
public enum SubscriptionEvent {
    SUBSCRIPTION_CREATED,

    SUBSCRIPTION_PAYMENT,

    SUBSCRIPTION_COMPLETED,

    SUBSCRIPTION_FAILURE,

    SUBSCRIPTION_CANCELED,

    SUBSCRIPTION_SUSPENDED;

    private static TreeMap<String, SubscriptionEvent> valueMap = new TreeMap<>();
    private String value;

    static {
        SUBSCRIPTION_CREATED.value = "subscription_created";
        SUBSCRIPTION_PAYMENT.value = "subscription_payment";
        SUBSCRIPTION_COMPLETED.value = "subscription_completed";
        SUBSCRIPTION_FAILURE.value = "subscription_failure";
        SUBSCRIPTION_CANCELED.value = "subscription_canceled";
        SUBSCRIPTION_SUSPENDED.value = "subscription_suspended";

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
    public static SubscriptionEvent constructFromString(String toConvert) throws IOException {
        SubscriptionEvent enumValue = fromString(toConvert);
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
    public static SubscriptionEvent fromString(String toConvert) {
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
     * Convert list of SubscriptionEvent values to list of string values.
     * @param toConvert The list of SubscriptionEvent values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionEvent> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionEvent enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 