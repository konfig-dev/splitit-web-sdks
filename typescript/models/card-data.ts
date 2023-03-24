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
import { CardBrand } from './card-brand';
// May contain unused imports in some cases
// @ts-ignore
import { CardType } from './card-type';

/**
 * 
 * @export
 * @interface CardData
 */
export interface CardData {
    /**
     * 
     * @type {string}
     * @memberof CardData
     */
    'CardHolderFullName'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData
     */
    'CardNumber'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData
     */
    'CardExpYear'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData
     */
    'CardExpMonth'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData
     */
    'CardCvv'?: string;
    /**
     * 
     * @type {CardBrand}
     * @memberof CardData
     */
    'CardBrand'?: CardBrand;
    /**
     * 
     * @type {CardType}
     * @memberof CardData
     */
    'CardType'?: CardType;
}

