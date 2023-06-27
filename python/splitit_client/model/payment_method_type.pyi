# coding: utf-8

"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from splitit_client import schemas  # noqa: F401


class PaymentMethodType(
    schemas.EnumBase,
    schemas.StrSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    
    @schemas.classproperty
    def CARD(cls):
        return cls("Card")
    
    @schemas.classproperty
    def SPLITIT_TOKEN(cls):
        return cls("SplititToken")
    
    @schemas.classproperty
    def BLUESNAP_VAULTED_SHOPPER_TOKEN(cls):
        return cls("BluesnapVaultedShopperToken")
    
    @schemas.classproperty
    def SPLITIT_MOCKER_V2TOKEN(cls):
        return cls("SplititMockerV2Token")
