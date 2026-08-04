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
 * SubscriptionUpdateStatus to be used.
 */
public enum SubscriptionUpdateStatus {
    SUSPENDED,

    UNPAID;

    private static TreeMap<String, SubscriptionUpdateStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        SUSPENDED.value = "suspended";
        UNPAID.value = "unpaid";

        valueMap.put("suspended", SUSPENDED);
        valueMap.put("unpaid", UNPAID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionUpdateStatus constructFromString(String toConvert) throws IOException {
        SubscriptionUpdateStatus enumValue = fromString(toConvert);
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
    public static SubscriptionUpdateStatus fromString(String toConvert) {
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
     * Convert list of SubscriptionUpdateStatus values to list of string values.
     * @param toConvert The list of SubscriptionUpdateStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionUpdateStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionUpdateStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 