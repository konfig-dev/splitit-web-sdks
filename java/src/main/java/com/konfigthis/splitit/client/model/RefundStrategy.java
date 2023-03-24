/*
 * splitit-web-api-v3
 * Splitit's Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.splitit.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(RefundStrategy.Adapter.class)
public enum RefundStrategy {
  
  FUTUREINSTALLMENTSFIRST("FutureInstallmentsFirst"),
  
  FUTUREINSTALLMENTSLAST("FutureInstallmentsLast"),
  
  FUTUREINSTALLMENTSNOTALLOWED("FutureInstallmentsNotAllowed"),
  
  REDUCEFROMLASTINSTALLMENT("ReduceFromLastInstallment");

  private String value;

  RefundStrategy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RefundStrategy fromValue(String value) {
    for (RefundStrategy b : RefundStrategy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RefundStrategy> {
    @Override
    public void write(final JsonWriter jsonWriter, final RefundStrategy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RefundStrategy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RefundStrategy.fromValue(value);
    }
  }
}

