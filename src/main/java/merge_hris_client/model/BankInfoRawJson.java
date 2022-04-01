
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
 * # The BankInfo Object ### Description The &#x60;BankInfo&#x60; object is used to represent the Bank Account information for an Employee. This is often referenced with an Employee object.  ### Usage Example Fetch from the &#x60;LIST BankInfo&#x60; endpoint and filter by &#x60;ID&#x60; to show all bank information.
 */
@ApiModel(description = "# The BankInfo Object ### Description The `BankInfo` object is used to represent the Bank Account information for an Employee. This is often referenced with an Employee object.  ### Usage Example Fetch from the `LIST BankInfo` endpoint and filter by `ID` to show all bank information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-01T17:28:53.688853Z[Etc/UTC]")
public class BankInfoRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private JsonElement employee;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private JsonElement accountNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private JsonElement routingNumber;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private JsonElement bankName;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private JsonElement accountType;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private JsonElement remoteCreatedAt;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public BankInfoRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fd1e0fb5-8f92-4ec9-9f32-179cf732867d", value = "")

  public JsonElement getId() {
    return id;
  }

  public BankInfoRawJson remoteId(String remoteId) {
    this.remoteId = this.serializer.getGson().toJsonTree(remoteId);
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123234", value = "The third-party API ID of the matching object.")

  public JsonElement getRemoteId() {
    return remoteId;
  }
  public void setRemoteId(JsonElement remoteId) {
    this.remoteId = remoteId;
  }

  public BankInfoRawJson employee(UUID employee) {
    this.employee = this.serializer.getGson().toJsonTree(employee);
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a3617eb4-dfe3-426f-921e-a65fc1661e10", value = "")

  public JsonElement getEmployee() {
    return employee;
  }
  public void setEmployee(JsonElement employee) {
    this.employee = employee;
  }

  public BankInfoRawJson accountNumber(String accountNumber) {
    this.accountNumber = this.serializer.getGson().toJsonTree(accountNumber);
    return this;
  }

   /**
   * The account number.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "439291590", value = "The account number.")

  public JsonElement getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(JsonElement accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BankInfoRawJson routingNumber(String routingNumber) {
    this.routingNumber = this.serializer.getGson().toJsonTree(routingNumber);
    return this;
  }

   /**
   * The routing number.
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "089690059", value = "The routing number.")

  public JsonElement getRoutingNumber() {
    return routingNumber;
  }
  public void setRoutingNumber(JsonElement routingNumber) {
    this.routingNumber = routingNumber;
  }

  public BankInfoRawJson bankName(String bankName) {
    this.bankName = this.serializer.getGson().toJsonTree(bankName);
    return this;
  }

   /**
   * The bank name.
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chase", value = "The bank name.")

  public JsonElement getBankName() {
    return bankName;
  }
  public void setBankName(JsonElement bankName) {
    this.bankName = bankName;
  }

  public BankInfoRawJson accountType(AccountTypeEnum accountType) {
    this.accountType = this.serializer.getGson().toJsonTree(accountType);
    return this;
  }

   /**
   * The bank account type
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHECKING", value = "The bank account type")

  public JsonElement getAccountType() {
    return accountType;
  }
  public void setAccountType(JsonElement accountType) {
    this.accountType = accountType;
  }

  public BankInfoRawJson remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
    this.remoteCreatedAt = this.serializer.getGson().toJsonTree(remoteCreatedAt);
    return this;
  }

   /**
   * When the matching bank object was created in the third party system.
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-12-06T10:11:26Z", value = "When the matching bank object was created in the third party system.")

  public JsonElement getRemoteCreatedAt() {
    return remoteCreatedAt;
  }
  public void setRemoteCreatedAt(JsonElement remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/bank-info\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    BankInfoRawJson bankInfo = (BankInfoRawJson) o;
    return Objects.equals(this.id.getAsString(), bankInfo.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), bankInfo.remoteId.getAsString()) &&
        Objects.equals(this.employee.getAsString(), bankInfo.employee.getAsString()) &&
        Objects.equals(this.accountNumber.getAsString(), bankInfo.accountNumber.getAsString()) &&
        Objects.equals(this.routingNumber.getAsString(), bankInfo.routingNumber.getAsString()) &&
        Objects.equals(this.bankName.getAsString(), bankInfo.bankName.getAsString()) &&
        Objects.equals(this.accountType.getAsString(), bankInfo.accountType.getAsString()) &&
        Objects.equals(this.remoteCreatedAt.getAsString(), bankInfo.remoteCreatedAt.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), bankInfo.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employee, accountNumber, routingNumber, bankName, accountType, remoteCreatedAt, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankInfoRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee.getAsString())).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber.getAsString())).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber.getAsString())).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName.getAsString())).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType.getAsString())).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt.getAsString())).append("\n");
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


