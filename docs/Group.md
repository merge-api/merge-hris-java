

# Group

# The Group Object ### Description The `Group` object is used to represent Group information that employees belong to. This is often referenced with an Employee object.  ### Usage Example Fetch from the `LIST Employee` endpoint and expand groups to view an employee's groups.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**parentGroup** | **UUID** | The parent group for this group. |  [optional]
**name** | **String** | The group name. |  [optional]
**type** | [**GroupTypeEnum**](GroupTypeEnum.md) | The group type |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]



