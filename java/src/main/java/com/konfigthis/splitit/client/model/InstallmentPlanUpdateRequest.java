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


package com.konfigthis.splitit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.splitit.client.model.ShippingStatus2;
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

import com.konfigthis.splitit.client.JSON;

/**
 * InstallmentPlanUpdateRequest
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InstallmentPlanUpdateRequest {
  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "TrackingNumber";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public static final String SERIALIZED_NAME_CAPTURE = "Capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  public static final String SERIALIZED_NAME_SHIPPING_STATUS = "ShippingStatus";
  @SerializedName(SERIALIZED_NAME_SHIPPING_STATUS)
  private ShippingStatus2 shippingStatus;

  public InstallmentPlanUpdateRequest() {
  }

  public InstallmentPlanUpdateRequest refOrderNumber(String refOrderNumber) {
    
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


  public InstallmentPlanUpdateRequest trackingNumber(String trackingNumber) {
    
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrackingNumber() {
    return trackingNumber;
  }


  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }


  public InstallmentPlanUpdateRequest capture(Boolean capture) {
    
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCapture() {
    return capture;
  }


  public void setCapture(Boolean capture) {
    this.capture = capture;
  }


  public InstallmentPlanUpdateRequest shippingStatus(ShippingStatus2 shippingStatus) {
    
    this.shippingStatus = shippingStatus;
    return this;
  }

   /**
   * Get shippingStatus
   * @return shippingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingStatus2 getShippingStatus() {
    return shippingStatus;
  }


  public void setShippingStatus(ShippingStatus2 shippingStatus) {
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
    InstallmentPlanUpdateRequest installmentPlanUpdateRequest = (InstallmentPlanUpdateRequest) o;
    return Objects.equals(this.refOrderNumber, installmentPlanUpdateRequest.refOrderNumber) &&
        Objects.equals(this.trackingNumber, installmentPlanUpdateRequest.trackingNumber) &&
        Objects.equals(this.capture, installmentPlanUpdateRequest.capture) &&
        Objects.equals(this.shippingStatus, installmentPlanUpdateRequest.shippingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refOrderNumber, trackingNumber, capture, shippingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanUpdateRequest {\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
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
    openapiFields.add("TrackingNumber");
    openapiFields.add("Capture");
    openapiFields.add("ShippingStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanUpdateRequest is not found in the empty JSON string", InstallmentPlanUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("RefOrderNumber") != null && !jsonObj.get("RefOrderNumber").isJsonNull()) && !jsonObj.get("RefOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefOrderNumber").toString()));
      }
      if ((jsonObj.get("TrackingNumber") != null && !jsonObj.get("TrackingNumber").isJsonNull()) && !jsonObj.get("TrackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TrackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TrackingNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentPlanUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanUpdateRequest>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanUpdateRequest
  */
  public static InstallmentPlanUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanUpdateRequest.class);
  }

 /**
  * Convert an instance of InstallmentPlanUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

