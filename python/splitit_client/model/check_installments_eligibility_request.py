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


class CheckInstallmentsEligibilityRequest(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def PlanData() -> typing.Type['PlanData']:
                return PlanData
        
            @staticmethod
            def CardDetails() -> typing.Type['CardData']:
                return CardData
        
            @staticmethod
            def BillingAddress() -> typing.Type['AddressData']:
                return AddressData
            __annotations__ = {
                "PlanData": PlanData,
                "CardDetails": CardDetails,
                "BillingAddress": BillingAddress,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["PlanData"]) -> 'PlanData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["CardDetails"]) -> 'CardData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["BillingAddress"]) -> 'AddressData': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["PlanData", "CardDetails", "BillingAddress", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["PlanData"]) -> typing.Union['PlanData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["CardDetails"]) -> typing.Union['CardData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["BillingAddress"]) -> typing.Union['AddressData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["PlanData", "CardDetails", "BillingAddress", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        PlanData: typing.Union['PlanData', schemas.Unset] = schemas.unset,
        CardDetails: typing.Union['CardData', schemas.Unset] = schemas.unset,
        BillingAddress: typing.Union['AddressData', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'CheckInstallmentsEligibilityRequest':
        return super().__new__(
            cls,
            *args,
            PlanData=PlanData,
            CardDetails=CardDetails,
            BillingAddress=BillingAddress,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.address_data import AddressData
from splitit_client.model.card_brand import CardBrand
from splitit_client.model.card_data import CardData
from splitit_client.model.card_type import CardType
from splitit_client.model.plan_data import PlanData
from splitit_client.model.plan_data_allowed_installment_options import PlanDataAllowedInstallmentOptions
from splitit_client.model.plan_data_tags import PlanDataTags
from splitit_client.model.processing_data2 import ProcessingData2
from splitit_client.model.purchase_method import PurchaseMethod
from splitit_client.model.three_ds_data2 import ThreeDSData2
