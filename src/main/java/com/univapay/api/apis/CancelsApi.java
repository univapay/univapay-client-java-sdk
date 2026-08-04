/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.apis;

import com.univapay.api.ApiHelper;
import com.univapay.api.Server;
import com.univapay.api.exceptions.ApiErrorException;
import com.univapay.api.exceptions.ApiException;
import com.univapay.api.http.request.HttpMethod;
import com.univapay.api.http.response.ApiResponse;
import com.univapay.api.models.Cancel;
import com.univapay.api.models.CancelCreateRequest;
import com.univapay.api.models.CancelList;
import com.univapay.api.models.CancelUpdateRequest;
import com.univapay.api.models.CursorDirectionQuery;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import com.univapay.api.models.CancelStatus;
import java.util.Arrays;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CancelsApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CancelsApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns a paginated list of cancels for the specified charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the CancelList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CancelList> listCancels(
            final UUID storeId,
            final UUID chargeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListCancelsRequest(storeId, chargeId, limit, cursor,
                cursorDirection).execute();
    }

    /**
     * Returns a paginated list of cancels for the specified charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the CancelList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CancelList>> listCancelsAsync(
            final UUID storeId,
            final UUID chargeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListCancelsRequest(storeId, chargeId, limit, cursor,
            cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listCancels.
     */
    private ApiCall<ApiResponse<CancelList>, ApiException> prepareListCancelsRequest(
            final UUID storeId,
            final UUID chargeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<CancelList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/cancels")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("chargeId").value(chargeId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CancelList.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setTemplate("HTTP 409 Conflict: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setTemplate("HTTP 500 Server Error: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setTemplate("HTTP 503 Unavailable: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("504",
                                 ErrorCase.setTemplate("HTTP 504 Timeout: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setTemplate("HTTP {$statusCode}: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a new cancellation request for a charge. The charge must be in a cancellable state.
     * Bank transfer and konbini charges that have already been paid cannot be cancelled.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Optional metadata payload for creating a cancel.
     * @return    Returns the Cancel wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Cancel> createCancel(
            final UUID storeId,
            final UUID chargeId,
            final String idempotencyKey,
            final CancelCreateRequest body) throws ApiException, IOException {
        return prepareCreateCancelRequest(storeId, chargeId, idempotencyKey, body).execute();
    }

    /**
     * Creates a new cancellation request for a charge. The charge must be in a cancellable state.
     * Bank transfer and konbini charges that have already been paid cannot be cancelled.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Optional metadata payload for creating a cancel.
     * @return    Returns the Cancel wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Cancel>> createCancelAsync(
            final UUID storeId,
            final UUID chargeId,
            final String idempotencyKey,
            final CancelCreateRequest body) {
        try {
            return prepareCreateCancelRequest(storeId, chargeId, idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createCancel.
     */
    private ApiCall<ApiResponse<Cancel>, ApiException> prepareCreateCancelRequest(
            final UUID storeId,
            final UUID chargeId,
            final String idempotencyKey,
            final CancelCreateRequest body) {
        return new ApiCall.Builder<ApiResponse<Cancel>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/cancels")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("chargeId").value(chargeId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("Idempotency-Key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Cancel.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setTemplate("HTTP 409 Conflict: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setTemplate("HTTP 500 Server Error: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setTemplate("HTTP 503 Unavailable: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("504",
                                 ErrorCase.setTemplate("HTTP 504 Timeout: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setTemplate("HTTP {$statusCode}: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves a specific cancel by ID. Supports long-polling by appending `?polling=true` to wait
     * for a status change (up to the server timeout). Requires a secret-bearing token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If `true`, the server holds the connection open until
     *         the cancel status changes or the polling timeout is reached.
     * @return    Returns the Cancel wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Cancel> getCancel(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) throws ApiException, IOException {
        return prepareGetCancelRequest(storeId, chargeId, id, polling).execute();
    }

    /**
     * Retrieves a specific cancel by ID. Supports long-polling by appending `?polling=true` to wait
     * for a status change (up to the server timeout). Requires a secret-bearing token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If `true`, the server holds the connection open until
     *         the cancel status changes or the polling timeout is reached.
     * @return    Returns the Cancel wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Cancel>> getCancelAsync(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) {
        try {
            return prepareGetCancelRequest(storeId, chargeId, id, polling).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getCancel.
     */
    private ApiCall<ApiResponse<Cancel>, ApiException> prepareGetCancelRequest(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) {
        return new ApiCall.Builder<ApiResponse<Cancel>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/cancels/{id}")
                        .queryParam(param -> param.key("polling")
                                .value((polling != null) ? polling : false).isRequired(false))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("chargeId").value(chargeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Cancel.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setTemplate("HTTP 409 Conflict: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setTemplate("HTTP 500 Server Error: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setTemplate("HTTP 503 Unavailable: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("504",
                                 ErrorCase.setTemplate("HTTP 504 Timeout: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setTemplate("HTTP {$statusCode}: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates metadata on an existing cancel. Requires a secret-bearing token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  body  Required parameter: Request payload for updating cancel metadata.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Cancel wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Cancel> updateCancel(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final CancelUpdateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateCancelRequest(storeId, chargeId, id, body, idempotencyKey).execute();
    }

    /**
     * Updates metadata on an existing cancel. Requires a secret-bearing token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  body  Required parameter: Request payload for updating cancel metadata.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Cancel wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Cancel>> updateCancelAsync(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final CancelUpdateRequest body,
            final String idempotencyKey) {
        try {
            return prepareUpdateCancelRequest(storeId, chargeId, id, body, idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateCancel.
     */
    private ApiCall<ApiResponse<Cancel>, ApiException> prepareUpdateCancelRequest(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final CancelUpdateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<Cancel>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/cancels/{id}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("chargeId").value(chargeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("Idempotency-Key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Cancel.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setTemplate("HTTP 409 Conflict: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setTemplate("HTTP 500 Server Error: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setTemplate("HTTP 503 Unavailable: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("504",
                                 ErrorCase.setTemplate("HTTP 504 Timeout: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setTemplate("HTTP {$statusCode}: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
    
    // ── Hand-authored customization (kept at end of class to minimize regen conflicts) ──

    /**
     * Polls the cancel status using `getCancel` with `polling=true` until a terminal status is reached.
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  chargeId     Required parameter: The unique identifier of the charge.
     * @param  id           Required parameter: The unique identifier of the resource.
     * @param  maxAttempts  Optional parameter: The maximum number of polling attempts. Default is 10.
     * @return              Returns the Cancel wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Cancel> pollCancel(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Integer maxAttempts) throws ApiException, IOException {
        List<CancelStatus> terminalStatuses = Arrays.asList(
            CancelStatus.SUCCESSFUL,
            CancelStatus.FAILED,
            CancelStatus.ERROR
        );
        int attempts = 0;
        int limit = maxAttempts == null ? 10 : maxAttempts;
        while (attempts < limit) {
            ApiResponse<Cancel> response = getCancel(storeId, chargeId, id, true);
            if (response != null && response.getResult() != null && response.getResult().getStatus() != null) {
                if (terminalStatuses.contains(response.getResult().getStatus())) {
                    return response;
                }
            }
            attempts++;
        }
        return getCancel(storeId, chargeId, id, true);
    }

    /**
     * Polls the cancel status using `getCancel` with `polling=true` until a terminal status is reached (up to 10 attempts).
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  chargeId     Required parameter: The unique identifier of the charge.
     * @param  id           Required parameter: The unique identifier of the resource.
     * @return              Returns the Cancel wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Cancel> pollCancel(
            final UUID storeId,
            final UUID chargeId,
            final UUID id) throws ApiException, IOException {
        return pollCancel(storeId, chargeId, id, 10);
    }
}