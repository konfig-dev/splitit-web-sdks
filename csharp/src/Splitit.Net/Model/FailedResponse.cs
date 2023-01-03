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
    /// FailedResponse
    /// </summary>
    [DataContract(Name = "FailedResponse")]
    public partial class FailedResponse : IEquatable<FailedResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FailedResponse" /> class.
        /// </summary>
        /// <param name="traceId">traceId.</param>
        /// <param name="error">error.</param>
        public FailedResponse(string traceId = default(string), ErrorExtended error = default(ErrorExtended))
        {
            this.TraceId = traceId;
            this.Error = error;
        }

        /// <summary>
        /// Gets or Sets TraceId
        /// </summary>
        [DataMember(Name = "TraceId", EmitDefaultValue = false)]
        public string TraceId { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "Error", EmitDefaultValue = false)]
        public ErrorExtended Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FailedResponse {\n");
            sb.Append("  TraceId: ").Append(TraceId).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return this.Equals(input as FailedResponse);
        }

        /// <summary>
        /// Returns true if FailedResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of FailedResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FailedResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TraceId == input.TraceId ||
                    (this.TraceId != null &&
                    this.TraceId.Equals(input.TraceId))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
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
                if (this.TraceId != null)
                {
                    hashCode = (hashCode * 59) + this.TraceId.GetHashCode();
                }
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
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
