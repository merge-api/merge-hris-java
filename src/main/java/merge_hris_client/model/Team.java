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
 * # The Team Object ### Description The &#x60;Team&#x60; object is used to represent a Team within a company. &#x60;Employee&#x60; objects are often grouped this way. Note that in the Merge HRIS API, company subdivisions are all represented with &#x60;Teams&#x60;, rather than &#x60;Teams&#x60; and &#x60;Departments&#x60;.  ### Usage Example If you&#39;re building a way to filter by &#x60;Team&#x60;, you&#39;d hit the &#x60;GET Teams&#x60; endpoint to fetch the &#x60;Teams&#x60;, and then use the &#x60;ID&#x60; of the team your user selects to filter the &#x60;GET Employees&#x60; endpoint.
 */
@ApiModel(description = "# The Team Object ### Description The `Team` object is used to represent a Team within a company. `Employee` objects are often grouped this way. Note that in the Merge HRIS API, company subdivisions are all represented with `Teams`, rather than `Teams` and `Departments`.  ### Usage Example If you're building a way to filter by `Team`, you'd hit the `GET Teams` endpoint to fetch the `Teams`, and then use the `ID` of the team your user selects to filter the `GET Employees` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-06T21:54:01.920674Z[Etc/UTC]")
public class Team {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_TEAM = "parent_team";
  @SerializedName(SERIALIZED_NAME_PARENT_TEAM)
  private UUID parentTeam;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13a72919-9fae-4f54-81ca-ddfd8712a1ba", value = "")

  public UUID getId() {
    return id;
  }




  public Team remoteId(String remoteId) {
    
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


  public Team name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The team&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Engineering", value = "The team's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Team parentTeam(UUID parentTeam) {
    
    this.parentTeam = parentTeam;
    return this;
  }

   /**
   * Get parentTeam
   * @return parentTeam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1b998423-db0a-4037-a4cf-f79c60cb67b3", value = "")

  public UUID getParentTeam() {
    return parentTeam;
  }


  public void setParentTeam(UUID parentTeam) {
    this.parentTeam = parentTeam;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/teams\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<RemoteData> getRemoteData() {
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
    Team team = (Team) o;
    return Objects.equals(this.id, team.id) &&
        Objects.equals(this.remoteId, team.remoteId) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.parentTeam, team.parentTeam) &&
        Objects.equals(this.remoteData, team.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, parentTeam, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTeam: ").append(toIndentedString(parentTeam)).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData)).append("\n");
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

