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
import com.univapay.api.models.Merchant;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class MerchantsApi extends BaseApi {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public MerchantsApi(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns merchant identity and the effective configuration resolved from bearer credentials.
     * Treat this as the canonical introspection endpoint for merchant integrations.
     * @return    Returns the Merchant wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Merchant> getCurrentMerchant() throws ApiException, IOException {
        return prepareGetCurrentMerchantRequest().execute();
    }

    /**
     * Returns merchant identity and the effective configuration resolved from bearer credentials.
     * Treat this as the canonical introspection endpoint for merchant integrations.
     * @return    Returns the Merchant wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Merchant>> getCurrentMerchantAsync() {
        try {
            return prepareGetCurrentMerchantRequest().executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for getCurrentMerchant.
     */
    private ApiCall<ApiResponse<Merchant>, ApiException> prepareGetCurrentMerchantRequest() {
        return new ApiCall.Builder<ApiResponse<Merchant>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/me")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("JWT_TOKEN"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Merchant.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setTemplate("HTTP 401 Unauthorized: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setTemplate("HTTP 403 Forbidden: {$response.body#/code}",
                                (reason, context) -> new ApiErrorException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setTemplate("HTTP 429 Rate Limited: {$response.body#/code}",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP 400 Bad Request: {$response.body#/code}",
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
}