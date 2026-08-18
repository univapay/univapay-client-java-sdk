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
import com.univapay.api.models.BankTransferPaymentStatus;
import com.univapay.api.models.CursorDirectionQuery;
import com.univapay.api.models.TransactionHistoryList;
import com.univapay.api.models.TransactionHistoryMode;
import com.univapay.api.models.TransactionHistoryServiceProvider;
import com.univapay.api.models.TransactionHistoryStatus;
import com.univapay.api.models.TransactionHistoryType;
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

/**
 * This class lists all the endpoints of the groups.
 */
public final class TransactionHistoryApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public TransactionHistoryApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns a paginated, searchable history of charges and refunds across all of the merchant's
     * stores, combining both resource types into a single unified row shape.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  shortId  Optional parameter: Filter by the last 6 characters of a resource's UUID.
     *         Must be exactly 6 characters.
     * @param  from  Optional parameter: Show rows created on or after this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be later than `to`.
     * @param  to  Optional parameter: Show rows created on or before this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be earlier than `from`.
     * @param  status  Optional parameter: Filter by status. Accepts any charge or refund status
     *         value.
     * @param  type  Optional parameter: Filter by row type.
     * @param  search  Optional parameter: Free-text search across cardholder/customer name and
     *         email. Wrap a value in quotes (`"first last"`) for an exact-phrase match; an unquoted
     *         value matches partially.
     * @param  email  Optional parameter: Filter by email address.
     * @param  id  Optional parameter: Filter by exact charge or refund ID.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  cardExp  Optional parameter: Filter by card expiration, in `yyyy-MM` format.
     * @param  cardLastFour  Optional parameter: Filter by the last 4 digits of the card. Must be
     *         exactly 4 characters.
     * @param  cardholder  Optional parameter: Filter by cardholder name. Partial match by default;
     *         wrap in quotes for an exact-phrase match.
     * @param  cardBrand  Optional parameter: Deprecated legacy alias of `brand`; use `brand`
     *         instead. Repeatable via the `[]` suffix (e.g.
     *         `card_brand[]=visa&amp;card_brand[]=jcb`). Raw brand identifiers vary by payment type
     *         — see the `user_data.brand` field on this endpoint's response.
     * @param  brand  Optional parameter: Filter by brand. Repeatable via the `[]` suffix (e.g.
     *         `brand[]=visa&amp;brand[]=jcb`). Raw brand identifiers vary by payment type — see the
     *         `user_data.brand` field on this endpoint's response.
     * @param  brands  Optional parameter: Deprecated legacy alias of `brand`; use `brand` instead.
     *         Repeatable via the `[]` suffix (e.g. `brands[]=visa&amp;brands[]=jcb`). Raw brand
     *         identifiers vary by payment type — see the `user_data.brand` field on this endpoint's
     *         response.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  serviceProvider  Optional parameter: Filter by service provider.
     * @param  serviceProviders  Optional parameter: Filter by service provider. Repeatable via the
     *         `[]` suffix (e.g. `service_providers[]=credit&amp;service_providers[]=paidy`). Must
     *         not be empty; duplicate values are deduplicated.
     * @param  gatewayTransactionId  Optional parameter: Filter by the gateway's own transaction ID
     *         (free text).
     * @param  bankTransferPaymentStatuses  Optional parameter: Filter bank transfer rows by payment
     *         status. Repeatable via the `[]` suffix (e.g.
     *         `bank_transfer_payment_statuses[]=unpaid&amp;bank_transfer_payment_statuses[]=exact`).
     * @param  bankTransferLatestDepositDateFrom  Optional parameter: Start of the range (inclusive)
     *         for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601
     *         date-time.
     * @param  bankTransferLatestDepositDateTo  Optional parameter: End of the range (inclusive) for
     *         `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionHistoryList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionHistoryList> listTransactionHistory(
            final TransactionHistoryMode mode,
            final String shortId,
            final String from,
            final String to,
            final TransactionHistoryStatus status,
            final TransactionHistoryType type,
            final String search,
            final String email,
            final UUID id,
            final String metadata,
            final String cardExp,
            final String cardLastFour,
            final String cardholder,
            final List<String> cardBrand,
            final List<String> brand,
            final List<String> brands,
            final String currency,
            final TransactionHistoryServiceProvider serviceProvider,
            final List<TransactionHistoryServiceProvider> serviceProviders,
            final String gatewayTransactionId,
            final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
            final String bankTransferLatestDepositDateFrom,
            final String bankTransferLatestDepositDateTo,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListTransactionHistoryRequest(mode, shortId, from, to, status, type, search,
                email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand, brand, brands,
                currency, serviceProvider, serviceProviders, gatewayTransactionId,
                bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom,
                bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).execute();
    }

    /**
     * Returns a paginated, searchable history of charges and refunds across all of the merchant's
     * stores, combining both resource types into a single unified row shape.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  shortId  Optional parameter: Filter by the last 6 characters of a resource's UUID.
     *         Must be exactly 6 characters.
     * @param  from  Optional parameter: Show rows created on or after this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be later than `to`.
     * @param  to  Optional parameter: Show rows created on or before this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be earlier than `from`.
     * @param  status  Optional parameter: Filter by status. Accepts any charge or refund status
     *         value.
     * @param  type  Optional parameter: Filter by row type.
     * @param  search  Optional parameter: Free-text search across cardholder/customer name and
     *         email. Wrap a value in quotes (`"first last"`) for an exact-phrase match; an unquoted
     *         value matches partially.
     * @param  email  Optional parameter: Filter by email address.
     * @param  id  Optional parameter: Filter by exact charge or refund ID.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  cardExp  Optional parameter: Filter by card expiration, in `yyyy-MM` format.
     * @param  cardLastFour  Optional parameter: Filter by the last 4 digits of the card. Must be
     *         exactly 4 characters.
     * @param  cardholder  Optional parameter: Filter by cardholder name. Partial match by default;
     *         wrap in quotes for an exact-phrase match.
     * @param  cardBrand  Optional parameter: Deprecated legacy alias of `brand`; use `brand`
     *         instead. Repeatable via the `[]` suffix (e.g.
     *         `card_brand[]=visa&amp;card_brand[]=jcb`). Raw brand identifiers vary by payment type
     *         — see the `user_data.brand` field on this endpoint's response.
     * @param  brand  Optional parameter: Filter by brand. Repeatable via the `[]` suffix (e.g.
     *         `brand[]=visa&amp;brand[]=jcb`). Raw brand identifiers vary by payment type — see the
     *         `user_data.brand` field on this endpoint's response.
     * @param  brands  Optional parameter: Deprecated legacy alias of `brand`; use `brand` instead.
     *         Repeatable via the `[]` suffix (e.g. `brands[]=visa&amp;brands[]=jcb`). Raw brand
     *         identifiers vary by payment type — see the `user_data.brand` field on this endpoint's
     *         response.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  serviceProvider  Optional parameter: Filter by service provider.
     * @param  serviceProviders  Optional parameter: Filter by service provider. Repeatable via the
     *         `[]` suffix (e.g. `service_providers[]=credit&amp;service_providers[]=paidy`). Must
     *         not be empty; duplicate values are deduplicated.
     * @param  gatewayTransactionId  Optional parameter: Filter by the gateway's own transaction ID
     *         (free text).
     * @param  bankTransferPaymentStatuses  Optional parameter: Filter bank transfer rows by payment
     *         status. Repeatable via the `[]` suffix (e.g.
     *         `bank_transfer_payment_statuses[]=unpaid&amp;bank_transfer_payment_statuses[]=exact`).
     * @param  bankTransferLatestDepositDateFrom  Optional parameter: Start of the range (inclusive)
     *         for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601
     *         date-time.
     * @param  bankTransferLatestDepositDateTo  Optional parameter: End of the range (inclusive) for
     *         `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionHistoryList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionHistoryList>> listTransactionHistoryAsync(
            final TransactionHistoryMode mode,
            final String shortId,
            final String from,
            final String to,
            final TransactionHistoryStatus status,
            final TransactionHistoryType type,
            final String search,
            final String email,
            final UUID id,
            final String metadata,
            final String cardExp,
            final String cardLastFour,
            final String cardholder,
            final List<String> cardBrand,
            final List<String> brand,
            final List<String> brands,
            final String currency,
            final TransactionHistoryServiceProvider serviceProvider,
            final List<TransactionHistoryServiceProvider> serviceProviders,
            final String gatewayTransactionId,
            final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
            final String bankTransferLatestDepositDateFrom,
            final String bankTransferLatestDepositDateTo,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListTransactionHistoryRequest(mode, shortId, from, to, status, type, search,
            email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand, brand, brands,
            currency, serviceProvider, serviceProviders, gatewayTransactionId,
            bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom,
            bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listTransactionHistory.
     */
    private ApiCall<ApiResponse<TransactionHistoryList>, ApiException> prepareListTransactionHistoryRequest(
            final TransactionHistoryMode mode,
            final String shortId,
            final String from,
            final String to,
            final TransactionHistoryStatus status,
            final TransactionHistoryType type,
            final String search,
            final String email,
            final UUID id,
            final String metadata,
            final String cardExp,
            final String cardLastFour,
            final String cardholder,
            final List<String> cardBrand,
            final List<String> brand,
            final List<String> brands,
            final String currency,
            final TransactionHistoryServiceProvider serviceProvider,
            final List<TransactionHistoryServiceProvider> serviceProviders,
            final String gatewayTransactionId,
            final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
            final String bankTransferLatestDepositDateFrom,
            final String bankTransferLatestDepositDateTo,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<TransactionHistoryList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/transaction_history")
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
                        .queryParam(param -> param.key("short_id")
                                .value(shortId).isRequired(false))
                        .queryParam(param -> param.key("from")
                                .value(from).isRequired(false))
                        .queryParam(param -> param.key("to")
                                .value(to).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .queryParam(param -> param.key("type")
                                .value((type != null) ? type.value() : null).isRequired(false))
                        .queryParam(param -> param.key("search")
                                .value(search).isRequired(false))
                        .queryParam(param -> param.key("email")
                                .value(email).isRequired(false))
                        .queryParam(param -> param.key("id")
                                .value(id).isRequired(false))
                        .queryParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .queryParam(param -> param.key("card_exp")
                                .value(cardExp).isRequired(false))
                        .queryParam(param -> param.key("card_last_four")
                                .value(cardLastFour).isRequired(false))
                        .queryParam(param -> param.key("cardholder")
                                .value(cardholder).isRequired(false))
                        .queryParam(param -> param.key("card_brand[]")
                                .value(cardBrand).isRequired(false))
                        .queryParam(param -> param.key("brand[]")
                                .value(brand).isRequired(false))
                        .queryParam(param -> param.key("brands[]")
                                .value(brands).isRequired(false))
                        .queryParam(param -> param.key("currency")
                                .value(currency).isRequired(false))
                        .queryParam(param -> param.key("service_provider")
                                .value((serviceProvider != null) ? serviceProvider.value() : null).isRequired(false))
                        .queryParam(param -> param.key("service_providers[]")
                                .value(TransactionHistoryServiceProvider.toValue(serviceProviders)).isRequired(false))
                        .queryParam(param -> param.key("gateway_transaction_id")
                                .value(gatewayTransactionId).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_payment_statuses[]")
                                .value(BankTransferPaymentStatus.toValue(bankTransferPaymentStatuses)).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_latest_deposit_date.from")
                                .value(bankTransferLatestDepositDateFrom).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_latest_deposit_date.to")
                                .value(bankTransferLatestDepositDateTo).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, TransactionHistoryList.class))
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
     * Returns a paginated, searchable history of charges and refunds for a single store, combining
     * both resource types into a single unified row shape.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  shortId  Optional parameter: Filter by the last 6 characters of a resource's UUID.
     *         Must be exactly 6 characters.
     * @param  from  Optional parameter: Show rows created on or after this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be later than `to`.
     * @param  to  Optional parameter: Show rows created on or before this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be earlier than `from`.
     * @param  status  Optional parameter: Filter by status. Accepts any charge or refund status
     *         value.
     * @param  type  Optional parameter: Filter by row type.
     * @param  search  Optional parameter: Free-text search across cardholder/customer name and
     *         email. Wrap a value in quotes (`"first last"`) for an exact-phrase match; an unquoted
     *         value matches partially.
     * @param  email  Optional parameter: Filter by email address.
     * @param  id  Optional parameter: Filter by exact charge or refund ID.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  cardExp  Optional parameter: Filter by card expiration, in `yyyy-MM` format.
     * @param  cardLastFour  Optional parameter: Filter by the last 4 digits of the card. Must be
     *         exactly 4 characters.
     * @param  cardholder  Optional parameter: Filter by cardholder name. Partial match by default;
     *         wrap in quotes for an exact-phrase match.
     * @param  cardBrand  Optional parameter: Deprecated legacy alias of `brand`; use `brand`
     *         instead. Repeatable via the `[]` suffix (e.g.
     *         `card_brand[]=visa&amp;card_brand[]=jcb`). Raw brand identifiers vary by payment type
     *         — see the `user_data.brand` field on this endpoint's response.
     * @param  brand  Optional parameter: Filter by brand. Repeatable via the `[]` suffix (e.g.
     *         `brand[]=visa&amp;brand[]=jcb`). Raw brand identifiers vary by payment type — see the
     *         `user_data.brand` field on this endpoint's response.
     * @param  brands  Optional parameter: Deprecated legacy alias of `brand`; use `brand` instead.
     *         Repeatable via the `[]` suffix (e.g. `brands[]=visa&amp;brands[]=jcb`). Raw brand
     *         identifiers vary by payment type — see the `user_data.brand` field on this endpoint's
     *         response.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  serviceProvider  Optional parameter: Filter by service provider.
     * @param  serviceProviders  Optional parameter: Filter by service provider. Repeatable via the
     *         `[]` suffix (e.g. `service_providers[]=credit&amp;service_providers[]=paidy`). Must
     *         not be empty; duplicate values are deduplicated.
     * @param  gatewayTransactionId  Optional parameter: Filter by the gateway's own transaction ID
     *         (free text).
     * @param  bankTransferPaymentStatuses  Optional parameter: Filter bank transfer rows by payment
     *         status. Repeatable via the `[]` suffix (e.g.
     *         `bank_transfer_payment_statuses[]=unpaid&amp;bank_transfer_payment_statuses[]=exact`).
     * @param  bankTransferLatestDepositDateFrom  Optional parameter: Start of the range (inclusive)
     *         for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601
     *         date-time.
     * @param  bankTransferLatestDepositDateTo  Optional parameter: End of the range (inclusive) for
     *         `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionHistoryList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionHistoryList> listStoreTransactionHistory(
            final UUID storeId,
            final TransactionHistoryMode mode,
            final String shortId,
            final String from,
            final String to,
            final TransactionHistoryStatus status,
            final TransactionHistoryType type,
            final String search,
            final String email,
            final UUID id,
            final String metadata,
            final String cardExp,
            final String cardLastFour,
            final String cardholder,
            final List<String> cardBrand,
            final List<String> brand,
            final List<String> brands,
            final String currency,
            final TransactionHistoryServiceProvider serviceProvider,
            final List<TransactionHistoryServiceProvider> serviceProviders,
            final String gatewayTransactionId,
            final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
            final String bankTransferLatestDepositDateFrom,
            final String bankTransferLatestDepositDateTo,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) throws ApiException, IOException {
        return prepareListStoreTransactionHistoryRequest(storeId, mode, shortId, from, to, status,
                type, search, email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand,
                brand, brands, currency, serviceProvider, serviceProviders, gatewayTransactionId,
                bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom,
                bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).execute();
    }

    /**
     * Returns a paginated, searchable history of charges and refunds for a single store, combining
     * both resource types into a single unified row shape.
     * @param  storeId  Required parameter: The unique identifier of the store.
     * @param  mode  Optional parameter: Filter by environment mode.
     * @param  shortId  Optional parameter: Filter by the last 6 characters of a resource's UUID.
     *         Must be exactly 6 characters.
     * @param  from  Optional parameter: Show rows created on or after this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be later than `to`.
     * @param  to  Optional parameter: Show rows created on or before this date. Accepts
     *         epoch-millis or an ISO-8601 date-time. Must not be earlier than `from`.
     * @param  status  Optional parameter: Filter by status. Accepts any charge or refund status
     *         value.
     * @param  type  Optional parameter: Filter by row type.
     * @param  search  Optional parameter: Free-text search across cardholder/customer name and
     *         email. Wrap a value in quotes (`"first last"`) for an exact-phrase match; an unquoted
     *         value matches partially.
     * @param  email  Optional parameter: Filter by email address.
     * @param  id  Optional parameter: Filter by exact charge or refund ID.
     * @param  metadata  Optional parameter: Filter by metadata.
     * @param  cardExp  Optional parameter: Filter by card expiration, in `yyyy-MM` format.
     * @param  cardLastFour  Optional parameter: Filter by the last 4 digits of the card. Must be
     *         exactly 4 characters.
     * @param  cardholder  Optional parameter: Filter by cardholder name. Partial match by default;
     *         wrap in quotes for an exact-phrase match.
     * @param  cardBrand  Optional parameter: Deprecated legacy alias of `brand`; use `brand`
     *         instead. Repeatable via the `[]` suffix (e.g.
     *         `card_brand[]=visa&amp;card_brand[]=jcb`). Raw brand identifiers vary by payment type
     *         — see the `user_data.brand` field on this endpoint's response.
     * @param  brand  Optional parameter: Filter by brand. Repeatable via the `[]` suffix (e.g.
     *         `brand[]=visa&amp;brand[]=jcb`). Raw brand identifiers vary by payment type — see the
     *         `user_data.brand` field on this endpoint's response.
     * @param  brands  Optional parameter: Deprecated legacy alias of `brand`; use `brand` instead.
     *         Repeatable via the `[]` suffix (e.g. `brands[]=visa&amp;brands[]=jcb`). Raw brand
     *         identifiers vary by payment type — see the `user_data.brand` field on this endpoint's
     *         response.
     * @param  currency  Optional parameter: Filter by currency (ISO-4217).
     * @param  serviceProvider  Optional parameter: Filter by service provider.
     * @param  serviceProviders  Optional parameter: Filter by service provider. Repeatable via the
     *         `[]` suffix (e.g. `service_providers[]=credit&amp;service_providers[]=paidy`). Must
     *         not be empty; duplicate values are deduplicated.
     * @param  gatewayTransactionId  Optional parameter: Filter by the gateway's own transaction ID
     *         (free text).
     * @param  bankTransferPaymentStatuses  Optional parameter: Filter bank transfer rows by payment
     *         status. Repeatable via the `[]` suffix (e.g.
     *         `bank_transfer_payment_statuses[]=unpaid&amp;bank_transfer_payment_statuses[]=exact`).
     * @param  bankTransferLatestDepositDateFrom  Optional parameter: Start of the range (inclusive)
     *         for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601
     *         date-time.
     * @param  bankTransferLatestDepositDateTo  Optional parameter: End of the range (inclusive) for
     *         `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @return    Returns the TransactionHistoryList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionHistoryList>> listStoreTransactionHistoryAsync(
            final UUID storeId,
            final TransactionHistoryMode mode,
            final String shortId,
            final String from,
            final String to,
            final TransactionHistoryStatus status,
            final TransactionHistoryType type,
            final String search,
            final String email,
            final UUID id,
            final String metadata,
            final String cardExp,
            final String cardLastFour,
            final String cardholder,
            final List<String> cardBrand,
            final List<String> brand,
            final List<String> brands,
            final String currency,
            final TransactionHistoryServiceProvider serviceProvider,
            final List<TransactionHistoryServiceProvider> serviceProviders,
            final String gatewayTransactionId,
            final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
            final String bankTransferLatestDepositDateFrom,
            final String bankTransferLatestDepositDateTo,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        try {
            return prepareListStoreTransactionHistoryRequest(storeId, mode, shortId, from, to, status, type,
            search, email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand, brand,
            brands, currency, serviceProvider, serviceProviders, gatewayTransactionId,
            bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom,
            bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listStoreTransactionHistory.
     */
    private ApiCall<ApiResponse<TransactionHistoryList>, ApiException> prepareListStoreTransactionHistoryRequest(
            final UUID storeId,
            final TransactionHistoryMode mode,
            final String shortId,
            final String from,
            final String to,
            final TransactionHistoryStatus status,
            final TransactionHistoryType type,
            final String search,
            final String email,
            final UUID id,
            final String metadata,
            final String cardExp,
            final String cardLastFour,
            final String cardholder,
            final List<String> cardBrand,
            final List<String> brand,
            final List<String> brands,
            final String currency,
            final TransactionHistoryServiceProvider serviceProvider,
            final List<TransactionHistoryServiceProvider> serviceProviders,
            final String gatewayTransactionId,
            final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
            final String bankTransferLatestDepositDateFrom,
            final String bankTransferLatestDepositDateTo,
            final Integer limit,
            final UUID cursor,
            final CursorDirectionQuery cursorDirection) {
        return new ApiCall.Builder<ApiResponse<TransactionHistoryList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stores/{storeId}/transaction_history")
                        .queryParam(param -> param.key("mode")
                                .value((mode != null) ? mode.value() : null).isRequired(false))
                        .queryParam(param -> param.key("short_id")
                                .value(shortId).isRequired(false))
                        .queryParam(param -> param.key("from")
                                .value(from).isRequired(false))
                        .queryParam(param -> param.key("to")
                                .value(to).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .queryParam(param -> param.key("type")
                                .value((type != null) ? type.value() : null).isRequired(false))
                        .queryParam(param -> param.key("search")
                                .value(search).isRequired(false))
                        .queryParam(param -> param.key("email")
                                .value(email).isRequired(false))
                        .queryParam(param -> param.key("id")
                                .value(id).isRequired(false))
                        .queryParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .queryParam(param -> param.key("card_exp")
                                .value(cardExp).isRequired(false))
                        .queryParam(param -> param.key("card_last_four")
                                .value(cardLastFour).isRequired(false))
                        .queryParam(param -> param.key("cardholder")
                                .value(cardholder).isRequired(false))
                        .queryParam(param -> param.key("card_brand[]")
                                .value(cardBrand).isRequired(false))
                        .queryParam(param -> param.key("brand[]")
                                .value(brand).isRequired(false))
                        .queryParam(param -> param.key("brands[]")
                                .value(brands).isRequired(false))
                        .queryParam(param -> param.key("currency")
                                .value(currency).isRequired(false))
                        .queryParam(param -> param.key("service_provider")
                                .value((serviceProvider != null) ? serviceProvider.value() : null).isRequired(false))
                        .queryParam(param -> param.key("service_providers[]")
                                .value(TransactionHistoryServiceProvider.toValue(serviceProviders)).isRequired(false))
                        .queryParam(param -> param.key("gateway_transaction_id")
                                .value(gatewayTransactionId).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_payment_statuses[]")
                                .value(BankTransferPaymentStatus.toValue(bankTransferPaymentStatuses)).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_latest_deposit_date.from")
                                .value(bankTransferLatestDepositDateFrom).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_latest_deposit_date.to")
                                .value(bankTransferLatestDepositDateTo).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, TransactionHistoryList.class))
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