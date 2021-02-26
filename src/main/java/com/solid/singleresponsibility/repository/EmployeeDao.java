package com.solid.singleresponsibility.repository;

import com.solid.singleresponsibility.model.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class EmployeeDao {
    public void saveEmployee(Employee employee){
        log.info("Employee id: {} saved", employee.getId());
    }
    public void deleteEmployee(Employee employee){
        log.info("Employee id: {} deleted", employee.getId());
    }
}
