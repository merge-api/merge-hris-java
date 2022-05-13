

# TimeOffBalance

# The TimeOffBalance Object ### Description The `TimeOffBalance` object is used to represent a Time Off Balance for an employee.  ### Usage Example Fetch from the `LIST TimeOffBalances` endpoint and filter by `ID` to show all time off balances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** |  |  [optional]
**balance** | **Float** | The current remaining PTO balance in terms of hours. This does not represent the starting PTO balance. If the API provider only provides PTO balance in terms of days, we estimate 8 hours per day. |  [optional]
**used** | **Float** | The amount of PTO used in terms of hours. |  [optional]
**policyType** | [**PolicyTypeEnum**](PolicyTypeEnum.md) | The policy type of this time off balance. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **Boolean** | Indicates whether or not this object has been deleted on the third-party. |  [optional] [readonly]



