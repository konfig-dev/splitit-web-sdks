package com.konfigthis.splitit.client.api;

import com.konfigthis.splitit.client.ApiClient;
import com.konfigthis.splitit.client.ApiException;
import com.konfigthis.splitit.client.auth.OAuth;
import com.konfigthis.splitit.client.model.InstallmentPlanGetResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SimpleInstallmentPlanApiTest {

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInstallmentPlanTest() throws ApiException {
        String clientId = System.getenv("SPLITIT_CLIENT_ID");
        String secretId = System.getenv("SPLITIT_SECRET_ID");
        ApiClient defaultClient = new ApiClient(clientId, secretId, null);
        InstallmentPlanApi api = new InstallmentPlanApi(defaultClient);
        InstallmentPlanGetResponse model = api.search("1234213214", "123", "123", null);
        System.out.println(model);
        assertNotNull("Received null response", model);
    }
}
