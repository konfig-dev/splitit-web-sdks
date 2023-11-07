/*
splitit-web-api-v3

Splitit's Web API

The version of the OpenAPI document: 1.0.0


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/

import { PlanStatus } from './plan-status';
import { ShippingStatus } from './shipping-status';

/**
 * 
 * @export
 * @interface InstallmentPlanUpdateResponse
 */
export interface InstallmentPlanUpdateResponse {
    /**
     * 
     * @type {string}
     * @memberof InstallmentPlanUpdateResponse
     */
    'RefOrderNumber'?: string;
    /**
     * 
     * @type {string}
     * @memberof InstallmentPlanUpdateResponse
     */
    'InstallmentPlanNumber'?: string;
    /**
     * 
     * @type {PlanStatus}
     * @memberof InstallmentPlanUpdateResponse
     */
    'Status': PlanStatus;
    /**
     * 
     * @type {ShippingStatus}
     * @memberof InstallmentPlanUpdateResponse
     */
    'ShippingStatus': ShippingStatus;
}

