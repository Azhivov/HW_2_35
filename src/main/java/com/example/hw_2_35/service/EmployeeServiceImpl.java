package com.example.hw_2_35.service;

import com.example.hw_2_35.exceptions.EmployeeAlreadyAddExceptions;
import com.example.hw_2_35.exceptions.EmployeeNotFoundExceptions;
import com.example.hw_2_35.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String fistName, String lastName) {
        Employee employee = new Employee(fistName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddExceptions();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String fistName, String lastName) {
        Employee employee = new Employee(fistName, lastName);
        if (employeeList.contains(employee)){
            employeeList.remove(employee);
            return employee;
        }
throw new EmployeeNotFoundExceptions();
    }

    @Override
    public Employee find(String fistName, String lastName) {
        Employee employee = new Employee(fistName, lastName);

        if (employeeList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundExceptions();
    }
    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableList(employeeList);
    }
}
