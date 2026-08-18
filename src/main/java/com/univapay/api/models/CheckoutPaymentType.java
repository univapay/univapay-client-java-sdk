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
 * CheckoutPaymentType to be used.
 */
public enum CheckoutPaymentType {
    CARD,

    QR_SCAN,

    QR_MERCHANT,

    KONBINI,

    APPLE_PAY,

    PAIDY,

    ONLINE,

    BANK_TRANSFER;

    private static TreeMap<String, CheckoutPaymentType> valueMap = new TreeMap<>();
    private String value;

    static {
        CARD.value = "card";
        QR_SCAN.value = "qr_scan";
        QR_MERCHANT.value = "qr_merchant";
        KONBINI.value = "konbini";
        APPLE_PAY.value = "apple_pay";
        PAIDY.value = "paidy";
        ONLINE.value = "online";
        BANK_TRANSFER.value = "bank_transfer";

        valueMap.put("card", CARD);
        valueMap.put("qr_scan", QR_SCAN);
        valueMap.put("qr_merchant", QR_MERCHANT);
        valueMap.put("konbini", KONBINI);
        valueMap.put("apple_pay", APPLE_PAY);
        valueMap.put("paidy", PAIDY);
        valueMap.put("online", ONLINE);
        valueMap.put("bank_transfer", BANK_TRANSFER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CheckoutPaymentType constructFromString(String toConvert) throws IOException {
        CheckoutPaymentType enumValue = fromString(toConvert);
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
    public static CheckoutPaymentType fromString(String toConvert) {
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
     * Convert list of CheckoutPaymentType values to list of string values.
     * @param toConvert The list of CheckoutPaymentType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CheckoutPaymentType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CheckoutPaymentType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 