/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.events.utilities;

import com.univapay.api.http.Headers;
import com.univapay.api.http.request.HttpMethod;
import com.univapay.api.http.request.HttpRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public final class HttpRequestFactory {

    public static HttpRequest createPostRequestWithBody(String body) {

        Map<String, List<String>> headersMap = new HashMap<>();
        headersMap.put("Content-Type", Collections.singletonList("application/json"));

        Headers headers = new Headers(headersMap);
        HttpMethod httpMethod = HttpMethod.valueOf("POST");
        StringBuilder urlBuilder = new StringBuilder("https://events.example.com/handle");
        Map<String, Object> queryParameters = new HashMap<>();
        // Return HttpRequest
        return new HttpRequest(httpMethod, urlBuilder, headers, queryParameters, body);
    }

    public static HttpRequest withSignature(
            HttpRequest httpRequest,
            Function<HttpRequest, Map.Entry<String, String>> computeSignatureFunc) {

        Map.Entry<String, String> entry = computeSignatureFunc.apply(httpRequest);
        Map<String, List<String>> headers = httpRequest.getHeaders().asMultimap();
        headers.put(entry.getKey(), Collections.singletonList(entry.getValue()));

        // Return HttpRequest
        return new HttpRequest(
                httpRequest.getHttpMethod(),
                new StringBuilder(httpRequest.getQueryUrl()),
                new Headers(headers),
                httpRequest.getQueryParameters(),
                httpRequest.getBody()
        );
    }
}