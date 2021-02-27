package com.training.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Query {
    @JsonProperty
    private Bool bool;

    @JsonProperty
    private Match must;

    @JsonProperty
    private Match match;
}
