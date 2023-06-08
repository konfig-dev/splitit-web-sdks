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


class RequiredAddressDataModel(TypedDict):
    pass

class OptionalAddressDataModel(TypedDict, total=False):
    AddressLine1: str

    AddressLine2: str

    City: str

    Country: str

    State: str

    Zip: str

class AddressDataModel(RequiredAddressDataModel, OptionalAddressDataModel):
    pass
