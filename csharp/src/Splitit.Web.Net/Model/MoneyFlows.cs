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
    /// Defines MoneyFlows
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum MoneyFlows
    {
        /// <summary>
        /// Enum NotDetermined for value: NotDetermined
        /// </summary>
        [EnumMember(Value = "NotDetermined")]
        NotDetermined = 1,

        /// <summary>
        /// Enum Monthly for value: Monthly
        /// </summary>
        [EnumMember(Value = "Monthly")]
        Monthly = 2,

        /// <summary>
        /// Enum SCP for value: SCP
        /// </summary>
        [EnumMember(Value = "SCP")]
        SCP = 3,

        /// <summary>
        /// Enum Custom for value: Custom
        /// </summary>
        [EnumMember(Value = "Custom")]
        Custom = 4,

        /// <summary>
        /// Enum PendingFunding for value: PendingFunding
        /// </summary>
        [EnumMember(Value = "PendingFunding")]
        PendingFunding = 5,

        /// <summary>
        /// Enum Choose for value: Choose
        /// </summary>
        [EnumMember(Value = "Choose")]
        Choose = 6

    }

}
