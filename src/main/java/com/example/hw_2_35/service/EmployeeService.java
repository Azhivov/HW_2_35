package com.example.hw_2_35.service;

import com.example.hw_2_35.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String fistName, String lastName);
    Employee remove(String fistName, String lastName);
    Employee find(String fistName, String lastName);


    Collection<Employee> findAll();
}
