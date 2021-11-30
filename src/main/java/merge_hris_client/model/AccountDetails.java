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
import java.util.UUID;
import merge_hris_client.model.CategoryEnum;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T20:32:28.722726-05:00[America/New_York]")
public class AccountDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private String integration;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_END_USER_ORIGIN_ID = "end_user_origin_id";
  @SerializedName(SERIALIZED_NAME_END_USER_ORIGIN_ID)
  private String endUserOriginId;

  public static final String SERIALIZED_NAME_END_USER_ORGANIZATION_NAME = "end_user_organization_name";
  @SerializedName(SERIALIZED_NAME_END_USER_ORGANIZATION_NAME)
  private String endUserOrganizationName;

  public static final String SERIALIZED_NAME_END_USER_EMAIL_ADDRESS = "end_user_email_address";
  @SerializedName(SERIALIZED_NAME_END_USER_EMAIL_ADDRESS)
  private String endUserEmailAddress;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
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




  public AccountDetails category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


   /**
   * Get endUserOriginId
   * @return endUserOriginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndUserOriginId() {
    return endUserOriginId;
  }




   /**
   * Get endUserOrganizationName
   * @return endUserOrganizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndUserOrganizationName() {
    return endUserOrganizationName;
  }




   /**
   * Get endUserEmailAddress
   * @return endUserEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndUserEmailAddress() {
    return endUserEmailAddress;
  }




   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
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
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.id, accountDetails.id) &&
        Objects.equals(this.integration, accountDetails.integration) &&
        Objects.equals(this.category, accountDetails.category) &&
        Objects.equals(this.endUserOriginId, accountDetails.endUserOriginId) &&
        Objects.equals(this.endUserOrganizationName, accountDetails.endUserOrganizationName) &&
        Objects.equals(this.endUserEmailAddress, accountDetails.endUserEmailAddress) &&
        Objects.equals(this.status, accountDetails.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, integration, category, endUserOriginId, endUserOrganizationName, endUserEmailAddress, status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    endUserOriginId: ").append(toIndentedString(endUserOriginId)).append("\n");
    sb.append("    endUserOrganizationName: ").append(toIndentedString(endUserOrganizationName)).append("\n");
    sb.append("    endUserEmailAddress: ").append(toIndentedString(endUserEmailAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

