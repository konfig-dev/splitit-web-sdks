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


class InitiatePlanResponse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "Status",
        }
        
        class properties:
        
            @staticmethod
            def Status() -> typing.Type['PlanStatus']:
                return PlanStatus
            InstallmentPlanNumber = schemas.StrSchema
            RefOrderNumber = schemas.StrSchema
        
            @staticmethod
            def PurchaseMethod() -> typing.Type['PurchaseMethod']:
                return PurchaseMethod
            Currency = schemas.StrSchema
            Amount = schemas.NumberSchema
        
            @staticmethod
            def ExtendedParams() -> typing.Type['InitiatePlanResponseExtendedParams']:
                return InitiatePlanResponseExtendedParams
        
            @staticmethod
            def Shopper() -> typing.Type['ShopperData']:
                return ShopperData
        
            @staticmethod
            def BillingAddress() -> typing.Type['AddressData']:
                return AddressData
            CheckoutUrl = schemas.StrSchema
            __annotations__ = {
                "Status": Status,
                "InstallmentPlanNumber": InstallmentPlanNumber,
                "RefOrderNumber": RefOrderNumber,
                "PurchaseMethod": PurchaseMethod,
                "Currency": Currency,
                "Amount": Amount,
                "ExtendedParams": ExtendedParams,
                "Shopper": Shopper,
                "BillingAddress": BillingAddress,
                "CheckoutUrl": CheckoutUrl,
            }
    
    Status: 'PlanStatus'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Status"]) -> 'PlanStatus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["InstallmentPlanNumber"]) -> MetaOapg.properties.InstallmentPlanNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["RefOrderNumber"]) -> MetaOapg.properties.RefOrderNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["PurchaseMethod"]) -> 'PurchaseMethod': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Currency"]) -> MetaOapg.properties.Currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Amount"]) -> MetaOapg.properties.Amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ExtendedParams"]) -> 'InitiatePlanResponseExtendedParams': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Shopper"]) -> 'ShopperData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["BillingAddress"]) -> 'AddressData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["CheckoutUrl"]) -> MetaOapg.properties.CheckoutUrl: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["Status", "InstallmentPlanNumber", "RefOrderNumber", "PurchaseMethod", "Currency", "Amount", "ExtendedParams", "Shopper", "BillingAddress", "CheckoutUrl", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Status"]) -> 'PlanStatus': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["InstallmentPlanNumber"]) -> typing.Union[MetaOapg.properties.InstallmentPlanNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["RefOrderNumber"]) -> typing.Union[MetaOapg.properties.RefOrderNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["PurchaseMethod"]) -> typing.Union['PurchaseMethod', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Currency"]) -> typing.Union[MetaOapg.properties.Currency, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Amount"]) -> typing.Union[MetaOapg.properties.Amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ExtendedParams"]) -> typing.Union['InitiatePlanResponseExtendedParams', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Shopper"]) -> typing.Union['ShopperData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["BillingAddress"]) -> typing.Union['AddressData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["CheckoutUrl"]) -> typing.Union[MetaOapg.properties.CheckoutUrl, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["Status", "InstallmentPlanNumber", "RefOrderNumber", "PurchaseMethod", "Currency", "Amount", "ExtendedParams", "Shopper", "BillingAddress", "CheckoutUrl", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        Status: 'PlanStatus',
        InstallmentPlanNumber: typing.Union[MetaOapg.properties.InstallmentPlanNumber, str, schemas.Unset] = schemas.unset,
        RefOrderNumber: typing.Union[MetaOapg.properties.RefOrderNumber, str, schemas.Unset] = schemas.unset,
        PurchaseMethod: typing.Union['PurchaseMethod', schemas.Unset] = schemas.unset,
        Currency: typing.Union[MetaOapg.properties.Currency, str, schemas.Unset] = schemas.unset,
        Amount: typing.Union[MetaOapg.properties.Amount, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        ExtendedParams: typing.Union['InitiatePlanResponseExtendedParams', schemas.Unset] = schemas.unset,
        Shopper: typing.Union['ShopperData', schemas.Unset] = schemas.unset,
        BillingAddress: typing.Union['AddressData', schemas.Unset] = schemas.unset,
        CheckoutUrl: typing.Union[MetaOapg.properties.CheckoutUrl, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InitiatePlanResponse':
        return super().__new__(
            cls,
            *args,
            Status=Status,
            InstallmentPlanNumber=InstallmentPlanNumber,
            RefOrderNumber=RefOrderNumber,
            PurchaseMethod=PurchaseMethod,
            Currency=Currency,
            Amount=Amount,
            ExtendedParams=ExtendedParams,
            Shopper=Shopper,
            BillingAddress=BillingAddress,
            CheckoutUrl=CheckoutUrl,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.address_data import AddressData
from splitit_client.model.initiate_plan_response_extended_params import InitiatePlanResponseExtendedParams
from splitit_client.model.plan_status import PlanStatus
from splitit_client.model.purchase_method import PurchaseMethod
from splitit_client.model.shopper_data import ShopperData
