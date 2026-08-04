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
 * Manages BankTransfer event processing and event payload parsing.
 */
public class BankTransferHandler {

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link BankTransferParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link CompletableFuture} of {@link BankTransferParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static CompletableFuture<BankTransferParsingResult> parseEventAsync(HttpRequest request) {
        return CompletableFuture.completedFuture(parseEvent(request));
    }

    /**
     * Parse the incoming HTTP request data and deserialize it into an {@link BankTransferParsingResult} object.
     *
     * @param request The HTTP request data containing the event payload.
     * @return A {@link BankTransferParsingResult},
     *     an Unknown case if parsing fails.
     */
    public static BankTransferParsingResult parseEvent(HttpRequest request) {

        try {
            BankTransferParsingResult parsedEvent = ApiHelper.deserialize(request.getSerializedBody(), BankTransferParsingResult.class);
            return parsedEvent != null ? parsedEvent : BankTransferParsingResult.markUnknown();
        } catch (Exception e) {
            return BankTransferParsingResult.markUnknown();
        }
    }

}