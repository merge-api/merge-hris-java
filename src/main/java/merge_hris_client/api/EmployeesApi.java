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


import merge_hris_client.model.Employee;
import merge_hris_client.model.EmployeeRequest;
import org.threeten.bp.OffsetDateTime;
import merge_hris_client.model.PaginatedEmployeeList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesApi {
    private ApiClient localVarApiClient;

    public EmployeesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmployeesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for employeesCreate
     * @param xAccountToken Token identifying the end user. (required)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param employeeRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call employeesCreateCall(String xAccountToken, Boolean runAsync, EmployeeRequest employeeRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = employeeRequest;

        // create path and map variables
        String localVarPath = "/employees";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (runAsync != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("run_async", runAsync));
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
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call employeesCreateValidateBeforeCall(String xAccountToken, Boolean runAsync, EmployeeRequest employeeRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling employeesCreate(Async)");
        }
        

        okhttp3.Call localVarCall = employeesCreateCall(xAccountToken, runAsync, employeeRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Creates an &#x60;Employee&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param employeeRequest  (optional)
     * @return Employee
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Employee employeesCreate(String xAccountToken, Boolean runAsync, EmployeeRequest employeeRequest) throws ApiException {
        ApiResponse<Employee> localVarResp = employeesCreateWithHttpInfo(xAccountToken, runAsync, employeeRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates an &#x60;Employee&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param employeeRequest  (optional)
     * @return ApiResponse&lt;Employee&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Employee> employeesCreateWithHttpInfo(String xAccountToken, Boolean runAsync, EmployeeRequest employeeRequest) throws ApiException {
        okhttp3.Call localVarCall = employeesCreateValidateBeforeCall(xAccountToken, runAsync, employeeRequest, null);
        Type localVarReturnType = new TypeToken<Employee>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates an &#x60;Employee&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @param employeeRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call employeesCreateAsync(String xAccountToken, Boolean runAsync, EmployeeRequest employeeRequest, final ApiCallback<Employee> _callback) throws ApiException {

        okhttp3.Call localVarCall = employeesCreateValidateBeforeCall(xAccountToken, runAsync, employeeRequest, _callback);
        Type localVarReturnType = new TypeToken<Employee>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for employeesList
     * @param xAccountToken Token identifying the end user. (required)
     * @param companyId If provided, will only return employees for this company. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @param managerId If provided, will only return employees for this manager. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param personalEmail If provided, will only return Employees with this personal email (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param teamId If provided, will only return employees for this team. (optional)
     * @param workEmail If provided, will only return Employees with this work email (optional)
     * @param workLocationId If provided, will only return employees for this location. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call employeesListCall(String xAccountToken, String companyId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeRemoteData, Boolean includeSensitiveFields, String managerId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String personalEmail, String remoteId, String teamId, String workEmail, String workLocationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/employees";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (companyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("company_id", companyId));
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

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
        }

        if (includeSensitiveFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_sensitive_fields", includeSensitiveFields));
        }

        if (managerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("manager_id", managerId));
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

        if (personalEmail != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("personal_email", personalEmail));
        }

        if (remoteId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remote_id", remoteId));
        }

        if (teamId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("team_id", teamId));
        }

        if (workEmail != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("work_email", workEmail));
        }

        if (workLocationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("work_location_id", workLocationId));
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
    private okhttp3.Call employeesListValidateBeforeCall(String xAccountToken, String companyId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeRemoteData, Boolean includeSensitiveFields, String managerId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String personalEmail, String remoteId, String teamId, String workEmail, String workLocationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling employeesList(Async)");
        }
        

        okhttp3.Call localVarCall = employeesListCall(xAccountToken, companyId, createdAfter, createdBefore, cursor, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, personalEmail, remoteId, teamId, workEmail, workLocationId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;Employee&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param companyId If provided, will only return employees for this company. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @param managerId If provided, will only return employees for this manager. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param personalEmail If provided, will only return Employees with this personal email (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param teamId If provided, will only return employees for this team. (optional)
     * @param workEmail If provided, will only return Employees with this work email (optional)
     * @param workLocationId If provided, will only return employees for this location. (optional)
     * @return PaginatedEmployeeList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedEmployeeList employeesList(String xAccountToken, String companyId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeRemoteData, Boolean includeSensitiveFields, String managerId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String personalEmail, String remoteId, String teamId, String workEmail, String workLocationId) throws ApiException {
        ApiResponse<PaginatedEmployeeList> localVarResp = employeesListWithHttpInfo(xAccountToken, companyId, createdAfter, createdBefore, cursor, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, personalEmail, remoteId, teamId, workEmail, workLocationId);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;Employee&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param companyId If provided, will only return employees for this company. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @param managerId If provided, will only return employees for this manager. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param personalEmail If provided, will only return Employees with this personal email (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param teamId If provided, will only return employees for this team. (optional)
     * @param workEmail If provided, will only return Employees with this work email (optional)
     * @param workLocationId If provided, will only return employees for this location. (optional)
     * @return ApiResponse&lt;PaginatedEmployeeList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedEmployeeList> employeesListWithHttpInfo(String xAccountToken, String companyId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeRemoteData, Boolean includeSensitiveFields, String managerId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String personalEmail, String remoteId, String teamId, String workEmail, String workLocationId) throws ApiException {
        okhttp3.Call localVarCall = employeesListValidateBeforeCall(xAccountToken, companyId, createdAfter, createdBefore, cursor, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, personalEmail, remoteId, teamId, workEmail, workLocationId, null);
        Type localVarReturnType = new TypeToken<PaginatedEmployeeList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;Employee&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param companyId If provided, will only return employees for this company. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @param managerId If provided, will only return employees for this manager. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param personalEmail If provided, will only return Employees with this personal email (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param teamId If provided, will only return employees for this team. (optional)
     * @param workEmail If provided, will only return Employees with this work email (optional)
     * @param workLocationId If provided, will only return employees for this location. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call employeesListAsync(String xAccountToken, String companyId, OffsetDateTime createdAfter, OffsetDateTime createdBefore, String cursor, Boolean includeRemoteData, Boolean includeSensitiveFields, String managerId, OffsetDateTime modifiedAfter, OffsetDateTime modifiedBefore, Integer pageSize, String personalEmail, String remoteId, String teamId, String workEmail, String workLocationId, final ApiCallback<PaginatedEmployeeList> _callback) throws ApiException {

        okhttp3.Call localVarCall = employeesListValidateBeforeCall(xAccountToken, companyId, createdAfter, createdBefore, cursor, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, personalEmail, remoteId, teamId, workEmail, workLocationId, _callback);
        Type localVarReturnType = new TypeToken<PaginatedEmployeeList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for employeesRetrieve
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call employeesRetrieveCall(String xAccountToken, UUID id, Boolean includeRemoteData, Boolean includeSensitiveFields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/employees/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeRemoteData != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_remote_data", includeRemoteData));
        }

        if (includeSensitiveFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_sensitive_fields", includeSensitiveFields));
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
    private okhttp3.Call employeesRetrieveValidateBeforeCall(String xAccountToken, UUID id, Boolean includeRemoteData, Boolean includeSensitiveFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling employeesRetrieve(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling employeesRetrieve(Async)");
        }
        

        okhttp3.Call localVarCall = employeesRetrieveCall(xAccountToken, id, includeRemoteData, includeSensitiveFields, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns an &#x60;Employee&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @return Employee
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Employee employeesRetrieve(String xAccountToken, UUID id, Boolean includeRemoteData, Boolean includeSensitiveFields) throws ApiException {
        ApiResponse<Employee> localVarResp = employeesRetrieveWithHttpInfo(xAccountToken, id, includeRemoteData, includeSensitiveFields);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an &#x60;Employee&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @return ApiResponse&lt;Employee&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Employee> employeesRetrieveWithHttpInfo(String xAccountToken, UUID id, Boolean includeRemoteData, Boolean includeSensitiveFields) throws ApiException {
        okhttp3.Call localVarCall = employeesRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, includeSensitiveFields, null);
        Type localVarReturnType = new TypeToken<Employee>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an &#x60;Employee&#x60; object with the given &#x60;id&#x60;.
     * @param xAccountToken Token identifying the end user. (required)
     * @param id  (required)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param includeSensitiveFields Whether to include sensitive fields (such as social security numbers) in the response. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call employeesRetrieveAsync(String xAccountToken, UUID id, Boolean includeRemoteData, Boolean includeSensitiveFields, final ApiCallback<Employee> _callback) throws ApiException {

        okhttp3.Call localVarCall = employeesRetrieveValidateBeforeCall(xAccountToken, id, includeRemoteData, includeSensitiveFields, _callback);
        Type localVarReturnType = new TypeToken<Employee>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
