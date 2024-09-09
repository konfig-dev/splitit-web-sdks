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
import com.konfigthis.splitit.client.model.AddressData;
import com.konfigthis.splitit.client.model.AuthorizationModel;
import com.konfigthis.splitit.client.model.Installment;
import com.konfigthis.splitit.client.model.LinksData;
import com.konfigthis.splitit.client.model.PaymentMethodModel;
import com.konfigthis.splitit.client.model.PlanStatus;
import com.konfigthis.splitit.client.model.PurchaseMethod;
import com.konfigthis.splitit.client.model.RefundModel;
import com.konfigthis.splitit.client.model.ShopperData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * SearchInstallmentPlanResponseItem
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchInstallmentPlanResponseItem {
  public static final String SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER = "InstallmentPlanNumber";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER)
  private String installmentPlanNumber;

  public static final String SERIALIZED_NAME_DATE_CREATED = "DateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_PURCHASE_METHOD = "PurchaseMethod";
  @SerializedName(SERIALIZED_NAME_PURCHASE_METHOD)
  private PurchaseMethod purchaseMethod;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PlanStatus status;

  public static final String SERIALIZED_NAME_CURRENCY = "Currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ORIGINAL_AMOUNT = "OriginalAmount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_AMOUNT)
  private Double originalAmount;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "Authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private AuthorizationModel authorization;

  public static final String SERIALIZED_NAME_SHOPPER = "Shopper";
  @SerializedName(SERIALIZED_NAME_SHOPPER)
  private ShopperData shopper;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "BillingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private AddressData billingAddress;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "PaymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethodModel paymentMethod;

  public static final String SERIALIZED_NAME_EXTENDED_PARAMS = "ExtendedParams";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PARAMS)
  private Map<String, String> extendedParams = null;

  public static final String SERIALIZED_NAME_INSTALLMENTS = "Installments";
  @SerializedName(SERIALIZED_NAME_INSTALLMENTS)
  private List<Installment> installments = null;

  public static final String SERIALIZED_NAME_REFUNDS = "Refunds";
  @SerializedName(SERIALIZED_NAME_REFUNDS)
  private List<RefundModel> refunds = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private LinksData links;

  public SearchInstallmentPlanResponseItem() {
  }

  public SearchInstallmentPlanResponseItem installmentPlanNumber(String installmentPlanNumber) {
    
    
    
    
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


  public SearchInstallmentPlanResponseItem dateCreated(OffsetDateTime dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public SearchInstallmentPlanResponseItem refOrderNumber(String refOrderNumber) {
    
    
    
    
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


  public SearchInstallmentPlanResponseItem purchaseMethod(PurchaseMethod purchaseMethod) {
    
    
    
    
    this.purchaseMethod = purchaseMethod;
    return this;
  }

   /**
   * Get purchaseMethod
   * @return purchaseMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PurchaseMethod getPurchaseMethod() {
    return purchaseMethod;
  }


  public void setPurchaseMethod(PurchaseMethod purchaseMethod) {
    
    
    
    this.purchaseMethod = purchaseMethod;
  }


  public SearchInstallmentPlanResponseItem status(PlanStatus status) {
    
    
    
    
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


  public SearchInstallmentPlanResponseItem currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public SearchInstallmentPlanResponseItem originalAmount(Double originalAmount) {
    
    
    
    
    this.originalAmount = originalAmount;
    return this;
  }

  public SearchInstallmentPlanResponseItem originalAmount(Integer originalAmount) {
    
    
    
    
    this.originalAmount = originalAmount.doubleValue();
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getOriginalAmount() {
    return originalAmount;
  }


  public void setOriginalAmount(Double originalAmount) {
    
    
    
    this.originalAmount = originalAmount;
  }


  public SearchInstallmentPlanResponseItem amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public SearchInstallmentPlanResponseItem amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public SearchInstallmentPlanResponseItem authorization(AuthorizationModel authorization) {
    
    
    
    
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


  public SearchInstallmentPlanResponseItem shopper(ShopperData shopper) {
    
    
    
    
    this.shopper = shopper;
    return this;
  }

   /**
   * Get shopper
   * @return shopper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShopperData getShopper() {
    return shopper;
  }


  public void setShopper(ShopperData shopper) {
    
    
    
    this.shopper = shopper;
  }


  public SearchInstallmentPlanResponseItem billingAddress(AddressData billingAddress) {
    
    
    
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressData getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(AddressData billingAddress) {
    
    
    
    this.billingAddress = billingAddress;
  }


  public SearchInstallmentPlanResponseItem paymentMethod(PaymentMethodModel paymentMethod) {
    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMethodModel getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodModel paymentMethod) {
    
    
    
    this.paymentMethod = paymentMethod;
  }


  public SearchInstallmentPlanResponseItem extendedParams(Map<String, String> extendedParams) {
    
    
    
    
    this.extendedParams = extendedParams;
    return this;
  }

  public SearchInstallmentPlanResponseItem putExtendedParamsItem(String key, String extendedParamsItem) {
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


  public SearchInstallmentPlanResponseItem installments(List<Installment> installments) {
    
    
    
    
    this.installments = installments;
    return this;
  }

  public SearchInstallmentPlanResponseItem addInstallmentsItem(Installment installmentsItem) {
    if (this.installments == null) {
      this.installments = new ArrayList<>();
    }
    this.installments.add(installmentsItem);
    return this;
  }

   /**
   * Get installments
   * @return installments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Installment> getInstallments() {
    return installments;
  }


  public void setInstallments(List<Installment> installments) {
    
    
    
    this.installments = installments;
  }


  public SearchInstallmentPlanResponseItem refunds(List<RefundModel> refunds) {
    
    
    
    
    this.refunds = refunds;
    return this;
  }

  public SearchInstallmentPlanResponseItem addRefundsItem(RefundModel refundsItem) {
    if (this.refunds == null) {
      this.refunds = new ArrayList<>();
    }
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RefundModel> getRefunds() {
    return refunds;
  }


  public void setRefunds(List<RefundModel> refunds) {
    
    
    
    this.refunds = refunds;
  }


  public SearchInstallmentPlanResponseItem links(LinksData links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksData getLinks() {
    return links;
  }


  public void setLinks(LinksData links) {
    
    
    
    this.links = links;
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
   * @return the SearchInstallmentPlanResponseItem instance itself
   */
  public SearchInstallmentPlanResponseItem putAdditionalProperty(String key, Object value) {
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
    SearchInstallmentPlanResponseItem searchInstallmentPlanResponseItem = (SearchInstallmentPlanResponseItem) o;
    return Objects.equals(this.installmentPlanNumber, searchInstallmentPlanResponseItem.installmentPlanNumber) &&
        Objects.equals(this.dateCreated, searchInstallmentPlanResponseItem.dateCreated) &&
        Objects.equals(this.refOrderNumber, searchInstallmentPlanResponseItem.refOrderNumber) &&
        Objects.equals(this.purchaseMethod, searchInstallmentPlanResponseItem.purchaseMethod) &&
        Objects.equals(this.status, searchInstallmentPlanResponseItem.status) &&
        Objects.equals(this.currency, searchInstallmentPlanResponseItem.currency) &&
        Objects.equals(this.originalAmount, searchInstallmentPlanResponseItem.originalAmount) &&
        Objects.equals(this.amount, searchInstallmentPlanResponseItem.amount) &&
        Objects.equals(this.authorization, searchInstallmentPlanResponseItem.authorization) &&
        Objects.equals(this.shopper, searchInstallmentPlanResponseItem.shopper) &&
        Objects.equals(this.billingAddress, searchInstallmentPlanResponseItem.billingAddress) &&
        Objects.equals(this.paymentMethod, searchInstallmentPlanResponseItem.paymentMethod) &&
        Objects.equals(this.extendedParams, searchInstallmentPlanResponseItem.extendedParams) &&
        Objects.equals(this.installments, searchInstallmentPlanResponseItem.installments) &&
        Objects.equals(this.refunds, searchInstallmentPlanResponseItem.refunds) &&
        Objects.equals(this.links, searchInstallmentPlanResponseItem.links)&&
        Objects.equals(this.additionalProperties, searchInstallmentPlanResponseItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, dateCreated, refOrderNumber, purchaseMethod, status, currency, originalAmount, amount, authorization, shopper, billingAddress, paymentMethod, extendedParams, installments, refunds, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchInstallmentPlanResponseItem {\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    purchaseMethod: ").append(toIndentedString(purchaseMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    shopper: ").append(toIndentedString(shopper)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    extendedParams: ").append(toIndentedString(extendedParams)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("InstallmentPlanNumber");
    openapiFields.add("DateCreated");
    openapiFields.add("RefOrderNumber");
    openapiFields.add("PurchaseMethod");
    openapiFields.add("Status");
    openapiFields.add("Currency");
    openapiFields.add("OriginalAmount");
    openapiFields.add("Amount");
    openapiFields.add("Authorization");
    openapiFields.add("Shopper");
    openapiFields.add("BillingAddress");
    openapiFields.add("PaymentMethod");
    openapiFields.add("ExtendedParams");
    openapiFields.add("Installments");
    openapiFields.add("Refunds");
    openapiFields.add("Links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DateCreated");
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchInstallmentPlanResponseItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchInstallmentPlanResponseItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchInstallmentPlanResponseItem is not found in the empty JSON string", SearchInstallmentPlanResponseItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchInstallmentPlanResponseItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("InstallmentPlanNumber") != null && !jsonObj.get("InstallmentPlanNumber").isJsonNull()) && !jsonObj.get("InstallmentPlanNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InstallmentPlanNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InstallmentPlanNumber").toString()));
      }
      if ((jsonObj.get("RefOrderNumber") != null && !jsonObj.get("RefOrderNumber").isJsonNull()) && !jsonObj.get("RefOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefOrderNumber").toString()));
      }
      if ((jsonObj.get("Currency") != null && !jsonObj.get("Currency").isJsonNull()) && !jsonObj.get("Currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Currency").toString()));
      }
      // validate the optional field `Authorization`
      if (jsonObj.get("Authorization") != null && !jsonObj.get("Authorization").isJsonNull()) {
        AuthorizationModel.validateJsonObject(jsonObj.getAsJsonObject("Authorization"));
      }
      // validate the optional field `Shopper`
      if (jsonObj.get("Shopper") != null && !jsonObj.get("Shopper").isJsonNull()) {
        ShopperData.validateJsonObject(jsonObj.getAsJsonObject("Shopper"));
      }
      // validate the optional field `BillingAddress`
      if (jsonObj.get("BillingAddress") != null && !jsonObj.get("BillingAddress").isJsonNull()) {
        AddressData.validateJsonObject(jsonObj.getAsJsonObject("BillingAddress"));
      }
      // validate the optional field `PaymentMethod`
      if (jsonObj.get("PaymentMethod") != null && !jsonObj.get("PaymentMethod").isJsonNull()) {
        PaymentMethodModel.validateJsonObject(jsonObj.getAsJsonObject("PaymentMethod"));
      }
      if (jsonObj.get("Installments") != null && !jsonObj.get("Installments").isJsonNull()) {
        JsonArray jsonArrayinstallments = jsonObj.getAsJsonArray("Installments");
        if (jsonArrayinstallments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Installments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Installments` to be an array in the JSON string but got `%s`", jsonObj.get("Installments").toString()));
          }

          // validate the optional field `Installments` (array)
          for (int i = 0; i < jsonArrayinstallments.size(); i++) {
            Installment.validateJsonObject(jsonArrayinstallments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("Refunds") != null && !jsonObj.get("Refunds").isJsonNull()) {
        JsonArray jsonArrayrefunds = jsonObj.getAsJsonArray("Refunds");
        if (jsonArrayrefunds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Refunds").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Refunds` to be an array in the JSON string but got `%s`", jsonObj.get("Refunds").toString()));
          }

          // validate the optional field `Refunds` (array)
          for (int i = 0; i < jsonArrayrefunds.size(); i++) {
            RefundModel.validateJsonObject(jsonArrayrefunds.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `Links`
      if (jsonObj.get("Links") != null && !jsonObj.get("Links").isJsonNull()) {
        LinksData.validateJsonObject(jsonObj.getAsJsonObject("Links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchInstallmentPlanResponseItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchInstallmentPlanResponseItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchInstallmentPlanResponseItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchInstallmentPlanResponseItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchInstallmentPlanResponseItem>() {
           @Override
           public void write(JsonWriter out, SearchInstallmentPlanResponseItem value) throws IOException {
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
           public SearchInstallmentPlanResponseItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchInstallmentPlanResponseItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchInstallmentPlanResponseItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchInstallmentPlanResponseItem
  * @throws IOException if the JSON string is invalid with respect to SearchInstallmentPlanResponseItem
  */
  public static SearchInstallmentPlanResponseItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchInstallmentPlanResponseItem.class);
  }

 /**
  * Convert an instance of SearchInstallmentPlanResponseItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

