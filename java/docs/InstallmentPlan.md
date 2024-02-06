

# InstallmentPlan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**installmentPlanNumber** | **String** |  |  [optional] |
|**installmentPlanStatus** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  |  [optional] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**outstandingAmount** | [**Money**](Money.md) |  |  [optional] |
|**disputes** | [**Disputes**](Disputes.md) |  |  [optional] |
|**numberOfInstallments** | **Integer** |  |  |
|**numberOfProcessedInstallments** | **Integer** |  |  |
|**originalAmount** | [**Money**](Money.md) |  |  [optional] |
|**refundAmount** | [**Money**](Money.md) |  |  [optional] |
|**consumer** | [**ConsumerData**](ConsumerData.md) |  |  [optional] |
|**activeCard** | [**CardData2**](CardData2.md) |  |  [optional] |
|**fraudCheck** | [**FraudCheck**](FraudCheck.md) |  |  [optional] |
|**terminal** | [**TerminalRef**](TerminalRef.md) |  |  [optional] |
|**merchant** | [**MerchantRef**](MerchantRef.md) |  |  [optional] |
|**refOrderNumber** | **String** |  |  [optional] |
|**purchaseMethod** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  |  [optional] |
|**strategy** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  |  [optional] |
|**delayResolution** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  |  [optional] |
|**extendedParams** | **Map&lt;String, String&gt;** |  |  [optional] |
|**isFullCaptured** | **Boolean** |  |  |
|**isChargedBack** | **Boolean** |  |  |
|**arePaymentsOnHold** | **Boolean** |  |  |
|**scpFundingPercent** | **Double** |  |  |
|**fundingStatus** | **MoneyFlows** |  |  |
|**testMode** | **TestModes** |  |  |
|**creationDateTime** | **OffsetDateTime** |  |  |
|**lifeTimeUrlExpirationTime** | **OffsetDateTime** |  |  |
|**installments** | [**List&lt;Installment2&gt;**](Installment2.md) |  |  [optional] |
|**secureAuthorizations** | [**List&lt;ReAuthorization&gt;**](ReAuthorization.md) |  |  [optional] |
|**logoUrl** | **String** |  |  [optional] |
|**isInAutoRetry** | **Boolean** |  |  |
|**paymentMethod** | **String** |  |  [optional] |
|**allowCardUpdateOnSplititPortals** | **Boolean** |  |  |
|**onHoldLastOpenDate** | **OffsetDateTime** |  |  [optional] |
|**onHoldLastOpenUserId** | **String** |  |  [optional] |
|**installmentsScheduleInterval** | **Integer** |  |  |
|**externalPaymentProvider** | **ExternalProviderTypes** |  |  [optional] |



