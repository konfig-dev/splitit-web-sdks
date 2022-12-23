# Example

```typescript
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
const response = await client.installmentPlan.search({
  xSplititIdempotencyKey: "1231231",
  installmentPlanNumber: "21321",
  refOrderNumber: "21312321",
});
```
