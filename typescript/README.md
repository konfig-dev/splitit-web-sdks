## splitit-web-typescript-sdk@2.1.0
Splitit\'s Web API


**Important note: this library is can be used in both the client-side or server-side, but using it
in client-side browser code is not recommended as you would expose security credentials.**

### Installing

#### npm
```
npm install splitit-web-typescript-sdk --save
```

#### yarn
```
yarn add splitit-web-typescript-sdk
```



### Getting Started

```typescript
import { Splitit } from "splitit-web-typescript-sdk"

const splitit = new Splitit({
    // Defining the base path is optional and defaults to https://web-api-v3.sandbox.splitit.com
    // basePath: "https://web-api-v3.sandbox.splitit.com",
    oauthClientId: 'CLIENT_ID',
    oauthClientSecret: 'CLIENT_SECRET',

})

const cancelResponse = await splitit.installmentplan.cancel({
        "installmentPlanNumber": "installmentPlanNumber_example",
        "xSplititIdempotencyKey": "xSplititIdempotencyKey_example",
    })

console.log(cancelResponse)

```

## Documentation for API Endpoints

All URIs are relative to *https://web-api-v3.sandbox.splitit.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InstallmentplanApi* | [**cancel**](docs/InstallmentplanApi.md#cancel) | **POST** /api/installmentplans/{installmentPlanNumber}/cancel | 
*InstallmentplanApi* | [**checkEligibility**](docs/InstallmentplanApi.md#checkEligibility) | **POST** /api/installmentplans/check-eligibility | 
*InstallmentplanApi* | [**get**](docs/InstallmentplanApi.md#get) | **GET** /api/installmentplans/{installmentPlanNumber} | 
*InstallmentplanApi* | [**post**](docs/InstallmentplanApi.md#post) | **POST** /api/installmentplans/initiate | 
*InstallmentplanApi* | [**post2**](docs/InstallmentplanApi.md#post2) | **POST** /api/installmentplans | 
*InstallmentplanApi* | [**refund**](docs/InstallmentplanApi.md#refund) | **POST** /api/installmentplans/{installmentPlanNumber}/refund | 
*InstallmentplanApi* | [**search**](docs/InstallmentplanApi.md#search) | **GET** /api/installmentplans/search | 
*InstallmentplanApi* | [**updateOrder**](docs/InstallmentplanApi.md#updateOrder) | **PUT** /api/installmentplans/{installmentPlanNumber}/updateorder | 
*InstallmentplanApi* | [**updateOrder2**](docs/InstallmentplanApi.md#updateOrder2) | **PUT** /api/installmentplans/updateorder | 
*InstallmentplanApi* | [**verifyAuthorization**](docs/InstallmentplanApi.md#verifyAuthorization) | **GET** /api/installmentplans/{installmentPlanNumber}/verifyauthorization | 

