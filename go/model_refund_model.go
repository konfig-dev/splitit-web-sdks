/*
splitit-web-api-v3

Splitit's Web API

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package splitit

import (
	"encoding/json"
	"time"
)

// RefundModel struct for RefundModel
type RefundModel struct {
	RefundId *string `json:"RefundId,omitempty"`
	SubmitDate time.Time `json:"SubmitDate"`
	TotalAmount float32 `json:"TotalAmount"`
	Status RefundStatus `json:"Status"`
	NonCreditRefundAmount float32 `json:"NonCreditRefundAmount"`
	CreditRefundAmount float32 `json:"CreditRefundAmount"`
}

// NewRefundModel instantiates a new RefundModel object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRefundModel(submitDate time.Time, totalAmount float32, status RefundStatus, nonCreditRefundAmount float32, creditRefundAmount float32) *RefundModel {
	this := RefundModel{}
	this.SubmitDate = submitDate
	this.TotalAmount = totalAmount
	this.Status = status
	this.NonCreditRefundAmount = nonCreditRefundAmount
	this.CreditRefundAmount = creditRefundAmount
	return &this
}

// NewRefundModelWithDefaults instantiates a new RefundModel object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRefundModelWithDefaults() *RefundModel {
	this := RefundModel{}
	return &this
}

// GetRefundId returns the RefundId field value if set, zero value otherwise.
func (o *RefundModel) GetRefundId() string {
	if o == nil || isNil(o.RefundId) {
		var ret string
		return ret
	}
	return *o.RefundId
}

// GetRefundIdOk returns a tuple with the RefundId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RefundModel) GetRefundIdOk() (*string, bool) {
	if o == nil || isNil(o.RefundId) {
    return nil, false
	}
	return o.RefundId, true
}

// HasRefundId returns a boolean if a field has been set.
func (o *RefundModel) HasRefundId() bool {
	if o != nil && !isNil(o.RefundId) {
		return true
	}

	return false
}

// SetRefundId gets a reference to the given string and assigns it to the RefundId field.
func (o *RefundModel) SetRefundId(v string) {
	o.RefundId = &v
}

// GetSubmitDate returns the SubmitDate field value
func (o *RefundModel) GetSubmitDate() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.SubmitDate
}

// GetSubmitDateOk returns a tuple with the SubmitDate field value
// and a boolean to check if the value has been set.
func (o *RefundModel) GetSubmitDateOk() (*time.Time, bool) {
	if o == nil {
    return nil, false
	}
	return &o.SubmitDate, true
}

// SetSubmitDate sets field value
func (o *RefundModel) SetSubmitDate(v time.Time) {
	o.SubmitDate = v
}

// GetTotalAmount returns the TotalAmount field value
func (o *RefundModel) GetTotalAmount() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.TotalAmount
}

// GetTotalAmountOk returns a tuple with the TotalAmount field value
// and a boolean to check if the value has been set.
func (o *RefundModel) GetTotalAmountOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.TotalAmount, true
}

// SetTotalAmount sets field value
func (o *RefundModel) SetTotalAmount(v float32) {
	o.TotalAmount = v
}

// GetStatus returns the Status field value
func (o *RefundModel) GetStatus() RefundStatus {
	if o == nil {
		var ret RefundStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *RefundModel) GetStatusOk() (*RefundStatus, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *RefundModel) SetStatus(v RefundStatus) {
	o.Status = v
}

// GetNonCreditRefundAmount returns the NonCreditRefundAmount field value
func (o *RefundModel) GetNonCreditRefundAmount() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.NonCreditRefundAmount
}

// GetNonCreditRefundAmountOk returns a tuple with the NonCreditRefundAmount field value
// and a boolean to check if the value has been set.
func (o *RefundModel) GetNonCreditRefundAmountOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NonCreditRefundAmount, true
}

// SetNonCreditRefundAmount sets field value
func (o *RefundModel) SetNonCreditRefundAmount(v float32) {
	o.NonCreditRefundAmount = v
}

// GetCreditRefundAmount returns the CreditRefundAmount field value
func (o *RefundModel) GetCreditRefundAmount() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.CreditRefundAmount
}

// GetCreditRefundAmountOk returns a tuple with the CreditRefundAmount field value
// and a boolean to check if the value has been set.
func (o *RefundModel) GetCreditRefundAmountOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CreditRefundAmount, true
}

// SetCreditRefundAmount sets field value
func (o *RefundModel) SetCreditRefundAmount(v float32) {
	o.CreditRefundAmount = v
}

func (o RefundModel) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.RefundId) {
		toSerialize["RefundId"] = o.RefundId
	}
	if true {
		toSerialize["SubmitDate"] = o.SubmitDate
	}
	if true {
		toSerialize["TotalAmount"] = o.TotalAmount
	}
	if true {
		toSerialize["Status"] = o.Status
	}
	if true {
		toSerialize["NonCreditRefundAmount"] = o.NonCreditRefundAmount
	}
	if true {
		toSerialize["CreditRefundAmount"] = o.CreditRefundAmount
	}
	return json.Marshal(toSerialize)
}

type NullableRefundModel struct {
	value *RefundModel
	isSet bool
}

func (v NullableRefundModel) Get() *RefundModel {
	return v.value
}

func (v *NullableRefundModel) Set(val *RefundModel) {
	v.value = val
	v.isSet = true
}

func (v NullableRefundModel) IsSet() bool {
	return v.isSet
}

func (v *NullableRefundModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRefundModel(val *RefundModel) *NullableRefundModel {
	return &NullableRefundModel{value: val, isSet: true}
}

func (v NullableRefundModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRefundModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


