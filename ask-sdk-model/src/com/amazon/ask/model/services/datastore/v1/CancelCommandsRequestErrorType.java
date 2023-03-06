/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Error code of the response. * `COMMANDS_DELIVERED` - The pending commands have been delivered. * `CONCURRENCY_ERROR` - There are concurrent attempts to deliver the pending commands. * `NOT_FOUND` - Unable to find pending request for the given queuedResultId. * `INVALID_ACCESS_TOKEN` - Access token is expire or invalid. * `DATASTORE_SUPPORT_REQUIRED` - Client has not opted into DataStore interface in skill manifest. * `TOO_MANY_REQUESTS` - The request has been throttled because client has exceed maximum allowed request rate. * `DATASTORE_UNAVAILABLE` - Internal service error.
 */
public enum CancelCommandsRequestErrorType {
  
  COMMANDS_DELIVERED("COMMANDS_DELIVERED"),
  
  CONCURRENCY_ERROR("CONCURRENCY_ERROR"),
  
  NOT_FOUND("NOT_FOUND"),
  
  INVALID_ACCESS_TOKEN("INVALID_ACCESS_TOKEN"),
  
  DATASTORE_SUPPORT_REQUIRED("DATASTORE_SUPPORT_REQUIRED"),
  
  TOO_MANY_REQUESTS("TOO_MANY_REQUESTS"),
  
  DATASTORE_UNAVAILABLE("DATASTORE_UNAVAILABLE"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  CancelCommandsRequestErrorType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CancelCommandsRequestErrorType fromValue(String text) {
    for (CancelCommandsRequestErrorType b : CancelCommandsRequestErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return CancelCommandsRequestErrorType.UNKNOWN_TO_SDK_VERSION;
  }
}

