# InstallmentPlanModel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InstallmentPlanNumber** | Pointer to **string** |  | [optional] 
**RefOrderNumber** | Pointer to **NullableString** |  | [optional] 
**PurchaseMethod** | Pointer to [**PurchaseMethod**](PurchaseMethod.md) |  | [optional] 
**Status** | [**PlanStatus**](PlanStatus.md) |  | 
**Currency** | Pointer to **string** |  | [optional] 
**OriginalAmount** | Pointer to **float32** |  | [optional] 
**Amount** | Pointer to **float32** |  | [optional] 
**ExtendedParams** | Pointer to **map[string]interface{}** |  | [optional] 
**Authorization** | Pointer to [**AuthorizationModel**](AuthorizationModel.md) |  | [optional] 
**Shopper** | Pointer to [**ShopperData**](ShopperData.md) |  | [optional] 
**BillingAddress** | Pointer to [**AddressData**](AddressData.md) |  | [optional] 
**PaymentMethod** | Pointer to [**PaymentMethodModel**](PaymentMethodModel.md) |  | [optional] 
**Installments** | Pointer to [**[]Installment**](Installment.md) |  | [optional] 
**Links** | Pointer to [**LinksData**](LinksData.md) |  | [optional] 

## Methods

### NewInstallmentPlanModel

`func NewInstallmentPlanModel(status PlanStatus, ) *InstallmentPlanModel`

NewInstallmentPlanModel instantiates a new InstallmentPlanModel object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInstallmentPlanModelWithDefaults

`func NewInstallmentPlanModelWithDefaults() *InstallmentPlanModel`

NewInstallmentPlanModelWithDefaults instantiates a new InstallmentPlanModel object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstallmentPlanNumber

`func (o *InstallmentPlanModel) GetInstallmentPlanNumber() string`

GetInstallmentPlanNumber returns the InstallmentPlanNumber field if non-nil, zero value otherwise.

### GetInstallmentPlanNumberOk

`func (o *InstallmentPlanModel) GetInstallmentPlanNumberOk() (*string, bool)`

GetInstallmentPlanNumberOk returns a tuple with the InstallmentPlanNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentPlanNumber

`func (o *InstallmentPlanModel) SetInstallmentPlanNumber(v string)`

SetInstallmentPlanNumber sets InstallmentPlanNumber field to given value.

### HasInstallmentPlanNumber

`func (o *InstallmentPlanModel) HasInstallmentPlanNumber() bool`

HasInstallmentPlanNumber returns a boolean if a field has been set.

### GetRefOrderNumber

`func (o *InstallmentPlanModel) GetRefOrderNumber() string`

GetRefOrderNumber returns the RefOrderNumber field if non-nil, zero value otherwise.

### GetRefOrderNumberOk

`func (o *InstallmentPlanModel) GetRefOrderNumberOk() (*string, bool)`

GetRefOrderNumberOk returns a tuple with the RefOrderNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefOrderNumber

`func (o *InstallmentPlanModel) SetRefOrderNumber(v string)`

SetRefOrderNumber sets RefOrderNumber field to given value.

### HasRefOrderNumber

`func (o *InstallmentPlanModel) HasRefOrderNumber() bool`

HasRefOrderNumber returns a boolean if a field has been set.

### SetRefOrderNumberNil

`func (o *InstallmentPlanModel) SetRefOrderNumberNil(b bool)`

 SetRefOrderNumberNil sets the value for RefOrderNumber to be an explicit nil

### UnsetRefOrderNumber
`func (o *InstallmentPlanModel) UnsetRefOrderNumber()`

UnsetRefOrderNumber ensures that no value is present for RefOrderNumber, not even an explicit nil
### GetPurchaseMethod

`func (o *InstallmentPlanModel) GetPurchaseMethod() PurchaseMethod`

GetPurchaseMethod returns the PurchaseMethod field if non-nil, zero value otherwise.

### GetPurchaseMethodOk

`func (o *InstallmentPlanModel) GetPurchaseMethodOk() (*PurchaseMethod, bool)`

GetPurchaseMethodOk returns a tuple with the PurchaseMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseMethod

`func (o *InstallmentPlanModel) SetPurchaseMethod(v PurchaseMethod)`

SetPurchaseMethod sets PurchaseMethod field to given value.

### HasPurchaseMethod

`func (o *InstallmentPlanModel) HasPurchaseMethod() bool`

HasPurchaseMethod returns a boolean if a field has been set.

### GetStatus

`func (o *InstallmentPlanModel) GetStatus() PlanStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *InstallmentPlanModel) GetStatusOk() (*PlanStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *InstallmentPlanModel) SetStatus(v PlanStatus)`

SetStatus sets Status field to given value.


### GetCurrency

`func (o *InstallmentPlanModel) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *InstallmentPlanModel) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *InstallmentPlanModel) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *InstallmentPlanModel) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetOriginalAmount

`func (o *InstallmentPlanModel) GetOriginalAmount() float32`

GetOriginalAmount returns the OriginalAmount field if non-nil, zero value otherwise.

### GetOriginalAmountOk

`func (o *InstallmentPlanModel) GetOriginalAmountOk() (*float32, bool)`

GetOriginalAmountOk returns a tuple with the OriginalAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginalAmount

`func (o *InstallmentPlanModel) SetOriginalAmount(v float32)`

SetOriginalAmount sets OriginalAmount field to given value.

### HasOriginalAmount

`func (o *InstallmentPlanModel) HasOriginalAmount() bool`

HasOriginalAmount returns a boolean if a field has been set.

### GetAmount

`func (o *InstallmentPlanModel) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *InstallmentPlanModel) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *InstallmentPlanModel) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *InstallmentPlanModel) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetExtendedParams

`func (o *InstallmentPlanModel) GetExtendedParams() map[string]interface{}`

GetExtendedParams returns the ExtendedParams field if non-nil, zero value otherwise.

### GetExtendedParamsOk

`func (o *InstallmentPlanModel) GetExtendedParamsOk() (*map[string]interface{}, bool)`

GetExtendedParamsOk returns a tuple with the ExtendedParams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtendedParams

`func (o *InstallmentPlanModel) SetExtendedParams(v map[string]interface{})`

SetExtendedParams sets ExtendedParams field to given value.

### HasExtendedParams

`func (o *InstallmentPlanModel) HasExtendedParams() bool`

HasExtendedParams returns a boolean if a field has been set.

### GetAuthorization

`func (o *InstallmentPlanModel) GetAuthorization() AuthorizationModel`

GetAuthorization returns the Authorization field if non-nil, zero value otherwise.

### GetAuthorizationOk

`func (o *InstallmentPlanModel) GetAuthorizationOk() (*AuthorizationModel, bool)`

GetAuthorizationOk returns a tuple with the Authorization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthorization

`func (o *InstallmentPlanModel) SetAuthorization(v AuthorizationModel)`

SetAuthorization sets Authorization field to given value.

### HasAuthorization

`func (o *InstallmentPlanModel) HasAuthorization() bool`

HasAuthorization returns a boolean if a field has been set.

### GetShopper

`func (o *InstallmentPlanModel) GetShopper() ShopperData`

GetShopper returns the Shopper field if non-nil, zero value otherwise.

### GetShopperOk

`func (o *InstallmentPlanModel) GetShopperOk() (*ShopperData, bool)`

GetShopperOk returns a tuple with the Shopper field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopper

`func (o *InstallmentPlanModel) SetShopper(v ShopperData)`

SetShopper sets Shopper field to given value.

### HasShopper

`func (o *InstallmentPlanModel) HasShopper() bool`

HasShopper returns a boolean if a field has been set.

### GetBillingAddress

`func (o *InstallmentPlanModel) GetBillingAddress() AddressData`

GetBillingAddress returns the BillingAddress field if non-nil, zero value otherwise.

### GetBillingAddressOk

`func (o *InstallmentPlanModel) GetBillingAddressOk() (*AddressData, bool)`

GetBillingAddressOk returns a tuple with the BillingAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingAddress

`func (o *InstallmentPlanModel) SetBillingAddress(v AddressData)`

SetBillingAddress sets BillingAddress field to given value.

### HasBillingAddress

`func (o *InstallmentPlanModel) HasBillingAddress() bool`

HasBillingAddress returns a boolean if a field has been set.

### GetPaymentMethod

`func (o *InstallmentPlanModel) GetPaymentMethod() PaymentMethodModel`

GetPaymentMethod returns the PaymentMethod field if non-nil, zero value otherwise.

### GetPaymentMethodOk

`func (o *InstallmentPlanModel) GetPaymentMethodOk() (*PaymentMethodModel, bool)`

GetPaymentMethodOk returns a tuple with the PaymentMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethod

`func (o *InstallmentPlanModel) SetPaymentMethod(v PaymentMethodModel)`

SetPaymentMethod sets PaymentMethod field to given value.

### HasPaymentMethod

`func (o *InstallmentPlanModel) HasPaymentMethod() bool`

HasPaymentMethod returns a boolean if a field has been set.

### GetInstallments

`func (o *InstallmentPlanModel) GetInstallments() []Installment`

GetInstallments returns the Installments field if non-nil, zero value otherwise.

### GetInstallmentsOk

`func (o *InstallmentPlanModel) GetInstallmentsOk() (*[]Installment, bool)`

GetInstallmentsOk returns a tuple with the Installments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallments

`func (o *InstallmentPlanModel) SetInstallments(v []Installment)`

SetInstallments sets Installments field to given value.

### HasInstallments

`func (o *InstallmentPlanModel) HasInstallments() bool`

HasInstallments returns a boolean if a field has been set.

### GetLinks

`func (o *InstallmentPlanModel) GetLinks() LinksData`

GetLinks returns the Links field if non-nil, zero value otherwise.

### GetLinksOk

`func (o *InstallmentPlanModel) GetLinksOk() (*LinksData, bool)`

GetLinksOk returns a tuple with the Links field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinks

`func (o *InstallmentPlanModel) SetLinks(v LinksData)`

SetLinks sets Links field to given value.

### HasLinks

`func (o *InstallmentPlanModel) HasLinks() bool`

HasLinks returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


