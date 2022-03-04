
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
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import merge_hris_client.JSON;
import org.threeten.bp.OffsetDateTime;

/**
 * TimeOffResponseRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-04T18:48:46.006564Z[Etc/UTC]")
public class TimeOffResponseRawJson {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private JsonElement model;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private JsonElement warnings;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private JsonElement errors;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private JsonElement logs;

  private transient JSON serializer;

  public TimeOffResponseRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public TimeOffResponseRawJson model(TimeOff model) {
    this.model = this.serializer.getGson().toJsonTree(model);
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getModel() {
    return model;
  }
  public void setModel(JsonElement model) {
    this.model = model;
  }

  public TimeOffResponseRawJson warnings(List<WarningValidationProblem> warnings) {
    this.warnings = this.serializer.getGson().toJsonTree(warnings);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getWarnings() {
    return warnings;
  }
  public void setWarnings(JsonElement warnings) {
    this.warnings = warnings;
  }

  public TimeOffResponseRawJson errors(List<ErrorValidationProblem> errors) {
    this.errors = this.serializer.getGson().toJsonTree(errors);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getErrors() {
    return errors;
  }
  public void setErrors(JsonElement errors) {
    this.errors = errors;
  }

  public TimeOffResponseRawJson logs(List<DebugModeLog> logs) {
    this.logs = this.serializer.getGson().toJsonTree(logs);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getLogs() {
    return logs;
  }
  public void setLogs(JsonElement logs) {
    this.logs = logs;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffResponseRawJson timeOffResponse = (TimeOffResponseRawJson) o;
    return Objects.equals(this.model.getAsString(), timeOffResponse.model.getAsString()) &&
        Objects.equals(this.warnings.getAsString(), timeOffResponse.warnings.getAsString()) &&
        Objects.equals(this.errors.getAsString(), timeOffResponse.errors.getAsString()) &&
        Objects.equals(this.logs.getAsString(), timeOffResponse.logs.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(model, warnings, errors, logs);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffResponseRawJson {\n");
    sb.append("    model: ").append(toIndentedString(model.getAsString())).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings.getAsString())).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors.getAsString())).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs.getAsString())).append("\n");
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


