

# Benefit

# The Benefit Object ### Description The `Benefit` object is used to represent a Benefit for an employee.  ### Usage Example Fetch from the `LIST Benefits` endpoint and filter by `ID` to show all benefits.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** |  |  [optional]
**providerName** | **String** | The name of the benefit provider. |  [optional]
**benefitPlanType** | **String** | The type of benefit plan |  [optional]
**employeeContribution** | **Float** | The employee&#39;s contribution. |  [optional]
**companyContribution** | **Float** | The company&#39;s contribution. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **Boolean** | Indicates whether or not this object has been deleted on the third-party. |  [optional] [readonly]



