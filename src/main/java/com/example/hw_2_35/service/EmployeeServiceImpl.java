package com.example.hw_2_35.service;

import com.example.hw_2_35.exceptions.EmployeeAlreadyAddExceptions;
import com.example.hw_2_35.exceptions.EmployeeNotFoundExceptions;
import com.example.hw_2_35.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {this.employees = new HashMap<>();

    }

    @Override
    public Employee add(String fistName, String lastName) {
        Employee employee = new Employee(fistName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddExceptions();
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String fistName, String lastName) {
        Employee employee = new Employee(fistName, lastName);
        if (employees.containsKey(employee.getFullName())){
            return employees.remove(employee.getFullName());

        }
throw new EmployeeNotFoundExceptions();
    }

    @Override
    public Employee find(String fistName, String lastName) {
        Employee employee = new Employee(fistName, lastName);

        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundExceptions();
    }
    @Override
    public Collection<Employee> findAll() {
        return (Collection<Employee>) Collections.unmodifiableCollection(employees.values());
    }
}
