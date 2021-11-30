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
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * # The Deduction Object ### Description The &#x60;Deduction&#x60; object is used to represent a deduction for a given employee&#39;s payroll run. One run could include several deductions.  ### Usage Example Fetch from the &#x60;LIST Deductions&#x60; endpoint and filter by &#x60;ID&#x60; to show all deductions.
 */
@ApiModel(description = "# The Deduction Object ### Description The `Deduction` object is used to represent a deduction for a given employee's payroll run. One run could include several deductions.  ### Usage Example Fetch from the `LIST Deductions` endpoint and filter by `ID` to show all deductions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T20:32:28.722726-05:00[America/New_York]")
public class Deduction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN = "employee_payroll_run";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN)
  private UUID employeePayrollRun;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMPLOYEE_DEDUCTION = "employee_deduction";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_DEDUCTION)
  private Float employeeDeduction;

  public static final String SERIALIZED_NAME_COMPANY_DEDUCTION = "company_deduction";
  @SerializedName(SERIALIZED_NAME_COMPANY_DEDUCTION)
  private Float companyDeduction;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<Map<String, Object>> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5fd439fc-1b64-4755-b275-64918936c365", value = "")

  public UUID getId() {
    return id;
  }




  public Deduction employeePayrollRun(UUID employeePayrollRun) {
    
    this.employeePayrollRun = employeePayrollRun;
    return this;
  }

   /**
   * The deduction&#39;s employee payroll run.
   * @return employeePayrollRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35347df1-95e7-46e2-93cc-66f1191edca5", value = "The deduction's employee payroll run.")

  public UUID getEmployeePayrollRun() {
    return employeePayrollRun;
  }


  public void setEmployeePayrollRun(UUID employeePayrollRun) {
    this.employeePayrollRun = employeePayrollRun;
  }


  public Deduction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The deduction&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Social Security", value = "The deduction's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Deduction employeeDeduction(Float employeeDeduction) {
    
    this.employeeDeduction = employeeDeduction;
    return this;
  }

   /**
   * The amount the employee is deducting.
   * @return employeeDeduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34.54", value = "The amount the employee is deducting.")

  public Float getEmployeeDeduction() {
    return employeeDeduction;
  }


  public void setEmployeeDeduction(Float employeeDeduction) {
    this.employeeDeduction = employeeDeduction;
  }


  public Deduction companyDeduction(Float companyDeduction) {
    
    this.companyDeduction = companyDeduction;
    return this;
  }

   /**
   * The amount the company is deducting.
   * @return companyDeduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "78.78", value = "The amount the company is deducting.")

  public Float getCompanyDeduction() {
    return companyDeduction;
  }


  public void setCompanyDeduction(Float companyDeduction) {
    this.companyDeduction = companyDeduction;
  }


  public Deduction remoteData(List<Map<String, Object>> remoteData) {
    
    this.remoteData = remoteData;
    return this;
  }

  public Deduction addRemoteDataItem(Map<String, Object> remoteDataItem) {
    if (this.remoteData == null) {
      this.remoteData = new ArrayList<Map<String, Object>>();
    }
    this.remoteData.add(remoteDataItem);
    return this;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/payroll-deduction\",\"data\":[\"Varies by platform\"]}]", value = "")

  public List<Map<String, Object>> getRemoteData() {
    return remoteData;
  }


  public void setRemoteData(List<Map<String, Object>> remoteData) {
    this.remoteData = remoteData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deduction deduction = (Deduction) o;
    return Objects.equals(this.id, deduction.id) &&
        Objects.equals(this.employeePayrollRun, deduction.employeePayrollRun) &&
        Objects.equals(this.name, deduction.name) &&
        Objects.equals(this.employeeDeduction, deduction.employeeDeduction) &&
        Objects.equals(this.companyDeduction, deduction.companyDeduction) &&
        Objects.equals(this.remoteData, deduction.remoteData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeePayrollRun, name, employeeDeduction, companyDeduction, remoteData);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deduction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeePayrollRun: ").append(toIndentedString(employeePayrollRun)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    employeeDeduction: ").append(toIndentedString(employeeDeduction)).append("\n");
    sb.append("    companyDeduction: ").append(toIndentedString(companyDeduction)).append("\n");
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

