/*
splitit-web-api-v3

Splitit's Web API

The version of the OpenAPI document: 1.0.0


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/


/**
 * 
 * @export
 * @interface RefundSummary
 */
export interface RefundSummary {
    /**
     * 
     * @type {number}
     * @memberof RefundSummary
     */
    'TotalAmount'?: number;
    /**
     * 
     * @type {number}
     * @memberof RefundSummary
     */
    'FailedAmount'?: number;
    /**
     * 
     * @type {number}
     * @memberof RefundSummary
     */
    'SucceededAmount'?: number;
    /**
     * 
     * @type {number}
     * @memberof RefundSummary
     */
    'PendingAmount'?: number;
}

