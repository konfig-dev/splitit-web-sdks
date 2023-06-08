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

from splitit_client.type.card_data import CardData
from splitit_client.type.payment_method_type import PaymentMethodType

class RequiredPaymentMethodModel(TypedDict):
    Type: PaymentMethodType

class OptionalPaymentMethodModel(TypedDict, total=False):
    Card: CardData

    Token: str

class PaymentMethodModel(RequiredPaymentMethodModel, OptionalPaymentMethodModel):
    pass
