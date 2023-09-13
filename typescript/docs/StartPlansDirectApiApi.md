# StartPlansDirectApiApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkEligibility**](StartPlansDirectApiApi.md#checkEligibility) | **POST** /api/installmentplans/check-eligibility | Check Eligibility
[**post2**](StartPlansDirectApiApi.md#post2) | **POST** /api/installmentplans | Create Installment Plan


# **checkEligibility**

#### **POST** /api/installmentplans/check-eligibility

### Description
As your customer begins to checkout, use this endpoint to verify their overall eligibility for Splitit
installment plans and to determine plans for which they are eligible.
This endpoint can be called repeatedly before and during checkout, for example you may
call it after each field on a page is filled out. The Splitit API compares and updates the plan
based on each new body as it arrives.


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
**200** | Success |  -  |
**401** | Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: For all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error : Server encountered an unexpected condition |  -  |
**400-511** | InvalidAmount: Invalid amount sent, such as below your minimum amount or above your maximum amount. |  -  |
**400-542** | InvalidCCCardBrandNotSupported: Sorry but we do not accept this type of credit card. Please use {{SupportedCardBrands}} to complete your purchase. |  -  |
**400-563** | InvalidCurrency_NotSupportedByTerminal: Sorry, but this currency is not currently accepted at this terminal. |  -  |
**400-564** | CreditCardIsMissing: Some information is missing. Please enter all requested credit card details. |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |
**400-806** | TerminalApiKeyMissing: Terminal ID not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **post2**

#### **POST** /api/installmentplans

### Description
Once you are ready to check your customer out, you can use the `Create` endpoint.
`Create` enables you to pass in PCI sensitive data directly to the Splitit API,
and thus requires SAQ-D PCI certification.

A successful `Create` operation creates an authorization on a customer's credit
card, and if `AutoCapture` has been set to `true` within the request body, both
authorization and capture of the first installment will be completed (if `AutoCapture` is set to false, you will
have to call [Update Plan](/api-v3/update-plan-by-number) later). If Splitit is unable
to successfully secure an authorization on
a credit card, an error message will be returned in the response. Note that for funded
plans, a customer's `BillingAddress` object must be filled out.
In addition, if you are completely managing the input of PCI sensitive data on
your side, it’s essential to ensure your customer has approved the Splitit
specific terms and conditions.


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
**200** | Success |  -  |
**400** |  |  -  |
**401** | Unauthorized Request: Token is not authorized or is expired |  -  |
**403** |  |  -  |
**404** | Resource Does Not Exist: Plan or service does not exist; for all APIs, if an invalid plan number is passed in the URL, this error will be returned |  -  |
**500** | General Server Error: Server encountered an unexpected condition |  -  |
**400-503** | InvalidInstallmentPlanStatus: Please close this window. Then click \&#39;Splitit Payment\&#39; to create your payment plan (you haven\&#39;t been charged yet). |  -  |
**400-504** | InvalidCCCardTypeNotSupported: Sorry, but we do not accept debit cards. We can only accept Visa and MasterCard credit cards at this time. |  -  |
**400-505** | InvalidNumberOfInstallments: The number of installments is not available at this store. Please check available options and try again. Thank you! |  -  |
**400-510** | InvalidCardholderName: The cardholder name must include at least 3 characters. Please check and try again |  -  |
**400-511** | InvalidAmount: Invalid amount sent, such as below your minimum amount or above your maximum amount. |  -  |
**400-520** | InvalidCVV: The CVV number must include at least 3 characters. Please check and try again. |  -  |
**400-521** | InvalidCardNumber: This credit card number is not valid. Please check your card and try again. |  -  |
**400-522** | InvalidExpirationDate: The entered expiration date is not a valid date. Please check your card and try again. |  -  |
**400-524** | InvalidEmailFormat: Invalid email. Please check that the email address is entered in the correct format. (For example: name@mail.com) |  -  |
**400-526** | InvalidZIPCode: The ZIP code must include at least 3 characters. Please check and try again. |  -  |
**400-528** | InvalidCCIssueCountryNotSupportedByTerminal: We are sorry, but we currently do not accept cards issued by this country. |  -  |
**400-529** | CurrencyNotSupported: We are sorry, but we currently do not accept this currency. |  -  |
**400-532** | CountrySubdivisionNotSupported: Sorry, but Splitit is currently not available in your state. Please contact Splitit\&#39;s customer service desk for help |  -  |
**400-540** | InvalidExpirationDateFormat: Please enter the expiration date as MM/DD/YYYY. |  -  |
**400-542** | InvalidCCCardBrandNotSupported: Sorry but we do not accept this type of credit card. Please use {{SupportedCardBrands}} to complete your purchase. |  -  |
**400-543** | ApprovePlan_NoApprovalEvidence: Evidence of customer approval not provided. |  -  |
**400-544** | PlanWithTheSamePaymentDataAlreadyBeenCreatedLately: A similar purchase has been processed with this credit card. Please contact your merchant\&#39;s customer support number for more information. |  -  |
**400-550** | CultureNameNotValid: Culture (language used in interfaces and communications) not valid. |  -  |
**400-551** | CultureNotSupported: Culture (language used in interfaces and communications) not supported. |  -  |
**400-554** | UnknownZipCode: The ZIP code you entered is not valid. Please try again. |  -  |
**400-566** | AddressDataIsMissingOrPartiallyInitiated: Please enter the cardholder\&#39;s complete address. |  -  |
**400-567** | CardHolderNameIsMissing: Please enter the cardholder\&#39;s name. |  -  |
**400-568** | CardNumberIsMissing: Please enter the full credit card number. |  -  |
**400-569** | CardExpirationMonthIsMissing: Please enter the credit card\&#39;s expiration month. |  -  |
**400-570** | CardExpirationYearIsMissing: Please insert credit card\&#39;s expiration year. |  -  |
**400-571** | NumberOfInstallmentNotDefined: Please select the number of installments for this purchase. |  -  |
**400-572** | InvalidStateCode: We were unable to find this state code. |  -  |
**400-573** | EmailsMissing: Please enter your email address. |  -  |
**400-574** | ConsumerFullNameIsMissing: Please enter your full name. |  -  |
**400-575** | CurrencyMustBeDefinedOnTransaction: Please select the currency you wish to use. |  -  |
**400-578** | InvalidPlanStrategy: We are sorry for the inconvenience, but this plan is not available. |  -  |
**400-580** | InvalidCcPrepaidCardNotSupported: We do not currently accept prepaid cards, but we do accept credit cards. |  -  |
**400-594** | FraudDetected: Sorry, but we were unable to process your payment. Please reach out to our customer support team at support@splitit.com. |  -  |
**400-595** | PhoneIsMissing: Please enter your phone number. |  -  |
**400-596** | InvalidPhoneFormat: Please enter your phone number in this format: +1-321-555-1234. |  -  |
**400-599** | General Error: Sorry. There has been an error. Please try again. |  -  |
**400-600** | GtwyResultGeneralError: Gateway was unable to process this request. Please try using a different card. |  -  |
**400-601** | GtwyResultCCDataAVSZip: The ZIP code you entered is not valid. Please try again. |  -  |
**400-602** | GtwyResultCCDataAVSAddress: The address does not match. Please check your card and try again. |  -  |
**400-603** | GtwyResultCCDataCVV: The CVV number does not match. Please check your card and try again. |  -  |
**400-606** | GtwyResultCCDataAVS: Address or zip/post code failed validation. Please try again. |  -  |
**400-607** | GtwyResultCCDataNumber: This credit card number is not valid. Please check your card and try again. |  -  |
**400-608** | GtwyResultCCDataGeneralProblem: Sorry, but your card was not able to be processed. Please try a different card. |  -  |
**400-609** | GtwyResultCCDataInsufficientFunds: Sorry, but there is not enough available credit on this card to cover the full amount of your purchase. Please try a different card. |  -  |
**400-610** | GtwyResultCCWasDeclined: Sorry, but your card was not accepted. Please try a different card. |  -  |
**400-630** | GtwyConnectivityProblem: Sorry, but there was an error processing your payment. Please try again. |  -  |
**400-640** | GtwyMerchantDataProblem: Sorry, but there has been a processing error with this merchant. Please contact our support for assistance. |  -  |
**400-641** | Gtwy3DSRequired: 3D secure verification is required. |  -  |
**400-806** | TerminalApiKeyMissing: Terminal ID not found. |  -  |
**400-1041** | IdempotencyHashMismatchError: Same Idempotency key with different payload identified. |  -  |
**400-5041** | InvalidCCCardTypeNotSupportedMoreThanXInstallments: {{CardType}} cards support only up to {{MaxInstallmentsLimit}} installments. Please reduce the number of installments or provide payment details for a supported credit card. |  -  |
**400-5042** | InvalidCCCardTypeNotSupportedMoreThanXAmount: {{CardType}} cards are only supported for purchases up to {{Currency}}{{MaxPlanAmount}}. Please provide payment details for a credit card in order to support your total purchase amount. |  -  |
**400-5421** | InvalidCCCardBrandNotSupportedMoreThanXInstallments: {{CardBrand}} cards are supported only up to {{MaxInstallmentsLimit}} installments. Please reduce the number of installments or provide payment details for a supported credit card. |  -  |
**400-5422** | InvalidCCCardBrandNotSupportedMoreThanXAmount: {{CardBrand}} cards are only supported for purchases up to {{Currency}}{{MaxPlanAmount}}. Please try a different card. |  -  |
**400-5801** | InvalidCcPrepaidCardNotSupportedMoreThanXInstallments: {{CardType}} cards allow a maximum of {{MaxInstallmentsLimit}} installments. Please choose fewer installments or try a different credit card. |  -  |
**400-5802** | InvalidCcPrepaidCardNotSupportedMoreThanXAmount: The maximum purchase for {{CardType}} cards is {{Currency}}{{MaxPlanAmount}}. Please try a different card. |  -  |
**400-5911** | PlanContextNotValidForAmount: Purchase is only supported for up to {{Currency}}{{MaxPlanAmount}}. Please provide payment details for a credit card in order to support your total purchase amount. |  -  |
**400-5982** | PlanContextNotValidForAmount: Purchase is only supported for up to {{Currency}}{{MaxPlanAmount}}. Please provide payment details for a credit card in order to support your total purchase amount. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


