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

import merge_hris_client.ApiCallback;
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.ApiResponse;
import merge_hris_client.Configuration;
import merge_hris_client.Pair;
import merge_hris_client.ProgressRequestBody;
import merge_hris_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.threeten.bp.OffsetDateTime;
import merge_hris_client.model.PaginatedTimeOffBalanceList;
import merge_hris_client.model.TimeOffBalance;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeOffBalanceApi {
    private ApiClient localVarApiClient;

    public TimeOffBalanceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TimeOffBalanceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for timeOffBalanceList
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeeId If provided, will only return time off balances for this employee. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param policyType If provided, will only return TimeOffBalance with this policy type. Options: (&#39;VACATION&#39;, &#39;SICK&#39;, &#39;PERSONAL&#39;, &#39;JURY_DUTY&#39;, &#39;VOLUNTEER&#39;, &#39;BEREAVEMENT&#39;) (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timeOffBalanceListCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeeId, String expand, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String policyType, String remoteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/time-off-balance";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (createdAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_after", createdAfter));
        }

        if (createdBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_before", createdBefore));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_id", employeeId));
        }

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
        }

        if (modifiedAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modified_after", modifiedAfter));
        }

        if (modifiedBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modified_before", modifiedBefore));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (policyType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policy_type", policyType));
        }

        if (remoteId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remote_id", remoteId));
        }

        if (xAccountToken != null) {
            localVarHeaderParams.put("X-Account-Token", localVarApiClient.parameterToString(xAccountToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call timeOffBalanceListValidateBeforeCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeeId, String expand, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String policyType, String remoteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling timeOffBalanceList(Async)");
        }
        

        okhttp3.Call localVarCall = timeOffBalanceListCall(xAccountToken, createdAfter, createdBefore, cursor, employeeId, expand, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, policyType, remoteId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;TimeOffBalance&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeeId If provided, will only return time off balances for this employee. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param policyType If provided, will only return TimeOffBalance with this policy type. Options: (&#39;VACATION&#39;, &#39;SICK&#39;, &#39;PERSONAL&#39;, &#39;JURY_DUTY&#39;, &#39;VOLUNTEER&#39;, &#39;BEREAVEMENT&#39;) (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedTimeOffBalanceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedTimeOffBalanceList timeOffBalanceList(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeeId, String expand, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String policyType, String remoteId) throws ApiException {
        ApiResponse<PaginatedTimeOffBalanceList> localVarResp = timeOffBalanceListWithHttpInfo(xAccountToken, createdAfter, createdBefore, cursor, employeeId, expand, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, policyType, remoteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;TimeOffBalance&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeeId If provided, will only return time off balances for this employee. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param policyType If provided, will only return TimeOffBalance with this policy type. Options: (&#39;VACATION&#39;, &#39;SICK&#39;, &#39;PERSONAL&#39;, &#39;JURY_DUTY&#39;, &#39;VOLUNTEER&#39;, &#39;BEREAVEMENT&#39;) (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return ApiResponse&lt;PaginatedTimeOffBalanceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedTimeOffBalanceList> timeOffBalanceListWithHttpInfo(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeeId, String expand, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String policyType, String remoteId) throws ApiException {
        okhttp3.Call localVarCall = timeOffBalanceListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, employeeId, expand, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, policyType, remoteId, null);
        Type localVarReturnType = new TypeToken<PaginatedTimeOffBalanceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;TimeOffBalance&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeeId If provided, will only return time off balances for this employee. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param policyType If provided, will only return TimeOffBalance with this policy type. Options: (&#39;VACATION&#39;, &#39;SICK&#39;, &#39;PERSONAL&#39;, &#39;JURY_DUTY&#39;, &#39;VOLUNTEER&#39;, &#39;BEREAVEMENT&#39;) (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timeOffBalanceListAsync(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeeId, String expand, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String policyType, String remoteId, final ApiCallback<PaginatedTimeOffBalanceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = timeOffBalanceListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, employeeId, expand, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, policyType, remoteId, _callback);
        Type localVarReturnType = new TypeToken<PaginatedTimeOffBalanceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for timeOffBalanceRetrieve
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timeOffBalanceRetrieveCall(String xAccountToken, UUID id, String expand, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/time-off-balance/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
        }

        if (xAccountToken != null) {
            localVarHeaderParams.put("X-Account-Token", localVarApiClient.parameterToString(xAccountToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call timeOffBalanceRetrieveValidateBeforeCall(String xAccountToken, UUID id, String expand, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling timeOffBalanceRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling timeOffBalanceRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = timeOffBalanceRetrieveCall(xAccountToken, id, expand, includeRemoteData, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a &#x60;TimeOffBalance&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return TimeOffBalance
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public TimeOffBalance timeOffBalanceRetrieve(String xAccountToken, UUID id, String expand, Boolean includeRemoteData) throws ApiException {
        ApiResponse<TimeOffBalance> localVarResp = timeOffBalanceRetrieveWithHttpInfo(xAccountToken, id, expand, includeRemoteData);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a &#x60;TimeOffBalance&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return ApiResponse&lt;TimeOffBalance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TimeOffBalance> timeOffBalanceRetrieveWithHttpInfo(String xAccountToken, UUID id, String expand, Boolean includeRemoteData) throws ApiException {
        okhttp3.Call localVarCall = timeOffBalanceRetrieveValidateBeforeCall(xAccountToken, id, expand, includeRemoteData, null);
        Type localVarReturnType = new TypeToken<TimeOffBalance>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a &#x60;TimeOffBalance&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call timeOffBalanceRetrieveAsync(String xAccountToken, UUID id, String expand, Boolean includeRemoteData, final ApiCallback<TimeOffBalance> _callback) throws ApiException {

        okhttp3.Call localVarCall = timeOffBalanceRetrieveValidateBeforeCall(xAccountToken, id, expand, includeRemoteData, _callback);
        Type localVarReturnType = new TypeToken<TimeOffBalance>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
