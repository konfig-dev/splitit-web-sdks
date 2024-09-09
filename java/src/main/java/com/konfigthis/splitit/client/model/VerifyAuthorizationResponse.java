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
import com.konfigthis.splitit.client.model.AuthorizationModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * VerifyAuthorizationResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VerifyAuthorizationResponse {
  public static final String SERIALIZED_NAME_IS_AUTHORIZED = "IsAuthorized";
  @SerializedName(SERIALIZED_NAME_IS_AUTHORIZED)
  private Boolean isAuthorized;

  public static final String SERIALIZED_NAME_AUTHORIZATION_AMOUNT = "AuthorizationAmount";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_AMOUNT)
  private Double authorizationAmount;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "Authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private AuthorizationModel authorization;

  public VerifyAuthorizationResponse() {
  }

  public VerifyAuthorizationResponse isAuthorized(Boolean isAuthorized) {
    
    
    
    
    this.isAuthorized = isAuthorized;
    return this;
  }

   /**
   * Get isAuthorized
   * @return isAuthorized
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsAuthorized() {
    return isAuthorized;
  }


  public void setIsAuthorized(Boolean isAuthorized) {
    
    
    
    this.isAuthorized = isAuthorized;
  }


  public VerifyAuthorizationResponse authorizationAmount(Double authorizationAmount) {
    
    
    
    
    this.authorizationAmount = authorizationAmount;
    return this;
  }

  public VerifyAuthorizationResponse authorizationAmount(Integer authorizationAmount) {
    
    
    
    
    this.authorizationAmount = authorizationAmount.doubleValue();
    return this;
  }

   /**
   * Get authorizationAmount
   * @return authorizationAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAuthorizationAmount() {
    return authorizationAmount;
  }


  public void setAuthorizationAmount(Double authorizationAmount) {
    
    
    
    this.authorizationAmount = authorizationAmount;
  }


  public VerifyAuthorizationResponse authorization(AuthorizationModel authorization) {
    
    
    
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationModel getAuthorization() {
    return authorization;
  }


  public void setAuthorization(AuthorizationModel authorization) {
    
    
    
    this.authorization = authorization;
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
   * @return the VerifyAuthorizationResponse instance itself
   */
  public VerifyAuthorizationResponse putAdditionalProperty(String key, Object value) {
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
    VerifyAuthorizationResponse verifyAuthorizationResponse = (VerifyAuthorizationResponse) o;
    return Objects.equals(this.isAuthorized, verifyAuthorizationResponse.isAuthorized) &&
        Objects.equals(this.authorizationAmount, verifyAuthorizationResponse.authorizationAmount) &&
        Objects.equals(this.authorization, verifyAuthorizationResponse.authorization)&&
        Objects.equals(this.additionalProperties, verifyAuthorizationResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAuthorized, authorizationAmount, authorization, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyAuthorizationResponse {\n");
    sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
    openapiFields.add("IsAuthorized");
    openapiFields.add("AuthorizationAmount");
    openapiFields.add("Authorization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("IsAuthorized");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifyAuthorizationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifyAuthorizationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyAuthorizationResponse is not found in the empty JSON string", VerifyAuthorizationResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerifyAuthorizationResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `Authorization`
      if (jsonObj.get("Authorization") != null && !jsonObj.get("Authorization").isJsonNull()) {
        AuthorizationModel.validateJsonObject(jsonObj.getAsJsonObject("Authorization"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifyAuthorizationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyAuthorizationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyAuthorizationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyAuthorizationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyAuthorizationResponse>() {
           @Override
           public void write(JsonWriter out, VerifyAuthorizationResponse value) throws IOException {
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
           public VerifyAuthorizationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VerifyAuthorizationResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VerifyAuthorizationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyAuthorizationResponse
  * @throws IOException if the JSON string is invalid with respect to VerifyAuthorizationResponse
  */
  public static VerifyAuthorizationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyAuthorizationResponse.class);
  }

 /**
  * Convert an instance of VerifyAuthorizationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

