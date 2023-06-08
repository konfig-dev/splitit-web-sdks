# \InstallmentPlanApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Cancel**](InstallmentPlanApi.md#Cancel) | **Post** /api/installmentplans/{installmentPlanNumber}/cancel | 
[**CheckEligibility**](InstallmentPlanApi.md#CheckEligibility) | **Post** /api/installmentplans/check-eligibility | 
[**Get**](InstallmentPlanApi.md#Get) | **Get** /api/installmentplans/{installmentPlanNumber} | 
[**Post**](InstallmentPlanApi.md#Post) | **Post** /api/installmentplans/initiate | 
[**Post2**](InstallmentPlanApi.md#Post2) | **Post** /api/installmentplans | 
[**Refund**](InstallmentPlanApi.md#Refund) | **Post** /api/installmentplans/{installmentPlanNumber}/refund | 
[**Search**](InstallmentPlanApi.md#Search) | **Get** /api/installmentplans/search | 
[**UpdateOrder**](InstallmentPlanApi.md#UpdateOrder) | **Put** /api/installmentplans/{installmentPlanNumber}/updateorder | 
[**UpdateOrder2**](InstallmentPlanApi.md#UpdateOrder2) | **Put** /api/installmentplans/updateorder | 
[**VerifyAuthorization**](InstallmentPlanApi.md#VerifyAuthorization) | **Get** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 



## Cancel

> InstallmentPlanCancelResponse Cancel(ctx, installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    installmentPlanNumber := "installmentPlanNumber_example" // string | 
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.Cancel(context.Background(), installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.Cancel``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Cancel`: InstallmentPlanCancelResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.Cancel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**installmentPlanNumber** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **xSplititIdempotencyKey** | **string** |  | 

### Return type

[**InstallmentPlanCancelResponse**](InstallmentPlanCancelResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CheckEligibility

> InstallmentsEligibilityResponse CheckEligibility(ctx).XSplititIdempotencyKey(xSplititIdempotencyKey).CheckInstallmentsEligibilityRequest(checkInstallmentsEligibilityRequest).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 
    checkInstallmentsEligibilityRequest := *splitit.NewCheckInstallmentsEligibilityRequest() // CheckInstallmentsEligibilityRequest | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.CheckEligibility(context.Background()).XSplititIdempotencyKey(xSplititIdempotencyKey).CheckInstallmentsEligibilityRequest(checkInstallmentsEligibilityRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.CheckEligibility``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CheckEligibility`: InstallmentsEligibilityResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.CheckEligibility`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCheckEligibilityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSplititIdempotencyKey** | **string** |  | 
 **checkInstallmentsEligibilityRequest** | [**CheckInstallmentsEligibilityRequest**](CheckInstallmentsEligibilityRequest.md) |  | 

### Return type

[**InstallmentsEligibilityResponse**](InstallmentsEligibilityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Get

> InstallmentPlanGetResponse Get(ctx, installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    installmentPlanNumber := "installmentPlanNumber_example" // string | 
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.Get(context.Background(), installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.Get``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Get`: InstallmentPlanGetResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.Get`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**installmentPlanNumber** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **xSplititIdempotencyKey** | **string** |  | 

### Return type

[**InstallmentPlanGetResponse**](InstallmentPlanGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Post

> InitiatePlanResponse Post(ctx).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanInitiateRequest(installmentPlanInitiateRequest).XSplititTestMode(xSplititTestMode).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 
    installmentPlanInitiateRequest := *splitit.NewInstallmentPlanInitiateRequest(false) // InstallmentPlanInitiateRequest | 
    xSplititTestMode := "xSplititTestMode_example" // string |  (optional)

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.Post(context.Background()).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanInitiateRequest(installmentPlanInitiateRequest).XSplititTestMode(xSplititTestMode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.Post``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Post`: InitiatePlanResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.Post`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSplititIdempotencyKey** | **string** |  | 
 **installmentPlanInitiateRequest** | [**InstallmentPlanInitiateRequest**](InstallmentPlanInitiateRequest.md) |  | 
 **xSplititTestMode** | **string** |  | 

### Return type

[**InitiatePlanResponse**](InitiatePlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Post2

> InstallmentPlanCreateResponse Post2(ctx).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanCreateRequest(installmentPlanCreateRequest).XSplititTestMode(xSplititTestMode).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 
    installmentPlanCreateRequest := *splitit.NewInstallmentPlanCreateRequest(false, false) // InstallmentPlanCreateRequest | 
    xSplititTestMode := "xSplititTestMode_example" // string |  (optional)

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.Post2(context.Background()).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanCreateRequest(installmentPlanCreateRequest).XSplititTestMode(xSplititTestMode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.Post2``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Post2`: InstallmentPlanCreateResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.Post2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPost2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSplititIdempotencyKey** | **string** |  | 
 **installmentPlanCreateRequest** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md) |  | 
 **xSplititTestMode** | **string** |  | 

### Return type

[**InstallmentPlanCreateResponse**](InstallmentPlanCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Refund

> InstallmentPlanRefundResponse Refund(ctx, installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanRefundRequest(installmentPlanRefundRequest).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    installmentPlanNumber := "installmentPlanNumber_example" // string | 
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 
    installmentPlanRefundRequest := *splitit.NewInstallmentPlanRefundRequest(float32(123)) // InstallmentPlanRefundRequest | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.Refund(context.Background(), installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanRefundRequest(installmentPlanRefundRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.Refund``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Refund`: InstallmentPlanRefundResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.Refund`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**installmentPlanNumber** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRefundRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **xSplititIdempotencyKey** | **string** |  | 
 **installmentPlanRefundRequest** | [**InstallmentPlanRefundRequest**](InstallmentPlanRefundRequest.md) |  | 

### Return type

[**InstallmentPlanRefundResponse**](InstallmentPlanRefundResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Search

> InstallmentPlanSearchResponse Search(ctx).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanNumber(installmentPlanNumber).RefOrderNumber(refOrderNumber).ExtendedParams(extendedParams).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 
    installmentPlanNumber := "installmentPlanNumber_example" // string |  (optional)
    refOrderNumber := "refOrderNumber_example" // string |  (optional)
    extendedParams := map[string]string{"key": "Inner_example"} // map[string]string |  (optional)

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.Search(context.Background()).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanNumber(installmentPlanNumber).RefOrderNumber(refOrderNumber).ExtendedParams(extendedParams).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.Search``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Search`: InstallmentPlanSearchResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.Search`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSplititIdempotencyKey** | **string** |  | 
 **installmentPlanNumber** | **string** |  | 
 **refOrderNumber** | **string** |  | 
 **extendedParams** | **map[string]string** |  | 

### Return type

[**InstallmentPlanSearchResponse**](InstallmentPlanSearchResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOrder

> InstallmentPlanUpdateResponse UpdateOrder(ctx, installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).UpdateOrderRequest(updateOrderRequest).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    installmentPlanNumber := "installmentPlanNumber_example" // string | 
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 
    updateOrderRequest := *splitit.NewUpdateOrderRequest() // UpdateOrderRequest | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.UpdateOrder(context.Background(), installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).UpdateOrderRequest(updateOrderRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.UpdateOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateOrder`: InstallmentPlanUpdateResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.UpdateOrder`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**installmentPlanNumber** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **xSplititIdempotencyKey** | **string** |  | 
 **updateOrderRequest** | [**UpdateOrderRequest**](UpdateOrderRequest.md) |  | 

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOrder2

> InstallmentPlanUpdateResponse UpdateOrder2(ctx).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanUpdateRequestByIdentifier(installmentPlanUpdateRequestByIdentifier).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 
    installmentPlanUpdateRequestByIdentifier := *splitit.NewInstallmentPlanUpdateRequestByIdentifier() // InstallmentPlanUpdateRequestByIdentifier | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.UpdateOrder2(context.Background()).XSplititIdempotencyKey(xSplititIdempotencyKey).InstallmentPlanUpdateRequestByIdentifier(installmentPlanUpdateRequestByIdentifier).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.UpdateOrder2``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateOrder2`: InstallmentPlanUpdateResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.UpdateOrder2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOrder2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xSplititIdempotencyKey** | **string** |  | 
 **installmentPlanUpdateRequestByIdentifier** | [**InstallmentPlanUpdateRequestByIdentifier**](InstallmentPlanUpdateRequestByIdentifier.md) |  | 

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## VerifyAuthorization

> VerifyAuthorizationResponse VerifyAuthorization(ctx, installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    splitit "github.com/konfig-dev/splitit-web-sdks/go"
)

func main() {
    installmentPlanNumber := "installmentPlanNumber_example" // string | 
    xSplititIdempotencyKey := "xSplititIdempotencyKey_example" // string | 

    configuration := splitit.NewConfiguration()
    apiClient := splitit.NewAPIClient(configuration)
    resp, r, err := apiClient.InstallmentPlanApi.VerifyAuthorization(context.Background(), installmentPlanNumber).XSplititIdempotencyKey(xSplititIdempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `InstallmentPlanApi.VerifyAuthorization``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `VerifyAuthorization`: VerifyAuthorizationResponse
    fmt.Fprintf(os.Stdout, "Response from `InstallmentPlanApi.VerifyAuthorization`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**installmentPlanNumber** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiVerifyAuthorizationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **xSplititIdempotencyKey** | **string** |  | 

### Return type

[**VerifyAuthorizationResponse**](VerifyAuthorizationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

