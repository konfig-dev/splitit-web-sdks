# splitit-web-python-sdk
Splitit's Web API

- API version: 1.0.0
- Package version: 2.0.0

## Requirements.

Python >=3.7

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install splitit-web-python-sdk==2.0.0
```
(you may need to run `pip` with root permission: `sudo pip install splitit-web-python-sdk==2.0.0`)

Then import the package:
```python
import splitit_client
```
## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from pprint import pprint
from splitit_client import Splitit

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://web-api-v3.sandbox.splitit.com",

    # Configure OAuth2 access token for authorization: oauth
    access_token = 'YOUR_ACCESS_TOKEN'
)

cancel_response = splitit.installment_plan.cancel(
    path_params = {
        'installmentPlanNumber': "installmentPlanNumber_example",
    },
    header_params = {
        'X-Splitit-IdempotencyKey': "X-Splitit-IdempotencyKey_example",
    },
)
try:
    pprint(cancel_response.body["installment_plan_number"])
    pprint(cancel_response.headers)
    pprint(cancel_response.status)
except ApiException as e:
    print("Exception when calling InstallmentPlanCancelResponse.cancel: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
```

## Documentation for API Endpoints

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InstallmentPlanApi* | [**cancel**](docs/apis/tags/InstallmentPlanApi.md#cancel) | **post** /api/installmentplans/{installmentPlanNumber}/cancel | 
*InstallmentPlanApi* | [**check_eligibility**](docs/apis/tags/InstallmentPlanApi.md#check_eligibility) | **post** /api/installmentplans/check-eligibility | 
*InstallmentPlanApi* | [**get**](docs/apis/tags/InstallmentPlanApi.md#get) | **get** /api/installmentplans/{installmentPlanNumber} | 
*InstallmentPlanApi* | [**post**](docs/apis/tags/InstallmentPlanApi.md#post) | **post** /api/installmentplans/initiate | 
*InstallmentPlanApi* | [**post2**](docs/apis/tags/InstallmentPlanApi.md#post2) | **post** /api/installmentplans | 
*InstallmentPlanApi* | [**refund**](docs/apis/tags/InstallmentPlanApi.md#refund) | **post** /api/installmentplans/{installmentPlanNumber}/refund | 
*InstallmentPlanApi* | [**search**](docs/apis/tags/InstallmentPlanApi.md#search) | **get** /api/installmentplans/search | 
*InstallmentPlanApi* | [**update_order**](docs/apis/tags/InstallmentPlanApi.md#update_order) | **put** /api/installmentplans/{installmentPlanNumber}/updateorder | 
*InstallmentPlanApi* | [**update_order2**](docs/apis/tags/InstallmentPlanApi.md#update_order2) | **put** /api/installmentplans/updateorder | 
*InstallmentPlanApi* | [**verify_authorization**](docs/apis/tags/InstallmentPlanApi.md#verify_authorization) | **get** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 

## Documentation For Models

 - [AddressData](docs/models/AddressData.md)
 - [AddressDataModel](docs/models/AddressDataModel.md)
 - [AuthorizationModel](docs/models/AuthorizationModel.md)
 - [CardBrand](docs/models/CardBrand.md)
 - [CardData](docs/models/CardData.md)
 - [CardType](docs/models/CardType.md)
 - [CheckInstallmentsEligibilityRequest](docs/models/CheckInstallmentsEligibilityRequest.md)
 - [Error](docs/models/Error.md)
 - [ErrorExtended](docs/models/ErrorExtended.md)
 - [FailedResponse](docs/models/FailedResponse.md)
 - [GwAuthorizationStatus](docs/models/GwAuthorizationStatus.md)
 - [IdentifierContract](docs/models/IdentifierContract.md)
 - [InitiatePlanResponse](docs/models/InitiatePlanResponse.md)
 - [InitiateRedirectionEndpointsModel](docs/models/InitiateRedirectionEndpointsModel.md)
 - [Installment](docs/models/Installment.md)
 - [InstallmentPlanCancelResponse](docs/models/InstallmentPlanCancelResponse.md)
 - [InstallmentPlanCreateRequest](docs/models/InstallmentPlanCreateRequest.md)
 - [InstallmentPlanCreateResponse](docs/models/InstallmentPlanCreateResponse.md)
 - [InstallmentPlanGetResponse](docs/models/InstallmentPlanGetResponse.md)
 - [InstallmentPlanInitiateRequest](docs/models/InstallmentPlanInitiateRequest.md)
 - [InstallmentPlanRefundRequest](docs/models/InstallmentPlanRefundRequest.md)
 - [InstallmentPlanRefundResponse](docs/models/InstallmentPlanRefundResponse.md)
 - [InstallmentPlanSearchResponse](docs/models/InstallmentPlanSearchResponse.md)
 - [InstallmentPlanUpdateRequest](docs/models/InstallmentPlanUpdateRequest.md)
 - [InstallmentPlanUpdateRequestByIdentifier](docs/models/InstallmentPlanUpdateRequestByIdentifier.md)
 - [InstallmentPlanUpdateResponse](docs/models/InstallmentPlanUpdateResponse.md)
 - [InstallmentStatus](docs/models/InstallmentStatus.md)
 - [InstallmentsEligibilityResponse](docs/models/InstallmentsEligibilityResponse.md)
 - [LinksData](docs/models/LinksData.md)
 - [LinksModel](docs/models/LinksModel.md)
 - [PaymentMethodModel](docs/models/PaymentMethodModel.md)
 - [PaymentMethodType](docs/models/PaymentMethodType.md)
 - [PaymentPlanOptionModel](docs/models/PaymentPlanOptionModel.md)
 - [PlanData](docs/models/PlanData.md)
 - [PlanDataModel](docs/models/PlanDataModel.md)
 - [PlanErrorResponse](docs/models/PlanErrorResponse.md)
 - [PlanStatus](docs/models/PlanStatus.md)
 - [PurchaseMethod](docs/models/PurchaseMethod.md)
 - [RedirectionEndpointsModel](docs/models/RedirectionEndpointsModel.md)
 - [RefundModel](docs/models/RefundModel.md)
 - [RefundStatus](docs/models/RefundStatus.md)
 - [RefundStrategy](docs/models/RefundStrategy.md)
 - [RefundSummary](docs/models/RefundSummary.md)
 - [SearchInstallmentPlanResponseItem](docs/models/SearchInstallmentPlanResponseItem.md)
 - [ShippingStatus](docs/models/ShippingStatus.md)
 - [ShippingStatus2](docs/models/ShippingStatus2.md)
 - [ShopperData](docs/models/ShopperData.md)
 - [TestModes](docs/models/TestModes.md)
 - [ThreeDsRedirectDataV3](docs/models/ThreeDsRedirectDataV3.md)
 - [UpdateOrderRequest](docs/models/UpdateOrderRequest.md)
 - [VerifyAuthorizationResponse](docs/models/VerifyAuthorizationResponse.md)

## Documentation For Authorization

 Authentication schemes defined for the API:
## oauth

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
 - **api.v3**: 



## Author
This Python package is automatically generated by [Konfig](https://konfigthis.com)
