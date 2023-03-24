import typing_extensions

from splitit_client.apis.tags import TagValues
from splitit_client.apis.tags.installment_plan_api import InstallmentPlanApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.INSTALLMENT_PLAN: InstallmentPlanApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.INSTALLMENT_PLAN: InstallmentPlanApi,
    }
)
