# merge-hris-client

Merge HRIS API
- API version: 1.0
  - Build date: 2022-05-12T20:57:27.935941Z[Etc/UTC]

The unified API for building rich integrations with multiple HR Information System platforms.

  For more information, please visit [https://www.merge.dev/](https://www.merge.dev/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>dev.merge.hris</groupId>
  <artifactId>merge-hris-client</artifactId>
  <version>1.4.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "dev.merge.hris:merge-hris-client:1.4.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/merge-hris-client-1.4.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.models.*;
import merge_hris_client.api.AccountDetailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.merge.dev/api/hris/v1");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    AccountDetailsApi apiInstance = new AccountDetailsApi(defaultClient);
    String xAccountToken = "xAccountToken_example"; // String | Token identifying the end user.
    try {
      AccountDetails result = apiInstance.accountDetailsRetrieve(xAccountToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDetailsApi#accountDetailsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.merge.dev/api/hris/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountDetailsApi* | [**accountDetailsRetrieve**](docs/AccountDetailsApi.md#accountDetailsRetrieve) | **GET** /account-details | 
*AccountTokenApi* | [**accountTokenRetrieve**](docs/AccountTokenApi.md#accountTokenRetrieve) | **GET** /account-token/{public_token} | 
*AvailableActionsApi* | [**availableActionsRetrieve**](docs/AvailableActionsApi.md#availableActionsRetrieve) | **GET** /available-actions | 
*BankInfoApi* | [**bankInfoList**](docs/BankInfoApi.md#bankInfoList) | **GET** /bank-info | 
*BankInfoApi* | [**bankInfoRetrieve**](docs/BankInfoApi.md#bankInfoRetrieve) | **GET** /bank-info/{id} | 
*BenefitsApi* | [**benefitsList**](docs/BenefitsApi.md#benefitsList) | **GET** /benefits | 
*BenefitsApi* | [**benefitsRetrieve**](docs/BenefitsApi.md#benefitsRetrieve) | **GET** /benefits/{id} | 
*CompaniesApi* | [**companiesList**](docs/CompaniesApi.md#companiesList) | **GET** /companies | 
*CompaniesApi* | [**companiesRetrieve**](docs/CompaniesApi.md#companiesRetrieve) | **GET** /companies/{id} | 
*DeductionsApi* | [**deductionsList**](docs/DeductionsApi.md#deductionsList) | **GET** /deductions | 
*DeductionsApi* | [**deductionsRetrieve**](docs/DeductionsApi.md#deductionsRetrieve) | **GET** /deductions/{id} | 
*DeleteAccountApi* | [**deleteAccountCreate**](docs/DeleteAccountApi.md#deleteAccountCreate) | **POST** /delete-account | 
*EmployeePayrollRunsApi* | [**employeePayrollRunsList**](docs/EmployeePayrollRunsApi.md#employeePayrollRunsList) | **GET** /employee-payroll-runs | 
*EmployeePayrollRunsApi* | [**employeePayrollRunsRetrieve**](docs/EmployeePayrollRunsApi.md#employeePayrollRunsRetrieve) | **GET** /employee-payroll-runs/{id} | 
*EmployeesApi* | [**employeesCreate**](docs/EmployeesApi.md#employeesCreate) | **POST** /employees | 
*EmployeesApi* | [**employeesIgnoreCreate**](docs/EmployeesApi.md#employeesIgnoreCreate) | **POST** /employees/ignore/{model_id} | 
*EmployeesApi* | [**employeesList**](docs/EmployeesApi.md#employeesList) | **GET** /employees | 
*EmployeesApi* | [**employeesMetaPostRetrieve**](docs/EmployeesApi.md#employeesMetaPostRetrieve) | **GET** /employees/meta/post | 
*EmployeesApi* | [**employeesRetrieve**](docs/EmployeesApi.md#employeesRetrieve) | **GET** /employees/{id} | 
*EmploymentsApi* | [**employmentsList**](docs/EmploymentsApi.md#employmentsList) | **GET** /employments | 
*EmploymentsApi* | [**employmentsRetrieve**](docs/EmploymentsApi.md#employmentsRetrieve) | **GET** /employments/{id} | 
*ForceResyncApi* | [**syncStatusResyncCreate**](docs/ForceResyncApi.md#syncStatusResyncCreate) | **POST** /sync-status/resync | 
*GenerateKeyApi* | [**generateKeyCreate**](docs/GenerateKeyApi.md#generateKeyCreate) | **POST** /generate-key | 
*GroupsApi* | [**groupsList**](docs/GroupsApi.md#groupsList) | **GET** /groups | 
*GroupsApi* | [**groupsRetrieve**](docs/GroupsApi.md#groupsRetrieve) | **GET** /groups/{id} | 
*IssuesApi* | [**issuesList**](docs/IssuesApi.md#issuesList) | **GET** /issues | 
*IssuesApi* | [**issuesRetrieve**](docs/IssuesApi.md#issuesRetrieve) | **GET** /issues/{id} | 
*LinkTokenApi* | [**linkTokenCreate**](docs/LinkTokenApi.md#linkTokenCreate) | **POST** /link-token | 
*LinkedAccountsApi* | [**linkedAccountsList**](docs/LinkedAccountsApi.md#linkedAccountsList) | **GET** /linked-accounts | 
*LocationsApi* | [**locationsList**](docs/LocationsApi.md#locationsList) | **GET** /locations | 
*LocationsApi* | [**locationsRetrieve**](docs/LocationsApi.md#locationsRetrieve) | **GET** /locations/{id} | 
*PassthroughApi* | [**passthroughCreate**](docs/PassthroughApi.md#passthroughCreate) | **POST** /passthrough | 
*PayGroupsApi* | [**payGroupsList**](docs/PayGroupsApi.md#payGroupsList) | **GET** /pay-groups | 
*PayGroupsApi* | [**payGroupsRetrieve**](docs/PayGroupsApi.md#payGroupsRetrieve) | **GET** /pay-groups/{id} | 
*PayrollRunsApi* | [**payrollRunsList**](docs/PayrollRunsApi.md#payrollRunsList) | **GET** /payroll-runs | 
*PayrollRunsApi* | [**payrollRunsRetrieve**](docs/PayrollRunsApi.md#payrollRunsRetrieve) | **GET** /payroll-runs/{id} | 
*RegenerateKeyApi* | [**regenerateKeyCreate**](docs/RegenerateKeyApi.md#regenerateKeyCreate) | **POST** /regenerate-key | 
*SyncStatusApi* | [**syncStatusList**](docs/SyncStatusApi.md#syncStatusList) | **GET** /sync-status | 
*TeamsApi* | [**teamsList**](docs/TeamsApi.md#teamsList) | **GET** /teams | 
*TeamsApi* | [**teamsRetrieve**](docs/TeamsApi.md#teamsRetrieve) | **GET** /teams/{id} | 
*TimeOffApi* | [**timeOffCreate**](docs/TimeOffApi.md#timeOffCreate) | **POST** /time-off | 
*TimeOffApi* | [**timeOffList**](docs/TimeOffApi.md#timeOffList) | **GET** /time-off | 
*TimeOffApi* | [**timeOffMetaPostRetrieve**](docs/TimeOffApi.md#timeOffMetaPostRetrieve) | **GET** /time-off/meta/post | 
*TimeOffApi* | [**timeOffRetrieve**](docs/TimeOffApi.md#timeOffRetrieve) | **GET** /time-off/{id} | 
*TimeOffBalancesApi* | [**timeOffBalancesList**](docs/TimeOffBalancesApi.md#timeOffBalancesList) | **GET** /time-off-balances | 
*TimeOffBalancesApi* | [**timeOffBalancesRetrieve**](docs/TimeOffBalancesApi.md#timeOffBalancesRetrieve) | **GET** /time-off-balances/{id} | 
*WebhookReceiversApi* | [**webhookReceiversCreate**](docs/WebhookReceiversApi.md#webhookReceiversCreate) | **POST** /webhook-receivers | 
*WebhookReceiversApi* | [**webhookReceiversList**](docs/WebhookReceiversApi.md#webhookReceiversList) | **GET** /webhook-receivers | 


## Documentation for Models

 - [AccountDetails](docs/AccountDetails.md)
 - [AccountDetailsAndActions](docs/AccountDetailsAndActions.md)
 - [AccountDetailsAndActionsIntegration](docs/AccountDetailsAndActionsIntegration.md)
 - [AccountDetailsAndActionsStatusEnum](docs/AccountDetailsAndActionsStatusEnum.md)
 - [AccountIntegration](docs/AccountIntegration.md)
 - [AccountToken](docs/AccountToken.md)
 - [AccountTypeEnum](docs/AccountTypeEnum.md)
 - [AvailableActions](docs/AvailableActions.md)
 - [BankInfo](docs/BankInfo.md)
 - [Benefit](docs/Benefit.md)
 - [CategoriesEnum](docs/CategoriesEnum.md)
 - [CategoryEnum](docs/CategoryEnum.md)
 - [Company](docs/Company.md)
 - [CountryEnum](docs/CountryEnum.md)
 - [DataPassthroughRequest](docs/DataPassthroughRequest.md)
 - [DebugModeLog](docs/DebugModeLog.md)
 - [DebugModelLogSummary](docs/DebugModelLogSummary.md)
 - [Deduction](docs/Deduction.md)
 - [Earning](docs/Earning.md)
 - [EarningTypeEnum](docs/EarningTypeEnum.md)
 - [Employee](docs/Employee.md)
 - [EmployeeEndpointRequest](docs/EmployeeEndpointRequest.md)
 - [EmployeePayrollRun](docs/EmployeePayrollRun.md)
 - [EmployeeRequest](docs/EmployeeRequest.md)
 - [EmployeeResponse](docs/EmployeeResponse.md)
 - [Employment](docs/Employment.md)
 - [EmploymentStatusEnum](docs/EmploymentStatusEnum.md)
 - [EmploymentTypeEnum](docs/EmploymentTypeEnum.md)
 - [EncodingEnum](docs/EncodingEnum.md)
 - [EndUserDetailsRequest](docs/EndUserDetailsRequest.md)
 - [ErrorValidationProblem](docs/ErrorValidationProblem.md)
 - [EthnicityEnum](docs/EthnicityEnum.md)
 - [FlsaStatusEnum](docs/FlsaStatusEnum.md)
 - [GenderEnum](docs/GenderEnum.md)
 - [GenerateRemoteKeyRequest](docs/GenerateRemoteKeyRequest.md)
 - [Group](docs/Group.md)
 - [GroupTypeEnum](docs/GroupTypeEnum.md)
 - [IgnoreCommonModel](docs/IgnoreCommonModel.md)
 - [IgnoreCommonModelRequest](docs/IgnoreCommonModelRequest.md)
 - [Issue](docs/Issue.md)
 - [IssueStatusEnum](docs/IssueStatusEnum.md)
 - [LinkToken](docs/LinkToken.md)
 - [LinkedAccountStatus](docs/LinkedAccountStatus.md)
 - [Location](docs/Location.md)
 - [LocationTypeEnum](docs/LocationTypeEnum.md)
 - [MaritalStatusEnum](docs/MaritalStatusEnum.md)
 - [MetaResponse](docs/MetaResponse.md)
 - [MethodEnum](docs/MethodEnum.md)
 - [ModelOperation](docs/ModelOperation.md)
 - [MultipartFormFieldRequest](docs/MultipartFormFieldRequest.md)
 - [PaginatedAccountDetailsAndActionsList](docs/PaginatedAccountDetailsAndActionsList.md)
 - [PaginatedBankInfoList](docs/PaginatedBankInfoList.md)
 - [PaginatedBenefitList](docs/PaginatedBenefitList.md)
 - [PaginatedCompanyList](docs/PaginatedCompanyList.md)
 - [PaginatedDeductionList](docs/PaginatedDeductionList.md)
 - [PaginatedEmployeeList](docs/PaginatedEmployeeList.md)
 - [PaginatedEmployeePayrollRunList](docs/PaginatedEmployeePayrollRunList.md)
 - [PaginatedEmploymentList](docs/PaginatedEmploymentList.md)
 - [PaginatedGroupList](docs/PaginatedGroupList.md)
 - [PaginatedIssueList](docs/PaginatedIssueList.md)
 - [PaginatedLocationList](docs/PaginatedLocationList.md)
 - [PaginatedPayGroupList](docs/PaginatedPayGroupList.md)
 - [PaginatedPayrollRunList](docs/PaginatedPayrollRunList.md)
 - [PaginatedSyncStatusList](docs/PaginatedSyncStatusList.md)
 - [PaginatedTeamList](docs/PaginatedTeamList.md)
 - [PaginatedTimeOffBalanceList](docs/PaginatedTimeOffBalanceList.md)
 - [PaginatedTimeOffList](docs/PaginatedTimeOffList.md)
 - [PayCurrencyEnum](docs/PayCurrencyEnum.md)
 - [PayFrequencyEnum](docs/PayFrequencyEnum.md)
 - [PayGroup](docs/PayGroup.md)
 - [PayPeriodEnum](docs/PayPeriodEnum.md)
 - [PayrollRun](docs/PayrollRun.md)
 - [PolicyTypeEnum](docs/PolicyTypeEnum.md)
 - [ReasonEnum](docs/ReasonEnum.md)
 - [RemoteData](docs/RemoteData.md)
 - [RemoteDataRequest](docs/RemoteDataRequest.md)
 - [RemoteKey](docs/RemoteKey.md)
 - [RemoteKeyForRegenerationRequest](docs/RemoteKeyForRegenerationRequest.md)
 - [RemoteResponse](docs/RemoteResponse.md)
 - [RequestFormatEnum](docs/RequestFormatEnum.md)
 - [RequestTypeEnum](docs/RequestTypeEnum.md)
 - [RunStateEnum](docs/RunStateEnum.md)
 - [RunTypeEnum](docs/RunTypeEnum.md)
 - [SyncStatus](docs/SyncStatus.md)
 - [SyncStatusStatusEnum](docs/SyncStatusStatusEnum.md)
 - [Tax](docs/Tax.md)
 - [Team](docs/Team.md)
 - [TimeOff](docs/TimeOff.md)
 - [TimeOffBalance](docs/TimeOffBalance.md)
 - [TimeOffEndpointRequest](docs/TimeOffEndpointRequest.md)
 - [TimeOffRequest](docs/TimeOffRequest.md)
 - [TimeOffResponse](docs/TimeOffResponse.md)
 - [TimeOffStatusEnum](docs/TimeOffStatusEnum.md)
 - [UnitsEnum](docs/UnitsEnum.md)
 - [ValidationProblemSource](docs/ValidationProblemSource.md)
 - [WarningValidationProblem](docs/WarningValidationProblem.md)
 - [WebhookReceiver](docs/WebhookReceiver.md)
 - [WebhookReceiverRequest](docs/WebhookReceiverRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### tokenAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@merge.dev

