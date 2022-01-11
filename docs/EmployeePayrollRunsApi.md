# EmployeePayrollRunsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeePayrollRunsList**](EmployeePayrollRunsApi.md#employeePayrollRunsList) | **GET** /employee-payroll-runs | 
[**employeePayrollRunsRetrieve**](EmployeePayrollRunsApi.md#employeePayrollRunsRetrieve) | **GET** /employee-payroll-runs/{id} | 


<a name="employeePayrollRunsList"></a>
# **employeePayrollRunsList**
> PaginatedEmployeePayrollRunList employeePayrollRunsList(xAccountToken, createdAfter, createdBefore, cursor, employeeId, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, payrollRunId, remoteId, startedAfter, startedBefore)



Returns a list of &#x60;EmployeePayrollRun&#x60; objects.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.EmployeePayrollRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeePayrollRunsApi apiInstance = new EmployeePayrollRunsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    String employeeId = "employeeId_example"; // String | If provided, will only return employee payroll runs for this employee.
    OffsetDateTime endedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return employee payroll runs ended after this datetime.
    OffsetDateTime endedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return employee payroll runs ended before this datetime.
    Boolean includeDeletedData = true; // Boolean | Whether to include data that was deleted in the third-party service.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String payrollRunId = "payrollRunId_example"; // String | If provided, will only return employee payroll runs for this employee.
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    OffsetDateTime startedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return employee payroll runs started after this datetime.
    OffsetDateTime startedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return employee payroll runs started before this datetime.
    try {
      PaginatedEmployeePayrollRunList result = apiInstance.employeePayrollRunsList(xAccountToken, createdAfter, createdBefore, cursor, employeeId, endedAfter, endedBefore, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, payrollRunId, remoteId, startedAfter, startedBefore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayrollRunsApi#employeePayrollRunsList");
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
 **employeeId** | **String**| If provided, will only return employee payroll runs for this employee. | [optional]
 **endedAfter** | **OffsetDateTime**| If provided, will only return employee payroll runs ended after this datetime. | [optional]
 **endedBefore** | **OffsetDateTime**| If provided, will only return employee payroll runs ended before this datetime. | [optional]
 **includeDeletedData** | **Boolean**| Whether to include data that was deleted in the third-party service. | [optional]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **payrollRunId** | **String**| If provided, will only return employee payroll runs for this employee. | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]
 **startedAfter** | **OffsetDateTime**| If provided, will only return employee payroll runs started after this datetime. | [optional]
 **startedBefore** | **OffsetDateTime**| If provided, will only return employee payroll runs started before this datetime. | [optional]

### Return type

[**PaginatedEmployeePayrollRunList**](PaginatedEmployeePayrollRunList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="employeePayrollRunsRetrieve"></a>
# **employeePayrollRunsRetrieve**
> EmployeePayrollRun employeePayrollRunsRetrieve(xAccountToken, id, includeRemoteData)



Returns an &#x60;EmployeePayrollRun&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.EmployeePayrollRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeePayrollRunsApi apiInstance = new EmployeePayrollRunsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    try {
      EmployeePayrollRun result = apiInstance.employeePayrollRunsRetrieve(xAccountToken, id, includeRemoteData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayrollRunsApi#employeePayrollRunsRetrieve");
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

[**EmployeePayrollRun**](EmployeePayrollRun.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

