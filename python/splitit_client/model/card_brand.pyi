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


class CardBrand(
    schemas.EnumBase,
    schemas.StrSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    
    @schemas.classproperty
    def MASTERCARD(cls):
        return cls("Mastercard")
    
    @schemas.classproperty
    def VISA(cls):
        return cls("Visa")
    
    @schemas.classproperty
    def AMERICAN_EXPRESS(cls):
        return cls("AmericanExpress")
    
    @schemas.classproperty
    def MAESTRO(cls):
        return cls("Maestro")
    
    @schemas.classproperty
    def JCB(cls):
        return cls("JCB")
    
    @schemas.classproperty
    def CUP(cls):
        return cls("CUP")
    
    @schemas.classproperty
    def UPI(cls):
        return cls("UPI")
    
    @schemas.classproperty
    def DISCOVER(cls):
        return cls("Discover")
    
    @schemas.classproperty
    def OTHER(cls):
        return cls("Other")
