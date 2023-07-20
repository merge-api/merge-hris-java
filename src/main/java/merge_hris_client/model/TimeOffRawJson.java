
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
 * # The TimeOff Object ### Description The &#x60;TimeOff&#x60; object is used to represent a Time Off Request filed by an employee.  ### Usage Example Fetch from the &#x60;LIST TimeOffs&#x60; endpoint and filter by &#x60;ID&#x60; to show all time off requests.
 */
@ApiModel(description = "# The TimeOff Object ### Description The `TimeOff` object is used to represent a Time Off Request filed by an employee.  ### Usage Example Fetch from the `LIST TimeOffs` endpoint and filter by `ID` to show all time off requests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class TimeOffRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private JsonElement employee;

  public static final String SERIALIZED_NAME_APPROVER = "approver";
  @SerializedName(SERIALIZED_NAME_APPROVER)
  private JsonElement approver;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  public static final String SERIALIZED_NAME_EMPLOYEE_NOTE = "employee_note";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NOTE)
  private JsonElement employeeNote;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private JsonElement units;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private JsonElement amount;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "request_type";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private JsonElement requestType;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private JsonElement startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private JsonElement endTime;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  public static final String SERIALIZED_NAME_REMOTE_WAS_DELETED = "remote_was_deleted";
  @SerializedName(SERIALIZED_NAME_REMOTE_WAS_DELETED)
  private JsonElement remoteWasDeleted;

  private transient JSON serializer;

  public TimeOffRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91b2b905-e866-40c8-8be2-efe53827a0aa", value = "")

  public JsonElement getId() {
    return id;
  }

  public TimeOffRawJson remoteId(String remoteId) {
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

  public TimeOffRawJson employee(UUID employee) {
    this.employee = this.serializer.getGson().toJsonTree(employee);
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "")

  public JsonElement getEmployee() {
    return employee;
  }
  public void setEmployee(JsonElement employee) {
    this.employee = employee;
  }

  public TimeOffRawJson approver(UUID approver) {
    this.approver = this.serializer.getGson().toJsonTree(approver);
    return this;
  }

   /**
   * Get approver
   * @return approver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9efbc633-3387-4306-aa55-e2c635e6bb4f", value = "")

  public JsonElement getApprover() {
    return approver;
  }
  public void setApprover(JsonElement approver) {
    this.approver = approver;
  }

  public TimeOffRawJson status(TimeOffStatusEnum status) {
    this.status = this.serializer.getGson().toJsonTree(status);
    return this;
  }

   /**
   * The status of this time off request.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVED", value = "The status of this time off request.")

  public JsonElement getStatus() {
    return status;
  }
  public void setStatus(JsonElement status) {
    this.status = status;
  }

  public TimeOffRawJson employeeNote(String employeeNote) {
    this.employeeNote = this.serializer.getGson().toJsonTree(employeeNote);
    return this;
  }

   /**
   * The employee note for this time off request.
   * @return employeeNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Moving into the new apartment Kendall Roy gave me!", value = "The employee note for this time off request.")

  public JsonElement getEmployeeNote() {
    return employeeNote;
  }
  public void setEmployeeNote(JsonElement employeeNote) {
    this.employeeNote = employeeNote;
  }

  public TimeOffRawJson units(UnitsEnum units) {
    this.units = this.serializer.getGson().toJsonTree(units);
    return this;
  }

   /**
   * The unit of time requested.
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAYS", value = "The unit of time requested.")

  public JsonElement getUnits() {
    return units;
  }
  public void setUnits(JsonElement units) {
    this.units = units;
  }

  public TimeOffRawJson amount(Float amount) {
    this.amount = this.serializer.getGson().toJsonTree(amount);
    return this;
  }

   /**
   * The number of time off units requested.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The number of time off units requested.")

  public JsonElement getAmount() {
    return amount;
  }
  public void setAmount(JsonElement amount) {
    this.amount = amount;
  }

  public TimeOffRawJson requestType(RequestTypeEnum requestType) {
    this.requestType = this.serializer.getGson().toJsonTree(requestType);
    return this;
  }

   /**
   * The type of time off request.
   * @return requestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VACATION", value = "The type of time off request.")

  public JsonElement getRequestType() {
    return requestType;
  }
  public void setRequestType(JsonElement requestType) {
    this.requestType = requestType;
  }

  public TimeOffRawJson startTime(OffsetDateTime startTime) {
    this.startTime = this.serializer.getGson().toJsonTree(startTime);
    return this;
  }

   /**
   * The day and time of the start of the time requested off.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10T00:00Z", value = "The day and time of the start of the time requested off.")

  public JsonElement getStartTime() {
    return startTime;
  }
  public void setStartTime(JsonElement startTime) {
    this.startTime = startTime;
  }

  public TimeOffRawJson endTime(OffsetDateTime endTime) {
    this.endTime = this.serializer.getGson().toJsonTree(endTime);
    return this;
  }

   /**
   * The day and time of the end of the time requested off.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T00:00Z", value = "The day and time of the end of the time requested off.")

  public JsonElement getEndTime() {
    return endTime;
  }
  public void setEndTime(JsonElement endTime) {
    this.endTime = endTime;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/leave\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }

   /**
   * Get remoteWasDeleted
   * @return remoteWasDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getRemoteWasDeleted() {
    return remoteWasDeleted;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRawJson timeOff = (TimeOffRawJson) o;
    return Objects.equals(this.id.getAsString(), timeOff.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), timeOff.remoteId.getAsString()) &&
        Objects.equals(this.employee.getAsString(), timeOff.employee.getAsString()) &&
        Objects.equals(this.approver.getAsString(), timeOff.approver.getAsString()) &&
        Objects.equals(this.status.getAsString(), timeOff.status.getAsString()) &&
        Objects.equals(this.employeeNote.getAsString(), timeOff.employeeNote.getAsString()) &&
        Objects.equals(this.units.getAsString(), timeOff.units.getAsString()) &&
        Objects.equals(this.amount.getAsString(), timeOff.amount.getAsString()) &&
        Objects.equals(this.requestType.getAsString(), timeOff.requestType.getAsString()) &&
        Objects.equals(this.startTime.getAsString(), timeOff.startTime.getAsString()) &&
        Objects.equals(this.endTime.getAsString(), timeOff.endTime.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), timeOff.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), timeOff.remoteWasDeleted.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employee, approver, status, employeeNote, units, amount, requestType, startTime, endTime, remoteData, remoteWasDeleted);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee.getAsString())).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
    sb.append("    employeeNote: ").append(toIndentedString(employeeNote.getAsString())).append("\n");
    sb.append("    units: ").append(toIndentedString(units.getAsString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount.getAsString())).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType.getAsString())).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime.getAsString())).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
    sb.append("    remoteWasDeleted: ").append(toIndentedString(remoteWasDeleted.getAsString())).append("\n");
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


