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

// UxSettingsModel struct for UxSettingsModel
type UxSettingsModel struct {
	DisplayedInstallmentOptions []int32 `json:"DisplayedInstallmentOptions,omitempty"`
}

// NewUxSettingsModel instantiates a new UxSettingsModel object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUxSettingsModel() *UxSettingsModel {
	this := UxSettingsModel{}
	return &this
}

// NewUxSettingsModelWithDefaults instantiates a new UxSettingsModel object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUxSettingsModelWithDefaults() *UxSettingsModel {
	this := UxSettingsModel{}
	return &this
}

// GetDisplayedInstallmentOptions returns the DisplayedInstallmentOptions field value if set, zero value otherwise.
func (o *UxSettingsModel) GetDisplayedInstallmentOptions() []int32 {
	if o == nil || isNil(o.DisplayedInstallmentOptions) {
		var ret []int32
		return ret
	}
	return o.DisplayedInstallmentOptions
}

// GetDisplayedInstallmentOptionsOk returns a tuple with the DisplayedInstallmentOptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UxSettingsModel) GetDisplayedInstallmentOptionsOk() ([]int32, bool) {
	if o == nil || isNil(o.DisplayedInstallmentOptions) {
    return nil, false
	}
	return o.DisplayedInstallmentOptions, true
}

// HasDisplayedInstallmentOptions returns a boolean if a field has been set.
func (o *UxSettingsModel) HasDisplayedInstallmentOptions() bool {
	if o != nil && !isNil(o.DisplayedInstallmentOptions) {
		return true
	}

	return false
}

// SetDisplayedInstallmentOptions gets a reference to the given []int32 and assigns it to the DisplayedInstallmentOptions field.
func (o *UxSettingsModel) SetDisplayedInstallmentOptions(v []int32) {
	o.DisplayedInstallmentOptions = v
}

func (o UxSettingsModel) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.DisplayedInstallmentOptions) {
		toSerialize["DisplayedInstallmentOptions"] = o.DisplayedInstallmentOptions
	}
	return json.Marshal(toSerialize)
}

type NullableUxSettingsModel struct {
	value *UxSettingsModel
	isSet bool
}

func (v NullableUxSettingsModel) Get() *UxSettingsModel {
	return v.value
}

func (v *NullableUxSettingsModel) Set(val *UxSettingsModel) {
	v.value = val
	v.isSet = true
}

func (v NullableUxSettingsModel) IsSet() bool {
	return v.isSet
}

func (v *NullableUxSettingsModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUxSettingsModel(val *UxSettingsModel) *NullableUxSettingsModel {
	return &NullableUxSettingsModel{value: val, isSet: true}
}

func (v NullableUxSettingsModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUxSettingsModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


