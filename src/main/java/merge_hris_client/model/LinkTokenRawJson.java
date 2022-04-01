
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
 * LinkTokenRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-01T17:28:53.688853Z[Etc/UTC]")
public class LinkTokenRawJson {
  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private JsonElement linkToken;

  public static final String SERIALIZED_NAME_INTEGRATION_NAME = "integration_name";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_NAME)
  private JsonElement integrationName;

  private transient JSON serializer;

  public LinkTokenRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public LinkTokenRawJson linkToken(String linkToken) {
    this.linkToken = this.serializer.getGson().toJsonTree(linkToken);
    return this;
  }

   /**
   * Get linkToken
   * @return linkToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "necdP7FtdASl1fQwm62be2_dM4wBG8_GactqoUV0", required = true, value = "")

  public JsonElement getLinkToken() {
    return linkToken;
  }
  public void setLinkToken(JsonElement linkToken) {
    this.linkToken = linkToken;
  }

  public LinkTokenRawJson integrationName(String integrationName) {
    this.integrationName = this.serializer.getGson().toJsonTree(integrationName);
    return this;
  }

   /**
   * Get integrationName
   * @return integrationName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Lever", required = true, value = "")

  public JsonElement getIntegrationName() {
    return integrationName;
  }
  public void setIntegrationName(JsonElement integrationName) {
    this.integrationName = integrationName;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenRawJson linkToken = (LinkTokenRawJson) o;
    return Objects.equals(this.linkToken.getAsString(), linkToken.linkToken.getAsString()) &&
        Objects.equals(this.integrationName.getAsString(), linkToken.integrationName.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(linkToken, integrationName);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenRawJson {\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken.getAsString())).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName.getAsString())).append("\n");
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


