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


class PaymentMethodModel(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "Type",
        }
        
        class properties:
        
            @staticmethod
            def Type() -> typing.Type['PaymentMethodType']:
                return PaymentMethodType
        
            @staticmethod
            def Card() -> typing.Type['CardData']:
                return CardData
            Token = schemas.StrSchema
            __annotations__ = {
                "Type": Type,
                "Card": Card,
                "Token": Token,
            }
    
    Type: 'PaymentMethodType'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Type"]) -> 'PaymentMethodType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Card"]) -> 'CardData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Token"]) -> MetaOapg.properties.Token: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["Type", "Card", "Token", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Type"]) -> 'PaymentMethodType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Card"]) -> typing.Union['CardData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Token"]) -> typing.Union[MetaOapg.properties.Token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["Type", "Card", "Token", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        Type: 'PaymentMethodType',
        Card: typing.Union['CardData', schemas.Unset] = schemas.unset,
        Token: typing.Union[MetaOapg.properties.Token, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'PaymentMethodModel':
        return super().__new__(
            cls,
            *args,
            Type=Type,
            Card=Card,
            Token=Token,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.card_data import CardData
from splitit_client.model.payment_method_type import PaymentMethodType
