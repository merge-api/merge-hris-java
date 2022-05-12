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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import merge_hris_client.model.MethodEnum;
import merge_hris_client.model.MultipartFormFieldRequest;
import merge_hris_client.model.RequestFormatEnum;

/**
 * # The DataPassthrough Object ### Description The &#x60;DataPassthrough&#x60; object is used to send information to an otherwise-unsupported third-party endpoint.  ### Usage Example Create a &#x60;DataPassthrough&#x60; to get team hierarchies from your Rippling integration.
 */
@ApiModel(description = "# The DataPassthrough Object ### Description The `DataPassthrough` object is used to send information to an otherwise-unsupported third-party endpoint.  ### Usage Example Create a `DataPassthrough` to get team hierarchies from your Rippling integration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-12T20:57:27.935941Z[Etc/UTC]")
public class DataPassthroughRequest {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_BASE_URL_OVERRIDE = "base_url_override";
  @SerializedName(SERIALIZED_NAME_BASE_URL_OVERRIDE)
  private String baseUrlOverride;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_MULTIPART_FORM_DATA = "multipart_form_data";
  @SerializedName(SERIALIZED_NAME_MULTIPART_FORM_DATA)
  private List<MultipartFormFieldRequest> multipartFormData = null;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, Object> headers = null;

  public static final String SERIALIZED_NAME_REQUEST_FORMAT = "request_format";
  @SerializedName(SERIALIZED_NAME_REQUEST_FORMAT)
  private RequestFormatEnum requestFormat;


  public DataPassthroughRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "POST", required = true, value = "")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public DataPassthroughRequest path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(example = "/scooters", required = true, value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DataPassthroughRequest baseUrlOverride(String baseUrlOverride) {
    
    this.baseUrlOverride = baseUrlOverride;
    return this;
  }

   /**
   * Get baseUrlOverride
   * @return baseUrlOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseUrlOverride() {
    return baseUrlOverride;
  }


  public void setBaseUrlOverride(String baseUrlOverride) {
    this.baseUrlOverride = baseUrlOverride;
  }


  public DataPassthroughRequest data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"company\": \"Lime\", \"model\": \"Gen 2.5\"}", value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public DataPassthroughRequest multipartFormData(List<MultipartFormFieldRequest> multipartFormData) {
    
    this.multipartFormData = multipartFormData;
    return this;
  }

  public DataPassthroughRequest addMultipartFormDataItem(MultipartFormFieldRequest multipartFormDataItem) {
    if (this.multipartFormData == null) {
      this.multipartFormData = new ArrayList<MultipartFormFieldRequest>();
    }
    this.multipartFormData.add(multipartFormDataItem);
    return this;
  }

   /**
   * Pass an array of &#x60;MultipartFormField&#x60; objects in here instead of using the &#x60;data&#x60; param if &#x60;request_format&#x60; is set to &#x60;MULTIPART&#x60;.
   * @return multipartFormData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pass an array of `MultipartFormField` objects in here instead of using the `data` param if `request_format` is set to `MULTIPART`.")

  public List<MultipartFormFieldRequest> getMultipartFormData() {
    return multipartFormData;
  }


  public void setMultipartFormData(List<MultipartFormFieldRequest> multipartFormData) {
    this.multipartFormData = multipartFormData;
  }


  public DataPassthroughRequest headers(Map<String, Object> headers) {
    
    this.headers = headers;
    return this;
  }

  public DataPassthroughRequest putHeadersItem(String key, Object headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, Object>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * The headers to use for the request (Merge will handle the account&#39;s authorization headers). &#x60;Content-Type&#x60; header is required for passthrough. Choose content type corresponding to expected format of receiving server.
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"EXTRA-HEADER\":\"value\"}", value = "The headers to use for the request (Merge will handle the account's authorization headers). `Content-Type` header is required for passthrough. Choose content type corresponding to expected format of receiving server.")

  public Map<String, Object> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }


  public DataPassthroughRequest requestFormat(RequestFormatEnum requestFormat) {
    
    this.requestFormat = requestFormat;
    return this;
  }

   /**
   * Get requestFormat
   * @return requestFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JSON", value = "")

  public RequestFormatEnum getRequestFormat() {
    return requestFormat;
  }


  public void setRequestFormat(RequestFormatEnum requestFormat) {
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
    DataPassthroughRequest dataPassthroughRequest = (DataPassthroughRequest) o;
    return Objects.equals(this.method, dataPassthroughRequest.method) &&
        Objects.equals(this.path, dataPassthroughRequest.path) &&
        Objects.equals(this.baseUrlOverride, dataPassthroughRequest.baseUrlOverride) &&
        Objects.equals(this.data, dataPassthroughRequest.data) &&
        Objects.equals(this.multipartFormData, dataPassthroughRequest.multipartFormData) &&
        Objects.equals(this.headers, dataPassthroughRequest.headers) &&
        Objects.equals(this.requestFormat, dataPassthroughRequest.requestFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, path, baseUrlOverride, data, multipartFormData, headers, requestFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPassthroughRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    baseUrlOverride: ").append(toIndentedString(baseUrlOverride)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    multipartFormData: ").append(toIndentedString(multipartFormData)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    requestFormat: ").append(toIndentedString(requestFormat)).append("\n");
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

