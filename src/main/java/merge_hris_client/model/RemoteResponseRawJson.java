
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
 * # The RemoteResponse Object ### Description The &#x60;RemoteResponse&#x60; object is used to represent information returned from a third-party endpoint.  ### Usage Example View the &#x60;RemoteResponse&#x60; returned from your &#x60;DataPassthrough&#x60;.
 */
@ApiModel(description = "# The RemoteResponse Object ### Description The `RemoteResponse` object is used to represent information returned from a third-party endpoint.  ### Usage Example View the `RemoteResponse` returned from your `DataPassthrough`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class RemoteResponseRawJson {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private JsonElement method;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private JsonElement path;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private JsonElement response;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private JsonElement headers;

  private transient JSON serializer;

  public RemoteResponseRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public RemoteResponseRawJson method(String method) {
    this.method = this.serializer.getGson().toJsonTree(method);
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GET", required = true, value = "")

  public JsonElement getMethod() {
    return method;
  }
  public void setMethod(JsonElement method) {
    this.method = method;
  }

  public RemoteResponseRawJson path(String path) {
    this.path = this.serializer.getGson().toJsonTree(path);
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/scooters", required = true, value = "")

  public JsonElement getPath() {
    return path;
  }
  public void setPath(JsonElement path) {
    this.path = path;
  }

  public RemoteResponseRawJson status(Integer status) {
    this.status = this.serializer.getGson().toJsonTree(status);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "")

  public JsonElement getStatus() {
    return status;
  }
  public void setStatus(JsonElement status) {
    this.status = status;
  }

  public RemoteResponseRawJson response(Map<String, Object> response) {
    this.response = this.serializer.getGson().toJsonTree(response);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"scooters\":[{\"company\":\"Lime\",\"model\":\"Gen 2.5\"},{\"company\":\"Bird\",\"model\":\"Bird Zero\"}]}", required = true, value = "")

  public JsonElement getResponse() {
    return response;
  }
  public void setResponse(JsonElement response) {
    this.response = response;
  }

  public RemoteResponseRawJson headers(Map<String, Object> headers) {
    this.headers = this.serializer.getGson().toJsonTree(headers);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"EXTRA-HEADER\":\"value\",\"Authorization\":\"<redacted>\"}", value = "")

  public JsonElement getHeaders() {
    return headers;
  }
  public void setHeaders(JsonElement headers) {
    this.headers = headers;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteResponseRawJson remoteResponse = (RemoteResponseRawJson) o;
    return Objects.equals(this.method.getAsString(), remoteResponse.method.getAsString()) &&
        Objects.equals(this.path.getAsString(), remoteResponse.path.getAsString()) &&
        Objects.equals(this.status.getAsString(), remoteResponse.status.getAsString()) &&
        Objects.equals(this.response.getAsString(), remoteResponse.response.getAsString()) &&
        Objects.equals(this.headers.getAsString(), remoteResponse.headers.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(method, path, status, response, headers);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteResponseRawJson {\n");
    sb.append("    method: ").append(toIndentedString(method.getAsString())).append("\n");
    sb.append("    path: ").append(toIndentedString(path.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
    sb.append("    response: ").append(toIndentedString(response.getAsString())).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers.getAsString())).append("\n");
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


