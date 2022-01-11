# BankInfoApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bankInfoList**](BankInfoApi.md#bankInfoList) | **GET** /bank-info | 
[**bankInfoRetrieve**](BankInfoApi.md#bankInfoRetrieve) | **GET** /bank-info/{id} | 


<a name="bankInfoList"></a>
# **bankInfoList**
> PaginatedBankInfoList bankInfoList(xAccountToken, accountType, bankName, createdAfter, createdBefore, cursor, employee, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteCreatedAt, remoteId)



Returns a list of &#x60;BankInfo&#x60; objects.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.BankInfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    BankInfoApi apiInstance = new BankInfoApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    String accountType = "accountType_example"; // String | The bank account type: [CHECKING, SAVINGS]
    String bankName = "bankName_example"; // String | 
    OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created after this datetime.
    OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects created before this datetime.
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    UUID employee = new UUID(); // UUID | If provided, will only return bank accounts for this employee.
    String employeeId = "employeeId_example"; // String | If provided, will only return bank accounts for this employee.
    Boolean includeDeletedData = true; // Boolean | Whether to include data that was deleted in the third-party service.
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    OffsetDateTime modifiedAfter = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified after this datetime.
    OffsetDateTime modifiedBefore = OffsetDateTime.now(); // OffsetDateTime | If provided, will only return objects modified before this datetime.
    String orderBy = "orderBy_example"; // String | Overrides the default ordering for this endpoint.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    OffsetDateTime remoteCreatedAt = OffsetDateTime.now(); // OffsetDateTime | 
    String remoteId = "remoteId_example"; // String | The API provider's ID for the given object.
    try {
      PaginatedBankInfoList result = apiInstance.bankInfoList(xAccountToken, accountType, bankName, createdAfter, createdBefore, cursor, employee, employeeId, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, orderBy, pageSize, remoteCreatedAt, remoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankInfoApi#bankInfoList");
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
 **accountType** | **String**| The bank account type: [CHECKING, SAVINGS] | [optional]
 **bankName** | **String**|  | [optional]
 **createdAfter** | **OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **employee** | [**UUID**](.md)| If provided, will only return bank accounts for this employee. | [optional]
 **employeeId** | **String**| If provided, will only return bank accounts for this employee. | [optional]
 **includeDeletedData** | **Boolean**| Whether to include data that was deleted in the third-party service. | [optional]
 **includeRemoteData** | **Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **orderBy** | **String**| Overrides the default ordering for this endpoint. | [optional] [enum: -remote_created_at, remote_created_at]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **remoteCreatedAt** | **OffsetDateTime**|  | [optional]
 **remoteId** | **String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedBankInfoList**](PaginatedBankInfoList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="bankInfoRetrieve"></a>
# **bankInfoRetrieve**
> BankInfo bankInfoRetrieve(xAccountToken, id, includeRemoteData)



Returns a &#x60;BankInfo&#x60; object with the given &#x60;id&#x60;.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.BankInfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    BankInfoApi apiInstance = new BankInfoApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    UUID id = new UUID(); // UUID | 
    Boolean includeRemoteData = true; // Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
    try {
      BankInfo result = apiInstance.bankInfoRetrieve(xAccountToken, id, includeRemoteData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankInfoApi#bankInfoRetrieve");
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

[**BankInfo**](BankInfo.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

