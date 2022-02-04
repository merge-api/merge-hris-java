

# Employee

# The Employee Object ### Description The `Employee` object is used to represent an Employee for a company.  ### Usage Example Fetch from the `LIST Employee` endpoint and filter by `ID` to show all employees.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**remoteId** | **String** | The third-party API ID of the matching object. |  [optional]
**employeeNumber** | **String** | The employee&#39;s number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user. |  [optional]
**company** | **UUID** |  |  [optional]
**firstName** | **String** | The employee&#39;s first name. |  [optional]
**lastName** | **String** | The employee&#39;s last name. |  [optional]
**displayFullName** | **String** | The employee&#39;s full name, to use for display purposes. If a preferred first name is available, the full name will include the preferred first name. |  [optional]
**workEmail** | **String** | The employee&#39;s work email. |  [optional]
**personalEmail** | **String** | The employee&#39;s personal email. |  [optional]
**mobilePhoneNumber** | **String** | The employee&#39;s mobile phone number. |  [optional]
**employments** | **List&lt;UUID&gt;** | Array of &#x60;Employment&#x60; IDs for this Employee. |  [optional]
**homeLocation** | **UUID** |  |  [optional]
**workLocation** | **UUID** |  |  [optional]
**manager** | **UUID** |  |  [optional]
**team** | **UUID** |  |  [optional]
**payGroup** | **UUID** |  |  [optional]
**ssn** | **String** | The employee&#39;s social security number. |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The employee&#39;s gender. |  [optional]
**ethnicity** | [**EthnicityEnum**](EthnicityEnum.md) | The employee&#39;s ethnicity. |  [optional]
**maritalStatus** | [**MaritalStatusEnum**](MaritalStatusEnum.md) | The employee&#39;s marital status. |  [optional]
**dateOfBirth** | **OffsetDateTime** | The employee&#39;s date of birth. |  [optional]
**hireDate** | **OffsetDateTime** | The date that the employee was hired, usually the day that an offer letter is signed. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. Note: If you&#39;re looking for the employee&#39;s start date, refer to the start_date field. |  [optional]
**startDate** | **OffsetDateTime** | The date that the employee started working. If an employee has multiple start dates from previous employments, this represents the most recent start date. |  [optional]
**employmentStatus** | [**EmploymentStatusEnum**](EmploymentStatusEnum.md) | The employment status of the employee. |  [optional]
**terminationDate** | **OffsetDateTime** | The employee&#39;s termination date. |  [optional]
**avatar** | **URI** | The URL of the employee&#39;s avatar image. |  [optional]
**remoteData** | [**List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**customFields** | **Map&lt;String, Object&gt;** | Custom fields configured for a given model. |  [optional]



