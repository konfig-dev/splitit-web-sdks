# InstallmentPlanApi

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](InstallmentPlanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel |  |
| [**checkEligibility**](InstallmentPlanApi.md#checkEligibility) | **POST** /api/installmentplans/check-eligibility |  |
| [**get**](InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} |  |
| [**post**](InstallmentPlanApi.md#post) | **POST** /api/installmentplans/initiate |  |
| [**post2**](InstallmentPlanApi.md#post2) | **POST** /api/installmentplans |  |
| [**refund**](InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund |  |
| [**search**](InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search |  |
| [**updateOrder**](InstallmentPlanApi.md#updateOrder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder |  |
| [**updateOrder2**](InstallmentPlanApi.md#updateOrder2) | **PUT** /api/installmentplans/updateorder |  |
| [**verifyAuthorization**](InstallmentPlanApi.md#verifyAuthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization |  |


<a name="cancel"></a>
# **cancel**
> InstallmentPlanCancelResponse cancel(installmentPlanNumber, xSplititIdempotencyKey).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    try {
      InstallmentPlanCancelResponse result = api
              .cancel(installmentPlanNumber, xSplititIdempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#cancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentPlanCancelResponse> response = api
              .cancel(installmentPlanNumber, xSplititIdempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#cancel");
      System.err.println("Status code: " + e.getCode());
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

### Return type

[**InstallmentPlanCancelResponse**](InstallmentPlanCancelResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="checkEligibility"></a>
# **checkEligibility**
> InstallmentsEligibilityResponse checkEligibility(xSplititIdempotencyKey, checkInstallmentsEligibilityRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    PlanData planData = new PlanData();
    CardData cardDetails = new CardData();
    AddressData billingAddress = new AddressData();
    try {
      InstallmentsEligibilityResponse result = api
              .checkEligibility(xSplititIdempotencyKey)
              .planData(planData)
              .cardDetails(cardDetails)
              .billingAddress(billingAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#checkEligibility");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentsEligibilityResponse> response = api
              .checkEligibility(xSplititIdempotencyKey)
              .planData(planData)
              .cardDetails(cardDetails)
              .billingAddress(billingAddress)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#checkEligibility");
      System.err.println("Status code: " + e.getCode());
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
| **checkInstallmentsEligibilityRequest** | [**CheckInstallmentsEligibilityRequest**](CheckInstallmentsEligibilityRequest.md)|  | |

### Return type

[**InstallmentsEligibilityResponse**](InstallmentsEligibilityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="get"></a>
# **get**
> InstallmentPlanGetResponse get(installmentPlanNumber, xSplititIdempotencyKey).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    try {
      InstallmentPlanGetResponse result = api
              .get(installmentPlanNumber, xSplititIdempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#get");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentPlanGetResponse> response = api
              .get(installmentPlanNumber, xSplititIdempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#get");
      System.err.println("Status code: " + e.getCode());
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

### Return type

[**InstallmentPlanGetResponse**](InstallmentPlanGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="post"></a>
# **post**
> InitiatePlanResponse post(xSplititIdempotencyKey, installmentPlanInitiateRequest).xSplititTestMode(xSplititTestMode).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    Boolean autoCapture = true;
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    Boolean attempt3dSecure = true;
    ShopperData shopper = new ShopperData();
    PlanDataModel planData = new PlanDataModel();
    AddressDataModel billingAddress = new AddressDataModel();
    InitiateRedirectionEndpointsModel redirectUrls = new InitiateRedirectionEndpointsModel();
    UxSettingsModel uxSettings = new UxSettingsModel();
    String xSplititTestMode = "None";
    try {
      InitiatePlanResponse result = api
              .post(autoCapture, xSplititIdempotencyKey)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .redirectUrls(redirectUrls)
              .uxSettings(uxSettings)
              .xSplititTestMode(xSplititTestMode)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InitiatePlanResponse> response = api
              .post(autoCapture, xSplititIdempotencyKey)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .redirectUrls(redirectUrls)
              .uxSettings(uxSettings)
              .xSplititTestMode(xSplititTestMode)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post");
      System.err.println("Status code: " + e.getCode());
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
| **installmentPlanInitiateRequest** | [**InstallmentPlanInitiateRequest**](InstallmentPlanInitiateRequest.md)|  | |
| **xSplititTestMode** | **String**|  | [optional] [enum: None, Regular, Fast, Automation] |

### Return type

[**InitiatePlanResponse**](InitiatePlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="post2"></a>
# **post2**
> InstallmentPlanCreateResponse post2(xSplititIdempotencyKey, installmentPlanCreateRequest).xSplititTestMode(xSplititTestMode).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    Boolean autoCapture = true;
    Boolean termsAndConditionsAccepted = true;
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    Boolean attempt3dSecure = true;
    ShopperData shopper = new ShopperData();
    PlanDataModel planData = new PlanDataModel();
    AddressDataModel billingAddress = new AddressDataModel();
    PaymentMethodModel paymentMethod = new PaymentMethodModel();
    RedirectionEndpointsModel redirectUrls = new RedirectionEndpointsModel();
    String xSplititTestMode = "None";
    try {
      InstallmentPlanCreateResponse result = api
              .post2(autoCapture, termsAndConditionsAccepted, xSplititIdempotencyKey)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .paymentMethod(paymentMethod)
              .redirectUrls(redirectUrls)
              .xSplititTestMode(xSplititTestMode)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentPlanCreateResponse> response = api
              .post2(autoCapture, termsAndConditionsAccepted, xSplititIdempotencyKey)
              .attempt3dSecure(attempt3dSecure)
              .shopper(shopper)
              .planData(planData)
              .billingAddress(billingAddress)
              .paymentMethod(paymentMethod)
              .redirectUrls(redirectUrls)
              .xSplititTestMode(xSplititTestMode)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#post2");
      System.err.println("Status code: " + e.getCode());
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
| **installmentPlanCreateRequest** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md)|  | |
| **xSplititTestMode** | **String**|  | [optional] [enum: None, Regular, Fast, Automation] |

### Return type

[**InstallmentPlanCreateResponse**](InstallmentPlanCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="refund"></a>
# **refund**
> InstallmentPlanRefundResponse refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    Double amount = 3.4D;
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    RefundStrategy refundStrategy = RefundStrategy.fromValue("FutureInstallmentsFirst");
    try {
      InstallmentPlanRefundResponse result = api
              .refund(amount, installmentPlanNumber, xSplititIdempotencyKey)
              .refundStrategy(refundStrategy)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#refund");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentPlanRefundResponse> response = api
              .refund(amount, installmentPlanNumber, xSplititIdempotencyKey)
              .refundStrategy(refundStrategy)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#refund");
      System.err.println("Status code: " + e.getCode());
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
| **installmentPlanRefundRequest** | [**InstallmentPlanRefundRequest**](InstallmentPlanRefundRequest.md)|  | |

### Return type

[**InstallmentPlanRefundResponse**](InstallmentPlanRefundResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="search"></a>
# **search**
> InstallmentPlanSearchResponse search(xSplititIdempotencyKey).installmentPlanNumber(installmentPlanNumber).refOrderNumber(refOrderNumber).extendedParams(extendedParams).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String installmentPlanNumber = "installmentPlanNumber_example";
    String refOrderNumber = "refOrderNumber_example";
    Map<String, String> extendedParams = new HashMap();
    try {
      InstallmentPlanSearchResponse result = api
              .search(xSplititIdempotencyKey)
              .installmentPlanNumber(installmentPlanNumber)
              .refOrderNumber(refOrderNumber)
              .extendedParams(extendedParams)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#search");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentPlanSearchResponse> response = api
              .search(xSplititIdempotencyKey)
              .installmentPlanNumber(installmentPlanNumber)
              .refOrderNumber(refOrderNumber)
              .extendedParams(extendedParams)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#search");
      System.err.println("Status code: " + e.getCode());
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
| **installmentPlanNumber** | **String**|  | [optional] |
| **refOrderNumber** | **String**|  | [optional] |
| **extendedParams** | [**Map&lt;String, String&gt;**](String.md)|  | [optional] |

### Return type

[**InstallmentPlanSearchResponse**](InstallmentPlanSearchResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOrder"></a>
# **updateOrder**
> InstallmentPlanUpdateResponse updateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String trackingNumber = "trackingNumber_example";
    String refOrderNumber = "refOrderNumber_example";
    ShippingStatus shippingStatus = ShippingStatus.fromValue("Pending");
    Boolean capture = true;
    try {
      InstallmentPlanUpdateResponse result = api
              .updateOrder(installmentPlanNumber, xSplititIdempotencyKey)
              .trackingNumber(trackingNumber)
              .refOrderNumber(refOrderNumber)
              .shippingStatus(shippingStatus)
              .capture(capture)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentPlanUpdateResponse> response = api
              .updateOrder(installmentPlanNumber, xSplititIdempotencyKey)
              .trackingNumber(trackingNumber)
              .refOrderNumber(refOrderNumber)
              .shippingStatus(shippingStatus)
              .capture(capture)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder");
      System.err.println("Status code: " + e.getCode());
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
| **updateOrderRequest** | [**UpdateOrderRequest**](UpdateOrderRequest.md)|  | |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateOrder2"></a>
# **updateOrder2**
> InstallmentPlanUpdateResponse updateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    String refOrderNumber = "refOrderNumber_example";
    String trackingNumber = "trackingNumber_example";
    Boolean capture = true;
    ShippingStatus2 shippingStatus = ShippingStatus2.fromValue("Shipped");
    IdentifierContract identifier = new IdentifierContract();
    try {
      InstallmentPlanUpdateResponse result = api
              .updateOrder2(xSplititIdempotencyKey)
              .refOrderNumber(refOrderNumber)
              .trackingNumber(trackingNumber)
              .capture(capture)
              .shippingStatus(shippingStatus)
              .identifier(identifier)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstallmentPlanUpdateResponse> response = api
              .updateOrder2(xSplititIdempotencyKey)
              .refOrderNumber(refOrderNumber)
              .trackingNumber(trackingNumber)
              .capture(capture)
              .shippingStatus(shippingStatus)
              .identifier(identifier)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#updateOrder2");
      System.err.println("Status code: " + e.getCode());
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
| **installmentPlanUpdateRequestByIdentifier** | [**InstallmentPlanUpdateRequestByIdentifier**](InstallmentPlanUpdateRequestByIdentifier.md)|  | |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="verifyAuthorization"></a>
# **verifyAuthorization**
> VerifyAuthorizationResponse verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiResponse;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.auth.*;
import com.konfigthis.splitit.client.model.*;
import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String secretId = System.getenv("CLIENT_SECRET");
    ApiClient apiClient = new ApiClient(clientId, secretId, null);

    // Set custom base path if desired
    // apiClient.setBasePath("https://web-api-v3.sandbox.splitit.com");    

    InstallmentPlanApi api = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example";
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
    try {
      VerifyAuthorizationResponse result = api
              .verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#verifyAuthorization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<VerifyAuthorizationResponse> response = api
              .verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstallmentPlanApi#verifyAuthorization");
      System.err.println("Status code: " + e.getCode());
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

### Return type

[**VerifyAuthorizationResponse**](VerifyAuthorizationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

