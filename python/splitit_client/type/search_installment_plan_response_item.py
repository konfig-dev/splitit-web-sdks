# coding: utf-8

"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal

from splitit_client.type.address_data import AddressData
from splitit_client.type.authorization_model import AuthorizationModel
from splitit_client.type.installment import Installment
from splitit_client.type.links_data import LinksData
from splitit_client.type.payment_method_model import PaymentMethodModel
from splitit_client.type.plan_status import PlanStatus
from splitit_client.type.purchase_method import PurchaseMethod
from splitit_client.type.refund_model import RefundModel
from splitit_client.type.shopper_data import ShopperData

class RequiredSearchInstallmentPlanResponseItem(TypedDict):
    DateCreated: datetime

    Status: PlanStatus

class OptionalSearchInstallmentPlanResponseItem(TypedDict, total=False):
    InstallmentPlanNumber: str

    RefOrderNumber: str

    PurchaseMethod: PurchaseMethod

    Currency: str

    OriginalAmount: typing.Union[int, float]

    Amount: typing.Union[int, float]

    Authorization: AuthorizationModel

    Shopper: ShopperData

    BillingAddress: AddressData

    PaymentMethod: PaymentMethodModel

    ExtendedParams: typing.Dict[str, str]

    Installments: typing.List[Installment]

    Refunds: typing.List[RefundModel]

    Links: LinksData

class SearchInstallmentPlanResponseItem(RequiredSearchInstallmentPlanResponseItem, OptionalSearchInstallmentPlanResponseItem):
    pass
