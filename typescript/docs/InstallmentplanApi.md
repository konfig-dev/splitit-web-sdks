# InstallmentplanApi

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](InstallmentplanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel | 
[**checkEligibility**](InstallmentplanApi.md#checkEligibility) | **POST** /api/installmentplans/check-eligibility | 
[**get**](InstallmentplanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} | 
[**post**](InstallmentplanApi.md#post) | **POST** /api/installmentplans/initiate | 
[**post2**](InstallmentplanApi.md#post2) | **POST** /api/installmentplans | 
[**refund**](InstallmentplanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund | 
[**search**](InstallmentplanApi.md#search) | **GET** /api/installmentplans/search | 
[**updateOrder**](InstallmentplanApi.md#updateOrder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder | 
[**updateOrder2**](InstallmentplanApi.md#updateOrder2) | **PUT** /api/installmentplans/updateorder | 
[**verifyAuthorization**](InstallmentplanApi.md#verifyAuthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 


# **cancel**

#### **POST** /api/installmentplans/{installmentPlanNumber}/cancel


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const cancelResponse = await splitit.installmentplan.cancel({
        "installmentPlanNumber": "installmentPlanNumber_example",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
    })

console.log(cancelResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined


### Return type

**InstallmentPlanCancelResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **checkEligibility**

#### **POST** /api/installmentplans/check-eligibility


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const checkEligibilityResponse = await splitit.installmentplan.checkEligibility({
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
    })

console.log(checkEligibilityResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkInstallmentsEligibilityRequest** | **CheckInstallmentsEligibilityRequest**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined


### Return type

**InstallmentsEligibilityResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **get**

#### **GET** /api/installmentplans/{installmentPlanNumber}


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const getResponse = await splitit.installmentplan.get({
        "installmentPlanNumber": "installmentPlanNumber_example",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
    })

console.log(getResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined


### Return type

**InstallmentPlanGetResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **post**

#### **POST** /api/installmentplans/initiate


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const postResponse = await splitit.installmentplan.post({
        "xSplititTestMode": "None",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
        "auto_capture": true,
        "attempt3d_secure": true,
    })

console.log(postResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanInitiateRequest** | **InstallmentPlanInitiateRequest**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTestMode** | 'None', 'Regular', 'Fast', 'Automation' |  | (optional) defaults to undefined


### Return type

**InitiatePlanResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **post2**

#### **POST** /api/installmentplans


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const post2Response = await splitit.installmentplan.post2({
        "xSplititTestMode": "None",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
        "auto_capture": true,
        "terms_and_conditions_accepted": true,
    })

console.log(post2Response)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanCreateRequest** | **InstallmentPlanCreateRequest**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTestMode** | 'None', 'Regular', 'Fast', 'Automation' |  | (optional) defaults to undefined


### Return type

**InstallmentPlanCreateResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**400** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **refund**

#### **POST** /api/installmentplans/{installmentPlanNumber}/refund


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const refundResponse = await splitit.installmentplan.refund({
        "installmentPlanNumber": "installmentPlanNumber_example",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
        "amount": 3.14,
        "refund_strategy": "FutureInstallmentsFirst",
    })

console.log(refundResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanRefundRequest** | **InstallmentPlanRefundRequest**|  |
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined


### Return type

**InstallmentPlanRefundResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **search**

#### **GET** /api/installmentplans/search


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const searchResponse = await splitit.installmentplan.search({
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
    })

console.log(searchResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **installmentPlanNumber** | [**string**] |  | (optional) defaults to undefined
 **refOrderNumber** | [**string**] |  | (optional) defaults to undefined
 **extendedParams** | **{ [key: string]: string; }** |  | (optional) defaults to undefined


### Return type

**InstallmentPlanSearchResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **updateOrder**

#### **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const updateOrderResponse = await splitit.installmentplan.updateOrder({
        "installmentPlanNumber": "installmentPlanNumber_example",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
        "shipping_status": "Pending",
    })

console.log(updateOrderResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateOrderRequest** | **UpdateOrderRequest**|  |
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined


### Return type

**InstallmentPlanUpdateResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **updateOrder2**

#### **PUT** /api/installmentplans/updateorder


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const updateOrder2Response = await splitit.installmentplan.updateOrder2({
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
        "shipping_status": "Shipped",
    })

console.log(updateOrder2Response)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanUpdateRequestByIdentifier** | **InstallmentPlanUpdateRequestByIdentifier**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined


### Return type

**InstallmentPlanUpdateResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **verifyAuthorization**

#### **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',
})

const verifyAuthorizationResponse = await splitit.installmentplan.verifyAuthorization({
        "installmentPlanNumber": "installmentPlanNumber_example",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
    })

console.log(verifyAuthorizationResponse)

```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined


### Return type

**VerifyAuthorizationResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


