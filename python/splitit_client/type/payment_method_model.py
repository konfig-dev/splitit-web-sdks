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

from splitit_client.type.bluesnap_vaulted_shopper_token import BluesnapVaultedShopperToken
from splitit_client.type.card_data import CardData
from splitit_client.type.mocker_shopper_token import MockerShopperToken
from splitit_client.type.payment_method_type import PaymentMethodType
from splitit_client.type.spreedly_token import SpreedlyToken

class RequiredPaymentMethodModel(TypedDict):
    Type: PaymentMethodType

class OptionalPaymentMethodModel(TypedDict, total=False):
    Card: CardData

    Token: str

    BluesnapVaultedShopperToken: BluesnapVaultedShopperToken

    MockerShopperToken: MockerShopperToken

    SpreedlyToken: SpreedlyToken

    CardPAR: str

class PaymentMethodModel(RequiredPaymentMethodModel, OptionalPaymentMethodModel):
    pass
