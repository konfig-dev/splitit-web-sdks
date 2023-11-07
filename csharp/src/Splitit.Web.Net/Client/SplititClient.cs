/*
 * splitit-web-api-v3
 *
 * Splitit's Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using Splitit.Web.Net.Api;

namespace Splitit.Web.Net.Client
{
    /// <summary>
    ///  SDK client
    /// </summary>
    public class SplititClient
    {
        /// <summary>
        /// API instance
        /// </summary>
        public InstallmentPlanApi InstallmentPlan { get; private set; }

        /// <summary>
        /// Configuration instance
        /// </summary>
        public readonly Configuration Configuration;

        /// <summary>
        /// Constructor
        /// </summary>
        public SplititClient()
        {
            Configuration = new Configuration();
            init();
        }

        private void init()
        {
            InstallmentPlan = new InstallmentPlanApi(Configuration);
        }

        /// <summary>
        /// Setter for base path
        /// </summary>
        public SplititClient SetBasePath(string basePath)
        {
            Configuration.BasePath = basePath;
            init();
            return this;
        }

        /// <summary>
        /// Setter for verify SSL configuration. Set to false when you want to disable SSL verification.
        /// </summary>
        public SplititClient SetVerifySsl(bool verifySsl)
        {
            Configuration.VerifySsl = verifySsl;
            init();
            return this;
        }

        /// <summary>
        /// Setter for Username
        /// </summary>
        public SplititClient SetUsername(string username)
        {
            Configuration.Username = username;
            init();
            return this;
        }

        /// <summary>
        /// Setter for Password
        /// </summary>
        public SplititClient SetPassword(string password)
        {
            Configuration.Password = password;
            init();
            return this;
        }

        /// <summary>
        /// Setter for Access Token
        /// </summary>
        public SplititClient SetAccessToken(string accessToken)
        {
            Configuration.AccessToken = accessToken;
            init();
            return this;
        }

        /// <summary>
        /// Setter for OAuth Client Id
        /// </summary>
        public SplititClient SetOAuthClientId(string oAuthClientId)
        {
            Configuration.OAuthClientId = oAuthClientId;
            init();
            return this;
        }

        /// <summary>
        /// Setter for OAuth Client Secret
        /// </summary>
        public SplititClient SetOAuthClientSecret(string oAuthClientSecret)
        {
            Configuration.OAuthClientSecret = oAuthClientSecret;
            init();
            return this;
        }
    }
}
