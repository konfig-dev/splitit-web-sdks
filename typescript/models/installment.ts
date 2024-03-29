/*
splitit-web-api-v3

Splitit's Web API

The version of the OpenAPI document: 1.0.0


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { InstallmentStatus } from './installment-status';

/**
 * 
 * @export
 * @interface Installment
 */
export interface Installment {
    /**
     * 
     * @type {number}
     * @memberof Installment
     */
    'InstallmentNumber': number;
    /**
     * 
     * @type {number}
     * @memberof Installment
     */
    'Amount': number;
    /**
     * 
     * @type {string}
     * @memberof Installment
     */
    'ProcessDateTime'?: string;
    /**
     * 
     * @type {InstallmentStatus}
     * @memberof Installment
     */
    'Status': InstallmentStatus;
}

