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
import com.univapay.api.models.SubscriptionStatus;
import com.univapay.api.models.SubscriptionSuspendRequest;
import com.univapay.api.models.SubscriptionUpdateRequest;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubscriptionsApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static SubscriptionsApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getSubscriptionsApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Creates a new subscription.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateSubscription() throws Exception {
        // Parameters for the API call
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";
        SubscriptionCreateRequest body = ApiHelper.deserialize(
                "{\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1000"
                + ",\"currency\":\"JPY\",\"period\":\"monthly\"}",
                SubscriptionCreateRequest.class);

        // Set callback and perform API call
        Subscription result = null;
        try {
            result = controller.createSubscription(idempotencyKey, body).getResult();
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
                "{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"initial_"
                + "amount\":1000,\"initial_amount_formatted\":10.0,\"subsequent_cycles_start\":null"
                + ",\"only_direct_currency\":false,\"first_charge_authorization_only\":false,\"stat"
                + "us\":\"current\",\"metadata\":{\"order_id\":\"ORD-987\"},\"mode\":\"live\",\"cre"
                + "ated_on\":\"2024-06-26T01:51:28.627023Z\",\"period\":\"monthly\",\"next_payment"
                + "\":{\"id\":\"11ef3360-1f9a-c54a-8313-7f9847da313b\",\"due_date\":\"2024-07-26\","
                + "\"zone_id\":\"Asia/Tokyo\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatt"
                + "ed\":12.5,\"is_paid\":false}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists all subscriptions across all stores.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAllSubscriptions() throws Exception {
        // Parameters for the API call
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        SubscriptionList result = null;
        try {
            result = controller.listAllSubscriptions(limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"id\":\"11ef3410-aaaa-4bcd-8e1f-1a2b3c4d5e60\",\"store_id\":\"11edf5"
                + "41-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef3413-dddd-4ef0-b"
                + "142-4d5e6f809193\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12."
                + "5,\"status\":\"current\",\"merchant_name\":\"管理画面ガイド\",\"store_name\":\"管理画面ガイド_"
                + "TEST店舗\",\"payment_type\":\"card\",\"next_payment_date\":\"2024-07-26\",\"user_d"
                + "ata\":{\"type\":\"charge\",\"cardholder_name\":\"taro yamada\",\"email\":\"taro@"
                + "test.com\",\"brand\":\"visa\"}},{\"id\":\"11ef3411-bbbb-4cde-9f20-2b3c4d5e6f71"
                + "\",\"store_id\":\"22af6520-d53e-764d-9d4e-ef01b66fa6d1\",\"transaction_token_id"
                + "\":\"11ef3414-eeee-4f01-c253-5e6f80919204\",\"amount\":3000,\"currency\":\"JPY"
                + "\",\"amount_formatted\":3000,\"status\":\"current\",\"merchant_name\":\"管理画面ガイド"
                + "\",\"store_name\":\"管理画面ガイド_Online店舗\",\"payment_type\":\"card\",\"next_payment_"
                + "date\":\"2024-08-10\",\"user_data\":{\"type\":\"charge\",\"cardholder_name\":\"h"
                + "anako suzuki\",\"email\":\"hanako@test.com\",\"brand\":\"mastercard\"}},{\"id\":"
                + "\"11ef3412-cccc-4def-a031-3c4d5e6f8082\",\"store_id\":\"33af7631-e64f-875e-ae5f-"
                + "f012c77fb7e2\",\"transaction_token_id\":\"11ef3415-ffff-4012-d364-6f8091920315"
                + "\",\"amount\":9800,\"currency\":\"JPY\",\"amount_formatted\":9800,\"status\":\"s"
                + "uspended\",\"merchant_name\":\"管理画面ガイド\",\"store_name\":\"管理画面ガイド_Osaka店舗\",\"pa"
                + "yment_type\":\"card\",\"next_payment_date\":\"2024-09-15\",\"user_data\":{\"type"
                + "\":\"charge\",\"cardholder_name\":\"jiro tanaka\",\"email\":\"jiro@test.com\","
                + "\"brand\":\"jcb\"}}],\"has_more\":false,\"total_hits\":3}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists all subscriptions for a specific store.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListStoreSubscriptions() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        String search = 
                "order_id:12345";
        SubscriptionStatus status = SubscriptionStatus.fromString(
                "current");
        ChargeMode mode = ChargeMode.fromString(
                "live");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        SubscriptionList result = null;
        try {
            result = controller.listStoreSubscriptions(storeId, search, status, mode, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf5"
                + "41-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-8"
                + "03f-1bc27702eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12."
                + "5,\"status\":\"current\",\"merchant_name\":\"管理画面ガイド\",\"store_name\":\"管理画面ガイド_"
                + "TEST店舗\",\"payment_type\":\"card\",\"next_payment_date\":\"2024-07-26\",\"user_d"
                + "ata\":{\"type\":\"charge\",\"cardholder_name\":\"taro yamada\",\"email\":\"test@"
                + "test.com\",\"brand\":\"visa\"}},{\"id\":\"11ef3401-1a2b-4c3d-8e4f-5a6b7c8d9e0f"
                + "\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id"
                + "\":\"11ef3402-2b3c-4d5e-9f60-6b7c8d9e0f11\",\"amount\":5000,\"currency\":\"JPY"
                + "\",\"amount_formatted\":5000,\"status\":\"current\",\"merchant_name\":\"管理画面ガイド"
                + "\",\"store_name\":\"管理画面ガイド_TEST店舗\",\"payment_type\":\"card\",\"next_payment_da"
                + "te\":\"2024-08-01\",\"user_data\":{\"type\":\"charge\",\"cardholder_name\":\"han"
                + "ako suzuki\",\"email\":\"hanako@test.com\",\"brand\":\"mastercard\"}},{\"id\":"
                + "\"11ef3403-3c4d-5e6f-a071-7c8d9e0f1122\",\"store_id\":\"11edf541-c42d-653c-8c3d-"
                + "dfe0a55f95c0\",\"transaction_token_id\":\"11ef3404-4d5e-6f70-b182-8d9e0f112233"
                + "\",\"amount\":9800,\"currency\":\"JPY\",\"amount_formatted\":9800,\"status\":\"s"
                + "uspended\",\"merchant_name\":\"管理画面ガイド\",\"store_name\":\"管理画面ガイド_TEST店舗\",\"pay"
                + "ment_type\":\"card\",\"next_payment_date\":\"2024-09-15\",\"user_data\":{\"type"
                + "\":\"charge\",\"cardholder_name\":\"jiro tanaka\",\"email\":\"jiro@test.com\","
                + "\"brand\":\"jcb\"}}],\"has_more\":false,\"total_hits\":3}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the details of an existing subscription. Supports internal polling to wait for
     * status changes.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetSubscription() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "11ef335e-9aa5-c54a-8313-7f9847da313a");
        Boolean polling = true;

        // Set callback and perform API call
        Subscription result = null;
        try {
            result = controller.getSubscription(storeId, id, polling).getResult();
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
                "{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"initial_"
                + "amount\":null,\"initial_amount_formatted\":null,\"subsequent_cycles_start\":null"
                + ",\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\","
                + "\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":"
                + "\"immediate\"},\"only_direct_currency\":false,\"first_charge_capture_after\":nul"
                + "l,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metadata\":"
                + "{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28."
                + "627023Z\",\"period\":\"monthly\",\"next_payment\":{\"id\":\"11ef335e-9ae2-8322-8"
                + "e79-e7ba4b56234e\",\"due_date\":\"2024-07-26\",\"zone_id\":\"Asia/Tokyo\",\"amou"
                + "nt\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"is_paid\":false,\"is_"
                + "last_payment\":false,\"created_on\":\"2024-06-26T01:51:29.025129Z\",\"updated_on"
                + "\":\"2024-06-26T01:51:29.025129Z\",\"retry_date\":null}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Updates the configuration, payment method, or schedule of a specific subscription.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateSubscription() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";
        SubscriptionUpdateRequest body = ApiHelper.deserialize(
                "{\"metadata\":{\"order_id\":\"12345\"},\"schedule_settings\":{\"termination_mode"
                + "\":\"on_next_payment\"}}",
                SubscriptionUpdateRequest.class);

        // Set callback and perform API call
        Subscription result = null;
        try {
            result = controller.updateSubscription(storeId, id, idempotencyKey, body).getResult();
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
                "{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef3362-3700-c54a-9baa-6f7e6527"
                + "c9d9\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"initial_"
                + "amount\":null,\"initial_amount_formatted\":null,\"subsequent_cycles_start\":null"
                + ",\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\","
                + "\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":"
                + "\"on_next_payment\"},\"only_direct_currency\":false,\"first_charge_capture_after"
                + "\":null,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metad"
                + "ata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:"
                + "51:28.627023Z\",\"period\":\"monthly\",\"next_payment\":{\"id\":\"11ef335e-9ae2-"
                + "8322-8e79-e7ba4b56234e\",\"due_date\":\"2030-01-01\",\"zone_id\":\"Asia/Tokyo\","
                + "\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"is_paid\":false"
                + ",\"is_last_payment\":false,\"created_on\":\"2024-06-26T01:51:29.025129Z\",\"upda"
                + "ted_on\":\"2024-06-26T01:51:29.025129Z\",\"retry_date\":null}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Cancels an existing subscription. The subscription status will be permanently changed to
     * `canceled` and it cannot be resumed. Please proceed with caution.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCancelSubscription() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        try {
            controller.cancelSubscription(storeId, id).getResult();
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
     * Retrieves a list of all historical and scheduled payments for a specific subscription.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListSubscriptionPayments() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "25d0fb2c-18ef-11e7-9dd3-db8fb7b820e7");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        SubscriptionPaymentList result = null;
        try {
            result = controller.listSubscriptionPayments(storeId, subscriptionId, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"id\":\"11e89a0a-8cee-d660-b984-3fcaaed46e7c\",\"due_date\":\"2018-0"
                + "8-21\",\"zone_id\":\"Asia/Tokyo\",\"amount\":10000,\"currency\":\"JPY\",\"amount"
                + "_formatted\":10000,\"is_paid\":false,\"is_last_payment\":false,\"created_on\":"
                + "\"2018-08-07T06:24:33.961256Z\",\"updated_on\":\"2018-08-07T06:24:33.961256Z\"},"
                + "{\"id\":\"11e89a0a-8cc5-2662-9460-2b14b1a601ba\",\"due_date\":\"2018-08-07\",\"z"
                + "one_id\":\"Asia/Tokyo\",\"amount\":1000,\"currency\":\"JPY\",\"amount_formatted"
                + "\":1000,\"is_paid\":true,\"is_last_payment\":false,\"created_on\":\"2018-08-07T0"
                + "6:24:33.646223Z\",\"updated_on\":\"2018-08-07T06:24:33.887760Z\"}],\"has_more\":"
                + "false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the details of an individual payment associated with a specific subscription.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetSubscriptionPayment() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "25d0fb2c-18ef-11e7-9dd3-db8fb7b820e7");
        UUID paymentId = UUID.fromString(
                "11e89a0a-8cee-d660-b984-3fcaaed46e7c");

        // Set callback and perform API call
        SubscriptionPayment result = null;
        try {
            result = controller.getSubscriptionPayment(storeId, subscriptionId, paymentId).getResult();
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
                "{\"id\":\"11e89a0a-8cee-d660-b984-3fcaaed46e7c\",\"due_date\":\"2018-08-21\",\"zon"
                + "e_id\":\"Asia/Tokyo\",\"amount\":10000,\"currency\":\"JPY\",\"amount_formatted"
                + "\":10000,\"is_paid\":false,\"is_last_payment\":false,\"created_on\":\"2018-08-07"
                + "T06:24:33.961256Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Updates properties of a specific scheduled payment for a subscription. Can be used to change
     * the due date when permitted, mark the payment as paid, schedule a termination status, or set
     * a retry interval.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateSubscriptionPayment() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "25d0fb2c-18ef-11e7-9dd3-db8fb7b820e7");
        UUID paymentId = UUID.fromString(
                "11e89a0a-8cee-d660-b984-3fcaaed46e7c");
        SubscriptionPatchPaymentRequest body = ApiHelper.deserialize(
                "{\"due_date\":\"2026-09-01\",\"is_paid\":false}",
                SubscriptionPatchPaymentRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        SubscriptionPayment result = null;
        try {
            result = controller.updateSubscriptionPayment(storeId, subscriptionId, paymentId, body, idempotencyKey).getResult();
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
                "{\"id\":\"11e89a0a-8cee-d660-b984-3fcaaed46e7c\",\"due_date\":\"2026-09-01\",\"zon"
                + "e_id\":\"Asia/Tokyo\",\"amount\":10000,\"currency\":\"JPY\",\"amount_formatted"
                + "\":10000,\"is_paid\":false,\"is_last_payment\":false,\"created_on\":\"2018-08-07"
                + "T06:24:33.961256Z\",\"updated_on\":\"2026-04-22T06:00:00.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the most recent charge created for a specific subscription. Returns 404 if no
     * charges have been attempted yet.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetSubscriptionLatestCharge() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "25d0fb2c-18ef-11e7-9dd3-db8fb7b820e7");

        // Set callback and perform API call
        Charge result = null;
        try {
            result = controller.getSubscriptionLatestCharge(storeId, subscriptionId).getResult();
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
                "{\"id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":\"11ef335e-9"
                + "aa5-c54a-8313-7f9847da313a\",\"requested_amount\":1250,\"requested_currency\":"
                + "\"USD\",\"requested_amount_formatted\":12.5,\"charged_amount\":1250,\"charged_cu"
                + "rrency\":\"USD\",\"charged_amount_formatted\":12.5,\"only_direct_currency\":fals"
                + "e,\"status\":\"successful\",\"error\":null,\"mode\":\"test\",\"created_on\":\"20"
                + "24-06-26T01:51:30.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves a paginated list of charges linked to a subscription. Backend search uses the same
     * charge search surface as normal charge listing and adds a subscription filter for the
     * requested subscription.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListSubscriptionCharges() throws Exception {
        // Parameters for the API call
        UUID merchantId = UUID.fromString(
                "01234567-89ab-cdef-0123-456789abcdef");
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "25d0fb2c-18ef-11e7-9dd3-db8fb7b820e7");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        ChargeList result = null;
        try {
            result = controller.listSubscriptionCharges(merchantId, storeId, subscriptionId, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"store_id\":\"11edf5"
                + "41-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-8"
                + "03f-1bc27702eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":"
                + "\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"requested_amount\":1250,\"requested_c"
                + "urrency\":\"USD\",\"requested_amount_formatted\":12.5,\"charged_amount\":1250,"
                + "\"charged_currency\":\"USD\",\"charged_amount_formatted\":12.5,\"only_direct_cur"
                + "rency\":false,\"status\":\"successful\",\"error\":{},\"mode\":\"test\",\"created"
                + "_on\":\"2024-06-26T01:51:30.000000Z\"}],\"has_more\":false,\"total_hits\":1}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves a paginated list of all charge attempts made for a specific scheduled payment of a
     * subscription. Useful for inspecting retry history.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListChargesForSubscriptionPayment() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "25d0fb2c-18ef-11e7-9dd3-db8fb7b820e7");
        UUID paymentId = UUID.fromString(
                "11e89a0a-8cee-d660-b984-3fcaaed46e7c");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        ChargeList result = null;
        try {
            result = controller.listChargesForSubscriptionPayment(storeId, subscriptionId, paymentId, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"store_id\":\"11edf5"
                + "41-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-8"
                + "03f-1bc27702eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":"
                + "\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"requested_amount\":1250,\"requested_c"
                + "urrency\":\"USD\",\"requested_amount_formatted\":12.5,\"charged_amount\":1250,"
                + "\"charged_currency\":\"USD\",\"charged_amount_formatted\":12.5,\"only_direct_cur"
                + "rency\":false,\"status\":\"successful\",\"error\":{},\"mode\":\"test\",\"created"
                + "_on\":\"2024-06-26T01:51:30.000000Z\"}],\"has_more\":false,\"total_hits\":1}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Suspends a subscription that is currently `current` or `unpaid`. The `termination_mode`
     * controls when the suspension takes effect: `immediate` (default) suspends right away,
     * `on_next_payment` waits until the next scheduled payment date before suspending.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestSuspendSubscription() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "11ef335e-9aa5-c54a-8313-7f9847da313a");
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";
        SubscriptionSuspendRequest body = ApiHelper.deserialize(
                "{\"schedule_settings\":{\"termination_mode\":\"on_next_payment\"}}",
                SubscriptionSuspendRequest.class);

        // Set callback and perform API call
        Subscription result = null;
        try {
            result = controller.suspendSubscription(storeId, subscriptionId, idempotencyKey, body).getResult();
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
                "{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"status"
                + "\":\"suspended\",\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z"
                + "\",\"period\":\"monthly\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Resumes a subscription that is currently `suspended`, setting its status back to `unpaid` and
     * rescheduling the next payment. No request body is required.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUnsuspendSubscription() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "11ef335e-9aa5-c54a-8313-7f9847da313a");
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Subscription result = null;
        try {
            result = controller.unsuspendSubscription(storeId, subscriptionId, idempotencyKey).getResult();
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
                "{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"status"
                + "\":\"unpaid\",\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\","
                + "\"period\":\"monthly\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Replaces the payment method (transaction token) used for a subscription. Useful when a card
     * expires or a customer wants to switch payment methods. The new token must belong to the same
     * store, be active, and match the subscription's processing mode (live/test). One-time tokens
     * are not accepted; use a recurring or subscription token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateSubscriptionToken() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID subscriptionId = UUID.fromString(
                "11ef335e-9aa5-c54a-8313-7f9847da313a");
        SubscriptionPatchTokenRequest body = ApiHelper.deserialize(
                "{\"transaction_token_id\":\"11ef3362-3700-c54a-9baa-6f7e6527c9d9\"}",
                SubscriptionPatchTokenRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Subscription result = null;
        try {
            result = controller.updateSubscriptionToken(storeId, subscriptionId, body, idempotencyKey).getResult();
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
                "{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef3362-3700-c54a-9baa-6f7e6527"
                + "c9d9\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"status"
                + "\":\"current\",\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\","
                + "\"period\":\"monthly\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
