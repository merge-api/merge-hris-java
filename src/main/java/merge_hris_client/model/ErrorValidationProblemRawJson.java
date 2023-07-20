
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
 * ErrorValidationProblemRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class ErrorValidationProblemRawJson {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private JsonElement source;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private JsonElement title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private JsonElement detail;

  public static final String SERIALIZED_NAME_PROBLEM_TYPE = "problem_type";
  @SerializedName(SERIALIZED_NAME_PROBLEM_TYPE)
  private JsonElement problemType;

  private transient JSON serializer;

  public ErrorValidationProblemRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public ErrorValidationProblemRawJson source(ValidationProblemSource source) {
    this.source = this.serializer.getGson().toJsonTree(source);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getSource() {
    return source;
  }
  public void setSource(JsonElement source) {
    this.source = source;
  }

  public ErrorValidationProblemRawJson title(String title) {
    this.title = this.serializer.getGson().toJsonTree(title);
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Missing Required Field", required = true, value = "")

  public JsonElement getTitle() {
    return title;
  }
  public void setTitle(JsonElement title) {
    this.title = title;
  }

  public ErrorValidationProblemRawJson detail(String detail) {
    this.detail = this.serializer.getGson().toJsonTree(detail);
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "custom_fields is a required field on model.", required = true, value = "")

  public JsonElement getDetail() {
    return detail;
  }
  public void setDetail(JsonElement detail) {
    this.detail = detail;
  }

  public ErrorValidationProblemRawJson problemType(String problemType) {
    this.problemType = this.serializer.getGson().toJsonTree(problemType);
    return this;
  }

   /**
   * Get problemType
   * @return problemType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MISSING_REQUIRED_FIELD", required = true, value = "")

  public JsonElement getProblemType() {
    return problemType;
  }
  public void setProblemType(JsonElement problemType) {
    this.problemType = problemType;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorValidationProblemRawJson errorValidationProblem = (ErrorValidationProblemRawJson) o;
    return Objects.equals(this.source.getAsString(), errorValidationProblem.source.getAsString()) &&
        Objects.equals(this.title.getAsString(), errorValidationProblem.title.getAsString()) &&
        Objects.equals(this.detail.getAsString(), errorValidationProblem.detail.getAsString()) &&
        Objects.equals(this.problemType.getAsString(), errorValidationProblem.problemType.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(source, title, detail, problemType);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorValidationProblemRawJson {\n");
    sb.append("    source: ").append(toIndentedString(source.getAsString())).append("\n");
    sb.append("    title: ").append(toIndentedString(title.getAsString())).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail.getAsString())).append("\n");
    sb.append("    problemType: ").append(toIndentedString(problemType.getAsString())).append("\n");
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


