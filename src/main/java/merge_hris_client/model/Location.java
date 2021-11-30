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
import merge_hris_client.model.CountryEnum;
import merge_hris_client.model.RemoteData;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * # The Location Object ### Description The &#x60;Location&#x60; object is used to represent a Location for a Company or Employee address. This is shared across many models and is referenced whenever a location is stored.  ### Usage Example Fetch from the &#x60;LIST Locations&#x60; endpoint and filter by &#x60;ID&#x60; to show all office locations.
 */
@ApiModel(description = "# The Location Object ### Description The `Location` object is used to represent a Location for a Company or Employee address. This is shared across many models and is referenced whenever a location is stored.  ### Usage Example Fetch from the `LIST Locations` endpoint and filter by `ID` to show all office locations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T21:03:29.505759-05:00[America/New_York]")
public class Location {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_STREET1 = "street_1";
  @SerializedName(SERIALIZED_NAME_STREET1)
  private String street1;

  public static final String SERIALIZED_NAME_STREET2 = "street_2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zip_code";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryEnum country;

  public static final String SERIALIZED_NAME_REMOTE_DATA = "remote_data";
  @SerializedName(SERIALIZED_NAME_REMOTE_DATA)
  private List<RemoteData> remoteData = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }




  public Location remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "93018402", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public Location name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The location&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NYC Office", value = "The location's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Location phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The location&#39;s phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1111111111", value = "The location's phone number.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public Location street1(String street1) {
    
    this.street1 = street1;
    return this;
  }

   /**
   * Line 1 of the location&#39;s street address.
   * @return street1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2920 Broadway", value = "Line 1 of the location's street address.")

  public String getStreet1() {
    return street1;
  }


  public void setStreet1(String street1) {
    this.street1 = street1;
  }


  public Location street2(String street2) {
    
    this.street2 = street2;
    return this;
  }

   /**
   * Line 2 of the location&#39;s street address.
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2nd Floor", value = "Line 2 of the location's street address.")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  public Location city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The location&#39;s city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New York ", value = "The location's city.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Location state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The location&#39;s state. Represents a region if outside of the US.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NY", value = "The location's state. Represents a region if outside of the US.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Location zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * The location&#39;s zip code.
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10027", value = "The location's zip code.")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public Location country(CountryEnum country) {
    
    this.country = country;
    return this;
  }

   /**
   * The location&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USA", value = "The location's country.")

  public CountryEnum getCountry() {
    return country;
  }


  public void setCountry(CountryEnum country) {
    this.country = country;
  }


   /**
   * Get remoteData
   * @return remoteData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"path\":\"/locations\",\"data\":[\"Varies by platform\"]}]", value = "")

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
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.remoteId, location.remoteId) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.phoneNumber, location.phoneNumber) &&
        Objects.equals(this.street1, location.street1) &&
        Objects.equals(this.street2, location.street2) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.zipCode, location.zipCode) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.remoteData, location.remoteData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, name, phoneNumber, street1, street2, city, state, zipCode, country, remoteData);
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
    sb.append("class Location {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

