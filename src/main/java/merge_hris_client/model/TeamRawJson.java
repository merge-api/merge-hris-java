
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
 * # The Team Object ### Description The &#x60;Team&#x60; object is used to represent a Team within a company. &#x60;Employee&#x60; objects are often grouped this way. Note that in the Merge HRIS API, company subdivisions are all represented with &#x60;Teams&#x60;, rather than &#x60;Teams&#x60; and &#x60;Departments&#x60;.  ### Usage Example If you&#39;re building a way to filter by &#x60;Team&#x60;, you&#39;d hit the &#x60;GET Teams&#x60; endpoint to fetch the &#x60;Teams&#x60;, and then use the &#x60;ID&#x60; of the team your user selects to filter the &#x60;GET Employees&#x60; endpoint.
 */
@ApiModel(description = "# The Team Object ### Description The `Team` object is used to represent a Team within a company. `Employee` objects are often grouped this way. Note that in the Merge HRIS API, company subdivisions are all represented with `Teams`, rather than `Teams` and `Departments`.  ### Usage Example If you're building a way to filter by `Team`, you'd hit the `GET Teams` endpoint to fetch the `Teams`, and then use the `ID` of the team your user selects to filter the `GET Employees` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:43:08.820708Z[Etc/UTC]")
public class TeamRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  public static final String SERIALIZED_NAME_PARENT_TEAM = "parent_team";
  @SerializedName(SERIALIZED_NAME_PARENT_TEAM)
  private JsonElement parentTeam;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public TeamRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13a72919-9fae-4f54-81ca-ddfd8712a1ba", value = "")

  public JsonElement getId() {
    return id;
  }

  public TeamRawJson remoteId(String remoteId) {
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

  public TeamRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * The team&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Engineering", value = "The team's name.")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public TeamRawJson parentTeam(UUID parentTeam) {
    this.parentTeam = this.serializer.getGson().toJsonTree(parentTeam);
    return this;
  }

   /**
   * Get parentTeam
   * @return parentTeam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1b998423-db0a-4037-a4cf-f79c60cb67b3", value = "")

  public JsonElement getParentTeam() {
    return parentTeam;
  }
  public void setParentTeam(JsonElement parentTeam) {
    this.parentTeam = parentTeam;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/teams\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    TeamRawJson team = (TeamRawJson) o;
    return Objects.equals(this.id.getAsString(), team.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), team.remoteId.getAsString()) &&
        Objects.equals(this.name.getAsString(), team.name.getAsString()) &&
        Objects.equals(this.parentTeam.getAsString(), team.parentTeam.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), team.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, parentTeam, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    parentTeam: ").append(toIndentedString(parentTeam.getAsString())).append("\n");
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


