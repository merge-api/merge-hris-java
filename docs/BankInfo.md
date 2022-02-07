

# BankInfo

# The BankInfo Object ### Description The `BankInfo` object is used to represent the Bank Account information for an Employee. This is often referenced with an Employee object.  ### Usage Example Fetch from the `LIST BankInfo` endpoint and filter by `ID` to show all bank information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employee** | **UUID** |  |  [optional]
**accountNumber** | **String** | The account number. |  [optional]
**routingNumber** | **String** | The routing number. |  [optional]
**bankName** | **String** | The bank name. |  [optional]
**accountType** | [**AccountTypeEnum**](AccountTypeEnum.md) | The bank account type |  [optional]
**remoteCreatedAt** | **OffsetDateTime** | When the matching bank object was created in the third party system. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



