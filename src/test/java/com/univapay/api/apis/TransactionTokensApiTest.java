/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.apis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.univapay.api.ApiHelper;
import com.univapay.api.UnivapayClientSdkClient;
import com.univapay.api.exceptions.ApiException;
import com.univapay.api.models.CursorDirectionQuery;
import com.univapay.api.models.ThreeDsIssuerToken;
import com.univapay.api.models.TransactionToken;
import com.univapay.api.models.TransactionTokenCreateRequest;
import com.univapay.api.models.TransactionTokenList;
import com.univapay.api.models.TransactionTokenUpdateRequest;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionTokensApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static TransactionTokensApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getTransactionTokensApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Exchange raw payment data for a secure token. **PCI DSS Compliance Required** if sending raw
     * card numbers.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateTransactionToken() throws Exception {
        // Parameters for the API call
        TransactionTokenCreateRequest body = ApiHelper.deserialize(
                "{\"payment_type\":\"card\",\"type\":\"recurring\",\"email\":\"test@univapay.com\","
                + "\"metadata\":{\"univapay-phone-number\":\"+81 08012341234\"},\"data\":{\"cardhol"
                + "der\":\"TEST TEST\",\"card_number\":\"4242424242424242\",\"exp_month\":\"09\","
                + "\"exp_year\":\"26\",\"cvv\":\"123\",\"phone_number\":{\"country_code\":\"81\","
                + "\"local_number\":\"08012341234\"},\"three_ds\":{\"redirect_endpoint\":\"https://"
                + "univapay.com/redirect/index.html\"},\"cvv_authorize\":{\"enabled\":false,\"curre"
                + "ncy\":\"JPY\"}}}",
                TransactionTokenCreateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        TransactionToken result = null;
        try {
            result = controller.createTransactionToken(body, idempotencyKey).getResult();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"id\":\"11f11e85-e9e9-b198-b990-c3a715943241\",\"store_id\":\"11f0e274-1e3b-4752"
                + "-9513-33d3e07ede13\",\"email\":\"test@test.com\",\"payment_type\":\"card\",\"act"
                + "ive\":true,\"mode\":\"live\",\"type\":\"recurring\",\"usage_limit\":null,\"confi"
                + "rmed\":null,\"metadata\":{\"univapay-link-id\":\"11f11e85-1b45-dace-bf3d-cbcae52"
                + "f65fc\",\"univapay-name\":\"test\",\"univapay-phone-number\":\"+81 08012341234"
                + "\"},\"created_on\":\"2026-03-13T02:39:52.908468Z\",\"updated_on\":\"2026-03-13T0"
                + "2:39:52.908468Z\",\"last_used_on\":null,\"data\":{\"card\":{\"cardholder\":\"TES"
                + "T TEST\",\"exp_month\":9,\"exp_year\":2026,\"card_bin\":\"424242\",\"last_four"
                + "\":\"424242\",\"brand\":\"visa\",\"card_type\":\"credit\",\"country\":\"JP\",\"c"
                + "ategory\":\"standard\",\"issuer\":\"issuer\",\"sub_brand\":\"none\"},\"billing"
                + "\":{\"line1\":null,\"line2\":null,\"state\":null,\"city\":null,\"country\":null,"
                + "\"zip\":null,\"phone_number\":{\"country_code\":81,\"local_number\":\"0801234123"
                + "4\"}},\"cvv_authorize\":{\"enabled\":false,\"status\":null,\"charge_id\":null,"
                + "\"credentials_id\":null,\"currency\":null},\"cvv_authorize_check\":{\"status\":n"
                + "ull,\"charge_id\":null,\"date\":null},\"three_ds\":{\"enabled\":true,\"status\":"
                + "\"pending\",\"redirect_endpoint\":\"https://univapay.com/redirect/index.html\","
                + "\"error\":null,\"exempted\":false}}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists all transaction tokens across all stores.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAllTransactionTokens() throws Exception {
        // Parameters for the API call
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        TransactionTokenList result = null;
        try {
            result = controller.listAllTransactionTokens(limit, cursor, cursorDirection).getResult();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"items\":[{\"id\":\"2fe23e45-f95d-4c95-9963-739070096443\",\"store_id\":\"79e950"
                + "4e-96d8-46ed-8d22-2e8b36238605\",\"merchant_name\":\"Test Merchant\",\"store_nam"
                + "e\":\"Tokyo Store\",\"email\":\"taro@example.com\",\"payment_type\":\"card\",\"a"
                + "ctive\":true,\"mode\":\"live\",\"type\":\"recurring\",\"created_on\":\"2026-04-0"
                + "9T07:35:50Z\",\"updated_on\":\"2026-04-09T07:35:50Z\",\"user_data\":{\"cardholde"
                + "r_name\":\"TARO YAMADA\",\"email\":\"taro@example.com\"}},{\"id\":\"3af34f56-a06"
                + "e-4d06-aa74-84a181107554\",\"store_id\":\"8bfa615f-a7e9-47fe-9e33-3f9c47349716"
                + "\",\"merchant_name\":\"Test Merchant\",\"store_name\":\"Osaka Store\",\"email\":"
                + "\"hanako@example.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live"
                + "\",\"type\":\"one_time\",\"created_on\":\"2026-04-10T10:20:11Z\",\"updated_on\":"
                + "\"2026-04-10T10:20:11Z\",\"user_data\":{\"cardholder_name\":\"HANAKO SUZUKI\","
                + "\"email\":\"hanako@example.com\"}},{\"id\":\"4bf45e67-b17f-4e17-bb85-95b29221866"
                + "5\",\"store_id\":\"79e9504e-96d8-46ed-8d22-2e8b36238605\",\"merchant_name\":\"Te"
                + "st Merchant\",\"store_name\":\"Tokyo Store\",\"email\":\"jiro@example.com\",\"pa"
                + "yment_type\":\"card\",\"active\":false,\"mode\":\"live\",\"type\":\"subscription"
                + "\",\"created_on\":\"2026-04-11T18:05:42Z\",\"updated_on\":\"2026-04-12T08:31:09Z"
                + "\",\"user_data\":{\"cardholder_name\":\"JIRO TANAKA\",\"email\":\"jiro@example.c"
                + "om\"}}],\"has_more\":false,\"total_hits\":3}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists all transaction tokens for a specific store.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListStoreTransactionTokens() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        TransactionTokenList result = null;
        try {
            result = controller.listStoreTransactionTokens(storeId, limit, cursor, cursorDirection).getResult();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"items\":[{\"id\":\"2fe23e45-f95d-4c95-9963-739070096443\",\"store_id\":\"79e950"
                + "4e-96d8-46ed-8d22-2e8b36238605\",\"merchant_name\":\"Test Merchant\",\"store_nam"
                + "e\":\"Tokyo Store\",\"email\":\"taro@example.com\",\"payment_type\":\"card\",\"a"
                + "ctive\":true,\"mode\":\"live\",\"type\":\"recurring\",\"created_on\":\"2026-04-0"
                + "9T07:35:50Z\",\"updated_on\":\"2026-04-09T07:35:50Z\",\"user_data\":{\"cardholde"
                + "r_name\":\"TARO YAMADA\",\"email\":\"taro@example.com\"}},{\"id\":\"5cf56e78-c28"
                + "a-4f28-cc96-06c303329776\",\"store_id\":\"79e9504e-96d8-46ed-8d22-2e8b36238605"
                + "\",\"merchant_name\":\"Test Merchant\",\"store_name\":\"Tokyo Store\",\"email\":"
                + "\"saburo@example.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live"
                + "\",\"type\":\"one_time\",\"created_on\":\"2026-04-10T12:14:00Z\",\"updated_on\":"
                + "\"2026-04-10T12:14:00Z\",\"user_data\":{\"cardholder_name\":\"SABURO KATO\",\"em"
                + "ail\":\"saburo@example.com\"}},{\"id\":\"6df67e89-d39a-4039-dd07-17d414430887\","
                + "\"store_id\":\"79e9504e-96d8-46ed-8d22-2e8b36238605\",\"merchant_name\":\"Test M"
                + "erchant\",\"store_name\":\"Tokyo Store\",\"email\":\"shiro@example.com\",\"payme"
                + "nt_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"subscription\","
                + "\"created_on\":\"2026-04-11T16:48:23Z\",\"updated_on\":\"2026-04-11T16:48:23Z\","
                + "\"user_data\":{\"cardholder_name\":\"SHIRO ITO\",\"email\":\"shiro@example.com"
                + "\"}}],\"has_more\":false,\"total_hits\":3}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the details of an existing transaction token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetTransactionToken() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        TransactionToken result = null;
        try {
            result = controller.getTransactionToken(storeId, id).getResult();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"id\":\"11f11e85-e9e9-b198-b990-c3a715943241\",\"store_id\":\"11f0e274-1e3b-4752"
                + "-9513-33d3e07ede13\",\"email\":\"test@test.com\",\"payment_type\":\"card\",\"act"
                + "ive\":true,\"mode\":\"live\",\"type\":\"recurring\",\"usage_limit\":null,\"confi"
                + "rmed\":null,\"metadata\":{\"univapay-link-id\":\"11f11e85-1b45-dace-bf3d-cbcae52"
                + "f65fc\",\"univapay-name\":\"test\",\"univapay-phone-number\":\"+81 08012341234"
                + "\"},\"created_on\":\"2026-03-13T02:39:52.908468Z\",\"updated_on\":\"2026-03-13T0"
                + "2:39:52.908468Z\",\"last_used_on\":null,\"data\":{\"card\":{\"cardholder\":\"TES"
                + "T TEST\",\"exp_month\":9,\"exp_year\":2026,\"card_bin\":\"424242\",\"last_four"
                + "\":\"424242\",\"brand\":\"visa\",\"card_type\":\"credit\",\"country\":\"JP\",\"c"
                + "ategory\":\"standard\",\"issuer\":\"issuer\",\"sub_brand\":\"none\"},\"billing"
                + "\":{\"line1\":null,\"line2\":null,\"state\":null,\"city\":null,\"country\":null,"
                + "\"zip\":null,\"phone_number\":{\"country_code\":81,\"local_number\":\"0801234123"
                + "4\"}},\"cvv_authorize\":{\"enabled\":false,\"status\":null,\"charge_id\":null,"
                + "\"credentials_id\":null,\"currency\":null},\"cvv_authorize_check\":{\"status\":n"
                + "ull,\"charge_id\":null,\"date\":null},\"three_ds\":{\"enabled\":true,\"status\":"
                + "\"pending\",\"redirect_endpoint\":\"https://univapay.com/redirect/index.html\","
                + "\"error\":null,\"exempted\":false}}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
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
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateTransactionToken() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";
        TransactionTokenUpdateRequest body = ApiHelper.deserialize(
                "{\"email\":\"test.update@test.com\",\"data\":{\"cardholder\":\"TARO YAMADA\",\"car"
                + "d_number\":\"4000020000000000\",\"exp_month\":12,\"exp_year\":2099,\"cvv\":\"123"
                + "\",\"line1\":\"11111\",\"line2\":\"222\",\"state\":\"Tokyo\",\"city\":\"テスト区一丁目"
                + "\",\"country\":\"JP\",\"zip\":\"1234567\",\"phone_number\":{\"country_code\":\"8"
                + "1\",\"local_number\":\"08000000000\"}}}",
                TransactionTokenUpdateRequest.class);

        // Set callback and perform API call
        TransactionToken result = null;
        try {
            result = controller.updateTransactionToken(storeId, id, idempotencyKey, body).getResult();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"id\":\"11f11e85-e9e9-b198-b990-c3a715943241\",\"store_id\":\"11f0e274-1e3b-4752"
                + "-9513-33d3e07ede13\",\"email\":\"test@test.com\",\"payment_type\":\"card\",\"act"
                + "ive\":true,\"mode\":\"live\",\"type\":\"recurring\",\"usage_limit\":null,\"confi"
                + "rmed\":null,\"metadata\":{\"univapay-link-id\":\"11f11e85-1b45-dace-bf3d-cbcae52"
                + "f65fc\",\"univapay-name\":\"test\",\"univapay-phone-number\":\"+81 08012341234"
                + "\"},\"created_on\":\"2026-03-13T02:39:52.908468Z\",\"updated_on\":\"2026-03-13T0"
                + "2:39:52.908468Z\",\"last_used_on\":null,\"data\":{\"card\":{\"cardholder\":\"TES"
                + "T TEST\",\"exp_month\":9,\"exp_year\":2026,\"card_bin\":\"424242\",\"last_four"
                + "\":\"424242\",\"brand\":\"visa\",\"card_type\":\"credit\",\"country\":\"JP\",\"c"
                + "ategory\":\"standard\",\"issuer\":\"issuer\",\"sub_brand\":\"none\"},\"billing"
                + "\":{\"line1\":null,\"line2\":null,\"state\":null,\"city\":null,\"country\":null,"
                + "\"zip\":null,\"phone_number\":{\"country_code\":81,\"local_number\":\"0801234123"
                + "4\"}},\"cvv_authorize\":{\"enabled\":false,\"status\":null,\"charge_id\":null,"
                + "\"credentials_id\":null,\"currency\":null},\"cvv_authorize_check\":{\"status\":n"
                + "ull,\"charge_id\":null,\"date\":null},\"three_ds\":{\"enabled\":true,\"status\":"
                + "\"pending\",\"redirect_endpoint\":\"https://univapay.com/redirect/index.html\","
                + "\"error\":null,\"exempted\":false}}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Deletes a specific transaction token. ⚠️ **WARNING: Breaks Linked Subscriptions** Please note
     * that deleting a transaction token will immediately prevent any linked recurring charges or
     * subscriptions from being processed. Proceed with caution.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteTransactionToken() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        try {
            controller.deleteTransactionToken(storeId, id).getResult();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 204", 
                204, httpResponse.getResponse().getStatusCode());

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
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetTokenThreeDsIssuerToken() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        ThreeDsIssuerToken result = null;
        try {
            result = controller.getTokenThreeDsIssuerToken(storeId, id).getResult();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"issuer_token\":\"http://test.com/action\",\"call_method\":\"http_post\",\"paylo"
                + "ad\":{\"request_data\":\"example_value\"},\"payment_type\":\"card\",\"content_ty"
                + "pe\":\"application/x-www-form-urlencoded; charset=UTF-8\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
