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
 * BaseOnlineDataCallMethod to be used.
 */
public enum BaseOnlineDataCallMethod {
    HTTP_GET,

    HTTP_POST,

    HTTP_GET_MOBILE,

    SDK,

    WEB,

    APP;

    private static TreeMap<String, BaseOnlineDataCallMethod> valueMap = new TreeMap<>();
    private String value;

    static {
        HTTP_GET.value = "http_get";
        HTTP_POST.value = "http_post";
        HTTP_GET_MOBILE.value = "http_get_mobile";
        SDK.value = "sdk";
        WEB.value = "web";
        APP.value = "app";

        valueMap.put("http_get", HTTP_GET);
        valueMap.put("http_post", HTTP_POST);
        valueMap.put("http_get_mobile", HTTP_GET_MOBILE);
        valueMap.put("sdk", SDK);
        valueMap.put("web", WEB);
        valueMap.put("app", APP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BaseOnlineDataCallMethod constructFromString(String toConvert) throws IOException {
        BaseOnlineDataCallMethod enumValue = fromString(toConvert);
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
    public static BaseOnlineDataCallMethod fromString(String toConvert) {
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
     * Convert list of BaseOnlineDataCallMethod values to list of string values.
     * @param toConvert The list of BaseOnlineDataCallMethod values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BaseOnlineDataCallMethod> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BaseOnlineDataCallMethod enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 