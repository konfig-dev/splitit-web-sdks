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
 * ThreeDSData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ThreeDSData {
  public static final String SERIALIZED_NAME_E_C_I = "ECI";
  @SerializedName(SERIALIZED_NAME_E_C_I)
  private String ECI;

  public static final String SERIALIZED_NAME_C_A_V_V = "CAVV";
  @SerializedName(SERIALIZED_NAME_C_A_V_V)
  private String CAVV;

  public static final String SERIALIZED_NAME_X_I_D = "XID";
  @SerializedName(SERIALIZED_NAME_X_I_D)
  private String XID;

  public static final String SERIALIZED_NAME_DIRECTORY_SERVER_TXN_ID = "DirectoryServerTxnId";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_SERVER_TXN_ID)
  private String directoryServerTxnId;

  public static final String SERIALIZED_NAME_THREE_D_S_VERSION = "ThreeDSVersion";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_VERSION)
  private String threeDSVersion;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "TransactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public ThreeDSData() {
  }

  public ThreeDSData ECI(String ECI) {
    
    
    
    
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


  public ThreeDSData CAVV(String CAVV) {
    
    
    
    
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


  public ThreeDSData XID(String XID) {
    
    
    
    
    this.XID = XID;
    return this;
  }

   /**
   * Get XID
   * @return XID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getXID() {
    return XID;
  }


  public void setXID(String XID) {
    
    
    
    this.XID = XID;
  }


  public ThreeDSData directoryServerTxnId(String directoryServerTxnId) {
    
    
    
    
    this.directoryServerTxnId = directoryServerTxnId;
    return this;
  }

   /**
   * Get directoryServerTxnId
   * @return directoryServerTxnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirectoryServerTxnId() {
    return directoryServerTxnId;
  }


  public void setDirectoryServerTxnId(String directoryServerTxnId) {
    
    
    
    this.directoryServerTxnId = directoryServerTxnId;
  }


  public ThreeDSData threeDSVersion(String threeDSVersion) {
    
    
    
    
    this.threeDSVersion = threeDSVersion;
    return this;
  }

   /**
   * Get threeDSVersion
   * @return threeDSVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThreeDSVersion() {
    return threeDSVersion;
  }


  public void setThreeDSVersion(String threeDSVersion) {
    
    
    
    this.threeDSVersion = threeDSVersion;
  }


  public ThreeDSData transactionId(String transactionId) {
    
    
    
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    
    
    
    this.transactionId = transactionId;
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
   * @return the ThreeDSData instance itself
   */
  public ThreeDSData putAdditionalProperty(String key, Object value) {
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
    ThreeDSData threeDSData = (ThreeDSData) o;
    return Objects.equals(this.ECI, threeDSData.ECI) &&
        Objects.equals(this.CAVV, threeDSData.CAVV) &&
        Objects.equals(this.XID, threeDSData.XID) &&
        Objects.equals(this.directoryServerTxnId, threeDSData.directoryServerTxnId) &&
        Objects.equals(this.threeDSVersion, threeDSData.threeDSVersion) &&
        Objects.equals(this.transactionId, threeDSData.transactionId)&&
        Objects.equals(this.additionalProperties, threeDSData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ECI, CAVV, XID, directoryServerTxnId, threeDSVersion, transactionId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSData {\n");
    sb.append("    ECI: ").append(toIndentedString(ECI)).append("\n");
    sb.append("    CAVV: ").append(toIndentedString(CAVV)).append("\n");
    sb.append("    XID: ").append(toIndentedString(XID)).append("\n");
    sb.append("    directoryServerTxnId: ").append(toIndentedString(directoryServerTxnId)).append("\n");
    sb.append("    threeDSVersion: ").append(toIndentedString(threeDSVersion)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
    openapiFields.add("ECI");
    openapiFields.add("CAVV");
    openapiFields.add("XID");
    openapiFields.add("DirectoryServerTxnId");
    openapiFields.add("ThreeDSVersion");
    openapiFields.add("TransactionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThreeDSData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSData is not found in the empty JSON string", ThreeDSData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("ECI") != null && !jsonObj.get("ECI").isJsonNull()) && !jsonObj.get("ECI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ECI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ECI").toString()));
      }
      if ((jsonObj.get("CAVV") != null && !jsonObj.get("CAVV").isJsonNull()) && !jsonObj.get("CAVV").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CAVV` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CAVV").toString()));
      }
      if ((jsonObj.get("XID") != null && !jsonObj.get("XID").isJsonNull()) && !jsonObj.get("XID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `XID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("XID").toString()));
      }
      if ((jsonObj.get("DirectoryServerTxnId") != null && !jsonObj.get("DirectoryServerTxnId").isJsonNull()) && !jsonObj.get("DirectoryServerTxnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DirectoryServerTxnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DirectoryServerTxnId").toString()));
      }
      if ((jsonObj.get("ThreeDSVersion") != null && !jsonObj.get("ThreeDSVersion").isJsonNull()) && !jsonObj.get("ThreeDSVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ThreeDSVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ThreeDSVersion").toString()));
      }
      if ((jsonObj.get("TransactionId") != null && !jsonObj.get("TransactionId").isJsonNull()) && !jsonObj.get("TransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransactionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSData.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSData>() {
           @Override
           public void write(JsonWriter out, ThreeDSData value) throws IOException {
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
           public ThreeDSData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ThreeDSData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ThreeDSData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSData
  * @throws IOException if the JSON string is invalid with respect to ThreeDSData
  */
  public static ThreeDSData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSData.class);
  }

 /**
  * Convert an instance of ThreeDSData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

