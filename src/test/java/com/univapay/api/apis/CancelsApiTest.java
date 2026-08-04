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
import com.univapay.api.models.Cancel;
import com.univapay.api.models.CancelCreateRequest;
import com.univapay.api.models.CancelList;
import com.univapay.api.models.CancelUpdateRequest;
import com.univapay.api.models.CursorDirectionQuery;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CancelsApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static CancelsApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getCancelsApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns a paginated list of cancels for the specified charge.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListCancels() throws Exception {
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

        // Set callback and perform API call
        CancelList result = null;
        try {
            result = controller.listCancels(storeId, chargeId, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"id\":\"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",\"charge_id\":\"6efb4"
                + "e5c-690a-40f3-a4f1-0e19c5f84e98\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5"
                + "928a1\",\"status\":\"successful\",\"error\":{},\"metadata\":{\"order_id\":\"ORD-"
                + "987\"},\"mode\":\"live\",\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"update"
                + "d_on\":\"2026-04-09T07:36:00.000000Z\"},{\"id\":\"b2c3d4e5-f6a7-8901-bcde-f23456"
                + "789012\",\"charge_id\":\"7fac5f6d-7a1b-51e4-b5f2-1f2ad6f95fa9\",\"store_id\":\"7"
                + "6cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"status\":\"successful\",\"error\":{},\"m"
                + "etadata\":{\"order_id\":\"ORD-988\"},\"mode\":\"live\",\"created_on\":\"2026-04-"
                + "10T10:00:00.000000Z\",\"updated_on\":\"2026-04-10T10:00:12.000000Z\"},{\"id\":"
                + "\"c3d4e5f6-a7b8-9012-cdef-345678901234\",\"charge_id\":\"80bd6a7e-8b2c-62f5-c6a3"
                + "-2a3be7a06aba\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"status"
                + "\":\"pending\",\"error\":{},\"metadata\":{},\"mode\":\"live\",\"created_on\":\"2"
                + "026-04-11T14:22:08.000000Z\",\"updated_on\":\"2026-04-11T14:22:08.000000Z\"}],"
                + "\"has_more\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a new cancellation request for a charge. The charge must be in a cancellable state.
     * Bank transfer and konbini charges that have already been paid cannot be cancelled.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateCancel() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";
        CancelCreateRequest body = ApiHelper.deserialize(
                "{\"metadata\":{\"order_id\":\"ORD-987\"}}",
                CancelCreateRequest.class);

        // Set callback and perform API call
        Cancel result = null;
        try {
            result = controller.createCancel(storeId, chargeId, idempotencyKey, body).getResult();
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
                "{\"id\":\"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",\"charge_id\":\"6efb4e5c-690a-40f"
                + "3-a4f1-0e19c5f84e98\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"st"
                + "atus\":\"pending\",\"error\":null,\"metadata\":{},\"mode\":\"live\",\"created_on"
                + "\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z"
                + "\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves a specific cancel by ID. Supports long-polling by appending `?polling=true` to wait
     * for a status change (up to the server timeout). Requires a secret-bearing token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetCancel() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        Boolean polling = false;

        // Set callback and perform API call
        Cancel result = null;
        try {
            result = controller.getCancel(storeId, chargeId, id, polling).getResult();
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
                "{\"id\":\"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",\"charge_id\":\"6efb4e5c-690a-40f"
                + "3-a4f1-0e19c5f84e98\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"st"
                + "atus\":\"successful\",\"error\":null,\"metadata\":{},\"mode\":\"live\",\"created"
                + "_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:36:00.00000"
                + "0Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Updates metadata on an existing cancel. Requires a secret-bearing token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateCancel() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID chargeId = UUID.fromString(
                "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        CancelUpdateRequest body = ApiHelper.deserialize(
                "{\"metadata\":{\"order_id\":\"12345\"}}",
                CancelUpdateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Cancel result = null;
        try {
            result = controller.updateCancel(storeId, chargeId, id, body, idempotencyKey).getResult();
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
                "{\"id\":\"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",\"charge_id\":\"6efb4e5c-690a-40f"
                + "3-a4f1-0e19c5f84e98\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"st"
                + "atus\":\"successful\",\"error\":null,\"metadata\":{\"order_id\":\"12345\"},\"mod"
                + "e\":\"live\",\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"202"
                + "6-04-09T08:00:00.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
