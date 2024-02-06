/*
splitit-web-api-v3

Splitit's Web API

The version of the OpenAPI document: 1.0.0


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { AddressData2 } from './address-data2';
import { ReferenceEntityBase } from './reference-entity-base';

/**
 * 
 * @export
 * @interface CardData2
 */
export interface CardData2 {
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'CardId'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'CardNumber'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'CardExpMonth'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'CardExpYear'?: string;
    /**
     * 
     * @type {ReferenceEntityBase}
     * @memberof CardData2
     */
    'CardBrand'?: ReferenceEntityBase;
    /**
     * 
     * @type {ReferenceEntityBase}
     * @memberof CardData2
     */
    'CardType'?: ReferenceEntityBase;
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'Bin'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'CardHolderFullName'?: string;
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'CardCvv'?: string;
    /**
     * 
     * @type {AddressData2}
     * @memberof CardData2
     */
    'Address'?: AddressData2;
    /**
     * 
     * @type {string}
     * @memberof CardData2
     */
    'Token'?: string;
}

