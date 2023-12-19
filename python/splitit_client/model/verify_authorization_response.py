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


class VerifyAuthorizationResponse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "IsAuthorized",
        }
        
        class properties:
            IsAuthorized = schemas.BoolSchema
            AuthorizationAmount = schemas.NumberSchema
        
            @staticmethod
            def Authorization() -> typing.Type['AuthorizationModel']:
                return AuthorizationModel
            __annotations__ = {
                "IsAuthorized": IsAuthorized,
                "AuthorizationAmount": AuthorizationAmount,
                "Authorization": Authorization,
            }
    
    IsAuthorized: MetaOapg.properties.IsAuthorized
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["IsAuthorized"]) -> MetaOapg.properties.IsAuthorized: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["AuthorizationAmount"]) -> MetaOapg.properties.AuthorizationAmount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Authorization"]) -> 'AuthorizationModel': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["IsAuthorized", "AuthorizationAmount", "Authorization", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["IsAuthorized"]) -> MetaOapg.properties.IsAuthorized: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["AuthorizationAmount"]) -> typing.Union[MetaOapg.properties.AuthorizationAmount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Authorization"]) -> typing.Union['AuthorizationModel', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["IsAuthorized", "AuthorizationAmount", "Authorization", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        IsAuthorized: typing.Union[MetaOapg.properties.IsAuthorized, bool, ],
        AuthorizationAmount: typing.Union[MetaOapg.properties.AuthorizationAmount, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        Authorization: typing.Union['AuthorizationModel', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'VerifyAuthorizationResponse':
        return super().__new__(
            cls,
            *args,
            IsAuthorized=IsAuthorized,
            AuthorizationAmount=AuthorizationAmount,
            Authorization=Authorization,
            _configuration=_configuration,
            **kwargs,
        )

from splitit_client.model.authorization_model import AuthorizationModel
