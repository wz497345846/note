package com.test.service.employee;

import com.test.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(Employee employee);

    boolean dropEmployee(Employee employee);

    boolean updateEmployee(Employee employee);


    List<Employee> selectEmployee(Employee employee);
}
