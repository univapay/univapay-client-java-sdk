/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api;

import com.univapay.api.apis.CancelsApi;
import com.univapay.api.apis.ChargesApi;
import com.univapay.api.apis.MerchantsApi;
import com.univapay.api.apis.RefundsApi;
import com.univapay.api.apis.StoresApi;
import com.univapay.api.apis.SubscriptionsApi;
import com.univapay.api.apis.TransactionTokensApi;
import com.univapay.api.apis.WebhooksApi;
import com.univapay.api.authentication.BearerAuthManager;
import com.univapay.api.authentication.BearerAuthModel;
import com.univapay.api.http.client.HttpCallback;
import com.univapay.api.http.client.HttpClientConfiguration;
import com.univapay.api.http.client.ReadonlyHttpClientConfiguration;
import com.univapay.api.logging.configuration.ApiLoggingConfiguration;
import com.univapay.api.logging.configuration.ReadonlyLoggingConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Apis.
 * It holds the state of the SDK.
 */
public final class UnivapayClientSdkClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private ChargesApi charges;
    private TransactionTokensApi transactionTokens;
    private RefundsApi refunds;
    private SubscriptionsApi subscriptions;
    private CancelsApi cancels;
    private MerchantsApi merchants;
    private StoresApi stores;
    private WebhooksApi webhooks;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "Java-SDK/1.0.0 (OS: {os-info}, Engine: {engine}/{engine-version})";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * Base URL for the API
     */
    private final String baseUrl;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Logging Configuration instance.
     */
    private final ReadonlyLoggingConfiguration loggingConfig;

    /**
     * BearerAuthManager.
     */
    private BearerAuthManager bearerAuthManager;

    /**
     * The instance of BearerAuthModel.
     */
    private BearerAuthModel bearerAuthModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private UnivapayClientSdkClient(Environment environment, String baseUrl, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig,
            ReadonlyLoggingConfiguration loggingConfig, BearerAuthModel bearerAuthModel,
            HttpCallback httpCallback) {
        this.environment = environment;
        this.baseUrl = baseUrl;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.loggingConfig = loggingConfig;
        if (httpCallback instanceof IdempotencyCallback) {
            this.httpCallback = httpCallback;
        } else {
            this.httpCallback = new IdempotencyCallback(httpCallback);
        }

        this.bearerAuthModel = bearerAuthModel;

        this.bearerAuthManager = new BearerAuthManager(bearerAuthModel);
        this.authentications.put("JWT_TOKEN", bearerAuthManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .loggingConfiguration(((ApiLoggingConfiguration) loggingConfig).getConfiguration())
                .build();
        charges = new ChargesApi(globalConfig);
        transactionTokens = new TransactionTokensApi(globalConfig);
        refunds = new RefundsApi(globalConfig);
        subscriptions = new SubscriptionsApi(globalConfig);
        cancels = new CancelsApi(globalConfig);
        merchants = new MerchantsApi(globalConfig);
        stores = new StoresApi(globalConfig);
        webhooks = new WebhooksApi(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of ChargesApi.
     * @return charges
     */
    public ChargesApi getChargesApi() {
        return charges;
    }

    /**
     * Get the instance of TransactionTokensApi.
     * @return transactionTokens
     */
    public TransactionTokensApi getTransactionTokensApi() {
        return transactionTokens;
    }

    /**
     * Get the instance of RefundsApi.
     * @return refunds
     */
    public RefundsApi getRefundsApi() {
        return refunds;
    }

    /**
     * Get the instance of SubscriptionsApi.
     * @return subscriptions
     */
    public SubscriptionsApi getSubscriptionsApi() {
        return subscriptions;
    }

    /**
     * Get the instance of CancelsApi.
     * @return cancels
     */
    public CancelsApi getCancelsApi() {
        return cancels;
    }

    /**
     * Get the instance of MerchantsApi.
     * @return merchants
     */
    public MerchantsApi getMerchantsApi() {
        return merchants;
    }

    /**
     * Get the instance of StoresApi.
     * @return stores
     */
    public StoresApi getStoresApi() {
        return stores;
    }

    /**
     * Get the instance of WebhooksApi.
     * @return webhooks
     */
    public WebhooksApi getWebhooksApi() {
        return webhooks;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * Base URL for the API
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * Logging Configuration instance.
     * @return loggingConfig
     */
    public ReadonlyLoggingConfiguration getLoggingConfig() {
        return loggingConfig;
    }

    /**
     * The credentials to use with BearerAuth.
     * @return bearerAuthCredentials
     */
    public BearerAuthCredentials getBearerAuthCredentials() {
        return bearerAuthManager;
    }

    /**
     * The auth credential model for BearerAuth.
     * @return the instance of BearerAuthModel
     */
    public BearerAuthModel getBearerAuthModel() {
        return bearerAuthModel;
    }

    /**
     * The secret key to use, together with the JWT token, for API requests.
     * @return secretKey
     */
    public String getSecretKey() {
        return getBearerAuthCredentials().getSecretKey();
    }

    /**
     * The JWT token to use, together with the secret key, for API requests.
     * @return jwtToken
     */
    public String getJwtToken() {
        return getBearerAuthCredentials().getJwtToken();
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("baseUrl",
                new SimpleEntry<Object, Boolean>(this.baseUrl, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "{baseUrl}";
            }
        }
        return "{baseUrl}";
    }

    /**
     * Converts this UnivapayClientSdkClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UnivapayClientSdkClient [" + "environment=" + environment + ", baseUrl=" + baseUrl
                + ", httpClientConfig=" + httpClientConfig + ", loggingConfig=" + loggingConfig
                + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link UnivapayClientSdkClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link UnivapayClientSdkClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.baseUrl = getBaseUrl();
        builder.httpClient = getHttpClient();
        builder.bearerAuthCredentials(getBearerAuthModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        builder.loggingConfig(() -> ((ApiLoggingConfiguration) loggingConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link UnivapayClientSdkClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private String baseUrl = "https://api.univapay.com";
        private HttpClient httpClient;
        private BearerAuthModel bearerAuthModel = new BearerAuthModel.Builder("", "").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();
        private ApiLoggingConfiguration.Builder loggingConfigBuilder = null;


        /**
         * Credentials setter for BearerAuthCredentials.
         * @param bearerAuthModel The instance of BearerAuthModel.
         * @return The current instance of builder.
         */
        public Builder bearerAuthCredentials(BearerAuthModel bearerAuthModel) {
            this.bearerAuthModel = bearerAuthModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Base URL for the API
         * @param baseUrl The baseUrl for client.
         * @return Builder
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * Setter for the Builder of LoggingConfiguration, takes in an operation to be
         * performed on the builder instance of logging configuration.
         * @param action Consumer for the builder of LoggingConfiguration.
         * @return Builder
         */
        public Builder loggingConfig(Consumer<ApiLoggingConfiguration.Builder> action) {
            if (loggingConfigBuilder == null) {
                loggingConfigBuilder = new ApiLoggingConfiguration.Builder();
            }

            if (loggingConfigBuilder.build().getLogger() == null) {
                loggingConfigBuilder.useDefaultLogger();
            }

            action.accept(loggingConfigBuilder);
            return this;
        }

        /**
         * Setter for the Builder of LoggingConfiguration with Console Logging.
         *
         * @return Builder
         */
        public Builder loggingConfig() {
            loggingConfigBuilder = new ApiLoggingConfiguration.Builder();
            loggingConfigBuilder.useDefaultLogger();
            return this;
        }

		/**
		 * Private setter for the Builder of LoggingConfiguration, takes in an operation to be
		 * performed on the builder instance of logging configuration.
		 * 
		 * @param supplier Supplier for the builder of LoggingConfiguration.
		 * @return Builder
		 */
		private Builder loggingConfig(Supplier<ApiLoggingConfiguration.Builder> supplier) {
			loggingConfigBuilder = supplier.get();
			return this;
		}

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new UnivapayClientSdkClient object using the set fields.
         * @return UnivapayClientSdkClient
         */
        public UnivapayClientSdkClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            ReadonlyLoggingConfiguration loggingConfig = loggingConfigBuilder != null ? loggingConfigBuilder.build() 
                    : new ApiLoggingConfiguration.Builder().build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new UnivapayClientSdkClient(environment, baseUrl, httpClient, httpClientConfig,
                    loggingConfig, bearerAuthModel, httpCallback);
        }
    }
    private static class IdempotencyCallback implements HttpCallback {
        private final HttpCallback userCallback;

        public IdempotencyCallback(HttpCallback userCallback) {
            this.userCallback = userCallback;
        }

        @Override
        public void onBeforeRequest(io.apimatic.coreinterfaces.http.request.Request request) {
            if (request != null) {
                if (request instanceof com.univapay.api.http.request.HttpRequest) {
                    com.univapay.api.http.request.HttpRequest req = (com.univapay.api.http.request.HttpRequest) request;
                    String method = req.getHttpMethod() != null ? req.getHttpMethod().toString().toUpperCase() : "";
                    if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH")) {
                        com.univapay.api.http.Headers headers = req.getHeaders();
                        if (headers != null && !headers.has("Idempotency-Key")) {
                            headers.add("Idempotency-Key", java.util.UUID.randomUUID().toString());
                        }
                    }
                }
            }
            if (userCallback != null) {
                userCallback.onBeforeRequest(request);
            }
        }

        @Override
        public void onAfterResponse(io.apimatic.coreinterfaces.http.Context context) {
            if (userCallback != null) {
                userCallback.onAfterResponse(context);
            }
        }
    }

}