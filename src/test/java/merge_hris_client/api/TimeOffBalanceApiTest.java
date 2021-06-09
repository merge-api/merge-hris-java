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
import org.threeten.bp.OffsetDateTime;
import merge_hris_client.model.PaginatedTimeOffBalanceList;
import merge_hris_client.model.TimeOffBalance;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeOffBalanceApi
 */
@Ignore
public class TimeOffBalanceApiTest {

    private final TimeOffBalanceApi api = new TimeOffBalanceApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;TimeOffBalance&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timeOffBalanceListTest() throws ApiException {
        String xAccountToken = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        String employeeId = null;
        String expand = null;
        Boolean includeRemoteData = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String remoteId = null;
        PaginatedTimeOffBalanceList response = api.timeOffBalanceList(xAccountToken, createdAfter, createdBefore, cursor, employeeId, expand, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an &#x60;TimeOffBalance&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timeOffBalanceRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        String expand = null;
        Boolean includeRemoteData = null;
        TimeOffBalance response = api.timeOffBalanceRetrieve(xAccountToken, id, expand, includeRemoteData);

        // TODO: test validations
    }
    
}