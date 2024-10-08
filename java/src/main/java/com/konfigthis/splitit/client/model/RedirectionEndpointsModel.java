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
 * RedirectionEndpointsModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RedirectionEndpointsModel {
  public static final String SERIALIZED_NAME_AUTHORIZE_SUCCEEDED = "AuthorizeSucceeded";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_SUCCEEDED)
  private String authorizeSucceeded;

  public static final String SERIALIZED_NAME_SUCCEEDED = "Succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private String succeeded;

  public static final String SERIALIZED_NAME_AUTHORIZE_FAILED = "AuthorizeFailed";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_FAILED)
  private String authorizeFailed;

  public static final String SERIALIZED_NAME_FAILED = "Failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private String failed;

  public RedirectionEndpointsModel() {
  }

  public RedirectionEndpointsModel authorizeSucceeded(String authorizeSucceeded) {
    
    
    
    
    this.authorizeSucceeded = authorizeSucceeded;
    return this;
  }

   /**
   * Get authorizeSucceeded
   * @return authorizeSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthorizeSucceeded() {
    return authorizeSucceeded;
  }


  public void setAuthorizeSucceeded(String authorizeSucceeded) {
    
    
    
    this.authorizeSucceeded = authorizeSucceeded;
  }


  public RedirectionEndpointsModel succeeded(String succeeded) {
    
    
    
    
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Get succeeded
   * @return succeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSucceeded() {
    return succeeded;
  }


  public void setSucceeded(String succeeded) {
    
    
    
    this.succeeded = succeeded;
  }


  public RedirectionEndpointsModel authorizeFailed(String authorizeFailed) {
    
    
    
    
    this.authorizeFailed = authorizeFailed;
    return this;
  }

   /**
   * Get authorizeFailed
   * @return authorizeFailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthorizeFailed() {
    return authorizeFailed;
  }


  public void setAuthorizeFailed(String authorizeFailed) {
    
    
    
    this.authorizeFailed = authorizeFailed;
  }


  public RedirectionEndpointsModel failed(String failed) {
    
    
    
    
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFailed() {
    return failed;
  }


  public void setFailed(String failed) {
    
    
    
    this.failed = failed;
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
   * @return the RedirectionEndpointsModel instance itself
   */
  public RedirectionEndpointsModel putAdditionalProperty(String key, Object value) {
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
    RedirectionEndpointsModel redirectionEndpointsModel = (RedirectionEndpointsModel) o;
    return Objects.equals(this.authorizeSucceeded, redirectionEndpointsModel.authorizeSucceeded) &&
        Objects.equals(this.succeeded, redirectionEndpointsModel.succeeded) &&
        Objects.equals(this.authorizeFailed, redirectionEndpointsModel.authorizeFailed) &&
        Objects.equals(this.failed, redirectionEndpointsModel.failed)&&
        Objects.equals(this.additionalProperties, redirectionEndpointsModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizeSucceeded, succeeded, authorizeFailed, failed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectionEndpointsModel {\n");
    sb.append("    authorizeSucceeded: ").append(toIndentedString(authorizeSucceeded)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    authorizeFailed: ").append(toIndentedString(authorizeFailed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
    openapiFields.add("AuthorizeSucceeded");
    openapiFields.add("Succeeded");
    openapiFields.add("AuthorizeFailed");
    openapiFields.add("Failed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RedirectionEndpointsModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RedirectionEndpointsModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedirectionEndpointsModel is not found in the empty JSON string", RedirectionEndpointsModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("AuthorizeSucceeded") != null && !jsonObj.get("AuthorizeSucceeded").isJsonNull()) && !jsonObj.get("AuthorizeSucceeded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AuthorizeSucceeded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AuthorizeSucceeded").toString()));
      }
      if ((jsonObj.get("Succeeded") != null && !jsonObj.get("Succeeded").isJsonNull()) && !jsonObj.get("Succeeded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Succeeded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Succeeded").toString()));
      }
      if ((jsonObj.get("AuthorizeFailed") != null && !jsonObj.get("AuthorizeFailed").isJsonNull()) && !jsonObj.get("AuthorizeFailed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AuthorizeFailed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AuthorizeFailed").toString()));
      }
      if ((jsonObj.get("Failed") != null && !jsonObj.get("Failed").isJsonNull()) && !jsonObj.get("Failed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Failed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Failed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedirectionEndpointsModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedirectionEndpointsModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedirectionEndpointsModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedirectionEndpointsModel.class));

       return (TypeAdapter<T>) new TypeAdapter<RedirectionEndpointsModel>() {
           @Override
           public void write(JsonWriter out, RedirectionEndpointsModel value) throws IOException {
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
           public RedirectionEndpointsModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RedirectionEndpointsModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RedirectionEndpointsModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedirectionEndpointsModel
  * @throws IOException if the JSON string is invalid with respect to RedirectionEndpointsModel
  */
  public static RedirectionEndpointsModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedirectionEndpointsModel.class);
  }

 /**
  * Convert an instance of RedirectionEndpointsModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

