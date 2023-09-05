# splitit_client.model.installment_plan_get_response.InstallmentPlanGetResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**Status** | [**PlanStatus**](PlanStatus.md) | [**PlanStatus**](PlanStatus.md) |  | 
**DateCreated** | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time
**InstallmentPlanNumber** | str,  | str,  |  | [optional] 
**RefOrderNumber** | str,  | str,  |  | [optional] 
**PurchaseMethod** | [**PurchaseMethod**](PurchaseMethod.md) | [**PurchaseMethod**](PurchaseMethod.md) |  | [optional] 
**Currency** | str,  | str,  |  | [optional] 
**OriginalAmount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**Amount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**Authorization** | [**AuthorizationModel**](AuthorizationModel.md) | [**AuthorizationModel**](AuthorizationModel.md) |  | [optional] 
**Shopper** | [**ShopperData**](ShopperData.md) | [**ShopperData**](ShopperData.md) |  | [optional] 
**BillingAddress** | [**AddressData**](AddressData.md) | [**AddressData**](AddressData.md) |  | [optional] 
**PaymentMethod** | [**PaymentMethodModel**](PaymentMethodModel.md) | [**PaymentMethodModel**](PaymentMethodModel.md) |  | [optional] 
**ExtendedParams** | [**InstallmentPlanGetResponseExtendedParams**](InstallmentPlanGetResponseExtendedParams.md) | [**InstallmentPlanGetResponseExtendedParams**](InstallmentPlanGetResponseExtendedParams.md) |  | [optional] 
**[Installments](#Installments)** | list, tuple,  | tuple,  |  | [optional] 
**[Refunds](#Refunds)** | list, tuple,  | tuple,  |  | [optional] 
**Links** | [**LinksData**](LinksData.md) | [**LinksData**](LinksData.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# Installments

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Installment**](Installment.md) | [**Installment**](Installment.md) | [**Installment**](Installment.md) |  | 

# Refunds

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**RefundModel**](RefundModel.md) | [**RefundModel**](RefundModel.md) | [**RefundModel**](RefundModel.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

