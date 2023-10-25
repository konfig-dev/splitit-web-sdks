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
import java.util.HashMap;
import java.util.Map;

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
 * IdentifierContract
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IdentifierContract {
  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER = "InstallmentPlanNumber";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER)
  private String installmentPlanNumber;

  public static final String SERIALIZED_NAME_EXTENDED_PARAMS = "ExtendedParams";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PARAMS)
  private Map<String, String> extendedParams = null;

  public IdentifierContract() {
  }

  public IdentifierContract refOrderNumber(String refOrderNumber) {
    
    
    
    
    this.refOrderNumber = refOrderNumber;
    return this;
  }

   /**
   * Get refOrderNumber
   * @return refOrderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefOrderNumber() {
    return refOrderNumber;
  }


  public void setRefOrderNumber(String refOrderNumber) {
    
    
    
    this.refOrderNumber = refOrderNumber;
  }


  public IdentifierContract installmentPlanNumber(String installmentPlanNumber) {
    
    
    
    
    this.installmentPlanNumber = installmentPlanNumber;
    return this;
  }

   /**
   * Get installmentPlanNumber
   * @return installmentPlanNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstallmentPlanNumber() {
    return installmentPlanNumber;
  }


  public void setInstallmentPlanNumber(String installmentPlanNumber) {
    
    
    
    this.installmentPlanNumber = installmentPlanNumber;
  }


  public IdentifierContract extendedParams(Map<String, String> extendedParams) {
    
    
    
    
    this.extendedParams = extendedParams;
    return this;
  }

  public IdentifierContract putExtendedParamsItem(String key, String extendedParamsItem) {
    if (this.extendedParams == null) {
      this.extendedParams = new HashMap<>();
    }
    this.extendedParams.put(key, extendedParamsItem);
    return this;
  }

   /**
   * Get extendedParams
   * @return extendedParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getExtendedParams() {
    return extendedParams;
  }


  public void setExtendedParams(Map<String, String> extendedParams) {
    
    
    
    this.extendedParams = extendedParams;
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
   * @return the IdentifierContract instance itself
   */
  public IdentifierContract putAdditionalProperty(String key, Object value) {
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
    IdentifierContract identifierContract = (IdentifierContract) o;
    return Objects.equals(this.refOrderNumber, identifierContract.refOrderNumber) &&
        Objects.equals(this.installmentPlanNumber, identifierContract.installmentPlanNumber) &&
        Objects.equals(this.extendedParams, identifierContract.extendedParams)&&
        Objects.equals(this.additionalProperties, identifierContract.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refOrderNumber, installmentPlanNumber, extendedParams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierContract {\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    extendedParams: ").append(toIndentedString(extendedParams)).append("\n");
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
    openapiFields.add("RefOrderNumber");
    openapiFields.add("InstallmentPlanNumber");
    openapiFields.add("ExtendedParams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentifierContract
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IdentifierContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentifierContract is not found in the empty JSON string", IdentifierContract.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("RefOrderNumber") != null && !jsonObj.get("RefOrderNumber").isJsonNull()) && !jsonObj.get("RefOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefOrderNumber").toString()));
      }
      if ((jsonObj.get("InstallmentPlanNumber") != null && !jsonObj.get("InstallmentPlanNumber").isJsonNull()) && !jsonObj.get("InstallmentPlanNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InstallmentPlanNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InstallmentPlanNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentifierContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentifierContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentifierContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentifierContract.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentifierContract>() {
           @Override
           public void write(JsonWriter out, IdentifierContract value) throws IOException {
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
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentifierContract read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IdentifierContract instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IdentifierContract given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentifierContract
  * @throws IOException if the JSON string is invalid with respect to IdentifierContract
  */
  public static IdentifierContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentifierContract.class);
  }

 /**
  * Convert an instance of IdentifierContract to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

