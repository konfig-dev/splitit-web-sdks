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
    /// Defines GwAuthorizationStatus
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum GwAuthorizationStatus
    {
        /// <summary>
        /// Enum NA for value: NA
        /// </summary>
        [EnumMember(Value = "NA")]
        NA = 1,

        /// <summary>
        /// Enum Succeeded for value: Succeeded
        /// </summary>
        [EnumMember(Value = "Succeeded")]
        Succeeded = 2,

        /// <summary>
        /// Enum Pending3DS for value: Pending3DS
        /// </summary>
        [EnumMember(Value = "Pending3DS")]
        Pending3DS = 3,

        /// <summary>
        /// Enum Failed for value: Failed
        /// </summary>
        [EnumMember(Value = "Failed")]
        Failed = 4,

        /// <summary>
        /// Enum Canceled for value: Canceled
        /// </summary>
        [EnumMember(Value = "Canceled")]
        Canceled = 5,

        /// <summary>
        /// Enum Voided for value: Voided
        /// </summary>
        [EnumMember(Value = "Voided")]
        Voided = 6

    }

}
