# coding: utf-8
"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

import typing
import inspect
from datetime import date, datetime
from splitit_client.client_custom import ClientCustom
from splitit_client.configuration import Configuration
from splitit_client.api_client import ApiClient
from splitit_client.type_util import copy_signature
from splitit_client.apis.tags.installment_plan_api import InstallmentPlanApi



class Splitit(ClientCustom):

    def __init__(self, configuration: typing.Union[Configuration, None] = None, **kwargs):
        super().__init__(configuration, **kwargs)
        if (len(kwargs) > 0):
            configuration = Configuration(**kwargs)
        if (configuration is None):
            raise Exception("configuration is required")
        api_client = ApiClient(configuration)
        self.installment_plan: InstallmentPlanApi = InstallmentPlanApi(api_client)
