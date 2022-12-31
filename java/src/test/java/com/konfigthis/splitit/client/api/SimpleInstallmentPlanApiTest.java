package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.auth.OAuth;
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
        InstallmentPlanCreateRequest installmentPlanCreateRequest = new InstallmentPlanCreateRequest(); // InstallmentPlanCreateRequest |
        installmentPlanCreateRequest.attempt3dSecure(true)
                .autoCapture(true)
                .attemptAuthorize(true)
                .termsAndConditionsAccepted(true)
                .planData(new PlanDataModel()
                        .totalAmount(new BigDecimal(10))
                        .numberOfInstallments(10)
                        .currency("USD")
                        .purchaseMethod(PurchaseMethod.INSTORE)
                )
                .shopper(new ShopperData()
                        .email("fake@email.com")
                )
                .billingAddress(new AddressDataModel()
                        .addressLine1("144 Union St")
                        .city("Brooklyn")
                        .state("North Dakota")
                        .zip("11231")
                        .country("United States")
                )
                .paymentMethod(new PaymentMethodModel()
                        .type(PaymentMethodType.CARD)
                        .card(new CardData()
                                .cardExpMonth("12")
                                .cardExpYear("2025")
                                .cardCvv("111")
                                .cardNumber("4556997457604103")
                                .cardHolderFullName("Test User")
                        )
                );
        InstallmentPlanModel result = api.post(new Date().toString(), installmentPlanCreateRequest, null);
        System.out.println(result);
        assertNotNull("Received null response", result);
    }
}
