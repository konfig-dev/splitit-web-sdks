package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.Configuration;
import com.konfigthis.splitit.client.Splitit;
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
                Configuration configuration = new Configuration();
                configuration.clientId = System.getenv("SPLITIT_CLIENT_ID");
                configuration.clientSecret = System.getenv("SPLITIT_CLIENT_SECRET");
                configuration.host = "http://127.0.0.1:4010";
                configuration.tokenUrl = "https://id.sandbox.splitit.com/connect/token";
                Splitit splitit = new Splitit(configuration);
                InitiatePlanResponse result = splitit.installmentPlan
                                .post(new Date().toString(), new Date().toString())
                                .autoCapture(true)
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
