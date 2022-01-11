
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
 * # The EmployeePayrollRun Object ### Description The &#x60;EmployeePayrollRun&#x60; object is used to represent a payroll run for a specific employee.  ### Usage Example Fetch from the &#x60;LIST EmployeePayrollRun&#x60; endpoint and filter by &#x60;ID&#x60; to show all employee payroll runs.
 */
@ApiModel(description = "# The EmployeePayrollRun Object ### Description The `EmployeePayrollRun` object is used to represent a payroll run for a specific employee.  ### Usage Example Fetch from the `LIST EmployeePayrollRun` endpoint and filter by `ID` to show all employee payroll runs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-11T18:45:23.445197Z[Etc/UTC]")
public class EmployeePayrollRunRawJson {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private JsonElement id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private JsonElement remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private JsonElement employee;

  public static final String SERIALIZED_NAME_PAYROLL_RUN = "payroll_run";
  @SerializedName(SERIALIZED_NAME_PAYROLL_RUN)
  private JsonElement payrollRun;

  public static final String SERIALIZED_NAME_GROSS_PAY = "gross_pay";
  @SerializedName(SERIALIZED_NAME_GROSS_PAY)
  private JsonElement grossPay;

  public static final String SERIALIZED_NAME_NET_PAY = "net_pay";
  @SerializedName(SERIALIZED_NAME_NET_PAY)
  private JsonElement netPay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private JsonElement startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private JsonElement endDate;

  public static final String SERIALIZED_NAME_CHECK_DATE = "check_date";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private JsonElement checkDate;

  public static final String SERIALIZED_NAME_EARNINGS = "earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private JsonElement earnings;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private JsonElement deductions;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private JsonElement taxes;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private JsonElement remoteData;

  private transient JSON serializer;

  public EmployeePayrollRunRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fb8c55b6-1cb8-4b4c-9fb6-17924231619d", value = "")

  public JsonElement getId() {
    return id;
  }

  public EmployeePayrollRunRawJson remoteId(String remoteId) {
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

  public EmployeePayrollRunRawJson employee(UUID employee) {
    this.employee = this.serializer.getGson().toJsonTree(employee);
    return this;
  }

   /**
   * The employee whose payroll is being run.
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "The employee whose payroll is being run.")

  public JsonElement getEmployee() {
    return employee;
  }
  public void setEmployee(JsonElement employee) {
    this.employee = employee;
  }

  public EmployeePayrollRunRawJson payrollRun(UUID payrollRun) {
    this.payrollRun = this.serializer.getGson().toJsonTree(payrollRun);
    return this;
  }

   /**
   * The payroll being run.
   * @return payrollRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35347df1-95e7-46e2-93cc-66f1191edca5", value = "The payroll being run.")

  public JsonElement getPayrollRun() {
    return payrollRun;
  }
  public void setPayrollRun(JsonElement payrollRun) {
    this.payrollRun = payrollRun;
  }

  public EmployeePayrollRunRawJson grossPay(Float grossPay) {
    this.grossPay = this.serializer.getGson().toJsonTree(grossPay);
    return this;
  }

   /**
   * The gross pay from the run.
   * @return grossPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1342.67", value = "The gross pay from the run.")

  public JsonElement getGrossPay() {
    return grossPay;
  }
  public void setGrossPay(JsonElement grossPay) {
    this.grossPay = grossPay;
  }

  public EmployeePayrollRunRawJson netPay(Float netPay) {
    this.netPay = this.serializer.getGson().toJsonTree(netPay);
    return this;
  }

   /**
   * The net pay from the run.
   * @return netPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "865.78", value = "The net pay from the run.")

  public JsonElement getNetPay() {
    return netPay;
  }
  public void setNetPay(JsonElement netPay) {
    this.netPay = netPay;
  }

  public EmployeePayrollRunRawJson startDate(OffsetDateTime startDate) {
    this.startDate = this.serializer.getGson().toJsonTree(startDate);
    return this;
  }

   /**
   * The day and time the payroll run started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-08T00:00Z", value = "The day and time the payroll run started.")

  public JsonElement getStartDate() {
    return startDate;
  }
  public void setStartDate(JsonElement startDate) {
    this.startDate = startDate;
  }

  public EmployeePayrollRunRawJson endDate(OffsetDateTime endDate) {
    this.endDate = this.serializer.getGson().toJsonTree(endDate);
    return this;
  }

   /**
   * The day and time the payroll run ended.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-09T00:00Z", value = "The day and time the payroll run ended.")

  public JsonElement getEndDate() {
    return endDate;
  }
  public void setEndDate(JsonElement endDate) {
    this.endDate = endDate;
  }

  public EmployeePayrollRunRawJson checkDate(OffsetDateTime checkDate) {
    this.checkDate = this.serializer.getGson().toJsonTree(checkDate);
    return this;
  }

   /**
   * The day and time the payroll run was checked.
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10T00:00Z", value = "The day and time the payroll run was checked.")

  public JsonElement getCheckDate() {
    return checkDate;
  }
  public void setCheckDate(JsonElement checkDate) {
    this.checkDate = checkDate;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"amount\":1002.34,\"type\":\"SALARY\"},{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"amount\":8342.34,\"type\":\"OVERTIME\"}]", value = "")

  public JsonElement getEarnings() {
    return earnings;
  }

   /**
   * Get deductions
   * @return deductions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"name\":\"Social Security\",\"employee_deduction\":34.54,\"company_deduction\":78.78}]", value = "")

  public JsonElement getDeductions() {
    return deductions;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"name\":\"California State Income Tax\",\"amount\":100.25,\"employer_tax\":\"False\"}]", value = "")

  public JsonElement getTaxes() {
    return taxes;
  }

   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/employee-payroll\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    EmployeePayrollRunRawJson employeePayrollRun = (EmployeePayrollRunRawJson) o;
    return Objects.equals(this.id.getAsString(), employeePayrollRun.id.getAsString()) &&
        Objects.equals(this.remoteId.getAsString(), employeePayrollRun.remoteId.getAsString()) &&
        Objects.equals(this.employee.getAsString(), employeePayrollRun.employee.getAsString()) &&
        Objects.equals(this.payrollRun.getAsString(), employeePayrollRun.payrollRun.getAsString()) &&
        Objects.equals(this.grossPay.getAsString(), employeePayrollRun.grossPay.getAsString()) &&
        Objects.equals(this.netPay.getAsString(), employeePayrollRun.netPay.getAsString()) &&
        Objects.equals(this.startDate.getAsString(), employeePayrollRun.startDate.getAsString()) &&
        Objects.equals(this.endDate.getAsString(), employeePayrollRun.endDate.getAsString()) &&
        Objects.equals(this.checkDate.getAsString(), employeePayrollRun.checkDate.getAsString()) &&
        Objects.equals(this.earnings.getAsString(), employeePayrollRun.earnings.getAsString()) &&
        Objects.equals(this.deductions.getAsString(), employeePayrollRun.deductions.getAsString()) &&
        Objects.equals(this.taxes.getAsString(), employeePayrollRun.taxes.getAsString()) &&
        Objects.equals(this.remoteData.getAsString(), employeePayrollRun.remoteData.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employee, payrollRun, grossPay, netPay, startDate, endDate, checkDate, earnings, deductions, taxes, remoteData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePayrollRunRawJson {\n");
    sb.append("    id: ").append(toIndentedString(id.getAsString())).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId.getAsString())).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee.getAsString())).append("\n");
    sb.append("    payrollRun: ").append(toIndentedString(payrollRun.getAsString())).append("\n");
    sb.append("    grossPay: ").append(toIndentedString(grossPay.getAsString())).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay.getAsString())).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate.getAsString())).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate.getAsString())).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate.getAsString())).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings.getAsString())).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions.getAsString())).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes.getAsString())).append("\n");
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


