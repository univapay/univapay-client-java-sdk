/*
 * UnivapayClientSdk
 *
 * Hand-authored customization — APIMatic never generates this file.
 *
 * This used to be a private nested class at the end of UnivapayClientSdkClient.
 * That position conflicted on every regeneration: the last statement codegen emits
 * in Builder.build() sits immediately above it, so the two sides' hunks were always
 * adjacent. Living in its own file leaves the generated client with only the
 * three-line wrap in its constructor, which merges cleanly.
 */

package com.univapay.api;

import com.univapay.api.http.client.HttpCallback;

/**
 * Adds an Idempotency-Key header to mutating requests that do not already carry one,
 * then delegates to the caller's own callback if they supplied one.
 */
final class IdempotencyCallback implements HttpCallback {
    private final HttpCallback userCallback;

    IdempotencyCallback(HttpCallback userCallback) {
        this.userCallback = userCallback;
    }

    @Override
    public void onBeforeRequest(io.apimatic.coreinterfaces.http.request.Request request) {
        if (request != null) {
            if (request instanceof com.univapay.api.http.request.HttpRequest) {
                com.univapay.api.http.request.HttpRequest req = (com.univapay.api.http.request.HttpRequest) request;
                String method = req.getHttpMethod() != null ? req.getHttpMethod().toString().toUpperCase() : "";
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH")) {
                    com.univapay.api.http.Headers headers = req.getHeaders();
                    if (headers != null && !headers.has("Idempotency-Key")) {
                        headers.add("Idempotency-Key", java.util.UUID.randomUUID().toString());
                    }
                }
            }
        }
        if (userCallback != null) {
            userCallback.onBeforeRequest(request);
        }
    }

    @Override
    public void onAfterResponse(io.apimatic.coreinterfaces.http.Context context) {
        if (userCallback != null) {
            userCallback.onAfterResponse(context);
        }
    }
}
