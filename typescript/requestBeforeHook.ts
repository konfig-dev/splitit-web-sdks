import { Configuration } from "./configuration";
import { AxiosRequestConfig } from "axios";

export function requestBeforeHook(request: {
  queryParameters: Record<string, any>;
  path: string;
  requestConfig: AxiosRequestConfig;
  configuration?: Configuration;
}): void {}
