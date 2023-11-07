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

from splitit_client.model.plan_data_tags import PlanDataTags as PlanDataTagsSchema
from splitit_client.model.failed_response import FailedResponse as FailedResponseSchema
from splitit_client.model.processing_data2 import ProcessingData2 as ProcessingData2Schema
from splitit_client.model.card_data import CardData as CardDataSchema
from splitit_client.model.three_ds_data2 import ThreeDSData2 as ThreeDSData2Schema
from splitit_client.model.plan_data_allowed_installment_options import PlanDataAllowedInstallmentOptions as PlanDataAllowedInstallmentOptionsSchema
from splitit_client.model.installments_eligibility_response import InstallmentsEligibilityResponse as InstallmentsEligibilityResponseSchema
from splitit_client.model.purchase_method import PurchaseMethod as PurchaseMethodSchema
from splitit_client.model.plan_data import PlanData as PlanDataSchema
from splitit_client.model.card_brand import CardBrand as CardBrandSchema
from splitit_client.model.payment_plan_option_model import PaymentPlanOptionModel as PaymentPlanOptionModelSchema
from splitit_client.model.address_data import AddressData as AddressDataSchema
from splitit_client.model.check_installments_eligibility_request import CheckInstallmentsEligibilityRequest as CheckInstallmentsEligibilityRequestSchema
from splitit_client.model.links_model import LinksModel as LinksModelSchema
from splitit_client.model.error_extended import ErrorExtended as ErrorExtendedSchema
from splitit_client.model.card_type import CardType as CardTypeSchema

from splitit_client.type.error_extended import ErrorExtended
from splitit_client.type.card_brand import CardBrand
from splitit_client.type.installments_eligibility_response import InstallmentsEligibilityResponse
from splitit_client.type.card_data import CardData
from splitit_client.type.purchase_method import PurchaseMethod
from splitit_client.type.card_type import CardType
from splitit_client.type.failed_response import FailedResponse
from splitit_client.type.plan_data_tags import PlanDataTags
from splitit_client.type.address_data import AddressData
from splitit_client.type.three_ds_data2 import ThreeDSData2
from splitit_client.type.processing_data2 import ProcessingData2
from splitit_client.type.links_model import LinksModel
from splitit_client.type.plan_data import PlanData
from splitit_client.type.plan_data_allowed_installment_options import PlanDataAllowedInstallmentOptions
from splitit_client.type.payment_plan_option_model import PaymentPlanOptionModel
from splitit_client.type.check_installments_eligibility_request import CheckInstallmentsEligibilityRequest

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
# body param
SchemaForRequestBodyApplicationJsonPatchjson = CheckInstallmentsEligibilityRequestSchema
SchemaForRequestBodyApplicationJson = CheckInstallmentsEligibilityRequestSchema
SchemaForRequestBodyTextJson = CheckInstallmentsEligibilityRequestSchema
SchemaForRequestBodyApplicationJson = CheckInstallmentsEligibilityRequestSchema


request_body_check_installments_eligibility_request = api_client.RequestBody(
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
SchemaFor200ResponseBodyTextPlain = InstallmentsEligibilityResponseSchema
SchemaFor200ResponseBodyApplicationJson = InstallmentsEligibilityResponseSchema
SchemaFor200ResponseBodyTextJson = InstallmentsEligibilityResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: InstallmentsEligibilityResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: InstallmentsEligibilityResponse


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

    def _check_eligibility_mapped_args(
        self,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        plan_data: typing.Optional[PlanData] = None,
        card_details: typing.Optional[CardData] = None,
        billing_address: typing.Optional[AddressData] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _header_params = {}
        _body = {}
        if plan_data is not None:
            _body["PlanData"] = plan_data
        if card_details is not None:
            _body["CardDetails"] = card_details
        if billing_address is not None:
            _body["BillingAddress"] = billing_address
        args.body = _body
        if x_splitit_idempotency_key is not None:
            _header_params["X-Splitit-IdempotencyKey"] = x_splitit_idempotency_key
        if x_splitit_touch_point is not None:
            _header_params["X-Splitit-TouchPoint"] = x_splitit_touch_point
        args.header = _header_params
        return args

    async def _acheck_eligibility_oapg(
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
        serialized_data = request_body_check_installments_eligibility_request.serialize(body, content_type)
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


    def _check_eligibility_oapg(
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
        serialized_data = request_body_check_installments_eligibility_request.serialize(body, content_type)
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


class CheckEligibility(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def acheck_eligibility(
        self,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        plan_data: typing.Optional[PlanData] = None,
        card_details: typing.Optional[CardData] = None,
        billing_address: typing.Optional[AddressData] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._check_eligibility_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            plan_data=plan_data,
            card_details=card_details,
            billing_address=billing_address,
        )
        return await self._acheck_eligibility_oapg(
            body=args.body,
            header_params=args.header,
        )
    
    def check_eligibility(
        self,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        plan_data: typing.Optional[PlanData] = None,
        card_details: typing.Optional[CardData] = None,
        billing_address: typing.Optional[AddressData] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._check_eligibility_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            plan_data=plan_data,
            card_details=card_details,
            billing_address=billing_address,
        )
        return self._check_eligibility_oapg(
            body=args.body,
            header_params=args.header,
        )

class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        plan_data: typing.Optional[PlanData] = None,
        card_details: typing.Optional[CardData] = None,
        billing_address: typing.Optional[AddressData] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._check_eligibility_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            plan_data=plan_data,
            card_details=card_details,
            billing_address=billing_address,
        )
        return await self._acheck_eligibility_oapg(
            body=args.body,
            header_params=args.header,
        )
    
    def post(
        self,
        x_splitit_idempotency_key: str,
        x_splitit_touch_point: str,
        plan_data: typing.Optional[PlanData] = None,
        card_details: typing.Optional[CardData] = None,
        billing_address: typing.Optional[AddressData] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._check_eligibility_mapped_args(
            x_splitit_idempotency_key=x_splitit_idempotency_key,
            x_splitit_touch_point=x_splitit_touch_point,
            plan_data=plan_data,
            card_details=card_details,
            billing_address=billing_address,
        )
        return self._check_eligibility_oapg(
            body=args.body,
            header_params=args.header,
        )

