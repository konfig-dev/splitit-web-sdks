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

// CardData struct for CardData
type CardData struct {
	CardHolderFullName *string `json:"CardHolderFullName,omitempty"`
	CardNumber *string `json:"CardNumber,omitempty"`
	CardExpYear *string `json:"CardExpYear,omitempty"`
	CardExpMonth *string `json:"CardExpMonth,omitempty"`
	CardCvv *string `json:"CardCvv,omitempty"`
	CardBrand *CardBrand `json:"CardBrand,omitempty"`
	CardType *CardType `json:"CardType,omitempty"`
}

// NewCardData instantiates a new CardData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCardData() *CardData {
	this := CardData{}
	return &this
}

// NewCardDataWithDefaults instantiates a new CardData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCardDataWithDefaults() *CardData {
	this := CardData{}
	return &this
}

// GetCardHolderFullName returns the CardHolderFullName field value if set, zero value otherwise.
func (o *CardData) GetCardHolderFullName() string {
	if o == nil || isNil(o.CardHolderFullName) {
		var ret string
		return ret
	}
	return *o.CardHolderFullName
}

// GetCardHolderFullNameOk returns a tuple with the CardHolderFullName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CardData) GetCardHolderFullNameOk() (*string, bool) {
	if o == nil || isNil(o.CardHolderFullName) {
    return nil, false
	}
	return o.CardHolderFullName, true
}

// HasCardHolderFullName returns a boolean if a field has been set.
func (o *CardData) HasCardHolderFullName() bool {
	if o != nil && !isNil(o.CardHolderFullName) {
		return true
	}

	return false
}

// SetCardHolderFullName gets a reference to the given string and assigns it to the CardHolderFullName field.
func (o *CardData) SetCardHolderFullName(v string) {
	o.CardHolderFullName = &v
}

// GetCardNumber returns the CardNumber field value if set, zero value otherwise.
func (o *CardData) GetCardNumber() string {
	if o == nil || isNil(o.CardNumber) {
		var ret string
		return ret
	}
	return *o.CardNumber
}

// GetCardNumberOk returns a tuple with the CardNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CardData) GetCardNumberOk() (*string, bool) {
	if o == nil || isNil(o.CardNumber) {
    return nil, false
	}
	return o.CardNumber, true
}

// HasCardNumber returns a boolean if a field has been set.
func (o *CardData) HasCardNumber() bool {
	if o != nil && !isNil(o.CardNumber) {
		return true
	}

	return false
}

// SetCardNumber gets a reference to the given string and assigns it to the CardNumber field.
func (o *CardData) SetCardNumber(v string) {
	o.CardNumber = &v
}

// GetCardExpYear returns the CardExpYear field value if set, zero value otherwise.
func (o *CardData) GetCardExpYear() string {
	if o == nil || isNil(o.CardExpYear) {
		var ret string
		return ret
	}
	return *o.CardExpYear
}

// GetCardExpYearOk returns a tuple with the CardExpYear field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CardData) GetCardExpYearOk() (*string, bool) {
	if o == nil || isNil(o.CardExpYear) {
    return nil, false
	}
	return o.CardExpYear, true
}

// HasCardExpYear returns a boolean if a field has been set.
func (o *CardData) HasCardExpYear() bool {
	if o != nil && !isNil(o.CardExpYear) {
		return true
	}

	return false
}

// SetCardExpYear gets a reference to the given string and assigns it to the CardExpYear field.
func (o *CardData) SetCardExpYear(v string) {
	o.CardExpYear = &v
}

// GetCardExpMonth returns the CardExpMonth field value if set, zero value otherwise.
func (o *CardData) GetCardExpMonth() string {
	if o == nil || isNil(o.CardExpMonth) {
		var ret string
		return ret
	}
	return *o.CardExpMonth
}

// GetCardExpMonthOk returns a tuple with the CardExpMonth field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CardData) GetCardExpMonthOk() (*string, bool) {
	if o == nil || isNil(o.CardExpMonth) {
    return nil, false
	}
	return o.CardExpMonth, true
}

// HasCardExpMonth returns a boolean if a field has been set.
func (o *CardData) HasCardExpMonth() bool {
	if o != nil && !isNil(o.CardExpMonth) {
		return true
	}

	return false
}

// SetCardExpMonth gets a reference to the given string and assigns it to the CardExpMonth field.
func (o *CardData) SetCardExpMonth(v string) {
	o.CardExpMonth = &v
}

// GetCardCvv returns the CardCvv field value if set, zero value otherwise.
func (o *CardData) GetCardCvv() string {
	if o == nil || isNil(o.CardCvv) {
		var ret string
		return ret
	}
	return *o.CardCvv
}

// GetCardCvvOk returns a tuple with the CardCvv field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CardData) GetCardCvvOk() (*string, bool) {
	if o == nil || isNil(o.CardCvv) {
    return nil, false
	}
	return o.CardCvv, true
}

// HasCardCvv returns a boolean if a field has been set.
func (o *CardData) HasCardCvv() bool {
	if o != nil && !isNil(o.CardCvv) {
		return true
	}

	return false
}

// SetCardCvv gets a reference to the given string and assigns it to the CardCvv field.
func (o *CardData) SetCardCvv(v string) {
	o.CardCvv = &v
}

// GetCardBrand returns the CardBrand field value if set, zero value otherwise.
func (o *CardData) GetCardBrand() CardBrand {
	if o == nil || isNil(o.CardBrand) {
		var ret CardBrand
		return ret
	}
	return *o.CardBrand
}

// GetCardBrandOk returns a tuple with the CardBrand field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CardData) GetCardBrandOk() (*CardBrand, bool) {
	if o == nil || isNil(o.CardBrand) {
    return nil, false
	}
	return o.CardBrand, true
}

// HasCardBrand returns a boolean if a field has been set.
func (o *CardData) HasCardBrand() bool {
	if o != nil && !isNil(o.CardBrand) {
		return true
	}

	return false
}

// SetCardBrand gets a reference to the given CardBrand and assigns it to the CardBrand field.
func (o *CardData) SetCardBrand(v CardBrand) {
	o.CardBrand = &v
}

// GetCardType returns the CardType field value if set, zero value otherwise.
func (o *CardData) GetCardType() CardType {
	if o == nil || isNil(o.CardType) {
		var ret CardType
		return ret
	}
	return *o.CardType
}

// GetCardTypeOk returns a tuple with the CardType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CardData) GetCardTypeOk() (*CardType, bool) {
	if o == nil || isNil(o.CardType) {
    return nil, false
	}
	return o.CardType, true
}

// HasCardType returns a boolean if a field has been set.
func (o *CardData) HasCardType() bool {
	if o != nil && !isNil(o.CardType) {
		return true
	}

	return false
}

// SetCardType gets a reference to the given CardType and assigns it to the CardType field.
func (o *CardData) SetCardType(v CardType) {
	o.CardType = &v
}

func (o CardData) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.CardHolderFullName) {
		toSerialize["CardHolderFullName"] = o.CardHolderFullName
	}
	if !isNil(o.CardNumber) {
		toSerialize["CardNumber"] = o.CardNumber
	}
	if !isNil(o.CardExpYear) {
		toSerialize["CardExpYear"] = o.CardExpYear
	}
	if !isNil(o.CardExpMonth) {
		toSerialize["CardExpMonth"] = o.CardExpMonth
	}
	if !isNil(o.CardCvv) {
		toSerialize["CardCvv"] = o.CardCvv
	}
	if !isNil(o.CardBrand) {
		toSerialize["CardBrand"] = o.CardBrand
	}
	if !isNil(o.CardType) {
		toSerialize["CardType"] = o.CardType
	}
	return json.Marshal(toSerialize)
}

type NullableCardData struct {
	value *CardData
	isSet bool
}

func (v NullableCardData) Get() *CardData {
	return v.value
}

func (v *NullableCardData) Set(val *CardData) {
	v.value = val
	v.isSet = true
}

func (v NullableCardData) IsSet() bool {
	return v.isSet
}

func (v *NullableCardData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCardData(val *CardData) *NullableCardData {
	return &NullableCardData{value: val, isSet: true}
}

func (v NullableCardData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCardData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


