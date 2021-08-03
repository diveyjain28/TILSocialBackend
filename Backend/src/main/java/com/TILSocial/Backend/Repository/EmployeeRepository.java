package com.TILSocial.Backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.TILSocial.Backend.Model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
