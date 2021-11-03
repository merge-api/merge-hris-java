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
import merge_hris_client.model.Deduction;
import merge_hris_client.model.Earning;
import merge_hris_client.model.RemoteData;
import merge_hris_client.model.Tax;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * # The EmployeePayrollRun Object ### Description The &#x60;EmployeePayrollRun&#x60; object is used to represent a payroll run for a specific employee.  ### Usage Example Fetch from the &#x60;LIST EmployeePayrollRun&#x60; endpoint and filter by &#x60;ID&#x60; to show all employee payroll runs.
 */
@ApiModel(description = "# The EmployeePayrollRun Object ### Description The `EmployeePayrollRun` object is used to represent a payroll run for a specific employee.  ### Usage Example Fetch from the `LIST EmployeePayrollRun` endpoint and filter by `ID` to show all employee payroll runs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-02T18:54:53.778559-07:00[America/Los_Angeles]")
public class EmployeePayrollRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private UUID employee;

  public static final String SERIALIZED_NAME_PAYROLL_RUN = "payroll_run";
  @SerializedName(SERIALIZED_NAME_PAYROLL_RUN)
  private UUID payrollRun;

  public static final String SERIALIZED_NAME_GROSS_PAY = "gross_pay";
  @SerializedName(SERIALIZED_NAME_GROSS_PAY)
  private Float grossPay;

  public static final String SERIALIZED_NAME_NET_PAY = "net_pay";
  @SerializedName(SERIALIZED_NAME_NET_PAY)
  private Float netPay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_CHECK_DATE = "check_date";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private OffsetDateTime checkDate;

  public static final String SERIALIZED_NAME_EARNINGS = "earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private List<Earning> earnings = null;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private List<Deduction> deductions = null;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private List<Tax> taxes = null;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fb8c55b6-1cb8-4b4c-9fb6-17924231619d", value = "")

  public UUID getId() {
    return id;
  }




  public EmployeePayrollRun remoteId(String remoteId) {
    
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


  public EmployeePayrollRun employee(UUID employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * The employee whose payroll is being run.
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "The employee whose payroll is being run.")

  public UUID getEmployee() {
    return employee;
  }


  public void setEmployee(UUID employee) {
    this.employee = employee;
  }


  public EmployeePayrollRun payrollRun(UUID payrollRun) {
    
    this.payrollRun = payrollRun;
    return this;
  }

   /**
   * The payroll being run.
   * @return payrollRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35347df1-95e7-46e2-93cc-66f1191edca5", value = "The payroll being run.")

  public UUID getPayrollRun() {
    return payrollRun;
  }


  public void setPayrollRun(UUID payrollRun) {
    this.payrollRun = payrollRun;
  }


  public EmployeePayrollRun grossPay(Float grossPay) {
    
    this.grossPay = grossPay;
    return this;
  }

   /**
   * The gross pay from the run.
   * @return grossPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1342.67", value = "The gross pay from the run.")

  public Float getGrossPay() {
    return grossPay;
  }


  public void setGrossPay(Float grossPay) {
    this.grossPay = grossPay;
  }


  public EmployeePayrollRun netPay(Float netPay) {
    
    this.netPay = netPay;
    return this;
  }

   /**
   * The net pay from the run.
   * @return netPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "865.78", value = "The net pay from the run.")

  public Float getNetPay() {
    return netPay;
  }


  public void setNetPay(Float netPay) {
    this.netPay = netPay;
  }


  public EmployeePayrollRun startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The day and time the payroll run started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-08T00:00Z", value = "The day and time the payroll run started.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public EmployeePayrollRun endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The day and time the payroll run ended.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-09T00:00Z", value = "The day and time the payroll run ended.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public EmployeePayrollRun checkDate(OffsetDateTime checkDate) {
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * The day and time the payroll run was checked.
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-10T00:00Z", value = "The day and time the payroll run was checked.")

  public OffsetDateTime getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(OffsetDateTime checkDate) {
    this.checkDate = checkDate;
  }


   /**
   * Get earnings
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"amount\":1002.34,\"type\":\"SALARY\"},{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"amount\":8342.34,\"type\":\"OVERTIME\"}]", value = "")

  public List<Earning> getEarnings() {
    return earnings;
  }




   /**
   * Get deductions
   * @return deductions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"name\":\"Social Security\",\"employee_deduction\":34.54,\"company_deduction\":78.78}]", value = "")

  public List<Deduction> getDeductions() {
    return deductions;
  }




   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"employee_payroll_run\":\"35347df1-95e7-46e2-93cc-66f1191edca5\",\"name\":\"California State Income Tax\",\"amount\":100.25,\"employer_tax\":\"False\"}]", value = "")

  public List<Tax> getTaxes() {
    return taxes;
  }




   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/employee-payroll\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    EmployeePayrollRun employeePayrollRun = (EmployeePayrollRun) o;
    return Objects.equals(this.id, employeePayrollRun.id) &&
        Objects.equals(this.remoteId, employeePayrollRun.remoteId) &&
        Objects.equals(this.employee, employeePayrollRun.employee) &&
        Objects.equals(this.payrollRun, employeePayrollRun.payrollRun) &&
        Objects.equals(this.grossPay, employeePayrollRun.grossPay) &&
        Objects.equals(this.netPay, employeePayrollRun.netPay) &&
        Objects.equals(this.startDate, employeePayrollRun.startDate) &&
        Objects.equals(this.endDate, employeePayrollRun.endDate) &&
        Objects.equals(this.checkDate, employeePayrollRun.checkDate) &&
        Objects.equals(this.earnings, employeePayrollRun.earnings) &&
        Objects.equals(this.deductions, employeePayrollRun.deductions) &&
        Objects.equals(this.taxes, employeePayrollRun.taxes) &&
        Objects.equals(this.remoteData, employeePayrollRun.remoteData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employee, payrollRun, grossPay, netPay, startDate, endDate, checkDate, earnings, deductions, taxes, remoteData);
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
    sb.append("class EmployeePayrollRun {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    payrollRun: ").append(toIndentedString(payrollRun)).append("\n");
    sb.append("    grossPay: ").append(toIndentedString(grossPay)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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

