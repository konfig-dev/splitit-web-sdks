/*
 * splitit-web-api-v3
 * Splitit's Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.splitit.client.auth;

/**
 * OAuth flows that are supported by this client
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public enum OAuthFlow {
    ACCESS_CODE, //called authorizationCode  in OpenAPI 3.0
    IMPLICIT,
    PASSWORD,
    APPLICATION //called clientCredentials in OpenAPI 3.0
}
