# InstallmentPlanModelAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**PlanStatus**](PlanStatus.md) |  | 
**installment_plan_number** | **str** |  | [optional] 
**ref_order_number** | **str** |  | [optional] 
**purchase_method** | [**PurchaseMethod**](PurchaseMethod.md) |  | [optional] 
**currency** | **str** |  | [optional] 
**original_amount** | **float** |  | [optional] 
**amount** | **float** |  | [optional] 
**extended_params** | **{str: (str,)}** |  | [optional] 
**authorization** | [**AuthorizationModel**](AuthorizationModel.md) |  | [optional] 
**shopper** | [**ShopperData**](ShopperData.md) |  | [optional] 
**billing_address** | [**AddressData**](AddressData.md) |  | [optional] 
**payment_method** | [**PaymentMethodModel**](PaymentMethodModel.md) |  | [optional] 
**installments** | [**[Installment]**](Installment.md) |  | [optional] 
**links** | [**LinksData**](LinksData.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


