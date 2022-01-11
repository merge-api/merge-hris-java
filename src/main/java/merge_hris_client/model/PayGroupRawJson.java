
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
 * # The PayGroup Object ### Description The &#x60;PayGroup&#x60; object is used to represent Pay Group information that employees belong to. This is often referenced with an Employee object.  ### Usage Example Fetch from the &#x60;LIST PayGroup&#x60; endpoint and filter by &#x60;ID&#x60; to show all pay group information.
 */
@ApiModel(description = "# The PayGroup Object ### Description The `PayGroup` object is used to represent Pay Group information that employees belong to. This is often referenced with an Employee object.  ### Usage Example Fetch from the `LIST PayGroup` endpoint and filter by `ID` to show all pay group information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T18:45:23.445197Z[Etc/UTC]")
public class PayGroupRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_PAY_GROUP_NAME = "pay_group_name";
  @SerializedName(SERIALIZED_NAME_PAY_GROUP_NAME)
  private JsonElement payGroupName;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public PayGroupRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fd1e0fb5-8f92-4ec9-9f32-179cf732867d", value = "")

  public JsonElement getId() {
    return id;
  }

  public PayGroupRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "800293", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public PayGroupRawJson payGroupName(String payGroupName) {
    this.payGroupName = this.serializer.getGson().toJsonTree(payGroupName);
    return this;
  }

   /**
   * The pay group name.
   * @return payGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contractor", value = "The pay group name.")

  public JsonElement getPayGroupName() {
    return payGroupName;
  }
  public void setPayGroupName(JsonElement payGroupName) {
    this.payGroupName = payGroupName;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/pay-group\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayGroupRawJson payGroup = (PayGroupRawJson) o;
    return Objects.equals(this.id.getAsString(), payGroup.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), payGroup.remoteId.getAsString()) &&
        Objects.equals(this.payGroupName.getAsString(), payGroup.payGroupName.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), payGroup.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, payGroupName, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayGroupRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    payGroupName: ").append(toIndentedString(payGroupName.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
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


