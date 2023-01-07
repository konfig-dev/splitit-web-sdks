# splitit_client.InstallmentPlanApi

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](InstallmentPlanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel | 
[**get**](InstallmentPlanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} | 
[**post**](InstallmentPlanApi.md#post) | **POST** /api/installmentplans | 
[**refund**](InstallmentPlanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund | 
[**search**](InstallmentPlanApi.md#search) | **GET** /api/installmentplans/search | 
[**update_order**](InstallmentPlanApi.md#update_order) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder | 
[**update_order2**](InstallmentPlanApi.md#update_order2) | **PUT** /api/installmentplans/updateorder | 
[**verify_authorization**](InstallmentPlanApi.md#verify_authorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 


# **cancel**
> InstallmentPlanCancelResponse cancel(installment_plan_number, x_splitit_idempotency_key)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.failed_response import FailedResponse
from splitit_client.model.installment_plan_cancel_response import InstallmentPlanCancelResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    installment_plan_number = "installmentPlanNumber_example" # str | 
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.cancel(installment_plan_number, x_splitit_idempotency_key)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->cancel: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installment_plan_number** | **str**|  |
 **x_splitit_idempotency_key** | **str**|  |

### Return type

[**InstallmentPlanCancelResponse**](InstallmentPlanCancelResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get**
> InstallmentPlanModel get(installment_plan_number, x_splitit_idempotency_key)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.installment_plan_model import InstallmentPlanModel
from splitit_client.model.failed_response import FailedResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    installment_plan_number = "installmentPlanNumber_example" # str | 
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get(installment_plan_number, x_splitit_idempotency_key)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installment_plan_number** | **str**|  |
 **x_splitit_idempotency_key** | **str**|  |

### Return type

[**InstallmentPlanModel**](InstallmentPlanModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post**
> InstallmentPlanModel post(x_splitit_idempotency_key, installment_plan_create_request)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.installment_plan_model import InstallmentPlanModel
from splitit_client.model.installment_plan_create_request import InstallmentPlanCreateRequest
from splitit_client.model.failed_response import FailedResponse
from splitit_client.model.plan_error_response import PlanErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 
    installment_plan_create_request = InstallmentPlanCreateRequest(
        auto_capture=True,
        attempt3d_secure=True,
        attempt_authorize=True,
        terms_and_conditions_accepted=True,
        shopper=ShopperData(
            full_name="full_name_example",
            email="email_example",
            phone_number="phone_number_example",
            culture="culture_example",
        ),
        plan_data=PlanDataModel(
            total_amount=3.14,
            currency="currency_example",
            number_of_installments=1,
            terminal_id="terminal_id_example",
            purchase_method=PurchaseMethod("InStore"),
            ref_order_number="ref_order_number_example",
            extended_params={
                "key": "key_example",
            },
        ),
        billing_address=AddressDataModel(
            address_line1="address_line1_example",
            address_line2="address_line2_example",
            city="city_example",
            country="country_example",
            state="state_example",
            zip="zip_example",
        ),
        payment_method=PaymentMethodModel(
            type=PaymentMethodType("Card"),
            card=CardData(
                card_holder_full_name="card_holder_full_name_example",
                card_number="card_number_example",
                card_exp_year="card_exp_year_example",
                card_exp_month="card_exp_month_example",
                card_cvv="card_cvv_example",
            ),
        ),
        redirect_urls=RedirectionEndpointsModel(
            authorize_succeeded="authorize_succeeded_example",
            succeeded="succeeded_example",
            authorize_failed="authorize_failed_example",
            failed="failed_example",
        ),
    ) # InstallmentPlanCreateRequest | 
    x_splitit_test_mode = "None" # str |  (optional)

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.post(x_splitit_idempotency_key, installment_plan_create_request)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->post: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_response = api_instance.post(x_splitit_idempotency_key, installment_plan_create_request, x_splitit_test_mode=x_splitit_test_mode)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_splitit_idempotency_key** | **str**|  |
 **installment_plan_create_request** | [**InstallmentPlanCreateRequest**](InstallmentPlanCreateRequest.md)|  |
 **x_splitit_test_mode** | **str**|  | [optional]

### Return type

[**InstallmentPlanModel**](InstallmentPlanModel.md)

### Authorization

[bearer](../README.md#bearer)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refund**
> InstallmentPlanRefundResponse refund(installment_plan_number, x_splitit_idempotency_key, installment_plan_refund_request)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.failed_response import FailedResponse
from splitit_client.model.installment_plan_refund_request import InstallmentPlanRefundRequest
from splitit_client.model.installment_plan_refund_response import InstallmentPlanRefundResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    installment_plan_number = "installmentPlanNumber_example" # str | 
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 
    installment_plan_refund_request = InstallmentPlanRefundRequest(
        amount=3.14,
        refund_strategy=RefundStrategy("FutureInstallmentsFirst"),
    ) # InstallmentPlanRefundRequest | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.refund(installment_plan_number, x_splitit_idempotency_key, installment_plan_refund_request)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->refund: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installment_plan_number** | **str**|  |
 **x_splitit_idempotency_key** | **str**|  |
 **installment_plan_refund_request** | [**InstallmentPlanRefundRequest**](InstallmentPlanRefundRequest.md)|  |

### Return type

[**InstallmentPlanRefundResponse**](InstallmentPlanRefundResponse.md)

### Authorization

[bearer](../README.md#bearer)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search**
> InstallmentPlanGetResponse search(x_splitit_idempotency_key)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.failed_response import FailedResponse
from splitit_client.model.installment_plan_get_response import InstallmentPlanGetResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 
    installment_plan_number = "installmentPlanNumber_example" # str |  (optional)
    ref_order_number = "refOrderNumber_example" # str |  (optional)
    extended_params = {
        "key": "key_example",
    } # {str: (str,)} |  (optional)

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.search(x_splitit_idempotency_key)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->search: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        api_response = api_instance.search(x_splitit_idempotency_key, installment_plan_number=installment_plan_number, ref_order_number=ref_order_number, extended_params=extended_params)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_splitit_idempotency_key** | **str**|  |
 **installment_plan_number** | **str**|  | [optional]
 **ref_order_number** | **str**|  | [optional]
 **extended_params** | **{str: (str,)}**|  | [optional]

### Return type

[**InstallmentPlanGetResponse**](InstallmentPlanGetResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_order**
> InstallmentPlanUpdateResponse update_order(installment_plan_number, x_splitit_idempotency_key, update_order_request)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.failed_response import FailedResponse
from splitit_client.model.update_order_request import UpdateOrderRequest
from splitit_client.model.installment_plan_update_response import InstallmentPlanUpdateResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    installment_plan_number = "installmentPlanNumber_example" # str | 
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 
    update_order_request = UpdateOrderRequest(
        tracking_number="tracking_number_example",
        ref_order_number="ref_order_number_example",
        shipping_status=ShippingStatus("Pending"),
        capture=True,
    ) # UpdateOrderRequest | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_order(installment_plan_number, x_splitit_idempotency_key, update_order_request)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->update_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installment_plan_number** | **str**|  |
 **x_splitit_idempotency_key** | **str**|  |
 **update_order_request** | [**UpdateOrderRequest**](UpdateOrderRequest.md)|  |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[bearer](../README.md#bearer)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_order2**
> InstallmentPlanUpdateResponse update_order2(x_splitit_idempotency_key, installment_plan_update_request_by_identifier)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.installment_plan_update_request_by_identifier import InstallmentPlanUpdateRequestByIdentifier
from splitit_client.model.failed_response import FailedResponse
from splitit_client.model.installment_plan_update_response import InstallmentPlanUpdateResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 
    installment_plan_update_request_by_identifier = InstallmentPlanUpdateRequestByIdentifier(None) # InstallmentPlanUpdateRequestByIdentifier | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_order2(x_splitit_idempotency_key, installment_plan_update_request_by_identifier)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->update_order2: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_splitit_idempotency_key** | **str**|  |
 **installment_plan_update_request_by_identifier** | [**InstallmentPlanUpdateRequestByIdentifier**](InstallmentPlanUpdateRequestByIdentifier.md)|  |

### Return type

[**InstallmentPlanUpdateResponse**](InstallmentPlanUpdateResponse.md)

### Authorization

[bearer](../README.md#bearer)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_authorization**
> VerifyAuthorizationResponse verify_authorization(installment_plan_number, x_splitit_idempotency_key)



### Example

* OAuth Authentication (bearer):

```python
import time
import splitit_client
from splitit_client.api import installment_plan_api
from splitit_client.model.verify_authorization_response import VerifyAuthorizationResponse
from splitit_client.model.failed_response import FailedResponse
from pprint import pprint
# Defining the host is optional and defaults to https://web-api-v3.sandbox.splitit.com
# See configuration.py for a list of all supported configuration parameters.
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: bearer
configuration = splitit_client.Configuration(
    host = "https://web-api-v3.sandbox.splitit.com"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with splitit_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = installment_plan_api.InstallmentPlanApi(api_client)
    installment_plan_number = "installmentPlanNumber_example" # str | 
    x_splitit_idempotency_key = "X-Splitit-IdempotencyKey_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.verify_authorization(installment_plan_number, x_splitit_idempotency_key)
        pprint(api_response)
    except splitit_client.ApiException as e:
        print("Exception when calling InstallmentPlanApi->verify_authorization: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installment_plan_number** | **str**|  |
 **x_splitit_idempotency_key** | **str**|  |

### Return type

[**VerifyAuthorizationResponse**](VerifyAuthorizationResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |
**401** |  |  -  |
**403** |  |  -  |
**404** |  |  -  |
**500** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

