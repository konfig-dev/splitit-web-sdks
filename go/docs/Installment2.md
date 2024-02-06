# Installment2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InstallmentId** | Pointer to **string** |  | [optional] 
**InstallmentNumber** | **int32** |  | 
**Amount** | Pointer to [**Money**](Money.md) |  | [optional] 
**OriginalAmount** | Pointer to [**Money**](Money.md) |  | [optional] 
**RefundAmount** | Pointer to [**Money**](Money.md) |  | [optional] 
**ProcessDateTime** | Pointer to **time.Time** |  | [optional] 
**IsRefund** | **bool** |  | 
**RequiredCredit** | Pointer to [**Money**](Money.md) |  | [optional] 
**CreatedDateTime** | **time.Time** |  | 
**Status** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**TransactionResults** | Pointer to [**[]TransactionResult**](TransactionResult.md) |  | [optional] 
**CardDetails** | Pointer to [**CardData2**](CardData2.md) |  | [optional] 
**Result** | Pointer to **bool** |  | [optional] 
**PaymentMethod** | Pointer to **string** |  | [optional] 

## Methods

### NewInstallment2

`func NewInstallment2(installmentNumber int32, isRefund bool, createdDateTime time.Time, ) *Installment2`

NewInstallment2 instantiates a new Installment2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInstallment2WithDefaults

`func NewInstallment2WithDefaults() *Installment2`

NewInstallment2WithDefaults instantiates a new Installment2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstallmentId

`func (o *Installment2) GetInstallmentId() string`

GetInstallmentId returns the InstallmentId field if non-nil, zero value otherwise.

### GetInstallmentIdOk

`func (o *Installment2) GetInstallmentIdOk() (*string, bool)`

GetInstallmentIdOk returns a tuple with the InstallmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentId

`func (o *Installment2) SetInstallmentId(v string)`

SetInstallmentId sets InstallmentId field to given value.

### HasInstallmentId

`func (o *Installment2) HasInstallmentId() bool`

HasInstallmentId returns a boolean if a field has been set.

### GetInstallmentNumber

`func (o *Installment2) GetInstallmentNumber() int32`

GetInstallmentNumber returns the InstallmentNumber field if non-nil, zero value otherwise.

### GetInstallmentNumberOk

`func (o *Installment2) GetInstallmentNumberOk() (*int32, bool)`

GetInstallmentNumberOk returns a tuple with the InstallmentNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentNumber

`func (o *Installment2) SetInstallmentNumber(v int32)`

SetInstallmentNumber sets InstallmentNumber field to given value.


### GetAmount

`func (o *Installment2) GetAmount() Money`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *Installment2) GetAmountOk() (*Money, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *Installment2) SetAmount(v Money)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *Installment2) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetOriginalAmount

`func (o *Installment2) GetOriginalAmount() Money`

GetOriginalAmount returns the OriginalAmount field if non-nil, zero value otherwise.

### GetOriginalAmountOk

`func (o *Installment2) GetOriginalAmountOk() (*Money, bool)`

GetOriginalAmountOk returns a tuple with the OriginalAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginalAmount

`func (o *Installment2) SetOriginalAmount(v Money)`

SetOriginalAmount sets OriginalAmount field to given value.

### HasOriginalAmount

`func (o *Installment2) HasOriginalAmount() bool`

HasOriginalAmount returns a boolean if a field has been set.

### GetRefundAmount

`func (o *Installment2) GetRefundAmount() Money`

GetRefundAmount returns the RefundAmount field if non-nil, zero value otherwise.

### GetRefundAmountOk

`func (o *Installment2) GetRefundAmountOk() (*Money, bool)`

GetRefundAmountOk returns a tuple with the RefundAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefundAmount

`func (o *Installment2) SetRefundAmount(v Money)`

SetRefundAmount sets RefundAmount field to given value.

### HasRefundAmount

`func (o *Installment2) HasRefundAmount() bool`

HasRefundAmount returns a boolean if a field has been set.

### GetProcessDateTime

`func (o *Installment2) GetProcessDateTime() time.Time`

GetProcessDateTime returns the ProcessDateTime field if non-nil, zero value otherwise.

### GetProcessDateTimeOk

`func (o *Installment2) GetProcessDateTimeOk() (*time.Time, bool)`

GetProcessDateTimeOk returns a tuple with the ProcessDateTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessDateTime

`func (o *Installment2) SetProcessDateTime(v time.Time)`

SetProcessDateTime sets ProcessDateTime field to given value.

### HasProcessDateTime

`func (o *Installment2) HasProcessDateTime() bool`

HasProcessDateTime returns a boolean if a field has been set.

### GetIsRefund

`func (o *Installment2) GetIsRefund() bool`

GetIsRefund returns the IsRefund field if non-nil, zero value otherwise.

### GetIsRefundOk

`func (o *Installment2) GetIsRefundOk() (*bool, bool)`

GetIsRefundOk returns a tuple with the IsRefund field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRefund

`func (o *Installment2) SetIsRefund(v bool)`

SetIsRefund sets IsRefund field to given value.


### GetRequiredCredit

`func (o *Installment2) GetRequiredCredit() Money`

GetRequiredCredit returns the RequiredCredit field if non-nil, zero value otherwise.

### GetRequiredCreditOk

`func (o *Installment2) GetRequiredCreditOk() (*Money, bool)`

GetRequiredCreditOk returns a tuple with the RequiredCredit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredCredit

`func (o *Installment2) SetRequiredCredit(v Money)`

SetRequiredCredit sets RequiredCredit field to given value.

### HasRequiredCredit

`func (o *Installment2) HasRequiredCredit() bool`

HasRequiredCredit returns a boolean if a field has been set.

### GetCreatedDateTime

`func (o *Installment2) GetCreatedDateTime() time.Time`

GetCreatedDateTime returns the CreatedDateTime field if non-nil, zero value otherwise.

### GetCreatedDateTimeOk

`func (o *Installment2) GetCreatedDateTimeOk() (*time.Time, bool)`

GetCreatedDateTimeOk returns a tuple with the CreatedDateTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedDateTime

`func (o *Installment2) SetCreatedDateTime(v time.Time)`

SetCreatedDateTime sets CreatedDateTime field to given value.


### GetStatus

`func (o *Installment2) GetStatus() ReferenceEntityBase`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Installment2) GetStatusOk() (*ReferenceEntityBase, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Installment2) SetStatus(v ReferenceEntityBase)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Installment2) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTransactionResults

`func (o *Installment2) GetTransactionResults() []TransactionResult`

GetTransactionResults returns the TransactionResults field if non-nil, zero value otherwise.

### GetTransactionResultsOk

`func (o *Installment2) GetTransactionResultsOk() (*[]TransactionResult, bool)`

GetTransactionResultsOk returns a tuple with the TransactionResults field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionResults

`func (o *Installment2) SetTransactionResults(v []TransactionResult)`

SetTransactionResults sets TransactionResults field to given value.

### HasTransactionResults

`func (o *Installment2) HasTransactionResults() bool`

HasTransactionResults returns a boolean if a field has been set.

### GetCardDetails

`func (o *Installment2) GetCardDetails() CardData2`

GetCardDetails returns the CardDetails field if non-nil, zero value otherwise.

### GetCardDetailsOk

`func (o *Installment2) GetCardDetailsOk() (*CardData2, bool)`

GetCardDetailsOk returns a tuple with the CardDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardDetails

`func (o *Installment2) SetCardDetails(v CardData2)`

SetCardDetails sets CardDetails field to given value.

### HasCardDetails

`func (o *Installment2) HasCardDetails() bool`

HasCardDetails returns a boolean if a field has been set.

### GetResult

`func (o *Installment2) GetResult() bool`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *Installment2) GetResultOk() (*bool, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *Installment2) SetResult(v bool)`

SetResult sets Result field to given value.

### HasResult

`func (o *Installment2) HasResult() bool`

HasResult returns a boolean if a field has been set.

### GetPaymentMethod

`func (o *Installment2) GetPaymentMethod() string`

GetPaymentMethod returns the PaymentMethod field if non-nil, zero value otherwise.

### GetPaymentMethodOk

`func (o *Installment2) GetPaymentMethodOk() (*string, bool)`

GetPaymentMethodOk returns a tuple with the PaymentMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethod

`func (o *Installment2) SetPaymentMethod(v string)`

SetPaymentMethod sets PaymentMethod field to given value.

### HasPaymentMethod

`func (o *Installment2) HasPaymentMethod() bool`

HasPaymentMethod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


