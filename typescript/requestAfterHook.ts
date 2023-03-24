import { RequestArgs } from "./base";
import { Configuration } from "./configuration";

export function requestAfterHook(request: {
  axiosArgs: RequestArgs;
  basePath: string;
  url: string;
  configuration?: Configuration;
}): void {}
