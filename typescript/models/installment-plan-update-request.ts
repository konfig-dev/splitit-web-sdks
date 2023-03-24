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
 * https://konfigthis.com
 * Do not edit the class manually.
 */

// May contain unused imports in some cases
// @ts-ignore
import { ShippingStatus2 } from './shipping-status2';

/**
 * 
 * @export
 * @interface InstallmentPlanUpdateRequest
 */
export interface InstallmentPlanUpdateRequest {
    /**
     * 
     * @type {string}
     * @memberof InstallmentPlanUpdateRequest
     */
    'RefOrderNumber'?: string;
    /**
     * 
     * @type {string}
     * @memberof InstallmentPlanUpdateRequest
     */
    'TrackingNumber'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof InstallmentPlanUpdateRequest
     */
    'Capture'?: boolean;
    /**
     * 
     * @type {ShippingStatus2}
     * @memberof InstallmentPlanUpdateRequest
     */
    'ShippingStatus'?: ShippingStatus2;
}

