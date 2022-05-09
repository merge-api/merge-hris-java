
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
 * PaginatedPayrollRunListRawJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-06T21:54:01.920674Z[Etc/UTC]")
public class PaginatedPayrollRunListRawJson {
  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private JsonElement next;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private JsonElement previous;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private JsonElement results;

  private transient JSON serializer;

  public PaginatedPayrollRunListRawJson(JSON srlzer) { 
    
    this.serializer = srlzer;
  }

  public PaginatedPayrollRunListRawJson next(String next) {
    this.next = this.serializer.getGson().toJsonTree(next);
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw", value = "")

  public JsonElement getNext() {
    return next;
  }
  public void setNext(JsonElement next) {
    this.next = next;
  }

  public PaginatedPayrollRunListRawJson previous(String previous) {
    this.previous = this.serializer.getGson().toJsonTree(previous);
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cj1sZXdwd2VycWVtY29zZnNkc2NzUWxNMEUxTXk0ME16UXpNallsTWtJ", value = "")

  public JsonElement getPrevious() {
    return previous;
  }
  public void setPrevious(JsonElement previous) {
    this.previous = previous;
  }

  public PaginatedPayrollRunListRawJson results(List<PayrollRun> results) {
    this.results = this.serializer.getGson().toJsonTree(results);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonElement getResults() {
    return results;
  }
  public void setResults(JsonElement results) {
    this.results = results;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedPayrollRunListRawJson paginatedPayrollRunList = (PaginatedPayrollRunListRawJson) o;
    return Objects.equals(this.next.getAsString(), paginatedPayrollRunList.next.getAsString()) &&
        Objects.equals(this.previous.getAsString(), paginatedPayrollRunList.previous.getAsString()) &&
        Objects.equals(this.results.getAsString(), paginatedPayrollRunList.results.getAsString());
  }
  @Override
  public int hashCode() {
    return Objects.hash(next, previous, results);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedPayrollRunListRawJson {\n");
    sb.append("    next: ").append(toIndentedString(next.getAsString())).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous.getAsString())).append("\n");
    sb.append("    results: ").append(toIndentedString(results.getAsString())).append("\n");
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


