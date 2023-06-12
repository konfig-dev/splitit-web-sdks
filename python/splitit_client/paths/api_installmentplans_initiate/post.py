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

from splitit_client.model.installment_plan_initiate_request import InstallmentPlanInitiateRequest as InstallmentPlanInitiateRequestSchema
from splitit_client.model.plan_error_response import PlanErrorResponse as PlanErrorResponseSchema
from splitit_client.model.failed_response import FailedResponse as FailedResponseSchema
from splitit_client.model.initiate_redirection_endpoints_model import InitiateRedirectionEndpointsModel as InitiateRedirectionEndpointsModelSchema
from splitit_client.model.address_data_model import AddressDataModel as AddressDataModelSchema
from splitit_client.model.plan_data_model import PlanDataModel as PlanDataModelSchema
from splitit_client.model.events_endpoints_model import EventsEndpointsModel as EventsEndpointsModelSchema
from splitit_client.model.ux_settings_model import UxSettingsModel as UxSettingsModelSchema
from splitit_client.model.initiate_plan_response import InitiatePlanResponse as InitiatePlanResponseSchema
from splitit_client.model.shopper_data import ShopperData as ShopperDataSchema

from splitit_client.type.failed_response import FailedResponse
from splitit_client.type.initiate_redirection_endpoints_model import InitiateRedirectionEndpointsModel
from splitit_client.type.address_data_model import AddressDataModel
from splitit_client.type.installment_plan_initiate_request import InstallmentPlanInitiateRequest
from splitit_client.type.plan_error_response import PlanErrorResponse
from splitit_client.type.events_endpoints_model import EventsEndpointsModel
from splitit_client.type.initiate_plan_response import InitiatePlanResponse
from splitit_client.type.plan_data_model import PlanDataModel
from splitit_client.type.ux_settings_model import UxSettingsModel
from splitit_client.type.shopper_data import ShopperData

from . import path

# Header params


class XSplititTestModeSchema(
    schemas.EnumBase,
    schemas.StrSchema
):


    class MetaOapg:
        enum_value_to_name = {
            "None": "NONE",
            "Regular": "REGULAR",
            "Fast": "FAST",
            "Automation": "AUTOMATION",
        }
    
    @schemas.classproperty
    def NONE(cls):
        return cls("None")
    
    @schemas.classproperty
    def REGULAR(cls):
        return cls("Regular")
    
    @schemas.classproperty
    def FAST(cls):
        return cls("Fast")
    
    @schemas.classproperty
    def AUTOMATION(cls):
        return cls("Automation")
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
        'X-Splitit-TestMode': typing.Union[XSplititTestModeSchema, str, ],
    },
    total=False
)


class RequestHeaderParams(RequestRequiredHeaderParams, RequestOptionalHeaderParams):
    pass


request_header_x_splitit_test_mode = api_client.HeaderParameter(
    name="X-Splitit-TestMode",
    style=api_client.ParameterStyle.SIMPLE,
    schema=XSplititTestModeSchema,
)
request_header_x_splitit_idempotency_key = api_client.HeaderParameter(
    name="X-Splitit-IdempotencyKey",
    style=api_client.ParameterStyle.SIMPLE,
    schema=XSplititIdempotencyKeySchema,
    required=True,
)
# body param
SchemaForRequestBodyApplicationJsonPatchjson = InstallmentPlanInitiateRequestSchema
SchemaForRequestBodyApplicationJson = InstallmentPlanInitiateRequestSchema
SchemaForRequestBodyTextJson = InstallmentPlanInitiateRequestSchema
SchemaForRequestBodyApplicationJson = InstallmentPlanInitiateRequestSchema


request_body_installment_plan_initiate_request = api_client.RequestBody(
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
SchemaFor200ResponseBodyTextPlain = InitiatePlanResponseSchema
SchemaFor200ResponseBodyApplicationJson = InitiatePlanResponseSchema
SchemaFor200ResponseBodyTextJson = InitiatePlanResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: InitiatePlanResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: InitiatePlanResponse


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
SchemaFor400ResponseBodyTextPlain = PlanErrorResponseSchema
SchemaFor400ResponseBodyApplicationJson = PlanErrorResponseSchema
SchemaFor400ResponseBodyTextJson = PlanErrorResponseSchema


@dataclass
class ApiResponseFor400(api_client.ApiResponse):
    body: PlanErrorResponse


@dataclass
class ApiResponseFor400Async(api_client.AsyncApiResponse):
    body: PlanErrorResponse


_response_for_400 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor400,
    response_cls_async=ApiResponseFor400Async,
    content={
        'text/plain': api_client.MediaType(
            schema=SchemaFor400ResponseBodyTextPlain),
        'application/json': api_client.MediaType(
            schema=SchemaFor400ResponseBodyApplicationJson),
        'text/json': api_client.MediaType(
            schema=SchemaFor400ResponseBodyTextJson),
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
    '400': _response_for_400,
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

    def _post_mapped_args(
        self,
        auto_capture: bool,
        x_splitit_idempotency_key: str,
        attempt3d_secure: typing.Optional[bool] = None,
        shopper: typing.Optional[ShopperData] = None,
        plan_data: typing.Optional[PlanDataModel] = None,
        billing_address: typing.Optional[AddressDataModel] = None,
        redirect_urls: typing.Optional[InitiateRedirectionEndpointsModel] = None,
        ux_settings: typing.Optional[UxSettingsModel] = None,
        events_endpoints: typing.Optional[EventsEndpointsModel] = None,
        x_splitit_test_mode: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _header_params = {}
        _body = {}
        if auto_capture is not None:
            _body["AutoCapture"] = auto_capture
        if attempt3d_secure is not None:
            _body["Attempt3dSecure"] = attempt3d_secure
        if shopper is not None:
            _body["Shopper"] = shopper
        if plan_data is not None:
            _body["PlanData"] = plan_data
        if billing_address is not None:
            _body["BillingAddress"] = billing_address
        if redirect_urls is not None:
            _body["RedirectUrls"] = redirect_urls
        if ux_settings is not None:
            _body["UxSettings"] = ux_settings
        if events_endpoints is not None:
            _body["EventsEndpoints"] = events_endpoints
        args.body = _body
        if x_splitit_test_mode is not None:
            _header_params["X-Splitit-TestMode"] = x_splitit_test_mode
        if x_splitit_idempotency_key is not None:
            _header_params["X-Splitit-IdempotencyKey"] = x_splitit_idempotency_key
        args.header = _header_params
        return args

    async def _apost_oapg(
        self,
        body: typing.Any = None,
            header_params: typing.Optional[dict] = {},
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
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        for parameter in (
            request_header_x_splitit_test_mode,
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
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        serialized_data = request_body_installment_plan_initiate_request.serialize(body, content_type)
        _headers.add('Content-Type', content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method='post'.upper(),
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
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

    def _post_oapg(
        self,
        body: typing.Any = None,
            header_params: typing.Optional[dict] = {},
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
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        for parameter in (
            request_header_x_splitit_test_mode,
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
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        serialized_data = request_body_installment_plan_initiate_request.serialize(body, content_type)
        _headers.add('Content-Type', content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']    
        response = self.api_client.call_api(
            resource_path=used_path,
            method='post'.upper(),
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

class Post(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def apost(
        self,
        auto_capture: bool,
        x_splitit_idempotency_key: str,
        attempt3d_secure: typing.Optional[bool] = None,
        shopper: typing.Optional[ShopperData] = None,
        plan_data: typing.Optional[PlanDataModel] = None,
        billing_address: typing.Optional[AddressDataModel] = None,
        redirect_urls: typing.Optional[InitiateRedirectionEndpointsModel] = None,
        ux_settings: typing.Optional[UxSettingsModel] = None,
        events_endpoints: typing.Optional[EventsEndpointsModel] = None,
        x_splitit_test_mode: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._post_mapped_args(
            auto_capture=auto_capture,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            attempt3d_secure=attempt3d_secure,
            shopper=shopper,
            plan_data=plan_data,
            billing_address=billing_address,
            redirect_urls=redirect_urls,
            ux_settings=ux_settings,
            events_endpoints=events_endpoints,
            x_splitit_test_mode=x_splitit_test_mode,
        )
        return await self._apost_oapg(
            body=args.body,
            header_params=args.header,
        )
    
    def post(
        self,
        auto_capture: bool,
        x_splitit_idempotency_key: str,
        attempt3d_secure: typing.Optional[bool] = None,
        shopper: typing.Optional[ShopperData] = None,
        plan_data: typing.Optional[PlanDataModel] = None,
        billing_address: typing.Optional[AddressDataModel] = None,
        redirect_urls: typing.Optional[InitiateRedirectionEndpointsModel] = None,
        ux_settings: typing.Optional[UxSettingsModel] = None,
        events_endpoints: typing.Optional[EventsEndpointsModel] = None,
        x_splitit_test_mode: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._post_mapped_args(
            auto_capture=auto_capture,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            attempt3d_secure=attempt3d_secure,
            shopper=shopper,
            plan_data=plan_data,
            billing_address=billing_address,
            redirect_urls=redirect_urls,
            ux_settings=ux_settings,
            events_endpoints=events_endpoints,
            x_splitit_test_mode=x_splitit_test_mode,
        )
        return self._post_oapg(
            body=args.body,
            header_params=args.header,
        )

class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        auto_capture: bool,
        x_splitit_idempotency_key: str,
        attempt3d_secure: typing.Optional[bool] = None,
        shopper: typing.Optional[ShopperData] = None,
        plan_data: typing.Optional[PlanDataModel] = None,
        billing_address: typing.Optional[AddressDataModel] = None,
        redirect_urls: typing.Optional[InitiateRedirectionEndpointsModel] = None,
        ux_settings: typing.Optional[UxSettingsModel] = None,
        events_endpoints: typing.Optional[EventsEndpointsModel] = None,
        x_splitit_test_mode: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._post_mapped_args(
            auto_capture=auto_capture,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            attempt3d_secure=attempt3d_secure,
            shopper=shopper,
            plan_data=plan_data,
            billing_address=billing_address,
            redirect_urls=redirect_urls,
            ux_settings=ux_settings,
            events_endpoints=events_endpoints,
            x_splitit_test_mode=x_splitit_test_mode,
        )
        return await self._apost_oapg(
            body=args.body,
            header_params=args.header,
        )
    
    def post(
        self,
        auto_capture: bool,
        x_splitit_idempotency_key: str,
        attempt3d_secure: typing.Optional[bool] = None,
        shopper: typing.Optional[ShopperData] = None,
        plan_data: typing.Optional[PlanDataModel] = None,
        billing_address: typing.Optional[AddressDataModel] = None,
        redirect_urls: typing.Optional[InitiateRedirectionEndpointsModel] = None,
        ux_settings: typing.Optional[UxSettingsModel] = None,
        events_endpoints: typing.Optional[EventsEndpointsModel] = None,
        x_splitit_test_mode: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._post_mapped_args(
            auto_capture=auto_capture,
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            attempt3d_secure=attempt3d_secure,
            shopper=shopper,
            plan_data=plan_data,
            billing_address=billing_address,
            redirect_urls=redirect_urls,
            ux_settings=ux_settings,
            events_endpoints=events_endpoints,
            x_splitit_test_mode=x_splitit_test_mode,
        )
        return self._post_oapg(
            body=args.body,
            header_params=args.header,
        )

