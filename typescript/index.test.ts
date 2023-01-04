import { InstallmentPlanApi, PaymentMethodType, PurchaseMethod } from "./api";
import { Configuration } from "./configuration";
it("simple operation started", async () => {
  const oauthClientId = process.env.SPLITIT_CLIENT_ID;
  const oauthClientSecret = process.env.SPLITIT_CLIENT_SECRET;

  const config = new Configuration({ oauthClientId, oauthClientSecret });
  const api = new InstallmentPlanApi(config);
  const result = api.post(new Date().toISOString(), {
    Attempt3dSecure: true,
    AutoCapture: true,
    AttemptAuthorize: true,
    TermsAndConditionsAccepted: true,
    Shopper: {
      Email: "fake@email.com",
    },
    PlanData: {
      TotalAmount: 10,
      NumberOfInstallments: 10,
      Currency: "USD",
      PurchaseMethod: PurchaseMethod.InStore,
    },
    BillingAddress: {
      AddressLine1: "144 Union St",
      City: "Brooklyn",
      State: "North Dakota",
      Zip: "11231",
      Country: "United States",
    },
    PaymentMethod: {
      Type: PaymentMethodType.Card,
      Card: {
        CardCvv: "111",
        CardExpMonth: "12",
        CardExpYear: "2025",
        CardHolderFullName: "Test User",
        CardNumber: "4556997457604103",
      },
    },
  });
  expect(result).not.toBeNull();
});
