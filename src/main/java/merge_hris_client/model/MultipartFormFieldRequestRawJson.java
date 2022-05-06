
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
 * # The MultipartFormField Object ### Description The &#x60;MultipartFormField&#x60; object is used to represent fields in an HTTP request using &#x60;multipart/form-data&#x60;.  ### Usage Example Create a &#x60;MultipartFormField&#x60; to define a multipart form entry.
 */
@ApiModel(description = "# The MultipartFormField Object ### Description The `MultipartFormField` object is used to represent fields in an HTTP request using `multipart/form-data`.  ### Usage Example Create a `MultipartFormField` to define a multipart form entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-06T21:54:01.920674Z[Etc/UTC]")
public class MultipartFormFieldRequestRawJson {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private JsonElement data;

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private JsonElement encoding;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private JsonElement fileName;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private JsonElement contentType;

  private transient JSON serializer;

  public MultipartFormFieldRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public MultipartFormFieldRequestRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * The name of the form field
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "resume", required = true, value = "The name of the form field")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public MultipartFormFieldRequestRawJson data(String data) {
    this.data = this.serializer.getGson().toJsonTree(data);
    return this;
  }

   /**
   * The data for the form field.
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SW50ZWdyYXRlIGZhc3QKSW50ZWdyYXRlIG9uY2U=", required = true, value = "The data for the form field.")

  public JsonElement getData() {
    return data;
  }
  public void setData(JsonElement data) {
    this.data = data;
  }

  public MultipartFormFieldRequestRawJson encoding(EncodingEnum encoding) {
    this.encoding = this.serializer.getGson().toJsonTree(encoding);
    return this;
  }

   /**
   * The encoding of the value of &#x60;data&#x60;. Defaults to &#x60;RAW&#x60; if not defined.
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BASE64", value = "The encoding of the value of `data`. Defaults to `RAW` if not defined.")

  public JsonElement getEncoding() {
    return encoding;
  }
  public void setEncoding(JsonElement encoding) {
    this.encoding = encoding;
  }

  public MultipartFormFieldRequestRawJson fileName(String fileName) {
    this.fileName = this.serializer.getGson().toJsonTree(fileName);
    return this;
  }

   /**
   * The file name of the form field, if the field is for a file.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "resume.pdf", value = "The file name of the form field, if the field is for a file.")

  public JsonElement getFileName() {
    return fileName;
  }
  public void setFileName(JsonElement fileName) {
    this.fileName = fileName;
  }

  public MultipartFormFieldRequestRawJson contentType(String contentType) {
    this.contentType = this.serializer.getGson().toJsonTree(contentType);
    return this;
  }

   /**
   * The MIME type of the file, if the field is for a file.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/pdf", value = "The MIME type of the file, if the field is for a file.")

  public JsonElement getContentType() {
    return contentType;
  }
  public void setContentType(JsonElement contentType) {
    this.contentType = contentType;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipartFormFieldRequestRawJson multipartFormFieldRequest = (MultipartFormFieldRequestRawJson) o;
    return Objects.equals(this.name.getAsString(), multipartFormFieldRequest.name.getAsString()) &&
        Objects.equals(this.data.getAsString(), multipartFormFieldRequest.data.getAsString()) &&
        Objects.equals(this.encoding.getAsString(), multipartFormFieldRequest.encoding.getAsString()) &&
        Objects.equals(this.fileName.getAsString(), multipartFormFieldRequest.fileName.getAsString()) &&
        Objects.equals(this.contentType.getAsString(), multipartFormFieldRequest.contentType.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, data, encoding, fileName, contentType);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipartFormFieldRequestRawJson {\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data.getAsString())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding.getAsString())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName.getAsString())).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType.getAsString())).append("\n");
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


