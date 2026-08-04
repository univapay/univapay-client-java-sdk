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
import com.univapay.api.models.Refund;
import com.univapay.api.models.RefundCreateRequest;
import com.univapay.api.models.RefundList;
import com.univapay.api.models.RefundUpdateRequest;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RefundsApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static RefundsApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getRefundsApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieves a list of all refunds for a specific charge.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListRefunds() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");
        String metadata = 
                "order_id: 12345";

        // Set callback and perform API call
        RefundList result = null;
        try {
            result = controller.listRefunds(storeId, chargeId, limit, cursor, cursorDirection, metadata).getResult();
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
                "{\"items\":[{\"id\":\"b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6\",\"store_id\":\"76cf4a"
                + "64-02bc-4cb3-9a28-74622e5928a1\",\"charge_id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f"
                + "84e98\",\"status\":\"successful\",\"amount\":1000,\"currency\":\"JPY\",\"amount_"
                + "formatted\":1000,\"reason\":\"customer_request\",\"message\":\"Customer returned"
                + " item\",\"error\":{},\"metadata\":{},\"mode\":\"live\",\"created_on\":\"2026-04-"
                + "09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:36:00.000000Z\"},{\"id\":"
                + "\"c5e0afb0-dac4-5f87-b36e-c72f8f5932c7\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-"
                + "74622e5928a1\",\"charge_id\":\"7fac5f6d-7a1b-51e4-b5f2-1f2ad6f95fa9\",\"status"
                + "\":\"pending\",\"amount\":2500,\"currency\":\"JPY\",\"amount_formatted\":2500,"
                + "\"reason\":\"duplicate\",\"message\":\"Duplicate charge\",\"error\":{},\"metadat"
                + "a\":{\"order_id\":\"ORD-1002\"},\"mode\":\"live\",\"created_on\":\"2026-04-10T10"
                + ":00:00.000000Z\",\"updated_on\":\"2026-04-10T10:00:05.000000Z\"},{\"id\":\"d6f1b"
                + "ac1-ebd5-6098-c47f-d83a906043d8\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5"
                + "928a1\",\"charge_id\":\"80bd6a7e-8b2c-62f5-c6a3-2a3be7a06aba\",\"status\":\"succ"
                + "essful\",\"amount\":500,\"currency\":\"JPY\",\"amount_formatted\":500,\"reason"
                + "\":\"fraud\",\"message\":\"Fraudulent transaction reversed\",\"error\":{},\"meta"
                + "data\":{},\"mode\":\"live\",\"created_on\":\"2026-04-11T14:22:08.000000Z\",\"upd"
                + "ated_on\":\"2026-04-11T14:22:20.000000Z\"}],\"has_more\":false,\"total_hits\":3}"
                + "",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a refund for a successful charge. The charge must have status `successful`. Konbini
     * and bank transfer charges cannot be refunded. The refund is processed asynchronously — the
     * initial status will be `pending`.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateRefund() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        RefundCreateRequest body = ApiHelper.deserialize(
                "{\"amount\":1000,\"currency\":\"JPY\",\"reason\":\"customer_request\"}",
                RefundCreateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Refund result = null;
        try {
            result = controller.createRefund(storeId, chargeId, body, idempotencyKey).getResult();
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
                "{\"id\":\"b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6\",\"store_id\":\"76cf4a64-02bc-4cb3"
                + "-9a28-74622e5928a1\",\"charge_id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"st"
                + "atus\":\"pending\",\"amount\":1000,\"currency\":\"JPY\",\"amount_formatted\":100"
                + "0,\"reason\":\"customer_request\",\"message\":\"Customer returned item\",\"error"
                + "\":null,\"metadata\":{},\"mode\":\"live\",\"created_on\":\"2026-04-09T07:35:50.0"
                + "00000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves the details of a specific refund. Supports long polling — set `polling=true` to
     * wait until the refund status changes from `pending` to a terminal state (`successful`,
     * `failed`, or `error`).
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetRefund() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        Boolean polling = true;

        // Set callback and perform API call
        Refund result = null;
        try {
            result = controller.getRefund(storeId, chargeId, id, polling).getResult();
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
                "{\"id\":\"b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6\",\"store_id\":\"76cf4a64-02bc-4cb3"
                + "-9a28-74622e5928a1\",\"charge_id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"st"
                + "atus\":\"successful\",\"amount\":1000,\"currency\":\"JPY\",\"amount_formatted\":"
                + "1000,\"reason\":\"customer_request\",\"message\":\"Customer returned item\",\"er"
                + "ror\":null,\"metadata\":{},\"mode\":\"live\",\"created_on\":\"2026-04-09T07:35:5"
                + "0.000000Z\",\"updated_on\":\"2026-04-09T07:36:00.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Updates metadata, message, or reason on an existing refund.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateRefund() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        RefundUpdateRequest body = ApiHelper.deserialize(
                "{\"message\":\"Updated reason note\",\"metadata\":{\"order_id\":\"12345\"}}",
                RefundUpdateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Refund result = null;
        try {
            result = controller.updateRefund(storeId, chargeId, id, body, idempotencyKey).getResult();
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
                "{\"id\":\"b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6\",\"store_id\":\"76cf4a64-02bc-4cb3"
                + "-9a28-74622e5928a1\",\"charge_id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"st"
                + "atus\":\"successful\",\"amount\":1000,\"currency\":\"JPY\",\"amount_formatted\":"
                + "1000,\"reason\":\"customer_request\",\"message\":\"Updated reason note\",\"error"
                + "\":null,\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"live\",\"created_on\":"
                + "\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T08:00:00.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
