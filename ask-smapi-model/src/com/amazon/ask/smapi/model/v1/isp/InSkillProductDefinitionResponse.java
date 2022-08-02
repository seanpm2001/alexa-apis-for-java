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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines In-skill product response.
 */

@JsonDeserialize(builder = InSkillProductDefinitionResponse.Builder.class)
public final class InSkillProductDefinitionResponse {

    @JsonProperty("inSkillProductDefinition")
    private com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition inSkillProductDefinition = null;

    private InSkillProductDefinitionResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private InSkillProductDefinitionResponse(Builder builder) {
        if (builder.inSkillProductDefinition != null) {
            this.inSkillProductDefinition = builder.inSkillProductDefinition;
        }
    }

    /**
     * Get inSkillProductDefinition
     * @return inSkillProductDefinition
    **/
    @JsonProperty("inSkillProductDefinition")
    public com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition getInSkillProductDefinition() {
        return inSkillProductDefinition;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InSkillProductDefinitionResponse v1IspInSkillProductDefinitionResponse = (InSkillProductDefinitionResponse) o;
        return Objects.equals(this.inSkillProductDefinition, v1IspInSkillProductDefinitionResponse.inSkillProductDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inSkillProductDefinition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InSkillProductDefinitionResponse {\n");
        
        sb.append("    inSkillProductDefinition: ").append(toIndentedString(inSkillProductDefinition)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
    public static class Builder {
        private com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition inSkillProductDefinition;

        private Builder() {}

        @JsonProperty("inSkillProductDefinition")

        public Builder withInSkillProductDefinition(com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition inSkillProductDefinition) {
            this.inSkillProductDefinition = inSkillProductDefinition;
            return this;
        }


        public InSkillProductDefinitionResponse build() {
            return new InSkillProductDefinitionResponse(this);
        }
    }
}

