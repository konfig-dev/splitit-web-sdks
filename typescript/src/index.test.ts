import { SplititClient } from "./SplititClient";
import fetch from "node-fetch";
import { PurchaseMethod } from "./models/PurchaseMethod";
import { PaymentMethodType } from "./models/PaymentMethodType";
it("simple operation started", async () => {
  const clientId = process.env.SPLITIT_CLIENT_ID;
  const clientSecret = process.env.SPLITIT_CLIENT_SECRET;

  const oauthResponse = await fetch(
    "https://id.sandbox.splitit.com/connect/token",
    {
      method: "POST",
      headers: {
        "content-type": "application/x-www-form-urlencoded",
      },
      body: `grant_type=client_credentials&client_id=${clientId}&client_secret=${clientSecret}`,
    }
  );
  const json = await oauthResponse.json();
  const accessToken = json.access_token;
  const client = new SplititClient({ TOKEN: accessToken });
  const result = client.installmentPlan.post({
    xSplititIdempotencyKey: new Date().toISOString(),
    requestBody: {
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
        PurchaseMethod: PurchaseMethod.IN_STORE,
      },
      BillingAddress: {
        AddressLine1: "144 Union St",
        City: "Brooklyn",
        State: "North Dakota",
        Zip: "11231",
        Country: "United States",
      },
      PaymentMethod: {
        Type: PaymentMethodType.CARD,
        Card: {
          CardCvv: "111",
          CardExpMonth: "12",
          CardExpYear: "2025",
          CardHolderFullName: "Test User",
          CardNumber: "4556997457604103",
        },
      },
    },
  });
  expect(result).not.toBeNull();
});
