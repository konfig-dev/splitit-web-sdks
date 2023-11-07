/*
splitit-web-api-v3

Splitit's Web API

The version of the OpenAPI document: 1.0.0


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/

import { AxiosRequestConfig } from "axios";
import {
  InstallmentplanApi,
} from "./api";
import { Configuration, ConfigurationParameters } from "./configuration";
import { SplititCustom } from "./client-custom";

export class Splitit extends SplititCustom {
  readonly installmentplan: InstallmentplanApi;

  constructor(configurationParameters: ConfigurationParameters) {
    super(configurationParameters);
    const configuration = new Configuration(configurationParameters);
    this.installmentplan = new InstallmentplanApi(configuration);
  }

}
