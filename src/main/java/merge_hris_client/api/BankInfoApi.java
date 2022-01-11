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


import merge_hris_client.model.BankInfo;
import org.threeten.bp.OffsetDateTime;
import merge_hris_client.model.PaginatedBankInfoList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankInfoApi {
    private ApiClient localVarApiClient;

    public BankInfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BankInfoApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for bankInfoList
     * @param xAccountToken Token identifying the end user. (required)
     * @param accountType The bank account type: [CHECKING, SAVINGS] (optional)
     * @param bankName  (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employee If provided, will only return bank accounts for this employee. (optional)
     * @param employeeId If provided, will only return bank accounts for this employee. (optional)
     * @param includeDeletedData Whether to include data that was deleted in the third-party service. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param orderBy Overrides the default ordering for this endpoint. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteCreatedAt  (optional)
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
    public okhttp3.Call bankInfoListCall(String xAccountToken, String accountType, String bankName, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, UUID employee, String employeeId, Boolean includeDeletedData, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String orderBy, Integer pageSize, OffsetDateTime remoteCreatedAt, String remoteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bank-info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (bankName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("bank_name", bankName));
        }

        if (createdAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_after", createdAfter));
        }

        if (createdBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_before", createdBefore));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (employee != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee", employee));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employee_id", employeeId));
        }

        if (includeDeletedData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_deleted_data", includeDeletedData));
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

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (remoteCreatedAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remote_created_at", remoteCreatedAt));
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
    private okhttp3.Call bankInfoListValidateBeforeCall(String xAccountToken, String accountType, String bankName, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, UUID employee, String employeeId, Boolean includeDeletedData, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String orderBy, Integer pageSize, OffsetDateTime remoteCreatedAt, String remoteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling bankInfoList(Async)");
        }
        

        okhttp3.Call localVarCall = bankInfoListCall(xAccountToken, accountType, bankName, createdAfter, createdBefore, cursor, employee, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteCreatedAt, remoteId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;BankInfo&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param accountType The bank account type: [CHECKING, SAVINGS] (optional)
     * @param bankName  (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employee If provided, will only return bank accounts for this employee. (optional)
     * @param employeeId If provided, will only return bank accounts for this employee. (optional)
     * @param includeDeletedData Whether to include data that was deleted in the third-party service. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param orderBy Overrides the default ordering for this endpoint. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteCreatedAt  (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return PaginatedBankInfoList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedBankInfoList bankInfoList(String xAccountToken, String accountType, String bankName, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, UUID employee, String employeeId, Boolean includeDeletedData, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String orderBy, Integer pageSize, OffsetDateTime remoteCreatedAt, String remoteId) throws ApiException {
        ApiResponse<PaginatedBankInfoList> localVarResp = bankInfoListWithHttpInfo(xAccountToken, accountType, bankName, createdAfter, createdBefore, cursor, employee, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteCreatedAt, remoteId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;BankInfo&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param accountType The bank account type: [CHECKING, SAVINGS] (optional)
     * @param bankName  (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employee If provided, will only return bank accounts for this employee. (optional)
     * @param employeeId If provided, will only return bank accounts for this employee. (optional)
     * @param includeDeletedData Whether to include data that was deleted in the third-party service. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param orderBy Overrides the default ordering for this endpoint. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteCreatedAt  (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @return ApiResponse&lt;PaginatedBankInfoList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedBankInfoList> bankInfoListWithHttpInfo(String xAccountToken, String accountType, String bankName, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, UUID employee, String employeeId, Boolean includeDeletedData, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String orderBy, Integer pageSize, OffsetDateTime remoteCreatedAt, String remoteId) throws ApiException {
        okhttp3.Call localVarCall = bankInfoListValidateBeforeCall(xAccountToken, accountType, bankName, createdAfter, createdBefore, cursor, employee, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteCreatedAt, remoteId, null);
        Type localVarReturnType = new TypeToken<PaginatedBankInfoList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;BankInfo&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param accountType The bank account type: [CHECKING, SAVINGS] (optional)
     * @param bankName  (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employee If provided, will only return bank accounts for this employee. (optional)
     * @param employeeId If provided, will only return bank accounts for this employee. (optional)
     * @param includeDeletedData Whether to include data that was deleted in the third-party service. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param orderBy Overrides the default ordering for this endpoint. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteCreatedAt  (optional)
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
    public okhttp3.Call bankInfoListAsync(String xAccountToken, String accountType, String bankName, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, UUID employee, String employeeId, Boolean includeDeletedData, Boolean includeRemoteData, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, String orderBy, Integer pageSize, OffsetDateTime remoteCreatedAt, String remoteId, final ApiCallback<PaginatedBankInfoList> _callback) throws ApiException {

        okhttp3.Call localVarCall = bankInfoListValidateBeforeCall(xAccountToken, accountType, bankName, createdAfter, createdBefore, cursor, employee, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteCreatedAt, remoteId, _callback);
        Type localVarReturnType = new TypeToken<PaginatedBankInfoList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bankInfoRetrieve
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
    public okhttp3.Call bankInfoRetrieveCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bank-info/{id}"
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
    private okhttp3.Call bankInfoRetrieveValidateBeforeCall(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling bankInfoRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling bankInfoRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = bankInfoRetrieveCall(xAccountToken, id, includeRemoteData, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a &#x60;BankInfo&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return BankInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public BankInfo bankInfoRetrieve(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        ApiResponse<BankInfo> localVarResp = bankInfoRetrieveWithHttpInfo(xAccountToken, id, includeRemoteData);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a &#x60;BankInfo&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return ApiResponse&lt;BankInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BankInfo> bankInfoRetrieveWithHttpInfo(String xAccountToken, UUID id, Boolean includeRemoteData) throws ApiException {
        okhttp3.Call localVarCall = bankInfoRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, null);
        Type localVarReturnType = new TypeToken<BankInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a &#x60;BankInfo&#x60; object with the given &#x60;id&#x60;.
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
    public okhttp3.Call bankInfoRetrieveAsync(String xAccountToken, UUID id, Boolean includeRemoteData, final ApiCallback<BankInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = bankInfoRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, _callback);
        Type localVarReturnType = new TypeToken<BankInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
