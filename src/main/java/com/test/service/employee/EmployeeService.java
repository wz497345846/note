package com.test.service.employee;

import com.test.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(Employee employee);

    boolean dropEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    List<Employee> selectAllCoach();

    List<Employee> selectEmployee(Employee employee, String pageNumber, String pageSize);

    List<Employee> employeeLogin(Employee employee);

    List<Employee> getAllEmployee();

    boolean deleteE(Employee employee);

    boolean changeEmployee(Employee employee);
}
