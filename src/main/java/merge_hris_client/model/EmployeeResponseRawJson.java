
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
 * EmployeeResponseRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-12T20:57:27.935941Z[Etc/UTC]")
public class EmployeeResponseRawJson {
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

  public EmployeeResponseRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public EmployeeResponseRawJson model(Employee model) {
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

  public EmployeeResponseRawJson warnings(List<WarningValidationProblem> warnings) {
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

  public EmployeeResponseRawJson errors(List<ErrorValidationProblem> errors) {
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

  public EmployeeResponseRawJson logs(List<DebugModeLog> logs) {
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
    EmployeeResponseRawJson employeeResponse = (EmployeeResponseRawJson) o;
    return Objects.equals(this.model.getAsString(), employeeResponse.model.getAsString()) &&
        Objects.equals(this.warnings.getAsString(), employeeResponse.warnings.getAsString()) &&
        Objects.equals(this.errors.getAsString(), employeeResponse.errors.getAsString()) &&
        Objects.equals(this.logs.getAsString(), employeeResponse.logs.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(model, warnings, errors, logs);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeResponseRawJson {\n");
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


