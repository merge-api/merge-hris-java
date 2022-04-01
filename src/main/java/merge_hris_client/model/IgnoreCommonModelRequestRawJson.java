
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
 * IgnoreCommonModelRequestRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-01T17:28:53.688853Z[Etc/UTC]")
public class IgnoreCommonModelRequestRawJson {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private JsonElement reason;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private JsonElement message;

  private transient JSON serializer;

  public IgnoreCommonModelRequestRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public IgnoreCommonModelRequestRawJson reason(ReasonEnum reason) {
    this.reason = this.serializer.getGson().toJsonTree(reason);
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GENERAL_CUSTOMER_REQUEST", required = true, value = "")

  public JsonElement getReason() {
    return reason;
  }
  public void setReason(JsonElement reason) {
    this.reason = reason;
  }

  public IgnoreCommonModelRequestRawJson message(String message) {
    this.message = this.serializer.getGson().toJsonTree(message);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "deletion request by user id 51903790-7dfe-4053-8d63-5a10cc4ffd39", value = "")

  public JsonElement getMessage() {
    return message;
  }
  public void setMessage(JsonElement message) {
    this.message = message;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IgnoreCommonModelRequestRawJson ignoreCommonModelRequest = (IgnoreCommonModelRequestRawJson) o;
    return Objects.equals(this.reason.getAsString(), ignoreCommonModelRequest.reason.getAsString()) &&
        Objects.equals(this.message.getAsString(), ignoreCommonModelRequest.message.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(reason, message);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IgnoreCommonModelRequestRawJson {\n");
    sb.append("    reason: ").append(toIndentedString(reason.getAsString())).append("\n");
    sb.append("    message: ").append(toIndentedString(message.getAsString())).append("\n");
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


