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
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** A metadata key/value entry. */
public final class Metadata implements ApiMessage {
  private final String fingerprint;
  private final List<Items> items;
  private final String kind;

  private Metadata() {
    this.fingerprint = null;
    this.items = null;
    this.kind = null;
  }

  private Metadata(String fingerprint, List<Items> items, String kind) {
    this.fingerprint = fingerprint;
    this.items = items;
    this.kind = kind;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("fingerprint".equals(fieldName)) {
      return fingerprint;
    }
    if ("items".equals(fieldName)) {
      return items;
    }
    if ("kind".equals(fieldName)) {
      return kind;
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
   * Specifies a fingerprint for this request, which is essentially a hash of the metadata's
   * contents and used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update metadata. You must always provide an
   * up-to-date fingerprint hash in order to update or change metadata, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * <p>To see the latest fingerprint, make a get() request to retrieve the resource.
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /** Array of key/value pairs. The total size of all keys and values must be less than 512 KB. */
  public List<Items> getItemsList() {
    return items;
  }

  /** [Output Only] Type of the resource. Always compute#metadata for metadata. */
  public String getKind() {
    return kind;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(Metadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final Metadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Metadata();
  }

  public static class Builder {
    private String fingerprint;
    private List<Items> items;
    private String kind;

    Builder() {}

    public Builder mergeFrom(Metadata other) {
      if (other == Metadata.getDefaultInstance()) return this;
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getItemsList() != null) {
        this.items = other.items;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      return this;
    }

    Builder(Metadata source) {
      this.fingerprint = source.fingerprint;
      this.items = source.items;
      this.kind = source.kind;
    }

    /**
     * Specifies a fingerprint for this request, which is essentially a hash of the metadata's
     * contents and used for optimistic locking. The fingerprint is initially generated by Compute
     * Engine and changes after every request to modify or update metadata. You must always provide
     * an up-to-date fingerprint hash in order to update or change metadata, otherwise the request
     * will fail with error 412 conditionNotMet.
     *
     * <p>To see the latest fingerprint, make a get() request to retrieve the resource.
     */
    public String getFingerprint() {
      return fingerprint;
    }

    /**
     * Specifies a fingerprint for this request, which is essentially a hash of the metadata's
     * contents and used for optimistic locking. The fingerprint is initially generated by Compute
     * Engine and changes after every request to modify or update metadata. You must always provide
     * an up-to-date fingerprint hash in order to update or change metadata, otherwise the request
     * will fail with error 412 conditionNotMet.
     *
     * <p>To see the latest fingerprint, make a get() request to retrieve the resource.
     */
    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    /** Array of key/value pairs. The total size of all keys and values must be less than 512 KB. */
    public List<Items> getItemsList() {
      return items;
    }

    /** Array of key/value pairs. The total size of all keys and values must be less than 512 KB. */
    public Builder addAllItems(List<Items> items) {
      if (this.items == null) {
        this.items = new LinkedList<>();
      }
      this.items.addAll(items);
      return this;
    }

    /** Array of key/value pairs. The total size of all keys and values must be less than 512 KB. */
    public Builder addItems(Items items) {
      if (this.items == null) {
        this.items = new LinkedList<>();
      }
      this.items.add(items);
      return this;
    }

    /** [Output Only] Type of the resource. Always compute#metadata for metadata. */
    public String getKind() {
      return kind;
    }

    /** [Output Only] Type of the resource. Always compute#metadata for metadata. */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public Metadata build() {

      return new Metadata(fingerprint, items, kind);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.addAllItems(this.items);
      newBuilder.setKind(this.kind);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Metadata{"
        + "fingerprint="
        + fingerprint
        + ", "
        + "items="
        + items
        + ", "
        + "kind="
        + kind
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Metadata) {
      Metadata that = (Metadata) o;
      return Objects.equals(this.fingerprint, that.getFingerprint())
          && Objects.equals(this.items, that.getItemsList())
          && Objects.equals(this.kind, that.getKind());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprint, items, kind);
  }
}
