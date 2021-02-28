package com.training.restful.repository;

import com.training.restful.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}