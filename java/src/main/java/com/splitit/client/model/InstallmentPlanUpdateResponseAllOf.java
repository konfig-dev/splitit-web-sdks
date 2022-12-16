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
import com.splitit.client.model.PlanStatus;
import com.splitit.client.model.ShippingStatus;
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
 * InstallmentPlanUpdateResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstallmentPlanUpdateResponseAllOf {
  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER = "InstallmentPlanNumber";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER)
  private String installmentPlanNumber;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PlanStatus status;

  public static final String SERIALIZED_NAME_SHIPPING_STATUS = "ShippingStatus";
  @SerializedName(SERIALIZED_NAME_SHIPPING_STATUS)
  private ShippingStatus shippingStatus;

  public InstallmentPlanUpdateResponseAllOf() {
  }

  public InstallmentPlanUpdateResponseAllOf refOrderNumber(String refOrderNumber) {
    
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


  public InstallmentPlanUpdateResponseAllOf installmentPlanNumber(String installmentPlanNumber) {
    
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


  public InstallmentPlanUpdateResponseAllOf status(PlanStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlanStatus getStatus() {
    return status;
  }


  public void setStatus(PlanStatus status) {
    this.status = status;
  }


  public InstallmentPlanUpdateResponseAllOf shippingStatus(ShippingStatus shippingStatus) {
    
    this.shippingStatus = shippingStatus;
    return this;
  }

   /**
   * Get shippingStatus
   * @return shippingStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ShippingStatus getShippingStatus() {
    return shippingStatus;
  }


  public void setShippingStatus(ShippingStatus shippingStatus) {
    this.shippingStatus = shippingStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanUpdateResponseAllOf installmentPlanUpdateResponseAllOf = (InstallmentPlanUpdateResponseAllOf) o;
    return Objects.equals(this.refOrderNumber, installmentPlanUpdateResponseAllOf.refOrderNumber) &&
        Objects.equals(this.installmentPlanNumber, installmentPlanUpdateResponseAllOf.installmentPlanNumber) &&
        Objects.equals(this.status, installmentPlanUpdateResponseAllOf.status) &&
        Objects.equals(this.shippingStatus, installmentPlanUpdateResponseAllOf.shippingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refOrderNumber, installmentPlanNumber, status, shippingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanUpdateResponseAllOf {\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shippingStatus: ").append(toIndentedString(shippingStatus)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("ShippingStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("ShippingStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanUpdateResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanUpdateResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanUpdateResponseAllOf is not found in the empty JSON string", InstallmentPlanUpdateResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanUpdateResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanUpdateResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstallmentPlanUpdateResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
       if (!InstallmentPlanUpdateResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanUpdateResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanUpdateResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanUpdateResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanUpdateResponseAllOf>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanUpdateResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanUpdateResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanUpdateResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanUpdateResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanUpdateResponseAllOf
  */
  public static InstallmentPlanUpdateResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanUpdateResponseAllOf.class);
  }

 /**
  * Convert an instance of InstallmentPlanUpdateResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

