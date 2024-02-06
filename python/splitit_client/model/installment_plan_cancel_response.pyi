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


class InstallmentPlanCancelResponse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            InstallmentPlanNumber = schemas.StrSchema
        
            @staticmethod
            def installmentPlanResponse() -> typing.Type['InstallmentPlanResponse']:
                return InstallmentPlanResponse
            __annotations__ = {
                "InstallmentPlanNumber": InstallmentPlanNumber,
                "installmentPlanResponse": installmentPlanResponse,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["InstallmentPlanNumber"]) -> MetaOapg.properties.InstallmentPlanNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["installmentPlanResponse"]) -> 'InstallmentPlanResponse': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["InstallmentPlanNumber", "installmentPlanResponse", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["InstallmentPlanNumber"]) -> typing.Union[MetaOapg.properties.InstallmentPlanNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["installmentPlanResponse"]) -> typing.Union['InstallmentPlanResponse', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["InstallmentPlanNumber", "installmentPlanResponse", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        InstallmentPlanNumber: typing.Union[MetaOapg.properties.InstallmentPlanNumber, str, schemas.Unset] = schemas.unset,
        installmentPlanResponse: typing.Union['InstallmentPlanResponse', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InstallmentPlanCancelResponse':
        return super().__new__(
            cls,
            *args,
            InstallmentPlanNumber=InstallmentPlanNumber,
            installmentPlanResponse=installmentPlanResponse,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.installment_plan_response import InstallmentPlanResponse
