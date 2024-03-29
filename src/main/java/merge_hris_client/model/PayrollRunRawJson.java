
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
 * # The PayrollRun Object ### Description The &#x60;PayrollRun&#x60; object is used to represent a payroll run. This payroll run is not specific to an employee.  ### Usage Example Fetch from the &#x60;LIST PayrollRuns&#x60; endpoint and filter by &#x60;ID&#x60; to show all payroll runs.
 */
@ApiModel(description = "# The PayrollRun Object ### Description The `PayrollRun` object is used to represent a payroll run. This payroll run is not specific to an employee.  ### Usage Example Fetch from the `LIST PayrollRuns` endpoint and filter by `ID` to show all payroll runs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class PayrollRunRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_RUN_STATE = "run_state";
  @SerializedName(SERIALIZED_NAME_RUN_STATE)
  private JsonElement runState;

  public static final String SERIALIZED_NAME_RUN_TYPE = "run_type";
  @SerializedName(SERIALIZED_NAME_RUN_TYPE)
  private JsonElement runType;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private JsonElement startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private JsonElement endDate;

  public static final String SERIALIZED_NAME_CHECK_DATE = "check_date";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private JsonElement checkDate;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  public static final String SERIALIZED_NAME_REMOTE_WAS_DELETED = "remote_was_deleted";
  @SerializedName(SERIALIZED_NAME_REMOTE_WAS_DELETED)
  private JsonElement remoteWasDeleted;

  private transient JSON serializer;

  public PayrollRunRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "37336947-b3d4-4a4c-a310-ab6ab510e079", value = "")

  public JsonElement getId() {
    return id;
  }

  public PayrollRunRawJson remoteId(String remoteId) {
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

  public PayrollRunRawJson runState(RunStateEnum runState) {
    this.runState = this.serializer.getGson().toJsonTree(runState);
    return this;
  }

   /**
   * The state of the payroll run
   * @return runState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAID", value = "The state of the payroll run")

  public JsonElement getRunState() {
    return runState;
  }
  public void setRunState(JsonElement runState) {
    this.runState = runState;
  }

  public PayrollRunRawJson runType(RunTypeEnum runType) {
    this.runType = this.serializer.getGson().toJsonTree(runType);
    return this;
  }

   /**
   * The type of the payroll run
   * @return runType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "REGULAR", value = "The type of the payroll run")

  public JsonElement getRunType() {
    return runType;
  }
  public void setRunType(JsonElement runType) {
    this.runType = runType;
  }

  public PayrollRunRawJson startDate(OffsetDateTime startDate) {
    this.startDate = this.serializer.getGson().toJsonTree(startDate);
    return this;
  }

   /**
   * The day and time the payroll run started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-08T00:00Z", value = "The day and time the payroll run started.")

  public JsonElement getStartDate() {
    return startDate;
  }
  public void setStartDate(JsonElement startDate) {
    this.startDate = startDate;
  }

  public PayrollRunRawJson endDate(OffsetDateTime endDate) {
    this.endDate = this.serializer.getGson().toJsonTree(endDate);
    return this;
  }

   /**
   * The day and time the payroll run ended.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-15T00:00Z", value = "The day and time the payroll run ended.")

  public JsonElement getEndDate() {
    return endDate;
  }
  public void setEndDate(JsonElement endDate) {
    this.endDate = endDate;
  }

  public PayrollRunRawJson checkDate(OffsetDateTime checkDate) {
    this.checkDate = this.serializer.getGson().toJsonTree(checkDate);
    return this;
  }

   /**
   * The day and time the payroll run was checked.
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-15T00:00Z", value = "The day and time the payroll run was checked.")

  public JsonElement getCheckDate() {
    return checkDate;
  }
  public void setCheckDate(JsonElement checkDate) {
    this.checkDate = checkDate;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/payroll\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }

   /**
   * Indicates whether or not this object has been deleted on the third-party.
   * @return remoteWasDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not this object has been deleted on the third-party.")

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
    PayrollRunRawJson payrollRun = (PayrollRunRawJson) o;
    return Objects.equals(this.id.getAsString(), payrollRun.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), payrollRun.remoteId.getAsString()) &&
        Objects.equals(this.runState.getAsString(), payrollRun.runState.getAsString()) &&
        Objects.equals(this.runType.getAsString(), payrollRun.runType.getAsString()) &&
        Objects.equals(this.startDate.getAsString(), payrollRun.startDate.getAsString()) &&
        Objects.equals(this.endDate.getAsString(), payrollRun.endDate.getAsString()) &&
        Objects.equals(this.checkDate.getAsString(), payrollRun.checkDate.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), payrollRun.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), payrollRun.remoteWasDeleted.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, runState, runType, startDate, endDate, checkDate, remoteData, remoteWasDeleted);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollRunRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    runState: ").append(toIndentedString(runState.getAsString())).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType.getAsString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate.getAsString())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate.getAsString())).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate.getAsString())).append("\n");
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


