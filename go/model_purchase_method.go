/*
splitit-web-api-v3

Splitit's Web API

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package splitit

import (
	"encoding/json"
	"fmt"
)

// PurchaseMethod 
type PurchaseMethod string

// List of PurchaseMethod
const (
	PURCHASEMETHOD_IN_STORE PurchaseMethod = "InStore"
	PURCHASEMETHOD_PHONE_ORDER PurchaseMethod = "PhoneOrder"
	PURCHASEMETHOD_E_COMMERCE PurchaseMethod = "ECommerce"
)

// All allowed values of PurchaseMethod enum
var AllowedPurchaseMethodEnumValues = []PurchaseMethod{
	"InStore",
	"PhoneOrder",
	"ECommerce",
}

func (v *PurchaseMethod) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := PurchaseMethod(value)
	for _, existing := range AllowedPurchaseMethodEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid PurchaseMethod", value)
}

// NewPurchaseMethodFromValue returns a pointer to a valid PurchaseMethod
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPurchaseMethodFromValue(v string) (*PurchaseMethod, error) {
	ev := PurchaseMethod(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for PurchaseMethod: valid values are %v", v, AllowedPurchaseMethodEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PurchaseMethod) IsValid() bool {
	for _, existing := range AllowedPurchaseMethodEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to PurchaseMethod value
func (v PurchaseMethod) Ptr() *PurchaseMethod {
	return &v
}

type NullablePurchaseMethod struct {
	value *PurchaseMethod
	isSet bool
}

func (v NullablePurchaseMethod) Get() *PurchaseMethod {
	return v.value
}

func (v *NullablePurchaseMethod) Set(val *PurchaseMethod) {
	v.value = val
	v.isSet = true
}

func (v NullablePurchaseMethod) IsSet() bool {
	return v.isSet
}

func (v *NullablePurchaseMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePurchaseMethod(val *PurchaseMethod) *NullablePurchaseMethod {
	return &NullablePurchaseMethod{value: val, isSet: true}
}

func (v NullablePurchaseMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePurchaseMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

