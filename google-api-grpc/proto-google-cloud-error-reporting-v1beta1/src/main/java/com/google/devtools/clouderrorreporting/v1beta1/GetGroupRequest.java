// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/error_group_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 * <pre>
 * A request to return an individual group.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.GetGroupRequest}
 */
public  final class GetGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.GetGroupRequest)
    GetGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGroupRequest.newBuilder() to construct.
  private GetGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGroupRequest() {
    groupName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetGroupRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            groupName_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_GetGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_GetGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest.class, com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest.Builder.class);
  }

  public static final int GROUP_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object groupName_;
  /**
   * <pre>
   * [Required] The group resource name. Written as
   * &lt;code&gt;projects/&lt;var&gt;projectID&lt;/var&gt;/groups/&lt;var&gt;group_name&lt;/var&gt;&lt;/code&gt;.
   * Call
   * &lt;a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"&gt;
   * &lt;code&gt;groupStats.list&lt;/code&gt;&lt;/a&gt; to return a list of groups belonging to
   * this project.
   * Example: &lt;code&gt;projects/my-project-123/groups/my-group&lt;/code&gt;
   * </pre>
   *
   * <code>string group_name = 1;</code>
   */
  public java.lang.String getGroupName() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Required] The group resource name. Written as
   * &lt;code&gt;projects/&lt;var&gt;projectID&lt;/var&gt;/groups/&lt;var&gt;group_name&lt;/var&gt;&lt;/code&gt;.
   * Call
   * &lt;a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"&gt;
   * &lt;code&gt;groupStats.list&lt;/code&gt;&lt;/a&gt; to return a list of groups belonging to
   * this project.
   * Example: &lt;code&gt;projects/my-project-123/groups/my-group&lt;/code&gt;
   * </pre>
   *
   * <code>string group_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGroupNameBytes() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getGroupNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGroupNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest other = (com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest) obj;

    boolean result = true;
    result = result && getGroupName()
        .equals(other.getGroupName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUP_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getGroupName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A request to return an individual group.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.GetGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.GetGroupRequest)
      com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_GetGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_GetGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest.class, com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_GetGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest build() {
      com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest result = new com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest(this);
      result.groupName_ = groupName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest other) {
      if (other == com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest.getDefaultInstance()) return this;
      if (!other.getGroupName().isEmpty()) {
        groupName_ = other.groupName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object groupName_ = "";
    /**
     * <pre>
     * [Required] The group resource name. Written as
     * &lt;code&gt;projects/&lt;var&gt;projectID&lt;/var&gt;/groups/&lt;var&gt;group_name&lt;/var&gt;&lt;/code&gt;.
     * Call
     * &lt;a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"&gt;
     * &lt;code&gt;groupStats.list&lt;/code&gt;&lt;/a&gt; to return a list of groups belonging to
     * this project.
     * Example: &lt;code&gt;projects/my-project-123/groups/my-group&lt;/code&gt;
     * </pre>
     *
     * <code>string group_name = 1;</code>
     */
    public java.lang.String getGroupName() {
      java.lang.Object ref = groupName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Required] The group resource name. Written as
     * &lt;code&gt;projects/&lt;var&gt;projectID&lt;/var&gt;/groups/&lt;var&gt;group_name&lt;/var&gt;&lt;/code&gt;.
     * Call
     * &lt;a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"&gt;
     * &lt;code&gt;groupStats.list&lt;/code&gt;&lt;/a&gt; to return a list of groups belonging to
     * this project.
     * Example: &lt;code&gt;projects/my-project-123/groups/my-group&lt;/code&gt;
     * </pre>
     *
     * <code>string group_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupNameBytes() {
      java.lang.Object ref = groupName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Required] The group resource name. Written as
     * &lt;code&gt;projects/&lt;var&gt;projectID&lt;/var&gt;/groups/&lt;var&gt;group_name&lt;/var&gt;&lt;/code&gt;.
     * Call
     * &lt;a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"&gt;
     * &lt;code&gt;groupStats.list&lt;/code&gt;&lt;/a&gt; to return a list of groups belonging to
     * this project.
     * Example: &lt;code&gt;projects/my-project-123/groups/my-group&lt;/code&gt;
     * </pre>
     *
     * <code>string group_name = 1;</code>
     */
    public Builder setGroupName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Required] The group resource name. Written as
     * &lt;code&gt;projects/&lt;var&gt;projectID&lt;/var&gt;/groups/&lt;var&gt;group_name&lt;/var&gt;&lt;/code&gt;.
     * Call
     * &lt;a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"&gt;
     * &lt;code&gt;groupStats.list&lt;/code&gt;&lt;/a&gt; to return a list of groups belonging to
     * this project.
     * Example: &lt;code&gt;projects/my-project-123/groups/my-group&lt;/code&gt;
     * </pre>
     *
     * <code>string group_name = 1;</code>
     */
    public Builder clearGroupName() {
      
      groupName_ = getDefaultInstance().getGroupName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Required] The group resource name. Written as
     * &lt;code&gt;projects/&lt;var&gt;projectID&lt;/var&gt;/groups/&lt;var&gt;group_name&lt;/var&gt;&lt;/code&gt;.
     * Call
     * &lt;a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"&gt;
     * &lt;code&gt;groupStats.list&lt;/code&gt;&lt;/a&gt; to return a list of groups belonging to
     * this project.
     * Example: &lt;code&gt;projects/my-project-123/groups/my-group&lt;/code&gt;
     * </pre>
     *
     * <code>string group_name = 1;</code>
     */
    public Builder setGroupNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.GetGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.GetGroupRequest)
  private static final com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetGroupRequest>() {
    @java.lang.Override
    public GetGroupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetGroupRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
