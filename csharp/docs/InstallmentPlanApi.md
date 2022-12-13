# Splitit.Net.Api.InstallmentPlanApi

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Cancel**](InstallmentPlanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel | 
[**Get**](InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} | 
[**Post**](InstallmentPlanApi.md#post) | **POST** /api/installmentplans | 
[**Refund**](InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund | 
[**Search**](InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search | 
[**UpdateOrder**](InstallmentPlanApi.md#updateorder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder | 
[**UpdateOrder2**](InstallmentPlanApi.md#updateorder2) | **PUT** /api/installmentplans/updateorder | 
[**VerifyAuthorization**](InstallmentPlanApi.md#verifyauthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 



## Cancel

> InstallmentPlanCancelResponse Cancel (string installmentPlanNumber)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class CancelExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 

            try
            {
                InstallmentPlanCancelResponse result = apiInstance.Cancel(installmentPlanNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.Cancel: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | **string**|  | 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Get

> InstallmentPlanModel Get (string installmentPlanNumber)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class GetExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 

            try
            {
                InstallmentPlanModel result = apiInstance.Get(installmentPlanNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.Get: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | **string**|  | 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Post

> InstallmentPlanModel Post (InstallmentPlanCreateRequest installmentPlanCreateRequest, string xSplititTestMode = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class PostExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanCreateRequest = new InstallmentPlanCreateRequest(); // InstallmentPlanCreateRequest | 
            var xSplititTestMode = "None";  // string |  (optional) 

            try
            {
                InstallmentPlanModel result = apiInstance.Post(installmentPlanCreateRequest, xSplititTestMode);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.Post: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanCreateRequest** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md)|  | 
 **xSplititTestMode** | **string**|  | [optional] 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Refund

> InstallmentPlanRefundResponse Refund (string installmentPlanNumber, InstallmentPlanRefundRequest installmentPlanRefundRequest)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class RefundExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 
            var installmentPlanRefundRequest = new InstallmentPlanRefundRequest(); // InstallmentPlanRefundRequest | 

            try
            {
                InstallmentPlanRefundResponse result = apiInstance.Refund(installmentPlanNumber, installmentPlanRefundRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.Refund: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | **string**|  | 
 **installmentPlanRefundRequest** | [**InstallmentPlanRefundRequest**](InstallmentPlanRefundRequest.md)|  | 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Search

> InstallmentPlanGetResponse Search (string installmentPlanNumber = null, string refOrderNumber = null, string extendedParams = null)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class SearchExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string |  (optional) 
            var refOrderNumber = "refOrderNumber_example";  // string |  (optional) 
            var extendedParams = "extendedParams_example";  // string |  (optional) 

            try
            {
                InstallmentPlanGetResponse result = apiInstance.Search(installmentPlanNumber, refOrderNumber, extendedParams);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.Search: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | **string**|  | [optional] 
 **refOrderNumber** | **string**|  | [optional] 
 **extendedParams** | **string**|  | [optional] 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOrder

> InstallmentPlanUpdateResponse UpdateOrder (string installmentPlanNumber, UpdateOrderRequest updateOrderRequest)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class UpdateOrderExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 
            var updateOrderRequest = new UpdateOrderRequest(); // UpdateOrderRequest | 

            try
            {
                InstallmentPlanUpdateResponse result = apiInstance.UpdateOrder(installmentPlanNumber, updateOrderRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.UpdateOrder: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | **string**|  | 
 **updateOrderRequest** | [**UpdateOrderRequest**](UpdateOrderRequest.md)|  | 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOrder2

> InstallmentPlanUpdateResponse UpdateOrder2 (InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class UpdateOrder2Example
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanUpdateRequestByIdentifier = new InstallmentPlanUpdateRequestByIdentifier(); // InstallmentPlanUpdateRequestByIdentifier | 

            try
            {
                InstallmentPlanUpdateResponse result = apiInstance.UpdateOrder2(installmentPlanUpdateRequestByIdentifier);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.UpdateOrder2: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanUpdateRequestByIdentifier** | [**InstallmentPlanUpdateRequestByIdentifier**](InstallmentPlanUpdateRequestByIdentifier.md)|  | 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifyAuthorization

> VerifyAuthorizationResponse VerifyAuthorization (string installmentPlanNumber)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Net.Api;
using Splitit.Net.Client;
using Splitit.Net.Model;

namespace Example
{
    public class VerifyAuthorizationExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://web-api-v3.sandbox.splitit.com";
            // Configure API key authorization: idempotencyKey
            Configuration.Default.AddApiKey("X-Splitit-IdempotencyKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("X-Splitit-IdempotencyKey", "Bearer");
            // Configure API key authorization: oauthKey
            Configuration.Default.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new InstallmentPlanApi(Configuration.Default);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 

            try
            {
                VerifyAuthorizationResponse result = apiInstance.VerifyAuthorization(installmentPlanNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.VerifyAuthorization: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | **string**|  | 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

