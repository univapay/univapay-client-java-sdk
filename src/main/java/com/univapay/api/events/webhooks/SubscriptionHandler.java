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
 * Manages Subscription event processing and event payload parsing.
 */
public class SubscriptionHandler {

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link SubscriptionParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CompletableFuture} of {@link SubscriptionParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CompletableFuture<SubscriptionParsingResult> parseEventAsync(HttpRequest request) {
        return CompletableFuture.completedFuture(parseEvent(request));
    }

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link SubscriptionParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link SubscriptionParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static SubscriptionParsingResult parseEvent(HttpRequest request) {

        try {
            SubscriptionParsingResult parsedEvent = ApiHelper.deserialize(request.getSerializedBody(), SubscriptionParsingResult.class);
            return parsedEvent != null ? parsedEvent : SubscriptionParsingResult.markUnknown();
        } catch (Exception e) {
            return SubscriptionParsingResult.markUnknown();
        }
    }

}