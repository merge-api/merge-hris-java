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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import merge_hris_client.model.CategoriesEnum;

/**
 * AccountIntegration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-04T18:48:46.006564Z[Etc/UTC]")
public class AccountIntegration {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<CategoriesEnum> categories = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private URI image;

  public static final String SERIALIZED_NAME_SQUARE_IMAGE = "square_image";
  @SerializedName(SERIALIZED_NAME_SQUARE_IMAGE)
  private URI squareImage;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;


  public AccountIntegration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Company name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Company name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountIntegration categories(List<CategoriesEnum> categories) {
    
    this.categories = categories;
    return this;
  }

  public AccountIntegration addCategoriesItem(CategoriesEnum categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoriesEnum>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Category or categories this integration belongs to. Multiple categories should be comma separated.&lt;br/&gt;&lt;br&gt;Example: For [ats, hris], enter &lt;i&gt;ats,hris&lt;/i&gt;
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category or categories this integration belongs to. Multiple categories should be comma separated.<br/><br>Example: For [ats, hris], enter <i>ats,hris</i>")

  public List<CategoriesEnum> getCategories() {
    return categories;
  }


  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }


  public AccountIntegration image(URI image) {
    
    this.image = image;
    return this;
  }

   /**
   * Company logo in rectangular shape. &lt;b&gt;Upload an image with a clear background.&lt;/b&gt;
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company logo in rectangular shape. <b>Upload an image with a clear background.</b>")

  public URI getImage() {
    return image;
  }


  public void setImage(URI image) {
    this.image = image;
  }


  public AccountIntegration squareImage(URI squareImage) {
    
    this.squareImage = squareImage;
    return this;
  }

   /**
   * Company logo in square shape. &lt;b&gt;Upload an image with a white background.&lt;/b&gt;
   * @return squareImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company logo in square shape. <b>Upload an image with a white background.</b>")

  public URI getSquareImage() {
    return squareImage;
  }


  public void setSquareImage(URI squareImage) {
    this.squareImage = squareImage;
  }


  public AccountIntegration color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * The color of this integration used for buttons and text throughout the app and landing pages. &lt;b&gt;Choose a darker, saturated color.&lt;/b&gt;
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The color of this integration used for buttons and text throughout the app and landing pages. <b>Choose a darker, saturated color.</b>")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlug() {
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
    AccountIntegration accountIntegration = (AccountIntegration) o;
    return Objects.equals(this.name, accountIntegration.name) &&
        Objects.equals(this.categories, accountIntegration.categories) &&
        Objects.equals(this.image, accountIntegration.image) &&
        Objects.equals(this.squareImage, accountIntegration.squareImage) &&
        Objects.equals(this.color, accountIntegration.color) &&
        Objects.equals(this.slug, accountIntegration.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categories, image, squareImage, color, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIntegration {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    squareImage: ").append(toIndentedString(squareImage)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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

