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
    /// InstallmentPlanUpdateResponse
    /// </summary>
    [DataContract(Name = "InstallmentPlanUpdateResponse")]
    public partial class InstallmentPlanUpdateResponse : IEquatable<InstallmentPlanUpdateResponse>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "Status", IsRequired = true, EmitDefaultValue = true)]
        public PlanStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets ShippingStatus
        /// </summary>
        [DataMember(Name = "ShippingStatus", IsRequired = true, EmitDefaultValue = true)]
        public ShippingStatus ShippingStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallmentPlanUpdateResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InstallmentPlanUpdateResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallmentPlanUpdateResponse" /> class.
        /// </summary>
        /// <param name="refOrderNumber">refOrderNumber.</param>
        /// <param name="installmentPlanNumber">installmentPlanNumber.</param>
        /// <param name="status">status (required).</param>
        /// <param name="shippingStatus">shippingStatus (required).</param>
        public InstallmentPlanUpdateResponse(string refOrderNumber = default(string), string installmentPlanNumber = default(string), PlanStatus status = default(PlanStatus), ShippingStatus shippingStatus = default(ShippingStatus))
        {
            this.Status = status;
            this.ShippingStatus = shippingStatus;
            this.RefOrderNumber = refOrderNumber;
            this.InstallmentPlanNumber = installmentPlanNumber;
        }

        /// <summary>
        /// Gets or Sets RefOrderNumber
        /// </summary>
        [DataMember(Name = "RefOrderNumber", EmitDefaultValue = false)]
        public string RefOrderNumber { get; set; }

        /// <summary>
        /// Gets or Sets InstallmentPlanNumber
        /// </summary>
        [DataMember(Name = "InstallmentPlanNumber", EmitDefaultValue = false)]
        public string InstallmentPlanNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InstallmentPlanUpdateResponse {\n");
            sb.Append("  RefOrderNumber: ").Append(RefOrderNumber).Append("\n");
            sb.Append("  InstallmentPlanNumber: ").Append(InstallmentPlanNumber).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  ShippingStatus: ").Append(ShippingStatus).Append("\n");
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
            return this.Equals(input as InstallmentPlanUpdateResponse);
        }

        /// <summary>
        /// Returns true if InstallmentPlanUpdateResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of InstallmentPlanUpdateResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstallmentPlanUpdateResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RefOrderNumber == input.RefOrderNumber ||
                    (this.RefOrderNumber != null &&
                    this.RefOrderNumber.Equals(input.RefOrderNumber))
                ) && 
                (
                    this.InstallmentPlanNumber == input.InstallmentPlanNumber ||
                    (this.InstallmentPlanNumber != null &&
                    this.InstallmentPlanNumber.Equals(input.InstallmentPlanNumber))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.ShippingStatus == input.ShippingStatus ||
                    this.ShippingStatus.Equals(input.ShippingStatus)
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
                if (this.RefOrderNumber != null)
                {
                    hashCode = (hashCode * 59) + this.RefOrderNumber.GetHashCode();
                }
                if (this.InstallmentPlanNumber != null)
                {
                    hashCode = (hashCode * 59) + this.InstallmentPlanNumber.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                hashCode = (hashCode * 59) + this.ShippingStatus.GetHashCode();
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
