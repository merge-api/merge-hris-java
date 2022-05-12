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
import java.util.UUID;
import merge_hris_client.model.RemoteData;

/**
 * # The Company Object ### Description The &#x60;Company&#x60; object is used to represent a Company within the HRIS / Payroll system.  ### Usage Example Fetch from the &#x60;LIST Companies&#x60; endpoint and filter by &#x60;ID&#x60; to show all companies.
 */
@ApiModel(description = "# The Company Object ### Description The `Company` object is used to represent a Company within the HRIS / Payroll system.  ### Usage Example Fetch from the `LIST Companies` endpoint and filter by `ID` to show all companies.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-12T20:57:27.935941Z[Etc/UTC]")
public class Company {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EINS = "eins";
  @SerializedName(SERIALIZED_NAME_EINS)
  private List<String> eins = null;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;

  public static final String SERIALIZED_NAME_REMOTE_WAS_DELETED = "remote_was_deleted";
  @SerializedName(SERIALIZED_NAME_REMOTE_WAS_DELETED)
  private Boolean remoteWasDeleted;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1b998423-db0a-4037-a4cf-f79c60cb67b3", value = "")

  public UUID getId() {
    return id;
  }




  public Company remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19202938", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Company legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The company&#39;s legal name.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Waystar Royco, Inc.", value = "The company's legal name.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public Company displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The company&#39;s display name.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Waystar Royco", value = "The company's display name.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Company eins(List<String> eins) {
    
    this.eins = eins;
    return this;
  }

  public Company addEinsItem(String einsItem) {
    if (this.eins == null) {
      this.eins = new ArrayList<String>();
    }
    this.eins.add(einsItem);
    return this;
  }

   /**
   * The company&#39;s Employer Identification Numbers.
   * @return eins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"12-3456789\",\"12-3451111\",\"11-0011000\"]", value = "The company's Employer Identification Numbers.")

  public List<String> getEins() {
    return eins;
  }


  public void setEins(List<String> eins) {
    this.eins = eins;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/companies\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<RemoteData> getRemoteData() {
    return remoteData;
  }




   /**
   * Indicates whether or not this object has been deleted on the third-party.
   * @return remoteWasDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not this object has been deleted on the third-party.")

  public Boolean getRemoteWasDeleted() {
    return remoteWasDeleted;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.id, company.id) &&
        Objects.equals(this.remoteId, company.remoteId) &&
        Objects.equals(this.legalName, company.legalName) &&
        Objects.equals(this.displayName, company.displayName) &&
        Objects.equals(this.eins, company.eins) &&
        Objects.equals(this.remoteData, company.remoteData) &&
        Objects.equals(this.remoteWasDeleted, company.remoteWasDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, legalName, displayName, eins, remoteData, remoteWasDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    eins: ").append(toIndentedString(eins)).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData)).append("\n");
    sb.append("    remoteWasDeleted: ").append(toIndentedString(remoteWasDeleted)).append("\n");
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

