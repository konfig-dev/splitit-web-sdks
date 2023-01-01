import axios from "axios";
import { InstallmentPlanApi, PaymentMethodType, PurchaseMethod } from "./api";
import { Configuration } from "./configuration";
it("simple operation started", async () => {
  const clientId = process.env.SPLITIT_CLIENT_ID;
  const clientSecret = process.env.SPLITIT_CLIENT_SECRET;

  const oauthResponse = await axios.request({
    url: "https://id.sandbox.splitit.com/connect/token",
    method: "POST",
    headers: {
      "content-type": "application/x-www-form-urlencoded",
    },
    data: `grant_type=client_credentials&client_id=${clientId}&client_secret=${clientSecret}`,
  });
  const json = await oauthResponse.data;
  const accessToken = json.access_token;
  const config = new Configuration({ accessToken });
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
