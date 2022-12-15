# InstallmentPlanApi

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](InstallmentPlanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel |  |
| [**get**](InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} |  |
| [**post**](InstallmentPlanApi.md#post) | **POST** /api/installmentplans |  |
| [**refund**](InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund |  |
| [**search**](InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search |  |
| [**updateOrder**](InstallmentPlanApi.md#updateOrder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder |  |
| [**updateOrder2**](InstallmentPlanApi.md#updateOrder2) | **PUT** /api/installmentplans/updateorder |  |
| [**verifyAuthorization**](InstallmentPlanApi.md#verifyAuthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization |  |


<a name="cancel"></a>
# **cancel**
> InstallmentPlanCancelResponse cancel(installmentPlanNumber, xSplititIdempotencyKey)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    try {
      InstallmentPlanCancelResponse result = apiInstance.cancel(installmentPlanNumber, xSplititIdempotencyKey);
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

[bearer](../README.md#bearer)

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

<a name="get"></a>
# **get**
> InstallmentPlanModel get(installmentPlanNumber, xSplititIdempotencyKey)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    try {
      InstallmentPlanModel result = apiInstance.get(installmentPlanNumber, xSplititIdempotencyKey);
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

[**InstallmentPlanModel**](InstallmentPlanModel.md)

### Authorization

[bearer](../README.md#bearer)

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
> InstallmentPlanModel post(xSplititIdempotencyKey, installmentPlanCreateRequest, xSplititTestMode)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    InstallmentPlanCreateRequest installmentPlanCreateRequest = new InstallmentPlanCreateRequest(); // InstallmentPlanCreateRequest | 
    String xSplititTestMode = "None"; // String | 
    try {
      InstallmentPlanModel result = apiInstance.post(xSplititIdempotencyKey, installmentPlanCreateRequest, xSplititTestMode);
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
| **installmentPlanCreateRequest** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md)|  | |
| **xSplititTestMode** | **String**|  | [optional] [enum: None, Regular, Fast, Automation] |

### Return type

[**InstallmentPlanModel**](InstallmentPlanModel.md)

### Authorization

[bearer](../README.md#bearer)

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
> InstallmentPlanRefundResponse refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    InstallmentPlanRefundRequest installmentPlanRefundRequest = new InstallmentPlanRefundRequest(); // InstallmentPlanRefundRequest | 
    try {
      InstallmentPlanRefundResponse result = apiInstance.refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest);
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

[bearer](../README.md#bearer)

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
> InstallmentPlanGetResponse search(xSplititIdempotencyKey, installmentPlanNumber, refOrderNumber, extendedParams)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String refOrderNumber = "refOrderNumber_example"; // String | 
    Map<String, String> extendedParams = new HashMap(); // Map<String, String> | 
    try {
      InstallmentPlanGetResponse result = apiInstance.search(xSplititIdempotencyKey, installmentPlanNumber, refOrderNumber, extendedParams);
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

[**InstallmentPlanGetResponse**](InstallmentPlanGetResponse.md)

### Authorization

[bearer](../README.md#bearer)

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
> InstallmentPlanUpdateResponse updateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    UpdateOrderRequest updateOrderRequest = new UpdateOrderRequest(); // UpdateOrderRequest | 
    try {
      InstallmentPlanUpdateResponse result = apiInstance.updateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest);
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

[bearer](../README.md#bearer)

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
> InstallmentPlanUpdateResponse updateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = new InstallmentPlanUpdateRequestByIdentifier(); // InstallmentPlanUpdateRequestByIdentifier | 
    try {
      InstallmentPlanUpdateResponse result = apiInstance.updateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier);
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

[bearer](../README.md#bearer)

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
> VerifyAuthorizationResponse verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey)



### Example
```java
// Import classes:
import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.*;
import com.splitit.client.models.*;
import com.splitit.client.api.InstallmentPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://web-api-v3.sandbox.splitit.com");
    
    // Configure OAuth2 access token for authorization: bearer
    OAuth bearer = (OAuth) defaultClient.getAuthentication("bearer");
    bearer.setAccessToken("YOUR ACCESS TOKEN");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String xSplititIdempotencyKey = "xSplititIdempotencyKey_example"; // String | 
    try {
      VerifyAuthorizationResponse result = apiInstance.verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey);
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

[bearer](../README.md#bearer)

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

