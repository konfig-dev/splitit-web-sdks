/*
 * splitit-web-api-v3
 *
 * Splitit's Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Splitit.Web.Net.Client.OpenAPIDateConverter;

namespace Splitit.Web.Net.Model
{
    /// <summary>
    /// AuthorizationModel
    /// </summary>
    [DataContract(Name = "AuthorizationModel")]
    public partial class AuthorizationModel : IEquatable<AuthorizationModel>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "Status", IsRequired = true, EmitDefaultValue = true)]
        public GwAuthorizationStatus Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="AuthorizationModel" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AuthorizationModel() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AuthorizationModel" /> class.
        /// </summary>
        /// <param name="status">status (required).</param>
        /// <param name="date">date.</param>
        /// <param name="splititErrorResultCode">splititErrorResultCode.</param>
        /// <param name="gatewayTransactionID">gatewayTransactionID.</param>
        /// <param name="gatewayResultCode">gatewayResultCode.</param>
        /// <param name="gatewayResultMessage">gatewayResultMessage.</param>
        /// <param name="threeDSRedirect">threeDSRedirect.</param>
        /// <param name="cAVV">cAVV.</param>
        /// <param name="eCI">eCI.</param>
        public AuthorizationModel(GwAuthorizationStatus status = default(GwAuthorizationStatus), DateTime date = default(DateTime), string splititErrorResultCode = default(string), string gatewayTransactionID = default(string), string gatewayResultCode = default(string), string gatewayResultMessage = default(string), ThreeDsRedirectDataV3 threeDSRedirect = default(ThreeDsRedirectDataV3), string cAVV = default(string), string eCI = default(string))
        {
            this.Status = status;
            this.Date = date;
            this.SplititErrorResultCode = splititErrorResultCode;
            this.GatewayTransactionID = gatewayTransactionID;
            this.GatewayResultCode = gatewayResultCode;
            this.GatewayResultMessage = gatewayResultMessage;
            this.ThreeDSRedirect = threeDSRedirect;
            this.CAVV = cAVV;
            this.ECI = eCI;
        }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name = "Date", EmitDefaultValue = false)]
        public DateTime Date { get; set; }

        /// <summary>
        /// Gets or Sets SplititErrorResultCode
        /// </summary>
        [DataMember(Name = "SplititErrorResultCode", EmitDefaultValue = false)]
        public string SplititErrorResultCode { get; set; }

        /// <summary>
        /// Gets or Sets GatewayTransactionID
        /// </summary>
        [DataMember(Name = "GatewayTransactionID", EmitDefaultValue = false)]
        public string GatewayTransactionID { get; set; }

        /// <summary>
        /// Gets or Sets GatewayResultCode
        /// </summary>
        [DataMember(Name = "GatewayResultCode", EmitDefaultValue = false)]
        public string GatewayResultCode { get; set; }

        /// <summary>
        /// Gets or Sets GatewayResultMessage
        /// </summary>
        [DataMember(Name = "GatewayResultMessage", EmitDefaultValue = false)]
        public string GatewayResultMessage { get; set; }

        /// <summary>
        /// Gets or Sets ThreeDSRedirect
        /// </summary>
        [DataMember(Name = "ThreeDSRedirect", EmitDefaultValue = false)]
        public ThreeDsRedirectDataV3 ThreeDSRedirect { get; set; }

        /// <summary>
        /// Gets or Sets CAVV
        /// </summary>
        [DataMember(Name = "CAVV", EmitDefaultValue = false)]
        public string CAVV { get; set; }

        /// <summary>
        /// Gets or Sets ECI
        /// </summary>
        [DataMember(Name = "ECI", EmitDefaultValue = false)]
        public string ECI { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AuthorizationModel {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  SplititErrorResultCode: ").Append(SplititErrorResultCode).Append("\n");
            sb.Append("  GatewayTransactionID: ").Append(GatewayTransactionID).Append("\n");
            sb.Append("  GatewayResultCode: ").Append(GatewayResultCode).Append("\n");
            sb.Append("  GatewayResultMessage: ").Append(GatewayResultMessage).Append("\n");
            sb.Append("  ThreeDSRedirect: ").Append(ThreeDSRedirect).Append("\n");
            sb.Append("  CAVV: ").Append(CAVV).Append("\n");
            sb.Append("  ECI: ").Append(ECI).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AuthorizationModel);
        }

        /// <summary>
        /// Returns true if AuthorizationModel instances are equal
        /// </summary>
        /// <param name="input">Instance of AuthorizationModel to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AuthorizationModel input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.SplititErrorResultCode == input.SplititErrorResultCode ||
                    (this.SplititErrorResultCode != null &&
                    this.SplititErrorResultCode.Equals(input.SplititErrorResultCode))
                ) && 
                (
                    this.GatewayTransactionID == input.GatewayTransactionID ||
                    (this.GatewayTransactionID != null &&
                    this.GatewayTransactionID.Equals(input.GatewayTransactionID))
                ) && 
                (
                    this.GatewayResultCode == input.GatewayResultCode ||
                    (this.GatewayResultCode != null &&
                    this.GatewayResultCode.Equals(input.GatewayResultCode))
                ) && 
                (
                    this.GatewayResultMessage == input.GatewayResultMessage ||
                    (this.GatewayResultMessage != null &&
                    this.GatewayResultMessage.Equals(input.GatewayResultMessage))
                ) && 
                (
                    this.ThreeDSRedirect == input.ThreeDSRedirect ||
                    (this.ThreeDSRedirect != null &&
                    this.ThreeDSRedirect.Equals(input.ThreeDSRedirect))
                ) && 
                (
                    this.CAVV == input.CAVV ||
                    (this.CAVV != null &&
                    this.CAVV.Equals(input.CAVV))
                ) && 
                (
                    this.ECI == input.ECI ||
                    (this.ECI != null &&
                    this.ECI.Equals(input.ECI))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.SplititErrorResultCode != null)
                {
                    hashCode = (hashCode * 59) + this.SplititErrorResultCode.GetHashCode();
                }
                if (this.GatewayTransactionID != null)
                {
                    hashCode = (hashCode * 59) + this.GatewayTransactionID.GetHashCode();
                }
                if (this.GatewayResultCode != null)
                {
                    hashCode = (hashCode * 59) + this.GatewayResultCode.GetHashCode();
                }
                if (this.GatewayResultMessage != null)
                {
                    hashCode = (hashCode * 59) + this.GatewayResultMessage.GetHashCode();
                }
                if (this.ThreeDSRedirect != null)
                {
                    hashCode = (hashCode * 59) + this.ThreeDSRedirect.GetHashCode();
                }
                if (this.CAVV != null)
                {
                    hashCode = (hashCode * 59) + this.CAVV.GetHashCode();
                }
                if (this.ECI != null)
                {
                    hashCode = (hashCode * 59) + this.ECI.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
