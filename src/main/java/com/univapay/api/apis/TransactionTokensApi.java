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
import com.univapay.api.models.EnableTokenThreeDsRequest;
import com.univapay.api.models.ModeQuery;
import com.univapay.api.models.ThreeDsIssuerToken;
import com.univapay.api.models.TransactionTokenActiveFilter;
import com.univapay.api.models.TransactionTokenCreateRequest;
import com.univapay.api.models.TransactionTokenList;
import com.univapay.api.models.TransactionTokenListType;
import com.univapay.api.models.TransactionTokenUpdateRequest;
import com.univapay.api.models.containers.TransactionToken;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class TransactionTokensApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public TransactionTokensApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Exchange raw payment data for a secure token. **PCI DSS Compliance Required** if sending raw
     * card numbers.
     * @param  body  Required parameter: Request payload for creating a transaction token.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionToken> createTransactionToken(
            final TransactionTokenCreateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateTransactionTokenRequest(body, idempotencyKey).execute();
    }

    /**
     * Exchange raw payment data for a secure token. **PCI DSS Compliance Required** if sending raw
     * card numbers.
     * @param  body  Required parameter: Request payload for creating a transaction token.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionToken>> createTransactionTokenAsync(
            final TransactionTokenCreateRequest body,
            final String idempotencyKey) {
        try {
            return prepareCreateTransactionTokenRequest(body, idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createTransactionToken.
     */
    private ApiCall<ApiResponse<TransactionToken>, ApiException> prepareCreateTransactionTokenRequest(
            final TransactionTokenCreateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<TransactionToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tokens")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
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
                                response -> ApiHelper.deserialize(response, TransactionToken.class))
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
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
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
     * Lists all transaction tokens across all stores.
     * @param  search  Optional parameter: Case-insensitive free-text search.
     * @param  customerId  Optional parameter: Filter by customer ID.
     * @param  type  Optional parameter: Filter by token type. `one_time` tokens are excluded from
     *         listings and cannot be filtered on; filtering to `recurring` requires the App Token
     *         Secret.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  active  Optional parameter: Filter recurring tokens by whether they are still active.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionTokenList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionTokenList> listAllTransactionTokens(
            final String search,
            final UUID customerId,
            final TransactionTokenListType type,
            final ModeQuery mode,
            final TransactionTokenActiveFilter active,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListAllTransactionTokensRequest(search, customerId, type, mode, active, limit,
                cursor, cursorDirection).execute();
    }

    /**
     * Lists all transaction tokens across all stores.
     * @param  search  Optional parameter: Case-insensitive free-text search.
     * @param  customerId  Optional parameter: Filter by customer ID.
     * @param  type  Optional parameter: Filter by token type. `one_time` tokens are excluded from
     *         listings and cannot be filtered on; filtering to `recurring` requires the App Token
     *         Secret.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  active  Optional parameter: Filter recurring tokens by whether they are still active.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionTokenList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionTokenList>> listAllTransactionTokensAsync(
            final String search,
            final UUID customerId,
            final TransactionTokenListType type,
            final ModeQuery mode,
            final TransactionTokenActiveFilter active,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListAllTransactionTokensRequest(search, customerId, type, mode, active, limit,
            cursor, cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listAllTransactionTokens.
     */
    private ApiCall<ApiResponse<TransactionTokenList>, ApiException> prepareListAllTransactionTokensRequest(
            final String search,
            final UUID customerId,
            final TransactionTokenListType type,
            final ModeQuery mode,
            final TransactionTokenActiveFilter active,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<TransactionTokenList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/tokens")
                        .queryParam(param -> param.key("search")
                                .value(search).isRequired(false))
                        .queryParam(param -> param.key("customer_id")
                                .value(customerId).isRequired(false))
                        .queryParam(param -> param.key("type")
                                .value((type != null) ? type.value() : null).isRequired(false))
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
                        .queryParam(param -> param.key("active")
                                .value((active != null) ? active.value() : "active").isRequired(false))
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TransactionTokenList.class))
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
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
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
     * Lists all transaction tokens for a specific store.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  search  Optional parameter: Case-insensitive free-text search.
     * @param  customerId  Optional parameter: Filter by customer ID.
     * @param  type  Optional parameter: Filter by token type. `one_time` tokens are excluded from
     *         listings and cannot be filtered on; filtering to `recurring` requires the App Token
     *         Secret.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  active  Optional parameter: Filter recurring tokens by whether they are still active.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionTokenList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionTokenList> listStoreTransactionTokens(
            final UUID storeId,
            final String search,
            final UUID customerId,
            final TransactionTokenListType type,
            final ModeQuery mode,
            final TransactionTokenActiveFilter active,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListStoreTransactionTokensRequest(storeId, search, customerId, type, mode,
                active, limit, cursor, cursorDirection).execute();
    }

    /**
     * Lists all transaction tokens for a specific store.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  search  Optional parameter: Case-insensitive free-text search.
     * @param  customerId  Optional parameter: Filter by customer ID.
     * @param  type  Optional parameter: Filter by token type. `one_time` tokens are excluded from
     *         listings and cannot be filtered on; filtering to `recurring` requires the App Token
     *         Secret.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  active  Optional parameter: Filter recurring tokens by whether they are still active.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionTokenList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionTokenList>> listStoreTransactionTokensAsync(
            final UUID storeId,
            final String search,
            final UUID customerId,
            final TransactionTokenListType type,
            final ModeQuery mode,
            final TransactionTokenActiveFilter active,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListStoreTransactionTokensRequest(storeId, search, customerId, type, mode, active,
            limit, cursor, cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listStoreTransactionTokens.
     */
    private ApiCall<ApiResponse<TransactionTokenList>, ApiException> prepareListStoreTransactionTokensRequest(
            final UUID storeId,
            final String search,
            final UUID customerId,
            final TransactionTokenListType type,
            final ModeQuery mode,
            final TransactionTokenActiveFilter active,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<TransactionTokenList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/tokens")
                        .queryParam(param -> param.key("search")
                                .value(search).isRequired(false))
                        .queryParam(param -> param.key("customer_id")
                                .value(customerId).isRequired(false))
                        .queryParam(param -> param.key("type")
                                .value((type != null) ? type.value() : null).isRequired(false))
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
                        .queryParam(param -> param.key("active")
                                .value((active != null) ? active.value() : "active").isRequired(false))
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TransactionTokenList.class))
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
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
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
     * Retrieves the details of an existing transaction token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If set to true, instructs the API to internally poll the
     *         token's 3DS or CVV authorization sub-status until it transitions to another status,
     *         or until the ~3 second server-side timeout is reached.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionToken> getTransactionToken(
            final UUID storeId,
            final UUID id,
            final Boolean polling) throws ApiException, IOException {
        return prepareGetTransactionTokenRequest(storeId, id, polling).execute();
    }

    /**
     * Retrieves the details of an existing transaction token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If set to true, instructs the API to internally poll the
     *         token's 3DS or CVV authorization sub-status until it transitions to another status,
     *         or until the ~3 second server-side timeout is reached.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionToken>> getTransactionTokenAsync(
            final UUID storeId,
            final UUID id,
            final Boolean polling) {
        try {
            return prepareGetTransactionTokenRequest(storeId, id, polling).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getTransactionToken.
     */
    private ApiCall<ApiResponse<TransactionToken>, ApiException> prepareGetTransactionTokenRequest(
            final UUID storeId,
            final UUID id,
            final Boolean polling) {
        return new ApiCall.Builder<ApiResponse<TransactionToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/tokens/{id}")
                        .queryParam(param -> param.key("polling")
                                .value(polling).isRequired(false))
                        .templateParam(param -> param.key("storeId").value(storeId)
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
                                response -> ApiHelper.deserialize(response, TransactionToken.class))
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
     * ⚠️ **LEGACY WARNING: Discouraged Operation** While it is technically possible to update a
     * transaction token, this practice is highly discouraged and is maintained solely for legacy
     * reasons. **Updating raw card details requires your server environment to be fully PCI DSS
     * compliant.** **Recommended Approach:** Instead of updating an existing token, it is best
     * practice to create an entirely new transaction token using Univapay's frontend integrations
     * (**Link Form**, **Widget**, or **Inline Form**). This allows Univapay to securely handle the
     * customer's payment data without it ever touching your servers. --- **Legacy Usage:** Updates
     * CVV, Address, Email, or Card Details. *Note: If updating only the CVV to resolve a
     * `RECURRING_USAGE_REQUIRES_CVV` error, the application token secret is not required.*.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for updating a transaction token.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionToken> updateTransactionToken(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final TransactionTokenUpdateRequest body) throws ApiException, IOException {
        return prepareUpdateTransactionTokenRequest(storeId, id, idempotencyKey, body).execute();
    }

    /**
     * ⚠️ **LEGACY WARNING: Discouraged Operation** While it is technically possible to update a
     * transaction token, this practice is highly discouraged and is maintained solely for legacy
     * reasons. **Updating raw card details requires your server environment to be fully PCI DSS
     * compliant.** **Recommended Approach:** Instead of updating an existing token, it is best
     * practice to create an entirely new transaction token using Univapay's frontend integrations
     * (**Link Form**, **Widget**, or **Inline Form**). This allows Univapay to securely handle the
     * customer's payment data without it ever touching your servers. --- **Legacy Usage:** Updates
     * CVV, Address, Email, or Card Details. *Note: If updating only the CVV to resolve a
     * `RECURRING_USAGE_REQUIRES_CVV` error, the application token secret is not required.*.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for updating a transaction token.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionToken>> updateTransactionTokenAsync(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final TransactionTokenUpdateRequest body) {
        try {
            return prepareUpdateTransactionTokenRequest(storeId, id, idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateTransactionToken.
     */
    private ApiCall<ApiResponse<TransactionToken>, ApiException> prepareUpdateTransactionTokenRequest(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final TransactionTokenUpdateRequest body) {
        return new ApiCall.Builder<ApiResponse<TransactionToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/tokens/{id}")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
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
                                response -> ApiHelper.deserialize(response, TransactionToken.class))
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
     * Deletes a specific transaction token. ⚠️ **WARNING: Breaks Linked Subscriptions** Please note
     * that deleting a transaction token will immediately prevent any linked recurring charges or
     * subscriptions from being processed. Proceed with caution.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> deleteTransactionToken(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return prepareDeleteTransactionTokenRequest(storeId, id).execute();
    }

    /**
     * Deletes a specific transaction token. ⚠️ **WARNING: Breaks Linked Subscriptions** Please note
     * that deleting a transaction token will immediately prevent any linked recurring charges or
     * subscriptions from being processed. Proceed with caution.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> deleteTransactionTokenAsync(
            final UUID storeId,
            final UUID id) {
        try {
            return prepareDeleteTransactionTokenRequest(storeId, id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for deleteTransactionToken.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareDeleteTransactionTokenRequest(
            final UUID storeId,
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/tokens/{id}")
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
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
     * Enables 3-D Secure on an existing `recurring` transaction token that was created without it.
     * Only applies to `recurring` tokens; returns an error if 3DS is already enabled. After calling
     * this endpoint, poll the token until `data.three_ds.status` becomes `awaiting`, then use the
     * token 3DS issuer token endpoint to complete authentication.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Optional request payload. Omit entirely, or omit
     *         `redirect_endpoint`, if no redirect is needed.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionToken> enableTokenThreeDs(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final EnableTokenThreeDsRequest body) throws ApiException, IOException {
        return prepareEnableTokenThreeDsRequest(storeId, id, idempotencyKey, body).execute();
    }

    /**
     * Enables 3-D Secure on an existing `recurring` transaction token that was created without it.
     * Only applies to `recurring` tokens; returns an error if 3DS is already enabled. After calling
     * this endpoint, poll the token until `data.three_ds.status` becomes `awaiting`, then use the
     * token 3DS issuer token endpoint to complete authentication.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Optional request payload. Omit entirely, or omit
     *         `redirect_endpoint`, if no redirect is needed.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionToken>> enableTokenThreeDsAsync(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final EnableTokenThreeDsRequest body) {
        try {
            return prepareEnableTokenThreeDsRequest(storeId, id, idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for enableTokenThreeDs.
     */
    private ApiCall<ApiResponse<TransactionToken>, ApiException> prepareEnableTokenThreeDsRequest(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final EnableTokenThreeDsRequest body) {
        return new ApiCall.Builder<ApiResponse<TransactionToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/tokens/{id}/three_ds")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
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
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TransactionToken.class))
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
     * Disables 3-D Secure on an existing `recurring` transaction token. Only applies to `recurring`
     * tokens.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionToken> disableTokenThreeDs(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return prepareDisableTokenThreeDsRequest(storeId, id).execute();
    }

    /**
     * Disables 3-D Secure on an existing `recurring` transaction token. Only applies to `recurring`
     * tokens.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the TransactionToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionToken>> disableTokenThreeDsAsync(
            final UUID storeId,
            final UUID id) {
        try {
            return prepareDisableTokenThreeDsRequest(storeId, id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for disableTokenThreeDs.
     */
    private ApiCall<ApiResponse<TransactionToken>, ApiException> prepareDisableTokenThreeDsRequest(
            final UUID storeId,
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<TransactionToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/tokens/{id}/three_ds")
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TransactionToken.class))
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
     * Retrieves the information required to execute 3-D Secure authentication when creating a
     * recurring transaction token. **⚠️ Important Notes:** 1. **PCI DSS Compliance:** This endpoint
     * is only available to PCI DSS compliant merchants who are authorized to send raw card data
     * directly via the API to create tokens. 2. **Target Tokens:** This only applies to tokens
     * where `type` is `recurring`. For `one_time` or `subscription` tokens, 3-D Secure is requested
     * during charge creation, not token creation. 3. **Execution Flow:** - After creating the
     * token, poll the token object until `data.three_ds.status` becomes `awaiting`. - Once
     * `awaiting`, use this endpoint to fetch the issuer token details. - Format the returned
     * `payload` according to the `content_type` (e.g., URL-encoded) and execute an `http_post`
     * request from the consumer's browser to the `issuer_token` URL.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the ThreeDsIssuerToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ThreeDsIssuerToken> getTokenThreeDsIssuerToken(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return prepareGetTokenThreeDsIssuerTokenRequest(storeId, id).execute();
    }

    /**
     * Retrieves the information required to execute 3-D Secure authentication when creating a
     * recurring transaction token. **⚠️ Important Notes:** 1. **PCI DSS Compliance:** This endpoint
     * is only available to PCI DSS compliant merchants who are authorized to send raw card data
     * directly via the API to create tokens. 2. **Target Tokens:** This only applies to tokens
     * where `type` is `recurring`. For `one_time` or `subscription` tokens, 3-D Secure is requested
     * during charge creation, not token creation. 3. **Execution Flow:** - After creating the
     * token, poll the token object until `data.three_ds.status` becomes `awaiting`. - Once
     * `awaiting`, use this endpoint to fetch the issuer token details. - Format the returned
     * `payload` according to the `content_type` (e.g., URL-encoded) and execute an `http_post`
     * request from the consumer's browser to the `issuer_token` URL.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the ThreeDsIssuerToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ThreeDsIssuerToken>> getTokenThreeDsIssuerTokenAsync(
            final UUID storeId,
            final UUID id) {
        try {
            return prepareGetTokenThreeDsIssuerTokenRequest(storeId, id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getTokenThreeDsIssuerToken.
     */
    private ApiCall<ApiResponse<ThreeDsIssuerToken>, ApiException> prepareGetTokenThreeDsIssuerTokenRequest(
            final UUID storeId,
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<ThreeDsIssuerToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/tokens/{id}/three_ds/issuer_token")
                        .templateParam(param -> param.key("storeId").value(storeId)
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
                                response -> ApiHelper.deserialize(response, ThreeDsIssuerToken.class))
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
}