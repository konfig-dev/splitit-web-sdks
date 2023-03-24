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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    try {
      InstallmentPlanCancelResponse result = apiInstance.cancel(installmentPlanNumber, xSplititIdempotencyKey)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="checkEligibility"></a>
# **checkEligibility**
> InstallmentsEligibilityResponse checkEligibility(xSplititIdempotencyKey, checkInstallmentsEligibilityRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    CheckInstallmentsEligibilityRequest checkInstallmentsEligibilityRequest = new CheckInstallmentsEligibilityRequest(); // CheckInstallmentsEligibilityRequest | 
    try {
      InstallmentsEligibilityResponse result = apiInstance.checkEligibility(xSplititIdempotencyKey, checkInstallmentsEligibilityRequest)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="get"></a>
# **get**
> InstallmentPlanGetResponse get(installmentPlanNumber, xSplititIdempotencyKey).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    try {
      InstallmentPlanGetResponse result = apiInstance.get(installmentPlanNumber, xSplititIdempotencyKey)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="post"></a>
# **post**
> InitiatePlanResponse post(xSplititIdempotencyKey, installmentPlanInitiateRequest).xSplititTestMode(xSplititTestMode).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    InstallmentPlanInitiateRequest installmentPlanInitiateRequest = new InstallmentPlanInitiateRequest(); // InstallmentPlanInitiateRequest | 
    String xSplititTestMode = "None"; // String | 
    try {
      InitiatePlanResponse result = apiInstance.post(xSplititIdempotencyKey, installmentPlanInitiateRequest)
            .xSplititTestMode(xSplititTestMode)
            .execute();
      System.out.println(result);
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
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="post2"></a>
# **post2**
> InstallmentPlanCreateResponse post2(xSplititIdempotencyKey, installmentPlanCreateRequest).xSplititTestMode(xSplititTestMode).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    InstallmentPlanCreateRequest installmentPlanCreateRequest = new InstallmentPlanCreateRequest(); // InstallmentPlanCreateRequest | 
    String xSplititTestMode = "None"; // String | 
    try {
      InstallmentPlanCreateResponse result = apiInstance.post2(xSplititIdempotencyKey, installmentPlanCreateRequest)
            .xSplititTestMode(xSplititTestMode)
            .execute();
      System.out.println(result);
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
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="refund"></a>
# **refund**
> InstallmentPlanRefundResponse refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    InstallmentPlanRefundRequest installmentPlanRefundRequest = new InstallmentPlanRefundRequest(); // InstallmentPlanRefundRequest | 
    try {
      InstallmentPlanRefundResponse result = apiInstance.refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="search"></a>
# **search**
> InstallmentPlanSearchResponse search(xSplititIdempotencyKey).installmentPlanNumber(installmentPlanNumber).refOrderNumber(refOrderNumber).extendedParams(extendedParams).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String refOrderNumber = "refOrderNumber_example"; // String | 
    Map<String, String> extendedParams = new HashMap(); // Map<String, String> | 
    try {
      InstallmentPlanSearchResponse result = apiInstance.search(xSplititIdempotencyKey)
            .installmentPlanNumber(installmentPlanNumber)
            .refOrderNumber(refOrderNumber)
            .extendedParams(extendedParams)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="updateOrder"></a>
# **updateOrder**
> InstallmentPlanUpdateResponse updateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    UpdateOrderRequest updateOrderRequest = new UpdateOrderRequest(); // UpdateOrderRequest | 
    try {
      InstallmentPlanUpdateResponse result = apiInstance.updateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="updateOrder2"></a>
# **updateOrder2**
> InstallmentPlanUpdateResponse updateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = new InstallmentPlanUpdateRequestByIdentifier(); // InstallmentPlanUpdateRequestByIdentifier | 
    try {
      InstallmentPlanUpdateResponse result = apiInstance.updateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="verifyAuthorization"></a>
# **verifyAuthorization**
> VerifyAuthorizationResponse verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey).execute();



### Example
```java
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
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

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(apiClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    try {
      VerifyAuthorizationResponse result = apiInstance.verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey)
            .execute();
      System.out.println(result);
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
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

