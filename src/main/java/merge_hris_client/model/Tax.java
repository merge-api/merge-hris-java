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

/**
 * # The Tax Object ### Description The &#x60;Tax&#x60; object is used to represent a tax for a given employee&#39;s payroll run. One run could include several taxes.  ### Usage Example Fetch from the &#x60;LIST Taxes&#x60; endpoint and filter by &#x60;ID&#x60; to show all taxes.
 */
@ApiModel(description = "# The Tax Object ### Description The `Tax` object is used to represent a tax for a given employee's payroll run. One run could include several taxes.  ### Usage Example Fetch from the `LIST Taxes` endpoint and filter by `ID` to show all taxes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T20:24:25.647062Z[Etc/UTC]")
public class Tax {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN = "employee_payroll_run";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_PAYROLL_RUN)
  private UUID employeePayrollRun;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_EMPLOYER_TAX = "employer_tax";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_TAX)
  private Boolean employerTax;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<Map<String, Object>> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e3a825fd-c38d-4095-a717-df98c4cb9ebc", value = "")

  public UUID getId() {
    return id;
  }




  public Tax employeePayrollRun(UUID employeePayrollRun) {
    
    this.employeePayrollRun = employeePayrollRun;
    return this;
  }

   /**
   * The tax&#39;s employee payroll run.
   * @return employeePayrollRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35347df1-95e7-46e2-93cc-66f1191edca5", value = "The tax's employee payroll run.")

  public UUID getEmployeePayrollRun() {
    return employeePayrollRun;
  }


  public void setEmployeePayrollRun(UUID employeePayrollRun) {
    this.employeePayrollRun = employeePayrollRun;
  }


  public Tax name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The tax&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "California State Income Tax", value = "The tax's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Tax amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The tax amount.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.25", value = "The tax amount.")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public Tax employerTax(Boolean employerTax) {
    
    this.employerTax = employerTax;
    return this;
  }

   /**
   * Whether or not the employer is responsible for paying the tax.
   * @return employerTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not the employer is responsible for paying the tax.")

  public Boolean getEmployerTax() {
    return employerTax;
  }


  public void setEmployerTax(Boolean employerTax) {
    this.employerTax = employerTax;
  }


  public Tax remoteData(List<Map<String, Object>> remoteData) {
    
    this.remoteData = remoteData;
    return this;
  }

  public Tax addRemoteDataItem(Map<String, Object> remoteDataItem) {
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
  @ApiModelProperty(example = "[{\"path\":\"/tax\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    Tax tax = (Tax) o;
    return Objects.equals(this.id, tax.id) &&
        Objects.equals(this.employeePayrollRun, tax.employeePayrollRun) &&
        Objects.equals(this.name, tax.name) &&
        Objects.equals(this.amount, tax.amount) &&
        Objects.equals(this.employerTax, tax.employerTax) &&
        Objects.equals(this.remoteData, tax.remoteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeePayrollRun, name, amount, employerTax, remoteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeePayrollRun: ").append(toIndentedString(employeePayrollRun)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    employerTax: ").append(toIndentedString(employerTax)).append("\n");
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

