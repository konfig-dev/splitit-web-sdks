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
    /// Defines ExternalProviderTypes
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ExternalProviderTypes
    {
        /// <summary>
        /// Enum Mock for value: Mock
        /// </summary>
        [EnumMember(Value = "Mock")]
        Mock = 1,

        /// <summary>
        /// Enum Visa for value: Visa
        /// </summary>
        [EnumMember(Value = "Visa")]
        Visa = 2,

        /// <summary>
        /// Enum Splitit for value: Splitit
        /// </summary>
        [EnumMember(Value = "Splitit")]
        Splitit = 3

    }

}
