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

// ReferenceEntityBase struct for ReferenceEntityBase
type ReferenceEntityBase struct {
	Id int64 `json:"Id"`
	Code *string `json:"Code,omitempty"`
	Description *string `json:"Description,omitempty"`
}

// NewReferenceEntityBase instantiates a new ReferenceEntityBase object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReferenceEntityBase(id int64) *ReferenceEntityBase {
	this := ReferenceEntityBase{}
	this.Id = id
	return &this
}

// NewReferenceEntityBaseWithDefaults instantiates a new ReferenceEntityBase object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReferenceEntityBaseWithDefaults() *ReferenceEntityBase {
	this := ReferenceEntityBase{}
	return &this
}

// GetId returns the Id field value
func (o *ReferenceEntityBase) GetId() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ReferenceEntityBase) GetIdOk() (*int64, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ReferenceEntityBase) SetId(v int64) {
	o.Id = v
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *ReferenceEntityBase) GetCode() string {
	if o == nil || isNil(o.Code) {
		var ret string
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReferenceEntityBase) GetCodeOk() (*string, bool) {
	if o == nil || isNil(o.Code) {
    return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *ReferenceEntityBase) HasCode() bool {
	if o != nil && !isNil(o.Code) {
		return true
	}

	return false
}

// SetCode gets a reference to the given string and assigns it to the Code field.
func (o *ReferenceEntityBase) SetCode(v string) {
	o.Code = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *ReferenceEntityBase) GetDescription() string {
	if o == nil || isNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReferenceEntityBase) GetDescriptionOk() (*string, bool) {
	if o == nil || isNil(o.Description) {
    return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *ReferenceEntityBase) HasDescription() bool {
	if o != nil && !isNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *ReferenceEntityBase) SetDescription(v string) {
	o.Description = &v
}

func (o ReferenceEntityBase) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["Id"] = o.Id
	}
	if !isNil(o.Code) {
		toSerialize["Code"] = o.Code
	}
	if !isNil(o.Description) {
		toSerialize["Description"] = o.Description
	}
	return json.Marshal(toSerialize)
}

type NullableReferenceEntityBase struct {
	value *ReferenceEntityBase
	isSet bool
}

func (v NullableReferenceEntityBase) Get() *ReferenceEntityBase {
	return v.value
}

func (v *NullableReferenceEntityBase) Set(val *ReferenceEntityBase) {
	v.value = val
	v.isSet = true
}

func (v NullableReferenceEntityBase) IsSet() bool {
	return v.isSet
}

func (v *NullableReferenceEntityBase) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReferenceEntityBase(val *ReferenceEntityBase) *NullableReferenceEntityBase {
	return &NullableReferenceEntityBase{value: val, isSet: true}
}

func (v NullableReferenceEntityBase) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReferenceEntityBase) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


