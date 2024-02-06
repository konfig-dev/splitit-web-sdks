# ResponseHeader

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Succeeded** | **bool** |  | 
**Errors** | Pointer to [**[]Error2**](Error2.md) |  | [optional] 
**TraceId** | Pointer to **string** |  | [optional] 

## Methods

### NewResponseHeader

`func NewResponseHeader(succeeded bool, ) *ResponseHeader`

NewResponseHeader instantiates a new ResponseHeader object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResponseHeaderWithDefaults

`func NewResponseHeaderWithDefaults() *ResponseHeader`

NewResponseHeaderWithDefaults instantiates a new ResponseHeader object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSucceeded

`func (o *ResponseHeader) GetSucceeded() bool`

GetSucceeded returns the Succeeded field if non-nil, zero value otherwise.

### GetSucceededOk

`func (o *ResponseHeader) GetSucceededOk() (*bool, bool)`

GetSucceededOk returns a tuple with the Succeeded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSucceeded

`func (o *ResponseHeader) SetSucceeded(v bool)`

SetSucceeded sets Succeeded field to given value.


### GetErrors

`func (o *ResponseHeader) GetErrors() []Error2`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *ResponseHeader) GetErrorsOk() (*[]Error2, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *ResponseHeader) SetErrors(v []Error2)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *ResponseHeader) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetTraceId

`func (o *ResponseHeader) GetTraceId() string`

GetTraceId returns the TraceId field if non-nil, zero value otherwise.

### GetTraceIdOk

`func (o *ResponseHeader) GetTraceIdOk() (*string, bool)`

GetTraceIdOk returns a tuple with the TraceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTraceId

`func (o *ResponseHeader) SetTraceId(v string)`

SetTraceId sets TraceId field to given value.

### HasTraceId

`func (o *ResponseHeader) HasTraceId() bool`

HasTraceId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


