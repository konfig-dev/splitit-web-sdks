# TransactionResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GatewayTransactionId** | Pointer to **string** |  | [optional] 
**SplititTransactionId** | **int64** |  | 
**SplititGatewayTransactionId** | Pointer to **string** |  | [optional] 
**GatewayResultCode** | Pointer to **string** |  | [optional] 
**GatewayResultMessage** | Pointer to **string** |  | [optional] 
**OperationType** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**GatewayResult** | **bool** |  | 
**GatewayTransactionDate** | **time.Time** |  | 
**IsChargeback** | **bool** |  | 
**AVSResult** | Pointer to [**CardResult**](CardResult.md) |  | [optional] 
**CVCResult** | Pointer to [**CardResult**](CardResult.md) |  | [optional] 
**IsInDispute** | Pointer to **bool** |  | [optional] 
**DisputeStatus** | Pointer to [**DisputeStatus**](DisputeStatus.md) |  | [optional] 

## Methods

### NewTransactionResult

`func NewTransactionResult(splititTransactionId int64, gatewayResult bool, gatewayTransactionDate time.Time, isChargeback bool, ) *TransactionResult`

NewTransactionResult instantiates a new TransactionResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTransactionResultWithDefaults

`func NewTransactionResultWithDefaults() *TransactionResult`

NewTransactionResultWithDefaults instantiates a new TransactionResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGatewayTransactionId

`func (o *TransactionResult) GetGatewayTransactionId() string`

GetGatewayTransactionId returns the GatewayTransactionId field if non-nil, zero value otherwise.

### GetGatewayTransactionIdOk

`func (o *TransactionResult) GetGatewayTransactionIdOk() (*string, bool)`

GetGatewayTransactionIdOk returns a tuple with the GatewayTransactionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayTransactionId

`func (o *TransactionResult) SetGatewayTransactionId(v string)`

SetGatewayTransactionId sets GatewayTransactionId field to given value.

### HasGatewayTransactionId

`func (o *TransactionResult) HasGatewayTransactionId() bool`

HasGatewayTransactionId returns a boolean if a field has been set.

### GetSplititTransactionId

`func (o *TransactionResult) GetSplititTransactionId() int64`

GetSplititTransactionId returns the SplititTransactionId field if non-nil, zero value otherwise.

### GetSplititTransactionIdOk

`func (o *TransactionResult) GetSplititTransactionIdOk() (*int64, bool)`

GetSplititTransactionIdOk returns a tuple with the SplititTransactionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSplititTransactionId

`func (o *TransactionResult) SetSplititTransactionId(v int64)`

SetSplititTransactionId sets SplititTransactionId field to given value.


### GetSplititGatewayTransactionId

`func (o *TransactionResult) GetSplititGatewayTransactionId() string`

GetSplititGatewayTransactionId returns the SplititGatewayTransactionId field if non-nil, zero value otherwise.

### GetSplititGatewayTransactionIdOk

`func (o *TransactionResult) GetSplititGatewayTransactionIdOk() (*string, bool)`

GetSplititGatewayTransactionIdOk returns a tuple with the SplititGatewayTransactionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSplititGatewayTransactionId

`func (o *TransactionResult) SetSplititGatewayTransactionId(v string)`

SetSplititGatewayTransactionId sets SplititGatewayTransactionId field to given value.

### HasSplititGatewayTransactionId

`func (o *TransactionResult) HasSplititGatewayTransactionId() bool`

HasSplititGatewayTransactionId returns a boolean if a field has been set.

### GetGatewayResultCode

`func (o *TransactionResult) GetGatewayResultCode() string`

GetGatewayResultCode returns the GatewayResultCode field if non-nil, zero value otherwise.

### GetGatewayResultCodeOk

`func (o *TransactionResult) GetGatewayResultCodeOk() (*string, bool)`

GetGatewayResultCodeOk returns a tuple with the GatewayResultCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayResultCode

`func (o *TransactionResult) SetGatewayResultCode(v string)`

SetGatewayResultCode sets GatewayResultCode field to given value.

### HasGatewayResultCode

`func (o *TransactionResult) HasGatewayResultCode() bool`

HasGatewayResultCode returns a boolean if a field has been set.

### GetGatewayResultMessage

`func (o *TransactionResult) GetGatewayResultMessage() string`

GetGatewayResultMessage returns the GatewayResultMessage field if non-nil, zero value otherwise.

### GetGatewayResultMessageOk

`func (o *TransactionResult) GetGatewayResultMessageOk() (*string, bool)`

GetGatewayResultMessageOk returns a tuple with the GatewayResultMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayResultMessage

`func (o *TransactionResult) SetGatewayResultMessage(v string)`

SetGatewayResultMessage sets GatewayResultMessage field to given value.

### HasGatewayResultMessage

`func (o *TransactionResult) HasGatewayResultMessage() bool`

HasGatewayResultMessage returns a boolean if a field has been set.

### GetOperationType

`func (o *TransactionResult) GetOperationType() ReferenceEntityBase`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *TransactionResult) GetOperationTypeOk() (*ReferenceEntityBase, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *TransactionResult) SetOperationType(v ReferenceEntityBase)`

SetOperationType sets OperationType field to given value.

### HasOperationType

`func (o *TransactionResult) HasOperationType() bool`

HasOperationType returns a boolean if a field has been set.

### GetGatewayResult

`func (o *TransactionResult) GetGatewayResult() bool`

GetGatewayResult returns the GatewayResult field if non-nil, zero value otherwise.

### GetGatewayResultOk

`func (o *TransactionResult) GetGatewayResultOk() (*bool, bool)`

GetGatewayResultOk returns a tuple with the GatewayResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayResult

`func (o *TransactionResult) SetGatewayResult(v bool)`

SetGatewayResult sets GatewayResult field to given value.


### GetGatewayTransactionDate

`func (o *TransactionResult) GetGatewayTransactionDate() time.Time`

GetGatewayTransactionDate returns the GatewayTransactionDate field if non-nil, zero value otherwise.

### GetGatewayTransactionDateOk

`func (o *TransactionResult) GetGatewayTransactionDateOk() (*time.Time, bool)`

GetGatewayTransactionDateOk returns a tuple with the GatewayTransactionDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayTransactionDate

`func (o *TransactionResult) SetGatewayTransactionDate(v time.Time)`

SetGatewayTransactionDate sets GatewayTransactionDate field to given value.


### GetIsChargeback

`func (o *TransactionResult) GetIsChargeback() bool`

GetIsChargeback returns the IsChargeback field if non-nil, zero value otherwise.

### GetIsChargebackOk

`func (o *TransactionResult) GetIsChargebackOk() (*bool, bool)`

GetIsChargebackOk returns a tuple with the IsChargeback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsChargeback

`func (o *TransactionResult) SetIsChargeback(v bool)`

SetIsChargeback sets IsChargeback field to given value.


### GetAVSResult

`func (o *TransactionResult) GetAVSResult() CardResult`

GetAVSResult returns the AVSResult field if non-nil, zero value otherwise.

### GetAVSResultOk

`func (o *TransactionResult) GetAVSResultOk() (*CardResult, bool)`

GetAVSResultOk returns a tuple with the AVSResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAVSResult

`func (o *TransactionResult) SetAVSResult(v CardResult)`

SetAVSResult sets AVSResult field to given value.

### HasAVSResult

`func (o *TransactionResult) HasAVSResult() bool`

HasAVSResult returns a boolean if a field has been set.

### GetCVCResult

`func (o *TransactionResult) GetCVCResult() CardResult`

GetCVCResult returns the CVCResult field if non-nil, zero value otherwise.

### GetCVCResultOk

`func (o *TransactionResult) GetCVCResultOk() (*CardResult, bool)`

GetCVCResultOk returns a tuple with the CVCResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCVCResult

`func (o *TransactionResult) SetCVCResult(v CardResult)`

SetCVCResult sets CVCResult field to given value.

### HasCVCResult

`func (o *TransactionResult) HasCVCResult() bool`

HasCVCResult returns a boolean if a field has been set.

### GetIsInDispute

`func (o *TransactionResult) GetIsInDispute() bool`

GetIsInDispute returns the IsInDispute field if non-nil, zero value otherwise.

### GetIsInDisputeOk

`func (o *TransactionResult) GetIsInDisputeOk() (*bool, bool)`

GetIsInDisputeOk returns a tuple with the IsInDispute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsInDispute

`func (o *TransactionResult) SetIsInDispute(v bool)`

SetIsInDispute sets IsInDispute field to given value.

### HasIsInDispute

`func (o *TransactionResult) HasIsInDispute() bool`

HasIsInDispute returns a boolean if a field has been set.

### GetDisputeStatus

`func (o *TransactionResult) GetDisputeStatus() DisputeStatus`

GetDisputeStatus returns the DisputeStatus field if non-nil, zero value otherwise.

### GetDisputeStatusOk

`func (o *TransactionResult) GetDisputeStatusOk() (*DisputeStatus, bool)`

GetDisputeStatusOk returns a tuple with the DisputeStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisputeStatus

`func (o *TransactionResult) SetDisputeStatus(v DisputeStatus)`

SetDisputeStatus sets DisputeStatus field to given value.

### HasDisputeStatus

`func (o *TransactionResult) HasDisputeStatus() bool`

HasDisputeStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


