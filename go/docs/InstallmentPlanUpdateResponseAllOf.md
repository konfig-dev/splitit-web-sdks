# InstallmentPlanUpdateResponseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefOrderNumber** | Pointer to **string** |  | [optional] 
**InstallmentPlanNumber** | Pointer to **string** |  | [optional] 
**Status** | [**PlanStatus**](PlanStatus.md) |  | 
**ShippingStatus** | [**ShippingStatus**](ShippingStatus.md) |  | 

## Methods

### NewInstallmentPlanUpdateResponseAllOf

`func NewInstallmentPlanUpdateResponseAllOf(status PlanStatus, shippingStatus ShippingStatus, ) *InstallmentPlanUpdateResponseAllOf`

NewInstallmentPlanUpdateResponseAllOf instantiates a new InstallmentPlanUpdateResponseAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInstallmentPlanUpdateResponseAllOfWithDefaults

`func NewInstallmentPlanUpdateResponseAllOfWithDefaults() *InstallmentPlanUpdateResponseAllOf`

NewInstallmentPlanUpdateResponseAllOfWithDefaults instantiates a new InstallmentPlanUpdateResponseAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRefOrderNumber

`func (o *InstallmentPlanUpdateResponseAllOf) GetRefOrderNumber() string`

GetRefOrderNumber returns the RefOrderNumber field if non-nil, zero value otherwise.

### GetRefOrderNumberOk

`func (o *InstallmentPlanUpdateResponseAllOf) GetRefOrderNumberOk() (*string, bool)`

GetRefOrderNumberOk returns a tuple with the RefOrderNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefOrderNumber

`func (o *InstallmentPlanUpdateResponseAllOf) SetRefOrderNumber(v string)`

SetRefOrderNumber sets RefOrderNumber field to given value.

### HasRefOrderNumber

`func (o *InstallmentPlanUpdateResponseAllOf) HasRefOrderNumber() bool`

HasRefOrderNumber returns a boolean if a field has been set.

### GetInstallmentPlanNumber

`func (o *InstallmentPlanUpdateResponseAllOf) GetInstallmentPlanNumber() string`

GetInstallmentPlanNumber returns the InstallmentPlanNumber field if non-nil, zero value otherwise.

### GetInstallmentPlanNumberOk

`func (o *InstallmentPlanUpdateResponseAllOf) GetInstallmentPlanNumberOk() (*string, bool)`

GetInstallmentPlanNumberOk returns a tuple with the InstallmentPlanNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentPlanNumber

`func (o *InstallmentPlanUpdateResponseAllOf) SetInstallmentPlanNumber(v string)`

SetInstallmentPlanNumber sets InstallmentPlanNumber field to given value.

### HasInstallmentPlanNumber

`func (o *InstallmentPlanUpdateResponseAllOf) HasInstallmentPlanNumber() bool`

HasInstallmentPlanNumber returns a boolean if a field has been set.

### GetStatus

`func (o *InstallmentPlanUpdateResponseAllOf) GetStatus() PlanStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *InstallmentPlanUpdateResponseAllOf) GetStatusOk() (*PlanStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *InstallmentPlanUpdateResponseAllOf) SetStatus(v PlanStatus)`

SetStatus sets Status field to given value.


### GetShippingStatus

`func (o *InstallmentPlanUpdateResponseAllOf) GetShippingStatus() ShippingStatus`

GetShippingStatus returns the ShippingStatus field if non-nil, zero value otherwise.

### GetShippingStatusOk

`func (o *InstallmentPlanUpdateResponseAllOf) GetShippingStatusOk() (*ShippingStatus, bool)`

GetShippingStatusOk returns a tuple with the ShippingStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingStatus

`func (o *InstallmentPlanUpdateResponseAllOf) SetShippingStatus(v ShippingStatus)`

SetShippingStatus sets ShippingStatus field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


