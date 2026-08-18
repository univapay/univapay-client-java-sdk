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
import com.univapay.api.models.CheckoutInfo;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckoutApiTest extends BaseApiTest {

    /**
     * Client instance.
     */
    private static UnivapayClientSdkClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static CheckoutApi controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getCheckoutApi();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns the merchant's checkout configuration: enabled payment methods and their limits,
     * installment/subscription plan settings, convenience-store and bank-transfer settings, widget
     * theme, and per-brand feature support. Resolved entirely from the bearer credential — takes no
     * parameters.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetCheckoutInfo() throws Exception {

        // Set callback and perform API call
        CheckoutInfo result = null;
        try {
            result = controller.getCheckoutInfo().getResult();
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
                "{\"mode\":\"test\",\"recurring_token_privilege\":\"none\",\"name\":\"Test store\","
                + "\"card_configuration\":{\"enabled\":true,\"debit_enabled\":true,\"prepaid_enable"
                + "d\":true,\"debit_authorization_enabled\":false,\"prepaid_authorization_enabled"
                + "\":false,\"only_direct_currency\":false,\"forbidden_card_brands\":null,\"allowed"
                + "_countries_by_ip\":null,\"foreign_cards_allowed\":true,\"fail_on_new_email\":nul"
                + "l,\"card_limit\":null,\"allow_empty_cvv\":null,\"allow_direct_token_creation\":t"
                + "rue,\"three_ds_required\":false,\"three_ds_address_required\":false,\"three_ds_s"
                + "kip_enabled\":false,\"three_ds_phone_number_required\":true},\"subscription_conf"
                + "iguration\":{\"enabled\":true},\"installments_configuration\":{\"enabled\":true,"
                + "\"card_processor\":{\"revolving\":true,\"fixed_cycle\":true},\"supported_payment"
                + "_types\":[\"card\"],\"min_charge_amount\":{\"amount\":1000,\"amount_formatted\":"
                + "1000,\"currency\":\"JPY\"},\"max_payout_period\":\"P2Y\",\"only_with_processor"
                + "\":true},\"subscription_plan_configuration\":{\"enabled\":true,\"fixed_cycle\":t"
                + "rue,\"fixed_cycle_amount\":true,\"supported_payment_types\":[\"card\"],\"min_cha"
                + "rge_amount\":null,\"max_payout_period\":null},\"checkout_configuration\":{\"ec_e"
                + "mail\":{\"enabled\":false},\"ec_products\":{\"enabled\":false}},\"qr_scan_config"
                + "uration\":{\"enabled\":true,\"forbidden_qr_scan_gateways\":null},\"convenience_c"
                + "onfiguration\":{\"enabled\":true,\"expiration\":\"PT720H\",\"expiration_time_shi"
                + "ft\":{\"enabled\":false}},\"paidy_configuration\":{\"enabled\":true},\"paidy_pub"
                + "lic_key\":null,\"logo_image\":null,\"theme\":{\"colors\":{\"main_background\":"
                + "\"#FFFFFF\",\"secondary_background\":\"#F5F8FC\",\"main_color\":\"#4C5F85\",\"ma"
                + "in_text\":\"#FFFFFF\",\"primary_text\":\"#4C5F85\",\"secondary_text\":\"#4C5F85"
                + "\",\"base_text\":\"#4C5F85\",\"body_background\":\"#FFFFFF\"}},\"recurring_card_"
                + "charge_cvv_confirmation\":{\"enabled\":false,\"threshold\":null},\"online_config"
                + "uration\":{\"enabled\":true},\"bank_transfer_configuration\":{\"enabled\":true,"
                + "\"match_amount\":\"disabled\",\"expiration\":\"PT72H\",\"expiration_time_shift"
                + "\":{\"enabled\":false},\"virtual_bank_accounts_threshold\":5,\"virtual_bank_acco"
                + "unts_fetch_count\":10,\"default_extension_period\":\"PT168H\",\"maximum_extensio"
                + "n_period\":\"PT168H\",\"automatic_extension_enabled\":false,\"charge_request_not"
                + "ification_enabled\":false,\"charge_request_canceled_notification_enabled\":false"
                + ",\"charge_expired_notification_enabled\":false,\"deposit_received_notification_e"
                + "nabled\":false,\"deposit_insufficient_notification_enabled\":false,\"deposit_exc"
                + "eeded_notification_enabled\":false,\"extension_notification_enabled\":false,\"re"
                + "mind_notification_period\":\"PT168H\",\"remind_notification_enabled\":false},\"s"
                + "upported_brands\":[{\"payment_type\":\"card\",\"brand\":\"visa\",\"card_brand\":"
                + "\"visa\",\"dynamic_info\":false,\"support_auth_capture\":true,\"requires_full_na"
                + "me\":false,\"requires_cvv\":true,\"countries_allowed\":null,\"supported_currenci"
                + "es\":null,\"cvv_auth\":false,\"installment_capable\":true,\"mcp_capable\":false,"
                + "\"mcp_only\":false},{\"payment_type\":\"qr_merchant\",\"brand\":\"alipay_merchan"
                + "t_qr\",\"qr_brand\":\"alipay_merchant_qr\",\"dynamic_info\":false,\"support_auth"
                + "_capture\":false,\"requires_full_name\":false,\"requires_cvv\":false,\"countries"
                + "_allowed\":null,\"supported_currencies\":null,\"cvv_auth\":false,\"installment_c"
                + "apable\":false,\"mcp_capable\":false,\"mcp_only\":false}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
