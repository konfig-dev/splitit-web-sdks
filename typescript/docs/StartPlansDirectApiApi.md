# StartPlansDirectApiApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkEligibility**](StartPlansDirectApiApi.md#checkEligibility) | **POST** /api/installmentplans/check-eligibility | Check Eligibility
[**post2**](StartPlansDirectApiApi.md#post2) | **POST** /api/installmentplans | Create Installment Plan


# **checkEligibility**

#### **POST** /api/installmentplans/check-eligibility

### Description
As your customer beings to checkout, use this endpoint to verify their overall eligibility for Splitit installment plans and to determine plans for which they are eligible. This endpoint can be called repeatedly before and during checkout, for example you may call it after each field on a page is filled out. The Splitit API compares and updates the plan based on each new body as it arrives.

### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const checkEligibilityResponse =
  await splitit.startPlansDirectApi.checkEligibility({
    xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
    xSplititTouchPoint: "",
  });

console.log(checkEligibilityResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkInstallmentsEligibilityRequest** | **CheckInstallmentsEligibilityRequest**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''


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

# **post2**

#### **POST** /api/installmentplans

### Description
Once you are ready to check your customer out, you can use the Create endpoint. Create enables you to pass in PCI sensitive data directly to the Splitit API, and thus requires SAQ-D PCI certification.
A successful Create operation creates an authorization on a customer's credit card, and if AutoCapture has been set to true within the request body, both authorization and capture of the first installment will be completed (if AutoCapture is set to false, you will have to call Update Plan later). If Splitit is unable to successfully secure an authorization on a credit card, an error message will be returned in the response. Note that for funded plans, a customer's BillingAddress object must be filled out. In addition, if you are completely managing the input of PCI sensitive data on your side, it’s essential to ensure your customer has approved the Splitit specific terms and conditions.


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const post2Response = await splitit.startPlansDirectApi.post2({
  xSplititTestMode: "None",
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
  AutoCapture: true,
  TermsAndConditionsAccepted: true,
});

console.log(post2Response);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanCreateRequest** | **InstallmentPlanCreateRequest**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''
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


