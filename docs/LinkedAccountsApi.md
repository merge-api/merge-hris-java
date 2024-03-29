# LinkedAccountsApi

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkedAccountsList**](LinkedAccountsApi.md#linkedAccountsList) | **GET** /linked-accounts | 


<a name="linkedAccountsList"></a>
# **linkedAccountsList**
> PaginatedAccountDetailsAndActionsList linkedAccountsList(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, integrationName, isTestAccount, pageSize, status)



List linked accounts for your organization.

### Example
```java
// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.LinkedAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    LinkedAccountsApi apiInstance = new LinkedAccountsApi(defaultClient);
    String category = "category_example"; // String | 
    String cursor = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw"; // String | The pagination cursor value.
    String endUserEmailAddress = "endUserEmailAddress_example"; // String | If provided, will only return linked accounts associated with the given email address.
    String endUserOrganizationName = "endUserOrganizationName_example"; // String | If provided, will only return linked accounts associated with the given organization name.
    String endUserOriginId = "endUserOriginId_example"; // String | If provided, will only return linked accounts associated with the given origin ID.
    String endUserOriginIds = "endUserOriginIds_example"; // String | Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once.
    UUID id = new UUID(); // UUID | 
    String ids = "ids_example"; // String | Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once.
    String integrationName = "integrationName_example"; // String | If provided, will only return linked accounts associated with the given integration name.
    String isTestAccount = "isTestAccount_example"; // String | If included, will only include test linked accounts. If not included, will only include non-test linked accounts.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String status = "status_example"; // String | Filter by status. Options: `COMPLETE`, `INCOMPLETE`, `RELINK_NEEDED`
    try {
      PaginatedAccountDetailsAndActionsList result = apiInstance.linkedAccountsList(category, cursor, endUserEmailAddress, endUserOrganizationName, endUserOriginId, endUserOriginIds, id, ids, integrationName, isTestAccount, pageSize, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkedAccountsApi#linkedAccountsList");
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
 **category** | **String**|  | [optional] [enum: accounting, ats, crm, hris, ticketing]
 **cursor** | **String**| The pagination cursor value. | [optional]
 **endUserEmailAddress** | **String**| If provided, will only return linked accounts associated with the given email address. | [optional]
 **endUserOrganizationName** | **String**| If provided, will only return linked accounts associated with the given organization name. | [optional]
 **endUserOriginId** | **String**| If provided, will only return linked accounts associated with the given origin ID. | [optional]
 **endUserOriginIds** | **String**| Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once. | [optional]
 **id** | [**UUID**](.md)|  | [optional]
 **ids** | **String**| Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once. | [optional]
 **integrationName** | **String**| If provided, will only return linked accounts associated with the given integration name. | [optional]
 **isTestAccount** | **String**| If included, will only include test linked accounts. If not included, will only include non-test linked accounts. | [optional]
 **pageSize** | **Integer**| Number of results to return per page. | [optional]
 **status** | **String**| Filter by status. Options: &#x60;COMPLETE&#x60;, &#x60;INCOMPLETE&#x60;, &#x60;RELINK_NEEDED&#x60; | [optional]

### Return type

[**PaginatedAccountDetailsAndActionsList**](PaginatedAccountDetailsAndActionsList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

