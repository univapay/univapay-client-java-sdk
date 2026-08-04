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
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChargesApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ChargesApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getChargesApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Creates a charge on a payment instrument (e.g. transaction token).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCharge() throws Exception {
        // Parameters for the API call
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";
        ChargeCreateRequest body = ApiHelper.deserialize(
                "{\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1000"
                + ",\"currency\":\"JPY\",\"metadata\":{\"order_id\":\"12345\"},\"redirect\":{\"endp"
                + "oint\":\"https://test.url/\"}}",
                ChargeCreateRequest.class);

        // Set callback and perform API call
        Charge result = null;
        try {
            result = controller.createCharge(idempotencyKey, body).getResult();
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
                "{\"id\":\"11ef32c2-4010-a312-aaff-4b63e4d5f92d\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":null,\"merch"
                + "ant_transaction_id\":null,\"requested_amount\":1000,\"requested_currency\":\"JPY"
                + "\",\"requested_amount_formatted\":1000,\"charged_amount\":null,\"charged_currenc"
                + "y\":null,\"charged_amount_formatted\":null,\"fee_amount\":null,\"fee_currency\":"
                + "null,\"fee_amount_formatted\":null,\"only_direct_currency\":false,\"capture_at"
                + "\":null,\"descriptor\":null,\"descriptor_phone_number\":null,\"status\":\"pendin"
                + "g\",\"error\":null,\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"cre"
                + "ated_on\":\"2024-06-25T07:12:15.16452Z\",\"redirect\":{\"endpoint\":\"https://te"
                + "st.url/\",\"redirect_id\":\"11ef32c2-40cf-f772-8325-1798abb1110d\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists all charges across all stores for the authenticated user.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAllCharges() throws Exception {
        // Parameters for the API call
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");
        String lastFour = 
                "4242";
        String name = 
                "TARO YAMADA";
        Integer expMonth = 12;
        Integer expYear = 2026;
        String from = 
                "2026-04-01T00:00:00Z";
        String to = 
                "2026-04-30T23:59:59.999000Z";
        String email = 
                "user@example.com";
        String phone = 
                "+8108012341234";
        Integer amountFrom = 1000;
        Integer amountTo = 5000;
        String currency = 
                "JPY";
        ModeQuery mode = ModeQuery.fromString(
                "live");
        String metadata = 
                "order_id: 12345";
        UUID transactionTokenId = UUID.fromString(
                "f33b673e-564c-4645-ae17-ca03846a86b7");

        // Set callback and perform API call
        ChargeList result = null;
        try {
            result = controller.listAllCharges(limit, cursor, cursorDirection, lastFour, name, expMonth, expYear, from, to, email, phone, amountFrom, amountTo, currency, mode, metadata, transactionTokenId).getResult();
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
                "{\"items\":[{\"id\":\"11ef3500-1a2b-4c3d-8e4f-a1b2c3d4e5f0\",\"store_id\":\"11edf5"
                + "41-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef3501-2b3c-4d5e-9"
                + "f60-b2c3d4e5f011\",\"transaction_token_type\":\"one_time\",\"subscription_id\":n"
                + "ull,\"merchant_transaction_id\":null,\"requested_amount\":1000,\"requested_curre"
                + "ncy\":\"JPY\",\"requested_amount_formatted\":1000,\"charged_amount\":1000,\"char"
                + "ged_currency\":\"JPY\",\"charged_amount_formatted\":1000,\"fee_amount\":null,\"f"
                + "ee_currency\":null,\"fee_amount_formatted\":null,\"only_direct_currency\":false,"
                + "\"capture_at\":null,\"descriptor\":null,\"descriptor_phone_number\":null,\"statu"
                + "s\":\"successful\",\"error\":{},\"metadata\":{\"order_id\":\"ORD-2001\"},\"mode"
                + "\":\"live\",\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"redirect\":{},\"mer"
                + "chant_name\":\"管理画面ガイド\",\"store_name\":\"管理画面ガイド_TEST店舗\"},{\"id\":\"11ef3502-3"
                + "c4d-5e6f-a071-c3d4e5f01122\",\"store_id\":\"22af6520-d53e-764d-9d4e-ef01b66fa6d1"
                + "\",\"transaction_token_id\":\"11ef3503-4d5e-6f70-b182-d4e5f0112233\",\"transacti"
                + "on_token_type\":\"recurring\",\"subscription_id\":null,\"merchant_transaction_id"
                + "\":null,\"requested_amount\":1250,\"requested_currency\":\"USD\",\"requested_amo"
                + "unt_formatted\":12.5,\"charged_amount\":1250,\"charged_currency\":\"USD\",\"char"
                + "ged_amount_formatted\":12.5,\"fee_amount\":null,\"fee_currency\":null,\"fee_amou"
                + "nt_formatted\":null,\"only_direct_currency\":false,\"capture_at\":null,\"descrip"
                + "tor\":null,\"descriptor_phone_number\":null,\"status\":\"successful\",\"error\":"
                + "{},\"metadata\":{\"order_id\":\"ORD-2002\"},\"mode\":\"live\",\"created_on\":\"2"
                + "026-04-10T10:20:11.000000Z\",\"redirect\":{},\"merchant_name\":\"管理画面ガイド\",\"sto"
                + "re_name\":\"管理画面ガイド_Online店舗\"},{\"id\":\"11ef3504-5e6f-7081-c293-e5f001223344"
                + "\",\"store_id\":\"33af7631-e64f-875e-ae5f-f012c77fb7e2\",\"transaction_token_id"
                + "\":\"11ef3505-6f70-8192-d3a4-f00112233455\",\"transaction_token_type\":\"one_tim"
                + "e\",\"subscription_id\":null,\"merchant_transaction_id\":null,\"requested_amount"
                + "\":5000,\"requested_currency\":\"JPY\",\"requested_amount_formatted\":5000,\"cha"
                + "rged_amount\":5000,\"charged_currency\":\"JPY\",\"charged_amount_formatted\":500"
                + "0,\"fee_amount\":null,\"fee_currency\":null,\"fee_amount_formatted\":null,\"only"
                + "_direct_currency\":false,\"capture_at\":null,\"descriptor\":null,\"descriptor_ph"
                + "one_number\":null,\"status\":\"successful\",\"error\":{},\"metadata\":{\"order_i"
                + "d\":\"ORD-2003\"},\"mode\":\"live\",\"created_on\":\"2026-04-11T14:22:08.000000Z"
                + "\",\"redirect\":{},\"merchant_name\":\"管理画面ガイド\",\"store_name\":\"管理画面ガイド_Osaka店"
                + "舗\"}],\"has_more\":false,\"total_hits\":3}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Lists all charges for a specific store.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListStoreCharges() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");
        String lastFour = 
                "4242";
        String name = 
                "TARO YAMADA";
        Integer expMonth = 12;
        Integer expYear = 2026;
        String from = 
                "2026-04-01T00:00:00Z";
        String to = 
                "2026-04-30T23:59:59.999000Z";
        String email = 
                "user@example.com";
        String phone = 
                "+8108012341234";
        Integer amountFrom = 1000;
        Integer amountTo = 5000;
        String currency = 
                "JPY";
        ModeQuery mode = ModeQuery.fromString(
                "live");
        String metadata = 
                "order_id: 12345";
        UUID transactionTokenId = UUID.fromString(
                "f33b673e-564c-4645-ae17-ca03846a86b7");

        // Set callback and perform API call
        ChargeList result = null;
        try {
            result = controller.listStoreCharges(storeId, limit, cursor, cursorDirection, lastFour, name, expMonth, expYear, from, to, email, phone, amountFrom, amountTo, currency, mode, metadata, transactionTokenId).getResult();
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
                "{\"items\":[{\"id\":\"11ef32c4-9ea8-169c-a6c8-bfc29867a226\",\"store_id\":\"11edf5"
                + "41-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32c4-9e89-0cac-b"
                + "d63-17b9a26af61b\",\"transaction_token_type\":\"one_time\",\"subscription_id\":n"
                + "ull,\"merchant_transaction_id\":null,\"requested_amount\":1000,\"requested_curre"
                + "ncy\":\"JPY\",\"requested_amount_formatted\":1000,\"charged_amount\":1000,\"char"
                + "ged_currency\":\"JPY\",\"charged_amount_formatted\":1000,\"fee_amount\":null,\"f"
                + "ee_currency\":null,\"fee_amount_formatted\":null,\"only_direct_currency\":false,"
                + "\"capture_at\":null,\"descriptor\":null,\"descriptor_phone_number\":null,\"statu"
                + "s\":\"successful\",\"error\":{},\"metadata\":{\"univapay-name\":\"taro yamada\","
                + "\"univapay-phone-number\":\"8029854583\"},\"mode\":\"test\",\"created_on\":\"202"
                + "4-06-25T07:29:12.854865Z\",\"redirect\":{},\"merchant_name\":\"管理画面ガイド\",\"store"
                + "_name\":\"管理画面ガイド_TEST店舗\"},{\"id\":\"11ef32c3-3cfe-3bc0-abed-0bb96f792078\",\"s"
                + "tore_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11"
                + "ef32c3-3cdd-df92-9dce-c346b9fdf088\",\"transaction_token_type\":\"one_time\",\"s"
                + "ubscription_id\":null,\"merchant_transaction_id\":null,\"requested_amount\":1000"
                + ",\"requested_currency\":\"JPY\",\"requested_amount_formatted\":1000,\"charged_am"
                + "ount\":1000,\"charged_currency\":\"JPY\",\"charged_amount_formatted\":1000,\"fee"
                + "_amount\":null,\"fee_currency\":null,\"fee_amount_formatted\":null,\"only_direct"
                + "_currency\":false,\"capture_at\":null,\"descriptor\":null,\"descriptor_phone_num"
                + "ber\":null,\"status\":\"successful\",\"error\":{},\"metadata\":{\"order_id\":\"1"
                + "2345\"},\"mode\":\"test\",\"created_on\":\"2024-06-25T07:19:19.507637Z\",\"redir"
                + "ect\":{},\"merchant_name\":\"管理画面ガイド\",\"store_name\":\"管理画面ガイド_TEST店舗\"}],\"has"
                + "_more\":false,\"total_hits\":2}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the details of an existing charge.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetCharge() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        Boolean polling = true;

        // Set callback and perform API call
        Charge result = null;
        try {
            result = controller.getCharge(storeId, id, polling).getResult();
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
                "{\"id\":\"11ef32c2-4010-a312-aaff-4b63e4d5f92d\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":null,\"merch"
                + "ant_transaction_id\":null,\"requested_amount\":1000,\"requested_currency\":\"JPY"
                + "\",\"requested_amount_formatted\":1000,\"charged_amount\":1000,\"charged_currenc"
                + "y\":\"JPY\",\"charged_amount_formatted\":1000,\"fee_amount\":null,\"fee_currency"
                + "\":null,\"fee_amount_formatted\":null,\"only_direct_currency\":false,\"capture_a"
                + "t\":null,\"descriptor\":null,\"descriptor_phone_number\":null,\"status\":\"succe"
                + "ssful\",\"error\":null,\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\","
                + "\"created_on\":\"2024-06-25T07:12:15.16452Z\",\"redirect\":{\"endpoint\":\"https"
                + "://test.url/\",\"redirect_id\":\"11ef32c2-40cf-f772-8325-1798abb1110d\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Use this request to add or modify arbitrary metadata on an existing charge.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateCharge() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";
        ChargeUpdateRequest body = ApiHelper.deserialize(
                "{\"metadata\":{\"order_id\":\"1234\"}}",
                ChargeUpdateRequest.class);

        // Set callback and perform API call
        Charge result = null;
        try {
            result = controller.updateCharge(storeId, id, idempotencyKey, body).getResult();
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
                "{\"id\":\"11ef32c2-4010-a312-aaff-4b63e4d5f92d\",\"store_id\":\"11edf541-c42d-653c"
                + "-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702"
                + "eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":null,\"merch"
                + "ant_transaction_id\":null,\"requested_amount\":1000,\"requested_currency\":\"JPY"
                + "\",\"requested_amount_formatted\":1000,\"charged_amount\":1000,\"charged_currenc"
                + "y\":\"JPY\",\"charged_amount_formatted\":1000,\"fee_amount\":null,\"fee_currency"
                + "\":null,\"fee_amount_formatted\":null,\"only_direct_currency\":false,\"capture_a"
                + "t\":null,\"descriptor\":null,\"descriptor_phone_number\":null,\"status\":\"succe"
                + "ssful\",\"error\":null,\"metadata\":{\"order_id\":\"1234\"},\"mode\":\"test\","
                + "\"created_on\":\"2024-06-25T07:12:15.16452Z\",\"redirect\":{\"endpoint\":\"https"
                + "://test.url/\",\"redirect_id\":\"11ef32c2-40cf-f772-8325-1798abb1110d\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Captures a previously authorized charge (where `capture` was set to false during creation).
     * The capture amount must be less than or equal to the authorized amount, and the currency must
     * match.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCaptureCharge() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        ChargeCaptureRequest body = ApiHelper.deserialize(
                "{\"amount\":1000,\"currency\":\"JPY\"}",
                ChargeCaptureRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Object result = null;
        try {
            result = controller.captureCharge(storeId, id, body, idempotencyKey).getResult();
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
                "{}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the necessary payment execution URL (for online payments) or bank account details
     * (for bank transfers). **⚠️ Prerequisite:** The charge `status` must be `awaiting` before
     * requesting the issuer token. If requested while the charge is in any other status, an error
     * will be returned.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetChargeIssuerToken() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        IssuerToken result = null;
        try {
            result = controller.getChargeIssuerToken(storeId, id).getResult();
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
                + "ad\":{\"request_data\":\"example_value\"},\"payment_type\":\"online\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
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
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetChargeThreeDsIssuerToken() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        ThreeDsIssuerToken result = null;
        try {
            result = controller.getChargeThreeDsIssuerToken(storeId, id).getResult();
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

    /**
     * Retrieves bank transfer ledger entries associated with a charge. This is an optional
     * reconciliation endpoint — not part of the required create-charge-and-poll flow. **⚠️ Requires
     * a merchant-level application token**, unlike the rest of the bank transfer flow. A store
     * application token (`Bearer {secret}.{jwt}` scoped to a `store_id`) is not sufficient here,
     * even though the path is store-scoped.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListBankTransferLedgers() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        BankTransferLedgerList result = null;
        try {
            result = controller.listBankTransferLedgers(storeId, id).getResult();
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
                "{\"items\":[{\"bank_ledger_type\":\"payment\",\"amount\":1000,\"balance\":0,\"virt"
                + "ual_bank_account_holder_name\":\"test holder name\",\"virtual_bank_account_numbe"
                + "r\":\"1234567\",\"virtual_account_id\":\"test account id\",\"transaction_date\":"
                + "\"2024-06-25\",\"transaction_timestamp\":\"2024-06-25T07:29:16.367347Z\",\"mode"
                + "\":\"test\",\"created_on\":\"2024-06-25T07:29:16.373181Z\"},{\"bank_ledger_type"
                + "\":\"deposit\",\"amount\":1000,\"balance\":1000,\"virtual_bank_account_holder_na"
                + "me\":\"test holder name\",\"virtual_bank_account_number\":\"1234567\",\"virtual_"
                + "account_id\":\"test account id\",\"transaction_date\":\"2024-06-25\",\"transacti"
                + "on_timestamp\":\"2024-06-25T07:29:16.36731Z\",\"mode\":\"test\",\"created_on\":"
                + "\"2024-06-25T07:29:16.368093Z\"}],\"has_more\":false,\"total_hits\":2}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a customs declaration for a successful charge. Backend only accepts this request for
     * WeChat Online and WeChat MPM charges. If a declaration already exists and is no longer
     * pending, the backend updates its identity fields and restarts processing instead of creating
     * a new record.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCustomsDeclaration() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        CustomsDeclarationCreateRequest body = ApiHelper.deserialize(
                "{\"customs\":\"TOKYO\",\"merchant_customs_no\":\"1234567890\",\"certificate_id\":"
                + "\"AB1234567\",\"certificate_name\":\"TARO YAMADA\"}",
                CustomsDeclarationCreateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        CustomsDeclarationWebhookData result = null;
        try {
            result = controller.createCustomsDeclaration(storeId, chargeId, body, idempotencyKey).getResult();
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
                "{\"id\":\"11ef0000-0000-4000-8000-000000000040\",\"charge_id\":\"11ef0000-0000-400"
                + "0-8000-000000000001\",\"merchant_id\":\"11ef0000-0000-4000-8000-000000000020\","
                + "\"store_id\":\"11ef0000-0000-4000-8000-000000000022\",\"mode\":\"test\",\"gatewa"
                + "y\":\"wechat_online\",\"declaration\":{\"customs\":\"TOKYO\",\"merchant_customs_"
                + "no\":\"1234567890\",\"certificate_id\":\"AB1234567\",\"certificate_name\":\"TARO"
                + " YAMADA\"},\"declaration_result\":{},\"status\":\"pending\",\"error\":null,\"cre"
                + "ated_on\":\"2026-04-09T07:35:50.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a customs declaration for a successful charge. Backend only accepts this request for
     * WeChat Online and WeChat MPM charges. If a declaration already exists and is no longer
     * pending, the backend updates its identity fields and restarts processing instead of creating
     * a new record.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCustomsDeclaration1() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        CustomsDeclarationCreateRequest body = ApiHelper.deserialize(
                "{\"customs\":\"TOKYO\",\"merchant_customs_no\":\"1234567890\",\"certificate_id\":"
                + "\"AB1234567\",\"certificate_name\":\"TARO YAMADA\"}",
                CustomsDeclarationCreateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Build a one-off client with Prefer: status=201 so Prism returns the 201 response
        okhttp3.OkHttpClient preferClient = new okhttp3.OkHttpClient.Builder()
                .addInterceptor(chain -> chain.proceed(
                        chain.request().newBuilder()
                                .header("Prefer", "code=201")
                                .build()))
                .build();
        
        UnivapayClientSdkClient preferredClient = client.newBuilder()
                .httpCallback(httpResponse)
                .httpClientConfig(cfg -> cfg.httpClientInstance(preferClient, true))
                .build();
        ChargesApi preferredController = preferredClient.getChargesApi();

        // Set callback and perform API call
        CustomsDeclarationWebhookData result = null;
        try {
            result = preferredController.createCustomsDeclaration(storeId, chargeId, body, idempotencyKey).getResult();
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
                "{\"id\":\"11ef0000-0000-4000-8000-000000000040\",\"charge_id\":\"11ef0000-0000-400"
                + "0-8000-000000000001\",\"merchant_id\":\"11ef0000-0000-4000-8000-000000000020\","
                + "\"store_id\":\"11ef0000-0000-4000-8000-000000000022\",\"mode\":\"test\",\"gatewa"
                + "y\":\"wechat_online\",\"declaration\":{\"customs\":\"TOKYO\",\"merchant_customs_"
                + "no\":\"1234567890\",\"certificate_id\":\"AB1234567\",\"certificate_name\":\"TARO"
                + " YAMADA\"},\"declaration_result\":{},\"status\":\"pending\",\"error\":null,\"cre"
                + "ated_on\":\"2026-04-09T07:35:50.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves a customs declaration for a charge. Supports long polling when `polling=true`,
     * returning once the declaration leaves its current state or the polling timeout is reached.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetCustomsDeclaration() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        UUID id = UUID.fromString(
                "11ef0000-0000-4000-8000-000000000040");
        Boolean polling = false;

        // Set callback and perform API call
        CustomsDeclarationWebhookData result = null;
        try {
            result = controller.getCustomsDeclaration(storeId, chargeId, id, polling).getResult();
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
                "{\"id\":\"11ef0000-0000-4000-8000-000000000040\",\"charge_id\":\"11ef0000-0000-400"
                + "0-8000-000000000001\",\"merchant_id\":\"11ef0000-0000-4000-8000-000000000020\","
                + "\"store_id\":\"11ef0000-0000-4000-8000-000000000022\",\"mode\":\"test\",\"gatewa"
                + "y\":\"wechat_online\",\"declaration\":{\"customs\":\"TOKYO\",\"merchant_customs_"
                + "no\":\"1234567890\",\"certificate_id\":\"AB1234567\",\"certificate_name\":\"TARO"
                + " YAMADA\"},\"declaration_result\":{\"approving_authority\":\"TOKYO\",\"trade_id"
                + "\":\"wx_trade_12345\",\"transaction_id\":\"wx_txn_12345\",\"charge_transaction_i"
                + "d\":\"wx_charge_12345\"},\"status\":\"successful\",\"error\":null,\"created_on"
                + "\":\"2026-04-09T07:35:50.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Updates a customs declaration and requeues processing. Backend patching preserves the
     * original `customs`, `certificate_id`, and `certificate_name` values and only accepts a new
     * `merchant_customs_no`. Pending declarations cannot be patched.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestPatchCustomsDeclaration() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        UUID id = UUID.fromString(
                "11ef0000-0000-4000-8000-000000000040");
        CustomsDeclarationPatchRequest body = ApiHelper.deserialize(
                "{\"merchant_customs_no\":\"1234567891\"}",
                CustomsDeclarationPatchRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        CustomsDeclarationWebhookData result = null;
        try {
            result = controller.patchCustomsDeclaration(storeId, chargeId, id, body, idempotencyKey).getResult();
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
                "{\"id\":\"11ef0000-0000-4000-8000-000000000040\",\"charge_id\":\"11ef0000-0000-400"
                + "0-8000-000000000001\",\"merchant_id\":\"11ef0000-0000-4000-8000-000000000020\","
                + "\"store_id\":\"11ef0000-0000-4000-8000-000000000022\",\"mode\":\"test\",\"gatewa"
                + "y\":\"wechat_online\",\"declaration\":{\"customs\":\"TOKYO\",\"merchant_customs_"
                + "no\":\"1234567891\",\"certificate_id\":\"AB1234567\",\"certificate_name\":\"TARO"
                + " YAMADA\"},\"declaration_result\":{},\"status\":\"pending\",\"error\":null,\"cre"
                + "ated_on\":\"2026-04-09T07:35:50.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
