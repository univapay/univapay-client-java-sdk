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
 * Manages Refund event processing and event payload parsing.
 */
public class RefundHandler {

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link RefundParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CompletableFuture} of {@link RefundParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CompletableFuture<RefundParsingResult> parseEventAsync(HttpRequest request) {
        return CompletableFuture.completedFuture(parseEvent(request));
    }

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link RefundParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link RefundParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static RefundParsingResult parseEvent(HttpRequest request) {

        try {
            RefundParsingResult parsedEvent = ApiHelper.deserialize(request.getSerializedBody(), RefundParsingResult.class);
            return parsedEvent != null ? parsedEvent : RefundParsingResult.markUnknown();
        } catch (Exception e) {
            return RefundParsingResult.markUnknown();
        }
    }

}