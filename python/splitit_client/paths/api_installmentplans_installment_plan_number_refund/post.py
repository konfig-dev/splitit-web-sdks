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
from splitit_client.request_before_hook import request_before_hook
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
from splitit_client.model.refund_strategy import RefundStrategy as RefundStrategySchema
from splitit_client.model.installment_plan_refund_response import InstallmentPlanRefundResponse as InstallmentPlanRefundResponseSchema
from splitit_client.model.refund_summary import RefundSummary as RefundSummarySchema
from splitit_client.model.installment_plan_refund_request import InstallmentPlanRefundRequest as InstallmentPlanRefundRequestSchema
from splitit_client.model.error_extended import ErrorExtended as ErrorExtendedSchema

from splitit_client.type.error_extended import ErrorExtended
from splitit_client.type.failed_response import FailedResponse
from splitit_client.type.installment_plan_refund_response import InstallmentPlanRefundResponse
from splitit_client.type.refund_strategy import RefundStrategy
from splitit_client.type.installment_plan_refund_request import InstallmentPlanRefundRequest
from splitit_client.type.refund_summary import RefundSummary

from . import path

# Header params
XSplititIdempotencyKeySchema = schemas.StrSchema
XSplititTouchPointSchema = schemas.StrSchema
RequestRequiredHeaderParams = typing_extensions.TypedDict(
    'RequestRequiredHeaderParams',
    {
        'X-Splitit-IdempotencyKey': typing.Union[XSplititIdempotencyKeySchema, str, ],
        'X-Splitit-TouchPoint': typing.Union[XSplititTouchPointSchema, str, ],
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
request_header_x_splitit_touch_point = api_client.HeaderParameter(
    name="X-Splitit-TouchPoint",
    style=api_client.ParameterStyle.SIMPLE,
    schema=XSplititTouchPointSchema,
    required=True,
)
# Path params
InstallmentPlanNumberSchema = schemas.StrSchema
RequestRequiredPathParams = typing_extensions.TypedDict(
    'RequestRequiredPathParams',
    {
        'installmentPlanNumber': typing.Union[InstallmentPlanNumberSchema, str, ],
    }
)
RequestOptionalPathParams = typing_extensions.TypedDict(
    'RequestOptionalPathParams',
    {
    },
    total=False
)


class RequestPathParams(RequestRequiredPathParams, RequestOptionalPathParams):
    pass


request_path_installment_plan_number = api_client.PathParameter(
    name="installmentPlanNumber",
    style=api_client.ParameterStyle.SIMPLE,
    schema=InstallmentPlanNumberSchema,
    required=True,
)
# body param
SchemaForRequestBodyApplicationJsonPatchjson = InstallmentPlanRefundRequestSchema
SchemaForRequestBodyApplicationJson = InstallmentPlanRefundRequestSchema
SchemaForRequestBodyTextJson = InstallmentPlanRefundRequestSchema
SchemaForRequestBodyApplicationJson = InstallmentPlanRefundRequestSchema


request_body_installment_plan_refund_request = api_client.RequestBody(
    content={
        'application/json-patch+json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJsonPatchjson),
        'application/json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
        'text/json': api_client.MediaType(
            schema=SchemaForRequestBodyTextJson),
        'application/*+json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
    },
    required=True,
)
_auth = [
    'oauth',
]
SchemaFor200ResponseBodyTextPlain = InstallmentPlanRefundResponseSchema
SchemaFor200ResponseBodyApplicationJson = InstallmentPlanRefundResponseSchema
SchemaFor200ResponseBodyTextJson = InstallmentPlanRefundResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: InstallmentPlanRefundResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: InstallmentPlanRefundResponse


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
_status_code_to_response = {
    '200': _response_for_200,
    '401': _response_for_401,
    '403': _response_for_403,
    '404': _response_for_404,
    '500': _response_for_500,
}
_all_accept_content_types = (
    'text/plain',
    'application/json',
    'text/json',
)


class BaseApi(api_client.Api):

    def _refund_mapped_args(
        self,
        amount: typing.Union[int, float],
        installment_plan_number: str,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        refund_strategy: typing.Optional[RefundStrategy] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _header_params = {}
        _path_params = {}
        _body = {}
        if amount is not None:
            _body["Amount"] = amount
        if refund_strategy is not None:
            _body["RefundStrategy"] = refund_strategy
        args.body = _body
        if x_splitit_idempotency_key is not None:
            _header_params["X-Splitit-IdempotencyKey"] = x_splitit_idempotency_key
        if x_splitit_touch_point is not None:
            _header_params["X-Splitit-TouchPoint"] = x_splitit_touch_point
        if installment_plan_number is not None:
            _path_params["installmentPlanNumber"] = installment_plan_number
        args.header = _header_params
        args.path = _path_params
        return args

    async def _arefund_oapg(
        self,
        body: typing.Any = None,
            header_params: typing.Optional[dict] = {},
            path_params: typing.Optional[dict] = {},
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json-patch+json',
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
        self._verify_typed_dict_inputs_oapg(RequestHeaderParams, header_params)
        self._verify_typed_dict_inputs_oapg(RequestPathParams, path_params)
        used_path = path.value
    
        _path_params = {}
        for parameter in (
            request_path_installment_plan_number,
        ):
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)
    
        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)
    
        _headers = HTTPHeaderDict()
        for parameter in (
            request_header_x_splitit_idempotency_key,
            request_header_x_splitit_touch_point,
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
        method = 'post'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_installment_plan_refund_request.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
            timeout=timeout,
        )
    
        if stream:
            if not 200 <= response.http_response.status <= 299:
                body = (await response.http_response.content.read()).decode("utf-8")
                raise exceptions.ApiStreamingException(
                    status=response.http_response.status,
                    reason=response.http_response.reason,
                    body=body,
                )
    
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


    def _refund_oapg(
        self,
        body: typing.Any = None,
            header_params: typing.Optional[dict] = {},
            path_params: typing.Optional[dict] = {},
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json-patch+json',
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
        self._verify_typed_dict_inputs_oapg(RequestHeaderParams, header_params)
        self._verify_typed_dict_inputs_oapg(RequestPathParams, path_params)
        used_path = path.value
    
        _path_params = {}
        for parameter in (
            request_path_installment_plan_number,
        ):
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)
    
        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)
    
        _headers = HTTPHeaderDict()
        for parameter in (
            request_header_x_splitit_idempotency_key,
            request_header_x_splitit_touch_point,
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
        method = 'post'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_installment_plan_refund_request.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
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


class Refund(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def arefund(
        self,
        amount: typing.Union[int, float],
        installment_plan_number: str,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        refund_strategy: typing.Optional[RefundStrategy] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._refund_mapped_args(
            amount=amount,
            installment_plan_number=installment_plan_number,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            refund_strategy=refund_strategy,
        )
        return await self._arefund_oapg(
            body=args.body,
            header_params=args.header,
            path_params=args.path,
        )
    
    def refund(
        self,
        amount: typing.Union[int, float],
        installment_plan_number: str,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        refund_strategy: typing.Optional[RefundStrategy] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._refund_mapped_args(
            amount=amount,
            installment_plan_number=installment_plan_number,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            refund_strategy=refund_strategy,
        )
        return self._refund_oapg(
            body=args.body,
            header_params=args.header,
            path_params=args.path,
        )

class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        amount: typing.Union[int, float],
        installment_plan_number: str,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        refund_strategy: typing.Optional[RefundStrategy] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._refund_mapped_args(
            amount=amount,
            installment_plan_number=installment_plan_number,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            refund_strategy=refund_strategy,
        )
        return await self._arefund_oapg(
            body=args.body,
            header_params=args.header,
            path_params=args.path,
        )
    
    def post(
        self,
        amount: typing.Union[int, float],
        installment_plan_number: str,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        refund_strategy: typing.Optional[RefundStrategy] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._refund_mapped_args(
            amount=amount,
            installment_plan_number=installment_plan_number,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            refund_strategy=refund_strategy,
        )
        return self._refund_oapg(
            body=args.body,
            header_params=args.header,
            path_params=args.path,
        )

