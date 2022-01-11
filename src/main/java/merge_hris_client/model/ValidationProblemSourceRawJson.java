
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
 * ValidationProblemSourceRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T18:45:23.445197Z[Etc/UTC]")
public class ValidationProblemSourceRawJson {
  public static final String SERIALIZED_NAME_POINTER = "pointer";
  @SerializedName(SERIALIZED_NAME_POINTER)
  private JsonElement pointer;

  private transient JSON serializer;

  public ValidationProblemSourceRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public ValidationProblemSourceRawJson pointer(String pointer) {
    this.pointer = this.serializer.getGson().toJsonTree(pointer);
    return this;
  }

   /**
   * Get pointer
   * @return pointer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getPointer() {
    return pointer;
  }
  public void setPointer(JsonElement pointer) {
    this.pointer = pointer;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationProblemSourceRawJson validationProblemSource = (ValidationProblemSourceRawJson) o;
    return Objects.equals(this.pointer.getAsString(), validationProblemSource.pointer.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(pointer);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationProblemSourceRawJson {\n");
    sb.append("    pointer: ").append(toIndentedString(pointer.getAsString())).append("\n");
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


