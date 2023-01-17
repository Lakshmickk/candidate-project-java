package com.zoomcare.candidatechallenge.service;

import com.zoomcare.candidatechallenge.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployee(Long id);
}
