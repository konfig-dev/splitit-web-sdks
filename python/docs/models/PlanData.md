# splitit_client.model.plan_data.PlanData

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**PurchaseMethod** | [**PurchaseMethod**](PurchaseMethod.md) | [**PurchaseMethod**](PurchaseMethod.md) |  | 
**TotalAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**NumberOfInstallments** | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer
**TerminalId** | str,  | str,  |  | [optional] 
**FirstInstallmentAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**Currency** | str,  | str,  |  | [optional] 
**RefOrderNumber** | str,  | str,  |  | [optional] 
**[Tags](#Tags)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# Tags

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

