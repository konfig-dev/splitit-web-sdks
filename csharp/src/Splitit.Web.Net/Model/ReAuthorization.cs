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
    /// ReAuthorization
    /// </summary>
    [DataContract(Name = "ReAuthorization")]
    public partial class ReAuthorization : IEquatable<ReAuthorization>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReAuthorization" /> class.
        /// </summary>
        /// <param name="processingDate">processingDate.</param>
        /// <param name="amount">amount.</param>
        /// <param name="transactionResults">transactionResults.</param>
        /// <param name="cardDetails">cardDetails.</param>
        /// <param name="result">result.</param>
        public ReAuthorization(DateTime processingDate = default(DateTime), Money amount = default(Money), List<TransactionResult> transactionResults = default(List<TransactionResult>), CardData2 cardDetails = default(CardData2), bool result = default(bool))
        {
            this.ProcessingDate = processingDate;
            this.Amount = amount;
            this.TransactionResults = transactionResults;
            this.CardDetails = cardDetails;
            this.Result = result;
        }

        /// <summary>
        /// Gets or Sets ProcessingDate
        /// </summary>
        [DataMember(Name = "ProcessingDate", EmitDefaultValue = false)]
        public DateTime ProcessingDate { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "Amount", EmitDefaultValue = false)]
        public Money Amount { get; set; }

        /// <summary>
        /// Gets or Sets TransactionResults
        /// </summary>
        [DataMember(Name = "TransactionResults", EmitDefaultValue = false)]
        public List<TransactionResult> TransactionResults { get; set; }

        /// <summary>
        /// Gets or Sets CardDetails
        /// </summary>
        [DataMember(Name = "CardDetails", EmitDefaultValue = false)]
        public CardData2 CardDetails { get; set; }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name = "Result", EmitDefaultValue = true)]
        public bool Result { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReAuthorization {\n");
            sb.Append("  ProcessingDate: ").Append(ProcessingDate).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  TransactionResults: ").Append(TransactionResults).Append("\n");
            sb.Append("  CardDetails: ").Append(CardDetails).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
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
            return this.Equals(input as ReAuthorization);
        }

        /// <summary>
        /// Returns true if ReAuthorization instances are equal
        /// </summary>
        /// <param name="input">Instance of ReAuthorization to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReAuthorization input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ProcessingDate == input.ProcessingDate ||
                    (this.ProcessingDate != null &&
                    this.ProcessingDate.Equals(input.ProcessingDate))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.TransactionResults == input.TransactionResults ||
                    this.TransactionResults != null &&
                    input.TransactionResults != null &&
                    this.TransactionResults.SequenceEqual(input.TransactionResults)
                ) && 
                (
                    this.CardDetails == input.CardDetails ||
                    (this.CardDetails != null &&
                    this.CardDetails.Equals(input.CardDetails))
                ) && 
                (
                    this.Result == input.Result ||
                    this.Result.Equals(input.Result)
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
                if (this.ProcessingDate != null)
                {
                    hashCode = (hashCode * 59) + this.ProcessingDate.GetHashCode();
                }
                if (this.Amount != null)
                {
                    hashCode = (hashCode * 59) + this.Amount.GetHashCode();
                }
                if (this.TransactionResults != null)
                {
                    hashCode = (hashCode * 59) + this.TransactionResults.GetHashCode();
                }
                if (this.CardDetails != null)
                {
                    hashCode = (hashCode * 59) + this.CardDetails.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Result.GetHashCode();
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
