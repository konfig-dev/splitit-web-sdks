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

// PaymentPlanOptionModel struct for PaymentPlanOptionModel
type PaymentPlanOptionModel struct {
	NumberOfInstallments int32 `json:"NumberOfInstallments"`
	FirstInstallmentAmount float32 `json:"FirstInstallmentAmount"`
	InstallmentAmount float32 `json:"InstallmentAmount"`
	LastInstallmentAmount float32 `json:"LastInstallmentAmount"`
	Links *LinksModel `json:"Links,omitempty"`
	TermsAndConditionsBrief *string `json:"TermsAndConditionsBrief,omitempty"`
	InstallmentFrequency *string `json:"InstallmentFrequency,omitempty"`
}

// NewPaymentPlanOptionModel instantiates a new PaymentPlanOptionModel object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPaymentPlanOptionModel(numberOfInstallments int32, firstInstallmentAmount float32, installmentAmount float32, lastInstallmentAmount float32) *PaymentPlanOptionModel {
	this := PaymentPlanOptionModel{}
	this.NumberOfInstallments = numberOfInstallments
	this.FirstInstallmentAmount = firstInstallmentAmount
	this.InstallmentAmount = installmentAmount
	this.LastInstallmentAmount = lastInstallmentAmount
	return &this
}

// NewPaymentPlanOptionModelWithDefaults instantiates a new PaymentPlanOptionModel object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaymentPlanOptionModelWithDefaults() *PaymentPlanOptionModel {
	this := PaymentPlanOptionModel{}
	return &this
}

// GetNumberOfInstallments returns the NumberOfInstallments field value
func (o *PaymentPlanOptionModel) GetNumberOfInstallments() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.NumberOfInstallments
}

// GetNumberOfInstallmentsOk returns a tuple with the NumberOfInstallments field value
// and a boolean to check if the value has been set.
func (o *PaymentPlanOptionModel) GetNumberOfInstallmentsOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NumberOfInstallments, true
}

// SetNumberOfInstallments sets field value
func (o *PaymentPlanOptionModel) SetNumberOfInstallments(v int32) {
	o.NumberOfInstallments = v
}

// GetFirstInstallmentAmount returns the FirstInstallmentAmount field value
func (o *PaymentPlanOptionModel) GetFirstInstallmentAmount() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.FirstInstallmentAmount
}

// GetFirstInstallmentAmountOk returns a tuple with the FirstInstallmentAmount field value
// and a boolean to check if the value has been set.
func (o *PaymentPlanOptionModel) GetFirstInstallmentAmountOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.FirstInstallmentAmount, true
}

// SetFirstInstallmentAmount sets field value
func (o *PaymentPlanOptionModel) SetFirstInstallmentAmount(v float32) {
	o.FirstInstallmentAmount = v
}

// GetInstallmentAmount returns the InstallmentAmount field value
func (o *PaymentPlanOptionModel) GetInstallmentAmount() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.InstallmentAmount
}

// GetInstallmentAmountOk returns a tuple with the InstallmentAmount field value
// and a boolean to check if the value has been set.
func (o *PaymentPlanOptionModel) GetInstallmentAmountOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.InstallmentAmount, true
}

// SetInstallmentAmount sets field value
func (o *PaymentPlanOptionModel) SetInstallmentAmount(v float32) {
	o.InstallmentAmount = v
}

// GetLastInstallmentAmount returns the LastInstallmentAmount field value
func (o *PaymentPlanOptionModel) GetLastInstallmentAmount() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.LastInstallmentAmount
}

// GetLastInstallmentAmountOk returns a tuple with the LastInstallmentAmount field value
// and a boolean to check if the value has been set.
func (o *PaymentPlanOptionModel) GetLastInstallmentAmountOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.LastInstallmentAmount, true
}

// SetLastInstallmentAmount sets field value
func (o *PaymentPlanOptionModel) SetLastInstallmentAmount(v float32) {
	o.LastInstallmentAmount = v
}

// GetLinks returns the Links field value if set, zero value otherwise.
func (o *PaymentPlanOptionModel) GetLinks() LinksModel {
	if o == nil || isNil(o.Links) {
		var ret LinksModel
		return ret
	}
	return *o.Links
}

// GetLinksOk returns a tuple with the Links field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentPlanOptionModel) GetLinksOk() (*LinksModel, bool) {
	if o == nil || isNil(o.Links) {
    return nil, false
	}
	return o.Links, true
}

// HasLinks returns a boolean if a field has been set.
func (o *PaymentPlanOptionModel) HasLinks() bool {
	if o != nil && !isNil(o.Links) {
		return true
	}

	return false
}

// SetLinks gets a reference to the given LinksModel and assigns it to the Links field.
func (o *PaymentPlanOptionModel) SetLinks(v LinksModel) {
	o.Links = &v
}

// GetTermsAndConditionsBrief returns the TermsAndConditionsBrief field value if set, zero value otherwise.
func (o *PaymentPlanOptionModel) GetTermsAndConditionsBrief() string {
	if o == nil || isNil(o.TermsAndConditionsBrief) {
		var ret string
		return ret
	}
	return *o.TermsAndConditionsBrief
}

// GetTermsAndConditionsBriefOk returns a tuple with the TermsAndConditionsBrief field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentPlanOptionModel) GetTermsAndConditionsBriefOk() (*string, bool) {
	if o == nil || isNil(o.TermsAndConditionsBrief) {
    return nil, false
	}
	return o.TermsAndConditionsBrief, true
}

// HasTermsAndConditionsBrief returns a boolean if a field has been set.
func (o *PaymentPlanOptionModel) HasTermsAndConditionsBrief() bool {
	if o != nil && !isNil(o.TermsAndConditionsBrief) {
		return true
	}

	return false
}

// SetTermsAndConditionsBrief gets a reference to the given string and assigns it to the TermsAndConditionsBrief field.
func (o *PaymentPlanOptionModel) SetTermsAndConditionsBrief(v string) {
	o.TermsAndConditionsBrief = &v
}

// GetInstallmentFrequency returns the InstallmentFrequency field value if set, zero value otherwise.
func (o *PaymentPlanOptionModel) GetInstallmentFrequency() string {
	if o == nil || isNil(o.InstallmentFrequency) {
		var ret string
		return ret
	}
	return *o.InstallmentFrequency
}

// GetInstallmentFrequencyOk returns a tuple with the InstallmentFrequency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentPlanOptionModel) GetInstallmentFrequencyOk() (*string, bool) {
	if o == nil || isNil(o.InstallmentFrequency) {
    return nil, false
	}
	return o.InstallmentFrequency, true
}

// HasInstallmentFrequency returns a boolean if a field has been set.
func (o *PaymentPlanOptionModel) HasInstallmentFrequency() bool {
	if o != nil && !isNil(o.InstallmentFrequency) {
		return true
	}

	return false
}

// SetInstallmentFrequency gets a reference to the given string and assigns it to the InstallmentFrequency field.
func (o *PaymentPlanOptionModel) SetInstallmentFrequency(v string) {
	o.InstallmentFrequency = &v
}

func (o PaymentPlanOptionModel) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["NumberOfInstallments"] = o.NumberOfInstallments
	}
	if true {
		toSerialize["FirstInstallmentAmount"] = o.FirstInstallmentAmount
	}
	if true {
		toSerialize["InstallmentAmount"] = o.InstallmentAmount
	}
	if true {
		toSerialize["LastInstallmentAmount"] = o.LastInstallmentAmount
	}
	if !isNil(o.Links) {
		toSerialize["Links"] = o.Links
	}
	if !isNil(o.TermsAndConditionsBrief) {
		toSerialize["TermsAndConditionsBrief"] = o.TermsAndConditionsBrief
	}
	if !isNil(o.InstallmentFrequency) {
		toSerialize["InstallmentFrequency"] = o.InstallmentFrequency
	}
	return json.Marshal(toSerialize)
}

type NullablePaymentPlanOptionModel struct {
	value *PaymentPlanOptionModel
	isSet bool
}

func (v NullablePaymentPlanOptionModel) Get() *PaymentPlanOptionModel {
	return v.value
}

func (v *NullablePaymentPlanOptionModel) Set(val *PaymentPlanOptionModel) {
	v.value = val
	v.isSet = true
}

func (v NullablePaymentPlanOptionModel) IsSet() bool {
	return v.isSet
}

func (v *NullablePaymentPlanOptionModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePaymentPlanOptionModel(val *PaymentPlanOptionModel) *NullablePaymentPlanOptionModel {
	return &NullablePaymentPlanOptionModel{value: val, isSet: true}
}

func (v NullablePaymentPlanOptionModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePaymentPlanOptionModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


