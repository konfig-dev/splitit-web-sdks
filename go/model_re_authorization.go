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

// ReAuthorization struct for ReAuthorization
type ReAuthorization struct {
	ProcessingDate *time.Time `json:"ProcessingDate,omitempty"`
	Amount *Money `json:"Amount,omitempty"`
	TransactionResults []TransactionResult `json:"TransactionResults,omitempty"`
	CardDetails *CardData2 `json:"CardDetails,omitempty"`
	Result *bool `json:"Result,omitempty"`
}

// NewReAuthorization instantiates a new ReAuthorization object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReAuthorization() *ReAuthorization {
	this := ReAuthorization{}
	return &this
}

// NewReAuthorizationWithDefaults instantiates a new ReAuthorization object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReAuthorizationWithDefaults() *ReAuthorization {
	this := ReAuthorization{}
	return &this
}

// GetProcessingDate returns the ProcessingDate field value if set, zero value otherwise.
func (o *ReAuthorization) GetProcessingDate() time.Time {
	if o == nil || isNil(o.ProcessingDate) {
		var ret time.Time
		return ret
	}
	return *o.ProcessingDate
}

// GetProcessingDateOk returns a tuple with the ProcessingDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReAuthorization) GetProcessingDateOk() (*time.Time, bool) {
	if o == nil || isNil(o.ProcessingDate) {
    return nil, false
	}
	return o.ProcessingDate, true
}

// HasProcessingDate returns a boolean if a field has been set.
func (o *ReAuthorization) HasProcessingDate() bool {
	if o != nil && !isNil(o.ProcessingDate) {
		return true
	}

	return false
}

// SetProcessingDate gets a reference to the given time.Time and assigns it to the ProcessingDate field.
func (o *ReAuthorization) SetProcessingDate(v time.Time) {
	o.ProcessingDate = &v
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *ReAuthorization) GetAmount() Money {
	if o == nil || isNil(o.Amount) {
		var ret Money
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReAuthorization) GetAmountOk() (*Money, bool) {
	if o == nil || isNil(o.Amount) {
    return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *ReAuthorization) HasAmount() bool {
	if o != nil && !isNil(o.Amount) {
		return true
	}

	return false
}

// SetAmount gets a reference to the given Money and assigns it to the Amount field.
func (o *ReAuthorization) SetAmount(v Money) {
	o.Amount = &v
}

// GetTransactionResults returns the TransactionResults field value if set, zero value otherwise.
func (o *ReAuthorization) GetTransactionResults() []TransactionResult {
	if o == nil || isNil(o.TransactionResults) {
		var ret []TransactionResult
		return ret
	}
	return o.TransactionResults
}

// GetTransactionResultsOk returns a tuple with the TransactionResults field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReAuthorization) GetTransactionResultsOk() ([]TransactionResult, bool) {
	if o == nil || isNil(o.TransactionResults) {
    return nil, false
	}
	return o.TransactionResults, true
}

// HasTransactionResults returns a boolean if a field has been set.
func (o *ReAuthorization) HasTransactionResults() bool {
	if o != nil && !isNil(o.TransactionResults) {
		return true
	}

	return false
}

// SetTransactionResults gets a reference to the given []TransactionResult and assigns it to the TransactionResults field.
func (o *ReAuthorization) SetTransactionResults(v []TransactionResult) {
	o.TransactionResults = v
}

// GetCardDetails returns the CardDetails field value if set, zero value otherwise.
func (o *ReAuthorization) GetCardDetails() CardData2 {
	if o == nil || isNil(o.CardDetails) {
		var ret CardData2
		return ret
	}
	return *o.CardDetails
}

// GetCardDetailsOk returns a tuple with the CardDetails field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReAuthorization) GetCardDetailsOk() (*CardData2, bool) {
	if o == nil || isNil(o.CardDetails) {
    return nil, false
	}
	return o.CardDetails, true
}

// HasCardDetails returns a boolean if a field has been set.
func (o *ReAuthorization) HasCardDetails() bool {
	if o != nil && !isNil(o.CardDetails) {
		return true
	}

	return false
}

// SetCardDetails gets a reference to the given CardData2 and assigns it to the CardDetails field.
func (o *ReAuthorization) SetCardDetails(v CardData2) {
	o.CardDetails = &v
}

// GetResult returns the Result field value if set, zero value otherwise.
func (o *ReAuthorization) GetResult() bool {
	if o == nil || isNil(o.Result) {
		var ret bool
		return ret
	}
	return *o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReAuthorization) GetResultOk() (*bool, bool) {
	if o == nil || isNil(o.Result) {
    return nil, false
	}
	return o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *ReAuthorization) HasResult() bool {
	if o != nil && !isNil(o.Result) {
		return true
	}

	return false
}

// SetResult gets a reference to the given bool and assigns it to the Result field.
func (o *ReAuthorization) SetResult(v bool) {
	o.Result = &v
}

func (o ReAuthorization) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ProcessingDate) {
		toSerialize["ProcessingDate"] = o.ProcessingDate
	}
	if !isNil(o.Amount) {
		toSerialize["Amount"] = o.Amount
	}
	if !isNil(o.TransactionResults) {
		toSerialize["TransactionResults"] = o.TransactionResults
	}
	if !isNil(o.CardDetails) {
		toSerialize["CardDetails"] = o.CardDetails
	}
	if !isNil(o.Result) {
		toSerialize["Result"] = o.Result
	}
	return json.Marshal(toSerialize)
}

type NullableReAuthorization struct {
	value *ReAuthorization
	isSet bool
}

func (v NullableReAuthorization) Get() *ReAuthorization {
	return v.value
}

func (v *NullableReAuthorization) Set(val *ReAuthorization) {
	v.value = val
	v.isSet = true
}

func (v NullableReAuthorization) IsSet() bool {
	return v.isSet
}

func (v *NullableReAuthorization) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReAuthorization(val *ReAuthorization) *NullableReAuthorization {
	return &NullableReAuthorization{value: val, isSet: true}
}

func (v NullableReAuthorization) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReAuthorization) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


