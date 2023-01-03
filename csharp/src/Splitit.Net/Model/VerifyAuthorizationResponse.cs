/*
 * splitit-web-api-v3
 *
 * Splitit's API
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
using OpenAPIDateConverter = Splitit.Net.Client.OpenAPIDateConverter;

namespace Splitit.Net.Model
{
    /// <summary>
    /// VerifyAuthorizationResponse
    /// </summary>
    [DataContract(Name = "VerifyAuthorizationResponse")]
    public partial class VerifyAuthorizationResponse : IEquatable<VerifyAuthorizationResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VerifyAuthorizationResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VerifyAuthorizationResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VerifyAuthorizationResponse" /> class.
        /// </summary>
        /// <param name="isAuthorized">isAuthorized (required).</param>
        /// <param name="authorizationAmount">authorizationAmount.</param>
        /// <param name="authorization">authorization.</param>
        public VerifyAuthorizationResponse(bool isAuthorized = default(bool), decimal authorizationAmount = default(decimal), AuthorizationModel authorization = default(AuthorizationModel))
        {
            this.IsAuthorized = isAuthorized;
            this.AuthorizationAmount = authorizationAmount;
            this.Authorization = authorization;
        }

        /// <summary>
        /// Gets or Sets IsAuthorized
        /// </summary>
        [DataMember(Name = "IsAuthorized", IsRequired = true, EmitDefaultValue = true)]
        public bool IsAuthorized { get; set; }

        /// <summary>
        /// Gets or Sets AuthorizationAmount
        /// </summary>
        [DataMember(Name = "AuthorizationAmount", EmitDefaultValue = false)]
        public decimal AuthorizationAmount { get; set; }

        /// <summary>
        /// Gets or Sets Authorization
        /// </summary>
        [DataMember(Name = "Authorization", EmitDefaultValue = false)]
        public AuthorizationModel Authorization { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VerifyAuthorizationResponse {\n");
            sb.Append("  IsAuthorized: ").Append(IsAuthorized).Append("\n");
            sb.Append("  AuthorizationAmount: ").Append(AuthorizationAmount).Append("\n");
            sb.Append("  Authorization: ").Append(Authorization).Append("\n");
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
            return this.Equals(input as VerifyAuthorizationResponse);
        }

        /// <summary>
        /// Returns true if VerifyAuthorizationResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of VerifyAuthorizationResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VerifyAuthorizationResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsAuthorized == input.IsAuthorized ||
                    this.IsAuthorized.Equals(input.IsAuthorized)
                ) && 
                (
                    this.AuthorizationAmount == input.AuthorizationAmount ||
                    this.AuthorizationAmount.Equals(input.AuthorizationAmount)
                ) && 
                (
                    this.Authorization == input.Authorization ||
                    (this.Authorization != null &&
                    this.Authorization.Equals(input.Authorization))
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
                hashCode = (hashCode * 59) + this.IsAuthorized.GetHashCode();
                hashCode = (hashCode * 59) + this.AuthorizationAmount.GetHashCode();
                if (this.Authorization != null)
                {
                    hashCode = (hashCode * 59) + this.Authorization.GetHashCode();
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
