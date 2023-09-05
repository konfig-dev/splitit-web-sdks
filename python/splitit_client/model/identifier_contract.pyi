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


class IdentifierContract(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            RefOrderNumber = schemas.StrSchema
            InstallmentPlanNumber = schemas.StrSchema
        
            @staticmethod
            def ExtendedParams() -> typing.Type['IdentifierContractExtendedParams']:
                return IdentifierContractExtendedParams
            __annotations__ = {
                "RefOrderNumber": RefOrderNumber,
                "InstallmentPlanNumber": InstallmentPlanNumber,
                "ExtendedParams": ExtendedParams,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["RefOrderNumber"]) -> MetaOapg.properties.RefOrderNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["InstallmentPlanNumber"]) -> MetaOapg.properties.InstallmentPlanNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ExtendedParams"]) -> 'IdentifierContractExtendedParams': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["RefOrderNumber", "InstallmentPlanNumber", "ExtendedParams", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["RefOrderNumber"]) -> typing.Union[MetaOapg.properties.RefOrderNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["InstallmentPlanNumber"]) -> typing.Union[MetaOapg.properties.InstallmentPlanNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ExtendedParams"]) -> typing.Union['IdentifierContractExtendedParams', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["RefOrderNumber", "InstallmentPlanNumber", "ExtendedParams", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        RefOrderNumber: typing.Union[MetaOapg.properties.RefOrderNumber, str, schemas.Unset] = schemas.unset,
        InstallmentPlanNumber: typing.Union[MetaOapg.properties.InstallmentPlanNumber, str, schemas.Unset] = schemas.unset,
        ExtendedParams: typing.Union['IdentifierContractExtendedParams', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'IdentifierContract':
        return super().__new__(
            cls,
            *args,
            RefOrderNumber=RefOrderNumber,
            InstallmentPlanNumber=InstallmentPlanNumber,
            ExtendedParams=ExtendedParams,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.identifier_contract_extended_params import IdentifierContractExtendedParams
