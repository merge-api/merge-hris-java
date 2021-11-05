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
import merge_hris_client.model.AccountIntegration;

/**
 * AccountToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-04T16:55:30.126663-07:00[America/Los_Angeles]")
public class AccountToken {
  public static final String SERIALIZED_NAME_ACCOUNT_TOKEN = "account_token";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TOKEN)
  private String accountToken;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private AccountIntegration integration;


  public AccountToken accountToken(String accountToken) {
    
    this.accountToken = accountToken;
    return this;
  }

   /**
   * Get accountToken
   * @return accountToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "T9klMDQrcHdm9jrtHuOS2Nf06BIHwMNjpPXPMB", required = true, value = "")

  public String getAccountToken() {
    return accountToken;
  }


  public void setAccountToken(String accountToken) {
    this.accountToken = accountToken;
  }


  public AccountToken integration(AccountIntegration integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountIntegration getIntegration() {
    return integration;
  }


  public void setIntegration(AccountIntegration integration) {
    this.integration = integration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountToken accountToken = (AccountToken) o;
    return Objects.equals(this.accountToken, accountToken.accountToken) &&
        Objects.equals(this.integration, accountToken.integration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountToken, integration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountToken {\n");
    sb.append("    accountToken: ").append(toIndentedString(accountToken)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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

