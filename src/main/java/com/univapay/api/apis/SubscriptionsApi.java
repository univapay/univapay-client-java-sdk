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
import com.univapay.api.models.Charge;
import com.univapay.api.models.ChargeList;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.CursorDirectionQuery;
import com.univapay.api.models.Subscription;
import com.univapay.api.models.SubscriptionCreateRequest;
import com.univapay.api.models.SubscriptionList;
import com.univapay.api.models.SubscriptionPatchPaymentRequest;
import com.univapay.api.models.SubscriptionPatchTokenRequest;
import com.univapay.api.models.SubscriptionPayment;
import com.univapay.api.models.SubscriptionPaymentList;
import com.univapay.api.models.SubscriptionSimulationPayment;
import com.univapay.api.models.SubscriptionSimulationRequest;
import com.univapay.api.models.SubscriptionStatus;
import com.univapay.api.models.SubscriptionSuspendRequest;
import com.univapay.api.models.SubscriptionUpdateRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.Arrays;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionsApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionsApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a new subscription.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Create Subscription request
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> createSubscription(
            final String idempotencyKey,
            final SubscriptionCreateRequest body) throws ApiException, IOException {
        return prepareCreateSubscriptionRequest(idempotencyKey, body).execute();
    }

    /**
     * Creates a new subscription.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Create Subscription request
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Subscription>> createSubscriptionAsync(
            final String idempotencyKey,
            final SubscriptionCreateRequest body) {
        try {
            return prepareCreateSubscriptionRequest(idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createSubscription.
     */
    private ApiCall<ApiResponse<Subscription>, ApiException> prepareCreateSubscriptionRequest(
            final String idempotencyKey,
            final SubscriptionCreateRequest body) {
        return new ApiCall.Builder<ApiResponse<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions")
                        .bodyParam(param -> param.value(body).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, Subscription.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
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
     * Lists all subscriptions across all stores.
     * @param  search  Optional parameter: Search by metadata values.
     * @param  status  Optional parameter: Filter subscriptions by current status.
     * @param  mode  Optional parameter: Filter subscriptions by processing mode.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the SubscriptionList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SubscriptionList> listAllSubscriptions(
            final String search,
            final SubscriptionStatus status,
            final ChargeMode mode,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListAllSubscriptionsRequest(search, status, mode, limit, cursor,
                cursorDirection).execute();
    }

    /**
     * Lists all subscriptions across all stores.
     * @param  search  Optional parameter: Search by metadata values.
     * @param  status  Optional parameter: Filter subscriptions by current status.
     * @param  mode  Optional parameter: Filter subscriptions by processing mode.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the SubscriptionList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SubscriptionList>> listAllSubscriptionsAsync(
            final String search,
            final SubscriptionStatus status,
            final ChargeMode mode,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListAllSubscriptionsRequest(search, status, mode, limit, cursor,
            cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listAllSubscriptions.
     */
    private ApiCall<ApiResponse<SubscriptionList>, ApiException> prepareListAllSubscriptionsRequest(
            final String search,
            final SubscriptionStatus status,
            final ChargeMode mode,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<SubscriptionList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions")
                        .queryParam(param -> param.key("search")
                                .value(search).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, SubscriptionList.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
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
     * Simulates the payment schedule that a subscription would follow, without creating a live
     * subscription or a transaction token. Returns a bare array of the scheduled payments that
     * would result from the given amount, currency, period (or cyclical period), and plan settings.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Subscription Plan Simulation request
     * @return    Returns the List of SubscriptionSimulationPayment wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<SubscriptionSimulationPayment>> simulateSubscriptionPlan(
            final String idempotencyKey,
            final SubscriptionSimulationRequest body) throws ApiException, IOException {
        return prepareSimulateSubscriptionPlanRequest(idempotencyKey, body).execute();
    }

    /**
     * Simulates the payment schedule that a subscription would follow, without creating a live
     * subscription or a transaction token. Returns a bare array of the scheduled payments that
     * would result from the given amount, currency, period (or cyclical period), and plan settings.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Subscription Plan Simulation request
     * @return    Returns the List of SubscriptionSimulationPayment wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<SubscriptionSimulationPayment>>> simulateSubscriptionPlanAsync(
            final String idempotencyKey,
            final SubscriptionSimulationRequest body) {
        try {
            return prepareSimulateSubscriptionPlanRequest(idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for simulateSubscriptionPlan.
     */
    private ApiCall<ApiResponse<List<SubscriptionSimulationPayment>>, ApiException> prepareSimulateSubscriptionPlanRequest(
            final String idempotencyKey,
            final SubscriptionSimulationRequest body) {
        return new ApiCall.Builder<ApiResponse<List<SubscriptionSimulationPayment>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/simulate_plan")
                        .bodyParam(param -> param.value(body).isRequired(false))
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
                                response -> ApiHelper.deserializeArray(response,
                                        SubscriptionSimulationPayment[].class))
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
     * Lists all subscriptions for a specific store.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  search  Optional parameter: Search by metadata values.
     * @param  status  Optional parameter: Filter subscriptions by current status.
     * @param  mode  Optional parameter: Filter subscriptions by processing mode.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the SubscriptionList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SubscriptionList> listStoreSubscriptions(
            final UUID storeId,
            final String search,
            final SubscriptionStatus status,
            final ChargeMode mode,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListStoreSubscriptionsRequest(storeId, search, status, mode, limit, cursor,
                cursorDirection).execute();
    }

    /**
     * Lists all subscriptions for a specific store.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  search  Optional parameter: Search by metadata values.
     * @param  status  Optional parameter: Filter subscriptions by current status.
     * @param  mode  Optional parameter: Filter subscriptions by processing mode.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the SubscriptionList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SubscriptionList>> listStoreSubscriptionsAsync(
            final UUID storeId,
            final String search,
            final SubscriptionStatus status,
            final ChargeMode mode,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListStoreSubscriptionsRequest(storeId, search, status, mode, limit, cursor,
            cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listStoreSubscriptions.
     */
    private ApiCall<ApiResponse<SubscriptionList>, ApiException> prepareListStoreSubscriptionsRequest(
            final UUID storeId,
            final String search,
            final SubscriptionStatus status,
            final ChargeMode mode,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<SubscriptionList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions")
                        .queryParam(param -> param.key("search")
                                .value(search).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, SubscriptionList.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("HTTP 404 Not Found: {$response.body#/code}",
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
     * Simulates the payment schedule that a subscription would follow for a specific store, without
     * creating a live subscription or a transaction token. Returns a bare array of the scheduled
     * payments that would result from the given amount, currency, period (or cyclical period), and
     * plan settings.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Subscription Plan Simulation request
     * @return    Returns the List of SubscriptionSimulationPayment wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<SubscriptionSimulationPayment>> simulateStoreSubscriptionPlan(
            final UUID storeId,
            final String idempotencyKey,
            final SubscriptionSimulationRequest body) throws ApiException, IOException {
        return prepareSimulateStoreSubscriptionPlanRequest(storeId, idempotencyKey, body).execute();
    }

    /**
     * Simulates the payment schedule that a subscription would follow for a specific store, without
     * creating a live subscription or a transaction token. Returns a bare array of the scheduled
     * payments that would result from the given amount, currency, period (or cyclical period), and
     * plan settings.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Subscription Plan Simulation request
     * @return    Returns the List of SubscriptionSimulationPayment wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<SubscriptionSimulationPayment>>> simulateStoreSubscriptionPlanAsync(
            final UUID storeId,
            final String idempotencyKey,
            final SubscriptionSimulationRequest body) {
        try {
            return prepareSimulateStoreSubscriptionPlanRequest(storeId, idempotencyKey,
            body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for simulateStoreSubscriptionPlan.
     */
    private ApiCall<ApiResponse<List<SubscriptionSimulationPayment>>, ApiException> prepareSimulateStoreSubscriptionPlanRequest(
            final UUID storeId,
            final String idempotencyKey,
            final SubscriptionSimulationRequest body) {
        return new ApiCall.Builder<ApiResponse<List<SubscriptionSimulationPayment>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/simulate_plan")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
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
                                response -> ApiHelper.deserializeArray(response,
                                        SubscriptionSimulationPayment[].class))
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
     * Retrieves the details of an existing subscription. Supports internal polling to wait for
     * status changes.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The Subscription ID.
     * @param  polling  Optional parameter: If set to true, instructs the API to internally poll the
     *         subscription status until it changes from 'unverified' (the initial status) to
     *         another status.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> getSubscription(
            final UUID storeId,
            final UUID id,
            final Boolean polling) throws ApiException, IOException {
        return prepareGetSubscriptionRequest(storeId, id, polling).execute();
    }

    /**
     * Retrieves the details of an existing subscription. Supports internal polling to wait for
     * status changes.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The Subscription ID.
     * @param  polling  Optional parameter: If set to true, instructs the API to internally poll the
     *         subscription status until it changes from 'unverified' (the initial status) to
     *         another status.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Subscription>> getSubscriptionAsync(
            final UUID storeId,
            final UUID id,
            final Boolean polling) {
        try {
            return prepareGetSubscriptionRequest(storeId, id, polling).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getSubscription.
     */
    private ApiCall<ApiResponse<Subscription>, ApiException> prepareGetSubscriptionRequest(
            final UUID storeId,
            final UUID id,
            final Boolean polling) {
        return new ApiCall.Builder<ApiResponse<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{id}")
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
                                response -> ApiHelper.deserialize(response, Subscription.class))
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
     * Updates the configuration, payment method, or schedule of a specific subscription.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Properties to update on the subscription.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> updateSubscription(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final SubscriptionUpdateRequest body) throws ApiException, IOException {
        return prepareUpdateSubscriptionRequest(storeId, id, idempotencyKey, body).execute();
    }

    /**
     * Updates the configuration, payment method, or schedule of a specific subscription.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Properties to update on the subscription.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Subscription>> updateSubscriptionAsync(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final SubscriptionUpdateRequest body) {
        try {
            return prepareUpdateSubscriptionRequest(storeId, id, idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateSubscription.
     */
    private ApiCall<ApiResponse<Subscription>, ApiException> prepareUpdateSubscriptionRequest(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final SubscriptionUpdateRequest body) {
        return new ApiCall.Builder<ApiResponse<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{id}")
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
                                response -> ApiHelper.deserialize(response, Subscription.class))
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
     * Cancels an existing subscription. The subscription status will be permanently changed to
     * `canceled` and it cannot be resumed. Please proceed with caution.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> cancelSubscription(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return prepareCancelSubscriptionRequest(storeId, id).execute();
    }

    /**
     * Cancels an existing subscription. The subscription status will be permanently changed to
     * `canceled` and it cannot be resumed. Please proceed with caution.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> cancelSubscriptionAsync(
            final UUID storeId,
            final UUID id) {
        try {
            return prepareCancelSubscriptionRequest(storeId, id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for cancelSubscription.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareCancelSubscriptionRequest(
            final UUID storeId,
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{id}")
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
     * Retrieves a list of all historical and scheduled payments for a specific subscription.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the SubscriptionPaymentList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SubscriptionPaymentList> listSubscriptionPayments(
            final UUID storeId,
            final UUID subscriptionId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListSubscriptionPaymentsRequest(storeId, subscriptionId, limit, cursor,
                cursorDirection).execute();
    }

    /**
     * Retrieves a list of all historical and scheduled payments for a specific subscription.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the SubscriptionPaymentList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SubscriptionPaymentList>> listSubscriptionPaymentsAsync(
            final UUID storeId,
            final UUID subscriptionId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListSubscriptionPaymentsRequest(storeId, subscriptionId, limit, cursor,
            cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listSubscriptionPayments.
     */
    private ApiCall<ApiResponse<SubscriptionPaymentList>, ApiException> prepareListSubscriptionPaymentsRequest(
            final UUID storeId,
            final UUID subscriptionId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<SubscriptionPaymentList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/payments")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionPaymentList.class))
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
     * Retrieves the details of an individual payment associated with a specific subscription.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  paymentId  Required parameter: The unique identifier of the scheduled payment of a
     *         subscription
     * @return    Returns the SubscriptionPayment wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SubscriptionPayment> getSubscriptionPayment(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId) throws ApiException, IOException {
        return prepareGetSubscriptionPaymentRequest(storeId, subscriptionId, paymentId).execute();
    }

    /**
     * Retrieves the details of an individual payment associated with a specific subscription.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  paymentId  Required parameter: The unique identifier of the scheduled payment of a
     *         subscription
     * @return    Returns the SubscriptionPayment wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SubscriptionPayment>> getSubscriptionPaymentAsync(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId) {
        try {
            return prepareGetSubscriptionPaymentRequest(storeId, subscriptionId, paymentId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getSubscriptionPayment.
     */
    private ApiCall<ApiResponse<SubscriptionPayment>, ApiException> prepareGetSubscriptionPaymentRequest(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId) {
        return new ApiCall.Builder<ApiResponse<SubscriptionPayment>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/payments/{paymentId}")
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("paymentId").value(paymentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionPayment.class))
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
     * Updates properties of a specific scheduled payment for a subscription. Can be used to change
     * the due date when permitted, mark the payment as paid, schedule a termination status, or set
     * a retry interval.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  paymentId  Required parameter: The unique identifier of the scheduled payment of a
     *         subscription
     * @param  body  Required parameter: Request payload for updating a scheduled subscription
     *         payment.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the SubscriptionPayment wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SubscriptionPayment> updateSubscriptionPayment(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId,
            final SubscriptionPatchPaymentRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateSubscriptionPaymentRequest(storeId, subscriptionId, paymentId, body,
                idempotencyKey).execute();
    }

    /**
     * Updates properties of a specific scheduled payment for a subscription. Can be used to change
     * the due date when permitted, mark the payment as paid, schedule a termination status, or set
     * a retry interval.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  paymentId  Required parameter: The unique identifier of the scheduled payment of a
     *         subscription
     * @param  body  Required parameter: Request payload for updating a scheduled subscription
     *         payment.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the SubscriptionPayment wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SubscriptionPayment>> updateSubscriptionPaymentAsync(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId,
            final SubscriptionPatchPaymentRequest body,
            final String idempotencyKey) {
        try {
            return prepareUpdateSubscriptionPaymentRequest(storeId, subscriptionId, paymentId, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateSubscriptionPayment.
     */
    private ApiCall<ApiResponse<SubscriptionPayment>, ApiException> prepareUpdateSubscriptionPaymentRequest(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId,
            final SubscriptionPatchPaymentRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<SubscriptionPayment>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/payments/{paymentId}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("paymentId").value(paymentId)
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
                                response -> ApiHelper.deserialize(response, SubscriptionPayment.class))
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

    /**
     * Retrieves the most recent charge created for a specific subscription. Returns 404 if no
     * charges have been attempted yet.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Charge> getSubscriptionLatestCharge(
            final UUID storeId,
            final UUID subscriptionId) throws ApiException, IOException {
        return prepareGetSubscriptionLatestChargeRequest(storeId, subscriptionId).execute();
    }

    /**
     * Retrieves the most recent charge created for a specific subscription. Returns 404 if no
     * charges have been attempted yet.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Charge>> getSubscriptionLatestChargeAsync(
            final UUID storeId,
            final UUID subscriptionId) {
        try {
            return prepareGetSubscriptionLatestChargeRequest(storeId, subscriptionId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getSubscriptionLatestCharge.
     */
    private ApiCall<ApiResponse<Charge>, ApiException> prepareGetSubscriptionLatestChargeRequest(
            final UUID storeId,
            final UUID subscriptionId) {
        return new ApiCall.Builder<ApiResponse<Charge>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/charges/latest")
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Charge.class))
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
     * Retrieves a paginated list of charges linked to a subscription. Backend search uses the same
     * charge search surface as normal charge listing and adds a subscription filter for the
     * requested subscription.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChargeList> listSubscriptionCharges(
            final UUID merchantId,
            final UUID storeId,
            final UUID subscriptionId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListSubscriptionChargesRequest(merchantId, storeId, subscriptionId, limit,
                cursor, cursorDirection).execute();
    }

    /**
     * Retrieves a paginated list of charges linked to a subscription. Backend search uses the same
     * charge search surface as normal charge listing and adds a subscription filter for the
     * requested subscription.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChargeList>> listSubscriptionChargesAsync(
            final UUID merchantId,
            final UUID storeId,
            final UUID subscriptionId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListSubscriptionChargesRequest(merchantId, storeId, subscriptionId, limit, cursor,
            cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listSubscriptionCharges.
     */
    private ApiCall<ApiResponse<ChargeList>, ApiException> prepareListSubscriptionChargesRequest(
            final UUID merchantId,
            final UUID storeId,
            final UUID subscriptionId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<ChargeList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/merchants/{merchantId}/stores/{storeId}/subscriptions/{subscriptionId}/charges")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ChargeList.class))
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

    /**
     * Retrieves a paginated list of all charge attempts made for a specific scheduled payment of a
     * subscription. Useful for inspecting retry history.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  paymentId  Required parameter: The unique identifier of the scheduled payment of a
     *         subscription
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChargeList> listChargesForSubscriptionPayment(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListChargesForSubscriptionPaymentRequest(storeId, subscriptionId, paymentId,
                limit, cursor, cursorDirection).execute();
    }

    /**
     * Retrieves a paginated list of all charge attempts made for a specific scheduled payment of a
     * subscription. Useful for inspecting retry history.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  paymentId  Required parameter: The unique identifier of the scheduled payment of a
     *         subscription
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChargeList>> listChargesForSubscriptionPaymentAsync(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListChargesForSubscriptionPaymentRequest(storeId, subscriptionId, paymentId,
            limit, cursor, cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listChargesForSubscriptionPayment.
     */
    private ApiCall<ApiResponse<ChargeList>, ApiException> prepareListChargesForSubscriptionPaymentRequest(
            final UUID storeId,
            final UUID subscriptionId,
            final UUID paymentId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<ChargeList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/payments/{paymentId}/charges")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("paymentId").value(paymentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ChargeList.class))
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
     * Suspends a subscription that is currently `current` or `unpaid`. The `termination_mode`
     * controls when the suspension takes effect: `immediate` (default) suspends right away,
     * `on_next_payment` waits until the next scheduled payment date before suspending.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for suspending a subscription.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> suspendSubscription(
            final UUID storeId,
            final UUID subscriptionId,
            final String idempotencyKey,
            final SubscriptionSuspendRequest body) throws ApiException, IOException {
        return prepareSuspendSubscriptionRequest(storeId, subscriptionId, idempotencyKey,
                body).execute();
    }

    /**
     * Suspends a subscription that is currently `current` or `unpaid`. The `termination_mode`
     * controls when the suspension takes effect: `immediate` (default) suspends right away,
     * `on_next_payment` waits until the next scheduled payment date before suspending.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for suspending a subscription.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Subscription>> suspendSubscriptionAsync(
            final UUID storeId,
            final UUID subscriptionId,
            final String idempotencyKey,
            final SubscriptionSuspendRequest body) {
        try {
            return prepareSuspendSubscriptionRequest(storeId, subscriptionId, idempotencyKey,
            body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for suspendSubscription.
     */
    private ApiCall<ApiResponse<Subscription>, ApiException> prepareSuspendSubscriptionRequest(
            final UUID storeId,
            final UUID subscriptionId,
            final String idempotencyKey,
            final SubscriptionSuspendRequest body) {
        return new ApiCall.Builder<ApiResponse<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/suspend")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
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
                                response -> ApiHelper.deserialize(response, Subscription.class))
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
     * Resumes a subscription that is currently `suspended`, setting its status back to `unpaid` and
     * rescheduling the next payment. No request body is required.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> unsuspendSubscription(
            final UUID storeId,
            final UUID subscriptionId,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUnsuspendSubscriptionRequest(storeId, subscriptionId,
                idempotencyKey).execute();
    }

    /**
     * Resumes a subscription that is currently `suspended`, setting its status back to `unpaid` and
     * rescheduling the next payment. No request body is required.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Subscription>> unsuspendSubscriptionAsync(
            final UUID storeId,
            final UUID subscriptionId,
            final String idempotencyKey) {
        try {
            return prepareUnsuspendSubscriptionRequest(storeId, subscriptionId,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for unsuspendSubscription.
     */
    private ApiCall<ApiResponse<Subscription>, ApiException> prepareUnsuspendSubscriptionRequest(
            final UUID storeId,
            final UUID subscriptionId,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/unsuspend")
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
                                .shouldEncode(true))
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
                                response -> ApiHelper.deserialize(response, Subscription.class))
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
     * Replaces the payment method (transaction token) used for a subscription. Useful when a card
     * expires or a customer wants to switch payment methods. The new token must belong to the same
     * store, be active, and match the subscription's processing mode (live/test). One-time tokens
     * are not accepted; use a recurring or subscription token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  body  Required parameter: Request payload for replacing a subscription payment token.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> updateSubscriptionToken(
            final UUID storeId,
            final UUID subscriptionId,
            final SubscriptionPatchTokenRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateSubscriptionTokenRequest(storeId, subscriptionId, body,
                idempotencyKey).execute();
    }

    /**
     * Replaces the payment method (transaction token) used for a subscription. Useful when a card
     * expires or a customer wants to switch payment methods. The new token must belong to the same
     * store, be active, and match the subscription's processing mode (live/test). One-time tokens
     * are not accepted; use a recurring or subscription token.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  subscriptionId  Required parameter: The unique identifier of the subscription.
     * @param  body  Required parameter: Request payload for replacing a subscription payment token.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Subscription>> updateSubscriptionTokenAsync(
            final UUID storeId,
            final UUID subscriptionId,
            final SubscriptionPatchTokenRequest body,
            final String idempotencyKey) {
        try {
            return prepareUpdateSubscriptionTokenRequest(storeId, subscriptionId, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateSubscriptionToken.
     */
    private ApiCall<ApiResponse<Subscription>, ApiException> prepareUpdateSubscriptionTokenRequest(
            final UUID storeId,
            final UUID subscriptionId,
            final SubscriptionPatchTokenRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/subscriptions/{subscriptionId}/token")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("storeId").value(storeId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subscriptionId").value(subscriptionId)
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
                                response -> ApiHelper.deserialize(response, Subscription.class))
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
    
    // ── Hand-authored customization (kept at end of class to minimize regen conflicts) ──

    /**
     * Polls the subscription status using `getSubscription` with `polling=true` until a terminal status is reached.
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  id           Required parameter: The Subscription ID.
     * @param  maxAttempts  Optional parameter: The maximum number of polling attempts. Default is 10.
     * @return              Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> pollSubscription(
            final UUID storeId,
            final UUID id,
            final Integer maxAttempts) throws ApiException, IOException {
        int attempts = 0;
        int limit = maxAttempts == null ? 10 : maxAttempts;
        while (attempts < limit) {
            ApiResponse<Subscription> response = getSubscription(storeId, id, true);
            if (response != null && response.getResult() != null && response.getResult().getStatus() != null) {
                if (response.getResult().getStatus() != SubscriptionStatus.UNVERIFIED) {
                    return response;
                }
            }
            attempts++;
        }
        return getSubscription(storeId, id, true);
    }

    /**
     * Polls the subscription status using `getSubscription` with `polling=true` until a terminal status is reached (up to 10 attempts).
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  id           Required parameter: The Subscription ID.
     * @return              Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> pollSubscription(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return pollSubscription(storeId, id, 10);
    }
}