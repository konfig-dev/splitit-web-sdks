# coding: utf-8
"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from splitit_client.paths.api_installmentplans_check_eligibility.post import CheckEligibility
from splitit_client.paths.api_installmentplans_installment_plan_number.get import Get
from splitit_client.paths.api_installmentplans_ipn_legal.get import GetEligibilityTermsAndCondition
from splitit_client.paths.api_installmentplans_initiate.post import Post
from splitit_client.paths.api_installmentplans.post import Post2
from splitit_client.paths.api_installmentplans_installment_plan_number_refund.post import Refund
from splitit_client.paths.api_installmentplans_search.get import Search
from splitit_client.paths.api_installmentplans_installment_plan_number_updateorder.put import UpdateOrder
from splitit_client.paths.api_installmentplans_updateorder.put import UpdateOrder2
from splitit_client.paths.api_installmentplans_installment_plan_number_verifyauthorization.get import VerifyAuthorization


class InstallmentPlanApiGenerated(
    CheckEligibility,
    Get,
    GetEligibilityTermsAndCondition,
    Post,
    Post2,
    Refund,
    Search,
    UpdateOrder,
    UpdateOrder2,
    VerifyAuthorization,
):
    """NOTE:
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    pass
