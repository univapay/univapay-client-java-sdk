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
import com.univapay.api.models.CursorDirectionQuery;
import com.univapay.api.models.Refund;
import com.univapay.api.models.RefundCreateRequest;
import com.univapay.api.models.RefundList;
import com.univapay.api.models.RefundUpdateRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import com.univapay.api.models.RefundStatus;
import java.util.Arrays;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class RefundsApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public RefundsApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves a list of all refunds for a specific charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  metadata  Optional parameter: Filter refunds by metadata content.
     * @return    Returns the RefundList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<RefundList> listRefunds(
            final UUID storeId,
            final UUID chargeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String metadata) throws ApiException, IOException {
        return prepareListRefundsRequest(storeId, chargeId, limit, cursor, cursorDirection,
                metadata).execute();
    }

    /**
     * Retrieves a list of all refunds for a specific charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  metadata  Optional parameter: Filter refunds by metadata content.
     * @return    Returns the RefundList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<RefundList>> listRefundsAsync(
            final UUID storeId,
            final UUID chargeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String metadata) {
        try {
            return prepareListRefundsRequest(storeId, chargeId, limit, cursor, cursorDirection,
            metadata).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listRefunds.
     */
    private ApiCall<ApiResponse<RefundList>, ApiException> prepareListRefundsRequest(
            final UUID storeId,
            final UUID chargeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String metadata) {
        return new ApiCall.Builder<ApiResponse<RefundList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/refunds")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, RefundList.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
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
     * Creates a refund for a successful charge. The charge must have status `successful`. Konbini
     * and bank transfer charges cannot be refunded. The refund is processed asynchronously — the
     * initial status will be `pending`.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  body  Required parameter: Request payload for creating a refund.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Refund> createRefund(
            final UUID storeId,
            final UUID chargeId,
            final RefundCreateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateRefundRequest(storeId, chargeId, body, idempotencyKey).execute();
    }

    /**
     * Creates a refund for a successful charge. The charge must have status `successful`. Konbini
     * and bank transfer charges cannot be refunded. The refund is processed asynchronously — the
     * initial status will be `pending`.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  body  Required parameter: Request payload for creating a refund.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Refund>> createRefundAsync(
            final UUID storeId,
            final UUID chargeId,
            final RefundCreateRequest body,
            final String idempotencyKey) {
        try {
            return prepareCreateRefundRequest(storeId, chargeId, body, idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createRefund.
     */
    private ApiCall<ApiResponse<Refund>, ApiException> prepareCreateRefundRequest(
            final UUID storeId,
            final UUID chargeId,
            final RefundCreateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<Refund>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/refunds")
                        .bodyParam(param -> param.value(body))
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
                                response -> ApiHelper.deserialize(response, Refund.class))
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
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setTemplate("HTTP 409 Conflict: {$response.body#/code}",
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
     * Retrieves the details of a specific refund. Supports long polling — set `polling=true` to
     * wait until the refund status changes from `pending` to a terminal state (`successful`,
     * `failed`, or `error`).
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If `true`, the server holds the connection open until
     *         the refund status transitions from `pending` to a terminal state, or until the
     *         polling timeout is reached.
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Refund> getRefund(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) throws ApiException, IOException {
        return prepareGetRefundRequest(storeId, chargeId, id, polling).execute();
    }

    /**
     * Retrieves the details of a specific refund. Supports long polling — set `polling=true` to
     * wait until the refund status changes from `pending` to a terminal state (`successful`,
     * `failed`, or `error`).
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If `true`, the server holds the connection open until
     *         the refund status transitions from `pending` to a terminal state, or until the
     *         polling timeout is reached.
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Refund>> getRefundAsync(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) {
        try {
            return prepareGetRefundRequest(storeId, chargeId, id, polling).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getRefund.
     */
    private ApiCall<ApiResponse<Refund>, ApiException> prepareGetRefundRequest(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) {
        return new ApiCall.Builder<ApiResponse<Refund>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/refunds/{id}")
                        .queryParam(param -> param.key("polling")
                                .value(polling).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, Refund.class))
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
     * Updates metadata, message, or reason on an existing refund.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  body  Required parameter: Request payload for updating refund metadata or reason.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Refund> updateRefund(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final RefundUpdateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateRefundRequest(storeId, chargeId, id, body, idempotencyKey).execute();
    }

    /**
     * Updates metadata, message, or reason on an existing refund.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  body  Required parameter: Request payload for updating refund metadata or reason.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Refund wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Refund>> updateRefundAsync(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final RefundUpdateRequest body,
            final String idempotencyKey) {
        try {
            return prepareUpdateRefundRequest(storeId, chargeId, id, body, idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateRefund.
     */
    private ApiCall<ApiResponse<Refund>, ApiException> prepareUpdateRefundRequest(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final RefundUpdateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<Refund>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/refunds/{id}")
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
                                response -> ApiHelper.deserialize(response, Refund.class))
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
     * Polls the refund status using `getRefund` with `polling=true` until a terminal status is reached.
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  chargeId     Required parameter: The unique identifier of the charge.
     * @param  id           Required parameter: The unique identifier of the resource.
     * @param  maxAttempts  Optional parameter: The maximum number of polling attempts. Default is 10.
     * @return              Returns the Refund wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Refund> pollRefund(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Integer maxAttempts) throws ApiException, IOException {
        List<RefundStatus> terminalStatuses = Arrays.asList(
            RefundStatus.SUCCESSFUL,
            RefundStatus.FAILED,
            RefundStatus.ERROR
        );
        int attempts = 0;
        int limit = maxAttempts == null ? 10 : maxAttempts;
        while (attempts < limit) {
            ApiResponse<Refund> response = getRefund(storeId, chargeId, id, true);
            if (response != null && response.getResult() != null && response.getResult().getStatus() != null) {
                if (terminalStatuses.contains(response.getResult().getStatus())) {
                    return response;
                }
            }
            attempts++;
        }
        return getRefund(storeId, chargeId, id, true);
    }

    /**
     * Polls the refund status using `getRefund` with `polling=true` until a terminal status is reached (up to 10 attempts).
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  chargeId     Required parameter: The unique identifier of the charge.
     * @param  id           Required parameter: The unique identifier of the resource.
     * @return              Returns the Refund wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Refund> pollRefund(
            final UUID storeId,
            final UUID chargeId,
            final UUID id) throws ApiException, IOException {
        return pollRefund(storeId, chargeId, id, 10);
    }
}