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


import merge_hris_client.model.GenerateRemoteKeyRequest;
import merge_hris_client.model.RemoteKey;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateKeyApi {
    private ApiClient localVarApiClient;

    public GenerateKeyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GenerateKeyApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for generateKeyCreate
     * @param generateRemoteKeyRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateKeyCreateCall(GenerateRemoteKeyRequest generateRemoteKeyRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = generateRemoteKeyRequest;

        // create path and map variables
        String localVarPath = "/generate-key";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call generateKeyCreateValidateBeforeCall(GenerateRemoteKeyRequest generateRemoteKeyRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'generateRemoteKeyRequest' is set
        if (generateRemoteKeyRequest == null) {
            throw new ApiException("Missing the required parameter 'generateRemoteKeyRequest' when calling generateKeyCreate(Async)");
        }
        

        okhttp3.Call localVarCall = generateKeyCreateCall(generateRemoteKeyRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create a remote key.
     * @param generateRemoteKeyRequest  (required)
     * @return RemoteKey
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public RemoteKey generateKeyCreate(GenerateRemoteKeyRequest generateRemoteKeyRequest) throws ApiException {
        ApiResponse<RemoteKey> localVarResp = generateKeyCreateWithHttpInfo(generateRemoteKeyRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a remote key.
     * @param generateRemoteKeyRequest  (required)
     * @return ApiResponse&lt;RemoteKey&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RemoteKey> generateKeyCreateWithHttpInfo(GenerateRemoteKeyRequest generateRemoteKeyRequest) throws ApiException {
        okhttp3.Call localVarCall = generateKeyCreateValidateBeforeCall(generateRemoteKeyRequest, null);
        Type localVarReturnType = new TypeToken<RemoteKey>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a remote key.
     * @param generateRemoteKeyRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateKeyCreateAsync(GenerateRemoteKeyRequest generateRemoteKeyRequest, final ApiCallback<RemoteKey> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateKeyCreateValidateBeforeCall(generateRemoteKeyRequest, _callback);
        Type localVarReturnType = new TypeToken<RemoteKey>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
