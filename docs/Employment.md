

# Employment

# The Employment Object ### Description The `Employment` object is used to represent an employment position at a company. These are associated with the employee filling the role.  ### Usage Example Fetch from the `LIST Employments` endpoint and filter by `ID` to show all employees.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**jobTitle** | **String** | The position&#39;s title. |  [optional]
**payRate** | **Float** | The position&#39;s pay rate in dollars. |  [optional]
**payPeriod** | **String** |  |  [optional] [readonly]
**payFrequency** | **String** |  |  [optional] [readonly]
**payCurrency** | **String** |  |  [optional] [readonly]
**flsaStatus** | **String** |  |  [optional] [readonly]
**effectiveDate** | **OffsetDateTime** | The position&#39;s effective date. |  [optional]
**employmentType** | **String** |  |  [optional] [readonly]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



