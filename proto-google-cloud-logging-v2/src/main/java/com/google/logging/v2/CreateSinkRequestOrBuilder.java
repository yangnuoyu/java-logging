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
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface CreateSinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.CreateSinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource in which to create the sink:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource in which to create the sink:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The new sink, whose `name` parameter is a sink identifier that
   * is not already in use.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2;</code>
   */
  boolean hasSink();
  /**
   *
   *
   * <pre>
   * Required. The new sink, whose `name` parameter is a sink identifier that
   * is not already in use.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2;</code>
   */
  com.google.logging.v2.LogSink getSink();
  /**
   *
   *
   * <pre>
   * Required. The new sink, whose `name` parameter is a sink identifier that
   * is not already in use.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2;</code>
   */
  com.google.logging.v2.LogSinkOrBuilder getSinkOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Determines the kind of IAM identity returned as `writer_identity`
   * in the new sink. If this value is omitted or set to false, and if the
   * sink's parent is a project, then the value returned as `writer_identity` is
   * the same group or service account used by Logging before the addition of
   * writer identities to this API. The sink's destination must be in the same
   * project as the sink itself.
   * If this field is set to true, or if the sink is owned by a non-project
   * resource such as an organization, then the value of `writer_identity` will
   * be a unique service account used only for exports from the new sink. For
   * more information, see `writer_identity` in [LogSink][google.logging.v2.LogSink].
   * </pre>
   *
   * <code>bool unique_writer_identity = 3;</code>
   */
  boolean getUniqueWriterIdentity();
}
