
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
 * AccountDetailsAndActionsIntegrationRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-06T21:54:01.920674Z[Etc/UTC]")
public class AccountDetailsAndActionsIntegrationRawJson {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private JsonElement categories;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private JsonElement image;

  public static final String SERIALIZED_NAME_SQUARE_IMAGE = "square_image";
  @SerializedName(SERIALIZED_NAME_SQUARE_IMAGE)
  private JsonElement squareImage;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private JsonElement color;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private JsonElement slug;

  public static final String SERIALIZED_NAME_PASSTHROUGH_AVAILABLE = "passthrough_available";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH_AVAILABLE)
  private JsonElement passthroughAvailable;

  public static final String SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS = "available_model_operations";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MODEL_OPERATIONS)
  private JsonElement availableModelOperations;

  private transient JSON serializer;

  public AccountDetailsAndActionsIntegrationRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public AccountDetailsAndActionsIntegrationRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public AccountDetailsAndActionsIntegrationRawJson categories(List<CategoriesEnum> categories) {
    this.categories = this.serializer.getGson().toJsonTree(categories);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getCategories() {
    return categories;
  }
  public void setCategories(JsonElement categories) {
    this.categories = categories;
  }

  public AccountDetailsAndActionsIntegrationRawJson image(String image) {
    this.image = this.serializer.getGson().toJsonTree(image);
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getImage() {
    return image;
  }
  public void setImage(JsonElement image) {
    this.image = image;
  }

  public AccountDetailsAndActionsIntegrationRawJson squareImage(String squareImage) {
    this.squareImage = this.serializer.getGson().toJsonTree(squareImage);
    return this;
  }

   /**
   * Get squareImage
   * @return squareImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getSquareImage() {
    return squareImage;
  }
  public void setSquareImage(JsonElement squareImage) {
    this.squareImage = squareImage;
  }

  public AccountDetailsAndActionsIntegrationRawJson color(String color) {
    this.color = this.serializer.getGson().toJsonTree(color);
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getColor() {
    return color;
  }
  public void setColor(JsonElement color) {
    this.color = color;
  }

  public AccountDetailsAndActionsIntegrationRawJson slug(String slug) {
    this.slug = this.serializer.getGson().toJsonTree(slug);
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getSlug() {
    return slug;
  }
  public void setSlug(JsonElement slug) {
    this.slug = slug;
  }

  public AccountDetailsAndActionsIntegrationRawJson passthroughAvailable(Boolean passthroughAvailable) {
    this.passthroughAvailable = this.serializer.getGson().toJsonTree(passthroughAvailable);
    return this;
  }

   /**
   * Get passthroughAvailable
   * @return passthroughAvailable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonElement getPassthroughAvailable() {
    return passthroughAvailable;
  }
  public void setPassthroughAvailable(JsonElement passthroughAvailable) {
    this.passthroughAvailable = passthroughAvailable;
  }

  public AccountDetailsAndActionsIntegrationRawJson availableModelOperations(List<ModelOperation> availableModelOperations) {
    this.availableModelOperations = this.serializer.getGson().toJsonTree(availableModelOperations);
    return this;
  }

   /**
   * Get availableModelOperations
   * @return availableModelOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getAvailableModelOperations() {
    return availableModelOperations;
  }
  public void setAvailableModelOperations(JsonElement availableModelOperations) {
    this.availableModelOperations = availableModelOperations;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsAndActionsIntegrationRawJson accountDetailsAndActionsIntegration = (AccountDetailsAndActionsIntegrationRawJson) o;
    return Objects.equals(this.name.getAsString(), accountDetailsAndActionsIntegration.name.getAsString()) &&
        Objects.equals(this.categories.getAsString(), accountDetailsAndActionsIntegration.categories.getAsString()) &&
        Objects.equals(this.image.getAsString(), accountDetailsAndActionsIntegration.image.getAsString()) &&
        Objects.equals(this.squareImage.getAsString(), accountDetailsAndActionsIntegration.squareImage.getAsString()) &&
        Objects.equals(this.color.getAsString(), accountDetailsAndActionsIntegration.color.getAsString()) &&
        Objects.equals(this.slug.getAsString(), accountDetailsAndActionsIntegration.slug.getAsString()) &&
        Objects.equals(this.passthroughAvailable.getAsString(), accountDetailsAndActionsIntegration.passthroughAvailable.getAsString()) &&
        Objects.equals(this.availableModelOperations.getAsString(), accountDetailsAndActionsIntegration.availableModelOperations.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, categories, image, squareImage, color, slug, passthroughAvailable, availableModelOperations);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsAndActionsIntegrationRawJson {\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories.getAsString())).append("\n");
    sb.append("    image: ").append(toIndentedString(image.getAsString())).append("\n");
    sb.append("    squareImage: ").append(toIndentedString(squareImage.getAsString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color.getAsString())).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug.getAsString())).append("\n");
    sb.append("    passthroughAvailable: ").append(toIndentedString(passthroughAvailable.getAsString())).append("\n");
    sb.append("    availableModelOperations: ").append(toIndentedString(availableModelOperations.getAsString())).append("\n");
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


