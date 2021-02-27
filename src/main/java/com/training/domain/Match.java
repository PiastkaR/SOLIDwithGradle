package com.training.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
//@Builder(toBuilder = true)
@ToString
@RequiredArgsConstructor
public class Match {
    @NonNull
    @JsonProperty
    private String item; //required

    @NonNull
    @JsonProperty("item_type")
    private ItemType itemType; //required

    @JsonProperty("product_location")
    private String productLocation; //optional

    @JsonProperty("warehouse_number")
    private int warehouseNumber; //optional
}
