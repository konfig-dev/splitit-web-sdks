# splitit_client.model.installment_plan_refund_response.InstallmentPlanRefundResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**RefundId** | str,  | str,  |  | [optional] 
**InstallmentPlanNumber** | str,  | str,  |  | [optional] 
**Currency** | str,  | str,  |  | [optional] 
**NonCreditRefundAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**CreditRefundAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**Summary** | [**RefundSummary**](RefundSummary.md) | [**RefundSummary**](RefundSummary.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

