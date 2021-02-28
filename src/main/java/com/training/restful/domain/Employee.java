package com.training.restful.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employees")
public class Employee {
  @Transient
  public static final String SEQUENCE_NAME = "employees_sequence";

  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String role;

  Employee(String firstName, String lastName, String role) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public void setName(String name) {
    String[] parts = name.split(" ");
    this.firstName = parts[0];
    this.lastName = parts[1];
  }
}