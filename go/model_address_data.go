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

// AddressData struct for AddressData
type AddressData struct {
	AddressLine *string `json:"AddressLine,omitempty"`
	AddressLine2 *string `json:"AddressLine2,omitempty"`
	City *string `json:"City,omitempty"`
	Country *string `json:"Country,omitempty"`
	State *string `json:"State,omitempty"`
	Zip *string `json:"Zip,omitempty"`
}

// NewAddressData instantiates a new AddressData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddressData() *AddressData {
	this := AddressData{}
	return &this
}

// NewAddressDataWithDefaults instantiates a new AddressData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddressDataWithDefaults() *AddressData {
	this := AddressData{}
	return &this
}

// GetAddressLine returns the AddressLine field value if set, zero value otherwise.
func (o *AddressData) GetAddressLine() string {
	if o == nil || isNil(o.AddressLine) {
		var ret string
		return ret
	}
	return *o.AddressLine
}

// GetAddressLineOk returns a tuple with the AddressLine field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddressData) GetAddressLineOk() (*string, bool) {
	if o == nil || isNil(o.AddressLine) {
    return nil, false
	}
	return o.AddressLine, true
}

// HasAddressLine returns a boolean if a field has been set.
func (o *AddressData) HasAddressLine() bool {
	if o != nil && !isNil(o.AddressLine) {
		return true
	}

	return false
}

// SetAddressLine gets a reference to the given string and assigns it to the AddressLine field.
func (o *AddressData) SetAddressLine(v string) {
	o.AddressLine = &v
}

// GetAddressLine2 returns the AddressLine2 field value if set, zero value otherwise.
func (o *AddressData) GetAddressLine2() string {
	if o == nil || isNil(o.AddressLine2) {
		var ret string
		return ret
	}
	return *o.AddressLine2
}

// GetAddressLine2Ok returns a tuple with the AddressLine2 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddressData) GetAddressLine2Ok() (*string, bool) {
	if o == nil || isNil(o.AddressLine2) {
    return nil, false
	}
	return o.AddressLine2, true
}

// HasAddressLine2 returns a boolean if a field has been set.
func (o *AddressData) HasAddressLine2() bool {
	if o != nil && !isNil(o.AddressLine2) {
		return true
	}

	return false
}

// SetAddressLine2 gets a reference to the given string and assigns it to the AddressLine2 field.
func (o *AddressData) SetAddressLine2(v string) {
	o.AddressLine2 = &v
}

// GetCity returns the City field value if set, zero value otherwise.
func (o *AddressData) GetCity() string {
	if o == nil || isNil(o.City) {
		var ret string
		return ret
	}
	return *o.City
}

// GetCityOk returns a tuple with the City field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddressData) GetCityOk() (*string, bool) {
	if o == nil || isNil(o.City) {
    return nil, false
	}
	return o.City, true
}

// HasCity returns a boolean if a field has been set.
func (o *AddressData) HasCity() bool {
	if o != nil && !isNil(o.City) {
		return true
	}

	return false
}

// SetCity gets a reference to the given string and assigns it to the City field.
func (o *AddressData) SetCity(v string) {
	o.City = &v
}

// GetCountry returns the Country field value if set, zero value otherwise.
func (o *AddressData) GetCountry() string {
	if o == nil || isNil(o.Country) {
		var ret string
		return ret
	}
	return *o.Country
}

// GetCountryOk returns a tuple with the Country field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddressData) GetCountryOk() (*string, bool) {
	if o == nil || isNil(o.Country) {
    return nil, false
	}
	return o.Country, true
}

// HasCountry returns a boolean if a field has been set.
func (o *AddressData) HasCountry() bool {
	if o != nil && !isNil(o.Country) {
		return true
	}

	return false
}

// SetCountry gets a reference to the given string and assigns it to the Country field.
func (o *AddressData) SetCountry(v string) {
	o.Country = &v
}

// GetState returns the State field value if set, zero value otherwise.
func (o *AddressData) GetState() string {
	if o == nil || isNil(o.State) {
		var ret string
		return ret
	}
	return *o.State
}

// GetStateOk returns a tuple with the State field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddressData) GetStateOk() (*string, bool) {
	if o == nil || isNil(o.State) {
    return nil, false
	}
	return o.State, true
}

// HasState returns a boolean if a field has been set.
func (o *AddressData) HasState() bool {
	if o != nil && !isNil(o.State) {
		return true
	}

	return false
}

// SetState gets a reference to the given string and assigns it to the State field.
func (o *AddressData) SetState(v string) {
	o.State = &v
}

// GetZip returns the Zip field value if set, zero value otherwise.
func (o *AddressData) GetZip() string {
	if o == nil || isNil(o.Zip) {
		var ret string
		return ret
	}
	return *o.Zip
}

// GetZipOk returns a tuple with the Zip field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddressData) GetZipOk() (*string, bool) {
	if o == nil || isNil(o.Zip) {
    return nil, false
	}
	return o.Zip, true
}

// HasZip returns a boolean if a field has been set.
func (o *AddressData) HasZip() bool {
	if o != nil && !isNil(o.Zip) {
		return true
	}

	return false
}

// SetZip gets a reference to the given string and assigns it to the Zip field.
func (o *AddressData) SetZip(v string) {
	o.Zip = &v
}

func (o AddressData) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AddressLine) {
		toSerialize["AddressLine"] = o.AddressLine
	}
	if !isNil(o.AddressLine2) {
		toSerialize["AddressLine2"] = o.AddressLine2
	}
	if !isNil(o.City) {
		toSerialize["City"] = o.City
	}
	if !isNil(o.Country) {
		toSerialize["Country"] = o.Country
	}
	if !isNil(o.State) {
		toSerialize["State"] = o.State
	}
	if !isNil(o.Zip) {
		toSerialize["Zip"] = o.Zip
	}
	return json.Marshal(toSerialize)
}

type NullableAddressData struct {
	value *AddressData
	isSet bool
}

func (v NullableAddressData) Get() *AddressData {
	return v.value
}

func (v *NullableAddressData) Set(val *AddressData) {
	v.value = val
	v.isSet = true
}

func (v NullableAddressData) IsSet() bool {
	return v.isSet
}

func (v *NullableAddressData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddressData(val *AddressData) *NullableAddressData {
	return &NullableAddressData{value: val, isSet: true}
}

func (v NullableAddressData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddressData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


