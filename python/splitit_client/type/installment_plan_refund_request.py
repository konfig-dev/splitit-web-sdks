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

from splitit_client.type.refund_strategy import RefundStrategy

class RequiredInstallmentPlanRefundRequest(TypedDict):
    Amount: typing.Union[int, float]

class OptionalInstallmentPlanRefundRequest(TypedDict, total=False):
    RefundStrategy: RefundStrategy

class InstallmentPlanRefundRequest(RequiredInstallmentPlanRefundRequest, OptionalInstallmentPlanRefundRequest):
    pass
