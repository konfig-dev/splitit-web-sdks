package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.model.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class SimpleInstallmentPlanApiTest {

        /**
         * @throws ApiException if the Api call fails
         */
        @Test
        public void createInstallmentPlanTest() throws ApiException {
                String clientId = System.getenv("SPLITIT_CLIENT_ID");
                String secretId = System.getenv("SPLITIT_CLIENT_SECRET");
                ApiClient defaultClient = new ApiClient(clientId, secretId, null);
                InstallmentPlanApi api = new InstallmentPlanApi(defaultClient);
                InstallmentPlanInitiateRequest installmentPlanCreateRequest = new InstallmentPlanInitiateRequest();
                installmentPlanCreateRequest.attempt3dSecure(true)
                                .autoCapture(true)
                                .attempt3dSecure(true)
                                .planData(new PlanDataModel()
                                                .totalAmount(new BigDecimal(10))
                                                .numberOfInstallments(10)
                                                .currency("USD")
                                                .purchaseMethod(PurchaseMethod.INSTORE))
                                .shopper(new ShopperData()
                                                .email("fake@email.com"))
                                .billingAddress(new AddressDataModel()
                                                .addressLine1("144 Union St")
                                                .city("Brooklyn")
                                                .state("North Dakota")
                                                .zip("11231")
                                                .country("United States"))
                                .redirectUrls(new InitiateRedirectionEndpointsModel());
                InitiatePlanResponse result = api.post(new Date().toString(), installmentPlanCreateRequest).execute();
                System.out.println(result);
                assertNotNull("Received null response", result);
        }
}
