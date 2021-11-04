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


package java.merge_hris_client.api;

import merge_hris_client.ApiException;
import java.merge_hris_client.model.EndUserDetailsRequest;
import java.merge_hris_client.model.LinkToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LinkTokenApi
 */
@Ignore
public class LinkTokenApiTest {

    private final LinkTokenApi api = new LinkTokenApi();

    
    /**
     * 
     *
     * Creates a link token to be used when linking a new end user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linkTokenCreateTest() throws ApiException {
        EndUserDetailsRequest endUserDetailsRequest = null;
                LinkToken response = api.linkTokenCreate(endUserDetailsRequest);
        // TODO: test validations
    }
    
}
