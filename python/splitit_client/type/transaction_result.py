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
from typing_extensions import TypedDict, Literal, TYPE_CHECKING

from splitit_client.type.card_result import CardResult
from splitit_client.type.dispute_status import DisputeStatus
from splitit_client.type.reference_entity_base import ReferenceEntityBase

class RequiredTransactionResult(TypedDict):
    SplititTransactionId: int

    GatewayResult: bool

    GatewayTransactionDate: datetime

    IsChargeback: bool

class OptionalTransactionResult(TypedDict, total=False):
    GatewayTransactionId: str

    SplititGatewayTransactionId: str

    GatewayResultCode: str

    GatewayResultMessage: str

    OperationType: ReferenceEntityBase

    AVSResult: CardResult

    CVCResult: CardResult

    IsInDispute: bool

    DisputeStatus: DisputeStatus

class TransactionResult(RequiredTransactionResult, OptionalTransactionResult):
    pass
