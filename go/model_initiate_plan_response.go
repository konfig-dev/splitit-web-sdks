/*
splitit-web-api-v3

Splitit's Web API

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package splitit

import (
	"encoding/json"
)

// InitiatePlanResponse struct for InitiatePlanResponse
type InitiatePlanResponse struct {
	InstallmentPlanNumber *string `json:"InstallmentPlanNumber,omitempty"`
	RefOrderNumber *string `json:"RefOrderNumber,omitempty"`
	PurchaseMethod *PurchaseMethod `json:"PurchaseMethod,omitempty"`
	Status PlanStatus `json:"Status"`
	Currency *string `json:"Currency,omitempty"`
	Amount *float32 `json:"Amount,omitempty"`
	ExtendedParams *map[string]string `json:"ExtendedParams,omitempty"`
	Shopper *ShopperData `json:"Shopper,omitempty"`
	BillingAddress *AddressData `json:"BillingAddress,omitempty"`
	CheckoutUrl *string `json:"CheckoutUrl,omitempty"`
	PrincipalAmount *float32 `json:"PrincipalAmount,omitempty"`
}

// NewInitiatePlanResponse instantiates a new InitiatePlanResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInitiatePlanResponse(status PlanStatus) *InitiatePlanResponse {
	this := InitiatePlanResponse{}
	this.Status = status
	return &this
}

// NewInitiatePlanResponseWithDefaults instantiates a new InitiatePlanResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInitiatePlanResponseWithDefaults() *InitiatePlanResponse {
	this := InitiatePlanResponse{}
	return &this
}

// GetInstallmentPlanNumber returns the InstallmentPlanNumber field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetInstallmentPlanNumber() string {
	if o == nil || isNil(o.InstallmentPlanNumber) {
		var ret string
		return ret
	}
	return *o.InstallmentPlanNumber
}

// GetInstallmentPlanNumberOk returns a tuple with the InstallmentPlanNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetInstallmentPlanNumberOk() (*string, bool) {
	if o == nil || isNil(o.InstallmentPlanNumber) {
    return nil, false
	}
	return o.InstallmentPlanNumber, true
}

// HasInstallmentPlanNumber returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasInstallmentPlanNumber() bool {
	if o != nil && !isNil(o.InstallmentPlanNumber) {
		return true
	}

	return false
}

// SetInstallmentPlanNumber gets a reference to the given string and assigns it to the InstallmentPlanNumber field.
func (o *InitiatePlanResponse) SetInstallmentPlanNumber(v string) {
	o.InstallmentPlanNumber = &v
}

// GetRefOrderNumber returns the RefOrderNumber field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetRefOrderNumber() string {
	if o == nil || isNil(o.RefOrderNumber) {
		var ret string
		return ret
	}
	return *o.RefOrderNumber
}

// GetRefOrderNumberOk returns a tuple with the RefOrderNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetRefOrderNumberOk() (*string, bool) {
	if o == nil || isNil(o.RefOrderNumber) {
    return nil, false
	}
	return o.RefOrderNumber, true
}

// HasRefOrderNumber returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasRefOrderNumber() bool {
	if o != nil && !isNil(o.RefOrderNumber) {
		return true
	}

	return false
}

// SetRefOrderNumber gets a reference to the given string and assigns it to the RefOrderNumber field.
func (o *InitiatePlanResponse) SetRefOrderNumber(v string) {
	o.RefOrderNumber = &v
}

// GetPurchaseMethod returns the PurchaseMethod field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetPurchaseMethod() PurchaseMethod {
	if o == nil || isNil(o.PurchaseMethod) {
		var ret PurchaseMethod
		return ret
	}
	return *o.PurchaseMethod
}

// GetPurchaseMethodOk returns a tuple with the PurchaseMethod field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetPurchaseMethodOk() (*PurchaseMethod, bool) {
	if o == nil || isNil(o.PurchaseMethod) {
    return nil, false
	}
	return o.PurchaseMethod, true
}

// HasPurchaseMethod returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasPurchaseMethod() bool {
	if o != nil && !isNil(o.PurchaseMethod) {
		return true
	}

	return false
}

// SetPurchaseMethod gets a reference to the given PurchaseMethod and assigns it to the PurchaseMethod field.
func (o *InitiatePlanResponse) SetPurchaseMethod(v PurchaseMethod) {
	o.PurchaseMethod = &v
}

// GetStatus returns the Status field value
func (o *InitiatePlanResponse) GetStatus() PlanStatus {
	if o == nil {
		var ret PlanStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetStatusOk() (*PlanStatus, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *InitiatePlanResponse) SetStatus(v PlanStatus) {
	o.Status = v
}

// GetCurrency returns the Currency field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetCurrency() string {
	if o == nil || isNil(o.Currency) {
		var ret string
		return ret
	}
	return *o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetCurrencyOk() (*string, bool) {
	if o == nil || isNil(o.Currency) {
    return nil, false
	}
	return o.Currency, true
}

// HasCurrency returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasCurrency() bool {
	if o != nil && !isNil(o.Currency) {
		return true
	}

	return false
}

// SetCurrency gets a reference to the given string and assigns it to the Currency field.
func (o *InitiatePlanResponse) SetCurrency(v string) {
	o.Currency = &v
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetAmount() float32 {
	if o == nil || isNil(o.Amount) {
		var ret float32
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetAmountOk() (*float32, bool) {
	if o == nil || isNil(o.Amount) {
    return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasAmount() bool {
	if o != nil && !isNil(o.Amount) {
		return true
	}

	return false
}

// SetAmount gets a reference to the given float32 and assigns it to the Amount field.
func (o *InitiatePlanResponse) SetAmount(v float32) {
	o.Amount = &v
}

// GetExtendedParams returns the ExtendedParams field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetExtendedParams() map[string]string {
	if o == nil || isNil(o.ExtendedParams) {
		var ret map[string]string
		return ret
	}
	return *o.ExtendedParams
}

// GetExtendedParamsOk returns a tuple with the ExtendedParams field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetExtendedParamsOk() (*map[string]string, bool) {
	if o == nil || isNil(o.ExtendedParams) {
    return nil, false
	}
	return o.ExtendedParams, true
}

// HasExtendedParams returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasExtendedParams() bool {
	if o != nil && !isNil(o.ExtendedParams) {
		return true
	}

	return false
}

// SetExtendedParams gets a reference to the given map[string]string and assigns it to the ExtendedParams field.
func (o *InitiatePlanResponse) SetExtendedParams(v map[string]string) {
	o.ExtendedParams = &v
}

// GetShopper returns the Shopper field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetShopper() ShopperData {
	if o == nil || isNil(o.Shopper) {
		var ret ShopperData
		return ret
	}
	return *o.Shopper
}

// GetShopperOk returns a tuple with the Shopper field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetShopperOk() (*ShopperData, bool) {
	if o == nil || isNil(o.Shopper) {
    return nil, false
	}
	return o.Shopper, true
}

// HasShopper returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasShopper() bool {
	if o != nil && !isNil(o.Shopper) {
		return true
	}

	return false
}

// SetShopper gets a reference to the given ShopperData and assigns it to the Shopper field.
func (o *InitiatePlanResponse) SetShopper(v ShopperData) {
	o.Shopper = &v
}

// GetBillingAddress returns the BillingAddress field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetBillingAddress() AddressData {
	if o == nil || isNil(o.BillingAddress) {
		var ret AddressData
		return ret
	}
	return *o.BillingAddress
}

// GetBillingAddressOk returns a tuple with the BillingAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetBillingAddressOk() (*AddressData, bool) {
	if o == nil || isNil(o.BillingAddress) {
    return nil, false
	}
	return o.BillingAddress, true
}

// HasBillingAddress returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasBillingAddress() bool {
	if o != nil && !isNil(o.BillingAddress) {
		return true
	}

	return false
}

// SetBillingAddress gets a reference to the given AddressData and assigns it to the BillingAddress field.
func (o *InitiatePlanResponse) SetBillingAddress(v AddressData) {
	o.BillingAddress = &v
}

// GetCheckoutUrl returns the CheckoutUrl field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetCheckoutUrl() string {
	if o == nil || isNil(o.CheckoutUrl) {
		var ret string
		return ret
	}
	return *o.CheckoutUrl
}

// GetCheckoutUrlOk returns a tuple with the CheckoutUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetCheckoutUrlOk() (*string, bool) {
	if o == nil || isNil(o.CheckoutUrl) {
    return nil, false
	}
	return o.CheckoutUrl, true
}

// HasCheckoutUrl returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasCheckoutUrl() bool {
	if o != nil && !isNil(o.CheckoutUrl) {
		return true
	}

	return false
}

// SetCheckoutUrl gets a reference to the given string and assigns it to the CheckoutUrl field.
func (o *InitiatePlanResponse) SetCheckoutUrl(v string) {
	o.CheckoutUrl = &v
}

// GetPrincipalAmount returns the PrincipalAmount field value if set, zero value otherwise.
func (o *InitiatePlanResponse) GetPrincipalAmount() float32 {
	if o == nil || isNil(o.PrincipalAmount) {
		var ret float32
		return ret
	}
	return *o.PrincipalAmount
}

// GetPrincipalAmountOk returns a tuple with the PrincipalAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InitiatePlanResponse) GetPrincipalAmountOk() (*float32, bool) {
	if o == nil || isNil(o.PrincipalAmount) {
    return nil, false
	}
	return o.PrincipalAmount, true
}

// HasPrincipalAmount returns a boolean if a field has been set.
func (o *InitiatePlanResponse) HasPrincipalAmount() bool {
	if o != nil && !isNil(o.PrincipalAmount) {
		return true
	}

	return false
}

// SetPrincipalAmount gets a reference to the given float32 and assigns it to the PrincipalAmount field.
func (o *InitiatePlanResponse) SetPrincipalAmount(v float32) {
	o.PrincipalAmount = &v
}

func (o InitiatePlanResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.InstallmentPlanNumber) {
		toSerialize["InstallmentPlanNumber"] = o.InstallmentPlanNumber
	}
	if !isNil(o.RefOrderNumber) {
		toSerialize["RefOrderNumber"] = o.RefOrderNumber
	}
	if !isNil(o.PurchaseMethod) {
		toSerialize["PurchaseMethod"] = o.PurchaseMethod
	}
	if true {
		toSerialize["Status"] = o.Status
	}
	if !isNil(o.Currency) {
		toSerialize["Currency"] = o.Currency
	}
	if !isNil(o.Amount) {
		toSerialize["Amount"] = o.Amount
	}
	if !isNil(o.ExtendedParams) {
		toSerialize["ExtendedParams"] = o.ExtendedParams
	}
	if !isNil(o.Shopper) {
		toSerialize["Shopper"] = o.Shopper
	}
	if !isNil(o.BillingAddress) {
		toSerialize["BillingAddress"] = o.BillingAddress
	}
	if !isNil(o.CheckoutUrl) {
		toSerialize["CheckoutUrl"] = o.CheckoutUrl
	}
	if !isNil(o.PrincipalAmount) {
		toSerialize["PrincipalAmount"] = o.PrincipalAmount
	}
	return json.Marshal(toSerialize)
}

type NullableInitiatePlanResponse struct {
	value *InitiatePlanResponse
	isSet bool
}

func (v NullableInitiatePlanResponse) Get() *InitiatePlanResponse {
	return v.value
}

func (v *NullableInitiatePlanResponse) Set(val *InitiatePlanResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableInitiatePlanResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableInitiatePlanResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInitiatePlanResponse(val *InitiatePlanResponse) *NullableInitiatePlanResponse {
	return &NullableInitiatePlanResponse{value: val, isSet: true}
}

func (v NullableInitiatePlanResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInitiatePlanResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


