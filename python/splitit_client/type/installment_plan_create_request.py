# coding: utf-8

"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal, TYPE_CHECKING

from splitit_client.type.address_data_model import AddressDataModel
from splitit_client.type.events_endpoints_model import EventsEndpointsModel
from splitit_client.type.payment_method_model import PaymentMethodModel
from splitit_client.type.plan_data_model import PlanDataModel
from splitit_client.type.processing_data import ProcessingData
from splitit_client.type.redirection_endpoints_model import RedirectionEndpointsModel
from splitit_client.type.shopper_data import ShopperData

class RequiredInstallmentPlanCreateRequest(TypedDict):
    AutoCapture: bool

    TermsAndConditionsAccepted: bool

class OptionalInstallmentPlanCreateRequest(TypedDict, total=False):
    Attempt3dSecure: bool

    Shopper: ShopperData

    PlanData: PlanDataModel

    BillingAddress: AddressDataModel

    PaymentMethod: PaymentMethodModel

    RedirectUrls: RedirectionEndpointsModel

    ProcessingData: ProcessingData

    EventsEndpoints: EventsEndpointsModel

class InstallmentPlanCreateRequest(RequiredInstallmentPlanCreateRequest, OptionalInstallmentPlanCreateRequest):
    pass
