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

from splitit_client.type.address_data2 import AddressData2
from splitit_client.type.reference_entity_base import ReferenceEntityBase

class RequiredCardData2(TypedDict):
    pass

class OptionalCardData2(TypedDict, total=False):
    CardId: str

    CardNumber: str

    CardExpMonth: str

    CardExpYear: str

    CardBrand: ReferenceEntityBase

    CardType: ReferenceEntityBase

    Bin: str

    CardHolderFullName: str

    CardCvv: str

    Address: AddressData2

    Token: str

class CardData2(RequiredCardData2, OptionalCardData2):
    pass
