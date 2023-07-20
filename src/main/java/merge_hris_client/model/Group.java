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
import merge_hris_client.model.GroupTypeEnum;
import merge_hris_client.model.RemoteData;

/**
 * # The Group Object ### Description The &#x60;Group&#x60; object is used to represent Group information that employees belong to. This is often referenced with an Employee object.  Please note: The teams object will fulfill most use cases. The Groups object is for power-users that want all types of groups at a company and the optionality of pulling multiple groups for an employee.  ### Usage Example Fetch from the &#x60;LIST Employee&#x60; endpoint and expand groups to view an employee&#39;s groups.
 */
@ApiModel(description = "# The Group Object ### Description The `Group` object is used to represent Group information that employees belong to. This is often referenced with an Employee object.  Please note: The teams object will fulfill most use cases. The Groups object is for power-users that want all types of groups at a company and the optionality of pulling multiple groups for an employee.  ### Usage Example Fetch from the `LIST Employee` endpoint and expand groups to view an employee's groups.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class Group {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_PARENT_GROUP = "parent_group";
  @SerializedName(SERIALIZED_NAME_PARENT_GROUP)
  private UUID parentGroup;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private GroupTypeEnum type;

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
  @ApiModelProperty(example = "134e0111-0f67-44f6-98f0-597000290bb3", value = "")

  public UUID getId() {
    return id;
  }




  public Group remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "800293", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Group parentGroup(UUID parentGroup) {
    
    this.parentGroup = parentGroup;
    return this;
  }

   /**
   * The parent group for this group.
   * @return parentGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2ef51b11-2c4e-4b02-8d1d-50592d9e96ef", value = "The parent group for this group.")

  public UUID getParentGroup() {
    return parentGroup;
  }


  public void setParentGroup(UUID parentGroup) {
    this.parentGroup = parentGroup;
  }


  public Group name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The group name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COST_CENTER_US", value = "The group name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Group type(GroupTypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The group type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COST_CENTER", value = "The group type")

  public GroupTypeEnum getType() {
    return type;
  }


  public void setType(GroupTypeEnum type) {
    this.type = type;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/group\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.remoteId, group.remoteId) &&
        Objects.equals(this.parentGroup, group.parentGroup) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.type, group.type) &&
        Objects.equals(this.remoteData, group.remoteData) &&
        Objects.equals(this.remoteWasDeleted, group.remoteWasDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, parentGroup, name, type, remoteData, remoteWasDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    parentGroup: ").append(toIndentedString(parentGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

