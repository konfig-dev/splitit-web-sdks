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


class RedirectionEndpointsModel(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by Konfig.
    Ref: https://konfigthis.com

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
            AuthorizeSucceeded = schemas.StrSchema
            Succeeded = schemas.StrSchema
            AuthorizeFailed = schemas.StrSchema
            Failed = schemas.StrSchema
            __annotations__ = {
                "AuthorizeSucceeded": AuthorizeSucceeded,
                "Succeeded": Succeeded,
                "AuthorizeFailed": AuthorizeFailed,
                "Failed": Failed,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["AuthorizeSucceeded"]) -> MetaOapg.properties.AuthorizeSucceeded: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Succeeded"]) -> MetaOapg.properties.Succeeded: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["AuthorizeFailed"]) -> MetaOapg.properties.AuthorizeFailed: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Failed"]) -> MetaOapg.properties.Failed: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["AuthorizeSucceeded", "Succeeded", "AuthorizeFailed", "Failed", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["AuthorizeSucceeded"]) -> typing.Union[MetaOapg.properties.AuthorizeSucceeded, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Succeeded"]) -> typing.Union[MetaOapg.properties.Succeeded, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["AuthorizeFailed"]) -> typing.Union[MetaOapg.properties.AuthorizeFailed, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Failed"]) -> typing.Union[MetaOapg.properties.Failed, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["AuthorizeSucceeded", "Succeeded", "AuthorizeFailed", "Failed", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        AuthorizeSucceeded: typing.Union[MetaOapg.properties.AuthorizeSucceeded, str, schemas.Unset] = schemas.unset,
        Succeeded: typing.Union[MetaOapg.properties.Succeeded, str, schemas.Unset] = schemas.unset,
        AuthorizeFailed: typing.Union[MetaOapg.properties.AuthorizeFailed, str, schemas.Unset] = schemas.unset,
        Failed: typing.Union[MetaOapg.properties.Failed, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'RedirectionEndpointsModel':
        return super().__new__(
            cls,
            *args,
            AuthorizeSucceeded=AuthorizeSucceeded,
            Succeeded=Succeeded,
            AuthorizeFailed=AuthorizeFailed,
            Failed=Failed,
            _configuration=_configuration,
            **kwargs,
        )
