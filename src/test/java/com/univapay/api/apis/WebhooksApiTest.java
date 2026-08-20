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
import com.univapay.api.models.Webhook;
import com.univapay.api.models.WebhookCreateRequest;
import com.univapay.api.models.WebhookEventList;
import com.univapay.api.models.WebhookList;
import com.univapay.api.models.WebhookUpdateRequest;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class WebhooksApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static WebhooksApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getWebhooksApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns a paginated list of webhooks for the specified store. Requires a secret-bearing
     * token.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListWebhooks() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");
        Boolean active = true;

        // Set callback and perform API call
        WebhookList result = null;
        try {
            result = controller.listWebhooks(storeId, limit, cursor, cursorDirection, active).getResult();
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
                "{\"items\":[{\"id\":\"d3e4f5a6-b7c8-9012-def0-123456789abc\",\"store_id\":\"76cf4a"
                + "64-02bc-4cb3-9a28-74622e5928a1\",\"merchant_id\":\"01234567-89ab-cdef-0123-45678"
                + "9abcdef\",\"triggers\":[\"charge_finished\",\"refund_finished\"],\"url\":\"https"
                + "://example.com/webhooks/payments\",\"auth_token\":\"my-secret-token\",\"active"
                + "\":true,\"is_integration\":false,\"created_on\":\"2026-04-01T00:00:00.000000Z\","
                + "\"updated_on\":\"2026-04-02T00:00:00.000000Z\"},{\"id\":\"e4f5a6b7-c8d9-0123-ef0"
                + "1-23456789abcd\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"merchan"
                + "t_id\":\"01234567-89ab-cdef-0123-456789abcdef\",\"triggers\":[\"subscription_pay"
                + "ment\",\"subscription_failure\"],\"url\":\"https://example.com/webhooks/subscrip"
                + "tions\",\"auth_token\":null,\"active\":true,\"is_integration\":false,\"created_o"
                + "n\":\"2026-04-03T08:30:00.000000Z\",\"updated_on\":\"2026-04-03T08:30:00.000000Z"
                + "\"},{\"id\":\"f5a6b7c8-d9e0-1234-f012-3456789abcde\",\"store_id\":\"76cf4a64-02b"
                + "c-4cb3-9a28-74622e5928a1\",\"merchant_id\":\"01234567-89ab-cdef-0123-456789abcde"
                + "f\",\"triggers\":[\"cancel_finished\"],\"url\":\"https://example.com/webhooks/ca"
                + "ncels\",\"auth_token\":\"legacy-token\",\"active\":false,\"is_integration\":fals"
                + "e,\"created_on\":\"2026-03-20T12:00:00.000000Z\",\"updated_on\":\"2026-04-05T09:"
                + "15:00.000000Z\"}],\"has_more\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a new webhook subscription for the specified store. Requires a secret-bearing token.
     * Duplicate URLs within the same scope are not allowed. There is a maximum limit on the number
     * of webhooks per store.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateWebhook() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        WebhookCreateRequest body = ApiHelper.deserialize(
                "{\"triggers\":[\"charge_finished\"],\"url\":\"https://example.com/webhooks/payment"
                + "s\",\"auth_token\":\"my-secret-token\"}",
                WebhookCreateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Webhook result = null;
        try {
            result = controller.createWebhook(storeId, body, idempotencyKey).getResult();
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
                "{\"id\":\"d3e4f5a6-b7c8-9012-def0-123456789abc\",\"store_id\":\"76cf4a64-02bc-4cb3"
                + "-9a28-74622e5928a1\",\"merchant_id\":\"01234567-89ab-cdef-0123-456789abcdef\","
                + "\"triggers\":[\"charge_finished\",\"refund_finished\"],\"url\":\"https://example"
                + ".com/webhooks/payments\",\"auth_token\":\"my-secret-token\",\"active\":true,\"is"
                + "_integration\":false,\"created_on\":\"2026-04-01T00:00:00.000000Z\",\"updated_on"
                + "\":\"2026-04-01T00:00:00.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieves a specific webhook by ID.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetWebhook() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        Webhook result = null;
        try {
            result = controller.getWebhook(storeId, id).getResult();
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
                "{\"id\":\"d3e4f5a6-b7c8-9012-def0-123456789abc\",\"store_id\":\"76cf4a64-02bc-4cb3"
                + "-9a28-74622e5928a1\",\"merchant_id\":\"01234567-89ab-cdef-0123-456789abcdef\","
                + "\"triggers\":[\"charge_finished\"],\"url\":\"https://example.com/webhooks/paymen"
                + "ts\",\"active\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Updates an existing webhook. All fields are optional; omitted fields are left unchanged.
     * Duplicate URLs within the same scope are not allowed.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateWebhook() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        WebhookUpdateRequest body = ApiHelper.deserialize(
                "{\"active\":false}",
                WebhookUpdateRequest.class);
        String idempotencyKey = 
                "f64be872-353d-4c3c-84cb-3dc617fe89f7";

        // Set callback and perform API call
        Webhook result = null;
        try {
            result = controller.updateWebhook(storeId, id, body, idempotencyKey).getResult();
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
                "{\"id\":\"d3e4f5a6-b7c8-9012-def0-123456789abc\",\"store_id\":\"76cf4a64-02bc-4cb3"
                + "-9a28-74622e5928a1\",\"merchant_id\":\"01234567-89ab-cdef-0123-456789abcdef\","
                + "\"triggers\":[\"charge_finished\"],\"url\":\"https://example.com/webhooks/v2\","
                + "\"active\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Deactivates and deletes a webhook subscription.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteWebhook() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        try {
            controller.deleteWebhook(storeId, id).getResult();
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
     * Returns a paginated list of webhook delivery events for the specified webhook. Each event
     * captures the result of a single webhook delivery attempt.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListWebhookEvents() throws Exception {
        // Parameters for the API call
        UUID storeId = UUID.fromString(
                "0cab399b-5621-425b-993b-f8507eba1e78");
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");

        // Set callback and perform API call
        WebhookEventList result = null;
        try {
            result = controller.listWebhookEvents(storeId, id, limit, cursor, cursorDirection).getResult();
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
                "{\"items\":[{\"id\":\"e1f2a3b4-c5d6-7890-efab-123456789cde\",\"webhook_id\":\"d3e4"
                + "f5a6-b7c8-9012-def0-123456789abc\",\"event\":\"charge_finished\",\"successful\":"
                + "true,\"fired_on\":\"2026-04-09T07:36:00.000000Z\",\"error_message\":null,\"creat"
                + "ed_on\":\"2026-04-09T07:35:50.000000Z\"},{\"id\":\"f2a3b4c5-d6e7-8901-fabc-23456"
                + "789cdef\",\"webhook_id\":\"d3e4f5a6-b7c8-9012-def0-123456789abc\",\"event\":\"re"
                + "fund_finished\",\"successful\":true,\"fired_on\":\"2026-04-10T11:00:05.000000Z"
                + "\",\"error_message\":null,\"created_on\":\"2026-04-10T11:00:00.000000Z\"},{\"id"
                + "\":\"a3b4c5d6-e7f8-9012-abcd-3456789cdef0\",\"webhook_id\":\"d3e4f5a6-b7c8-9012-"
                + "def0-123456789abc\",\"event\":\"cancel_finished\",\"successful\":false,\"fired_o"
                + "n\":\"2026-04-11T15:30:10.000000Z\",\"error_message\":\"Connection timed out aft"
                + "er 10s\",\"created_on\":\"2026-04-11T15:30:00.000000Z\"}],\"has_more\":false}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
