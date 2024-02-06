# InstallmentPlan

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InstallmentPlanNumber** | Pointer to **string** |  | [optional] 
**InstallmentPlanStatus** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**Amount** | Pointer to [**Money**](Money.md) |  | [optional] 
**OutstandingAmount** | Pointer to [**Money**](Money.md) |  | [optional] 
**Disputes** | Pointer to [**Disputes**](Disputes.md) |  | [optional] 
**NumberOfInstallments** | **int32** |  | 
**NumberOfProcessedInstallments** | **int32** |  | 
**OriginalAmount** | Pointer to [**Money**](Money.md) |  | [optional] 
**RefundAmount** | Pointer to [**Money**](Money.md) |  | [optional] 
**Consumer** | Pointer to [**ConsumerData**](ConsumerData.md) |  | [optional] 
**ActiveCard** | Pointer to [**CardData2**](CardData2.md) |  | [optional] 
**FraudCheck** | Pointer to [**FraudCheck**](FraudCheck.md) |  | [optional] 
**Terminal** | Pointer to [**TerminalRef**](TerminalRef.md) |  | [optional] 
**Merchant** | Pointer to [**MerchantRef**](MerchantRef.md) |  | [optional] 
**RefOrderNumber** | Pointer to **string** |  | [optional] 
**PurchaseMethod** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**Strategy** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**DelayResolution** | Pointer to [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**ExtendedParams** | Pointer to **map[string]string** |  | [optional] 
**IsFullCaptured** | **bool** |  | 
**IsChargedBack** | **bool** |  | 
**ArePaymentsOnHold** | **bool** |  | 
**ScpFundingPercent** | **float32** |  | 
**FundingStatus** | [**MoneyFlows**](MoneyFlows.md) |  | 
**TestMode** | [**TestModes**](TestModes.md) |  | 
**CreationDateTime** | **time.Time** |  | 
**LifeTimeUrlExpirationTime** | **time.Time** |  | 
**Installments** | Pointer to [**[]Installment2**](Installment2.md) |  | [optional] 
**SecureAuthorizations** | Pointer to [**[]ReAuthorization**](ReAuthorization.md) |  | [optional] 
**LogoUrl** | Pointer to **string** |  | [optional] 
**IsInAutoRetry** | **bool** |  | 
**PaymentMethod** | Pointer to **string** |  | [optional] 
**AllowCardUpdateOnSplititPortals** | **bool** |  | 
**OnHoldLastOpenDate** | Pointer to **time.Time** |  | [optional] 
**OnHoldLastOpenUserId** | Pointer to **string** |  | [optional] 
**InstallmentsScheduleInterval** | **int32** |  | 
**ExternalPaymentProvider** | Pointer to [**ExternalProviderTypes**](ExternalProviderTypes.md) |  | [optional] 

## Methods

### NewInstallmentPlan

`func NewInstallmentPlan(numberOfInstallments int32, numberOfProcessedInstallments int32, isFullCaptured bool, isChargedBack bool, arePaymentsOnHold bool, scpFundingPercent float32, fundingStatus MoneyFlows, testMode TestModes, creationDateTime time.Time, lifeTimeUrlExpirationTime time.Time, isInAutoRetry bool, allowCardUpdateOnSplititPortals bool, installmentsScheduleInterval int32, ) *InstallmentPlan`

NewInstallmentPlan instantiates a new InstallmentPlan object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInstallmentPlanWithDefaults

`func NewInstallmentPlanWithDefaults() *InstallmentPlan`

NewInstallmentPlanWithDefaults instantiates a new InstallmentPlan object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstallmentPlanNumber

`func (o *InstallmentPlan) GetInstallmentPlanNumber() string`

GetInstallmentPlanNumber returns the InstallmentPlanNumber field if non-nil, zero value otherwise.

### GetInstallmentPlanNumberOk

`func (o *InstallmentPlan) GetInstallmentPlanNumberOk() (*string, bool)`

GetInstallmentPlanNumberOk returns a tuple with the InstallmentPlanNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentPlanNumber

`func (o *InstallmentPlan) SetInstallmentPlanNumber(v string)`

SetInstallmentPlanNumber sets InstallmentPlanNumber field to given value.

### HasInstallmentPlanNumber

`func (o *InstallmentPlan) HasInstallmentPlanNumber() bool`

HasInstallmentPlanNumber returns a boolean if a field has been set.

### GetInstallmentPlanStatus

`func (o *InstallmentPlan) GetInstallmentPlanStatus() ReferenceEntityBase`

GetInstallmentPlanStatus returns the InstallmentPlanStatus field if non-nil, zero value otherwise.

### GetInstallmentPlanStatusOk

`func (o *InstallmentPlan) GetInstallmentPlanStatusOk() (*ReferenceEntityBase, bool)`

GetInstallmentPlanStatusOk returns a tuple with the InstallmentPlanStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentPlanStatus

`func (o *InstallmentPlan) SetInstallmentPlanStatus(v ReferenceEntityBase)`

SetInstallmentPlanStatus sets InstallmentPlanStatus field to given value.

### HasInstallmentPlanStatus

`func (o *InstallmentPlan) HasInstallmentPlanStatus() bool`

HasInstallmentPlanStatus returns a boolean if a field has been set.

### GetAmount

`func (o *InstallmentPlan) GetAmount() Money`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *InstallmentPlan) GetAmountOk() (*Money, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *InstallmentPlan) SetAmount(v Money)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *InstallmentPlan) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetOutstandingAmount

`func (o *InstallmentPlan) GetOutstandingAmount() Money`

GetOutstandingAmount returns the OutstandingAmount field if non-nil, zero value otherwise.

### GetOutstandingAmountOk

`func (o *InstallmentPlan) GetOutstandingAmountOk() (*Money, bool)`

GetOutstandingAmountOk returns a tuple with the OutstandingAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutstandingAmount

`func (o *InstallmentPlan) SetOutstandingAmount(v Money)`

SetOutstandingAmount sets OutstandingAmount field to given value.

### HasOutstandingAmount

`func (o *InstallmentPlan) HasOutstandingAmount() bool`

HasOutstandingAmount returns a boolean if a field has been set.

### GetDisputes

`func (o *InstallmentPlan) GetDisputes() Disputes`

GetDisputes returns the Disputes field if non-nil, zero value otherwise.

### GetDisputesOk

`func (o *InstallmentPlan) GetDisputesOk() (*Disputes, bool)`

GetDisputesOk returns a tuple with the Disputes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisputes

`func (o *InstallmentPlan) SetDisputes(v Disputes)`

SetDisputes sets Disputes field to given value.

### HasDisputes

`func (o *InstallmentPlan) HasDisputes() bool`

HasDisputes returns a boolean if a field has been set.

### GetNumberOfInstallments

`func (o *InstallmentPlan) GetNumberOfInstallments() int32`

GetNumberOfInstallments returns the NumberOfInstallments field if non-nil, zero value otherwise.

### GetNumberOfInstallmentsOk

`func (o *InstallmentPlan) GetNumberOfInstallmentsOk() (*int32, bool)`

GetNumberOfInstallmentsOk returns a tuple with the NumberOfInstallments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfInstallments

`func (o *InstallmentPlan) SetNumberOfInstallments(v int32)`

SetNumberOfInstallments sets NumberOfInstallments field to given value.


### GetNumberOfProcessedInstallments

`func (o *InstallmentPlan) GetNumberOfProcessedInstallments() int32`

GetNumberOfProcessedInstallments returns the NumberOfProcessedInstallments field if non-nil, zero value otherwise.

### GetNumberOfProcessedInstallmentsOk

`func (o *InstallmentPlan) GetNumberOfProcessedInstallmentsOk() (*int32, bool)`

GetNumberOfProcessedInstallmentsOk returns a tuple with the NumberOfProcessedInstallments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfProcessedInstallments

`func (o *InstallmentPlan) SetNumberOfProcessedInstallments(v int32)`

SetNumberOfProcessedInstallments sets NumberOfProcessedInstallments field to given value.


### GetOriginalAmount

`func (o *InstallmentPlan) GetOriginalAmount() Money`

GetOriginalAmount returns the OriginalAmount field if non-nil, zero value otherwise.

### GetOriginalAmountOk

`func (o *InstallmentPlan) GetOriginalAmountOk() (*Money, bool)`

GetOriginalAmountOk returns a tuple with the OriginalAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginalAmount

`func (o *InstallmentPlan) SetOriginalAmount(v Money)`

SetOriginalAmount sets OriginalAmount field to given value.

### HasOriginalAmount

`func (o *InstallmentPlan) HasOriginalAmount() bool`

HasOriginalAmount returns a boolean if a field has been set.

### GetRefundAmount

`func (o *InstallmentPlan) GetRefundAmount() Money`

GetRefundAmount returns the RefundAmount field if non-nil, zero value otherwise.

### GetRefundAmountOk

`func (o *InstallmentPlan) GetRefundAmountOk() (*Money, bool)`

GetRefundAmountOk returns a tuple with the RefundAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefundAmount

`func (o *InstallmentPlan) SetRefundAmount(v Money)`

SetRefundAmount sets RefundAmount field to given value.

### HasRefundAmount

`func (o *InstallmentPlan) HasRefundAmount() bool`

HasRefundAmount returns a boolean if a field has been set.

### GetConsumer

`func (o *InstallmentPlan) GetConsumer() ConsumerData`

GetConsumer returns the Consumer field if non-nil, zero value otherwise.

### GetConsumerOk

`func (o *InstallmentPlan) GetConsumerOk() (*ConsumerData, bool)`

GetConsumerOk returns a tuple with the Consumer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConsumer

`func (o *InstallmentPlan) SetConsumer(v ConsumerData)`

SetConsumer sets Consumer field to given value.

### HasConsumer

`func (o *InstallmentPlan) HasConsumer() bool`

HasConsumer returns a boolean if a field has been set.

### GetActiveCard

`func (o *InstallmentPlan) GetActiveCard() CardData2`

GetActiveCard returns the ActiveCard field if non-nil, zero value otherwise.

### GetActiveCardOk

`func (o *InstallmentPlan) GetActiveCardOk() (*CardData2, bool)`

GetActiveCardOk returns a tuple with the ActiveCard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActiveCard

`func (o *InstallmentPlan) SetActiveCard(v CardData2)`

SetActiveCard sets ActiveCard field to given value.

### HasActiveCard

`func (o *InstallmentPlan) HasActiveCard() bool`

HasActiveCard returns a boolean if a field has been set.

### GetFraudCheck

`func (o *InstallmentPlan) GetFraudCheck() FraudCheck`

GetFraudCheck returns the FraudCheck field if non-nil, zero value otherwise.

### GetFraudCheckOk

`func (o *InstallmentPlan) GetFraudCheckOk() (*FraudCheck, bool)`

GetFraudCheckOk returns a tuple with the FraudCheck field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFraudCheck

`func (o *InstallmentPlan) SetFraudCheck(v FraudCheck)`

SetFraudCheck sets FraudCheck field to given value.

### HasFraudCheck

`func (o *InstallmentPlan) HasFraudCheck() bool`

HasFraudCheck returns a boolean if a field has been set.

### GetTerminal

`func (o *InstallmentPlan) GetTerminal() TerminalRef`

GetTerminal returns the Terminal field if non-nil, zero value otherwise.

### GetTerminalOk

`func (o *InstallmentPlan) GetTerminalOk() (*TerminalRef, bool)`

GetTerminalOk returns a tuple with the Terminal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTerminal

`func (o *InstallmentPlan) SetTerminal(v TerminalRef)`

SetTerminal sets Terminal field to given value.

### HasTerminal

`func (o *InstallmentPlan) HasTerminal() bool`

HasTerminal returns a boolean if a field has been set.

### GetMerchant

`func (o *InstallmentPlan) GetMerchant() MerchantRef`

GetMerchant returns the Merchant field if non-nil, zero value otherwise.

### GetMerchantOk

`func (o *InstallmentPlan) GetMerchantOk() (*MerchantRef, bool)`

GetMerchantOk returns a tuple with the Merchant field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMerchant

`func (o *InstallmentPlan) SetMerchant(v MerchantRef)`

SetMerchant sets Merchant field to given value.

### HasMerchant

`func (o *InstallmentPlan) HasMerchant() bool`

HasMerchant returns a boolean if a field has been set.

### GetRefOrderNumber

`func (o *InstallmentPlan) GetRefOrderNumber() string`

GetRefOrderNumber returns the RefOrderNumber field if non-nil, zero value otherwise.

### GetRefOrderNumberOk

`func (o *InstallmentPlan) GetRefOrderNumberOk() (*string, bool)`

GetRefOrderNumberOk returns a tuple with the RefOrderNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefOrderNumber

`func (o *InstallmentPlan) SetRefOrderNumber(v string)`

SetRefOrderNumber sets RefOrderNumber field to given value.

### HasRefOrderNumber

`func (o *InstallmentPlan) HasRefOrderNumber() bool`

HasRefOrderNumber returns a boolean if a field has been set.

### GetPurchaseMethod

`func (o *InstallmentPlan) GetPurchaseMethod() ReferenceEntityBase`

GetPurchaseMethod returns the PurchaseMethod field if non-nil, zero value otherwise.

### GetPurchaseMethodOk

`func (o *InstallmentPlan) GetPurchaseMethodOk() (*ReferenceEntityBase, bool)`

GetPurchaseMethodOk returns a tuple with the PurchaseMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseMethod

`func (o *InstallmentPlan) SetPurchaseMethod(v ReferenceEntityBase)`

SetPurchaseMethod sets PurchaseMethod field to given value.

### HasPurchaseMethod

`func (o *InstallmentPlan) HasPurchaseMethod() bool`

HasPurchaseMethod returns a boolean if a field has been set.

### GetStrategy

`func (o *InstallmentPlan) GetStrategy() ReferenceEntityBase`

GetStrategy returns the Strategy field if non-nil, zero value otherwise.

### GetStrategyOk

`func (o *InstallmentPlan) GetStrategyOk() (*ReferenceEntityBase, bool)`

GetStrategyOk returns a tuple with the Strategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStrategy

`func (o *InstallmentPlan) SetStrategy(v ReferenceEntityBase)`

SetStrategy sets Strategy field to given value.

### HasStrategy

`func (o *InstallmentPlan) HasStrategy() bool`

HasStrategy returns a boolean if a field has been set.

### GetDelayResolution

`func (o *InstallmentPlan) GetDelayResolution() ReferenceEntityBase`

GetDelayResolution returns the DelayResolution field if non-nil, zero value otherwise.

### GetDelayResolutionOk

`func (o *InstallmentPlan) GetDelayResolutionOk() (*ReferenceEntityBase, bool)`

GetDelayResolutionOk returns a tuple with the DelayResolution field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelayResolution

`func (o *InstallmentPlan) SetDelayResolution(v ReferenceEntityBase)`

SetDelayResolution sets DelayResolution field to given value.

### HasDelayResolution

`func (o *InstallmentPlan) HasDelayResolution() bool`

HasDelayResolution returns a boolean if a field has been set.

### GetExtendedParams

`func (o *InstallmentPlan) GetExtendedParams() map[string]string`

GetExtendedParams returns the ExtendedParams field if non-nil, zero value otherwise.

### GetExtendedParamsOk

`func (o *InstallmentPlan) GetExtendedParamsOk() (*map[string]string, bool)`

GetExtendedParamsOk returns a tuple with the ExtendedParams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtendedParams

`func (o *InstallmentPlan) SetExtendedParams(v map[string]string)`

SetExtendedParams sets ExtendedParams field to given value.

### HasExtendedParams

`func (o *InstallmentPlan) HasExtendedParams() bool`

HasExtendedParams returns a boolean if a field has been set.

### GetIsFullCaptured

`func (o *InstallmentPlan) GetIsFullCaptured() bool`

GetIsFullCaptured returns the IsFullCaptured field if non-nil, zero value otherwise.

### GetIsFullCapturedOk

`func (o *InstallmentPlan) GetIsFullCapturedOk() (*bool, bool)`

GetIsFullCapturedOk returns a tuple with the IsFullCaptured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFullCaptured

`func (o *InstallmentPlan) SetIsFullCaptured(v bool)`

SetIsFullCaptured sets IsFullCaptured field to given value.


### GetIsChargedBack

`func (o *InstallmentPlan) GetIsChargedBack() bool`

GetIsChargedBack returns the IsChargedBack field if non-nil, zero value otherwise.

### GetIsChargedBackOk

`func (o *InstallmentPlan) GetIsChargedBackOk() (*bool, bool)`

GetIsChargedBackOk returns a tuple with the IsChargedBack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsChargedBack

`func (o *InstallmentPlan) SetIsChargedBack(v bool)`

SetIsChargedBack sets IsChargedBack field to given value.


### GetArePaymentsOnHold

`func (o *InstallmentPlan) GetArePaymentsOnHold() bool`

GetArePaymentsOnHold returns the ArePaymentsOnHold field if non-nil, zero value otherwise.

### GetArePaymentsOnHoldOk

`func (o *InstallmentPlan) GetArePaymentsOnHoldOk() (*bool, bool)`

GetArePaymentsOnHoldOk returns a tuple with the ArePaymentsOnHold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArePaymentsOnHold

`func (o *InstallmentPlan) SetArePaymentsOnHold(v bool)`

SetArePaymentsOnHold sets ArePaymentsOnHold field to given value.


### GetScpFundingPercent

`func (o *InstallmentPlan) GetScpFundingPercent() float32`

GetScpFundingPercent returns the ScpFundingPercent field if non-nil, zero value otherwise.

### GetScpFundingPercentOk

`func (o *InstallmentPlan) GetScpFundingPercentOk() (*float32, bool)`

GetScpFundingPercentOk returns a tuple with the ScpFundingPercent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScpFundingPercent

`func (o *InstallmentPlan) SetScpFundingPercent(v float32)`

SetScpFundingPercent sets ScpFundingPercent field to given value.


### GetFundingStatus

`func (o *InstallmentPlan) GetFundingStatus() MoneyFlows`

GetFundingStatus returns the FundingStatus field if non-nil, zero value otherwise.

### GetFundingStatusOk

`func (o *InstallmentPlan) GetFundingStatusOk() (*MoneyFlows, bool)`

GetFundingStatusOk returns a tuple with the FundingStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFundingStatus

`func (o *InstallmentPlan) SetFundingStatus(v MoneyFlows)`

SetFundingStatus sets FundingStatus field to given value.


### GetTestMode

`func (o *InstallmentPlan) GetTestMode() TestModes`

GetTestMode returns the TestMode field if non-nil, zero value otherwise.

### GetTestModeOk

`func (o *InstallmentPlan) GetTestModeOk() (*TestModes, bool)`

GetTestModeOk returns a tuple with the TestMode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTestMode

`func (o *InstallmentPlan) SetTestMode(v TestModes)`

SetTestMode sets TestMode field to given value.


### GetCreationDateTime

`func (o *InstallmentPlan) GetCreationDateTime() time.Time`

GetCreationDateTime returns the CreationDateTime field if non-nil, zero value otherwise.

### GetCreationDateTimeOk

`func (o *InstallmentPlan) GetCreationDateTimeOk() (*time.Time, bool)`

GetCreationDateTimeOk returns a tuple with the CreationDateTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationDateTime

`func (o *InstallmentPlan) SetCreationDateTime(v time.Time)`

SetCreationDateTime sets CreationDateTime field to given value.


### GetLifeTimeUrlExpirationTime

`func (o *InstallmentPlan) GetLifeTimeUrlExpirationTime() time.Time`

GetLifeTimeUrlExpirationTime returns the LifeTimeUrlExpirationTime field if non-nil, zero value otherwise.

### GetLifeTimeUrlExpirationTimeOk

`func (o *InstallmentPlan) GetLifeTimeUrlExpirationTimeOk() (*time.Time, bool)`

GetLifeTimeUrlExpirationTimeOk returns a tuple with the LifeTimeUrlExpirationTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifeTimeUrlExpirationTime

`func (o *InstallmentPlan) SetLifeTimeUrlExpirationTime(v time.Time)`

SetLifeTimeUrlExpirationTime sets LifeTimeUrlExpirationTime field to given value.


### GetInstallments

`func (o *InstallmentPlan) GetInstallments() []Installment2`

GetInstallments returns the Installments field if non-nil, zero value otherwise.

### GetInstallmentsOk

`func (o *InstallmentPlan) GetInstallmentsOk() (*[]Installment2, bool)`

GetInstallmentsOk returns a tuple with the Installments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallments

`func (o *InstallmentPlan) SetInstallments(v []Installment2)`

SetInstallments sets Installments field to given value.

### HasInstallments

`func (o *InstallmentPlan) HasInstallments() bool`

HasInstallments returns a boolean if a field has been set.

### GetSecureAuthorizations

`func (o *InstallmentPlan) GetSecureAuthorizations() []ReAuthorization`

GetSecureAuthorizations returns the SecureAuthorizations field if non-nil, zero value otherwise.

### GetSecureAuthorizationsOk

`func (o *InstallmentPlan) GetSecureAuthorizationsOk() (*[]ReAuthorization, bool)`

GetSecureAuthorizationsOk returns a tuple with the SecureAuthorizations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecureAuthorizations

`func (o *InstallmentPlan) SetSecureAuthorizations(v []ReAuthorization)`

SetSecureAuthorizations sets SecureAuthorizations field to given value.

### HasSecureAuthorizations

`func (o *InstallmentPlan) HasSecureAuthorizations() bool`

HasSecureAuthorizations returns a boolean if a field has been set.

### GetLogoUrl

`func (o *InstallmentPlan) GetLogoUrl() string`

GetLogoUrl returns the LogoUrl field if non-nil, zero value otherwise.

### GetLogoUrlOk

`func (o *InstallmentPlan) GetLogoUrlOk() (*string, bool)`

GetLogoUrlOk returns a tuple with the LogoUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogoUrl

`func (o *InstallmentPlan) SetLogoUrl(v string)`

SetLogoUrl sets LogoUrl field to given value.

### HasLogoUrl

`func (o *InstallmentPlan) HasLogoUrl() bool`

HasLogoUrl returns a boolean if a field has been set.

### GetIsInAutoRetry

`func (o *InstallmentPlan) GetIsInAutoRetry() bool`

GetIsInAutoRetry returns the IsInAutoRetry field if non-nil, zero value otherwise.

### GetIsInAutoRetryOk

`func (o *InstallmentPlan) GetIsInAutoRetryOk() (*bool, bool)`

GetIsInAutoRetryOk returns a tuple with the IsInAutoRetry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsInAutoRetry

`func (o *InstallmentPlan) SetIsInAutoRetry(v bool)`

SetIsInAutoRetry sets IsInAutoRetry field to given value.


### GetPaymentMethod

`func (o *InstallmentPlan) GetPaymentMethod() string`

GetPaymentMethod returns the PaymentMethod field if non-nil, zero value otherwise.

### GetPaymentMethodOk

`func (o *InstallmentPlan) GetPaymentMethodOk() (*string, bool)`

GetPaymentMethodOk returns a tuple with the PaymentMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethod

`func (o *InstallmentPlan) SetPaymentMethod(v string)`

SetPaymentMethod sets PaymentMethod field to given value.

### HasPaymentMethod

`func (o *InstallmentPlan) HasPaymentMethod() bool`

HasPaymentMethod returns a boolean if a field has been set.

### GetAllowCardUpdateOnSplititPortals

`func (o *InstallmentPlan) GetAllowCardUpdateOnSplititPortals() bool`

GetAllowCardUpdateOnSplititPortals returns the AllowCardUpdateOnSplititPortals field if non-nil, zero value otherwise.

### GetAllowCardUpdateOnSplititPortalsOk

`func (o *InstallmentPlan) GetAllowCardUpdateOnSplititPortalsOk() (*bool, bool)`

GetAllowCardUpdateOnSplititPortalsOk returns a tuple with the AllowCardUpdateOnSplititPortals field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowCardUpdateOnSplititPortals

`func (o *InstallmentPlan) SetAllowCardUpdateOnSplititPortals(v bool)`

SetAllowCardUpdateOnSplititPortals sets AllowCardUpdateOnSplititPortals field to given value.


### GetOnHoldLastOpenDate

`func (o *InstallmentPlan) GetOnHoldLastOpenDate() time.Time`

GetOnHoldLastOpenDate returns the OnHoldLastOpenDate field if non-nil, zero value otherwise.

### GetOnHoldLastOpenDateOk

`func (o *InstallmentPlan) GetOnHoldLastOpenDateOk() (*time.Time, bool)`

GetOnHoldLastOpenDateOk returns a tuple with the OnHoldLastOpenDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnHoldLastOpenDate

`func (o *InstallmentPlan) SetOnHoldLastOpenDate(v time.Time)`

SetOnHoldLastOpenDate sets OnHoldLastOpenDate field to given value.

### HasOnHoldLastOpenDate

`func (o *InstallmentPlan) HasOnHoldLastOpenDate() bool`

HasOnHoldLastOpenDate returns a boolean if a field has been set.

### GetOnHoldLastOpenUserId

`func (o *InstallmentPlan) GetOnHoldLastOpenUserId() string`

GetOnHoldLastOpenUserId returns the OnHoldLastOpenUserId field if non-nil, zero value otherwise.

### GetOnHoldLastOpenUserIdOk

`func (o *InstallmentPlan) GetOnHoldLastOpenUserIdOk() (*string, bool)`

GetOnHoldLastOpenUserIdOk returns a tuple with the OnHoldLastOpenUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnHoldLastOpenUserId

`func (o *InstallmentPlan) SetOnHoldLastOpenUserId(v string)`

SetOnHoldLastOpenUserId sets OnHoldLastOpenUserId field to given value.

### HasOnHoldLastOpenUserId

`func (o *InstallmentPlan) HasOnHoldLastOpenUserId() bool`

HasOnHoldLastOpenUserId returns a boolean if a field has been set.

### GetInstallmentsScheduleInterval

`func (o *InstallmentPlan) GetInstallmentsScheduleInterval() int32`

GetInstallmentsScheduleInterval returns the InstallmentsScheduleInterval field if non-nil, zero value otherwise.

### GetInstallmentsScheduleIntervalOk

`func (o *InstallmentPlan) GetInstallmentsScheduleIntervalOk() (*int32, bool)`

GetInstallmentsScheduleIntervalOk returns a tuple with the InstallmentsScheduleInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstallmentsScheduleInterval

`func (o *InstallmentPlan) SetInstallmentsScheduleInterval(v int32)`

SetInstallmentsScheduleInterval sets InstallmentsScheduleInterval field to given value.


### GetExternalPaymentProvider

`func (o *InstallmentPlan) GetExternalPaymentProvider() ExternalProviderTypes`

GetExternalPaymentProvider returns the ExternalPaymentProvider field if non-nil, zero value otherwise.

### GetExternalPaymentProviderOk

`func (o *InstallmentPlan) GetExternalPaymentProviderOk() (*ExternalProviderTypes, bool)`

GetExternalPaymentProviderOk returns a tuple with the ExternalPaymentProvider field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalPaymentProvider

`func (o *InstallmentPlan) SetExternalPaymentProvider(v ExternalProviderTypes)`

SetExternalPaymentProvider sets ExternalPaymentProvider field to given value.

### HasExternalPaymentProvider

`func (o *InstallmentPlan) HasExternalPaymentProvider() bool`

HasExternalPaymentProvider returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


