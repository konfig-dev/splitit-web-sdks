import typing_extensions

from splitit_client.paths import PathValues
from splitit_client.apis.paths.api_installmentplans_installment_plan_number import ApiInstallmentplansInstallmentPlanNumber
from splitit_client.apis.paths.api_installmentplans_search import ApiInstallmentplansSearch
from splitit_client.apis.paths.api_installmentplans_initiate import ApiInstallmentplansInitiate
from splitit_client.apis.paths.api_installmentplans import ApiInstallmentplans
from splitit_client.apis.paths.api_installmentplans_installment_plan_number_verifyauthorization import ApiInstallmentplansInstallmentPlanNumberVerifyauthorization
from splitit_client.apis.paths.api_installmentplans_installment_plan_number_updateorder import ApiInstallmentplansInstallmentPlanNumberUpdateorder
from splitit_client.apis.paths.api_installmentplans_updateorder import ApiInstallmentplansUpdateorder
from splitit_client.apis.paths.api_installmentplans_installment_plan_number_refund import ApiInstallmentplansInstallmentPlanNumberRefund
from splitit_client.apis.paths.api_installmentplans_installment_plan_number_cancel import ApiInstallmentplansInstallmentPlanNumberCancel
from splitit_client.apis.paths.api_installmentplans_check_eligibility import ApiInstallmentplansCheckEligibility

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER: ApiInstallmentplansInstallmentPlanNumber,
        PathValues.API_INSTALLMENTPLANS_SEARCH: ApiInstallmentplansSearch,
        PathValues.API_INSTALLMENTPLANS_INITIATE: ApiInstallmentplansInitiate,
        PathValues.API_INSTALLMENTPLANS: ApiInstallmentplans,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_VERIFYAUTHORIZATION: ApiInstallmentplansInstallmentPlanNumberVerifyauthorization,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_UPDATEORDER: ApiInstallmentplansInstallmentPlanNumberUpdateorder,
        PathValues.API_INSTALLMENTPLANS_UPDATEORDER: ApiInstallmentplansUpdateorder,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_REFUND: ApiInstallmentplansInstallmentPlanNumberRefund,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_CANCEL: ApiInstallmentplansInstallmentPlanNumberCancel,
        PathValues.API_INSTALLMENTPLANS_CHECKELIGIBILITY: ApiInstallmentplansCheckEligibility,
    }
)

path_to_api = PathToApi(
    {
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER: ApiInstallmentplansInstallmentPlanNumber,
        PathValues.API_INSTALLMENTPLANS_SEARCH: ApiInstallmentplansSearch,
        PathValues.API_INSTALLMENTPLANS_INITIATE: ApiInstallmentplansInitiate,
        PathValues.API_INSTALLMENTPLANS: ApiInstallmentplans,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_VERIFYAUTHORIZATION: ApiInstallmentplansInstallmentPlanNumberVerifyauthorization,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_UPDATEORDER: ApiInstallmentplansInstallmentPlanNumberUpdateorder,
        PathValues.API_INSTALLMENTPLANS_UPDATEORDER: ApiInstallmentplansUpdateorder,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_REFUND: ApiInstallmentplansInstallmentPlanNumberRefund,
        PathValues.API_INSTALLMENTPLANS_INSTALLMENT_PLAN_NUMBER_CANCEL: ApiInstallmentplansInstallmentPlanNumberCancel,
        PathValues.API_INSTALLMENTPLANS_CHECKELIGIBILITY: ApiInstallmentplansCheckEligibility,
    }
)
