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
 * Gets or Sets RunTypeEnum
 */
@JsonAdapter(RunTypeEnum.Adapter.class)
public enum RunTypeEnum {
  /**
  * Merge maps most values from all integrations to a single set of CommonModel enum options. However, in the event
  * Merge encounters an unrecognized value, it will be returned as-is in the api response, and this SDK will interpret
  * that as this default MERGE_NONSTANDARD_VALUE option.
  */
  MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),
  
  REGULAR("REGULAR"),
  
  OFF_CYCLE("OFF_CYCLE"),
  
  CORRECTION("CORRECTION"),
  
  TERMINATION("TERMINATION"),
  
  SIGN_ON_BONUS("SIGN_ON_BONUS");

  private String value;

  RunTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RunTypeEnum fromValue(String value) {
    for (RunTypeEnum b : RunTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return RunTypeEnum.MERGE_NONSTANDARD_VALUE;
  }

  public static class Adapter extends TypeAdapter<RunTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final RunTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RunTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RunTypeEnum.fromValue(value);
    }
  }
}
