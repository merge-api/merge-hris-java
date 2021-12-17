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
import merge_hris_client.model.TimeOff;
import merge_hris_client.model.ValidationProblem;

/**
 * TimeOffResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T23:12:03.251026Z[Etc/UTC]")
public class TimeOffResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ValidationProblem> errors = new ArrayList<ValidationProblem>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<ValidationProblem> warnings = new ArrayList<ValidationProblem>();

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private TimeOff model;


  public TimeOffResponse errors(List<ValidationProblem> errors) {
    
    this.errors = errors;
    return this;
  }

  public TimeOffResponse addErrorsItem(ValidationProblem errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ValidationProblem> getErrors() {
    return errors;
  }


  public void setErrors(List<ValidationProblem> errors) {
    this.errors = errors;
  }


  public TimeOffResponse warnings(List<ValidationProblem> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public TimeOffResponse addWarningsItem(ValidationProblem warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ValidationProblem> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<ValidationProblem> warnings) {
    this.warnings = warnings;
  }


  public TimeOffResponse model(TimeOff model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")

  public TimeOff getModel() {
    return model;
  }


  public void setModel(TimeOff model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffResponse timeOffResponse = (TimeOffResponse) o;
    return Objects.equals(this.errors, timeOffResponse.errors) &&
        Objects.equals(this.warnings, timeOffResponse.warnings) &&
        Objects.equals(this.model, timeOffResponse.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

