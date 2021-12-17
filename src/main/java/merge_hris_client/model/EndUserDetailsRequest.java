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
import java.util.List;
import merge_hris_client.model.CategoriesEnum;

/**
 * EndUserDetailsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T20:24:25.647062Z[Etc/UTC]")
public class EndUserDetailsRequest {
  public static final String SERIALIZED_NAME_END_USER_EMAIL_ADDRESS = "end_user_email_address";
  @SerializedName(SERIALIZED_NAME_END_USER_EMAIL_ADDRESS)
  private String endUserEmailAddress;

  public static final String SERIALIZED_NAME_END_USER_ORGANIZATION_NAME = "end_user_organization_name";
  @SerializedName(SERIALIZED_NAME_END_USER_ORGANIZATION_NAME)
  private String endUserOrganizationName;

  public static final String SERIALIZED_NAME_END_USER_ORIGIN_ID = "end_user_origin_id";
  @SerializedName(SERIALIZED_NAME_END_USER_ORIGIN_ID)
  private String endUserOriginId;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoriesEnum> categories = null;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private String integration;


  public EndUserDetailsRequest endUserEmailAddress(String endUserEmailAddress) {
    
    this.endUserEmailAddress = endUserEmailAddress;
    return this;
  }

   /**
   * Get endUserEmailAddress
   * @return endUserEmailAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEndUserEmailAddress() {
    return endUserEmailAddress;
  }


  public void setEndUserEmailAddress(String endUserEmailAddress) {
    this.endUserEmailAddress = endUserEmailAddress;
  }


  public EndUserDetailsRequest endUserOrganizationName(String endUserOrganizationName) {
    
    this.endUserOrganizationName = endUserOrganizationName;
    return this;
  }

   /**
   * Get endUserOrganizationName
   * @return endUserOrganizationName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEndUserOrganizationName() {
    return endUserOrganizationName;
  }


  public void setEndUserOrganizationName(String endUserOrganizationName) {
    this.endUserOrganizationName = endUserOrganizationName;
  }


  public EndUserDetailsRequest endUserOriginId(String endUserOriginId) {
    
    this.endUserOriginId = endUserOriginId;
    return this;
  }

   /**
   * Get endUserOriginId
   * @return endUserOriginId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEndUserOriginId() {
    return endUserOriginId;
  }


  public void setEndUserOriginId(String endUserOriginId) {
    this.endUserOriginId = endUserOriginId;
  }


  public EndUserDetailsRequest categories(List<CategoriesEnum> categories) {
    
    this.categories = categories;
    return this;
  }

  public EndUserDetailsRequest addCategoriesItem(CategoriesEnum categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoriesEnum>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CategoriesEnum> getCategories() {
    return categories;
  }


  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }


  public EndUserDetailsRequest integration(String integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIntegration() {
    return integration;
  }


  public void setIntegration(String integration) {
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
    EndUserDetailsRequest endUserDetailsRequest = (EndUserDetailsRequest) o;
    return Objects.equals(this.endUserEmailAddress, endUserDetailsRequest.endUserEmailAddress) &&
        Objects.equals(this.endUserOrganizationName, endUserDetailsRequest.endUserOrganizationName) &&
        Objects.equals(this.endUserOriginId, endUserDetailsRequest.endUserOriginId) &&
        Objects.equals(this.categories, endUserDetailsRequest.categories) &&
        Objects.equals(this.integration, endUserDetailsRequest.integration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endUserEmailAddress, endUserOrganizationName, endUserOriginId, categories, integration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUserDetailsRequest {\n");
    sb.append("    endUserEmailAddress: ").append(toIndentedString(endUserEmailAddress)).append("\n");
    sb.append("    endUserOrganizationName: ").append(toIndentedString(endUserOrganizationName)).append("\n");
    sb.append("    endUserOriginId: ").append(toIndentedString(endUserOriginId)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

