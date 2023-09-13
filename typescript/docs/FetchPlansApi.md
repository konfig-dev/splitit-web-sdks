# FetchPlansApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](FetchPlansApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} | Fetch Plan by Number
[**search**](FetchPlansApi.md#search) | **GET** /api/installmentplans/search | Fetch Plan(s) by Alternate Field


# **get**

#### **GET** /api/installmentplans/{installmentPlanNumber}

### Description
Retrieve an installment plan's information by providing its number in your path.


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const getResponse = await splitit.fetchPlans.get({
  installmentPlanNumber: "installmentPlanNumber_example",
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
});

console.log(getResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | [**string**] | The number of the installment plan for which you\'d like information | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''


### Return type

**InstallmentPlanGetResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized Request: Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error: Server encountered an unexpected condition |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **search**

#### **GET** /api/installmentplans/search

### Description
Retrieves a plan by `RefOrderNumber` or `ExtendedParams`. Note that `RefOrderNumber` or `ExtendedParams` were optionally specified by you upon plan creation.


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const searchResponse = await splitit.fetchPlans.search({
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
});

console.log(searchResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''
 **installmentPlanNumber** | [**string**] |  | (optional) defaults to undefined
 **refOrderNumber** | [**string**] |  | (optional) defaults to undefined
 **extendedParams** | **{ [key: string]: string; }** | Specify the key and value you used when establishing the plan. For example `ExtendedParams[\"MerchantInternalID\"]=\"5345532\"`  | (optional) defaults to undefined


### Return type

**InstallmentPlanSearchResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized Request: Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error: Server encountered an unexpected condition |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


