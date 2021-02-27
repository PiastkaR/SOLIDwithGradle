package com.pattern.observer.employee.domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    Employee emp1 = new Employee("Mike", null, 5000, 1, false);
    Employee emp2 = new Employee("Steve", null, 4500, 2, false);
    Employee emp3 = new Employee("John", null, 7000, 3, false);
    Employee emp4 = new Employee("Pat", null, 6000, 4, false);
    Employee emp5 = new Employee("Joe", null, 8000, 5, false);

    private List<Employee> employees;

    public List<Employee> generateEmployees() {

        employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        return employees;

    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}
