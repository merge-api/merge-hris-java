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
import merge_hris_client.model.AccountDetailsAndActionsIntegration;
import merge_hris_client.model.AccountDetailsAndActionsStatusEnum;
import merge_hris_client.model.CategoryEnum;

/**
 * # The LinkedAccount Object ### Description The &#x60;LinkedAccount&#x60; object is used to represent an end user&#39;s link with a specific integration.  ### Usage Example View a list of your organization&#39;s &#x60;LinkedAccount&#x60; objects.
 */
@ApiModel(description = "# The LinkedAccount Object ### Description The `LinkedAccount` object is used to represent an end user's link with a specific integration.  ### Usage Example View a list of your organization's `LinkedAccount` objects.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:43:08.820708Z[Etc/UTC]")
public class AccountDetailsAndActions {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AccountDetailsAndActionsStatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_DETAIL = "status_detail";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAIL)
  private String statusDetail;

  public static final String SERIALIZED_NAME_END_USER_ORIGIN_ID = "end_user_origin_id";
  @SerializedName(SERIALIZED_NAME_END_USER_ORIGIN_ID)
  private String endUserOriginId;

  public static final String SERIALIZED_NAME_END_USER_ORGANIZATION_NAME = "end_user_organization_name";
  @SerializedName(SERIALIZED_NAME_END_USER_ORGANIZATION_NAME)
  private String endUserOrganizationName;

  public static final String SERIALIZED_NAME_END_USER_EMAIL_ADDRESS = "end_user_email_address";
  @SerializedName(SERIALIZED_NAME_END_USER_EMAIL_ADDRESS)
  private String endUserEmailAddress;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private AccountDetailsAndActionsIntegration integration;


  public AccountDetailsAndActions id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "e59b1821-f85c-4e28-a6b3-1804156f3563", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AccountDetailsAndActions category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hris", value = "")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public AccountDetailsAndActions status(AccountDetailsAndActionsStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "COMPLETE", required = true, value = "")

  public AccountDetailsAndActionsStatusEnum getStatus() {
    return status;
  }


  public void setStatus(AccountDetailsAndActionsStatusEnum status) {
    this.status = status;
  }


  public AccountDetailsAndActions statusDetail(String statusDetail) {
    
    this.statusDetail = statusDetail;
    return this;
  }

   /**
   * Get statusDetail
   * @return statusDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusDetail() {
    return statusDetail;
  }


  public void setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
  }


  public AccountDetailsAndActions endUserOriginId(String endUserOriginId) {
    
    this.endUserOriginId = endUserOriginId;
    return this;
  }

   /**
   * Get endUserOriginId
   * @return endUserOriginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3ac95cde-6c7f-4eef-afec-be710b42308d", value = "")

  public String getEndUserOriginId() {
    return endUserOriginId;
  }


  public void setEndUserOriginId(String endUserOriginId) {
    this.endUserOriginId = endUserOriginId;
  }


  public AccountDetailsAndActions endUserOrganizationName(String endUserOrganizationName) {
    
    this.endUserOrganizationName = endUserOrganizationName;
    return this;
  }

   /**
   * Get endUserOrganizationName
   * @return endUserOrganizationName
  **/
  @ApiModelProperty(example = "Foo Bar, LLC", required = true, value = "")

  public String getEndUserOrganizationName() {
    return endUserOrganizationName;
  }


  public void setEndUserOrganizationName(String endUserOrganizationName) {
    this.endUserOrganizationName = endUserOrganizationName;
  }


  public AccountDetailsAndActions endUserEmailAddress(String endUserEmailAddress) {
    
    this.endUserEmailAddress = endUserEmailAddress;
    return this;
  }

   /**
   * Get endUserEmailAddress
   * @return endUserEmailAddress
  **/
  @ApiModelProperty(example = "hradmin@foobar.dev", required = true, value = "")

  public String getEndUserEmailAddress() {
    return endUserEmailAddress;
  }


  public void setEndUserEmailAddress(String endUserEmailAddress) {
    this.endUserEmailAddress = endUserEmailAddress;
  }


  public AccountDetailsAndActions integration(AccountDetailsAndActionsIntegration integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountDetailsAndActionsIntegration getIntegration() {
    return integration;
  }


  public void setIntegration(AccountDetailsAndActionsIntegration integration) {
    this.integration = integration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsAndActions accountDetailsAndActions = (AccountDetailsAndActions) o;
    return Objects.equals(this.id, accountDetailsAndActions.id) &&
        Objects.equals(this.category, accountDetailsAndActions.category) &&
        Objects.equals(this.status, accountDetailsAndActions.status) &&
        Objects.equals(this.statusDetail, accountDetailsAndActions.statusDetail) &&
        Objects.equals(this.endUserOriginId, accountDetailsAndActions.endUserOriginId) &&
        Objects.equals(this.endUserOrganizationName, accountDetailsAndActions.endUserOrganizationName) &&
        Objects.equals(this.endUserEmailAddress, accountDetailsAndActions.endUserEmailAddress) &&
        Objects.equals(this.integration, accountDetailsAndActions.integration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, status, statusDetail, endUserOriginId, endUserOrganizationName, endUserEmailAddress, integration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsAndActions {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
    sb.append("    endUserOriginId: ").append(toIndentedString(endUserOriginId)).append("\n");
    sb.append("    endUserOrganizationName: ").append(toIndentedString(endUserOrganizationName)).append("\n");
    sb.append("    endUserEmailAddress: ").append(toIndentedString(endUserEmailAddress)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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

