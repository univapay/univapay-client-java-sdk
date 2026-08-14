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
 * DirectDebitBankTransferLock to be used.
 */
public enum DirectDebitBankTransferLock {
    UNLOCKED,

    LOCKED;

    private static TreeMap<String, DirectDebitBankTransferLock> valueMap = new TreeMap<>();
    private String value;

    static {
        UNLOCKED.value = "unlocked";
        LOCKED.value = "locked";

        valueMap.put("unlocked", UNLOCKED);
        valueMap.put("locked", LOCKED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DirectDebitBankTransferLock constructFromString(String toConvert) throws IOException {
        DirectDebitBankTransferLock enumValue = fromString(toConvert);
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
    public static DirectDebitBankTransferLock fromString(String toConvert) {
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
     * Convert list of DirectDebitBankTransferLock values to list of string values.
     * @param toConvert The list of DirectDebitBankTransferLock values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DirectDebitBankTransferLock> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DirectDebitBankTransferLock enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 