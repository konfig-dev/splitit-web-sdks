package com.splitit.client.api;

import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.auth.Authentication;
import com.splitit.client.auth.OAuth;
import com.splitit.client.model.InstallmentPlanGetResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SimpleInstallmentPlanApiTest {

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInstallmentPlanTest() throws ApiException {
        ApiClient defaultClient = new ApiClient();
        OAuth bearer =  (OAuth) defaultClient.getAuthentication("bearer");
        bearer.setAccessToken("fdafafsafadsf");
        InstallmentPlanApi api = new InstallmentPlanApi(defaultClient);
        InstallmentPlanGetResponse model = api.search("1234213214", "123", "123", null);
        System.out.println(model);
        assertNotNull("Received null response", model);
    }
}
