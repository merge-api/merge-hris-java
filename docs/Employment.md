

# Employment

# The Employment Object ### Description The `Employment` object is used to represent an employment position at a company. These are associated with the employee filling the role.  Please note: Employment objects are constructed if the object does not exist in the remote system.  ### Usage Example Fetch from the `LIST Employments` endpoint and filter by `ID` to show all employees.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** |  |  [optional]
**jobTitle** | **String** | The position&#39;s title. |  [optional]
**payRate** | **Float** | The position&#39;s pay rate in dollars. |  [optional]
**payPeriod** | [**PayPeriodEnum**](PayPeriodEnum.md) | The time period this pay rate encompasses. |  [optional]
**payFrequency** | [**PayFrequencyEnum**](PayFrequencyEnum.md) | The position&#39;s pay frequency. |  [optional]
**payCurrency** | [**PayCurrencyEnum**](PayCurrencyEnum.md) | The position&#39;s currency code. |  [optional]
**payGroup** | **UUID** |  |  [optional]
**flsaStatus** | [**FlsaStatusEnum**](FlsaStatusEnum.md) | The position&#39;s FLSA status. |  [optional]
**effectiveDate** | **OffsetDateTime** | The position&#39;s effective date. |  [optional]
**employmentType** | [**EmploymentTypeEnum**](EmploymentTypeEnum.md) | The position&#39;s type of employment. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



