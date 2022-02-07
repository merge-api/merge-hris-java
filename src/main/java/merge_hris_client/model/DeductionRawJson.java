
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
 * # The Deduction Object ### Description The &#x60;Deduction&#x60; object is used to represent a deduction for a given employee&#39;s payroll run. One run could include several deductions.  ### Usage Example Fetch from the &#x60;LIST Deductions&#x60; endpoint and filter by &#x60;ID&#x60; to show all deductions.
 */
@ApiModel(description = "# The Deduction Object ### Description The `Deduction` object is used to represent a deduction for a given employee's payroll run. One run could include several deductions.  ### Usage Example Fetch from the `LIST Deductions` endpoint and filter by `ID` to show all deductions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T15:43:08.820708Z[Etc/UTC]")
public class DeductionRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN = "employee_payroll_run";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN)
  private JsonElement employeePayrollRun;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private JsonElement name;

  public static final String SERIALIZED_NAME_EMPLOYEE_DEDUCTION = "employee_deduction";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_DEDUCTION)
  private JsonElement employeeDeduction;

  public static final String SERIALIZED_NAME_COMPANY_DEDUCTION = "company_deduction";
  @SerializedName(SERIALIZED_NAME_COMPANY_DEDUCTION)
  private JsonElement companyDeduction;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public DeductionRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5fd439fc-1b64-4755-b275-64918936c365", value = "")

  public JsonElement getId() {
    return id;
  }

  public DeductionRawJson employeePayrollRun(UUID employeePayrollRun) {
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

  public DeductionRawJson name(String name) {
    this.name = this.serializer.getGson().toJsonTree(name);
    return this;
  }

   /**
   * The deduction&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Social Security", value = "The deduction's name.")

  public JsonElement getName() {
    return name;
  }
  public void setName(JsonElement name) {
    this.name = name;
  }

  public DeductionRawJson employeeDeduction(Float employeeDeduction) {
    this.employeeDeduction = this.serializer.getGson().toJsonTree(employeeDeduction);
    return this;
  }

   /**
   * The amount the employee is deducting.
   * @return employeeDeduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34.54", value = "The amount the employee is deducting.")

  public JsonElement getEmployeeDeduction() {
    return employeeDeduction;
  }
  public void setEmployeeDeduction(JsonElement employeeDeduction) {
    this.employeeDeduction = employeeDeduction;
  }

  public DeductionRawJson companyDeduction(Float companyDeduction) {
    this.companyDeduction = this.serializer.getGson().toJsonTree(companyDeduction);
    return this;
  }

   /**
   * The amount the company is deducting.
   * @return companyDeduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "78.78", value = "The amount the company is deducting.")

  public JsonElement getCompanyDeduction() {
    return companyDeduction;
  }
  public void setCompanyDeduction(JsonElement companyDeduction) {
    this.companyDeduction = companyDeduction;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/payroll-deduction\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    DeductionRawJson deduction = (DeductionRawJson) o;
    return Objects.equals(this.id.getAsString(), deduction.id.getAsString()) &&
        Objects.equals(this.employeePayrollRun.getAsString(), deduction.employeePayrollRun.getAsString()) &&
        Objects.equals(this.name.getAsString(), deduction.name.getAsString()) &&
        Objects.equals(this.employeeDeduction.getAsString(), deduction.employeeDeduction.getAsString()) &&
        Objects.equals(this.companyDeduction.getAsString(), deduction.companyDeduction.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), deduction.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, employeePayrollRun, name, employeeDeduction, companyDeduction, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    employeePayrollRun: ").append(toIndentedString(employeePayrollRun.getAsString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name.getAsString())).append("\n");
    sb.append("    employeeDeduction: ").append(toIndentedString(employeeDeduction.getAsString())).append("\n");
    sb.append("    companyDeduction: ").append(toIndentedString(companyDeduction.getAsString())).append("\n");
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


