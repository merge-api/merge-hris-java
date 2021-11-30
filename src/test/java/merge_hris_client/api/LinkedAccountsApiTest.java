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
import merge_hris_client.model.PaginatedAccountDetailsAndActionsList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LinkedAccountsApi
 */
@Ignore
public class LinkedAccountsApiTest {

    private final LinkedAccountsApi api = new LinkedAccountsApi();

    
    /**
     * 
     *
     * List linked accounts for your organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linkedAccountsListTest() throws ApiException {
        String category = null;
        Integer cursor = null;
        String endUserEmailAddress = null;
        String endUserOrganizationName = null;
        String endUserOriginId = null;
        String endUserOriginIds = null;
        UUID id = null;
        String ids = null;
        String integrationName = null;
        String isTestAccount = null;
        Integer pageSize = null;
        String status = null;
        // PaginatedAccountDetailsAndActionsList response = api.linkedAccountsList(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, integrationName, isTestAccount, pageSize, status);
        // TODO: test validations
    }
    
}