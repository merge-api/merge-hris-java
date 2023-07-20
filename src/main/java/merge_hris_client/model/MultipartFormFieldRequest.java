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
import merge_hris_client.model.EncodingEnum;

/**
 * # The MultipartFormField Object ### Description The &#x60;MultipartFormField&#x60; object is used to represent fields in an HTTP request using &#x60;multipart/form-data&#x60;.  ### Usage Example Create a &#x60;MultipartFormField&#x60; to define a multipart form entry.
 */
@ApiModel(description = "# The MultipartFormField Object ### Description The `MultipartFormField` object is used to represent fields in an HTTP request using `multipart/form-data`.  ### Usage Example Create a `MultipartFormField` to define a multipart form entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class MultipartFormFieldRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private EncodingEnum encoding;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;


  public MultipartFormFieldRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the form field
   * @return name
  **/
  @ApiModelProperty(example = "resume", required = true, value = "The name of the form field")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MultipartFormFieldRequest data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * The data for the form field.
   * @return data
  **/
  @ApiModelProperty(example = "SW50ZWdyYXRlIGZhc3QKSW50ZWdyYXRlIG9uY2U=", required = true, value = "The data for the form field.")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public MultipartFormFieldRequest encoding(EncodingEnum encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * The encoding of the value of &#x60;data&#x60;. Defaults to &#x60;RAW&#x60; if not defined.
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BASE64", value = "The encoding of the value of `data`. Defaults to `RAW` if not defined.")

  public EncodingEnum getEncoding() {
    return encoding;
  }


  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }


  public MultipartFormFieldRequest fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * The file name of the form field, if the field is for a file.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "resume.pdf", value = "The file name of the form field, if the field is for a file.")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public MultipartFormFieldRequest contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The MIME type of the file, if the field is for a file.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/pdf", value = "The MIME type of the file, if the field is for a file.")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
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
    MultipartFormFieldRequest multipartFormFieldRequest = (MultipartFormFieldRequest) o;
    return Objects.equals(this.name, multipartFormFieldRequest.name) &&
        Objects.equals(this.data, multipartFormFieldRequest.data) &&
        Objects.equals(this.encoding, multipartFormFieldRequest.encoding) &&
        Objects.equals(this.fileName, multipartFormFieldRequest.fileName) &&
        Objects.equals(this.contentType, multipartFormFieldRequest.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, data, encoding, fileName, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipartFormFieldRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

