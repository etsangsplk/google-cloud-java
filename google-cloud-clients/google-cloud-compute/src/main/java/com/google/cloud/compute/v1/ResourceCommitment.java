/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** Commitment for a particular resource (a Commitment is composed of one or more of these). */
public final class ResourceCommitment implements ApiMessage {
  private final String amount;
  private final String type;

  private ResourceCommitment() {
    this.amount = null;
    this.type = null;
  }

  private ResourceCommitment(String amount, String type) {
    this.amount = amount;
    this.type = type;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("amount".equals(fieldName)) {
      return amount;
    }
    if ("type".equals(fieldName)) {
      return type;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  /**
   * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this
   * can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of
   * 256 MB, with up to 6.5GB of memory per every vCPU.
   */
  public String getAmount() {
    return amount;
  }

  /** Type of resource for which this commitment applies. Possible values are VCPU and MEMORY */
  public String getType() {
    return type;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ResourceCommitment prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ResourceCommitment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ResourceCommitment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ResourceCommitment();
  }

  public static class Builder {
    private String amount;
    private String type;

    Builder() {}

    public Builder mergeFrom(ResourceCommitment other) {
      if (other == ResourceCommitment.getDefaultInstance()) return this;
      if (other.getAmount() != null) {
        this.amount = other.amount;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(ResourceCommitment source) {
      this.amount = source.amount;
      this.type = source.type;
    }

    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs,
     * this can just be an integer. For memory, this must be provided in MB. Memory must be a
     * multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     */
    public String getAmount() {
      return amount;
    }

    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs,
     * this can just be an integer. For memory, this must be provided in MB. Memory must be a
     * multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     */
    public Builder setAmount(String amount) {
      this.amount = amount;
      return this;
    }

    /** Type of resource for which this commitment applies. Possible values are VCPU and MEMORY */
    public String getType() {
      return type;
    }

    /** Type of resource for which this commitment applies. Possible values are VCPU and MEMORY */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public ResourceCommitment build() {

      return new ResourceCommitment(amount, type);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAmount(this.amount);
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ResourceCommitment{" + "amount=" + amount + ", " + "type=" + type + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ResourceCommitment) {
      ResourceCommitment that = (ResourceCommitment) o;
      return Objects.equals(this.amount, that.getAmount())
          && Objects.equals(this.type, that.getType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, type);
  }
}
