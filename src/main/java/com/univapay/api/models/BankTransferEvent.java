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
 * BankTransferEvent to be used.
 */
public enum BankTransferEvent {
    BANK_TRANSFER_STATUS_UPDATED;

    private static TreeMap<String, BankTransferEvent> valueMap = new TreeMap<>();
    private String value;

    static {
        BANK_TRANSFER_STATUS_UPDATED.value = "bank_transfer_status_updated";

        valueMap.put("bank_transfer_status_updated", BANK_TRANSFER_STATUS_UPDATED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BankTransferEvent constructFromString(String toConvert) throws IOException {
        BankTransferEvent enumValue = fromString(toConvert);
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
    public static BankTransferEvent fromString(String toConvert) {
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
     * Convert list of BankTransferEvent values to list of string values.
     * @param toConvert The list of BankTransferEvent values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BankTransferEvent> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BankTransferEvent enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 