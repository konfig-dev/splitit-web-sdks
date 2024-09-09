/*
 * splitit-web-api-v3
 * Splitit's Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.splitit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.splitit.client.model.GwAuthorizationStatus;
import com.konfigthis.splitit.client.model.ThreeDsRedirectDataV3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.splitit.client.JSON;

/**
 * AuthorizationModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuthorizationModel {
  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GwAuthorizationStatus status;

  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_SPLITIT_ERROR_RESULT_CODE = "SplititErrorResultCode";
  @SerializedName(SERIALIZED_NAME_SPLITIT_ERROR_RESULT_CODE)
  private String splititErrorResultCode;

  public static final String SERIALIZED_NAME_GATEWAY_TRANSACTION_I_D = "GatewayTransactionID";
  @SerializedName(SERIALIZED_NAME_GATEWAY_TRANSACTION_I_D)
  private String gatewayTransactionID;

  public static final String SERIALIZED_NAME_GATEWAY_RESULT_CODE = "GatewayResultCode";
  @SerializedName(SERIALIZED_NAME_GATEWAY_RESULT_CODE)
  private String gatewayResultCode;

  public static final String SERIALIZED_NAME_GATEWAY_RESULT_MESSAGE = "GatewayResultMessage";
  @SerializedName(SERIALIZED_NAME_GATEWAY_RESULT_MESSAGE)
  private String gatewayResultMessage;

  public static final String SERIALIZED_NAME_THREE_D_S_REDIRECT = "ThreeDSRedirect";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REDIRECT)
  private ThreeDsRedirectDataV3 threeDSRedirect;

  public static final String SERIALIZED_NAME_C_A_V_V = "CAVV";
  @SerializedName(SERIALIZED_NAME_C_A_V_V)
  private String CAVV;

  public static final String SERIALIZED_NAME_E_C_I = "ECI";
  @SerializedName(SERIALIZED_NAME_E_C_I)
  private String ECI;

  public static final String SERIALIZED_NAME_GATEWAY_SOURCE_RESPONSE = "GatewaySourceResponse";
  @SerializedName(SERIALIZED_NAME_GATEWAY_SOURCE_RESPONSE)
  private String gatewaySourceResponse;

  public AuthorizationModel() {
  }

  public AuthorizationModel status(GwAuthorizationStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GwAuthorizationStatus getStatus() {
    return status;
  }


  public void setStatus(GwAuthorizationStatus status) {
    
    
    
    this.status = status;
  }


  public AuthorizationModel date(OffsetDateTime date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    
    
    
    this.date = date;
  }


  public AuthorizationModel splititErrorResultCode(String splititErrorResultCode) {
    
    
    
    
    this.splititErrorResultCode = splititErrorResultCode;
    return this;
  }

   /**
   * Get splititErrorResultCode
   * @return splititErrorResultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSplititErrorResultCode() {
    return splititErrorResultCode;
  }


  public void setSplititErrorResultCode(String splititErrorResultCode) {
    
    
    
    this.splititErrorResultCode = splititErrorResultCode;
  }


  public AuthorizationModel gatewayTransactionID(String gatewayTransactionID) {
    
    
    
    
    this.gatewayTransactionID = gatewayTransactionID;
    return this;
  }

   /**
   * Get gatewayTransactionID
   * @return gatewayTransactionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayTransactionID() {
    return gatewayTransactionID;
  }


  public void setGatewayTransactionID(String gatewayTransactionID) {
    
    
    
    this.gatewayTransactionID = gatewayTransactionID;
  }


  public AuthorizationModel gatewayResultCode(String gatewayResultCode) {
    
    
    
    
    this.gatewayResultCode = gatewayResultCode;
    return this;
  }

   /**
   * Get gatewayResultCode
   * @return gatewayResultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayResultCode() {
    return gatewayResultCode;
  }


  public void setGatewayResultCode(String gatewayResultCode) {
    
    
    
    this.gatewayResultCode = gatewayResultCode;
  }


  public AuthorizationModel gatewayResultMessage(String gatewayResultMessage) {
    
    
    
    
    this.gatewayResultMessage = gatewayResultMessage;
    return this;
  }

   /**
   * Get gatewayResultMessage
   * @return gatewayResultMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayResultMessage() {
    return gatewayResultMessage;
  }


  public void setGatewayResultMessage(String gatewayResultMessage) {
    
    
    
    this.gatewayResultMessage = gatewayResultMessage;
  }


  public AuthorizationModel threeDSRedirect(ThreeDsRedirectDataV3 threeDSRedirect) {
    
    
    
    
    this.threeDSRedirect = threeDSRedirect;
    return this;
  }

   /**
   * Get threeDSRedirect
   * @return threeDSRedirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDsRedirectDataV3 getThreeDSRedirect() {
    return threeDSRedirect;
  }


  public void setThreeDSRedirect(ThreeDsRedirectDataV3 threeDSRedirect) {
    
    
    
    this.threeDSRedirect = threeDSRedirect;
  }


  public AuthorizationModel CAVV(String CAVV) {
    
    
    
    
    this.CAVV = CAVV;
    return this;
  }

   /**
   * Get CAVV
   * @return CAVV
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCAVV() {
    return CAVV;
  }


  public void setCAVV(String CAVV) {
    
    
    
    this.CAVV = CAVV;
  }


  public AuthorizationModel ECI(String ECI) {
    
    
    
    
    this.ECI = ECI;
    return this;
  }

   /**
   * Get ECI
   * @return ECI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getECI() {
    return ECI;
  }


  public void setECI(String ECI) {
    
    
    
    this.ECI = ECI;
  }


  public AuthorizationModel gatewaySourceResponse(String gatewaySourceResponse) {
    
    
    
    
    this.gatewaySourceResponse = gatewaySourceResponse;
    return this;
  }

   /**
   * Get gatewaySourceResponse
   * @return gatewaySourceResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewaySourceResponse() {
    return gatewaySourceResponse;
  }


  public void setGatewaySourceResponse(String gatewaySourceResponse) {
    
    
    
    this.gatewaySourceResponse = gatewaySourceResponse;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AuthorizationModel instance itself
   */
  public AuthorizationModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationModel authorizationModel = (AuthorizationModel) o;
    return Objects.equals(this.status, authorizationModel.status) &&
        Objects.equals(this.date, authorizationModel.date) &&
        Objects.equals(this.splititErrorResultCode, authorizationModel.splititErrorResultCode) &&
        Objects.equals(this.gatewayTransactionID, authorizationModel.gatewayTransactionID) &&
        Objects.equals(this.gatewayResultCode, authorizationModel.gatewayResultCode) &&
        Objects.equals(this.gatewayResultMessage, authorizationModel.gatewayResultMessage) &&
        Objects.equals(this.threeDSRedirect, authorizationModel.threeDSRedirect) &&
        Objects.equals(this.CAVV, authorizationModel.CAVV) &&
        Objects.equals(this.ECI, authorizationModel.ECI) &&
        Objects.equals(this.gatewaySourceResponse, authorizationModel.gatewaySourceResponse)&&
        Objects.equals(this.additionalProperties, authorizationModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, date, splititErrorResultCode, gatewayTransactionID, gatewayResultCode, gatewayResultMessage, threeDSRedirect, CAVV, ECI, gatewaySourceResponse, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationModel {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    splititErrorResultCode: ").append(toIndentedString(splititErrorResultCode)).append("\n");
    sb.append("    gatewayTransactionID: ").append(toIndentedString(gatewayTransactionID)).append("\n");
    sb.append("    gatewayResultCode: ").append(toIndentedString(gatewayResultCode)).append("\n");
    sb.append("    gatewayResultMessage: ").append(toIndentedString(gatewayResultMessage)).append("\n");
    sb.append("    threeDSRedirect: ").append(toIndentedString(threeDSRedirect)).append("\n");
    sb.append("    CAVV: ").append(toIndentedString(CAVV)).append("\n");
    sb.append("    ECI: ").append(toIndentedString(ECI)).append("\n");
    sb.append("    gatewaySourceResponse: ").append(toIndentedString(gatewaySourceResponse)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Status");
    openapiFields.add("Date");
    openapiFields.add("SplititErrorResultCode");
    openapiFields.add("GatewayTransactionID");
    openapiFields.add("GatewayResultCode");
    openapiFields.add("GatewayResultMessage");
    openapiFields.add("ThreeDSRedirect");
    openapiFields.add("CAVV");
    openapiFields.add("ECI");
    openapiFields.add("GatewaySourceResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthorizationModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationModel is not found in the empty JSON string", AuthorizationModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthorizationModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SplititErrorResultCode") != null && !jsonObj.get("SplititErrorResultCode").isJsonNull()) && !jsonObj.get("SplititErrorResultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SplititErrorResultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SplititErrorResultCode").toString()));
      }
      if ((jsonObj.get("GatewayTransactionID") != null && !jsonObj.get("GatewayTransactionID").isJsonNull()) && !jsonObj.get("GatewayTransactionID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GatewayTransactionID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GatewayTransactionID").toString()));
      }
      if ((jsonObj.get("GatewayResultCode") != null && !jsonObj.get("GatewayResultCode").isJsonNull()) && !jsonObj.get("GatewayResultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GatewayResultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GatewayResultCode").toString()));
      }
      if ((jsonObj.get("GatewayResultMessage") != null && !jsonObj.get("GatewayResultMessage").isJsonNull()) && !jsonObj.get("GatewayResultMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GatewayResultMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GatewayResultMessage").toString()));
      }
      // validate the optional field `ThreeDSRedirect`
      if (jsonObj.get("ThreeDSRedirect") != null && !jsonObj.get("ThreeDSRedirect").isJsonNull()) {
        ThreeDsRedirectDataV3.validateJsonObject(jsonObj.getAsJsonObject("ThreeDSRedirect"));
      }
      if ((jsonObj.get("CAVV") != null && !jsonObj.get("CAVV").isJsonNull()) && !jsonObj.get("CAVV").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CAVV` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CAVV").toString()));
      }
      if ((jsonObj.get("ECI") != null && !jsonObj.get("ECI").isJsonNull()) && !jsonObj.get("ECI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ECI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ECI").toString()));
      }
      if ((jsonObj.get("GatewaySourceResponse") != null && !jsonObj.get("GatewaySourceResponse").isJsonNull()) && !jsonObj.get("GatewaySourceResponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GatewaySourceResponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GatewaySourceResponse").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationModel>() {
           @Override
           public void write(JsonWriter out, AuthorizationModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else if (entry.getValue() == null) {
                   obj.addProperty(entry.getKey(), (String) null);
                 } else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizationModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthorizationModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizationModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationModel
  * @throws IOException if the JSON string is invalid with respect to AuthorizationModel
  */
  public static AuthorizationModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationModel.class);
  }

 /**
  * Convert an instance of AuthorizationModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

