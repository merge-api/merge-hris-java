# PayrollRunsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payrollRunsList**](PayrollRunsApi.md#payrollRunsList) | **GET** /payroll-runs | 
[**payrollRunsRetrieve**](PayrollRunsApi.md#payrollRunsRetrieve) | **GET** /payroll-runs/{id} | 


<a name="payrollRunsList"></a>
# **payrollRunsList**
> PaginatedPayrollRunList payrollRunsList(xAccountToken, createdAfter, createdBefore, cursor, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, runType, startedAfter, startedBefore)



Returns a list of &#x60;PayrollRun&#x60; objects.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.PayrollRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    PayrollRunsApi apiInstance = new PayrollRunsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    OffsetDateTime endedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return payroll runs ended after this datetime.
    OffsetDateTime endedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return payroll runs ended before this datetime.
    Boolean includeDeletedData = true; // Boolean | Whether to include data that was deleted in the third-party service.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    String runType = "runType_example"; // String | If provided, will only return PayrollRun's with this status. Options: ('REGULAR', 'OFF_CYCLE', 'CORRECTION', 'TERMINATION', 'SIGN_ON_BONUS')
    OffsetDateTime startedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return payroll runs started after this datetime.
    OffsetDateTime startedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return payroll runs started before this datetime.
    try {
      PaginatedPayrollRunList result = apiInstance.payrollRunsList(xAccountToken, createdAfter, createdBefore, cursor, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId, runType, startedAfter, startedBefore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollRunsApi#payrollRunsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountToken** | **String**| Token identifying the end user. |
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **endedAfter** | **OffsetDateTime**| If provided, will only return payroll runs ended after this datetime. | [optional]
 **endedBefore** | **OffsetDateTime**| If provided, will only return payroll runs ended before this datetime. | [optional]
 **includeDeletedData** | **Boolean**| Whether to include data that was deleted in the third-party service. | [optional]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]
 **runType** | **String**| If provided, will only return PayrollRun&#39;s with this status. Options: (&#39;REGULAR&#39;, &#39;OFF_CYCLE&#39;, &#39;CORRECTION&#39;, &#39;TERMINATION&#39;, &#39;SIGN_ON_BONUS&#39;) | [optional] [enum: CORRECTION, OFF_CYCLE, REGULAR, SIGN_ON_BONUS, TERMINATION]
 **startedAfter** | **OffsetDateTime**| If provided, will only return payroll runs started after this datetime. | [optional]
 **startedBefore** | **OffsetDateTime**| If provided, will only return payroll runs started before this datetime. | [optional]

### Return type

[**PaginatedPayrollRunList**](PaginatedPayrollRunList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="payrollRunsRetrieve"></a>
# **payrollRunsRetrieve**
> PayrollRun payrollRunsRetrieve(xAccountToken, id, includeRemoteData)



Returns a &#x60;PayrollRun&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.PayrollRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    PayrollRunsApi apiInstance = new PayrollRunsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    try {
      PayrollRun result = apiInstance.payrollRunsRetrieve(xAccountToken, id, includeRemoteData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollRunsApi#payrollRunsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccountToken** | **String**| Token identifying the end user. |
 **id** | [**UUID**](.md)|  |
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**PayrollRun**](PayrollRun.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

