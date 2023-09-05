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

from splitit_client.type.plan_data_model_extended_params import PlanDataModelExtendedParams
from splitit_client.type.purchase_method import PurchaseMethod

class RequiredPlanDataModel(TypedDict):
    TotalAmount: typing.Union[int, float]

    PurchaseMethod: PurchaseMethod

class OptionalPlanDataModel(TypedDict, total=False):
    Currency: str

    NumberOfInstallments: int

    TerminalId: str

    RefOrderNumber: str

    ExtendedParams: PlanDataModelExtendedParams

    FirstInstallmentAmount: typing.Union[int, float]

    FirstInstallmentDate: datetime

class PlanDataModel(RequiredPlanDataModel, OptionalPlanDataModel):
    pass
