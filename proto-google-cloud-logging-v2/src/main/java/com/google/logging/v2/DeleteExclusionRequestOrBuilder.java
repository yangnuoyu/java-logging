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

public interface DeleteExclusionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.DeleteExclusionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of an existing exclusion to delete:
   *     "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
   *     "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
   *     "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
   * Example: `"projects/my-project-id/exclusions/my-exclusion-id"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of an existing exclusion to delete:
   *     "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
   *     "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
   *     "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
   * Example: `"projects/my-project-id/exclusions/my-exclusion-id"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
