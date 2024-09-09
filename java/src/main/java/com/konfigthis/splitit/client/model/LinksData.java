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
 * LinksData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LinksData {
  public static final String SERIALIZED_NAME_CHECKOUT = "Checkout";
  @SerializedName(SERIALIZED_NAME_CHECKOUT)
  private String checkout;

  public static final String SERIALIZED_NAME_LEARN_MORE = "LearnMore";
  @SerializedName(SERIALIZED_NAME_LEARN_MORE)
  private String learnMore;

  public static final String SERIALIZED_NAME_TERMS_CONDITIONS = "TermsConditions";
  @SerializedName(SERIALIZED_NAME_TERMS_CONDITIONS)
  private String termsConditions;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY = "PrivacyPolicy";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY)
  private String privacyPolicy;

  public LinksData() {
  }

  public LinksData checkout(String checkout) {
    
    
    
    
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckout() {
    return checkout;
  }


  public void setCheckout(String checkout) {
    
    
    
    this.checkout = checkout;
  }


  public LinksData learnMore(String learnMore) {
    
    
    
    
    this.learnMore = learnMore;
    return this;
  }

   /**
   * Get learnMore
   * @return learnMore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLearnMore() {
    return learnMore;
  }


  public void setLearnMore(String learnMore) {
    
    
    
    this.learnMore = learnMore;
  }


  public LinksData termsConditions(String termsConditions) {
    
    
    
    
    this.termsConditions = termsConditions;
    return this;
  }

   /**
   * Get termsConditions
   * @return termsConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTermsConditions() {
    return termsConditions;
  }


  public void setTermsConditions(String termsConditions) {
    
    
    
    this.termsConditions = termsConditions;
  }


  public LinksData privacyPolicy(String privacyPolicy) {
    
    
    
    
    this.privacyPolicy = privacyPolicy;
    return this;
  }

   /**
   * Get privacyPolicy
   * @return privacyPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivacyPolicy() {
    return privacyPolicy;
  }


  public void setPrivacyPolicy(String privacyPolicy) {
    
    
    
    this.privacyPolicy = privacyPolicy;
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
   * @return the LinksData instance itself
   */
  public LinksData putAdditionalProperty(String key, Object value) {
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
    LinksData linksData = (LinksData) o;
    return Objects.equals(this.checkout, linksData.checkout) &&
        Objects.equals(this.learnMore, linksData.learnMore) &&
        Objects.equals(this.termsConditions, linksData.termsConditions) &&
        Objects.equals(this.privacyPolicy, linksData.privacyPolicy)&&
        Objects.equals(this.additionalProperties, linksData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkout, learnMore, termsConditions, privacyPolicy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksData {\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    learnMore: ").append(toIndentedString(learnMore)).append("\n");
    sb.append("    termsConditions: ").append(toIndentedString(termsConditions)).append("\n");
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
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
    openapiFields.add("Checkout");
    openapiFields.add("LearnMore");
    openapiFields.add("TermsConditions");
    openapiFields.add("PrivacyPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinksData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinksData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinksData is not found in the empty JSON string", LinksData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Checkout") != null && !jsonObj.get("Checkout").isJsonNull()) && !jsonObj.get("Checkout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Checkout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Checkout").toString()));
      }
      if ((jsonObj.get("LearnMore") != null && !jsonObj.get("LearnMore").isJsonNull()) && !jsonObj.get("LearnMore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LearnMore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LearnMore").toString()));
      }
      if ((jsonObj.get("TermsConditions") != null && !jsonObj.get("TermsConditions").isJsonNull()) && !jsonObj.get("TermsConditions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TermsConditions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TermsConditions").toString()));
      }
      if ((jsonObj.get("PrivacyPolicy") != null && !jsonObj.get("PrivacyPolicy").isJsonNull()) && !jsonObj.get("PrivacyPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivacyPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrivacyPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinksData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinksData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinksData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinksData.class));

       return (TypeAdapter<T>) new TypeAdapter<LinksData>() {
           @Override
           public void write(JsonWriter out, LinksData value) throws IOException {
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
           public LinksData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LinksData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LinksData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinksData
  * @throws IOException if the JSON string is invalid with respect to LinksData
  */
  public static LinksData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinksData.class);
  }

 /**
  * Convert an instance of LinksData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

