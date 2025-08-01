package com.example.employeesystem.service;
import com.example.employeesystem.model.Employee;
import com.example.employeesystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }
}