# InstallmentPlanModelAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InstallmentPlanNumber** | Pointer to **string** |  | [optional] 
**RefOrderNumber** | Pointer to **string** |  | [optional] 
**PurchaseMethod** | Pointer to [**PurchaseMethod**](PurchaseMethod.md) |  | [optional] 
**Status** | [**PlanStatus**](PlanStatus.md) |  | 
**Currency** | Pointer to **string** |  | [optional] 
**OriginalAmount** | Pointer to **float32** |  | [optional] 
**Amount** | Pointer to **float32** |  | [optional] 
**ExtendedParams** | Pointer to **map[string]string** |  | [optional] 
**Authorization** | Pointer to [**AuthorizationModel**](AuthorizationModel.md) |  | [optional] 
**Shopper** | Pointer to [**ShopperData**](ShopperData.md) |  | [optional] 
**BillingAddress** | Pointer to [**AddressData**](AddressData.md) |  | [optional] 
**PaymentMethod** | Pointer to [**PaymentMethodModel**](PaymentMethodModel.md) |  | [optional] 
**Installments** | Pointer to [**[]Installment**](Installment.md) |  | [optional] 
**Links** | Pointer to [**LinksData**](LinksData.md) |  | [optional] 

## Methods

### NewInstallmentPlanModelAllOf

`func NewInstallmentPlanModelAllOf(status PlanStatus, ) *InstallmentPlanModelAllOf`

NewInstallmentPlanModelAllOf instantiates a new InstallmentPlanModelAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInstallmentPlanModelAllOfWithDefaults

`func NewInstallmentPlanModelAllOfWithDefaults() *InstallmentPlanModelAllOf`

NewInstallmentPlanModelAllOfWithDefaults instantiates a new InstallmentPlanModelAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstallmentPlanNumber

`func (o *InstallmentPlanModelAllOf) GetInstallmentPlanNumber() string`

GetInstallmentPlanNumber returns the InstallmentPlanNumber field if non-nil, zero value otherwise.

### GetInstallmentPlanNumberOk

`func (o *InstallmentPlanModelAllOf) GetInstallmentPlanNumberOk() (*string, bool)`

GetInstallmentPlanNumberOk returns a tuple with the InstallmentPlanNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentPlanNumber

`func (o *InstallmentPlanModelAllOf) SetInstallmentPlanNumber(v string)`

SetInstallmentPlanNumber sets InstallmentPlanNumber field to given value.

### HasInstallmentPlanNumber

`func (o *InstallmentPlanModelAllOf) HasInstallmentPlanNumber() bool`

HasInstallmentPlanNumber returns a boolean if a field has been set.

### GetRefOrderNumber

`func (o *InstallmentPlanModelAllOf) GetRefOrderNumber() string`

GetRefOrderNumber returns the RefOrderNumber field if non-nil, zero value otherwise.

### GetRefOrderNumberOk

`func (o *InstallmentPlanModelAllOf) GetRefOrderNumberOk() (*string, bool)`

GetRefOrderNumberOk returns a tuple with the RefOrderNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefOrderNumber

`func (o *InstallmentPlanModelAllOf) SetRefOrderNumber(v string)`

SetRefOrderNumber sets RefOrderNumber field to given value.

### HasRefOrderNumber

`func (o *InstallmentPlanModelAllOf) HasRefOrderNumber() bool`

HasRefOrderNumber returns a boolean if a field has been set.

### GetPurchaseMethod

`func (o *InstallmentPlanModelAllOf) GetPurchaseMethod() PurchaseMethod`

GetPurchaseMethod returns the PurchaseMethod field if non-nil, zero value otherwise.

### GetPurchaseMethodOk

`func (o *InstallmentPlanModelAllOf) GetPurchaseMethodOk() (*PurchaseMethod, bool)`

GetPurchaseMethodOk returns a tuple with the PurchaseMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseMethod

`func (o *InstallmentPlanModelAllOf) SetPurchaseMethod(v PurchaseMethod)`

SetPurchaseMethod sets PurchaseMethod field to given value.

### HasPurchaseMethod

`func (o *InstallmentPlanModelAllOf) HasPurchaseMethod() bool`

HasPurchaseMethod returns a boolean if a field has been set.

### GetStatus

`func (o *InstallmentPlanModelAllOf) GetStatus() PlanStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *InstallmentPlanModelAllOf) GetStatusOk() (*PlanStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *InstallmentPlanModelAllOf) SetStatus(v PlanStatus)`

SetStatus sets Status field to given value.


### GetCurrency

`func (o *InstallmentPlanModelAllOf) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *InstallmentPlanModelAllOf) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *InstallmentPlanModelAllOf) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *InstallmentPlanModelAllOf) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetOriginalAmount

`func (o *InstallmentPlanModelAllOf) GetOriginalAmount() float32`

GetOriginalAmount returns the OriginalAmount field if non-nil, zero value otherwise.

### GetOriginalAmountOk

`func (o *InstallmentPlanModelAllOf) GetOriginalAmountOk() (*float32, bool)`

GetOriginalAmountOk returns a tuple with the OriginalAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginalAmount

`func (o *InstallmentPlanModelAllOf) SetOriginalAmount(v float32)`

SetOriginalAmount sets OriginalAmount field to given value.

### HasOriginalAmount

`func (o *InstallmentPlanModelAllOf) HasOriginalAmount() bool`

HasOriginalAmount returns a boolean if a field has been set.

### GetAmount

`func (o *InstallmentPlanModelAllOf) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *InstallmentPlanModelAllOf) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *InstallmentPlanModelAllOf) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *InstallmentPlanModelAllOf) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetExtendedParams

`func (o *InstallmentPlanModelAllOf) GetExtendedParams() map[string]string`

GetExtendedParams returns the ExtendedParams field if non-nil, zero value otherwise.

### GetExtendedParamsOk

`func (o *InstallmentPlanModelAllOf) GetExtendedParamsOk() (*map[string]string, bool)`

GetExtendedParamsOk returns a tuple with the ExtendedParams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtendedParams

`func (o *InstallmentPlanModelAllOf) SetExtendedParams(v map[string]string)`

SetExtendedParams sets ExtendedParams field to given value.

### HasExtendedParams

`func (o *InstallmentPlanModelAllOf) HasExtendedParams() bool`

HasExtendedParams returns a boolean if a field has been set.

### GetAuthorization

`func (o *InstallmentPlanModelAllOf) GetAuthorization() AuthorizationModel`

GetAuthorization returns the Authorization field if non-nil, zero value otherwise.

### GetAuthorizationOk

`func (o *InstallmentPlanModelAllOf) GetAuthorizationOk() (*AuthorizationModel, bool)`

GetAuthorizationOk returns a tuple with the Authorization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthorization

`func (o *InstallmentPlanModelAllOf) SetAuthorization(v AuthorizationModel)`

SetAuthorization sets Authorization field to given value.

### HasAuthorization

`func (o *InstallmentPlanModelAllOf) HasAuthorization() bool`

HasAuthorization returns a boolean if a field has been set.

### GetShopper

`func (o *InstallmentPlanModelAllOf) GetShopper() ShopperData`

GetShopper returns the Shopper field if non-nil, zero value otherwise.

### GetShopperOk

`func (o *InstallmentPlanModelAllOf) GetShopperOk() (*ShopperData, bool)`

GetShopperOk returns a tuple with the Shopper field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopper

`func (o *InstallmentPlanModelAllOf) SetShopper(v ShopperData)`

SetShopper sets Shopper field to given value.

### HasShopper

`func (o *InstallmentPlanModelAllOf) HasShopper() bool`

HasShopper returns a boolean if a field has been set.

### GetBillingAddress

`func (o *InstallmentPlanModelAllOf) GetBillingAddress() AddressData`

GetBillingAddress returns the BillingAddress field if non-nil, zero value otherwise.

### GetBillingAddressOk

`func (o *InstallmentPlanModelAllOf) GetBillingAddressOk() (*AddressData, bool)`

GetBillingAddressOk returns a tuple with the BillingAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingAddress

`func (o *InstallmentPlanModelAllOf) SetBillingAddress(v AddressData)`

SetBillingAddress sets BillingAddress field to given value.

### HasBillingAddress

`func (o *InstallmentPlanModelAllOf) HasBillingAddress() bool`

HasBillingAddress returns a boolean if a field has been set.

### GetPaymentMethod

`func (o *InstallmentPlanModelAllOf) GetPaymentMethod() PaymentMethodModel`

GetPaymentMethod returns the PaymentMethod field if non-nil, zero value otherwise.

### GetPaymentMethodOk

`func (o *InstallmentPlanModelAllOf) GetPaymentMethodOk() (*PaymentMethodModel, bool)`

GetPaymentMethodOk returns a tuple with the PaymentMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethod

`func (o *InstallmentPlanModelAllOf) SetPaymentMethod(v PaymentMethodModel)`

SetPaymentMethod sets PaymentMethod field to given value.

### HasPaymentMethod

`func (o *InstallmentPlanModelAllOf) HasPaymentMethod() bool`

HasPaymentMethod returns a boolean if a field has been set.

### GetInstallments

`func (o *InstallmentPlanModelAllOf) GetInstallments() []Installment`

GetInstallments returns the Installments field if non-nil, zero value otherwise.

### GetInstallmentsOk

`func (o *InstallmentPlanModelAllOf) GetInstallmentsOk() (*[]Installment, bool)`

GetInstallmentsOk returns a tuple with the Installments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallments

`func (o *InstallmentPlanModelAllOf) SetInstallments(v []Installment)`

SetInstallments sets Installments field to given value.

### HasInstallments

`func (o *InstallmentPlanModelAllOf) HasInstallments() bool`

HasInstallments returns a boolean if a field has been set.

### GetLinks

`func (o *InstallmentPlanModelAllOf) GetLinks() LinksData`

GetLinks returns the Links field if non-nil, zero value otherwise.

### GetLinksOk

`func (o *InstallmentPlanModelAllOf) GetLinksOk() (*LinksData, bool)`

GetLinksOk returns a tuple with the Links field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinks

`func (o *InstallmentPlanModelAllOf) SetLinks(v LinksData)`

SetLinks sets Links field to given value.

### HasLinks

`func (o *InstallmentPlanModelAllOf) HasLinks() bool`

HasLinks returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


