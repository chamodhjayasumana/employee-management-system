package com.employee.service;
import com.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee(); //use to get all employee

    void save(Employee employee); //use to save new employee

    Employee getById(Long id); //use to get employee data based on employee id

    Void deleteById(Long id); //this is used to delete employee by using employee id

}
