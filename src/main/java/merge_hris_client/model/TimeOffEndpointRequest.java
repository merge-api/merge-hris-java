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
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import merge_hris_client.JSON;
import merge_hris_client.model.TimeOffRequest;

/**
 * TimeOffEndpointRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-04T18:48:46.006564Z[Etc/UTC]")
public class TimeOffEndpointRequest {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private JsonElement model;


  public TimeOffEndpointRequest model(TimeOffRequest model, JSON serializer) {
    this.model = serializer.getGson().toJsonTree(model);
    return this;
}

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")

  public JsonElement getModel() {
    return model;
  }


  public void setModel(JsonElement model) {
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
    TimeOffEndpointRequest timeOffEndpointRequest = (TimeOffEndpointRequest) o;
    return Objects.equals(this.model, timeOffEndpointRequest.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffEndpointRequest {\n");
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

