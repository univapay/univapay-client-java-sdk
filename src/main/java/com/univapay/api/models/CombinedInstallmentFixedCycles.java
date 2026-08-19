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
 * CombinedInstallmentFixedCycles to be used.
 */
public enum CombinedInstallmentFixedCycles {
    /**
     * 3 cycles
     */
    CYCLES_3,

    /**
     * 5 cycles
     */
    CYCLES_5,

    /**
     * 6 cycles
     */
    CYCLES_6,

    /**
     * 10 cycles
     */
    CYCLES_10,

    /**
     * 12 cycles
     */
    CYCLES_12,

    /**
     * 15 cycles
     */
    CYCLES_15,

    /**
     * 18 cycles
     */
    CYCLES_18,

    /**
     * 20 cycles
     */
    CYCLES_20,

    /**
     * 24 cycles
     */
    CYCLES_24;

    private static TreeMap<Integer, CombinedInstallmentFixedCycles> valueMap = new TreeMap<>();
    private Integer value;

    static {
        CYCLES_3.value = 3;
        CYCLES_5.value = 5;
        CYCLES_6.value = 6;
        CYCLES_10.value = 10;
        CYCLES_12.value = 12;
        CYCLES_15.value = 15;
        CYCLES_18.value = 18;
        CYCLES_20.value = 20;
        CYCLES_24.value = 24;

        valueMap.put(3, CYCLES_3);
        valueMap.put(5, CYCLES_5);
        valueMap.put(6, CYCLES_6);
        valueMap.put(10, CYCLES_10);
        valueMap.put(12, CYCLES_12);
        valueMap.put(15, CYCLES_15);
        valueMap.put(18, CYCLES_18);
        valueMap.put(20, CYCLES_20);
        valueMap.put(24, CYCLES_24);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CombinedInstallmentFixedCycles constructFromInteger(Integer toConvert) throws IOException {
        CombinedInstallmentFixedCycles enumValue = fromInteger(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     */
    public static CombinedInstallmentFixedCycles fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member.
     * @return The integer value against enum member.
     */
    @JsonValue
    public Integer value() {
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
     * Convert list of CombinedInstallmentFixedCycles values to list of integer values.
     * @param toConvert The list of CombinedInstallmentFixedCycles values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<CombinedInstallmentFixedCycles> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (CombinedInstallmentFixedCycles enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 