/*
splitit-web-api-v3

Splitit's Web API

The version of the OpenAPI document: 1.0.0


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { CardType } from './card-type';

/**
 * 
 * @export
 * @interface PaymentInfo
 */
export interface PaymentInfo {
    /**
     * 
     * @type {string}
     * @memberof PaymentInfo
     */
    'CardBin'?: string;
    /**
     * 
     * @type {CardType}
     * @memberof PaymentInfo
     */
    'CardType'?: CardType;
}
