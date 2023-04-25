# Splitit.Web.Net.Api.InstallmentPlanApi

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**Cancel**](InstallmentPlanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel |  |
| [**CheckEligibility**](InstallmentPlanApi.md#checkeligibility) | **POST** /api/installmentplans/check-eligibility |  |
| [**Get**](InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} |  |
| [**Post**](InstallmentPlanApi.md#post) | **POST** /api/installmentplans/initiate |  |
| [**Post2**](InstallmentPlanApi.md#post2) | **POST** /api/installmentplans |  |
| [**Refund**](InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund |  |
| [**Search**](InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search |  |
| [**UpdateOrder**](InstallmentPlanApi.md#updateorder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder |  |
| [**UpdateOrder2**](InstallmentPlanApi.md#updateorder2) | **PUT** /api/installmentplans/updateorder |  |
| [**VerifyAuthorization**](InstallmentPlanApi.md#verifyauthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization |  |

<a name="cancel"></a>
# **Cancel**
> InstallmentPlanCancelResponse Cancel (string installmentPlanNumber, string xSplititIdempotencyKey)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class CancelExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 

            try
            {
                InstallmentPlanCancelResponse result = apiInstance.Cancel(installmentPlanNumber, xSplititIdempotencyKey);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Cancel: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the CancelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentPlanCancelResponse> response = apiInstance.CancelWithHttpInfo(installmentPlanNumber, xSplititIdempotencyKey);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.CancelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **installmentPlanNumber** | **string** |  |  |
| **xSplititIdempotencyKey** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="checkeligibility"></a>
# **CheckEligibility**
> InstallmentsEligibilityResponse CheckEligibility (string xSplititIdempotencyKey, CheckInstallmentsEligibilityRequest checkInstallmentsEligibilityRequest)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class CheckEligibilityExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 
            var checkInstallmentsEligibilityRequest = new CheckInstallmentsEligibilityRequest(); // CheckInstallmentsEligibilityRequest | 

            try
            {
                InstallmentsEligibilityResponse result = apiInstance.CheckEligibility(xSplititIdempotencyKey, checkInstallmentsEligibilityRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.CheckEligibility: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the CheckEligibilityWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentsEligibilityResponse> response = apiInstance.CheckEligibilityWithHttpInfo(xSplititIdempotencyKey, checkInstallmentsEligibilityRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.CheckEligibilityWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **xSplititIdempotencyKey** | **string** |  |  |
| **checkInstallmentsEligibilityRequest** | [**CheckInstallmentsEligibilityRequest**](CheckInstallmentsEligibilityRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="get"></a>
# **Get**
> InstallmentPlanGetResponse Get (string installmentPlanNumber, string xSplititIdempotencyKey)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class GetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 

            try
            {
                InstallmentPlanGetResponse result = apiInstance.Get(installmentPlanNumber, xSplititIdempotencyKey);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Get: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the GetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentPlanGetResponse> response = apiInstance.GetWithHttpInfo(installmentPlanNumber, xSplititIdempotencyKey);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.GetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **installmentPlanNumber** | **string** |  |  |
| **xSplititIdempotencyKey** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="post"></a>
# **Post**
> InitiatePlanResponse Post (string xSplititIdempotencyKey, InstallmentPlanInitiateRequest installmentPlanInitiateRequest, string xSplititTestMode = null)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class PostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 
            var installmentPlanInitiateRequest = new InstallmentPlanInitiateRequest(); // InstallmentPlanInitiateRequest | 
            var xSplititTestMode = "None";  // string |  (optional) 

            try
            {
                InitiatePlanResponse result = apiInstance.Post(xSplititIdempotencyKey, installmentPlanInitiateRequest, xSplititTestMode);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Post: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the PostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InitiatePlanResponse> response = apiInstance.PostWithHttpInfo(xSplititIdempotencyKey, installmentPlanInitiateRequest, xSplititTestMode);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.PostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **xSplititIdempotencyKey** | **string** |  |  |
| **installmentPlanInitiateRequest** | [**InstallmentPlanInitiateRequest**](InstallmentPlanInitiateRequest.md) |  |  |
| **xSplititTestMode** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="post2"></a>
# **Post2**
> InstallmentPlanCreateResponse Post2 (string xSplititIdempotencyKey, InstallmentPlanCreateRequest installmentPlanCreateRequest, string xSplititTestMode = null)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class Post2Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 
            var installmentPlanCreateRequest = new InstallmentPlanCreateRequest(); // InstallmentPlanCreateRequest | 
            var xSplititTestMode = "None";  // string |  (optional) 

            try
            {
                InstallmentPlanCreateResponse result = apiInstance.Post2(xSplititIdempotencyKey, installmentPlanCreateRequest, xSplititTestMode);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Post2: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the Post2WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentPlanCreateResponse> response = apiInstance.Post2WithHttpInfo(xSplititIdempotencyKey, installmentPlanCreateRequest, xSplititTestMode);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.Post2WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **xSplititIdempotencyKey** | **string** |  |  |
| **installmentPlanCreateRequest** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md) |  |  |
| **xSplititTestMode** | **string** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="refund"></a>
# **Refund**
> InstallmentPlanRefundResponse Refund (string installmentPlanNumber, string xSplititIdempotencyKey, InstallmentPlanRefundRequest installmentPlanRefundRequest)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class RefundExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 
            var installmentPlanRefundRequest = new InstallmentPlanRefundRequest(); // InstallmentPlanRefundRequest | 

            try
            {
                InstallmentPlanRefundResponse result = apiInstance.Refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Refund: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the RefundWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentPlanRefundResponse> response = apiInstance.RefundWithHttpInfo(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.RefundWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **installmentPlanNumber** | **string** |  |  |
| **xSplititIdempotencyKey** | **string** |  |  |
| **installmentPlanRefundRequest** | [**InstallmentPlanRefundRequest**](InstallmentPlanRefundRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="search"></a>
# **Search**
> InstallmentPlanSearchResponse Search (string xSplititIdempotencyKey, string installmentPlanNumber = null, string refOrderNumber = null, Dictionary<string, string> extendedParams = null)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class SearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 
            var installmentPlanNumber = "installmentPlanNumber_example";  // string |  (optional) 
            var refOrderNumber = "refOrderNumber_example";  // string |  (optional) 
            var extendedParams = new Dictionary<string, string>(); // Dictionary<string, string> |  (optional) 

            try
            {
                InstallmentPlanSearchResponse result = apiInstance.Search(xSplititIdempotencyKey, installmentPlanNumber, refOrderNumber, extendedParams);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Search: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the SearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentPlanSearchResponse> response = apiInstance.SearchWithHttpInfo(xSplititIdempotencyKey, installmentPlanNumber, refOrderNumber, extendedParams);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.SearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **xSplititIdempotencyKey** | **string** |  |  |
| **installmentPlanNumber** | **string** |  | [optional]  |
| **refOrderNumber** | **string** |  | [optional]  |
| **extendedParams** | [**Dictionary&lt;string, string&gt;**](string.md) |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateorder"></a>
# **UpdateOrder**
> InstallmentPlanUpdateResponse UpdateOrder (string installmentPlanNumber, string xSplititIdempotencyKey, UpdateOrderRequest updateOrderRequest)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class UpdateOrderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 
            var updateOrderRequest = new UpdateOrderRequest(); // UpdateOrderRequest | 

            try
            {
                InstallmentPlanUpdateResponse result = apiInstance.UpdateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.UpdateOrder: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the UpdateOrderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentPlanUpdateResponse> response = apiInstance.UpdateOrderWithHttpInfo(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.UpdateOrderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **installmentPlanNumber** | **string** |  |  |
| **xSplititIdempotencyKey** | **string** |  |  |
| **updateOrderRequest** | [**UpdateOrderRequest**](UpdateOrderRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateorder2"></a>
# **UpdateOrder2**
> InstallmentPlanUpdateResponse UpdateOrder2 (string xSplititIdempotencyKey, InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class UpdateOrder2Example
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 
            var installmentPlanUpdateRequestByIdentifier = new InstallmentPlanUpdateRequestByIdentifier(); // InstallmentPlanUpdateRequestByIdentifier | 

            try
            {
                InstallmentPlanUpdateResponse result = apiInstance.UpdateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.UpdateOrder2: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the UpdateOrder2WithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<InstallmentPlanUpdateResponse> response = apiInstance.UpdateOrder2WithHttpInfo(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.UpdateOrder2WithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **xSplititIdempotencyKey** | **string** |  |  |
| **installmentPlanUpdateRequestByIdentifier** | [**InstallmentPlanUpdateRequestByIdentifier**](InstallmentPlanUpdateRequestByIdentifier.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="verifyauthorization"></a>
# **VerifyAuthorization**
> VerifyAuthorizationResponse VerifyAuthorization (string installmentPlanNumber, string xSplititIdempotencyKey)



### Example
```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class VerifyAuthorizationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();

            // Configure custom BasePath if desired
            // config.BasePath = "https://web-api-v3.sandbox.splitit.com";

            // Configure OAuth2 credentials for "application" OAuth flow
            string clientId = System.Environment.GetEnvironmentVariable("CLIENT_ID");
            string clientSecret = System.Environment.GetEnvironmentVariable("CLIENT_SECRET");
            config.OAuthClientId = clientId;
            config.OAuthClientSecret = clientSecret;

            var apiInstance = new InstallmentPlanApi(config);
            var installmentPlanNumber = "installmentPlanNumber_example";  // string | 
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";  // string | 

            try
            {
                VerifyAuthorizationResponse result = apiInstance.VerifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.VerifyAuthorization: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

#### Using the VerifyAuthorizationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<VerifyAuthorizationResponse> response = apiInstance.VerifyAuthorizationWithHttpInfo(installmentPlanNumber, xSplititIdempotencyKey);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling InstallmentPlanApi.VerifyAuthorizationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **installmentPlanNumber** | **string** |  |  |
| **xSplititIdempotencyKey** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

