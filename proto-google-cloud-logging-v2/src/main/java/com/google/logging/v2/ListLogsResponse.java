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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * Result returned from ListLogs.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.ListLogsResponse}
 */
public final class ListLogsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.ListLogsResponse)
    ListLogsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListLogsResponse.newBuilder() to construct.
  private ListLogsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListLogsResponse() {
    logNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListLogsResponse(
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
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                logNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              logNames_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        logNames_ = logNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingProto
        .internal_static_google_logging_v2_ListLogsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingProto
        .internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.ListLogsResponse.class,
            com.google.logging.v2.ListLogsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int LOG_NAMES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList logNames_;
  /**
   *
   *
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList getLogNamesList() {
    return logNames_;
  }
  /**
   *
   *
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  public int getLogNamesCount() {
    return logNames_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  public java.lang.String getLogNames(int index) {
    return logNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  public com.google.protobuf.ByteString getLogNamesBytes(int index) {
    return logNames_.getByteString(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    for (int i = 0; i < logNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, logNames_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < logNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(logNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLogNamesList().size();
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
    if (!(obj instanceof com.google.logging.v2.ListLogsResponse)) {
      return super.equals(obj);
    }
    com.google.logging.v2.ListLogsResponse other = (com.google.logging.v2.ListLogsResponse) obj;

    if (!getLogNamesList().equals(other.getLogNamesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getLogNamesCount() > 0) {
      hash = (37 * hash) + LOG_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getLogNamesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListLogsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListLogsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListLogsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.ListLogsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Result returned from ListLogs.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.ListLogsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.ListLogsResponse)
      com.google.logging.v2.ListLogsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingProto
          .internal_static_google_logging_v2_ListLogsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingProto
          .internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.ListLogsResponse.class,
              com.google.logging.v2.ListLogsResponse.Builder.class);
    }

    // Construct using com.google.logging.v2.ListLogsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      logNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingProto
          .internal_static_google_logging_v2_ListLogsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.ListLogsResponse getDefaultInstanceForType() {
      return com.google.logging.v2.ListLogsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.ListLogsResponse build() {
      com.google.logging.v2.ListLogsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.ListLogsResponse buildPartial() {
      com.google.logging.v2.ListLogsResponse result =
          new com.google.logging.v2.ListLogsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        logNames_ = logNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.logNames_ = logNames_;
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.ListLogsResponse) {
        return mergeFrom((com.google.logging.v2.ListLogsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.ListLogsResponse other) {
      if (other == com.google.logging.v2.ListLogsResponse.getDefaultInstance()) return this;
      if (!other.logNames_.isEmpty()) {
        if (logNames_.isEmpty()) {
          logNames_ = other.logNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLogNamesIsMutable();
          logNames_.addAll(other.logNames_);
        }
        onChanged();
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.logging.v2.ListLogsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.ListLogsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList logNames_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureLogNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        logNames_ = new com.google.protobuf.LazyStringArrayList(logNames_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getLogNamesList() {
      return logNames_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public int getLogNamesCount() {
      return logNames_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public java.lang.String getLogNames(int index) {
      return logNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public com.google.protobuf.ByteString getLogNamesBytes(int index) {
      return logNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public Builder setLogNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLogNamesIsMutable();
      logNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public Builder addLogNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLogNamesIsMutable();
      logNames_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public Builder addAllLogNames(java.lang.Iterable<java.lang.String> values) {
      ensureLogNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, logNames_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public Builder clearLogNames() {
      logNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of log names. For example,
     * `"projects/my-project/logs/syslog"` or
     * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * </pre>
     *
     * <code>repeated string log_names = 3;</code>
     */
    public Builder addLogNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureLogNamesIsMutable();
      logNames_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.ListLogsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.ListLogsResponse)
  private static final com.google.logging.v2.ListLogsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.ListLogsResponse();
  }

  public static com.google.logging.v2.ListLogsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLogsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListLogsResponse>() {
        @java.lang.Override
        public ListLogsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListLogsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListLogsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLogsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.ListLogsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
