/*
 * splitit-web-api-v3
 * Splitit's API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.splitit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.splitit.client.model.Error;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.splitit.client.JSON;

/**
 * FailedResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T17:45:38.348478-08:00[America/Los_Angeles]")
public class FailedResponseAllOf {
  public static final String SERIALIZED_NAME_TRACE_ID = "TraceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public FailedResponseAllOf() {
  }

  public FailedResponseAllOf traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * Get traceId
   * @return traceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public FailedResponseAllOf error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedResponseAllOf failedResponseAllOf = (FailedResponseAllOf) o;
    return Objects.equals(this.traceId, failedResponseAllOf.traceId) &&
        Objects.equals(this.error, failedResponseAllOf.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceId, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedResponseAllOf {\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("TraceId");
    openapiFields.add("Error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FailedResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FailedResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FailedResponseAllOf is not found in the empty JSON string", FailedResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FailedResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FailedResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TraceId") != null && !jsonObj.get("TraceId").isJsonNull()) && !jsonObj.get("TraceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TraceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TraceId").toString()));
      }
      // validate the optional field `Error`
      if (jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) {
        Error.validateJsonObject(jsonObj.getAsJsonObject("Error"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FailedResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FailedResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FailedResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FailedResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FailedResponseAllOf>() {
           @Override
           public void write(JsonWriter out, FailedResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FailedResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FailedResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FailedResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to FailedResponseAllOf
  */
  public static FailedResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FailedResponseAllOf.class);
  }

 /**
  * Convert an instance of FailedResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

