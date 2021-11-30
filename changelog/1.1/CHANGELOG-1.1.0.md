# merge-hris-client - CHANGELOG

API version: 1.1.0

Build date: 2021-11-29T21:03:29.505759-05:00[America/New_York]

1. Changed Enum fields to Strings:
    - BenefitPlanTypeEnum
    - TimeOffStatusEnum
    - UnitsEnum
    - PayPeriodEnum
    - PayFrequencyEnum
    - PayCurrencyEnum
    - FlsaStatusEnum
    - EmploymentTypeEnum 
    - GenderEnum
    - EthnicityEnum
    - MaritalStatusEnum 
    - RequestTypeEnum
    - RunStateEnum
    - RunTypeEnum
    - TypeEnum


2. Added type filters
   - EmployeePayrollRunsApi.employeeId
   - EmployeePayrollRunsApi.endedAfter
   - EmployeePayrollRunsApi.endedBefore
   - EmployeePayrollRunsApi.startedAfter
   - EmployeePayrollRunsApi.startedBefore
   - EmployeesApi.includeSensitiveFields
   - EmployeesApi.personalEmail
   - EmployeesApi.workEmail
   - PayrollRunsApi.endedAfter
   - PayrollRunsApi.endedBefore
   - PayrollRunsApi.runType
   - PayrollRunsApi.startedAfter
   - PayrollRunsApi.startedBefore
   - TeamsApi.parentTeamId
   - TimeOffApi.requestType
   - TimeOffApi.status
   - TimeOffBalanceApi.policyType
   

3. Fixed Cursor Type from Integer to String on several models:
   - IssuesApi
   - SyncStatusApi
   - LinkedAccountsApi