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
 * TransactionHistoryStatus to be used.
 */
public enum TransactionHistoryStatus {
    PENDING,

    AUTHORIZED,

    SUCCESSFUL,

    FAILED,

    ERROR,

    CANCELED,

    AWAITING;

    private static TreeMap<String, TransactionHistoryStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        PENDING.value = "pending";
        AUTHORIZED.value = "authorized";
        SUCCESSFUL.value = "successful";
        FAILED.value = "failed";
        ERROR.value = "error";
        CANCELED.value = "canceled";
        AWAITING.value = "awaiting";

        valueMap.put("pending", PENDING);
        valueMap.put("authorized", AUTHORIZED);
        valueMap.put("successful", SUCCESSFUL);
        valueMap.put("failed", FAILED);
        valueMap.put("error", ERROR);
        valueMap.put("canceled", CANCELED);
        valueMap.put("awaiting", AWAITING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionHistoryStatus constructFromString(String toConvert) throws IOException {
        TransactionHistoryStatus enumValue = fromString(toConvert);
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
    public static TransactionHistoryStatus fromString(String toConvert) {
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
     * Convert list of TransactionHistoryStatus values to list of string values.
     * @param toConvert The list of TransactionHistoryStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionHistoryStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionHistoryStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 