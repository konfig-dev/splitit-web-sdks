/* tslint:disable */
/* eslint-disable */
/**
 * splitit-web-api-v3
 * Splitit\'s Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction, isBrowser } from '../common';
import { setOAuthToObject } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { AddressData } from '../models';
// @ts-ignore
import { AddressDataModel } from '../models';
// @ts-ignore
import { CardData } from '../models';
// @ts-ignore
import { CheckInstallmentsEligibilityRequest } from '../models';
// @ts-ignore
import { EventsEndpointsModel } from '../models';
// @ts-ignore
import { FailedResponse } from '../models';
// @ts-ignore
import { InstallmentPlanCreateRequest } from '../models';
// @ts-ignore
import { InstallmentPlanCreateResponse } from '../models';
// @ts-ignore
import { InstallmentsEligibilityResponse } from '../models';
// @ts-ignore
import { PaymentMethodModel } from '../models';
// @ts-ignore
import { PlanData } from '../models';
// @ts-ignore
import { PlanDataModel } from '../models';
// @ts-ignore
import { PlanErrorResponse } from '../models';
// @ts-ignore
import { ProcessingData } from '../models';
// @ts-ignore
import { RedirectionEndpointsModel } from '../models';
// @ts-ignore
import { ShopperData } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * StartPlansDirectApiApi - axios parameter creator
 * @export
 */
export const StartPlansDirectApiApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * As your customer beings to checkout, use this endpoint to verify their overall eligibility for Splitit installment plans and to determine plans for which they are eligible. This endpoint can be called repeatedly before and during checkout, for example you may call it after each field on a page is filled out. The Splitit API compares and updates the plan based on each new body as it arrives.
         * @summary Check Eligibility
         * @param {string} xSplititIdempotencyKey 
         * @param {string} xSplititTouchPoint TouchPoint
         * @param {CheckInstallmentsEligibilityRequest} checkInstallmentsEligibilityRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        checkEligibility: async (xSplititIdempotencyKey: string, xSplititTouchPoint: string, checkInstallmentsEligibilityRequest: CheckInstallmentsEligibilityRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'xSplititIdempotencyKey' is not null or undefined
            assertParamExists('checkEligibility', 'xSplititIdempotencyKey', xSplititIdempotencyKey)
            // verify required parameter 'xSplititTouchPoint' is not null or undefined
            assertParamExists('checkEligibility', 'xSplititTouchPoint', xSplititTouchPoint)
            // verify required parameter 'checkInstallmentsEligibilityRequest' is not null or undefined
            assertParamExists('checkEligibility', 'checkInstallmentsEligibilityRequest', checkInstallmentsEligibilityRequest)
            const localVarPath = `/api/installmentplans/check-eligibility`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth", ["api.v3"], configuration)
            if (xSplititIdempotencyKey != null) {
                localVarHeaderParameter['X-Splitit-IdempotencyKey'] = String(xSplititIdempotencyKey);
            }

            if (xSplititTouchPoint != null) {
                localVarHeaderParameter['X-Splitit-TouchPoint'] = String(xSplititTouchPoint);
            }


    
            localVarHeaderParameter['Content-Type'] = 'application/json-patch+json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: checkInstallmentsEligibilityRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(checkInstallmentsEligibilityRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Once you are ready to check your customer out, you can use the Create endpoint. Create enables you to pass in PCI sensitive data directly to the Splitit API, and thus requires SAQ-D PCI certification. A successful Create operation creates an authorization on a customer\'s credit card, and if AutoCapture has been set to true within the request body, both authorization and capture of the first installment will be completed (if AutoCapture is set to false, you will have to call Update Plan later). If Splitit is unable to successfully secure an authorization on a credit card, an error message will be returned in the response. Note that for funded plans, a customer\'s BillingAddress object must be filled out. In addition, if you are completely managing the input of PCI sensitive data on your side, it’s essential to ensure your customer has approved the Splitit specific terms and conditions. 
         * @summary Create Installment Plan
         * @param {string} xSplititIdempotencyKey 
         * @param {string} xSplititTouchPoint TouchPoint
         * @param {InstallmentPlanCreateRequest} installmentPlanCreateRequest 
         * @param {'None' | 'Regular' | 'Fast' | 'Automation'} [xSplititTestMode] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        post2: async (xSplititIdempotencyKey: string, xSplititTouchPoint: string, installmentPlanCreateRequest: InstallmentPlanCreateRequest, xSplititTestMode?: 'None' | 'Regular' | 'Fast' | 'Automation', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'xSplititIdempotencyKey' is not null or undefined
            assertParamExists('post2', 'xSplititIdempotencyKey', xSplititIdempotencyKey)
            // verify required parameter 'xSplititTouchPoint' is not null or undefined
            assertParamExists('post2', 'xSplititTouchPoint', xSplititTouchPoint)
            // verify required parameter 'installmentPlanCreateRequest' is not null or undefined
            assertParamExists('post2', 'installmentPlanCreateRequest', installmentPlanCreateRequest)
            const localVarPath = `/api/installmentplans`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oauth required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oauth", ["api.v3"], configuration)
            if (xSplititTestMode != null) {
                localVarHeaderParameter['X-Splitit-TestMode'] = String(xSplititTestMode);
            }

            if (xSplititIdempotencyKey != null) {
                localVarHeaderParameter['X-Splitit-IdempotencyKey'] = String(xSplititIdempotencyKey);
            }

            if (xSplititTouchPoint != null) {
                localVarHeaderParameter['X-Splitit-TouchPoint'] = String(xSplititTouchPoint);
            }


    
            localVarHeaderParameter['Content-Type'] = 'application/json-patch+json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: installmentPlanCreateRequest,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(installmentPlanCreateRequest, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * StartPlansDirectApiApi - functional programming interface
 * @export
 */
export const StartPlansDirectApiApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = StartPlansDirectApiApiAxiosParamCreator(configuration)
    return {
        /**
         * As your customer beings to checkout, use this endpoint to verify their overall eligibility for Splitit installment plans and to determine plans for which they are eligible. This endpoint can be called repeatedly before and during checkout, for example you may call it after each field on a page is filled out. The Splitit API compares and updates the plan based on each new body as it arrives.
         * @summary Check Eligibility
         * @param {StartPlansDirectApiApiCheckEligibilityRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async checkEligibility(requestParameters: StartPlansDirectApiApiCheckEligibilityRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<InstallmentsEligibilityResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.checkEligibility(requestParameters.xSplititIdempotencyKey, requestParameters.xSplititTouchPoint, requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Once you are ready to check your customer out, you can use the Create endpoint. Create enables you to pass in PCI sensitive data directly to the Splitit API, and thus requires SAQ-D PCI certification. A successful Create operation creates an authorization on a customer\'s credit card, and if AutoCapture has been set to true within the request body, both authorization and capture of the first installment will be completed (if AutoCapture is set to false, you will have to call Update Plan later). If Splitit is unable to successfully secure an authorization on a credit card, an error message will be returned in the response. Note that for funded plans, a customer\'s BillingAddress object must be filled out. In addition, if you are completely managing the input of PCI sensitive data on your side, it’s essential to ensure your customer has approved the Splitit specific terms and conditions. 
         * @summary Create Installment Plan
         * @param {StartPlansDirectApiApiPost2Request} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async post2(requestParameters: StartPlansDirectApiApiPost2Request, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<InstallmentPlanCreateResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.post2(requestParameters.xSplititIdempotencyKey, requestParameters.xSplititTouchPoint, requestParameters, requestParameters.xSplititTestMode, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * StartPlansDirectApiApi - factory interface
 * @export
 */
export const StartPlansDirectApiApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = StartPlansDirectApiApiFp(configuration)
    return {
        /**
         * As your customer beings to checkout, use this endpoint to verify their overall eligibility for Splitit installment plans and to determine plans for which they are eligible. This endpoint can be called repeatedly before and during checkout, for example you may call it after each field on a page is filled out. The Splitit API compares and updates the plan based on each new body as it arrives.
         * @summary Check Eligibility
         * @param {StartPlansDirectApiApiCheckEligibilityRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        checkEligibility(requestParameters: StartPlansDirectApiApiCheckEligibilityRequest, options?: AxiosRequestConfig): AxiosPromise<InstallmentsEligibilityResponse> {
            return localVarFp.checkEligibility(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * Once you are ready to check your customer out, you can use the Create endpoint. Create enables you to pass in PCI sensitive data directly to the Splitit API, and thus requires SAQ-D PCI certification. A successful Create operation creates an authorization on a customer\'s credit card, and if AutoCapture has been set to true within the request body, both authorization and capture of the first installment will be completed (if AutoCapture is set to false, you will have to call Update Plan later). If Splitit is unable to successfully secure an authorization on a credit card, an error message will be returned in the response. Note that for funded plans, a customer\'s BillingAddress object must be filled out. In addition, if you are completely managing the input of PCI sensitive data on your side, it’s essential to ensure your customer has approved the Splitit specific terms and conditions. 
         * @summary Create Installment Plan
         * @param {StartPlansDirectApiApiPost2Request} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        post2(requestParameters: StartPlansDirectApiApiPost2Request, options?: AxiosRequestConfig): AxiosPromise<InstallmentPlanCreateResponse> {
            return localVarFp.post2(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for checkEligibility operation in StartPlansDirectApiApi.
 * @export
 * @interface StartPlansDirectApiApiCheckEligibilityRequest
 */
export type StartPlansDirectApiApiCheckEligibilityRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof StartPlansDirectApiApiCheckEligibility
    */
    readonly xSplititIdempotencyKey: string
    
    /**
    * TouchPoint
    * @type {string}
    * @memberof StartPlansDirectApiApiCheckEligibility
    */
    readonly xSplititTouchPoint: string
    
} & CheckInstallmentsEligibilityRequest

/**
 * Request parameters for post2 operation in StartPlansDirectApiApi.
 * @export
 * @interface StartPlansDirectApiApiPost2Request
 */
export type StartPlansDirectApiApiPost2Request = {
    
    /**
    * 
    * @type {string}
    * @memberof StartPlansDirectApiApiPost2
    */
    readonly xSplititIdempotencyKey: string
    
    /**
    * TouchPoint
    * @type {string}
    * @memberof StartPlansDirectApiApiPost2
    */
    readonly xSplititTouchPoint: string
    
    /**
    * 
    * @type {'None' | 'Regular' | 'Fast' | 'Automation'}
    * @memberof StartPlansDirectApiApiPost2
    */
    readonly xSplititTestMode?: 'None' | 'Regular' | 'Fast' | 'Automation'
    
} & InstallmentPlanCreateRequest

/**
 * StartPlansDirectApiApiGenerated - object-oriented interface
 * @export
 * @class StartPlansDirectApiApiGenerated
 * @extends {BaseAPI}
 */
export class StartPlansDirectApiApiGenerated extends BaseAPI {
    /**
     * As your customer beings to checkout, use this endpoint to verify their overall eligibility for Splitit installment plans and to determine plans for which they are eligible. This endpoint can be called repeatedly before and during checkout, for example you may call it after each field on a page is filled out. The Splitit API compares and updates the plan based on each new body as it arrives.
     * @summary Check Eligibility
     * @param {StartPlansDirectApiApiCheckEligibilityRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof StartPlansDirectApiApiGenerated
     */
    public checkEligibility(requestParameters: StartPlansDirectApiApiCheckEligibilityRequest, options?: AxiosRequestConfig) {
        return StartPlansDirectApiApiFp(this.configuration).checkEligibility(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Once you are ready to check your customer out, you can use the Create endpoint. Create enables you to pass in PCI sensitive data directly to the Splitit API, and thus requires SAQ-D PCI certification. A successful Create operation creates an authorization on a customer\'s credit card, and if AutoCapture has been set to true within the request body, both authorization and capture of the first installment will be completed (if AutoCapture is set to false, you will have to call Update Plan later). If Splitit is unable to successfully secure an authorization on a credit card, an error message will be returned in the response. Note that for funded plans, a customer\'s BillingAddress object must be filled out. In addition, if you are completely managing the input of PCI sensitive data on your side, it’s essential to ensure your customer has approved the Splitit specific terms and conditions. 
     * @summary Create Installment Plan
     * @param {StartPlansDirectApiApiPost2Request} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof StartPlansDirectApiApiGenerated
     */
    public post2(requestParameters: StartPlansDirectApiApiPost2Request, options?: AxiosRequestConfig) {
        return StartPlansDirectApiApiFp(this.configuration).post2(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
