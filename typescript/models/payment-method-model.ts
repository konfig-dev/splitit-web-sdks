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
import { CardData } from './card-data';
// May contain unused imports in some cases
// @ts-ignore
import { PaymentMethodType } from './payment-method-type';

/**
 * 
 * @export
 * @interface PaymentMethodModel
 */
export interface PaymentMethodModel {
    /**
     * 
     * @type {PaymentMethodType}
     * @memberof PaymentMethodModel
     */
    'Type': PaymentMethodType;
    /**
     * 
     * @type {CardData}
     * @memberof PaymentMethodModel
     */
    'Card'?: CardData;
    /**
     * 
     * @type {string}
     * @memberof PaymentMethodModel
     */
    'Token'?: string;
}

