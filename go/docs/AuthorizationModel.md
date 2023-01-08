# AuthorizationModel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**GwAuthorizationStatus**](GwAuthorizationStatus.md) |  | 
**Date** | Pointer to **time.Time** |  | [optional] 
**SplititErrorResultCode** | Pointer to **NullableString** |  | [optional] 
**GatewayTransactionID** | Pointer to **string** |  | [optional] 
**GatewayResultCode** | Pointer to **string** |  | [optional] 
**GatewayResultMessage** | Pointer to **string** |  | [optional] 
**ThreeDSRedirect** | Pointer to [**ThreeDsRedirectData**](ThreeDsRedirectData.md) |  | [optional] 
**CAVV** | Pointer to **NullableString** |  | [optional] 
**ECI** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewAuthorizationModel

`func NewAuthorizationModel(status GwAuthorizationStatus, ) *AuthorizationModel`

NewAuthorizationModel instantiates a new AuthorizationModel object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthorizationModelWithDefaults

`func NewAuthorizationModelWithDefaults() *AuthorizationModel`

NewAuthorizationModelWithDefaults instantiates a new AuthorizationModel object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *AuthorizationModel) GetStatus() GwAuthorizationStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AuthorizationModel) GetStatusOk() (*GwAuthorizationStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AuthorizationModel) SetStatus(v GwAuthorizationStatus)`

SetStatus sets Status field to given value.


### GetDate

`func (o *AuthorizationModel) GetDate() time.Time`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *AuthorizationModel) GetDateOk() (*time.Time, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *AuthorizationModel) SetDate(v time.Time)`

SetDate sets Date field to given value.

### HasDate

`func (o *AuthorizationModel) HasDate() bool`

HasDate returns a boolean if a field has been set.

### GetSplititErrorResultCode

`func (o *AuthorizationModel) GetSplititErrorResultCode() string`

GetSplititErrorResultCode returns the SplititErrorResultCode field if non-nil, zero value otherwise.

### GetSplititErrorResultCodeOk

`func (o *AuthorizationModel) GetSplititErrorResultCodeOk() (*string, bool)`

GetSplititErrorResultCodeOk returns a tuple with the SplititErrorResultCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSplititErrorResultCode

`func (o *AuthorizationModel) SetSplititErrorResultCode(v string)`

SetSplititErrorResultCode sets SplititErrorResultCode field to given value.

### HasSplititErrorResultCode

`func (o *AuthorizationModel) HasSplititErrorResultCode() bool`

HasSplititErrorResultCode returns a boolean if a field has been set.

### SetSplititErrorResultCodeNil

`func (o *AuthorizationModel) SetSplititErrorResultCodeNil(b bool)`

 SetSplititErrorResultCodeNil sets the value for SplititErrorResultCode to be an explicit nil

### UnsetSplititErrorResultCode
`func (o *AuthorizationModel) UnsetSplititErrorResultCode()`

UnsetSplititErrorResultCode ensures that no value is present for SplititErrorResultCode, not even an explicit nil
### GetGatewayTransactionID

`func (o *AuthorizationModel) GetGatewayTransactionID() string`

GetGatewayTransactionID returns the GatewayTransactionID field if non-nil, zero value otherwise.

### GetGatewayTransactionIDOk

`func (o *AuthorizationModel) GetGatewayTransactionIDOk() (*string, bool)`

GetGatewayTransactionIDOk returns a tuple with the GatewayTransactionID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayTransactionID

`func (o *AuthorizationModel) SetGatewayTransactionID(v string)`

SetGatewayTransactionID sets GatewayTransactionID field to given value.

### HasGatewayTransactionID

`func (o *AuthorizationModel) HasGatewayTransactionID() bool`

HasGatewayTransactionID returns a boolean if a field has been set.

### GetGatewayResultCode

`func (o *AuthorizationModel) GetGatewayResultCode() string`

GetGatewayResultCode returns the GatewayResultCode field if non-nil, zero value otherwise.

### GetGatewayResultCodeOk

`func (o *AuthorizationModel) GetGatewayResultCodeOk() (*string, bool)`

GetGatewayResultCodeOk returns a tuple with the GatewayResultCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayResultCode

`func (o *AuthorizationModel) SetGatewayResultCode(v string)`

SetGatewayResultCode sets GatewayResultCode field to given value.

### HasGatewayResultCode

`func (o *AuthorizationModel) HasGatewayResultCode() bool`

HasGatewayResultCode returns a boolean if a field has been set.

### GetGatewayResultMessage

`func (o *AuthorizationModel) GetGatewayResultMessage() string`

GetGatewayResultMessage returns the GatewayResultMessage field if non-nil, zero value otherwise.

### GetGatewayResultMessageOk

`func (o *AuthorizationModel) GetGatewayResultMessageOk() (*string, bool)`

GetGatewayResultMessageOk returns a tuple with the GatewayResultMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGatewayResultMessage

`func (o *AuthorizationModel) SetGatewayResultMessage(v string)`

SetGatewayResultMessage sets GatewayResultMessage field to given value.

### HasGatewayResultMessage

`func (o *AuthorizationModel) HasGatewayResultMessage() bool`

HasGatewayResultMessage returns a boolean if a field has been set.

### GetThreeDSRedirect

`func (o *AuthorizationModel) GetThreeDSRedirect() ThreeDsRedirectData`

GetThreeDSRedirect returns the ThreeDSRedirect field if non-nil, zero value otherwise.

### GetThreeDSRedirectOk

`func (o *AuthorizationModel) GetThreeDSRedirectOk() (*ThreeDsRedirectData, bool)`

GetThreeDSRedirectOk returns a tuple with the ThreeDSRedirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreeDSRedirect

`func (o *AuthorizationModel) SetThreeDSRedirect(v ThreeDsRedirectData)`

SetThreeDSRedirect sets ThreeDSRedirect field to given value.

### HasThreeDSRedirect

`func (o *AuthorizationModel) HasThreeDSRedirect() bool`

HasThreeDSRedirect returns a boolean if a field has been set.

### GetCAVV

`func (o *AuthorizationModel) GetCAVV() string`

GetCAVV returns the CAVV field if non-nil, zero value otherwise.

### GetCAVVOk

`func (o *AuthorizationModel) GetCAVVOk() (*string, bool)`

GetCAVVOk returns a tuple with the CAVV field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCAVV

`func (o *AuthorizationModel) SetCAVV(v string)`

SetCAVV sets CAVV field to given value.

### HasCAVV

`func (o *AuthorizationModel) HasCAVV() bool`

HasCAVV returns a boolean if a field has been set.

### SetCAVVNil

`func (o *AuthorizationModel) SetCAVVNil(b bool)`

 SetCAVVNil sets the value for CAVV to be an explicit nil

### UnsetCAVV
`func (o *AuthorizationModel) UnsetCAVV()`

UnsetCAVV ensures that no value is present for CAVV, not even an explicit nil
### GetECI

`func (o *AuthorizationModel) GetECI() string`

GetECI returns the ECI field if non-nil, zero value otherwise.

### GetECIOk

`func (o *AuthorizationModel) GetECIOk() (*string, bool)`

GetECIOk returns a tuple with the ECI field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetECI

`func (o *AuthorizationModel) SetECI(v string)`

SetECI sets ECI field to given value.

### HasECI

`func (o *AuthorizationModel) HasECI() bool`

HasECI returns a boolean if a field has been set.

### SetECINil

`func (o *AuthorizationModel) SetECINil(b bool)`

 SetECINil sets the value for ECI to be an explicit nil

### UnsetECI
`func (o *AuthorizationModel) UnsetECI()`

UnsetECI ensures that no value is present for ECI, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


