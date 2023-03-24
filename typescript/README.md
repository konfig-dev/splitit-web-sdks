## splitit-web-typescript-sdk@2.0.0

This library that utilizes [axios](https://github.com/axios/axios). The generated Node module can be used in the following environments:

Environment
* Node.js
* Webpack
* Browserify

Language level
* ES5 - you must have a Promises/A+ library installed
* ES6

Module system
* CommonJS
* ES6 module system

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Consuming

navigate to the folder of your consuming project and run the following command.

```
npm install splitit-web-typescript-sdk@2.0.0 --save
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


