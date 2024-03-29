
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
 * # The Tax Object ### Description The &#x60;Tax&#x60; object is used to represent a tax for a given employee&#39;s payroll run. One run could include several taxes.  ### Usage Example Fetch from the &#x60;LIST Taxes&#x60; endpoint and filter by &#x60;ID&#x60; to show all taxes.
 */
@ApiModel(description = "# The Tax Object ### Description The `Tax` object is used to represent a tax for a given employee's payroll run. One run could include several taxes.  ### Usage Example Fetch from the `LIST Taxes` endpoint and filter by `ID` to show all taxes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-20T10:57:27.935941Z[Etc/UTC]")
public class TaxRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN = "employee_payroll_run";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN)
  private JsonElement employeePayrollRun;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private JsonElement amount;

  public static final String SERIALIZED_NAME_EMPLOYER_TAX = "employer_tax";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_TAX)
  private JsonElement employerTax;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  public static final String SERIALIZED_NAME_REMOTE_WAS_DELETED = "remote_was_deleted";
  @SerializedName(SERIALIZED_NAME_REMOTE_WAS_DELETED)
  private JsonElement remoteWasDeleted;

  private transient JSON serializer;

  public TaxRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e3a825fd-c38d-4095-a717-df98c4cb9ebc", value = "")

  public JsonElement getId() {
    return id;
  }

  public TaxRawJson employeePayrollRun(UUID employeePayrollRun) {
    this.employeePayrollRun = this.serializer.getGson().toJsonTree(employeePayrollRun);
    return this;
  }

   /**
   * Get employeePayrollRun
   * @return employeePayrollRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35347df1-95e7-46e2-93cc-66f1191edca5", value = "")

  public JsonElement getEmployeePayrollRun() {
    return employeePayrollRun;
  }
  public void setEmployeePayrollRun(JsonElement employeePayrollRun) {
    this.employeePayrollRun = employeePayrollRun;
  }

  public TaxRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * The tax&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "California State Income Tax", value = "The tax's name.")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public TaxRawJson amount(Float amount) {
    this.amount = this.serializer.getGson().toJsonTree(amount);
    return this;
  }

   /**
   * The tax amount.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.25", value = "The tax amount.")

  public JsonElement getAmount() {
    return amount;
  }
  public void setAmount(JsonElement amount) {
    this.amount = amount;
  }

  public TaxRawJson employerTax(Boolean employerTax) {
    this.employerTax = this.serializer.getGson().toJsonTree(employerTax);
    return this;
  }

   /**
   * Whether or not the employer is responsible for paying the tax.
   * @return employerTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not the employer is responsible for paying the tax.")

  public JsonElement getEmployerTax() {
    return employerTax;
  }
  public void setEmployerTax(JsonElement employerTax) {
    this.employerTax = employerTax;
  }

  public TaxRawJson remoteData(List<Map<String, Object>> remoteData) {
    this.remoteData = this.serializer.getGson().toJsonTree(remoteData);
    return this;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/tax\",\"data\":[\"Varies by platform\"]}]", value = "")

  public JsonElement getRemoteData() {
    return remoteData;
  }
  public void setRemoteData(JsonElement remoteData) {
    this.remoteData = remoteData;
  }

  public TaxRawJson remoteWasDeleted(Boolean remoteWasDeleted) {
    this.remoteWasDeleted = this.serializer.getGson().toJsonTree(remoteWasDeleted);
    return this;
  }

   /**
   * Indicates whether or not this object has been deleted on the third-party.
   * @return remoteWasDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not this object has been deleted on the third-party.")

  public JsonElement getRemoteWasDeleted() {
    return remoteWasDeleted;
  }
  public void setRemoteWasDeleted(JsonElement remoteWasDeleted) {
    this.remoteWasDeleted = remoteWasDeleted;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRawJson tax = (TaxRawJson) o;
    return Objects.equals(this.id.getAsString(), tax.id.getAsString()) &&
        Objects.equals(this.employeePayrollRun.getAsString(), tax.employeePayrollRun.getAsString()) &&
        Objects.equals(this.name.getAsString(), tax.name.getAsString()) &&
        Objects.equals(this.amount.getAsString(), tax.amount.getAsString()) &&
        Objects.equals(this.employerTax.getAsString(), tax.employerTax.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), tax.remoteData.getAsString()) &&
        Objects.equals(this.remoteWasDeleted.getAsString(), tax.remoteWasDeleted.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, employeePayrollRun, name, amount, employerTax, remoteData, remoteWasDeleted);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    employeePayrollRun: ").append(toIndentedString(employeePayrollRun.getAsString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount.getAsString())).append("\n");
    sb.append("    employerTax: ").append(toIndentedString(employerTax.getAsString())).append("\n");
    sb.append("    remoteData: ").append(toIndentedString(remoteData.getAsString())).append("\n");
    sb.append("    remoteWasDeleted: ").append(toIndentedString(remoteWasDeleted.getAsString())).append("\n");
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


