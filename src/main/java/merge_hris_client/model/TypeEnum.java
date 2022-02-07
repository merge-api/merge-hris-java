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
 * Gets or Sets TypeEnum
 */
@JsonAdapter(TypeEnum.Adapter.class)
public enum TypeEnum {
  /**
  * Merge maps most values from all integrations to a single set of CommonModel enum options. However, in the event
  * Merge encounters an unrecognized value, it will be returned as-is in the api response, and this SDK will interpret
  * that as this default MERGE_NONSTANDARD_VALUE option.
  */
  MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),
  
  SALARY("SALARY"),
  
  REIMBURSEMENT("REIMBURSEMENT"),
  
  OVERTIME("OVERTIME"),
  
  BONUS("BONUS");

  private String value;

  TypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TypeEnum fromValue(String value) {
    for (TypeEnum b : TypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return TypeEnum.MERGE_NONSTANDARD_VALUE;
  }

  public static class Adapter extends TypeAdapter<TypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TypeEnum.fromValue(value);
    }
  }
}
