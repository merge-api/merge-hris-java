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
import merge_hris_client.model.PaginatedSyncStatusList;
import merge_hris_client.model.SyncStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SyncStatusApi
 */
@Ignore
public class SyncStatusApiTest {

    private final SyncStatusApi api = new SyncStatusApi();

    
    /**
     * 
     *
     * Get syncing status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncStatusListTest() throws ApiException {
        String xAccountToken = null;
        String cursor = null;
        Integer pageSize = null;
        PaginatedSyncStatusList response = api.syncStatusList(xAccountToken, cursor, pageSize);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Force re-sync of all models. This is only available for organizations on Merge&#39;s Grow and Expand plans.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncStatusResyncCreateTest() throws ApiException {
        String xAccountToken = null;
        SyncStatus response = api.syncStatusResyncCreate(xAccountToken);

        // TODO: test validations
    }
    
}
