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
> InstallmentPlanCancelResponse cancel(installmentPlanNumber)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    try {
      InstallmentPlanCancelResponse result = apiInstance.cancel(installmentPlanNumber);
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

### Return type

[**InstallmentPlanCancelResponse**](InstallmentPlanCancelResponse.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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
> InstallmentPlanModel get(installmentPlanNumber)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    try {
      InstallmentPlanModel result = apiInstance.get(installmentPlanNumber);
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

### Return type

[**InstallmentPlanModel**](InstallmentPlanModel.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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
> InstallmentPlanModel post(installmentPlanCreateRequest, xSplititTestMode)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    InstallmentPlanCreateRequest installmentPlanCreateRequest = new InstallmentPlanCreateRequest(); // InstallmentPlanCreateRequest | 
    String xSplititTestMode = "None"; // String | 
    try {
      InstallmentPlanModel result = apiInstance.post(installmentPlanCreateRequest, xSplititTestMode);
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
| **installmentPlanCreateRequest** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md)|  | |
| **xSplititTestMode** | **String**|  | [optional] [enum: None, Regular, Fast, Automation] |

### Return type

[**InstallmentPlanModel**](InstallmentPlanModel.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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
> InstallmentPlanRefundResponse refund(installmentPlanNumber, installmentPlanRefundRequest)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    InstallmentPlanRefundRequest installmentPlanRefundRequest = new InstallmentPlanRefundRequest(); // InstallmentPlanRefundRequest | 
    try {
      InstallmentPlanRefundResponse result = apiInstance.refund(installmentPlanNumber, installmentPlanRefundRequest);
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
| **installmentPlanRefundRequest** | [**InstallmentPlanRefundRequest**](InstallmentPlanRefundRequest.md)|  | |

### Return type

[**InstallmentPlanRefundResponse**](InstallmentPlanRefundResponse.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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
> InstallmentPlanGetResponse search(installmentPlanNumber, refOrderNumber, extendedParams)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    String refOrderNumber = "refOrderNumber_example"; // String | 
    String extendedParams = "extendedParams_example"; // String | 
    try {
      InstallmentPlanGetResponse result = apiInstance.search(installmentPlanNumber, refOrderNumber, extendedParams);
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
| **installmentPlanNumber** | **String**|  | [optional] |
| **refOrderNumber** | **String**|  | [optional] |
| **extendedParams** | **String**|  | [optional] |

### Return type

[**InstallmentPlanGetResponse**](InstallmentPlanGetResponse.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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
> InstallmentPlanUpdateResponse updateOrder(installmentPlanNumber, updateOrderRequest)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    UpdateOrderRequest updateOrderRequest = new UpdateOrderRequest(); // UpdateOrderRequest | 
    try {
      InstallmentPlanUpdateResponse result = apiInstance.updateOrder(installmentPlanNumber, updateOrderRequest);
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
| **updateOrderRequest** | [**UpdateOrderRequest**](UpdateOrderRequest.md)|  | |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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
> InstallmentPlanUpdateResponse updateOrder2(installmentPlanUpdateRequestByIdentifier)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = new InstallmentPlanUpdateRequestByIdentifier(); // InstallmentPlanUpdateRequestByIdentifier | 
    try {
      InstallmentPlanUpdateResponse result = apiInstance.updateOrder2(installmentPlanUpdateRequestByIdentifier);
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
| **installmentPlanUpdateRequestByIdentifier** | [**InstallmentPlanUpdateRequestByIdentifier**](InstallmentPlanUpdateRequestByIdentifier.md)|  | |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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
> VerifyAuthorizationResponse verifyAuthorization(installmentPlanNumber)



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
    
    // Configure API key authorization: idempotencyKey
    ApiKeyAuth idempotencyKey = (ApiKeyAuth) defaultClient.getAuthentication("idempotencyKey");
    idempotencyKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //idempotencyKey.setApiKeyPrefix("Token");

    // Configure API key authorization: oauthKey
    ApiKeyAuth oauthKey = (ApiKeyAuth) defaultClient.getAuthentication("oauthKey");
    oauthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //oauthKey.setApiKeyPrefix("Token");

    InstallmentPlanApi apiInstance = new InstallmentPlanApi(defaultClient);
    String installmentPlanNumber = "installmentPlanNumber_example"; // String | 
    try {
      VerifyAuthorizationResponse result = apiInstance.verifyAuthorization(installmentPlanNumber);
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

### Return type

[**VerifyAuthorizationResponse**](VerifyAuthorizationResponse.md)

### Authorization

[idempotencyKey](../README.md#idempotencyKey), [oauthKey](../README.md#oauthKey)

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

