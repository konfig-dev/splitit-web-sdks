# ReferenceEntityBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** |  | 
**Code** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **string** |  | [optional] 

## Methods

### NewReferenceEntityBase

`func NewReferenceEntityBase(id int64, ) *ReferenceEntityBase`

NewReferenceEntityBase instantiates a new ReferenceEntityBase object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReferenceEntityBaseWithDefaults

`func NewReferenceEntityBaseWithDefaults() *ReferenceEntityBase`

NewReferenceEntityBaseWithDefaults instantiates a new ReferenceEntityBase object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ReferenceEntityBase) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ReferenceEntityBase) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ReferenceEntityBase) SetId(v int64)`

SetId sets Id field to given value.


### GetCode

`func (o *ReferenceEntityBase) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ReferenceEntityBase) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ReferenceEntityBase) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *ReferenceEntityBase) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetDescription

`func (o *ReferenceEntityBase) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ReferenceEntityBase) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ReferenceEntityBase) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ReferenceEntityBase) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


