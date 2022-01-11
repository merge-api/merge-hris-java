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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import merge_hris_client.model.RemoteData;
import org.threeten.bp.OffsetDateTime;

/**
 * # The TimeOff Object ### Description The &#x60;TimeOff&#x60; object is used to represent a Time Off Request filed by an employee.  ### Usage Example Fetch from the &#x60;LIST TimeOffs&#x60; endpoint and filter by &#x60;ID&#x60; to show all time off requests.
 */
@ApiModel(description = "# The TimeOff Object ### Description The `TimeOff` object is used to represent a Time Off Request filed by an employee.  ### Usage Example Fetch from the `LIST TimeOffs` endpoint and filter by `ID` to show all time off requests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T18:45:23.445197Z[Etc/UTC]")
public class TimeOff {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private UUID employee;

  public static final String SERIALIZED_NAME_APPROVER = "approver";
  @SerializedName(SERIALIZED_NAME_APPROVER)
  private UUID approver;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EMPLOYEE_NOTE = "employee_note";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NOTE)
  private String employeeNote;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "request_type";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91b2b905-e866-40c8-8be2-efe53827a0aa", value = "")

  public UUID getId() {
    return id;
  }




  public TimeOff remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19202938", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public TimeOff employee(UUID employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * The employee requesting time off.
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "The employee requesting time off.")

  public UUID getEmployee() {
    return employee;
  }


  public void setEmployee(UUID employee) {
    this.employee = employee;
  }


  public TimeOff approver(UUID approver) {
    
    this.approver = approver;
    return this;
  }

   /**
   * The employee approving the time off request.
   * @return approver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9efbc633-3387-4306-aa55-e2c635e6bb4f", value = "The employee approving the time off request.")

  public UUID getApprover() {
    return approver;
  }


  public void setApprover(UUID approver) {
    this.approver = approver;
  }


  public TimeOff status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "APPROVED", required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TimeOff employeeNote(String employeeNote) {
    
    this.employeeNote = employeeNote;
    return this;
  }

   /**
   * The employee note for this time off request.
   * @return employeeNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Trip to Iowa. Miss those cornfields!", value = "The employee note for this time off request.")

  public String getEmployeeNote() {
    return employeeNote;
  }


  public void setEmployeeNote(String employeeNote) {
    this.employeeNote = employeeNote;
  }


  public TimeOff units(String units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @ApiModelProperty(example = "DAYS", required = true, value = "")

  public String getUnits() {
    return units;
  }


  public void setUnits(String units) {
    this.units = units;
  }


  public TimeOff amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The number of time off units requested.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The number of time off units requested.")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public TimeOff requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @ApiModelProperty(example = "VACATION", required = true, value = "")

  public String getRequestType() {
    return requestType;
  }


  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public TimeOff startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The day and time of the start of the time requested off.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10T00:00Z", value = "The day and time of the start of the time requested off.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public TimeOff endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The day and time of the end of the time requested off.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T00:00Z", value = "The day and time of the end of the time requested off.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/leave\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<RemoteData> getRemoteData() {
    return remoteData;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOff timeOff = (TimeOff) o;
    return Objects.equals(this.id, timeOff.id) &&
        Objects.equals(this.remoteId, timeOff.remoteId) &&
        Objects.equals(this.employee, timeOff.employee) &&
        Objects.equals(this.approver, timeOff.approver) &&
        Objects.equals(this.status, timeOff.status) &&
        Objects.equals(this.employeeNote, timeOff.employeeNote) &&
        Objects.equals(this.units, timeOff.units) &&
        Objects.equals(this.amount, timeOff.amount) &&
        Objects.equals(this.requestType, timeOff.requestType) &&
        Objects.equals(this.startTime, timeOff.startTime) &&
        Objects.equals(this.endTime, timeOff.endTime) &&
        Objects.equals(this.remoteData, timeOff.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employee, approver, status, employeeNote, units, amount, requestType, startTime, endTime, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOff {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    employeeNote: ").append(toIndentedString(employeeNote)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData)).append("\n");
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

