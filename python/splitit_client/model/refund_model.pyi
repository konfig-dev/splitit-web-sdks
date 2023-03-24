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


class RefundModel(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "Status",
            "NonCreditRefundAmount",
            "SubmitDate",
            "TotalAmount",
            "CreditRefundAmount",
        }
        
        class properties:
            SubmitDate = schemas.DateTimeSchema
            TotalAmount = schemas.NumberSchema
        
            @staticmethod
            def Status() -> typing.Type['RefundStatus']:
                return RefundStatus
            NonCreditRefundAmount = schemas.NumberSchema
            CreditRefundAmount = schemas.NumberSchema
            RefundId = schemas.StrSchema
            __annotations__ = {
                "SubmitDate": SubmitDate,
                "TotalAmount": TotalAmount,
                "Status": Status,
                "NonCreditRefundAmount": NonCreditRefundAmount,
                "CreditRefundAmount": CreditRefundAmount,
                "RefundId": RefundId,
            }
    
    Status: 'RefundStatus'
    NonCreditRefundAmount: MetaOapg.properties.NonCreditRefundAmount
    SubmitDate: MetaOapg.properties.SubmitDate
    TotalAmount: MetaOapg.properties.TotalAmount
    CreditRefundAmount: MetaOapg.properties.CreditRefundAmount
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["SubmitDate"]) -> MetaOapg.properties.SubmitDate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["TotalAmount"]) -> MetaOapg.properties.TotalAmount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Status"]) -> 'RefundStatus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["NonCreditRefundAmount"]) -> MetaOapg.properties.NonCreditRefundAmount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["CreditRefundAmount"]) -> MetaOapg.properties.CreditRefundAmount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["RefundId"]) -> MetaOapg.properties.RefundId: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["SubmitDate", "TotalAmount", "Status", "NonCreditRefundAmount", "CreditRefundAmount", "RefundId", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["SubmitDate"]) -> MetaOapg.properties.SubmitDate: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["TotalAmount"]) -> MetaOapg.properties.TotalAmount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Status"]) -> 'RefundStatus': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["NonCreditRefundAmount"]) -> MetaOapg.properties.NonCreditRefundAmount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["CreditRefundAmount"]) -> MetaOapg.properties.CreditRefundAmount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["RefundId"]) -> typing.Union[MetaOapg.properties.RefundId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["SubmitDate", "TotalAmount", "Status", "NonCreditRefundAmount", "CreditRefundAmount", "RefundId", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        Status: 'RefundStatus',
        NonCreditRefundAmount: typing.Union[MetaOapg.properties.NonCreditRefundAmount, decimal.Decimal, int, float, ],
        SubmitDate: typing.Union[MetaOapg.properties.SubmitDate, str, datetime, ],
        TotalAmount: typing.Union[MetaOapg.properties.TotalAmount, decimal.Decimal, int, float, ],
        CreditRefundAmount: typing.Union[MetaOapg.properties.CreditRefundAmount, decimal.Decimal, int, float, ],
        RefundId: typing.Union[MetaOapg.properties.RefundId, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'RefundModel':
        return super().__new__(
            cls,
            *args,
            Status=Status,
            NonCreditRefundAmount=NonCreditRefundAmount,
            SubmitDate=SubmitDate,
            TotalAmount=TotalAmount,
            CreditRefundAmount=CreditRefundAmount,
            RefundId=RefundId,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.refund_status import RefundStatus
