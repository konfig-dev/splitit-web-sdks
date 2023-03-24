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


class TestModes(
    schemas.EnumBase,
    schemas.StrSchema
):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """


    class MetaOapg:
        enum_value_to_name = {
            "None": "NONE",
            "Regular": "REGULAR",
            "Fast": "FAST",
            "Automation": "AUTOMATION",
        }
    
    @schemas.classproperty
    def NONE(cls):
        return cls("None")
    
    @schemas.classproperty
    def REGULAR(cls):
        return cls("Regular")
    
    @schemas.classproperty
    def FAST(cls):
        return cls("Fast")
    
    @schemas.classproperty
    def AUTOMATION(cls):
        return cls("Automation")
