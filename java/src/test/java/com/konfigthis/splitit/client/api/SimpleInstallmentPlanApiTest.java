package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.auth.OAuth;
import com.konfigthis.splitit.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class SimpleInstallmentPlanApiTest {

        /**
         * @throws ApiException if the Api call fails
         */
        @Test
        public void createInstallmentPlanTest() throws ApiException {
                // String clientId = System.getenv("SPLITIT_CLIENT_ID");
                // String secretId = System.getenv("SPLITIT_CLIENT_SECRET");
                ApiClient defaultClient = new ApiClient();
                defaultClient.setBasePath("http://127.0.0.1:4010");
                OAuth auth = (OAuth) defaultClient.getAuthentication("oauth");
                auth.setAccessToken("dummy_token");
                InstallmentPlanApi api = new InstallmentPlanApi(defaultClient);
                InitiatePlanResponse result = api
                                .post(true, new Date().toString(), new Date().toString())
                                .attempt3dSecure(true)
                                .planData(new PlanDataModel()
                                                .totalAmount(10)
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
                                .redirectUrls(new InitiateRedirectionEndpointsModel())
                                .execute();
                System.out.println(result);
                assertNotNull("Received null response", result);
        }
}
