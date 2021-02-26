package com.solid.singleresponsibility.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;
}
