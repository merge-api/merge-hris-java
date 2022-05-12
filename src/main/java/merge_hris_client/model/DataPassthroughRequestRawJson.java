
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
 * # The DataPassthrough Object ### Description The &#x60;DataPassthrough&#x60; object is used to send information to an otherwise-unsupported third-party endpoint.  ### Usage Example Create a &#x60;DataPassthrough&#x60; to get team hierarchies from your Rippling integration.
 */
@ApiModel(description = "# The DataPassthrough Object ### Description The `DataPassthrough` object is used to send information to an otherwise-unsupported third-party endpoint.  ### Usage Example Create a `DataPassthrough` to get team hierarchies from your Rippling integration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-12T20:57:27.935941Z[Etc/UTC]")
public class DataPassthroughRequestRawJson {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private JsonElement method;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private JsonElement path;

  public static final String SERIALIZED_NAME_BASE_URL_OVERRIDE = "base_url_override";
  @SerializedName(SERIALIZED_NAME_BASE_URL_OVERRIDE)
  private JsonElement baseUrlOverride;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private JsonElement data;

  public static final String SERIALIZED_NAME_MULTIPART_FORM_DATA = "multipart_form_data";
  @SerializedName(SERIALIZED_NAME_MULTIPART_FORM_DATA)
  private JsonElement multipartFormData;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private JsonElement headers;

  public static final String SERIALIZED_NAME_REQUEST_FORMAT = "request_format";
  @SerializedName(SERIALIZED_NAME_REQUEST_FORMAT)
  private JsonElement requestFormat;

  private transient JSON serializer;

  public DataPassthroughRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public DataPassthroughRequestRawJson method(MethodEnum method) {
    this.method = this.serializer.getGson().toJsonTree(method);
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "POST", required = true, value = "")

  public JsonElement getMethod() {
    return method;
  }
  public void setMethod(JsonElement method) {
    this.method = method;
  }

  public DataPassthroughRequestRawJson path(String path) {
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

  public DataPassthroughRequestRawJson baseUrlOverride(String baseUrlOverride) {
    this.baseUrlOverride = this.serializer.getGson().toJsonTree(baseUrlOverride);
    return this;
  }

   /**
   * Get baseUrlOverride
   * @return baseUrlOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getBaseUrlOverride() {
    return baseUrlOverride;
  }
  public void setBaseUrlOverride(JsonElement baseUrlOverride) {
    this.baseUrlOverride = baseUrlOverride;
  }

  public DataPassthroughRequestRawJson data(String data) {
    this.data = this.serializer.getGson().toJsonTree(data);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"company\": \"Lime\", \"model\": \"Gen 2.5\"}", value = "")

  public JsonElement getData() {
    return data;
  }
  public void setData(JsonElement data) {
    this.data = data;
  }

  public DataPassthroughRequestRawJson multipartFormData(List<MultipartFormFieldRequest> multipartFormData) {
    this.multipartFormData = this.serializer.getGson().toJsonTree(multipartFormData);
    return this;
  }

   /**
   * Pass an array of &#x60;MultipartFormField&#x60; objects in here instead of using the &#x60;data&#x60; param if &#x60;request_format&#x60; is set to &#x60;MULTIPART&#x60;.
   * @return multipartFormData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pass an array of `MultipartFormField` objects in here instead of using the `data` param if `request_format` is set to `MULTIPART`.")

  public JsonElement getMultipartFormData() {
    return multipartFormData;
  }
  public void setMultipartFormData(JsonElement multipartFormData) {
    this.multipartFormData = multipartFormData;
  }

  public DataPassthroughRequestRawJson headers(Map<String, Object> headers) {
    this.headers = this.serializer.getGson().toJsonTree(headers);
    return this;
  }

   /**
   * The headers to use for the request (Merge will handle the account&#39;s authorization headers). &#x60;Content-Type&#x60; header is required for passthrough. Choose content type corresponding to expected format of receiving server.
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"EXTRA-HEADER\":\"value\"}", value = "The headers to use for the request (Merge will handle the account's authorization headers). `Content-Type` header is required for passthrough. Choose content type corresponding to expected format of receiving server.")

  public JsonElement getHeaders() {
    return headers;
  }
  public void setHeaders(JsonElement headers) {
    this.headers = headers;
  }

  public DataPassthroughRequestRawJson requestFormat(RequestFormatEnum requestFormat) {
    this.requestFormat = this.serializer.getGson().toJsonTree(requestFormat);
    return this;
  }

   /**
   * Get requestFormat
   * @return requestFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JSON", value = "")

  public JsonElement getRequestFormat() {
    return requestFormat;
  }
  public void setRequestFormat(JsonElement requestFormat) {
    this.requestFormat = requestFormat;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPassthroughRequestRawJson dataPassthroughRequest = (DataPassthroughRequestRawJson) o;
    return Objects.equals(this.method.getAsString(), dataPassthroughRequest.method.getAsString()) &&
        Objects.equals(this.path.getAsString(), dataPassthroughRequest.path.getAsString()) &&
        Objects.equals(this.baseUrlOverride.getAsString(), dataPassthroughRequest.baseUrlOverride.getAsString()) &&
        Objects.equals(this.data.getAsString(), dataPassthroughRequest.data.getAsString()) &&
        Objects.equals(this.multipartFormData.getAsString(), dataPassthroughRequest.multipartFormData.getAsString()) &&
        Objects.equals(this.headers.getAsString(), dataPassthroughRequest.headers.getAsString()) &&
        Objects.equals(this.requestFormat.getAsString(), dataPassthroughRequest.requestFormat.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(method, path, baseUrlOverride, data, multipartFormData, headers, requestFormat);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPassthroughRequestRawJson {\n");
    sb.append("    method: ").append(toIndentedString(method.getAsString())).append("\n");
    sb.append("    path: ").append(toIndentedString(path.getAsString())).append("\n");
    sb.append("    baseUrlOverride: ").append(toIndentedString(baseUrlOverride.getAsString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data.getAsString())).append("\n");
    sb.append("    multipartFormData: ").append(toIndentedString(multipartFormData.getAsString())).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers.getAsString())).append("\n");
    sb.append("    requestFormat: ").append(toIndentedString(requestFormat.getAsString())).append("\n");
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


