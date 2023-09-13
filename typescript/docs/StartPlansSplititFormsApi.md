# StartPlansSplititFormsApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post**](StartPlansSplititFormsApi.md#post) | **POST** /api/installmentplans/initiate | Initiate Installment Plan
[**verifyAuthorization**](StartPlansSplititFormsApi.md#verifyAuthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | Verify Authorization


# **post**

#### **POST** /api/installmentplans/initiate

### Description
Initiate establishes an installment plan but doesn't finalize it, and is thus intended for use
with Splitit premade checkout solutions such as Payment Forms or Flex Form.
Initiate only requires SAQ-A certification. You can call it multiple times for the same installment plan, since each time a new API call is made, existing data will be updated and new values will be appended to the existing plan.
Note that for funded plans, a customer's `BillingAddress` object must be filled out.


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
**200** | Success |  -  |
**400** |  |  -  |
**401** | Unauthorized Request: Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error: Server encountered an unexpected condition |  -  |
**400-503** | InvalidInstallmentPlanStatus: Please close this window. Then click \&#39;Splitit Payment\&#39; to create your payment plan (you haven\&#39;t been charged yet). |  -  |
**400-505** | InvalidNumberOfInstallments: The number of installments is not available at this store. Please check available options and try again. Thank you! |  -  |
**400-511** | InvalidAmount: Invalid amount sent, such as below your minimum amount or above your maximum amount. |  -  |
**400-524** | InvalidEmailFormat: Invalid email. Please check that the email address is entered in the correct format. (For example: name@mail.com) |  -  |
**400-526** | InvalidZIPCode: The ZIP code must include at least 3 characters. Please check and try again. |  -  |
**400-528** | InvalidCCIssueCountryNotSupportedByTerminal: We are sorry, but we currently do not accept cards issued by this country. |  -  |
**400-529** | CurrencyNotSupported: We are sorry, but we currently do not accept this currency. |  -  |
**400-532** | CountrySubdivisionNotSupported: Sorry, but Splitit is currently not available in your state. Please contact Splitit\&#39;s customer service desk for help |  -  |
**400-550** | CultureNameNotValid: Culture (language used in interfaces and communications) not valid. |  -  |
**400-551** | CultureNotSupported: Culture (language used in interfaces and communications) not supported. |  -  |
**400-554** | UnknownZipCode: The ZIP code you entered is not valid. Please try again. |  -  |
**400-566** | AddressDataIsMissingOrPartiallyInitiated: Please enter the cardholder\&#39;s complete address. |  -  |
**400-572** | InvalidStateCode: We were unable to find this state code. |  -  |
**400-575** | CurrencyMustBeDefinedOnTransaction: Please select the currency you wish to use. |  -  |
**400-595** | PhoneIsMissing: Please enter your phone number. |  -  |
**400-596** | InvalidPhoneFormat: Please enter your phone number in this format: +1-321-555-1234. |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |
**400-806** | TerminalApiKeyMissing: Terminal ID not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **verifyAuthorization**

#### **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization

### Description
You must call Verify Authorization in cases when plan authorization and order closure do not happen simultaneously. An example of this would be when a customer checks out with a Payment Form or Flex Form, or is redirected for 3DS. To call it, you need to provide the plan number you received in the success response from [Initiate](/api-v3/initiate-installment-plan).


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
**200** | Success |  -  |
**401** | Unauthorized Request: Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error: Server encountered an unexpected condition |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


