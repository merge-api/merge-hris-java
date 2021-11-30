# EmployeesApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeesCreate**](EmployeesApi.md#employeesCreate) | **POST** /employees | 
[**employeesList**](EmployeesApi.md#employeesList) | **GET** /employees | 
[**employeesRetrieve**](EmployeesApi.md#employeesRetrieve) | **GET** /employees/{id} | 


<a name="employeesCreate"></a>
# **employeesCreate**
> Employee employeesCreate(xAccountToken, runAsync, employeeRequest)



Creates an &#x60;Employee&#x60; object with the given values.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    Boolean runAsync = true; // Boolean | Whether or not third-party updates should be run asynchronously.
    EmployeeRequest employeeRequest = new EmployeeRequest(); // EmployeeRequest | 
    try {
      Employee result = apiInstance.employeesCreate(xAccountToken, runAsync, employeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#employeesCreate");
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
 **runAsync** | **Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]
 **employeeRequest** | [**EmployeeRequest**](EmployeeRequest.md)|  | [optional]

### Return type

[**Employee**](Employee.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="employeesList"></a>
# **employeesList**
> PaginatedEmployeeList employeesList(xAccountToken, companyId, createdAfter, createdBefore, cursor, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, personalEmail, remoteId, teamId, workEmail, workLocationId)



Returns a list of &#x60;Employee&#x60; objects.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String companyId = "companyId_example"; // String | If provided, will only return employees for this company.
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    Boolean includeSensitiveFields = true; // Boolean | Whether to include sensitive fields (such as social security numbers) in the response.
    String managerId = "managerId_example"; // String | If provided, will only return employees for this manager.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String personalEmail = "personalEmail_example"; // String | If provided, will only return Employees with this personal email
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    String teamId = "teamId_example"; // String | If provided, will only return employees for this team.
    String workEmail = "workEmail_example"; // String | If provided, will only return Employees with this work email
    String workLocationId = "workLocationId_example"; // String | If provided, will only return employees for this location.
    try {
      PaginatedEmployeeList result = apiInstance.employeesList(xAccountToken, companyId, createdAfter, createdBefore, cursor, includeRemoteData, includeSensitiveFields, managerId, modifiedAfter, modifiedBefore, pageSize, personalEmail, remoteId, teamId, workEmail, workLocationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#employeesList");
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
 **companyId** | **String**| If provided, will only return employees for this company. | [optional]
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeSensitiveFields** | **Boolean**| Whether to include sensitive fields (such as social security numbers) in the response. | [optional]
 **managerId** | **String**| If provided, will only return employees for this manager. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **personalEmail** | **String**| If provided, will only return Employees with this personal email | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]
 **teamId** | **String**| If provided, will only return employees for this team. | [optional]
 **workEmail** | **String**| If provided, will only return Employees with this work email | [optional]
 **workLocationId** | **String**| If provided, will only return employees for this location. | [optional]

### Return type

[**PaginatedEmployeeList**](PaginatedEmployeeList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="employeesRetrieve"></a>
# **employeesRetrieve**
> Employee employeesRetrieve(xAccountToken, id, includeRemoteData, includeSensitiveFields)



Returns an &#x60;Employee&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.EmployeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EmployeesApi apiInstance = new EmployeesApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = UUID.randomUUID(); // UUID | 
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    Boolean includeSensitiveFields = true; // Boolean | Whether to include sensitive fields (such as social security numbers) in the response.
    try {
      Employee result = apiInstance.employeesRetrieve(xAccountToken, id, includeRemoteData, includeSensitiveFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#employeesRetrieve");
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
 **id** | **UUID**|  |
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **includeSensitiveFields** | **Boolean**| Whether to include sensitive fields (such as social security numbers) in the response. | [optional]

### Return type

[**Employee**](Employee.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

