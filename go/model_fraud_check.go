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

// FraudCheck struct for FraudCheck
type FraudCheck struct {
	FraudCheckResult *ReferenceEntityBase `json:"FraudCheckResult,omitempty"`
	ProviderResultCode *string `json:"ProviderResultCode,omitempty"`
	ProviderResultDesc *string `json:"ProviderResultDesc,omitempty"`
	ProviderReferenceId *string `json:"ProviderReferenceId,omitempty"`
}

// NewFraudCheck instantiates a new FraudCheck object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFraudCheck() *FraudCheck {
	this := FraudCheck{}
	return &this
}

// NewFraudCheckWithDefaults instantiates a new FraudCheck object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFraudCheckWithDefaults() *FraudCheck {
	this := FraudCheck{}
	return &this
}

// GetFraudCheckResult returns the FraudCheckResult field value if set, zero value otherwise.
func (o *FraudCheck) GetFraudCheckResult() ReferenceEntityBase {
	if o == nil || isNil(o.FraudCheckResult) {
		var ret ReferenceEntityBase
		return ret
	}
	return *o.FraudCheckResult
}

// GetFraudCheckResultOk returns a tuple with the FraudCheckResult field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudCheck) GetFraudCheckResultOk() (*ReferenceEntityBase, bool) {
	if o == nil || isNil(o.FraudCheckResult) {
    return nil, false
	}
	return o.FraudCheckResult, true
}

// HasFraudCheckResult returns a boolean if a field has been set.
func (o *FraudCheck) HasFraudCheckResult() bool {
	if o != nil && !isNil(o.FraudCheckResult) {
		return true
	}

	return false
}

// SetFraudCheckResult gets a reference to the given ReferenceEntityBase and assigns it to the FraudCheckResult field.
func (o *FraudCheck) SetFraudCheckResult(v ReferenceEntityBase) {
	o.FraudCheckResult = &v
}

// GetProviderResultCode returns the ProviderResultCode field value if set, zero value otherwise.
func (o *FraudCheck) GetProviderResultCode() string {
	if o == nil || isNil(o.ProviderResultCode) {
		var ret string
		return ret
	}
	return *o.ProviderResultCode
}

// GetProviderResultCodeOk returns a tuple with the ProviderResultCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudCheck) GetProviderResultCodeOk() (*string, bool) {
	if o == nil || isNil(o.ProviderResultCode) {
    return nil, false
	}
	return o.ProviderResultCode, true
}

// HasProviderResultCode returns a boolean if a field has been set.
func (o *FraudCheck) HasProviderResultCode() bool {
	if o != nil && !isNil(o.ProviderResultCode) {
		return true
	}

	return false
}

// SetProviderResultCode gets a reference to the given string and assigns it to the ProviderResultCode field.
func (o *FraudCheck) SetProviderResultCode(v string) {
	o.ProviderResultCode = &v
}

// GetProviderResultDesc returns the ProviderResultDesc field value if set, zero value otherwise.
func (o *FraudCheck) GetProviderResultDesc() string {
	if o == nil || isNil(o.ProviderResultDesc) {
		var ret string
		return ret
	}
	return *o.ProviderResultDesc
}

// GetProviderResultDescOk returns a tuple with the ProviderResultDesc field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudCheck) GetProviderResultDescOk() (*string, bool) {
	if o == nil || isNil(o.ProviderResultDesc) {
    return nil, false
	}
	return o.ProviderResultDesc, true
}

// HasProviderResultDesc returns a boolean if a field has been set.
func (o *FraudCheck) HasProviderResultDesc() bool {
	if o != nil && !isNil(o.ProviderResultDesc) {
		return true
	}

	return false
}

// SetProviderResultDesc gets a reference to the given string and assigns it to the ProviderResultDesc field.
func (o *FraudCheck) SetProviderResultDesc(v string) {
	o.ProviderResultDesc = &v
}

// GetProviderReferenceId returns the ProviderReferenceId field value if set, zero value otherwise.
func (o *FraudCheck) GetProviderReferenceId() string {
	if o == nil || isNil(o.ProviderReferenceId) {
		var ret string
		return ret
	}
	return *o.ProviderReferenceId
}

// GetProviderReferenceIdOk returns a tuple with the ProviderReferenceId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FraudCheck) GetProviderReferenceIdOk() (*string, bool) {
	if o == nil || isNil(o.ProviderReferenceId) {
    return nil, false
	}
	return o.ProviderReferenceId, true
}

// HasProviderReferenceId returns a boolean if a field has been set.
func (o *FraudCheck) HasProviderReferenceId() bool {
	if o != nil && !isNil(o.ProviderReferenceId) {
		return true
	}

	return false
}

// SetProviderReferenceId gets a reference to the given string and assigns it to the ProviderReferenceId field.
func (o *FraudCheck) SetProviderReferenceId(v string) {
	o.ProviderReferenceId = &v
}

func (o FraudCheck) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.FraudCheckResult) {
		toSerialize["FraudCheckResult"] = o.FraudCheckResult
	}
	if !isNil(o.ProviderResultCode) {
		toSerialize["ProviderResultCode"] = o.ProviderResultCode
	}
	if !isNil(o.ProviderResultDesc) {
		toSerialize["ProviderResultDesc"] = o.ProviderResultDesc
	}
	if !isNil(o.ProviderReferenceId) {
		toSerialize["ProviderReferenceId"] = o.ProviderReferenceId
	}
	return json.Marshal(toSerialize)
}

type NullableFraudCheck struct {
	value *FraudCheck
	isSet bool
}

func (v NullableFraudCheck) Get() *FraudCheck {
	return v.value
}

func (v *NullableFraudCheck) Set(val *FraudCheck) {
	v.value = val
	v.isSet = true
}

func (v NullableFraudCheck) IsSet() bool {
	return v.isSet
}

func (v *NullableFraudCheck) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFraudCheck(val *FraudCheck) *NullableFraudCheck {
	return &NullableFraudCheck{value: val, isSet: true}
}

func (v NullableFraudCheck) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFraudCheck) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


