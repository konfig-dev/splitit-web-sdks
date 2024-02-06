# Disputes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InDispute** | Pointer to **bool** |  | [optional] 
**EvidenceProvidedOn** | Pointer to **time.Time** |  | [optional] 

## Methods

### NewDisputes

`func NewDisputes() *Disputes`

NewDisputes instantiates a new Disputes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDisputesWithDefaults

`func NewDisputesWithDefaults() *Disputes`

NewDisputesWithDefaults instantiates a new Disputes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInDispute

`func (o *Disputes) GetInDispute() bool`

GetInDispute returns the InDispute field if non-nil, zero value otherwise.

### GetInDisputeOk

`func (o *Disputes) GetInDisputeOk() (*bool, bool)`

GetInDisputeOk returns a tuple with the InDispute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInDispute

`func (o *Disputes) SetInDispute(v bool)`

SetInDispute sets InDispute field to given value.

### HasInDispute

`func (o *Disputes) HasInDispute() bool`

HasInDispute returns a boolean if a field has been set.

### GetEvidenceProvidedOn

`func (o *Disputes) GetEvidenceProvidedOn() time.Time`

GetEvidenceProvidedOn returns the EvidenceProvidedOn field if non-nil, zero value otherwise.

### GetEvidenceProvidedOnOk

`func (o *Disputes) GetEvidenceProvidedOnOk() (*time.Time, bool)`

GetEvidenceProvidedOnOk returns a tuple with the EvidenceProvidedOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvidenceProvidedOn

`func (o *Disputes) SetEvidenceProvidedOn(v time.Time)`

SetEvidenceProvidedOn sets EvidenceProvidedOn field to given value.

### HasEvidenceProvidedOn

`func (o *Disputes) HasEvidenceProvidedOn() bool`

HasEvidenceProvidedOn returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


