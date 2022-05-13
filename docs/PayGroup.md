

# PayGroup

# The PayGroup Object ### Description The `PayGroup` object is used to represent Pay Group information that employees belong to. This is often referenced with an Employee object.  ### Usage Example Fetch from the `LIST PayGroup` endpoint and filter by `ID` to show all pay group information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**payGroupName** | **String** | The pay group name. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **Boolean** | Indicates whether or not this object has been deleted on the third-party. |  [optional] [readonly]



