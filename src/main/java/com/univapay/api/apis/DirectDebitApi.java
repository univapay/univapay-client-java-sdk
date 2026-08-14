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
import com.univapay.api.models.DirectDebitBankAccount;
import com.univapay.api.models.DirectDebitBankAccountCreateRequest;
import com.univapay.api.models.DirectDebitBankAccountList;
import com.univapay.api.models.DirectDebitBankAccountStatus;
import com.univapay.api.models.DirectDebitBankAccountType;
import com.univapay.api.models.DirectDebitBankAccountUpdateRequest;
import com.univapay.api.models.DirectDebitBankTransfer;
import com.univapay.api.models.DirectDebitBankTransferCreateRequest;
import com.univapay.api.models.DirectDebitBankTransferList;
import com.univapay.api.models.DirectDebitBankTransferLock;
import com.univapay.api.models.DirectDebitBankTransferPatchRequest;
import com.univapay.api.models.DirectDebitBankTransferStatus;
import com.univapay.api.models.DirectDebitDebitDate;
import com.univapay.api.models.DirectDebitMerchantConfiguration;
import com.univapay.api.models.DirectDebitNotificationConfiguration;
import com.univapay.api.models.DirectDebitRegistrationOrigin;
import com.univapay.api.models.DirectDebitSchedule;
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
public final class DirectDebitApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DirectDebitApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves the merchant's direct debit configuration — whether direct debit is enabled and
     * which monthly debit cycle applies.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @return    Returns the DirectDebitMerchantConfiguration wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitMerchantConfiguration> getDirectDebitConfiguration(
            final UUID merchantId) throws ApiException, IOException {
        return prepareGetDirectDebitConfigurationRequest(merchantId).execute();
    }

    /**
     * Retrieves the merchant's direct debit configuration — whether direct debit is enabled and
     * which monthly debit cycle applies.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @return    Returns the DirectDebitMerchantConfiguration wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitMerchantConfiguration>> getDirectDebitConfigurationAsync(
            final UUID merchantId) {
        try {
            return prepareGetDirectDebitConfigurationRequest(merchantId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getDirectDebitConfiguration.
     */
    private ApiCall<ApiResponse<DirectDebitMerchantConfiguration>, ApiException> prepareGetDirectDebitConfigurationRequest(
            final UUID merchantId) {
        return new ApiCall.Builder<ApiResponse<DirectDebitMerchantConfiguration>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/configuration")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitMerchantConfiguration.class))
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

    /**
     * Retrieves which direct debit email notifications the merchant has opted into.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @return    Returns the DirectDebitNotificationConfiguration wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitNotificationConfiguration> getDirectDebitNotificationConfiguration(
            final UUID merchantId) throws ApiException, IOException {
        return prepareGetDirectDebitNotificationConfigurationRequest(merchantId).execute();
    }

    /**
     * Retrieves which direct debit email notifications the merchant has opted into.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @return    Returns the DirectDebitNotificationConfiguration wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitNotificationConfiguration>> getDirectDebitNotificationConfigurationAsync(
            final UUID merchantId) {
        try {
            return prepareGetDirectDebitNotificationConfigurationRequest(merchantId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getDirectDebitNotificationConfiguration.
     */
    private ApiCall<ApiResponse<DirectDebitNotificationConfiguration>, ApiException> prepareGetDirectDebitNotificationConfigurationRequest(
            final UUID merchantId) {
        return new ApiCall.Builder<ApiResponse<DirectDebitNotificationConfiguration>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/notification-configuration")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitNotificationConfiguration.class))
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

    /**
     * Retrieves the key dates for the debit cycle currently in progress, based on the merchant's
     * configured cycle. Compare `merchant_bank_transfer_upload_deadline` against today to decide
     * whether transfers can still be registered or edited this month.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @return    Returns the DirectDebitSchedule wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitSchedule> getDirectDebitCurrentSchedule(
            final UUID merchantId) throws ApiException, IOException {
        return prepareGetDirectDebitCurrentScheduleRequest(merchantId).execute();
    }

    /**
     * Retrieves the key dates for the debit cycle currently in progress, based on the merchant's
     * configured cycle. Compare `merchant_bank_transfer_upload_deadline` against today to decide
     * whether transfers can still be registered or edited this month.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @return    Returns the DirectDebitSchedule wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitSchedule>> getDirectDebitCurrentScheduleAsync(
            final UUID merchantId) {
        try {
            return prepareGetDirectDebitCurrentScheduleRequest(merchantId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getDirectDebitCurrentSchedule.
     */
    private ApiCall<ApiResponse<DirectDebitSchedule>, ApiException> prepareGetDirectDebitCurrentScheduleRequest(
            final UUID merchantId) {
        return new ApiCall.Builder<ApiResponse<DirectDebitSchedule>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/schedules/current")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitSchedule.class))
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

    /**
     * Lists the consumer bank accounts registered for direct debit under this merchant.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  userNumber  Optional parameter: Filter by the merchant's own membership number for
     *         the consumer (会員番号).
     * @param  bankAccountId  Optional parameter: Filter by a single bank account ID.
     * @param  bankCode  Optional parameter: Filter by the 4-digit bank code (銀行コード).
     * @param  bankName  Optional parameter: Filter by bank name in half-width katakana (銀行名).
     * @param  branchCode  Optional parameter: Filter by the 3-digit branch code (支店コード).
     * @param  bankAccountType  Optional parameter: Filter by deposit account type (預金種類).
     * @param  bankAccountNumber  Optional parameter: Filter by the 7-digit account number (口座番号).
     * @param  bankAccountName  Optional parameter: Filter by account holder name in half-width
     *         katakana (口座名義).
     * @param  registrationOrigin  Optional parameter: Filter by where the bank account was
     *         registered from.
     * @param  bankAccountStatus  Optional parameter: Filter by bank account status. Omit to return
     *         every status.
     * @param  from  Optional parameter: Show bank accounts created on or after this date
     *         (ISO-8601).
     * @param  to  Optional parameter: Show bank accounts created before this date (ISO-8601).
     * @return    Returns the DirectDebitBankAccountList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankAccountList> listDirectDebitBankAccounts(
            final UUID merchantId,
            final Integer limit,
            final String cursor,
            final CursorDirectionQuery cursorDirection,
            final String userNumber,
            final String bankAccountId,
            final String bankCode,
            final String bankName,
            final String branchCode,
            final DirectDebitBankAccountType bankAccountType,
            final String bankAccountNumber,
            final String bankAccountName,
            final DirectDebitRegistrationOrigin registrationOrigin,
            final DirectDebitBankAccountStatus bankAccountStatus,
            final String from,
            final String to) throws ApiException, IOException {
        return prepareListDirectDebitBankAccountsRequest(merchantId, limit, cursor, cursorDirection,
                userNumber, bankAccountId, bankCode, bankName, branchCode, bankAccountType,
                bankAccountNumber, bankAccountName, registrationOrigin, bankAccountStatus, from,
                to).execute();
    }

    /**
     * Lists the consumer bank accounts registered for direct debit under this merchant.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  userNumber  Optional parameter: Filter by the merchant's own membership number for
     *         the consumer (会員番号).
     * @param  bankAccountId  Optional parameter: Filter by a single bank account ID.
     * @param  bankCode  Optional parameter: Filter by the 4-digit bank code (銀行コード).
     * @param  bankName  Optional parameter: Filter by bank name in half-width katakana (銀行名).
     * @param  branchCode  Optional parameter: Filter by the 3-digit branch code (支店コード).
     * @param  bankAccountType  Optional parameter: Filter by deposit account type (預金種類).
     * @param  bankAccountNumber  Optional parameter: Filter by the 7-digit account number (口座番号).
     * @param  bankAccountName  Optional parameter: Filter by account holder name in half-width
     *         katakana (口座名義).
     * @param  registrationOrigin  Optional parameter: Filter by where the bank account was
     *         registered from.
     * @param  bankAccountStatus  Optional parameter: Filter by bank account status. Omit to return
     *         every status.
     * @param  from  Optional parameter: Show bank accounts created on or after this date
     *         (ISO-8601).
     * @param  to  Optional parameter: Show bank accounts created before this date (ISO-8601).
     * @return    Returns the DirectDebitBankAccountList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankAccountList>> listDirectDebitBankAccountsAsync(
            final UUID merchantId,
            final Integer limit,
            final String cursor,
            final CursorDirectionQuery cursorDirection,
            final String userNumber,
            final String bankAccountId,
            final String bankCode,
            final String bankName,
            final String branchCode,
            final DirectDebitBankAccountType bankAccountType,
            final String bankAccountNumber,
            final String bankAccountName,
            final DirectDebitRegistrationOrigin registrationOrigin,
            final DirectDebitBankAccountStatus bankAccountStatus,
            final String from,
            final String to) {
        try {
            return prepareListDirectDebitBankAccountsRequest(merchantId, limit, cursor, cursorDirection,
            userNumber, bankAccountId, bankCode, bankName, branchCode, bankAccountType,
            bankAccountNumber, bankAccountName, registrationOrigin, bankAccountStatus, from,
            to).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listDirectDebitBankAccounts.
     */
    private ApiCall<ApiResponse<DirectDebitBankAccountList>, ApiException> prepareListDirectDebitBankAccountsRequest(
            final UUID merchantId,
            final Integer limit,
            final String cursor,
            final CursorDirectionQuery cursorDirection,
            final String userNumber,
            final String bankAccountId,
            final String bankCode,
            final String bankName,
            final String branchCode,
            final DirectDebitBankAccountType bankAccountType,
            final String bankAccountNumber,
            final String bankAccountName,
            final DirectDebitRegistrationOrigin registrationOrigin,
            final DirectDebitBankAccountStatus bankAccountStatus,
            final String from,
            final String to) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankAccountList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-accounts")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("user_number")
                                .value(userNumber).isRequired(false))
                        .queryParam(param -> param.key("bank_account_id")
                                .value(bankAccountId).isRequired(false))
                        .queryParam(param -> param.key("bank_code")
                                .value(bankCode).isRequired(false))
                        .queryParam(param -> param.key("bank_name")
                                .value(bankName).isRequired(false))
                        .queryParam(param -> param.key("branch_code")
                                .value(branchCode).isRequired(false))
                        .queryParam(param -> param.key("bank_account_type")
                                .value((bankAccountType != null) ? bankAccountType.value() : null).isRequired(false))
                        .queryParam(param -> param.key("bank_account_number")
                                .value(bankAccountNumber).isRequired(false))
                        .queryParam(param -> param.key("bank_account_name")
                                .value(bankAccountName).isRequired(false))
                        .queryParam(param -> param.key("registration_origin")
                                .value((registrationOrigin != null) ? registrationOrigin.value() : null).isRequired(false))
                        .queryParam(param -> param.key("bank_account_status")
                                .value((bankAccountStatus != null) ? bankAccountStatus.value() : null).isRequired(false))
                        .queryParam(param -> param.key("from")
                                .value(from).isRequired(false))
                        .queryParam(param -> param.key("to")
                                .value(to).isRequired(false))
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitBankAccountList.class))
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
     * Registers a consumer bank account for direct debit. The account is created and then verified
     * against the bank, so it starts out unusable — poll its `status` until it becomes `active` (or
     * `registration_failed`) before scheduling transfers against it.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  body  Required parameter: Request payload for registering a consumer bank account.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankAccount> createDirectDebitBankAccount(
            final UUID merchantId,
            final DirectDebitBankAccountCreateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateDirectDebitBankAccountRequest(merchantId, body,
                idempotencyKey).execute();
    }

    /**
     * Registers a consumer bank account for direct debit. The account is created and then verified
     * against the bank, so it starts out unusable — poll its `status` until it becomes `active` (or
     * `registration_failed`) before scheduling transfers against it.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  body  Required parameter: Request payload for registering a consumer bank account.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankAccount>> createDirectDebitBankAccountAsync(
            final UUID merchantId,
            final DirectDebitBankAccountCreateRequest body,
            final String idempotencyKey) {
        try {
            return prepareCreateDirectDebitBankAccountRequest(merchantId, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createDirectDebitBankAccount.
     */
    private ApiCall<ApiResponse<DirectDebitBankAccount>, ApiException> prepareCreateDirectDebitBankAccountRequest(
            final UUID merchantId,
            final DirectDebitBankAccountCreateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankAccount>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-accounts")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("merchantId").value(merchantId)
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
                                response -> ApiHelper.deserialize(response, DirectDebitBankAccount.class))
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
     * Retrieves a single registered bank account, including its current verification status.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankAccount> getDirectDebitBankAccount(
            final UUID merchantId,
            final String bankAccountId) throws ApiException, IOException {
        return prepareGetDirectDebitBankAccountRequest(merchantId, bankAccountId).execute();
    }

    /**
     * Retrieves a single registered bank account, including its current verification status.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankAccount>> getDirectDebitBankAccountAsync(
            final UUID merchantId,
            final String bankAccountId) {
        try {
            return prepareGetDirectDebitBankAccountRequest(merchantId, bankAccountId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getDirectDebitBankAccount.
     */
    private ApiCall<ApiResponse<DirectDebitBankAccount>, ApiException> prepareGetDirectDebitBankAccountRequest(
            final UUID merchantId,
            final String bankAccountId) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankAccount>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-accounts/{bankAccountId}")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankAccountId").value(bankAccountId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitBankAccount.class))
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

    /**
     * Updates a registered bank account. Changing bank details re-triggers verification with the
     * bank. Transfers already registered keep the details they were created with.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @param  body  Required parameter: Request payload for updating a registered bank account.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankAccount> updateDirectDebitBankAccount(
            final UUID merchantId,
            final String bankAccountId,
            final DirectDebitBankAccountUpdateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateDirectDebitBankAccountRequest(merchantId, bankAccountId, body,
                idempotencyKey).execute();
    }

    /**
     * Updates a registered bank account. Changing bank details re-triggers verification with the
     * bank. Transfers already registered keep the details they were created with.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @param  body  Required parameter: Request payload for updating a registered bank account.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankAccount>> updateDirectDebitBankAccountAsync(
            final UUID merchantId,
            final String bankAccountId,
            final DirectDebitBankAccountUpdateRequest body,
            final String idempotencyKey) {
        try {
            return prepareUpdateDirectDebitBankAccountRequest(merchantId, bankAccountId, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateDirectDebitBankAccount.
     */
    private ApiCall<ApiResponse<DirectDebitBankAccount>, ApiException> prepareUpdateDirectDebitBankAccountRequest(
            final UUID merchantId,
            final String bankAccountId,
            final DirectDebitBankAccountUpdateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankAccount>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-accounts/{bankAccountId}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankAccountId").value(bankAccountId)
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
                                response -> ApiHelper.deserialize(response, DirectDebitBankAccount.class))
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
     * Deactivates a bank account so no further transfers can be registered against it. The record
     * is retained (status becomes `inactive`) rather than deleted, and can be re-enabled later.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankAccount> deactivateDirectDebitBankAccount(
            final UUID merchantId,
            final String bankAccountId) throws ApiException, IOException {
        return prepareDeactivateDirectDebitBankAccountRequest(merchantId, bankAccountId).execute();
    }

    /**
     * Deactivates a bank account so no further transfers can be registered against it. The record
     * is retained (status becomes `inactive`) rather than deleted, and can be re-enabled later.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankAccount>> deactivateDirectDebitBankAccountAsync(
            final UUID merchantId,
            final String bankAccountId) {
        try {
            return prepareDeactivateDirectDebitBankAccountRequest(merchantId, bankAccountId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for deactivateDirectDebitBankAccount.
     */
    private ApiCall<ApiResponse<DirectDebitBankAccount>, ApiException> prepareDeactivateDirectDebitBankAccountRequest(
            final UUID merchantId,
            final String bankAccountId) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankAccount>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-accounts/{bankAccountId}")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankAccountId").value(bankAccountId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitBankAccount.class))
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

    /**
     * Returns a deactivated bank account to `active` so transfers can be registered against it
     * again. The account must currently be `inactive`.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankAccount> reenableDirectDebitBankAccount(
            final UUID merchantId,
            final String bankAccountId,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareReenableDirectDebitBankAccountRequest(merchantId, bankAccountId,
                idempotencyKey).execute();
    }

    /**
     * Returns a deactivated bank account to `active` so transfers can be registered against it
     * again. The account must currently be `inactive`.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankAccount wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankAccount>> reenableDirectDebitBankAccountAsync(
            final UUID merchantId,
            final String bankAccountId,
            final String idempotencyKey) {
        try {
            return prepareReenableDirectDebitBankAccountRequest(merchantId, bankAccountId,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for reenableDirectDebitBankAccount.
     */
    private ApiCall<ApiResponse<DirectDebitBankAccount>, ApiException> prepareReenableDirectDebitBankAccountRequest(
            final UUID merchantId,
            final String bankAccountId,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankAccount>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-accounts/{bankAccountId}/re-enable")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankAccountId").value(bankAccountId)
                                .shouldEncode(true))
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
                                response -> ApiHelper.deserialize(response, DirectDebitBankAccount.class))
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
     * Schedules a pull of funds from an active bank account. The transfer is queued for the
     * merchant's next debit cycle and stays editable until that cycle's upload deadline passes.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @param  body  Required parameter: Request payload for scheduling a transfer, in JPY.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankTransfer wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankTransfer> createDirectDebitBankTransfer(
            final UUID merchantId,
            final String bankAccountId,
            final DirectDebitBankTransferCreateRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateDirectDebitBankTransferRequest(merchantId, bankAccountId, body,
                idempotencyKey).execute();
    }

    /**
     * Schedules a pull of funds from an active bank account. The transfer is queued for the
     * merchant's next debit cycle and stays editable until that cycle's upload deadline passes.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankAccountId  Required parameter: The unique identifier of the direct debit bank
     *         account.
     * @param  body  Required parameter: Request payload for scheduling a transfer, in JPY.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankTransfer wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankTransfer>> createDirectDebitBankTransferAsync(
            final UUID merchantId,
            final String bankAccountId,
            final DirectDebitBankTransferCreateRequest body,
            final String idempotencyKey) {
        try {
            return prepareCreateDirectDebitBankTransferRequest(merchantId, bankAccountId, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for createDirectDebitBankTransfer.
     */
    private ApiCall<ApiResponse<DirectDebitBankTransfer>, ApiException> prepareCreateDirectDebitBankTransferRequest(
            final UUID merchantId,
            final String bankAccountId,
            final DirectDebitBankTransferCreateRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankTransfer>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-accounts/{bankAccountId}/bank-transfers")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankAccountId").value(bankAccountId)
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
                                response -> ApiHelper.deserialize(response, DirectDebitBankTransfer.class))
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
     * Lists the direct debit transfers registered under this merchant, across all bank accounts.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  bankTransferId  Optional parameter: Filter by a single bank transfer ID.
     * @param  bankTransferStart  Optional parameter: Start of the year-month range in which the
     *         transfer is scheduled to occur.
     * @param  bankTransferEnd  Optional parameter: End of the year-month range in which the
     *         transfer is scheduled to occur.
     * @param  debitDate  Optional parameter: Filter by monthly debit cycle.
     * @param  userNumber  Optional parameter: Filter by the merchant's own membership number for
     *         the consumer (会員番号).
     * @param  bankAccountNumber  Optional parameter: Filter by the 7-digit account number (口座番号).
     * @param  bankAccountName  Optional parameter: Filter by account holder name in half-width
     *         katakana (口座名義).
     * @param  lockStatus  Optional parameter: Filter by lock status. Omit to return both locked and
     *         unlocked transfers.
     * @param  bankTransferStatus  Optional parameter: Filter by transfer status. Omit to return
     *         every status.
     * @return    Returns the DirectDebitBankTransferList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankTransferList> listDirectDebitBankTransfers(
            final UUID merchantId,
            final Integer limit,
            final String cursor,
            final CursorDirectionQuery cursorDirection,
            final String bankTransferId,
            final String bankTransferStart,
            final String bankTransferEnd,
            final DirectDebitDebitDate debitDate,
            final String userNumber,
            final String bankAccountNumber,
            final String bankAccountName,
            final DirectDebitBankTransferLock lockStatus,
            final DirectDebitBankTransferStatus bankTransferStatus) throws ApiException, IOException {
        return prepareListDirectDebitBankTransfersRequest(merchantId, limit, cursor,
                cursorDirection, bankTransferId, bankTransferStart, bankTransferEnd, debitDate,
                userNumber, bankAccountNumber, bankAccountName, lockStatus,
                bankTransferStatus).execute();
    }

    /**
     * Lists the direct debit transfers registered under this merchant, across all bank accounts.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  limit  Optional parameter: Maximum number of resources to return in one page.
     * @param  cursor  Optional parameter: Cursor pointing to the resource after which pagination
     *         should continue.
     * @param  cursorDirection  Optional parameter: Pagination direction relative to the supplied
     *         cursor.
     * @param  bankTransferId  Optional parameter: Filter by a single bank transfer ID.
     * @param  bankTransferStart  Optional parameter: Start of the year-month range in which the
     *         transfer is scheduled to occur.
     * @param  bankTransferEnd  Optional parameter: End of the year-month range in which the
     *         transfer is scheduled to occur.
     * @param  debitDate  Optional parameter: Filter by monthly debit cycle.
     * @param  userNumber  Optional parameter: Filter by the merchant's own membership number for
     *         the consumer (会員番号).
     * @param  bankAccountNumber  Optional parameter: Filter by the 7-digit account number (口座番号).
     * @param  bankAccountName  Optional parameter: Filter by account holder name in half-width
     *         katakana (口座名義).
     * @param  lockStatus  Optional parameter: Filter by lock status. Omit to return both locked and
     *         unlocked transfers.
     * @param  bankTransferStatus  Optional parameter: Filter by transfer status. Omit to return
     *         every status.
     * @return    Returns the DirectDebitBankTransferList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankTransferList>> listDirectDebitBankTransfersAsync(
            final UUID merchantId,
            final Integer limit,
            final String cursor,
            final CursorDirectionQuery cursorDirection,
            final String bankTransferId,
            final String bankTransferStart,
            final String bankTransferEnd,
            final DirectDebitDebitDate debitDate,
            final String userNumber,
            final String bankAccountNumber,
            final String bankAccountName,
            final DirectDebitBankTransferLock lockStatus,
            final DirectDebitBankTransferStatus bankTransferStatus) {
        try {
            return prepareListDirectDebitBankTransfersRequest(merchantId, limit, cursor, cursorDirection,
            bankTransferId, bankTransferStart, bankTransferEnd, debitDate, userNumber,
            bankAccountNumber, bankAccountName, lockStatus, bankTransferStatus).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for listDirectDebitBankTransfers.
     */
    private ApiCall<ApiResponse<DirectDebitBankTransferList>, ApiException> prepareListDirectDebitBankTransfersRequest(
            final UUID merchantId,
            final Integer limit,
            final String cursor,
            final CursorDirectionQuery cursorDirection,
            final String bankTransferId,
            final String bankTransferStart,
            final String bankTransferEnd,
            final DirectDebitDebitDate debitDate,
            final String userNumber,
            final String bankAccountNumber,
            final String bankAccountName,
            final DirectDebitBankTransferLock lockStatus,
            final DirectDebitBankTransferStatus bankTransferStatus) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankTransferList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-transfers")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("cursor")
                                .value(cursor).isRequired(false))
                        .queryParam(param -> param.key("cursor_direction")
                                .value((cursorDirection != null) ? cursorDirection.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_id")
                                .value(bankTransferId).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_start")
                                .value(bankTransferStart).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_end")
                                .value(bankTransferEnd).isRequired(false))
                        .queryParam(param -> param.key("debit_date")
                                .value((debitDate != null) ? debitDate.value() : null).isRequired(false))
                        .queryParam(param -> param.key("user_number")
                                .value(userNumber).isRequired(false))
                        .queryParam(param -> param.key("bank_account_number")
                                .value(bankAccountNumber).isRequired(false))
                        .queryParam(param -> param.key("bank_account_name")
                                .value(bankAccountName).isRequired(false))
                        .queryParam(param -> param.key("lock_status")
                                .value((lockStatus != null) ? lockStatus.value() : null).isRequired(false))
                        .queryParam(param -> param.key("bank_transfer_status")
                                .value((bankTransferStatus != null) ? bankTransferStatus.value() : null).isRequired(false))
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitBankTransferList.class))
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
     * Retrieves a single transfer. Poll this after the cycle's result registration date to pick up
     * the outcome and, on failure, the bank's reason.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankTransferId  Required parameter: The unique identifier of the direct debit bank
     *         transfer.
     * @return    Returns the DirectDebitBankTransfer wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankTransfer> getDirectDebitBankTransfer(
            final UUID merchantId,
            final String bankTransferId) throws ApiException, IOException {
        return prepareGetDirectDebitBankTransferRequest(merchantId, bankTransferId).execute();
    }

    /**
     * Retrieves a single transfer. Poll this after the cycle's result registration date to pick up
     * the outcome and, on failure, the bank's reason.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankTransferId  Required parameter: The unique identifier of the direct debit bank
     *         transfer.
     * @return    Returns the DirectDebitBankTransfer wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankTransfer>> getDirectDebitBankTransferAsync(
            final UUID merchantId,
            final String bankTransferId) {
        try {
            return prepareGetDirectDebitBankTransferRequest(merchantId, bankTransferId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getDirectDebitBankTransfer.
     */
    private ApiCall<ApiResponse<DirectDebitBankTransfer>, ApiException> prepareGetDirectDebitBankTransferRequest(
            final UUID merchantId,
            final String bankTransferId) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankTransfer>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-transfers/{bankTransferId}")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankTransferId").value(bankTransferId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DirectDebitBankTransfer.class))
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

    /**
     * Changes a scheduled transfer's amount. Only permitted while the transfer is `unlocked` — once
     * its cycle's upload deadline passes the amount is fixed.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankTransferId  Required parameter: The unique identifier of the direct debit bank
     *         transfer.
     * @param  body  Required parameter: Request payload for changing the transfer amount.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankTransfer wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DirectDebitBankTransfer> updateDirectDebitBankTransfer(
            final UUID merchantId,
            final String bankTransferId,
            final DirectDebitBankTransferPatchRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateDirectDebitBankTransferRequest(merchantId, bankTransferId, body,
                idempotencyKey).execute();
    }

    /**
     * Changes a scheduled transfer's amount. Only permitted while the transfer is `unlocked` — once
     * its cycle's upload deadline passes the amount is fixed.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankTransferId  Required parameter: The unique identifier of the direct debit bank
     *         transfer.
     * @param  body  Required parameter: Request payload for changing the transfer amount.
     * @param  idempotencyKey  Optional parameter: An optional idempotency key to prevent double
     *         charges and duplicate operations. We recommend a randomly generated UUID (v4).
     * @return    Returns the DirectDebitBankTransfer wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DirectDebitBankTransfer>> updateDirectDebitBankTransferAsync(
            final UUID merchantId,
            final String bankTransferId,
            final DirectDebitBankTransferPatchRequest body,
            final String idempotencyKey) {
        try {
            return prepareUpdateDirectDebitBankTransferRequest(merchantId, bankTransferId, body,
            idempotencyKey).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for updateDirectDebitBankTransfer.
     */
    private ApiCall<ApiResponse<DirectDebitBankTransfer>, ApiException> prepareUpdateDirectDebitBankTransferRequest(
            final UUID merchantId,
            final String bankTransferId,
            final DirectDebitBankTransferPatchRequest body,
            final String idempotencyKey) {
        return new ApiCall.Builder<ApiResponse<DirectDebitBankTransfer>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-transfers/{bankTransferId}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankTransferId").value(bankTransferId)
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
                                response -> ApiHelper.deserialize(response, DirectDebitBankTransfer.class))
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
     * Cancels a scheduled transfer so it is not sent to the bank. Only permitted while the transfer
     * is `unlocked`.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankTransferId  Required parameter: The unique identifier of the direct debit bank
     *         transfer.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> deleteDirectDebitBankTransfer(
            final UUID merchantId,
            final String bankTransferId) throws ApiException, IOException {
        return prepareDeleteDirectDebitBankTransferRequest(merchantId, bankTransferId).execute();
    }

    /**
     * Cancels a scheduled transfer so it is not sent to the bank. Only permitted while the transfer
     * is `unlocked`.
     * @param  merchantId  Required parameter: The unique identifier of the merchant.
     * @param  bankTransferId  Required parameter: The unique identifier of the direct debit bank
     *         transfer.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> deleteDirectDebitBankTransferAsync(
            final UUID merchantId,
            final String bankTransferId) {
        try {
            return prepareDeleteDirectDebitBankTransferRequest(merchantId, bankTransferId).executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for deleteDirectDebitBankTransfer.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareDeleteDirectDebitBankTransferRequest(
            final UUID merchantId,
            final String bankTransferId) {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DIRECTDEBIT.value())
                        .path("/merchants/{merchantId}/bank-transfers/{bankTransferId}")
                        .templateParam(param -> param.key("merchantId").value(merchantId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("bankTransferId").value(bankTransferId)
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
}