
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
 * # The Company Object ### Description The &#x60;Company&#x60; object is used to represent a Company.  ### Usage Example Fetch from the &#x60;LIST Companies&#x60; endpoint and filter by &#x60;ID&#x60; to show all companies.
 */
@ApiModel(description = "# The Company Object ### Description The `Company` object is used to represent a Company.  ### Usage Example Fetch from the `LIST Companies` endpoint and filter by `ID` to show all companies.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-04T18:48:46.006564Z[Etc/UTC]")
public class CompanyRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private JsonElement legalName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private JsonElement displayName;

  public static final String SERIALIZED_NAME_EINS = "eins";
  @SerializedName(SERIALIZED_NAME_EINS)
  private JsonElement eins;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public CompanyRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1b998423-db0a-4037-a4cf-f79c60cb67b3", value = "")

  public JsonElement getId() {
    return id;
  }

  public CompanyRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19202938", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public CompanyRawJson legalName(String legalName) {
    this.legalName = this.serializer.getGson().toJsonTree(legalName);
    return this;
  }

   /**
   * The company&#39;s legal name.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "We Love Integrations Inc.", value = "The company's legal name.")

  public JsonElement getLegalName() {
    return legalName;
  }
  public void setLegalName(JsonElement legalName) {
    this.legalName = legalName;
  }

  public CompanyRawJson displayName(String displayName) {
    this.displayName = this.serializer.getGson().toJsonTree(displayName);
    return this;
  }

   /**
   * The company&#39;s display name.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "We Love Integrations", value = "The company's display name.")

  public JsonElement getDisplayName() {
    return displayName;
  }
  public void setDisplayName(JsonElement displayName) {
    this.displayName = displayName;
  }

  public CompanyRawJson eins(List<String> eins) {
    this.eins = this.serializer.getGson().toJsonTree(eins);
    return this;
  }

   /**
   * The company&#39;s Employer Identification Numbers.
   * @return eins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"12-3456789\",\"12-3451111\",\"11-0011000\"]", value = "The company's Employer Identification Numbers.")

  public JsonElement getEins() {
    return eins;
  }
  public void setEins(JsonElement eins) {
    this.eins = eins;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/companies\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    CompanyRawJson company = (CompanyRawJson) o;
    return Objects.equals(this.id.getAsString(), company.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), company.remoteId.getAsString()) &&
        Objects.equals(this.legalName.getAsString(), company.legalName.getAsString()) &&
        Objects.equals(this.displayName.getAsString(), company.displayName.getAsString()) &&
        Objects.equals(this.eins.getAsString(), company.eins.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), company.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, legalName, displayName, eins, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName.getAsString())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName.getAsString())).append("\n");
    sb.append("    eins: ").append(toIndentedString(eins.getAsString())).append("\n");
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


