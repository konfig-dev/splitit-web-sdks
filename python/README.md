# splitit-web-python-sdk

[![PyPI](https://img.shields.io/badge/PyPI-v2.5.0-blue)](https://pypi.org/project/splitit-web-python-sdk/2.5.0)

Splitit's Web API


## Requirements

Python >=3.7

## Installing

```sh
pip install splitit-web-python-sdk==2.5.0
```

## Getting Started

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    client_id="YOUR_CLIENT_ID",
    client_secret="YOUR_CLIENT_SECRET",
)

try:
    cancel_response = splitit.installment_plan.cancel(
        installment_plan_number="installmentPlanNumber_example",  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        x_splitit_touch_point="",  # required
    )
    pprint(cancel_response.body)
    pprint(cancel_response.body["installment_plan_number"])
    pprint(cancel_response.headers)
    pprint(cancel_response.status)
    pprint(cancel_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.cancel: %s\n" % e)
    pprint(e.body)
    if e.status == 401:
        pprint(e.body["trace_id"])
        pprint(e.body["error"])
    if e.status == 500:
        pprint(e.body["trace_id"])
        pprint(e.body["error"])
    if e.status == 403:
        pprint(e.body["trace_id"])
        pprint(e.body["error"])
    if e.status == 404:
        pprint(e.body["trace_id"])
        pprint(e.body["error"])
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```

## Async

`async` support is available by prepending `a` to any method.

```python
import asyncio
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    client_id="YOUR_CLIENT_ID",
    client_secret="YOUR_CLIENT_SECRET",
)


async def main():
    try:
        cancel_response = await splitit.installment_plan.acancel(
            installment_plan_number="installmentPlanNumber_example",  # required
            x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
            x_splitit_touch_point="",  # required
        )
        pprint(cancel_response.body)
        pprint(cancel_response.body["installment_plan_number"])
        pprint(cancel_response.headers)
        pprint(cancel_response.status)
        pprint(cancel_response.round_trip_time)
    except ApiException as e:
        print("Exception when calling InstallmentPlanApi.cancel: %s\n" % e)
        pprint(e.body)
        if e.status == 401:
            pprint(e.body["trace_id"])
            pprint(e.body["error"])
        if e.status == 500:
            pprint(e.body["trace_id"])
            pprint(e.body["error"])
        if e.status == 403:
            pprint(e.body["trace_id"])
            pprint(e.body["error"])
        if e.status == 404:
            pprint(e.body["trace_id"])
            pprint(e.body["error"])
        pprint(e.headers)
        pprint(e.status)
        pprint(e.reason)
        pprint(e.round_trip_time)


asyncio.run(main())
```


## Documentation for API Endpoints

All URIs are relative to *https://web-api-v3.production.splitit.com*

Tag | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InstallmentPlan* | [**cancel**](docs/apis/tags/InstallmentPlanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel | 
*InstallmentPlan* | [**check_eligibility**](docs/apis/tags/InstallmentPlanApi.md#check_eligibility) | **POST** /api/installmentplans/check-eligibility | 
*InstallmentPlan* | [**get**](docs/apis/tags/InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} | 
*InstallmentPlan* | [**post**](docs/apis/tags/InstallmentPlanApi.md#post) | **POST** /api/installmentplans/initiate | 
*InstallmentPlan* | [**post2**](docs/apis/tags/InstallmentPlanApi.md#post2) | **POST** /api/installmentplans | 
*InstallmentPlan* | [**refund**](docs/apis/tags/InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund | 
*InstallmentPlan* | [**search**](docs/apis/tags/InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search | 
*InstallmentPlan* | [**update_order**](docs/apis/tags/InstallmentPlanApi.md#update_order) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder | 
*InstallmentPlan* | [**update_order2**](docs/apis/tags/InstallmentPlanApi.md#update_order2) | **PUT** /api/installmentplans/updateorder | 
*InstallmentPlan* | [**verify_authorization**](docs/apis/tags/InstallmentPlanApi.md#verify_authorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 

## Documentation For Models

 - [AddressData](docs/models/AddressData.md)
 - [AddressDataModel](docs/models/AddressDataModel.md)
 - [AuthorizationModel](docs/models/AuthorizationModel.md)
 - [BluesnapVaultedShopperToken](docs/models/BluesnapVaultedShopperToken.md)
 - [CardBrand](docs/models/CardBrand.md)
 - [CardData](docs/models/CardData.md)
 - [CardType](docs/models/CardType.md)
 - [CheckInstallmentsEligibilityRequest](docs/models/CheckInstallmentsEligibilityRequest.md)
 - [Error](docs/models/Error.md)
 - [ErrorExtended](docs/models/ErrorExtended.md)
 - [EventsEndpointsModel](docs/models/EventsEndpointsModel.md)
 - [FailedResponse](docs/models/FailedResponse.md)
 - [GatewayTokenData](docs/models/GatewayTokenData.md)
 - [GwAuthorizationStatus](docs/models/GwAuthorizationStatus.md)
 - [IdentifierContract](docs/models/IdentifierContract.md)
 - [IdentifierContractExtendedParams](docs/models/IdentifierContractExtendedParams.md)
 - [InitiatePlanResponse](docs/models/InitiatePlanResponse.md)
 - [InitiatePlanResponseExtendedParams](docs/models/InitiatePlanResponseExtendedParams.md)
 - [InitiateRedirectionEndpointsModel](docs/models/InitiateRedirectionEndpointsModel.md)
 - [Installment](docs/models/Installment.md)
 - [InstallmentPlanCancelResponse](docs/models/InstallmentPlanCancelResponse.md)
 - [InstallmentPlanCreateRequest](docs/models/InstallmentPlanCreateRequest.md)
 - [InstallmentPlanCreateResponse](docs/models/InstallmentPlanCreateResponse.md)
 - [InstallmentPlanCreateResponseExtendedParams](docs/models/InstallmentPlanCreateResponseExtendedParams.md)
 - [InstallmentPlanGetResponse](docs/models/InstallmentPlanGetResponse.md)
 - [InstallmentPlanGetResponseExtendedParams](docs/models/InstallmentPlanGetResponseExtendedParams.md)
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
 - [MockerShopperToken](docs/models/MockerShopperToken.md)
 - [PaymentMethodModel](docs/models/PaymentMethodModel.md)
 - [PaymentMethodType](docs/models/PaymentMethodType.md)
 - [PaymentPlanOptionModel](docs/models/PaymentPlanOptionModel.md)
 - [PlanData](docs/models/PlanData.md)
 - [PlanDataAllowedInstallmentOptions](docs/models/PlanDataAllowedInstallmentOptions.md)
 - [PlanDataModel](docs/models/PlanDataModel.md)
 - [PlanDataModelExtendedParams](docs/models/PlanDataModelExtendedParams.md)
 - [PlanDataTags](docs/models/PlanDataTags.md)
 - [PlanErrorResponse](docs/models/PlanErrorResponse.md)
 - [PlanStatus](docs/models/PlanStatus.md)
 - [ProcessingData](docs/models/ProcessingData.md)
 - [ProcessingData2](docs/models/ProcessingData2.md)
 - [PurchaseMethod](docs/models/PurchaseMethod.md)
 - [RedirectionEndpointsModel](docs/models/RedirectionEndpointsModel.md)
 - [RefundModel](docs/models/RefundModel.md)
 - [RefundStatus](docs/models/RefundStatus.md)
 - [RefundStrategy](docs/models/RefundStrategy.md)
 - [RefundSummary](docs/models/RefundSummary.md)
 - [SearchInstallmentPlanResponseItem](docs/models/SearchInstallmentPlanResponseItem.md)
 - [SearchInstallmentPlanResponseItemExtendedParams](docs/models/SearchInstallmentPlanResponseItemExtendedParams.md)
 - [ShippingStatus](docs/models/ShippingStatus.md)
 - [ShippingStatus2](docs/models/ShippingStatus2.md)
 - [ShopperData](docs/models/ShopperData.md)
 - [SpreedlyToken](docs/models/SpreedlyToken.md)
 - [TestModes](docs/models/TestModes.md)
 - [ThreeDSData](docs/models/ThreeDSData.md)
 - [ThreeDSData2](docs/models/ThreeDSData2.md)
 - [ThreeDsRedirectDataV3](docs/models/ThreeDsRedirectDataV3.md)
 - [ThreeDsRedirectDataV3Params](docs/models/ThreeDsRedirectDataV3Params.md)
 - [UpdateOrderRequest](docs/models/UpdateOrderRequest.md)
 - [UxSettingsModel](docs/models/UxSettingsModel.md)
 - [UxSettingsModelDisplayedInstallmentOptions](docs/models/UxSettingsModelDisplayedInstallmentOptions.md)
 - [VerifyAuthorizationResponse](docs/models/VerifyAuthorizationResponse.md)


## Author
This Python package is automatically generated by [Konfig](https://konfigthis.com)
