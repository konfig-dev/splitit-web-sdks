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


class SearchInstallmentPlanResponseItem(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "Status",
            "DateCreated",
        }
        
        class properties:
            DateCreated = schemas.DateTimeSchema
        
            @staticmethod
            def Status() -> typing.Type['PlanStatus']:
                return PlanStatus
            InstallmentPlanNumber = schemas.StrSchema
            RefOrderNumber = schemas.StrSchema
        
            @staticmethod
            def PurchaseMethod() -> typing.Type['PurchaseMethod']:
                return PurchaseMethod
            Currency = schemas.StrSchema
            OriginalAmount = schemas.NumberSchema
            Amount = schemas.NumberSchema
        
            @staticmethod
            def Authorization() -> typing.Type['AuthorizationModel']:
                return AuthorizationModel
        
            @staticmethod
            def Shopper() -> typing.Type['ShopperData']:
                return ShopperData
        
            @staticmethod
            def BillingAddress() -> typing.Type['AddressData']:
                return AddressData
        
            @staticmethod
            def PaymentMethod() -> typing.Type['PaymentMethodModel']:
                return PaymentMethodModel
            
            
            class ExtendedParams(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    additional_properties = schemas.StrSchema
                
                def __getitem__(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                def get_item_oapg(self, name: typing.Union[str, ]) -> MetaOapg.additional_properties:
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[MetaOapg.additional_properties, str, ],
                ) -> 'ExtendedParams':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class Installments(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['Installment']:
                        return Installment
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['Installment'], typing.List['Installment']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'Installments':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'Installment':
                    return super().__getitem__(i)
            
            
            class Refunds(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['RefundModel']:
                        return RefundModel
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['RefundModel'], typing.List['RefundModel']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'Refunds':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'RefundModel':
                    return super().__getitem__(i)
        
            @staticmethod
            def Links() -> typing.Type['LinksData']:
                return LinksData
            __annotations__ = {
                "DateCreated": DateCreated,
                "Status": Status,
                "InstallmentPlanNumber": InstallmentPlanNumber,
                "RefOrderNumber": RefOrderNumber,
                "PurchaseMethod": PurchaseMethod,
                "Currency": Currency,
                "OriginalAmount": OriginalAmount,
                "Amount": Amount,
                "Authorization": Authorization,
                "Shopper": Shopper,
                "BillingAddress": BillingAddress,
                "PaymentMethod": PaymentMethod,
                "ExtendedParams": ExtendedParams,
                "Installments": Installments,
                "Refunds": Refunds,
                "Links": Links,
            }
    
    Status: 'PlanStatus'
    DateCreated: MetaOapg.properties.DateCreated
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["DateCreated"]) -> MetaOapg.properties.DateCreated: ...
    
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
    def __getitem__(self, name: typing_extensions.Literal["OriginalAmount"]) -> MetaOapg.properties.OriginalAmount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Amount"]) -> MetaOapg.properties.Amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Authorization"]) -> 'AuthorizationModel': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Shopper"]) -> 'ShopperData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["BillingAddress"]) -> 'AddressData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["PaymentMethod"]) -> 'PaymentMethodModel': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ExtendedParams"]) -> MetaOapg.properties.ExtendedParams: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Installments"]) -> MetaOapg.properties.Installments: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Refunds"]) -> MetaOapg.properties.Refunds: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Links"]) -> 'LinksData': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["DateCreated", "Status", "InstallmentPlanNumber", "RefOrderNumber", "PurchaseMethod", "Currency", "OriginalAmount", "Amount", "Authorization", "Shopper", "BillingAddress", "PaymentMethod", "ExtendedParams", "Installments", "Refunds", "Links", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["DateCreated"]) -> MetaOapg.properties.DateCreated: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["OriginalAmount"]) -> typing.Union[MetaOapg.properties.OriginalAmount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Amount"]) -> typing.Union[MetaOapg.properties.Amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Authorization"]) -> typing.Union['AuthorizationModel', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Shopper"]) -> typing.Union['ShopperData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["BillingAddress"]) -> typing.Union['AddressData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["PaymentMethod"]) -> typing.Union['PaymentMethodModel', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ExtendedParams"]) -> typing.Union[MetaOapg.properties.ExtendedParams, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Installments"]) -> typing.Union[MetaOapg.properties.Installments, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Refunds"]) -> typing.Union[MetaOapg.properties.Refunds, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Links"]) -> typing.Union['LinksData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["DateCreated", "Status", "InstallmentPlanNumber", "RefOrderNumber", "PurchaseMethod", "Currency", "OriginalAmount", "Amount", "Authorization", "Shopper", "BillingAddress", "PaymentMethod", "ExtendedParams", "Installments", "Refunds", "Links", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        Status: 'PlanStatus',
        DateCreated: typing.Union[MetaOapg.properties.DateCreated, str, datetime, ],
        InstallmentPlanNumber: typing.Union[MetaOapg.properties.InstallmentPlanNumber, str, schemas.Unset] = schemas.unset,
        RefOrderNumber: typing.Union[MetaOapg.properties.RefOrderNumber, str, schemas.Unset] = schemas.unset,
        PurchaseMethod: typing.Union['PurchaseMethod', schemas.Unset] = schemas.unset,
        Currency: typing.Union[MetaOapg.properties.Currency, str, schemas.Unset] = schemas.unset,
        OriginalAmount: typing.Union[MetaOapg.properties.OriginalAmount, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        Amount: typing.Union[MetaOapg.properties.Amount, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        Authorization: typing.Union['AuthorizationModel', schemas.Unset] = schemas.unset,
        Shopper: typing.Union['ShopperData', schemas.Unset] = schemas.unset,
        BillingAddress: typing.Union['AddressData', schemas.Unset] = schemas.unset,
        PaymentMethod: typing.Union['PaymentMethodModel', schemas.Unset] = schemas.unset,
        ExtendedParams: typing.Union[MetaOapg.properties.ExtendedParams, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        Installments: typing.Union[MetaOapg.properties.Installments, list, tuple, schemas.Unset] = schemas.unset,
        Refunds: typing.Union[MetaOapg.properties.Refunds, list, tuple, schemas.Unset] = schemas.unset,
        Links: typing.Union['LinksData', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'SearchInstallmentPlanResponseItem':
        return super().__new__(
            cls,
            *args,
            Status=Status,
            DateCreated=DateCreated,
            InstallmentPlanNumber=InstallmentPlanNumber,
            RefOrderNumber=RefOrderNumber,
            PurchaseMethod=PurchaseMethod,
            Currency=Currency,
            OriginalAmount=OriginalAmount,
            Amount=Amount,
            Authorization=Authorization,
            Shopper=Shopper,
            BillingAddress=BillingAddress,
            PaymentMethod=PaymentMethod,
            ExtendedParams=ExtendedParams,
            Installments=Installments,
            Refunds=Refunds,
            Links=Links,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.address_data import AddressData
from splitit_client.model.authorization_model import AuthorizationModel
from splitit_client.model.installment import Installment
from splitit_client.model.links_data import LinksData
from splitit_client.model.payment_method_model import PaymentMethodModel
from splitit_client.model.plan_status import PlanStatus
from splitit_client.model.purchase_method import PurchaseMethod
from splitit_client.model.refund_model import RefundModel
from splitit_client.model.shopper_data import ShopperData
