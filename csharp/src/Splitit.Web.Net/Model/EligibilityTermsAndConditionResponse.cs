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
    /// EligibilityTermsAndConditionResponse
    /// </summary>
    [DataContract(Name = "EligibilityTermsAndConditionResponse")]
    public partial class EligibilityTermsAndConditionResponse : IEquatable<EligibilityTermsAndConditionResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EligibilityTermsAndConditionResponse" /> class.
        /// </summary>
        /// <param name="termsAndConditions">termsAndConditions.</param>
        /// <param name="privacyPolicy">privacyPolicy.</param>
        public EligibilityTermsAndConditionResponse(string termsAndConditions = default(string), string privacyPolicy = default(string))
        {
            this.TermsAndConditions = termsAndConditions;
            this.PrivacyPolicy = privacyPolicy;
        }

        /// <summary>
        /// Gets or Sets TermsAndConditions
        /// </summary>
        [DataMember(Name = "TermsAndConditions", EmitDefaultValue = false)]
        public string TermsAndConditions { get; set; }

        /// <summary>
        /// Gets or Sets PrivacyPolicy
        /// </summary>
        [DataMember(Name = "PrivacyPolicy", EmitDefaultValue = false)]
        public string PrivacyPolicy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EligibilityTermsAndConditionResponse {\n");
            sb.Append("  TermsAndConditions: ").Append(TermsAndConditions).Append("\n");
            sb.Append("  PrivacyPolicy: ").Append(PrivacyPolicy).Append("\n");
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
            return this.Equals(input as EligibilityTermsAndConditionResponse);
        }

        /// <summary>
        /// Returns true if EligibilityTermsAndConditionResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of EligibilityTermsAndConditionResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EligibilityTermsAndConditionResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TermsAndConditions == input.TermsAndConditions ||
                    (this.TermsAndConditions != null &&
                    this.TermsAndConditions.Equals(input.TermsAndConditions))
                ) && 
                (
                    this.PrivacyPolicy == input.PrivacyPolicy ||
                    (this.PrivacyPolicy != null &&
                    this.PrivacyPolicy.Equals(input.PrivacyPolicy))
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
                if (this.TermsAndConditions != null)
                {
                    hashCode = (hashCode * 59) + this.TermsAndConditions.GetHashCode();
                }
                if (this.PrivacyPolicy != null)
                {
                    hashCode = (hashCode * 59) + this.PrivacyPolicy.GetHashCode();
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
