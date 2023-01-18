/*
 * splitit-web-api-v3
 * Splitit's API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.model.FailedResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanCancelResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanCreateRequest;
import com.konfigthis.splitit.client.model.InstallmentPlanGetResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanModel;
import com.konfigthis.splitit.client.model.InstallmentPlanRefundRequest;
import com.konfigthis.splitit.client.model.InstallmentPlanRefundResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanUpdateRequestByIdentifier;
import com.konfigthis.splitit.client.model.InstallmentPlanUpdateResponse;
import com.konfigthis.splitit.client.model.PlanErrorResponse;
import com.konfigthis.splitit.client.model.UpdateOrderRequest;
import com.konfigthis.splitit.client.model.VerifyAuthorizationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstallmentPlanApi
 */
@Disabled
public class InstallmentPlanApiTest {

    private final InstallmentPlanApi api = new InstallmentPlanApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        InstallmentPlanCancelResponse response = api.cancel(installmentPlanNumber, xSplititIdempotencyKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        InstallmentPlanModel response = api.get(installmentPlanNumber, xSplititIdempotencyKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTest() throws ApiException {
        String xSplititIdempotencyKey = null;
        InstallmentPlanCreateRequest installmentPlanCreateRequest = null;
        String xSplititTestMode = null;
        InstallmentPlanModel response = api.post(xSplititIdempotencyKey, installmentPlanCreateRequest, xSplititTestMode);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refundTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        InstallmentPlanRefundRequest installmentPlanRefundRequest = null;
        InstallmentPlanRefundResponse response = api.refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String xSplititIdempotencyKey = null;
        String installmentPlanNumber = null;
        String refOrderNumber = null;
        Map<String, String> extendedParams = null;
        InstallmentPlanGetResponse response = api.search(xSplititIdempotencyKey, installmentPlanNumber, refOrderNumber, extendedParams);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrderTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        UpdateOrderRequest updateOrderRequest = null;
        InstallmentPlanUpdateResponse response = api.updateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrder2Test() throws ApiException {
        String xSplititIdempotencyKey = null;
        InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = null;
        InstallmentPlanUpdateResponse response = api.updateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyAuthorizationTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        VerifyAuthorizationResponse response = api.verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey);
        // TODO: test validations
    }

}
