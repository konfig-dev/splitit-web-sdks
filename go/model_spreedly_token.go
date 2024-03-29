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

// SpreedlyToken struct for SpreedlyToken
type SpreedlyToken struct {
	Token *string `json:"Token,omitempty"`
	Last4Digit *string `json:"Last4Digit,omitempty"`
}

// NewSpreedlyToken instantiates a new SpreedlyToken object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSpreedlyToken() *SpreedlyToken {
	this := SpreedlyToken{}
	return &this
}

// NewSpreedlyTokenWithDefaults instantiates a new SpreedlyToken object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSpreedlyTokenWithDefaults() *SpreedlyToken {
	this := SpreedlyToken{}
	return &this
}

// GetToken returns the Token field value if set, zero value otherwise.
func (o *SpreedlyToken) GetToken() string {
	if o == nil || isNil(o.Token) {
		var ret string
		return ret
	}
	return *o.Token
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SpreedlyToken) GetTokenOk() (*string, bool) {
	if o == nil || isNil(o.Token) {
    return nil, false
	}
	return o.Token, true
}

// HasToken returns a boolean if a field has been set.
func (o *SpreedlyToken) HasToken() bool {
	if o != nil && !isNil(o.Token) {
		return true
	}

	return false
}

// SetToken gets a reference to the given string and assigns it to the Token field.
func (o *SpreedlyToken) SetToken(v string) {
	o.Token = &v
}

// GetLast4Digit returns the Last4Digit field value if set, zero value otherwise.
func (o *SpreedlyToken) GetLast4Digit() string {
	if o == nil || isNil(o.Last4Digit) {
		var ret string
		return ret
	}
	return *o.Last4Digit
}

// GetLast4DigitOk returns a tuple with the Last4Digit field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SpreedlyToken) GetLast4DigitOk() (*string, bool) {
	if o == nil || isNil(o.Last4Digit) {
    return nil, false
	}
	return o.Last4Digit, true
}

// HasLast4Digit returns a boolean if a field has been set.
func (o *SpreedlyToken) HasLast4Digit() bool {
	if o != nil && !isNil(o.Last4Digit) {
		return true
	}

	return false
}

// SetLast4Digit gets a reference to the given string and assigns it to the Last4Digit field.
func (o *SpreedlyToken) SetLast4Digit(v string) {
	o.Last4Digit = &v
}

func (o SpreedlyToken) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Token) {
		toSerialize["Token"] = o.Token
	}
	if !isNil(o.Last4Digit) {
		toSerialize["Last4Digit"] = o.Last4Digit
	}
	return json.Marshal(toSerialize)
}

type NullableSpreedlyToken struct {
	value *SpreedlyToken
	isSet bool
}

func (v NullableSpreedlyToken) Get() *SpreedlyToken {
	return v.value
}

func (v *NullableSpreedlyToken) Set(val *SpreedlyToken) {
	v.value = val
	v.isSet = true
}

func (v NullableSpreedlyToken) IsSet() bool {
	return v.isSet
}

func (v *NullableSpreedlyToken) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSpreedlyToken(val *SpreedlyToken) *NullableSpreedlyToken {
	return &NullableSpreedlyToken{value: val, isSet: true}
}

func (v NullableSpreedlyToken) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSpreedlyToken) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


