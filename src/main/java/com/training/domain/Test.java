package com.training.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
    public static void main(String[] args) {
        Query.QueryBuilder builder = new Query().toBuilder();

        Query.QueryBuilder dairy = builder.bool(new Bool()).must(new Match("Milk", ItemType.DAIRY)).match(new Match("Milk", ItemType.DAIRY));
        System.out.println("dairy: " + dairy);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        try {
            System.out.println(mapper.writeValueAsString(dairy));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
//        builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", 37);
//        builder.bool().shouldMatch("lot_number", 307).bool().mustMatch("expiry_date", "Jan 2020");
    }
}
