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
 * Manages Cancel event processing and event payload parsing.
 */
public class CancelHandler {

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link CancelParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CompletableFuture} of {@link CancelParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CompletableFuture<CancelParsingResult> parseEventAsync(HttpRequest request) {
        return CompletableFuture.completedFuture(parseEvent(request));
    }

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link CancelParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CancelParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CancelParsingResult parseEvent(HttpRequest request) {

        try {
            CancelParsingResult parsedEvent = ApiHelper.deserialize(request.getSerializedBody(), CancelParsingResult.class);
            return parsedEvent != null ? parsedEvent : CancelParsingResult.markUnknown();
        } catch (Exception e) {
            return CancelParsingResult.markUnknown();
        }
    }

}