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
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DirectDebitApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static DirectDebitApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getDirectDebitApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieves the merchant's direct debit configuration — whether direct debit is enabled and
     * which monthly debit cycle applies.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetDirectDebitConfiguration() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");

        // Set callback and perform API call
        DirectDebitMerchantConfiguration result = null;
        try {
            result = controller.getDirectDebitConfiguration(merchantId).getResult();
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
                "{\"legacy_id\":\"1283794\",\"enabled\":true,\"debit_date\":\"fourteen\",\"consigno"
                + "r_code\":\"135456\",\"classifier\":\"99\",\"signature\":\"モモサン\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves which direct debit email notifications the merchant has opted into.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetDirectDebitNotificationConfiguration() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");

        // Set callback and perform API call
        DirectDebitNotificationConfiguration result = null;
        try {
            result = controller.getDirectDebitNotificationConfiguration(merchantId).getResult();
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
                "{\"notify_deadline_mailing\":true,\"notify_deadline_debit\":true,\"notify_debit_up"
                + "date\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the key dates for the debit cycle currently in progress, based on the merchant's
     * configured cycle. Compare `merchant_bank_transfer_upload_deadline` against today to decide
     * whether transfers can still be registered or edited this month.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetDirectDebitCurrentSchedule() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");

        // Set callback and perform API call
        DirectDebitSchedule result = null;
        try {
            result = controller.getDirectDebitCurrentSchedule(merchantId).getResult();
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
                "{\"merchant_bank_account_transfer_date\":\"2026-03-14\",\"merchant_bank_account_re"
                + "gistration_deadline\":\"2026-02-20\",\"merchant_bank_transfer_upload_deadline\":"
                + "\"2026-03-04\",\"platform_result_registration_date\":\"2026-03-24\",\"platform_s"
                + "cheduled_payout\":\"2026-03-31\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists the consumer bank accounts registered for direct debit under this merchant.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListDirectDebitBankAccounts() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        Integer limit = 10;
        String cursor = 
                "1098116";
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");
        String userNumber = 
                "SD02688328";
        String bankAccountId = 
                "1098116";
        String bankCode = 
                "0012";
        String bankName = 
                "ﾗｸﾃﾝｷﾞﾝｺｳ";
        String branchCode = 
                "120";
        DirectDebitBankAccountType bankAccountType = DirectDebitBankAccountType.fromString(
                "regular");
        String bankAccountNumber = 
                "1234567";
        String bankAccountName = 
                "ﾀﾅｶﾕﾐｺ";
        DirectDebitRegistrationOrigin registrationOrigin = DirectDebitRegistrationOrigin.fromString(
                "merchant_console");
        DirectDebitBankAccountStatus bankAccountStatus = DirectDebitBankAccountStatus.fromString(
                "active");
        String from = 
                "2026-04-01T00:00:00.000Z";
        String to = 
                "2026-04-30T23:59:59.999Z";

        // Set callback and perform API call
        DirectDebitBankAccountList result = null;
        try {
            result = controller.listDirectDebitBankAccounts(merchantId, limit, cursor, cursorDirection, userNumber, bankAccountId, bankCode, bankName, branchCode, bankAccountType, bankAccountNumber, bankAccountName, registrationOrigin, bankAccountStatus, from, to).getResult();
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
                "{\"items\":[{\"id\":\"1098116\",\"legacy_store_id\":\"1283794\",\"merchant_id\":"
                + "\"01234567-89ab-cdef-0123-456789abcdef\",\"user_number\":\"SD02688328\",\"bank_c"
                + "ode\":\"0012\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"120\",\"bank_accoun"
                + "t_type\":\"regular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_account_number\":"
                + "\"1234567\",\"registration_origin\":\"merchant_console\",\"status\":\"active\","
                + "\"created_on\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026-04-09T07:35:50"
                + ".000Z\"},{\"id\":\"1098117\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"0"
                + "1234567-89ab-cdef-0123-456789abcdef\",\"user_number\":\"SD02688329\",\"bank_code"
                + "\":\"0009\",\"bank_name\":\"ﾐﾂｲｽﾐﾄﾓ\",\"branch_code\":\"221\",\"bank_account_typ"
                + "e\":\"current\",\"bank_account_name\":\"ｽｽﾞｷﾀﾛｳ\",\"bank_account_number\":\"7654"
                + "321\",\"registration_origin\":\"anywhere\",\"status\":\"inactive\",\"created_on"
                + "\":\"2026-04-10T09:12:04.000Z\",\"updated_on\":\"2026-04-12T11:03:41.000Z\"}],"
                + "\"has_more\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Registers a consumer bank account for direct debit. The account is created and then verified
     * against the bank, so it starts out unusable — poll its `status` until it becomes `active` (or
     * `registration_failed`) before scheduling transfers against it.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateDirectDebitBankAccount() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        DirectDebitBankAccountCreateRequest body = ApiHelper.deserialize(
                "{\"user_number\":\"SD02688328\",\"bank_code\":\"0012\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ"
                + "\",\"branch_code\":\"120\",\"bank_account_type\":\"regular\",\"bank_account_name"
                + "\":\"ﾀﾅｶﾕﾐｺ\",\"bank_account_number\":\"1234567\"}",
                DirectDebitBankAccountCreateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        DirectDebitBankAccount result = null;
        try {
            result = controller.createDirectDebitBankAccount(merchantId, body, idempotencyKey).getResult();
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
                "{\"id\":\"1098116\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"user_number\":\"SD02688328\",\"bank_code\":\"0012"
                + "\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"120\",\"bank_account_type\":\"r"
                + "egular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_account_number\":\"1234567\","
                + "\"registration_origin\":\"merchant_console\",\"status\":\"active\",\"created_on"
                + "\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026-04-09T07:35:50.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves a single registered bank account, including its current verification status.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetDirectDebitBankAccount() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankAccountId = 
                "1098116";

        // Set callback and perform API call
        DirectDebitBankAccount result = null;
        try {
            result = controller.getDirectDebitBankAccount(merchantId, bankAccountId).getResult();
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
                "{\"id\":\"1098116\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"user_number\":\"SD02688328\",\"bank_code\":\"0012"
                + "\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"120\",\"bank_account_type\":\"r"
                + "egular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_account_number\":\"1234567\","
                + "\"registration_origin\":\"merchant_console\",\"status\":\"active\",\"created_on"
                + "\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026-04-09T07:35:50.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Updates a registered bank account. Changing bank details re-triggers verification with the
     * bank. Transfers already registered keep the details they were created with.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateDirectDebitBankAccount() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankAccountId = 
                "1098116";
        DirectDebitBankAccountUpdateRequest body = ApiHelper.deserialize(
                "{\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\"}",
                DirectDebitBankAccountUpdateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        DirectDebitBankAccount result = null;
        try {
            result = controller.updateDirectDebitBankAccount(merchantId, bankAccountId, body, idempotencyKey).getResult();
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
                "{\"id\":\"1098116\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"user_number\":\"SD02688328\",\"bank_code\":\"0012"
                + "\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"120\",\"bank_account_type\":\"r"
                + "egular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_account_number\":\"1234567\","
                + "\"registration_origin\":\"merchant_console\",\"status\":\"active\",\"created_on"
                + "\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026-04-09T07:35:50.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Deactivates a bank account so no further transfers can be registered against it. The record
     * is retained (status becomes `inactive`) rather than deleted, and can be re-enabled later.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeactivateDirectDebitBankAccount() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankAccountId = 
                "1098116";

        // Set callback and perform API call
        DirectDebitBankAccount result = null;
        try {
            result = controller.deactivateDirectDebitBankAccount(merchantId, bankAccountId).getResult();
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
                "{\"id\":\"1098116\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"user_number\":\"SD02688328\",\"bank_code\":\"0012"
                + "\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"120\",\"bank_account_type\":\"r"
                + "egular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_account_number\":\"1234567\","
                + "\"registration_origin\":\"merchant_console\",\"status\":\"inactive\",\"created_o"
                + "n\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026-04-14T02:11:07.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Returns a deactivated bank account to `active` so transfers can be registered against it
     * again. The account must currently be `inactive`.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestReenableDirectDebitBankAccount() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankAccountId = 
                "1098116";
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        DirectDebitBankAccount result = null;
        try {
            result = controller.reenableDirectDebitBankAccount(merchantId, bankAccountId, idempotencyKey).getResult();
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
                "{\"id\":\"1098116\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"user_number\":\"SD02688328\",\"bank_code\":\"0012"
                + "\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"120\",\"bank_account_type\":\"r"
                + "egular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_account_number\":\"1234567\","
                + "\"registration_origin\":\"merchant_console\",\"status\":\"active\",\"created_on"
                + "\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026-04-09T07:35:50.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Schedules a pull of funds from an active bank account. The transfer is queued for the
     * merchant's next debit cycle and stays editable until that cycle's upload deadline passes.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateDirectDebitBankTransfer() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankAccountId = 
                "1098116";
        DirectDebitBankTransferCreateRequest body = ApiHelper.deserialize(
                "{\"amount\":1000}",
                DirectDebitBankTransferCreateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        DirectDebitBankTransfer result = null;
        try {
            result = controller.createDirectDebitBankTransfer(merchantId, bankAccountId, body, idempotencyKey).getResult();
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
                "{\"id\":\"2594976\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"bank_account_id\":\"1098116\",\"user_number\":\"SD0"
                + "2688328\",\"bank_code\":\"0012\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"1"
                + "20\",\"bank_account_type\":\"regular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_a"
                + "ccount_number\":\"1234567\",\"amount\":1000,\"debit_date\":\"fourteen\",\"calcul"
                + "ated_debit_date\":\"2026-03-14\",\"lock\":\"unlocked\",\"status\":\"awaiting\","
                + "\"error\":null,\"created_on\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026"
                + "-04-09T07:35:50.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists the direct debit transfers registered under this merchant, across all bank accounts.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListDirectDebitBankTransfers() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        Integer limit = 10;
        String cursor = 
                "1098116";
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");
        String bankTransferId = 
                "2594976";
        String bankTransferStart = 
                "2026-01";
        String bankTransferEnd = 
                "2026-03";
        DirectDebitDebitDate debitDate = DirectDebitDebitDate.fromString(
                "fourteen");
        String userNumber = 
                "SD02688328";
        String bankAccountNumber = 
                "1234567";
        String bankAccountName = 
                "ﾀﾅｶﾕﾐｺ";
        DirectDebitBankTransferLock lockStatus = DirectDebitBankTransferLock.fromString(
                "unlocked");
        DirectDebitBankTransferStatus bankTransferStatus = DirectDebitBankTransferStatus.fromString(
                "awaiting");

        // Set callback and perform API call
        DirectDebitBankTransferList result = null;
        try {
            result = controller.listDirectDebitBankTransfers(merchantId, limit, cursor, cursorDirection, bankTransferId, bankTransferStart, bankTransferEnd, debitDate, userNumber, bankAccountNumber, bankAccountName, lockStatus, bankTransferStatus).getResult();
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
                "{\"items\":[{\"id\":\"2594976\",\"legacy_store_id\":\"1283794\",\"merchant_id\":"
                + "\"01234567-89ab-cdef-0123-456789abcdef\",\"bank_account_id\":\"1098116\",\"user_"
                + "number\":\"SD02688328\",\"bank_code\":\"0012\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"bra"
                + "nch_code\":\"120\",\"bank_account_type\":\"regular\",\"bank_account_name\":\"ﾀﾅｶ"
                + "ﾕﾐｺ\",\"bank_account_number\":\"1234567\",\"amount\":1000,\"debit_date\":\"fourt"
                + "een\",\"calculated_debit_date\":\"2026-03-14\",\"lock\":\"unlocked\",\"status\":"
                + "\"awaiting\",\"error\":null,\"created_on\":\"2026-04-09T07:35:50.000Z\",\"update"
                + "d_on\":\"2026-04-09T07:35:50.000Z\"},{\"id\":\"2594977\",\"legacy_store_id\":\"1"
                + "283794\",\"merchant_id\":\"01234567-89ab-cdef-0123-456789abcdef\",\"bank_account"
                + "_id\":\"1098117\",\"user_number\":\"SD02688329\",\"bank_code\":\"0009\",\"bank_n"
                + "ame\":\"ﾐﾂｲｽﾐﾄﾓ\",\"branch_code\":\"221\",\"bank_account_type\":\"current\",\"ba"
                + "nk_account_name\":\"ｽｽﾞｷﾀﾛｳ\",\"bank_account_number\":\"7654321\",\"amount\":185"
                + "0,\"debit_date\":\"twenty_seven\",\"calculated_debit_date\":\"2026-03-27\",\"loc"
                + "k\":\"locked\",\"status\":\"failed\",\"error\":\"insufficient_funds\",\"created_"
                + "on\":\"2026-04-10T09:12:04.000Z\",\"updated_on\":\"2026-04-12T11:03:41.000Z\"}],"
                + "\"has_more\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves a single transfer. Poll this after the cycle's result registration date to pick up
     * the outcome and, on failure, the bank's reason.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetDirectDebitBankTransfer() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankTransferId = 
                "2594976";

        // Set callback and perform API call
        DirectDebitBankTransfer result = null;
        try {
            result = controller.getDirectDebitBankTransfer(merchantId, bankTransferId).getResult();
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
                "{\"id\":\"2594976\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"bank_account_id\":\"1098116\",\"user_number\":\"SD0"
                + "2688328\",\"bank_code\":\"0012\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"1"
                + "20\",\"bank_account_type\":\"regular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_a"
                + "ccount_number\":\"1234567\",\"amount\":1000,\"debit_date\":\"fourteen\",\"calcul"
                + "ated_debit_date\":\"2026-03-14\",\"lock\":\"unlocked\",\"status\":\"awaiting\","
                + "\"error\":null,\"created_on\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026"
                + "-04-09T07:35:50.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Changes a scheduled transfer's amount. Only permitted while the transfer is `unlocked` — once
     * its cycle's upload deadline passes the amount is fixed.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateDirectDebitBankTransfer() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankTransferId = 
                "2594976";
        DirectDebitBankTransferPatchRequest body = ApiHelper.deserialize(
                "{\"amount\":1850}",
                DirectDebitBankTransferPatchRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        DirectDebitBankTransfer result = null;
        try {
            result = controller.updateDirectDebitBankTransfer(merchantId, bankTransferId, body, idempotencyKey).getResult();
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
                "{\"id\":\"2594976\",\"legacy_store_id\":\"1283794\",\"merchant_id\":\"01234567-89a"
                + "b-cdef-0123-456789abcdef\",\"bank_account_id\":\"1098116\",\"user_number\":\"SD0"
                + "2688328\",\"bank_code\":\"0012\",\"bank_name\":\"ﾗｸﾃﾝｷﾞﾝｺｳ\",\"branch_code\":\"1"
                + "20\",\"bank_account_type\":\"regular\",\"bank_account_name\":\"ﾀﾅｶﾕﾐｺ\",\"bank_a"
                + "ccount_number\":\"1234567\",\"amount\":1000,\"debit_date\":\"fourteen\",\"calcul"
                + "ated_debit_date\":\"2026-03-14\",\"lock\":\"unlocked\",\"status\":\"awaiting\","
                + "\"error\":null,\"created_on\":\"2026-04-09T07:35:50.000Z\",\"updated_on\":\"2026"
                + "-04-09T07:35:50.000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Cancels a scheduled transfer so it is not sent to the bank. Only permitted while the transfer
     * is `unlocked`.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteDirectDebitBankTransfer() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        String bankTransferId = 
                "2594976";

        // Set callback and perform API call
        try {
            controller.deleteDirectDebitBankTransfer(merchantId, bankTransferId).getResult();
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

}
