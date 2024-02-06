/*
splitit-web-api-v3

Splitit's Web API

The version of the OpenAPI document: 1.0.0


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { CardResult } from './card-result';
import { DisputeStatus } from './dispute-status';
import { ReferenceEntityBase } from './reference-entity-base';

/**
 * 
 * @export
 * @interface TransactionResult
 */
export interface TransactionResult {
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    'GatewayTransactionId'?: string;
    /**
     * 
     * @type {number}
     * @memberof TransactionResult
     */
    'SplititTransactionId': number;
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    'SplititGatewayTransactionId'?: string;
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    'GatewayResultCode'?: string;
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    'GatewayResultMessage'?: string;
    /**
     * 
     * @type {ReferenceEntityBase}
     * @memberof TransactionResult
     */
    'OperationType'?: ReferenceEntityBase;
    /**
     * 
     * @type {boolean}
     * @memberof TransactionResult
     */
    'GatewayResult': boolean;
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    'GatewayTransactionDate': string;
    /**
     * 
     * @type {boolean}
     * @memberof TransactionResult
     */
    'IsChargeback': boolean;
    /**
     * 
     * @type {CardResult}
     * @memberof TransactionResult
     */
    'AVSResult'?: CardResult;
    /**
     * 
     * @type {CardResult}
     * @memberof TransactionResult
     */
    'CVCResult'?: CardResult;
    /**
     * 
     * @type {boolean}
     * @memberof TransactionResult
     */
    'IsInDispute'?: boolean;
    /**
     * 
     * @type {DisputeStatus}
     * @memberof TransactionResult
     */
    'DisputeStatus'?: DisputeStatus;
}

