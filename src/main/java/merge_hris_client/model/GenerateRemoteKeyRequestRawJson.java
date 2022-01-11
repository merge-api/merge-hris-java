
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
 * # The GenerateRemoteKey Object ### Description The &#x60;GenerateRemoteKey&#x60; object is used to represent a request for a new remote key.  ### Usage Example Post a &#x60;GenerateRemoteKey&#x60; to create a new remote key.
 */
@ApiModel(description = "# The GenerateRemoteKey Object ### Description The `GenerateRemoteKey` object is used to represent a request for a new remote key.  ### Usage Example Post a `GenerateRemoteKey` to create a new remote key.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T18:45:23.445197Z[Etc/UTC]")
public class GenerateRemoteKeyRequestRawJson {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  private transient JSON serializer;

  public GenerateRemoteKeyRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public GenerateRemoteKeyRequestRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Remote Deployment Key 1", required = true, value = "")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateRemoteKeyRequestRawJson generateRemoteKeyRequest = (GenerateRemoteKeyRequestRawJson) o;
    return Objects.equals(this.name.getAsString(), generateRemoteKeyRequest.name.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateRemoteKeyRequestRawJson {\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
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


