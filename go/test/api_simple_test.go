/*
splitit-web-api-v3

Testing InstallmentPlanApiService

*/

// Code generated by Konfig (https://konfigthis.com);

package splitit

import (
	"fmt"
	"os"
	"testing"

	splitit "github.com/konfig-dev/splitit-web-sdks/go"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func Test_simple(t *testing.T) {
	clientId := os.Getenv("SPLITIT_CLIENT_ID")
	clientSecret := os.Getenv("SPLITIT_CLIENT_SECRET")
	configuration := splitit.NewConfiguration()
	configuration.Servers[0].URL = "https://web-api-v3.sandbox.splitit.com"
	configuration.TokenUrl = "https://id.sandbox.splitit.com/connect/token"
	configuration.SetOAuthClientCredentials(clientId, clientSecret)
	client := splitit.NewAPIClient(configuration)

	t.Run("Test Simple", func(t *testing.T) {

		Currency := "USD"
		Email := "fake@email.com"
		AddressLine1 := "144 Union St"
		City := "Brooklyn"
		State := "North Dakota"
		Zip := "11231"
		Country := "United States"
		var NumberOfInstallments int32 = 10
		Attemp3dSecure := true

		installmentPlanCreateRequest := &splitit.InstallmentPlanInitiateRequest{
			Attempt3dSecure: &Attemp3dSecure,
			AutoCapture:     true,
			PlanData: &splitit.PlanDataModel{
				TotalAmount:          10.0,
				NumberOfInstallments: &NumberOfInstallments,
				Currency:             &Currency,
				PurchaseMethod:       splitit.PURCHASEMETHOD_IN_STORE,
			},
			Shopper: &splitit.ShopperData{
				Email: &Email,
			},
			BillingAddress: &splitit.AddressDataModel{
				AddressLine1: &AddressLine1,
				City:         &City,
				State:        &State,
				Zip:          &Zip,
				Country:      &Country,
			},
		}

		r := client.InstallmentPlanApi.Post()
		r = r.InstallmentPlanInitiateRequest(*installmentPlanCreateRequest)
		xSplititIdempotencyKey := "1234"
		r = r.XSplititIdempotencyKey(xSplititIdempotencyKey)
		fmt.Printf("%+v\n", r)

		resp, httpRes, err := r.Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)
	})

}
