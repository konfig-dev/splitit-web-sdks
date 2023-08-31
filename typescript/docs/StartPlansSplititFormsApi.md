# StartPlansSplititFormsApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post**](StartPlansSplititFormsApi.md#post) | **POST** /api/installmentplans/initiate | Initiate Installment Plan
[**verifyAuthorization**](StartPlansSplititFormsApi.md#verifyAuthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | Verify Authorization


# **post**

#### **POST** /api/installmentplans/initiate

### Description
Initiate establishes an installment plan but doesn't finalize it, and is thus intended for use with Splitit premade checkout solutions such as Payment Forms or Flex Form. Initiate only requires SAQ-A certification. You can call it multiple times for the same installment plan, since each time a new API call is made, existing data will be updated and new values will be appended to the existing plan. Note that for funded plans, a customer's BillingAddress object must be filled out.

### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const postResponse = await splitit.startPlansSplititForms.post({
  xSplititTestMode: "None",
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
  AutoCapture: true,
});

console.log(postResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanInitiateRequest** | **InstallmentPlanInitiateRequest**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''
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

# **verifyAuthorization**

#### **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization

### Description
You must call Verify Authorization in cases when plan authorization and order closure do not happen simultaneously. An example of this would be when a customer checks out with a Payment Form or Flex Form, or is redirected for 3DS. To call it, you need to provide the plan number you received in the success response from Initiate.

### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const verifyAuthorizationResponse =
  await splitit.startPlansSplititForms.verifyAuthorization({
    installmentPlanNumber: "installmentPlanNumber_example",
    xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
    xSplititTouchPoint: "",
  });

console.log(verifyAuthorizationResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''


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


