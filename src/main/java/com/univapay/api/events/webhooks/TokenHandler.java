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
 * Manages Token event processing and event payload parsing.
 */
public class TokenHandler {

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link TokenParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CompletableFuture} of {@link TokenParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CompletableFuture<TokenParsingResult> parseEventAsync(HttpRequest request) {
        return CompletableFuture.completedFuture(parseEvent(request));
    }

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link TokenParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link TokenParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static TokenParsingResult parseEvent(HttpRequest request) {

        try {
            TokenParsingResult parsedEvent = ApiHelper.deserialize(request.getSerializedBody(), TokenParsingResult.class);
            return parsedEvent != null ? parsedEvent : TokenParsingResult.markUnknown();
        } catch (Exception e) {
            return TokenParsingResult.markUnknown();
        }
    }

}