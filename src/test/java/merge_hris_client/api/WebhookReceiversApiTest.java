/*
 * Merge HRIS API
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package merge_hris_client.api;

import merge_hris_client.ApiException;
import merge_hris_client.model.WebhookReceiver;
import merge_hris_client.model.WebhookReceiverRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookReceiversApi
 */
@Ignore
public class WebhookReceiversApiTest {

    private final WebhookReceiversApi api = new WebhookReceiversApi();

    
    /**
     * 
     *
     * Creates a &#x60;WebhookReceiver&#x60; object with the given values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webhookReceiversCreateTest() throws ApiException {
        String xAccountToken = null;
        WebhookReceiverRequest webhookReceiverRequest = null;
        WebhookReceiver response = api.webhookReceiversCreate(xAccountToken, webhookReceiverRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of &#x60;WebhookReceiver&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webhookReceiversListTest() throws ApiException {
        String xAccountToken = null;
        List<WebhookReceiver> response = api.webhookReceiversList(xAccountToken);

        // TODO: test validations
    }
    
}
