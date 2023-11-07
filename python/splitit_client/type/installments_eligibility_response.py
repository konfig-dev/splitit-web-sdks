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
from typing_extensions import TypedDict, Literal

from splitit_client.type.links_model import LinksModel
from splitit_client.type.payment_plan_option_model import PaymentPlanOptionModel

class RequiredInstallmentsEligibilityResponse(TypedDict):
    pass

class OptionalInstallmentsEligibilityResponse(TypedDict, total=False):
    InstallmentProvider: str

    PaymentPlanOptions: typing.List[PaymentPlanOptionModel]

class InstallmentsEligibilityResponse(RequiredInstallmentsEligibilityResponse, OptionalInstallmentsEligibilityResponse):
    pass
