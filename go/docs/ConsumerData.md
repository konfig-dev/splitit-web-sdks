# ConsumerData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] 
**UniqueId** | Pointer to **string** |  | [optional] 
**UserName** | Pointer to **string** |  | [optional] 
**FullName** | Pointer to **string** |  | [optional] 
**Email** | Pointer to **string** |  | [optional] 
**PhoneNumber** | Pointer to **string** |  | [optional] 
**CultureName** | Pointer to **string** |  | [optional] 
**RoleName** | Pointer to **string** |  | [optional] 
**IsLocked** | **bool** |  | 
**IsDataRestricted** | **bool** |  | 
**IsDataPrivateRestricted** | **bool** |  | 

## Methods

### NewConsumerData

`func NewConsumerData(isLocked bool, isDataRestricted bool, isDataPrivateRestricted bool, ) *ConsumerData`

NewConsumerData instantiates a new ConsumerData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConsumerDataWithDefaults

`func NewConsumerDataWithDefaults() *ConsumerData`

NewConsumerDataWithDefaults instantiates a new ConsumerData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ConsumerData) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConsumerData) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConsumerData) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ConsumerData) HasId() bool`

HasId returns a boolean if a field has been set.

### GetUniqueId

`func (o *ConsumerData) GetUniqueId() string`

GetUniqueId returns the UniqueId field if non-nil, zero value otherwise.

### GetUniqueIdOk

`func (o *ConsumerData) GetUniqueIdOk() (*string, bool)`

GetUniqueIdOk returns a tuple with the UniqueId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniqueId

`func (o *ConsumerData) SetUniqueId(v string)`

SetUniqueId sets UniqueId field to given value.

### HasUniqueId

`func (o *ConsumerData) HasUniqueId() bool`

HasUniqueId returns a boolean if a field has been set.

### GetUserName

`func (o *ConsumerData) GetUserName() string`

GetUserName returns the UserName field if non-nil, zero value otherwise.

### GetUserNameOk

`func (o *ConsumerData) GetUserNameOk() (*string, bool)`

GetUserNameOk returns a tuple with the UserName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserName

`func (o *ConsumerData) SetUserName(v string)`

SetUserName sets UserName field to given value.

### HasUserName

`func (o *ConsumerData) HasUserName() bool`

HasUserName returns a boolean if a field has been set.

### GetFullName

`func (o *ConsumerData) GetFullName() string`

GetFullName returns the FullName field if non-nil, zero value otherwise.

### GetFullNameOk

`func (o *ConsumerData) GetFullNameOk() (*string, bool)`

GetFullNameOk returns a tuple with the FullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullName

`func (o *ConsumerData) SetFullName(v string)`

SetFullName sets FullName field to given value.

### HasFullName

`func (o *ConsumerData) HasFullName() bool`

HasFullName returns a boolean if a field has been set.

### GetEmail

`func (o *ConsumerData) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *ConsumerData) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *ConsumerData) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *ConsumerData) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetPhoneNumber

`func (o *ConsumerData) GetPhoneNumber() string`

GetPhoneNumber returns the PhoneNumber field if non-nil, zero value otherwise.

### GetPhoneNumberOk

`func (o *ConsumerData) GetPhoneNumberOk() (*string, bool)`

GetPhoneNumberOk returns a tuple with the PhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumber

`func (o *ConsumerData) SetPhoneNumber(v string)`

SetPhoneNumber sets PhoneNumber field to given value.

### HasPhoneNumber

`func (o *ConsumerData) HasPhoneNumber() bool`

HasPhoneNumber returns a boolean if a field has been set.

### GetCultureName

`func (o *ConsumerData) GetCultureName() string`

GetCultureName returns the CultureName field if non-nil, zero value otherwise.

### GetCultureNameOk

`func (o *ConsumerData) GetCultureNameOk() (*string, bool)`

GetCultureNameOk returns a tuple with the CultureName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCultureName

`func (o *ConsumerData) SetCultureName(v string)`

SetCultureName sets CultureName field to given value.

### HasCultureName

`func (o *ConsumerData) HasCultureName() bool`

HasCultureName returns a boolean if a field has been set.

### GetRoleName

`func (o *ConsumerData) GetRoleName() string`

GetRoleName returns the RoleName field if non-nil, zero value otherwise.

### GetRoleNameOk

`func (o *ConsumerData) GetRoleNameOk() (*string, bool)`

GetRoleNameOk returns a tuple with the RoleName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleName

`func (o *ConsumerData) SetRoleName(v string)`

SetRoleName sets RoleName field to given value.

### HasRoleName

`func (o *ConsumerData) HasRoleName() bool`

HasRoleName returns a boolean if a field has been set.

### GetIsLocked

`func (o *ConsumerData) GetIsLocked() bool`

GetIsLocked returns the IsLocked field if non-nil, zero value otherwise.

### GetIsLockedOk

`func (o *ConsumerData) GetIsLockedOk() (*bool, bool)`

GetIsLockedOk returns a tuple with the IsLocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLocked

`func (o *ConsumerData) SetIsLocked(v bool)`

SetIsLocked sets IsLocked field to given value.


### GetIsDataRestricted

`func (o *ConsumerData) GetIsDataRestricted() bool`

GetIsDataRestricted returns the IsDataRestricted field if non-nil, zero value otherwise.

### GetIsDataRestrictedOk

`func (o *ConsumerData) GetIsDataRestrictedOk() (*bool, bool)`

GetIsDataRestrictedOk returns a tuple with the IsDataRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDataRestricted

`func (o *ConsumerData) SetIsDataRestricted(v bool)`

SetIsDataRestricted sets IsDataRestricted field to given value.


### GetIsDataPrivateRestricted

`func (o *ConsumerData) GetIsDataPrivateRestricted() bool`

GetIsDataPrivateRestricted returns the IsDataPrivateRestricted field if non-nil, zero value otherwise.

### GetIsDataPrivateRestrictedOk

`func (o *ConsumerData) GetIsDataPrivateRestrictedOk() (*bool, bool)`

GetIsDataPrivateRestrictedOk returns a tuple with the IsDataPrivateRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDataPrivateRestricted

`func (o *ConsumerData) SetIsDataPrivateRestricted(v bool)`

SetIsDataPrivateRestricted sets IsDataPrivateRestricted field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


