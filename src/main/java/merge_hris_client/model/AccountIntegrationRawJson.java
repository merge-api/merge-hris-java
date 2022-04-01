
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
 * AccountIntegrationRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-01T17:28:53.688853Z[Etc/UTC]")
public class AccountIntegrationRawJson {
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

  private transient JSON serializer;

  public AccountIntegrationRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public AccountIntegrationRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * Company name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Company name.")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public AccountIntegrationRawJson categories(List<CategoriesEnum> categories) {
    this.categories = this.serializer.getGson().toJsonTree(categories);
    return this;
  }

   /**
   * Category or categories this integration belongs to. Multiple categories should be comma separated.&lt;br/&gt;&lt;br&gt;Example: For [ats, hris], enter &lt;i&gt;ats,hris&lt;/i&gt;
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category or categories this integration belongs to. Multiple categories should be comma separated.<br/><br>Example: For [ats, hris], enter <i>ats,hris</i>")

  public JsonElement getCategories() {
    return categories;
  }
  public void setCategories(JsonElement categories) {
    this.categories = categories;
  }

  public AccountIntegrationRawJson image(URI image) {
    this.image = this.serializer.getGson().toJsonTree(image);
    return this;
  }

   /**
   * Company logo in rectangular shape. &lt;b&gt;Upload an image with a clear background.&lt;/b&gt;
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company logo in rectangular shape. <b>Upload an image with a clear background.</b>")

  public JsonElement getImage() {
    return image;
  }
  public void setImage(JsonElement image) {
    this.image = image;
  }

  public AccountIntegrationRawJson squareImage(URI squareImage) {
    this.squareImage = this.serializer.getGson().toJsonTree(squareImage);
    return this;
  }

   /**
   * Company logo in square shape. &lt;b&gt;Upload an image with a white background.&lt;/b&gt;
   * @return squareImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company logo in square shape. <b>Upload an image with a white background.</b>")

  public JsonElement getSquareImage() {
    return squareImage;
  }
  public void setSquareImage(JsonElement squareImage) {
    this.squareImage = squareImage;
  }

  public AccountIntegrationRawJson color(String color) {
    this.color = this.serializer.getGson().toJsonTree(color);
    return this;
  }

   /**
   * The color of this integration used for buttons and text throughout the app and landing pages. &lt;b&gt;Choose a darker, saturated color.&lt;/b&gt;
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The color of this integration used for buttons and text throughout the app and landing pages. <b>Choose a darker, saturated color.</b>")

  public JsonElement getColor() {
    return color;
  }
  public void setColor(JsonElement color) {
    this.color = color;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getSlug() {
    return slug;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIntegrationRawJson accountIntegration = (AccountIntegrationRawJson) o;
    return Objects.equals(this.name.getAsString(), accountIntegration.name.getAsString()) &&
        Objects.equals(this.categories.getAsString(), accountIntegration.categories.getAsString()) &&
        Objects.equals(this.image.getAsString(), accountIntegration.image.getAsString()) &&
        Objects.equals(this.squareImage.getAsString(), accountIntegration.squareImage.getAsString()) &&
        Objects.equals(this.color.getAsString(), accountIntegration.color.getAsString()) &&
        Objects.equals(this.slug.getAsString(), accountIntegration.slug.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, categories, image, squareImage, color, slug);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIntegrationRawJson {\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories.getAsString())).append("\n");
    sb.append("    image: ").append(toIndentedString(image.getAsString())).append("\n");
    sb.append("    squareImage: ").append(toIndentedString(squareImage.getAsString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color.getAsString())).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug.getAsString())).append("\n");
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


