/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.apis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.univapay.api.UnivapayClientSdkClient;
import com.univapay.api.exceptions.ApiException;
import com.univapay.api.models.CursorDirectionQuery;
import com.univapay.api.models.Store;
import com.univapay.api.models.StoreList;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StoresApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static StoresApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getStoresApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns stores visible to the current merchant credential. Supports cursor pagination plus
     * `short_id` and free-text `search` filters.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListStores() throws Exception {
        // Parameters for the API call
        Integer limit = 10;
        UUID cursor = UUID.fromString(
                "3541d4fa-596d-428e-8a36-f274e1b3d505");
        CursorDirectionQuery cursorDirection = CursorDirectionQuery.fromString(
                "desc");
        String shortId = 
                "st_01hxy9p8zw4d";
        String search = 
                "tokyo";

        // Set callback and perform API call
        StoreList result = null;
        try {
            result = controller.listStores(limit, cursor, cursorDirection, shortId, search).getResult();
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
                "{\"items\":[{\"id\":\"11ef0000-0000-4000-8000-000000000022\",\"name\":\"Tokyo Stor"
                + "e\",\"merchant_name\":\"Example Merchant\",\"created_on\":\"2026-04-09T07:35:50."
                + "000000Z\"},{\"id\":\"11ef0000-0000-4000-8000-000000000023\",\"name\":\"Osaka Sto"
                + "re\",\"merchant_name\":\"Example Merchant\",\"created_on\":\"2026-04-10T09:12:30"
                + ".000000Z\"},{\"id\":\"11ef0000-0000-4000-8000-000000000024\",\"name\":\"Online S"
                + "tore\",\"merchant_name\":\"Example Merchant\",\"created_on\":\"2026-04-12T14:45:"
                + "05.000000Z\"}],\"has_more\":false,\"total_hits\":3}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Returns a single store plus its resolved configuration snapshot for the current merchant
     * context.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetStore() throws Exception {
        // Parameters for the API call
        UUID id = UUID.fromString(
                "c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");

        // Set callback and perform API call
        Store result = null;
        try {
            result = controller.getStore(id).getResult();
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
                "{\"id\":\"11ef0000-0000-4000-8000-000000000022\",\"name\":\"Tokyo Store\",\"create"
                + "d_on\":\"2026-04-09T07:35:50.000000Z\",\"configuration\":{\"percent_fee\":3.6,"
                + "\"country\":\"JP\",\"language\":\"ja\",\"minimum_charge_amounts\":[{\"amount\":1"
                + "00,\"currency\":\"JPY\"}],\"maximum_charge_amounts\":[{\"amount\":100000,\"curre"
                + "ncy\":\"JPY\"}],\"user_transactions_configuration\":{\"enabled\":true,\"notify_c"
                + "ustomer\":true,\"notify_on_webhook_failure\":true},\"card_configuration\":{\"ena"
                + "bled\":true,\"debit_enabled\":true,\"prepaid_enabled\":false,\"three_ds_required"
                + "\":true},\"online_configuration\":{\"enabled\":true},\"bank_transfer_configurati"
                + "on\":{\"enabled\":true,\"match_amount\":true,\"expiration\":\"P7D\"}}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
