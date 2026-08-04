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
 * TransactionTokenPaymentType to be used.
 */
public enum TransactionTokenPaymentType {
    CARD,

    PAIDY,

    ONLINE,

    KONBINI,

    BANK_TRANSFER;

    private static TreeMap<String, TransactionTokenPaymentType> valueMap = new TreeMap<>();
    private String value;

    static {
        CARD.value = "card";
        PAIDY.value = "paidy";
        ONLINE.value = "online";
        KONBINI.value = "konbini";
        BANK_TRANSFER.value = "bank_transfer";

        valueMap.put("card", CARD);
        valueMap.put("paidy", PAIDY);
        valueMap.put("online", ONLINE);
        valueMap.put("konbini", KONBINI);
        valueMap.put("bank_transfer", BANK_TRANSFER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionTokenPaymentType constructFromString(String toConvert) throws IOException {
        TransactionTokenPaymentType enumValue = fromString(toConvert);
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
    public static TransactionTokenPaymentType fromString(String toConvert) {
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
     * Convert list of TransactionTokenPaymentType values to list of string values.
     * @param toConvert The list of TransactionTokenPaymentType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionTokenPaymentType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionTokenPaymentType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 