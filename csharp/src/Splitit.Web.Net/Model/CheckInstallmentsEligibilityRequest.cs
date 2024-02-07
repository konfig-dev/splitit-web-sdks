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
    /// CheckInstallmentsEligibilityRequest
    /// </summary>
    [DataContract(Name = "CheckInstallmentsEligibilityRequest")]
    public partial class CheckInstallmentsEligibilityRequest : IEquatable<CheckInstallmentsEligibilityRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CheckInstallmentsEligibilityRequest" /> class.
        /// </summary>
        /// <param name="planData">planData.</param>
        /// <param name="cardDetails">cardDetails.</param>
        /// <param name="billingAddress">billingAddress.</param>
        /// <param name="shopperIdentifier">shopperIdentifier.</param>
        public CheckInstallmentsEligibilityRequest(PlanData planData = default(PlanData), CardData cardDetails = default(CardData), AddressData billingAddress = default(AddressData), string shopperIdentifier = default(string))
        {
            this.PlanData = planData;
            this.CardDetails = cardDetails;
            this.BillingAddress = billingAddress;
            this.ShopperIdentifier = shopperIdentifier;
        }

        /// <summary>
        /// Gets or Sets PlanData
        /// </summary>
        [DataMember(Name = "PlanData", EmitDefaultValue = false)]
        public PlanData PlanData { get; set; }

        /// <summary>
        /// Gets or Sets CardDetails
        /// </summary>
        [DataMember(Name = "CardDetails", EmitDefaultValue = false)]
        public CardData CardDetails { get; set; }

        /// <summary>
        /// Gets or Sets BillingAddress
        /// </summary>
        [DataMember(Name = "BillingAddress", EmitDefaultValue = false)]
        public AddressData BillingAddress { get; set; }

        /// <summary>
        /// Gets or Sets ShopperIdentifier
        /// </summary>
        [DataMember(Name = "ShopperIdentifier", EmitDefaultValue = false)]
        public string ShopperIdentifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CheckInstallmentsEligibilityRequest {\n");
            sb.Append("  PlanData: ").Append(PlanData).Append("\n");
            sb.Append("  CardDetails: ").Append(CardDetails).Append("\n");
            sb.Append("  BillingAddress: ").Append(BillingAddress).Append("\n");
            sb.Append("  ShopperIdentifier: ").Append(ShopperIdentifier).Append("\n");
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
            return this.Equals(input as CheckInstallmentsEligibilityRequest);
        }

        /// <summary>
        /// Returns true if CheckInstallmentsEligibilityRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of CheckInstallmentsEligibilityRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CheckInstallmentsEligibilityRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PlanData == input.PlanData ||
                    (this.PlanData != null &&
                    this.PlanData.Equals(input.PlanData))
                ) && 
                (
                    this.CardDetails == input.CardDetails ||
                    (this.CardDetails != null &&
                    this.CardDetails.Equals(input.CardDetails))
                ) && 
                (
                    this.BillingAddress == input.BillingAddress ||
                    (this.BillingAddress != null &&
                    this.BillingAddress.Equals(input.BillingAddress))
                ) && 
                (
                    this.ShopperIdentifier == input.ShopperIdentifier ||
                    (this.ShopperIdentifier != null &&
                    this.ShopperIdentifier.Equals(input.ShopperIdentifier))
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
                if (this.PlanData != null)
                {
                    hashCode = (hashCode * 59) + this.PlanData.GetHashCode();
                }
                if (this.CardDetails != null)
                {
                    hashCode = (hashCode * 59) + this.CardDetails.GetHashCode();
                }
                if (this.BillingAddress != null)
                {
                    hashCode = (hashCode * 59) + this.BillingAddress.GetHashCode();
                }
                if (this.ShopperIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.ShopperIdentifier.GetHashCode();
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
