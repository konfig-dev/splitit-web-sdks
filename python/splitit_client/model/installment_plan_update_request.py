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


class InstallmentPlanUpdateRequest(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            RefOrderNumber = schemas.StrSchema
            TrackingNumber = schemas.StrSchema
            Capture = schemas.BoolSchema
        
            @staticmethod
            def ShippingStatus() -> typing.Type['ShippingStatus2']:
                return ShippingStatus2
            __annotations__ = {
                "RefOrderNumber": RefOrderNumber,
                "TrackingNumber": TrackingNumber,
                "Capture": Capture,
                "ShippingStatus": ShippingStatus,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["RefOrderNumber"]) -> MetaOapg.properties.RefOrderNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["TrackingNumber"]) -> MetaOapg.properties.TrackingNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Capture"]) -> MetaOapg.properties.Capture: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ShippingStatus"]) -> 'ShippingStatus2': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["RefOrderNumber", "TrackingNumber", "Capture", "ShippingStatus", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["RefOrderNumber"]) -> typing.Union[MetaOapg.properties.RefOrderNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["TrackingNumber"]) -> typing.Union[MetaOapg.properties.TrackingNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Capture"]) -> typing.Union[MetaOapg.properties.Capture, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ShippingStatus"]) -> typing.Union['ShippingStatus2', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["RefOrderNumber", "TrackingNumber", "Capture", "ShippingStatus", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        RefOrderNumber: typing.Union[MetaOapg.properties.RefOrderNumber, str, schemas.Unset] = schemas.unset,
        TrackingNumber: typing.Union[MetaOapg.properties.TrackingNumber, str, schemas.Unset] = schemas.unset,
        Capture: typing.Union[MetaOapg.properties.Capture, bool, schemas.Unset] = schemas.unset,
        ShippingStatus: typing.Union['ShippingStatus2', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InstallmentPlanUpdateRequest':
        return super().__new__(
            cls,
            *args,
            RefOrderNumber=RefOrderNumber,
            TrackingNumber=TrackingNumber,
            Capture=Capture,
            ShippingStatus=ShippingStatus,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.shipping_status2 import ShippingStatus2
