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


package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.model.CheckInstallmentsEligibilityRequest;
import com.konfigthis.splitit.client.model.FailedResponse;
import com.konfigthis.splitit.client.model.InitiatePlanResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanCancelResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanCreateRequest;
import com.konfigthis.splitit.client.model.InstallmentPlanCreateResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanGetResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanInitiateRequest;
import com.konfigthis.splitit.client.model.InstallmentPlanRefundRequest;
import com.konfigthis.splitit.client.model.InstallmentPlanRefundResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanSearchResponse;
import com.konfigthis.splitit.client.model.InstallmentPlanUpdateRequestByIdentifier;
import com.konfigthis.splitit.client.model.InstallmentPlanUpdateResponse;
import com.konfigthis.splitit.client.model.InstallmentsEligibilityResponse;
import com.konfigthis.splitit.client.model.PlanErrorResponse;
import com.konfigthis.splitit.client.model.UpdateOrderRequest;
import com.konfigthis.splitit.client.model.VerifyAuthorizationResponse;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstallmentPlanApi
 */
@Ignore
public class InstallmentPlanApiTest {

    private static InstallmentPlanApi api;

    
    @BeforeClass
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new InstallmentPlanApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        InstallmentPlanCancelResponse response = api.cancel(installmentPlanNumber, xSplititIdempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkEligibilityTest() throws ApiException {
        String xSplititIdempotencyKey = null;
        CheckInstallmentsEligibilityRequest checkInstallmentsEligibilityRequest = null;
        InstallmentsEligibilityResponse response = api.checkEligibility(xSplititIdempotencyKey, checkInstallmentsEligibilityRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        InstallmentPlanGetResponse response = api.get(installmentPlanNumber, xSplititIdempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTest() throws ApiException {
        String xSplititIdempotencyKey = null;
        InstallmentPlanInitiateRequest installmentPlanInitiateRequest = null;
        String xSplititTestMode = null;
        InitiatePlanResponse response = api.post(xSplititIdempotencyKey, installmentPlanInitiateRequest)
                .xSplititTestMode(xSplititTestMode)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void post2Test() throws ApiException {
        String xSplititIdempotencyKey = null;
        InstallmentPlanCreateRequest installmentPlanCreateRequest = null;
        String xSplititTestMode = null;
        InstallmentPlanCreateResponse response = api.post2(xSplititIdempotencyKey, installmentPlanCreateRequest)
                .xSplititTestMode(xSplititTestMode)
                .execute();
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
        InstallmentPlanRefundResponse response = api.refund(installmentPlanNumber, xSplititIdempotencyKey, installmentPlanRefundRequest)
                .execute();
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
        InstallmentPlanSearchResponse response = api.search(xSplititIdempotencyKey)
                .installmentPlanNumber(installmentPlanNumber)
                .refOrderNumber(refOrderNumber)
                .extendedParams(extendedParams)
                .execute();
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
        InstallmentPlanUpdateResponse response = api.updateOrder(installmentPlanNumber, xSplititIdempotencyKey, updateOrderRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrder2Test() throws ApiException {
        String xSplititIdempotencyKey = null;
        InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = null;
        InstallmentPlanUpdateResponse response = api.updateOrder2(xSplititIdempotencyKey, installmentPlanUpdateRequestByIdentifier)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyAuthorizationTest() throws ApiException {
        String installmentPlanNumber = null;
        String xSplititIdempotencyKey = null;
        VerifyAuthorizationResponse response = api.verifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey)
                .execute();
        // TODO: test validations
    }

}
