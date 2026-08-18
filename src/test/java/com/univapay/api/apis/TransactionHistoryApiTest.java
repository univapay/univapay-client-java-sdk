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
import com.univapay.api.models.BankTransferPaymentStatus;
import com.univapay.api.models.CursorDirectionQuery;
import com.univapay.api.models.TransactionHistoryList;
import com.univapay.api.models.TransactionHistoryMode;
import com.univapay.api.models.TransactionHistoryServiceProvider;
import com.univapay.api.models.TransactionHistoryStatus;
import com.univapay.api.models.TransactionHistoryType;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionHistoryApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static TransactionHistoryApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getTransactionHistoryApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns a paginated, searchable history of charges and refunds across all of the merchant's
     * stores, combining both resource types into a single unified row shape.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListTransactionHistory() throws Exception {
        // Parameters for the API call
        TransactionHistoryMode mode = TransactionHistoryMode.fromString(
                "test");
        String shortId = 
                "8bfc29";
        String from = 
                "2026-04-01T00:00:00Z";
        String to = 
                "2026-04-30T23:59:59.999Z";
        TransactionHistoryStatus status = TransactionHistoryStatus.fromString(
                "successful");
        TransactionHistoryType type = TransactionHistoryType.fromString(
                "charge");
        String search = 
                "Taro Yamada";
        String email = 
                "user@example.com";
        UUID id = UUID.fromString(
                "11ef0000-0000-4000-8000-000000000070");
        String metadata = 
                "order_id: 12345";
        String cardExp = 
                "2026-04";
        String cardLastFour = 
                "4242";
        String cardholder = 
                "TARO YAMADA";
        List<String> cardBrand = ApiHelper.deserializeArray(
                "[\"visa\"]",
                String[].class);
        List<String> brand = ApiHelper.deserializeArray(
                "[\"visa\"]",
                String[].class);
        List<String> brands = ApiHelper.deserializeArray(
                "[\"visa\",\"jcb\"]",
                String[].class);
        String currency = 
                "JPY";
        TransactionHistoryServiceProvider serviceProvider = TransactionHistoryServiceProvider.fromString(
                "credit");
        List<TransactionHistoryServiceProvider> serviceProviders = ApiHelper.deserializeArray(
                "[\"credit\",\"paidy\"]",
                TransactionHistoryServiceProvider[].class);
        String gatewayTransactionId = 
                "gw-txn-00123456";
        List<BankTransferPaymentStatus> bankTransferPaymentStatuses = ApiHelper.deserializeArray(
                "[\"exact\"]",
                BankTransferPaymentStatus[].class);
        String bankTransferLatestDepositDateFrom = 
                "2026-04-01T00:00:00Z";
        String bankTransferLatestDepositDateTo = 
                "2026-04-30T23:59:59.999Z";
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        TransactionHistoryList result = null;
        try {
            result = controller.listTransactionHistory(mode, shortId, from, to, status, type, search, email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand, brand, brands, currency, serviceProvider, serviceProviders, gatewayTransactionId, bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom, bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"resource_id"
                + "\":\"11ef0000-0000-4000-8000-000000000070\",\"charge_id\":null,\"amount\":1000,"
                + "\"currency\":\"JPY\",\"amount_formatted\":1000,\"type\":\"charge\",\"status\":"
                + "\"successful\",\"metadata\":{},\"created_on\":\"2024-05-01T12:34:56.789Z\",\"mod"
                + "e\":\"test\",\"merchant_name\":\"Test merchant\",\"store_name\":\"Test store\","
                + "\"payment_type\":\"card\",\"user_data\":{\"type\":\"charge\",\"cardholder_name"
                + "\":\"Some Guy\",\"cardholder_email_address\":\"test4@univapay.com\",\"brand\":"
                + "\"visa\",\"gateway\":\"test\",\"service_provider\":\"credit\",\"refunds\":[{\"re"
                + "fund_id\":\"11ef0000-0000-4000-8000-000000000010\",\"amount\":500,\"currency\":"
                + "\"JPY\",\"amount_formatted\":500,\"status\":\"successful\"}]},\"bank_transfer_pa"
                + "yment_status\":null,\"bank_transfer_latest_deposit_date\":null,\"mcp_token_id\":"
                + "null,\"charge_type\":\"normal\"},{\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55"
                + "f95c0\",\"resource_id\":\"11ef0000-0000-4000-8000-000000000010\",\"charge_id\":"
                + "\"11ef0000-0000-4000-8000-000000000070\",\"amount\":500,\"currency\":\"JPY\",\"a"
                + "mount_formatted\":500,\"type\":\"refund\",\"status\":\"successful\",\"metadata"
                + "\":{},\"created_on\":\"2024-05-01T13:00:00.000000Z\",\"mode\":\"test\",\"merchan"
                + "t_name\":\"Test merchant\",\"store_name\":\"Test store\",\"payment_type\":\"card"
                + "\",\"user_data\":{\"type\":\"refund\",\"reason\":\"customer_request\"},\"bank_tr"
                + "ansfer_payment_status\":null,\"bank_transfer_latest_deposit_date\":null,\"mcp_to"
                + "ken_id\":null,\"charge_type\":null}],\"has_more\":false,\"total_hits\":2}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Returns a paginated, searchable history of charges and refunds for a single store, combining
     * both resource types into a single unified row shape.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListStoreTransactionHistory() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        TransactionHistoryMode mode = TransactionHistoryMode.fromString(
                "test");
        String shortId = 
                "8bfc29";
        String from = 
                "2026-04-01T00:00:00Z";
        String to = 
                "2026-04-30T23:59:59.999Z";
        TransactionHistoryStatus status = TransactionHistoryStatus.fromString(
                "successful");
        TransactionHistoryType type = TransactionHistoryType.fromString(
                "charge");
        String search = 
                "Taro Yamada";
        String email = 
                "user@example.com";
        UUID id = UUID.fromString(
                "11ef0000-0000-4000-8000-000000000070");
        String metadata = 
                "order_id: 12345";
        String cardExp = 
                "2026-04";
        String cardLastFour = 
                "4242";
        String cardholder = 
                "TARO YAMADA";
        List<String> cardBrand = ApiHelper.deserializeArray(
                "[\"visa\"]",
                String[].class);
        List<String> brand = ApiHelper.deserializeArray(
                "[\"visa\"]",
                String[].class);
        List<String> brands = ApiHelper.deserializeArray(
                "[\"visa\",\"jcb\"]",
                String[].class);
        String currency = 
                "JPY";
        TransactionHistoryServiceProvider serviceProvider = TransactionHistoryServiceProvider.fromString(
                "credit");
        List<TransactionHistoryServiceProvider> serviceProviders = ApiHelper.deserializeArray(
                "[\"credit\",\"paidy\"]",
                TransactionHistoryServiceProvider[].class);
        String gatewayTransactionId = 
                "gw-txn-00123456";
        List<BankTransferPaymentStatus> bankTransferPaymentStatuses = ApiHelper.deserializeArray(
                "[\"exact\"]",
                BankTransferPaymentStatus[].class);
        String bankTransferLatestDepositDateFrom = 
                "2026-04-01T00:00:00Z";
        String bankTransferLatestDepositDateTo = 
                "2026-04-30T23:59:59.999Z";
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        TransactionHistoryList result = null;
        try {
            result = controller.listStoreTransactionHistory(storeId, mode, shortId, from, to, status, type, search, email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand, brand, brands, currency, serviceProvider, serviceProviders, gatewayTransactionId, bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom, bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"resource_id"
                + "\":\"11ef0000-0000-4000-8000-000000000072\",\"charge_id\":null,\"amount\":2500,"
                + "\"currency\":\"JPY\",\"amount_formatted\":2500,\"type\":\"charge\",\"status\":"
                + "\"awaiting\",\"metadata\":{},\"created_on\":\"2024-05-03T10:00:00.000000Z\",\"mo"
                + "de\":\"live\",\"merchant_name\":\"Test merchant\",\"store_name\":\"Test store\","
                + "\"payment_type\":\"bank_transfer\",\"user_data\":{\"type\":\"charge\",\"cardhold"
                + "er_email_address\":\"test_bank_transfer@test.com\",\"brand\":\"aozora_bank\",\"g"
                + "ateway\":\"aozora_bank\",\"service_provider\":\"bank_transfer\",\"refunds\":[]},"
                + "\"bank_transfer_payment_status\":\"unpaid\",\"bank_transfer_latest_deposit_date"
                + "\":null,\"mcp_token_id\":null,\"charge_type\":\"normal\"}],\"has_more\":false,"
                + "\"total_hits\":1}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
