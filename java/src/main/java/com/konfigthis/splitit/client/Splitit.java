package com.konfigthis.splitit.client;

import com.konfigthis.splitit.client.api.InstallmentPlanApi;

public class Splitit {
    private ApiClient apiClient;
    public final InstallmentPlanApi installmentPlan;

    public Splitit() {
        this(null);
    }

    public Splitit(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.installmentPlan = new InstallmentPlanApi(this.apiClient);
    }

}
