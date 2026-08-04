/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.events.webhooks;

import com.univapay.api.ApiHelper;
import com.univapay.api.http.request.HttpRequest;
import java.util.concurrent.CompletableFuture;

/**
 * Manages Customs event processing and event payload parsing.
 */
public class CustomsHandler {

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link CustomsParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CompletableFuture} of {@link CustomsParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CompletableFuture<CustomsParsingResult> parseEventAsync(HttpRequest request) {
        return CompletableFuture.completedFuture(parseEvent(request));
    }

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link CustomsParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CustomsParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CustomsParsingResult parseEvent(HttpRequest request) {

        try {
            CustomsParsingResult parsedEvent = ApiHelper.deserialize(request.getSerializedBody(), CustomsParsingResult.class);
            return parsedEvent != null ? parsedEvent : CustomsParsingResult.markUnknown();
        } catch (Exception e) {
            return CustomsParsingResult.markUnknown();
        }
    }

}