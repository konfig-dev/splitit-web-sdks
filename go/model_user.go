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

// User struct for User
type User struct {
	Id *string `json:"Id,omitempty"`
	UniqueId *string `json:"UniqueId,omitempty"`
	UserName *string `json:"UserName,omitempty"`
	FullName *string `json:"FullName,omitempty"`
	Email *string `json:"Email,omitempty"`
	PhoneNumber *string `json:"PhoneNumber,omitempty"`
	CultureName *string `json:"CultureName,omitempty"`
	RoleName *string `json:"RoleName,omitempty"`
	IsLocked bool `json:"IsLocked"`
	IsDataRestricted bool `json:"IsDataRestricted"`
	IsDataPrivateRestricted bool `json:"IsDataPrivateRestricted"`
}

// NewUser instantiates a new User object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUser(isLocked bool, isDataRestricted bool, isDataPrivateRestricted bool) *User {
	this := User{}
	this.IsLocked = isLocked
	this.IsDataRestricted = isDataRestricted
	this.IsDataPrivateRestricted = isDataPrivateRestricted
	return &this
}

// NewUserWithDefaults instantiates a new User object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUserWithDefaults() *User {
	this := User{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *User) GetId() string {
	if o == nil || isNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetIdOk() (*string, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *User) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *User) SetId(v string) {
	o.Id = &v
}

// GetUniqueId returns the UniqueId field value if set, zero value otherwise.
func (o *User) GetUniqueId() string {
	if o == nil || isNil(o.UniqueId) {
		var ret string
		return ret
	}
	return *o.UniqueId
}

// GetUniqueIdOk returns a tuple with the UniqueId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetUniqueIdOk() (*string, bool) {
	if o == nil || isNil(o.UniqueId) {
    return nil, false
	}
	return o.UniqueId, true
}

// HasUniqueId returns a boolean if a field has been set.
func (o *User) HasUniqueId() bool {
	if o != nil && !isNil(o.UniqueId) {
		return true
	}

	return false
}

// SetUniqueId gets a reference to the given string and assigns it to the UniqueId field.
func (o *User) SetUniqueId(v string) {
	o.UniqueId = &v
}

// GetUserName returns the UserName field value if set, zero value otherwise.
func (o *User) GetUserName() string {
	if o == nil || isNil(o.UserName) {
		var ret string
		return ret
	}
	return *o.UserName
}

// GetUserNameOk returns a tuple with the UserName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetUserNameOk() (*string, bool) {
	if o == nil || isNil(o.UserName) {
    return nil, false
	}
	return o.UserName, true
}

// HasUserName returns a boolean if a field has been set.
func (o *User) HasUserName() bool {
	if o != nil && !isNil(o.UserName) {
		return true
	}

	return false
}

// SetUserName gets a reference to the given string and assigns it to the UserName field.
func (o *User) SetUserName(v string) {
	o.UserName = &v
}

// GetFullName returns the FullName field value if set, zero value otherwise.
func (o *User) GetFullName() string {
	if o == nil || isNil(o.FullName) {
		var ret string
		return ret
	}
	return *o.FullName
}

// GetFullNameOk returns a tuple with the FullName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetFullNameOk() (*string, bool) {
	if o == nil || isNil(o.FullName) {
    return nil, false
	}
	return o.FullName, true
}

// HasFullName returns a boolean if a field has been set.
func (o *User) HasFullName() bool {
	if o != nil && !isNil(o.FullName) {
		return true
	}

	return false
}

// SetFullName gets a reference to the given string and assigns it to the FullName field.
func (o *User) SetFullName(v string) {
	o.FullName = &v
}

// GetEmail returns the Email field value if set, zero value otherwise.
func (o *User) GetEmail() string {
	if o == nil || isNil(o.Email) {
		var ret string
		return ret
	}
	return *o.Email
}

// GetEmailOk returns a tuple with the Email field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetEmailOk() (*string, bool) {
	if o == nil || isNil(o.Email) {
    return nil, false
	}
	return o.Email, true
}

// HasEmail returns a boolean if a field has been set.
func (o *User) HasEmail() bool {
	if o != nil && !isNil(o.Email) {
		return true
	}

	return false
}

// SetEmail gets a reference to the given string and assigns it to the Email field.
func (o *User) SetEmail(v string) {
	o.Email = &v
}

// GetPhoneNumber returns the PhoneNumber field value if set, zero value otherwise.
func (o *User) GetPhoneNumber() string {
	if o == nil || isNil(o.PhoneNumber) {
		var ret string
		return ret
	}
	return *o.PhoneNumber
}

// GetPhoneNumberOk returns a tuple with the PhoneNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetPhoneNumberOk() (*string, bool) {
	if o == nil || isNil(o.PhoneNumber) {
    return nil, false
	}
	return o.PhoneNumber, true
}

// HasPhoneNumber returns a boolean if a field has been set.
func (o *User) HasPhoneNumber() bool {
	if o != nil && !isNil(o.PhoneNumber) {
		return true
	}

	return false
}

// SetPhoneNumber gets a reference to the given string and assigns it to the PhoneNumber field.
func (o *User) SetPhoneNumber(v string) {
	o.PhoneNumber = &v
}

// GetCultureName returns the CultureName field value if set, zero value otherwise.
func (o *User) GetCultureName() string {
	if o == nil || isNil(o.CultureName) {
		var ret string
		return ret
	}
	return *o.CultureName
}

// GetCultureNameOk returns a tuple with the CultureName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetCultureNameOk() (*string, bool) {
	if o == nil || isNil(o.CultureName) {
    return nil, false
	}
	return o.CultureName, true
}

// HasCultureName returns a boolean if a field has been set.
func (o *User) HasCultureName() bool {
	if o != nil && !isNil(o.CultureName) {
		return true
	}

	return false
}

// SetCultureName gets a reference to the given string and assigns it to the CultureName field.
func (o *User) SetCultureName(v string) {
	o.CultureName = &v
}

// GetRoleName returns the RoleName field value if set, zero value otherwise.
func (o *User) GetRoleName() string {
	if o == nil || isNil(o.RoleName) {
		var ret string
		return ret
	}
	return *o.RoleName
}

// GetRoleNameOk returns a tuple with the RoleName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *User) GetRoleNameOk() (*string, bool) {
	if o == nil || isNil(o.RoleName) {
    return nil, false
	}
	return o.RoleName, true
}

// HasRoleName returns a boolean if a field has been set.
func (o *User) HasRoleName() bool {
	if o != nil && !isNil(o.RoleName) {
		return true
	}

	return false
}

// SetRoleName gets a reference to the given string and assigns it to the RoleName field.
func (o *User) SetRoleName(v string) {
	o.RoleName = &v
}

// GetIsLocked returns the IsLocked field value
func (o *User) GetIsLocked() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsLocked
}

// GetIsLockedOk returns a tuple with the IsLocked field value
// and a boolean to check if the value has been set.
func (o *User) GetIsLockedOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.IsLocked, true
}

// SetIsLocked sets field value
func (o *User) SetIsLocked(v bool) {
	o.IsLocked = v
}

// GetIsDataRestricted returns the IsDataRestricted field value
func (o *User) GetIsDataRestricted() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsDataRestricted
}

// GetIsDataRestrictedOk returns a tuple with the IsDataRestricted field value
// and a boolean to check if the value has been set.
func (o *User) GetIsDataRestrictedOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.IsDataRestricted, true
}

// SetIsDataRestricted sets field value
func (o *User) SetIsDataRestricted(v bool) {
	o.IsDataRestricted = v
}

// GetIsDataPrivateRestricted returns the IsDataPrivateRestricted field value
func (o *User) GetIsDataPrivateRestricted() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsDataPrivateRestricted
}

// GetIsDataPrivateRestrictedOk returns a tuple with the IsDataPrivateRestricted field value
// and a boolean to check if the value has been set.
func (o *User) GetIsDataPrivateRestrictedOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.IsDataPrivateRestricted, true
}

// SetIsDataPrivateRestricted sets field value
func (o *User) SetIsDataPrivateRestricted(v bool) {
	o.IsDataPrivateRestricted = v
}

func (o User) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Id) {
		toSerialize["Id"] = o.Id
	}
	if !isNil(o.UniqueId) {
		toSerialize["UniqueId"] = o.UniqueId
	}
	if !isNil(o.UserName) {
		toSerialize["UserName"] = o.UserName
	}
	if !isNil(o.FullName) {
		toSerialize["FullName"] = o.FullName
	}
	if !isNil(o.Email) {
		toSerialize["Email"] = o.Email
	}
	if !isNil(o.PhoneNumber) {
		toSerialize["PhoneNumber"] = o.PhoneNumber
	}
	if !isNil(o.CultureName) {
		toSerialize["CultureName"] = o.CultureName
	}
	if !isNil(o.RoleName) {
		toSerialize["RoleName"] = o.RoleName
	}
	if true {
		toSerialize["IsLocked"] = o.IsLocked
	}
	if true {
		toSerialize["IsDataRestricted"] = o.IsDataRestricted
	}
	if true {
		toSerialize["IsDataPrivateRestricted"] = o.IsDataPrivateRestricted
	}
	return json.Marshal(toSerialize)
}

type NullableUser struct {
	value *User
	isSet bool
}

func (v NullableUser) Get() *User {
	return v.value
}

func (v *NullableUser) Set(val *User) {
	v.value = val
	v.isSet = true
}

func (v NullableUser) IsSet() bool {
	return v.isSet
}

func (v *NullableUser) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUser(val *User) *NullableUser {
	return &NullableUser{value: val, isSet: true}
}

func (v NullableUser) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUser) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


