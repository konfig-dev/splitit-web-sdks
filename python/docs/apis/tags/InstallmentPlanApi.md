<a name="__pageTop"></a>
# splitit_client.apis.tags.installment_plan_api.InstallmentPlanApi

All URIs are relative to *https://web-api-v3.production.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](#cancel) | **post** /api/installmentplans/{installmentPlanNumber}/cancel | 
[**check_eligibility**](#check_eligibility) | **post** /api/installmentplans/check-eligibility | 
[**get**](#get) | **get** /api/installmentplans/{installmentPlanNumber} | 
[**post**](#post) | **post** /api/installmentplans/initiate | 
[**post2**](#post2) | **post** /api/installmentplans | 
[**refund**](#refund) | **post** /api/installmentplans/{installmentPlanNumber}/refund | 
[**search**](#search) | **get** /api/installmentplans/search | 
[**update_order**](#update_order) | **put** /api/installmentplans/{installmentPlanNumber}/updateorder | 
[**update_order2**](#update_order2) | **put** /api/installmentplans/updateorder | 
[**verify_authorization**](#verify_authorization) | **get** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 

# **cancel**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    cancel_response = splitit.installment_plan.cancel(
        installment_plan_number="installmentPlanNumber_example",  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
installmentPlanNumber | InstallmentPlanNumberSchema | | 

# InstallmentPlanNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#cancel.ApiResponseFor200) | 
401 | [ApiResponseFor401](#cancel.ApiResponseFor401) | 
403 | [ApiResponseFor403](#cancel.ApiResponseFor403) | 
404 | [ApiResponseFor404](#cancel.ApiResponseFor404) | 
500 | [ApiResponseFor500](#cancel.ApiResponseFor500) | 

#### cancel.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCancelResponse**](../../models/InstallmentPlanCancelResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCancelResponse**](../../models/InstallmentPlanCancelResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCancelResponse**](../../models/InstallmentPlanCancelResponse.md) |  | 


#### cancel.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### cancel.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### cancel.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### cancel.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **check_eligibility**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    check_eligibility_response = splitit.installment_plan.check_eligibility(
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        plan_data={
            "total_amount": 3.14,
            "number_of_installments": 1,
            "purchase_method": "InStore",
        },  # optional
        card_details={
            "card_brand": "Mastercard",
            "card_type": "Credit",
        },  # optional
        billing_address={},  # optional
    )
    pprint(check_eligibility_response.body)
    pprint(check_eligibility_response.body["payment_plan_options"])
    pprint(check_eligibility_response.headers)
    pprint(check_eligibility_response.status)
    pprint(check_eligibility_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.check_eligibility: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJsonPatchjson, SchemaForRequestBodyApplicationJson, SchemaForRequestBodyTextJson, SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJsonPatchjson
Type | Description  | Notes
------------- | ------------- | -------------
[**CheckInstallmentsEligibilityRequest**](../../models/CheckInstallmentsEligibilityRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CheckInstallmentsEligibilityRequest**](../../models/CheckInstallmentsEligibilityRequest.md) |  | 


# SchemaForRequestBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CheckInstallmentsEligibilityRequest**](../../models/CheckInstallmentsEligibilityRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CheckInstallmentsEligibilityRequest**](../../models/CheckInstallmentsEligibilityRequest.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#check_eligibility.ApiResponseFor200) | 
401 | [ApiResponseFor401](#check_eligibility.ApiResponseFor401) | 
403 | [ApiResponseFor403](#check_eligibility.ApiResponseFor403) | 
404 | [ApiResponseFor404](#check_eligibility.ApiResponseFor404) | 
500 | [ApiResponseFor500](#check_eligibility.ApiResponseFor500) | 

#### check_eligibility.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentsEligibilityResponse**](../../models/InstallmentsEligibilityResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentsEligibilityResponse**](../../models/InstallmentsEligibilityResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentsEligibilityResponse**](../../models/InstallmentsEligibilityResponse.md) |  | 


#### check_eligibility.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### check_eligibility.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### check_eligibility.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### check_eligibility.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    get_response = splitit.installment_plan.get(
        installment_plan_number="installmentPlanNumber_example",  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
    )
    pprint(get_response.body)
    pprint(get_response.body["date_created"])
    pprint(get_response.body["status"])
    pprint(get_response.body["installment_plan_number"])
    pprint(get_response.body["ref_order_number"])
    pprint(get_response.body["purchase_method"])
    pprint(get_response.body["currency"])
    pprint(get_response.body["original_amount"])
    pprint(get_response.body["amount"])
    pprint(get_response.body["authorization"])
    pprint(get_response.body["shopper"])
    pprint(get_response.body["billing_address"])
    pprint(get_response.body["payment_method"])
    pprint(get_response.body["extended_params"])
    pprint(get_response.body["installments"])
    pprint(get_response.body["refunds"])
    pprint(get_response.body["links"])
    pprint(get_response.headers)
    pprint(get_response.status)
    pprint(get_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.get: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
installmentPlanNumber | InstallmentPlanNumberSchema | | 

# InstallmentPlanNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get.ApiResponseFor200) | 
401 | [ApiResponseFor401](#get.ApiResponseFor401) | 
403 | [ApiResponseFor403](#get.ApiResponseFor403) | 
404 | [ApiResponseFor404](#get.ApiResponseFor404) | 
500 | [ApiResponseFor500](#get.ApiResponseFor500) | 

#### get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanGetResponse**](../../models/InstallmentPlanGetResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanGetResponse**](../../models/InstallmentPlanGetResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanGetResponse**](../../models/InstallmentPlanGetResponse.md) |  | 


#### get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### get.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    post_response = splitit.installment_plan.post(
        auto_capture=True,  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        attempt3d_secure=True,  # optional
        shopper={},  # optional
        plan_data={
            "total_amount": 3.14,
            "purchase_method": "InStore",
        },  # optional
        billing_address={},  # optional
        redirect_urls={},  # optional
        ux_settings={},  # optional
        events_endpoints={},  # optional
        x_splitit_test_mode="None",  # optional
    )
    pprint(post_response.body)
    pprint(post_response.body["status"])
    pprint(post_response.body["installment_plan_number"])
    pprint(post_response.body["ref_order_number"])
    pprint(post_response.body["purchase_method"])
    pprint(post_response.body["currency"])
    pprint(post_response.body["amount"])
    pprint(post_response.body["extended_params"])
    pprint(post_response.body["shopper"])
    pprint(post_response.body["billing_address"])
    pprint(post_response.body["checkout_url"])
    pprint(post_response.headers)
    pprint(post_response.status)
    pprint(post_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.post: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJsonPatchjson, SchemaForRequestBodyApplicationJson, SchemaForRequestBodyTextJson, SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJsonPatchjson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanInitiateRequest**](../../models/InstallmentPlanInitiateRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanInitiateRequest**](../../models/InstallmentPlanInitiateRequest.md) |  | 


# SchemaForRequestBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanInitiateRequest**](../../models/InstallmentPlanInitiateRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanInitiateRequest**](../../models/InstallmentPlanInitiateRequest.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-TestMode | XSplititTestModeSchema | | optional
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititTestModeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["None", "Regular", "Fast", "Automation", ] 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post.ApiResponseFor200) | 
400 | [ApiResponseFor400](#post.ApiResponseFor400) | 
401 | [ApiResponseFor401](#post.ApiResponseFor401) | 
403 | [ApiResponseFor403](#post.ApiResponseFor403) | 
404 | [ApiResponseFor404](#post.ApiResponseFor404) | 
500 | [ApiResponseFor500](#post.ApiResponseFor500) | 

#### post.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InitiatePlanResponse**](../../models/InitiatePlanResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InitiatePlanResponse**](../../models/InitiatePlanResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InitiatePlanResponse**](../../models/InitiatePlanResponse.md) |  | 


#### post.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyTextPlain, SchemaFor400ResponseBodyApplicationJson, SchemaFor400ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**PlanErrorResponse**](../../models/PlanErrorResponse.md) |  | 


# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PlanErrorResponse**](../../models/PlanErrorResponse.md) |  | 


# SchemaFor400ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PlanErrorResponse**](../../models/PlanErrorResponse.md) |  | 


#### post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### post.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post2**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    post2_response = splitit.installment_plan.post2(
        auto_capture=True,  # required
        terms_and_conditions_accepted=True,  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        attempt3d_secure=True,  # optional
        shopper={},  # optional
        plan_data={
            "total_amount": 3.14,
            "purchase_method": "InStore",
        },  # optional
        billing_address={},  # optional
        payment_method={
            "type": "Card",
        },  # optional
        redirect_urls={},  # optional
        events_endpoints={},  # optional
        x_splitit_test_mode="None",  # optional
    )
    pprint(post2_response.body)
    pprint(post2_response.body["date_created"])
    pprint(post2_response.body["status"])
    pprint(post2_response.body["installment_plan_number"])
    pprint(post2_response.body["ref_order_number"])
    pprint(post2_response.body["purchase_method"])
    pprint(post2_response.body["currency"])
    pprint(post2_response.body["original_amount"])
    pprint(post2_response.body["amount"])
    pprint(post2_response.body["extended_params"])
    pprint(post2_response.body["authorization"])
    pprint(post2_response.body["shopper"])
    pprint(post2_response.body["billing_address"])
    pprint(post2_response.body["payment_method"])
    pprint(post2_response.body["installments"])
    pprint(post2_response.body["links"])
    pprint(post2_response.headers)
    pprint(post2_response.status)
    pprint(post2_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.post2: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJsonPatchjson, SchemaForRequestBodyApplicationJson, SchemaForRequestBodyTextJson, SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJsonPatchjson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCreateRequest**](../../models/InstallmentPlanCreateRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCreateRequest**](../../models/InstallmentPlanCreateRequest.md) |  | 


# SchemaForRequestBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCreateRequest**](../../models/InstallmentPlanCreateRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCreateRequest**](../../models/InstallmentPlanCreateRequest.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-TestMode | XSplititTestModeSchema | | optional
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititTestModeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["None", "Regular", "Fast", "Automation", ] 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post2.ApiResponseFor200) | 
400 | [ApiResponseFor400](#post2.ApiResponseFor400) | 
401 | [ApiResponseFor401](#post2.ApiResponseFor401) | 
403 | [ApiResponseFor403](#post2.ApiResponseFor403) | 
404 | [ApiResponseFor404](#post2.ApiResponseFor404) | 
500 | [ApiResponseFor500](#post2.ApiResponseFor500) | 

#### post2.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCreateResponse**](../../models/InstallmentPlanCreateResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCreateResponse**](../../models/InstallmentPlanCreateResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanCreateResponse**](../../models/InstallmentPlanCreateResponse.md) |  | 


#### post2.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyTextPlain, SchemaFor400ResponseBodyApplicationJson, SchemaFor400ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**PlanErrorResponse**](../../models/PlanErrorResponse.md) |  | 


# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PlanErrorResponse**](../../models/PlanErrorResponse.md) |  | 


# SchemaFor400ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PlanErrorResponse**](../../models/PlanErrorResponse.md) |  | 


#### post2.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### post2.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### post2.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### post2.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **refund**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    refund_response = splitit.installment_plan.refund(
        amount=3.14,  # required
        installment_plan_number="installmentPlanNumber_example",  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        refund_strategy="FutureInstallmentsFirst",  # optional
    )
    pprint(refund_response.body)
    pprint(refund_response.body["refund_id"])
    pprint(refund_response.body["installment_plan_number"])
    pprint(refund_response.body["currency"])
    pprint(refund_response.body["non_credit_refund_amount"])
    pprint(refund_response.body["credit_refund_amount"])
    pprint(refund_response.body["summary"])
    pprint(refund_response.headers)
    pprint(refund_response.status)
    pprint(refund_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.refund: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJsonPatchjson, SchemaForRequestBodyApplicationJson, SchemaForRequestBodyTextJson, SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJsonPatchjson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanRefundRequest**](../../models/InstallmentPlanRefundRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanRefundRequest**](../../models/InstallmentPlanRefundRequest.md) |  | 


# SchemaForRequestBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanRefundRequest**](../../models/InstallmentPlanRefundRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanRefundRequest**](../../models/InstallmentPlanRefundRequest.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
installmentPlanNumber | InstallmentPlanNumberSchema | | 

# InstallmentPlanNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#refund.ApiResponseFor200) | 
401 | [ApiResponseFor401](#refund.ApiResponseFor401) | 
403 | [ApiResponseFor403](#refund.ApiResponseFor403) | 
404 | [ApiResponseFor404](#refund.ApiResponseFor404) | 
500 | [ApiResponseFor500](#refund.ApiResponseFor500) | 

#### refund.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanRefundResponse**](../../models/InstallmentPlanRefundResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanRefundResponse**](../../models/InstallmentPlanRefundResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanRefundResponse**](../../models/InstallmentPlanRefundResponse.md) |  | 


#### refund.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### refund.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### refund.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### refund.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **search**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    search_response = splitit.installment_plan.search(
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        installment_plan_number="string_example",  # optional
        ref_order_number="string_example",  # optional
        extended_params={
            "key": "string_example",
        },  # optional
    )
    pprint(search_response.body)
    pprint(search_response.body["plan_list"])
    pprint(search_response.headers)
    pprint(search_response.status)
    pprint(search_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.search: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
installmentPlanNumber | InstallmentPlanNumberSchema | | optional
refOrderNumber | RefOrderNumberSchema | | optional
extendedParams | ExtendedParamsSchema | | optional


# InstallmentPlanNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# RefOrderNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ExtendedParamsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional] 

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#search.ApiResponseFor200) | 
401 | [ApiResponseFor401](#search.ApiResponseFor401) | 
403 | [ApiResponseFor403](#search.ApiResponseFor403) | 
404 | [ApiResponseFor404](#search.ApiResponseFor404) | 
500 | [ApiResponseFor500](#search.ApiResponseFor500) | 

#### search.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanSearchResponse**](../../models/InstallmentPlanSearchResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanSearchResponse**](../../models/InstallmentPlanSearchResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanSearchResponse**](../../models/InstallmentPlanSearchResponse.md) |  | 


#### search.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### search.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### search.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### search.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **update_order**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    update_order_response = splitit.installment_plan.update_order(
        installment_plan_number="installmentPlanNumber_example",  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        tracking_number="string_example",  # optional
        ref_order_number="string_example",  # optional
        shipping_status="Pending",  # optional
        capture=True,  # optional
    )
    pprint(update_order_response.body)
    pprint(update_order_response.body["status"])
    pprint(update_order_response.body["shipping_status"])
    pprint(update_order_response.body["ref_order_number"])
    pprint(update_order_response.body["installment_plan_number"])
    pprint(update_order_response.headers)
    pprint(update_order_response.status)
    pprint(update_order_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.update_order: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJsonPatchjson, SchemaForRequestBodyApplicationJson, SchemaForRequestBodyTextJson, SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJsonPatchjson
Type | Description  | Notes
------------- | ------------- | -------------
[**UpdateOrderRequest**](../../models/UpdateOrderRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**UpdateOrderRequest**](../../models/UpdateOrderRequest.md) |  | 


# SchemaForRequestBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**UpdateOrderRequest**](../../models/UpdateOrderRequest.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**UpdateOrderRequest**](../../models/UpdateOrderRequest.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
installmentPlanNumber | InstallmentPlanNumberSchema | | 

# InstallmentPlanNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#update_order.ApiResponseFor200) | 
401 | [ApiResponseFor401](#update_order.ApiResponseFor401) | 
403 | [ApiResponseFor403](#update_order.ApiResponseFor403) | 
404 | [ApiResponseFor404](#update_order.ApiResponseFor404) | 
500 | [ApiResponseFor500](#update_order.ApiResponseFor500) | 

#### update_order.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateResponse**](../../models/InstallmentPlanUpdateResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateResponse**](../../models/InstallmentPlanUpdateResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateResponse**](../../models/InstallmentPlanUpdateResponse.md) |  | 


#### update_order.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### update_order.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### update_order.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### update_order.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **update_order2**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    update_order2_response = splitit.installment_plan.update_order2(
        body=None,  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
        ref_order_number="string_example",  # optional
        tracking_number="string_example",  # optional
        capture=True,  # optional
        shipping_status="Shipped",  # optional
        identifier={},  # optional
    )
    pprint(update_order2_response.body)
    pprint(update_order2_response.body["status"])
    pprint(update_order2_response.body["shipping_status"])
    pprint(update_order2_response.body["ref_order_number"])
    pprint(update_order2_response.body["installment_plan_number"])
    pprint(update_order2_response.headers)
    pprint(update_order2_response.status)
    pprint(update_order2_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.update_order2: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJsonPatchjson, SchemaForRequestBodyApplicationJson, SchemaForRequestBodyTextJson, SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJsonPatchjson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateRequestByIdentifier**](../../models/InstallmentPlanUpdateRequestByIdentifier.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateRequestByIdentifier**](../../models/InstallmentPlanUpdateRequestByIdentifier.md) |  | 


# SchemaForRequestBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateRequestByIdentifier**](../../models/InstallmentPlanUpdateRequestByIdentifier.md) |  | 


# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateRequestByIdentifier**](../../models/InstallmentPlanUpdateRequestByIdentifier.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#update_order2.ApiResponseFor200) | 
401 | [ApiResponseFor401](#update_order2.ApiResponseFor401) | 
403 | [ApiResponseFor403](#update_order2.ApiResponseFor403) | 
404 | [ApiResponseFor404](#update_order2.ApiResponseFor404) | 
500 | [ApiResponseFor500](#update_order2.ApiResponseFor500) | 

#### update_order2.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateResponse**](../../models/InstallmentPlanUpdateResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateResponse**](../../models/InstallmentPlanUpdateResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**InstallmentPlanUpdateResponse**](../../models/InstallmentPlanUpdateResponse.md) |  | 


#### update_order2.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### update_order2.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### update_order2.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### update_order2.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **verify_authorization**



### Example

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    # Defining the host is optional and defaults to https://web-api-v3.production.splitit.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://web-api-v3.production.splitit.com",
    # Configure OAuth2 access token for authorization: oauth
    access_token="YOUR_ACCESS_TOKEN",
)

try:
    verify_authorization_response = splitit.installment_plan.verify_authorization(
        installment_plan_number="installmentPlanNumber_example",  # required
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",  # required
    )
    pprint(verify_authorization_response.body)
    pprint(verify_authorization_response.body["is_authorized"])
    pprint(verify_authorization_response.body["authorization_amount"])
    pprint(verify_authorization_response.body["authorization"])
    pprint(verify_authorization_response.headers)
    pprint(verify_authorization_response.status)
    pprint(verify_authorization_response.round_trip_time)
except ApiException as e:
    print("Exception when calling InstallmentPlanApi.verify_authorization: %s\n" % e)
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('text/plain', 'application/json', 'text/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Splitit-IdempotencyKey | XSplititIdempotencyKeySchema | | 

# XSplititIdempotencyKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
installmentPlanNumber | InstallmentPlanNumberSchema | | 

# InstallmentPlanNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#verify_authorization.ApiResponseFor200) | 
401 | [ApiResponseFor401](#verify_authorization.ApiResponseFor401) | 
403 | [ApiResponseFor403](#verify_authorization.ApiResponseFor403) | 
404 | [ApiResponseFor404](#verify_authorization.ApiResponseFor404) | 
500 | [ApiResponseFor500](#verify_authorization.ApiResponseFor500) | 

#### verify_authorization.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyTextPlain, SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**VerifyAuthorizationResponse**](../../models/VerifyAuthorizationResponse.md) |  | 


# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**VerifyAuthorizationResponse**](../../models/VerifyAuthorizationResponse.md) |  | 


# SchemaFor200ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**VerifyAuthorizationResponse**](../../models/VerifyAuthorizationResponse.md) |  | 


#### verify_authorization.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyTextPlain, SchemaFor401ResponseBodyApplicationJson, SchemaFor401ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor401ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### verify_authorization.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyTextPlain, SchemaFor403ResponseBodyApplicationJson, SchemaFor403ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor403ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### verify_authorization.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyTextPlain, SchemaFor404ResponseBodyApplicationJson, SchemaFor404ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor404ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


#### verify_authorization.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyTextPlain, SchemaFor500ResponseBodyApplicationJson, SchemaFor500ResponseBodyTextJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyTextPlain
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


# SchemaFor500ResponseBodyTextJson
Type | Description  | Notes
------------- | ------------- | -------------
[**FailedResponse**](../../models/FailedResponse.md) |  | 


### Authorization

[oauth](../../../README.md#oauth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

