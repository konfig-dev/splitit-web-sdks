import { PurchaseMethod, Splitit } from "./index";
it("simple operation started", async () => {
  const oauthClientId = process.env.SPLITIT_CLIENT_ID;
  const oauthClientSecret = process.env.SPLITIT_CLIENT_SECRET;

  const splitit = new Splitit({
    oauthClientId,
    oauthClientSecret,
    oauthTokenUrl: "https://id.sandbox.splitit.com/connect/token",
    basePath: "http://127.0.0.1:4010",
  });
  const result = await splitit.installmentplan.post({
    AutoCapture: true,
    Attempt3dSecure: true,
    xSplititIdempotencyKey: new Date().toISOString(),
    xSplititTouchPoint: "TestSDK",
    Shopper: {
      Email: "fake@email.com",
    },
    PlanData: {
      TotalAmount: 10,
      NumberOfInstallments: 10,
      Currency: "USD",
      PurchaseMethod: "InStore",
    },
    BillingAddress: {
      AddressLine1: "144 Union St",
      City: "Brooklyn",
      State: "North Dakota",
      Zip: "11231",
      Country: "United States",
    },
    RedirectUrls: {},
  });
  expect(result).not.toBeNull();
});
