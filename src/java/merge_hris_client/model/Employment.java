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


package java.merge_hris_client.model;

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
import java.merge_hris_client.model.RemoteData;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Employment Object ### Description The &#x60;Employment&#x60; object is used to represent an employment position at a company. These are associated with the employee filling the role.  ### Usage Example Fetch from the &#x60;LIST Employments&#x60; endpoint and filter by &#x60;ID&#x60; to show all employees.
 */
@ApiModel(description = "# The Employment Object ### Description The `Employment` object is used to represent an employment position at a company. These are associated with the employee filling the role.  ### Usage Example Fetch from the `LIST Employments` endpoint and filter by `ID` to show all employees.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-04T09:48:16.195775-07:00[America/Los_Angeles]")
public class Employment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_PAY_RATE = "pay_rate";
  @SerializedName(SERIALIZED_NAME_PAY_RATE)
  private Float payRate;

  public static final String SERIALIZED_NAME_PAY_PERIOD = "pay_period";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD)
  private String payPeriod;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private String payFrequency;

  public static final String SERIALIZED_NAME_PAY_CURRENCY = "pay_currency";
  @SerializedName(SERIALIZED_NAME_PAY_CURRENCY)
  private String payCurrency;

  public static final String SERIALIZED_NAME_FLSA_STATUS = "flsa_status";
  @SerializedName(SERIALIZED_NAME_FLSA_STATUS)
  private String flsaStatus;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_EMPLOYMENT_TYPE = "employment_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_TYPE)
  private String employmentType;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65d8ffd0-211b-4ba4-b85a-fbe2ce220982", value = "")

  public UUID getId() {
    return id;
  }




  public Employment remoteId(String remoteId) {
    
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


  public Employment jobTitle(String jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * The position&#39;s title.
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software Engineer", value = "The position's title.")

  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public Employment payRate(Float payRate) {
    
    this.payRate = payRate;
    return this;
  }

   /**
   * The position&#39;s pay rate in dollars.
   * @return payRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80000.00", value = "The position's pay rate in dollars.")

  public Float getPayRate() {
    return payRate;
  }


  public void setPayRate(Float payRate) {
    this.payRate = payRate;
  }


   /**
   * Get payPeriod
   * @return payPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "YEAR", value = "")

  public String getPayPeriod() {
    return payPeriod;
  }




   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BIWEEKLY", value = "")

  public String getPayFrequency() {
    return payFrequency;
  }




   /**
   * Get payCurrency
   * @return payCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getPayCurrency() {
    return payCurrency;
  }




   /**
   * Get flsaStatus
   * @return flsaStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXEMPT", value = "")

  public String getFlsaStatus() {
    return flsaStatus;
  }




  public Employment effectiveDate(OffsetDateTime effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The position&#39;s effective date.
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-06T18:42:34Z", value = "The position's effective date.")

  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


   /**
   * Get employmentType
   * @return employmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FULL TIME", value = "")

  public String getEmploymentType() {
    return employmentType;
  }




   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/jobs\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    Employment employment = (Employment) o;
    return Objects.equals(this.id, employment.id) &&
        Objects.equals(this.remoteId, employment.remoteId) &&
        Objects.equals(this.jobTitle, employment.jobTitle) &&
        Objects.equals(this.payRate, employment.payRate) &&
        Objects.equals(this.payPeriod, employment.payPeriod) &&
        Objects.equals(this.payFrequency, employment.payFrequency) &&
        Objects.equals(this.payCurrency, employment.payCurrency) &&
        Objects.equals(this.flsaStatus, employment.flsaStatus) &&
        Objects.equals(this.effectiveDate, employment.effectiveDate) &&
        Objects.equals(this.employmentType, employment.employmentType) &&
        Objects.equals(this.remoteData, employment.remoteData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, jobTitle, payRate, payPeriod, payFrequency, payCurrency, flsaStatus, effectiveDate, employmentType, remoteData);
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
    sb.append("class Employment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    payRate: ").append(toIndentedString(payRate)).append("\n");
    sb.append("    payPeriod: ").append(toIndentedString(payPeriod)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    payCurrency: ").append(toIndentedString(payCurrency)).append("\n");
    sb.append("    flsaStatus: ").append(toIndentedString(flsaStatus)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
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

