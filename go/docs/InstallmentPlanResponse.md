# InstallmentPlanResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseHeader** | Pointer to [**ResponseHeader**](ResponseHeader.md) |  | [optional] 
**InstallmentPlan** | Pointer to [**InstallmentPlan**](InstallmentPlan.md) |  | [optional] 
**GatewayTransactionResults** | Pointer to [**[]TransactionResult**](TransactionResult.md) |  | [optional] 

## Methods

### NewInstallmentPlanResponse

`func NewInstallmentPlanResponse() *InstallmentPlanResponse`

NewInstallmentPlanResponse instantiates a new InstallmentPlanResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInstallmentPlanResponseWithDefaults

`func NewInstallmentPlanResponseWithDefaults() *InstallmentPlanResponse`

NewInstallmentPlanResponseWithDefaults instantiates a new InstallmentPlanResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponseHeader

`func (o *InstallmentPlanResponse) GetResponseHeader() ResponseHeader`

GetResponseHeader returns the ResponseHeader field if non-nil, zero value otherwise.

### GetResponseHeaderOk

`func (o *InstallmentPlanResponse) GetResponseHeaderOk() (*ResponseHeader, bool)`

GetResponseHeaderOk returns a tuple with the ResponseHeader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseHeader

`func (o *InstallmentPlanResponse) SetResponseHeader(v ResponseHeader)`

SetResponseHeader sets ResponseHeader field to given value.

### HasResponseHeader

`func (o *InstallmentPlanResponse) HasResponseHeader() bool`

HasResponseHeader returns a boolean if a field has been set.

### GetInstallmentPlan

`func (o *InstallmentPlanResponse) GetInstallmentPlan() InstallmentPlan`

GetInstallmentPlan returns the InstallmentPlan field if non-nil, zero value otherwise.

### GetInstallmentPlanOk

`func (o *InstallmentPlanResponse) GetInstallmentPlanOk() (*InstallmentPlan, bool)`

GetInstallmentPlanOk returns a tuple with the InstallmentPlan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentPlan

`func (o *InstallmentPlanResponse) SetInstallmentPlan(v InstallmentPlan)`

SetInstallmentPlan sets InstallmentPlan field to given value.

### HasInstallmentPlan

`func (o *InstallmentPlanResponse) HasInstallmentPlan() bool`

HasInstallmentPlan returns a boolean if a field has been set.

### GetGatewayTransactionResults

`func (o *InstallmentPlanResponse) GetGatewayTransactionResults() []TransactionResult`

GetGatewayTransactionResults returns the GatewayTransactionResults field if non-nil, zero value otherwise.

### GetGatewayTransactionResultsOk

`func (o *InstallmentPlanResponse) GetGatewayTransactionResultsOk() (*[]TransactionResult, bool)`

GetGatewayTransactionResultsOk returns a tuple with the GatewayTransactionResults field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayTransactionResults

`func (o *InstallmentPlanResponse) SetGatewayTransactionResults(v []TransactionResult)`

SetGatewayTransactionResults sets GatewayTransactionResults field to given value.

### HasGatewayTransactionResults

`func (o *InstallmentPlanResponse) HasGatewayTransactionResults() bool`

HasGatewayTransactionResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


