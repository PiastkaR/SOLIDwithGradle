package com.pattern.observer.employee.domain;

import lombok.*;

import java.util.Date;

@RequiredArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Employee {
    private String name;
    private Date hireDate;
    private int salary;
    private int employeeID;
    private boolean working = false;

    private static int COUNTER;
}
