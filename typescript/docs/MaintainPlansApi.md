# MaintainPlansApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](MaintainPlansApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel | Cancel a Plan
[**refund**](MaintainPlansApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund | Refund a Plan
[**updateOrder**](MaintainPlansApi.md#updateOrder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder | Update Plan by Number
[**updateOrder2**](MaintainPlansApi.md#updateOrder2) | **PUT** /api/installmentplans/updateorder | Update Plan By Alternate Field


# **cancel**

#### **POST** /api/installmentplans/{installmentPlanNumber}/cancel

### Description
The Cancel operation allows you to cancel an existing installment plan.


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const cancelResponse = await splitit.maintainPlans.cancel({
  installmentPlanNumber: "installmentPlanNumber_example",
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
});

console.log(cancelResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''


### Return type

**InstallmentPlanCancelResponse**

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

# **refund**

#### **POST** /api/installmentplans/{installmentPlanNumber}/refund

### Description
Refund part or all of an installment Plan.

### Strategies

There are several refund strategies you can choose when refunding a plan (note that the default is `FutureInstallmentsFirst`):

* `FutureInstallmentsFirst`: At first customer isn’t refunded any installment money that they have already paid. Instead their refund lessens the amount of future installments they will be debited for, beginning with the next installment that is due. However, if their refund exceeds the amount of money they have left to pay (all installments), only then is the refund taken out of the installment money they have already paid
* `FutureInstallmentsLast`: Customer is refunded beginning with the installment money they have already paid. If their refund amount exceeds the amount they have already paid, their amount of future installments due gets decreased, beginning with the next installment due and then proceeding to the later ones
* `FutureInstallmentsNotAllowed`: Customer is only refunded from installment money that they have already paid, not from any future installments that they have due
* `ReduceFromLastInstallment`: This is the same as `FutureInstallmentsFirst`, except that the refund is credited starting with the last installment first (e.g., number 6 of 6, as opposed to number 2 of 6).


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const refundResponse = await splitit.maintainPlans.refund({
  installmentPlanNumber: "installmentPlanNumber_example",
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
  Amount: 3.14,
  RefundStrategy: "FutureInstallmentsFirst",
});

console.log(refundResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanRefundRequest** | **InstallmentPlanRefundRequest**|  |
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''


### Return type

**InstallmentPlanRefundResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | Server encountered an unexpected condition |  -  |
**400-503** | InvalidInstallmentPlanStatus: Status does not allow updating order (example: request capture for plan that was already captured). |  -  |
**400-511** | InvalidAmount: Invalid amount sent, such as below your minimum amount or above your maximum amount. |  -  |
**400-562** | RefundRequestedAmountExceededPlanRefundableAmount: The refund amount requested exceeded the plan\&#39;s refundable amount. |  -  |
**400-578** | InvalidPlanStrategy: We are sorry for the inconvenience, but this plan is not available. |  -  |
**400-594** | FraudDetected: Sorry, but we were unable to process your payment. Please reach out to our customer support team at support@splitit.com. |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |
**400-640** | GtwyMerchantDataProblem: Sorry, but there has been a processing error with this merchant. Please contact our support for assistance. |  -  |
**400-1041** | IdempotencyHashMismatchError: Same Idempotency key with different payload identified. |  -  |
**400-5911** | InvalidInternalUrlSentToOms: Plan is not in the correct state to process this request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **updateOrder**

#### **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder

### Description
Locate a plan by installment number then carry out post-authorization activities related to the plan, such as updating the order number, updating the tracking number, or updating shipping status. You can also use this endpoint to capture the first installment from a plan that has only been authorized but not yet captured.


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const updateOrderResponse = await splitit.maintainPlans.updateOrder({
  installmentPlanNumber: "installmentPlanNumber_example",
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
  ShippingStatus: "Pending",
});

console.log(updateOrderResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateOrderRequest** | **UpdateOrderRequest**|  |
 **installmentPlanNumber** | [**string**] |  | defaults to undefined
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''


### Return type

**InstallmentPlanUpdateResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized Request: Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error: Server encountered an unexpected condition |  -  |
**400-503** | InvalidInstallmentPlanStatus: Status does not allow updating order (example: request capture for plan that was already captured). |  -  |
**400-578** | InvalidPlanStrategy: We are sorry for the inconvenience, but this plan is not available. |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |
**400-640** | GtwyMerchantDataProblem: Sorry, but there has been a processing error with this merchant. Please contact our support for assistance. |  -  |
**400-1041** | IdempotencyHashMismatchError: Same Idempotency key with different payload identified. |  -  |
**400-5911** | InvalidInternalUrlSentToOms: Plan is not in the correct state to process this request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **updateOrder2**

#### **PUT** /api/installmentplans/updateorder

### Description
Locate a plan by `RefOrderNumber` or `ExtendedParams` then carry out post-authorization activities related to the plan, such as updating the order number, updating the tracking number, or updating shipping status. You can also use this endpoint to capture the first installment from a plan that has only been authorized but not yet captured. Note that `RefOrderNumber` or `ExtendedParams` were optionally specified by you upon plan creation.


### Example


```typescript
import { Splitit } from "splitit-web-typescript-sdk";

const splitit = new Splitit({
  // Defining the base path is optional and defaults to https://web-api-v3.production.splitit.com
  // basePath: "https://web-api-v3.production.splitit.com",
  oauthClientId: "CLIENT_ID",
  oauthClientSecret: "CLIENT_SECRET",
});

const updateOrder2Response = await splitit.maintainPlans.updateOrder2({
  xSplititIdempotencyKey: "xSplititIdempotencyKey_example",
  xSplititTouchPoint: "",
  ShippingStatus: "Shipped",
});

console.log(updateOrder2Response);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installmentPlanUpdateRequestByIdentifier** | **InstallmentPlanUpdateRequestByIdentifier**|  |
 **xSplititIdempotencyKey** | [**string**] |  | defaults to undefined
 **xSplititTouchPoint** | [**string**] | TouchPoint | defaults to ''


### Return type

**InstallmentPlanUpdateResponse**

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized Request: Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error: Server encountered an unexpected condition |  -  |
**400-503** | InvalidInstallmentPlanStatus: Status does not allow updating order (example: request capture for plan that was already captured). |  -  |
**400-578** | InvalidPlanStrategy: We are sorry for the inconvenience, but this plan is not available. |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |
**400-640** | GtwyMerchantDataProblem: Sorry, but there has been a processing error with this merchant. Please contact our support for assistance. |  -  |
**400-1041** | IdempotencyHashMismatchError: Same Idempotency key with different payload identified. |  -  |
**400-5911** | InvalidInternalUrlSentToOms: Plan is not in the correct state to process this request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


