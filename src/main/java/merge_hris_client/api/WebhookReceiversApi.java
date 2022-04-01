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


import merge_hris_client.model.WebhookReceiver;
import merge_hris_client.model.WebhookReceiverRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookReceiversApi {
    private ApiClient localVarApiClient;

    public WebhookReceiversApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookReceiversApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for webhookReceiversCreate
     * @param xAccountToken Token identifying the end user. (required)
     * @param webhookReceiverRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookReceiversCreateCall(String xAccountToken, WebhookReceiverRequest webhookReceiverRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = webhookReceiverRequest;

        // create path and map variables
        String localVarPath = "/webhook-receivers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call webhookReceiversCreateValidateBeforeCall(String xAccountToken, WebhookReceiverRequest webhookReceiverRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling webhookReceiversCreate(Async)");
        }
        
        // verify the required parameter 'webhookReceiverRequest' is set
        if (webhookReceiverRequest == null) {
            throw new ApiException("Missing the required parameter 'webhookReceiverRequest' when calling webhookReceiversCreate(Async)");
        }
        

        okhttp3.Call localVarCall = webhookReceiversCreateCall(xAccountToken, webhookReceiverRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Creates a &#x60;WebhookReceiver&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param webhookReceiverRequest  (required)
     * @return WebhookReceiver
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public WebhookReceiver webhookReceiversCreate(String xAccountToken, WebhookReceiverRequest webhookReceiverRequest) throws ApiException {
        ApiResponse<WebhookReceiver> localVarResp = webhookReceiversCreateWithHttpInfo(xAccountToken, webhookReceiverRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates a &#x60;WebhookReceiver&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param webhookReceiverRequest  (required)
     * @return ApiResponse&lt;WebhookReceiver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WebhookReceiver> webhookReceiversCreateWithHttpInfo(String xAccountToken, WebhookReceiverRequest webhookReceiverRequest) throws ApiException {
        okhttp3.Call localVarCall = webhookReceiversCreateValidateBeforeCall(xAccountToken, webhookReceiverRequest, null);
        Type localVarReturnType = new TypeToken<WebhookReceiver>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a &#x60;WebhookReceiver&#x60; object with the given values.
     * @param xAccountToken Token identifying the end user. (required)
     * @param webhookReceiverRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookReceiversCreateAsync(String xAccountToken, WebhookReceiverRequest webhookReceiverRequest, final ApiCallback<WebhookReceiver> _callback) throws ApiException {

        okhttp3.Call localVarCall = webhookReceiversCreateValidateBeforeCall(xAccountToken, webhookReceiverRequest, _callback);
        Type localVarReturnType = new TypeToken<WebhookReceiver>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for webhookReceiversList
     * @param xAccountToken Token identifying the end user. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookReceiversListCall(String xAccountToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhook-receivers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call webhookReceiversListValidateBeforeCall(String xAccountToken, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xAccountToken' is set
        if (xAccountToken == null) {
            throw new ApiException("Missing the required parameter 'xAccountToken' when calling webhookReceiversList(Async)");
        }
        

        okhttp3.Call localVarCall = webhookReceiversListCall(xAccountToken, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of &#x60;WebhookReceiver&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @return List&lt;WebhookReceiver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<WebhookReceiver> webhookReceiversList(String xAccountToken) throws ApiException {
        ApiResponse<List<WebhookReceiver>> localVarResp = webhookReceiversListWithHttpInfo(xAccountToken);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of &#x60;WebhookReceiver&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @return ApiResponse&lt;List&lt;WebhookReceiver&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<WebhookReceiver>> webhookReceiversListWithHttpInfo(String xAccountToken) throws ApiException {
        okhttp3.Call localVarCall = webhookReceiversListValidateBeforeCall(xAccountToken, null);
        Type localVarReturnType = new TypeToken<List<WebhookReceiver>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of &#x60;WebhookReceiver&#x60; objects.
     * @param xAccountToken Token identifying the end user. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call webhookReceiversListAsync(String xAccountToken, final ApiCallback<List<WebhookReceiver>> _callback) throws ApiException {

        okhttp3.Call localVarCall = webhookReceiversListValidateBeforeCall(xAccountToken, _callback);
        Type localVarReturnType = new TypeToken<List<WebhookReceiver>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
