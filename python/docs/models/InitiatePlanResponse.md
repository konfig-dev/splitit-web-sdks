# splitit_client.model.initiate_plan_response.InitiatePlanResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**Status** | [**PlanStatus**](PlanStatus.md) | [**PlanStatus**](PlanStatus.md) |  | 
**InstallmentPlanNumber** | str,  | str,  |  | [optional] 
**RefOrderNumber** | str,  | str,  |  | [optional] 
**PurchaseMethod** | [**PurchaseMethod**](PurchaseMethod.md) | [**PurchaseMethod**](PurchaseMethod.md) |  | [optional] 
**Currency** | str,  | str,  |  | [optional] 
**Amount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**[ExtendedParams](#ExtendedParams)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**Shopper** | [**ShopperData**](ShopperData.md) | [**ShopperData**](ShopperData.md) |  | [optional] 
**BillingAddress** | [**AddressData**](AddressData.md) | [**AddressData**](AddressData.md) |  | [optional] 
**CheckoutUrl** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# ExtendedParams

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

