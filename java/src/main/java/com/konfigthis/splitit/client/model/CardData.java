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
import com.konfigthis.splitit.client.model.CardBrand;
import com.konfigthis.splitit.client.model.CardType;
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
 * CardData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CardData {
  public static final String SERIALIZED_NAME_CARD_HOLDER_FULL_NAME = "CardHolderFullName";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_FULL_NAME)
  private String cardHolderFullName;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "CardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_EXP_YEAR = "CardExpYear";
  @SerializedName(SERIALIZED_NAME_CARD_EXP_YEAR)
  private String cardExpYear;

  public static final String SERIALIZED_NAME_CARD_EXP_MONTH = "CardExpMonth";
  @SerializedName(SERIALIZED_NAME_CARD_EXP_MONTH)
  private String cardExpMonth;

  public static final String SERIALIZED_NAME_CARD_CVV = "CardCvv";
  @SerializedName(SERIALIZED_NAME_CARD_CVV)
  private String cardCvv;

  public static final String SERIALIZED_NAME_CARD_BRAND = "CardBrand";
  @SerializedName(SERIALIZED_NAME_CARD_BRAND)
  private CardBrand cardBrand;

  public static final String SERIALIZED_NAME_CARD_TYPE = "CardType";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private CardType cardType;

  public CardData() {
  }

  public CardData cardHolderFullName(String cardHolderFullName) {
    
    
    
    
    this.cardHolderFullName = cardHolderFullName;
    return this;
  }

   /**
   * Get cardHolderFullName
   * @return cardHolderFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardHolderFullName() {
    return cardHolderFullName;
  }


  public void setCardHolderFullName(String cardHolderFullName) {
    
    
    
    this.cardHolderFullName = cardHolderFullName;
  }


  public CardData cardNumber(String cardNumber) {
    
    
    
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    
    
    
    this.cardNumber = cardNumber;
  }


  public CardData cardExpYear(String cardExpYear) {
    
    
    
    
    this.cardExpYear = cardExpYear;
    return this;
  }

   /**
   * Get cardExpYear
   * @return cardExpYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardExpYear() {
    return cardExpYear;
  }


  public void setCardExpYear(String cardExpYear) {
    
    
    
    this.cardExpYear = cardExpYear;
  }


  public CardData cardExpMonth(String cardExpMonth) {
    
    
    
    
    this.cardExpMonth = cardExpMonth;
    return this;
  }

   /**
   * Get cardExpMonth
   * @return cardExpMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardExpMonth() {
    return cardExpMonth;
  }


  public void setCardExpMonth(String cardExpMonth) {
    
    
    
    this.cardExpMonth = cardExpMonth;
  }


  public CardData cardCvv(String cardCvv) {
    
    
    
    
    this.cardCvv = cardCvv;
    return this;
  }

   /**
   * Get cardCvv
   * @return cardCvv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardCvv() {
    return cardCvv;
  }


  public void setCardCvv(String cardCvv) {
    
    
    
    this.cardCvv = cardCvv;
  }


  public CardData cardBrand(CardBrand cardBrand) {
    
    
    
    
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * Get cardBrand
   * @return cardBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardBrand getCardBrand() {
    return cardBrand;
  }


  public void setCardBrand(CardBrand cardBrand) {
    
    
    
    this.cardBrand = cardBrand;
  }


  public CardData cardType(CardType cardType) {
    
    
    
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardType getCardType() {
    return cardType;
  }


  public void setCardType(CardType cardType) {
    
    
    
    this.cardType = cardType;
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
   * @return the CardData instance itself
   */
  public CardData putAdditionalProperty(String key, Object value) {
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
    CardData cardData = (CardData) o;
    return Objects.equals(this.cardHolderFullName, cardData.cardHolderFullName) &&
        Objects.equals(this.cardNumber, cardData.cardNumber) &&
        Objects.equals(this.cardExpYear, cardData.cardExpYear) &&
        Objects.equals(this.cardExpMonth, cardData.cardExpMonth) &&
        Objects.equals(this.cardCvv, cardData.cardCvv) &&
        Objects.equals(this.cardBrand, cardData.cardBrand) &&
        Objects.equals(this.cardType, cardData.cardType)&&
        Objects.equals(this.additionalProperties, cardData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderFullName, cardNumber, cardExpYear, cardExpMonth, cardCvv, cardBrand, cardType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardData {\n");
    sb.append("    cardHolderFullName: ").append(toIndentedString(cardHolderFullName)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
    sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
    sb.append("    cardCvv: ").append(toIndentedString(cardCvv)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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
    openapiFields.add("CardHolderFullName");
    openapiFields.add("CardNumber");
    openapiFields.add("CardExpYear");
    openapiFields.add("CardExpMonth");
    openapiFields.add("CardCvv");
    openapiFields.add("CardBrand");
    openapiFields.add("CardType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CardData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardData is not found in the empty JSON string", CardData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("CardHolderFullName") != null && !jsonObj.get("CardHolderFullName").isJsonNull()) && !jsonObj.get("CardHolderFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CardHolderFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CardHolderFullName").toString()));
      }
      if ((jsonObj.get("CardNumber") != null && !jsonObj.get("CardNumber").isJsonNull()) && !jsonObj.get("CardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CardNumber").toString()));
      }
      if ((jsonObj.get("CardExpYear") != null && !jsonObj.get("CardExpYear").isJsonNull()) && !jsonObj.get("CardExpYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CardExpYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CardExpYear").toString()));
      }
      if ((jsonObj.get("CardExpMonth") != null && !jsonObj.get("CardExpMonth").isJsonNull()) && !jsonObj.get("CardExpMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CardExpMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CardExpMonth").toString()));
      }
      if ((jsonObj.get("CardCvv") != null && !jsonObj.get("CardCvv").isJsonNull()) && !jsonObj.get("CardCvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CardCvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CardCvv").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardData.class));

       return (TypeAdapter<T>) new TypeAdapter<CardData>() {
           @Override
           public void write(JsonWriter out, CardData value) throws IOException {
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
           public CardData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CardData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CardData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardData
  * @throws IOException if the JSON string is invalid with respect to CardData
  */
  public static CardData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardData.class);
  }

 /**
  * Convert an instance of CardData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

