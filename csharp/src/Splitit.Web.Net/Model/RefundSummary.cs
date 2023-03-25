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
    /// RefundSummary
    /// </summary>
    [DataContract(Name = "RefundSummary")]
    public partial class RefundSummary : IEquatable<RefundSummary>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RefundSummary" /> class.
        /// </summary>
        /// <param name="totalAmount">totalAmount.</param>
        /// <param name="failedAmount">failedAmount.</param>
        /// <param name="succeededAmount">succeededAmount.</param>
        /// <param name="pendingAmount">pendingAmount.</param>
        public RefundSummary(decimal totalAmount = default(decimal), decimal failedAmount = default(decimal), decimal succeededAmount = default(decimal), decimal pendingAmount = default(decimal))
        {
            this.TotalAmount = totalAmount;
            this.FailedAmount = failedAmount;
            this.SucceededAmount = succeededAmount;
            this.PendingAmount = pendingAmount;
        }

        /// <summary>
        /// Gets or Sets TotalAmount
        /// </summary>
        [DataMember(Name = "TotalAmount", EmitDefaultValue = false)]
        public decimal TotalAmount { get; set; }

        /// <summary>
        /// Gets or Sets FailedAmount
        /// </summary>
        [DataMember(Name = "FailedAmount", EmitDefaultValue = false)]
        public decimal FailedAmount { get; set; }

        /// <summary>
        /// Gets or Sets SucceededAmount
        /// </summary>
        [DataMember(Name = "SucceededAmount", EmitDefaultValue = false)]
        public decimal SucceededAmount { get; set; }

        /// <summary>
        /// Gets or Sets PendingAmount
        /// </summary>
        [DataMember(Name = "PendingAmount", EmitDefaultValue = false)]
        public decimal PendingAmount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RefundSummary {\n");
            sb.Append("  TotalAmount: ").Append(TotalAmount).Append("\n");
            sb.Append("  FailedAmount: ").Append(FailedAmount).Append("\n");
            sb.Append("  SucceededAmount: ").Append(SucceededAmount).Append("\n");
            sb.Append("  PendingAmount: ").Append(PendingAmount).Append("\n");
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
            return this.Equals(input as RefundSummary);
        }

        /// <summary>
        /// Returns true if RefundSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of RefundSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RefundSummary input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TotalAmount == input.TotalAmount ||
                    this.TotalAmount.Equals(input.TotalAmount)
                ) && 
                (
                    this.FailedAmount == input.FailedAmount ||
                    this.FailedAmount.Equals(input.FailedAmount)
                ) && 
                (
                    this.SucceededAmount == input.SucceededAmount ||
                    this.SucceededAmount.Equals(input.SucceededAmount)
                ) && 
                (
                    this.PendingAmount == input.PendingAmount ||
                    this.PendingAmount.Equals(input.PendingAmount)
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
                hashCode = (hashCode * 59) + this.TotalAmount.GetHashCode();
                hashCode = (hashCode * 59) + this.FailedAmount.GetHashCode();
                hashCode = (hashCode * 59) + this.SucceededAmount.GetHashCode();
                hashCode = (hashCode * 59) + this.PendingAmount.GetHashCode();
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
