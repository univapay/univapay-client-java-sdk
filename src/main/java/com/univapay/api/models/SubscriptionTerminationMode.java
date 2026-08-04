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
 * SubscriptionTerminationMode to be used.
 */
public enum SubscriptionTerminationMode {
    IMMEDIATE,

    ON_NEXT_PAYMENT;

    private static TreeMap<String, SubscriptionTerminationMode> valueMap = new TreeMap<>();
    private String value;

    static {
        IMMEDIATE.value = "immediate";
        ON_NEXT_PAYMENT.value = "on_next_payment";

        valueMap.put("immediate", IMMEDIATE);
        valueMap.put("on_next_payment", ON_NEXT_PAYMENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionTerminationMode constructFromString(String toConvert) throws IOException {
        SubscriptionTerminationMode enumValue = fromString(toConvert);
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
    public static SubscriptionTerminationMode fromString(String toConvert) {
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
     * Convert list of SubscriptionTerminationMode values to list of string values.
     * @param toConvert The list of SubscriptionTerminationMode values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionTerminationMode> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionTerminationMode enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 