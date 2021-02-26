package com.solid.openclosed.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@NoArgsConstructor
abstract public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    public abstract void performDuties();
}
