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
 * TransactionTokenCreateRequestType to be used.
 */
public enum TransactionTokenCreateRequestType {
    ONE_TIME,

    SUBSCRIPTION,

    RECURRING;

    private static TreeMap<String, TransactionTokenCreateRequestType> valueMap = new TreeMap<>();
    private String value;

    static {
        ONE_TIME.value = "one_time";
        SUBSCRIPTION.value = "subscription";
        RECURRING.value = "recurring";

        valueMap.put("one_time", ONE_TIME);
        valueMap.put("subscription", SUBSCRIPTION);
        valueMap.put("recurring", RECURRING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionTokenCreateRequestType constructFromString(String toConvert) throws IOException {
        TransactionTokenCreateRequestType enumValue = fromString(toConvert);
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
    public static TransactionTokenCreateRequestType fromString(String toConvert) {
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
     * Convert list of TransactionTokenCreateRequestType values to list of string values.
     * @param toConvert The list of TransactionTokenCreateRequestType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionTokenCreateRequestType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionTokenCreateRequestType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 