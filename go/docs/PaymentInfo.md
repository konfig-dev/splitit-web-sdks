# PaymentInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CardBin** | Pointer to **string** |  | [optional] 
**CardType** | Pointer to [**CardType**](CardType.md) |  | [optional] 

## Methods

### NewPaymentInfo

`func NewPaymentInfo() *PaymentInfo`

NewPaymentInfo instantiates a new PaymentInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentInfoWithDefaults

`func NewPaymentInfoWithDefaults() *PaymentInfo`

NewPaymentInfoWithDefaults instantiates a new PaymentInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCardBin

`func (o *PaymentInfo) GetCardBin() string`

GetCardBin returns the CardBin field if non-nil, zero value otherwise.

### GetCardBinOk

`func (o *PaymentInfo) GetCardBinOk() (*string, bool)`

GetCardBinOk returns a tuple with the CardBin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardBin

`func (o *PaymentInfo) SetCardBin(v string)`

SetCardBin sets CardBin field to given value.

### HasCardBin

`func (o *PaymentInfo) HasCardBin() bool`

HasCardBin returns a boolean if a field has been set.

### GetCardType

`func (o *PaymentInfo) GetCardType() CardType`

GetCardType returns the CardType field if non-nil, zero value otherwise.

### GetCardTypeOk

`func (o *PaymentInfo) GetCardTypeOk() (*CardType, bool)`

GetCardTypeOk returns a tuple with the CardType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardType

`func (o *PaymentInfo) SetCardType(v CardType)`

SetCardType sets CardType field to given value.

### HasCardType

`func (o *PaymentInfo) HasCardType() bool`

HasCardType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


