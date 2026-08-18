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
 * TransactionTokenCreateRequestPaymentType to be used.
 */
public enum TransactionTokenCreateRequestPaymentType {
    CARD,

    ONLINE,

    KONBINI,

    BANK_TRANSFER,

    QR_SCAN,

    QR_MERCHANT,

    PAIDY;

    private static TreeMap<String, TransactionTokenCreateRequestPaymentType> valueMap = new TreeMap<>();
    private String value;

    static {
        CARD.value = "card";
        ONLINE.value = "online";
        KONBINI.value = "konbini";
        BANK_TRANSFER.value = "bank_transfer";
        QR_SCAN.value = "qr_scan";
        QR_MERCHANT.value = "qr_merchant";
        PAIDY.value = "paidy";

        valueMap.put("card", CARD);
        valueMap.put("online", ONLINE);
        valueMap.put("konbini", KONBINI);
        valueMap.put("bank_transfer", BANK_TRANSFER);
        valueMap.put("qr_scan", QR_SCAN);
        valueMap.put("qr_merchant", QR_MERCHANT);
        valueMap.put("paidy", PAIDY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionTokenCreateRequestPaymentType constructFromString(String toConvert) throws IOException {
        TransactionTokenCreateRequestPaymentType enumValue = fromString(toConvert);
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
    public static TransactionTokenCreateRequestPaymentType fromString(String toConvert) {
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
     * Convert list of TransactionTokenCreateRequestPaymentType values to list of string values.
     * @param toConvert The list of TransactionTokenCreateRequestPaymentType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionTokenCreateRequestPaymentType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionTokenCreateRequestPaymentType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 