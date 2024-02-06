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

// ResponseHeader struct for ResponseHeader
type ResponseHeader struct {
	Succeeded bool `json:"Succeeded"`
	Errors []Error2 `json:"Errors,omitempty"`
	TraceId *string `json:"TraceId,omitempty"`
}

// NewResponseHeader instantiates a new ResponseHeader object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewResponseHeader(succeeded bool) *ResponseHeader {
	this := ResponseHeader{}
	this.Succeeded = succeeded
	return &this
}

// NewResponseHeaderWithDefaults instantiates a new ResponseHeader object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewResponseHeaderWithDefaults() *ResponseHeader {
	this := ResponseHeader{}
	return &this
}

// GetSucceeded returns the Succeeded field value
func (o *ResponseHeader) GetSucceeded() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Succeeded
}

// GetSucceededOk returns a tuple with the Succeeded field value
// and a boolean to check if the value has been set.
func (o *ResponseHeader) GetSucceededOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Succeeded, true
}

// SetSucceeded sets field value
func (o *ResponseHeader) SetSucceeded(v bool) {
	o.Succeeded = v
}

// GetErrors returns the Errors field value if set, zero value otherwise.
func (o *ResponseHeader) GetErrors() []Error2 {
	if o == nil || isNil(o.Errors) {
		var ret []Error2
		return ret
	}
	return o.Errors
}

// GetErrorsOk returns a tuple with the Errors field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ResponseHeader) GetErrorsOk() ([]Error2, bool) {
	if o == nil || isNil(o.Errors) {
    return nil, false
	}
	return o.Errors, true
}

// HasErrors returns a boolean if a field has been set.
func (o *ResponseHeader) HasErrors() bool {
	if o != nil && !isNil(o.Errors) {
		return true
	}

	return false
}

// SetErrors gets a reference to the given []Error2 and assigns it to the Errors field.
func (o *ResponseHeader) SetErrors(v []Error2) {
	o.Errors = v
}

// GetTraceId returns the TraceId field value if set, zero value otherwise.
func (o *ResponseHeader) GetTraceId() string {
	if o == nil || isNil(o.TraceId) {
		var ret string
		return ret
	}
	return *o.TraceId
}

// GetTraceIdOk returns a tuple with the TraceId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ResponseHeader) GetTraceIdOk() (*string, bool) {
	if o == nil || isNil(o.TraceId) {
    return nil, false
	}
	return o.TraceId, true
}

// HasTraceId returns a boolean if a field has been set.
func (o *ResponseHeader) HasTraceId() bool {
	if o != nil && !isNil(o.TraceId) {
		return true
	}

	return false
}

// SetTraceId gets a reference to the given string and assigns it to the TraceId field.
func (o *ResponseHeader) SetTraceId(v string) {
	o.TraceId = &v
}

func (o ResponseHeader) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["Succeeded"] = o.Succeeded
	}
	if !isNil(o.Errors) {
		toSerialize["Errors"] = o.Errors
	}
	if !isNil(o.TraceId) {
		toSerialize["TraceId"] = o.TraceId
	}
	return json.Marshal(toSerialize)
}

type NullableResponseHeader struct {
	value *ResponseHeader
	isSet bool
}

func (v NullableResponseHeader) Get() *ResponseHeader {
	return v.value
}

func (v *NullableResponseHeader) Set(val *ResponseHeader) {
	v.value = val
	v.isSet = true
}

func (v NullableResponseHeader) IsSet() bool {
	return v.isSet
}

func (v *NullableResponseHeader) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableResponseHeader(val *ResponseHeader) *NullableResponseHeader {
	return &NullableResponseHeader{value: val, isSet: true}
}

func (v NullableResponseHeader) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableResponseHeader) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


