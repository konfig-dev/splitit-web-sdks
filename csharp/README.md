# Splitit.Web.Net - C#

[![NuGet](https://img.shields.io/badge/NuGet-3.0.3-blue.svg)](https://www.nuget.org/packages/Splitit.Web.Net/3.0.3)

Splitit's Web API

## Frameworks supported
- .NET Core >=1.0
- .NET Framework >=4.6
- Mono/Xamarin >=vNext

## Installation

Using the [.NET Core command-line interface (CLI) tools][dotnet-core-cli-tools]:

```sh
dotnet add package Splitit.Web.Net
```

Using the [NuGet Command Line Interface (CLI)][nuget-cli]:

```sh
nuget install Splitit.Web.Net
```

Using the [Package Manager Console][package-manager-console]:

```powershell
Install-Package Splitit.Web.Net
```

From within Visual Studio:

1. Open the Solution Explorer.
2. Right-click on a project within your solution.
3. Click on *Manage NuGet Packages...*
4. Click on the *Browse* tab and search for "Splitit.Web.Net".
5. Click on the "Splitit.Web.Net" package, select the appropriate version in the
   right-tab and click *Install*.

## Getting Started

```csharp
using System;
using System.Collections.Generic;
using System.Diagnostics;
using Splitit.Web.Net.Client;
using Splitit.Web.Net.Model;

namespace Example
{
    public class CheckEligibilityExample
    {
        public static void Main()
        {
            SplititClient client = new SplititClient();
            // Configure OAuth2 credentials for "application" OAuth flow
            client.SetOAuthClientId(System.Environment.GetEnvironmentVariable("CLIENT_ID"));
            client.SetOAuthClientSecret(System.Environment.GetEnvironmentVariable("CLIENT_SECRET"));

            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            var planData = new PlanData();
            var cardDetails = new CardData();
            var billingAddress = new AddressData();
            var shopperIdentifier = "shopperIdentifier_example";
            
            var checkInstallmentsEligibilityRequest = new CheckInstallmentsEligibilityRequest(
                planData,
                cardDetails,
                billingAddress,
                shopperIdentifier
            );
            
            try
            {
                InstallmentsEligibilityResponse result = client.InstallmentPlan.CheckEligibility(xSplititIdempotencyKey, xSplititTouchPoint, checkInstallmentsEligibilityRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.CheckEligibility: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://web-api-v3.production.splitit.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InstallmentPlanApi* | [**CheckEligibility**](docs/InstallmentPlanApi.md#checkeligibility) | **POST** /api/installmentplans/check-eligibility | 
*InstallmentPlanApi* | [**Get**](docs/InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} | 
*InstallmentPlanApi* | [**GetEligibilityTermsAndCondition**](docs/InstallmentPlanApi.md#geteligibilitytermsandcondition) | **GET** /api/installmentplans/{ipn}/legal | 
*InstallmentPlanApi* | [**Post**](docs/InstallmentPlanApi.md#post) | **POST** /api/installmentplans/initiate | 
*InstallmentPlanApi* | [**Post2**](docs/InstallmentPlanApi.md#post2) | **POST** /api/installmentplans | 
*InstallmentPlanApi* | [**Refund**](docs/InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund | 
*InstallmentPlanApi* | [**Search**](docs/InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search | 
*InstallmentPlanApi* | [**UpdateOrder**](docs/InstallmentPlanApi.md#updateorder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder | 
*InstallmentPlanApi* | [**UpdateOrder2**](docs/InstallmentPlanApi.md#updateorder2) | **PUT** /api/installmentplans/updateorder | 
*InstallmentPlanApi* | [**VerifyAuthorization**](docs/InstallmentPlanApi.md#verifyauthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 


## Documentation for Models

 - [AddressData](docs/AddressData.md)
 - [AddressDataModel](docs/AddressDataModel.md)
 - [AuthorizationModel](docs/AuthorizationModel.md)
 - [BluesnapVaultedShopperToken](docs/BluesnapVaultedShopperToken.md)
 - [CardBrand](docs/CardBrand.md)
 - [CardData](docs/CardData.md)
 - [CardType](docs/CardType.md)
 - [CheckInstallmentsEligibilityRequest](docs/CheckInstallmentsEligibilityRequest.md)
 - [EligibilityTermsAndConditionResponse](docs/EligibilityTermsAndConditionResponse.md)
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


## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.13.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 13.0.1 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

## Author
This C# package is automatically generated by [Konfig](https://konfigthis.com)

[dotnet-core-cli-tools]: https://docs.microsoft.com/en-us/dotnet/core/tools/
[nuget-cli]: https://docs.microsoft.com/en-us/nuget/tools/nuget-exe-cli-reference
[package-manager-console]: https://docs.microsoft.com/en-us/nuget/tools/package-manager-console
