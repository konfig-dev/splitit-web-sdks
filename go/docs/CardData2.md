# CardData2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CardId** | Pointer to **string** |  | [optional] 
**CardNumber** | Pointer to **string** |  | [optional] 
**CardExpMonth** | Pointer to **string** |  | [optional] 
**CardExpYear** | Pointer to **string** |  | [optional] 
**CardBrand** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**CardType** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**Bin** | Pointer to **string** |  | [optional] 
**CardHolderFullName** | Pointer to **string** |  | [optional] 
**CardCvv** | Pointer to **string** |  | [optional] 
**Address** | Pointer to [**AddressData2**](AddressData2.md) |  | [optional] 
**Token** | Pointer to **string** |  | [optional] 

## Methods

### NewCardData2

`func NewCardData2() *CardData2`

NewCardData2 instantiates a new CardData2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCardData2WithDefaults

`func NewCardData2WithDefaults() *CardData2`

NewCardData2WithDefaults instantiates a new CardData2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCardId

`func (o *CardData2) GetCardId() string`

GetCardId returns the CardId field if non-nil, zero value otherwise.

### GetCardIdOk

`func (o *CardData2) GetCardIdOk() (*string, bool)`

GetCardIdOk returns a tuple with the CardId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardId

`func (o *CardData2) SetCardId(v string)`

SetCardId sets CardId field to given value.

### HasCardId

`func (o *CardData2) HasCardId() bool`

HasCardId returns a boolean if a field has been set.

### GetCardNumber

`func (o *CardData2) GetCardNumber() string`

GetCardNumber returns the CardNumber field if non-nil, zero value otherwise.

### GetCardNumberOk

`func (o *CardData2) GetCardNumberOk() (*string, bool)`

GetCardNumberOk returns a tuple with the CardNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardNumber

`func (o *CardData2) SetCardNumber(v string)`

SetCardNumber sets CardNumber field to given value.

### HasCardNumber

`func (o *CardData2) HasCardNumber() bool`

HasCardNumber returns a boolean if a field has been set.

### GetCardExpMonth

`func (o *CardData2) GetCardExpMonth() string`

GetCardExpMonth returns the CardExpMonth field if non-nil, zero value otherwise.

### GetCardExpMonthOk

`func (o *CardData2) GetCardExpMonthOk() (*string, bool)`

GetCardExpMonthOk returns a tuple with the CardExpMonth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardExpMonth

`func (o *CardData2) SetCardExpMonth(v string)`

SetCardExpMonth sets CardExpMonth field to given value.

### HasCardExpMonth

`func (o *CardData2) HasCardExpMonth() bool`

HasCardExpMonth returns a boolean if a field has been set.

### GetCardExpYear

`func (o *CardData2) GetCardExpYear() string`

GetCardExpYear returns the CardExpYear field if non-nil, zero value otherwise.

### GetCardExpYearOk

`func (o *CardData2) GetCardExpYearOk() (*string, bool)`

GetCardExpYearOk returns a tuple with the CardExpYear field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardExpYear

`func (o *CardData2) SetCardExpYear(v string)`

SetCardExpYear sets CardExpYear field to given value.

### HasCardExpYear

`func (o *CardData2) HasCardExpYear() bool`

HasCardExpYear returns a boolean if a field has been set.

### GetCardBrand

`func (o *CardData2) GetCardBrand() ReferenceEntityBase`

GetCardBrand returns the CardBrand field if non-nil, zero value otherwise.

### GetCardBrandOk

`func (o *CardData2) GetCardBrandOk() (*ReferenceEntityBase, bool)`

GetCardBrandOk returns a tuple with the CardBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardBrand

`func (o *CardData2) SetCardBrand(v ReferenceEntityBase)`

SetCardBrand sets CardBrand field to given value.

### HasCardBrand

`func (o *CardData2) HasCardBrand() bool`

HasCardBrand returns a boolean if a field has been set.

### GetCardType

`func (o *CardData2) GetCardType() ReferenceEntityBase`

GetCardType returns the CardType field if non-nil, zero value otherwise.

### GetCardTypeOk

`func (o *CardData2) GetCardTypeOk() (*ReferenceEntityBase, bool)`

GetCardTypeOk returns a tuple with the CardType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardType

`func (o *CardData2) SetCardType(v ReferenceEntityBase)`

SetCardType sets CardType field to given value.

### HasCardType

`func (o *CardData2) HasCardType() bool`

HasCardType returns a boolean if a field has been set.

### GetBin

`func (o *CardData2) GetBin() string`

GetBin returns the Bin field if non-nil, zero value otherwise.

### GetBinOk

`func (o *CardData2) GetBinOk() (*string, bool)`

GetBinOk returns a tuple with the Bin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBin

`func (o *CardData2) SetBin(v string)`

SetBin sets Bin field to given value.

### HasBin

`func (o *CardData2) HasBin() bool`

HasBin returns a boolean if a field has been set.

### GetCardHolderFullName

`func (o *CardData2) GetCardHolderFullName() string`

GetCardHolderFullName returns the CardHolderFullName field if non-nil, zero value otherwise.

### GetCardHolderFullNameOk

`func (o *CardData2) GetCardHolderFullNameOk() (*string, bool)`

GetCardHolderFullNameOk returns a tuple with the CardHolderFullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardHolderFullName

`func (o *CardData2) SetCardHolderFullName(v string)`

SetCardHolderFullName sets CardHolderFullName field to given value.

### HasCardHolderFullName

`func (o *CardData2) HasCardHolderFullName() bool`

HasCardHolderFullName returns a boolean if a field has been set.

### GetCardCvv

`func (o *CardData2) GetCardCvv() string`

GetCardCvv returns the CardCvv field if non-nil, zero value otherwise.

### GetCardCvvOk

`func (o *CardData2) GetCardCvvOk() (*string, bool)`

GetCardCvvOk returns a tuple with the CardCvv field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardCvv

`func (o *CardData2) SetCardCvv(v string)`

SetCardCvv sets CardCvv field to given value.

### HasCardCvv

`func (o *CardData2) HasCardCvv() bool`

HasCardCvv returns a boolean if a field has been set.

### GetAddress

`func (o *CardData2) GetAddress() AddressData2`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *CardData2) GetAddressOk() (*AddressData2, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *CardData2) SetAddress(v AddressData2)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *CardData2) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetToken

`func (o *CardData2) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *CardData2) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *CardData2) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *CardData2) HasToken() bool`

HasToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


