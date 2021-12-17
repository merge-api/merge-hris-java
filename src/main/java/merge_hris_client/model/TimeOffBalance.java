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
 * # The TimeOffBalance Object ### Description The &#x60;TimeOffBalance&#x60; object is used to represent a Time Off Balance for an employee.  ### Usage Example Fetch from the &#x60;LIST TimeOffBalances&#x60; endpoint and filter by &#x60;ID&#x60; to show all time off balances.
 */
@ApiModel(description = "# The TimeOffBalance Object ### Description The `TimeOffBalance` object is used to represent a Time Off Balance for an employee.  ### Usage Example Fetch from the `LIST TimeOffBalances` endpoint and filter by `ID` to show all time off balances.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T20:24:25.647062Z[Etc/UTC]")
public class TimeOffBalance {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private UUID employee;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Float balance;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Float used;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91b2b905-e866-40c8-8be2-efe53827a0aa", value = "")

  public UUID getId() {
    return id;
  }




  public TimeOffBalance remoteId(String remoteId) {
    
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


  public TimeOffBalance employee(UUID employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * The employee the balance belongs to.
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "The employee the balance belongs to.")

  public UUID getEmployee() {
    return employee;
  }


  public void setEmployee(UUID employee) {
    this.employee = employee;
  }


  public TimeOffBalance balance(Float balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The current PTO balance in terms of hours.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60.0", value = "The current PTO balance in terms of hours.")

  public Float getBalance() {
    return balance;
  }


  public void setBalance(Float balance) {
    this.balance = balance;
  }


  public TimeOffBalance used(Float used) {
    
    this.used = used;
    return this;
  }

   /**
   * The amount of PTO used in terms of hours.
   * @return used
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45.0", value = "The amount of PTO used in terms of hours.")

  public Float getUsed() {
    return used;
  }


  public void setUsed(Float used) {
    this.used = used;
  }


  public TimeOffBalance policyType(String policyType) {
    
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @ApiModelProperty(example = "VACATION", required = true, value = "")

  public String getPolicyType() {
    return policyType;
  }


  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/leave\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    TimeOffBalance timeOffBalance = (TimeOffBalance) o;
    return Objects.equals(this.id, timeOffBalance.id) &&
        Objects.equals(this.remoteId, timeOffBalance.remoteId) &&
        Objects.equals(this.employee, timeOffBalance.employee) &&
        Objects.equals(this.balance, timeOffBalance.balance) &&
        Objects.equals(this.used, timeOffBalance.used) &&
        Objects.equals(this.policyType, timeOffBalance.policyType) &&
        Objects.equals(this.remoteData, timeOffBalance.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employee, balance, used, policyType, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffBalance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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

