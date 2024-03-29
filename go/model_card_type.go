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

// CardType 
type CardType string

// List of CardType
const (
	CARDTYPE_CREDIT CardType = "Credit"
	CARDTYPE_DEBIT CardType = "Debit"
	CARDTYPE_CHARGE CardType = "Charge"
	CARDTYPE_OTHER CardType = "Other"
	CARDTYPE_PREPAID CardType = "Prepaid"
	CARDTYPE_VISA_DEFERRED_DEBIT CardType = "VisaDeferredDebit"
	CARDTYPE_NETWORK_ONLY CardType = "NetworkOnly"
)

// All allowed values of CardType enum
var AllowedCardTypeEnumValues = []CardType{
	"Credit",
	"Debit",
	"Charge",
	"Other",
	"Prepaid",
	"VisaDeferredDebit",
	"NetworkOnly",
}

func (v *CardType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := CardType(value)
	for _, existing := range AllowedCardTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid CardType", value)
}

// NewCardTypeFromValue returns a pointer to a valid CardType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewCardTypeFromValue(v string) (*CardType, error) {
	ev := CardType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for CardType: valid values are %v", v, AllowedCardTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v CardType) IsValid() bool {
	for _, existing := range AllowedCardTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to CardType value
func (v CardType) Ptr() *CardType {
	return &v
}

type NullableCardType struct {
	value *CardType
	isSet bool
}

func (v NullableCardType) Get() *CardType {
	return v.value
}

func (v *NullableCardType) Set(val *CardType) {
	v.value = val
	v.isSet = true
}

func (v NullableCardType) IsSet() bool {
	return v.isSet
}

func (v *NullableCardType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCardType(val *CardType) *NullableCardType {
	return &NullableCardType{value: val, isSet: true}
}

func (v NullableCardType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCardType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

