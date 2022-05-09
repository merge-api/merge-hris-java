
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
 * # The TimeOffBalance Object ### Description The &#x60;TimeOffBalance&#x60; object is used to represent a Time Off Balance for an employee.  ### Usage Example Fetch from the &#x60;LIST TimeOffBalances&#x60; endpoint and filter by &#x60;ID&#x60; to show all time off balances.
 */
@ApiModel(description = "# The TimeOffBalance Object ### Description The `TimeOffBalance` object is used to represent a Time Off Balance for an employee.  ### Usage Example Fetch from the `LIST TimeOffBalances` endpoint and filter by `ID` to show all time off balances.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-06T21:54:01.920674Z[Etc/UTC]")
public class TimeOffBalanceRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private JsonElement employee;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private JsonElement balance;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private JsonElement used;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private JsonElement policyType;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public TimeOffBalanceRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91b2b905-e866-40c8-8be2-efe53827a0aa", value = "")

  public JsonElement getId() {
    return id;
  }

  public TimeOffBalanceRawJson remoteId(String remoteId) {
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

  public TimeOffBalanceRawJson employee(UUID employee) {
    this.employee = this.serializer.getGson().toJsonTree(employee);
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "")

  public JsonElement getEmployee() {
    return employee;
  }
  public void setEmployee(JsonElement employee) {
    this.employee = employee;
  }

  public TimeOffBalanceRawJson balance(Float balance) {
    this.balance = this.serializer.getGson().toJsonTree(balance);
    return this;
  }

   /**
   * The current remaining PTO balance in terms of hours. This does not represent the starting PTO balance. If the API provider only provides PTO balance in terms of days, we estimate 8 hours per day.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60.0", value = "The current remaining PTO balance in terms of hours. This does not represent the starting PTO balance. If the API provider only provides PTO balance in terms of days, we estimate 8 hours per day.")

  public JsonElement getBalance() {
    return balance;
  }
  public void setBalance(JsonElement balance) {
    this.balance = balance;
  }

  public TimeOffBalanceRawJson used(Float used) {
    this.used = this.serializer.getGson().toJsonTree(used);
    return this;
  }

   /**
   * The amount of PTO used in terms of hours.
   * @return used
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45.0", value = "The amount of PTO used in terms of hours.")

  public JsonElement getUsed() {
    return used;
  }
  public void setUsed(JsonElement used) {
    this.used = used;
  }

  public TimeOffBalanceRawJson policyType(PolicyTypeEnum policyType) {
    this.policyType = this.serializer.getGson().toJsonTree(policyType);
    return this;
  }

   /**
   * The policy type of this time off balance.
   * @return policyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VACATION", value = "The policy type of this time off balance.")

  public JsonElement getPolicyType() {
    return policyType;
  }
  public void setPolicyType(JsonElement policyType) {
    this.policyType = policyType;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/leave\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    TimeOffBalanceRawJson timeOffBalance = (TimeOffBalanceRawJson) o;
    return Objects.equals(this.id.getAsString(), timeOffBalance.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), timeOffBalance.remoteId.getAsString()) &&
        Objects.equals(this.employee.getAsString(), timeOffBalance.employee.getAsString()) &&
        Objects.equals(this.balance.getAsString(), timeOffBalance.balance.getAsString()) &&
        Objects.equals(this.used.getAsString(), timeOffBalance.used.getAsString()) &&
        Objects.equals(this.policyType.getAsString(), timeOffBalance.policyType.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), timeOffBalance.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employee, balance, used, policyType, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffBalanceRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee.getAsString())).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance.getAsString())).append("\n");
    sb.append("    used: ").append(toIndentedString(used.getAsString())).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType.getAsString())).append("\n");
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


