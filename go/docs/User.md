# User

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

### NewUser

`func NewUser(isLocked bool, isDataRestricted bool, isDataPrivateRestricted bool, ) *User`

NewUser instantiates a new User object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWithDefaults

`func NewUserWithDefaults() *User`

NewUserWithDefaults instantiates a new User object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *User) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *User) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *User) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *User) HasId() bool`

HasId returns a boolean if a field has been set.

### GetUniqueId

`func (o *User) GetUniqueId() string`

GetUniqueId returns the UniqueId field if non-nil, zero value otherwise.

### GetUniqueIdOk

`func (o *User) GetUniqueIdOk() (*string, bool)`

GetUniqueIdOk returns a tuple with the UniqueId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniqueId

`func (o *User) SetUniqueId(v string)`

SetUniqueId sets UniqueId field to given value.

### HasUniqueId

`func (o *User) HasUniqueId() bool`

HasUniqueId returns a boolean if a field has been set.

### GetUserName

`func (o *User) GetUserName() string`

GetUserName returns the UserName field if non-nil, zero value otherwise.

### GetUserNameOk

`func (o *User) GetUserNameOk() (*string, bool)`

GetUserNameOk returns a tuple with the UserName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserName

`func (o *User) SetUserName(v string)`

SetUserName sets UserName field to given value.

### HasUserName

`func (o *User) HasUserName() bool`

HasUserName returns a boolean if a field has been set.

### GetFullName

`func (o *User) GetFullName() string`

GetFullName returns the FullName field if non-nil, zero value otherwise.

### GetFullNameOk

`func (o *User) GetFullNameOk() (*string, bool)`

GetFullNameOk returns a tuple with the FullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullName

`func (o *User) SetFullName(v string)`

SetFullName sets FullName field to given value.

### HasFullName

`func (o *User) HasFullName() bool`

HasFullName returns a boolean if a field has been set.

### GetEmail

`func (o *User) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *User) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *User) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *User) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetPhoneNumber

`func (o *User) GetPhoneNumber() string`

GetPhoneNumber returns the PhoneNumber field if non-nil, zero value otherwise.

### GetPhoneNumberOk

`func (o *User) GetPhoneNumberOk() (*string, bool)`

GetPhoneNumberOk returns a tuple with the PhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhoneNumber

`func (o *User) SetPhoneNumber(v string)`

SetPhoneNumber sets PhoneNumber field to given value.

### HasPhoneNumber

`func (o *User) HasPhoneNumber() bool`

HasPhoneNumber returns a boolean if a field has been set.

### GetCultureName

`func (o *User) GetCultureName() string`

GetCultureName returns the CultureName field if non-nil, zero value otherwise.

### GetCultureNameOk

`func (o *User) GetCultureNameOk() (*string, bool)`

GetCultureNameOk returns a tuple with the CultureName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCultureName

`func (o *User) SetCultureName(v string)`

SetCultureName sets CultureName field to given value.

### HasCultureName

`func (o *User) HasCultureName() bool`

HasCultureName returns a boolean if a field has been set.

### GetRoleName

`func (o *User) GetRoleName() string`

GetRoleName returns the RoleName field if non-nil, zero value otherwise.

### GetRoleNameOk

`func (o *User) GetRoleNameOk() (*string, bool)`

GetRoleNameOk returns a tuple with the RoleName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleName

`func (o *User) SetRoleName(v string)`

SetRoleName sets RoleName field to given value.

### HasRoleName

`func (o *User) HasRoleName() bool`

HasRoleName returns a boolean if a field has been set.

### GetIsLocked

`func (o *User) GetIsLocked() bool`

GetIsLocked returns the IsLocked field if non-nil, zero value otherwise.

### GetIsLockedOk

`func (o *User) GetIsLockedOk() (*bool, bool)`

GetIsLockedOk returns a tuple with the IsLocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLocked

`func (o *User) SetIsLocked(v bool)`

SetIsLocked sets IsLocked field to given value.


### GetIsDataRestricted

`func (o *User) GetIsDataRestricted() bool`

GetIsDataRestricted returns the IsDataRestricted field if non-nil, zero value otherwise.

### GetIsDataRestrictedOk

`func (o *User) GetIsDataRestrictedOk() (*bool, bool)`

GetIsDataRestrictedOk returns a tuple with the IsDataRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDataRestricted

`func (o *User) SetIsDataRestricted(v bool)`

SetIsDataRestricted sets IsDataRestricted field to given value.


### GetIsDataPrivateRestricted

`func (o *User) GetIsDataPrivateRestricted() bool`

GetIsDataPrivateRestricted returns the IsDataPrivateRestricted field if non-nil, zero value otherwise.

### GetIsDataPrivateRestrictedOk

`func (o *User) GetIsDataPrivateRestrictedOk() (*bool, bool)`

GetIsDataPrivateRestrictedOk returns a tuple with the IsDataPrivateRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDataPrivateRestricted

`func (o *User) SetIsDataPrivateRestricted(v bool)`

SetIsDataPrivateRestricted sets IsDataPrivateRestricted field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


