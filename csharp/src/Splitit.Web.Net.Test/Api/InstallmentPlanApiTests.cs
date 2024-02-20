/*
 * splitit-web-api-v3
 *
 * Splitit's Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Splitit.Web.Net.Client;
using Splitit.Web.Net.Api;
using Splitit.Web.Net.Model;

namespace Splitit.Web.Net.Test.Api
{
    /// <summary>
    ///  Class for testing InstallmentPlanApi
    /// </summary>
    public class InstallmentPlanApiTests : IDisposable
    {
        private SplititClient client;

        public InstallmentPlanApiTests()
        {
            client = new SplititClient();
            client.SetBasePath("http://127.0.0.1:4010");
            // Configure OAuth2 credentials for "application" OAuth flow
            client.SetOAuthClientId(System.Environment.GetEnvironmentVariable("CLIENT_ID"));
            client.SetOAuthClientSecret(System.Environment.GetEnvironmentVariable("CLIENT_SECRET"));

        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test CheckEligibility
        /// </summary>
        [Fact]
        public void CheckEligibilityTest()
        {
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            var planData = new PlanData();
            var cardDetails = new CardData();
            var billingAddress = new AddressData();
            var shopperIdentifier = "shopperIdentifier_example";
            
            var checkInstallmentsEligibilityRequest = new CheckInstallmentsEligibilityRequest(
                planData,
                cardDetails,
                billingAddress,
                shopperIdentifier
            );
            
            try
            {
                InstallmentsEligibilityResponse result = client.InstallmentPlan.CheckEligibility(xSplititIdempotencyKey, xSplititTouchPoint, checkInstallmentsEligibilityRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.CheckEligibility: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test Get
        /// </summary>
        [Fact]
        public void GetTest()
        {
            var installmentPlanNumber = "installmentPlanNumber_example";
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            
            try
            {
                InstallmentPlanGetResponse result = client.InstallmentPlan.Get(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Get: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test Post
        /// </summary>
        [Fact]
        public void PostTest()
        {
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            var autoCapture = false;
            var attempt3dSecure = false;
            var shopper = new ShopperData();
            var planData = new PlanDataModel();
            var billingAddress = new AddressDataModel();
            var redirectUrls = new InitiateRedirectionEndpointsModel();
            var uxSettings = new UxSettingsModel();
            var eventsEndpoints = new EventsEndpointsModel();
            var processingData = new ProcessingData();
            
            var installmentPlanInitiateRequest = new InstallmentPlanInitiateRequest(
                autoCapture,
                attempt3dSecure,
                shopper,
                planData,
                billingAddress,
                redirectUrls,
                uxSettings,
                eventsEndpoints,
                processingData
            );
            var xSplititTestMode = "None";
            var splititclientinfo = "splititclientinfo_example";
            
            try
            {
                InitiatePlanResponse result = client.InstallmentPlan.Post(xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanInitiateRequest, xSplititTestMode, splititclientinfo);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Post: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test Post2
        /// </summary>
        [Fact]
        public void Post2Test()
        {
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            var autoCapture = false;
            var attempt3dSecure = false;
            var termsAndConditionsAccepted = false;
            var shopper = new ShopperData();
            var planData = new PlanDataModel();
            var billingAddress = new AddressDataModel();
            var paymentMethod = new PaymentMethodModel();
            var redirectUrls = new RedirectionEndpointsModel();
            var processingData = new ProcessingData();
            var eventsEndpoints = new EventsEndpointsModel();
            
            var installmentPlanCreateRequest = new InstallmentPlanCreateRequest(
                autoCapture,
                attempt3dSecure,
                termsAndConditionsAccepted,
                shopper,
                planData,
                billingAddress,
                paymentMethod,
                redirectUrls,
                processingData,
                eventsEndpoints
            );
            var xSplititTestMode = "None";
            var splititclientinfo = "splititclientinfo_example";
            
            try
            {
                InstallmentPlanCreateResponse result = client.InstallmentPlan.Post2(xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanCreateRequest, xSplititTestMode, splititclientinfo);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Post2: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test Refund
        /// </summary>
        [Fact]
        public void RefundTest()
        {
            var installmentPlanNumber = "installmentPlanNumber_example";
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            var amount = default(double);
            var refundStrategy = RefundStrategy.FutureInstallmentsFirst;
            var referenceId = "referenceId_example";
            
            var installmentPlanRefundRequest = new InstallmentPlanRefundRequest(
                amount,
                refundStrategy,
                referenceId
            );
            
            try
            {
                InstallmentPlanRefundResponse result = client.InstallmentPlan.Refund(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanRefundRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Refund: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test Search
        /// </summary>
        [Fact]
        public void SearchTest()
        {
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            var installmentPlanNumber = "installmentPlanNumber_example";
            var refOrderNumber = "refOrderNumber_example";
            var extendedParams = new Dictionary<string, string>(
            );
            
            try
            {
                InstallmentPlanSearchResponse result = client.InstallmentPlan.Search(xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanNumber, refOrderNumber, extendedParams);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.Search: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test UpdateOrder
        /// </summary>
        [Fact]
        public void UpdateOrderTest()
        {
            var installmentPlanNumber = "installmentPlanNumber_example";
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            var refOrderNumber = "refOrderNumber_example";
            var trackingNumber = "trackingNumber_example";
            var capture = false;
            var shippingStatus = ShippingStatus.Pending;
            var newAmount = default(double);
            
            var installmentPlanUpdateRequest = new InstallmentPlanUpdateRequest(
                refOrderNumber,
                trackingNumber,
                capture,
                shippingStatus,
                newAmount
            );
            
            try
            {
                InstallmentPlanUpdateResponse result = client.InstallmentPlan.UpdateOrder(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanUpdateRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.UpdateOrder: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test UpdateOrder2
        /// </summary>
        [Fact]
        public void UpdateOrder2Test()
        {
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            
            var installmentPlanUpdateRequestByIdentifier = new InstallmentPlanUpdateRequestByIdentifier(
            );
            
            try
            {
                InstallmentPlanUpdateResponse result = client.InstallmentPlan.UpdateOrder2(xSplititIdempotencyKey, xSplititTouchPoint, installmentPlanUpdateRequestByIdentifier);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.UpdateOrder2: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test VerifyAuthorization
        /// </summary>
        [Fact]
        public void VerifyAuthorizationTest()
        {
            var installmentPlanNumber = "installmentPlanNumber_example";
            var xSplititIdempotencyKey = "xSplititIdempotencyKey_example";
            var xSplititTouchPoint = ""; // TouchPoint (default to "")
            
            try
            {
                VerifyAuthorizationResponse result = client.InstallmentPlan.VerifyAuthorization(installmentPlanNumber, xSplititIdempotencyKey, xSplititTouchPoint);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling InstallmentPlanApi.VerifyAuthorization: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
