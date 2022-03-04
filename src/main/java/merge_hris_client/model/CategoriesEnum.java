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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CategoriesEnum
 */
@JsonAdapter(CategoriesEnum.Adapter.class)
public enum CategoriesEnum {
  /**
  * Merge maps most values from all integrations to a single set of CommonModel enum options. However, in the event
  * Merge encounters an unrecognized value, it will be returned as-is in the api response, and this SDK will interpret
  * that as this default MERGE_NONSTANDARD_VALUE option.
  */
  MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),
  
  HRIS("hris"),
  
  ATS("ats"),
  
  ACCOUNTING("accounting"),
  
  TICKETING("ticketing");

  private String value;

  CategoriesEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CategoriesEnum fromValue(String value) {
    for (CategoriesEnum b : CategoriesEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return CategoriesEnum.MERGE_NONSTANDARD_VALUE;
  }

  public static class Adapter extends TypeAdapter<CategoriesEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CategoriesEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CategoriesEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CategoriesEnum.fromValue(value);
    }
  }
}

