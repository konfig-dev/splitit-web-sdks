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


class InstallmentPlanInitiateRequest(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "AutoCapture",
            "Attempt3dSecure",
        }
        
        class properties:
            AutoCapture = schemas.BoolSchema
            Attempt3dSecure = schemas.BoolSchema
        
            @staticmethod
            def Shopper() -> typing.Type['ShopperData']:
                return ShopperData
        
            @staticmethod
            def PlanData() -> typing.Type['PlanDataModel']:
                return PlanDataModel
        
            @staticmethod
            def BillingAddress() -> typing.Type['AddressDataModel']:
                return AddressDataModel
        
            @staticmethod
            def RedirectUrls() -> typing.Type['InitiateRedirectionEndpointsModel']:
                return InitiateRedirectionEndpointsModel
            __annotations__ = {
                "AutoCapture": AutoCapture,
                "Attempt3dSecure": Attempt3dSecure,
                "Shopper": Shopper,
                "PlanData": PlanData,
                "BillingAddress": BillingAddress,
                "RedirectUrls": RedirectUrls,
            }
    
    AutoCapture: MetaOapg.properties.AutoCapture
    Attempt3dSecure: MetaOapg.properties.Attempt3dSecure
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["AutoCapture"]) -> MetaOapg.properties.AutoCapture: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Attempt3dSecure"]) -> MetaOapg.properties.Attempt3dSecure: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Shopper"]) -> 'ShopperData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["PlanData"]) -> 'PlanDataModel': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["BillingAddress"]) -> 'AddressDataModel': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["RedirectUrls"]) -> 'InitiateRedirectionEndpointsModel': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["AutoCapture", "Attempt3dSecure", "Shopper", "PlanData", "BillingAddress", "RedirectUrls", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["AutoCapture"]) -> MetaOapg.properties.AutoCapture: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Attempt3dSecure"]) -> MetaOapg.properties.Attempt3dSecure: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Shopper"]) -> typing.Union['ShopperData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["PlanData"]) -> typing.Union['PlanDataModel', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["BillingAddress"]) -> typing.Union['AddressDataModel', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["RedirectUrls"]) -> typing.Union['InitiateRedirectionEndpointsModel', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["AutoCapture", "Attempt3dSecure", "Shopper", "PlanData", "BillingAddress", "RedirectUrls", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        AutoCapture: typing.Union[MetaOapg.properties.AutoCapture, bool, ],
        Attempt3dSecure: typing.Union[MetaOapg.properties.Attempt3dSecure, bool, ],
        Shopper: typing.Union['ShopperData', schemas.Unset] = schemas.unset,
        PlanData: typing.Union['PlanDataModel', schemas.Unset] = schemas.unset,
        BillingAddress: typing.Union['AddressDataModel', schemas.Unset] = schemas.unset,
        RedirectUrls: typing.Union['InitiateRedirectionEndpointsModel', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InstallmentPlanInitiateRequest':
        return super().__new__(
            cls,
            *args,
            AutoCapture=AutoCapture,
            Attempt3dSecure=Attempt3dSecure,
            Shopper=Shopper,
            PlanData=PlanData,
            BillingAddress=BillingAddress,
            RedirectUrls=RedirectUrls,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.address_data_model import AddressDataModel
from splitit_client.model.initiate_redirection_endpoints_model import InitiateRedirectionEndpointsModel
from splitit_client.model.plan_data_model import PlanDataModel
from splitit_client.model.shopper_data import ShopperData
