# splitit - 's Go SDK

Splitit's Web API


## Installation

Add to your project:

```shell
go get github.com/konfig-dev/splitit-web-sdks/go
```

## Getting Started

```golang
package main

import (
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    configuration := splitit.NewConfiguration()
    client := splitit.NewAPIClient(configuration)

    planData := *splitit.NewPlanData()
    cardDetails := *splitit.NewCardData()
    billingAddress := *splitit.NewAddressData()
    
    checkInstallmentsEligibilityRequest := *splitit.NewCheckInstallmentsEligibilityRequest()
    checkInstallmentsEligibilityRequest.SetPlanData(planData)
    checkInstallmentsEligibilityRequest.SetCardDetails(cardDetails)
    checkInstallmentsEligibilityRequest.SetBillingAddress(billingAddress)
    checkInstallmentsEligibilityRequest.SetShopperIdentifier("null")
    
    request := client.InstallmentPlanApi.CheckEligibility(
        "xSplititIdempotencyKey_example",
        """",
        checkInstallmentsEligibilityRequest,
    )
    
    resp, httpRes, err := request.Execute()

    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.CheckEligibility``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", httpRes)
    }
    // response from `CheckEligibility`: InstallmentsEligibilityResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.CheckEligibility`: %v\n", resp)
    fmt.Fprintf(os.Stdout, "Response from `InstallmentsEligibilityResponse.CheckEligibility.InstallmentProvider`: %v\n", *resp.InstallmentProvider)
    fmt.Fprintf(os.Stdout, "Response from `InstallmentsEligibilityResponse.CheckEligibility.PaymentPlanOptions`: %v\n", *resp.PaymentPlanOptions)
}
```

## Documentation for API Endpoints

All URIs are relative to *https://web-api-v3.production.splitit.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InstallmentPlanApi* | [**CheckEligibility**](docs/InstallmentPlanApi.md#checkeligibility) | **Post** /api/installmentplans/check-eligibility | 
*InstallmentPlanApi* | [**Get**](docs/InstallmentPlanApi.md#get) | **Get** /api/installmentplans/{installmentPlanNumber} | 
*InstallmentPlanApi* | [**Post**](docs/InstallmentPlanApi.md#post) | **Post** /api/installmentplans/initiate | 
*InstallmentPlanApi* | [**Post2**](docs/InstallmentPlanApi.md#post2) | **Post** /api/installmentplans | 
*InstallmentPlanApi* | [**Refund**](docs/InstallmentPlanApi.md#refund) | **Post** /api/installmentplans/{installmentPlanNumber}/refund | 
*InstallmentPlanApi* | [**Search**](docs/InstallmentPlanApi.md#search) | **Get** /api/installmentplans/search | 
*InstallmentPlanApi* | [**UpdateOrder**](docs/InstallmentPlanApi.md#updateorder) | **Put** /api/installmentplans/{installmentPlanNumber}/updateorder | 
*InstallmentPlanApi* | [**UpdateOrder2**](docs/InstallmentPlanApi.md#updateorder2) | **Put** /api/installmentplans/updateorder | 
*InstallmentPlanApi* | [**VerifyAuthorization**](docs/InstallmentPlanApi.md#verifyauthorization) | **Get** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 


## Documentation For Models

 - [AddressData](docs/AddressData.md)
 - [AddressDataModel](docs/AddressDataModel.md)
 - [AuthorizationModel](docs/AuthorizationModel.md)
 - [BluesnapVaultedShopperToken](docs/BluesnapVaultedShopperToken.md)
 - [CardBrand](docs/CardBrand.md)
 - [CardData](docs/CardData.md)
 - [CardType](docs/CardType.md)
 - [CheckInstallmentsEligibilityRequest](docs/CheckInstallmentsEligibilityRequest.md)
 - [Error](docs/Error.md)
 - [ErrorExtended](docs/ErrorExtended.md)
 - [ErrorExtendedAllOf](docs/ErrorExtendedAllOf.md)
 - [EventsEndpointsModel](docs/EventsEndpointsModel.md)
 - [FailedResponse](docs/FailedResponse.md)
 - [GatewayTokenData](docs/GatewayTokenData.md)
 - [GwAuthorizationStatus](docs/GwAuthorizationStatus.md)
 - [IdentifierContract](docs/IdentifierContract.md)
 - [InitiatePlanResponse](docs/InitiatePlanResponse.md)
 - [InitiateRedirectionEndpointsModel](docs/InitiateRedirectionEndpointsModel.md)
 - [Installment](docs/Installment.md)
 - [InstallmentPlanCreateRequest](docs/InstallmentPlanCreateRequest.md)
 - [InstallmentPlanCreateResponse](docs/InstallmentPlanCreateResponse.md)
 - [InstallmentPlanGetResponse](docs/InstallmentPlanGetResponse.md)
 - [InstallmentPlanInitiateRequest](docs/InstallmentPlanInitiateRequest.md)
 - [InstallmentPlanRefundRequest](docs/InstallmentPlanRefundRequest.md)
 - [InstallmentPlanRefundResponse](docs/InstallmentPlanRefundResponse.md)
 - [InstallmentPlanSearchResponse](docs/InstallmentPlanSearchResponse.md)
 - [InstallmentPlanUpdateRequest](docs/InstallmentPlanUpdateRequest.md)
 - [InstallmentPlanUpdateRequestByIdentifier](docs/InstallmentPlanUpdateRequestByIdentifier.md)
 - [InstallmentPlanUpdateRequestByIdentifierAllOf](docs/InstallmentPlanUpdateRequestByIdentifierAllOf.md)
 - [InstallmentPlanUpdateResponse](docs/InstallmentPlanUpdateResponse.md)
 - [InstallmentStatus](docs/InstallmentStatus.md)
 - [InstallmentsEligibilityResponse](docs/InstallmentsEligibilityResponse.md)
 - [LinksData](docs/LinksData.md)
 - [LinksModel](docs/LinksModel.md)
 - [MockerShopperToken](docs/MockerShopperToken.md)
 - [PaymentMethodModel](docs/PaymentMethodModel.md)
 - [PaymentMethodType](docs/PaymentMethodType.md)
 - [PaymentPlanOptionModel](docs/PaymentPlanOptionModel.md)
 - [PlanData](docs/PlanData.md)
 - [PlanDataModel](docs/PlanDataModel.md)
 - [PlanErrorResponse](docs/PlanErrorResponse.md)
 - [PlanErrorResponseAllOf](docs/PlanErrorResponseAllOf.md)
 - [PlanStatus](docs/PlanStatus.md)
 - [ProcessingData](docs/ProcessingData.md)
 - [ProcessingData2](docs/ProcessingData2.md)
 - [PurchaseMethod](docs/PurchaseMethod.md)
 - [RedirectionEndpointsModel](docs/RedirectionEndpointsModel.md)
 - [RefundModel](docs/RefundModel.md)
 - [RefundStatus](docs/RefundStatus.md)
 - [RefundStrategy](docs/RefundStrategy.md)
 - [RefundSummary](docs/RefundSummary.md)
 - [SearchInstallmentPlanResponseItem](docs/SearchInstallmentPlanResponseItem.md)
 - [ShippingStatus](docs/ShippingStatus.md)
 - [ShopperData](docs/ShopperData.md)
 - [SpreedlyToken](docs/SpreedlyToken.md)
 - [TestModes](docs/TestModes.md)
 - [ThreeDSData](docs/ThreeDSData.md)
 - [ThreeDSData2](docs/ThreeDSData2.md)
 - [ThreeDsRedirectDataV3](docs/ThreeDsRedirectDataV3.md)
 - [UxSettingsModel](docs/UxSettingsModel.md)
 - [VerifyAuthorizationResponse](docs/VerifyAuthorizationResponse.md)
