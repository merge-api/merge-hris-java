
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
 * AccountDetailsRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:43:08.820708Z[Etc/UTC]")
public class AccountDetailsRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private JsonElement integration;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private JsonElement category;

  public static final String SERIALIZED_NAME_END_USER_ORIGIN_ID = "end_user_origin_id";
  @SerializedName(SERIALIZED_NAME_END_USER_ORIGIN_ID)
  private JsonElement endUserOriginId;

  public static final String SERIALIZED_NAME_END_USER_ORGANIZATION_NAME = "end_user_organization_name";
  @SerializedName(SERIALIZED_NAME_END_USER_ORGANIZATION_NAME)
  private JsonElement endUserOrganizationName;

  public static final String SERIALIZED_NAME_END_USER_EMAIL_ADDRESS = "end_user_email_address";
  @SerializedName(SERIALIZED_NAME_END_USER_EMAIL_ADDRESS)
  private JsonElement endUserEmailAddress;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonElement status;

  private transient JSON serializer;

  public AccountDetailsRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0496d4c2-42e6-4072-80b3-7b69bfdc76fd", value = "")

  public JsonElement getId() {
    return id;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BambooHR", value = "")

  public JsonElement getIntegration() {
    return integration;
  }

  public AccountDetailsRawJson category(CategoryEnum category) {
    this.category = this.serializer.getGson().toJsonTree(category);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hris", value = "")

  public JsonElement getCategory() {
    return category;
  }
  public void setCategory(JsonElement category) {
    this.category = category;
  }

   /**
   * Get endUserOriginId
   * @return endUserOriginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "")

  public JsonElement getEndUserOriginId() {
    return endUserOriginId;
  }

   /**
   * Get endUserOrganizationName
   * @return endUserOrganizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Waystar Royco", value = "")

  public JsonElement getEndUserOrganizationName() {
    return endUserOrganizationName;
  }

   /**
   * Get endUserEmailAddress
   * @return endUserEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kendall.roy@waystar-royco.com", value = "")

  public JsonElement getEndUserEmailAddress() {
    return endUserEmailAddress;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMPLETE", value = "")

  public JsonElement getStatus() {
    return status;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsRawJson accountDetails = (AccountDetailsRawJson) o;
    return Objects.equals(this.id.getAsString(), accountDetails.id.getAsString()) &&
        Objects.equals(this.integration.getAsString(), accountDetails.integration.getAsString()) &&
        Objects.equals(this.category.getAsString(), accountDetails.category.getAsString()) &&
        Objects.equals(this.endUserOriginId.getAsString(), accountDetails.endUserOriginId.getAsString()) &&
        Objects.equals(this.endUserOrganizationName.getAsString(), accountDetails.endUserOrganizationName.getAsString()) &&
        Objects.equals(this.endUserEmailAddress.getAsString(), accountDetails.endUserEmailAddress.getAsString()) &&
        Objects.equals(this.status.getAsString(), accountDetails.status.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, integration, category, endUserOriginId, endUserOrganizationName, endUserEmailAddress, status);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration.getAsString())).append("\n");
    sb.append("    category: ").append(toIndentedString(category.getAsString())).append("\n");
    sb.append("    endUserOriginId: ").append(toIndentedString(endUserOriginId.getAsString())).append("\n");
    sb.append("    endUserOrganizationName: ").append(toIndentedString(endUserOrganizationName.getAsString())).append("\n");
    sb.append("    endUserEmailAddress: ").append(toIndentedString(endUserEmailAddress.getAsString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status.getAsString())).append("\n");
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


