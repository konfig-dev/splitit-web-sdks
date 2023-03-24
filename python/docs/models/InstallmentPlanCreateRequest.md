# splitit_client.model.installment_plan_create_request.InstallmentPlanCreateRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**TermsAndConditionsAccepted** | bool,  | BoolClass,  |  | 
**AutoCapture** | bool,  | BoolClass,  |  | 
**Attempt3dSecure** | bool,  | BoolClass,  |  | [optional] 
**Shopper** | [**ShopperData**](ShopperData.md) | [**ShopperData**](ShopperData.md) |  | [optional] 
**PlanData** | [**PlanDataModel**](PlanDataModel.md) | [**PlanDataModel**](PlanDataModel.md) |  | [optional] 
**BillingAddress** | [**AddressDataModel**](AddressDataModel.md) | [**AddressDataModel**](AddressDataModel.md) |  | [optional] 
**PaymentMethod** | [**PaymentMethodModel**](PaymentMethodModel.md) | [**PaymentMethodModel**](PaymentMethodModel.md) |  | [optional] 
**RedirectUrls** | [**RedirectionEndpointsModel**](RedirectionEndpointsModel.md) | [**RedirectionEndpointsModel**](RedirectionEndpointsModel.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

