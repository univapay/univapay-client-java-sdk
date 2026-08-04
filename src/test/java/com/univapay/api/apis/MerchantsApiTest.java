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
import com.univapay.api.models.Merchant;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MerchantsApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static MerchantsApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getMerchantsApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns merchant identity and the effective configuration resolved from bearer credentials.
     * Treat this as the canonical introspection endpoint for merchant integrations.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetCurrentMerchant() throws Exception {

        // Set callback and perform API call
        Merchant result = null;
        try {
            result = controller.getCurrentMerchant().getResult();
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
                "{\"id\":\"11ef0000-0000-4000-8000-000000000020\",\"verification_data_id\":\"11ef00"
                + "00-0000-4000-8000-000000000021\",\"name\":\"Example Merchant\",\"email\":\"owner"
                + "@example.com\",\"notification_email\":\"alerts@example.com\",\"finance_notificat"
                + "ion_email\":\"finance@example.com\",\"verified\":true,\"configuration\":{\"perce"
                + "nt_fee\":3.6,\"country\":\"JP\",\"language\":\"ja\",\"minimum_charge_amounts\":["
                + "{\"amount\":100,\"currency\":\"JPY\"}],\"maximum_charge_amounts\":[{\"amount\":1"
                + "00000,\"currency\":\"JPY\"}],\"user_transactions_configuration\":{\"enabled\":tr"
                + "ue,\"notify_customer\":true,\"notify_on_webhook_failure\":true},\"card_configura"
                + "tion\":{\"enabled\":true,\"debit_enabled\":true,\"prepaid_enabled\":false,\"thre"
                + "e_ds_required\":true},\"online_configuration\":{\"enabled\":true},\"bank_transfe"
                + "r_configuration\":{\"enabled\":true,\"match_amount\":true,\"expiration\":\"P7D"
                + "\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
