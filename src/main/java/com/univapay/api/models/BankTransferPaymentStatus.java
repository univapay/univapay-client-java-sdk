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
 * BankTransferPaymentStatus to be used.
 */
public enum BankTransferPaymentStatus {
    UNPAID,

    INSUFFICIENT,

    EXACT,

    EXCEEDED;

    private static TreeMap<String, BankTransferPaymentStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        UNPAID.value = "unpaid";
        INSUFFICIENT.value = "insufficient";
        EXACT.value = "exact";
        EXCEEDED.value = "exceeded";

        valueMap.put("unpaid", UNPAID);
        valueMap.put("insufficient", INSUFFICIENT);
        valueMap.put("exact", EXACT);
        valueMap.put("exceeded", EXCEEDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BankTransferPaymentStatus constructFromString(String toConvert) throws IOException {
        BankTransferPaymentStatus enumValue = fromString(toConvert);
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
    public static BankTransferPaymentStatus fromString(String toConvert) {
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
     * Convert list of BankTransferPaymentStatus values to list of string values.
     * @param toConvert The list of BankTransferPaymentStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BankTransferPaymentStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BankTransferPaymentStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 