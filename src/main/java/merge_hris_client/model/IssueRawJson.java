
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
 * IssueRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-06T21:54:01.920674Z[Etc/UTC]")
public class IssueRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "error_description";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private JsonElement errorDescription;

  public static final String SERIALIZED_NAME_END_USER = "end_user";
  @SerializedName(SERIALIZED_NAME_END_USER)
  private JsonElement endUser;

  public static final String SERIALIZED_NAME_FIRST_INCIDENT_TIME = "first_incident_time";
  @SerializedName(SERIALIZED_NAME_FIRST_INCIDENT_TIME)
  private JsonElement firstIncidentTime;

  public static final String SERIALIZED_NAME_LAST_INCIDENT_TIME = "last_incident_time";
  @SerializedName(SERIALIZED_NAME_LAST_INCIDENT_TIME)
  private JsonElement lastIncidentTime;

  public static final String SERIALIZED_NAME_IS_MUTED = "is_muted";
  @SerializedName(SERIALIZED_NAME_IS_MUTED)
  private JsonElement isMuted;

  private transient JSON serializer;

  public IssueRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getId() {
    return id;
  }

  public IssueRawJson status(IssueStatusEnum status) {
    this.status = this.serializer.getGson().toJsonTree(status);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getStatus() {
    return status;
  }
  public void setStatus(JsonElement status) {
    this.status = status;
  }

  public IssueRawJson errorDescription(String errorDescription) {
    this.errorDescription = this.serializer.getGson().toJsonTree(errorDescription);
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getErrorDescription() {
    return errorDescription;
  }
  public void setErrorDescription(JsonElement errorDescription) {
    this.errorDescription = errorDescription;
  }

   /**
   * Get endUser
   * @return endUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getEndUser() {
    return endUser;
  }

  public IssueRawJson firstIncidentTime(OffsetDateTime firstIncidentTime) {
    this.firstIncidentTime = this.serializer.getGson().toJsonTree(firstIncidentTime);
    return this;
  }

   /**
   * Get firstIncidentTime
   * @return firstIncidentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getFirstIncidentTime() {
    return firstIncidentTime;
  }
  public void setFirstIncidentTime(JsonElement firstIncidentTime) {
    this.firstIncidentTime = firstIncidentTime;
  }

  public IssueRawJson lastIncidentTime(OffsetDateTime lastIncidentTime) {
    this.lastIncidentTime = this.serializer.getGson().toJsonTree(lastIncidentTime);
    return this;
  }

   /**
   * Get lastIncidentTime
   * @return lastIncidentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getLastIncidentTime() {
    return lastIncidentTime;
  }
  public void setLastIncidentTime(JsonElement lastIncidentTime) {
    this.lastIncidentTime = lastIncidentTime;
  }

   /**
   * Get isMuted
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getIsMuted() {
    return isMuted;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueRawJson issue = (IssueRawJson) o;
    return Objects.equals(this.id.getAsString(), issue.id.getAsString()) &&
        Objects.equals(this.status.getAsString(), issue.status.getAsString()) &&
        Objects.equals(this.errorDescription.getAsString(), issue.errorDescription.getAsString()) &&
        Objects.equals(this.endUser.getAsString(), issue.endUser.getAsString()) &&
        Objects.equals(this.firstIncidentTime.getAsString(), issue.firstIncidentTime.getAsString()) &&
        Objects.equals(this.lastIncidentTime.getAsString(), issue.lastIncidentTime.getAsString()) &&
        Objects.equals(this.isMuted.getAsString(), issue.isMuted.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, status, errorDescription, endUser, firstIncidentTime, lastIncidentTime, isMuted);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription.getAsString())).append("\n");
    sb.append("    endUser: ").append(toIndentedString(endUser.getAsString())).append("\n");
    sb.append("    firstIncidentTime: ").append(toIndentedString(firstIncidentTime.getAsString())).append("\n");
    sb.append("    lastIncidentTime: ").append(toIndentedString(lastIncidentTime.getAsString())).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted.getAsString())).append("\n");
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


