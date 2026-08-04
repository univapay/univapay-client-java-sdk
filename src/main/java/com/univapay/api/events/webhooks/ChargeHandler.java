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
 * Manages Charge event processing and event payload parsing.
 */
public class ChargeHandler {

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link ChargeParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CompletableFuture} of {@link ChargeParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CompletableFuture<ChargeParsingResult> parseEventAsync(HttpRequest request) {
        return CompletableFuture.completedFuture(parseEvent(request));
    }

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link ChargeParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link ChargeParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static ChargeParsingResult parseEvent(HttpRequest request) {

        try {
            ChargeParsingResult parsedEvent = ApiHelper.deserialize(request.getSerializedBody(), ChargeParsingResult.class);
            return parsedEvent != null ? parsedEvent : ChargeParsingResult.markUnknown();
        } catch (Exception e) {
            return ChargeParsingResult.markUnknown();
        }
    }

}