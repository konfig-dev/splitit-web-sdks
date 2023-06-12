# coding: utf-8

"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
import json
from urllib3._collections import HTTPHeaderDict

from splitit_client.api_response import AsyncGeneratorResponse
from splitit_client import api_client, exceptions
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

from splitit_client.model.failed_response import FailedResponse as FailedResponseSchema
from splitit_client.model.installment_plan_search_response import InstallmentPlanSearchResponse as InstallmentPlanSearchResponseSchema

from splitit_client.type.failed_response import FailedResponse
from splitit_client.type.installment_plan_search_response import InstallmentPlanSearchResponse

# Query params
InstallmentPlanNumberSchema = schemas.StrSchema
RefOrderNumberSchema = schemas.StrSchema


class ExtendedParamsSchema(
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
    ) -> 'ExtendedParamsSchema':
        return super().__new__(
            cls,
            *args,
            _configuration=_configuration,
            **kwargs,
        )
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'installmentPlanNumber': typing.Union[InstallmentPlanNumberSchema, str, ],
        'refOrderNumber': typing.Union[RefOrderNumberSchema, str, ],
        'extendedParams': typing.Union[ExtendedParamsSchema, dict, frozendict.frozendict, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_installment_plan_number = api_client.QueryParameter(
    name="installmentPlanNumber",
    style=api_client.ParameterStyle.FORM,
    schema=InstallmentPlanNumberSchema,
    explode=True,
)
request_query_ref_order_number = api_client.QueryParameter(
    name="refOrderNumber",
    style=api_client.ParameterStyle.FORM,
    schema=RefOrderNumberSchema,
    explode=True,
)
request_query_extended_params = api_client.QueryParameter(
    name="extendedParams",
    style=api_client.ParameterStyle.FORM,
    schema=ExtendedParamsSchema,
    explode=True,
)
# Header params
XSplititIdempotencyKeySchema = schemas.StrSchema
RequestRequiredHeaderParams = typing_extensions.TypedDict(
    'RequestRequiredHeaderParams',
    {
        'X-Splitit-IdempotencyKey': typing.Union[XSplititIdempotencyKeySchema, str, ],
    }
)
RequestOptionalHeaderParams = typing_extensions.TypedDict(
    'RequestOptionalHeaderParams',
    {
    },
    total=False
)


class RequestHeaderParams(RequestRequiredHeaderParams, RequestOptionalHeaderParams):
    pass


request_header_x_splitit_idempotency_key = api_client.HeaderParameter(
    name="X-Splitit-IdempotencyKey",
    style=api_client.ParameterStyle.SIMPLE,
    schema=XSplititIdempotencyKeySchema,
    required=True,
)
SchemaFor200ResponseBodyTextPlain = InstallmentPlanSearchResponseSchema
SchemaFor200ResponseBodyApplicationJson = InstallmentPlanSearchResponseSchema
SchemaFor200ResponseBodyTextJson = InstallmentPlanSearchResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: InstallmentPlanSearchResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: InstallmentPlanSearchResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'text/plain': api_client.MediaType(
            schema=SchemaFor200ResponseBodyTextPlain),
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
        'text/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyTextJson),
    },
)
SchemaFor401ResponseBodyTextPlain = FailedResponseSchema
SchemaFor401ResponseBodyApplicationJson = FailedResponseSchema
SchemaFor401ResponseBodyTextJson = FailedResponseSchema


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: FailedResponse


@dataclass
class ApiResponseFor401Async(api_client.AsyncApiResponse):
    body: FailedResponse


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    response_cls_async=ApiResponseFor401Async,
    content={
        'text/plain': api_client.MediaType(
            schema=SchemaFor401ResponseBodyTextPlain),
        'application/json': api_client.MediaType(
            schema=SchemaFor401ResponseBodyApplicationJson),
        'text/json': api_client.MediaType(
            schema=SchemaFor401ResponseBodyTextJson),
    },
)
SchemaFor403ResponseBodyTextPlain = FailedResponseSchema
SchemaFor403ResponseBodyApplicationJson = FailedResponseSchema
SchemaFor403ResponseBodyTextJson = FailedResponseSchema


@dataclass
class ApiResponseFor403(api_client.ApiResponse):
    body: FailedResponse


@dataclass
class ApiResponseFor403Async(api_client.AsyncApiResponse):
    body: FailedResponse


_response_for_403 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor403,
    response_cls_async=ApiResponseFor403Async,
    content={
        'text/plain': api_client.MediaType(
            schema=SchemaFor403ResponseBodyTextPlain),
        'application/json': api_client.MediaType(
            schema=SchemaFor403ResponseBodyApplicationJson),
        'text/json': api_client.MediaType(
            schema=SchemaFor403ResponseBodyTextJson),
    },
)
SchemaFor404ResponseBodyTextPlain = FailedResponseSchema
SchemaFor404ResponseBodyApplicationJson = FailedResponseSchema
SchemaFor404ResponseBodyTextJson = FailedResponseSchema


@dataclass
class ApiResponseFor404(api_client.ApiResponse):
    body: FailedResponse


@dataclass
class ApiResponseFor404Async(api_client.AsyncApiResponse):
    body: FailedResponse


_response_for_404 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor404,
    response_cls_async=ApiResponseFor404Async,
    content={
        'text/plain': api_client.MediaType(
            schema=SchemaFor404ResponseBodyTextPlain),
        'application/json': api_client.MediaType(
            schema=SchemaFor404ResponseBodyApplicationJson),
        'text/json': api_client.MediaType(
            schema=SchemaFor404ResponseBodyTextJson),
    },
)
SchemaFor500ResponseBodyTextPlain = FailedResponseSchema
SchemaFor500ResponseBodyApplicationJson = FailedResponseSchema
SchemaFor500ResponseBodyTextJson = FailedResponseSchema


@dataclass
class ApiResponseFor500(api_client.ApiResponse):
    body: FailedResponse


@dataclass
class ApiResponseFor500Async(api_client.AsyncApiResponse):
    body: FailedResponse


_response_for_500 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor500,
    response_cls_async=ApiResponseFor500Async,
    content={
        'text/plain': api_client.MediaType(
            schema=SchemaFor500ResponseBodyTextPlain),
        'application/json': api_client.MediaType(
            schema=SchemaFor500ResponseBodyApplicationJson),
        'text/json': api_client.MediaType(
            schema=SchemaFor500ResponseBodyTextJson),
    },
)
_all_accept_content_types = (
    'text/plain',
    'application/json',
    'text/json',
)


class BaseApi(api_client.Api):

    def _search_mapped_args(
        self,
        x_splitit_idempotency_key: str,
        installment_plan_number: typing.Optional[str] = None,
        ref_order_number: typing.Optional[str] = None,
        extended_params: typing.Optional[typing.Dict[str, str]] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _query_params = {}
        _header_params = {}
        if installment_plan_number is not None:
            _query_params["installmentPlanNumber"] = installment_plan_number
        if ref_order_number is not None:
            _query_params["refOrderNumber"] = ref_order_number
        if extended_params is not None:
            _query_params["extendedParams"] = extended_params
        if x_splitit_idempotency_key is not None:
            _header_params["X-Splitit-IdempotencyKey"] = x_splitit_idempotency_key
        args.query = _query_params
        args.header = _header_params
        return args

    async def _asearch_oapg(
        self,
            query_params: typing.Optional[dict] = {},
            header_params: typing.Optional[dict] = {},
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        self._verify_typed_dict_inputs_oapg(RequestHeaderParams, header_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_installment_plan_number,
            request_query_ref_order_number,
            request_query_extended_params,
        ):
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value
    
        _headers = HTTPHeaderDict()
        for parameter in (
            request_header_x_splitit_idempotency_key,
        ):
            parameter_data = header_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _headers.extend(serialized_data)
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method='get'.upper(),
            headers=_headers,
            auth_settings=_auth,
            prefix_separator_iterator=prefix_separator_iterator,
            timeout=timeout,
        )
        
        if stream:
            if not 200 <= response.http_response.status <= 299:
                raise exceptions.ApiStreamingException(status=response.http_response.status, reason=response.http_response.reason)
        
            async def stream_iterator():
                """
                iterates over response.http_response.content and closes connection once iteration has finished
                """
                async for line in response.http_response.content:
                    if line == b'\r\n':
                        continue
                    yield line
                response.http_response.close()
                await response.session.close()
            return AsyncGeneratorResponse(
                content=stream_iterator(),
                headers=response.http_response.headers,
                status=response.http_response.status,
                response=response.http_response
            )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = await response_for_status.deserialize_async(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserializationAsync(
                body=await response.http_response.json() if is_json else await response.http_response.text(),
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        # cleanup session / response
        response.http_response.close()
        await response.session.close()
    
        return api_response

    def _search_oapg(
        self,
            query_params: typing.Optional[dict] = {},
            header_params: typing.Optional[dict] = {},
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        self._verify_typed_dict_inputs_oapg(RequestHeaderParams, header_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_installment_plan_number,
            request_query_ref_order_number,
            request_query_extended_params,
        ):
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value
    
        _headers = HTTPHeaderDict()
        for parameter in (
            request_header_x_splitit_idempotency_key,
        ):
            parameter_data = header_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _headers.extend(serialized_data)
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method='get'.upper(),
            headers=_headers,
            auth_settings=_auth,
            prefix_separator_iterator=prefix_separator_iterator,
            timeout=timeout,
        )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = response_for_status.deserialize(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserialization(
                body=json.loads(response.http_response.data) if is_json else response.http_response.data,
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        return api_response

class Search(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def asearch(
        self,
        x_splitit_idempotency_key: str,
        installment_plan_number: typing.Optional[str] = None,
        ref_order_number: typing.Optional[str] = None,
        extended_params: typing.Optional[typing.Dict[str, str]] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._search_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            installment_plan_number=installment_plan_number,
            ref_order_number=ref_order_number,
            extended_params=extended_params,
        )
        return await self._asearch_oapg(
            query_params=args.query,
            header_params=args.header,
        )
    
    def search(
        self,
        x_splitit_idempotency_key: str,
        installment_plan_number: typing.Optional[str] = None,
        ref_order_number: typing.Optional[str] = None,
        extended_params: typing.Optional[typing.Dict[str, str]] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._search_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            installment_plan_number=installment_plan_number,
            ref_order_number=ref_order_number,
            extended_params=extended_params,
        )
        return self._search_oapg(
            query_params=args.query,
            header_params=args.header,
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
        x_splitit_idempotency_key: str,
        installment_plan_number: typing.Optional[str] = None,
        ref_order_number: typing.Optional[str] = None,
        extended_params: typing.Optional[typing.Dict[str, str]] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._search_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            installment_plan_number=installment_plan_number,
            ref_order_number=ref_order_number,
            extended_params=extended_params,
        )
        return await self._asearch_oapg(
            query_params=args.query,
            header_params=args.header,
        )
    
    def get(
        self,
        x_splitit_idempotency_key: str,
        installment_plan_number: typing.Optional[str] = None,
        ref_order_number: typing.Optional[str] = None,
        extended_params: typing.Optional[typing.Dict[str, str]] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._search_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            installment_plan_number=installment_plan_number,
            ref_order_number=ref_order_number,
            extended_params=extended_params,
        )
        return self._search_oapg(
            query_params=args.query,
            header_params=args.header,
        )

