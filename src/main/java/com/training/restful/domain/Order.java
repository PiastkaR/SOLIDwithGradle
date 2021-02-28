package com.training.restful.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("customer_order")
public class Order {

  private @Id Long id;
  private String description;
  private Status status;

  Order(String description, Status status) {

    this.description = description;
    this.status = status;
  }

}