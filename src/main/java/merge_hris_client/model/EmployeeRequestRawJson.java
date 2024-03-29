
/*
 * Merge HRIS API
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package merge_hris_client.model;

import java.util.Objects;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import merge_hris_client.JSON;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Employee Object ### Description The &#x60;Employee&#x60; object is used to represent an Employee for a company.  ### Usage Example Fetch from the &#x60;LIST Employee&#x60; endpoint and filter by &#x60;ID&#x60; to show all employees.
 */
@ApiModel(description = "# The Employee Object ### Description The `Employee` object is used to represent an Employee for a company.  ### Usage Example Fetch from the `LIST Employee` endpoint and filter by `ID` to show all employees.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class EmployeeRequestRawJson {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private JsonElement employeeNumber;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private JsonElement company;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private JsonElement firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private JsonElement lastName;

  public static final String SERIALIZED_NAME_DISPLAY_FULL_NAME = "display_full_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_FULL_NAME)
  private JsonElement displayFullName;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private JsonElement groups;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  private JsonElement workEmail;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  private JsonElement personalEmail;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NUMBER = "mobile_phone_number";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NUMBER)
  private JsonElement mobilePhoneNumber;

  public static final String SERIALIZED_NAME_EMPLOYMENTS = "employments";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENTS)
  private JsonElement employments;

  public static final String SERIALIZED_NAME_HOME_LOCATION = "home_location";
  @SerializedName(SERIALIZED_NAME_HOME_LOCATION)
  private JsonElement homeLocation;

  public static final String SERIALIZED_NAME_WORK_LOCATION = "work_location";
  @SerializedName(SERIALIZED_NAME_WORK_LOCATION)
  private JsonElement workLocation;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private JsonElement manager;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private JsonElement team;

  public static final String SERIALIZED_NAME_PAY_GROUP = "pay_group";
  @SerializedName(SERIALIZED_NAME_PAY_GROUP)
  private JsonElement payGroup;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private JsonElement ssn;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private JsonElement gender;

  public static final String SERIALIZED_NAME_ETHNICITY = "ethnicity";
  @SerializedName(SERIALIZED_NAME_ETHNICITY)
  private JsonElement ethnicity;

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private JsonElement maritalStatus;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private JsonElement dateOfBirth;

  public static final String SERIALIZED_NAME_HIRE_DATE = "hire_date";
  @SerializedName(SERIALIZED_NAME_HIRE_DATE)
  private JsonElement hireDate;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private JsonElement startDate;

  public static final String SERIALIZED_NAME_EMPLOYMENT_STATUS = "employment_status";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_STATUS)
  private JsonElement employmentStatus;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  private JsonElement terminationDate;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private JsonElement avatar;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private JsonElement customFields;

  private transient JSON serializer;

  public EmployeeRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public EmployeeRequestRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19202938", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public EmployeeRequestRawJson employeeNumber(String employeeNumber) {
    this.employeeNumber = this.serializer.getGson().toJsonTree(employeeNumber);
    return this;
  }

   /**
   * The employee&#39;s number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user. This value can also change in many API providers.
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The employee's number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user. This value can also change in many API providers.")

  public JsonElement getEmployeeNumber() {
    return employeeNumber;
  }
  public void setEmployeeNumber(JsonElement employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public EmployeeRequestRawJson company(UUID company) {
    this.company = this.serializer.getGson().toJsonTree(company);
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8d9fd929-436c-4fd4-a48b-0c61f68d6178", value = "")

  public JsonElement getCompany() {
    return company;
  }
  public void setCompany(JsonElement company) {
    this.company = company;
  }

  public EmployeeRequestRawJson firstName(String firstName) {
    this.firstName = this.serializer.getGson().toJsonTree(firstName);
    return this;
  }

   /**
   * The employee&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Greg", value = "The employee's first name.")

  public JsonElement getFirstName() {
    return firstName;
  }
  public void setFirstName(JsonElement firstName) {
    this.firstName = firstName;
  }

  public EmployeeRequestRawJson lastName(String lastName) {
    this.lastName = this.serializer.getGson().toJsonTree(lastName);
    return this;
  }

   /**
   * The employee&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hirsch", value = "The employee's last name.")

  public JsonElement getLastName() {
    return lastName;
  }
  public void setLastName(JsonElement lastName) {
    this.lastName = lastName;
  }

  public EmployeeRequestRawJson displayFullName(String displayFullName) {
    this.displayFullName = this.serializer.getGson().toJsonTree(displayFullName);
    return this;
  }

   /**
   * The employee&#39;s full name, to use for display purposes. If a preferred first name is available, the full name will include the preferred first name.
   * @return displayFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cousin Greg Hirsch", value = "The employee's full name, to use for display purposes. If a preferred first name is available, the full name will include the preferred first name.")

  public JsonElement getDisplayFullName() {
    return displayFullName;
  }
  public void setDisplayFullName(JsonElement displayFullName) {
    this.displayFullName = displayFullName;
  }

  public EmployeeRequestRawJson groups(List<UUID> groups) {
    this.groups = this.serializer.getGson().toJsonTree(groups);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"21a54124-397f-494d-985e-3c5b330b8a68\"]", value = "")

  public JsonElement getGroups() {
    return groups;
  }
  public void setGroups(JsonElement groups) {
    this.groups = groups;
  }

  public EmployeeRequestRawJson workEmail(String workEmail) {
    this.workEmail = this.serializer.getGson().toJsonTree(workEmail);
    return this;
  }

   /**
   * The employee&#39;s work email.
   * @return workEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "greg@merge.dev", value = "The employee's work email.")

  public JsonElement getWorkEmail() {
    return workEmail;
  }
  public void setWorkEmail(JsonElement workEmail) {
    this.workEmail = workEmail;
  }

  public EmployeeRequestRawJson personalEmail(String personalEmail) {
    this.personalEmail = this.serializer.getGson().toJsonTree(personalEmail);
    return this;
  }

   /**
   * The employee&#39;s personal email.
   * @return personalEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "greg@gmail.com", value = "The employee's personal email.")

  public JsonElement getPersonalEmail() {
    return personalEmail;
  }
  public void setPersonalEmail(JsonElement personalEmail) {
    this.personalEmail = personalEmail;
  }

  public EmployeeRequestRawJson mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = this.serializer.getGson().toJsonTree(mobilePhoneNumber);
    return this;
  }

   /**
   * The employee&#39;s mobile phone number.
   * @return mobilePhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1234567890", value = "The employee's mobile phone number.")

  public JsonElement getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }
  public void setMobilePhoneNumber(JsonElement mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  public EmployeeRequestRawJson employments(List<UUID> employments) {
    this.employments = this.serializer.getGson().toJsonTree(employments);
    return this;
  }

   /**
   * Array of &#x60;Employment&#x60; IDs for this Employee.
   * @return employments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"17a54124-287f-494d-965e-3c5b330c9a68\"]", value = "Array of `Employment` IDs for this Employee.")

  public JsonElement getEmployments() {
    return employments;
  }
  public void setEmployments(JsonElement employments) {
    this.employments = employments;
  }

  public EmployeeRequestRawJson homeLocation(UUID homeLocation) {
    this.homeLocation = this.serializer.getGson().toJsonTree(homeLocation);
    return this;
  }

   /**
   * Get homeLocation
   * @return homeLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "")

  public JsonElement getHomeLocation() {
    return homeLocation;
  }
  public void setHomeLocation(JsonElement homeLocation) {
    this.homeLocation = homeLocation;
  }

  public EmployeeRequestRawJson workLocation(UUID workLocation) {
    this.workLocation = this.serializer.getGson().toJsonTree(workLocation);
    return this;
  }

   /**
   * Get workLocation
   * @return workLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9efbc633-3387-4306-aa55-e2c635e6bb4f", value = "")

  public JsonElement getWorkLocation() {
    return workLocation;
  }
  public void setWorkLocation(JsonElement workLocation) {
    this.workLocation = workLocation;
  }

  public EmployeeRequestRawJson manager(UUID manager) {
    this.manager = this.serializer.getGson().toJsonTree(manager);
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0048ea5b-911e-4dff-9364-92070dea62ff", value = "")

  public JsonElement getManager() {
    return manager;
  }
  public void setManager(JsonElement manager) {
    this.manager = manager;
  }

  public EmployeeRequestRawJson team(UUID team) {
    this.team = this.serializer.getGson().toJsonTree(team);
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "249c9faa-3045-4a31-953b-8f22d3613301", value = "")

  public JsonElement getTeam() {
    return team;
  }
  public void setTeam(JsonElement team) {
    this.team = team;
  }

  public EmployeeRequestRawJson payGroup(UUID payGroup) {
    this.payGroup = this.serializer.getGson().toJsonTree(payGroup);
    return this;
  }

   /**
   * Get payGroup
   * @return payGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ad1264e2-39be-4787-b749-f1aade9e3405", value = "")

  public JsonElement getPayGroup() {
    return payGroup;
  }
  public void setPayGroup(JsonElement payGroup) {
    this.payGroup = payGroup;
  }

  public EmployeeRequestRawJson ssn(String ssn) {
    this.ssn = this.serializer.getGson().toJsonTree(ssn);
    return this;
  }

   /**
   * The employee&#39;s social security number.
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "The employee's social security number.")

  public JsonElement getSsn() {
    return ssn;
  }
  public void setSsn(JsonElement ssn) {
    this.ssn = ssn;
  }

  public EmployeeRequestRawJson gender(GenderEnum gender) {
    this.gender = this.serializer.getGson().toJsonTree(gender);
    return this;
  }

   /**
   * The employee&#39;s gender.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MALE", value = "The employee's gender.")

  public JsonElement getGender() {
    return gender;
  }
  public void setGender(JsonElement gender) {
    this.gender = gender;
  }

  public EmployeeRequestRawJson ethnicity(EthnicityEnum ethnicity) {
    this.ethnicity = this.serializer.getGson().toJsonTree(ethnicity);
    return this;
  }

   /**
   * The employee&#39;s ethnicity.
   * @return ethnicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WHITE", value = "The employee's ethnicity.")

  public JsonElement getEthnicity() {
    return ethnicity;
  }
  public void setEthnicity(JsonElement ethnicity) {
    this.ethnicity = ethnicity;
  }

  public EmployeeRequestRawJson maritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = this.serializer.getGson().toJsonTree(maritalStatus);
    return this;
  }

   /**
   * The employee&#39;s marital status.
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SINGLE", value = "The employee's marital status.")

  public JsonElement getMaritalStatus() {
    return maritalStatus;
  }
  public void setMaritalStatus(JsonElement maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public EmployeeRequestRawJson dateOfBirth(OffsetDateTime dateOfBirth) {
    this.dateOfBirth = this.serializer.getGson().toJsonTree(dateOfBirth);
    return this;
  }

   /**
   * The employee&#39;s date of birth.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1990-11-10T00:00Z", value = "The employee's date of birth.")

  public JsonElement getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(JsonElement dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public EmployeeRequestRawJson hireDate(OffsetDateTime hireDate) {
    this.hireDate = this.serializer.getGson().toJsonTree(hireDate);
    return this;
  }

   /**
   * The date that the employee was hired, usually the day that an offer letter is signed. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. Note: If you&#39;re looking for the employee&#39;s start date, refer to the start_date field.
   * @return hireDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-10T00:00Z", value = "The date that the employee was hired, usually the day that an offer letter is signed. If an employee has multiple hire dates from previous employments, this represents the most recent hire date. Note: If you're looking for the employee's start date, refer to the start_date field.")

  public JsonElement getHireDate() {
    return hireDate;
  }
  public void setHireDate(JsonElement hireDate) {
    this.hireDate = hireDate;
  }

  public EmployeeRequestRawJson startDate(OffsetDateTime startDate) {
    this.startDate = this.serializer.getGson().toJsonTree(startDate);
    return this;
  }

   /**
   * The date that the employee started working. If an employee has multiple start dates from previous employments, this represents the most recent start date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-11T00:00Z", value = "The date that the employee started working. If an employee has multiple start dates from previous employments, this represents the most recent start date.")

  public JsonElement getStartDate() {
    return startDate;
  }
  public void setStartDate(JsonElement startDate) {
    this.startDate = startDate;
  }

  public EmployeeRequestRawJson employmentStatus(EmploymentStatusEnum employmentStatus) {
    this.employmentStatus = this.serializer.getGson().toJsonTree(employmentStatus);
    return this;
  }

   /**
   * The employment status of the employee.
   * @return employmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INACTIVE", value = "The employment status of the employee.")

  public JsonElement getEmploymentStatus() {
    return employmentStatus;
  }
  public void setEmploymentStatus(JsonElement employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public EmployeeRequestRawJson terminationDate(OffsetDateTime terminationDate) {
    this.terminationDate = this.serializer.getGson().toJsonTree(terminationDate);
    return this;
  }

   /**
   * The employee&#39;s termination date.
   * @return terminationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-12T00:00Z", value = "The employee's termination date.")

  public JsonElement getTerminationDate() {
    return terminationDate;
  }
  public void setTerminationDate(JsonElement terminationDate) {
    this.terminationDate = terminationDate;
  }

  public EmployeeRequestRawJson avatar(String avatar) {
    this.avatar = this.serializer.getGson().toJsonTree(avatar);
    return this;
  }

   /**
   * The URL of the employee&#39;s avatar image.
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alturl.com/h2h8m", value = "The URL of the employee's avatar image.")

  public JsonElement getAvatar() {
    return avatar;
  }
  public void setAvatar(JsonElement avatar) {
    this.avatar = avatar;
  }

  public EmployeeRequestRawJson customFields(Map<String, Object> customFields) {
    this.customFields = this.serializer.getGson().toJsonTree(customFields);
    return this;
  }

   /**
   * Custom fields configured for a given model.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom fields configured for a given model.")

  public JsonElement getCustomFields() {
    return customFields;
  }
  public void setCustomFields(JsonElement customFields) {
    this.customFields = customFields;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeRequestRawJson employeeRequest = (EmployeeRequestRawJson) o;
    return Objects.equals(this.remoteId.getAsString(), employeeRequest.remoteId.getAsString()) &&
        Objects.equals(this.employeeNumber.getAsString(), employeeRequest.employeeNumber.getAsString()) &&
        Objects.equals(this.company.getAsString(), employeeRequest.company.getAsString()) &&
        Objects.equals(this.firstName.getAsString(), employeeRequest.firstName.getAsString()) &&
        Objects.equals(this.lastName.getAsString(), employeeRequest.lastName.getAsString()) &&
        Objects.equals(this.displayFullName.getAsString(), employeeRequest.displayFullName.getAsString()) &&
        Objects.equals(this.groups.getAsString(), employeeRequest.groups.getAsString()) &&
        Objects.equals(this.workEmail.getAsString(), employeeRequest.workEmail.getAsString()) &&
        Objects.equals(this.personalEmail.getAsString(), employeeRequest.personalEmail.getAsString()) &&
        Objects.equals(this.mobilePhoneNumber.getAsString(), employeeRequest.mobilePhoneNumber.getAsString()) &&
        Objects.equals(this.employments.getAsString(), employeeRequest.employments.getAsString()) &&
        Objects.equals(this.homeLocation.getAsString(), employeeRequest.homeLocation.getAsString()) &&
        Objects.equals(this.workLocation.getAsString(), employeeRequest.workLocation.getAsString()) &&
        Objects.equals(this.manager.getAsString(), employeeRequest.manager.getAsString()) &&
        Objects.equals(this.team.getAsString(), employeeRequest.team.getAsString()) &&
        Objects.equals(this.payGroup.getAsString(), employeeRequest.payGroup.getAsString()) &&
        Objects.equals(this.ssn.getAsString(), employeeRequest.ssn.getAsString()) &&
        Objects.equals(this.gender.getAsString(), employeeRequest.gender.getAsString()) &&
        Objects.equals(this.ethnicity.getAsString(), employeeRequest.ethnicity.getAsString()) &&
        Objects.equals(this.maritalStatus.getAsString(), employeeRequest.maritalStatus.getAsString()) &&
        Objects.equals(this.dateOfBirth.getAsString(), employeeRequest.dateOfBirth.getAsString()) &&
        Objects.equals(this.hireDate.getAsString(), employeeRequest.hireDate.getAsString()) &&
        Objects.equals(this.startDate.getAsString(), employeeRequest.startDate.getAsString()) &&
        Objects.equals(this.employmentStatus.getAsString(), employeeRequest.employmentStatus.getAsString()) &&
        Objects.equals(this.terminationDate.getAsString(), employeeRequest.terminationDate.getAsString()) &&
        Objects.equals(this.avatar.getAsString(), employeeRequest.avatar.getAsString()) &&
        Objects.equals(this.customFields.getAsString(), employeeRequest.customFields.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(remoteId, employeeNumber, company, firstName, lastName, displayFullName, groups, workEmail, personalEmail, mobilePhoneNumber, employments, homeLocation, workLocation, manager, team, payGroup, ssn, gender, ethnicity, maritalStatus, dateOfBirth, hireDate, startDate, employmentStatus, terminationDate, avatar, customFields);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeRequestRawJson {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber.getAsString())).append("\n");
    sb.append("    company: ").append(toIndentedString(company.getAsString())).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName.getAsString())).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName.getAsString())).append("\n");
    sb.append("    displayFullName: ").append(toIndentedString(displayFullName.getAsString())).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups.getAsString())).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail.getAsString())).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail.getAsString())).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber.getAsString())).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments.getAsString())).append("\n");
    sb.append("    homeLocation: ").append(toIndentedString(homeLocation.getAsString())).append("\n");
    sb.append("    workLocation: ").append(toIndentedString(workLocation.getAsString())).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager.getAsString())).append("\n");
    sb.append("    team: ").append(toIndentedString(team.getAsString())).append("\n");
    sb.append("    payGroup: ").append(toIndentedString(payGroup.getAsString())).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn.getAsString())).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender.getAsString())).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity.getAsString())).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus.getAsString())).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth.getAsString())).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate.getAsString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate.getAsString())).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus.getAsString())).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate.getAsString())).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar.getAsString())).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields.getAsString())).append("\n");
    sb.append("}");
    return sb.toString();
  }
  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


