# splitit-web-python-sdk<a id="splitit-web-python-sdk"></a>

Splitit's Web API


[![PyPI](https://img.shields.io/badge/PyPI-v2.6.4-blue)](https://pypi.org/project/splitit-web-python-sdk/2.6.4)
[![README.md](https://img.shields.io/badge/README-Click%20Here-green)](https://github.com/konfig-dev/splitit-web-sdks/tree/main/python#readme)

## Table of Contents<a id="table-of-contents"></a>

<!-- toc -->

- [Requirements](#requirements)
- [Installation](#installation)
- [Getting Started](#getting-started)
- [Async](#async)
- [Reference](#reference)
  * [`splitit.installment_plan.cancel`](#splititinstallment_plancancel)
  * [`splitit.installment_plan.check_eligibility`](#splititinstallment_plancheck_eligibility)
  * [`splitit.installment_plan.get`](#splititinstallment_planget)
  * [`splitit.installment_plan.post`](#splititinstallment_planpost)
  * [`splitit.installment_plan.post2`](#splititinstallment_planpost2)
  * [`splitit.installment_plan.refund`](#splititinstallment_planrefund)
  * [`splitit.installment_plan.search`](#splititinstallment_plansearch)
  * [`splitit.installment_plan.update_order`](#splititinstallment_planupdate_order)
  * [`splitit.installment_plan.update_order2`](#splititinstallment_planupdate_order2)
  * [`splitit.installment_plan.verify_authorization`](#splititinstallment_planverify_authorization)

<!-- tocstop -->

## Requirements<a id="requirements"></a>

Python >=3.7

## Installation<a id="installation"></a>

```sh
pip install splitit-web-python-sdk==2.6.4
```

## Getting Started<a id="getting-started"></a>

```python
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    client_id="YOUR_CLIENT_ID",
    client_secret="YOUR_CLIENT_SECRET",
)

try:
    cancel_response = splitit.installment_plan.cancel(
        installment_plan_number="installmentPlanNumber_example",
        x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
        x_splitit_touch_point="",
    )
    pprint(cancel_response.body)
    pprint(cancel_response.body["installment_plan_number"])
    pprint(cancel_response.body["installment_plan_response"])
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

## Async<a id="async"></a>

`async` support is available by prepending `a` to any method.

```python
import asyncio
from pprint import pprint
from splitit_client import Splitit, ApiException

splitit = Splitit(
    client_id="YOUR_CLIENT_ID",
    client_secret="YOUR_CLIENT_SECRET",
)


async def main():
    try:
        cancel_response = await splitit.installment_plan.acancel(
            installment_plan_number="installmentPlanNumber_example",
            x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
            x_splitit_touch_point="",
        )
        pprint(cancel_response.body)
        pprint(cancel_response.body["installment_plan_number"])
        pprint(cancel_response.body["installment_plan_response"])
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


## Reference<a id="reference"></a>
### `splitit.installment_plan.cancel`<a id="splititinstallment_plancancel"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
cancel_response = splitit.installment_plan.cancel(
    installment_plan_number="installmentPlanNumber_example",
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### installment_plan_number: `str`<a id="installment_plan_number-str"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentPlanCancelResponse`](./splitit_client/type/installment_plan_cancel_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/{installmentPlanNumber}/cancel` `post`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.check_eligibility`<a id="splititinstallment_plancheck_eligibility"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
check_eligibility_response = splitit.installment_plan.check_eligibility(
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
    plan_data={
        "total_amount": 3.14,
        "number_of_installments": 1,
        "purchase_method": "InStore",
    },
    card_details={
        "card_brand": "Mastercard",
        "card_type": "Credit",
    },
    billing_address={},
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

##### plan_data: [`PlanData`](./splitit_client/type/plan_data.py)<a id="plan_data-plandatasplitit_clienttypeplan_datapy"></a>


##### card_details: [`CardData`](./splitit_client/type/card_data.py)<a id="card_details-carddatasplitit_clienttypecard_datapy"></a>


##### billing_address: [`AddressData`](./splitit_client/type/address_data.py)<a id="billing_address-addressdatasplitit_clienttypeaddress_datapy"></a>


#### ⚙️ Request Body<a id="⚙️-request-body"></a>

[`CheckInstallmentsEligibilityRequest`](./splitit_client/type/check_installments_eligibility_request.py)
#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentsEligibilityResponse`](./splitit_client/type/installments_eligibility_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/check-eligibility` `post`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.get`<a id="splititinstallment_planget"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
get_response = splitit.installment_plan.get(
    installment_plan_number="installmentPlanNumber_example",
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### installment_plan_number: `str`<a id="installment_plan_number-str"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentPlanGetResponse`](./splitit_client/type/installment_plan_get_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/{installmentPlanNumber}` `get`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.post`<a id="splititinstallment_planpost"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
post_response = splitit.installment_plan.post(
    auto_capture=True,
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
    attempt3d_secure=True,
    shopper={},
    plan_data={
        "total_amount": 3.14,
        "purchase_method": "InStore",
    },
    billing_address={},
    redirect_urls={},
    ux_settings={},
    events_endpoints={},
    processing_data={},
    x_splitit_test_mode="None",
    splititclientinfo="string_example",
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### auto_capture: `bool`<a id="auto_capture-bool"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

##### attempt3d_secure: `bool`<a id="attempt3d_secure-bool"></a>

##### shopper: [`ShopperData`](./splitit_client/type/shopper_data.py)<a id="shopper-shopperdatasplitit_clienttypeshopper_datapy"></a>


##### plan_data: [`PlanDataModel`](./splitit_client/type/plan_data_model.py)<a id="plan_data-plandatamodelsplitit_clienttypeplan_data_modelpy"></a>


##### billing_address: [`AddressDataModel`](./splitit_client/type/address_data_model.py)<a id="billing_address-addressdatamodelsplitit_clienttypeaddress_data_modelpy"></a>


##### redirect_urls: [`InitiateRedirectionEndpointsModel`](./splitit_client/type/initiate_redirection_endpoints_model.py)<a id="redirect_urls-initiateredirectionendpointsmodelsplitit_clienttypeinitiate_redirection_endpoints_modelpy"></a>


##### ux_settings: [`UxSettingsModel`](./splitit_client/type/ux_settings_model.py)<a id="ux_settings-uxsettingsmodelsplitit_clienttypeux_settings_modelpy"></a>


##### events_endpoints: [`EventsEndpointsModel`](./splitit_client/type/events_endpoints_model.py)<a id="events_endpoints-eventsendpointsmodelsplitit_clienttypeevents_endpoints_modelpy"></a>


##### processing_data: [`ProcessingData`](./splitit_client/type/processing_data.py)<a id="processing_data-processingdatasplitit_clienttypeprocessing_datapy"></a>


##### x_splitit_test_mode: `str`<a id="x_splitit_test_mode-str"></a>

##### splititclientinfo: `str`<a id="splititclientinfo-str"></a>

#### ⚙️ Request Body<a id="⚙️-request-body"></a>

[`InstallmentPlanInitiateRequest`](./splitit_client/type/installment_plan_initiate_request.py)
#### 🔄 Return<a id="🔄-return"></a>

[`InitiatePlanResponse`](./splitit_client/type/initiate_plan_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/initiate` `post`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.post2`<a id="splititinstallment_planpost2"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
post2_response = splitit.installment_plan.post2(
    auto_capture=True,
    terms_and_conditions_accepted=True,
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
    attempt3d_secure=True,
    shopper={},
    plan_data={
        "total_amount": 3.14,
        "purchase_method": "InStore",
    },
    billing_address={},
    payment_method={
        "type": "Card",
    },
    redirect_urls={},
    processing_data={},
    events_endpoints={},
    x_splitit_test_mode="None",
    splititclientinfo="string_example",
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### auto_capture: `bool`<a id="auto_capture-bool"></a>

##### terms_and_conditions_accepted: `bool`<a id="terms_and_conditions_accepted-bool"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

##### attempt3d_secure: `bool`<a id="attempt3d_secure-bool"></a>

##### shopper: [`ShopperData`](./splitit_client/type/shopper_data.py)<a id="shopper-shopperdatasplitit_clienttypeshopper_datapy"></a>


##### plan_data: [`PlanDataModel`](./splitit_client/type/plan_data_model.py)<a id="plan_data-plandatamodelsplitit_clienttypeplan_data_modelpy"></a>


##### billing_address: [`AddressDataModel`](./splitit_client/type/address_data_model.py)<a id="billing_address-addressdatamodelsplitit_clienttypeaddress_data_modelpy"></a>


##### payment_method: [`PaymentMethodModel`](./splitit_client/type/payment_method_model.py)<a id="payment_method-paymentmethodmodelsplitit_clienttypepayment_method_modelpy"></a>


##### redirect_urls: [`RedirectionEndpointsModel`](./splitit_client/type/redirection_endpoints_model.py)<a id="redirect_urls-redirectionendpointsmodelsplitit_clienttyperedirection_endpoints_modelpy"></a>


##### processing_data: [`ProcessingData`](./splitit_client/type/processing_data.py)<a id="processing_data-processingdatasplitit_clienttypeprocessing_datapy"></a>


##### events_endpoints: [`EventsEndpointsModel`](./splitit_client/type/events_endpoints_model.py)<a id="events_endpoints-eventsendpointsmodelsplitit_clienttypeevents_endpoints_modelpy"></a>


##### x_splitit_test_mode: `str`<a id="x_splitit_test_mode-str"></a>

##### splititclientinfo: `str`<a id="splititclientinfo-str"></a>

#### ⚙️ Request Body<a id="⚙️-request-body"></a>

[`InstallmentPlanCreateRequest`](./splitit_client/type/installment_plan_create_request.py)
#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentPlanCreateResponse`](./splitit_client/type/installment_plan_create_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans` `post`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.refund`<a id="splititinstallment_planrefund"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
refund_response = splitit.installment_plan.refund(
    amount=3.14,
    installment_plan_number="installmentPlanNumber_example",
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
    refund_strategy="FutureInstallmentsFirst",
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### amount: `Union[int, float]`<a id="amount-unionint-float"></a>

##### installment_plan_number: `str`<a id="installment_plan_number-str"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

##### refund_strategy: [`RefundStrategy`](./splitit_client/type/refund_strategy.py)<a id="refund_strategy-refundstrategysplitit_clienttyperefund_strategypy"></a>

#### ⚙️ Request Body<a id="⚙️-request-body"></a>

[`InstallmentPlanRefundRequest`](./splitit_client/type/installment_plan_refund_request.py)
#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentPlanRefundResponse`](./splitit_client/type/installment_plan_refund_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/{installmentPlanNumber}/refund` `post`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.search`<a id="splititinstallment_plansearch"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
search_response = splitit.installment_plan.search(
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
    installment_plan_number="string_example",
    ref_order_number="string_example",
    extended_params={
        "key": "string_example",
    },
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

##### installment_plan_number: `str`<a id="installment_plan_number-str"></a>

##### ref_order_number: `str`<a id="ref_order_number-str"></a>

##### extended_params: [`Dict[str, str]`](./splitit_client/type/.py)<a id="extended_params-dictstr-strsplitit_clienttypepy"></a>

#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentPlanSearchResponse`](./splitit_client/type/installment_plan_search_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/search` `get`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.update_order`<a id="splititinstallment_planupdate_order"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
update_order_response = splitit.installment_plan.update_order(
    installment_plan_number="installmentPlanNumber_example",
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
    tracking_number="string_example",
    ref_order_number="string_example",
    shipping_status="Pending",
    capture=True,
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### installment_plan_number: `str`<a id="installment_plan_number-str"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

##### tracking_number: `str`<a id="tracking_number-str"></a>

##### ref_order_number: `str`<a id="ref_order_number-str"></a>

##### shipping_status: [`ShippingStatus`](./splitit_client/type/shipping_status.py)<a id="shipping_status-shippingstatussplitit_clienttypeshipping_statuspy"></a>

##### capture: `bool`<a id="capture-bool"></a>

#### ⚙️ Request Body<a id="⚙️-request-body"></a>

[`UpdateOrderRequest`](./splitit_client/type/update_order_request.py)
#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentPlanUpdateResponse`](./splitit_client/type/installment_plan_update_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/{installmentPlanNumber}/updateorder` `put`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.update_order2`<a id="splititinstallment_planupdate_order2"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
update_order2_response = splitit.installment_plan.update_order2(
    body=None,
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
    ref_order_number="string_example",
    tracking_number="string_example",
    capture=True,
    shipping_status="Shipped",
    identifier={},
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

##### ref_order_number: `str`<a id="ref_order_number-str"></a>

##### tracking_number: `str`<a id="tracking_number-str"></a>

##### capture: `bool`<a id="capture-bool"></a>

##### shipping_status: [`ShippingStatus2`](./splitit_client/type/shipping_status2.py)<a id="shipping_status-shippingstatus2splitit_clienttypeshipping_status2py"></a>

##### identifier: [`IdentifierContract`](./splitit_client/type/identifier_contract.py)<a id="identifier-identifiercontractsplitit_clienttypeidentifier_contractpy"></a>


#### ⚙️ Request Body<a id="⚙️-request-body"></a>

[`InstallmentPlanUpdateRequestByIdentifier`](./splitit_client/type/installment_plan_update_request_by_identifier.py)
#### 🔄 Return<a id="🔄-return"></a>

[`InstallmentPlanUpdateResponse`](./splitit_client/type/installment_plan_update_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/updateorder` `put`

[🔙 **Back to Table of Contents**](#table-of-contents)

---

### `splitit.installment_plan.verify_authorization`<a id="splititinstallment_planverify_authorization"></a>



#### 🛠️ Usage<a id="🛠️-usage"></a>

```python
verify_authorization_response = splitit.installment_plan.verify_authorization(
    installment_plan_number="installmentPlanNumber_example",
    x_splitit_idempotency_key="X-Splitit-IdempotencyKey_example",
    x_splitit_touch_point="",
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### installment_plan_number: `str`<a id="installment_plan_number-str"></a>

##### x_splitit_idempotency_key: `str`<a id="x_splitit_idempotency_key-str"></a>

##### x_splitit_touch_point: `str`<a id="x_splitit_touch_point-str"></a>

TouchPoint

#### 🔄 Return<a id="🔄-return"></a>

[`VerifyAuthorizationResponse`](./splitit_client/type/verify_authorization_response.py)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/api/installmentplans/{installmentPlanNumber}/verifyauthorization` `get`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


## Author<a id="author"></a>
This Python package is automatically generated by [Konfig](https://konfigthis.com)
