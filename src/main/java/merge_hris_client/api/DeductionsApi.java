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


import merge_hris_client.model.Deduction;
import org.threeten.bp.OffsetDateTime;
import merge_hris_client.model.PaginatedDeductionList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeductionsApi {
    private ApiClient localVarApiClient;

    public DeductionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeductionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deductionsList
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeePayrollRunId If provided, will only return deductions for this employee payroll run. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
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
    public okhttp3.Call deductionsListCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeePayrollRunId, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deductions";

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

        if (employeePayrollRunId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_payroll_run_id", employeePayrollRunId));
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
    private okhttp3.Call deductionsListValidateBeforeCall(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeePayrollRunId, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling deductionsList(Async)");
        }
        

        okhttp3.Call localVarCall = deductionsListCall(xAccountToken, createdAfter, createdBefore, cursor, employeePayrollRunId, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;Deduction&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeePayrollRunId If provided, will only return deductions for this employee payroll run. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedDeductionList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedDeductionList deductionsList(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeePayrollRunId, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId) throws ApiException {
        ApiResponse<PaginatedDeductionList> localVarResp = deductionsListWithHttpInfo(xAccountToken, createdAfter, createdBefore, cursor, employeePayrollRunId, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;Deduction&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeePayrollRunId If provided, will only return deductions for this employee payroll run. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return ApiResponse&lt;PaginatedDeductionList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedDeductionList> deductionsListWithHttpInfo(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeePayrollRunId, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId) throws ApiException {
        okhttp3.Call localVarCall = deductionsListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, employeePayrollRunId, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, null);
        Type localVarReturnType = new TypeToken<PaginatedDeductionList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;Deduction&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeePayrollRunId If provided, will only return deductions for this employee payroll run. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
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
    public okhttp3.Call deductionsListAsync(String xAccountToken, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, String employeePayrollRunId, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String remoteId, final ApiCallback<PaginatedDeductionList> _callback) throws ApiException {

        okhttp3.Call localVarCall = deductionsListValidateBeforeCall(xAccountToken, createdAfter, createdBefore, cursor, employeePayrollRunId, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, _callback);
        Type localVarReturnType = new TypeToken<PaginatedDeductionList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deductionsRetrieve
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
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
    public okhttp3.Call deductionsRetrieveCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deductions/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call deductionsRetrieveValidateBeforeCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling deductionsRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deductionsRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = deductionsRetrieveCall(xAccountToken, id, includeRemoteData, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a &#x60;Deduction&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return Deduction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Deduction deductionsRetrieve(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        ApiResponse<Deduction> localVarResp = deductionsRetrieveWithHttpInfo(xAccountToken, id, includeRemoteData);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a &#x60;Deduction&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return ApiResponse&lt;Deduction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Deduction> deductionsRetrieveWithHttpInfo(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        okhttp3.Call localVarCall = deductionsRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, null);
        Type localVarReturnType = new TypeToken<Deduction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a &#x60;Deduction&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
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
    public okhttp3.Call deductionsRetrieveAsync(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback<Deduction> _callback) throws ApiException {

        okhttp3.Call localVarCall = deductionsRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, _callback);
        Type localVarReturnType = new TypeToken<Deduction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
