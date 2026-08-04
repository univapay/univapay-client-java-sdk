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
import com.univapay.api.models.Store;
import com.univapay.api.models.StoreList;
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
public final class StoresApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public StoresApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns stores visible to the current merchant credential. Supports cursor pagination plus
     * `short_id` and free-text `search` filters.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  shortId  Optional parameter: Filter by short identifier.
     * @param  search  Optional parameter: Case-insensitive free-text search.
     * @return    Returns the StoreList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<StoreList> listStores(
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String shortId,
            final String search) throws ApiException, IOException {
        return prepareListStoresRequest(limit, cursor, cursorDirection, shortId, search).execute();
    }

    /**
     * Returns stores visible to the current merchant credential. Supports cursor pagination plus
     * `short_id` and free-text `search` filters.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  shortId  Optional parameter: Filter by short identifier.
     * @param  search  Optional parameter: Case-insensitive free-text search.
     * @return    Returns the StoreList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<StoreList>> listStoresAsync(
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String shortId,
            final String search) {
        try {
            return prepareListStoresRequest(limit, cursor, cursorDirection, shortId, search).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listStores.
     */
    private ApiCall<ApiResponse<StoreList>, ApiException> prepareListStoresRequest(
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String shortId,
            final String search) {
        return new ApiCall.Builder<ApiResponse<StoreList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("short_id")
                                .value(shortId).isRequired(false))
                        .queryParam(param -> param.key("search")
                                .value(search).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, StoreList.class))
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
     * Returns a single store plus its resolved configuration snapshot for the current merchant
     * context.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the Store wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Store> getStore(
            final UUID id) throws ApiException, IOException {
        return prepareGetStoreRequest(id).execute();
    }

    /**
     * Returns a single store plus its resolved configuration snapshot for the current merchant
     * context.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the Store wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Store>> getStoreAsync(
            final UUID id) {
        try {
            return prepareGetStoreRequest(id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getStore.
     */
    private ApiCall<ApiResponse<Store>, ApiException> prepareGetStoreRequest(
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<Store>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{id}")
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
                                response -> ApiHelper.deserialize(response, Store.class))
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
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
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