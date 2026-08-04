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
import com.univapay.api.models.BankTransferLedgerList;
import com.univapay.api.models.Charge;
import com.univapay.api.models.ChargeCaptureRequest;
import com.univapay.api.models.ChargeCreateRequest;
import com.univapay.api.models.ChargeList;
import com.univapay.api.models.ChargeUpdateRequest;
import com.univapay.api.models.CursorDirectionQuery;
import com.univapay.api.models.CustomsDeclarationCreateRequest;
import com.univapay.api.models.CustomsDeclarationPatchRequest;
import com.univapay.api.models.CustomsDeclarationWebhookData;
import com.univapay.api.models.IssuerToken;
import com.univapay.api.models.ModeQuery;
import com.univapay.api.models.ThreeDsIssuerToken;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import com.univapay.api.models.ChargeStatus;
import java.util.Arrays;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ChargesApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ChargesApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a charge on a payment instrument (e.g. transaction token).
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for creating a charge.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Charge> createCharge(
            final String idempotencyKey,
            final ChargeCreateRequest body) throws ApiException, IOException {
        return prepareCreateChargeRequest(idempotencyKey, body).execute();
    }

    /**
     * Creates a charge on a payment instrument (e.g. transaction token).
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for creating a charge.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Charge>> createChargeAsync(
            final String idempotencyKey,
            final ChargeCreateRequest body) {
        try {
            return prepareCreateChargeRequest(idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createCharge.
     */
    private ApiCall<ApiResponse<Charge>, ApiException> prepareCreateChargeRequest(
            final String idempotencyKey,
            final ChargeCreateRequest body) {
        return new ApiCall.Builder<ApiResponse<Charge>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/charges")
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
                                response -> ApiHelper.deserialize(response, Charge.class))
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
     * Lists all charges across all stores for the authenticated user.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  lastFour  Optional parameter: Filter by the last 4 digits of the card. **Note:** If
     *         specified, `name`, `exp_month`, and `exp_year` must also be included.
     * @param  name  Optional parameter: Filter by cardholder name. **Note:** If specified,
     *         `last_four`, `exp_month`, and `exp_year` must also be included.
     * @param  expMonth  Optional parameter: Filter by expiration month. **Note:** If specified,
     *         `last_four`, `name`, and `exp_year` must also be included.
     * @param  expYear  Optional parameter: Filter by expiration year. **Note:** If specified,
     *         `last_four`, `name`, and `exp_month` must also be included.
     * @param  from  Optional parameter: Show charges created on or after this date (ISO-8601).
     * @param  to  Optional parameter: Show charges created before this date (ISO-8601).
     * @param  email  Optional parameter: Filter by email address.
     * @param  phone  Optional parameter: Filter by phone number.
     * @param  amountFrom  Optional parameter: Show charges with an amount greater than or equal to
     *         this value.
     * @param  amountTo  Optional parameter: Show charges with an amount strictly less than this
     *         value.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  transactionTokenId  Optional parameter: Filter by transaction token ID.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChargeList> listAllCharges(
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String lastFour,
            final String name,
            final Integer expMonth,
            final Integer expYear,
            final String from,
            final String to,
            final String email,
            final String phone,
            final Integer amountFrom,
            final Integer amountTo,
            final String currency,
            final ModeQuery mode,
            final String metadata,
            final UUID transactionTokenId) throws ApiException, IOException {
        return prepareListAllChargesRequest(limit, cursor, cursorDirection, lastFour, name,
                expMonth, expYear, from, to, email, phone, amountFrom, amountTo, currency, mode,
                metadata, transactionTokenId).execute();
    }

    /**
     * Lists all charges across all stores for the authenticated user.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  lastFour  Optional parameter: Filter by the last 4 digits of the card. **Note:** If
     *         specified, `name`, `exp_month`, and `exp_year` must also be included.
     * @param  name  Optional parameter: Filter by cardholder name. **Note:** If specified,
     *         `last_four`, `exp_month`, and `exp_year` must also be included.
     * @param  expMonth  Optional parameter: Filter by expiration month. **Note:** If specified,
     *         `last_four`, `name`, and `exp_year` must also be included.
     * @param  expYear  Optional parameter: Filter by expiration year. **Note:** If specified,
     *         `last_four`, `name`, and `exp_month` must also be included.
     * @param  from  Optional parameter: Show charges created on or after this date (ISO-8601).
     * @param  to  Optional parameter: Show charges created before this date (ISO-8601).
     * @param  email  Optional parameter: Filter by email address.
     * @param  phone  Optional parameter: Filter by phone number.
     * @param  amountFrom  Optional parameter: Show charges with an amount greater than or equal to
     *         this value.
     * @param  amountTo  Optional parameter: Show charges with an amount strictly less than this
     *         value.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  transactionTokenId  Optional parameter: Filter by transaction token ID.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChargeList>> listAllChargesAsync(
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String lastFour,
            final String name,
            final Integer expMonth,
            final Integer expYear,
            final String from,
            final String to,
            final String email,
            final String phone,
            final Integer amountFrom,
            final Integer amountTo,
            final String currency,
            final ModeQuery mode,
            final String metadata,
            final UUID transactionTokenId) {
        try {
            return prepareListAllChargesRequest(limit, cursor, cursorDirection, lastFour, name, expMonth,
            expYear, from, to, email, phone, amountFrom, amountTo, currency, mode, metadata,
            transactionTokenId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listAllCharges.
     */
    private ApiCall<ApiResponse<ChargeList>, ApiException> prepareListAllChargesRequest(
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String lastFour,
            final String name,
            final Integer expMonth,
            final Integer expYear,
            final String from,
            final String to,
            final String email,
            final String phone,
            final Integer amountFrom,
            final Integer amountTo,
            final String currency,
            final ModeQuery mode,
            final String metadata,
            final UUID transactionTokenId) {
        return new ApiCall.Builder<ApiResponse<ChargeList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/charges")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("last_four")
                                .value(lastFour).isRequired(false))
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .queryParam(param -> param.key("exp_month")
                                .value(expMonth).isRequired(false))
                        .queryParam(param -> param.key("exp_year")
                                .value(expYear).isRequired(false))
                        .queryParam(param -> param.key("from")
                                .value(from).isRequired(false))
                        .queryParam(param -> param.key("to")
                                .value(to).isRequired(false))
                        .queryParam(param -> param.key("email")
                                .value(email).isRequired(false))
                        .queryParam(param -> param.key("phone")
                                .value(phone).isRequired(false))
                        .queryParam(param -> param.key("amount_from")
                                .value(amountFrom).isRequired(false))
                        .queryParam(param -> param.key("amount_to")
                                .value(amountTo).isRequired(false))
                        .queryParam(param -> param.key("currency")
                                .value(currency).isRequired(false))
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
                        .queryParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .queryParam(param -> param.key("transaction_token_id")
                                .value(transactionTokenId).isRequired(false))
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
     * Lists all charges for a specific store.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  lastFour  Optional parameter: Filter by the last 4 digits of the card. **Note:** If
     *         specified, `name`, `exp_month`, and `exp_year` must also be included.
     * @param  name  Optional parameter: Filter by cardholder name. **Note:** If specified,
     *         `last_four`, `exp_month`, and `exp_year` must also be included.
     * @param  expMonth  Optional parameter: Filter by expiration month. **Note:** If specified,
     *         `last_four`, `name`, and `exp_year` must also be included.
     * @param  expYear  Optional parameter: Filter by expiration year. **Note:** If specified,
     *         `last_four`, `name`, and `exp_month` must also be included.
     * @param  from  Optional parameter: Show charges created on or after this date (ISO-8601).
     * @param  to  Optional parameter: Show charges created before this date (ISO-8601).
     * @param  email  Optional parameter: Filter by email address.
     * @param  phone  Optional parameter: Filter by phone number.
     * @param  amountFrom  Optional parameter: Show charges with an amount greater than or equal to
     *         this value.
     * @param  amountTo  Optional parameter: Show charges with an amount strictly less than this
     *         value.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  transactionTokenId  Optional parameter: Filter by transaction token ID.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChargeList> listStoreCharges(
            final UUID storeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String lastFour,
            final String name,
            final Integer expMonth,
            final Integer expYear,
            final String from,
            final String to,
            final String email,
            final String phone,
            final Integer amountFrom,
            final Integer amountTo,
            final String currency,
            final ModeQuery mode,
            final String metadata,
            final UUID transactionTokenId) throws ApiException, IOException {
        return prepareListStoreChargesRequest(storeId, limit, cursor, cursorDirection, lastFour,
                name, expMonth, expYear, from, to, email, phone, amountFrom, amountTo, currency,
                mode, metadata, transactionTokenId).execute();
    }

    /**
     * Lists all charges for a specific store.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  lastFour  Optional parameter: Filter by the last 4 digits of the card. **Note:** If
     *         specified, `name`, `exp_month`, and `exp_year` must also be included.
     * @param  name  Optional parameter: Filter by cardholder name. **Note:** If specified,
     *         `last_four`, `exp_month`, and `exp_year` must also be included.
     * @param  expMonth  Optional parameter: Filter by expiration month. **Note:** If specified,
     *         `last_four`, `name`, and `exp_year` must also be included.
     * @param  expYear  Optional parameter: Filter by expiration year. **Note:** If specified,
     *         `last_four`, `name`, and `exp_month` must also be included.
     * @param  from  Optional parameter: Show charges created on or after this date (ISO-8601).
     * @param  to  Optional parameter: Show charges created before this date (ISO-8601).
     * @param  email  Optional parameter: Filter by email address.
     * @param  phone  Optional parameter: Filter by phone number.
     * @param  amountFrom  Optional parameter: Show charges with an amount greater than or equal to
     *         this value.
     * @param  amountTo  Optional parameter: Show charges with an amount strictly less than this
     *         value.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  transactionTokenId  Optional parameter: Filter by transaction token ID.
     * @return    Returns the ChargeList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChargeList>> listStoreChargesAsync(
            final UUID storeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String lastFour,
            final String name,
            final Integer expMonth,
            final Integer expYear,
            final String from,
            final String to,
            final String email,
            final String phone,
            final Integer amountFrom,
            final Integer amountTo,
            final String currency,
            final ModeQuery mode,
            final String metadata,
            final UUID transactionTokenId) {
        try {
            return prepareListStoreChargesRequest(storeId, limit, cursor, cursorDirection, lastFour, name,
            expMonth, expYear, from, to, email, phone, amountFrom, amountTo, currency, mode,
            metadata, transactionTokenId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listStoreCharges.
     */
    private ApiCall<ApiResponse<ChargeList>, ApiException> prepareListStoreChargesRequest(
            final UUID storeId,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection,
            final String lastFour,
            final String name,
            final Integer expMonth,
            final Integer expYear,
            final String from,
            final String to,
            final String email,
            final String phone,
            final Integer amountFrom,
            final Integer amountTo,
            final String currency,
            final ModeQuery mode,
            final String metadata,
            final UUID transactionTokenId) {
        return new ApiCall.Builder<ApiResponse<ChargeList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("last_four")
                                .value(lastFour).isRequired(false))
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .queryParam(param -> param.key("exp_month")
                                .value(expMonth).isRequired(false))
                        .queryParam(param -> param.key("exp_year")
                                .value(expYear).isRequired(false))
                        .queryParam(param -> param.key("from")
                                .value(from).isRequired(false))
                        .queryParam(param -> param.key("to")
                                .value(to).isRequired(false))
                        .queryParam(param -> param.key("email")
                                .value(email).isRequired(false))
                        .queryParam(param -> param.key("phone")
                                .value(phone).isRequired(false))
                        .queryParam(param -> param.key("amount_from")
                                .value(amountFrom).isRequired(false))
                        .queryParam(param -> param.key("amount_to")
                                .value(amountTo).isRequired(false))
                        .queryParam(param -> param.key("currency")
                                .value(currency).isRequired(false))
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
                        .queryParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .queryParam(param -> param.key("transaction_token_id")
                                .value(transactionTokenId).isRequired(false))
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
     * Retrieves the details of an existing charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If set to true, instructs the API to internally poll the
     *         charge status until it changes from 'pending' (the initial status) to another status.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Charge> getCharge(
            final UUID storeId,
            final UUID id,
            final Boolean polling) throws ApiException, IOException {
        return prepareGetChargeRequest(storeId, id, polling).execute();
    }

    /**
     * Retrieves the details of an existing charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  polling  Optional parameter: If set to true, instructs the API to internally poll the
     *         charge status until it changes from 'pending' (the initial status) to another status.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Charge>> getChargeAsync(
            final UUID storeId,
            final UUID id,
            final Boolean polling) {
        try {
            return prepareGetChargeRequest(storeId, id, polling).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getCharge.
     */
    private ApiCall<ApiResponse<Charge>, ApiException> prepareGetChargeRequest(
            final UUID storeId,
            final UUID id,
            final Boolean polling) {
        return new ApiCall.Builder<ApiResponse<Charge>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{id}")
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
                                response -> ApiHelper.deserialize(response, Charge.class))
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
     * Use this request to add or modify arbitrary metadata on an existing charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for updating charge metadata.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Charge> updateCharge(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final ChargeUpdateRequest body) throws ApiException, IOException {
        return prepareUpdateChargeRequest(storeId, id, idempotencyKey, body).execute();
    }

    /**
     * Use this request to add or modify arbitrary metadata on an existing charge.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @param  body  Optional parameter: Request payload for updating charge metadata.
     * @return    Returns the Charge wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Charge>> updateChargeAsync(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final ChargeUpdateRequest body) {
        try {
            return prepareUpdateChargeRequest(storeId, id, idempotencyKey, body).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateCharge.
     */
    private ApiCall<ApiResponse<Charge>, ApiException> prepareUpdateChargeRequest(
            final UUID storeId,
            final UUID id,
            final String idempotencyKey,
            final ChargeUpdateRequest body) {
        return new ApiCall.Builder<ApiResponse<Charge>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{id}")
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
                                response -> ApiHelper.deserialize(response, Charge.class))
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
     * Captures a previously authorized charge (where `capture` was set to false during creation).
     * The capture amount must be less than or equal to the authorized amount, and the currency must
     * match.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  body  Required parameter: Request payload for capturing an authorized charge.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Object wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Object> captureCharge(
            final UUID storeId,
            final UUID id,
            final ChargeCaptureRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCaptureChargeRequest(storeId, id, body, idempotencyKey).execute();
    }

    /**
     * Captures a previously authorized charge (where `capture` was set to false during creation).
     * The capture amount must be less than or equal to the authorized amount, and the currency must
     * match.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @param  body  Required parameter: Request payload for capturing an authorized charge.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the Object wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Object>> captureChargeAsync(
            final UUID storeId,
            final UUID id,
            final ChargeCaptureRequest body,
            final String idempotencyKey) {
        try {
            return prepareCaptureChargeRequest(storeId, id, body, idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for captureCharge.
     */
    private ApiCall<ApiResponse<Object>, ApiException> prepareCaptureChargeRequest(
            final UUID storeId,
            final UUID id,
            final ChargeCaptureRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<Object>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{id}/capture")
                        .bodyParam(param -> param.value(body))
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
                                response -> response)
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
     * Retrieves the necessary payment execution URL (for online payments) or bank account details
     * (for bank transfers). **⚠️ Prerequisite:** The charge `status` must be `awaiting` before
     * requesting the issuer token. If requested while the charge is in any other status, an error
     * will be returned.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the IssuerToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<IssuerToken> getChargeIssuerToken(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return prepareGetChargeIssuerTokenRequest(storeId, id).execute();
    }

    /**
     * Retrieves the necessary payment execution URL (for online payments) or bank account details
     * (for bank transfers). **⚠️ Prerequisite:** The charge `status` must be `awaiting` before
     * requesting the issuer token. If requested while the charge is in any other status, an error
     * will be returned.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the IssuerToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<IssuerToken>> getChargeIssuerTokenAsync(
            final UUID storeId,
            final UUID id) {
        try {
            return prepareGetChargeIssuerTokenRequest(storeId, id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getChargeIssuerToken.
     */
    private ApiCall<ApiResponse<IssuerToken>, ApiException> prepareGetChargeIssuerTokenRequest(
            final UUID storeId,
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<IssuerToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{id}/issuer_token")
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
                                response -> ApiHelper.deserialize(response, IssuerToken.class))
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
     * Retrieves the 3-D Secure issuer token details required to authenticate a card charge. **⚠️
     * Prerequisites:** 1. The charge must be created with `three_ds.mode` set to `normal` or
     * `force`. 2. You must poll the charge until its `status` becomes `awaiting` before making this
     * request. **Execution Flow:** Once retrieved, the client (browser) must execute an `http_post`
     * request to the `issuer_token` URL. The `payload` object must be formatted according to the
     * `content_type` (e.g., URL-encoded) and sent in the body. You can execute this via a redirect
     * or inside an iframe. If using an iframe, continue polling the charge status in the background
     * until it reaches `successful`, `failed`, or `error`.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the ThreeDsIssuerToken wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ThreeDsIssuerToken> getChargeThreeDsIssuerToken(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return prepareGetChargeThreeDsIssuerTokenRequest(storeId, id).execute();
    }

    /**
     * Retrieves the 3-D Secure issuer token details required to authenticate a card charge. **⚠️
     * Prerequisites:** 1. The charge must be created with `three_ds.mode` set to `normal` or
     * `force`. 2. You must poll the charge until its `status` becomes `awaiting` before making this
     * request. **Execution Flow:** Once retrieved, the client (browser) must execute an `http_post`
     * request to the `issuer_token` URL. The `payload` object must be formatted according to the
     * `content_type` (e.g., URL-encoded) and sent in the body. You can execute this via a redirect
     * or inside an iframe. If using an iframe, continue polling the charge status in the background
     * until it reaches `successful`, `failed`, or `error`.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the ThreeDsIssuerToken wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ThreeDsIssuerToken>> getChargeThreeDsIssuerTokenAsync(
            final UUID storeId,
            final UUID id) {
        try {
            return prepareGetChargeThreeDsIssuerTokenRequest(storeId, id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getChargeThreeDsIssuerToken.
     */
    private ApiCall<ApiResponse<ThreeDsIssuerToken>, ApiException> prepareGetChargeThreeDsIssuerTokenRequest(
            final UUID storeId,
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<ThreeDsIssuerToken>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{id}/three_ds/issuer_token")
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

    /**
     * Retrieves bank transfer ledger entries associated with a charge. This is an optional
     * reconciliation endpoint — not part of the required create-charge-and-poll flow. **⚠️ Requires
     * a merchant-level application token**, unlike the rest of the bank transfer flow. A store
     * application token (`Bearer {secret}.{jwt}` scoped to a `store_id`) is not sufficient here,
     * even though the path is store-scoped.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the BankTransferLedgerList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<BankTransferLedgerList> listBankTransferLedgers(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return prepareListBankTransferLedgersRequest(storeId, id).execute();
    }

    /**
     * Retrieves bank transfer ledger entries associated with a charge. This is an optional
     * reconciliation endpoint — not part of the required create-charge-and-poll flow. **⚠️ Requires
     * a merchant-level application token**, unlike the rest of the bank transfer flow. A store
     * application token (`Bearer {secret}.{jwt}` scoped to a `store_id`) is not sufficient here,
     * even though the path is store-scoped.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  id  Required parameter: The unique identifier of the resource.
     * @return    Returns the BankTransferLedgerList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<BankTransferLedgerList>> listBankTransferLedgersAsync(
            final UUID storeId,
            final UUID id) {
        try {
            return prepareListBankTransferLedgersRequest(storeId, id).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listBankTransferLedgers.
     */
    private ApiCall<ApiResponse<BankTransferLedgerList>, ApiException> prepareListBankTransferLedgersRequest(
            final UUID storeId,
            final UUID id) {
        return new ApiCall.Builder<ApiResponse<BankTransferLedgerList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{id}/bank_transfer_ledgers")
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
                                response -> ApiHelper.deserialize(response, BankTransferLedgerList.class))
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
     * Creates a customs declaration for a successful charge. Backend only accepts this request for
     * WeChat Online and WeChat MPM charges. If a declaration already exists and is no longer
     * pending, the backend updates its identity fields and restarts processing instead of creating
     * a new record.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  body  Required parameter: Request payload for creating a customs declaration.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the CustomsDeclarationWebhookData wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CustomsDeclarationWebhookData> createCustomsDeclaration(
            final UUID storeId,
            final UUID chargeId,
            final CustomsDeclarationCreateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateCustomsDeclarationRequest(storeId, chargeId, body,
                idempotencyKey).execute();
    }

    /**
     * Creates a customs declaration for a successful charge. Backend only accepts this request for
     * WeChat Online and WeChat MPM charges. If a declaration already exists and is no longer
     * pending, the backend updates its identity fields and restarts processing instead of creating
     * a new record.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  body  Required parameter: Request payload for creating a customs declaration.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the CustomsDeclarationWebhookData wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CustomsDeclarationWebhookData>> createCustomsDeclarationAsync(
            final UUID storeId,
            final UUID chargeId,
            final CustomsDeclarationCreateRequest body,
            final String idempotencyKey) {
        try {
            return prepareCreateCustomsDeclarationRequest(storeId, chargeId, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createCustomsDeclaration.
     */
    private ApiCall<ApiResponse<CustomsDeclarationWebhookData>, ApiException> prepareCreateCustomsDeclarationRequest(
            final UUID storeId,
            final UUID chargeId,
            final CustomsDeclarationCreateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<CustomsDeclarationWebhookData>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/customs")
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
                                response -> ApiHelper.deserialize(response, CustomsDeclarationWebhookData.class))
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
     * Retrieves a customs declaration for a charge. Supports long polling when `polling=true`,
     * returning once the declaration leaves its current state or the polling timeout is reached.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the customs declaration.
     * @param  polling  Optional parameter: Hold the request open while waiting for a status change.
     * @return    Returns the CustomsDeclarationWebhookData wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CustomsDeclarationWebhookData> getCustomsDeclaration(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) throws ApiException, IOException {
        return prepareGetCustomsDeclarationRequest(storeId, chargeId, id, polling).execute();
    }

    /**
     * Retrieves a customs declaration for a charge. Supports long polling when `polling=true`,
     * returning once the declaration leaves its current state or the polling timeout is reached.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the customs declaration.
     * @param  polling  Optional parameter: Hold the request open while waiting for a status change.
     * @return    Returns the CustomsDeclarationWebhookData wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CustomsDeclarationWebhookData>> getCustomsDeclarationAsync(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) {
        try {
            return prepareGetCustomsDeclarationRequest(storeId, chargeId, id, polling).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getCustomsDeclaration.
     */
    private ApiCall<ApiResponse<CustomsDeclarationWebhookData>, ApiException> prepareGetCustomsDeclarationRequest(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final Boolean polling) {
        return new ApiCall.Builder<ApiResponse<CustomsDeclarationWebhookData>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/customs/{id}")
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
                                response -> ApiHelper.deserialize(response, CustomsDeclarationWebhookData.class))
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
     * Updates a customs declaration and requeues processing. Backend patching preserves the
     * original `customs`, `certificate_id`, and `certificate_name` values and only accepts a new
     * `merchant_customs_no`. Pending declarations cannot be patched.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the customs declaration.
     * @param  body  Required parameter: Request payload for patching a customs declaration.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the CustomsDeclarationWebhookData wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CustomsDeclarationWebhookData> patchCustomsDeclaration(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final CustomsDeclarationPatchRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return preparePatchCustomsDeclarationRequest(storeId, chargeId, id, body,
                idempotencyKey).execute();
    }

    /**
     * Updates a customs declaration and requeues processing. Backend patching preserves the
     * original `customs`, `certificate_id`, and `certificate_name` values and only accepts a new
     * `merchant_customs_no`. Pending declarations cannot be patched.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  chargeId  Required parameter: The unique identifier of the charge.
     * @param  id  Required parameter: The unique identifier of the customs declaration.
     * @param  body  Required parameter: Request payload for patching a customs declaration.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the CustomsDeclarationWebhookData wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CustomsDeclarationWebhookData>> patchCustomsDeclarationAsync(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final CustomsDeclarationPatchRequest body,
            final String idempotencyKey) {
        try {
            return preparePatchCustomsDeclarationRequest(storeId, chargeId, id, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for patchCustomsDeclaration.
     */
    private ApiCall<ApiResponse<CustomsDeclarationWebhookData>, ApiException> preparePatchCustomsDeclarationRequest(
            final UUID storeId,
            final UUID chargeId,
            final UUID id,
            final CustomsDeclarationPatchRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<CustomsDeclarationWebhookData>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/charges/{chargeId}/customs/{id}")
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
                                response -> ApiHelper.deserialize(response, CustomsDeclarationWebhookData.class))
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
     * Polls the charge status using `getCharge` with `polling=true` until a terminal status is reached.
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  id           Required parameter: The unique identifier of the resource.
     * @param  maxAttempts  Optional parameter: The maximum number of polling attempts. Default is 10.
     * @return              Returns the Charge wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Charge> pollCharge(
            final UUID storeId,
            final UUID id,
            final Integer maxAttempts) throws ApiException, IOException {
        List<ChargeStatus> terminalStatuses = Arrays.asList(
            ChargeStatus.SUCCESSFUL,
            ChargeStatus.FAILED,
            ChargeStatus.ERROR,
            ChargeStatus.CANCELED,
            ChargeStatus.AUTHORIZED,
            ChargeStatus.AWAITING
        );
        int attempts = 0;
        int limit = maxAttempts == null ? 10 : maxAttempts;
        while (attempts < limit) {
            ApiResponse<Charge> response = getCharge(storeId, id, true);
            if (response != null && response.getResult() != null && response.getResult().getStatus() != null) {
                if (terminalStatuses.contains(response.getResult().getStatus())) {
                    return response;
                }
            }
            attempts++;
        }
        return getCharge(storeId, id, true);
    }

    /**
     * Polls the charge status using `getCharge` with `polling=true` until a terminal status is reached (up to 10 attempts).
     * @param  storeId      Required parameter: The unique identifier of the store.
     * @param  id           Required parameter: The unique identifier of the resource.
     * @return              Returns the Charge wrapped in ApiResponse response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException  Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Charge> pollCharge(
            final UUID storeId,
            final UUID id) throws ApiException, IOException {
        return pollCharge(storeId, id, 10);
    }
}