

# DataPassthroughRequest

# The DataPassthrough Object ### Description The `DataPassthrough` object is used to send information to an otherwise-unsupported third-party endpoint.  ### Usage Example Create a `DataPassthrough` to get team hierarchies from your Rippling integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | [**MethodEnum**](MethodEnum.md) |  | 
**path** | **String** |  | 
**baseUrlOverride** | **String** |  |  [optional]
**data** | **String** |  |  [optional]
**multipartFormData** | [**List&lt;MultipartFormFieldRequest&gt;**](MultipartFormFieldRequest.md) | Pass an array of &#x60;MultipartFormField&#x60; objects in here instead of using the &#x60;data&#x60; param if &#x60;request_format&#x60; is set to &#x60;MULTIPART&#x60;. |  [optional]
**headers** | **Map&lt;String, Object&gt;** |  |  [optional]
**requestFormat** | [**RequestFormatEnum**](RequestFormatEnum.md) |  |  [optional]



