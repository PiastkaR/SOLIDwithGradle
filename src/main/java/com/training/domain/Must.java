package com.training.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class Must {
//    @JsonProperty
//    private Bool bool;

    @JsonProperty
    private List<Match> matches;
}
