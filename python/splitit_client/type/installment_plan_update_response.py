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

from splitit_client.type.plan_status import PlanStatus
from splitit_client.type.shipping_status import ShippingStatus

class RequiredInstallmentPlanUpdateResponse(TypedDict):
    Status: PlanStatus

    ShippingStatus: ShippingStatus

class OptionalInstallmentPlanUpdateResponse(TypedDict, total=False):
    RefOrderNumber: str

    InstallmentPlanNumber: str

    NewAmount: typing.Union[int, float]

class InstallmentPlanUpdateResponse(RequiredInstallmentPlanUpdateResponse, OptionalInstallmentPlanUpdateResponse):
    pass
