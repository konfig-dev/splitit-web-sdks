# ReAuthorization

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProcessingDate** | Pointer to **time.Time** |  | [optional] 
**Amount** | Pointer to [**Money**](Money.md) |  | [optional] 
**TransactionResults** | Pointer to [**[]TransactionResult**](TransactionResult.md) |  | [optional] 
**CardDetails** | Pointer to [**CardData2**](CardData2.md) |  | [optional] 
**Result** | Pointer to **bool** |  | [optional] 

## Methods

### NewReAuthorization

`func NewReAuthorization() *ReAuthorization`

NewReAuthorization instantiates a new ReAuthorization object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReAuthorizationWithDefaults

`func NewReAuthorizationWithDefaults() *ReAuthorization`

NewReAuthorizationWithDefaults instantiates a new ReAuthorization object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetProcessingDate

`func (o *ReAuthorization) GetProcessingDate() time.Time`

GetProcessingDate returns the ProcessingDate field if non-nil, zero value otherwise.

### GetProcessingDateOk

`func (o *ReAuthorization) GetProcessingDateOk() (*time.Time, bool)`

GetProcessingDateOk returns a tuple with the ProcessingDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessingDate

`func (o *ReAuthorization) SetProcessingDate(v time.Time)`

SetProcessingDate sets ProcessingDate field to given value.

### HasProcessingDate

`func (o *ReAuthorization) HasProcessingDate() bool`

HasProcessingDate returns a boolean if a field has been set.

### GetAmount

`func (o *ReAuthorization) GetAmount() Money`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *ReAuthorization) GetAmountOk() (*Money, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *ReAuthorization) SetAmount(v Money)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *ReAuthorization) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetTransactionResults

`func (o *ReAuthorization) GetTransactionResults() []TransactionResult`

GetTransactionResults returns the TransactionResults field if non-nil, zero value otherwise.

### GetTransactionResultsOk

`func (o *ReAuthorization) GetTransactionResultsOk() (*[]TransactionResult, bool)`

GetTransactionResultsOk returns a tuple with the TransactionResults field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionResults

`func (o *ReAuthorization) SetTransactionResults(v []TransactionResult)`

SetTransactionResults sets TransactionResults field to given value.

### HasTransactionResults

`func (o *ReAuthorization) HasTransactionResults() bool`

HasTransactionResults returns a boolean if a field has been set.

### GetCardDetails

`func (o *ReAuthorization) GetCardDetails() CardData2`

GetCardDetails returns the CardDetails field if non-nil, zero value otherwise.

### GetCardDetailsOk

`func (o *ReAuthorization) GetCardDetailsOk() (*CardData2, bool)`

GetCardDetailsOk returns a tuple with the CardDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardDetails

`func (o *ReAuthorization) SetCardDetails(v CardData2)`

SetCardDetails sets CardDetails field to given value.

### HasCardDetails

`func (o *ReAuthorization) HasCardDetails() bool`

HasCardDetails returns a boolean if a field has been set.

### GetResult

`func (o *ReAuthorization) GetResult() bool`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ReAuthorization) GetResultOk() (*bool, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ReAuthorization) SetResult(v bool)`

SetResult sets Result field to given value.

### HasResult

`func (o *ReAuthorization) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


