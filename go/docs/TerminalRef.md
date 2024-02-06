# TerminalRef

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** |  | 
**Code** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **string** |  | [optional] 

## Methods

### NewTerminalRef

`func NewTerminalRef(id int64, ) *TerminalRef`

NewTerminalRef instantiates a new TerminalRef object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTerminalRefWithDefaults

`func NewTerminalRefWithDefaults() *TerminalRef`

NewTerminalRefWithDefaults instantiates a new TerminalRef object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TerminalRef) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TerminalRef) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TerminalRef) SetId(v int64)`

SetId sets Id field to given value.


### GetCode

`func (o *TerminalRef) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *TerminalRef) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *TerminalRef) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *TerminalRef) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetDescription

`func (o *TerminalRef) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *TerminalRef) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *TerminalRef) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *TerminalRef) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


