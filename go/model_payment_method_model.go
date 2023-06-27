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

// PaymentMethodModel struct for PaymentMethodModel
type PaymentMethodModel struct {
	Type PaymentMethodType `json:"Type"`
	Card *CardData `json:"Card,omitempty"`
	Token *string `json:"Token,omitempty"`
	BluesnapVaultedShopperToken *BluesnapVaultedShopperToken `json:"BluesnapVaultedShopperToken,omitempty"`
	MockerShopperToken *MockerShopperToken `json:"MockerShopperToken,omitempty"`
}

// NewPaymentMethodModel instantiates a new PaymentMethodModel object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPaymentMethodModel(type_ PaymentMethodType) *PaymentMethodModel {
	this := PaymentMethodModel{}
	this.Type = type_
	return &this
}

// NewPaymentMethodModelWithDefaults instantiates a new PaymentMethodModel object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaymentMethodModelWithDefaults() *PaymentMethodModel {
	this := PaymentMethodModel{}
	return &this
}

// GetType returns the Type field value
func (o *PaymentMethodModel) GetType() PaymentMethodType {
	if o == nil {
		var ret PaymentMethodType
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *PaymentMethodModel) GetTypeOk() (*PaymentMethodType, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *PaymentMethodModel) SetType(v PaymentMethodType) {
	o.Type = v
}

// GetCard returns the Card field value if set, zero value otherwise.
func (o *PaymentMethodModel) GetCard() CardData {
	if o == nil || isNil(o.Card) {
		var ret CardData
		return ret
	}
	return *o.Card
}

// GetCardOk returns a tuple with the Card field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentMethodModel) GetCardOk() (*CardData, bool) {
	if o == nil || isNil(o.Card) {
    return nil, false
	}
	return o.Card, true
}

// HasCard returns a boolean if a field has been set.
func (o *PaymentMethodModel) HasCard() bool {
	if o != nil && !isNil(o.Card) {
		return true
	}

	return false
}

// SetCard gets a reference to the given CardData and assigns it to the Card field.
func (o *PaymentMethodModel) SetCard(v CardData) {
	o.Card = &v
}

// GetToken returns the Token field value if set, zero value otherwise.
func (o *PaymentMethodModel) GetToken() string {
	if o == nil || isNil(o.Token) {
		var ret string
		return ret
	}
	return *o.Token
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentMethodModel) GetTokenOk() (*string, bool) {
	if o == nil || isNil(o.Token) {
    return nil, false
	}
	return o.Token, true
}

// HasToken returns a boolean if a field has been set.
func (o *PaymentMethodModel) HasToken() bool {
	if o != nil && !isNil(o.Token) {
		return true
	}

	return false
}

// SetToken gets a reference to the given string and assigns it to the Token field.
func (o *PaymentMethodModel) SetToken(v string) {
	o.Token = &v
}

// GetBluesnapVaultedShopperToken returns the BluesnapVaultedShopperToken field value if set, zero value otherwise.
func (o *PaymentMethodModel) GetBluesnapVaultedShopperToken() BluesnapVaultedShopperToken {
	if o == nil || isNil(o.BluesnapVaultedShopperToken) {
		var ret BluesnapVaultedShopperToken
		return ret
	}
	return *o.BluesnapVaultedShopperToken
}

// GetBluesnapVaultedShopperTokenOk returns a tuple with the BluesnapVaultedShopperToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentMethodModel) GetBluesnapVaultedShopperTokenOk() (*BluesnapVaultedShopperToken, bool) {
	if o == nil || isNil(o.BluesnapVaultedShopperToken) {
    return nil, false
	}
	return o.BluesnapVaultedShopperToken, true
}

// HasBluesnapVaultedShopperToken returns a boolean if a field has been set.
func (o *PaymentMethodModel) HasBluesnapVaultedShopperToken() bool {
	if o != nil && !isNil(o.BluesnapVaultedShopperToken) {
		return true
	}

	return false
}

// SetBluesnapVaultedShopperToken gets a reference to the given BluesnapVaultedShopperToken and assigns it to the BluesnapVaultedShopperToken field.
func (o *PaymentMethodModel) SetBluesnapVaultedShopperToken(v BluesnapVaultedShopperToken) {
	o.BluesnapVaultedShopperToken = &v
}

// GetMockerShopperToken returns the MockerShopperToken field value if set, zero value otherwise.
func (o *PaymentMethodModel) GetMockerShopperToken() MockerShopperToken {
	if o == nil || isNil(o.MockerShopperToken) {
		var ret MockerShopperToken
		return ret
	}
	return *o.MockerShopperToken
}

// GetMockerShopperTokenOk returns a tuple with the MockerShopperToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentMethodModel) GetMockerShopperTokenOk() (*MockerShopperToken, bool) {
	if o == nil || isNil(o.MockerShopperToken) {
    return nil, false
	}
	return o.MockerShopperToken, true
}

// HasMockerShopperToken returns a boolean if a field has been set.
func (o *PaymentMethodModel) HasMockerShopperToken() bool {
	if o != nil && !isNil(o.MockerShopperToken) {
		return true
	}

	return false
}

// SetMockerShopperToken gets a reference to the given MockerShopperToken and assigns it to the MockerShopperToken field.
func (o *PaymentMethodModel) SetMockerShopperToken(v MockerShopperToken) {
	o.MockerShopperToken = &v
}

func (o PaymentMethodModel) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["Type"] = o.Type
	}
	if !isNil(o.Card) {
		toSerialize["Card"] = o.Card
	}
	if !isNil(o.Token) {
		toSerialize["Token"] = o.Token
	}
	if !isNil(o.BluesnapVaultedShopperToken) {
		toSerialize["BluesnapVaultedShopperToken"] = o.BluesnapVaultedShopperToken
	}
	if !isNil(o.MockerShopperToken) {
		toSerialize["MockerShopperToken"] = o.MockerShopperToken
	}
	return json.Marshal(toSerialize)
}

type NullablePaymentMethodModel struct {
	value *PaymentMethodModel
	isSet bool
}

func (v NullablePaymentMethodModel) Get() *PaymentMethodModel {
	return v.value
}

func (v *NullablePaymentMethodModel) Set(val *PaymentMethodModel) {
	v.value = val
	v.isSet = true
}

func (v NullablePaymentMethodModel) IsSet() bool {
	return v.isSet
}

func (v *NullablePaymentMethodModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePaymentMethodModel(val *PaymentMethodModel) *NullablePaymentMethodModel {
	return &NullablePaymentMethodModel{value: val, isSet: true}
}

func (v NullablePaymentMethodModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePaymentMethodModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


