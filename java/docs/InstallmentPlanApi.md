# InstallmentPlanApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkEligibility**](InstallmentPlanApi.md#checkEligibility) | **POST** /api/installmentplans/check-eligibility |  |
| [**get**](InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} |  |
| [**getEligibilityTermsAndCondition**](InstallmentPlanApi.md#getEligibilityTermsAndCondition) | **GET** /api/installmentplans/{ipn}/legal |  |
| [**post**](InstallmentPlanApi.md#post) | **POST** /api/installmentplans/initiate |  |
| [**post2**](InstallmentPlanApi.md#post2) | **POST** /api/installmentplans |  |
| [**refund**](InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund |  |
| [**search**](InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search |  |
| [**updateOrder**](InstallmentPlanApi.md#updateOrder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder |  |
| [**updateOrder2**](InstallmentPlanApi.md#updateOrder2) | **PUT** /api/installmentplans/updateorder |  |
| [**verifyAuthorization**](InstallmentPlanApi.md#verifyAuthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization |  |


<a name="checkEligibility"></a>
# **checkEligibility**
> InstallmentsEligibilityResponse checkEligibility(xSplititIdempotencyKey, xSplititTouchPoint, checkInstallmentsEligibilityRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    PlanData planData = new PlanData();
    CardData cardDetails = new CardData();
    AddressData billingAddress = new AddressData();
    String shopperIdentifier = "shopperIdentifier_example";
    try {
      InstallmentsEligibilityResponse result = client
              .installmentPlan
              .checkEligibility(xSplititIdempotencyKey, xSplititTouchPoint)
              .planData(planData)
              .cardDetails(cardDetails)
              .billingAddress(billingAddress)
              .shopperIdentifier(shopperIdentifier)
              .execute();
      System.out.println(result);
      System.out.println(result.getInstallmentProvider());
      System.out.println(result.getPaymentPlanOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#checkEligibility");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstallmentsEligibilityResponse> response = client
              .installmentPlan
              .checkEligibility(xSplititIdempotencyKey, xSplititTouchPoint)
              .planData(planData)
              .cardDetails(cardDetails)
              .billingAddress(billingAddress)
              .shopperIdentifier(shopperIdentifier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#checkEligibility");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |
| **checkInstallmentsEligibilityRequest** | [**CheckInstallmentsEligibilityRequest**](CheckInstallmentsEligibilityRequest.md)|  | |

### Return type

[**InstallmentsEligibilityResponse**](InstallmentsEligibilityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="get"></a>
# **get**
> InstallmentPlanGetResponse get(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    try {
      InstallmentPlanGetResponse result = client
              .installmentPlan
              .get(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .execute();
      System.out.println(result);
      System.out.println(result.getInstallmentPlanNumber());
      System.out.println(result.getDateCreated());
      System.out.println(result.getRefOrderNumber());
      System.out.println(result.getPurchaseMethod());
      System.out.println(result.getStatus());
      System.out.println(result.getCurrency());
      System.out.println(result.getOriginalAmount());
      System.out.println(result.getAmount());
      System.out.println(result.getAuthorization());
      System.out.println(result.getShopper());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getExtendedParams());
      System.out.println(result.getInstallments());
      System.out.println(result.getRefunds());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstallmentPlanGetResponse> response = client
              .installmentPlan
              .get(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **installmentPlanNumber** | **String**|  | |
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |

### Return type

[**InstallmentPlanGetResponse**](InstallmentPlanGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getEligibilityTermsAndCondition"></a>
# **getEligibilityTermsAndCondition**
> EligibilityTermsAndConditionResponse getEligibilityTermsAndCondition(ipn, xSplititIdempotencyKey, xSplititTouchPoint).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String ipn = "ipn_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    try {
      EligibilityTermsAndConditionResponse result = client
              .installmentPlan
              .getEligibilityTermsAndCondition(ipn, xSplititIdempotencyKey, xSplititTouchPoint)
              .execute();
      System.out.println(result);
      System.out.println(result.getTermsAndConditions());
      System.out.println(result.getPrivacyPolicy());
      System.out.println(result.getProvider());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#getEligibilityTermsAndCondition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EligibilityTermsAndConditionResponse> response = client
              .installmentPlan
              .getEligibilityTermsAndCondition(ipn, xSplititIdempotencyKey, xSplititTouchPoint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#getEligibilityTermsAndCondition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ipn** | **String**|  | |
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |

### Return type

[**EligibilityTermsAndConditionResponse**](EligibilityTermsAndConditionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="post"></a>
# **post**
> InitiatePlanResponse post(xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanInitiateRequest).xSplititTestMode(xSplititTestMode).xSplititStrategy(xSplititStrategy).splititclientinfo(splititclientinfo).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    Boolean autoCapture = true;
    Boolean attempt3dSecure = true;
    ShopperData shopper = new ShopperData();
    PlanDataModel planData = new PlanDataModel();
    AddressDataModel billingAddress = new AddressDataModel();
    InitiateRedirectionEndpointsModel redirectUrls = new InitiateRedirectionEndpointsModel();
    UxSettingsModel uxSettings = new UxSettingsModel();
    EventsEndpointsModel eventsEndpoints = new EventsEndpointsModel();
    ProcessingData processingData = new ProcessingData();
    String xSplititTestMode = "None";
    String xSplititStrategy = "SecuredPlan";
    String splititclientinfo = "splititclientinfo_example";
    try {
      InitiatePlanResponse result = client
              .installmentPlan
              .post(xSplititIdempotencyKey, xSplititTouchPoint)
              .autoCapture(autoCapture)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .redirectUrls(redirectUrls)
              .uxSettings(uxSettings)
              .eventsEndpoints(eventsEndpoints)
              .processingData(processingData)
              .xSplititTestMode(xSplititTestMode)
              .xSplititStrategy(xSplititStrategy)
              .splititclientinfo(splititclientinfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getInstallmentPlanNumber());
      System.out.println(result.getRefOrderNumber());
      System.out.println(result.getPurchaseMethod());
      System.out.println(result.getStatus());
      System.out.println(result.getCurrency());
      System.out.println(result.getAmount());
      System.out.println(result.getExtendedParams());
      System.out.println(result.getShopper());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getCheckoutUrl());
      System.out.println(result.getPrincipalAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InitiatePlanResponse> response = client
              .installmentPlan
              .post(xSplititIdempotencyKey, xSplititTouchPoint)
              .autoCapture(autoCapture)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .redirectUrls(redirectUrls)
              .uxSettings(uxSettings)
              .eventsEndpoints(eventsEndpoints)
              .processingData(processingData)
              .xSplititTestMode(xSplititTestMode)
              .xSplititStrategy(xSplititStrategy)
              .splititclientinfo(splititclientinfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |
| **installmentPlanInitiateRequest** | [**InstallmentPlanInitiateRequest**](InstallmentPlanInitiateRequest.md)|  | |
| **xSplititTestMode** | **String**|  | [optional] [enum: None, Regular, Fast, Automation] |
| **xSplititStrategy** | **String**|  | [optional] [enum: SecuredPlan, NonSecuredPlan, SecuredPlanCaptureExistingSecurityAuth, SecuredPlan3, SinglePayment, ExternalInstallmentProvider, SecuredPlan3A, SecuredPlan3B, SecuredPlan2A, SecuredPlan2, SecuredPlan4, SecuredPlan4A] |
| **splititclientinfo** | **String**|  | [optional] |

### Return type

[**InitiatePlanResponse**](InitiatePlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="post2"></a>
# **post2**
> InstallmentPlanCreateResponse post2(xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanCreateRequest).xSplititTestMode(xSplititTestMode).xSplititStrategy(xSplititStrategy).splititclientinfo(splititclientinfo).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    Boolean autoCapture = true;
    Boolean termsAndConditionsAccepted = true;
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    Boolean attempt3dSecure = true;
    ShopperData shopper = new ShopperData();
    PlanDataModel planData = new PlanDataModel();
    AddressDataModel billingAddress = new AddressDataModel();
    PaymentMethodModel paymentMethod = new PaymentMethodModel();
    RedirectionEndpointsModel redirectUrls = new RedirectionEndpointsModel();
    ProcessingData processingData = new ProcessingData();
    EventsEndpointsModel eventsEndpoints = new EventsEndpointsModel();
    String xSplititTestMode = "None";
    String xSplititStrategy = "SecuredPlan";
    String splititclientinfo = "splititclientinfo_example";
    try {
      InstallmentPlanCreateResponse result = client
              .installmentPlan
              .post2(autoCapture, termsAndConditionsAccepted, xSplititIdempotencyKey, xSplititTouchPoint)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .paymentMethod(paymentMethod)
              .redirectUrls(redirectUrls)
              .processingData(processingData)
              .eventsEndpoints(eventsEndpoints)
              .xSplititTestMode(xSplititTestMode)
              .xSplititStrategy(xSplititStrategy)
              .splititclientinfo(splititclientinfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getInstallmentPlanNumber());
      System.out.println(result.getDateCreated());
      System.out.println(result.getRefOrderNumber());
      System.out.println(result.getPurchaseMethod());
      System.out.println(result.getStatus());
      System.out.println(result.getCurrency());
      System.out.println(result.getOriginalAmount());
      System.out.println(result.getAmount());
      System.out.println(result.getExtendedParams());
      System.out.println(result.getAuthorization());
      System.out.println(result.getShopper());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getInstallments());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstallmentPlanCreateResponse> response = client
              .installmentPlan
              .post2(autoCapture, termsAndConditionsAccepted, xSplititIdempotencyKey, xSplititTouchPoint)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .paymentMethod(paymentMethod)
              .redirectUrls(redirectUrls)
              .processingData(processingData)
              .eventsEndpoints(eventsEndpoints)
              .xSplititTestMode(xSplititTestMode)
              .xSplititStrategy(xSplititStrategy)
              .splititclientinfo(splititclientinfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |
| **installmentPlanCreateRequest** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md)|  | |
| **xSplititTestMode** | **String**|  | [optional] [enum: None, Regular, Fast, Automation] |
| **xSplititStrategy** | **String**|  | [optional] [enum: SecuredPlan, NonSecuredPlan, SecuredPlanCaptureExistingSecurityAuth, SecuredPlan3, SinglePayment, ExternalInstallmentProvider, SecuredPlan3A, SecuredPlan3B, SecuredPlan2A, SecuredPlan2, SecuredPlan4, SecuredPlan4A] |
| **splititclientinfo** | **String**|  | [optional] |

### Return type

[**InstallmentPlanCreateResponse**](InstallmentPlanCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="refund"></a>
# **refund**
> InstallmentPlanRefundResponse refund(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanRefundRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    Double amount = 3.4D;
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    RefundStrategy refundStrategy = RefundStrategy.fromValue("FutureInstallmentsFirst");
    String referenceId = "referenceId_example";
    try {
      InstallmentPlanRefundResponse result = client
              .installmentPlan
              .refund(amount, installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .refundStrategy(refundStrategy)
              .referenceId(referenceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRefundId());
      System.out.println(result.getInstallmentPlanNumber());
      System.out.println(result.getCurrency());
      System.out.println(result.getNonCreditRefundAmount());
      System.out.println(result.getCreditRefundAmount());
      System.out.println(result.getSummary());
      System.out.println(result.getReferenceId());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#refund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstallmentPlanRefundResponse> response = client
              .installmentPlan
              .refund(amount, installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .refundStrategy(refundStrategy)
              .referenceId(referenceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#refund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **installmentPlanNumber** | **String**|  | |
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |
| **installmentPlanRefundRequest** | [**InstallmentPlanRefundRequest**](InstallmentPlanRefundRequest.md)|  | |

### Return type

[**InstallmentPlanRefundResponse**](InstallmentPlanRefundResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="search"></a>
# **search**
> InstallmentPlanSearchResponse search(xSplititIdempotencyKey, xSplititTouchPoint).installmentPlanNumber(installmentPlanNumber).refOrderNumber(refOrderNumber).extendedParams(extendedParams).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    String installmentPlanNumber = "installmentPlanNumber_example";
    String refOrderNumber = "refOrderNumber_example";
    Map<String, String> extendedParams = new HashMap();
    try {
      InstallmentPlanSearchResponse result = client
              .installmentPlan
              .search(xSplititIdempotencyKey, xSplititTouchPoint)
              .installmentPlanNumber(installmentPlanNumber)
              .refOrderNumber(refOrderNumber)
              .extendedParams(extendedParams)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlanList());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#search");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstallmentPlanSearchResponse> response = client
              .installmentPlan
              .search(xSplititIdempotencyKey, xSplititTouchPoint)
              .installmentPlanNumber(installmentPlanNumber)
              .refOrderNumber(refOrderNumber)
              .extendedParams(extendedParams)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#search");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |
| **installmentPlanNumber** | **String**|  | [optional] |
| **refOrderNumber** | **String**|  | [optional] |
| **extendedParams** | [**Map&lt;String, String&gt;**](String.md)|  | [optional] |

### Return type

[**InstallmentPlanSearchResponse**](InstallmentPlanSearchResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOrder"></a>
# **updateOrder**
> InstallmentPlanUpdateResponse updateOrder(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanUpdateRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    String refOrderNumber = "refOrderNumber_example";
    String trackingNumber = "trackingNumber_example";
    Boolean capture = true;
    ShippingStatus shippingStatus = ShippingStatus.fromValue("Pending");
    Double newAmount = 3.4D;
    try {
      InstallmentPlanUpdateResponse result = client
              .installmentPlan
              .updateOrder(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .refOrderNumber(refOrderNumber)
              .trackingNumber(trackingNumber)
              .capture(capture)
              .shippingStatus(shippingStatus)
              .newAmount(newAmount)
              .execute();
      System.out.println(result);
      System.out.println(result.getRefOrderNumber());
      System.out.println(result.getInstallmentPlanNumber());
      System.out.println(result.getStatus());
      System.out.println(result.getShippingStatus());
      System.out.println(result.getNewAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstallmentPlanUpdateResponse> response = client
              .installmentPlan
              .updateOrder(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .refOrderNumber(refOrderNumber)
              .trackingNumber(trackingNumber)
              .capture(capture)
              .shippingStatus(shippingStatus)
              .newAmount(newAmount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **installmentPlanNumber** | **String**|  | |
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |
| **installmentPlanUpdateRequest** | [**InstallmentPlanUpdateRequest**](InstallmentPlanUpdateRequest.md)|  | |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOrder2"></a>
# **updateOrder2**
> InstallmentPlanUpdateResponse updateOrder2(xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanUpdateRequestByIdentifier).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    String refOrderNumber = "refOrderNumber_example";
    String trackingNumber = "trackingNumber_example";
    Boolean capture = true;
    ShippingStatus shippingStatus = ShippingStatus.fromValue("Pending");
    Double newAmount = 3.4D;
    IdentifierContract identifier = new IdentifierContract();
    try {
      InstallmentPlanUpdateResponse result = client
              .installmentPlan
              .updateOrder2(xSplititIdempotencyKey, xSplititTouchPoint)
              .refOrderNumber(refOrderNumber)
              .trackingNumber(trackingNumber)
              .capture(capture)
              .shippingStatus(shippingStatus)
              .newAmount(newAmount)
              .identifier(identifier)
              .execute();
      System.out.println(result);
      System.out.println(result.getRefOrderNumber());
      System.out.println(result.getInstallmentPlanNumber());
      System.out.println(result.getStatus());
      System.out.println(result.getShippingStatus());
      System.out.println(result.getNewAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstallmentPlanUpdateResponse> response = client
              .installmentPlan
              .updateOrder2(xSplititIdempotencyKey, xSplititTouchPoint)
              .refOrderNumber(refOrderNumber)
              .trackingNumber(trackingNumber)
              .capture(capture)
              .shippingStatus(shippingStatus)
              .newAmount(newAmount)
              .identifier(identifier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |
| **installmentPlanUpdateRequestByIdentifier** | [**InstallmentPlanUpdateRequestByIdentifier**](InstallmentPlanUpdateRequestByIdentifier.md)|  | |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/*+json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="verifyAuthorization"></a>
# **verifyAuthorization**
> VerifyAuthorizationResponse verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Splitit;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://web-api-v3.production.splitit.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Splitit client = new Splitit(configuration);
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String xSplititTouchPoint = ""; // TouchPoint
    try {
      VerifyAuthorizationResponse result = client
              .installmentPlan
              .verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsAuthorized());
      System.out.println(result.getAuthorizationAmount());
      System.out.println(result.getAuthorization());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#verifyAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VerifyAuthorizationResponse> response = client
              .installmentPlan
              .verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#verifyAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **installmentPlanNumber** | **String**|  | |
| **xSplititIdempotencyKey** | **String**|  | |
| **xSplititTouchPoint** | **String**| TouchPoint | [default to ] |

### Return type

[**VerifyAuthorizationResponse**](VerifyAuthorizationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

